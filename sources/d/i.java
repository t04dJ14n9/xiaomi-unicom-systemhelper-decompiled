package d;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import b.n;
import b.t;
import b.w;
import com.baidu.location.Jni;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class i implements SensorEventListener {
    public double A;
    public double B;
    public boolean C;
    public List<l> D;
    public int E;
    public int F;
    public int G;
    public d.a H;
    public String I;
    public d.g J;
    public boolean K;
    public boolean L;
    public d.l M;
    public SimpleDateFormat N;
    public int O;
    public b1.c P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public f T;
    public h U;
    public j V;
    public e W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f2259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f2260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f2261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f2262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d.k.c f2268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d.j f2272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f2273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f2274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d.f<String> f2277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d.f<String> f2279y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public double f2280z;

    public class a implements d.l.b {
    }

    public class b implements d.k.c {
        public b() {
        }

        @Override // d.k.c
        public synchronized void a(double d2, double d3, double d4, long j2, String str) {
            if (i.this.f2263i) {
                i.this.B = 0.4d;
                i.this.U.a(d2, d3, d4, j2);
                double[] dArrD = f.a.d(i.this.f2270p, d2, d3, d4, str);
                if (dArrD != null) {
                    double d5 = dArrD[0];
                    if (d5 != -1.0d && d5 == 0.0d) {
                        i.this.A = dArrD[2];
                        i.this.f2280z = dArrD[1];
                        if (i.this.D.size() > 50) {
                            i.this.D.clear();
                        }
                        i.this.D.add(new l(i.this, d.k.c().n(), d2, d4, d3));
                        i.S(i.this);
                        try {
                            b1.c cVar = new b1.c();
                            cVar.o0(161);
                            cVar.n0(dArrD[2]);
                            cVar.t0(dArrD[1]);
                            cVar.X((float) d4);
                            cVar.G0(i.this.N.format(new Date()));
                            cVar.a0(i.this.f2270p);
                            cVar.T(i.this.f2271q);
                            cVar.U(i.this.f2273s);
                            cVar.y0(i.this.f2275u);
                            cVar.g0(true);
                            if (i.this.K) {
                                cVar.B0(8.0f);
                            } else {
                                cVar.B0(15.0f);
                            }
                            cVar.b0("res", dArrD);
                            cVar.B0((float) dArrD[5]);
                            cVar.X((float) dArrD[6]);
                            cVar.F0((float) dArrD[8]);
                            cVar.w0("dr");
                            b1.c cVar2 = new b1.c(cVar);
                            cVar2.w0("dr2");
                            if (i.this.M == null || !i.this.M.d()) {
                                i.this.p(cVar2, 21);
                            } else {
                                i.this.M.c(cVar2);
                            }
                            if (!i.this.U.g(cVar, dArrD[5], "dr")) {
                                i.this.g0();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    public class c implements g.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2282a;

        public c(String str, String str2) {
            this.f2282a = str2;
        }

        @Override // g.a.d
        public void a(boolean z2, String str) {
            i.this.Q = z2;
            if (z2) {
                i.this.R = f.a.b(this.f2282a);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float[] f2284b;

        public d(i iVar, float[] fArr) {
            this.f2284b = fArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.h.d(this.f2284b[0], System.currentTimeMillis());
        }
    }

    public class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<Double> f2286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<String> f2287c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map<String, Integer> f2292h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2285a = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, Double> f2288d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2289e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2290f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f2291g = null;

        public e(i iVar) {
            this.f2286b = null;
            this.f2287c = null;
            this.f2292h = null;
            this.f2286b = new ArrayList<>();
            this.f2287c = new ArrayList<>();
            this.f2292h = new HashMap();
        }

        public final int a(b1.c cVar) {
            if (!cVar.f().equals(this.f2291g)) {
                this.f2291g = cVar.f();
                i();
            }
            if (h(cVar.F("p_floor")) != 0) {
                this.f2290f = 0;
                return 1;
            }
            try {
                double dDoubleValue = 0.0d;
                if (this.f2287c.size() == 0) {
                    for (Map.Entry<String, Double> entry : this.f2288d.entrySet()) {
                        this.f2287c.add(entry.getKey());
                        this.f2286b.add(entry.getValue());
                    }
                } else {
                    ArrayList<String> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = this.f2287c.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                        arrayList2.add(Double.valueOf(0.0d));
                    }
                    HashMap map = new HashMap();
                    for (Map.Entry<String, Double> entry2 : this.f2288d.entrySet()) {
                        String key = entry2.getKey();
                        Double value = entry2.getValue();
                        map.put(key, value);
                        if (!this.f2287c.contains(key)) {
                            arrayList.add(key);
                            arrayList2.add(value);
                        }
                    }
                    Iterator<Double> it2 = this.f2288d.values().iterator();
                    double dDoubleValue2 = 0.0d;
                    while (it2.hasNext()) {
                        dDoubleValue2 += it2.next().doubleValue();
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        arrayList2.set(i2, map.containsKey(arrayList.get(i2)) ? map.get(arrayList.get(i2)) : Double.valueOf((1.0d - dDoubleValue2) / ((double) (this.f2289e - map.size()))));
                    }
                    ArrayList<Double> arrayList3 = new ArrayList<>();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        arrayList3.add(Double.valueOf(0.0d));
                    }
                    for (int i4 = 0; i4 < this.f2287c.size(); i4++) {
                        Double d2 = this.f2286b.get(i4);
                        ArrayList<Double> arrayListG = g(arrayList, this.f2287c.get(i4));
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            arrayList3.set(i5, Double.valueOf(arrayList3.get(i5).doubleValue() + (d2.doubleValue() * arrayListG.get(i5).doubleValue() * ((Double) arrayList2.get(i5)).doubleValue())));
                        }
                    }
                    this.f2287c = arrayList;
                    this.f2286b = f(arrayList3);
                }
                String str = null;
                for (int i6 = 0; i6 < this.f2287c.size(); i6++) {
                    if (this.f2286b.get(i6).doubleValue() > dDoubleValue) {
                        dDoubleValue = this.f2286b.get(i6).doubleValue();
                        str = this.f2287c.get(i6);
                    }
                }
                this.f2285a = str;
            } catch (Exception unused) {
                this.f2290f = 0;
            }
            this.f2290f = 1;
            return 0;
        }

        public final int c(String str) {
            int i2;
            if (this.f2292h.containsKey(str)) {
                return this.f2292h.get(str).intValue();
            }
            try {
                if (str.startsWith("F") || str.startsWith("f")) {
                    i2 = Integer.parseInt(str.substring(1)) - 1;
                } else {
                    i2 = (str.startsWith("B") || str.startsWith("b")) ? -Integer.parseInt(str.substring(1)) : 1000;
                }
            } catch (Exception unused) {
            }
            this.f2292h.put(str, Integer.valueOf(i2));
            return i2;
        }

        public final String d() {
            return this.f2285a;
        }

        public final ArrayList<Double> f(ArrayList<Double> arrayList) {
            ArrayList<Double> arrayList2 = new ArrayList<>();
            Double dValueOf = Double.valueOf(0.0d);
            Iterator<Double> it = arrayList.iterator();
            while (it.hasNext()) {
                dValueOf = Double.valueOf(dValueOf.doubleValue() + it.next().doubleValue());
            }
            Iterator<Double> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(it2.next().doubleValue() / dValueOf.doubleValue()));
            }
            return arrayList2;
        }

        public final ArrayList<Double> g(ArrayList<String> arrayList, String str) {
            int i2;
            ArrayList<Double> arrayList2 = new ArrayList<>();
            double[] dArr = {180.0d, 10.0d, 1.0d};
            int iC = c(str);
            if (iC == 1000) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Double.valueOf(it.next().equals(str) ? dArr[0] : dArr[2]));
                }
                return arrayList2;
            }
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iC2 = c(it2.next());
                if (iC2 == 1000) {
                    i2 = 2;
                } else {
                    i2 = iC > iC2 ? iC - iC2 : iC2 - iC;
                }
                if (i2 > 2) {
                    i2 = 2;
                }
                arrayList2.add(Double.valueOf(dArr[i2]));
            }
            return arrayList2;
        }

        public final int h(String str) {
            try {
                String[] strArrSplit = str.split(";");
                if (strArrSplit.length <= 1) {
                    return 1;
                }
                this.f2289e = Integer.parseInt(strArrSplit[0]);
                this.f2288d = new HashMap();
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    String[] strArrSplit2 = strArrSplit[i2].split(":");
                    this.f2288d.put(strArrSplit2[0], Double.valueOf(Double.parseDouble(strArrSplit2[1])));
                }
                return 0;
            } catch (Exception unused) {
                return 1;
            }
        }

        public final void i() {
            this.f2286b.clear();
            this.f2287c.clear();
            this.f2292h.clear();
        }
    }

    public class f {
        public f(i iVar) {
        }

        public double a(double d2, double d3, double d4, double d5) {
            double[] dArrB = b(d3, d4);
            double dAbs = Math.abs(d5 - dArrB[0]);
            return dAbs > dArrB[1] * 2.0d ? d2 + dAbs : d2;
        }

        public double[] b(double d2, double d3) {
            return c.a.g().f(d2, d3);
        }
    }

    public class g extends Handler {
        public g() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            if (com.baidu.location.f.f2179f) {
                int i2 = message.what;
                if (i2 == 21) {
                    i.this.n(message);
                    return;
                }
                if (i2 == 41) {
                    i.this.Z();
                } else if (i2 != 801) {
                    super.dispatchMessage(message);
                } else {
                    i.this.o((b1.c) message.obj);
                }
            }
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f2294a = -1.0d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f2295b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f2296c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f2297d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f2298e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f2299f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f2300g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f2301h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f2302i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f2303j = 0.0d;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f2304k = 0.0d;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f2305l = 0.0d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f2306m = 0.0d;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2307n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f2308o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public j.k f2309p = null;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f2310q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2311r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2312s = 0;

        public h() {
        }

        public final void a(double d2, double d3, double d4, long j2) {
            this.f2301h = j2;
            this.f2312s = 0;
        }

        public final void b(Location location, boolean z2) {
            this.f2302i = System.currentTimeMillis();
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();
            double d2 = this.f2303j;
            if (d2 != 0.0d) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.f2304k, d2, latitude, longitude, fArr);
                float f2 = fArr[0];
                if (f2 < 20.0f) {
                    this.f2307n++;
                } else {
                    this.f2307n = 0;
                }
                if (f2 < 5.0f) {
                    this.f2308o++;
                } else {
                    this.f2308o = 0;
                }
            }
            this.f2303j = longitude;
            this.f2304k = latitude;
            if (location.hasSpeed() && location.getSpeed() > 3.0f) {
                this.f2299f = System.currentTimeMillis();
            }
            if (location.getAccuracy() >= 50.0f || z2) {
                this.f2311r = 0;
            } else {
                this.f2311r++;
            }
            if (this.f2311r <= 10 || System.currentTimeMillis() - this.f2295b <= 30000) {
                return;
            }
            i.this.g0();
        }

        public final boolean e() {
            System.currentTimeMillis();
            if (i.this.f2263i || this.f2307n < 3) {
                return false;
            }
            if (!j.f.M().U().contains("&wifio") && i.this.f2255a != 1) {
                return false;
            }
            this.f2312s = 1;
            return true;
        }

        public final boolean f(double d2, double d3, double d4) {
            if (!i.this.U.m()) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.f2297d;
            if (j2 != 0 && jCurrentTimeMillis - j2 > 10000) {
                return true;
            }
            if (this.f2308o >= 5 && d4 < 15.0d && jCurrentTimeMillis - this.f2295b > 20000) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.f2306m, this.f2305l, d3, d2, fArr);
                if (fArr[0] > 30.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean g(b1.c cVar, double d2, String str) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f2300g = jCurrentTimeMillis;
            this.f2294a = d2;
            this.f2305l = cVar.x();
            this.f2306m = cVar.u();
            if (str.equals("wifi")) {
                this.f2295b = jCurrentTimeMillis;
            }
            if (str.equals("gps")) {
                this.f2296c = jCurrentTimeMillis;
            }
            if (l()) {
                this.f2297d = jCurrentTimeMillis;
            }
            i iVar = i.this;
            iVar.f2256b = iVar.u(cVar.x(), cVar.u());
            if (i.this.f2256b || i.this.f2255a == 1) {
                this.f2298e = jCurrentTimeMillis;
            }
            long j2 = this.f2310q;
            if (j2 != 0 && jCurrentTimeMillis - j2 > 30000 && jCurrentTimeMillis - this.f2301h < 10000 && jCurrentTimeMillis - this.f2302i < 10000) {
                return false;
            }
            if (this.f2311r > 10 && jCurrentTimeMillis - this.f2295b > 30000) {
                return false;
            }
            if (jCurrentTimeMillis - this.f2298e > 10000 && jCurrentTimeMillis - this.f2295b > 30000) {
                return false;
            }
            long j3 = this.f2297d;
            return j3 == 0 || jCurrentTimeMillis - j3 <= 60000;
        }

        public final boolean l() {
            if (this.f2312s == 1 || !m() || this.f2294a > 25.0d || System.currentTimeMillis() - this.f2300g > 30000) {
                return false;
            }
            this.f2297d = System.currentTimeMillis();
            return true;
        }

        public final boolean m() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f2299f < 10000 && jCurrentTimeMillis - this.f2295b > 30000) {
                return false;
            }
            if (jCurrentTimeMillis - this.f2302i >= 10000) {
                return true;
            }
            long j2 = this.f2301h;
            return j2 == 0 || jCurrentTimeMillis - j2 <= 16000 || jCurrentTimeMillis - this.f2295b <= 30000;
        }

        public final void o() {
            this.f2294a = -1.0d;
            this.f2295b = 0L;
            this.f2297d = 0L;
            this.f2298e = 0L;
            this.f2299f = 0L;
            this.f2300g = 0L;
            this.f2301h = 0L;
            this.f2302i = 0L;
            this.f2303j = 0.0d;
            this.f2304k = 0.0d;
            this.f2307n = 0;
            this.f2308o = 0;
            this.f2309p = null;
            this.f2310q = 0L;
            this.f2311r = 0;
            this.f2312s = 0;
            this.f2296c = 0L;
        }

        public final void r() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            j.k kVarS = j.f.M().S();
            if (kVarS.f3019a == null) {
                return;
            }
            j.k kVar = this.f2309p;
            if (kVar == null || !kVarS.b(kVar)) {
                this.f2310q = jCurrentTimeMillis;
                this.f2309p = kVarS;
            }
        }
    }

    /* JADX INFO: renamed from: d.i$i, reason: collision with other inner class name */
    public static class C0021i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static i f2314a = new i(null);
    }

    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2315a = 10;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<a> f2316b = Collections.synchronizedList(new ArrayList());

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public double f2318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public double f2319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public double f2320c;
        }

        public j() {
        }

        public String toString() {
            if (this.f2316b.size() == 0) {
                return "";
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                double d2 = this.f2316b.get(0).f2318a;
                double d3 = this.f2316b.get(0).f2319b;
                int i2 = 1;
                stringBuffer.append(String.format("%.6f:%.6f:%.1f", Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(this.f2316b.get(0).f2320c)));
                int size = this.f2316b.size() > this.f2315a ? this.f2316b.size() - this.f2315a : 0;
                while (true) {
                    size += i2;
                    if (size >= this.f2316b.size()) {
                        return stringBuffer.toString();
                    }
                    double d4 = d2;
                    stringBuffer.append(String.format(";%.0f:%.0f:%.1f", Double.valueOf((this.f2316b.get(size).f2318a - d2) * 1000000.0d), Double.valueOf((this.f2316b.get(size).f2319b - d3) * 1000000.0d), Double.valueOf(this.f2316b.get(size).f2320c)));
                    i2 = 1;
                    d2 = d4;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
    }

    public class k extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f2321b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f2322c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f2323d = 0;

        public k() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            i iVar;
            long j2;
            while (this.f2321b) {
                if (i.this.f2255a != 1 || i.this.f2256b) {
                    iVar = i.this;
                    j2 = 3000;
                } else {
                    iVar = i.this;
                    j2 = 5000;
                }
                iVar.f2258d = j2;
                if (System.currentTimeMillis() - this.f2322c > i.this.f2258d) {
                    j.f.M().D(j.f.M().P());
                    this.f2322c = System.currentTimeMillis();
                    i.this.f2259e = false;
                }
                if (j.f.M().Z()) {
                    this.f2323d = 0L;
                } else {
                    long j3 = this.f2323d + 1;
                    this.f2323d = j3;
                    if (j3 >= 10) {
                        this.f2321b = false;
                        i.this.g0();
                        return;
                    }
                }
                if (i.this.f2263i && i.this.U != null && System.currentTimeMillis() - i.this.f2266l > 30000 && System.currentTimeMillis() - i.this.U.f2297d > 30000) {
                    i.I().g0();
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    this.f2321b = false;
                    return;
                }
            }
        }
    }

    public class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f2326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f2327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2328d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f2329e;

        public l(i iVar, int i2, double d2, double d3, double d4) {
            this.f2325a = i2;
            this.f2326b = d2;
            this.f2327c = d3;
            this.f2329e = d4;
        }

        public String toString() {
            return this.f2327c == this.f2329e ? String.format("%d:%.1f:%.2f", Integer.valueOf(this.f2328d), Double.valueOf(this.f2327c), Double.valueOf(this.f2326b)) : String.format("%d:%.1f:%.2f:%.1f", Integer.valueOf(this.f2328d), Double.valueOf(this.f2327c), Double.valueOf(this.f2326b), Double.valueOf(this.f2329e));
        }
    }

    public class m extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2330j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2331k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f2332l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f2333m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f2334n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f2335o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f2336p = 0;

        public class a implements d.g.c {
            public a() {
            }

            @Override // d.g.c
            public void a(boolean z2, String str, String str2, String str3) {
                if (z2) {
                    i.this.I = "&ibuuid=" + str + "&ibname=" + str2 + "&ibfls=" + str3;
                }
            }
        }

        public m() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            if (i.this.f2271q == null || i.this.f2272r == null || !i.this.f2271q.equals(i.this.f2272r.a())) {
                this.f2332l = "&nd_idf=1&indoor_polygon=1" + this.f2332l;
            }
            this.f3380b = 1;
            if (n.a().d()) {
                this.f2332l += "&enc=2";
            }
            String strT = j.f.M().T();
            if (strT != null) {
                this.f3385g = Jni.j(strT);
            }
            String strJ = Jni.j(this.f2332l);
            this.f2332l = null;
            this.f3382d.put("bloc", strJ);
            this.f2335o = System.currentTimeMillis();
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
        
            r8 = r7.f3381c;
         */
        @Override // n.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(boolean r8) {
            /*
                Method dump skipped, instruction units count: 321
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d.i.m.h(boolean):void");
        }

        public synchronized void i() {
            if (this.f2330j) {
                return;
            }
            if (this.f2331k) {
                this.f2331k = false;
                j();
            }
        }

        public void j() {
            boolean z2;
            String str;
            if (this.f2330j) {
                this.f2331k = true;
                return;
            }
            if (i.this.f2255a != 1 || i.this.f2256b || System.currentTimeMillis() - this.f2334n >= 30000 || System.currentTimeMillis() - i.this.U.f2295b <= 30000) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f2335o;
                if (jCurrentTimeMillis >= 1000 || jCurrentTimeMillis <= 0) {
                    StringBuffer stringBuffer = new StringBuffer(1024);
                    String strL = j.f.M().l(j.f.M().e());
                    String strI0 = j.d.l0().i0();
                    stringBuffer.append(j.d.l0().M());
                    i.this.B = 0.5d;
                    if (i.this.J == null || i.this.J.h() == null || !i.this.J.k()) {
                        z2 = false;
                    } else {
                        stringBuffer.append("&bleand=");
                        stringBuffer.append(i.this.J.h());
                        stringBuffer.append("&bleand_et=");
                        stringBuffer.append(i.this.J.i());
                        z2 = true;
                    }
                    j.k kVarS = j.f.M().S();
                    String strL2 = i.this.l(kVarS);
                    if (strL2 == null) {
                        strL2 = j.f.M().j(i.this.f2257c, true, kVarS, n.i.f3436q0);
                    }
                    if (!z2) {
                        if (strL2 == null || strL2.length() < 10) {
                            return;
                        }
                        String str2 = this.f2333m;
                        if (str2 != null && str2.equals(strL2)) {
                            return;
                        }
                    }
                    this.f2333m = strL2;
                    this.f2330j = true;
                    stringBuffer.append(strL);
                    if (strI0 != null) {
                        stringBuffer.append(strI0);
                    }
                    stringBuffer.append("&coor=gcj02");
                    stringBuffer.append("&lt=1");
                    if (strL2 != null && !"null".equals(strL2) && !"".equals(strL2)) {
                        stringBuffer.append(strL2);
                    }
                    String strM = d.k.c().m();
                    if (i.this.F <= 2 && strM != null) {
                        stringBuffer.append("&idsl=" + strM);
                    }
                    int size = i.this.D.size();
                    stringBuffer.append(i.this.h(size));
                    i.this.E = size;
                    i.a(i.this);
                    stringBuffer.append("&drsi=" + i.this.F);
                    stringBuffer.append("&drc=" + i.this.f2269o);
                    if (i.this.f2280z != 0.0d && i.this.A != 0.0d) {
                        stringBuffer.append("&lst_idl=" + String.format(Locale.CHINA, "%.5f:%.5f", Double.valueOf(i.this.f2280z), Double.valueOf(i.this.A)));
                    }
                    i.this.f2269o = 0;
                    stringBuffer.append("&idpfv=1");
                    stringBuffer.append("&iflxy=" + i.this.V.toString());
                    i.this.V.f2316b.clear();
                    i.b(i.this);
                    if (i.this.I != null) {
                        stringBuffer.append(i.this.I);
                        i.this.I = null;
                    }
                    String strO = b.c.r().o();
                    if (strO != null) {
                        stringBuffer.append(strO);
                    }
                    stringBuffer.append(n.b.g().b(true));
                    stringBuffer.append(b.f.k().a());
                    stringBuffer.append(n.i.D(com.baidu.location.f.c()));
                    int iX = n.i.x(com.baidu.location.f.c());
                    if (iX >= 0) {
                        stringBuffer.append("&lmd=");
                        stringBuffer.append(iX);
                    }
                    String string = stringBuffer.toString();
                    this.f2332l = string;
                    if (string.length() > n.i.F0) {
                        String[] strArrSplit = this.f2332l.split("&cl_list=");
                        if (strArrSplit.length == 2) {
                            String[] strArrSplit2 = strArrSplit[1].split("&", 2);
                            if (strArrSplit2.length == 2) {
                                str = strArrSplit[0] + "&cl_list=null&" + strArrSplit2[1];
                            } else {
                                str = strArrSplit[0] + "&cl_list=null";
                            }
                            this.f2332l = str;
                        }
                    }
                    ExecutorService executorServiceA = w.b().a();
                    if (executorServiceA != null) {
                        c(executorServiceA, n.d.f3356b);
                    } else {
                        b(n.d.f3356b);
                    }
                    this.f2334n = System.currentTimeMillis();
                }
            }
        }
    }

    public i() {
        this.f2255a = 0;
        this.f2256b = false;
        this.f2257c = 32;
        this.f2258d = 3000L;
        this.f2260f = null;
        this.f2261g = null;
        this.f2262h = null;
        this.f2263i = false;
        this.f2264j = false;
        this.f2266l = 0L;
        this.f2267m = 0;
        this.f2269o = 0;
        this.f2270p = null;
        this.f2271q = null;
        this.f2272r = null;
        this.f2273s = null;
        this.f2275u = 0;
        this.f2276v = 5;
        this.f2277w = null;
        this.f2278x = 20;
        this.f2279y = null;
        this.f2280z = 0.0d;
        this.A = 0.0d;
        this.D = Collections.synchronizedList(new ArrayList());
        this.E = -1;
        this.F = 0;
        this.G = 0;
        this.I = null;
        this.J = null;
        this.K = false;
        this.L = false;
        this.N = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.O = 2;
        this.P = null;
        this.Q = false;
        this.S = false;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.f2260f = new g();
        try {
            g.a.a(com.baidu.location.f.c());
        } catch (Exception unused) {
        }
        try {
            g.b.b(com.baidu.location.f.c());
        } catch (Exception unused2) {
        }
        d.l lVar = new d.l();
        this.M = lVar;
        lVar.b(1000L);
        this.f2268n = new b();
        this.f2262h = new m();
        this.f2277w = new d.f<>(this.f2276v);
        this.f2279y = new d.f<>(this.f2278x);
        this.H = new d.a(com.baidu.location.f.c());
        this.T = new f(this);
        this.U = new h();
        this.V = new j();
        this.W = new e(this);
    }

    public /* synthetic */ i(a aVar) {
        this();
    }

    public static i I() {
        return C0021i.f2314a;
    }

    public static /* synthetic */ int S(i iVar) {
        int i2 = iVar.f2269o;
        iVar.f2269o = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int a(i iVar) {
        int i2 = iVar.F;
        iVar.F = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int b(i iVar) {
        int i2 = iVar.G;
        iVar.G = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int s0(i iVar) {
        int i2 = iVar.f2267m;
        iVar.f2267m = i2 + 1;
        return i2;
    }

    public final String D() {
        String str;
        d.f<String> fVar;
        e eVar = this.W;
        if (eVar.f2290f == 1 && eVar.f2285a != null) {
            return eVar.d();
        }
        HashMap map = new HashMap();
        int size = this.f2277w.size();
        String str2 = "";
        for (int i2 = 0; i2 < size; i2++) {
            try {
                String str3 = this.f2277w.get(i2);
                str2 = str2 + str3 + "|";
                map.put(str3, map.containsKey(str3) ? Integer.valueOf(((Integer) map.get(str3)).intValue() + 1) : 1);
            } catch (Exception unused) {
                return this.f2270p;
            }
        }
        String str4 = null;
        int iIntValue = -1;
        for (String str5 : map.keySet()) {
            if (((Integer) map.get(str5)).intValue() > iIntValue) {
                iIntValue = ((Integer) map.get(str5)).intValue();
                str4 = str5;
            }
        }
        if (str4 == null || (str = this.f2270p) == null || str4.equals(str) || (fVar = this.f2277w) == null || fVar.size() != this.f2276v) {
            return str4;
        }
        return (this.f2277w.get(size + (-3)).equals(str4) && this.f2277w.get(size + (-2)).equals(str4) && this.f2277w.get(size - 1).equals(str4)) ? str4 : this.f2270p;
    }

    public String M() {
        return this.f2271q;
    }

    public String Q() {
        return this.f2270p;
    }

    public boolean T() {
        return this.S;
    }

    public boolean V() {
        return this.f2263i;
    }

    public boolean X() {
        return this.f2263i && this.U.l();
    }

    public final void Z() {
        if (this.f2263i) {
            this.U.r();
            this.f2262h.j();
            System.currentTimeMillis();
        }
    }

    public final void a0() {
        for (int i2 = this.E; i2 >= 0 && this.D.size() > 0; i2--) {
            this.D.remove(0);
        }
        this.E = -1;
    }

    public final void d0() {
        this.f2277w.clear();
        this.f2279y.clear();
        this.f2267m = 0;
        this.f2275u = 0;
        this.f2270p = null;
        this.f2271q = null;
        this.f2273s = null;
        this.K = false;
        this.L = false;
        this.f2280z = 0.0d;
        this.A = 0.0d;
        this.F = 0;
        this.f2269o = 0;
        this.f2266l = 0L;
        this.U.o();
        f.a.g();
        if (this.Q) {
            g.a.t().f();
        }
        this.Q = false;
        t.c().b(false);
        d.g gVar = this.J;
        if (gVar != null) {
            gVar.m();
        }
    }

    public synchronized void f0() {
        if (this.f2263i) {
            return;
        }
        f.a.f();
        System.currentTimeMillis();
        this.f2266l = System.currentTimeMillis();
        d.k.c().e(this.f2268n);
        k kVar = new k();
        this.f2261g = kVar;
        kVar.start();
        this.f2264j = false;
        this.f2263i = true;
        if (this.J == null) {
            this.J = new d.g(com.baidu.location.f.c());
        }
        this.F = 0;
        this.f2269o = 0;
        t.c().b(true);
    }

    public synchronized void g0() {
        if (this.f2263i) {
            this.f2263i = false;
            d.k.c().i(this.f2268n);
            d.l lVar = this.M;
            if (lVar != null && lVar.d()) {
                this.M.g();
            }
            d.a aVar = this.H;
            if (aVar != null) {
                aVar.n();
            }
            d.g gVar = this.J;
            if (gVar != null) {
                gVar.o();
            }
            k kVar = this.f2261g;
            if (kVar != null) {
                kVar.f2321b = false;
                this.f2261g.interrupt();
                this.f2261g = null;
            }
            d0();
            this.f2264j = false;
            b.c.r().u();
        }
    }

    public final String h(int i2) {
        if (this.D.size() == 0) {
            return "&dr=0:0";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("&dr=");
            this.D.get(0).f2328d = 1;
            sb.append(this.D.get(0).toString());
            int i3 = this.D.get(0).f2325a;
            for (int i4 = 1; i4 < this.D.size() && i4 <= i2; i4++) {
                this.D.get(i4).f2328d = this.D.get(i4).f2325a - i3;
                sb.append(";");
                sb.append(this.D.get(i4).toString());
                i3 = this.D.get(i4).f2325a;
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "&dr=0:0";
        }
    }

    public final String l(j.k kVar) {
        int iE = kVar.e();
        if (iE <= this.f2257c) {
            String strJ = j.f.M().j(this.f2257c, true, kVar, n.i.f3436q0);
            if (strJ == null || "null".equals(strJ)) {
                return "&aprk=0";
            }
            return strJ + "&aprk=0";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < iE; i2++) {
            String lowerCase = kVar.f3019a.get(i2).BSSID.replaceAll(":", "").toLowerCase();
            d.a aVar = this.H;
            if (aVar == null || !aVar.r(lowerCase)) {
                arrayList2.add(kVar.f3019a.get(i2));
            } else {
                arrayList.add(kVar.f3019a.get(i2));
            }
        }
        String str = arrayList.size() > 0 ? "&aprk=3" : "";
        if ("".equals(str)) {
            d.a aVar2 = this.H;
            str = (aVar2 == null || !aVar2.t()) ? "&aprk=1" : "&aprk=2";
        }
        arrayList.addAll(arrayList2);
        kVar.f3019a = arrayList;
        return j.f.M().j(this.f2257c, true, kVar, n.i.f3436q0) + str;
    }

    public synchronized void m() {
        if (this.f2263i) {
            this.f2277w.clear();
        }
    }

    public final void n(Message message) throws Throwable {
        boolean z2;
        d.j jVar;
        if (this.f2263i) {
            this.f2264j = false;
            b1.c cVar = (b1.c) message.obj;
            if (cVar.v() == 161) {
                a0();
                if (cVar.t() != null && cVar.r() != null && ((jVar = this.f2272r) == null || !jVar.a().equals(cVar.f()))) {
                    String[] strArrSplit = cVar.t().split("\\|");
                    Location[] locationArr = new Location[strArrSplit.length];
                    for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                        String[] strArrSplit2 = strArrSplit[i2].split(",");
                        Location location = new Location("gps");
                        location.setLatitude(Double.valueOf(strArrSplit2[1]).doubleValue());
                        location.setLongitude(Double.valueOf(strArrSplit2[0]).doubleValue());
                        locationArr[i2] = location;
                    }
                    this.f2272r = new d.j(cVar.r(), locationArr);
                }
                if (T() && cVar.v() == 161) {
                    if ("ble".equals(cVar.z())) {
                        d.h.c(cVar.x(), cVar.u(), cVar.o(), cVar.q(), System.currentTimeMillis(), d.e.a().c());
                        this.L = true;
                    } else {
                        d.h.c(0.0d, 0.0d, cVar.o(), cVar.q(), System.currentTimeMillis(), d.e.a().c());
                        this.L = false;
                    }
                }
                this.f2267m = 0;
                if (cVar.f() != null && cVar.o() != null) {
                    this.f2264j = true;
                    cVar.g0(true);
                    if (cVar.F("tp") == null || !cVar.F("tp").equalsIgnoreCase("ble")) {
                        this.K = false;
                    } else {
                        cVar.B0(8.0f);
                        cVar.w0("ble");
                        this.K = true;
                    }
                    this.f2271q = cVar.f();
                    this.f2273s = cVar.g();
                    cVar.z();
                    this.f2275u = cVar.P();
                    this.W.a(cVar);
                    String strO = cVar.o();
                    String strD = D();
                    if (strO != null && strD != null && !strO.equals(strD)) {
                        return;
                    }
                    if (this.f2270p == null) {
                        this.f2270p = cVar.o();
                    }
                    g.a.t().g(cVar.x(), cVar.u());
                    t(cVar.g(), cVar.o());
                    if (strO != null && strD != null && !strO.equals(strD)) {
                        return;
                    }
                    if (!strO.equalsIgnoreCase(this.f2270p) && this.Q) {
                        this.U.o();
                        f.a.g();
                        f.a.b(cVar.o());
                    }
                    this.f2270p = cVar.o();
                    double dG = d.k.c().g();
                    if (dG >= 0.0d && cVar.l() <= 0.0f) {
                        cVar.X((float) dG);
                    }
                    double[] dArrE = f.a.e(this.L, cVar);
                    if (dArrE != null) {
                        double d2 = dArrE[0];
                        if (d2 != -1.0d && d2 == 0.0d) {
                            cVar.t0(dArrE[1]);
                            cVar.n0(dArrE[2]);
                            cVar.b0("res", dArrE);
                            cVar.B0((float) dArrE[5]);
                            cVar.X((float) dArrE[6]);
                            cVar.F0((float) dArrE[8]);
                            if (!this.U.g(cVar, dArrE[5], "wifi")) {
                                g0();
                                return;
                            }
                        }
                    }
                } else if (T() && (z2 = this.L)) {
                    double[] dArrE2 = f.a.e(z2, cVar);
                    if (dArrE2 != null) {
                        double d3 = dArrE2[0];
                        if (d3 != -1.0d && d3 == 0.0d) {
                            cVar.t0(dArrE2[1]);
                            cVar.n0(dArrE2[2]);
                            cVar.b0("res", dArrE2);
                            cVar.B0((float) dArrE2[5]);
                            cVar.X((float) dArrE2[6]);
                            cVar.F0((float) dArrE2[8]);
                            if (!this.U.g(cVar, dArrE2[5], "wifi")) {
                                g0();
                                return;
                            }
                        }
                    }
                }
                this.A = cVar.u();
                this.f2280z = cVar.x();
            } else if (cVar.v() == 63) {
                int i3 = this.f2267m + 1;
                this.f2267m = i3;
                if (i3 <= 10) {
                    return;
                } else {
                    g0();
                }
            } else {
                this.f2267m = 0;
            }
            if (this.f2264j) {
                if (cVar.I() == null) {
                    cVar.G0(this.N.format(new Date()));
                }
                b1.c cVar2 = new b1.c(cVar);
                cVar2.w0(cVar2.z() + "2");
                d.l lVar = this.M;
                if (lVar == null || !lVar.d()) {
                    p(cVar2, 21);
                } else {
                    this.M.c(cVar2);
                }
            }
            this.f2262h.i();
        }
    }

    public final void o(b1.c cVar) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 6) {
            return;
        }
        float[] fArr = (float[]) sensorEvent.values.clone();
        if (T()) {
            try {
                this.f2260f.post(new d(this, fArr));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void p(b1.c cVar, int i2) {
        Location locationX;
        if (cVar == null) {
            return;
        }
        if (T()) {
            int iF = d.h.f(2);
            if (iF == 1 || iF == 2) {
                String str = d.h.a(2).split("_")[0];
                if (str != null && !"".equals(str)) {
                    cVar.a0(str.toUpperCase());
                }
                d.d.b().a();
            } else if (iF == 0) {
                cVar.a0(null);
                cVar.T(null);
            }
            if ((iF == 2 || iF == 0) && j.d.l0().x0() && (locationX = j.d.l0().X()) != null) {
                double[] dArrD = Jni.d(locationX.getLongitude(), locationX.getLatitude(), "gps2gcj");
                cVar.t0(dArrD[0]);
                cVar.n0(dArrD[1]);
            }
        }
        if (cVar.z().startsWith("vps")) {
            if (cVar.x() == -1.0d && cVar.u() == -1.0d) {
                cVar.K0(-1);
            } else {
                cVar.K0(1);
            }
            cVar.j0(this.O);
            d.d.b().a();
            b.c.r().n(cVar);
            return;
        }
        if (this.P != null) {
            if (cVar.c() == null && this.P.c() != null) {
                cVar.Q(this.P.d());
                cVar.R(this.P.c());
            }
            if (cVar.B() == null && this.P.B() != null) {
                cVar.z0(this.P.B());
            }
            if (cVar.C() == null && this.P.C() != null) {
                cVar.A0(new b1.j(this.P.C()));
            }
            if (cVar.w() == null && this.P.w() != null) {
                cVar.q0(this.P.w());
            }
            cVar.x0(this.P.A());
            cVar.l0(this.P.O());
        }
        cVar.G0(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis())));
        if (cVar.z().contains("2")) {
            String strZ = cVar.z();
            cVar.w0(strZ.substring(0, strZ.length() - 1));
            cVar.K0(1);
            cVar.j0(this.O);
            d.d.b().a();
            b.c.r().n(cVar);
            b1.c cVar2 = new b1.c(cVar);
            cVar2.B0(this.K ? 8.0f : 15.0f);
            Message messageObtainMessage = this.f2260f.obtainMessage(801);
            messageObtainMessage.obj = cVar2;
            messageObtainMessage.sendToTarget();
        }
    }

    public final void t(String str, String str2) {
        String str3 = this.f2273s;
        if (str3 != null && str3.equals(str) && this.Q) {
            return;
        }
        g.a aVarT = g.a.t();
        aVarT.D("gcj02");
        aVarT.i(str, new c(str, str2));
    }

    public boolean u(double d2, double d3) {
        Map<String, g.b.a> mapC;
        if (!g.b.a().e() || !g.b.a().d() || (mapC = g.b.a().c()) == null) {
            return false;
        }
        String str = null;
        try {
            Iterator<String> it = mapC.keySet().iterator();
            while (it.hasNext()) {
                g.b.a aVar = mapC.get(it.next());
                if (d2 > aVar.f2602e && d2 < aVar.f2600c && d3 > aVar.f2603f && d3 < aVar.f2601d) {
                    str = aVar.f2599b;
                    break;
                }
            }
        } catch (ConcurrentModificationException | Exception e2) {
            e2.printStackTrace();
        }
        return str != null;
    }

    public boolean v(Location location, ArrayList<ArrayList<Float>> arrayList) {
        int size = arrayList.size();
        if (T()) {
            double[] dArrD = Jni.d(location.getLongitude(), location.getLatitude(), "gps2gcj");
            d.h.b(dArrD[0], dArrD[1], location.getAccuracy(), location.getSpeed(), location.getBearing(), location.getAltitude(), size, System.currentTimeMillis());
        }
        if (size == 0 || !j.d.l0().x0() || (!this.f2263i && location.getSpeed() > 3.0f)) {
            return false;
        }
        double[] dArrD2 = Jni.d(location.getLongitude(), location.getLatitude(), "gps2gcj");
        double d2 = dArrD2[0];
        double d3 = dArrD2[1];
        double accuracy = location.getAccuracy();
        location.getBearing();
        double altitude = location.getAltitude();
        location.getSpeed();
        boolean z2 = u(d2, d3) || this.f2255a == 1;
        if (!this.f2263i && !z2) {
            return false;
        }
        try {
            this.U.b(location, z2);
            if (this.U.e()) {
                f0();
                return true;
            }
            if (!V()) {
                return false;
            }
            if (this.U.f(d2, d3, accuracy)) {
                f.a.g();
            }
            this.T.a(accuracy, d2, d3, altitude);
            return false;
        } catch (Exception unused) {
        }
    }

    public boolean w(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        this.f2255a = bundle.getInt("mode");
        return true;
    }
}
