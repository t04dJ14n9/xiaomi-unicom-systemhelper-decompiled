# 6. 安全缺陷

语言：[English](../06-Security-Weaknesses.md) · **中文**

[← 同意机制与激活条件](05-Consent-and-Activation.md) · 下一页：[百度定位 SDK →](07-Baidu-Location-SDK.md)

以下问题来自代码和清单文件。只在代码中读到、没有在设备上实际利用的缺陷会标注
**（仅静态分析）**。

## 导出且无权限保护的 Binder 允许任何应用重新配置模块

`RegisterHelperService`
（`sources/com/mobiletools/systemhelper/service/RegisterHelperService.java`）
**已导出，且没有权限保护**（来自清单；设备上确认可被解析）。它的 AIDL 接口
`IRegisterHelperService`（`sources/com/mobiletools/systemhelper/service/a.java`）
按事务编号暴露以下方法：

| 编号 | 方法（还原名） | 效果 |
|---|---|---|
| 1 | `setServerAddress(String)` | 改写**所有上传的目标地址**（`serverAddress` 首选项） |
| 2 | `setBaseInterval(int)` | 按比例修改**全部**采集周期 |
| 3 | `clearPreferences()` | 删除模块的设置文件 |
| 4 | `setLogEnabled(boolean)` | 开启详细日志 |
| 5 | `isLogEnabled()` | 读取日志开关 |

任何已安装应用都可以绑定该服务并调用这些方法。**（仅静态分析）**——结论来自代码，
未实际执行。最危险的是 `setServerAddress`：第三方应用可以把遥测数据转向自己的服务器。
`setLogEnabled(true)` 之所以危险，与下一项有关。

## 详细日志会把明文标识符写进 logcat

开启日志后（`GlobalSetting.f2648a`，由 `sources/g1/h.java` 控制），构造上传数据的线程会记录
**完整的未加密数据**。例如 `RegisterThread` 会记录
`"register postString：" + strB`，并记录 AES 密文（`sources/e1/g.java`）。
IMEI、IMSI、ICCID 和坐标因此会进入系统日志，可被 `adb logcat` 读取，也会包含在错误报告中。
结合上方导出的 `setLogEnabled(true)`，其他应用可以主动开启这一行为。**（仅静态分析。）**

## 导出的 Activity 会在屏幕上显示标识符

`TestActivity`（`sources/com/mobiletools/systemhelper/Activity/TestActivity.java`）
**已导出**，会把设备注册字符串——两个卡槽的 IMEI、IMSI、ICCID——渲染到 `TextView`。
任何应用或 `adb` 都能启动
`com.mobiletools.systemhelper/.Activity.TestActivity`。
**（“已导出且可启动”已在设备上确认。）**

## 弱加密

详见[上传与加密](04-Upload-and-Encryption.md)：

- **AES 使用 ECB 模式**（`AES/ECB/PKCS5Padding`，`sources/g1/c.java`）——没有 IV；
  相同的明文块会产生相同的密文块，泄露数据结构。
- **密钥由明文推导**——AES 密钥是 `MD5(明文)`（`c.d()`），所以相同记录总会得到相同密文；
  没有随机性，也没有完整性校验或 MAC。
- **RSA 只有 1024 位**（`assets/pub.cer`）——低于 2048 位以上的现代最低建议。
- **使用明文 HTTP**、端口 18080——只有正文加密；URL、上传时间和大小都是公开的。

## 可逆的“匿名化”

对非联通 SIM，`TAC`/`CID` 只是做了 SHA-256 哈希（`sources/g1/i.java`），并未删除。
基站 `TAC`/`CID` 的取值范围很小，因此哈希可以通过暴力枚举还原。把 IMSI/ICCID 截断到
10 个字符仍会暴露运营商和地区前缀，而 **IMEI 始终完整发送**。见
[上传与加密](04-Upload-and-Encryption.md#哪些数据会被脱敏)。

## 非联通用户的数据同样会离开手机

“中国 SIM”条件只检查 MNC 是否以 `460…` 开头，并不要求是联通卡。因此中国移动或中国电信用户
的数据仍会通过 Wi-Fi 被采集并上传到联通服务器
（见[上传与加密](04-Upload-and-Encryption.md#何时上传何时排队)）。

下一页：[百度定位 SDK →](07-Baidu-Location-SDK.md)
