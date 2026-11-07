package b;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.LruCache;
import com.baidu.location.Jni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f1644i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<b> f1645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1.c f1648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1.c f1649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LruCache<String, JSONObject> f1651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1652h;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Messenger f1654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b1.h f1655c = new b1.h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1656d = 0;

        public b(c cVar, Message message) {
            this.f1653a = null;
            this.f1654b = null;
            this.f1654b = message.replyTo;
            this.f1653a = message.getData().getString("packName");
            this.f1655c.f2005f = message.getData().getString("prodName");
            n.b.g().e(this.f1655c.f2005f, this.f1653a);
            this.f1655c.f2000a = message.getData().getString("coorType");
            this.f1655c.f2001b = message.getData().getString("addrType");
            this.f1655c.f2009j = message.getData().getBoolean("enableSimulateGps", false);
            n.i.f3423k = n.i.f3423k || this.f1655c.f2009j;
            if (!n.i.f3409d.equals("all")) {
                n.i.f3409d = this.f1655c.f2001b;
            }
            this.f1655c.f2002c = message.getData().getBoolean("openGPS");
            this.f1655c.f2003d = message.getData().getInt("scanSpan");
            this.f1655c.f2004e = message.getData().getInt("timeOut");
            this.f1655c.f2006g = message.getData().getInt("priority");
            this.f1655c.f2007h = message.getData().getBoolean("location_change_notify");
            this.f1655c.f2013n = message.getData().getBoolean("needDirect", false);
            this.f1655c.f2018s = message.getData().getBoolean("isneedaltitude", false);
            this.f1655c.f2019t = message.getData().getBoolean("isneednewrgc", false);
            n.i.f3415g = n.i.f3415g || this.f1655c.f2019t;
            n.i.f3413f = n.i.f3413f || message.getData().getBoolean("isneedaptag", false);
            n.i.f3417h = n.i.f3417h || message.getData().getBoolean("isneedaptagd", false);
            n.i.O = message.getData().getFloat("autoNotifyLocSensitivity", 0.5f);
            int i2 = message.getData().getInt("wfnum", n.i.f3436q0);
            float f2 = message.getData().getFloat("wfsm", n.i.f3440s0);
            int i3 = message.getData().getInt("gnmcon", n.i.f3444u0);
            double d2 = message.getData().getDouble("gnmcrm", n.i.f3442t0);
            int i4 = message.getData().getInt("iupl", 1);
            n.i.H0 = message.getData().getInt("ct", 10);
            n.i.I0 = message.getData().getInt("suci", 3);
            n.i.K0 = message.getData().getDoubleArray("cgs");
            n.i.L0 = message.getData().getInt("ums", 1);
            n.i.J0 = message.getData().getInt("smn", 40);
            if (i4 <= 0) {
                n.i.G0 = 0;
            } else if (n.i.G0 == -1) {
                n.i.G0 = 1;
            }
            if (message.getData().getInt("opetco", 1) == 0) {
                n.i.M0 = 0;
            }
            if (message.getData().getInt("lpcs", n.i.N0) == 0) {
                n.i.N0 = 0;
            }
            if (i3 == 1) {
                n.i.f3444u0 = 1;
            }
            if (d2 > n.i.f3442t0) {
                n.i.f3442t0 = d2;
            }
            n.i.f3434p0 = n.i.f3434p0 || message.getData().getBoolean("ischeckper", false);
            n.i.P0 = n.i.P0 || message.getData().getBoolean("isEnableBeidouMode", false);
            if (i2 > n.i.f3436q0) {
                n.i.f3436q0 = i2;
            }
            if (f2 > n.i.f3440s0) {
                n.i.f3440s0 = f2;
            }
            int i5 = message.getData().getInt("wifitimeout", Integer.MAX_VALUE);
            if (i5 < n.i.f3404a0) {
                n.i.f3404a0 = i5;
            }
            int i6 = message.getData().getInt("autoNotifyMaxInterval", 0);
            if (i6 >= n.i.T) {
                n.i.T = i6;
            }
            int i7 = message.getData().getInt("autoNotifyMinDistance", 0);
            if (i7 >= n.i.V) {
                n.i.V = i7;
            }
            int i8 = message.getData().getInt("autoNotifyMinTimeInterval", 0);
            if (i8 >= n.i.U) {
                n.i.U = i8;
            }
            b1.h hVar = this.f1655c;
            if (hVar.f2013n || hVar.f2018s) {
                t.c().d(this.f1655c.f2013n);
                t.c().f();
            }
            cVar.f1647c = cVar.f1647c || this.f1655c.f2018s;
            if (message.getData().getInt("hpdts", n.i.f3446v0) == 1) {
                n.i.f3446v0 = 1;
            } else {
                n.i.f3446v0 = 0;
            }
            if (message.getData().getInt("oldts", n.i.f3448w0) == 1) {
                n.i.f3448w0 = 1;
            } else {
                n.i.f3448w0 = 0;
            }
            int i9 = message.getData().getInt("onic", n.i.f3450x0);
            if (i9 == 0) {
                n.i.f3450x0 = i9;
            }
            int i10 = message.getData().getInt("nlcs", n.i.f3452y0);
            if (i10 == 1) {
                n.i.f3452y0 = i10;
            }
            n.i.f3454z0 = message.getData().getFloat("ncsr", n.i.f3454z0);
            n.i.A0 = message.getData().getFloat("cscr", n.i.A0);
            n.i.B0 = message.getData().getInt("cls", n.i.B0);
            int[] intArray = message.getData().getIntArray("ocs");
            n.i.C0 = intArray;
            n.i.D0 = n.i.p(intArray);
            n.i.E0 = message.getData().getInt("topCellNumber");
            n.i.F0 = message.getData().getInt("locStrLength");
            j.f.M().k(null, message.getData().getString("connectBssid", null));
        }

        public final double a(boolean z2, b1.c cVar, b1.c cVar2) {
            double d2;
            double dA;
            double dU;
            double dX;
            double dU2;
            double dX2;
            double[] dArrD;
            double[] dArrD2;
            if (!z2) {
                if (!TextUtils.equals(cVar2.j(), cVar.j())) {
                    double[] dArrD3 = Jni.d(cVar.x(), cVar.u(), "gcj2wgs");
                    cVar.n0(dArrD3[1]);
                    d2 = dArrD3[0];
                    cVar.t0(d2);
                    cVar.G0(n.i.K());
                    cVar.V("wgs84");
                    dA = n.i.a(cVar2.u(), cVar2.x(), cVar.u(), cVar.x());
                }
                dU = cVar2.u();
                dX = cVar2.x();
                dU2 = cVar.u();
                dX2 = cVar.x();
                dA = n.i.a(dU, dX, dU2, dX2);
            } else if (TextUtils.equals(cVar2.j(), cVar.j())) {
                if (TextUtils.equals("bd09", cVar2.j())) {
                    double[] dArrD4 = Jni.d(cVar2.x(), cVar2.u(), "bd092gcj");
                    double[] dArrD5 = Jni.d(cVar.x(), cVar.u(), "bd092gcj");
                    dU = dArrD4[1];
                    dX = dArrD4[0];
                    dU2 = dArrD5[1];
                    dX2 = dArrD5[0];
                } else {
                    dU = cVar2.u();
                    dX = cVar2.x();
                    dU2 = cVar.u();
                    dX2 = cVar.x();
                }
                dA = n.i.a(dU, dX, dU2, dX2);
            } else {
                if (TextUtils.equals("wgs84", cVar.j())) {
                    dArrD = new double[]{cVar.x(), cVar.u()};
                } else {
                    if (TextUtils.equals("bd09", cVar.j())) {
                        dArrD2 = Jni.d(cVar.x(), cVar.u(), "bd092gcj");
                    } else {
                        dArrD2 = TextUtils.equals("bd09ll", cVar.j()) ? Jni.d(cVar.x(), cVar.u(), "bd09ll2gcj") : new double[]{cVar.x(), cVar.u()};
                    }
                    dArrD = Jni.d(dArrD2[0], dArrD2[1], "gcj2wgs");
                }
                cVar.n0(dArrD[1]);
                d2 = dArrD[0];
                cVar.t0(d2);
                cVar.G0(n.i.K());
                cVar.V("wgs84");
                dA = n.i.a(cVar2.u(), cVar2.x(), cVar.u(), cVar.x());
            }
            cVar2.Y(dA);
            if (cVar != null) {
                cVar2.C0(cVar);
            }
            return dA;
        }

        public final int b(double d2) {
            if (d2 >= 0.0d && d2 <= 10.0d) {
                return 0;
            }
            if (d2 <= 10.0d || d2 > 100.0d) {
                return (d2 <= 100.0d || d2 > 200.0d) ? 3 : 2;
            }
            return 1;
        }

        public int c(int i2, boolean z2, b1.c cVar) {
            double dA;
            if (i2 == 100) {
                if (z2) {
                    b1.c cVarM = m();
                    if (cVarM == null) {
                        return 3;
                    }
                    a(true, cVarM, cVar);
                    return 3;
                }
                b1.c cVarN = n();
                if (cVarN == null) {
                    return 3;
                }
                a(false, cVarN, cVar);
                return 3;
            }
            if (i2 == 200 || i2 == 300) {
                return 1;
            }
            if (i2 != 400) {
                return i2 == 500 ? 1 : 0;
            }
            if (z2) {
                b1.c cVarM2 = m();
                if (cVarM2 == null) {
                    return -1;
                }
                dA = a(true, cVarM2, cVar);
            } else {
                b1.c cVarN2 = n();
                if (cVarN2 == null) {
                    return -1;
                }
                dA = a(false, cVarN2, cVar);
            }
            return b(dA);
        }

        public void d() {
            if (this.f1655c.f2007h) {
                e(n.i.f3405b ? 54 : 55);
            }
        }

        public final void e(int i2) {
            Message messageObtain = Message.obtain((Handler) null, i2);
            try {
                Messenger messenger = this.f1654b;
                if (messenger != null) {
                    messenger.send(messageObtain);
                }
                this.f1656d = 0;
            } catch (Exception e2) {
                if (e2 instanceof DeadObjectException) {
                    this.f1656d++;
                }
            }
        }

        public final void f(int i2, Bundle bundle) {
            Message messageObtain = Message.obtain((Handler) null, i2);
            messageObtain.setData(bundle);
            try {
                Messenger messenger = this.f1654b;
                if (messenger != null) {
                    messenger.send(messageObtain);
                }
                this.f1656d = 0;
            } catch (Exception e2) {
                if (e2 instanceof DeadObjectException) {
                    this.f1656d++;
                }
                e2.printStackTrace();
            }
        }

        public final void g(int i2, String str, b1.c cVar) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(str, cVar);
            bundle.setClassLoader(b1.c.class.getClassLoader());
            Message messageObtain = Message.obtain((Handler) null, i2);
            messageObtain.setData(bundle);
            try {
                Messenger messenger = this.f1654b;
                if (messenger != null) {
                    messenger.send(messageObtain);
                }
                this.f1656d = 0;
            } catch (Exception e2) {
                if (e2 instanceof DeadObjectException) {
                    this.f1656d++;
                }
            }
        }

        public void j(b1.c cVar) {
            k(cVar, 21);
        }

        public void k(b1.c cVar, int i2) {
            int iC;
            String str;
            b1.c cVar2 = new b1.c(cVar);
            if (d.i.I().V()) {
                cVar2.g0(true);
            }
            if (i2 == 21) {
                g(27, "locStr", cVar2);
            }
            String str2 = this.f1655c.f2000a;
            if (str2 != null && !str2.equals("gcj02")) {
                double dX = cVar2.x();
                double dU = cVar2.u();
                if (dX != Double.MIN_VALUE && dU != Double.MIN_VALUE) {
                    if ((cVar2.j() != null && cVar2.j().equals("gcj02")) || cVar2.j() == null) {
                        double[] dArrD = Jni.d(dX, dU, this.f1655c.f2000a);
                        cVar2.t0(dArrD[0]);
                        cVar2.n0(dArrD[1]);
                        str = this.f1655c.f2000a;
                    } else if (cVar2.j() != null && cVar2.j().equals("wgs84") && !this.f1655c.f2000a.equals("bd09ll")) {
                        double[] dArrD2 = Jni.d(dX, dU, "wgs842mc");
                        cVar2.t0(dArrD2[0]);
                        cVar2.n0(dArrD2[1]);
                        str = "wgs84mc";
                    }
                    cVar2.V(str);
                }
                if (!n.i.f3423k && cVar2.y() > 0) {
                    iC = c(cVar2.y(), true, cVar2);
                    cVar2.u0(iC);
                }
            } else if (!n.i.f3423k && cVar2.y() > 0) {
                iC = c(cVar2.y(), false, cVar2);
                cVar2.u0(iC);
            }
            g(i2, "locStr", cVar2);
        }

        public void l() {
            e(111);
        }

        public final b1.c m() {
            b1.c cVarO0 = j.d.l0().o0();
            if (cVarO0 == null) {
                return null;
            }
            double[] dArrD = Jni.d(cVarO0.x(), cVarO0.u(), "gps2gcj");
            double[] dArrD2 = Jni.d(dArrD[0], dArrD[1], this.f1655c.f2000a);
            b1.c cVar = new b1.c();
            cVar.t0(dArrD2[0]);
            cVar.n0(dArrD2[1]);
            cVar.G0(n.i.K());
            cVar.o0(61);
            cVar.V(this.f1655c.f2000a);
            return cVar;
        }

        public final b1.c n() {
            b1.c cVarO0 = j.d.l0().o0();
            if (cVarO0 == null) {
                return null;
            }
            double[] dArrD = Jni.d(cVarO0.x(), cVarO0.u(), "gps2gcj");
            b1.c cVar = new b1.c();
            cVar.t0(dArrD[0]);
            cVar.n0(dArrD[1]);
            cVar.G0(n.i.K());
            cVar.o0(61);
            cVar.V("gcj02");
            return cVar;
        }
    }

    /* JADX INFO: renamed from: b.c$c, reason: collision with other inner class name */
    public static class C0015c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f1657a = new c();
    }

    public c() {
        this.f1645a = null;
        this.f1646b = false;
        this.f1647c = false;
        this.f1648d = null;
        this.f1649e = null;
        this.f1650f = new Object();
        this.f1652h = false;
        this.f1645a = new ArrayList<>();
        this.f1651g = new LruCache<>(3);
        r.c().d("sp_loc_map_end_str", "");
        r.c().d("sp_loc_navi_end_str", "");
        r.c().d("sp_loc_last_navi_end_str", "");
        String strD = r.c().d("sp_bluetooth_info", "");
        if (strD == null || "".equals(strD)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(strD);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                this.f1651g.put(jSONObject.getString("mac"), jSONObject);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static c r() {
        return C0015c.f1657a;
    }

    public final b a(Messenger messenger) {
        if (this.f1645a == null) {
            return null;
        }
        try {
            synchronized (this.f1650f) {
                for (b bVar : this.f1645a) {
                    if (bVar.f1654b.equals(messenger)) {
                        return bVar;
                    }
                }
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b() throws Throwable {
        boolean z2 = false;
        try {
            try {
                synchronized (this.f1650f) {
                    try {
                        Iterator<b> it = this.f1645a.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            b1.h hVar = it.next().f1655c;
                            if (hVar.f2002c) {
                                z2 = true;
                            }
                            if (hVar.f2007h) {
                                z2 = true;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                n.i.f3403a = z2;
                if (this.f1646b != z2 || (!j.d.l0().s0() && this.f1646b)) {
                    this.f1646b = z2;
                    j.d.l0().v(this.f1646b);
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void c(Bundle bundle, int i2) {
        synchronized (this.f1650f) {
            Iterator<b> it = this.f1645a.iterator();
            while (it.hasNext()) {
                try {
                    b next = it.next();
                    next.f(i2, bundle);
                    if (next.f1656d > 4) {
                        it.remove();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void d(b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f1650f) {
            if (a(bVar.f1654b) != null) {
                bVar.e(14);
            } else {
                this.f1645a.add(bVar);
                bVar.e(13);
            }
        }
    }

    public void e(b1.c cVar) {
        b1.a aVarG = o.M().g(cVar);
        String strO = o.M().O();
        List<b1.i> listP = o.M().P();
        b1.j jVarQ = o.M().Q();
        if (aVarG != null) {
            cVar.Q(aVarG);
        }
        if (strO != null) {
            cVar.q0(strO);
        }
        if (listP != null) {
            cVar.z0(listP);
        }
        if (jVarQ != null) {
            cVar.A0(jVarQ);
        }
        if (d.i.I().X() && d.i.I().Q() != null) {
            cVar.a0(d.i.I().Q());
            cVar.g0(true);
            if (d.i.I().M() != null) {
                cVar.T(d.i.I().M());
            }
        }
        n(cVar);
        o.M().D(cVar);
    }

    public final void f(String str) {
        Intent intent = new Intent("com.baidu.location.flp.log");
        intent.setPackage("com.baidu.baidulocationdemo");
        intent.putExtra("data", str);
        intent.putExtra("pack", n.b.f3344f);
        intent.putExtra("tag", "state");
        com.baidu.location.f.c().sendBroadcast(intent);
    }

    public void g(boolean z2) {
    }

    public boolean h(Message message) {
        b bVarA = a(message.replyTo);
        boolean z2 = false;
        if (bVarA == null) {
            return false;
        }
        b1.h hVar = bVarA.f1655c;
        int i2 = hVar.f2003d;
        hVar.f2003d = message.getData().getInt("scanSpan", bVarA.f1655c.f2003d);
        if (bVarA.f1655c.f2003d < 1000) {
            t.c().g();
        }
        b1.h hVar2 = bVarA.f1655c;
        if (hVar2.f2003d > 999 && i2 < 1000) {
            if (hVar2.f2013n || hVar2.f2018s) {
                t.c().d(bVarA.f1655c.f2013n);
                t.c().f();
            }
            this.f1647c = this.f1647c || bVarA.f1655c.f2018s;
            z2 = true;
        }
        bVarA.f1655c.f2002c = message.getData().getBoolean("openGPS", bVarA.f1655c.f2002c);
        String string = message.getData().getString("coorType");
        b1.h hVar3 = bVarA.f1655c;
        if (string == null || string.equals("")) {
            string = bVarA.f1655c.f2000a;
        }
        hVar3.f2000a = string;
        String string2 = message.getData().getString("addrType");
        b1.h hVar4 = bVarA.f1655c;
        if (string2 == null || string2.equals("")) {
            string2 = bVarA.f1655c.f2001b;
        }
        hVar4.f2001b = string2;
        if (!n.i.f3409d.equals(bVarA.f1655c.f2001b)) {
            o.M().w();
        }
        bVarA.f1655c.f2004e = message.getData().getInt("timeOut", bVarA.f1655c.f2004e);
        bVarA.f1655c.f2007h = message.getData().getBoolean("location_change_notify", bVarA.f1655c.f2007h);
        bVarA.f1655c.f2006g = message.getData().getInt("priority", bVarA.f1655c.f2006g);
        n.i.f3411e = bVarA.f1655c.f2006g;
        int i3 = message.getData().getInt("wifitimeout", Integer.MAX_VALUE);
        if (i3 < n.i.f3404a0) {
            n.i.f3404a0 = i3;
        }
        j();
        return z2;
    }

    public int i(Message message) {
        Messenger messenger;
        b bVarA;
        if (message == null || (messenger = message.replyTo) == null || (bVarA = a(messenger)) == null || bVarA.f1655c == null) {
            return 1;
        }
        return n.i.f3411e;
    }

    public final void j() throws Throwable {
        b();
        t();
        v();
    }

    public void k(b1.c cVar) {
        e(cVar);
    }

    public int l(Message message) {
        Messenger messenger;
        b bVarA;
        b1.h hVar;
        if (message == null || (messenger = message.replyTo) == null || (bVarA = a(messenger)) == null || (hVar = bVarA.f1655c) == null) {
            return 1000;
        }
        return hVar.f2003d;
    }

    public void m() {
        synchronized (this.f1650f) {
            try {
                ArrayList<b> arrayList = this.f1645a;
                if (arrayList != null) {
                    arrayList.clear();
                }
            } catch (Throwable unused) {
            }
        }
        this.f1648d = null;
        j();
    }

    public void n(b1.c cVar) {
        q(cVar);
    }

    public String o() {
        StringBuilder sb;
        StringBuffer stringBuffer = new StringBuffer(256);
        if (this.f1645a.isEmpty()) {
            return "&prod=" + n.b.f3345g + ":" + n.b.f3344f;
        }
        String string = stringBuffer.toString();
        try {
            b bVar = this.f1645a.get(0);
            String str = bVar.f1655c.f2005f;
            if (str != null) {
                stringBuffer.append(str);
            }
            if (bVar.f1653a != null) {
                stringBuffer.append(":");
                stringBuffer.append(bVar.f1653a);
                stringBuffer.append("|");
            }
            if (string == null || string.equals("")) {
                sb = new StringBuilder();
                sb.append("&prod=");
                sb.append(n.b.f3345g);
                sb.append(":");
                sb.append(n.b.f3344f);
            } else {
                sb = new StringBuilder();
                sb.append("&prod=");
                sb.append(string);
            }
            return sb.toString();
        } catch (Exception unused) {
            return "&prod=" + n.b.f3345g + ":" + n.b.f3344f;
        }
    }

    public void p(Message message) {
        if (message == null || message.replyTo == null) {
            return;
        }
        f1644i = System.currentTimeMillis();
        j.f.M().a0();
        d(new b(this, message));
        j();
        if (this.f1652h) {
            f("start");
        }
    }

    public void q(b1.c cVar) {
        b1.c cVar2;
        if (cVar == null || cVar.v() != 161 || a.a.e().d()) {
            if (!cVar.N() && this.f1647c && (cVar.v() == 161 || cVar.v() == 66)) {
                double d2 = c.a.g().f(cVar.x(), cVar.u())[0];
                c.a.g();
                if (d2 < 9999.0d) {
                    cVar.S(d2);
                }
            }
            if (cVar.v() == 61) {
                cVar.d0(c.a.g().a(cVar));
            }
            synchronized (this.f1650f) {
                Iterator<b> it = this.f1645a.iterator();
                while (it.hasNext()) {
                    try {
                        b next = it.next();
                        next.j(cVar);
                        if (next.f1656d > 4) {
                            it.remove();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } else {
            if (this.f1649e == null) {
                b1.c cVar3 = new b1.c();
                this.f1649e = cVar3;
                cVar3.o0(505);
            }
            synchronized (this.f1650f) {
                Iterator<b> it2 = this.f1645a.iterator();
                while (it2.hasNext()) {
                    try {
                        b next2 = it2.next();
                        next2.j(this.f1649e);
                        if (next2.f1656d > 4) {
                            it2.remove();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (cVar != null && (cVar.v() == 61 || cVar.v() == 161 || cVar.v() == 66)) {
            d.s().i(cVar.u(), cVar.x());
            d.s().l(cVar.i());
        }
        boolean z2 = o.f1792a0;
        if (z2) {
            o.f1792a0 = false;
        }
        if (n.i.T >= 10000) {
            if (cVar.v() == 61 || cVar.v() == 161 || cVar.v() == 66) {
                b1.c cVar4 = this.f1648d;
                if (cVar4 != null) {
                    float[] fArr = new float[1];
                    Location.distanceBetween(cVar4.u(), this.f1648d.x(), cVar.u(), cVar.x(), fArr);
                    if (fArr[0] <= n.i.V && !z2) {
                        return;
                    }
                    this.f1648d = null;
                    cVar2 = new b1.c(cVar);
                } else {
                    cVar2 = new b1.c(cVar);
                }
                this.f1648d = cVar2;
            }
        }
    }

    public void s(Message message) {
        synchronized (this.f1650f) {
            b bVarA = a(message.replyTo);
            if (bVarA != null) {
                this.f1645a.remove(bVarA);
            }
        }
        t.c().g();
        j();
        if (this.f1652h) {
            f("stop");
        }
    }

    public void t() {
        try {
            synchronized (this.f1650f) {
                Iterator<b> it = this.f1645a.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void u() {
        synchronized (this.f1650f) {
            Iterator<b> it = this.f1645a.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
        }
    }

    public final void v() {
        try {
            Iterator<b> it = this.f1645a.iterator();
            while (it.hasNext()) {
                n.i.f3411e = Math.min(n.i.f3411e, it.next().f1655c.f2006g);
            }
            if (com.baidu.location.f.f2179f) {
                return;
            }
            n.i.f3411e = 4;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
