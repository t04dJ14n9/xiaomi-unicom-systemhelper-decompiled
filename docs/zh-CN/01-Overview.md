# 1. 概览

语言：[English](../01-Overview.md) · **中文**

[← 首页](Home.md) · 下一页：[架构 →](02-Architecture.md)

## 它是什么

| 属性 | 值 | 来源 |
|---|---|---|
| 包名 | `com.mobiletools.systemhelper` | 清单文件 |
| 应用名 | `SystemHelper`（`@string/app_name`） | `resources/res/values/strings.xml` |
| 版本 | `3.0.1-20260313`，versionCode 34 | 清单文件 |
| 最低 / 目标 SDK | 31 / 34 | `dumpsys package` *（设备上观察到）* |
| 安装位置 | `/system/priv-app/SystemHelper/`——特权分区 | *（设备上观察到）* |
| 共享 UID | `com.mobiletools.systemhelper.uid` | `resources/AndroidManifest.xml` |
| 签名密钥 | 与小米自家系统应用相同的平台证书 | *（设备上观察到）* |
| 上传服务器 | `http://dm.wo.com.cn:18080/register` | `sources/g1/d.java:44` |

`wo.com.cn` 是中国联通（"沃"）的域名，内置的加密证书签发给 `O=UNICOM, CN=UNICOM`
（见[上传与加密](04-Upload-and-Encryption.md)）。它的内部名称是 "DM"（终端管理），
`Application` 类为 `DMApplication`（`sources/com/mobiletools/systemhelper/control/DMApplication.java`）。

## 一个跨厂商的运营商 SDK

这份代码并不是小米专用的。`DeviceManager`（`sources/f1/o.java`）会按手机品牌选择对应的
设备信息读取器，覆盖了**小米、vivo、OPPO、一加、realme、三星、努比亚、中兴、WIKO、鼎桥（TD Tech）、
PTAC**，以及运营商定制机**联通（Liantong）**和**天翼（中国电信）**。这是中国联通提供给各手机厂商
的运营商 SDK，在这里被打包进了小米的固件。详见[类参考](08-Class-Reference.md)。

## 它算间谍软件吗？

这取决于定义，下面列出事实。

**让它看起来像间谍软件的地方**

- 它在后台**每 30 分钟采集一次精确位置**，同时采集永久性的硬件和 SIM 卡标识，以及一份
  **你每天用过的所有应用的清单**。
- 在小米上**没有任何同意环节**：只要完成设置就会运行（见[同意机制](05-Consent-and-Activation.md)）。
- 它没有桌面图标，也没有面向用户的设置项，不 root 就无法卸载。
- 它内置了一个**第三方定位 SDK（百度）**，有自己的服务器（见[百度 SDK](07-Baidu-Location-SDK.md)）。

**它又不同于典型间谍软件的地方**

- 它不是攻击者安装的，而是**官方签名固件**的一部分（位于经过校验的系统分区）。
- 数据发给的是**移动运营商**，用于网络质量和终端注册（字段集合——信号强度、掉话原因、
  数据连接失败原因——属于网络工程遥测），而不是发给某个在监视你的人。
- 数据在传输中按运营商的公钥**加密**。

比较公允的描述是：**一个未告知用户、始终开启的运营商遥测程序，它采集的位置和标识远超终端注册所需**，
而且实现上存在缺陷，其他应用可以篡改它（见[安全缺陷](06-Security-Weaknesses.md)）。

## 它持有的权限

声明于 `resources/AndroidManifest.xml`。在采样设备上全部**已授予***（设备上观察到）*。

| 权限 | 意味着什么 |
|---|---|
| `ACCESS_FINE_LOCATION`、`ACCESS_BACKGROUND_LOCATION` | 精确位置，包括没有任何应用打开时 |
| `READ_PRIVILEGED_PHONE_STATE` | IMEI 等硬件标识 |
| `READ_PHONE_STATE`、`READ_PRECISE_PHONE_STATE` | IMSI、ICCID、网络类型、通话/数据失败原因 |
| `PACKAGE_USAGE_STATS` | 每个应用的前台时长和启动记录 |
| `QUERY_ALL_PACKAGES` | 枚举所有已安装应用 |
| `ACCESS_WIFI_STATE`、`CHANGE_WIFI_STATE` | Wi-Fi 的 SSID/BSSID；为定位触发扫描 |
| `SCHEDULE_EXACT_ALARM`、`RECEIVE_BOOT_COMPLETED` | 开机即按精确计划运行 |
| `INTERNET`、`ACCESS_NETWORK_STATE` | 上传 |

清单中还设置了 `android:usesCleartextTraffic="true"`，允许以明文 HTTP 上传。

下一页：[架构与组件 →](02-Architecture.md)
