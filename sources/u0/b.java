package u0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f3812b = k(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3813a;

    public b(int i2) {
        this.f3813a = i2;
    }

    private static int b(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    private void e(byte[] bArr, byte[] bArr2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer2.remaining();
        int i2 = (iRemaining / 64) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferC = c(bArr, bArr2, this.f3813a + i3);
            if (i3 == i2 - 1) {
                a.a(byteBuffer, byteBuffer2, byteBufferC, iRemaining % 64);
            } else {
                a.a(byteBuffer, byteBuffer2, byteBufferC, 64);
            }
        }
    }

    static void f(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            g(iArr, 0, 4, 8, 12);
            g(iArr, 1, 5, 9, 13);
            g(iArr, 2, 6, 10, 14);
            g(iArr, 3, 7, 11, 15);
            g(iArr, 0, 5, 10, 15);
            g(iArr, 1, 6, 11, 12);
            g(iArr, 2, 7, 8, 13);
            g(iArr, 3, 4, 9, 14);
        }
    }

    static void g(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int iB = b(i6 ^ iArr[i5], 16);
        iArr[i5] = iB;
        int i7 = iArr[i4] + iB;
        iArr[i4] = i7;
        int iB2 = b(iArr[i3] ^ i7, 12);
        iArr[i3] = iB2;
        int i8 = iArr[i2] + iB2;
        iArr[i2] = i8;
        int iB3 = b(iArr[i5] ^ i8, 8);
        iArr[i5] = iB3;
        int i9 = iArr[i4] + iB3;
        iArr[i4] = i9;
        iArr[i3] = b(iArr[i3] ^ i9, 7);
    }

    static void h(int[] iArr, int[] iArr2) {
        int[] iArr3 = f3812b;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static int[] k(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    int a() {
        return 12;
    }

    ByteBuffer c(byte[] bArr, byte[] bArr2, int i2) {
        int[] iArrL = l(k(bArr), k(bArr2), i2);
        int[] iArr = (int[]) iArrL.clone();
        f(iArr);
        for (int i3 = 0; i3 < iArrL.length; i3++) {
            iArrL[i3] = iArrL[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrL, 0, 16);
        return byteBufferOrder;
    }

    void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() - a() < bArr.length) {
            throw new IllegalArgumentException("data output is too small");
        }
        if (bArr2 == null) {
            bArr2 = new byte[a()];
            new Random().nextBytes(bArr2);
        }
        byteBuffer.put(bArr2);
        e(bArr2, v0.b.a(), byteBuffer, ByteBuffer.wrap(bArr));
    }

    byte[] i(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < a()) {
            throw new GeneralSecurityException("data too short");
        }
        byte[] bArr = new byte[a()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        e(bArr, v0.b.b(), byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public byte[] j(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - a()) {
            throw new GeneralSecurityException("data too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(a() + bArr.length);
        d(byteBufferAllocate, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    int[] l(int[] iArr, int[] iArr2, int i2) {
        if (iArr.length != a() / 4) {
            throw new IllegalArgumentException(String.format("need 96-bit param, but got a %d-bit param", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr3 = new int[16];
        h(iArr3, iArr2);
        iArr3[12] = i2;
        System.arraycopy(iArr, 0, iArr3, 13, iArr.length);
        return iArr3;
    }

    public byte[] m(byte[] bArr) {
        return j(bArr, null);
    }

    public byte[] n(byte[] bArr) {
        return i(ByteBuffer.wrap(bArr));
    }
}
