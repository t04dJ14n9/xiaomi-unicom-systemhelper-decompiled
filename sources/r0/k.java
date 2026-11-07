package r0;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f3606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f3607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3611f;

    protected k() {
        this(0);
    }

    protected k(int i2) {
        this.f3606a = new byte[1];
        this.f3607b = new int[4];
        this.f3608c = new byte[16];
        this.f3609d = i2;
        e();
    }

    private static int a(byte[] bArr, int i2) {
        return (int) (d(bArr, i2, 4) & 4294967295L);
    }

    private static long d(byte[] bArr, int i2, int i3) {
        if (i3 > 8) {
            throw new IllegalArgumentException("can't read more than eight bytes into a long value");
        }
        long j2 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j2 |= (((long) bArr[i2 + i4]) & 255) << (i4 * 8);
        }
        return j2;
    }

    private void e() {
        int[] iArr = this.f3607b;
        int i2 = this.f3609d;
        iArr[0] = (i2 - 1640531535) - 2048144777;
        iArr[1] = (-2048144777) + i2;
        iArr[2] = i2;
        iArr[3] = i2 - (-1640531535);
    }

    private void f(byte[] bArr, int i2) {
        int[] iArr = this.f3607b;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int iRotateLeft = Integer.rotateLeft(i3 + (a(bArr, i2) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft2 = Integer.rotateLeft(i4 + (a(bArr, i2 + 4) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft3 = Integer.rotateLeft(i5 + (a(bArr, i2 + 8) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft4 = Integer.rotateLeft(i6 + (a(bArr, i2 + 12) * (-2048144777)), 13) * (-1640531535);
        int[] iArr2 = this.f3607b;
        iArr2[0] = iRotateLeft;
        iArr2[1] = iRotateLeft2;
        iArr2[2] = iRotateLeft3;
        iArr2[3] = iRotateLeft4;
        this.f3611f = 0;
    }

    protected long b() {
        int i2 = 0;
        int iRotateLeft = (this.f3610e > 16 ? Integer.rotateLeft(this.f3607b[0], 1) + Integer.rotateLeft(this.f3607b[1], 7) + Integer.rotateLeft(this.f3607b[2], 12) + Integer.rotateLeft(this.f3607b[3], 18) : this.f3607b[2] + 374761393) + this.f3610e;
        int i3 = this.f3611f - 4;
        while (i2 <= i3) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + (a(this.f3608c, i2) * (-1028477379)), 17) * 668265263;
            i2 += 4;
        }
        while (i2 < this.f3611f) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + ((this.f3608c[i2] & 255) * 374761393), 11) * (-1640531535);
            i2++;
        }
        int i4 = ((iRotateLeft >>> 15) ^ iRotateLeft) * (-2048144777);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477379);
        return ((long) (i5 ^ (i5 >>> 16))) & 4294967295L;
    }

    protected void c(byte[] bArr, int i2, int i3) {
        if (i3 <= 0) {
            return;
        }
        this.f3610e += i3;
        int i4 = i2 + i3;
        int i5 = this.f3611f;
        if (i5 + i3 < 16) {
            System.arraycopy(bArr, i2, this.f3608c, i5, i3);
            this.f3611f += i3;
            return;
        }
        if (i5 > 0) {
            int i6 = 16 - i5;
            System.arraycopy(bArr, i2, this.f3608c, i5, i6);
            f(this.f3608c, 0);
            i2 += i6;
        }
        int i7 = i4 - 16;
        while (i2 <= i7) {
            f(bArr, i2);
            i2 += 16;
        }
        if (i2 < i4) {
            int i8 = i4 - i2;
            this.f3611f = i8;
            System.arraycopy(bArr, i2, this.f3608c, 0, i8);
        }
    }
}
