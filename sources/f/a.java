package f;

import b1.c;
import com.baidu.location.indoor.mapversion.IndoorJni;
import d.e;
import d.h;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lock f2493a = new ReentrantLock();

    public static boolean a() {
        return IndoorJni.f2184a;
    }

    public static synchronized boolean b(String str) throws Throwable {
        Object obj;
        try {
            if (!a()) {
                return false;
            }
            g.a.e eVarZ = g.a.t().z(str);
            double[][] dArrY = g.a.t().y(str);
            if (eVarZ == null) {
                return false;
            }
            eVarZ.e("gcj02");
            short[][] sArr = eVarZ.f2591h;
            double d2 = eVarZ.b().f2574a;
            double d3 = eVarZ.b().f2575b;
            g.a.e eVarL = g.a.t().l();
            if (eVarL == null) {
                return false;
            }
            try {
                double d4 = eVarL.d(-eVarZ.b().f2577d);
                double dA = eVarL.a(-eVarZ.b().f2579f);
                Lock lock = f2493a;
                lock.lock();
                try {
                    g.a.b bVar = eVarZ.f2590g;
                    obj = a.class;
                    try {
                        IndoorJni.setPfRdnt(str, sArr, d2, d3, (int) bVar.f2580g, (int) bVar.f2581h, d4, dA, eVarZ.f2586c);
                        g.a.b bVar2 = eVarZ.f2590g;
                        IndoorJni.setPfGeoMap(dArrY, str, (int) bVar2.f2580g, (int) bVar2.f2581h);
                        lock.unlock();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            th.printStackTrace();
                            f2493a.unlock();
                        } catch (Throwable th2) {
                            f2493a.unlock();
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = a.class;
                }
                return true;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            obj = a.class;
        }
        throw th;
    }

    public static double[] c(double d2, double d3, double d4, double d5, String str, String str2, long j2, int i2, String str3) {
        String str4 = str;
        double[] pfBle = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
        if (a()) {
            if (str4 == null || "".equals(str4)) {
                str4 = "unknow";
            }
            String str5 = str4;
            Lock lock = f2493a;
            lock.lock();
            try {
                pfBle = IndoorJni.setPfBle(d2, d3, d4, d5, str5, str2, j2, i2, str3);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f2493a;
                } catch (Throwable th2) {
                    f2493a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
        }
        return pfBle;
    }

    public static synchronized double[] d(String str, double d2, double d3, double d4, String str2) {
        if (!a()) {
            return null;
        }
        g.a.e eVarL = g.a.t().l();
        double[] pfDr = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
        if (eVarL != null) {
            Lock lock = f2493a;
            lock.lock();
            try {
                pfDr = IndoorJni.setPfDr(d3, d4, str2, System.currentTimeMillis());
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f2493a;
                } catch (Throwable th2) {
                    f2493a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
            if (pfDr[0] == 0.0d) {
                double dF = eVarL.f(pfDr[1]);
                double dG = eVarL.g(pfDr[2]);
                pfDr[1] = dF;
                pfDr[2] = dG;
            }
        }
        return pfDr;
    }

    public static synchronized double[] e(boolean z2, c cVar) {
        if (!a()) {
            return null;
        }
        g.a.e eVarL = g.a.t().l();
        double[] pfWf = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d, -1.0d};
        if (eVarL != null) {
            double d2 = eVarL.d(cVar.x());
            double dA = eVarL.a(cVar.u());
            if (z2) {
                String strA = h.a(2);
                if (strA != null || !"".equals(strA)) {
                    strA = strA.split("_")[0];
                }
                if (strA == null || "".equals(strA)) {
                    strA = "unknow";
                }
                String str = strA;
                String strB = e.a().b();
                if (strB == null || "".equals(strB)) {
                    strB = "unknow";
                }
                String str2 = strB;
                str.toUpperCase();
                int iF = h.f(2);
                String strG = cVar.g();
                if (strG == null || "".equals(strG)) {
                    strG = "unknown";
                }
                pfWf = c(d2, dA, cVar.E(), cVar.b(), str, str2, System.currentTimeMillis(), iF, strG);
            } else {
                Lock lock = f2493a;
                lock.lock();
                try {
                    pfWf = IndoorJni.setPfWf(d2, dA, 8.0d, System.currentTimeMillis());
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        lock = f2493a;
                    } catch (Throwable th2) {
                        f2493a.unlock();
                        throw th2;
                    }
                }
                lock.unlock();
            }
            if (pfWf[0] == 0.0d) {
                double dF = eVarL.f(pfWf[1]);
                double dG = eVarL.g(pfWf[2]);
                pfWf[1] = dF;
                pfWf[2] = dG;
            }
        }
        return pfWf;
    }

    public static void f() {
        if (a()) {
            Lock lock = f2493a;
            lock.lock();
            try {
                IndoorJni.initPf();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f2493a;
                } catch (Throwable th2) {
                    f2493a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
        }
    }

    public static void g() {
        if (a()) {
            Lock lock = f2493a;
            lock.lock();
            try {
                IndoorJni.resetPf();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    lock = f2493a;
                } catch (Throwable th2) {
                    f2493a.unlock();
                    throw th2;
                }
            }
            lock.unlock();
        }
    }
}
