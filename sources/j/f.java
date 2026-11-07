package j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import b.o;
import b.u;
import b.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f2963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f2964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TelephonyManager f2965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConnectivityManager f2966d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WifiManager f2967e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f2968f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2969g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2970h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2971i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2972j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2973k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2974l = 0;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f2975a = new f();
    }

    public class c extends j.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2976a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2977b = false;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f2979b;

            public a(boolean z2) {
                this.f2979b = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!f.this.f2970h) {
                    f.this.f2970h = this.f2979b;
                }
                o.M().T();
                if (d.i.I().V()) {
                    d.i.I().f2260f.obtainMessage(41).sendToTarget();
                }
                if (System.currentTimeMillis() - u.j() <= 5000) {
                    z.b().i();
                }
            }
        }

        public c() {
        }

        @Override // j.e
        public void a(String str) {
        }

        @Override // j.e
        public boolean b(Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                boolean booleanExtra = intent.getBooleanExtra("resultsUpdated", true);
                f.this.f2972j = System.currentTimeMillis() / 1000;
                if (f.this.f2968f == null) {
                    return true;
                }
                f.this.f2968f.post(new a(booleanExtra));
            } else if (action.equals("android.net.wifi.STATE_CHANGE")) {
                if (!((NetworkInfo) intent.getParcelableExtra("networkInfo")).getState().equals(NetworkInfo.State.CONNECTED) || System.currentTimeMillis() - this.f2976a < 5000) {
                    return false;
                }
                this.f2976a = System.currentTimeMillis();
                if (!this.f2977b) {
                    this.f2977b = true;
                    return false;
                }
                if (f.this.f2968f == null) {
                    return false;
                }
            }
            return true;
        }

        @Override // j.e
        public boolean c(List<CellInfo> list) {
            c.b.d().f();
            return true;
        }
    }

    public static class d implements Comparator<ScanResult> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    public static class e implements Comparator<h> {
        public e() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            return hVar.f2997g - hVar2.f2997g;
        }
    }

    public static f M() {
        return b.f2975a;
    }

    public static List<h> q(List<h> list, int i2) {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list;
        }
        Collections.sort(list.subList(1, list.size()), new e());
        list.size();
        return list.subList(0, Math.min(list.size(), i2));
    }

    public final synchronized String A() {
        String str;
        str = this.f2969g;
        return (str == null || str.length() == 0) ? null : this.f2969g.replace("\n", "");
    }

    public String B(int i2, k kVar) {
        if (kVar.e() < 1) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(512);
        int size = kVar.f3019a.size();
        if (size <= i2) {
            i2 = size;
        }
        boolean z2 = true;
        for (int i3 = 0; i3 < i2; i3++) {
            if (kVar.f3019a.get(i3) != null && kVar.f3019a.get(i3).level != 0 && kVar.f3019a.get(i3).BSSID != null) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append("|");
                }
                stringBuffer.append(kVar.f3019a.get(i3).BSSID.replace(":", ""));
                int i4 = kVar.f3019a.get(i3).level;
                if (i4 < 0) {
                    i4 = -i4;
                }
                stringBuffer.append(String.format(Locale.CHINA, ";%d;", Integer.valueOf(i4)));
            }
        }
        if (z2) {
            return null;
        }
        return stringBuffer.toString();
    }

    public String C(j.a aVar) {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.o(aVar);
        }
        return null;
    }

    public boolean D(long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f2973k;
        if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
            return false;
        }
        this.f2973k = System.currentTimeMillis();
        if (n.i.f3411e != 4) {
            h(0);
        }
        g gVar = this.f2963a;
        return gVar != null && gVar.x() - j2 > 0;
    }

    @SuppressLint({"NewApi"})
    public long F(k kVar) {
        long jElapsedRealtimeNanos;
        long j2;
        List<ScanResult> list = kVar.f3019a;
        if (list == null || list.size() == 0) {
            return 0L;
        }
        try {
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            jElapsedRealtimeNanos = 0;
        }
        boolean z2 = jElapsedRealtimeNanos > 0;
        if (!z2) {
            return 0L;
        }
        int size = kVar.f3019a.size();
        if (size > 16) {
            size = 16;
        }
        long j3 = 2147483647L;
        for (int i2 = 0; i2 < size; i2++) {
            if (kVar.f3019a.get(i2) != null && kVar.f3019a.get(i2).level != 0 && z2) {
                try {
                    j2 = (jElapsedRealtimeNanos - kVar.f3019a.get(i2).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j2 = 0;
                }
                if (j2 < j3) {
                    j3 = j2;
                }
            }
        }
        if (!z2) {
            j3 = 0;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public WifiInfo G() {
        g gVar;
        if (n.i.f3411e == 4 || (gVar = this.f2963a) == null) {
            return null;
        }
        return gVar.a();
    }

    public final String H(String str) {
        if (str != null) {
            return (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str;
        }
        return str;
    }

    public HashSet<String> I(j.a aVar) {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.q(aVar);
        }
        return null;
    }

    public int J(k kVar) {
        int i2;
        for (int i3 = 0; i3 < kVar.e(); i3++) {
            if (kVar.f3019a.get(i3) != null && (i2 = -kVar.f3019a.get(i3).level) > 0) {
                return i2;
            }
        }
        return 0;
    }

    public String K() {
        g gVar = this.f2963a;
        if (gVar == null || n.i.f3411e == 4) {
            return null;
        }
        return gVar.n();
    }

    public String L(j.a aVar) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append(aVar.f2891b + 23);
        stringBuffer.append("H");
        stringBuffer.append(aVar.f2890a + 45);
        stringBuffer.append("K");
        stringBuffer.append(aVar.f2893d + 54);
        stringBuffer.append("Q");
        stringBuffer.append(aVar.f2892c + 203);
        return stringBuffer.toString();
    }

    public final int N() {
        try {
            TelephonyManager telephonyManager = this.f2965c;
            if (telephonyManager != null) {
                return n.i.s(telephonyManager.getSignalStrength(), "getLteRssnr");
            }
        } catch (Exception unused) {
        }
        return Integer.MAX_VALUE;
    }

    public int O() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = this.f2966d;
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            return activeNetworkInfo.getSubtype();
        } catch (Exception unused) {
            return 0;
        }
    }

    public long P() {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.x();
        }
        return 0L;
    }

    public String Q() {
        int simState = -1;
        try {
            TelephonyManager telephonyManager = this.f2965c;
            if (telephonyManager != null) {
                simState = telephonyManager.getSimState();
            }
        } catch (Exception unused) {
        }
        return "&sim=" + simState;
    }

    public List<WifiConfiguration> R() {
        try {
            WifiManager wifiManager = this.f2967e;
            if (wifiManager != null) {
                return wifiManager.getConfiguredNetworks();
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public k S() {
        g gVar = this.f2963a;
        return (gVar == null || n.i.f3411e == 4) ? new k(null, 0L) : gVar.t();
    }

    public String T() {
        k kVarS;
        if (b.d.s().M == 0 || (kVarS = S()) == null || kVarS.e() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ScanResult scanResult : kVarS.f3019a) {
            if (scanResult != null && scanResult.level != 0 && scanResult.BSSID != null) {
                arrayList.add(scanResult);
            }
        }
        Collections.sort(arrayList, new d());
        int iMin = Math.min(b.d.s().O, arrayList.size());
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < iMin; i2++) {
            sb.append(((ScanResult) arrayList.get(i2)).BSSID.replace(":", "") + "," + n(((ScanResult) arrayList.get(i2)).SSID));
            sb.append(";");
        }
        return sb.toString();
    }

    @SuppressLint({"NewApi"})
    public String U() {
        WifiManager wifiManager = this.f2967e;
        if (wifiManager == null) {
            return "";
        }
        try {
            return (wifiManager.isWifiEnabled() || this.f2967e.isScanAlwaysAvailable()) ? "&wifio=1" : "";
        } catch (Exception | NoSuchMethodError unused) {
            return "";
        }
    }

    public void V() {
        if (this.f2963a == null) {
            this.f2963a = new g();
        }
        c cVar = new c();
        this.f2964b = cVar;
        this.f2963a.i(cVar);
    }

    public boolean W() {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.y();
        }
        return false;
    }

    public boolean X() {
        return false;
    }

    public boolean Y() {
        try {
            ConnectivityManager connectivityManager = this.f2966d;
            if (connectivityManager != null) {
                return connectivityManager.getNetworkInfo(1).isConnected();
            }
        } catch (Error | Exception unused) {
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public boolean Z() {
        try {
            return this.f2967e.isWifiEnabled() || this.f2967e.isScanAlwaysAvailable();
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    public int a(CellIdentityNr cellIdentityNr) {
        try {
            return n.i.s(cellIdentityNr, "getHwTac");
        } catch (Throwable unused) {
            return -1;
        }
    }

    public void a0() {
        this.f2974l = 0L;
    }

    public boolean b0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVar = this.f2963a;
        long jX = gVar != null ? gVar.x() : 0L;
        long j2 = jCurrentTimeMillis - jX;
        if (j2 > 0) {
            long j3 = this.f2974l + 5000;
            if (j2 <= j3 || jCurrentTimeMillis - (this.f2972j * 1000) <= j3 || j2 < 25000) {
                return false;
            }
            if (Y() && !X() && j2 <= this.f2974l + 10000) {
                return false;
            }
        }
        return D(jX);
    }

    @SuppressLint({"NewApi"})
    public long c(k kVar) {
        long jElapsedRealtimeNanos;
        long j2;
        List<ScanResult> list = kVar.f3019a;
        if (list == null || list.size() == 0) {
            return 0L;
        }
        try {
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            jElapsedRealtimeNanos = 0;
        }
        boolean z2 = jElapsedRealtimeNanos > 0;
        if (!z2) {
            return 0L;
        }
        int size = kVar.f3019a.size();
        if (size > 16) {
            size = 16;
        }
        long j3 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (kVar.f3019a.get(i2) != null && kVar.f3019a.get(i2).level != 0 && z2) {
                try {
                    j2 = (jElapsedRealtimeNanos - kVar.f3019a.get(i2).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j2 = 0;
                }
                if (j2 > j3) {
                    j3 = j2;
                }
            }
        }
        return j3;
    }

    public boolean c0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.f2971i;
        if (j2 > 0 && j2 <= 5000) {
            return false;
        }
        this.f2971i = jCurrentTimeMillis;
        a0();
        return b0();
    }

    public synchronized void d0() {
        e0();
        if (this.f2963a != null) {
            this.f2963a = null;
        }
        this.f2965c = null;
        this.f2967e = null;
        this.f2964b = null;
    }

    public synchronized j.a e() {
        if (this.f2963a == null) {
            return null;
        }
        s(this.f2965c, n.i.B0, n.i.C0, n.i.D0, n.i.E0);
        return this.f2963a.b(30000);
    }

    public void e0() {
        g gVar = this.f2963a;
        if (gVar != null) {
            gVar.z();
        }
    }

    public j.a f(j.a aVar, TelephonyManager telephonyManager) {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.c(aVar, telephonyManager);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [j.f] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [j.h] */
    /* JADX WARN: Type inference failed for: r7v25, types: [j.h] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v33, types: [j.h] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [j.h] */
    public final h g(CellInfo cellInfo, TelephonyManager telephonyManager) {
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        long jCurrentTimeMillis2;
        try {
            if (cellInfo instanceof CellInfoGsm) {
                h hVar = new h();
                CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                hVar.f2991a = 1;
                if (cellInfo.isRegistered()) {
                    hVar.f2994d = 1;
                }
                hVar.f2992b = cellIdentity.getMccString();
                hVar.f2993c = cellIdentity.getMncString();
                hVar.f2996f = cellInfo.getCellConnectionStatus();
                jElapsedRealtime = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                jCurrentTimeMillis2 = System.currentTimeMillis();
                this = hVar;
            } else {
                CellIdentityNr cellIdentityNr = null;
                if (cellInfo instanceof CellInfoCdma) {
                    h hVar2 = new h();
                    CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                    hVar2.f2991a = 2;
                    hVar2.f2993c = cellIdentity2.getSystemId() != Integer.MAX_VALUE ? String.valueOf(cellIdentity2.getSystemId()) : null;
                    if (cellInfo.isRegistered()) {
                        hVar2.f2994d = 1;
                    }
                    hVar2.f2996f = cellInfo.getCellConnectionStatus();
                    try {
                        String networkOperator = telephonyManager.getNetworkOperator();
                        if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                            hVar2.f2992b = networkOperator.substring(0, 3);
                        }
                    } catch (Exception unused) {
                    }
                    jElapsedRealtime = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                    this = hVar2;
                } else if (cellInfo instanceof CellInfoWcdma) {
                    h hVar3 = new h();
                    CellIdentityWcdma cellIdentity3 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                    hVar3.f2991a = 4;
                    if (cellInfo.isRegistered()) {
                        hVar3.f2994d = 1;
                    }
                    hVar3.f2992b = cellIdentity3.getMccString();
                    hVar3.f2993c = cellIdentity3.getMncString();
                    hVar3.f2996f = cellInfo.getCellConnectionStatus();
                    jElapsedRealtime = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                    this = hVar3;
                } else {
                    if (!(cellInfo instanceof CellInfoTdscdma)) {
                        ?? r9 = cellInfo instanceof CellInfoLte;
                        try {
                            if (r9 != 0) {
                                i iVar = new i();
                                CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                                CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
                                CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
                                iVar.f2991a = 3;
                                if (cellInfo.isRegistered()) {
                                    iVar.f2994d = 1;
                                }
                                iVar.f2998h = cellIdentity4.getCi();
                                iVar.f2999i = cellIdentity4.getPci();
                                iVar.f3000j = cellIdentity4.getTac();
                                iVar.f3008r = cellSignalStrength.getTimingAdvance();
                                iVar.f2992b = cellIdentity4.getMccString();
                                iVar.f2993c = cellIdentity4.getMncString();
                                iVar.f2996f = cellInfo.getCellConnectionStatus();
                                iVar.f3002l = cellIdentity4.getBandwidth();
                                iVar.f3001k = cellIdentity4.getEarfcn();
                                iVar.f3003m = Math.abs(cellSignalStrength.getRssi());
                                iVar.f3004n = Math.abs(cellSignalStrength.getRsrp());
                                iVar.f2997g = Math.abs(cellSignalStrength.getRsrp());
                                iVar.f3005o = cellSignalStrength.getRsrq();
                                int rssnr = cellSignalStrength.getRssnr();
                                if (rssnr == Integer.MAX_VALUE && cellInfo.isRegistered()) {
                                    rssnr = N();
                                }
                                iVar.f3006p = rssnr;
                                iVar.f3007q = cellSignalStrength.getCqi();
                                jCurrentTimeMillis = System.currentTimeMillis() - (SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis());
                                r9 = iVar;
                            } else {
                                if (!(cellInfo instanceof CellInfoNr)) {
                                    return null;
                                }
                                j jVar = new j();
                                try {
                                    cellIdentityNr = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                                CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                if (cellIdentityNr != null) {
                                    jVar.f2991a = 6;
                                    jVar.f2992b = cellIdentityNr.getMccString();
                                    jVar.f2993c = cellIdentityNr.getMncString();
                                    jVar.f3009h = cellIdentityNr.getNci();
                                    jVar.f3010i = cellIdentityNr.getPci();
                                    int tac = cellIdentityNr.getTac();
                                    jVar.f3011j = tac;
                                    if (tac == Integer.MAX_VALUE) {
                                        try {
                                            jVar.f3011j = a(cellIdentityNr);
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    if (jVar.f3011j == Integer.MAX_VALUE) {
                                        try {
                                            jVar.f3011j = y(cellIdentityNr.toString());
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    jVar.f3012k = cellIdentityNr.getNrarfcn();
                                }
                                if (cellInfo.isRegistered()) {
                                    jVar.f2994d = 1;
                                }
                                jVar.f2996f = cellInfo.getCellConnectionStatus();
                                jVar.f3013l = Math.abs(cellSignalStrengthNr.getSsRsrp());
                                jVar.f2997g = Math.abs(cellSignalStrengthNr.getSsRsrp());
                                jVar.f3014m = Math.abs(cellSignalStrengthNr.getSsRsrq());
                                jVar.f3015n = cellSignalStrengthNr.getSsSinr();
                                jVar.f3016o = Math.abs(cellSignalStrengthNr.getCsiRsrp());
                                jVar.f3017p = Math.abs(cellSignalStrengthNr.getCsiRsrq());
                                jVar.f3018q = cellSignalStrengthNr.getCsiSinr();
                                jCurrentTimeMillis = System.currentTimeMillis() - (SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis());
                                r9 = jVar;
                            }
                            r9.f2995e = jCurrentTimeMillis;
                            return r9;
                        } catch (Error unused4) {
                            this = r9;
                            this.f2995e = System.currentTimeMillis();
                            return this;
                        }
                    }
                    h hVar4 = new h();
                    CellIdentityTdscdma cellIdentity5 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                    hVar4.f2991a = 5;
                    if (cellInfo.isRegistered()) {
                        hVar4.f2994d = 1;
                    }
                    hVar4.f2992b = cellIdentity5.getMccString();
                    hVar4.f2993c = cellIdentity5.getMncString();
                    hVar4.f2996f = cellInfo.getCellConnectionStatus();
                    jElapsedRealtime = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                    this = hVar4;
                }
            }
            this.f2995e = jCurrentTimeMillis2 - jElapsedRealtime;
            return this;
        } catch (Error unused5) {
        }
    }

    public k h(int i2) {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.m(i2);
        }
        return null;
    }

    public String i(int i2, k kVar) {
        if (i2 == 0) {
            return null;
        }
        int i3 = 1;
        if (kVar.e() < 1) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(256);
        int size = kVar.f3019a.size();
        int i4 = n.i.L;
        if (size > i4) {
            size = i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            if (kVar.f3019a.get(i6) != null) {
                if ((i3 & i2) != 0 && kVar.f3019a.get(i6).BSSID != null) {
                    stringBuffer.append(i5 == 0 ? "&ssid=" : "|");
                    stringBuffer.append(kVar.f3019a.get(i6).BSSID.replace(":", ""));
                    stringBuffer.append(";");
                    stringBuffer.append(H(kVar.f3019a.get(i6).SSID));
                    i5++;
                }
                i3 <<= 1;
            }
        }
        return stringBuffer.toString();
    }

    public String j(int i2, boolean z2, k kVar, int i3) {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.d(i2, z2, kVar, i3);
        }
        return null;
    }

    public String k(WifiInfo wifiInfo, String str) {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.e(wifiInfo, str);
        }
        return null;
    }

    public String l(j.a aVar) {
        if (this.f2963a == null) {
            return null;
        }
        return this.f2963a.f(aVar) + "&cl_list=" + A();
    }

    public String m(k kVar, int i2, String str, boolean z2, int i3) {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.g(kVar, i2, str, z2, i3);
        }
        return null;
    }

    public final String n(String str) {
        if (str != null && str.length() > b.d.s().N) {
            str = str.substring(0, b.d.s().N);
        }
        if (str != null) {
            return (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str;
        }
        return str;
    }

    public final String o(List<CellInfo> list, TelephonyManager telephonyManager, int i2, int[] iArr, boolean z2, int i3) {
        ArrayList arrayList = new ArrayList();
        if (i2 != 1 && b.d.s().I != 1) {
            return null;
        }
        boolean z3 = b.d.s().I != 1 && z2;
        Iterator<CellInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g(it.next(), telephonyManager));
        }
        return p(q(arrayList, i3), iArr, z3);
    }

    public final String p(List<h> list, int[] iArr, boolean z2) {
        if (list == null || list.size() == 0) {
            return null;
        }
        c1.c cVar = new c1.c();
        for (h hVar : list) {
            c1.b bVar = new c1.b();
            c1.a aVar = new c1.a();
            aVar.r(hVar.f2991a);
            String str = hVar.f2992b;
            if (str != null) {
                aVar.t(d1.a.a(str));
            }
            String str2 = hVar.f2993c;
            if (str2 != null) {
                aVar.u(d1.a.a(str2));
            }
            aVar.v(hVar.f2994d);
            aVar.w(hVar.f2995e);
            int i2 = hVar.f2996f;
            if (i2 != Integer.MAX_VALUE) {
                aVar.s(i2);
            }
            if (!z2) {
                bVar.o(aVar);
            }
            if (hVar instanceof i) {
                c1.d dVar = new c1.d();
                i iVar = (i) hVar;
                int i3 = iVar.f2998h;
                if (i3 != Integer.MAX_VALUE && (!z2 || iArr[0] == 1)) {
                    dVar.C(i3);
                }
                int i4 = iVar.f2999i;
                if (i4 != Integer.MAX_VALUE && (!z2 || iArr[1] == 1)) {
                    dVar.F(i4);
                }
                int i5 = iVar.f3000j;
                if (i5 != Integer.MAX_VALUE && (!z2 || iArr[2] == 1)) {
                    dVar.K(i5);
                }
                int i6 = iVar.f3001k;
                if (i6 != Integer.MAX_VALUE && (!z2 || iArr[3] == 1)) {
                    dVar.E(i6);
                }
                int i7 = iVar.f3002l;
                if (i7 != Integer.MAX_VALUE && (!z2 || iArr[4] == 1)) {
                    dVar.B(i7);
                }
                int i8 = iVar.f3003m;
                if (i8 != Integer.MAX_VALUE && (!z2 || iArr[5] == 1)) {
                    dVar.I(i8);
                }
                int i9 = iVar.f3004n;
                if (i9 != Integer.MAX_VALUE && (!z2 || iArr[6] == 1)) {
                    dVar.G(i9);
                }
                int i10 = iVar.f3005o;
                if (i10 != Integer.MAX_VALUE && (!z2 || iArr[7] == 1)) {
                    dVar.H(i10);
                }
                int i11 = iVar.f3006p;
                if (i11 != Integer.MAX_VALUE && (!z2 || iArr[8] == 1)) {
                    dVar.J(i11);
                }
                int i12 = iVar.f3007q;
                if (i12 != Integer.MAX_VALUE && (!z2 || iArr[9] == 1)) {
                    dVar.D(i12);
                }
                int i13 = iVar.f3008r;
                if (i13 != Integer.MAX_VALUE && (!z2 || iArr[10] == 1)) {
                    dVar.L(i13);
                }
                bVar.p(dVar);
            } else if (hVar instanceof j) {
                c1.e eVar = new c1.e();
                j jVar = (j) hVar;
                long j2 = jVar.f3009h;
                if (j2 != Long.MAX_VALUE && (!z2 || iArr[0] == 1)) {
                    eVar.z(j2);
                }
                int i14 = jVar.f3010i;
                if (i14 != Integer.MAX_VALUE && (!z2 || iArr[1] == 1)) {
                    eVar.E(i14);
                }
                int i15 = jVar.f3011j;
                if (i15 != Integer.MAX_VALUE && (!z2 || iArr[2] == 1)) {
                    eVar.I(i15);
                }
                int i16 = jVar.f3012k;
                if (i16 != Integer.MAX_VALUE && (!z2 || iArr[11] == 1)) {
                    eVar.D(i16);
                }
                int i17 = jVar.f3013l;
                if (i17 != Integer.MAX_VALUE && (!z2 || iArr[12] == 1)) {
                    eVar.F(i17);
                }
                int i18 = jVar.f3014m;
                if (i18 != Integer.MAX_VALUE && (!z2 || iArr[13] == 1)) {
                    eVar.G(i18);
                }
                int i19 = jVar.f3015n;
                if (i19 != Integer.MAX_VALUE && (!z2 || iArr[14] == 1)) {
                    eVar.H(i19);
                }
                int i20 = jVar.f3016o;
                if (i20 != Integer.MAX_VALUE && (!z2 || iArr[15] == 1)) {
                    eVar.A(i20);
                }
                int i21 = jVar.f3017p;
                if (i21 != Integer.MAX_VALUE && (!z2 || iArr[16] == 1)) {
                    eVar.B(i21);
                }
                int i22 = jVar.f3018q;
                if (i22 != Integer.MAX_VALUE && (!z2 || iArr[17] == 1)) {
                    eVar.C(i22);
                }
                bVar.q(eVar);
            }
            cVar.f(bVar);
        }
        return Base64.encodeToString(cVar.d(), 0);
    }

    public synchronized void r(Context context) {
        if (this.f2963a == null) {
            return;
        }
        try {
            this.f2965c = (TelephonyManager) context.getSystemService("phone");
            this.f2967e = (WifiManager) context.getSystemService("wifi");
            this.f2966d = (ConnectivityManager) context.getSystemService("connectivity");
            if (Looper.myLooper() != null) {
                this.f2968f = new Handler();
            }
            this.f2963a.j(g.b.GET_ALL_DATA);
            this.f2963a.u(100);
            this.f2963a.w(2000);
            this.f2963a.p(true);
            this.f2963a.r(30);
            this.f2963a.k(false);
            this.f2963a.h(context, new ArrayList());
        } catch (Exception unused) {
        }
    }

    public final void s(TelephonyManager telephonyManager, int i2, int[] iArr, boolean z2, int i3) {
        if (telephonyManager != null) {
            try {
                this.f2969g = o(telephonyManager.getAllCellInfo(), telephonyManager, i2, iArr, z2, i3);
            } catch (Throwable unused) {
            }
        }
    }

    @SuppressLint({"NewApi"})
    public boolean t(long j2) {
        k kVarS;
        try {
            return (this.f2967e.isWifiEnabled() || this.f2967e.isScanAlwaysAvailable()) && !Y() && (kVarS = S()) != null && w(kVarS, j2);
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    public boolean u(j.a aVar, j.a aVar2) {
        g gVar = this.f2963a;
        if (gVar != null) {
            return gVar.l(aVar, aVar2);
        }
        return false;
    }

    public final boolean w(k kVar, long j2) {
        long jElapsedRealtimeNanos;
        List<ScanResult> list;
        long j3;
        try {
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            jElapsedRealtimeNanos = 0;
        }
        boolean z2 = jElapsedRealtimeNanos > 0;
        if (!z2 || (list = kVar.f3019a) == null || list.size() == 0) {
            return false;
        }
        int size = kVar.f3019a.size();
        if (size > 16) {
            size = 16;
        }
        long j4 = 0;
        long j5 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (kVar.f3019a.get(i2) != null && kVar.f3019a.get(i2).level != 0 && z2) {
                try {
                    j3 = (jElapsedRealtimeNanos - kVar.f3019a.get(i2).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j3 = 0;
                }
                j5 += j3;
                if (j3 > j4) {
                    j4 = j3;
                }
            }
        }
        return j4 * 1000 > j2 || (j5 / ((long) size)) * 1000 > j2;
    }

    public boolean x(k kVar, k kVar2, float f2) {
        boolean zC = kVar2.c(kVar, f2);
        long jCurrentTimeMillis = System.currentTimeMillis() - b.c.f1644i;
        if (jCurrentTimeMillis <= 0 || jCurrentTimeMillis >= 30000 || !zC || z(kVar2) - z(kVar) <= 30) {
            return zC;
        }
        return false;
    }

    public int y(String str) {
        if (str == null || !str.contains("mNrTac")) {
            return -1;
        }
        Matcher matcher = Pattern.compile("mNrTac=(.+?)\\}").matcher(str.replace(" ", ""));
        while (true) {
            int i2 = -1;
            while (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    try {
                        i2 = Integer.parseInt(matcher.group(1));
                    } catch (Throwable unused) {
                    }
                }
            }
            return i2;
        }
    }

    public long z(k kVar) {
        long jElapsedRealtimeNanos;
        long j2;
        if (kVar.e() == 0) {
            return 0L;
        }
        try {
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            jElapsedRealtimeNanos = 0;
        }
        boolean z2 = jElapsedRealtimeNanos > 0;
        if (!z2) {
            return 0L;
        }
        int size = kVar.f3019a.size();
        if (size > 16) {
            size = 16;
        }
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (kVar.f3019a.get(i2) != null && kVar.f3019a.get(i2).level != 0 && z2) {
                try {
                    j2 = (jElapsedRealtimeNanos - kVar.f3019a.get(i2).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j2 = 0;
                }
                j4 += j2;
                j3++;
                if (j2 > j5) {
                    j5 = j2;
                }
            }
        }
        return j3 > 1 ? (j4 - j5) / (j3 - 1) : j5;
    }
}
