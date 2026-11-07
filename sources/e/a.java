package e;

import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Lock f2432a = new ReentrantLock();

    public static synchronized String a(int i2, float[] fArr, long j2) {
        String strPhs;
        f2432a.lock();
        try {
            strPhs = (!b() || fArr == null || fArr.length < 3) ? null : IndoorJni.phs(i2, fArr[0], fArr[1], fArr[2], j2);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } catch (Throwable th2) {
                f2432a.unlock();
                throw th2;
            }
        }
        f2432a.unlock();
        return strPhs;
    }

    public static boolean b() {
        return IndoorJni.f2184a;
    }

    public static float c() {
        float fPgo;
        f2432a.lock();
        try {
            fPgo = IndoorJni.pgo();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                fPgo = -1.0f;
            } finally {
                f2432a.unlock();
            }
        }
        return fPgo;
    }

    public static void d() {
        f2432a.lock();
        try {
            IndoorJni.startPdr();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                f2432a.unlock();
            }
        }
    }

    public static void e() {
        f2432a.lock();
        try {
            IndoorJni.stopPdr();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                f2432a.unlock();
            }
        }
    }
}
