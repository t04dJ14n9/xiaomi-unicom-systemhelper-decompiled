package g1;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f2635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f2636c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f2637d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f2638e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f2639f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f2640g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2641h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f2642i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f2643j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f2644k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f2645l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f2646m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f2647n = 0;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String strE = l.e();
        try {
            if (this.f2635b == null) {
                this.f2635b = "";
            }
            jSONObject.put("appLabel", this.f2635b);
            if (this.f2634a == null) {
                this.f2634a = "";
            }
            jSONObject.put("pkgName", this.f2634a);
            jSONObject.put("Time", strE);
            jSONObject.put("runTime", this.f2636c + "min");
            jSONObject.put("launchCount", String.valueOf(this.f2637d));
            jSONObject.put("tx1", this.f2642i + "KB");
            jSONObject.put("rx1", this.f2643j + "KB");
            jSONObject.put("tx2", this.f2644k + "KB");
            jSONObject.put("rx2", this.f2645l + "KB");
            jSONObject.put("totalData1", this.f2638e + "KB");
            jSONObject.put("totalData2", this.f2639f + "KB");
            jSONObject.put("totalDataWiFi", this.f2640g + "MB");
        } catch (JSONException e2) {
            h.b("AppInfo", "getJsonObject->" + e2.getMessage());
        }
        return jSONObject;
    }

    public int b() {
        return this.f2641h;
    }

    public void c(String str) {
        this.f2635b = str;
    }

    public void d(long j2) {
        this.f2637d = j2;
    }

    public void e(String str) {
        this.f2634a = str;
    }

    public void f(long j2) {
        this.f2636c = j2;
    }

    public void g(long j2) {
        this.f2643j = j2;
    }

    public void h(long j2) {
        this.f2645l = j2;
    }

    public void i(long j2) {
        this.f2647n = j2;
    }

    public void j(long j2) {
        this.f2638e = j2;
    }

    public void k(long j2) {
        this.f2639f = j2;
    }

    public void l(long j2) {
        this.f2640g = j2;
    }

    public void m(long j2) {
        this.f2642i = j2;
    }

    public void n(long j2) {
        this.f2644k = j2;
    }

    public void o(long j2) {
        this.f2646m = j2;
    }

    public void p(int i2) {
        this.f2641h = i2;
    }
}
