# 4. Upload protocol & encryption

Language: **English** · [中文](zh-CN/04-Upload-and-Encryption.md)

[← Data collection](03-Data-Collection.md) · Next: [Consent & activation →](05-Consent-and-Activation.md)

## Endpoint

```
http://dm.wo.com.cn:18080/register
```

Defined in `GlobalSetting` (`sources/g1/d.java:44`) as the default; the effective address is
read via `RegisterUtils.k()` (`sources/g1/l.java`), which returns the `serverAddress`
SharedPreference if set, else the default. Plain **HTTP** on port 18080;
`usesCleartextTraffic="true"` in the manifest permits it. `wo.com.cn` is China Unicom's
domain.

## Transport

`HttpHelper.b(...)` (`sources/g1/f.java`) does a `POST` with
`Content-Type: application/encrypted-json`, writes the encrypted bytes as the body, and
treats HTTP 200 (or 416) as success. It handles both `http://` and `https://`.

## Payload construction

Built in `RegisterThread.a()` (`sources/e1/g.java`) and the parallel `HistoryPostThread`
(`sources/e1/e.java`). For a registration whose JSON string is `strB`:

```java
// sources/e1/g.java (decompiled, obfuscated names)
byte[] bArrD = g1.c.d(strB);                                   // (1) AES key
String strEncode = URLEncoder.encode(g1.c.b(g1.c.c(ctx, bArrD)), "utf-8"); // (2) RSA-wrap + base64
String str = l.k(ctx) + "?ver=5.0&model=" + ... + "&manuf=" + ... + "&sign=" + strEncode; // (3) URL
byte[] bArrA = g1.c.a(strB, bArrD);                            // (4) AES-encrypt body
new g1.f().b(str, bArrA, bArrD);                               // (5) POST
```

Step by step, from the crypto helper (`sources/g1/c.java`):

1. **AES key = `MD5(plaintext)`** — `c.d()` returns the MD5 digest of the JSON itself and
   uses it as the AES key.
2. **Key wrapping** — `c.c()` RSA-encrypts that key with the public key from
   `assets/pub.cer`, base64-encoded into the `sign` URL parameter.
3. **URL** — appends `ver`, `model`, `manuf` (plaintext) and `sign`.
4. **Body = `AES(plaintext)`** — `c.a()` uses **`AES/ECB/PKCS5Padding`**.
5. **POST** the AES body; the server recovers the AES key by RSA-decrypting `sign`.

### The Unicom certificate

`assets/pub.cer` (in `resources/assets/pub.cer`):

| Field | Value |
|---|---|
| Subject / Issuer | `C=CN, ST=BJ, L=BJ, O=UNICOM, OU=UNICOM, CN=UNICOM` (self-signed) |
| Key | **RSA 1024-bit** |
| Validity | 2019-05-24 … 2119-04-30 |

RSA wrapping uses **`RSA/ECB/PKCS1Padding`** in `RSAHelper` (`sources/g1/j.java`).

### What's exposed on the wire

The body is encrypted, so a network observer can't read identifiers or location. But the
**URL query is plaintext**: your phone **model** and **manufacturer** travel in the clear,
along with upload timing and size. See [Security weaknesses](06-Security-Weaknesses.md) for
why the encryption is weaker than it looks.

## When it uploads (and when it queues)

`RegisterThread.c()` (`sources/e1/g.java`) and the condition helpers in
`RegisterUtils` (`sources/g1/l.java`) decide:

- **China gate** — `RegisterUtils.s()`: upload only if the SIM MNC starts with **`460`**
  (any Chinese operator). Otherwise nothing is sent.
- **Network rule**:
  - On **Wi-Fi** (`w()`), upload for any Chinese SIM.
  - On **mobile data**, upload only on a **Unicom** SIM (`u()`: MNC `46001/46006/46009/46010`).
  - If neither holds, the record is **saved to the history DB** and sent later.

So on the sampled phone (China Mobile SIM), snapshots and registrations **do upload over
Wi-Fi** — carrier ownership of the SIM is not required.

## Who gets masked

`DeviceManager` (`sources/f1/o.java`) "anonymizes" subscriber IDs before upload, but
`RegisterUtils.v()` (`sources/g1/l.java`) **exempts Unicom SIMs** (`46001/46006/46009/46010`)
from masking entirely. For everyone else (e.g. China Mobile):

- `IMSI`/`ICCID` are **truncated to 10 characters** then padded with `*`.
- `TAC`/`CID` are **SHA-256 hashed** (`Sha256Utils`, `sources/g1/i.java`).
- **`IMEI` is never masked**, and neither are coordinates or `BSSID`.

Because cell `TAC`/`CID` have low entropy, their SHA-256 hashes are reversible by brute
force — see [Security weaknesses](06-Security-Weaknesses.md#reversible-anonymization).

## regType values

`DeviceManager` (`sources/f1/o.java`) dispatches by a one-letter type: `A` (app-usage),
`R` (registration + attached signal array), `B`/`F`/`S` (registration variants), `T` (SIM
changed). When the "user permission" flag is off, it falls back to a path that does not
send app-usage data.

Next: [Consent & activation →](05-Consent-and-Activation.md)
