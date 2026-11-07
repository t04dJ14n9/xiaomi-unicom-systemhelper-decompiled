package r0;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable, Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ObjectStreamField[] f3589e = {new ObjectStreamField("bits", long[].class)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f3590f = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f3591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f3592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient boolean f3593d;

    public b() {
        this.f3592c = 0;
        this.f3593d = false;
        x(64);
        this.f3593d = false;
    }

    public b(int i2) {
        this.f3592c = 0;
        this.f3593d = false;
        if (i2 >= 0) {
            x(i2);
            this.f3593d = true;
        } else {
            throw new NegativeArraySizeException("nbits < 0: " + i2);
        }
    }

    private b(long[] jArr) {
        this.f3592c = 0;
        this.f3593d = false;
        this.f3591b = jArr;
        this.f3592c = jArr.length;
        q();
    }

    public static b a(long[] jArr) {
        int length = jArr.length;
        while (length > 0 && jArr[length - 1] == 0) {
            length--;
        }
        return new b(Arrays.copyOf(jArr, length));
    }

    private void q() {
        int i2;
        int i3;
        boolean z2 = f3590f;
        if (!z2 && (i3 = this.f3592c) != 0 && this.f3591b[i3 - 1] == 0) {
            throw new AssertionError();
        }
        if (!z2 && ((i2 = this.f3592c) < 0 || i2 > this.f3591b.length)) {
            throw new AssertionError();
        }
        if (z2) {
            return;
        }
        int i4 = this.f3592c;
        long[] jArr = this.f3591b;
        if (i4 != jArr.length && jArr[i4] != 0) {
            throw new AssertionError();
        }
    }

    private static void r(int i2, int i3) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i2);
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("toIndex < 0: " + i3);
        }
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    private void u() {
        int i2 = this.f3592c - 1;
        while (i2 >= 0 && this.f3591b[i2] == 0) {
            i2--;
        }
        this.f3592c = i2 + 1;
    }

    private static int v(int i2) {
        return i2 >> 6;
    }

    private void w() {
        int i2 = this.f3592c;
        long[] jArr = this.f3591b;
        if (i2 != jArr.length) {
            this.f3591b = Arrays.copyOf(jArr, i2);
            q();
        }
    }

    private void x(int i2) {
        this.f3591b = new long[v(i2 - 1) + 1];
    }

    private void y(int i2) {
        long[] jArr = this.f3591b;
        if (jArr.length < i2) {
            this.f3591b = Arrays.copyOf(this.f3591b, Math.max(jArr.length * 2, i2));
            this.f3593d = false;
        }
    }

    private void z(int i2) {
        int i3 = i2 + 1;
        if (this.f3592c < i3) {
            y(i3);
            this.f3592c = i3;
        }
    }

    public void b(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i2);
        }
        int iV = v(i2);
        z(iV);
        long[] jArr = this.f3591b;
        jArr[iV] = jArr[iV] | (1 << i2);
        q();
    }

    public void c(int i2, int i3) {
        r(i2, i3);
        if (i2 == i3) {
            return;
        }
        int iV = v(i2);
        int iV2 = v(i3 - 1);
        z(iV2);
        long j2 = (-1) << i2;
        long j3 = (-1) >>> (-i3);
        if (iV == iV2) {
            long[] jArr = this.f3591b;
            jArr[iV] = (j3 & j2) | jArr[iV];
        } else {
            long[] jArr2 = this.f3591b;
            jArr2[iV] = j2 | jArr2[iV];
            while (true) {
                iV++;
                if (iV >= iV2) {
                    break;
                } else {
                    this.f3591b[iV] = -1;
                }
            }
            long[] jArr3 = this.f3591b;
            jArr3[iV2] = j3 | jArr3[iV2];
        }
        q();
    }

    public Object clone() {
        if (!this.f3593d) {
            w();
        }
        try {
            b bVar = (b) super.clone();
            bVar.f3591b = (long[]) this.f3591b.clone();
            bVar.q();
            return bVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public void d(int i2, int i3, boolean z2) {
        if (z2) {
            c(i2, i3);
        } else {
            j(i2, i3);
        }
    }

    public void e(int i2, boolean z2) {
        if (z2) {
            b(i2);
        } else {
            i(i2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b bVar = (b) obj;
        q();
        bVar.q();
        if (this.f3592c != bVar.f3592c) {
            return false;
        }
        for (int i2 = 0; i2 < this.f3592c; i2++) {
            if (this.f3591b[i2] != bVar.f3591b[i2]) {
                return false;
            }
        }
        return true;
    }

    public void f(b bVar) {
        if (this == bVar) {
            return;
        }
        while (true) {
            int i2 = this.f3592c;
            if (i2 <= bVar.f3592c) {
                break;
            }
            long[] jArr = this.f3591b;
            int i3 = i2 - 1;
            this.f3592c = i3;
            jArr[i3] = 0;
        }
        for (int i4 = 0; i4 < this.f3592c; i4++) {
            long[] jArr2 = this.f3591b;
            jArr2[i4] = jArr2[i4] & bVar.f3591b[i4];
        }
        u();
        q();
    }

    public byte[] g() {
        int i2 = this.f3592c;
        if (i2 == 0) {
            return new byte[0];
        }
        int i3 = i2 - 1;
        int i4 = i3 * 8;
        for (long j2 = this.f3591b[i3]; j2 != 0; j2 >>>= 8) {
            i4++;
        }
        byte[] bArr = new byte[i4];
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (int i5 = 0; i5 < i3; i5++) {
            byteBufferOrder.putLong(this.f3591b[i5]);
        }
        for (long j3 = this.f3591b[i3]; j3 != 0; j3 >>>= 8) {
            byteBufferOrder.put((byte) (255 & j3));
        }
        return bArr;
    }

    public int h() {
        int i2 = this.f3592c;
        if (i2 == 0) {
            return 0;
        }
        int i3 = i2 - 1;
        return (i3 * 64) + (64 - Long.numberOfLeadingZeros(this.f3591b[i3]));
    }

    public int hashCode() {
        int i2 = this.f3592c;
        long j2 = 1234;
        while (true) {
            i2--;
            if (i2 < 0) {
                return (int) ((j2 >> 32) ^ j2);
            }
            j2 ^= this.f3591b[i2] * ((long) (i2 + 1));
        }
    }

    public void i(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i2);
        }
        int iV = v(i2);
        if (iV >= this.f3592c) {
            return;
        }
        long[] jArr = this.f3591b;
        jArr[iV] = jArr[iV] & (~(1 << i2));
        u();
        q();
    }

    public void j(int i2, int i3) {
        int iV;
        r(i2, i3);
        if (i2 != i3 && (iV = v(i2)) < this.f3592c) {
            int iV2 = v(i3 - 1);
            if (iV2 >= this.f3592c) {
                i3 = h();
                iV2 = this.f3592c - 1;
            }
            long j2 = (-1) << i2;
            long j3 = (-1) >>> (-i3);
            if (iV == iV2) {
                long[] jArr = this.f3591b;
                jArr[iV] = (~(j3 & j2)) & jArr[iV];
            } else {
                long[] jArr2 = this.f3591b;
                jArr2[iV] = (~j2) & jArr2[iV];
                while (true) {
                    iV++;
                    if (iV >= iV2) {
                        break;
                    } else {
                        this.f3591b[iV] = 0;
                    }
                }
                long[] jArr3 = this.f3591b;
                jArr3[iV2] = (~j3) & jArr3[iV2];
            }
            u();
            q();
        }
    }

    public void k(b bVar) {
        if (this == bVar) {
            return;
        }
        int iMin = Math.min(this.f3592c, bVar.f3592c);
        int i2 = this.f3592c;
        int i3 = bVar.f3592c;
        if (i2 < i3) {
            y(i3);
            this.f3592c = bVar.f3592c;
        }
        for (int i4 = 0; i4 < iMin; i4++) {
            long[] jArr = this.f3591b;
            jArr[i4] = jArr[i4] | bVar.f3591b[i4];
        }
        if (iMin < bVar.f3592c) {
            System.arraycopy(bVar.f3591b, iMin, this.f3591b, iMin, this.f3592c - iMin);
        }
        q();
    }

    public int l() {
        int iBitCount = 0;
        for (int i2 = 0; i2 < this.f3592c; i2++) {
            iBitCount += Long.bitCount(this.f3591b[i2]);
        }
        return iBitCount;
    }

    public b m(int i2, int i3) {
        int i4;
        long j2;
        r(i2, i3);
        q();
        int iH = h();
        int i5 = 0;
        if (iH <= i2 || i2 == i3) {
            return new b(0);
        }
        if (i3 > iH) {
            i3 = iH;
        }
        int i6 = i3 - i2;
        b bVar = new b(i6);
        int iV = v(i6 - 1) + 1;
        int iV2 = v(i2);
        int i7 = i2 & 63;
        boolean z2 = i7 == 0;
        while (true) {
            i4 = iV - 1;
            if (i5 >= i4) {
                break;
            }
            long[] jArr = bVar.f3591b;
            long[] jArr2 = this.f3591b;
            jArr[i5] = z2 ? jArr2[iV2] : (jArr2[iV2] >>> i2) | (jArr2[iV2 + 1] << (-i2));
            i5++;
            iV2++;
        }
        long j3 = (-1) >>> (-i3);
        long[] jArr3 = bVar.f3591b;
        int i8 = (i3 - 1) & 63;
        long[] jArr4 = this.f3591b;
        if (i8 < i7) {
            j2 = ((jArr4[iV2 + 1] & j3) << (-i2)) | (jArr4[iV2] >>> i2);
        } else {
            j2 = (jArr4[iV2] & j3) >>> i2;
        }
        jArr3[i4] = j2;
        bVar.f3592c = iV;
        bVar.u();
        bVar.q();
        return bVar;
    }

    public void n(b bVar) {
        int iMin = Math.min(this.f3592c, bVar.f3592c);
        int i2 = this.f3592c;
        int i3 = bVar.f3592c;
        if (i2 < i3) {
            y(i3);
            this.f3592c = bVar.f3592c;
        }
        for (int i4 = 0; i4 < iMin; i4++) {
            long[] jArr = this.f3591b;
            jArr[i4] = jArr[i4] ^ bVar.f3591b[i4];
        }
        int i5 = bVar.f3592c;
        if (iMin < i5) {
            System.arraycopy(bVar.f3591b, iMin, this.f3591b, iMin, i5 - iMin);
        }
        u();
        q();
    }

    public boolean o(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i2);
        }
        q();
        int iV = v(i2);
        if (iV < this.f3592c) {
            if (((1 << i2) & this.f3591b[iV]) != 0) {
                return true;
            }
        }
        return false;
    }

    public int p(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i2);
        }
        q();
        int iV = v(i2);
        if (iV >= this.f3592c) {
            return -1;
        }
        long j2 = this.f3591b[iV] & ((-1) << i2);
        while (j2 == 0) {
            iV++;
            if (iV == this.f3592c) {
                return -1;
            }
            j2 = this.f3591b[iV];
        }
        return (iV * 64) + Long.numberOfTrailingZeros(j2);
    }

    public void s(b bVar) {
        for (int iMin = Math.min(this.f3592c, bVar.f3592c) - 1; iMin >= 0; iMin--) {
            long[] jArr = this.f3591b;
            jArr[iMin] = jArr[iMin] & (~bVar.f3591b[iMin]);
        }
        u();
        q();
    }

    public int t(int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i2);
        }
        q();
        int iV = v(i2);
        if (iV >= this.f3592c) {
            return i2;
        }
        long j2 = (~this.f3591b[iV]) & ((-1) << i2);
        while (j2 == 0) {
            iV++;
            int i3 = this.f3592c;
            if (iV == i3) {
                return i3 * 64;
            }
            j2 = ~this.f3591b[iV];
        }
        return (iV * 64) + Long.numberOfTrailingZeros(j2);
    }

    public String toString() {
        q();
        int i2 = this.f3592c;
        StringBuilder sb = new StringBuilder(((i2 > 128 ? l() : i2 * 64) * 6) + 2);
        sb.append('{');
        int iP = p(0);
        if (iP != -1) {
            sb.append(iP);
            while (true) {
                iP = p(iP + 1);
                if (iP < 0) {
                    break;
                }
                int iT = t(iP);
                do {
                    sb.append(", ");
                    sb.append(iP);
                    iP++;
                } while (iP < iT);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
