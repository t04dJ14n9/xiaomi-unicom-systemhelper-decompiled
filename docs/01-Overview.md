# 1. Overview

Language: **English** · [中文](zh-CN/01-Overview.md)

[← Home](Home.md) · Next: [Architecture →](02-Architecture.md)

## What it is

| Property | Value | Source |
|---|---|---|
| Package | `com.mobiletools.systemhelper` | manifest |
| Label | `SystemHelper` (`@string/app_name`) | `resources/res/values/strings.xml` |
| Version | `3.0.1-20260313`, versionCode 34 | manifest |
| Min / target SDK | 31 / 34 | `dumpsys package` *(observed on device)* |
| Location | `/system/priv-app/SystemHelper/` — privileged | *(observed on device)* |
| Shared UID | `com.mobiletools.systemhelper.uid` | `resources/AndroidManifest.xml` |
| Signing key | same platform certificate as Xiaomi's own system apps | *(observed on device)* |
| Upload server | `http://dm.wo.com.cn:18080/register` | `sources/g1/d.java:44` |

`wo.com.cn` is China Unicom's ("沃") domain, and the bundled encryption certificate is
issued to `O=UNICOM, CN=UNICOM` ([Upload & encryption](04-Upload-and-Encryption.md)). Its
internal name is "DM" (device management) — the `Application` class is
`DMApplication` (`sources/com/mobiletools/systemhelper/control/DMApplication.java`).

## A multi-vendor carrier SDK

The code is not Xiaomi-specific. `DeviceManager` (`sources/f1/o.java`) selects a
device-info reader by phone brand, and readers exist for **Xiaomi, vivo, OPPO, OnePlus,
Realme, Samsung, Nubia, ZTE, WIKO, TD Tech, PTAC**, and the carrier-branded **Liantong**
(Unicom) and **Tianyi** (China Telecom) phones. This is a carrier SDK that China Unicom
supplies to handset makers, shipped here inside Xiaomi's firmware. See
[Class reference](08-Class-Reference.md#f1--brand-specific-readers--orchestration).

## Is it spyware?

It depends on the definition, so here are the facts.

**What makes it look like spyware**

- It collects **precise location every 30 minutes** in the background, plus permanent
  hardware and SIM identifiers, and a **daily list of every app you used**.
- On Xiaomi there is **no opt-in**: it runs as soon as setup is complete
  ([Consent](05-Consent-and-Activation.md)).
- It has no launcher icon or user-facing settings, and it is not removable without root.
- It ships a **third-party location SDK (Baidu)** with its own servers
  ([Baidu SDK](07-Baidu-Location-SDK.md)).

**What makes it not classic spyware**

- It was not installed by an attacker. It is part of the **official, signed firmware**
  (on the verified system partition).
- Its data goes to a **mobile carrier** for network-quality and device-registration
  purposes (the field set — signal strength, call-drop causes, data-failure causes — is
  network-engineering telemetry), not to an individual watching you.
- Payloads are **encrypted** to the carrier's key in transit.

The fair description is **undisclosed, always-on carrier telemetry that collects
location and identifiers far beyond what device registration needs**, built with
weaknesses that let other apps tamper with it ([Security weaknesses](06-Security-Weaknesses.md)).

## Permissions it holds

Declared in `resources/AndroidManifest.xml`. All were **granted** on the sampled device
*(observed on device)*.

| Permission | Why it matters |
|---|---|
| `ACCESS_FINE_LOCATION`, `ACCESS_BACKGROUND_LOCATION` | Precise location, including when no app is open |
| `READ_PRIVILEGED_PHONE_STATE` | IMEI and other hardware identifiers |
| `READ_PHONE_STATE`, `READ_PRECISE_PHONE_STATE` | IMSI, ICCID, network type, call/data failure causes |
| `PACKAGE_USAGE_STATS` | Per-app foreground time and launch history |
| `QUERY_ALL_PACKAGES` | Enumerate every installed app |
| `ACCESS_WIFI_STATE`, `CHANGE_WIFI_STATE` | Wi-Fi SSID/BSSID; trigger scans for location |
| `SCHEDULE_EXACT_ALARM`, `RECEIVE_BOOT_COMPLETED` | Run on a precise schedule from boot |
| `INTERNET`, `ACCESS_NETWORK_STATE` | Upload |

The manifest also sets `android:usesCleartextTraffic="true"`, allowing the plain-HTTP
upload.

Next: [Architecture & components →](02-Architecture.md)
