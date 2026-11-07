package w0;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Locale;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f4027j = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4028a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f4030c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f4032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f4035h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OAEPParameterSpec f4031d = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f4036i = "SHA-1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4029b = "PKCS1Padding";

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    private void b(int i2, d dVar, SecureRandom secureRandom, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        boolean z2;
        OAEPParameterSpec oAEPParameterSpec;
        if (i2 == 1) {
            z2 = true;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    z2 = true;
                } else if (i2 != 4) {
                    throw new InvalidKeyException("Unknown mode: " + i2);
                }
            }
            z2 = false;
        }
        if (!(dVar instanceof d)) {
            throw new InvalidKeyException("only support helios key");
        }
        this.f4028a = z2 ? 1 : 4;
        this.f4035h = dVar;
        int iA = b.a(dVar.a());
        this.f4034g = iA;
        this.f4033f = 0;
        String str = this.f4029b;
        if (str == "NoPadding") {
            if (algorithmParameterSpec != null) {
                throw new InvalidAlgorithmParameterException("Parameters not supported");
            }
            this.f4030c = f.b(3, iA, secureRandom);
            this.f4032e = new byte[iA];
            return;
        }
        if (str == "PKCS1Padding") {
            if (algorithmParameterSpec != null) {
                throw new InvalidAlgorithmParameterException("Parameters not supported");
            }
            f fVarB = f.b(this.f4028a > 2 ? 1 : 2, iA, secureRandom);
            this.f4030c = fVarB;
            if (z2) {
                this.f4032e = new byte[fVarB.a()];
                return;
            } else {
                this.f4032e = new byte[iA];
                return;
            }
        }
        int i3 = this.f4028a;
        if (i3 == 3 || i3 == 4) {
            throw new InvalidKeyException("OAEP cannot be used to sign or verify signatures");
        }
        if (algorithmParameterSpec == null) {
            oAEPParameterSpec = new OAEPParameterSpec(this.f4036i, "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
        } else {
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Wrong Parameters for OAEP Padding");
            }
            oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
        }
        f fVarC = f.c(4, iA, secureRandom, oAEPParameterSpec);
        this.f4030c = fVarC;
        if (z2) {
            this.f4032e = new byte[fVarC.a()];
        } else {
            this.f4032e = new byte[iA];
        }
    }

    private byte[] d() throws IllegalBlockSizeException {
        int i2 = this.f4033f;
        byte[] bArr = this.f4032e;
        if (i2 > bArr.length) {
            throw new IllegalBlockSizeException("Data must not be longer than " + this.f4032e.length + " bytes");
        }
        try {
            int i3 = this.f4028a;
            if (i3 == 1) {
                byte[] bArrF = b.f(this.f4030c.g(bArr, 0, i2), this.f4035h);
                this.f4033f = 0;
                return bArrF;
            }
            if (i3 == 2) {
                throw new UnsupportedOperationException("only verify supported");
            }
            if (i3 == 3) {
                throw new UnsupportedOperationException("only verify supported");
            }
            if (i3 != 4) {
                throw new AssertionError("Internal error");
            }
            byte[] bArrH = this.f4030c.h(b.f(b.d(bArr, 0, i2), this.f4035h));
            this.f4033f = 0;
            return bArrH;
        } catch (Throwable th) {
            this.f4033f = 0;
            throw th;
        }
    }

    private void f(byte[] bArr, int i2, int i3) {
        int length;
        if (i3 == 0 || bArr == null) {
            return;
        }
        int i4 = this.f4033f;
        int i5 = i4 + i3;
        byte[] bArr2 = this.f4032e;
        if (i5 > bArr2.length) {
            length = bArr2.length + 1;
        } else {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            length = this.f4033f + i3;
        }
        this.f4033f = length;
    }

    public void a(int i2, d dVar, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            b(i2, dVar, secureRandom, null);
        } catch (InvalidAlgorithmParameterException e2) {
            InvalidKeyException invalidKeyException = new InvalidKeyException("Wrong parameters");
            invalidKeyException.initCause(e2);
            throw invalidKeyException;
        }
    }

    public void c(String str) throws NoSuchPaddingException {
        String str2 = "NoPadding";
        if (!str.equalsIgnoreCase("NoPadding")) {
            str2 = "PKCS1Padding";
            if (!str.equalsIgnoreCase("PKCS1Padding")) {
                String lowerCase = str.toLowerCase(Locale.ENGLISH);
                if (lowerCase.equals("oaeppadding")) {
                    this.f4029b = "OAEP";
                    return;
                }
                if (!lowerCase.startsWith("oaepwith") || !lowerCase.endsWith("andmgf1padding")) {
                    throw new NoSuchPaddingException("Padding " + str + " not supported");
                }
                this.f4029b = "OAEP";
                this.f4036i = str.substring(8, str.length() - 14);
                throw new NoSuchPaddingException("MessageDigest not available for " + str);
            }
        }
        this.f4029b = str2;
    }

    public byte[] e(byte[] bArr, int i2, int i3) {
        f(bArr, i2, i3);
        return d();
    }
}
