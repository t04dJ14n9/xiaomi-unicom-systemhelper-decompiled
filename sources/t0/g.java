package t0;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile byte[] f3712a;

    public static byte[] a() {
        if (f3712a == null) {
            synchronized (g.class) {
                if (f3712a == null) {
                    byte[] bArr = new byte[16];
                    System.arraycopy(v0.b.b(), 0, bArr, 0, 16);
                    c cVar = new c();
                    cVar.a(2, bArr, bArr);
                    f3712a = cVar.b(new byte[]{-71, -100, -115, 26, 39, -124, 14, 14, -31, -46, -56, 1, 25, -127, -99, -107, -54, 51, 46, 14, 68, -68, -19, 28, 66, 19, -113, 5, 25, -11, -123, 50});
                }
            }
        }
        return f3712a;
    }
}
