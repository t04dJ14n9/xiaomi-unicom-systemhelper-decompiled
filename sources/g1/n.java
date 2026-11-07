package g1;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2689b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2690c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2691d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2692e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2693f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2694g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2695h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2696i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2697j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2698k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2699l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2700m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2701n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2702o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2703p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2704q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f2705r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f2706s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f2707t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f2708u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f2709v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f2710w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f2711x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f2712y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f2713z = "";
    public String A = "";
    public String B = "";
    public String C = "";
    public String D = "";
    public String E = "";
    public String F = "";
    public String G = "";
    public String H = "";
    public String I = "";
    public String J = "";
    public String K = "";
    public String L = "";
    public String M = "";
    public String N = "";

    public n() {
        this.f2688a = "";
        this.f2688a = l.e();
    }

    public JSONObject a() {
        String str;
        String str2 = this.f2689b;
        if (str2 == null || this.f2692e == null || this.f2694g == null || this.f2696i == null || this.f2697j == null || this.f2698k == null || this.f2699l == null || this.f2693f == null) {
            str = "imei/mnc/imsi/tac/cid/pci/networkType/mncch is null!";
        } else {
            if (!str2.isEmpty() && !this.f2692e.isEmpty() && !this.f2694g.isEmpty() && !this.f2696i.isEmpty() && !this.f2697j.isEmpty() && !this.f2698k.isEmpty() && !this.f2699l.isEmpty() && !this.f2693f.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("Time", this.f2688a);
                    jSONObject.put("IMEI", this.f2689b);
                    jSONObject.put("ICCID", this.f2690c);
                    jSONObject.put("ClientVersion", this.f2691d);
                    jSONObject.put("MNC", this.f2692e);
                    jSONObject.put("IMSI", this.f2694g);
                    jSONObject.put("TAC", this.f2696i);
                    jSONObject.put("CID", this.f2697j);
                    jSONObject.put("PCI", this.f2698k);
                    jSONObject.put("NetworkType", this.f2699l);
                    jSONObject.put("ARFCN", this.f2700m);
                    jSONObject.put("Bands", this.f2701n);
                    jSONObject.put("Bandwidth", this.f2702o);
                    jSONObject.put("CQITableIndex", this.f2703p);
                    jSONObject.put("CQIIndex", this.f2704q);
                    jSONObject.put("RSRP", this.f2705r);
                    jSONObject.put("RSRQ", this.f2707t);
                    jSONObject.put("SINR", this.f2706s);
                    jSONObject.put("CSIRSRP", this.f2708u);
                    jSONObject.put("CSIRSRQ", this.f2709v);
                    jSONObject.put("CSISINR", this.f2710w);
                    jSONObject.put("Uspeed", this.f2711x);
                    jSONObject.put("Dspeed", this.f2712y);
                    jSONObject.put("CallDisconnectCause", this.f2713z);
                    jSONObject.put("DataFailCause", this.A);
                    jSONObject.put("EPSFallback", this.B);
                    jSONObject.put("LONGITUDE", this.D);
                    jSONObject.put("LATITUDE", this.E);
                    jSONObject.put("ALTITUDE", this.F);
                    jSONObject.put("District", this.G);
                    jSONObject.put("SPEED", this.H);
                    jSONObject.put("BEARING", this.I);
                    jSONObject.put("BSSID", this.J);
                    jSONObject.put("SSID", this.K);
                } catch (JSONException e2) {
                    h.b("SignalInfo", "getJsonObject->" + e2.getMessage());
                }
                return jSONObject;
            }
            h.a("SignalInfo", "imei:" + this.f2689b + "mnc:" + this.f2692e + "imsi:" + this.f2694g + "tac:" + this.f2696i + "cid:" + this.f2697j + "pci:" + this.f2698k + "networkType:" + this.f2699l + "mncch:" + this.f2693f);
            str = "SignalInfo->getJsonObject==null";
        }
        h.b("SignalInfo", str);
        return null;
    }
}
