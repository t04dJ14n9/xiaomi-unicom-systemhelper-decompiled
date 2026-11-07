# 3. 采集了哪些数据

语言：[English](../03-Data-Collection.md) · **中文**

[← 架构](02-Architecture.md) · 下一页：[上传与加密 →](04-Upload-and-Encryption.md)

上传的数据有三种结构：**位置与信号快照**、**设备注册信息**和**应用使用报告**。
下表中的字段名均来自代码中的原始 JSON 键。

## 触发方式与周期

默认值定义在 `GlobalSetting`（`sources/g1/d.java`）；每类任务的首次执行会在 24 小时内随机，
之后稳定到固定周期。设备上实际观察到的闹钟与这些周期一致*（设备上观察到）*。

| 任务 | 默认周期 | 构造者 |
|---|---|---|
| 位置与信号快照 | **30 分钟**（`f2669v = 1800000`） | `GetSignalInfoReceiver` + `GetSignalStrengthInfo`（`e1/d.java`） |
| 信号批次上传 | **12 小时**（`f2668u = 43200000`） | `SignalInfoRegisterReceiver` → `DeviceManager` |
| 设备注册 | **24 小时**（`f2666s = 86400000`） | `ScheduleRegisterReceiver` → `DeviceManager` |
| 应用使用报告 | **24 小时**（`f2667t = 86400000`） | `AppInfoRegisterReceiver` → `QueryAppInfoThread`（`e1/f.java`） |
| SIM 变化时重新注册 | 事件触发 | `SIMStateReceiver`（`regType` 为 `"T"`） |

## A. 位置与信号快照——`SignalInfo`

由 `SignalInfo.a()` 构造（`sources/g1/n.java` 中的 `JSONObject` 构造器）。字段如下：

| JSON 键 | 含义 |
|---|---|
| `Time` | 时间戳 |
| `IMEI` | 设备 IMEI |
| `ICCID` | SIM 卡序列号 |
| `IMSI` | 用户身份标识 |
| `MNC`、`NetworkType` | 运营商代码、无线网络类型 |
| `TAC`、`CID`、`PCI` | 基站标识 |
| `ARFCN`、`Bands`、`Bandwidth` | 无线信道、频段和带宽 |
| `RSRP`、`RSRQ`、`SINR`、`CSIRSRP`、`CSIRSRQ`、`CSISINR` | 信号质量 |
| `CQITableIndex`、`CQIIndex` | 信道质量索引 |
| `Uspeed`、`Dspeed` | 上行/下行速率 |
| `CallDisconnectCause`、`DataFailCause`、`EPSFallback` | 掉话和数据连接失败诊断 |
| **`LONGITUDE`、`LATITUDE`、`ALTITUDE`** | **精确位置** |
| `District` | 反向地理编码得到的地点 |
| `SPEED`、`BEARING` | 移动速度和方向 |
| **`BSSID`、`SSID`** | **当前连接的 Wi-Fi 接入点和名称** |

位置来自 **百度定位 SDK**：它在 `GetSignalInfoReceiver.d(...)`
（`sources/com/mobiletools/systemhelper/control/GetSignalInfoReceiver.java`）中
以 `bd09ll` 坐标和高精度模式启动。基站与信号值来自 `GetSignalStrengthInfo`（`e1/d.java`）
和 `DMTelephonyCallback`（`e1/a.java`）中的电话状态回调。快照先写入信号数据库，稍后成批上传。

## B. 设备注册信息——`DeviceInfo`

由 `DeviceInfo.b()` 构造（`sources/e1/b.java`），内容覆盖**两个 SIM 卡槽**（后缀为 `1` 和 `2`）：

- **每个卡槽的标识符**：`IMEI1/IMEI2`、`ICCID1/ICCID2`、`IMSI1/IMSI2`
- **每个卡槽的网络信息**：`MNC`、`NetworkType`、`TAC`、`CID`、`PCI`、`VolteEnabled`、
  `5GEnabled`、`VoNREnable`
- **设备信息**：`Manuf`、`Model`、`HWVersion`、`SWVersion`、`OS`、`OSVersion`、`DeviceType`
- **Wi-Fi / 数据网络**：`DataSlot`、`BSSID`、`LinkSpeed`、`RSSI`、`Frequency`、`AccType`、`IPv6`
- **eSIM**：`Esim`、`InactiveEsimMNC`
- **元数据**：`RegType`、`SpecVersion`、`ClientVersion`、`Time`
- **内嵌的应用使用数组**：`AppInfo`（见下一节）

标识符由对应品牌的读取器获取；在小米上为 `DeviceInfoReaderXiaomi`（`sources/f1/m.java`）。
`IPv6` 由 `GetIPAddressThread`（`e1/c.java`）获取。

## C. 应用使用报告——`AppInfo[]`

由 `QueryAppInfoThread`（`sources/e1/f.java`）通过 `UsageStatsManager`
（`queryAndAggregateUsageStats` 和 `queryEvents`）以及 `NetworkStatsManager` 生成。
每个应用对应一条记录，由 `AppInfo` 对象序列化（`sources/g1/b.java`）：

| JSON 键 | 含义 |
|---|---|
| `pkgName`、`appLabel` | 应用包名和显示名称 |
| `runTime` | 最近 24 小时的前台分钟数 |
| `launchCount` | 启动/回到前台的次数 |
| `tx1`、`rx1`、`tx2`、`rx2` | 每个 SIM 的上行/下行流量（KB） |
| `totalData1`、`totalData2`、`totalDataWiFi` | 每个 SIM 和 Wi-Fi 的流量总计 |
| `Time` | 时间戳 |

这会枚举**你用过的每个应用**、使用时长、启动次数以及各自消耗的流量。

## 它*没有*采集什么

代码中没有发现读取短信正文、通话记录、联系人、照片、麦克风或摄像头的证据。设备上的
`appops` 显示，此应用的短信、联系人、通话记录、摄像头和麦克风权限均为 `ignore`
*（设备上观察到）*。它涉及的范围是**位置、标识符、网络/基站遥测以及应用使用元数据**。

下一页：[上传协议与加密 →](04-Upload-and-Encryption.md)
