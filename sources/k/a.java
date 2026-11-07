package k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
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
import android.telephony.CellSignalStrengthNr;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import j.g;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class a implements l.a {
    public static int G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f3224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f3225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f3226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f3227t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3210c = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3211d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3212e = 0.2f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3213f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3214g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TelephonyManager f3215h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TelephonyManager f3216i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TelephonyManager f3217j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SubscriptionManager f3218k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j.a f3219l = new j.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j.a f3220m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<j.a> f3221n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Executor f3222o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f3223p = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3228u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3229v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3230w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f3231x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f3232y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3233z = false;
    public boolean A = true;
    public boolean B = false;
    public Handler C = null;
    public int D = -1;
    public int E = -1;
    public final Object F = new Object();

    /* JADX INFO: renamed from: k.a$a, reason: collision with other inner class name */
    public class RunnableC0035a implements Runnable {
        public RunnableC0035a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.K();
                synchronized (a.this.F) {
                    a.this.F.notifyAll();
                    if (l.a.f3262a && l.a.f3263b) {
                        g.v().a("update mCellInfo completed");
                    }
                }
            } catch (Exception e2) {
                if (l.a.f3262a && l.a.f3263b) {
                    g.v().a("handleCellInfo error = " + e2);
                }
            }
        }
    }

    public class b extends TelephonyManager.CellInfoCallback {
        public b() {
        }

        public /* synthetic */ b(a aVar, RunnableC0035a runnableC0035a) {
            this();
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            boolean z2 = l.a.f3262a;
            if (z2 && l.a.f3263b) {
                g.v().a("onCellInfo");
            }
            if (list == null) {
                return;
            }
            boolean z3 = l.a.f3263b;
            if (!z3 || g.v().c(list)) {
                if (z2 && z3) {
                    g.v().a("request sim1 cellInfo");
                }
                if (a.this.f3233z) {
                    a aVar = a.this;
                    aVar.A = !aVar.A;
                }
                if (!a.this.f3233z || a.this.A) {
                    a.this.q();
                }
            }
        }
    }

    public class c extends TelephonyManager.CellInfoCallback {
        public c() {
        }

        public /* synthetic */ c(a aVar, RunnableC0035a runnableC0035a) {
            this();
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            boolean z2 = l.a.f3263b;
            if (!z2 || g.v().c(list)) {
                if (l.a.f3262a && z2) {
                    g.v().a("request sim2 cellInfo");
                }
                if (a.this.f3233z) {
                    a aVar = a.this;
                    aVar.A = !aVar.A;
                }
                if (!a.this.f3233z || a.this.A) {
                    a.this.q();
                }
            }
        }
    }

    public class d extends TelephonyManager.CellInfoCallback {
        public d() {
        }

        public /* synthetic */ d(a aVar, RunnableC0035a runnableC0035a) {
            this();
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            if (!l.a.f3263b || g.v().c(list)) {
                a.this.q();
            }
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onError(int i2, Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            if (l.a.f3262a && l.a.f3263b) {
                g.v().a("cell onError = " + i2);
            }
        }
    }

    public class e extends PhoneStateListener {

        /* JADX INFO: renamed from: k.a$e$a, reason: collision with other inner class name */
        public class RunnableC0036a implements Runnable {
            public RunnableC0036a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (l.a.f3262a && l.a.f3263b) {
                        g.v().a("cell received cellinfo change");
                    }
                    a.this.K();
                } catch (Exception e2) {
                    if (l.a.f3262a) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        public e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(List<CellInfo> list) {
            if (list == null) {
                return;
            }
            a.this.C.post(new RunnableC0036a());
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            j.a aVar;
            int cdmaDbm;
            if (a.this.f3219l != null) {
                if (a.this.f3219l.f2898i != 'g') {
                    if (a.this.f3219l.f2898i == 'c') {
                        aVar = a.this.f3219l;
                        cdmaDbm = signalStrength.getCdmaDbm();
                    }
                    if (l.a.f3262a || !l.a.f3263b) {
                    }
                    g.v().a("cell strength===== cell singal strength changed : " + a.this.f3219l.f2897h);
                    return;
                }
                aVar = a.this.f3219l;
                cdmaDbm = signalStrength.getGsmSignalStrength();
                aVar.f2897h = cdmaDbm;
                if (l.a.f3262a) {
                }
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f3240a = new a();
    }

    public static int a(int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2;
    }

    public static int b(CellIdentityNr cellIdentityNr) {
        try {
            int iA = l.b.a(cellIdentityNr, "getHwTac");
            if (!l.a.f3262a || !l.a.f3263b) {
                return iA;
            }
            g.v().a(" get hw tac = " + iA);
            return iA;
        } catch (Throwable th) {
            if (l.a.f3262a && l.a.f3263b) {
                g.v().a(" get hw tac exception !" + th);
            }
            return -1;
        }
    }

    public static a h() {
        return f.f3240a;
    }

    public static int m(String str) {
        if (str == null || !str.contains("mNrTac")) {
            return -1;
        }
        Matcher matcher = Pattern.compile("mNrTac=(.+?)\\}").matcher(str.replace(" ", ""));
        while (true) {
            int i2 = -1;
            while (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    String strGroup = matcher.group(1);
                    if (l.a.f3262a && l.a.f3263b) {
                        g.v().a(" pasrse mnrtac = " + strGroup);
                    }
                    try {
                        i2 = Integer.parseInt(strGroup);
                    } catch (Throwable th) {
                        if (l.a.f3262a) {
                            th.printStackTrace();
                        }
                    }
                }
            }
            return i2;
        }
    }

    public final String B(j.a aVar) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("&nw2=");
        stringBuffer.append(aVar.f2898i);
        stringBuffer.append(String.format(Locale.CHINA, "&cl2=%d|%d|%d|%d&cl_s2=%d&clp2=%d&cl_t2=%d", Integer.valueOf(aVar.f2892c), Integer.valueOf(aVar.f2893d), Integer.valueOf(aVar.f2890a), Long.valueOf(aVar.f2891b), Integer.valueOf(aVar.f2897h), Integer.valueOf(aVar.f2900k), Long.valueOf(aVar.f2896g)));
        if (aVar.f2899j != Integer.MAX_VALUE) {
            stringBuffer.append("&cl_cs2=");
            stringBuffer.append(aVar.f2899j);
        }
        if (aVar.f2904o != null) {
            stringBuffer.append("&clnrs2=");
            stringBuffer.append(aVar.f2904o);
        }
        return stringBuffer.toString();
    }

    public final void C() {
        if (this.f3224q == null) {
            this.f3224q = new d(this, null);
        }
        Executor executor = this.f3222o;
        if (executor != null) {
            this.f3215h.requestCellInfoUpdate(executor, this.f3224q);
        }
    }

    public final String F(j.a aVar) {
        return String.format(Locale.CHINA, "%d|%d|%d|%d", Integer.valueOf(aVar.f2892c), Integer.valueOf(aVar.f2893d), Integer.valueOf(aVar.f2890a), Long.valueOf(aVar.f2891b));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a9 A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:6:0x000d, B:8:0x0011, B:9:0x001d, B:11:0x002d, B:13:0x0030, B:16:0x0036, B:18:0x0039, B:19:0x003b, B:21:0x0041, B:23:0x0047, B:25:0x004c, B:27:0x0050, B:29:0x0054, B:30:0x0088, B:32:0x008f, B:34:0x0093, B:35:0x0095, B:39:0x00a3, B:40:0x00a5, B:42:0x00a9, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:49:0x00c1, B:51:0x00c7, B:53:0x00cb, B:54:0x00cd, B:58:0x00db, B:59:0x00dd, B:61:0x00e1, B:62:0x00e8, B:64:0x00ec, B:66:0x00f0, B:68:0x00f9, B:55:0x00d2, B:57:0x00d6, B:67:0x00f7, B:36:0x009a, B:38:0x009e, B:48:0x00bf, B:24:0x004a), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1 A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:6:0x000d, B:8:0x0011, B:9:0x001d, B:11:0x002d, B:13:0x0030, B:16:0x0036, B:18:0x0039, B:19:0x003b, B:21:0x0041, B:23:0x0047, B:25:0x004c, B:27:0x0050, B:29:0x0054, B:30:0x0088, B:32:0x008f, B:34:0x0093, B:35:0x0095, B:39:0x00a3, B:40:0x00a5, B:42:0x00a9, B:43:0x00b0, B:45:0x00b4, B:47:0x00b8, B:49:0x00c1, B:51:0x00c7, B:53:0x00cb, B:54:0x00cd, B:58:0x00db, B:59:0x00dd, B:61:0x00e1, B:62:0x00e8, B:64:0x00ec, B:66:0x00f0, B:68:0x00f9, B:55:0x00d2, B:57:0x00d6, B:67:0x00f7, B:36:0x009a, B:38:0x009e, B:48:0x00bf, B:24:0x004a), top: B:97:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0108  */
    public final void G() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        Executor executor;
        TelephonyManager telephonyManager3;
        TelephonyManager telephonyManager4;
        Executor executor2;
        this.f3231x = System.currentTimeMillis();
        if (this.f3213f) {
            boolean z2 = false;
            try {
                if (this.f3218k == null) {
                    this.f3218k = (SubscriptionManager) this.f3227t.getSystemService("telephony_subscription_service");
                }
                int[] subscriptionIds = this.f3218k.getSubscriptionIds(0);
                int[] subscriptionIds2 = this.f3218k.getSubscriptionIds(1);
                int i2 = -1;
                int i3 = (subscriptionIds == null || subscriptionIds.length <= 0) ? -1 : subscriptionIds[0];
                if (subscriptionIds2 != null && subscriptionIds2.length > 0) {
                    i2 = subscriptionIds2[0];
                }
                if (SubscriptionManager.isValidSubscriptionId(i3) && SubscriptionManager.isValidSubscriptionId(i2)) {
                    this.f3233z = true;
                } else {
                    this.f3233z = false;
                }
                if (l.a.f3262a && l.a.f3263b) {
                    g.v().a("getCellInfo: subId0 = " + i3 + ", subId1 = " + i2 + ", mLastSubId0 = " + this.D + ", mLastSubId1 = " + this.E);
                }
                RunnableC0035a runnableC0035a = null;
                if (SubscriptionManager.isValidSubscriptionId(i3)) {
                    if (this.f3216i == null) {
                        telephonyManager3 = this.f3215h;
                    } else if (this.D != i3) {
                        this.f3216i = null;
                        telephonyManager3 = this.f3215h;
                    } else {
                        if (this.f3225r == null) {
                            this.f3225r = new b(this, runnableC0035a);
                        }
                        telephonyManager4 = this.f3216i;
                        if (telephonyManager4 != null && (executor2 = this.f3222o) != null) {
                            telephonyManager4.requestCellInfoUpdate(executor2, this.f3225r);
                            z2 = true;
                        }
                    }
                    this.f3216i = telephonyManager3.createForSubscriptionId(i3);
                    if (this.f3225r == null) {
                        this.f3225r = new b(this, runnableC0035a);
                    }
                    telephonyManager4 = this.f3216i;
                    if (telephonyManager4 != null) {
                        telephonyManager4.requestCellInfoUpdate(executor2, this.f3225r);
                        z2 = true;
                    }
                } else {
                    this.f3216i = null;
                }
                if (SubscriptionManager.isValidSubscriptionId(i2)) {
                    if (this.f3217j == null) {
                        telephonyManager = this.f3215h;
                    } else if (this.E != i2) {
                        this.f3217j = null;
                        telephonyManager = this.f3215h;
                    } else {
                        if (this.f3226s == null) {
                            this.f3226s = new c(this, runnableC0035a);
                        }
                        telephonyManager2 = this.f3217j;
                        if (telephonyManager2 != null && (executor = this.f3222o) != null) {
                            telephonyManager2.requestCellInfoUpdate(executor, this.f3226s);
                            z2 = true;
                        }
                    }
                    this.f3217j = telephonyManager.createForSubscriptionId(i2);
                    if (this.f3226s == null) {
                        this.f3226s = new c(this, runnableC0035a);
                    }
                    telephonyManager2 = this.f3217j;
                    if (telephonyManager2 != null) {
                        telephonyManager2.requestCellInfoUpdate(executor, this.f3226s);
                        z2 = true;
                    }
                } else {
                    this.f3217j = null;
                }
                this.D = i3;
                this.E = i2;
            } catch (Exception e2) {
                if (l.a.f3262a) {
                    e2.printStackTrace();
                }
            }
            if (!z2) {
                C();
            }
        } else {
            C();
        }
        synchronized (this.F) {
            try {
                if (l.a.f3262a && l.a.f3263b) {
                    g.v().a("start waiting update to finish");
                }
                int i4 = this.f3211d;
                if (i4 != 0) {
                    this.F.wait(i4);
                }
            } catch (InterruptedException e3) {
                if (l.a.f3262a) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public void I() {
        TelephonyManager telephonyManager;
        if (this.f3228u) {
            try {
                e eVar = this.f3223p;
                if (eVar != null && (telephonyManager = this.f3215h) != null) {
                    telephonyManager.listen(eVar, 0);
                }
                this.f3223p = null;
                this.f3215h = null;
                this.f3216i = null;
                this.f3217j = null;
                List<j.a> list = this.f3221n;
                if (list != null) {
                    list.clear();
                    this.f3221n = null;
                }
                if (this.f3214g) {
                    L();
                }
            } catch (Exception e2) {
                if (l.a.f3262a) {
                    e2.printStackTrace();
                }
            }
            if (l.a.f3262a && l.a.f3263b) {
                g.v().a("cell manager stop ...");
            }
            this.f3228u = false;
        }
    }

    public final void J(j.a aVar) {
        j.a aVar2;
        j.a aVar3 = this.f3219l;
        if (aVar.f() && ((aVar2 = this.f3219l) == null || !aVar2.b(aVar) || k(this.f3219l, aVar))) {
            this.f3219l = aVar;
        }
        if (aVar.f()) {
            if (aVar3 == null || !aVar3.b(aVar)) {
                if (!aVar.f()) {
                    List<j.a> list = this.f3221n;
                    if (list != null) {
                        list.clear();
                        return;
                    }
                    return;
                }
                int size = this.f3221n.size();
                j.a aVar4 = size == 0 ? null : this.f3221n.get(size - 1);
                if (aVar4 != null) {
                    long j2 = aVar4.f2891b;
                    j.a aVar5 = this.f3219l;
                    if (j2 == aVar5.f2891b && aVar4.f2890a == aVar5.f2890a) {
                        return;
                    }
                }
                this.f3221n.add(this.f3219l);
                if (this.f3221n.size() > 3) {
                    this.f3221n.remove(0);
                }
                if (this.f3214g) {
                    L();
                }
                this.B = false;
            }
        }
    }

    public final synchronized void K() {
        j.a aVarO = o(this.f3219l, this.f3215h);
        if (l.a.f3262a && l.a.f3263b && aVarO != null) {
            g.v().a("new cell api = " + F(aVarO));
        }
        if (aVarO != null) {
            J(aVarO);
        }
    }

    public final void L() {
        List<j.a> list = this.f3221n;
        if (list == null && this.f3220m == null) {
            if (l.a.f3262a && l.a.f3263b) {
                g.v().a("cellbuffer mTrackList == null");
                return;
            }
            return;
        }
        if (list == null && this.f3220m != null) {
            LinkedList linkedList = new LinkedList();
            this.f3221n = linkedList;
            linkedList.add(this.f3220m);
        }
        String strD = l.b.d(this.f3227t);
        if (strD == null || this.f3221n == null) {
            return;
        }
        File file = new File(strD + File.separator + "lcvif2.dat");
        int size = this.f3221n.size();
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeLong(this.f3221n.get(size - 1).f2896g);
            randomAccessFile.writeInt(size);
            for (int i2 = 0; i2 < 3 - size; i2++) {
                randomAccessFile.writeLong(0L);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeLong(-1L);
                randomAccessFile.writeInt(2);
            }
            for (int i3 = 0; i3 < size; i3++) {
                randomAccessFile.writeLong(this.f3221n.get(i3).f2896g);
                randomAccessFile.writeInt(this.f3221n.get(i3).f2892c);
                randomAccessFile.writeInt(this.f3221n.get(i3).f2893d);
                randomAccessFile.writeInt(this.f3221n.get(i3).f2890a);
                randomAccessFile.writeLong(this.f3221n.get(i3).f2891b);
                if (this.f3221n.get(i3).f2898i == 'g') {
                    randomAccessFile.writeInt(1);
                } else if (this.f3221n.get(i3).f2898i == 'c') {
                    randomAccessFile.writeInt(2);
                } else {
                    randomAccessFile.writeInt(3);
                }
            }
            randomAccessFile.close();
        } catch (Exception e2) {
            if (l.a.f3262a) {
                e2.printStackTrace();
            }
        }
    }

    public final int c(String str) {
        if (str != null && str.contains("cl_s2")) {
            try {
                Matcher matcher = Pattern.compile("cl_s2=[0-9]{1,}").matcher(str);
                if (matcher.find()) {
                    String strGroup = matcher.group();
                    return Integer.parseInt(strGroup.substring(strGroup.indexOf("cl_s2=") + 6, strGroup.length()));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0303 A[Catch: Exception -> 0x0454, TRY_LEAVE, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0320 A[Catch: Exception -> 0x0454, TRY_LEAVE, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x033d A[Catch: Exception -> 0x0454, TRY_LEAVE, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0351 A[Catch: all -> 0x0374, TryCatch #1 {all -> 0x0374, blocks: (B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d), top: B:208:0x0349, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x037c A[Catch: Exception -> 0x0454, TRY_LEAVE, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x038c A[Catch: all -> 0x03af, TryCatch #9 {all -> 0x03af, blocks: (B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:223:0x0380, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x03bb A[Catch: Exception -> 0x0454, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x03ce A[Catch: Exception -> 0x0454, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x03f4 A[Catch: Exception -> 0x0454, TRY_LEAVE, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0459  */
    /* JADX WARN: Code duplicated, block: B:174:0x0462 A[Catch: Error -> 0x056c, TRY_ENTER, TryCatch #0 {Error -> 0x056c, blocks: (B:174:0x0462, B:176:0x046f, B:178:0x0473, B:179:0x04c1, B:181:0x04ca, B:182:0x04dd, B:193:0x0568, B:183:0x04e3, B:185:0x04f4, B:187:0x04f8, B:188:0x0546, B:190:0x054f, B:192:0x0553), top: B:206:0x0460 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x04ca A[Catch: Error -> 0x056c, TryCatch #0 {Error -> 0x056c, blocks: (B:174:0x0462, B:176:0x046f, B:178:0x0473, B:179:0x04c1, B:181:0x04ca, B:182:0x04dd, B:193:0x0568, B:183:0x04e3, B:185:0x04f4, B:187:0x04f8, B:188:0x0546, B:190:0x054f, B:192:0x0553), top: B:206:0x0460 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x04e3 A[Catch: Error -> 0x056c, TryCatch #0 {Error -> 0x056c, blocks: (B:174:0x0462, B:176:0x046f, B:178:0x0473, B:179:0x04c1, B:181:0x04ca, B:182:0x04dd, B:193:0x0568, B:183:0x04e3, B:185:0x04f4, B:187:0x04f8, B:188:0x0546, B:190:0x054f, B:192:0x0553), top: B:206:0x0460 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0349 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0326 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0309 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x02bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01dd A[Catch: Exception -> 0x0454, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0235 A[Catch: Exception -> 0x0454, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x023a A[Catch: Exception -> 0x0454, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02b8 A[Catch: Exception -> 0x0454, TRY_LEAVE, TryCatch #8 {Exception -> 0x0454, blocks: (B:64:0x01d8, B:66:0x01dd, B:68:0x01e8, B:70:0x01ec, B:71:0x01f5, B:72:0x022f, B:97:0x02b4, B:73:0x0235, B:75:0x023a, B:77:0x0245, B:79:0x0249, B:80:0x0252, B:88:0x026f, B:96:0x028c, B:93:0x0285, B:95:0x0289, B:85:0x0268, B:87:0x026c, B:98:0x02b8, B:108:0x02f0, B:110:0x02f4, B:112:0x02f8, B:114:0x0303, B:122:0x0320, B:130:0x033d, B:143:0x037c, B:156:0x03b7, B:158:0x03bb, B:159:0x03c1, B:161:0x03ce, B:162:0x03d4, B:164:0x03f4, B:166:0x03fa, B:153:0x03b0, B:155:0x03b4, B:140:0x0375, B:142:0x0379, B:127:0x0336, B:129:0x033a, B:119:0x0319, B:121:0x031d, B:107:0x02ec, B:132:0x0349, B:134:0x0351, B:136:0x0355, B:137:0x036d, B:90:0x0275, B:124:0x0326, B:82:0x0258, B:116:0x0309, B:100:0x02bc, B:102:0x02c9, B:104:0x02cd, B:145:0x0380, B:147:0x038c, B:149:0x0390, B:150:0x03a8), top: B:222:0x01d8, inners: #1, #2, #3, #4, #5, #7, #9 }] */
    public final j.a d(CellInfo cellInfo, j.a aVar, TelephonyManager telephonyManager) {
        boolean z2;
        int iIntValue;
        j.e eVarV;
        StringBuilder sb;
        String str;
        int i2;
        long jElapsedRealtimeNanos;
        boolean z3;
        j.e eVarV2;
        StringBuilder sb2;
        long jElapsedRealtime;
        boolean z4;
        CellIdentityNr cellIdentityNr;
        int iA;
        int iB;
        int iM;
        CellSignalStrengthNr cellSignalStrengthNr;
        CellIdentityNr cellIdentityNr2;
        CellIdentityTdscdma cellIdentity;
        int iIntValue2 = Integer.valueOf(Build.VERSION.SDK_INT).intValue();
        if (iIntValue2 < 17) {
            return null;
        }
        j.a aVar2 = new j.a();
        try {
            if (!(cellInfo instanceof CellInfoGsm)) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                    CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                    boolean z5 = l.a.f3262a;
                    if (z5 && l.a.f3263b) {
                        g.v().a("CellInfoCdma");
                        g.v().a("lat = " + cellIdentity2.getLatitude());
                        g.v().a("lon = " + cellIdentity2.getLongitude());
                    }
                    aVar2.f2894e = cellIdentity2.getLatitude();
                    aVar2.f2895f = cellIdentity2.getLongitude();
                    aVar2.f2893d = a(cellIdentity2.getSystemId());
                    aVar2.f2890a = a(cellIdentity2.getNetworkId());
                    aVar2.f2891b = a(cellIdentity2.getBasestationId());
                    aVar2.f2898i = 'c';
                    aVar2.f2897h = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                    aVar2.f2900k = 1;
                    aVar2.f2899j = cellInfo.getCellConnectionStatus();
                    if (aVar == null || (i2 = aVar.f2892c) <= 0) {
                        try {
                            String networkOperator = telephonyManager.getNetworkOperator();
                            if (networkOperator == null || networkOperator.length() <= 0 || networkOperator.length() < 3 || (iIntValue = Integer.valueOf(networkOperator.substring(0, 3)).intValue()) < 0) {
                                iIntValue = -1;
                            }
                        } catch (Exception e2) {
                            if (l.a.f3262a) {
                                e2.printStackTrace();
                            }
                        }
                        if (iIntValue > 0) {
                            aVar2.f2892c = iIntValue;
                            if (l.a.f3262a && l.a.f3263b) {
                                eVarV = g.v();
                                sb = new StringBuilder();
                                str = "cdma set old mcc = ";
                                sb.append(str);
                                sb.append(aVar2.f2892c);
                                eVarV.a(sb.toString());
                            }
                        }
                    } else {
                        aVar2.f2892c = i2;
                        if (z5 && l.a.f3263b) {
                            eVarV = g.v();
                            sb = new StringBuilder();
                            str = "cdma set old cellinfo mcc = ";
                            sb.append(str);
                            sb.append(aVar2.f2892c);
                            eVarV.a(sb.toString());
                        }
                    }
                    z2 = true;
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                    if (l.a.f3262a && l.a.f3263b) {
                        g.v().a("CellInfoLte");
                    }
                    aVar2.f2892c = a(cellIdentity3.getMcc());
                    aVar2.f2893d = a(cellIdentity3.getMnc());
                    aVar2.f2890a = a(cellIdentity3.getTac());
                    aVar2.f2891b = a(cellIdentity3.getCi());
                    aVar2.f2898i = 'g';
                    aVar2.f2897h = cellInfoLte.getCellSignalStrength().getAsuLevel();
                    aVar2.f2900k = 3;
                } else {
                    z2 = false;
                }
                if (iIntValue2 >= 18 && !z2) {
                    try {
                        if (cellInfo instanceof CellInfoWcdma) {
                            CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                            if (l.a.f3262a && l.a.f3263b) {
                                g.v().a("CellInfoWcdma");
                            }
                            aVar2.f2892c = a(cellIdentity4.getMcc());
                            aVar2.f2893d = a(cellIdentity4.getMnc());
                            aVar2.f2890a = a(cellIdentity4.getLac());
                            aVar2.f2891b = a(cellIdentity4.getCid());
                            aVar2.f2898i = 'g';
                            aVar2.f2897h = ((CellInfoWcdma) cellInfo).getCellSignalStrength().getAsuLevel();
                            aVar2.f2900k = 4;
                        } else {
                            if (cellInfo instanceof CellInfoTdscdma) {
                                cellIdentity = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                                if (l.a.f3262a && l.a.f3263b) {
                                    g.v().a("CellInfoTdscdma");
                                }
                                if (cellIdentity.getMccString() != null) {
                                    try {
                                        aVar2.f2892c = Integer.valueOf(cellIdentity.getMccString()).intValue();
                                    } catch (Throwable th) {
                                        if (l.a.f3262a) {
                                            th.printStackTrace();
                                        }
                                    }
                                }
                                if (cellIdentity.getMncString() != null) {
                                    try {
                                        aVar2.f2893d = Integer.valueOf(cellIdentity.getMncString()).intValue();
                                    } catch (Throwable th2) {
                                        if (l.a.f3262a) {
                                            th2.printStackTrace();
                                        }
                                    }
                                }
                                aVar2.f2890a = a(cellIdentity.getLac());
                                aVar2.f2891b = a(cellIdentity.getCid());
                                aVar2.f2898i = 'g';
                                aVar2.f2897h = ((CellInfoTdscdma) cellInfo).getCellSignalStrength().getAsuLevel();
                                aVar2.f2900k = 5;
                            } else if (cellInfo instanceof CellInfoNr) {
                                try {
                                    cellIdentityNr2 = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                                    if (l.a.f3262a && l.a.f3263b) {
                                        g.v().a(" get cell nr = " + cellIdentityNr2.toString());
                                    }
                                    cellIdentityNr = cellIdentityNr2;
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                    cellIdentityNr = null;
                                }
                                if (l.a.f3262a && l.a.f3263b) {
                                    g.v().a("CellInfoNr");
                                }
                                if (cellIdentityNr != null) {
                                    if (cellIdentityNr.getMccString() != null) {
                                        try {
                                            aVar2.f2892c = Integer.valueOf(cellIdentityNr.getMccString()).intValue();
                                        } catch (Throwable th4) {
                                            if (l.a.f3262a) {
                                                th4.printStackTrace();
                                            }
                                        }
                                        if (cellIdentityNr.getMncString() != null) {
                                            try {
                                                aVar2.f2893d = Integer.valueOf(cellIdentityNr.getMncString()).intValue();
                                            } catch (Throwable th5) {
                                                if (l.a.f3262a) {
                                                    th5.printStackTrace();
                                                }
                                            }
                                            iA = a(cellIdentityNr.getTac());
                                            aVar2.f2890a = iA;
                                            if (iA == -1) {
                                                try {
                                                    iB = b(cellIdentityNr);
                                                    if (l.a.f3262a && l.a.f3263b) {
                                                        g.v().a(" get nrtac for huawei = " + iB);
                                                    }
                                                    aVar2.f2890a = a(iB);
                                                } catch (Throwable th6) {
                                                    if (l.a.f3262a) {
                                                        th6.printStackTrace();
                                                    }
                                                }
                                                if (aVar2.f2890a == -1) {
                                                    try {
                                                        iM = m(cellIdentityNr.toString());
                                                        if (l.a.f3262a && l.a.f3263b) {
                                                            g.v().a(" get nrtac for samsung = " + iM);
                                                        }
                                                        aVar2.f2890a = a(iM);
                                                    } catch (Throwable th7) {
                                                        if (l.a.f3262a) {
                                                            th7.printStackTrace();
                                                        }
                                                    }
                                                }
                                                if (aVar2.f2890a == -1) {
                                                    aVar2.f2890a = cellIdentityNr.getTac();
                                                }
                                                if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                                    aVar2.f2891b = cellIdentityNr.getNci();
                                                }
                                                aVar2.f2898i = 'g';
                                                aVar2.f2900k = 6;
                                                aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                                cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                                aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                                if (aVar2.f()) {
                                                    aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                                }
                                            } else {
                                                if (aVar2.f2890a == -1) {
                                                    iM = m(cellIdentityNr.toString());
                                                    if (l.a.f3262a) {
                                                        g.v().a(" get nrtac for samsung = " + iM);
                                                    }
                                                    aVar2.f2890a = a(iM);
                                                }
                                                if (aVar2.f2890a == -1) {
                                                    aVar2.f2890a = cellIdentityNr.getTac();
                                                }
                                                if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                                    aVar2.f2891b = cellIdentityNr.getNci();
                                                }
                                                aVar2.f2898i = 'g';
                                                aVar2.f2900k = 6;
                                                aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                                cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                                aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                                if (aVar2.f()) {
                                                    aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                                }
                                            }
                                        } else {
                                            iA = a(cellIdentityNr.getTac());
                                            aVar2.f2890a = iA;
                                            if (iA == -1) {
                                                iB = b(cellIdentityNr);
                                                if (l.a.f3262a) {
                                                    g.v().a(" get nrtac for huawei = " + iB);
                                                }
                                                aVar2.f2890a = a(iB);
                                                if (aVar2.f2890a == -1) {
                                                    iM = m(cellIdentityNr.toString());
                                                    if (l.a.f3262a) {
                                                        g.v().a(" get nrtac for samsung = " + iM);
                                                    }
                                                    aVar2.f2890a = a(iM);
                                                }
                                                if (aVar2.f2890a == -1) {
                                                    aVar2.f2890a = cellIdentityNr.getTac();
                                                }
                                                if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                                    aVar2.f2891b = cellIdentityNr.getNci();
                                                }
                                                aVar2.f2898i = 'g';
                                                aVar2.f2900k = 6;
                                                aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                                cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                                aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                                if (aVar2.f()) {
                                                    aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                                }
                                            } else {
                                                if (aVar2.f2890a == -1) {
                                                    iM = m(cellIdentityNr.toString());
                                                    if (l.a.f3262a) {
                                                        g.v().a(" get nrtac for samsung = " + iM);
                                                    }
                                                    aVar2.f2890a = a(iM);
                                                }
                                                if (aVar2.f2890a == -1) {
                                                    aVar2.f2890a = cellIdentityNr.getTac();
                                                }
                                                if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                                    aVar2.f2891b = cellIdentityNr.getNci();
                                                }
                                                aVar2.f2898i = 'g';
                                                aVar2.f2900k = 6;
                                                aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                                cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                                aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                                if (aVar2.f()) {
                                                    aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                                }
                                            }
                                        }
                                    } else if (cellIdentityNr.getMncString() != null) {
                                        aVar2.f2893d = Integer.valueOf(cellIdentityNr.getMncString()).intValue();
                                        iA = a(cellIdentityNr.getTac());
                                        aVar2.f2890a = iA;
                                        if (iA == -1) {
                                            iB = b(cellIdentityNr);
                                            if (l.a.f3262a) {
                                                g.v().a(" get nrtac for huawei = " + iB);
                                            }
                                            aVar2.f2890a = a(iB);
                                            if (aVar2.f2890a == -1) {
                                                iM = m(cellIdentityNr.toString());
                                                if (l.a.f3262a) {
                                                    g.v().a(" get nrtac for samsung = " + iM);
                                                }
                                                aVar2.f2890a = a(iM);
                                            }
                                            if (aVar2.f2890a == -1) {
                                                aVar2.f2890a = cellIdentityNr.getTac();
                                            }
                                            if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                                aVar2.f2891b = cellIdentityNr.getNci();
                                            }
                                            aVar2.f2898i = 'g';
                                            aVar2.f2900k = 6;
                                            aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                            cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                            aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                            if (aVar2.f()) {
                                                aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                            }
                                        } else {
                                            if (aVar2.f2890a == -1) {
                                                iM = m(cellIdentityNr.toString());
                                                if (l.a.f3262a) {
                                                    g.v().a(" get nrtac for samsung = " + iM);
                                                }
                                                aVar2.f2890a = a(iM);
                                            }
                                            if (aVar2.f2890a == -1) {
                                                aVar2.f2890a = cellIdentityNr.getTac();
                                            }
                                            if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                                aVar2.f2891b = cellIdentityNr.getNci();
                                            }
                                            aVar2.f2898i = 'g';
                                            aVar2.f2900k = 6;
                                            aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                            cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                            aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                            if (aVar2.f()) {
                                                aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                            }
                                        }
                                    } else {
                                        iA = a(cellIdentityNr.getTac());
                                        aVar2.f2890a = iA;
                                        if (iA == -1) {
                                            iB = b(cellIdentityNr);
                                            if (l.a.f3262a) {
                                                g.v().a(" get nrtac for huawei = " + iB);
                                            }
                                            aVar2.f2890a = a(iB);
                                            if (aVar2.f2890a == -1) {
                                                iM = m(cellIdentityNr.toString());
                                                if (l.a.f3262a) {
                                                    g.v().a(" get nrtac for samsung = " + iM);
                                                }
                                                aVar2.f2890a = a(iM);
                                            }
                                            if (aVar2.f2890a == -1) {
                                                aVar2.f2890a = cellIdentityNr.getTac();
                                            }
                                            if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                                aVar2.f2891b = cellIdentityNr.getNci();
                                            }
                                            aVar2.f2898i = 'g';
                                            aVar2.f2900k = 6;
                                            aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                            cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                            aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                            if (aVar2.f()) {
                                                aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                            }
                                        } else {
                                            if (aVar2.f2890a == -1) {
                                                iM = m(cellIdentityNr.toString());
                                                if (l.a.f3262a) {
                                                    g.v().a(" get nrtac for samsung = " + iM);
                                                }
                                                aVar2.f2890a = a(iM);
                                            }
                                            if (aVar2.f2890a == -1) {
                                                aVar2.f2890a = cellIdentityNr.getTac();
                                            }
                                            if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                                aVar2.f2891b = cellIdentityNr.getNci();
                                            }
                                            aVar2.f2898i = 'g';
                                            aVar2.f2900k = 6;
                                            aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                            cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                            aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                            if (aVar2.f()) {
                                                aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                            }
                                        }
                                    }
                                }
                            }
                            if (l.a.f3262a) {
                                e.printStackTrace();
                            }
                        }
                        aVar2.f2899j = cellInfo.getCellConnectionStatus();
                    } catch (Exception e3) {
                        if (l.a.f3262a) {
                            e3.printStackTrace();
                        }
                    }
                }
                if (iIntValue2 >= 30) {
                    jElapsedRealtime = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                    z4 = l.a.f3262a;
                    if (z4 && l.a.f3263b) {
                        g.v().a("new cell delta1 time(ms) = " + SystemClock.elapsedRealtime());
                        g.v().a("new cell delta2 time(ms) = " + cellInfo.getTimestampMillis());
                        g.v().a("new cell delta3 time(ms) = " + jElapsedRealtime);
                    }
                    aVar2.f2896g = System.currentTimeMillis() - jElapsedRealtime;
                    if (z4) {
                        eVarV2 = g.v();
                        sb2 = new StringBuilder();
                        sb2.append("new cell time apilevel up 30 (ms) = ");
                        sb2.append(aVar2.f2896g);
                        eVarV2.a(sb2.toString());
                    }
                } else {
                    jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                    z3 = l.a.f3262a;
                    if (z3 && l.a.f3263b) {
                        g.v().a("new cell delta1 time(ns) = " + SystemClock.elapsedRealtimeNanos());
                        g.v().a("new cell delta2 time(ns) = " + cellInfo.getTimeStamp());
                        g.v().a("new cell delta3 time(ms) = " + jElapsedRealtimeNanos);
                    }
                    aVar2.f2896g = System.currentTimeMillis() - jElapsedRealtimeNanos;
                    if (z3 && l.a.f3263b) {
                        eVarV2 = g.v();
                        sb2 = new StringBuilder();
                        sb2.append("new cell time(ms) = ");
                        sb2.append(aVar2.f2896g);
                        eVarV2.a(sb2.toString());
                    }
                }
                if (l.a.f3262a && l.a.f3263b) {
                    g.v().a("mcc = " + aVar2.f2892c);
                    g.v().a("mnc = " + aVar2.f2893d);
                    g.v().a("lac = " + aVar2.f2890a);
                    g.v().a("cid = " + aVar2.f2891b);
                    g.v().a("cs = " + aVar2.f2899j);
                }
                return aVar2;
            }
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity5 = cellInfoGsm.getCellIdentity();
            if (l.a.f3262a && l.a.f3263b) {
                g.v().a("CellInfoGsm");
            }
            aVar2.f2892c = a(cellIdentity5.getMcc());
            aVar2.f2893d = a(cellIdentity5.getMnc());
            aVar2.f2890a = a(cellIdentity5.getLac());
            aVar2.f2891b = a(cellIdentity5.getCid());
            aVar2.f2898i = 'g';
            aVar2.f2897h = cellInfoGsm.getCellSignalStrength().getAsuLevel();
            aVar2.f2900k = 2;
            if (iIntValue2 >= 30) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                z4 = l.a.f3262a;
                if (z4) {
                    g.v().a("new cell delta1 time(ms) = " + SystemClock.elapsedRealtime());
                    g.v().a("new cell delta2 time(ms) = " + cellInfo.getTimestampMillis());
                    g.v().a("new cell delta3 time(ms) = " + jElapsedRealtime);
                }
                aVar2.f2896g = System.currentTimeMillis() - jElapsedRealtime;
                if (z4) {
                    eVarV2 = g.v();
                    sb2 = new StringBuilder();
                    sb2.append("new cell time apilevel up 30 (ms) = ");
                    sb2.append(aVar2.f2896g);
                    eVarV2.a(sb2.toString());
                }
            } else {
                jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                z3 = l.a.f3262a;
                if (z3) {
                    g.v().a("new cell delta1 time(ns) = " + SystemClock.elapsedRealtimeNanos());
                    g.v().a("new cell delta2 time(ns) = " + cellInfo.getTimeStamp());
                    g.v().a("new cell delta3 time(ms) = " + jElapsedRealtimeNanos);
                }
                aVar2.f2896g = System.currentTimeMillis() - jElapsedRealtimeNanos;
                if (z3) {
                    eVarV2 = g.v();
                    sb2 = new StringBuilder();
                    sb2.append("new cell time(ms) = ");
                    sb2.append(aVar2.f2896g);
                    eVarV2.a(sb2.toString());
                }
            }
        } catch (Error e4) {
            if (l.a.f3262a) {
                e4.printStackTrace();
            }
            aVar2.f2896g = System.currentTimeMillis();
        }
        aVar2.f2899j = cellInfo.getCellConnectionStatus();
        z2 = true;
        if (iIntValue2 >= 18) {
            if (cellInfo instanceof CellInfoWcdma) {
                CellIdentityWcdma cellIdentity6 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                if (l.a.f3262a) {
                    g.v().a("CellInfoWcdma");
                }
                aVar2.f2892c = a(cellIdentity6.getMcc());
                aVar2.f2893d = a(cellIdentity6.getMnc());
                aVar2.f2890a = a(cellIdentity6.getLac());
                aVar2.f2891b = a(cellIdentity6.getCid());
                aVar2.f2898i = 'g';
                aVar2.f2897h = ((CellInfoWcdma) cellInfo).getCellSignalStrength().getAsuLevel();
                aVar2.f2900k = 4;
            } else {
                if (cellInfo instanceof CellInfoTdscdma) {
                    cellIdentity = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                    if (l.a.f3262a) {
                        g.v().a("CellInfoTdscdma");
                    }
                    if (cellIdentity.getMccString() != null) {
                        aVar2.f2892c = Integer.valueOf(cellIdentity.getMccString()).intValue();
                    }
                    if (cellIdentity.getMncString() != null) {
                        aVar2.f2893d = Integer.valueOf(cellIdentity.getMncString()).intValue();
                    }
                    aVar2.f2890a = a(cellIdentity.getLac());
                    aVar2.f2891b = a(cellIdentity.getCid());
                    aVar2.f2898i = 'g';
                    aVar2.f2897h = ((CellInfoTdscdma) cellInfo).getCellSignalStrength().getAsuLevel();
                    aVar2.f2900k = 5;
                } else if (cellInfo instanceof CellInfoNr) {
                    cellIdentityNr2 = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                    if (l.a.f3262a) {
                        g.v().a(" get cell nr = " + cellIdentityNr2.toString());
                    }
                    cellIdentityNr = cellIdentityNr2;
                    if (l.a.f3262a) {
                        g.v().a("CellInfoNr");
                    }
                    if (cellIdentityNr != null) {
                        if (cellIdentityNr.getMccString() != null) {
                            aVar2.f2892c = Integer.valueOf(cellIdentityNr.getMccString()).intValue();
                            if (cellIdentityNr.getMncString() != null) {
                                aVar2.f2893d = Integer.valueOf(cellIdentityNr.getMncString()).intValue();
                                iA = a(cellIdentityNr.getTac());
                                aVar2.f2890a = iA;
                                if (iA == -1) {
                                    iB = b(cellIdentityNr);
                                    if (l.a.f3262a) {
                                        g.v().a(" get nrtac for huawei = " + iB);
                                    }
                                    aVar2.f2890a = a(iB);
                                    if (aVar2.f2890a == -1) {
                                        iM = m(cellIdentityNr.toString());
                                        if (l.a.f3262a) {
                                            g.v().a(" get nrtac for samsung = " + iM);
                                        }
                                        aVar2.f2890a = a(iM);
                                    }
                                    if (aVar2.f2890a == -1) {
                                        aVar2.f2890a = cellIdentityNr.getTac();
                                    }
                                    if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                        aVar2.f2891b = cellIdentityNr.getNci();
                                    }
                                    aVar2.f2898i = 'g';
                                    aVar2.f2900k = 6;
                                    aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                    cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                    aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                    if (aVar2.f()) {
                                        aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                    }
                                } else {
                                    if (aVar2.f2890a == -1) {
                                        iM = m(cellIdentityNr.toString());
                                        if (l.a.f3262a) {
                                            g.v().a(" get nrtac for samsung = " + iM);
                                        }
                                        aVar2.f2890a = a(iM);
                                    }
                                    if (aVar2.f2890a == -1) {
                                        aVar2.f2890a = cellIdentityNr.getTac();
                                    }
                                    if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                        aVar2.f2891b = cellIdentityNr.getNci();
                                    }
                                    aVar2.f2898i = 'g';
                                    aVar2.f2900k = 6;
                                    aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                    cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                    aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                    if (aVar2.f()) {
                                        aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                    }
                                }
                            } else {
                                iA = a(cellIdentityNr.getTac());
                                aVar2.f2890a = iA;
                                if (iA == -1) {
                                    iB = b(cellIdentityNr);
                                    if (l.a.f3262a) {
                                        g.v().a(" get nrtac for huawei = " + iB);
                                    }
                                    aVar2.f2890a = a(iB);
                                    if (aVar2.f2890a == -1) {
                                        iM = m(cellIdentityNr.toString());
                                        if (l.a.f3262a) {
                                            g.v().a(" get nrtac for samsung = " + iM);
                                        }
                                        aVar2.f2890a = a(iM);
                                    }
                                    if (aVar2.f2890a == -1) {
                                        aVar2.f2890a = cellIdentityNr.getTac();
                                    }
                                    if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                        aVar2.f2891b = cellIdentityNr.getNci();
                                    }
                                    aVar2.f2898i = 'g';
                                    aVar2.f2900k = 6;
                                    aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                    cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                    aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                    if (aVar2.f()) {
                                        aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                    }
                                } else {
                                    if (aVar2.f2890a == -1) {
                                        iM = m(cellIdentityNr.toString());
                                        if (l.a.f3262a) {
                                            g.v().a(" get nrtac for samsung = " + iM);
                                        }
                                        aVar2.f2890a = a(iM);
                                    }
                                    if (aVar2.f2890a == -1) {
                                        aVar2.f2890a = cellIdentityNr.getTac();
                                    }
                                    if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                        aVar2.f2891b = cellIdentityNr.getNci();
                                    }
                                    aVar2.f2898i = 'g';
                                    aVar2.f2900k = 6;
                                    aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                    cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                    aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                    if (aVar2.f()) {
                                        aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                    }
                                }
                            }
                        } else if (cellIdentityNr.getMncString() != null) {
                            aVar2.f2893d = Integer.valueOf(cellIdentityNr.getMncString()).intValue();
                            iA = a(cellIdentityNr.getTac());
                            aVar2.f2890a = iA;
                            if (iA == -1) {
                                iB = b(cellIdentityNr);
                                if (l.a.f3262a) {
                                    g.v().a(" get nrtac for huawei = " + iB);
                                }
                                aVar2.f2890a = a(iB);
                                if (aVar2.f2890a == -1) {
                                    iM = m(cellIdentityNr.toString());
                                    if (l.a.f3262a) {
                                        g.v().a(" get nrtac for samsung = " + iM);
                                    }
                                    aVar2.f2890a = a(iM);
                                }
                                if (aVar2.f2890a == -1) {
                                    aVar2.f2890a = cellIdentityNr.getTac();
                                }
                                if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                    aVar2.f2891b = cellIdentityNr.getNci();
                                }
                                aVar2.f2898i = 'g';
                                aVar2.f2900k = 6;
                                aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                if (aVar2.f()) {
                                    aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                }
                            } else {
                                if (aVar2.f2890a == -1) {
                                    iM = m(cellIdentityNr.toString());
                                    if (l.a.f3262a) {
                                        g.v().a(" get nrtac for samsung = " + iM);
                                    }
                                    aVar2.f2890a = a(iM);
                                }
                                if (aVar2.f2890a == -1) {
                                    aVar2.f2890a = cellIdentityNr.getTac();
                                }
                                if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                    aVar2.f2891b = cellIdentityNr.getNci();
                                }
                                aVar2.f2898i = 'g';
                                aVar2.f2900k = 6;
                                aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                if (aVar2.f()) {
                                    aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                }
                            }
                        } else {
                            iA = a(cellIdentityNr.getTac());
                            aVar2.f2890a = iA;
                            if (iA == -1) {
                                iB = b(cellIdentityNr);
                                if (l.a.f3262a) {
                                    g.v().a(" get nrtac for huawei = " + iB);
                                }
                                aVar2.f2890a = a(iB);
                                if (aVar2.f2890a == -1) {
                                    iM = m(cellIdentityNr.toString());
                                    if (l.a.f3262a) {
                                        g.v().a(" get nrtac for samsung = " + iM);
                                    }
                                    aVar2.f2890a = a(iM);
                                }
                                if (aVar2.f2890a == -1) {
                                    aVar2.f2890a = cellIdentityNr.getTac();
                                }
                                if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                    aVar2.f2891b = cellIdentityNr.getNci();
                                }
                                aVar2.f2898i = 'g';
                                aVar2.f2900k = 6;
                                aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                if (aVar2.f()) {
                                    aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                }
                            } else {
                                if (aVar2.f2890a == -1) {
                                    iM = m(cellIdentityNr.toString());
                                    if (l.a.f3262a) {
                                        g.v().a(" get nrtac for samsung = " + iM);
                                    }
                                    aVar2.f2890a = a(iM);
                                }
                                if (aVar2.f2890a == -1) {
                                    aVar2.f2890a = cellIdentityNr.getTac();
                                }
                                if (cellIdentityNr.getNci() != Long.MAX_VALUE) {
                                    aVar2.f2891b = cellIdentityNr.getNci();
                                }
                                aVar2.f2898i = 'g';
                                aVar2.f2900k = 6;
                                aVar2.f2899j = cellInfo.getCellConnectionStatus();
                                cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                aVar2.f2897h = cellSignalStrengthNr.getAsuLevel();
                                if (aVar2.f()) {
                                    aVar2.f2904o = String.format(Locale.US, "%d|%d|%d|%d|%d|%d|%d|%d", Integer.valueOf(cellSignalStrengthNr.getCsiRsrp()), Integer.valueOf(cellSignalStrengthNr.getCsiRsrq()), Integer.valueOf(cellSignalStrengthNr.getCsiSinr()), Integer.valueOf(cellSignalStrengthNr.getDbm()), Integer.valueOf(cellSignalStrengthNr.getLevel()), Integer.valueOf(cellSignalStrengthNr.getSsRsrp()), Integer.valueOf(cellSignalStrengthNr.getSsRsrq()), Integer.valueOf(cellSignalStrengthNr.getSsSinr()));
                                }
                            }
                        }
                    }
                }
                if (l.a.f3262a) {
                    e3.printStackTrace();
                }
            }
            aVar2.f2899j = cellInfo.getCellConnectionStatus();
        }
        if (l.a.f3262a) {
            g.v().a("mcc = " + aVar2.f2892c);
            g.v().a("mnc = " + aVar2.f2893d);
            g.v().a("lac = " + aVar2.f2890a);
            g.v().a("cid = " + aVar2.f2891b);
            g.v().a("cs = " + aVar2.f2899j);
        }
        return aVar2;
    }

    public j.a e(j.a aVar, TelephonyManager telephonyManager) {
        return o(aVar, telephonyManager);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00d7, please report this as an issue */
    @SuppressLint({"NewApi"})
    public final String g(j.a aVar) {
        j.a aVarD;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = null;
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() >= 17) {
            try {
                List<CellInfo> allCellInfo = this.f3215h.getAllCellInfo();
                if (allCellInfo != null && allCellInfo.size() > 0) {
                    sb2.append("&nc=");
                    for (CellInfo cellInfo : allCellInfo) {
                        if (!cellInfo.isRegistered() && (aVarD = d(cellInfo, this.f3219l, this.f3215h)) != null) {
                            if (aVarD.f2890a != -1 && aVarD.f2891b != -1) {
                                sb2.append(aVarD.f2892c);
                                sb2.append("|");
                                sb2.append(aVarD.f2893d);
                                sb2.append("|");
                                sb2.append(aVarD.f2890a);
                                sb2.append("|");
                                sb2.append(aVarD.f2891b);
                                sb2.append("|");
                                sb2.append(aVarD.f2897h);
                                sb2.append(";");
                            }
                            if (aVarD.f2900k == 6 && aVarD.f2904o != null && aVarD.f()) {
                                if (sb3 == null) {
                                    sb = new StringBuilder();
                                    try {
                                        sb.append("&ncnr=");
                                        sb3 = sb;
                                    } catch (Throwable th) {
                                        th = th;
                                        sb3 = sb;
                                        if (l.a.f3262a) {
                                            th.printStackTrace();
                                        }
                                        if (sb3 == null) {
                                            return sb2.toString();
                                        }
                                        return sb2.toString() + sb3.toString();
                                    }
                                }
                                try {
                                    sb3.append(F(aVarD));
                                    sb3.append("_");
                                    sb3.append(aVarD.f2904o);
                                    sb3.append(";");
                                } catch (Throwable th2) {
                                    th = th2;
                                    sb = sb3;
                                    sb3 = sb;
                                    if (l.a.f3262a) {
                                        th.printStackTrace();
                                    }
                                    if (sb3 == null) {
                                        return sb2.toString();
                                    }
                                    return sb2.toString() + sb3.toString();
                                }
                            }
                        }
                    }
                } else if (l.a.f3262a && l.a.f3263b) {
                    g.v().a("getAllCellInfo = null");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (sb3 == null) {
            return sb2.toString();
        }
        return sb2.toString() + sb3.toString();
    }

    public void i(Context context) {
        e eVar;
        if (this.f3228u) {
            return;
        }
        this.f3227t = context;
        this.f3215h = (TelephonyManager) context.getSystemService("phone");
        this.f3221n = new LinkedList();
        if (Looper.myLooper() != null) {
            this.f3223p = new e();
        }
        if (this.C == null) {
            this.C = new Handler(Looper.getMainLooper());
        }
        if (this.f3214g) {
            y();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= this.f3210c) {
            if (this.f3222o == null) {
                this.f3222o = this.f3227t.getMainExecutor();
            }
            this.f3230w = l.b.c("android.telephony.TelephonyManager$CellInfoCallback");
            if (l.a.f3262a && l.a.f3263b) {
                g.v().a("isCellinfoCallbackExist = " + this.f3230w);
            }
        }
        TelephonyManager telephonyManager = this.f3215h;
        if (telephonyManager == null || (eVar = this.f3223p) == null) {
            return;
        }
        if (i2 < this.f3210c || !this.f3230w) {
            try {
                telephonyManager.listen(eVar, 1280);
            } catch (Exception unused) {
            }
        }
        if (l.a.f3262a && l.a.f3263b) {
            g.v().a("cell manager start...");
        }
        this.f3228u = true;
    }

    public void j(boolean z2) {
        this.f3213f = z2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    public boolean k(j.a aVar, j.a aVar2) {
        boolean z2;
        if (aVar == null && aVar2 == null) {
            return false;
        }
        if (aVar == null || aVar2 == null) {
            return true;
        }
        float fAbs = Math.abs(aVar.f2897h - aVar2.f2897h);
        int i2 = aVar.f2897h;
        if (i2 == 0) {
            i2 = -1;
        }
        float f2 = fAbs / i2;
        boolean z3 = l.a.f3262a;
        if (z3 && l.a.f3263b) {
            g.v().a("cl-cache, str, old:" + aVar.f2897h + " new:" + aVar2.f2897h);
            j.e eVarV = g.v();
            StringBuilder sb = new StringBuilder();
            sb.append("cl-cache, str, diffRate:");
            sb.append(f2);
            eVarV.a(sb.toString());
        }
        String str = aVar.f2902m;
        if (str == null || aVar2.f2902m == null) {
            z2 = false;
        } else {
            int iC = c(str);
            if (Math.abs(Math.abs(iC - c(aVar2.f2902m)) / (iC != 0 ? iC : -1)) > this.f3212e) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z3 && l.a.f3263b) {
            g.v().a("cl-cache, isStrengthChange2:" + z2);
        }
        return f2 > this.f3212e || z2;
    }

    public j.a n(int i2) {
        j.e eVarV;
        String str;
        j.a aVar;
        if (this.f3215h != null) {
            try {
                K();
                boolean z2 = l.a.f3262a;
                if (z2 && l.a.f3263b) {
                    g.v().a(" lastDiffTime = " + this.f3232y + ", diffTime = " + i2);
                }
                if (this.f3230w) {
                    if (i2 < Integer.MAX_VALUE) {
                        long j2 = i2;
                        if (j2 != this.f3232y) {
                            if (z2 && l.a.f3263b) {
                                eVarV = g.v();
                                str = "diff time is changed";
                                eVarV.a(str);
                            }
                            G();
                        } else if (System.currentTimeMillis() - this.f3231x > j2) {
                            if (z2 && l.a.f3263b) {
                                eVarV = g.v();
                                str = " over diff time";
                                eVarV.a(str);
                            }
                            G();
                        }
                    }
                    this.f3232y = i2;
                }
            } catch (Exception e2) {
                if (l.a.f3262a) {
                    e2.printStackTrace();
                }
            }
        }
        j.a aVar2 = this.f3219l;
        if (aVar2 != null && aVar2.e()) {
            this.f3220m = null;
            this.f3220m = new j.a(this.f3219l);
        }
        j.a aVar3 = this.f3219l;
        if (aVar3 != null && aVar3.d() && (aVar = this.f3220m) != null) {
            j.a aVar4 = this.f3219l;
            if (aVar4.f2898i == 'g') {
                aVar4.f2893d = aVar.f2893d;
                aVar4.f2892c = aVar.f2892c;
            }
        }
        return this.f3219l;
    }

    public j.a o(j.a aVar, TelephonyManager telephonyManager) {
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() < 17) {
            return null;
        }
        try {
            this.f3229v = telephonyManager.getSimState();
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null || allCellInfo.size() <= 0) {
                if (!l.a.f3262a || !l.a.f3263b) {
                    return null;
                }
                g.v().a("getAllCellInfo=null");
                return null;
            }
            j.a aVar2 = null;
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo.isRegistered()) {
                    boolean z2 = aVar2 != null;
                    j.a aVarD = d(cellInfo, aVar, telephonyManager);
                    if (aVarD != null) {
                        if (aVarD.f()) {
                            if (l.a.f3262a && l.a.f3263b) {
                                g.v().a(" cell res.isValid() = " + F(aVarD));
                            }
                            if (z2 && aVar2 != null) {
                                aVar2.f2902m = B(aVarD);
                                aVar2.f2903n = F(aVarD);
                            }
                        } else {
                            if (l.a.f3262a && l.a.f3263b) {
                                g.v().a("res.isValid()");
                            }
                            aVarD = null;
                        }
                        if (aVar2 == null) {
                            aVar2 = aVarD;
                        }
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            if (!l.a.f3262a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public String p(j.a aVar) {
        int i2;
        if (aVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append("&nw=");
        stringBuffer.append(aVar.f2898i);
        stringBuffer.append(String.format(Locale.CHINA, "&cl=%d|%d|%d|%d&cl_s=%d", Integer.valueOf(aVar.f2892c), Integer.valueOf(aVar.f2893d), Integer.valueOf(aVar.f2890a), Long.valueOf(aVar.f2891b), Integer.valueOf(aVar.f2897h)));
        if (aVar.f2894e < Integer.MAX_VALUE && (i2 = aVar.f2895f) < Integer.MAX_VALUE) {
            stringBuffer.append(String.format(Locale.CHINA, "&cdmall=%.6f|%.6f", Double.valueOf(((double) i2) / 14400.0d), Double.valueOf(((double) aVar.f2894e) / 14400.0d)));
        }
        stringBuffer.append("&cl_t=");
        stringBuffer.append(aVar.f2896g);
        stringBuffer.append("&cl_api=");
        stringBuffer.append(aVar.f2901l);
        stringBuffer.append("&clp=");
        stringBuffer.append(aVar.f2900k);
        if (aVar.f2904o != null) {
            stringBuffer.append("&clnrs=");
            stringBuffer.append(aVar.f2904o);
        }
        if (aVar.f2899j != Integer.MAX_VALUE) {
            stringBuffer.append("&cl_cs=");
            stringBuffer.append(aVar.f2899j);
        }
        try {
            List<j.a> list = this.f3221n;
            if (list != null && list.size() > 0) {
                int size = this.f3221n.size();
                stringBuffer.append("&clt=");
                for (int i3 = 0; i3 < size; i3++) {
                    j.a aVar2 = this.f3221n.get(i3);
                    if (aVar2 != null) {
                        int i4 = aVar2.f2892c;
                        if (i4 != aVar.f2892c) {
                            stringBuffer.append(i4);
                        }
                        stringBuffer.append("|");
                        int i5 = aVar2.f2893d;
                        if (i5 != aVar.f2893d) {
                            stringBuffer.append(i5);
                        }
                        stringBuffer.append("|");
                        int i6 = aVar2.f2890a;
                        if (i6 != aVar.f2890a) {
                            stringBuffer.append(i6);
                        }
                        stringBuffer.append("|");
                        long j2 = aVar2.f2891b;
                        if (j2 != aVar.f2891b) {
                            stringBuffer.append(j2);
                        }
                        stringBuffer.append("|");
                        stringBuffer.append((System.currentTimeMillis() - aVar2.f2896g) / 1000);
                        stringBuffer.append(";");
                    }
                }
            }
        } catch (Exception e2) {
            if (l.a.f3262a) {
                e2.printStackTrace();
            }
        }
        if (this.f3229v > 100) {
            this.f3229v = 0;
        }
        int i7 = this.f3229v + (G << 8);
        boolean z2 = l.a.f3262a;
        if (z2 && l.a.f3263b) {
            g.v().a("sim state:" + this.f3229v + "," + i7);
        }
        stringBuffer.append("&cs=" + i7);
        String str = aVar.f2902m;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (z2 && l.a.f3263b) {
            g.v().a("cell sb.toString() = " + stringBuffer.toString());
        }
        return stringBuffer.toString();
    }

    public final void q() {
        this.C.post(new RunnableC0035a());
    }

    public void s(boolean z2) {
        this.f3214g = z2;
    }

    public String t(j.a aVar) {
        String str = "";
        try {
            String strG = g(aVar);
            int iIntValue = Integer.valueOf(Build.VERSION.SDK_INT).intValue();
            if ((strG != null && !"".equals(strG) && !"&nc=".equals(strG)) || iIntValue >= 17) {
                return strG;
            }
            str = strG;
            if (str == null || !"&nc=".equals(str)) {
                return str;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void u(int i2) {
        this.f3210c = i2;
    }

    public boolean v() {
        return this.B;
    }

    public HashSet<String> x(j.a aVar) {
        j.a aVarD;
        StringBuilder sb;
        HashSet<String> hashSet = new HashSet<>();
        try {
            List<CellInfo> allCellInfo = this.f3215h.getAllCellInfo();
            if (allCellInfo != null && allCellInfo.size() > 0) {
                for (CellInfo cellInfo : allCellInfo) {
                    if (!cellInfo.isRegistered() && (aVarD = d(cellInfo, this.f3219l, this.f3215h)) != null) {
                        int i2 = aVarD.f2890a;
                        String string = "";
                        if (i2 != -1 && aVarD.f2891b != -1) {
                            if (aVar.f2890a != i2) {
                                sb = new StringBuilder();
                                sb.append(aVarD.f2890a);
                                sb.append("|");
                                sb.append(aVarD.f2891b);
                            } else {
                                sb = new StringBuilder();
                                sb.append(aVarD.f2891b);
                                sb.append("");
                            }
                            string = sb.toString();
                        }
                        hashSet.add(string);
                    }
                }
            } else if (l.a.f3262a) {
                Log.d("getAllCellInfo", "=null");
            }
        } catch (Exception | NoSuchMethodError e2) {
            e2.printStackTrace();
        }
        return hashSet;
    }

    public final void y() {
        j.e eVarV;
        String str;
        String strD = l.b.d(this.f3227t);
        if (strD == null) {
            return;
        }
        File file = new File(strD + File.separator + "lcvif2.dat");
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(0L);
                long j2 = randomAccessFile.readLong();
                if (System.currentTimeMillis() - j2 > 60000) {
                    if (l.a.f3262a && l.a.f3263b) {
                        g.v().a("cellbuffer System.currentTimeMillis() - time > 1 *60 *1000" + j2);
                    }
                    randomAccessFile.close();
                    file.delete();
                    return;
                }
                randomAccessFile.readInt();
                for (int i2 = 0; i2 < 3; i2++) {
                    long j3 = randomAccessFile.readLong();
                    int i3 = randomAccessFile.readInt();
                    int i4 = randomAccessFile.readInt();
                    int i5 = randomAccessFile.readInt();
                    long j4 = randomAccessFile.readLong();
                    int i6 = randomAccessFile.readInt();
                    boolean z2 = l.a.f3262a;
                    if (z2 && l.a.f3263b) {
                        g.v().a("cellbuffer cell info = " + j3 + " " + i3 + " " + i4 + " " + i5 + " " + j4 + " " + i6);
                    }
                    char c2 = i6 == 1 ? 'g' : (char) 0;
                    if (i6 == 2) {
                        c2 = 'c';
                    }
                    char c3 = c2;
                    if (j3 != 0) {
                        j.a aVar = new j.a(i5, j4, i3, i4, 0, c3, -1);
                        aVar.f2896g = j3;
                        if (aVar.f()) {
                            this.B = true;
                            this.f3221n.add(aVar);
                        }
                        if (z2 && l.a.f3263b) {
                            eVarV = g.v();
                            str = "loc cell " + p(aVar);
                            eVarV.a(str);
                        }
                    } else if (z2 && l.a.f3263b) {
                        eVarV = g.v();
                        str = "loc cell time1 == 0";
                        eVarV.a(str);
                    }
                }
                randomAccessFile.close();
            } catch (Exception e2) {
                if (l.a.f3262a) {
                    e2.printStackTrace();
                }
                file.delete();
            }
        }
    }

    public void z(int i2) {
        this.f3211d = i2;
    }
}
