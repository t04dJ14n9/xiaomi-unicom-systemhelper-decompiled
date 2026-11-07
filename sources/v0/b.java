package v0;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f3929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f3930b;

    public static byte[] a() {
        byte[] bArr = f3929a;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(a.f3924a).modPow(new BigInteger(a.f3925b), new BigInteger(a.f3928e)).toByteArray();
        f3929a = byteArray;
        return byteArray;
    }

    public static byte[] b() {
        byte[] bArr = f3930b;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(a.f3926c).modPow(new BigInteger(a.f3927d), new BigInteger(a.f3928e)).toByteArray();
        f3930b = byteArray;
        return byteArray;
    }
}
