# 9. Limitations & unknowns

[← Class reference](08-Class-Reference.md) · [Home](Home.md)

This wiki is built mostly from **static** reading of decompiled code, plus a few
**runtime** observations over `adb` on one device. Here is what that does and does not
establish.

## About the code itself

- **Obfuscated, not rewritten.** `sources/` is raw jadx output. Names are
  decompiler-generated; the recovered names in this wiki were not written back into the
  files ([Class reference](08-Class-Reference.md)).
- **Not original source.** Comments and local variable names are lost and control flow is
  restructured. It may not recompile.
- **13 methods did not decompile** and appear as instruction listings. One is in the module
  (`SIMStateReceiver.onReceive`); its listing is still readable and was used to describe the
  SIM-change trigger.
- **Recovered names can mislead.** They come from log tags; `f1/j.java` is the clearest
  case of a tag that doesn't match the class's role.

## Not analyzed

- **Native libraries** `liblocSDK8b.so` and `libindoor.so` (Baidu). No source exists; only
  disassembly could reveal what they do. Not done.
- **The Baidu SDK's internal behavior** beyond the endpoints listed in
  [Baidu SDK](07-Baidu-Location-SDK.md).

## Not observed at runtime

- **Actual network traffic.** No traffic was captured, so the real contents, frequency and
  destinations of uploads — to Unicom and to Baidu — are **inferred from code**, not seen.
  On the device, Android's per-app counters did show ~1 MB sent / ~2.8 MB received by this
  app *(observed on device)*, consistent with the code but not itemized.
- **The two weaknesses marked (static only)** in
  [Security weaknesses](06-Security-Weaknesses.md) — the exported binder methods and verbose
  logging — were read from code, not exercised.

## Needs root to confirm

- The module's **local databases** (signal and history) and its **SharedPreferences**
  (`serverAddress`, current intervals). Without root these can't be read, so we can't see
  what is queued right now or whether intervals differ from the defaults.

## Open questions

- **What set `operator_service_improve_plan = 1`** on the device? Xiaomi's code path doesn't
  check it, but it was already on.
- **Exact alarm cadence.** The 30-min snapshot matched what the device showed. The 12-h and
  24-h jobs fired at times that don't line up exactly with the defaults, which is consistent
  with the randomized first run (or changed prefs) but couldn't be confirmed without root.
- **Server-side handling** — what Unicom (or Baidu) does with the data, and how long it is
  kept, is outside what device analysis can show.

## Reproducing

The decompilation is reproducible from the APK hash in the [README](../README.md#provenance)
with jadx 1.5.6. Runtime observations used `adb shell dumpsys alarm`, `cmd appops get`,
`dumpsys netstats`, and `settings get` on the sampled device.
