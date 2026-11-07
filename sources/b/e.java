package b;

import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lock f1677a = new ReentrantLock();

    public static int a(String str) {
        if (str != null && !"".equals(str) && c()) {
            Lock lock = f1677a;
            lock.lock();
            try {
                int gpsStatus = IndoorJni.getGpsStatus(0, str);
                lock.unlock();
                return gpsStatus;
            } catch (Throwable unused) {
                f1677a.unlock();
            }
        }
        return -1;
    }

    public static int b(String str, String str2) {
        if (str == null || "".equals(str)) {
            return -100;
        }
        if (str2 == null || "".equals(str2)) {
            str2 = "default";
        }
        if (!c()) {
            return -101;
        }
        Lock lock = f1677a;
        lock.lock();
        try {
            int iInitGpsChecker = IndoorJni.initGpsChecker(0, str, str2);
            lock.unlock();
            return iInitGpsChecker;
        } catch (Throwable unused) {
            f1677a.unlock();
            return -101;
        }
    }

    public static boolean c() {
        return IndoorJni.f2184a;
    }

    public static int d() {
        if (!c()) {
            return 0;
        }
        Lock lock = f1677a;
        lock.lock();
        try {
            int iDestroyGpsChecker = IndoorJni.destroyGpsChecker();
            lock.unlock();
            return iDestroyGpsChecker;
        } catch (Throwable unused) {
            f1677a.unlock();
            return 0;
        }
    }
}
