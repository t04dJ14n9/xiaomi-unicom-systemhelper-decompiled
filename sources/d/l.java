package d;

import android.location.Location;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1.c f2358b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2357a = 450;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f2359c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f2360d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f2361e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f2362f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2363g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b1.c f2364h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2365i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2366j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f2367k = new Handler();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f2368l = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.f2364h != null) {
                l.a(l.this);
            }
            l.this.f2367k.postDelayed(l.this.f2368l, l.this.f2357a);
        }
    }

    public interface b {
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f2370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f2371b;

        public c() {
            this.f2370a = 0.0d;
            this.f2371b = 0.0d;
        }

        public c(double d2, double d3) {
            this.f2370a = d2;
            this.f2371b = d3;
        }
    }

    public static /* synthetic */ b a(l lVar) {
        lVar.getClass();
        return null;
    }

    public void b(long j2) {
        this.f2357a = j2;
    }

    public synchronized void c(b1.c cVar) {
        double dU = cVar.u();
        double dX = cVar.x();
        this.f2358b = cVar;
        this.f2359c = new c(dU, dX);
        if (this.f2360d == null) {
            this.f2360d = new c(dU, dX);
        }
        b1.c cVar2 = this.f2364h;
        if (cVar2 == null) {
            this.f2364h = new b1.c(cVar);
        } else {
            double dU2 = cVar2.u();
            double dX2 = this.f2364h.x();
            double dU3 = cVar.u();
            double dX3 = cVar.x();
            float[] fArr = new float[2];
            Location.distanceBetween(dU2, dX2, dU3, dX3, fArr);
            if (fArr[0] > 10.0f) {
                this.f2364h.n0(dU3);
                this.f2364h.t0(dX3);
            } else {
                this.f2364h.n0((dU2 + dU3) / 2.0d);
                this.f2364h.t0((dX2 + dX3) / 2.0d);
            }
        }
    }

    public boolean d() {
        return this.f2366j;
    }

    public void f() {
        this.f2365i = -1L;
        this.f2360d = null;
        this.f2359c = null;
        this.f2361e = new c();
        this.f2362f = new c();
        this.f2363g = new c();
    }

    public void g() {
        if (this.f2366j) {
            this.f2366j = false;
            this.f2367k.removeCallbacks(this.f2368l);
            f();
        }
    }
}
