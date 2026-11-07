# com.mobiletools.systemhelper — 反编译源码

语言：[English](README.md) · **中文**

本仓库是 **`com.mobiletools.systemhelper`**（应用名 **"SystemHelper"**）的反编译源码。
它是预装在小米澎湃 OS（HyperOS）中的一个特权系统应用。名字听起来很普通，但它实际上是
**中国联通的终端注册与移动网络遥测客户端**：开机即运行，采集设备标识、精确位置、
基站信号数据和逐应用使用情况，并上传到中国联通的服务器。

> **代码是否已去混淆？没有。** [`sources/`](sources/) 目录下的全部内容都是
> **反编译器的原始输出，仍然是混淆状态**——像 `g1.l`、`e1.b`、`f1.o` 这样的类名，
> 以及 `f2652e` 这样的字段名，都是反编译器生成的，**并未**被重写。文档中使用的原始名称
> （例如 `HttpHelper`、`RegisterThread`、`DeviceManager`）是**从应用自身的日志标签中还原的**，
> 并没有写回源文件。完整的"混淆名 → 还原名"对照见
> [类参考](docs/zh-CN/08-Class-Reference.md)。

## 来源信息

| | |
|---|---|
| 包名 | `com.mobiletools.systemhelper` |
| 版本 | `3.0.1-20260313`（versionCode 34） |
| 设备上的路径 | `/system/priv-app/SystemHelper/SystemHelper.apk` |
| APK SHA-256 | `1de8d965e295db27e189aa179cdb45438d7f759cffbb43ce55f840b614ff6c65` |
| 签名 | 与小米系统应用共用平台密钥；`sharedUserId` 为 `com.mobiletools.systemhelper.uid` |
| 采样设备 | 小米 14（`houji`），HyperOS `OS3.0.307.0.WNCCNXM`，Android 16 |
| 反编译器 | jadx 1.5.6 |

## 一段话说清它如何监控手机

开机时，`OnBootReceiver` 会设置一组重复的精确闹钟。大约每 **30 分钟**，它用内置的
**百度定位 SDK** 获取你的精确位置，并连同你的 **IMEI**、基站标识以及你连接的
**Wi-Fi 网络**一起记录下来。每 **12 小时**上传一批这样的快照；每**天**上传一次完整的
设备注册信息（两个 SIM 卡槽的 **IMEI / IMSI / ICCID**、网络信息、Wi-Fi），以及一份
**你当天用过的所有应用**的报告，包括前台时长和流量。所有数据经 AES 加密后 POST 到
`http://dm.wo.com.cn:18080/register`。在小米手机上，唯一的前提是完成了首次开机设置——
没有任何"同意"勾选项。而且只要是中国大陆的 SIM 卡就会上传（包括采样手机里的中国移动卡），
并不限于联通用户。

完整细节及源码出处见文档。

## 文档

- [首页 / 目录](docs/zh-CN/Home.md)
- [1. 概览](docs/zh-CN/01-Overview.md)
- [2. 架构与组件](docs/zh-CN/02-Architecture.md)
- [3. 采集了哪些数据](docs/zh-CN/03-Data-Collection.md)
- [4. 上传协议与加密](docs/zh-CN/04-Upload-and-Encryption.md)
- [5. 同意机制与激活条件](docs/zh-CN/05-Consent-and-Activation.md)
- [6. 安全缺陷](docs/zh-CN/06-Security-Weaknesses.md)
- [7. 百度定位 SDK](docs/zh-CN/07-Baidu-Location-SDK.md)
- [8. 类参考（混淆名 → 还原名）](docs/zh-CN/08-Class-Reference.md)
- [9. 局限与未知](docs/zh-CN/09-Limitations-and-Unknowns.md)

## 仓库结构

```
sources/      jadx 反编译出的 Java（548 个文件；模块自身代码约 50 个类）
resources/    解码后的 AndroidManifest.xml、布局、图片资源、assets/pub.cer
docs/         英文文档
docs/zh-CN/   中文文档
```

**未包含**的内容：两个百度原生库（`libindoor.so`、`liblocSDK8b.so`；编译后的机器码，
没有源码）、APK 的 `META-INF` 签名文件，以及 APK 本身。

## 关于反编译结果的说明

- **仍是混淆状态。** 见上方说明。`sources/` 中的名称由反编译器生成。
- **不是原始源码。** 注释和局部变量名已丢失，部分控制流被重构，不一定能重新编译。
- **13 个方法反编译失败**，以指令清单形式保留（其中 `SIMStateReceiver.onReceive`
  属于模块本身，但仍可阅读）。
- **还原名是推断出来的。** 还原名来自日志标签，可能有误导——例如 `f1/j.java`
  的日志标签是 `DeviceInfoReaderWIKO`，但实际按分发逻辑它是中国电信（"天翼"）的读取器。
  以代码的分发逻辑为准，而不是日志标签。

## 法律 / 使用须知

本仓库包含中国联通、小米和百度的专有代码，取自一台出厂设备，仅用于**安全研究和个人审阅**。
其中还包含从清单文件中取出的一个百度地图 API 密钥。请保持仓库**私有**，不要再分发。
