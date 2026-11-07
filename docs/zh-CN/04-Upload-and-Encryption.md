# 4. 上传协议与加密

语言：[English](../04-Upload-and-Encryption.md) · **中文**

[← 数据采集](03-Data-Collection.md) · 下一页：[同意机制与激活条件 →](05-Consent-and-Activation.md)

## 服务器地址

```
http://dm.wo.com.cn:18080/register
```

默认值定义在 `GlobalSetting`（`sources/g1/d.java:44`）；实际地址通过
`RegisterUtils.k()`（`sources/g1/l.java`）读取：如果 `serverAddress` 这个
SharedPreference 存在就返回它，否则返回默认地址。连接使用 **HTTP**、端口 18080；
清单中的 `usesCleartextTraffic="true"` 允许此类明文连接。`wo.com.cn` 是中国联通的域名。

## 传输方式

`HttpHelper.b(...)`（`sources/g1/f.java`）发送 `POST`，设置
`Content-Type: application/encrypted-json`，将加密后的字节作为请求正文，并把 HTTP 200
（或 416）视为成功。它同时支持 `http://` 和 `https://`。

## 数据构造

由 `RegisterThread.a()`（`sources/e1/g.java`）和并行的 `HistoryPostThread`
（`sources/e1/e.java`）构造。设注册信息的 JSON 字符串为 `strB`：

```java
// sources/e1/g.java（反编译结果，名称仍被混淆）
byte[] bArrD = g1.c.d(strB);                                   // (1) 生成 AES 密钥
String strEncode = URLEncoder.encode(g1.c.b(g1.c.c(ctx, bArrD)), "utf-8"); // (2) RSA 包装并 Base64
String str = l.k(ctx) + "?ver=5.0&model=" + ... + "&manuf=" + ... + "&sign=" + strEncode; // (3) URL
byte[] bArrA = g1.c.a(strB, bArrD);                            // (4) AES 加密正文
new g1.f().b(str, bArrA, bArrD);                               // (5) POST
```

根据加密工具类（`sources/g1/c.java`），具体步骤如下：

1. **AES 密钥 = `MD5(明文)`**——`c.d()` 直接对 JSON 计算 MD5，并把它作为 AES 密钥。
2. **包装密钥**——`c.c()` 使用 `assets/pub.cer` 中的公钥对该密钥做 RSA 加密，
   再以 Base64 放入 URL 的 `sign` 参数。
3. **URL**——追加 `ver`、`model`、`manuf`（明文）和 `sign`。
4. **正文 = `AES(明文)`**——`c.a()` 使用 **`AES/ECB/PKCS5Padding`**。
5. **POST** AES 正文；服务器通过 RSA 解密 `sign` 来取回 AES 密钥。

### 联通证书

`assets/pub.cer`（在仓库中为 `resources/assets/pub.cer`）：

| 字段 | 值 |
|---|---|
| Subject / Issuer | `C=CN, ST=BJ, L=BJ, O=UNICOM, OU=UNICOM, CN=UNICOM`（自签名） |
| 密钥 | **RSA 1024 位** |
| 有效期 | 2019-05-24 … 2119-04-30 |

`RSAHelper`（`sources/g1/j.java`）使用 **`RSA/ECB/PKCS1Padding`** 包装密钥。

### 网络上能看到什么

正文经过加密，因此网络观察者无法直接读取标识符或位置。但 **URL 查询参数是明文**：
你的手机**型号**、**厂商**，以及上传时间和大小都会暴露。为什么这层加密比表面上更弱，
见[安全缺陷](06-Security-Weaknesses.md)。

## 何时上传、何时排队

`RegisterThread.c()`（`sources/e1/g.java`）和 `RegisterUtils`（`sources/g1/l.java`）
中的条件判断共同决定：

- **中国 SIM 条件**——`RegisterUtils.s()`：只有当 SIM 的 MNC 以 **`460`** 开头
  （任何中国大陆运营商）时才上传；否则不发送。
- **网络规则**：
  - 在 **Wi-Fi** 上（`w()`），任何中国 SIM 都可以上传。
  - 在**移动数据**上，只有**联通** SIM 可以上传（`u()`：
    MNC 为 `46001/46006/46009/46010`）。
  - 两个条件都不满足时，记录会**写入历史数据库**，以后再发送。

因此，在采样手机（中国移动 SIM）上，快照和注册信息会通过 **Wi-Fi 上传**——
并不要求使用联通卡。

## 哪些数据会被脱敏

`DeviceManager`（`sources/f1/o.java`）在上传前会对用户标识做“匿名化”，但
`RegisterUtils.v()`（`sources/g1/l.java`）对**联通 SIM**（`46001/46006/46009/46010`）
**完全跳过脱敏**。对其他运营商（例如中国移动）：

- `IMSI`/`ICCID` 只保留前 10 个字符，其余用 `*` 填充。
- `TAC`/`CID` 使用 `Sha256Utils`（`sources/g1/i.java`）做 SHA-256 哈希。
- **`IMEI` 从不脱敏**，坐标和 `BSSID` 也不会脱敏。

由于基站 `TAC`/`CID` 的取值范围很小，其 SHA-256 哈希可以通过暴力枚举还原，
见[安全缺陷](06-Security-Weaknesses.md#可逆的匿名化)。

## regType 取值

`DeviceManager`（`sources/f1/o.java`）按单字母类型分派任务：
`A`（应用使用）、`R`（注册信息并附加信号数组）、`B`/`F`/`S`（注册变体）、
`T`（SIM 卡变化）。当“用户许可”标志关闭时，它走一条不发送应用使用数据的路径。

下一页：[同意机制与激活条件 →](05-Consent-and-Activation.md)
