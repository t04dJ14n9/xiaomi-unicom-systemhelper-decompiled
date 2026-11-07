package d;

import android.bluetooth.le.ScanResult;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f2218k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static e f2219l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentMap<String, ScanResult> f2220a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f2221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2229j;

    public e() {
        new ConcurrentHashMap();
        this.f2221b = false;
        this.f2222c = -1L;
        this.f2223d = null;
        this.f2224e = -1L;
        this.f2227h = 0L;
        this.f2228i = -1L;
        this.f2229j = 0L;
    }

    public static synchronized e a() {
        if (f2219l == null) {
            f2219l = new e();
        }
        return f2219l;
    }

    public synchronized String b() {
        if (!d() || TextUtils.isEmpty(this.f2226g)) {
            return null;
        }
        return this.f2226g;
    }

    public int c() {
        return this.f2225f;
    }

    public final boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f2224e;
        long j3 = jCurrentTimeMillis - j2;
        if (j3 > 10000 && j2 > 100000 && this.f2221b) {
            e();
        }
        return Math.abs(j3) <= 5000 && Math.abs(jCurrentTimeMillis - this.f2222c) <= 5000;
    }

    public final void e() {
        if (System.currentTimeMillis() - this.f2229j > 10000) {
            d.b().a();
        }
    }
}
