package d1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f2424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OutputStream f2427d = null;

    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private b(byte[] bArr, int i2, int i3) {
        this.f2424a = bArr;
        this.f2426c = i2;
        this.f2425b = i2 + i3;
    }

    public static int b(int i2, d1.a aVar) {
        return j(i2) + c(aVar);
    }

    public static int c(d1.a aVar) {
        return h(aVar.b()) + aVar.b();
    }

    public static int d(int i2, int i3) {
        return j(i2) + e(i3);
    }

    public static int e(int i2) {
        if (i2 >= 0) {
            return h(i2);
        }
        return 10;
    }

    public static int f(int i2, c cVar) {
        return j(i2) + g(cVar);
    }

    public static int g(c cVar) {
        int iB = cVar.b();
        return h(iB) + iB;
    }

    public static int h(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int i(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int j(int i2) {
        return h(d.a(i2, 0));
    }

    public static int k(int i2, long j2) {
        return j(i2) + l(j2);
    }

    public static int l(long j2) {
        return i(j2);
    }

    public static b m(byte[] bArr, int i2, int i3) {
        return new b(bArr, i2, i3);
    }

    private void n() throws IOException {
        OutputStream outputStream = this.f2427d;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f2424a, 0, this.f2426c);
        this.f2426c = 0;
    }

    public void A(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            w((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        w((int) j2);
    }

    public void B(int i2, int i3) throws IOException {
        z(d.a(i2, i3));
    }

    public void C(int i2, long j2) throws IOException {
        B(i2, 0);
        D(j2);
    }

    public void D(long j2) throws IOException {
        A(j2);
    }

    public void a() {
        if (o() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int o() {
        if (this.f2427d == null) {
            return this.f2425b - this.f2426c;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void p(int i2, d1.a aVar) throws IOException {
        B(i2, 2);
        q(aVar);
    }

    public void q(d1.a aVar) throws IOException {
        byte[] bArrC = aVar.c();
        z(bArrC.length);
        x(bArrC);
    }

    public void r(int i2, int i3) throws IOException {
        B(i2, 0);
        s(i3);
    }

    public void s(int i2) throws IOException {
        if (i2 >= 0) {
            z(i2);
        } else {
            A(i2);
        }
    }

    public void t(int i2, c cVar) throws IOException {
        B(i2, 2);
        u(cVar);
    }

    public void u(c cVar) throws IOException {
        z(cVar.a());
        cVar.e(this);
    }

    public void v(byte b2) throws IOException {
        if (this.f2426c == this.f2425b) {
            n();
        }
        byte[] bArr = this.f2424a;
        int i2 = this.f2426c;
        this.f2426c = i2 + 1;
        bArr[i2] = b2;
    }

    public void w(int i2) throws IOException {
        v((byte) i2);
    }

    public void x(byte[] bArr) throws IOException {
        y(bArr, 0, bArr.length);
    }

    public void y(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f2425b;
        int i5 = this.f2426c;
        if (i4 - i5 >= i3) {
            System.arraycopy(bArr, i2, this.f2424a, i5, i3);
            this.f2426c += i3;
            return;
        }
        int i6 = i4 - i5;
        System.arraycopy(bArr, i2, this.f2424a, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f2426c = this.f2425b;
        n();
        if (i8 > this.f2425b) {
            this.f2427d.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, this.f2424a, 0, i8);
            this.f2426c = i8;
        }
    }

    public void z(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            w((i2 & 127) | 128);
            i2 >>>= 7;
        }
        w(i2);
    }
}
