# com.mobiletools.systemhelper — decompiled

Decompiled source of **`com.mobiletools.systemhelper`** (label **"SystemHelper"**), a
privileged system app preinstalled in Xiaomi HyperOS. Despite the generic name, it is
**China Unicom's device-registration and mobile-network telemetry client**. It runs on
boot, collects device identifiers, precise location, cell-signal measurements and
per-app usage, and uploads them to a China Unicom server.

> **Is this code deobfuscated? No.** Everything under [`sources/`](sources/) is **raw
> decompiler output and is still obfuscated** — class and method names like `g1.l`,
> `e1.b`, `f1.o` and fields like `f2652e` are invented by the decompiler. It has **not**
> been rewritten. The original names used throughout the wiki (for example `HttpHelper`,
> `RegisterThread`, `DeviceManager`) were **recovered from the app's own log tags**, not
> from the code, and have not been written back into the files. See
> [Class reference](docs/08-Class-Reference.md) for the full obfuscated → recovered map.

## Provenance

| | |
|---|---|
| Package | `com.mobiletools.systemhelper` |
| Version | `3.0.1-20260313` (versionCode 34) |
| On-device path | `/system/priv-app/SystemHelper/SystemHelper.apk` |
| APK SHA-256 | `1de8d965e295db27e189aa179cdb45438d7f759cffbb43ce55f840b614ff6c65` |
| Signing | Platform key shared with Xiaomi system apps; `sharedUserId` `com.mobiletools.systemhelper.uid` |
| Device sampled | Xiaomi 14 (`houji`), HyperOS `OS3.0.307.0.WNCCNXM`, Android 16 |
| Decompiler | jadx 1.5.6 |

## How it watches the phone, in one paragraph

On boot, `OnBootReceiver` schedules repeating exact alarms. Roughly every **30 minutes**
it uses an embedded **Baidu location SDK** to fix your precise position, then records that
plus your **IMEI**, cell identifiers and the **Wi-Fi network** you're on. Every **12 hours**
it uploads the batch of those snapshots; once a **day** it uploads a full device
registration (both SIM slots' **IMEI / IMSI / ICCID**, network details, Wi-Fi) and a report
of **every app you used** that day with foreground time and data usage. All of it is
AES-encrypted and POSTed to `http://dm.wo.com.cn:18080/register`. On Xiaomi the only
precondition is that initial device setup has finished — there is no opt-in checkbox — and
uploads happen for any Chinese SIM (including the China Mobile SIM in the sampled phone),
not only China Unicom.

Full detail, with source citations, is in the wiki.

## Wiki

- [Home / index](docs/Home.md)
- [1. Overview](docs/01-Overview.md)
- [2. Architecture & components](docs/02-Architecture.md)
- [3. What data is collected](docs/03-Data-Collection.md)
- [4. Upload protocol & encryption](docs/04-Upload-and-Encryption.md)
- [5. Consent & activation](docs/05-Consent-and-Activation.md)
- [6. Security weaknesses](docs/06-Security-Weaknesses.md)
- [7. Baidu location SDK](docs/07-Baidu-Location-SDK.md)
- [8. Class reference (obfuscated → recovered names)](docs/08-Class-Reference.md)
- [9. Limitations & unknowns](docs/09-Limitations-and-Unknowns.md)

## Repository layout

```
sources/      jadx-decompiled Java (548 files; the module's own code is ~50 classes)
resources/    decoded AndroidManifest.xml, layouts, drawables, assets/pub.cer
docs/         this wiki
```

What is **not** here: the two native Baidu libraries (`libindoor.so`, `liblocSDK8b.so`;
compiled machine code, no source), the APK's `META-INF` signing files, and the APK itself.

## Caveats on the decompilation

- **Obfuscated.** See the note above. Names in `sources/` are decompiler-generated.
- **Not original source.** Comments and local variable names are gone, some control flow
  is restructured, and it will not necessarily recompile.
- **13 methods failed to decompile** and remain as instruction listings (one of them,
  `SIMStateReceiver.onReceive`, is in the module itself but is still readable).
- **Names are inferred.** The recovered names come from log tags and can mislead — e.g.
  `f1/j.java` logs as `DeviceInfoReaderWIKO` but is dispatched as the China Telecom
  ("Tianyi") reader. The code's dispatch, not the tag, is authoritative.

## Legal / handling

This repository contains proprietary code owned by China Unicom, Xiaomi and Baidu,
reproduced here from a shipped device for **security research and personal review**. It
also contains a Baidu Maps API key taken from the manifest. Keep the repository
**private**. Do not redistribute.
