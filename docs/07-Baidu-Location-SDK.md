# 7. Baidu location SDK

[← Security weaknesses](06-Security-Weaknesses.md) · Next: [Class reference →](08-Class-Reference.md)

The precise coordinates in each 30-minute snapshot do not come from Android's own location
APIs. The module embeds **Baidu's Location SDK** and uses it to fix position.

## How it's wired in

- **Manifest** declares Baidu's location service `com.baidu.location.f` (enabled) and a
  Baidu Maps API key in `<meta-data android:name="com.baidu.lbsapi.API_KEY">`
  (`resources/AndroidManifest.xml`).
- **Java client** is obfuscated into `b1/` (the location client and options) and `i/`,
  with a few named classes under `sources/com/baidu/location/`. The SDK identifies itself as
  `com.baidu.location.service_v2.9` (`sources/b1/h.java`).
- **Native libraries** (not in this repo — compiled code, no source):

  | Library | Size | Purpose (inferred from name) |
  |---|---|---|
  | `lib/arm64-v8a/liblocSDK8b.so` | ~370 KB | Core location engine |
  | `lib/arm64-v8a/libindoor.so` | ~1.6 MB | Indoor positioning |

## How it's used

`GetSignalInfoReceiver.d(...)`
(`sources/com/mobiletools/systemhelper/control/GetSignalInfoReceiver.java`) configures the
client and starts a fix:

- coordinate type **`bd09ll`** (Baidu's lat/long system),
- mode **`Hight_Accuracy`** (GPS plus network),
- address/scan options enabled.

On success the callback copies **longitude, latitude, altitude** and an address string
into the `SignalInfo` fields `LONGITUDE`, `LATITUDE`, `ALTITUDE`, `District`
([Data collection](03-Data-Collection.md#a-location--signal-snapshot--signalinfo)).

## Baidu servers referenced in the SDK code

These hostnames appear as string literals in the decompiled SDK. **Which of them the SDK
actually contacts on a given phone was not established** — see
[Limitations](09-Limitations-and-Unknowns.md).

| Host / path | Apparent role |
|---|---|
| `loc.map.baidu.com/sdk.php`, `…/cc.php`, `…/sdk_ep.php` | Location lookup |
| `loc.map.baidu.com/gpsz`, `…/cfgs/loc/commcfgs` | GPS / config |
| `loc.map.baidu.com/…indoor…` | Indoor positioning data |
| `itsdata.map.baidu.com/long-conn-gps/sdk.php` | GPS-trace collection |
| `daup.map.baidu.com/cltr/rcvr` | Data collector |
| `ofloc.map.baidu.com/…` | Offline location, map matching |
| `api.map.baidu.com/sdkcs/verify` | API-key verification |
| `parking.baidu.com/…` | Parking data |

## Why this matters

High-accuracy network location works by sending nearby **cell towers and Wi-Fi access
points** to the provider's servers to look up a position. So, beyond what goes to China
Unicom, this design likely also sends location-related data to **Baidu**. The presence of
a GPS-trace endpoint (`itsdata…/long-conn-gps`) and a collector (`daup…/cltr/rcvr`) means
the SDK has code to upload more than single lookups. **This is an inference**: the native
engine and runtime traffic were not analyzed.

Next: [Class reference →](08-Class-Reference.md)
