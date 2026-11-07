package b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.location.Jni;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String B = "BDLocConfigManager";
    public Context A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f1613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f1617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f1620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double[] f1623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f1631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1633u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f1634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f1636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f1637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f1638z;

    public class b extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f1639j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f1640k = false;

        public b() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            this.f3380b = 2;
            String strF = Jni.f(this.f1639j);
            this.f1639j = null;
            this.f3382d.put("qt", "conf");
            this.f3382d.put("req", strF);
        }

        @Override // n.g
        public void h(boolean z2) {
            if (z2 && this.f3381c != null) {
                try {
                    new JSONObject(this.f3381c);
                    if (a.this.f1613a != null) {
                        SharedPreferences.Editor editorEdit = a.this.f1613a.edit();
                        editorEdit.putString(a.B + "_newConfig", Base64.encodeToString(n.i.q(this.f3381c.getBytes()), 0));
                        editorEdit.apply();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            Map<String, Object> map = this.f3382d;
            if (map != null) {
                map.clear();
            }
            this.f1640k = false;
        }

        public void i(String str) {
            if (this.f1640k) {
                return;
            }
            this.f1640k = true;
            this.f1639j = str;
            b(n.d.f3357c);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1642a = new a();
    }

    public a() {
        this.f1613a = null;
        this.f1614b = false;
        this.f1615c = 16;
        this.f1616d = 300L;
        this.f1617e = 0.75d;
        this.f1618f = 0;
        this.f1619g = 1;
        this.f1620h = -0.10000000149011612d;
        this.f1621i = 0;
        this.f1622j = 1;
        this.f1624l = 0;
        this.f1625m = 1;
        this.f1626n = 1;
        this.f1627o = 0;
        this.f1628p = 0.2f;
        this.f1629q = 0.8f;
        this.f1630r = 0;
        this.f1631s = null;
        this.f1632t = 8;
        this.f1633u = 4000;
        this.f1634v = null;
        this.f1635w = false;
        this.f1636x = null;
        this.f1637y = null;
        this.f1638z = null;
        this.A = null;
    }

    public static a h() {
        return c.f1642a;
    }

    public synchronized void c(double d2, double d3, String str) {
        SharedPreferences sharedPreferences;
        if (this.f1638z == null && str != null) {
            try {
                if (str.equals("bd09") || str.equals("wgs84mc")) {
                    double[] dArrD = Jni.d(d3, d2, "bd092gcj");
                    double d4 = dArrD[1];
                    double d5 = dArrD[0];
                    d2 = d4;
                    d3 = d5;
                }
                String str2 = String.format(Locale.US, "%.5f|%.5f", Double.valueOf(d3), Double.valueOf(d2));
                this.f1638z = str2;
                String strEncodeToString = Base64.encodeToString(str2.getBytes("UTF-8"), 0);
                if (strEncodeToString != null && (sharedPreferences = this.f1613a) != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(B + "_loc", strEncodeToString);
                    editorEdit.apply();
                }
            } catch (Exception unused) {
                this.f1638z = null;
            }
        }
    }

    public synchronized void d(Context context, b1.h hVar, String str) {
        if (!this.f1635w && context != null) {
            this.f1635w = true;
            this.A = context;
            if (hVar == null) {
                hVar = new b1.h();
            }
            this.f1636x = context.getPackageName();
            try {
                this.f1637y = a1.b.B(context).A();
            } catch (Throwable unused) {
                this.f1637y = null;
            }
            if (this.f1613a == null) {
                this.f1613a = context.getSharedPreferences(B + "BDLocConfig", 0);
            }
            SharedPreferences sharedPreferences = this.f1613a;
            if (sharedPreferences != null) {
                long j2 = sharedPreferences.getLong(B + "_lastCheckTime", 0L);
                String string = this.f1613a.getString(B + "_config", "");
                String string2 = this.f1613a.getString(B + "_newConfig", "");
                if (!TextUtils.isEmpty(string2)) {
                    f(new String(n.i.w(Base64.decode(string2, 0))));
                } else if (!TextUtils.isEmpty(string)) {
                    f(string);
                    SharedPreferences.Editor editorEdit = this.f1613a.edit();
                    editorEdit.remove(B + "_config");
                    editorEdit.apply();
                }
                if (Math.abs((System.currentTimeMillis() / 1000) - j2) > this.f1616d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    SharedPreferences.Editor editorEdit2 = this.f1613a.edit();
                    editorEdit2.putLong(B + "_lastCheckTime", jCurrentTimeMillis);
                    editorEdit2.apply();
                    e(hVar);
                }
            }
        }
    }

    public final void e(b1.h hVar) throws Throwable {
        String str = "&ver=" + n.i.f3445v + "&usr=" + i() + "&app=" + this.f1636x + "&prod=" + hVar.f2005f + "&newwf=1";
        String strSubstring = Build.VERSION.RELEASE;
        if (strSubstring != null && strSubstring.length() > 6) {
            strSubstring = strSubstring.substring(0, 6);
        }
        String str2 = str + "&sv=" + strSubstring;
        String strZ = n.i.z("ro.miui.ui.version.name");
        if (!TextUtils.isEmpty(strZ)) {
            str2 = str2 + "&miui=" + strZ;
        }
        String strE = n.i.E();
        if (!TextUtils.isEmpty(strE)) {
            str2 = str2 + "&mtk=" + strE;
        }
        SharedPreferences sharedPreferencesB = r.b(this.A);
        String string = sharedPreferencesB != null ? sharedPreferencesB.getString("mapcity", null) : null;
        if (!TextUtils.isEmpty(string)) {
            str2 = str2 + "&city=" + string;
        }
        String string2 = this.f1613a.getString(B + "_loc", null);
        if (!TextUtils.isEmpty(string2)) {
            try {
                str2 = str2 + "&loc=" + new String(Base64.decode(string2, 0), "UTF-8");
            } catch (Exception unused) {
            }
        }
        if (this.f1634v == null) {
            this.f1634v = new b();
        }
        this.f1634v.i(str2);
    }

    public final void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("is_check_Per") && jSONObject.getInt("is_check_Per") > 0) {
                this.f1614b = true;
            }
            if (jSONObject.has("wfnum")) {
                this.f1615c = jSONObject.getInt("wfnum");
            }
            if (jSONObject.has("freq")) {
                this.f1616d = jSONObject.getLong("freq");
            }
            if (jSONObject.has("wfsm")) {
                this.f1617e = jSONObject.getDouble("wfsm");
            }
            if (jSONObject.has("idmoc")) {
                this.f1618f = jSONObject.getInt("idmoc");
            }
            if (jSONObject.has("gnmcrm")) {
                this.f1620h = jSONObject.getDouble("gnmcrm");
            }
            if (jSONObject.has("gnmcon")) {
                this.f1621i = jSONObject.getInt("gnmcon");
            }
            if (jSONObject.has("lpcs")) {
                this.f1619g = jSONObject.getInt("lpcs");
            }
            if (jSONObject.has("iupl")) {
                this.f1622j = jSONObject.getInt("iupl");
            }
            if (jSONObject.has("opetco")) {
                jSONObject.getInt("opetco");
            }
            if (jSONObject.has("ct")) {
                jSONObject.getInt("ct");
            }
            if (jSONObject.has("suci")) {
                jSONObject.getInt("suci");
            }
            if (jSONObject.has("smn")) {
                jSONObject.getInt("smn");
            }
            if (jSONObject.has("bcar")) {
                g(jSONObject);
            }
            if (jSONObject.has("ums")) {
                jSONObject.getInt("ums");
            }
            if (jSONObject.has("hpdts")) {
                this.f1624l = jSONObject.getInt("hpdts");
            }
            if (jSONObject.has("oldts")) {
                this.f1625m = jSONObject.getInt("oldts");
            }
            if (jSONObject.has("nlp_loc_coarse")) {
                this.f1626n = jSONObject.optInt("nlp_loc_coarse");
            }
            if (jSONObject.has("new_loc_cache_switch")) {
                this.f1627o = jSONObject.optInt("new_loc_cache_switch");
            }
            if (jSONObject.has("nc_same_rate")) {
                this.f1628p = (float) jSONObject.optDouble("nc_same_rate", 0.8d);
            }
            if (jSONObject.has("cl_str_change_rate")) {
                this.f1629q = (float) jSONObject.optDouble("cl_str_change_rate", 0.2d);
            }
            if (jSONObject.has("cl_list_switch")) {
                this.f1630r = jSONObject.optInt("cl_list_switch", 0);
            }
            if (jSONObject.has("cl_str_switch")) {
                String[] strArrSplit = jSONObject.optString("cl_str_switch", "").split(",");
                this.f1631s = new int[strArrSplit.length];
                int i2 = 0;
                for (String str2 : strArrSplit) {
                    this.f1631s[i2] = 0;
                    if (str2.length() > 0) {
                        try {
                            this.f1631s[i2] = Integer.parseInt(str2);
                        } catch (Throwable unused) {
                        }
                    }
                    i2++;
                }
            }
            if (jSONObject.has("cell_number")) {
                this.f1632t = jSONObject.optInt("cell_number", 10);
            }
            if (jSONObject.has("loc_str_length")) {
                this.f1633u = jSONObject.optInt("loc_str_length", 4000);
            }
            if (jSONObject.has("loc_to_foreground")) {
                jSONObject.optInt("loc_to_foreground", 1);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void g(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            double[] dArr = this.f1623k;
            if (dArr != null && dArr.length > 0) {
                this.f1623k = null;
            }
            try {
                if (!jSONObject.has("bcar") || (jSONArray = jSONObject.getJSONArray("bcar")) == null || jSONArray.length() <= 0) {
                    return;
                }
                if (this.f1623k == null) {
                    this.f1623k = new double[jSONArray.length() * 4];
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 < jSONArray.length()) {
                    int i4 = i3 + 1;
                    this.f1623k[i3] = jSONArray.getJSONObject(i2).getDouble("x1");
                    int i5 = i4 + 1;
                    this.f1623k[i4] = jSONArray.getJSONObject(i2).getDouble("y1");
                    int i6 = i5 + 1;
                    this.f1623k[i5] = jSONArray.getJSONObject(i2).getDouble("x2");
                    int i7 = i6 + 1;
                    this.f1623k[i6] = jSONArray.getJSONObject(i2).getDouble("y2");
                    i2++;
                    i3 = i7;
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String i() {
        StringBuilder sb = new StringBuilder();
        sb.append("v9.521|");
        sb.append(this.f1637y);
        sb.append("|");
        String str = Build.MODEL;
        sb.append(str);
        sb.append("&cu=");
        sb.append(this.f1637y);
        sb.append("&mb=");
        sb.append(str);
        return sb.toString();
    }
}
