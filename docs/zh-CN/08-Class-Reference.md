# 8. 类参考（混淆名 → 还原名）

语言：[English](../08-Class-Reference.md) · **中文**

[← 百度定位 SDK](07-Baidu-Location-SDK.md) · 下一页：[局限与未知 →](09-Limitations-and-Unknowns.md)

`sources/` 中的文件仍使用**混淆后的名称**。本页把每个相关类映射到**还原名**。
还原名来自类传给日志组件的标签（例如 `HttpHelper` 的日志标签就是 `"HttpHelper"`）。
没有日志标签的类根据行为命名，并标记为*推断*。

**置信度说明**——**tag**：来自类自身的日志标签。**dispatch**：由其他代码选择该类的方式确认。
**inferred**：根据行为推断，没有日志标签。

## `com.mobiletools.systemhelper.*`——原始名称（未混淆）

| 路径 | 名称 | 作用 |
|---|---|---|
| `control/DMApplication.java` | `DMApplication` | Application 类 |
| `control/OnBootReceiver.java` | `OnBootReceiver` | 开机触发 → 调度器 |
| `control/GetSignalInfoReceiver.java` | `GetSignalInfoReceiver` | 每 30 分钟的位置与信号快照；设置许可标志 |
| `control/SignalInfoRegisterReceiver.java` | `SignalInfoRegisterReceiver` | 每 12 小时上传信号批次 |
| `control/ScheduleRegisterReceiver.java` | `ScheduleRegisterReceiver` | 每 24 小时上传设备注册 |
| `control/AppInfoRegisterReceiver.java` | `AppInfoRegisterReceiver` | 每 24 小时上传应用使用报告 |
| `control/SIMStateReceiver.java` | `SIMStateReceiver` | SIM 变化 → `"T"` 类型注册 *（一个方法反编译失败）* |
| `control/ConnectStateReceiver.java` | `ConnectStateReceiver` | 网络连接变化 |
| `service/RegisterHelperService.java` | `RegisterHelperService` | 导出的重新配置 Binder |
| `service/a.java` | `IRegisterHelperService`（AIDL） | Binder 接口；事务编号 1–5 |
| `service/RegisterIntentService.java` | `RegisterIntentService` | 后台任务执行器 |
| `service/RegisterJobService.java` | `RegisterJobService` | Job 执行器 |
| `Activity/TestActivity.java` | `TestActivity` | 已导出；显示注册信息 |

## `e1`——工作线程与数据对象

| 路径 | 还原名 | 置信度 | 作用 |
|---|---|---|---|
| `e1/a.java` | `DMTelephonyCallback` | tag | 接收基站/信号电话状态回调 |
| `e1/b.java` | `DeviceInfo` | tag | 设备注册对象与 JSON 构造器 `b()` |
| `e1/c.java` | `GetIPAddressThread` | tag | 获取 IPv4/IPv6，然后触发上传 |
| `e1/d.java` | `GetSignalStrengthInfo` | tag | 填充 `SignalInfo`；脱敏非联通卡标识 |
| `e1/e.java` | `HistoryPostThread` | tag | 上传历史数据库中排队的记录 |
| `e1/f.java` | `QueryAppInfoThread` | tag | 通过 UsageStats + NetworkStats 采集应用使用情况 |
| `e1/g.java` | `RegisterThread` | tag | 加密并 POST 注册信息；决定上传或排队 |

## `f1`——各品牌读取器与编排器

`DeviceManager` 根据手机厂商（`ro.product.manufacturer`，并结合 `Build.MODEL`）
选择读取器。

| 路径 | 还原名 | 置信度 | 选用于 |
|---|---|---|---|
| `f1/a.java` | `DeviceInfoReaderBase` | tag | 默认 / 未知品牌 |
| `f1/b.java` | `DeviceInfoReaderLiantong` | tag + dispatch | `Liantong`（联通定制机） |
| `f1/c.java` | `DeviceInfoReaderNubia` | tag + dispatch | `nubia` |
| `f1/d.java` | `DeviceInfoReaderOPPO` | tag + dispatch | `OPPO` |
| `f1/e.java` | `DeviceInfoReaderOnePlus` | tag + dispatch | `OnePlus` |
| `f1/f.java` | `DeviceInfoReaderPTAC` | tag + dispatch | `PTAC` |
| `f1/g.java` | `DeviceInfoReaderRealme` | tag + dispatch | `realme` |
| `f1/h.java` | `DeviceInfoReaderSamSung` | tag + dispatch | `samsung` |
| `f1/i.java` | `DeviceInfoReaderTDTECH` | tag + dispatch | `TDTECH` |
| `f1/j.java` | **天翼读取器** | dispatch | `Tianyi`（中国电信）。*日志标签为 `DeviceInfoReaderWIKO`，具有误导性。* |
| `f1/k.java` | `DeviceInfoReaderVIVO` | tag + dispatch | `vivo`（检查同意设置） |
| `f1/l.java` | `DeviceInfoReaderWIKO` | tag + dispatch | `WIKO` |
| `f1/m.java` | `DeviceInfoReaderXiaomi` | tag + dispatch | `Xiaomi`（只检查 `device_provisioned`） |
| `f1/n.java` | `DeviceInfoReaderZTE` | tag + dispatch | `ZTE` |
| `f1/o.java` | `DeviceManager` | tag | 编排器：选择读取器、脱敏、按 regType 分派 |

## `g1`——工具类、数据对象和存储

| 路径 | 还原名 | 置信度 | 作用 |
|---|---|---|---|
| `g1/a.java` | `AlarmHelper` | tag | 精确闹钟（`setExactAndAllowWhileIdle`） |
| `g1/b.java` | `AppInfo` | tag | 逐应用使用数据对象 |
| `g1/c.java` | `CryptoUtils` | inferred | AES/ECB 加密、MD5 密钥、Base64、通过 `pub.cer` 包装 RSA 密钥 |
| `g1/d.java` | `GlobalSetting` | inferred | 静态配置：服务器 URL、周期、标志（`f2652e` 为许可标志） |
| `g1/e.java` | `HistoryDatabaseHelper` | tag | 保存排队记录的 SQLite 数据库 |
| `g1/f.java` | `HttpHelper` | tag | HTTP(S) POST 客户端 |
| `g1/g.java` | `MemoryUtils` | tag | 内存辅助函数 |
| `g1/h.java` | `LogUtils` | inferred | 受日志标志控制的日志封装 |
| `g1/i.java` | `Sha256Utils` | inferred | SHA-256 十六进制（用于哈希 TAC/CID） |
| `g1/j.java` | `RSAHelper` | tag | 使用 X.509 公钥的 `RSA/ECB/PKCS1Padding` |
| `g1/k.java` | `ReflectUtils` | inferred | `Class.forName` / `setAccessible` / `invoke`，调用隐藏 API |
| `g1/l.java` | `RegisterUtils` | tag | 首选项、`serverAddress`、中国/联通/Wi-Fi 判断、脱敏豁免 |
| `g1/m.java` | `SignalDatabaseHelper` | tag | 保存信号快照的 SQLite 数据库 |
| `g1/n.java` | `SignalInfo` | tag | 快照数据对象与 JSON 构造器 `a()` |

## 第三方代码

| 位置 | 内容 |
|---|---|
| `b1/`、`i/`、`com/baidu/location/` 及其他单字母包 | 百度定位 SDK（已混淆），见[百度定位 SDK](07-Baidu-Location-SDK.md) |
| `android/support/…`、`android/arch/…` | Android Support / Architecture 库 |

下一页：[局限与未知 →](09-Limitations-and-Unknowns.md)
