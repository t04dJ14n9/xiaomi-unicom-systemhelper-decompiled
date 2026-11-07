package d;

import com.baidu.location.indoor.mapversion.IndoorJni;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Lock f2253a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2254b = {100, 101, 102, 103, 104, 105, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121};

    public static String a(int i2) {
        String floor = "";
        if (e()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f2253a.lock();
            try {
                floor = IndoorJni.getFloor(jCurrentTimeMillis, i2);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f2253a.unlock();
                }
            }
        }
        return floor;
    }

    public static void b(double d2, double d3, float f2, float f3, float f4, double d4, int i2, long j2) {
        if (e()) {
            f2253a.lock();
            try {
                IndoorJni.setGps(d2, d3, f2, f3, f4, d4, i2, j2);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f2253a.unlock();
                }
            }
        }
    }

    public static void c(double d2, double d3, String str, int i2, long j2, int i3) {
        String str2 = str;
        if (e()) {
            if (str2 == null || "".equals(str)) {
                str2 = "unknow";
            }
            String str3 = str2;
            f2253a.lock();
            try {
                IndoorJni.setBleLoc4Scenario(d2, d3, str3, i2, j2, i3);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f2253a.unlock();
                }
            }
        }
    }

    public static void d(float f2, long j2) {
        if (e()) {
            f2253a.lock();
            try {
                IndoorJni.setBarometers(f2, j2);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f2253a.unlock();
                }
            }
        }
    }

    public static boolean e() {
        return IndoorJni.f2184a;
    }

    public static int f(int i2) {
        int inout = -1;
        if (e()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f2253a.lock();
            try {
                inout = IndoorJni.getInout(jCurrentTimeMillis, i2);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    f2253a.unlock();
                }
            }
        }
        return inout;
    }
}
