# 7. 百度定位 SDK

语言：[English](../07-Baidu-Location-SDK.md) · **中文**

[← 安全缺陷](06-Security-Weaknesses.md) · 下一页：[类参考 →](08-Class-Reference.md)

每 30 分钟快照中的精确坐标不是由 Android 自带定位 API 获取的。模块内嵌了
**百度定位 SDK**，并用它进行定位。

## 接入方式

- **清单文件**声明了百度定位服务 `com.baidu.location.f`（已启用），并在
  `<meta-data android:name="com.baidu.lbsapi.API_KEY">` 中配置百度地图 API 密钥
  （`resources/AndroidManifest.xml`）。
- **Java 客户端**被混淆进 `b1/`（定位客户端和选项）与 `i/`，另有少量保留名称的类位于
  `sources/com/baidu/location/`。SDK 将自己的服务标识为
  `com.baidu.location.service_v2.9`（`sources/b1/h.java`）。
- **原生库**（编译后的机器码，不在仓库中）：

  | 库 | 大小 | 用途（根据名称推断） |
  |---|---|---|
  | `lib/arm64-v8a/liblocSDK8b.so` | 约 370 KB | 定位核心 |
  | `lib/arm64-v8a/libindoor.so` | 约 1.6 MB | 室内定位 |

## 使用方式

`GetSignalInfoReceiver.d(...)`
（`sources/com/mobiletools/systemhelper/control/GetSignalInfoReceiver.java`）
配置定位客户端并发起定位：

- 坐标类型 **`bd09ll`**（百度的经纬度坐标体系），
- 模式 **`Hight_Accuracy`**（GPS 加网络），
- 开启地址获取和扫描选项。

定位成功后，回调把**经度、纬度和海拔**以及一个地址字符串写入 `SignalInfo` 的
`LONGITUDE`、`LATITUDE`、`ALTITUDE`、`District` 字段
（见[数据采集](03-Data-Collection.md)）。

## SDK 代码中出现的百度服务器

以下主机名出现在反编译 SDK 的字符串常量中。**具体手机运行时实际连接其中哪些地址尚未确认**，
见[局限与未知](09-Limitations-and-Unknowns.md)。

| 主机 / 路径 | 表面用途 |
|---|---|
| `loc.map.baidu.com/sdk.php`、`…/cc.php`、`…/sdk_ep.php` | 位置查询 |
| `loc.map.baidu.com/gpsz`、`…/cfgs/loc/commcfgs` | GPS / 配置 |
| `loc.map.baidu.com/…indoor…` | 室内定位数据 |
| `itsdata.map.baidu.com/long-conn-gps/sdk.php` | GPS 轨迹收集 |
| `daup.map.baidu.com/cltr/rcvr` | 数据收集器 |
| `ofloc.map.baidu.com/…` | 离线定位、地图匹配 |
| `api.map.baidu.com/sdkcs/verify` | API 密钥校验 |
| `parking.baidu.com/…` | 停车场数据 |

## 为什么这值得注意

高精度网络定位的基本方式是：把附近的**基站和 Wi-Fi 接入点**发送到定位服务商服务器，
由服务器返回位置。因此，除了发给中国联通的数据以外，这种设计很可能也会把与位置相关的数据
发送给**百度**。代码中同时存在 GPS 轨迹端点（`itsdata…/long-conn-gps`）和数据收集器
（`daup…/cltr/rcvr`），这说明 SDK 具备上传单次定位查询以外数据的能力。
**这只是推断**：原生引擎和运行时流量都没有经过分析。

下一页：[类参考 →](08-Class-Reference.md)
