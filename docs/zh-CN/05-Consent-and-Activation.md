# 5. 同意机制与激活条件

语言：[English](../05-Consent-and-Activation.md) · **中文**

[← 上传与加密](04-Upload-and-Encryption.md) · 下一页：[安全缺陷 →](06-Security-Weaknesses.md)

所有采集和上传路径都由一个全局标志控制：
`GlobalSetting.isUserPermissionOpen`（`sources/g1/d.java` 中的 `g1.d.f2652e`）。
每个工作线程在标志为 false 时都会立即返回；例如 `QueryAppInfoThread.e()`
（`sources/e1/f.java`）的第一行就是 `if (!g1.d.f2652e) return null;`。
因此，“它是否征求同意”实际取决于“谁会设置这个标志”。

## 什么会设置这个标志

在 `GetSignalInfoReceiver.onReceive()`
（`sources/com/mobiletools/systemhelper/control/GetSignalInfoReceiver.java`）中：

```java
// 反编译结果，名称仍被混淆
if (strO != null && !strO.isEmpty()) {
    g1.d.f2652e = strO.equalsIgnoreCase("vivo") ? b(f2189d) : c(f2189d);
}
```

其中 `strO` 是 `ro.product.manufacturer`，而：

- **`b()`**（vivo 分支）要求 Secure 设置为
  **`operator_service_improve_plan == 1`**，并额外要求系统已完成初始设置。
- **`c()`**（包括小米在内的其他所有品牌）**只要求 `device_provisioned == 1`**，
  也就是首次开机设置已经完成。

各品牌读取器也体现了同样的分支：`DeviceInfoReaderVIVO`（`sources/f1/k.java`）检查
`operator_service_improve_plan`，而 `DeviceInfoReaderXiaomi`（`sources/f1/m.java`）
只检查 `device_provisioned`。

## 这对小米手机意味着什么

**没有同意弹窗，也没有面向用户的开关。** 在小米手机上，首次设置一经完成，遥测就会启用。
名为“运营商服务改进计划”的同意项（`operator_service_improve_plan`）**只在 vivo 上检查**。

在采样设备上*（设备上观察到）*：

| 设置 | 值 |
|---|---|
| `ro.product.manufacturer` | `Xiaomi` → 使用 `c()` 分支 |
| `device_provisioned`（global） | `1` |
| `operator_service_improve_plan`（secure） | `1` |

因此这个标志处于开启状态。需要注意的是，即使小米分支不检查
`operator_service_improve_plan`，它在设备上也已经被设为 `1`；是什么修改了它目前未知
（见[局限与未知](09-Limitations-and-Unknowns.md)）。

## “中国 SIM”是另一道独立条件

标志开启只是必要条件，并不足以保证上传：SIM 还必须是中国大陆运营商（MNC 以 `460` 开头），
并且必须满足[上传与加密](04-Upload-and-Encryption.md#何时上传何时排队)中的网络规则。
当标志开启且使用中国 SIM 时，快照可以通过 Wi-Fi 上传，与具体是哪个运营商无关。

下一页：[安全缺陷 →](06-Security-Weaknesses.md)
