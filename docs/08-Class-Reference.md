# 8. Class reference (obfuscated → recovered names)

Language: **English** · [中文](zh-CN/08-Class-Reference.md)

[← Baidu SDK](07-Baidu-Location-SDK.md) · Next: [Limitations →](09-Limitations-and-Unknowns.md)

The files in `sources/` keep their **obfuscated** names. This page maps each relevant class
to a **recovered** name. Recovered names were taken from the log tag each class passes to
its logger (e.g. `HttpHelper` logs under `"HttpHelper"`). Classes with no log tag were named
from their behavior and are marked *inferred*.

**Confidence key** — **tag**: recovered from the class's own log tag. **dispatch**: confirmed
by how other code selects it. **inferred**: named from behavior, no tag.

## `com.mobiletools.systemhelper.*` — original names (not obfuscated)

| Path | Name | Role |
|---|---|---|
| `control/DMApplication.java` | `DMApplication` | Application class |
| `control/OnBootReceiver.java` | `OnBootReceiver` | Boot trigger → scheduler |
| `control/GetSignalInfoReceiver.java` | `GetSignalInfoReceiver` | 30-min location+signal snapshot; sets the permission flag |
| `control/SignalInfoRegisterReceiver.java` | `SignalInfoRegisterReceiver` | 12-h signal batch upload |
| `control/ScheduleRegisterReceiver.java` | `ScheduleRegisterReceiver` | 24-h registration |
| `control/AppInfoRegisterReceiver.java` | `AppInfoRegisterReceiver` | 24-h app-usage report |
| `control/SIMStateReceiver.java` | `SIMStateReceiver` | SIM change → `"T"` registration *(one method failed to decompile)* |
| `control/ConnectStateReceiver.java` | `ConnectStateReceiver` | Connectivity changes |
| `service/RegisterHelperService.java` | `RegisterHelperService` | Exported reconfiguration binder |
| `service/a.java` | `IRegisterHelperService` (AIDL) | Binder interface; codes 1–5 |
| `service/RegisterIntentService.java` | `RegisterIntentService` | Background runner |
| `service/RegisterJobService.java` | `RegisterJobService` | Job runner |
| `Activity/TestActivity.java` | `TestActivity` | Exported; shows registration payload |

## `e1` — worker threads & beans

| Path | Recovered name | Conf. | Role |
|---|---|---|---|
| `e1/a.java` | `DMTelephonyCallback` | tag | Telephony callbacks for cell/signal |
| `e1/b.java` | `DeviceInfo` | tag | Registration bean + JSON builder `b()` |
| `e1/c.java` | `GetIPAddressThread` | tag | Fetch IPv4/IPv6, then trigger upload |
| `e1/d.java` | `GetSignalStrengthInfo` | tag | Fill `SignalInfo`; masks non-Unicom IDs |
| `e1/e.java` | `HistoryPostThread` | tag | Post queued history records |
| `e1/f.java` | `QueryAppInfoThread` | tag | App usage via UsageStats + NetworkStats |
| `e1/g.java` | `RegisterThread` | tag | Encrypt + POST registration; post-vs-queue logic |

## `f1` — brand-specific readers & orchestration

The reader is chosen in `DeviceManager` by the phone's manufacturer
(`ro.product.manufacturer`, recorded against `Build.MODEL`).

| Path | Recovered name | Conf. | Selected for |
|---|---|---|---|
| `f1/a.java` | `DeviceInfoReaderBase` | tag | Default / unknown brand |
| `f1/b.java` | `DeviceInfoReaderLiantong` | tag + dispatch | `Liantong` (Unicom-branded) |
| `f1/c.java` | `DeviceInfoReaderNubia` | tag + dispatch | `nubia` |
| `f1/d.java` | `DeviceInfoReaderOPPO` | tag + dispatch | `OPPO` |
| `f1/e.java` | `DeviceInfoReaderOnePlus` | tag + dispatch | `OnePlus` |
| `f1/f.java` | `DeviceInfoReaderPTAC` | tag + dispatch | `PTAC` |
| `f1/g.java` | `DeviceInfoReaderRealme` | tag + dispatch | `realme` |
| `f1/h.java` | `DeviceInfoReaderSamSung` | tag + dispatch | `samsung` |
| `f1/i.java` | `DeviceInfoReaderTDTECH` | tag + dispatch | `TDTECH` |
| `f1/j.java` | **Tianyi reader** | dispatch | `Tianyi` (China Telecom). *Logs as `DeviceInfoReaderWIKO` — tag is misleading.* |
| `f1/k.java` | `DeviceInfoReaderVIVO` | tag + dispatch | `vivo` (checks the consent setting) |
| `f1/l.java` | `DeviceInfoReaderWIKO` | tag + dispatch | `WIKO` |
| `f1/m.java` | `DeviceInfoReaderXiaomi` | tag + dispatch | `Xiaomi` (checks only `device_provisioned`) |
| `f1/n.java` | `DeviceInfoReaderZTE` | tag + dispatch | `ZTE` |
| `f1/o.java` | `DeviceManager` | tag | Orchestrator: reader choice, masking, regType dispatch |

## `g1` — utilities, beans, storage

| Path | Recovered name | Conf. | Role |
|---|---|---|---|
| `g1/a.java` | `AlarmHelper` | tag | Exact alarms (`setExactAndAllowWhileIdle`) |
| `g1/b.java` | `AppInfo` | tag | Per-app usage bean |
| `g1/c.java` | `CryptoUtils` | inferred | AES/ECB encrypt, MD5 key, base64, RSA-wrap via `pub.cer` |
| `g1/d.java` | `GlobalSetting` | inferred | Static config: server URL, intervals, flags (`f2652e` = permission flag) |
| `g1/e.java` | `HistoryDatabaseHelper` | tag | SQLite store for queued records |
| `g1/f.java` | `HttpHelper` | tag | HTTP(S) POST client |
| `g1/g.java` | `MemoryUtils` | tag | Memory helpers |
| `g1/h.java` | `LogUtils` | inferred | Logging wrapper, gated on the log flag |
| `g1/i.java` | `Sha256Utils` | inferred | SHA-256 hex (used to hash TAC/CID) |
| `g1/j.java` | `RSAHelper` | tag | `RSA/ECB/PKCS1Padding` with an X.509 public key |
| `g1/k.java` | `ReflectUtils` | inferred | `Class.forName` / `setAccessible` / `invoke` — calls hidden APIs |
| `g1/l.java` | `RegisterUtils` | tag | Prefs, `serverAddress`, China/Unicom/Wi-Fi checks, masking exemption |
| `g1/m.java` | `SignalDatabaseHelper` | tag | SQLite store for signal snapshots |
| `g1/n.java` | `SignalInfo` | tag | Snapshot bean + JSON builder `a()` |

## Third-party code

| Location | What |
|---|---|
| `b1/`, `i/`, `com/baidu/location/` and other single-letter packages | Baidu Location SDK (obfuscated) — see [Baidu SDK](07-Baidu-Location-SDK.md) |
| `android/support/…`, `android/arch/…` | Android support / architecture libraries |

Next: [Limitations & unknowns →](09-Limitations-and-Unknowns.md)
