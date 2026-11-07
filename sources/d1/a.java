package d1;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2421c = new a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f2422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f2423b = 0;

    private a(byte[] bArr) {
        this.f2422a = bArr;
    }

    public static a a(String str) {
        try {
            return new a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported?");
        }
    }

    public int b() {
        return this.f2422a.length;
    }

    public byte[] c() {
        byte[] bArr = this.f2422a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f2422a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f2422a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.f2423b;
        if (i2 == 0) {
            byte[] bArr = this.f2422a;
            int length = bArr.length;
            for (byte b2 : bArr) {
                length = (length * 31) + b2;
            }
            i2 = length == 0 ? 1 : length;
            this.f2423b = i2;
        }
        return i2;
    }
}
