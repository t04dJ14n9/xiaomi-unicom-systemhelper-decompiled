package j;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.GnssNavigationMessage;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import b.o;
import b.u;
import b.y;
import b.z;
import com.baidu.location.Jni;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static d T = null;
    public static Location U = null;
    public static int V = -1;
    public static int W = 0;
    public static int X = 0;
    public static int Y = 0;
    public static int Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static int f2915a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static int f2916b0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static int f2917c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static int f2918d0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static int f2919e0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static int f2920f0 = 0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static long f2921g0 = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static String f2922h0 = null;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static double f2923i0 = 100.0d;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static String f2924j0 = "";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static String f2925k0 = "";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static float f2926l0 = -1.0f;
    public ArrayList<ArrayList<Float>> A;
    public ArrayList<ArrayList<Float>> B;
    public ArrayList<ArrayList<Float>> C;
    public ArrayList<ArrayList<Float>> D;
    public ArrayList<ArrayList<Float>> E;
    public ArrayList<ArrayList<Float>> F;
    public String G;
    public long H;
    public long I;
    public long J;
    public b1.c K;
    public boolean L;
    public boolean M;
    public long N;
    public boolean O;
    public boolean P;
    public long Q;
    public boolean R;
    public long S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2927a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Location f2929c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GpsStatus f2932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2934h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2936j;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f2946t;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList<ArrayList<Float>> f2952z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocationManager f2928b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f2930d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f2931e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0034d f2935i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GpsStatus.NmeaListener f2937k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public OnNmeaMessageListener f2938l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2939m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2940n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2941o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2942p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f2943q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f2944r = 0.0d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f2945s = 0.0d;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f2947u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2948v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f2949w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f2950x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f2951y = null;

    public class a implements OnNmeaMessageListener {
        public a() {
        }

        @Override // android.location.OnNmeaMessageListener
        public void onNmeaMessage(String str, long j2) {
            if (d.this.f2949w != null) {
                d.this.f2949w.sendMessage(d.this.f2949w.obtainMessage(5, str));
            }
        }
    }

    @TargetApi(24)
    public class b extends GnssNavigationMessage.Callback {
        public b() {
        }

        public /* synthetic */ b(d dVar, a aVar) {
            this();
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onGnssNavigationMessageReceived(GnssNavigationMessage gnssNavigationMessage) {
            if (d.this.f2948v != 0) {
                z.b().c(gnssNavigationMessage, d.this.f2948v);
            } else {
                z.b().c(gnssNavigationMessage, System.currentTimeMillis() / 1000);
            }
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onStatusChanged(int i2) {
        }
    }

    @TargetApi(24)
    public class c extends GnssStatus.Callback {
        public c() {
        }

        public /* synthetic */ c(d dVar, a aVar) {
            this();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i2) {
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            ArrayList arrayList;
            if (d.this.f2928b == null || gnssStatus == null) {
                return;
            }
            d.this.f2950x = System.currentTimeMillis();
            int satelliteCount = gnssStatus.getSatelliteCount();
            d.this.C.clear();
            d.this.D.clear();
            d.this.E.clear();
            d.this.F.clear();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < satelliteCount; i5++) {
                i2++;
                ArrayList arrayList2 = new ArrayList();
                int constellationType = gnssStatus.getConstellationType(i5);
                arrayList2.add(Float.valueOf(gnssStatus.getAzimuthDegrees(i5)));
                arrayList2.add(Float.valueOf(gnssStatus.getElevationDegrees(i5)));
                arrayList2.add(Float.valueOf(gnssStatus.getCn0DbHz(i5)));
                if (gnssStatus.usedInFix(i5)) {
                    i3++;
                    arrayList2.add(Float.valueOf(1.0f));
                    if (constellationType == 1) {
                        i4++;
                    }
                } else {
                    arrayList2.add(Float.valueOf(0.0f));
                }
                arrayList2.add(Float.valueOf(gnssStatus.getSvid(i5)));
                if (constellationType == 1) {
                    arrayList2.add(Float.valueOf(1.0f));
                    arrayList = d.this.C;
                } else {
                    if (constellationType == 5) {
                        arrayList2.add(Float.valueOf(2.0f));
                        d.this.D.add(arrayList2);
                        d.this.Q = System.currentTimeMillis();
                    } else if (constellationType == 3) {
                        arrayList2.add(Float.valueOf(3.0f));
                        arrayList = d.this.E;
                    } else if (constellationType == 6) {
                        arrayList2.add(Float.valueOf(4.0f));
                        arrayList = d.this.F;
                    }
                }
                arrayList.add(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(d.this.C);
            arrayList3.addAll(d.this.D);
            arrayList3.addAll(d.this.E);
            arrayList3.addAll(d.this.F);
            d.this.u(arrayList3);
            d dVar = d.this;
            dVar.f2952z = dVar.i(true, false, false, false, true, -1.0f);
            d dVar2 = d.this;
            d.f2924j0 = dVar2.D(dVar2.f2952z);
            d dVar3 = d.this;
            dVar3.A = dVar3.i(true, true, true, true, true, -1.0f);
            d dVar4 = d.this;
            dVar4.B = dVar4.i(true, true, true, true, false, -1.0f);
            d dVar5 = d.this;
            d.f2925k0 = dVar5.D(dVar5.B);
            if (b.d.s().G == 1) {
                b.i.f().d(d.this.B);
            }
            d.W = i3;
            int unused = d.X = i4;
            int unused2 = d.f2920f0 = i2;
            long unused3 = d.f2921g0 = System.currentTimeMillis();
            d dVar6 = d.this;
            int unused4 = d.Y = dVar6.h(dVar6.E, true, -1.0f).size();
            d dVar7 = d.this;
            int unused5 = d.Z = dVar7.h(dVar7.F, true, -1.0f).size();
            d dVar8 = d.this;
            int unused6 = d.f2915a0 = dVar8.h(dVar8.D, true, -1.0f).size();
            d dVar9 = d.this;
            int unused7 = d.f2916b0 = dVar9.h(dVar9.C, false, -1.0f).size();
            d dVar10 = d.this;
            int unused8 = d.f2917c0 = dVar10.h(dVar10.E, false, -1.0f).size();
            d dVar11 = d.this;
            int unused9 = d.f2918d0 = dVar11.h(dVar11.F, false, -1.0f).size();
            d dVar12 = d.this;
            int unused10 = d.f2919e0 = dVar12.h(dVar12.D, false, -1.0f).size();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            d.this.f0(null);
            d.this.H(false);
            d.W = 0;
            int unused = d.X = 0;
            int unused2 = d.Y = 0;
            int unused3 = d.Z = 0;
            int unused4 = d.f2915a0 = 0;
            int unused5 = d.f2916b0 = 0;
            int unused6 = d.f2917c0 = 0;
            int unused7 = d.f2918d0 = 0;
            int unused8 = d.f2919e0 = 0;
            int unused9 = d.f2920f0 = 0;
            int unused10 = d.V = -1;
            Location unused11 = d.U = null;
        }
    }

    /* JADX INFO: renamed from: j.d$d, reason: collision with other inner class name */
    public class C0034d implements GpsStatus.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2956a;

        public C0034d() {
            this.f2956a = 0L;
        }

        public /* synthetic */ C0034d(d dVar, a aVar) {
            this();
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i2) {
            ArrayList arrayList;
            if (d.this.f2928b == null) {
                return;
            }
            int i3 = 0;
            if (i2 == 2) {
                d.this.f0(null);
                d.this.H(false);
                d.W = 0;
                int unused = d.X = 0;
                int unused2 = d.Y = 0;
                int unused3 = d.Z = 0;
                int unused4 = d.f2915a0 = 0;
                return;
            }
            if (i2 == 4 && d.this.f2941o) {
                try {
                    if (d.this.f2932f == null) {
                        d dVar = d.this;
                        dVar.f2932f = dVar.f2928b.getGpsStatus(null);
                    } else {
                        d.this.f2928b.getGpsStatus(d.this.f2932f);
                    }
                    d.this.f2950x = System.currentTimeMillis();
                    d.this.C.clear();
                    d.this.D.clear();
                    d.this.E.clear();
                    d.this.F.clear();
                    int i4 = 0;
                    for (GpsSatellite gpsSatellite : d.this.f2932f.getSatellites()) {
                        ArrayList arrayList2 = new ArrayList();
                        int prn = gpsSatellite.getPrn();
                        arrayList2.add(Float.valueOf(gpsSatellite.getAzimuth()));
                        arrayList2.add(Float.valueOf(gpsSatellite.getElevation()));
                        arrayList2.add(Float.valueOf(gpsSatellite.getSnr()));
                        if (gpsSatellite.usedInFix()) {
                            i3++;
                            arrayList2.add(Float.valueOf(1.0f));
                            if (prn >= 1 && prn <= 32) {
                                i4++;
                            }
                        } else {
                            arrayList2.add(Float.valueOf(0.0f));
                        }
                        arrayList2.add(Float.valueOf(prn));
                        if (prn >= 1 && prn <= 32) {
                            arrayList2.add(Float.valueOf(1.0f));
                            arrayList = d.this.C;
                        } else if (prn >= 201 && prn <= 261) {
                            arrayList2.add(Float.valueOf(2.0f));
                            arrayList = d.this.D;
                        } else if (prn >= 65 && prn <= 96) {
                            arrayList2.add(Float.valueOf(3.0f));
                            arrayList = d.this.E;
                        } else if (prn >= 301 && prn <= 336) {
                            arrayList2.add(Float.valueOf(4.0f));
                            arrayList = d.this.F;
                        }
                        arrayList.add(arrayList2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(d.this.C);
                    arrayList3.addAll(d.this.D);
                    arrayList3.addAll(d.this.E);
                    arrayList3.addAll(d.this.F);
                    d.this.u(arrayList3);
                    d dVar2 = d.this;
                    dVar2.f2952z = dVar2.i(true, false, false, false, true, -1.0f);
                    d dVar3 = d.this;
                    d.f2924j0 = dVar3.D(dVar3.f2952z);
                    d dVar4 = d.this;
                    dVar4.A = dVar4.i(true, true, true, true, true, -1.0f);
                    d dVar5 = d.this;
                    dVar5.B = dVar5.i(true, true, true, true, false, -1.0f);
                    d dVar6 = d.this;
                    d.f2925k0 = dVar6.D(dVar6.B);
                    if (b.d.s().G == 1) {
                        b.i.f().d(d.this.B);
                    }
                    if (i4 > 0) {
                        int unused5 = d.X = i4;
                    }
                    if (i3 > 0 || System.currentTimeMillis() - this.f2956a > 100) {
                        this.f2956a = System.currentTimeMillis();
                        d.W = i3;
                    }
                    long unused6 = d.f2921g0 = System.currentTimeMillis();
                } catch (Exception unused7) {
                }
            }
        }
    }

    public static class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<d> f2958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f2959b;

        public e(d dVar) {
            this.f2958a = new WeakReference<>(dVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Location location;
            String str;
            if (com.baidu.location.f.f2179f) {
                d dVar = this.f2958a.get();
                this.f2959b = dVar;
                if (dVar == null) {
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    Location location2 = (Location) message.obj;
                    this.f2959b.k(location2, b.d.s().G == 1 ? b.i.f().e(location2) : -1);
                    return;
                }
                if (i2 == 3) {
                    location = (Location) message.obj;
                    str = "&og=1";
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                        dVar.G((String) message.obj);
                        return;
                    }
                    location = (Location) message.obj;
                    str = "&og=2";
                }
                dVar.t(str, location);
            }
        }
    }

    public class f implements LocationListener {
        public f() {
        }

        public /* synthetic */ f(d dVar, a aVar) {
            this();
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null && n.i.f3411e == 4) {
                return;
            }
            if (n.i.M()) {
                j.c.d().e(location);
                return;
            }
            if (!n.i.n(location) && Math.abs(location.getLatitude()) <= 360.0d && Math.abs(location.getLongitude()) <= 360.0d) {
                d.this.f2948v = location.getTime() / 1000;
                d.this.I = System.currentTimeMillis();
                if (d.this.f2947u != 0) {
                    d.this.f2946t = System.currentTimeMillis() - d.this.f2947u;
                }
                d.this.f2947u = System.currentTimeMillis();
                int i2 = d.W;
                if (i2 == 0) {
                    try {
                        i2 = location.getExtras().getInt("satellites");
                    } catch (Exception unused) {
                    }
                }
                if (i2 == 0 || o.M().R()) {
                    System.currentTimeMillis();
                    long unused2 = d.this.f2950x;
                }
                d.this.H(true);
                d.this.f0(location);
                d.this.f2940n = false;
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            d.this.f0(null);
            d.this.H(false);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
            if (i2 == 0) {
                d.this.f0(null);
            } else if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                d.this.f2940n = false;
                return;
            } else {
                d.this.f2939m = System.currentTimeMillis();
                d.this.f2940n = true;
            }
            d.this.H(false);
        }
    }

    public class g implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2961a;

        public g() {
            this.f2961a = 0L;
        }

        public /* synthetic */ g(d dVar, a aVar) {
            this();
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (!(d.this.f2941o && n.i.f3411e == 4) && location != null && TextUtils.equals(location.getProvider(), "gps") && System.currentTimeMillis() - this.f2961a >= 10000 && Math.abs(location.getLatitude()) <= 360.0d && Math.abs(location.getLongitude()) <= 360.0d && y.j(location, false)) {
                this.f2961a = System.currentTimeMillis();
                if (d.this.f2949w != null) {
                    d.this.S = System.currentTimeMillis();
                    d.this.f2949w.sendMessage(d.this.f2949w.obtainMessage(4, location));
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    static {
        new ReentrantLock();
    }

    public d() {
        this.f2934h = false;
        this.f2936j = false;
        new ArrayList();
        this.f2952z = new ArrayList<>();
        new ArrayList();
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = null;
        this.H = 0L;
        new ArrayList();
        new LinkedHashMap();
        this.I = -1L;
        this.J = -1L;
        this.L = false;
        this.M = false;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.Q = 0L;
        this.R = false;
        try {
            Class.forName("android.location.GnssStatus");
            this.f2934h = true;
        } catch (ClassNotFoundException unused) {
            this.f2934h = false;
        }
        try {
            String str = Build.MANUFACTURER;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f2936j = false;
    }

    public static String C(Location location) {
        String strZ = Z(location);
        if (strZ == null) {
            return strZ;
        }
        return strZ + "&g_tp=0";
    }

    public static String N(Location location) {
        String strZ = Z(location);
        if (strZ == null) {
            return strZ;
        }
        return strZ + f2922h0;
    }

    public static String Z(Location location) {
        StringBuilder sb;
        if (location == null) {
            return null;
        }
        float speed = (float) (((double) location.getSpeed()) * 3.6d);
        if (!location.hasSpeed()) {
            speed = -1.0f;
        }
        int accuracy = (int) (location.hasAccuracy() ? location.getAccuracy() : -1.0f);
        double altitude = location.hasAltitude() ? location.getAltitude() : 555.0d;
        float bearing = location.hasBearing() ? location.getBearing() : -1.0f;
        String str = f2926l0 < -0.01f ? String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(speed), Float.valueOf(bearing), Integer.valueOf(accuracy), Integer.valueOf(W), Double.valueOf(altitude), Long.valueOf(location.getTime() / 1000), Integer.valueOf(W), Integer.valueOf(X), Integer.valueOf(Y), Integer.valueOf(Z), Integer.valueOf(f2915a0), Integer.valueOf(f2920f0), Integer.valueOf(f2916b0), Integer.valueOf(f2917c0), Integer.valueOf(f2918d0), Integer.valueOf(f2919e0), Double.valueOf(f2923i0)) : String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f&ll_bp=%.2f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(speed), Float.valueOf(bearing), Integer.valueOf(accuracy), Integer.valueOf(W), Double.valueOf(altitude), Long.valueOf(location.getTime() / 1000), Integer.valueOf(W), Integer.valueOf(X), Integer.valueOf(Y), Integer.valueOf(Z), Integer.valueOf(f2915a0), Integer.valueOf(f2920f0), Integer.valueOf(f2916b0), Integer.valueOf(f2917c0), Integer.valueOf(f2918d0), Integer.valueOf(f2919e0), Double.valueOf(f2923i0), Float.valueOf(f2926l0));
        try {
            if (V != 2 || U == null) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("&ll_fake=");
                sb.append(V);
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(String.format(Locale.CHINA, "&ll_fake=%d|%.5f|%.5f|%d", Integer.valueOf(V), Double.valueOf(U.getLongitude()), Double.valueOf(U.getLatitude()), Long.valueOf(U.getTime() / 1000)));
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static String d0() {
        long jCurrentTimeMillis = System.currentTimeMillis() - f2921g0;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis >= 3000) {
            return null;
        }
        return String.format(Locale.US, "&gsvn=%d&gsfn=%d", Integer.valueOf(f2920f0), Integer.valueOf(W));
    }

    public static synchronized d l0() {
        if (T == null) {
            T = new d();
        }
        return T;
    }

    public static boolean w(Location location, Location location2, boolean z2) {
        if (location == location2) {
            return false;
        }
        if (location == null || location2 == null) {
            return true;
        }
        float speed = location2.getSpeed();
        if (z2 && ((n.i.f3439s == 3 || !n.f.b().c(location2.getLongitude(), location2.getLatitude())) && speed < 5.0f)) {
            return true;
        }
        float fDistanceTo = location2.distanceTo(location);
        if (speed > n.i.I) {
            return fDistanceTo > n.i.K;
        }
        if (speed > n.i.H) {
            return fDistanceTo > n.i.J;
        }
        return fDistanceTo > 5.0f;
    }

    public void A0() {
        c cVar;
        if (this.f2941o) {
            LocationManager locationManager = this.f2928b;
            if (locationManager != null) {
                try {
                    C0034d c0034d = this.f2935i;
                    if (c0034d != null) {
                        locationManager.removeGpsStatusListener(c0034d);
                        this.f2935i = null;
                    }
                    if (this.f2934h && (cVar = this.f2933g) != null) {
                        this.f2928b.unregisterGnssStatusCallback(cVar);
                        this.f2933g = null;
                    }
                    g gVar = this.f2931e;
                    if (gVar != null) {
                        this.f2928b.removeUpdates(gVar);
                        this.f2931e = null;
                    }
                } catch (Exception unused) {
                }
                try {
                    f fVar = this.f2930d;
                    if (fVar != null) {
                        this.f2928b.removeUpdates(fVar);
                        this.R = false;
                    }
                    OnNmeaMessageListener onNmeaMessageListener = this.f2938l;
                    if (onNmeaMessageListener != null) {
                        this.f2928b.removeNmeaListener(onNmeaMessageListener);
                    }
                    if (this.f2937k != null) {
                        Class.forName("android.location.LocationManager").getMethod("removeNmeaListener", GpsStatus.NmeaListener.class).invoke(this.f2928b, this.f2937k);
                    }
                    b bVar = this.f2951y;
                    if (bVar != null) {
                        this.f2928b.unregisterGnssNavigationMessageCallback(bVar);
                    }
                    u0(0);
                } catch (Exception unused2) {
                }
            }
            n.i.f3407c = 0;
            n.i.f3439s = 0;
            this.f2930d = null;
            this.f2941o = false;
            H(false);
        }
    }

    public final String D(ArrayList<ArrayList<Float>> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 0) {
            return sb.toString();
        }
        boolean z2 = true;
        for (ArrayList<Float> arrayList2 : arrayList) {
            if (arrayList2.size() == 6) {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append("|");
                }
                sb.append(String.format("%.1f;", arrayList2.get(0)));
                sb.append(String.format("%.1f;", arrayList2.get(1)));
                sb.append(String.format("%.1f;", arrayList2.get(2)));
                sb.append(String.format("%.0f;", arrayList2.get(3)));
                sb.append(String.format("%.0f;", arrayList2.get(4)));
                sb.append(String.format("%.0f", arrayList2.get(5)));
            }
        }
        return sb.toString();
    }

    public synchronized void F() {
        A0();
        if (this.f2928b == null) {
            return;
        }
        try {
            e eVar = this.f2949w;
            if (eVar != null) {
                eVar.removeCallbacksAndMessages(null);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f2928b = null;
        if (b.d.s().G == 1 && b.i.f().h()) {
            b.i.f().c();
        }
    }

    public final void G(String str) {
        if (TextUtils.isEmpty(str) || !y(str)) {
            return;
        }
        if (str.startsWith("$GPGGA,")) {
            s(str, 2, 4, 6);
        } else if (str.startsWith("$GPRMC,")) {
            s(str, 3, 5, 2);
        }
    }

    public final void H(boolean z2) {
        this.f2942p = z2;
        f2926l0 = -1.0f;
    }

    public synchronized String M() {
        String str;
        str = "-2";
        try {
            if (Math.abs(System.currentTimeMillis() - this.H) < 3000) {
                str = this.G;
                if (str == null) {
                    str = "0";
                }
            } else {
                str = "-1";
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "&gnsf=" + str;
    }

    public final int Q(Location location) {
        if (location == null) {
            return 0;
        }
        try {
            if (location.isFromMockProvider()) {
                return 100;
            }
            if (Math.abs(this.I - this.J) >= 3000) {
                this.J = -1L;
                this.M = false;
                this.L = false;
                this.K = null;
            } else if (this.K == null) {
                if (!this.L) {
                    return 200;
                }
                if (this.M) {
                    return 300;
                }
            } else if (!this.M && this.L) {
                return 400;
            }
            if (this.I > 0 && this.J == -1) {
                return 500;
            }
        } catch (Error | Exception unused) {
        }
        return 0;
    }

    public String T() {
        boolean z2;
        if (this.f2929c == null) {
            return null;
        }
        String str = "{\"result\":{\"time\":\"" + n.i.K() + "\",\"error\":\"61\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%d\",\"d\":\"%f\",\"s\":\"%f\",\"n\":\"%d\"";
        int accuracy = (int) (this.f2929c.hasAccuracy() ? this.f2929c.getAccuracy() : 10.0f);
        float speed = (float) (((double) this.f2929c.getSpeed()) * 3.6d);
        if (!this.f2929c.hasSpeed()) {
            speed = -1.0f;
        }
        double[] dArrD = new double[2];
        if (n.f.b().c(this.f2929c.getLongitude(), this.f2929c.getLatitude())) {
            dArrD = Jni.d(this.f2929c.getLongitude(), this.f2929c.getLatitude(), "gps2gcj");
            if (dArrD[0] <= 0.0d && dArrD[1] <= 0.0d) {
                dArrD[0] = this.f2929c.getLongitude();
                dArrD[1] = this.f2929c.getLatitude();
            }
            z2 = true;
        } else {
            dArrD[0] = this.f2929c.getLongitude();
            double latitude = this.f2929c.getLatitude();
            dArrD[1] = latitude;
            if (dArrD[0] <= 0.0d && latitude <= 0.0d) {
                dArrD[0] = this.f2929c.getLongitude();
                dArrD[1] = this.f2929c.getLatitude();
            }
            z2 = false;
        }
        String str2 = String.format(Locale.CHINA, str, Double.valueOf(dArrD[0]), Double.valueOf(dArrD[1]), Integer.valueOf(accuracy), Float.valueOf(this.f2929c.getBearing()), Float.valueOf(speed), Integer.valueOf(W));
        if (!z2) {
            str2 = str2 + ",\"in_cn\":\"0\"";
        }
        if (!n.i.f3423k) {
            str2 = str2 + String.format(Locale.CHINA, ",\"is_mock\":%d", Integer.valueOf(Q(this.f2929c)));
        }
        if (this.f2929c.hasAltitude()) {
            return str2 + String.format(Locale.CHINA, ",\"h\":%.2f}}", Double.valueOf(this.f2929c.getAltitude()));
        }
        return str2 + "}}";
    }

    public Location X() {
        if (this.f2929c != null && Math.abs(System.currentTimeMillis() - this.f2929c.getTime()) <= 60000) {
            return this.f2929c;
        }
        return null;
    }

    public final void f0(Location location) {
        if (this.f2949w == null || System.currentTimeMillis() - this.N <= 3000) {
            return;
        }
        this.f2949w.sendMessage(this.f2949w.obtainMessage(1, location));
    }

    public final ArrayList<ArrayList<Float>> h(ArrayList<ArrayList<Float>> arrayList, boolean z2, float f2) {
        ArrayList<ArrayList<Float>> arrayList2 = new ArrayList<>();
        if (arrayList.size() <= 40 && arrayList.size() != 0) {
            for (ArrayList<Float> arrayList3 : arrayList) {
                if (arrayList3.size() == 6) {
                    float fFloatValue = arrayList3.get(3).floatValue();
                    float fFloatValue2 = arrayList3.get(2).floatValue();
                    if (!z2 || fFloatValue >= 1.0f) {
                        if (f2 <= 0.0f || fFloatValue2 >= f2) {
                            arrayList2.add(arrayList3);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList<ArrayList<Float>> i(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, float f2) {
        ArrayList<ArrayList<Float>> arrayList = new ArrayList<>();
        if (z2) {
            arrayList.addAll(h(this.C, z6, f2));
        }
        if (z3) {
            arrayList.addAll(h(this.D, z6, f2));
        }
        if (z4) {
            arrayList.addAll(h(this.E, z6, f2));
        }
        if (z5) {
            arrayList.addAll(h(this.F, z6, f2));
        }
        return arrayList;
    }

    public String i0() {
        Location location;
        if (!x0() || (location = this.f2929c) == null) {
            return null;
        }
        return String.format("%s&idgps_tp=%s", Z(location).replaceAll("ll", "idll").replaceAll("&d=", "&idd=").replaceAll("&s", "&ids="), this.f2929c.getProvider());
    }

    public synchronized void j() {
        if (com.baidu.location.f.f2179f) {
            Context contextC = com.baidu.location.f.c();
            this.f2927a = contextC;
            try {
                this.f2928b = (LocationManager) contextC.getSystemService("location");
            } catch (Exception unused) {
            }
            this.f2949w = new e(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0151, code lost:
    
        r0.c0("bd_beidou");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.location.Location r12, int r13) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.d.k(android.location.Location, int):void");
    }

    public void l(b1.c cVar) {
        if (n.i.f3423k || Q(this.f2929c) <= 0) {
            b.c.r().k(cVar);
        } else {
            b.c.r().e(cVar);
        }
    }

    public b1.c o0() {
        if (this.K != null && Math.abs(System.currentTimeMillis() - this.J) <= 3000) {
            return this.K;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    public final void s(String str, int i2, int i3, int i4) {
        if (TextUtils.isEmpty(str) || !y(str)) {
            return;
        }
        String[] strArrSplit = str.split(",");
        if (str.startsWith("$GPGGA,")) {
            if (strArrSplit.length < 7) {
                return;
            }
        } else if (str.startsWith("$GPRMC,") && strArrSplit.length < 6) {
            return;
        }
        if (TextUtils.isEmpty(strArrSplit[i2].trim()) || strArrSplit[i2].trim().length() <= 2) {
            this.K = null;
        } else {
            try {
                double dDoubleValue = Double.valueOf(strArrSplit[i2].substring(0, 2)).doubleValue() + (Double.valueOf(strArrSplit[i2].substring(2)).doubleValue() / 60.0d);
                if (this.K == null) {
                    this.K = new b1.c();
                }
                this.K.n0(dDoubleValue);
            } catch (NumberFormatException unused) {
                this.M = true;
            }
        }
        if (this.K == null || TextUtils.isEmpty(strArrSplit[i3].trim()) || strArrSplit[i3].trim().length() <= 3) {
            this.K = null;
        } else {
            try {
                this.K.t0(Double.valueOf(strArrSplit[i3].substring(0, 3)).doubleValue() + (Double.valueOf(strArrSplit[i3].substring(3)).doubleValue() / 60.0d));
            } catch (NumberFormatException unused2) {
                this.M = true;
            }
        }
        if (!TextUtils.isEmpty(strArrSplit[i4].trim())) {
            if (i4 == 2) {
                if (TextUtils.equals(strArrSplit[i4], "V")) {
                    this.L = false;
                } else if (TextUtils.equals(strArrSplit[i4], "A")) {
                    this.L = true;
                }
            } else if (i4 == 6) {
                if (TextUtils.equals(strArrSplit[i4], "0")) {
                    this.L = false;
                } else {
                    this.L = true;
                }
            }
        }
        if (this.K != null) {
            this.M = false;
        }
        this.J = System.currentTimeMillis();
    }

    public boolean s0() {
        return this.R;
    }

    public final void t(String str, Location location) {
        if (location == null) {
            return;
        }
        String str2 = str + b.c.r().o();
        boolean zC0 = j.f.M().c0();
        j.a aVarE = j.f.M().e();
        if (aVarE != null) {
            u.d(new j.a(aVarE));
        }
        u.b(System.currentTimeMillis());
        u.c(new Location(location));
        u.g(str2);
        u.e(b.f.k().a());
        if (zC0) {
            return;
        }
        y.e(u.i(), null, u.h(), str2, u.a());
    }

    public final void u(ArrayList<ArrayList<Float>> arrayList) {
        String string;
        if (arrayList == null || arrayList.size() <= 0) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder(100);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.C);
            sb.append(n.c.a(arrayList2));
            sb.append("|");
            sb.append(n.c.b(arrayList2));
            sb.append("|");
            sb.append(n.c.c(arrayList2));
            sb.append("|");
            sb.append(n.c.h(arrayList2));
            sb.append("|");
            sb.append(n.c.d(arrayList2));
            sb.append("|");
            sb.append(n.c.e(arrayList2));
            sb.append("|");
            sb.append(n.c.f(arrayList2));
            sb.append("|");
            sb.append(n.c.g(arrayList2));
            string = sb.toString();
        }
        this.G = string;
        this.H = System.currentTimeMillis();
    }

    public void u0(int i2) {
        if (i2 == 0) {
            this.P = false;
        } else if (i2 == 2) {
            this.P = false;
            return;
        } else if (i2 != 1) {
            return;
        }
        this.O = false;
    }

    public void v(boolean z2) {
        if (z2) {
            z0();
        } else {
            A0();
        }
    }

    public boolean v0() {
        try {
            System.currentTimeMillis();
            if (W == 0) {
                try {
                    this.f2929c.getExtras().getInt("satellites");
                } catch (Exception unused) {
                }
            }
            Location location = this.f2929c;
            return (location == null || location.getLatitude() == 0.0d || this.f2929c.getLongitude() == 0.0d) ? false : true;
        } catch (Exception unused2) {
            Location location2 = this.f2929c;
            return (location2 == null || location2.getLatitude() == 0.0d || this.f2929c.getLongitude() == 0.0d) ? false : true;
        }
    }

    public boolean x0() {
        if (!v0() || n.i.M() || System.currentTimeMillis() - this.f2943q > 10000) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f2940n || jCurrentTimeMillis - this.f2939m >= 3000) {
            return this.f2942p;
        }
        return true;
    }

    public final boolean y(String str) {
        int i2;
        if (str.indexOf("*") != -1 && str.indexOf("$") != -1 && str.indexOf("$") <= str.indexOf("*") && str.length() >= str.indexOf("*")) {
            byte[] bytes = str.substring(0, str.indexOf("*")).getBytes();
            int i3 = bytes[1];
            for (int i4 = 2; i4 < bytes.length; i4++) {
                i3 ^= bytes[i4];
            }
            String str2 = String.format("%02x", Integer.valueOf(i3));
            int iIndexOf = str.indexOf("*");
            if (iIndexOf != -1 && str.length() >= (i2 = iIndexOf + 3) && str2.equalsIgnoreCase(str.substring(iIndexOf + 1, i2))) {
                return true;
            }
        }
        return false;
    }

    public void z0() {
        if (this.f2941o) {
            return;
        }
        a aVar = null;
        try {
            if (!this.f2934h) {
                C0034d c0034d = new C0034d(this, aVar);
                this.f2935i = c0034d;
                this.f2928b.addGpsStatusListener(c0034d);
            } else if (n.i.c(this.f2927a, "android.permission.ACCESS_FINE_LOCATION") == 1) {
                c cVar = new c(this, aVar);
                this.f2933g = cVar;
                this.f2928b.registerGnssStatusCallback(cVar);
            }
            g gVar = new g(this, aVar);
            this.f2931e = gVar;
            this.f2928b.requestLocationUpdates("passive", 9000L, 0.0f, gVar);
        } catch (Exception unused) {
        }
        try {
            this.f2930d = new f(this, aVar);
            try {
                this.f2928b.sendExtraCommand("gps", "force_xtra_injection", new Bundle());
            } catch (Exception unused2) {
            }
            if (n.i.c(this.f2927a, "android.permission.ACCESS_FINE_LOCATION") == 1) {
                this.f2928b.requestLocationUpdates("gps", 1000L, 0.0f, this.f2930d);
                this.R = true;
            }
            if (this.f2934h && this.f2951y == null && n.i.f3444u0 == 1 && new Random().nextDouble() < n.i.f3442t0) {
                this.f2951y = new b(this, aVar);
            }
            b bVar = this.f2951y;
            if (bVar != null) {
                this.f2928b.registerGnssNavigationMessageCallback(bVar);
            }
            System.currentTimeMillis();
            if (!n.i.f3423k && n.i.N0 == 1) {
                a aVar2 = new a();
                this.f2938l = aVar2;
                this.f2928b.addNmeaListener(aVar2);
            }
            this.f2941o = true;
        } catch (Exception unused3) {
        }
    }
}
