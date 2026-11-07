# 5. Consent & activation

[← Upload & encryption](04-Upload-and-Encryption.md) · Next: [Security weaknesses →](06-Security-Weaknesses.md)

Every collection and upload path is gated by one global flag,
`GlobalSetting.isUserPermissionOpen` (`g1.d.f2652e` in `sources/g1/d.java`). Each worker
thread returns immediately if it is false (e.g. `QueryAppInfoThread.e()` in `sources/e1/f.java`
starts with `if (!g1.d.f2652e) return null;`). So the question "does it ask permission?"
reduces to "what sets that flag?"

## What sets the flag

In `GetSignalInfoReceiver.onReceive()`
(`sources/com/mobiletools/systemhelper/control/GetSignalInfoReceiver.java`):

```java
// decompiled, obfuscated names
if (strO != null && !strO.isEmpty()) {
    g1.d.f2652e = strO.equalsIgnoreCase("vivo") ? b(f2189d) : c(f2189d);
}
```

where `strO` is `ro.product.manufacturer`, and:

- **`b()`** (the vivo branch) requires the Secure setting
  **`operator_service_improve_plan == 1`** *(on top of `device_provisioned`)*.
- **`c()`** (every other brand, including Xiaomi) requires **only `device_provisioned == 1`**
  — i.e. that initial setup has finished.

The per-brand readers encode the same split: `DeviceInfoReaderVIVO` (`sources/f1/k.java`)
checks `operator_service_improve_plan`, while `DeviceInfoReaderXiaomi` (`sources/f1/m.java`)
checks only `device_provisioned`.

## What this means on Xiaomi

There is **no opt-in prompt and no user-facing switch**. On a Xiaomi phone the telemetry
becomes active the moment setup completes. The "carrier service improvement plan" consent
(`operator_service_improve_plan`) is **only consulted on vivo**.

On the sampled device *(observed on device)*:

| Setting | Value |
|---|---|
| `ro.product.manufacturer` | `Xiaomi` → uses the `c()` branch |
| `device_provisioned` (global) | `1` |
| `operator_service_improve_plan` (secure) | `1` |

So the flag is on. Note that even though Xiaomi doesn't check
`operator_service_improve_plan`, it was already set to `1`; what set it is unknown
([Limitations](09-Limitations-and-Unknowns.md)).

## The China gate is separate

Being "on" is necessary but not sufficient to upload: the SIM must still be Chinese
(MNC `460…`), and the network rule in [Upload & encryption](04-Upload-and-Encryption.md#when-it-uploads-and-when-it-queues)
must hold. With the flag on and a Chinese SIM, snapshots upload over Wi-Fi regardless of
carrier.

Next: [Security weaknesses →](06-Security-Weaknesses.md)
