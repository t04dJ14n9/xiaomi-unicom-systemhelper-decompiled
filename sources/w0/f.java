package w0;

import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f4039h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SecureRandom f4042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MessageDigest f4044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MessageDigest f4045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f4046g;

    private f(int i2, int i3, SecureRandom secureRandom, OAEPParameterSpec oAEPParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        byte[] bArr;
        this.f4040a = i2;
        this.f4041b = i3;
        this.f4042c = secureRandom;
        if (i3 < 64) {
            throw new InvalidKeyException("Padded size must be at least 64");
        }
        if (i2 == 1 || i2 == 2) {
            i3 -= 11;
        } else if (i2 != 3) {
            if (i2 != 4) {
                throw new InvalidKeyException("Invalid padding: " + i2);
            }
            String str2 = "SHA-1";
            if (oAEPParameterSpec != null) {
                try {
                    String digestAlgorithm = oAEPParameterSpec.getDigestAlgorithm();
                    String mGFAlgorithm = oAEPParameterSpec.getMGFAlgorithm();
                    if (!mGFAlgorithm.equalsIgnoreCase("MGF1")) {
                        throw new InvalidAlgorithmParameterException("Unsupported MGF algo: " + mGFAlgorithm);
                    }
                    String digestAlgorithm2 = ((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm();
                    PSource pSource = oAEPParameterSpec.getPSource();
                    String algorithm = pSource.getAlgorithm();
                    if (!algorithm.equalsIgnoreCase("PSpecified")) {
                        throw new InvalidAlgorithmParameterException("Unsupported pSource algo: " + algorithm);
                    }
                    byte[] value = ((PSource.PSpecified) pSource).getValue();
                    str = digestAlgorithm;
                    str2 = digestAlgorithm2;
                    bArr = value;
                } catch (NoSuchAlgorithmException e2) {
                    e = e2;
                    throw new InvalidKeyException("Digest " + str2 + " not available", e);
                }
            } else {
                bArr = null;
                str = "SHA-1";
            }
            try {
                this.f4044e = MessageDigest.getInstance(str);
                this.f4045f = MessageDigest.getInstance(str2);
                byte[] bArrE = e(this.f4044e, bArr);
                this.f4046g = bArrE;
                int length = (i3 - 2) - (bArrE.length * 2);
                this.f4043d = length;
                if (length > 0) {
                    return;
                }
                throw new InvalidKeyException("Key is too short for encryption using OAEPPadding with " + str + " and MGF1" + str2);
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                str2 = str;
                throw new InvalidKeyException("Digest " + str2 + " not available", e);
            }
        }
        this.f4043d = i3;
    }

    public static f b(int i2, int i3, SecureRandom secureRandom) {
        return new f(i2, i3, secureRandom, null);
    }

    public static f c(int i2, int i3, SecureRandom secureRandom, OAEPParameterSpec oAEPParameterSpec) {
        return new f(i2, i3, secureRandom, oAEPParameterSpec);
    }

    private void d(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) throws BadPaddingException {
        byte[] bArr3 = new byte[4];
        byte[] bArr4 = new byte[20];
        while (i5 > 0) {
            this.f4045f.update(bArr, i2, i3);
            this.f4045f.update(bArr3);
            try {
                this.f4045f.digest(bArr4, 0, 20);
                for (int i6 = 0; i6 < 20 && i5 > 0; i6++) {
                    bArr2[i4] = (byte) (bArr4[i6] ^ bArr2[i4]);
                    i5--;
                    i4++;
                }
                if (i5 > 0) {
                    int i7 = 3;
                    while (true) {
                        byte b2 = (byte) (bArr3[i7] + 1);
                        bArr3[i7] = b2;
                        if (b2 != 0 || i7 <= 0) {
                            break;
                        } else {
                            i7--;
                        }
                    }
                }
            } catch (DigestException e2) {
                throw new BadPaddingException(e2.toString());
            }
        }
    }

    private static byte[] e(MessageDigest messageDigest, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return messageDigest.digest(bArr);
        }
        String algorithm = messageDigest.getAlgorithm();
        Map map = f4039h;
        byte[] bArr2 = (byte[]) map.get(algorithm);
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] bArrDigest = messageDigest.digest();
        map.put(algorithm, bArrDigest);
        return bArrDigest;
    }

    private byte[] i(byte[] bArr) {
        int i2;
        int i3;
        int i4 = this.f4041b;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, i4 - bArr.length, bArr.length);
        int length = (this.f4041b - 3) - bArr.length;
        bArr2[0] = 0;
        int i5 = this.f4040a;
        bArr2[1] = (byte) i5;
        int i6 = -1;
        int i7 = 2;
        if (i5 != 1) {
            if (this.f4042c == null) {
                this.f4042c = b.f4026a;
            }
            byte[] bArr3 = new byte[64];
            while (true) {
                int i8 = length - 1;
                if (length <= 0) {
                    break;
                }
                while (true) {
                    if (i6 < 0) {
                        this.f4042c.nextBytes(bArr3);
                        i6 = 63;
                    }
                    i2 = i6 - 1;
                    i3 = bArr3[i6] & 255;
                    if (i3 != 0) {
                        break;
                    }
                    i6 = i2;
                }
                bArr2[i7] = (byte) i3;
                i6 = i2;
                length = i8;
                i7++;
            }
        } else {
            while (true) {
                int i9 = length - 1;
                if (length <= 0) {
                    break;
                }
                bArr2[i7] = -1;
                length = i9;
                i7++;
            }
        }
        return bArr2;
    }

    private byte[] j(byte[] bArr) throws BadPaddingException {
        if (bArr[0] != 0) {
            throw new BadPaddingException("Data must start with zero");
        }
        if (bArr[1] != this.f4040a) {
            throw new BadPaddingException("Blocktype mismatch: " + ((int) bArr[1]));
        }
        int i2 = 2;
        while (true) {
            int i3 = i2 + 1;
            int i4 = bArr[i2] & 255;
            if (i4 == 0) {
                int length = bArr.length - i3;
                if (length > this.f4043d) {
                    throw new BadPaddingException("Padding string too short");
                }
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, bArr.length - length, bArr2, 0, length);
                return bArr2;
            }
            if (i3 == bArr.length) {
                throw new BadPaddingException("Padding string not terminated");
            }
            if (this.f4040a == 1 && i4 != 255) {
                throw new BadPaddingException("Padding byte not 0xff: " + i4);
            }
            i2 = i3;
        }
    }

    private byte[] k(byte[] bArr) throws BadPaddingException {
        if (this.f4042c == null) {
            this.f4042c = b.f4026a;
        }
        int length = this.f4046g.length;
        byte[] bArr2 = new byte[length];
        this.f4042c.nextBytes(bArr2);
        int i2 = this.f4041b;
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr2, 0, bArr3, 1, length);
        int i3 = length + 1;
        int i4 = i2 - i3;
        int length2 = this.f4041b - bArr.length;
        System.arraycopy(this.f4046g, 0, bArr3, i3, length);
        bArr3[length2 - 1] = 1;
        System.arraycopy(bArr, 0, bArr3, length2, bArr.length);
        d(bArr3, 1, length, bArr3, i3, i4);
        d(bArr3, i3, i4, bArr3, 1, length);
        return bArr3;
    }

    private byte[] l(byte[] bArr) throws BadPaddingException {
        int length = this.f4046g.length;
        if (bArr[0] != 0) {
            throw new BadPaddingException("Data must start with zero");
        }
        int i2 = length + 1;
        int length2 = bArr.length - i2;
        d(bArr, i2, length2, bArr, 1, length);
        d(bArr, 1, length, bArr, i2, length2);
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f4046g[i3] != bArr[i2 + i3]) {
                throw new BadPaddingException("lHash mismatch");
            }
        }
        int i4 = i2 + length;
        do {
            byte b2 = bArr[i4];
            if (b2 != 0) {
                int i5 = i4 + 1;
                if (b2 != 1) {
                    throw new BadPaddingException("Padding string not terminated by 0x01 byte");
                }
                int length3 = bArr.length - i5;
                byte[] bArr2 = new byte[length3];
                System.arraycopy(bArr, i5, bArr2, 0, length3);
                return bArr2;
            }
            i4++;
        } while (i4 < bArr.length);
        throw new BadPaddingException("Padding string not terminated");
    }

    public int a() {
        return this.f4043d;
    }

    public byte[] f(byte[] bArr) throws BadPaddingException {
        if (bArr.length > this.f4043d) {
            throw new BadPaddingException("Data must be shorter than " + (this.f4043d + 1) + " bytes");
        }
        int i2 = this.f4040a;
        if (i2 == 1 || i2 == 2) {
            return i(bArr);
        }
        if (i2 == 3) {
            return bArr;
        }
        if (i2 == 4) {
            return k(bArr);
        }
        throw new AssertionError();
    }

    public byte[] g(byte[] bArr, int i2, int i3) {
        return f(b.d(bArr, i2, i3));
    }

    public byte[] h(byte[] bArr) throws BadPaddingException {
        if (bArr.length != this.f4041b) {
            throw new BadPaddingException("Padded length must be " + this.f4041b);
        }
        int i2 = this.f4040a;
        if (i2 == 1 || i2 == 2) {
            return j(bArr);
        }
        if (i2 == 3) {
            return bArr;
        }
        if (i2 == 4) {
            return l(bArr);
        }
        throw new AssertionError();
    }
}
