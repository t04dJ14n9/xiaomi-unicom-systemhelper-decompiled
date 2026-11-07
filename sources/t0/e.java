package t0;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f3699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3701c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f3705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f3706h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3702d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3703e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3707i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f3708j = false;

    public e(b bVar, int i2) {
        this.f3699a = null;
        this.f3705g = null;
        this.f3706h = null;
        this.f3700b = i2;
        this.f3701c = i2;
        this.f3704f = i2;
        this.f3699a = new byte[i2 * 2];
        this.f3706h = new d(bVar);
        this.f3705g = new h(this.f3700b);
    }

    private int c(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) throws IllegalBlockSizeException {
        if (bArr == null || i4 == 0) {
            return 0;
        }
        int i5 = this.f3707i;
        if (i5 == 2 || i5 == 3 || i4 % this.f3701c == 0 || i5 == 6) {
            if (this.f3708j) {
                this.f3706h.h(bArr, i2, i4, bArr2, i3);
            } else {
                this.f3706h.g(bArr, i2, i4, bArr2, i3);
            }
            return i4;
        }
        if (this.f3705g != null) {
            throw new IllegalBlockSizeException("Input length (with padding) not multiple of " + this.f3701c + " bytes");
        }
        throw new IllegalBlockSizeException("Input length not multiple of " + this.f3701c + " bytes");
    }

    int a(int i2) {
        int i3 = this.f3702d + i2;
        i iVar = this.f3705g;
        if (iVar == null || this.f3708j) {
            return i3;
        }
        int i4 = this.f3701c;
        int i5 = this.f3700b;
        if (i4 == i5) {
            return i3 + iVar.c(i3);
        }
        int i6 = this.f3704f;
        return i3 < i6 ? i6 : (i3 + i5) - ((i3 - i6) % i5);
    }

    int b(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int iC;
        byte[] bArr3;
        int i5;
        i iVar;
        int iC2;
        int i6 = this.f3702d + i3;
        int i7 = this.f3701c;
        int i8 = this.f3700b;
        if (i7 != i8) {
            int i9 = this.f3704f;
            iC = i6 < i9 ? i9 - i6 : i8 - ((i6 - i9) % i8);
        } else {
            i iVar2 = this.f3705g;
            iC = iVar2 != null ? iVar2.c(i6) : 0;
        }
        if (iC > 0 && iC != this.f3700b && this.f3705g != null && this.f3708j) {
            throw new IllegalBlockSizeException("Input length must be multiple of " + this.f3700b + " when decrypting with padded cipher");
        }
        boolean z2 = this.f3708j;
        int i10 = (z2 || this.f3705g == null) ? i6 : i6 + iC;
        if (bArr2 == null) {
            throw new ShortBufferException("Output buffer is null");
        }
        int length = bArr2.length - i4;
        if (((!z2 || this.f3705g == null) && length < i10) || (z2 && length < i10 - this.f3700b)) {
            throw new ShortBufferException("Output buffer too short: " + length + " bytes given, " + i10 + " bytes needed");
        }
        int i11 = this.f3702d;
        if (i11 == 0 && (z2 || this.f3705g == null)) {
            bArr3 = bArr;
            i5 = i2;
        } else {
            byte[] bArr4 = new byte[i10];
            if (i11 != 0) {
                System.arraycopy(this.f3699a, 0, bArr4, 0, i11);
            }
            if (i3 != 0) {
                System.arraycopy(bArr, i2, bArr4, this.f3702d, i3);
            }
            if (!this.f3708j && (iVar = this.f3705g) != null) {
                iVar.b(bArr4, i6, iC);
            }
            bArr3 = bArr4;
            i5 = 0;
        }
        if (this.f3708j) {
            if (length < i10) {
                this.f3706h.d();
            }
            byte[] bArr5 = new byte[i6];
            iC2 = c(bArr3, i5, bArr5, 0, i6);
            i iVar3 = this.f3705g;
            if (iVar3 != null && (iC2 = iVar3.a(bArr5, 0, iC2)) < 0) {
                throw new BadPaddingException("Given final block not properly padded");
            }
            if (bArr2.length - i4 < iC2) {
                this.f3706h.f();
                throw new ShortBufferException("Output buffer too short: " + (bArr2.length - i4) + " bytes given, " + iC2 + " bytes needed");
            }
            for (int i12 = 0; i12 < iC2; i12++) {
                bArr2[i4 + i12] = bArr5[i12];
            }
        } else {
            iC2 = c(bArr3, i5, bArr2, i4, i10);
        }
        this.f3702d = 0;
        this.f3704f = this.f3700b;
        if (this.f3707i != 0) {
            this.f3706h.a();
        }
        return iC2;
    }

    public void d(int i2, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        boolean z2 = i2 == 2 || i2 == 4;
        this.f3708j = z2;
        if (this.f3707i == 0) {
            if (bArr2 != null) {
                throw new InvalidAlgorithmParameterException("ECB mode cannot use IV");
            }
        } else if (bArr2 == null) {
            if (z2) {
                throw new InvalidAlgorithmParameterException("Parameters missing");
            }
            if (secureRandom == null) {
                secureRandom = c.f3694b;
            }
            bArr2 = new byte[this.f3700b];
            secureRandom.nextBytes(bArr2);
        }
        this.f3702d = 0;
        this.f3704f = this.f3700b;
        this.f3706h.b(this.f3708j, "", bArr, bArr2);
    }

    public byte[] e(byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        try {
            int iA = a(i3);
            byte[] bArr2 = new byte[iA];
            int iB = b(bArr, i2, i3, bArr2, 0);
            if (iB >= iA) {
                return bArr2;
            }
            byte[] bArr3 = new byte[iB];
            if (iB != 0) {
                try {
                    System.arraycopy(bArr2, 0, bArr3, 0, iB);
                } catch (ShortBufferException unused) {
                }
            }
            return bArr3;
        } catch (ShortBufferException unused2) {
            return null;
        }
    }
}
