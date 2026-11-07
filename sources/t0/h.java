package t0;

import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3713a;

    h(int i2) {
        this.f3713a = i2;
    }

    @Override // t0.i
    public int a(byte[] bArr, int i2, int i3) {
        int i4;
        if (bArr == null || i3 == 0) {
            return 0;
        }
        int i5 = i3 + i2;
        int i6 = bArr[i5 - 1];
        int i7 = i6 & 255;
        if (i7 < 1 || i7 > this.f3713a || (i4 = i5 - i7) < i2) {
            return -1;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (bArr[i4 + i8] != i6) {
                return -1;
            }
        }
        return i4;
    }

    @Override // t0.i
    public void b(byte[] bArr, int i2, int i3) throws ShortBufferException {
        if (bArr == null) {
            return;
        }
        if (i2 + i3 > bArr.length) {
            throw new ShortBufferException("Buffer too small to hold padding");
        }
        byte b2 = (byte) (i3 & 255);
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4 + i2] = b2;
        }
    }

    @Override // t0.i
    public int c(int i2) {
        int i3 = this.f3713a;
        return i3 - (i2 % i3);
    }
}
