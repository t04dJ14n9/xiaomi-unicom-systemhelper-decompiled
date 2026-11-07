package b;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.location.Jni;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TelephonyManager f1692b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WifiManager f1694d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b1.h f1697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f1698h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f1701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1704n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j.a f1693c = new j.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j.k f1695e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1699i = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f1705o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f1706p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f1707q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1708r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1709s = false;

    public class a implements Comparator<d> {
        public a(h hVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            int i2 = dVar.f1719b;
            int i3 = dVar2.f1719b;
            if (i2 > i3) {
                return -1;
            }
            return i2 == i3 ? 0 : 1;
        }
    }

    public interface b {
        void a(b1.c cVar);
    }

    public class c extends n.g {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public LocationManager f1711k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public b f1712l;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f1710j = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1713m = false;

        public class a extends TimerTask {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Timer f1715b;

            public a(Timer timer) {
                this.f1715b = timer;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                c cVar = c.this;
                if (!cVar.f1713m) {
                    cVar.l();
                }
                this.f1715b.cancel();
                this.f1715b.purge();
            }
        }

        public class b implements LocationListener {
            public b() {
            }

            public /* synthetic */ b(c cVar, a aVar) {
                this();
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                c.this.l();
                c.this.f1713m = true;
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

        public c() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            if (h.this.f1700j != null && h.this.f1701k != null) {
                this.f1710j += String.format(Locale.CHINA, "&ki=%s&sn=%s", h.this.f1700j, h.this.f1701k);
            }
            String str = this.f1710j + "&enc=2";
            this.f1710j = str;
            String strJ = Jni.j(str);
            this.f1710j = null;
            this.f3382d.put("bloc", strJ);
            this.f3382d.put("trtm", String.format(Locale.CHINA, "%d", Long.valueOf(System.currentTimeMillis())));
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0046 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #2 {Exception -> 0x004a, blocks: (B:14:0x0030, B:16:0x0046), top: B:43:0x0030, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
        /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:6:0x000c, B:19:0x0052, B:23:0x005c, B:25:0x0066, B:28:0x0078, B:30:0x0085, B:29:0x007c, B:31:0x00c5, B:18:0x004a, B:13:0x002d, B:8:0x0014, B:10:0x001f, B:14:0x0030, B:16:0x0046), top: B:40:0x000c, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0076  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:6:0x000c, B:19:0x0052, B:23:0x005c, B:25:0x0066, B:28:0x0078, B:30:0x0085, B:29:0x007c, B:31:0x00c5, B:18:0x004a, B:13:0x002d, B:8:0x0014, B:10:0x001f, B:14:0x0030, B:16:0x0046), top: B:40:0x000c, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00c5 A[Catch: Exception -> 0x00cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:6:0x000c, B:19:0x0052, B:23:0x005c, B:25:0x0066, B:28:0x0078, B:30:0x0085, B:29:0x007c, B:31:0x00c5, B:18:0x004a, B:13:0x002d, B:8:0x0014, B:10:0x001f, B:14:0x0030, B:16:0x0046), top: B:40:0x000c, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x0030 A[EXC_TOP_SPLITTER, PHI: r6
          0x0030: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v29 java.lang.String) binds: [B:7:0x0012, B:13:0x002d, B:9:0x001d, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
        
            r6 = r5.f3381c;
         */
        @Override // n.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(boolean r6) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.c.h(boolean):void");
        }

        public final void j(b1.c cVar) {
            try {
                if (cVar.M()) {
                    b1.a aVarD = cVar.d();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(aVarD.f1898a);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1899b);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1900c);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1901d);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1902e);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1903f);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1904g);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1905h);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1907j);
                    stringBuffer.append(";");
                    stringBuffer.append(aVarD.f1908k);
                    String strEncodeToString = Base64.encodeToString((System.currentTimeMillis() + "_" + stringBuffer.toString()).getBytes("UTF-8"), 0);
                    SharedPreferences sharedPreferencesB = r.b(h.this.f1691a);
                    if (sharedPreferencesB != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
                        editorEdit.putString("FirstLocAddr", strEncodeToString);
                        editorEdit.apply();
                    }
                }
            } catch (Exception unused) {
            }
        }

        public final void k() {
            try {
                LocationManager locationManager = (LocationManager) h.this.f1691a.getSystemService("location");
                this.f1711k = locationManager;
                b bVar = new b(this, null);
                this.f1712l = bVar;
                if (locationManager != null) {
                    try {
                        locationManager.requestLocationUpdates("network", 1000L, 0.0f, bVar, Looper.getMainLooper());
                    } catch (SecurityException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public final void l() {
            LocationManager locationManager;
            b bVar = this.f1712l;
            if (bVar == null || (locationManager = this.f1711k) == null) {
                return;
            }
            try {
                locationManager.removeUpdates(bVar);
            } catch (Exception unused) {
            }
        }

        public void m(String str) {
            this.f1710j = str;
            b(n.d.f3356b);
            if (h.this.f1708r) {
                k();
                Timer timer = new Timer();
                timer.schedule(new a(timer), 10000L);
                SharedPreferences.Editor editorEdit = h.this.f1691a.getSharedPreferences("cuidRelate", 0).edit();
                editorEdit.putLong("reqtime", System.currentTimeMillis());
                editorEdit.apply();
            }
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1719b;

        public d(h hVar, String str, int i2) {
            this.f1718a = str;
            this.f1719b = i2;
        }
    }

    static {
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.".toCharArray();
    }

    public h(Context context, b1.h hVar, b bVar, String str, boolean z2) {
        StringBuilder sb;
        String str2 = null;
        this.f1691a = null;
        this.f1692b = null;
        this.f1694d = null;
        this.f1696f = null;
        this.f1700j = null;
        this.f1701k = null;
        this.f1702l = null;
        this.f1703m = null;
        this.f1704n = false;
        Context applicationContext = context.getApplicationContext();
        this.f1691a = applicationContext;
        try {
            n.i.f3432o0 = applicationContext.getPackageName();
        } catch (Exception unused) {
        }
        this.f1704n = true;
        this.f1697g = new b1.h(hVar);
        this.f1698h = bVar;
        this.f1702l = this.f1691a.getPackageName();
        this.f1703m = null;
        try {
            this.f1692b = (TelephonyManager) this.f1691a.getSystemService("phone");
            this.f1694d = (WifiManager) this.f1691a.getApplicationContext().getSystemService("wifi");
        } catch (Exception unused2) {
        }
        if (this.f1697g.D == b1.h.a.ACCURACY_IN_FIRST_LOC) {
            j.f.M().r(this.f1691a);
        }
        try {
            this.f1703m = a1.b.B(this.f1691a).A();
        } catch (Throwable unused3) {
            this.f1703m = null;
            this.f1692b = null;
            this.f1694d = null;
        }
        if (this.f1703m != null) {
            n.i.f3425l = "" + this.f1703m;
            sb = new StringBuilder();
            sb.append("&prod=");
            sb.append(this.f1697g.f2005f);
            sb.append(":");
            sb.append(this.f1702l);
            sb.append("|&cu=");
            str2 = this.f1703m;
        } else {
            sb = new StringBuilder();
            sb.append("&prod=");
            sb.append(this.f1697g.f2005f);
            sb.append(":");
            sb.append(this.f1702l);
            sb.append("|&im=");
        }
        sb.append(str2);
        sb.append("&coor=");
        sb.append(hVar.f());
        this.f1696f = sb.toString();
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("&fw=");
        stringBuffer.append("9.521");
        stringBuffer.append("&sdk=");
        stringBuffer.append("9.521");
        stringBuffer.append("&lt=1");
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&resid=");
        stringBuffer.append("12");
        hVar.c();
        if (hVar.c() != null && hVar.c().equals("all")) {
            this.f1696f += "&addr=allj2";
            if (hVar.f2019t) {
                stringBuffer.append("&adtp=n2");
            }
        }
        if (hVar.f2014o || hVar.f2015p) {
            this.f1696f += "&sema=";
            if (hVar.f2014o) {
                this.f1696f += "aptag|";
            }
            if (hVar.f2015p) {
                this.f1696f += "aptagd2|";
            }
            this.f1700j = a.a.b(this.f1691a);
            this.f1701k = a.a.f(this.f1691a);
        }
        stringBuffer.append("&first=1");
        if (z2) {
            stringBuffer.append("&state=fore");
        }
        stringBuffer.append("&os=A");
        stringBuffer.append(Build.VERSION.SDK);
        this.f1696f += stringBuffer.toString();
    }

    public static boolean i(WifiManager wifiManager) {
        try {
            return wifiManager.isWifiEnabled() || wifiManager.isScanAlwaysAvailable();
        } catch (Throwable unused) {
        }
    }

    public final Object a(Object obj, String str) {
        return obj.getClass().getField(str).get(obj);
    }

    public final String b(int i2) {
        String strL;
        String strM;
        j.a aVar;
        try {
            j.a aVarF = j.f.M().f(this.f1693c, this.f1692b);
            this.f1693c = aVarF;
            strL = (aVarF == null || !aVarF.f()) ? null : j.f.M().l(this.f1693c);
            try {
                if (!TextUtils.isEmpty(strL) && (aVar = this.f1693c) != null && aVar.f2902m != null) {
                    strL = strL + this.f1693c.f2902m;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            strL = null;
        }
        try {
            this.f1695e = null;
            if (!i(this.f1694d) || this.f1697g.f2006g == 4) {
                strM = null;
            } else {
                this.f1695e = new j.k(this.f1694d.getScanResults(), 0L);
                strM = j.f.M().m(this.f1695e, i2, o(), this.f1708r, b.a.h().f1615c);
                try {
                    b1.h hVar = this.f1697g;
                    if (hVar != null && hVar.i()) {
                        this.f1694d.startScan();
                    }
                } catch (Exception unused3) {
                }
            }
        } catch (Exception unused4) {
        }
        if (strL == null && strM == null) {
            this.f1699i = null;
            return null;
        }
        if (strM != null) {
            if (strL == null) {
                strL = strM;
            } else {
                strL = strL + strM;
            }
        }
        if (strL == null) {
            return null;
        }
        this.f1699i = strL;
        if (this.f1696f != null) {
            this.f1699i += this.f1696f;
        }
        w();
        return strL + this.f1696f;
    }

    public final String d(List<WifiConfiguration> list) {
        ArrayList<d> arrayList;
        int iIntValue;
        int i2 = 0;
        if (list == null || list.size() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (WifiConfiguration wifiConfiguration : list) {
                String str = wifiConfiguration.SSID;
                try {
                    iIntValue = ((Integer) a(wifiConfiguration, "numAssociation")).intValue();
                } catch (Throwable unused) {
                    iIntValue = 0;
                }
                if (iIntValue > 0 && !TextUtils.isEmpty(str)) {
                    arrayList.add(new d(this, str, iIntValue));
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList, new a(this));
        }
        StringBuffer stringBuffer = new StringBuffer(200);
        for (d dVar : arrayList) {
            stringBuffer.append(dVar.f1718a);
            stringBuffer.append(",");
            stringBuffer.append(dVar.f1719b);
            stringBuffer.append("|");
            i2++;
            if (i2 == 4) {
                break;
            }
        }
        if (arrayList.size() >= 5) {
            stringBuffer.append(((d) arrayList.get(4)).f1718a);
            stringBuffer.append(",");
            stringBuffer.append(((d) arrayList.get(4)).f1719b);
        }
        return stringBuffer.toString();
    }

    public void e() {
        b1.h hVar;
        b1.c cVarA;
        int i2;
        if (this.f1699i == null) {
            int iB = n.i.b(this.f1691a);
            if (iB == -1) {
                i2 = 69;
            } else if (iB == -2) {
                i2 = 70;
            } else {
                i2 = iB == 0 ? 71 : 62;
            }
            m(i2);
            return;
        }
        if (this.f1704n) {
            if (this.f1691a != null) {
                f.k().d(this.f1691a);
                this.f1699i += f.k().h();
            }
            b1.c cVar = null;
            if (this.f1694d != null && (hVar = this.f1697g) != null && hVar.f2003d >= 1000 && !hVar.c().equals("all")) {
                b1.h hVar2 = this.f1697g;
                if (!hVar2.f2014o && !hVar2.f2015p && !hVar2.i()) {
                    try {
                        String strL = this.f1693c != null ? j.f.M().L(this.f1693c) : null;
                        WifiManager wifiManager = this.f1694d;
                        if (wifiManager != null) {
                            cVarA = i.a.p().a(strL, this.f1697g.f2006g != 4 ? wifiManager.getScanResults() : null, false);
                            if (cVarA != null && cVarA.v() == 66 && Math.abs(cVarA.u()) < 0.10000000149011612d && Math.abs(cVarA.x()) < 0.10000000149011612d) {
                                cVarA.o0(67);
                            }
                        } else {
                            cVarA = null;
                        }
                        if (cVarA != null) {
                            cVarA.v();
                        }
                        if (cVarA != null) {
                            cVarA.v();
                        }
                        if (!this.f1697g.f2000a.equals("gcj02") && cVarA != null && cVarA.v() == 66) {
                            double dX = cVarA.x();
                            double dU = cVarA.u();
                            if (Math.abs(dX) > 0.10000000149011612d && Math.abs(dU) > 0.10000000149011612d) {
                                double[] dArrD = Jni.d(dX, dU, this.f1697g.f2000a);
                                cVarA.t0(dArrD[0]);
                                cVarA.n0(dArrD[1]);
                                cVarA.V(this.f1697g.f2000a);
                            }
                        }
                        if (cVarA != null && cVarA.v() == 66 && Math.abs(cVarA.u()) > 0.10000000149011612d && Math.abs(cVarA.x()) > 0.10000000149011612d) {
                            if (!this.f1709s) {
                                this.f1698h.a(cVarA);
                            }
                            cVar = cVarA;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (cVar == null) {
                this.f1705o.m(this.f1699i);
            }
        }
    }

    public final void h(String str) {
        String[] strArrSplit;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("content");
            String string = jSONObject.has("ideocfre") ? jSONObject.getString("ideocfre") : null;
            if (TextUtils.isEmpty(string) || !string.contains("|") || (strArrSplit = string.split("\\|")) == null || strArrSplit.length < 2) {
                return;
            }
            int i2 = Integer.parseInt(strArrSplit[0]);
            long j2 = Long.parseLong(strArrSplit[1]);
            SharedPreferences.Editor editorEdit = this.f1691a.getSharedPreferences("cuidRelate", 0).edit();
            editorEdit.putInt("cuidoc", i2);
            editorEdit.putLong("cuidfreq", j2);
            editorEdit.apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String k() {
        WifiInfo connectionInfo;
        if (this.f1694d == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f1707q > 1000 && (connectionInfo = this.f1694d.getConnectionInfo()) != null) {
            this.f1706p = connectionInfo.getBSSID();
            this.f1707q = jCurrentTimeMillis;
        }
        return this.f1706p;
    }

    public final void m(int i2) {
        b1.h hVar = this.f1697g;
        if (hVar == null || !hVar.i()) {
            return;
        }
        b1.c cVar = new b1.c();
        cVar.o0(i2);
        cVar.r0(Jni.e(this.f1702l + ";" + this.f1703m + ";" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis()))));
        b bVar = this.f1698h;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public String o() {
        try {
            String strK = k();
            String strReplace = strK != null ? strK.replace(":", "") : null;
            if (strReplace == null || strReplace.length() == 12) {
                return new String(strReplace);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String q() {
        try {
            return b(15);
        } catch (Exception unused) {
            return null;
        }
    }

    public final List<WifiConfiguration> r() {
        try {
            WifiManager wifiManager = this.f1694d;
            if (wifiManager != null) {
                return wifiManager.getConfiguredNetworks();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final boolean u() {
        if (b.a.h().f1618f == 0) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f1691a.getApplicationContext().getSharedPreferences("cuidRelate", 0);
        if (!sharedPreferences.contains("isInstalled")) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!n.i.v(this.f1691a, "com.baidu.map.location")) {
                editorEdit.putInt("isInstalled", 0);
                return false;
            }
            editorEdit.putInt("isInstalled", 1);
            editorEdit.apply();
        } else if (sharedPreferences.getInt("isInstalled", -1) == 0) {
            return false;
        }
        return sharedPreferences.getInt("cuidoc", 1) != 0 && (System.currentTimeMillis() - sharedPreferences.getLong("reqtime", 0L)) / 1000 >= sharedPreferences.getLong("cuidfreq", 60L) && n.i.x(this.f1691a) >= 2 && i(this.f1694d) && this.f1695e.e() > 3;
    }

    public void v() {
        q();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    public final void w() {
        String strK;
        if (!u()) {
            this.f1708r = false;
            return;
        }
        this.f1708r = true;
        j.k kVar = this.f1695e;
        if (kVar == null) {
            strK = null;
        } else if (kVar.e() >= 10) {
            String strM = j.f.M().m(this.f1695e, 9, o(), this.f1708r, b.a.h().f1615c);
            if (TextUtils.isEmpty(strM)) {
                strK = null;
            } else {
                strK = n.i.k(strM.getBytes(), false);
            }
        } else {
            j.f fVarM = j.f.M();
            j.k kVar2 = this.f1695e;
            String strM2 = fVarM.m(kVar2, kVar2.e(), o(), this.f1708r, b.a.h().f1615c);
            if (TextUtils.isEmpty(strM2)) {
                strK = null;
            } else {
                strK = n.i.k(strM2.getBytes(), false);
            }
        }
        String strD = d(r());
        String strK2 = TextUtils.isEmpty(strD) ? null : n.i.k(strD.getBytes(), false);
        if (TextUtils.isEmpty(strK)) {
            this.f1708r = false;
        } else {
            this.f1699i += "&swf5=" + strK;
            this.f1708r = true;
        }
        if (TextUtils.isEmpty(strK2)) {
            return;
        }
        this.f1699i += "&hwf5=" + strK2;
        this.f1708r = true;
    }

    public void x() {
        if ((this.f1694d.isWifiEnabled() || this.f1694d.isScanAlwaysAvailable()) && this.f1697g.f2006g != 4) {
            j.f.M().h(0);
        }
        if (n.i.c(this.f1691a, "android.permission.ACCESS_FINE_LOCATION") == 1) {
            j.f.M().e();
        }
    }

    public void y() {
        j.f.M().e0();
    }
}
