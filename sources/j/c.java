package j;

import android.location.Location;
import b.p;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0033c f2905a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Location f2906b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Location f2907c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2908d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2909e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Timer f2910f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TimerTask f2911g = null;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            c.this.g();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f2913a = new c();
    }

    /* JADX INFO: renamed from: j.c$c, reason: collision with other inner class name */
    public class C0033c implements p.d {
        public C0033c() {
        }

        public /* synthetic */ C0033c(c cVar, a aVar) {
            this();
        }

        @Override // b.p.d
        public void a(Location location) {
            if (location == null) {
                return;
            }
            c cVar = c.this;
            cVar.f2906b = location;
            cVar.f2909e = System.currentTimeMillis();
        }
    }

    public static c d() {
        return b.f2913a;
    }

    public Location a() {
        return System.currentTimeMillis() - this.f2908d < 30000 ? this.f2907c : System.currentTimeMillis() - this.f2909e < 30000 ? this.f2906b : null;
    }

    public String b(Location location) {
        if (location != null) {
            return String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d&ll_r=%d", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf((float) (((double) location.getSpeed()) * 3.6d)), Float.valueOf(location.getBearing()), 0, Long.valueOf(location.getTime() / 1000), Integer.valueOf((int) (location.hasAccuracy() ? location.getAccuracy() : -1.0f)));
        }
        return null;
    }

    public boolean c(Location location, Location location2) {
        if (location2 == null) {
            return false;
        }
        if (location == null) {
            return true;
        }
        try {
            float[] fArr = new float[2];
            Location.distanceBetween(location.getLatitude(), location.getLongitude(), location2.getLatitude(), location2.getLongitude(), fArr);
            return fArr[0] >= 100.0f;
        } catch (Exception unused) {
        }
    }

    public void e(Location location) {
        this.f2907c = location;
        this.f2908d = System.currentTimeMillis();
    }

    public void f() {
        if (n.i.f3450x0 == 0) {
            return;
        }
        if (!n.i.M()) {
            g();
            return;
        }
        h();
        if (this.f2910f == null && this.f2911g == null) {
            this.f2910f = new Timer();
            a aVar = new a();
            this.f2911g = aVar;
            this.f2910f.schedule(aVar, 60000L);
        }
        if (this.f2905a == null) {
            this.f2905a = new C0033c(this, null);
            p.e().b(this.f2905a);
        }
    }

    public synchronized void g() {
        if (this.f2905a != null) {
            p.e().d(this.f2905a);
            this.f2905a = null;
        }
        h();
    }

    public final synchronized void h() {
        TimerTask timerTask = this.f2911g;
        if (timerTask != null) {
            timerTask.cancel();
            this.f2911g = null;
        }
        Timer timer = this.f2910f;
        if (timer != null) {
            timer.cancel();
            this.f2910f.purge();
            this.f2910f = null;
        }
    }
}
