# SystemHelper wiki

A technical wiki for the decompiled **`com.mobiletools.systemhelper`** — China Unicom's
device-registration and network-telemetry client, preinstalled as a privileged system
app in Xiaomi HyperOS.

> All code citations point at **obfuscated** decompiler output in [`../sources/`](../sources/).
> Pages use recovered class names (e.g. `HttpHelper`) and always give the real file path
> (e.g. `sources/g1/f.java`) so you can follow along. See the
> [Class reference](08-Class-Reference.md) for the mapping.

## Pages

| # | Page | What it answers |
|---|---|---|
| 1 | [Overview](01-Overview.md) | What is this app, who made it, is it spyware? |
| 2 | [Architecture & components](02-Architecture.md) | How the pieces fit; triggers, schedulers, data stores |
| 3 | [What data is collected](03-Data-Collection.md) | Every field it gathers and where in the code |
| 4 | [Upload protocol & encryption](04-Upload-and-Encryption.md) | Where data goes, how it's encrypted, when it uploads |
| 5 | [Consent & activation](05-Consent-and-Activation.md) | What turns it on; why it runs without asking on Xiaomi |
| 6 | [Security weaknesses](06-Security-Weaknesses.md) | Exported components, weak crypto, reversible "anonymization" |
| 7 | [Baidu location SDK](07-Baidu-Location-SDK.md) | The third-party SDK inside and the servers it knows |
| 8 | [Class reference](08-Class-Reference.md) | Obfuscated → recovered names for every relevant class |
| 9 | [Limitations & unknowns](09-Limitations-and-Unknowns.md) | What this analysis did not and could not establish |

## The short version

1. **Always on after setup.** On Xiaomi phones the only gate is that initial setup has
   finished ([Consent](05-Consent-and-Activation.md)).
2. **Precise location every 30 minutes**, via an embedded Baidu SDK in high-accuracy mode
   ([Data collection](03-Data-Collection.md), [Baidu SDK](07-Baidu-Location-SDK.md)).
3. **Persistent identifiers** — IMEI, IMSI, ICCID for both SIM slots — sent with that
   location ([Data collection](03-Data-Collection.md)).
4. **Daily app-usage report** — every app used, minutes in foreground, launches, data used.
5. **Uploaded to China Unicom** at `http://dm.wo.com.cn:18080/register`, AES/RSA encrypted
   ([Upload & encryption](04-Upload-and-Encryption.md)).
6. **Not limited to Unicom customers** — it uploads for any Chinese SIM; only the masking
   differs ([Upload & encryption](04-Upload-and-Encryption.md#who-gets-masked)).
7. **Any app can reconfigure it** through an unprotected exported service, including
   redirecting its uploads ([Security weaknesses](06-Security-Weaknesses.md)).

## Evidence types used in this wiki

Each claim is one of:

- **Static** — read from the decompiled code or decoded manifest in this repo.
- **Runtime** — observed on the sampled device over `adb` (alarm schedule, permission use,
  network counters). These are marked *(observed on device)*.
- **Inference** — reasoned from static evidence but not directly observed. Marked as such.

Anything not established is listed in [Limitations & unknowns](09-Limitations-and-Unknowns.md).
