package b;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o extends m {
    public static o Z = null;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static boolean f1792a0 = false;
    public double F;
    public double G;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m.c f1794n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1793m = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1795o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b1.c f1796p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b1.c f1797q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Location f1798r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j.k f1799s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j.a f1800t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HashSet<String> f1801u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j.a f1802v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1803w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f1804x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1805y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f1806z = 0;
    public long A = 0;
    public b1.a B = null;
    public String C = null;
    public List<b1.i> D = null;
    public b1.j E = null;
    public boolean H = false;
    public long I = 0;
    public b J = null;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public final Handler N = new m.b();
    public boolean O = false;
    public boolean P = false;
    public c Q = null;
    public boolean R = false;
    public int S = 0;
    public long T = 0;
    public boolean U = false;
    public boolean V = false;
    public long W = 0;
    public b1.a X = null;
    public boolean Y = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.C(null);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public /* synthetic */ b(o oVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.K) {
                o.this.K = false;
                if (o.this.L || j.d.l0().x0()) {
                    return;
                }
                o.this.i(false, false);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public /* synthetic */ c(o oVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.R) {
                o.this.R = false;
            }
            if (o.this.f1805y) {
                o.this.f1805y = false;
                o.this.L(null);
            }
        }
    }

    public o() {
        this.f1794n = null;
        this.f1794n = new m.c();
        new m.a();
    }

    public static synchronized o M() {
        if (Z == null) {
            Z = new o();
        }
        return Z;
    }

    public final void B() {
        this.f1804x = false;
        this.L = false;
        this.M = false;
        this.H = false;
        W();
        if (this.Y) {
            this.Y = false;
        }
    }

    public final void C(Message message) {
        this.S = 0;
        if (!this.f1803w) {
            N(message);
            SystemClock.uptimeMillis();
            return;
        }
        this.S = 1;
        SystemClock.uptimeMillis();
        if (j.f.M().t(n.i.f3404a0)) {
            N(message);
        } else {
            L(message);
        }
    }

    public void D(b1.c cVar) {
        this.f1796p = new b1.c(cVar);
    }

    public final void F(Message message) {
        if (n.i.f3434p0 && !n.i.H(com.baidu.location.f.c())) {
            b1.c cVar = new b1.c();
            cVar.o0(62);
            b.c.r().n(cVar);
            return;
        }
        if (n.i.N()) {
            Log.d("baidu_location_service", "isInforbiddenTime on request location ...");
        }
        if (message.getData().getBoolean("isWaitingLocTag", false)) {
            f1792a0 = true;
        }
        if (d.i.I().X()) {
            return;
        }
        j.c.d().f();
        int i2 = b.c.r().i(message);
        if (i2 == 1) {
            x(message);
            return;
        }
        if (i2 == 2) {
            if (j.d.l0().x0()) {
                q(message);
            }
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new IllegalArgumentException(String.format("this type %d is illegal", Integer.valueOf(i2)));
            }
            C(message);
        }
    }

    public final void G(b1.c cVar) {
        this.V = cVar != null && cVar.O();
    }

    public boolean H() {
        return this.f1793m;
    }

    public void I(Message message) {
        if (this.O) {
            F(message);
        }
    }

    public final String[] J() {
        boolean z2;
        g gVarA;
        int i2;
        String[] strArr = {"", "Location failed beacuse we can not get any loc information!"};
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("&apl=");
        int iR = n.i.r(com.baidu.location.f.c());
        String str = "Location failed beacuse we can not get any loc information in airplane mode, you can turn it off and try again!!";
        if (iR == 1) {
            strArr[1] = "Location failed beacuse we can not get any loc information in airplane mode, you can turn it off and try again!!";
        }
        stringBuffer.append(iR);
        String strD = n.i.D(com.baidu.location.f.c());
        if (strD.contains("per=0|0|")) {
            strArr[1] = "Location failed beacuse we can not get any loc information without any location permission!";
        }
        stringBuffer.append(strD);
        stringBuffer.append("&loc=");
        int iX = n.i.x(com.baidu.location.f.c());
        if (iX == 0) {
            strArr[1] = "Location failed beacuse we can not get any loc information with the phone loc mode is off, you can turn it on and try again!";
            z2 = true;
        } else {
            z2 = false;
        }
        stringBuffer.append(iX);
        stringBuffer.append("&lmd=");
        int iX2 = n.i.x(com.baidu.location.f.c());
        if (iX2 >= 0) {
            stringBuffer.append(iX2);
        }
        String strQ = j.f.M().Q();
        String strU = j.f.M().U();
        stringBuffer.append(strU);
        stringBuffer.append(strQ);
        stringBuffer.append(n.i.B(com.baidu.location.f.c()));
        if (iR != 1) {
            if (strD.contains("per=0|0|")) {
                g.a().b(62, 4, "Location failed beacuse we can not get any loc information without any location permission!");
            } else if (z2) {
                g.a().b(62, 5, "Location failed beacuse we can not get any loc information with the phone loc mode is off, you can turn it on and try again!");
            } else if (strQ != null && strU != null && strQ.equals("&sim=1") && !strU.equals("&wifio=1")) {
                gVarA = g.a();
                i2 = 6;
                str = "Location failed beacuse we can not get any loc information , you can insert a sim card or open wifi and try again!";
            } else if (!n.i.M()) {
                g.a().b(62, 9, "Location failed beacuse we can not get any loc information!");
            }
            strArr[0] = stringBuffer.toString();
            return strArr;
        }
        gVarA = g.a();
        i2 = 7;
        gVarA.b(62, i2, str);
        strArr[0] = stringBuffer.toString();
        return strArr;
    }

    public final void K() {
        try {
            String str = null;
            String strD = r.c().d("FirstLocAddr", null);
            if (strD != null) {
                String[] strArrSplit = new String(Base64.decode(strD.getBytes(), 0)).split("_");
                if (strArrSplit.length == 2) {
                    this.W = Long.parseLong(strArrSplit[0]);
                    str = strArrSplit[1];
                }
                if (str != null) {
                    String[] strArrSplit2 = str.split(";");
                    if (strArrSplit2.length == 10) {
                        this.X = new b1.a.C0016a().p(strArrSplit2[0]).q(strArrSplit2[1]).s(strArrSplit2[2]).n(strArrSplit2[3]).o(strArrSplit2[4]).r(strArrSplit2[5]).t(strArrSplit2[6]).u(strArrSplit2[7]).l(strArrSplit2[8]).v(strArrSplit2[9]).m();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    public final void L(Message message) {
        Location locationA;
        boolean zC;
        String str;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f1806z;
        if (!this.f1804x || jCurrentTimeMillis2 > 12000) {
            if (System.currentTimeMillis() - this.f1806z > 0 && System.currentTimeMillis() - this.f1806z < 1000) {
                if (this.f1796p != null) {
                    b.c.r().n(this.f1796p);
                }
                B();
                return;
            }
            this.f1804x = true;
            this.f1793m = n(this.f1800t, this.f1801u);
            boolean zO = o(this.f1799s);
            boolean zM = n.i.M();
            a aVar = null;
            if (zM) {
                locationA = j.c.d().a();
                zC = j.c.d().c(this.f1798r, locationA);
            } else {
                locationA = null;
                zC = false;
            }
            if (!zO && !this.f1793m && this.f1796p != null && !this.H && !j.f.M().X() && !zC) {
                if (this.f1797q != null && System.currentTimeMillis() - this.A > 30000) {
                    this.f1796p = this.f1797q;
                    this.f1797q = null;
                }
                if (t.c().e()) {
                    this.f1796p.X(t.c().a());
                }
                if (this.f1796p.v() == 62) {
                    jCurrentTimeMillis = System.currentTimeMillis() - this.T;
                    if (jCurrentTimeMillis <= 0) {
                        jCurrentTimeMillis = 0;
                    }
                } else {
                    jCurrentTimeMillis = 0;
                }
                if (this.f1796p.v() == 61 || this.f1796p.v() == 161 || this.f1796p.v() == 160 || (this.f1796p.v() == 62 && jCurrentTimeMillis < 15000)) {
                    b.c.r().n(this.f1796p);
                    B();
                    return;
                }
            }
            this.f1806z = System.currentTimeMillis();
            String strC = c(null);
            this.P = false;
            if (strC == null) {
                this.P = true;
                this.T = System.currentTimeMillis();
                String[] strArrJ = new String[2];
                try {
                    strArrJ = J();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (jCurrentTimeMillis3 - this.I > 60000) {
                    this.I = jCurrentTimeMillis3;
                }
                String strK = j.f.M().K();
                if (strK != null) {
                    str = strK + a() + strArrJ[0];
                } else {
                    str = "" + a() + strArrJ[0];
                }
                if (this.f1771b != null && j.f.M().l(this.f1771b) != null) {
                    str = j.f.M().l(this.f1771b) + str;
                }
                String strB = n.b.g().b(true);
                if (strB != null) {
                    str = str + strB;
                }
            } else {
                str = strC + n.i.D(com.baidu.location.f.c());
            }
            if (zM) {
                String strB2 = j.c.d().b(locationA);
                if (strB2 != null) {
                    str = str + strB2 + "&per_c=1";
                }
                this.f1798r = locationA;
            }
            if (this.f1795o != null) {
                str = str + this.f1795o;
                this.f1795o = null;
            }
            String str2 = str + f.k().a();
            long jF = this.f1770a != null ? j.f.M().F(this.f1770a) : 0L;
            if (str2.length() > n.i.F0) {
                String[] strArrSplit = str2.split("&cl_list=");
                if (strArrSplit.length == 2) {
                    String[] strArrSplit2 = strArrSplit[1].split("&", 2);
                    if (strArrSplit2.length == 2) {
                        str2 = strArrSplit[0] + "&cl_list=null&" + strArrSplit2[1];
                    } else {
                        str2 = strArrSplit[0] + "&cl_list=null";
                    }
                }
            }
            this.f1794n.i(str2, jF);
            this.f1800t = this.f1771b;
            this.f1801u = this.f1772c;
            this.f1799s = this.f1770a;
            if (!j.d.l0().x0()) {
                S();
            }
            if (i.d.n().u()) {
                if (this.J == null) {
                    this.J = new b(this, aVar);
                }
                this.N.postDelayed(this.J, i.d.n().g(j.b.a(j.f.M().O())));
                this.K = true;
            }
            if (this.f1803w) {
                this.f1803w = false;
                if (j.f.M().Y() && message != null && b.c.r().l(message) < 1000 && i.d.n().t()) {
                    i.d.n().z();
                }
                c.b.d().k();
            }
            int i2 = this.S;
            if (i2 > 0) {
                if (i2 == 2) {
                    j.f.M().b0();
                }
                this.S = 0;
            }
        }
    }

    public final void N(Message message) {
        c cVar;
        if (!j.f.M().b0()) {
            L(message);
            return;
        }
        this.f1805y = true;
        if (this.Q == null) {
            this.Q = new c(this, null);
        }
        if (this.R && (cVar = this.Q) != null) {
            this.N.removeCallbacks(cVar);
        }
        this.N.postDelayed(this.Q, 3500L);
        this.R = true;
    }

    public String O() {
        return this.C;
    }

    public List<b1.i> P() {
        return this.D;
    }

    public b1.j Q() {
        return this.E;
    }

    public boolean R() {
        return this.V;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    public final boolean S() {
        boolean z2;
        double dRandom = Math.random();
        SystemClock.uptimeMillis();
        j.a aVarE = j.f.M().e();
        j.k kVarS = j.f.M().S();
        long jC = (kVarS == null || kVarS.e() <= 0) ? 0L : j.f.M().c(kVarS);
        boolean z3 = aVarE != null && aVarE.e() && (kVarS == null || kVarS.e() == 0);
        b1.c cVar = null;
        if (i.d.n().t() && i.d.n().w() && jC < 60 && (z3 || (0.0d < dRandom && dRandom < i.d.n().p()))) {
            b1.c cVarC = i.d.n().c(j.f.M().e(), j.f.M().S(), null, i.d.c.IS_MIX_MODE, i.d.b.NEED_TO_LOG);
            if (cVarC != null) {
                z2 = (n.i.f3409d.equals("all") && cVarC.c() == null) ? false : true;
                if (n.i.f3413f && cVarC.w() == null) {
                    z2 = false;
                }
                if (n.i.f3417h && cVarC.B() == null) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (z2) {
                cVar = cVarC;
            }
        }
        if (cVar != null && cVar.v() == 66 && this.f1804x) {
            b1.c cVar2 = new b1.c(cVar);
            cVar2.o0(161);
            if (this.f1804x) {
                this.L = true;
                b.c.r().n(cVar2);
                this.f1796p = cVar2;
                return true;
            }
        }
        return false;
    }

    public void T() {
        if (!this.f1805y) {
            c.b.d().i();
        } else {
            L(null);
            this.f1805y = false;
        }
    }

    public void U() {
        this.f1803w = true;
        this.f1804x = false;
        this.O = true;
        K();
    }

    public void V() {
        this.f1804x = false;
        this.f1805y = false;
        this.L = false;
        this.M = true;
        w();
        this.O = false;
    }

    public final void W() {
        if (this.f1796p == null || !j.f.M().Y()) {
            return;
        }
        z.b().g();
    }

    @Override // b.m
    public void d(Message message) {
        b bVar = this.J;
        if (bVar != null && this.K) {
            this.K = false;
            this.N.removeCallbacks(bVar);
        }
        b1.c cVar = (b1.c) message.obj;
        int i2 = message.arg1;
        if (cVar != null && cVar.v() == 161) {
            t(cVar.K());
            G(cVar);
            if (i2 == 1) {
                f.k().e(cVar, "gcj02", null);
            }
        }
        if (cVar != null && cVar.v() == 167 && this.P) {
            cVar.o0(62);
        }
        if (!this.U && cVar != null && cVar.v() == 161) {
            String strI = cVar.i();
            if (!TextUtils.isEmpty(strI)) {
                r.c().g("mapcity", strI);
                d.s().l(strI);
                this.U = true;
            }
        }
        y(cVar);
    }

    @Override // b.m
    public void f() {
        b1.c cVar;
        b bVar = this.J;
        if (bVar != null && this.K) {
            this.K = false;
            this.N.removeCallbacks(bVar);
        }
        if (j.d.l0().x0()) {
            b1.c cVar2 = new b1.c(j.d.l0().T());
            Location locationX = j.d.l0().X();
            if (locationX != null && "bd_beidou".equals(locationX.getProvider())) {
                cVar2.c0("bd_beidou");
            }
            if (locationX != null) {
                cVar2.Z(locationX.getExtras());
            }
            if (n.i.f3409d.equals("all") || n.i.f3413f || n.i.f3417h) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.G, this.F, cVar2.u(), cVar2.x(), fArr);
                if (fArr[0] < 100.0f) {
                    b1.a aVar = this.B;
                    if (aVar != null) {
                        cVar2.Q(aVar);
                    }
                    String str = this.C;
                    if (str != null) {
                        cVar2.q0(str);
                    }
                    List<b1.i> list = this.D;
                    if (list != null) {
                        cVar2.z0(list);
                    }
                    b1.j jVar = this.E;
                    if (jVar != null) {
                        cVar2.A0(jVar);
                    }
                }
            }
            b.c.r().n(cVar2);
        } else {
            if (this.L) {
                B();
                return;
            }
            if (i.d.n().t() && i.d.n().x()) {
                cVar = i.d.n().c(j.f.M().e(), j.f.M().S(), null, i.d.c.IS_NOT_MIX_MODE, i.d.b.NEED_TO_LOG);
                if (cVar != null && cVar.v() == 66) {
                    b.c.r().n(cVar);
                }
            } else {
                cVar = null;
            }
            if (cVar == null || cVar.v() == 67) {
                if (this.f1793m || this.f1796p == null) {
                    if (i.a.p().f2746k) {
                        cVar = i.a.p().n(false);
                    } else if (cVar == null) {
                        cVar = new b1.c();
                        cVar.o0(67);
                    }
                    if (cVar != null) {
                        b.c.r().n(cVar);
                        if (cVar.v() == 67 && !this.P) {
                            g.a().b(67, 3, "Offline location failed, please check the net (wifi/cell)!");
                        }
                        boolean z2 = (n.i.f3409d.equals("all") && cVar.c() == null) ? false : true;
                        if (n.i.f3413f && cVar.w() == null) {
                            z2 = false;
                        }
                        if (!((n.i.f3417h && cVar.B() == null) ? false : z2)) {
                            cVar.o0(67);
                        }
                    }
                } else {
                    b.c.r().n(this.f1796p);
                }
            }
            this.f1797q = null;
        }
        B();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    public b1.a g(b1.c cVar) {
        b1.a aVarM;
        if (n.i.f3409d.equals("all") || n.i.f3413f || n.i.f3417h) {
            float[] fArr = new float[2];
            Location.distanceBetween(this.G, this.F, cVar.u(), cVar.x(), fArr);
            float f2 = fArr[0];
            if (f2 >= 100.0d) {
                if (this.B == null) {
                    if (System.currentTimeMillis() - this.W < 3000) {
                        aVarM = this.X;
                    } else {
                        aVarM = null;
                    }
                } else if (f2 < 1000.0d) {
                    aVarM = new b1.a.C0016a().p(this.B.f1898a).q(this.B.f1899b).s(this.B.f1900c).n(this.B.f1901d).o(this.B.f1902e).r(this.B.f1903f).l(this.B.f1907j).v(this.B.f1908k).m();
                } else {
                    aVarM = null;
                }
                this.C = null;
                this.D = null;
                this.E = null;
                this.H = true;
                this.N.post(new a());
                return aVarM;
            }
            b1.a aVar = this.B;
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public void i(boolean z2, boolean z3) {
        b1.c cVarN;
        if (i.d.n().t() && i.d.n().s()) {
            cVarN = i.d.n().c(j.f.M().e(), j.f.M().S(), null, i.d.c.IS_NOT_MIX_MODE, i.d.b.NEED_TO_LOG);
            if ((cVarN == null || cVarN.v() == 67) && z2 && i.a.p().f2746k) {
                cVarN = i.a.p().n(false);
            }
        } else if (z2 && i.a.p().f2746k) {
            cVarN = i.a.p().n(false);
        } else {
            cVarN = null;
        }
        if (cVarN == null || cVarN.v() != 66) {
            return;
        }
        boolean z4 = (n.i.f3409d.equals("all") && cVarN.c() == null) ? false : true;
        if (n.i.f3413f && cVarN.w() == null) {
            z4 = false;
        }
        if (((n.i.f3417h && cVarN.B() == null) ? false : z4) || z3) {
            b.c.r().n(cVarN);
        }
    }

    public final boolean l(j.a aVar) {
        if (aVar == null) {
            return false;
        }
        j.a aVar2 = this.f1802v;
        if (aVar2 == null) {
            return true;
        }
        return !aVar.b(aVar2);
    }

    public final boolean m(j.a aVar, j.a aVar2) {
        if (aVar2 == aVar) {
            return false;
        }
        if (aVar2 == null || aVar == null) {
            return true;
        }
        return true ^ aVar.b(aVar2);
    }

    public final boolean n(j.a aVar, HashSet<String> hashSet) {
        j.a aVarE = j.f.M().e();
        this.f1771b = aVarE;
        boolean zM = m(aVar, aVarE);
        if (n.i.f3452y0 == 0) {
            return zM;
        }
        boolean z2 = zM || j.f.M().u(aVar, this.f1771b);
        HashSet<String> hashSetI = j.f.M().I(this.f1771b);
        this.f1772c = hashSetI;
        return z2 || p(hashSet, hashSetI);
    }

    public final boolean o(j.k kVar) {
        j.k kVarS = j.f.M().S();
        this.f1770a = kVarS;
        if (kVar == kVarS) {
            return false;
        }
        if (kVarS == null || kVar == null) {
            return true;
        }
        return !j.f.M().x(this.f1770a, kVar, n.i.f3440s0);
    }

    public final boolean p(HashSet<String> hashSet, HashSet<String> hashSet2) {
        if ((hashSet == null || hashSet.isEmpty()) && (hashSet2 == null || hashSet2.isEmpty())) {
            return false;
        }
        if (hashSet == null || hashSet.isEmpty() || hashSet2 == null || hashSet2.isEmpty()) {
            return true;
        }
        int size = hashSet.size();
        Iterator<String> it = hashSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (hashSet2.contains(it.next())) {
                i2++;
            }
        }
        return ((float) i2) < ((float) size) * n.i.f3454z0;
    }

    public final void q(Message message) {
        b1.c cVar = new b1.c(j.d.l0().T());
        Location locationX = j.d.l0().X();
        if (locationX != null && "bd_beidou".equals(locationX.getProvider())) {
            cVar.c0("bd_beidou");
        }
        if (locationX != null) {
            cVar.Z(locationX.getExtras());
        }
        if (n.i.f3409d.equals("all") || n.i.f3413f || n.i.f3417h) {
            float[] fArr = new float[2];
            Location.distanceBetween(this.G, this.F, cVar.u(), cVar.x(), fArr);
            if (fArr[0] < 100.0f) {
                b1.a aVar = this.B;
                if (aVar != null) {
                    cVar.Q(aVar);
                }
                String str = this.C;
                if (str != null) {
                    cVar.q0(str);
                }
                List<b1.i> list = this.D;
                if (list != null) {
                    cVar.z0(list);
                }
                b1.j jVar = this.E;
                if (jVar != null) {
                    cVar.A0(jVar);
                }
            } else {
                this.H = true;
                C(null);
            }
        }
        this.f1796p = cVar;
        this.f1797q = null;
        s(cVar);
    }

    public final void s(b1.c cVar) {
        if (n.i.f3423k || cVar.y() <= 0) {
            b.c.r().n(cVar);
        } else {
            b.c.r().e(cVar);
        }
    }

    public final void t(String str) {
        if (str != null) {
            "subway".equals(str.toLowerCase());
        }
    }

    public void w() {
        this.f1796p = null;
    }

    public final void x(Message message) {
        if (j.d.l0().x0()) {
            q(message);
            t.c().g();
        } else {
            C(message);
            t.c().f();
        }
    }

    public void y(b1.c cVar) {
        g gVarA;
        int i2;
        String str;
        String strU;
        b1.c cVar2;
        b1.c cVar3 = new b1.c(cVar);
        if (cVar.M()) {
            b1.a aVarD = cVar.d();
            this.B = aVarD;
            if (aVarD != null && aVarD.f1902e != null) {
                System.currentTimeMillis();
            }
            this.F = cVar.x();
            this.G = cVar.u();
        }
        if (cVar.w() != null) {
            this.C = cVar.w();
            this.F = cVar.x();
            this.G = cVar.u();
        }
        if (cVar.B() != null) {
            this.D = cVar.B();
            this.F = cVar.x();
            this.G = cVar.u();
        }
        if (cVar.C() != null) {
            this.E = cVar.C();
            this.F = cVar.x();
            this.G = cVar.u();
        }
        boolean z2 = false;
        if (j.d.l0().x0()) {
            b1.c cVar4 = new b1.c(j.d.l0().T());
            Location locationX = j.d.l0().X();
            if (locationX != null && "bd_beidou".equals(locationX.getProvider())) {
                cVar4.c0("bd_beidou");
            }
            if (locationX != null) {
                cVar4.Z(locationX.getExtras());
            }
            if (n.i.f3409d.equals("all") || n.i.f3413f || n.i.f3417h) {
                float[] fArr = new float[2];
                Location.distanceBetween(this.G, this.F, cVar4.u(), cVar4.x(), fArr);
                if (fArr[0] < 100.0f) {
                    b1.a aVar = this.B;
                    if (aVar != null) {
                        cVar4.Q(aVar);
                    }
                    String str2 = this.C;
                    if (str2 != null) {
                        cVar4.q0(str2);
                    }
                    List<b1.i> list = this.D;
                    if (list != null) {
                        cVar4.z0(list);
                    }
                    b1.j jVar = this.E;
                    if (jVar != null) {
                        cVar4.A0(jVar);
                    }
                }
            }
            s(cVar4);
            B();
            return;
        }
        if (this.L) {
            float[] fArr2 = new float[2];
            b1.c cVar5 = this.f1796p;
            if (cVar5 != null) {
                Location.distanceBetween(cVar5.u(), this.f1796p.x(), cVar.u(), cVar.x(), fArr2);
            }
            if (fArr2[0] > 10.0f) {
                this.f1796p = cVar;
                if (!this.M) {
                    this.M = false;
                    b.c.r().n(cVar);
                }
            } else if (cVar.L() > -1) {
                this.f1796p = cVar;
                b.c.r().n(cVar);
            }
            B();
            return;
        }
        if (cVar.v() == 167) {
            g.a().b(167, 8, "NetWork location failed because baidu location service can not caculate the location!");
        } else if (cVar.v() == 161) {
            int iX = n.i.x(com.baidu.location.f.c());
            if (iX == 0 || iX == 2) {
                g.a().b(161, 1, "NetWork location successful, open gps will be better!");
            } else if (cVar.E() >= 100.0f && cVar.z() != null && cVar.z().equals("cl") && (strU = j.f.M().U()) != null && !strU.equals("&wifio=1")) {
                g.a().b(161, 2, "NetWork location successful, open wifi will be better!");
            }
        } else {
            int i3 = 160;
            if (cVar.v() == 160) {
                gVarA = g.a();
                i2 = 10;
                str = "Coarse location successful, open Accurately locate permission will be better!";
            } else if (n.i.M()) {
                i3 = 62;
                if (cVar.v() == 62) {
                    gVarA = g.a();
                    i2 = 11;
                    str = "Coarse location failed because we can not get any loc result";
                }
            }
            gVarA.b(i3, i2, str);
        }
        String strI = null;
        this.f1797q = null;
        if (cVar.v() == 161 && "cl".equals(cVar.z()) && (cVar2 = this.f1796p) != null && cVar2.v() == 161 && "wf".equals(this.f1796p.z()) && System.currentTimeMillis() - this.A < 30000) {
            this.f1797q = cVar;
            z2 = true;
        }
        b.c cVarR = b.c.r();
        if (z2) {
            cVarR.n(this.f1796p);
        } else {
            cVarR.n(cVar);
            this.A = System.currentTimeMillis();
        }
        if (!n.i.o(cVar)) {
            this.f1796p = null;
        } else if (!z2) {
            this.f1796p = cVar;
        }
        int iD = n.i.d(m.f1769l, "ssid\":\"", "\"");
        if (iD != Integer.MIN_VALUE && this.f1799s != null) {
            strI = j.f.M().i(iD, this.f1799s);
        }
        this.f1795o = strI;
        if (i.d.n().t() && cVar.v() == 161 && "cl".equals(cVar.z()) && l(this.f1800t)) {
            i.d.n().c(this.f1800t, null, cVar3, i.d.c.IS_NOT_MIX_MODE, i.d.b.NO_NEED_TO_LOG);
            this.f1802v = this.f1800t;
        }
        if (i.d.n().t() && cVar.v() == 161 && "wf".equals(cVar.z())) {
            i.d.n().c(null, this.f1799s, cVar3, i.d.c.IS_NOT_MIX_MODE, i.d.b.NO_NEED_TO_LOG);
        }
        if (this.f1800t != null && this.f1799s != null) {
            i.a.p().j(m.f1769l, this.f1800t, this.f1799s, cVar3);
        }
        if (j.f.M().Y()) {
            i.d.n().z();
            i.d.n().y();
        }
        B();
    }
}
