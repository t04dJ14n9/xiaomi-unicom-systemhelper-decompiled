package t0;

import java.lang.reflect.Array;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int[] f3672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int[] f3673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f3674i = new byte[256];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f3675j = new byte[256];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f3676k = new int[256];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f3677l = new int[256];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f3678m = new int[256];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f3679n = new int[256];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f3680o = new int[256];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f3681p = new int[256];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f3682q = new int[256];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f3683r = new int[256];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f3684s = new int[256];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f3685t = new int[256];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f3686u = new int[256];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int[] f3687v = new int[256];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f3688w = new byte[30];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3689b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3690c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f3691d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f3692e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3693f = 0;

    static {
        int[] iArr = new int[256];
        f3672g = iArr;
        f3673h = new int[256];
        iArr[0] = 1;
        for (int i2 = 1; i2 < 256; i2++) {
            int[] iArr2 = f3672g;
            int i3 = iArr2[i2 - 1];
            int i4 = i3 ^ (i3 << 1);
            if ((i4 & 256) != 0) {
                i4 ^= 283;
            }
            iArr2[i2] = i4;
        }
        for (int i5 = 1; i5 < 255; i5++) {
            f3673h[f3672g[i5]] = i5;
        }
        byte[][] bArr = {new byte[]{1, 1, 1, 1, 1, 0, 0, 0}, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, new byte[]{0, 0, 1, 1, 1, 1, 1, 0}, new byte[]{0, 0, 0, 1, 1, 1, 1, 1}, new byte[]{1, 0, 0, 0, 1, 1, 1, 1}, new byte[]{1, 1, 0, 0, 0, 1, 1, 1}, new byte[]{1, 1, 1, 0, 0, 0, 1, 1}, new byte[]{1, 1, 1, 1, 0, 0, 0, 1}};
        byte[] bArr2 = {0, 1, 1, 0, 0, 0, 1, 1};
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 8);
        bArr3[1][7] = 1;
        for (int i6 = 2; i6 < 256; i6++) {
            int i7 = f3672g[255 - f3673h[i6]];
            for (int i8 = 0; i8 < 8; i8++) {
                bArr3[i6][i8] = (byte) ((i7 >>> (7 - i8)) & 1);
            }
        }
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 8);
        for (int i9 = 0; i9 < 256; i9++) {
            for (int i10 = 0; i10 < 8; i10++) {
                bArr4[i9][i10] = bArr2[i10];
                for (int i11 = 0; i11 < 8; i11++) {
                    byte[] bArr5 = bArr4[i9];
                    bArr5[i10] = (byte) (bArr5[i10] ^ (bArr[i10][i11] * bArr3[i9][i11]));
                }
            }
        }
        for (int i12 = 0; i12 < 256; i12++) {
            f3674i[i12] = (byte) (bArr4[i12][0] << 7);
            for (int i13 = 1; i13 < 8; i13++) {
                byte[] bArr6 = f3674i;
                bArr6[i12] = (byte) (bArr6[i12] ^ (bArr4[i12][i13] << (7 - i13)));
            }
            f3675j[f3674i[i12] & 255] = (byte) i12;
        }
        byte[][] bArr7 = {new byte[]{2, 1, 1, 3}, new byte[]{3, 2, 1, 1}, new byte[]{1, 3, 2, 1}, new byte[]{1, 1, 3, 2}};
        byte[][] bArr8 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 8);
        for (int i14 = 0; i14 < 4; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                bArr8[i14][i15] = bArr7[i14][i15];
            }
            bArr8[i14][i14 + 4] = 1;
        }
        byte[][] bArr9 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 4);
        for (int i16 = 0; i16 < 4; i16++) {
            byte b2 = bArr8[i16][i16];
            if (b2 == 0) {
                int i17 = i16 + 1;
                while (bArr8[i17][i16] == 0 && i17 < 4) {
                    i17++;
                }
                if (i17 == 4) {
                    throw new RuntimeException("G matrix is not invertible");
                }
                for (int i18 = 0; i18 < 8; i18++) {
                    byte[] bArr10 = bArr8[i16];
                    byte b3 = bArr10[i18];
                    byte[] bArr11 = bArr8[i17];
                    bArr10[i18] = bArr11[i18];
                    bArr11[i18] = b3;
                }
                b2 = bArr8[i16][i16];
            }
            for (int i19 = 0; i19 < 8; i19++) {
                byte[] bArr12 = bArr8[i16];
                byte b4 = bArr12[i19];
                if (b4 != 0) {
                    int[] iArr3 = f3672g;
                    int[] iArr4 = f3673h;
                    bArr12[i19] = (byte) iArr3[((iArr4[b4 & 255] + 255) - iArr4[b2 & 255]) % 255];
                }
            }
            for (int i20 = 0; i20 < 4; i20++) {
                if (i16 != i20) {
                    for (int i21 = i16 + 1; i21 < 8; i21++) {
                        byte[] bArr13 = bArr8[i20];
                        bArr13[i21] = (byte) (bArr13[i21] ^ b(bArr8[i16][i21], bArr13[i16]));
                    }
                    bArr8[i20][i16] = 0;
                }
            }
        }
        for (int i22 = 0; i22 < 4; i22++) {
            for (int i23 = 0; i23 < 4; i23++) {
                bArr9[i22][i23] = bArr8[i22][i23 + 4];
            }
        }
        for (int i24 = 0; i24 < 256; i24++) {
            byte b5 = f3674i[i24];
            f3676k[i24] = c(b5, bArr7[0]);
            f3677l[i24] = c(b5, bArr7[1]);
            f3678m[i24] = c(b5, bArr7[2]);
            f3679n[i24] = c(b5, bArr7[3]);
            byte b6 = f3675j[i24];
            f3680o[i24] = c(b6, bArr9[0]);
            f3681p[i24] = c(b6, bArr9[1]);
            f3682q[i24] = c(b6, bArr9[2]);
            f3683r[i24] = c(b6, bArr9[3]);
            f3684s[i24] = c(i24, bArr9[0]);
            f3685t[i24] = c(i24, bArr9[1]);
            f3686u[i24] = c(i24, bArr9[2]);
            f3687v[i24] = c(i24, bArr9[3]);
        }
        f3688w[0] = 1;
        int iB = 1;
        for (int i25 = 1; i25 < 30; i25++) {
            iB = b(2, iB);
            f3688w[i25] = (byte) iB;
        }
        f3673h = null;
        f3672g = null;
    }

    private static final int b(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = f3672g;
        int[] iArr2 = f3673h;
        return iArr[(iArr2[i2 & 255] + iArr2[i3 & 255]) % 255];
    }

    private static final int c(int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        int[] iArr = f3673h;
        int i3 = iArr[i2 & 255];
        byte b2 = bArr[0];
        int i4 = b2 != 0 ? f3672g[(iArr[b2 & 255] + i3) % 255] & 255 : 0;
        byte b3 = bArr[1];
        int i5 = b3 != 0 ? f3672g[(iArr[b3 & 255] + i3) % 255] & 255 : 0;
        byte b4 = bArr[2];
        int i6 = b4 != 0 ? f3672g[(iArr[b4 & 255] + i3) % 255] & 255 : 0;
        byte b5 = bArr[3];
        return (i4 << 24) | (i5 << 16) | (i6 << 8) | (b5 != 0 ? f3672g[(i3 + iArr[b5 & 255]) % 255] & 255 : 0);
    }

    private void d(boolean z2) {
        int[][] iArr = (int[][]) this.f3691d[z2 ? 1 : 0];
        int length = iArr.length;
        this.f3692e = new int[length * 4];
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                this.f3692e[(i2 * 4) + i3] = iArr[i2][i3];
            }
        }
        if (z2) {
            int[] iArr2 = this.f3692e;
            int i4 = iArr2[iArr2.length - 4];
            int i5 = iArr2[iArr2.length - 3];
            int i6 = iArr2[iArr2.length - 2];
            int i7 = iArr2[iArr2.length - 1];
            for (int length2 = iArr2.length - 1; length2 > 3; length2--) {
                int[] iArr3 = this.f3692e;
                iArr3[length2] = iArr3[length2 - 4];
            }
            int[] iArr4 = this.f3692e;
            iArr4[0] = i4;
            iArr4[1] = i5;
            iArr4[2] = i6;
            iArr4[3] = i7;
        }
        this.f3689b = length >= 13;
        this.f3690c = length == 15;
        this.f3693f = (length - 1) * 4;
    }

    static final boolean g(int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = a.f3671a;
            if (i3 >= iArr.length) {
                return false;
            }
            if (i2 == iArr[i3]) {
                return true;
            }
            i3++;
        }
    }

    private static Object[] h(byte[] bArr) throws InvalidKeyException {
        int i2;
        if (bArr == null) {
            throw new InvalidKeyException("Empty key");
        }
        if (!g(bArr.length)) {
            throw new InvalidKeyException("Invalid AES key length: " + bArr.length + " bytes");
        }
        int i3 = i(bArr.length);
        int i4 = i3 + 1;
        int i5 = i4 * 4;
        int i6 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, i4, 4);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, i4, 4);
        int length = bArr.length / 4;
        int[] iArr3 = new int[length];
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            iArr3[i7] = ((bArr[i8 + 2] & 255) << 8) | (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | (bArr[i8 + 3] & 255);
            i7++;
            i8 += 4;
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < length && i10 < i5) {
            int i11 = i10 / 4;
            int i12 = i10 % 4;
            iArr[i11][i12] = iArr3[i9];
            iArr2[i3 - i11][i12] = iArr3[i9];
            i9++;
            i10++;
        }
        int i13 = 0;
        while (i10 < i5) {
            int i14 = iArr3[length - 1];
            int i15 = iArr3[i6];
            byte[] bArr2 = f3674i;
            int i16 = (((bArr2[(i14 >>> 16) & 255] << 24) ^ ((bArr2[(i14 >>> 8) & 255] & 255) << 16)) ^ ((bArr2[i14 & 255] & 255) << 8)) ^ (bArr2[i14 >>> 24] & 255);
            int i17 = i13 + 1;
            iArr3[i6] = ((f3688w[i13] << 24) ^ i16) ^ i15;
            int i18 = 1;
            int i19 = i6;
            if (length != 8) {
                while (i18 < length) {
                    iArr3[i18] = iArr3[i18] ^ iArr3[i19];
                    i18++;
                    i19++;
                }
            } else {
                while (true) {
                    i2 = length / 2;
                    if (i18 >= i2) {
                        break;
                    }
                    iArr3[i18] = iArr3[i18] ^ iArr3[i19];
                    i18++;
                    i19++;
                }
                int i20 = iArr3[i2 - 1];
                int i21 = iArr3[i2];
                byte[] bArr3 = f3674i;
                iArr3[i2] = ((bArr3[i20 >>> 24] << 24) ^ ((((bArr3[(i20 >>> 8) & 255] & 255) << 8) ^ (bArr3[i20 & 255] & 255)) ^ ((bArr3[(i20 >>> 16) & 255] & 255) << 16))) ^ i21;
                int i22 = i2 + 1;
                while (i22 < length) {
                    iArr3[i22] = iArr3[i22] ^ iArr3[i2];
                    i22++;
                    i2++;
                }
            }
            int i23 = 0;
            while (i23 < length && i10 < i5) {
                int i24 = i10 / 4;
                int i25 = i10 % 4;
                iArr[i24][i25] = iArr3[i23];
                iArr2[i3 - i24][i25] = iArr3[i23];
                i23++;
                i10++;
            }
            i13 = i17;
            i6 = 0;
        }
        for (int i26 = 1; i26 < i3; i26++) {
            for (int i27 = 0; i27 < 4; i27++) {
                int[] iArr4 = iArr2[i26];
                int i28 = iArr4[i27];
                iArr4[i27] = f3687v[i28 & 255] ^ ((f3684s[(i28 >>> 24) & 255] ^ f3685t[(i28 >>> 16) & 255]) ^ f3686u[(i28 >>> 8) & 255]);
            }
        }
        return new Object[]{iArr, iArr2};
    }

    private static int i(int i2) {
        return (i2 >> 2) + 6;
    }

    int a() {
        return 16;
    }

    void e(boolean z2, String str, byte[] bArr) throws InvalidKeyException {
        if (g(bArr.length)) {
            this.f3691d = h(bArr);
            d(z2);
        } else {
            throw new InvalidKeyException("Invalid AES key length: " + bArr.length + " bytes");
        }
    }

    void f(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i4] & 255) << 16) | (bArr[i2] << 24);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        int[] iArr = this.f3692e;
        int i11 = i10 ^ iArr[0];
        int i12 = i9 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i9] << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = (i16 | (bArr[i15] & 255)) ^ iArr[1];
        int i19 = i17 + 1;
        int i20 = i19 + 1;
        int i21 = ((bArr[i19] & 255) << 16) | (bArr[i17] << 24);
        int i22 = i20 + 1;
        int i23 = i21 | ((bArr[i20] & 255) << 8);
        int i24 = i22 + 1;
        int i25 = (i23 | (bArr[i22] & 255)) ^ iArr[2];
        int i26 = i24 + 1;
        int i27 = i26 + 1;
        int i28 = iArr[3] ^ (((((bArr[i26] & 255) << 16) | (bArr[i24] << 24)) | ((bArr[i27] & 255) << 8)) | (bArr[i27 + 1] & 255));
        int i29 = 4;
        while (i29 < this.f3693f) {
            int[] iArr2 = f3676k;
            int i30 = iArr2[i11 >>> 24];
            int[] iArr3 = f3677l;
            int i31 = i30 ^ iArr3[(i18 >>> 16) & 255];
            int[] iArr4 = f3678m;
            int i32 = i31 ^ iArr4[(i25 >>> 8) & 255];
            int[] iArr5 = f3679n;
            int i33 = i32 ^ iArr5[i28 & 255];
            int[] iArr6 = this.f3692e;
            int i34 = i29 + 1;
            int i35 = iArr6[i29] ^ i33;
            int i36 = i34 + 1;
            int i37 = (((iArr2[i18 >>> 24] ^ iArr3[(i25 >>> 16) & 255]) ^ iArr4[(i28 >>> 8) & 255]) ^ iArr5[i11 & 255]) ^ iArr6[i34];
            int i38 = i36 + 1;
            int i39 = (((iArr2[i25 >>> 24] ^ iArr3[(i28 >>> 16) & 255]) ^ iArr4[(i11 >>> 8) & 255]) ^ iArr5[i18 & 255]) ^ iArr6[i36];
            int i40 = (((iArr3[(i11 >>> 16) & 255] ^ iArr2[i28 >>> 24]) ^ iArr4[(i18 >>> 8) & 255]) ^ iArr5[i25 & 255]) ^ iArr6[i38];
            i18 = i37;
            i25 = i39;
            i28 = i40;
            i11 = i35;
            i29 = i38 + 1;
        }
        int[] iArr7 = this.f3692e;
        int i41 = i29 + 1;
        int i42 = iArr7[i29];
        int i43 = i3 + 1;
        byte[] bArr3 = f3674i;
        bArr2[i3] = (byte) (bArr3[i11 >>> 24] ^ (i42 >>> 24));
        int i44 = i43 + 1;
        bArr2[i43] = (byte) (bArr3[(i18 >>> 16) & 255] ^ (i42 >>> 16));
        int i45 = i44 + 1;
        bArr2[i44] = (byte) (bArr3[(i25 >>> 8) & 255] ^ (i42 >>> 8));
        int i46 = i45 + 1;
        bArr2[i45] = (byte) (i42 ^ bArr3[i28 & 255]);
        int i47 = i41 + 1;
        int i48 = iArr7[i41];
        int i49 = i46 + 1;
        bArr2[i46] = (byte) (bArr3[i18 >>> 24] ^ (i48 >>> 24));
        int i50 = i49 + 1;
        bArr2[i49] = (byte) (bArr3[(i25 >>> 16) & 255] ^ (i48 >>> 16));
        int i51 = i50 + 1;
        bArr2[i50] = (byte) (bArr3[(i28 >>> 8) & 255] ^ (i48 >>> 8));
        int i52 = i51 + 1;
        bArr2[i51] = (byte) (i48 ^ bArr3[i11 & 255]);
        int i53 = i47 + 1;
        int i54 = iArr7[i47];
        int i55 = i52 + 1;
        bArr2[i52] = (byte) (bArr3[i25 >>> 24] ^ (i54 >>> 24));
        int i56 = i55 + 1;
        bArr2[i55] = (byte) (bArr3[(i28 >>> 16) & 255] ^ (i54 >>> 16));
        int i57 = i56 + 1;
        bArr2[i56] = (byte) (bArr3[(i11 >>> 8) & 255] ^ (i54 >>> 8));
        int i58 = i57 + 1;
        bArr2[i57] = (byte) (i54 ^ bArr3[i18 & 255]);
        int i59 = iArr7[i53];
        int i60 = i58 + 1;
        bArr2[i58] = (byte) (bArr3[i28 >>> 24] ^ (i59 >>> 24));
        int i61 = i60 + 1;
        bArr2[i60] = (byte) (bArr3[(i11 >>> 16) & 255] ^ (i59 >>> 16));
        bArr2[i61] = (byte) (bArr3[(i18 >>> 8) & 255] ^ (i59 >>> 8));
        bArr2[i61 + 1] = (byte) (i59 ^ bArr3[i25 & 255]);
    }

    void j(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5 = i2 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = ((bArr[i5] & 255) << 16) | (bArr[i2] << 24) | ((bArr[i6] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        int[] iArr = this.f3692e;
        int i11 = i10 ^ iArr[4];
        int i12 = i9 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i9] << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = (i16 | (bArr[i15] & 255)) ^ iArr[5];
        int i19 = i17 + 1;
        int i20 = i19 + 1;
        int i21 = ((bArr[i19] & 255) << 16) | (bArr[i17] << 24);
        int i22 = i20 + 1;
        int i23 = i21 | ((bArr[i20] & 255) << 8);
        int i24 = i22 + 1;
        int i25 = (i23 | (bArr[i22] & 255)) ^ iArr[6];
        int i26 = i24 + 1;
        int i27 = i26 + 1;
        int i28 = (((((bArr[i26] & 255) << 16) | (bArr[i24] << 24)) | ((bArr[i27] & 255) << 8)) | (bArr[i27 + 1] & 255)) ^ iArr[7];
        if (this.f3689b) {
            int[] iArr2 = f3680o;
            int i29 = iArr2[i11 >>> 24];
            int[] iArr3 = f3681p;
            int i30 = i29 ^ iArr3[(i28 >>> 16) & 255];
            int[] iArr4 = f3682q;
            int i31 = i30 ^ iArr4[(i25 >>> 8) & 255];
            int[] iArr5 = f3683r;
            int i32 = (i31 ^ iArr5[i18 & 255]) ^ iArr[8];
            int i33 = (((iArr2[i18 >>> 24] ^ iArr3[(i11 >>> 16) & 255]) ^ iArr4[(i28 >>> 8) & 255]) ^ iArr5[i25 & 255]) ^ iArr[9];
            int i34 = (((iArr3[(i18 >>> 16) & 255] ^ iArr2[i25 >>> 24]) ^ iArr4[(i11 >>> 8) & 255]) ^ iArr5[i28 & 255]) ^ iArr[10];
            int i35 = (iArr5[i11 & 255] ^ (iArr4[(i18 >>> 8) & 255] ^ (iArr3[(i25 >>> 16) & 255] ^ iArr2[i28 >>> 24]))) ^ iArr[11];
            int i36 = (((iArr2[i32 >>> 24] ^ iArr3[(i35 >>> 16) & 255]) ^ iArr4[(i34 >>> 8) & 255]) ^ iArr5[i33 & 255]) ^ iArr[12];
            int i37 = (((iArr2[i33 >>> 24] ^ iArr3[(i32 >>> 16) & 255]) ^ iArr4[(i35 >>> 8) & 255]) ^ iArr5[i34 & 255]) ^ iArr[13];
            int i38 = (((iArr2[i34 >>> 24] ^ iArr3[(i33 >>> 16) & 255]) ^ iArr4[(i32 >>> 8) & 255]) ^ iArr5[i35 & 255]) ^ iArr[14];
            int i39 = (((iArr2[i35 >>> 24] ^ iArr3[(i34 >>> 16) & 255]) ^ iArr4[(i33 >>> 8) & 255]) ^ iArr5[i32 & 255]) ^ iArr[15];
            if (this.f3690c) {
                int i40 = (((iArr2[i36 >>> 24] ^ iArr3[(i39 >>> 16) & 255]) ^ iArr4[(i38 >>> 8) & 255]) ^ iArr5[i37 & 255]) ^ iArr[16];
                int i41 = (((iArr2[i37 >>> 24] ^ iArr3[(i36 >>> 16) & 255]) ^ iArr4[(i39 >>> 8) & 255]) ^ iArr5[i38 & 255]) ^ iArr[17];
                int i42 = (((iArr2[i38 >>> 24] ^ iArr3[(i37 >>> 16) & 255]) ^ iArr4[(i36 >>> 8) & 255]) ^ iArr5[i39 & 255]) ^ iArr[18];
                int i43 = (((iArr2[i39 >>> 24] ^ iArr3[(i38 >>> 16) & 255]) ^ iArr4[(i37 >>> 8) & 255]) ^ iArr5[i36 & 255]) ^ iArr[19];
                int i44 = (((iArr2[i40 >>> 24] ^ iArr3[(i43 >>> 16) & 255]) ^ iArr4[(i42 >>> 8) & 255]) ^ iArr5[i41 & 255]) ^ iArr[20];
                int i45 = (((iArr2[i41 >>> 24] ^ iArr3[(i40 >>> 16) & 255]) ^ iArr4[(i43 >>> 8) & 255]) ^ iArr5[i42 & 255]) ^ iArr[21];
                int i46 = (((iArr2[i42 >>> 24] ^ iArr3[(i41 >>> 16) & 255]) ^ iArr4[(i40 >>> 8) & 255]) ^ iArr5[i43 & 255]) ^ iArr[22];
                int i47 = (iArr5[i40 & 255] ^ ((iArr2[i43 >>> 24] ^ iArr3[(i42 >>> 16) & 255]) ^ iArr4[(i41 >>> 8) & 255])) ^ iArr[23];
                i11 = i44;
                i18 = i45;
                i25 = i46;
                i28 = i47;
                i4 = 24;
            } else {
                i4 = 16;
                i28 = i39;
                i11 = i36;
                i18 = i37;
                i25 = i38;
            }
        } else {
            i4 = 8;
        }
        int[] iArr6 = f3680o;
        int i48 = iArr6[i11 >>> 24];
        int[] iArr7 = f3681p;
        int i49 = i48 ^ iArr7[(i28 >>> 16) & 255];
        int[] iArr8 = f3682q;
        int i50 = i49 ^ iArr8[(i25 >>> 8) & 255];
        int[] iArr9 = f3683r;
        int i51 = i4 + 1;
        int i52 = iArr[i4] ^ (i50 ^ iArr9[i18 & 255]);
        int i53 = i51 + 1;
        int i54 = (((iArr6[i18 >>> 24] ^ iArr7[(i11 >>> 16) & 255]) ^ iArr8[(i28 >>> 8) & 255]) ^ iArr9[i25 & 255]) ^ iArr[i51];
        int i55 = i53 + 1;
        int i56 = (((iArr6[i25 >>> 24] ^ iArr7[(i18 >>> 16) & 255]) ^ iArr8[(i11 >>> 8) & 255]) ^ iArr9[i28 & 255]) ^ iArr[i53];
        int i57 = iArr9[i11 & 255] ^ (iArr8[(i18 >>> 8) & 255] ^ (iArr7[(i25 >>> 16) & 255] ^ iArr6[i28 >>> 24]));
        int i58 = i55 + 1;
        int i59 = i57 ^ iArr[i55];
        int i60 = i58 + 1;
        int i61 = iArr[i58] ^ (((iArr6[i52 >>> 24] ^ iArr7[(i59 >>> 16) & 255]) ^ iArr8[(i56 >>> 8) & 255]) ^ iArr9[i54 & 255]);
        int i62 = i60 + 1;
        int i63 = (((iArr6[i54 >>> 24] ^ iArr7[(i52 >>> 16) & 255]) ^ iArr8[(i59 >>> 8) & 255]) ^ iArr9[i56 & 255]) ^ iArr[i60];
        int i64 = i62 + 1;
        int i65 = (((iArr6[i56 >>> 24] ^ iArr7[(i54 >>> 16) & 255]) ^ iArr8[(i52 >>> 8) & 255]) ^ iArr9[i59 & 255]) ^ iArr[i62];
        int i66 = iArr9[i52 & 255] ^ ((iArr6[i59 >>> 24] ^ iArr7[(i56 >>> 16) & 255]) ^ iArr8[(i54 >>> 8) & 255]);
        int i67 = i64 + 1;
        int i68 = i66 ^ iArr[i64];
        int i69 = i67 + 1;
        int i70 = iArr[i67] ^ (((iArr6[i61 >>> 24] ^ iArr7[(i68 >>> 16) & 255]) ^ iArr8[(i65 >>> 8) & 255]) ^ iArr9[i63 & 255]);
        int i71 = i69 + 1;
        int i72 = (((iArr6[i63 >>> 24] ^ iArr7[(i61 >>> 16) & 255]) ^ iArr8[(i68 >>> 8) & 255]) ^ iArr9[i65 & 255]) ^ iArr[i69];
        int i73 = i71 + 1;
        int i74 = (((iArr6[i65 >>> 24] ^ iArr7[(i63 >>> 16) & 255]) ^ iArr8[(i61 >>> 8) & 255]) ^ iArr9[i68 & 255]) ^ iArr[i71];
        int i75 = ((iArr6[i68 >>> 24] ^ iArr7[(i65 >>> 16) & 255]) ^ iArr8[(i63 >>> 8) & 255]) ^ iArr9[i61 & 255];
        int i76 = i73 + 1;
        int i77 = i75 ^ iArr[i73];
        int i78 = i76 + 1;
        int i79 = iArr[i76] ^ (((iArr6[i70 >>> 24] ^ iArr7[(i77 >>> 16) & 255]) ^ iArr8[(i74 >>> 8) & 255]) ^ iArr9[i72 & 255]);
        int i80 = i78 + 1;
        int i81 = (((iArr6[i72 >>> 24] ^ iArr7[(i70 >>> 16) & 255]) ^ iArr8[(i77 >>> 8) & 255]) ^ iArr9[i74 & 255]) ^ iArr[i78];
        int i82 = i80 + 1;
        int i83 = (((iArr6[i74 >>> 24] ^ iArr7[(i72 >>> 16) & 255]) ^ iArr8[(i70 >>> 8) & 255]) ^ iArr9[i77 & 255]) ^ iArr[i80];
        int i84 = ((iArr6[i77 >>> 24] ^ iArr7[(i74 >>> 16) & 255]) ^ iArr8[(i72 >>> 8) & 255]) ^ iArr9[i70 & 255];
        int i85 = i82 + 1;
        int i86 = i84 ^ iArr[i82];
        int i87 = i85 + 1;
        int i88 = iArr[i85] ^ (((iArr6[i79 >>> 24] ^ iArr7[(i86 >>> 16) & 255]) ^ iArr8[(i83 >>> 8) & 255]) ^ iArr9[i81 & 255]);
        int i89 = i87 + 1;
        int i90 = (((iArr6[i81 >>> 24] ^ iArr7[(i79 >>> 16) & 255]) ^ iArr8[(i86 >>> 8) & 255]) ^ iArr9[i83 & 255]) ^ iArr[i87];
        int i91 = i89 + 1;
        int i92 = (((iArr6[i83 >>> 24] ^ iArr7[(i81 >>> 16) & 255]) ^ iArr8[(i79 >>> 8) & 255]) ^ iArr9[i86 & 255]) ^ iArr[i89];
        int i93 = ((iArr6[i86 >>> 24] ^ iArr7[(i83 >>> 16) & 255]) ^ iArr8[(i81 >>> 8) & 255]) ^ iArr9[i79 & 255];
        int i94 = i91 + 1;
        int i95 = i93 ^ iArr[i91];
        int i96 = i94 + 1;
        int i97 = iArr[i94] ^ (((iArr6[i88 >>> 24] ^ iArr7[(i95 >>> 16) & 255]) ^ iArr8[(i92 >>> 8) & 255]) ^ iArr9[i90 & 255]);
        int i98 = i96 + 1;
        int i99 = (((iArr6[i90 >>> 24] ^ iArr7[(i88 >>> 16) & 255]) ^ iArr8[(i95 >>> 8) & 255]) ^ iArr9[i92 & 255]) ^ iArr[i96];
        int i100 = i98 + 1;
        int i101 = (((iArr6[i92 >>> 24] ^ iArr7[(i90 >>> 16) & 255]) ^ iArr8[(i88 >>> 8) & 255]) ^ iArr9[i95 & 255]) ^ iArr[i98];
        int i102 = ((iArr6[i95 >>> 24] ^ iArr7[(i92 >>> 16) & 255]) ^ iArr8[(i90 >>> 8) & 255]) ^ iArr9[i88 & 255];
        int i103 = i100 + 1;
        int i104 = i102 ^ iArr[i100];
        int i105 = i103 + 1;
        int i106 = iArr[i103] ^ (((iArr6[i97 >>> 24] ^ iArr7[(i104 >>> 16) & 255]) ^ iArr8[(i101 >>> 8) & 255]) ^ iArr9[i99 & 255]);
        int i107 = i105 + 1;
        int i108 = (((iArr6[i99 >>> 24] ^ iArr7[(i97 >>> 16) & 255]) ^ iArr8[(i104 >>> 8) & 255]) ^ iArr9[i101 & 255]) ^ iArr[i105];
        int i109 = i107 + 1;
        int i110 = (((iArr6[i101 >>> 24] ^ iArr7[(i99 >>> 16) & 255]) ^ iArr8[(i97 >>> 8) & 255]) ^ iArr9[i104 & 255]) ^ iArr[i107];
        int i111 = ((iArr6[i104 >>> 24] ^ iArr7[(i101 >>> 16) & 255]) ^ iArr8[(i99 >>> 8) & 255]) ^ iArr9[i97 & 255];
        int i112 = i109 + 1;
        int i113 = i111 ^ iArr[i109];
        int i114 = i112 + 1;
        int i115 = iArr[i112] ^ (((iArr6[i106 >>> 24] ^ iArr7[(i113 >>> 16) & 255]) ^ iArr8[(i110 >>> 8) & 255]) ^ iArr9[i108 & 255]);
        int i116 = i114 + 1;
        int i117 = (((iArr6[i108 >>> 24] ^ iArr7[(i106 >>> 16) & 255]) ^ iArr8[(i113 >>> 8) & 255]) ^ iArr9[i110 & 255]) ^ iArr[i114];
        int i118 = i116 + 1;
        int i119 = (((iArr6[i110 >>> 24] ^ iArr7[(i108 >>> 16) & 255]) ^ iArr8[(i106 >>> 8) & 255]) ^ iArr9[i113 & 255]) ^ iArr[i116];
        int i120 = ((iArr6[i113 >>> 24] ^ iArr7[(i110 >>> 16) & 255]) ^ iArr8[(i108 >>> 8) & 255]) ^ iArr9[i106 & 255];
        int i121 = i118 + 1;
        int i122 = i120 ^ iArr[i118];
        int i123 = i121 + 1;
        int i124 = iArr[i121] ^ (((iArr6[i115 >>> 24] ^ iArr7[(i122 >>> 16) & 255]) ^ iArr8[(i119 >>> 8) & 255]) ^ iArr9[i117 & 255]);
        int i125 = i123 + 1;
        int i126 = (((iArr6[i117 >>> 24] ^ iArr7[(i115 >>> 16) & 255]) ^ iArr8[(i122 >>> 8) & 255]) ^ iArr9[i119 & 255]) ^ iArr[i123];
        int i127 = (((iArr6[i119 >>> 24] ^ iArr7[(i117 >>> 16) & 255]) ^ iArr8[(i115 >>> 8) & 255]) ^ iArr9[i122 & 255]) ^ iArr[i125];
        int i128 = (((iArr6[i122 >>> 24] ^ iArr7[(i119 >>> 16) & 255]) ^ iArr8[(i117 >>> 8) & 255]) ^ iArr9[i115 & 255]) ^ iArr[i125 + 1];
        int i129 = iArr[0];
        int i130 = i3 + 1;
        byte[] bArr3 = f3675j;
        bArr2[i3] = (byte) (bArr3[i124 >>> 24] ^ (i129 >>> 24));
        int i131 = i130 + 1;
        bArr2[i130] = (byte) (bArr3[(i128 >>> 16) & 255] ^ (i129 >>> 16));
        int i132 = i131 + 1;
        bArr2[i131] = (byte) (bArr3[(i127 >>> 8) & 255] ^ (i129 >>> 8));
        int i133 = i132 + 1;
        bArr2[i132] = (byte) (i129 ^ bArr3[i126 & 255]);
        int i134 = iArr[1];
        int i135 = i133 + 1;
        bArr2[i133] = (byte) (bArr3[i126 >>> 24] ^ (i134 >>> 24));
        int i136 = i135 + 1;
        bArr2[i135] = (byte) (bArr3[(i124 >>> 16) & 255] ^ (i134 >>> 16));
        int i137 = i136 + 1;
        bArr2[i136] = (byte) (bArr3[(i128 >>> 8) & 255] ^ (i134 >>> 8));
        int i138 = i137 + 1;
        bArr2[i137] = (byte) (i134 ^ bArr3[i127 & 255]);
        int i139 = iArr[2];
        int i140 = i138 + 1;
        bArr2[i138] = (byte) (bArr3[i127 >>> 24] ^ (i139 >>> 24));
        int i141 = i140 + 1;
        bArr2[i140] = (byte) (bArr3[(i126 >>> 16) & 255] ^ (i139 >>> 16));
        int i142 = i141 + 1;
        bArr2[i141] = (byte) (bArr3[(i124 >>> 8) & 255] ^ (i139 >>> 8));
        int i143 = i142 + 1;
        bArr2[i142] = (byte) (i139 ^ bArr3[i128 & 255]);
        int i144 = iArr[3];
        int i145 = i143 + 1;
        bArr2[i143] = (byte) (bArr3[i128 >>> 24] ^ (i144 >>> 24));
        int i146 = i145 + 1;
        bArr2[i145] = (byte) (bArr3[(i127 >>> 16) & 255] ^ (i144 >>> 16));
        bArr2[i146] = (byte) (bArr3[(i126 >>> 8) & 255] ^ (i144 >>> 8));
        bArr2[i146 + 1] = (byte) (bArr3[i124 & 255] ^ i144);
    }
}
