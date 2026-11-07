# SystemHelper 文档

语言：[English](../Home.md) · **中文**

本文档是对反编译后的 **`com.mobiletools.systemhelper`** 的技术说明。它是中国联通的终端注册与
网络遥测客户端，以特权系统应用的形式预装在小米澎湃 OS（HyperOS）中。

> 所有代码引用都指向 [`../../sources/`](../../sources/) 中**仍处于混淆状态**的反编译输出。
> 文档中使用还原后的类名（如 `HttpHelper`），并始终给出真实的文件路径（如 `sources/g1/f.java`），
> 方便对照阅读。名称对照见[类参考](08-Class-Reference.md)。

## 页面

| # | 页面 | 回答的问题 |
|---|---|---|
| 1 | [概览](01-Overview.md) | 这是什么应用、谁做的、算不算间谍软件？ |
| 2 | [架构与组件](02-Architecture.md) | 各部分如何协作；触发器、调度器、数据存储 |
| 3 | [采集了哪些数据](03-Data-Collection.md) | 它采集的每个字段及其在代码中的位置 |
| 4 | [上传协议与加密](04-Upload-and-Encryption.md) | 数据发往哪里、如何加密、何时上传 |
| 5 | [同意机制与激活条件](05-Consent-and-Activation.md) | 什么条件让它开启；为何在小米上不经询问就运行 |
| 6 | [安全缺陷](06-Security-Weaknesses.md) | 导出组件、弱加密、可逆的"匿名化" |
| 7 | [百度定位 SDK](07-Baidu-Location-SDK.md) | 内置的第三方 SDK 及其涉及的服务器 |
| 8 | [类参考](08-Class-Reference.md) | 每个相关类的"混淆名 → 还原名" |
| 9 | [局限与未知](09-Limitations-and-Unknowns.md) | 本分析没有、也无法确认的内容 |

## 简要结论

1. **完成设置后即始终开启。** 在小米手机上，唯一的条件是完成了首次开机设置（见[同意机制](05-Consent-and-Activation.md)）。
2. **每 30 分钟获取一次精确位置**，通过内置的百度 SDK 以高精度模式定位（见[数据采集](03-Data-Collection.md)、[百度 SDK](07-Baidu-Location-SDK.md)）。
3. **永久性标识**——两个 SIM 卡槽的 IMEI、IMSI、ICCID——与位置一起发送（见[数据采集](03-Data-Collection.md)）。
4. **每日应用使用报告**——用过的每个应用、前台分钟数、启动次数、流量。
5. **上传给中国联通**，地址为 `http://dm.wo.com.cn:18080/register`，采用 AES/RSA 加密（见[上传与加密](04-Upload-and-Encryption.md)）。
6. **不限于联通用户**——只要是中国大陆的 SIM 卡就会上传，区别只在于脱敏方式（见[上传与加密](04-Upload-and-Encryption.md)）。
7. **任何应用都能重新配置它**，通过一个未加保护的导出服务，甚至能改写它的上传地址（见[安全缺陷](06-Security-Weaknesses.md)）。

## 本文档使用的证据类型

每条结论属于以下之一：

- **静态**——从本仓库的反编译代码或解码后的清单文件中读出。
- **运行时**——通过 `adb` 在采样设备上观察到（闹钟计划、权限使用、网络流量计数）。标注为*（设备上观察到）*。
- **推断**——基于静态证据推理，但未直接观察到。会明确标注。

未能确认的内容列在[局限与未知](09-Limitations-and-Unknowns.md)中。
