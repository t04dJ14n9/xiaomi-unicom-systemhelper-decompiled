package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import g0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f686s = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f690e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f694i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f703r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C0005a f687b = new C0005a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Interpolator f688c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f691f = {0.0f, 0.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f692g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f695j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f696k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f697l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: android.support.v4.widget.a$a, reason: collision with other inner class name */
    private static class C0005a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f707d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f713j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f714k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f708e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f712i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f709f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f710g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f711h = 0;

        C0005a() {
        }

        private float e(long j2) {
            long j3 = this.f708e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f712i;
            if (j4 < 0 || j2 < j4) {
                return a.e((j2 - j3) / this.f704a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f713j;
            return (1.0f - f2) + (f2 * a.e((j2 - j4) / this.f714k, 0.0f, 1.0f));
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f709f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j2 = jCurrentAnimationTimeMillis - this.f709f;
            this.f709f = jCurrentAnimationTimeMillis;
            float f2 = j2 * fG;
            this.f710g = (int) (this.f706c * f2);
            this.f711h = (int) (f2 * this.f707d);
        }

        public int b() {
            return this.f710g;
        }

        public int c() {
            return this.f711h;
        }

        public int d() {
            float f2 = this.f706c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f707d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f712i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f712i + ((long) this.f714k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f714k = a.f((int) (jCurrentAnimationTimeMillis - this.f708e), 0, this.f705b);
            this.f713j = e(jCurrentAnimationTimeMillis);
            this.f712i = jCurrentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f705b = i2;
        }

        public void k(int i2) {
            this.f704a = i2;
        }

        public void l(float f2, float f3) {
            this.f706c = f2;
            this.f707d = f3;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f708e = jCurrentAnimationTimeMillis;
            this.f712i = -1L;
            this.f709f = jCurrentAnimationTimeMillis;
            this.f713j = 0.5f;
            this.f710g = 0;
            this.f711h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f701p) {
                if (aVar.f699n) {
                    aVar.f699n = false;
                    aVar.f687b.m();
                }
                C0005a c0005a = a.this.f687b;
                if (c0005a.h() || !a.this.u()) {
                    a.this.f701p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f700o) {
                    aVar2.f700o = false;
                    aVar2.c();
                }
                c0005a.a();
                a.this.j(c0005a.b(), c0005a.c());
                m.o(a.this.f689d, this);
            }
        }
    }

    public a(View view) {
        this.f689d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f686s);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float fH = h(this.f691f[i2], f3, this.f692g[i2], f2);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f5 = this.f695j[i2];
        float f6 = this.f696k[i2];
        float f7 = this.f697l[i2];
        float f8 = f5 * f4;
        return fH > 0.0f ? e(fH * f8, f6, f7) : -e((-fH) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        return f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        if (i2 > i4) {
            return i4;
        }
        return i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f693h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f701p && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float interpolation;
        float fE = e(f2 * f3, 0.0f, f4);
        float fG = g(f3 - f5, fE) - g(f5, fE);
        if (fG < 0.0f) {
            interpolation = -this.f688c.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f688c.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f699n) {
            this.f701p = false;
        } else {
            this.f687b.i();
        }
    }

    private void v() {
        int i2;
        if (this.f690e == null) {
            this.f690e = new b();
        }
        this.f701p = true;
        this.f699n = true;
        if (this.f698m || (i2 = this.f694i) <= 0) {
            this.f690e.run();
        } else {
            m.p(this.f689d, this.f690e, i2);
        }
        this.f698m = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f689d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.f694i = i2;
        return this;
    }

    public a l(int i2) {
        this.f693h = i2;
        return this;
    }

    public a m(boolean z2) {
        if (this.f702q && !z2) {
            i();
        }
        this.f702q = z2;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f692g;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.f697l;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f702q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return this.f703r && this.f701p;
        }
        this.f700o = true;
        this.f698m = false;
        this.f687b.l(d(0, motionEvent.getX(), view.getWidth(), this.f689d.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f689d.getHeight()));
        if (!this.f701p && u()) {
            v();
        }
        if (this.f703r) {
            return false;
        }
    }

    public a p(float f2, float f3) {
        float[] fArr = this.f696k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f687b.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f687b.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f691f;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.f695j;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean u() {
        C0005a c0005a = this.f687b;
        int iF = c0005a.f();
        int iD = c0005a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
