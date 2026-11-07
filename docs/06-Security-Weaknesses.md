# 6. Security weaknesses

Language: **English** · [中文](zh-CN/06-Security-Weaknesses.md)

[← Consent & activation](05-Consent-and-Activation.md) · Next: [Baidu SDK →](07-Baidu-Location-SDK.md)

These are properties of the code and manifest. Where a weakness was only read from code and
not exercised on the device, it is marked **(static only)**.

## Exported binder lets any app reconfigure the module

`RegisterHelperService` (`sources/com/mobiletools/systemhelper/service/RegisterHelperService.java`)
is **exported with no permission** (manifest; confirmed resolvable on device). Its AIDL
interface `IRegisterHelperService` (`sources/com/mobiletools/systemhelper/service/a.java`)
exposes, by transaction code:

| Code | Method (recovered) | Effect |
|---|---|---|
| 1 | `setServerAddress(String)` | Redirect **where all uploads go** (`serverAddress` pref) |
| 2 | `setBaseInterval(int)` | Rescale **every** collection interval |
| 3 | `clearPreferences()` | Delete the module's settings file |
| 4 | `setLogEnabled(boolean)` | Turn on verbose logging |
| 5 | `isLogEnabled()` | Read the logging flag |

Any installed app can bind and call these. **(static only)** — read from code; not exercised.
The most serious is `setServerAddress`: a third-party app could point the telemetry at its
own server. `setLogEnabled(true)` is dangerous because of the next item.

## Verbose logging writes plaintext identifiers to logcat

When logging is enabled (`GlobalSetting.f2648a`, gated in `sources/g1/h.java`), the build
threads log the **full unencrypted payloads** — e.g. `RegisterThread` logs
`"register postString：" + strB` and the AES ciphertext (`sources/e1/g.java`). That puts
IMEI/IMSI/ICCID and coordinates into the system log, readable by `adb logcat` and included
in bug reports. Combined with the exported `setLogEnabled(true)` above, another app can
switch this on. **(static only.)**

## Exported activity displays identifiers on screen

`TestActivity` (`sources/com/mobiletools/systemhelper/Activity/TestActivity.java`) is
**exported** and renders the device registration string — IMEI, IMSI, ICCID of both slots —
into a `TextView`. Any app or `adb` can launch
`com.mobiletools.systemhelper/.Activity.TestActivity`. **(Exported + launchable confirmed on device.)**

## Weak cryptography

From [Upload & encryption](04-Upload-and-Encryption.md):

- **AES in ECB mode** (`AES/ECB/PKCS5Padding`, `sources/g1/c.java`) — no IV; identical
  plaintext blocks produce identical ciphertext, leaking structure.
- **Key derived from the plaintext** — the AES key is `MD5(plaintext)` (`c.d()`), so the
  same record always encrypts to the same bytes; no randomness, no integrity/MAC.
- **1024-bit RSA** (`assets/pub.cer`) — below modern minimums (2048+).
- **Plain HTTP** on port 18080 — only the body is encrypted; URL, timing and size are open.

## Reversible "anonymization"

For non-Unicom SIMs, `TAC`/`CID` are SHA-256 hashed (`sources/g1/i.java`) rather than
removed. Cell `TAC`/`CID` draw from a small value space, so the hashes can be brute-forced
back to the originals. Truncating IMSI/ICCID to 10 chars still exposes the operator and
region prefix, and the **IMEI is sent in full** regardless. See
[Upload & encryption](04-Upload-and-Encryption.md#who-gets-masked).

## Uploads happen for non-customers

The China gate keys on MNC `460…` (any Chinese operator), not on a Unicom SIM, so a China
Mobile or China Telecom user's data is collected and uploaded to Unicom over Wi-Fi all the
same ([Upload & encryption](04-Upload-and-Encryption.md#when-it-uploads-and-when-it-queues)).

Next: [Baidu location SDK →](07-Baidu-Location-SDK.md)
