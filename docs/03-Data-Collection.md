# 3. What data is collected

Language: **English** · [中文](zh-CN/03-Data-Collection.md)

[← Architecture](02-Architecture.md) · Next: [Upload & encryption →](04-Upload-and-Encryption.md)

Three payload shapes: the **location+signal snapshot**, the **device registration**, and
the **app-usage report**. All field names below are the exact JSON keys found in the code.

## Triggers & cadence

Defaults from `GlobalSetting` (`sources/g1/d.java`); the first run of each is randomized
within 24 h, then settles to the fixed interval. Live alarms matching this cadence were
seen on the device *(observed on device)*.

| Job | Default interval | Builder |
|---|---|---|
| Location + signal snapshot | **30 min** (`f2669v = 1800000`) | `GetSignalInfoReceiver` + `GetSignalStrengthInfo` (`e1/d.java`) |
| Signal batch upload | **12 h** (`f2668u = 43200000`) | `SignalInfoRegisterReceiver` → `DeviceManager` |
| Device registration | **24 h** (`f2666s = 86400000`) | `ScheduleRegisterReceiver` → `DeviceManager` |
| App-usage report | **24 h** (`f2667t = 86400000`) | `AppInfoRegisterReceiver` → `QueryAppInfoThread` (`e1/f.java`) |
| Registration on SIM change | event | `SIMStateReceiver` (regType `"T"`) |

## A. Location + signal snapshot — `SignalInfo`

Built by `SignalInfo.a()` (`sources/g1/n.java`, the `JSONObject` builder). Fields:

| JSON key | Meaning |
|---|---|
| `Time` | Timestamp |
| `IMEI` | Device IMEI |
| `ICCID` | SIM serial |
| `IMSI` | Subscriber identity |
| `MNC`, `NetworkType` | Operator code, radio type |
| `TAC`, `CID`, `PCI` | Cell identifiers |
| `ARFCN`, `Bands`, `Bandwidth` | Radio channel/band |
| `RSRP`, `RSRQ`, `SINR`, `CSIRSRP`, `CSIRSRQ`, `CSISINR` | Signal quality |
| `CQITableIndex`, `CQIIndex` | Channel-quality indices |
| `Uspeed`, `Dspeed` | Up/down throughput |
| `CallDisconnectCause`, `DataFailCause`, `EPSFallback` | Call/data failure diagnostics |
| **`LONGITUDE`, `LATITUDE`, `ALTITUDE`** | **Precise location** |
| `District` | Reverse-geocoded area |
| `SPEED`, `BEARING` | Motion |
| **`BSSID`, `SSID`** | **Connected Wi-Fi access point and name** |

Location comes from the **Baidu SDK** in high-accuracy `bd09ll` mode, started in
`GetSignalInfoReceiver.d(...)` (`sources/com/mobiletools/systemhelper/control/GetSignalInfoReceiver.java`).
Cell/signal values come from telephony callbacks in `GetSignalStrengthInfo` (`e1/d.java`)
and `DMTelephonyCallback` (`e1/a.java`). Snapshots are written to the signal DB and
uploaded later in a batch.

## B. Device registration — `DeviceInfo`

Built by `DeviceInfo.b()` (`sources/e1/b.java`). Covers **both SIM slots** (suffix `1` and `2`):

- **Identifiers per slot**: `IMEI1/IMEI2`, `ICCID1/ICCID2`, `IMSI1/IMSI2`
- **Network per slot**: `MNC`, `NetworkType`, `TAC`, `CID`, `PCI`, `VolteEnabled`,
  `5GEnabled`, `VoNREnable`
- **Device**: `Manuf`, `Model`, `HWVersion`, `SWVersion`, `OS`, `OSVersion`, `DeviceType`
- **Wi-Fi / data**: `DataSlot`, `BSSID`, `LinkSpeed`, `RSSI`, `Frequency`, `AccType`, `IPv6`
- **eSIM**: `Esim`, `InactiveEsimMNC`
- **Meta**: `RegType`, `SpecVersion`, `ClientVersion`, `Time`
- **Embedded app-usage array**: `AppInfo` (see C)

Identifiers are read by the brand reader — on Xiaomi, `DeviceInfoReaderXiaomi`
(`sources/f1/m.java`). `IPv6` is fetched by `GetIPAddressThread` (`e1/c.java`).

## C. App-usage report — `AppInfo[]`

Built by `QueryAppInfoThread` (`sources/e1/f.java`) using `UsageStatsManager`
(`queryAndAggregateUsageStats` + `queryEvents`) and `NetworkStatsManager`. One entry per
app, serialized by the `AppInfo` bean (`sources/g1/b.java`):

| JSON key | Meaning |
|---|---|
| `pkgName`, `appLabel` | App package and display name |
| `runTime` | Foreground minutes (last 24 h) |
| `launchCount` | Times launched/resumed |
| `tx1`, `rx1`, `tx2`, `rx2` | Mobile up/down bytes per SIM (KB) |
| `totalData1`, `totalData2`, `totalDataWiFi` | Totals per SIM and over Wi-Fi |
| `Time` | Timestamp |

This enumerates **every app you used**, how long, how often, and how much data each used.

## What it does *not* collect

No evidence in the code of reading message bodies, call-log entries, contacts, photos,
microphone or camera. The `appops` for this app had SMS/contacts/call-log/camera/mic set to
`ignore` *(observed on device)*. Its reach is **location, identifiers, network/cell
telemetry, and app-usage metadata**.

Next: [Upload protocol & encryption →](04-Upload-and-Encryption.md)
