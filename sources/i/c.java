package i;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import b.w;
import com.baidu.location.Jni;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import n.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f2789b;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2808u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2809v = 8000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2810w = 5000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f2811x = 5000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f2812y = 5000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f2813z = 5000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2791d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2792e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2793f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2794g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2795h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2797j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2798k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2799l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2800m = 30;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2801n = 30;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f2802o = 0.0d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f2803p = 0.0d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f2804q = 0.0d;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f2805r = 0.0d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f2806s = 0.0d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2807t = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f2796i = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2790c = new b();

    public final class b extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2814j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f2815k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f2816l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f2817m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f2818n;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ExecutorService executorServiceC = w.b().c();
                b bVar = b.this;
                if (executorServiceC != null) {
                    bVar.c(executorServiceC, "https://ofloc.map.baidu.com/offline_loc");
                } else {
                    bVar.b("https://ofloc.map.baidu.com/offline_loc");
                }
            }
        }

        public b() {
            this.f2814j = 0;
            this.f2817m = false;
            this.f2815k = -1L;
            this.f2816l = -1L;
            this.f3382d = new HashMap();
            this.f2818n = Jni.i(String.format(Locale.US, "&ver=%s&cuid=%s&prod=%s:%s&sdk=%.2f&mb=%s&os=A%s", "1", n.b.g().f3351c, n.b.f3345g, n.b.f3344f, Float.valueOf(9.521f), Build.MODEL, Build.VERSION.SDK));
        }

        @Override // n.g
        public void a() {
            this.f3382d.clear();
            this.f3382d.put("qt", "conf");
            this.f3382d.put("req", this.f2818n);
            this.f3379a = d.f2824j;
        }

        @Override // n.g
        public void h(boolean z2) {
            String str;
            String str2 = "ver";
            if (!z2 || (str = this.f3381c) == null) {
                this.f2814j++;
                this.f2815k = System.currentTimeMillis();
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    long j2 = jSONObject.has("ofl") ? jSONObject.getLong("ofl") : 0L;
                    String string = jSONObject.has("ver") ? jSONObject.getString("ver") : "1";
                    if ((j2 & 1) == 1) {
                        c.this.f2791d = true;
                    }
                    if ((j2 & 2) == 2) {
                        c.this.f2792e = true;
                    }
                    if ((j2 & 4) == 4) {
                        c.this.f2793f = true;
                    }
                    if ((j2 & 8) == 8) {
                        c.this.f2794g = true;
                    }
                    if ((j2 & 16) == 16) {
                        c.this.f2795h = true;
                    }
                    if ((j2 & 32) == 32) {
                        c.this.f2797j = true;
                    }
                    if ((j2 & 64) == 64) {
                        c.this.f2798k = true;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    if (jSONObject.has("cplist")) {
                        c.this.f2796i = jSONObject.getString("cplist").split(";");
                        jSONObject2.put("cplist", jSONObject.getString("cplist"));
                    }
                    if (jSONObject.has("bklist")) {
                        c.this.g(jSONObject.getString("bklist").split(";"));
                    }
                    String str3 = "poiup";
                    String str4 = "addrup";
                    String str5 = string;
                    if (jSONObject.has("para")) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("para");
                        if (jSONObject3.has("rgcgp")) {
                            c.this.f2799l = jSONObject3.getInt("rgcgp");
                        }
                        if (jSONObject3.has("addrup")) {
                            c.this.f2801n = jSONObject3.getInt("addrup");
                        }
                        if (jSONObject3.has("poiup")) {
                            c.this.f2800m = jSONObject3.getInt("poiup");
                        }
                        if (jSONObject3.has("oflp")) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("oflp");
                            if (jSONObject4.has("0")) {
                                c.this.f2802o = jSONObject4.getDouble("0");
                            }
                            if (jSONObject4.has("1")) {
                                c.this.f2803p = jSONObject4.getDouble("1");
                            }
                            if (jSONObject4.has("2")) {
                                c.this.f2804q = jSONObject4.getDouble("2");
                            }
                            if (jSONObject4.has("3")) {
                                c.this.f2805r = jSONObject4.getDouble("3");
                            }
                            if (jSONObject4.has("4")) {
                                c.this.f2806s = jSONObject4.getDouble("4");
                            }
                        } else {
                            str3 = "poiup";
                            str4 = "addrup";
                        }
                        if (jSONObject3.has("onlt")) {
                            JSONObject jSONObject5 = jSONObject3.getJSONObject("onlt");
                            if (jSONObject5.has("0")) {
                                c.this.f2813z = jSONObject5.getLong("0");
                            }
                            if (jSONObject5.has("1")) {
                                c.this.f2812y = jSONObject5.getLong("1");
                            }
                            if (jSONObject5.has("2")) {
                                c.this.f2809v = jSONObject5.getLong("2");
                            }
                            if (jSONObject5.has("3")) {
                                c.this.f2810w = jSONObject5.getLong("3");
                            }
                            if (jSONObject5.has("4")) {
                                c.this.f2811x = jSONObject5.getLong("4");
                            }
                        }
                        if (jSONObject3.has("minapn")) {
                            c.this.f2807t = jSONObject3.getInt("minapn");
                        }
                    } else {
                        str2 = "ver";
                        str3 = "poiup";
                        str4 = "addrup";
                    }
                    jSONObject2.put("ol", c.this.f2791d);
                    jSONObject2.put("olv2", c.this.f2798k);
                    jSONObject2.put("fl", c.this.f2792e);
                    jSONObject2.put("on", c.this.f2793f);
                    jSONObject2.put("wn", c.this.f2794g);
                    jSONObject2.put("oc", c.this.f2795h);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f2816l = jCurrentTimeMillis;
                    jSONObject2.put("t", jCurrentTimeMillis);
                    jSONObject2.put(str2, str5);
                    jSONObject2.put("rgcon", c.this.f2797j);
                    jSONObject2.put("rgcgp", c.this.f2799l);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("0", c.this.f2802o);
                    jSONObject6.put("1", c.this.f2803p);
                    jSONObject6.put("2", c.this.f2804q);
                    jSONObject6.put("3", c.this.f2805r);
                    jSONObject6.put("4", c.this.f2806s);
                    jSONObject2.put("oflp", jSONObject6);
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("0", c.this.f2813z);
                    jSONObject7.put("1", c.this.f2812y);
                    jSONObject7.put("2", c.this.f2809v);
                    jSONObject7.put("3", c.this.f2810w);
                    jSONObject7.put("4", c.this.f2811x);
                    jSONObject2.put("onlt", jSONObject7);
                    jSONObject2.put(str4, c.this.f2801n);
                    jSONObject2.put(str3, c.this.f2800m);
                    jSONObject2.put("minapn", c.this.f2807t);
                    File file = new File(c.this.f2788a.r(), "ofl.config");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(jSONObject2.toString());
                    fileWriter.close();
                } catch (Exception unused) {
                    this.f2814j++;
                    this.f2815k = System.currentTimeMillis();
                }
            }
            this.f2817m = false;
        }

        public final void j() {
            boolean z2;
            if (this.f2817m) {
                return;
            }
            try {
                File file = new File(c.this.f2788a.r(), "ofl.config");
                if (this.f2816l == -1 && file.exists()) {
                    Scanner scanner = new Scanner(file);
                    String next = scanner.next();
                    scanner.close();
                    JSONObject jSONObject = new JSONObject(next);
                    c.this.f2791d = jSONObject.getBoolean("ol");
                    c.this.f2792e = jSONObject.getBoolean("fl");
                    c.this.f2793f = jSONObject.getBoolean("on");
                    c.this.f2794g = jSONObject.getBoolean("wn");
                    c.this.f2795h = jSONObject.getBoolean("oc");
                    this.f2816l = jSONObject.getLong("t");
                    if (jSONObject.has("ol")) {
                        c.this.f2798k = jSONObject.getBoolean("olv2");
                    }
                    if (jSONObject.has("cplist")) {
                        c.this.f2796i = jSONObject.getString("cplist").split(";");
                    }
                    if (jSONObject.has("rgcgp")) {
                        c.this.f2799l = jSONObject.getInt("rgcgp");
                    }
                    if (jSONObject.has("rgcon")) {
                        c.this.f2797j = jSONObject.getBoolean("rgcon");
                    }
                    if (jSONObject.has("addrup")) {
                        c.this.f2801n = jSONObject.getInt("addrup");
                    }
                    if (jSONObject.has("poiup")) {
                        c.this.f2800m = jSONObject.getInt("poiup");
                    }
                    if (jSONObject.has("oflp")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("oflp");
                        if (jSONObject2.has("0")) {
                            c.this.f2802o = jSONObject2.getDouble("0");
                        }
                        if (jSONObject2.has("1")) {
                            c.this.f2803p = jSONObject2.getDouble("1");
                        }
                        if (jSONObject2.has("2")) {
                            c.this.f2804q = jSONObject2.getDouble("2");
                        }
                        if (jSONObject2.has("3")) {
                            c.this.f2805r = jSONObject2.getDouble("3");
                        }
                        if (jSONObject2.has("4")) {
                            c.this.f2806s = jSONObject2.getDouble("4");
                        }
                    }
                    if (jSONObject.has("onlt")) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("onlt");
                        if (jSONObject3.has("0")) {
                            c.this.f2813z = jSONObject3.getLong("0");
                        }
                        if (jSONObject3.has("1")) {
                            c.this.f2812y = jSONObject3.getLong("1");
                        }
                        if (jSONObject3.has("2")) {
                            c.this.f2809v = jSONObject3.getLong("2");
                        }
                        if (jSONObject3.has("3")) {
                            c.this.f2810w = jSONObject3.getLong("3");
                        }
                        if (jSONObject3.has("4")) {
                            c.this.f2811x = jSONObject3.getLong("4");
                        }
                    }
                    if (jSONObject.has("minapn")) {
                        c.this.f2807t = jSONObject.getInt("minapn");
                    }
                }
                if (this.f2816l == -1) {
                    file.exists();
                }
                long j2 = this.f2816l;
                z2 = j2 != -1 && j2 + 86400000 <= System.currentTimeMillis();
            } catch (Exception unused) {
            }
            if ((this.f2816l == -1 || z2) && k() && i.J(c.this.f2788a.m())) {
                this.f2817m = true;
                if (i.N()) {
                    return;
                }
                m.a.h().postDelayed(new a(), 1000L);
            }
        }

        public final boolean k() {
            if (this.f2814j < 2) {
                return true;
            }
            if (this.f2815k + 86400000 >= System.currentTimeMillis()) {
                return false;
            }
            this.f2814j = 0;
            this.f2815k = -1L;
            return true;
        }
    }

    public c(d dVar, SQLiteDatabase sQLiteDatabase) {
        this.f2788a = dVar;
        this.f2789b = sQLiteDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS BLACK (name VARCHAR(100) PRIMARY KEY);");
            } catch (Exception unused) {
            }
        }
        f();
    }

    public int D() {
        return this.f2800m;
    }

    public double G() {
        return this.f2804q;
    }

    public double J() {
        return this.f2805r;
    }

    public double M() {
        return this.f2806s;
    }

    public double O() {
        return this.f2802o;
    }

    public double Q() {
        return this.f2803p;
    }

    public String[] T() {
        return this.f2796i;
    }

    public boolean V() {
        return this.f2792e;
    }

    public boolean X() {
        return this.f2791d;
    }

    public boolean Z() {
        return this.f2797j;
    }

    public boolean b0() {
        return this.f2808u;
    }

    public boolean d0() {
        return this.f2794g;
    }

    public long e(String str) {
        if (str.equals("2G")) {
            return this.f2809v;
        }
        if (str.equals("3G")) {
            return this.f2810w;
        }
        if (str.equals("4G")) {
            return this.f2811x;
        }
        if (str.equals("WIFI")) {
            return this.f2812y;
        }
        if (str.equals("unknown")) {
            return this.f2813z;
        }
        return 5000L;
    }

    public boolean e0() {
        return this.f2793f;
    }

    public void f() {
        b bVar = this.f2790c;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void g(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (i2 > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append("(\"");
            stringBuffer.append(strArr[i2]);
            stringBuffer.append("\")");
        }
        SQLiteDatabase sQLiteDatabase = this.f2789b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || stringBuffer.length() <= 0) {
            return;
        }
        try {
            this.f2789b.execSQL(String.format(Locale.US, "INSERT OR IGNORE INTO BLACK VALUES %s;", stringBuffer.toString()));
        } catch (Exception unused) {
        }
    }

    public int k() {
        return this.f2801n;
    }

    public int q() {
        return this.f2799l;
    }

    public int x() {
        return this.f2807t;
    }
}
