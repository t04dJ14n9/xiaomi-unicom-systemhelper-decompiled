package android.support.v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f1348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f1351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f1352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f1353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f1356j = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = f0.this.f1351e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.e();
        }
    }

    public f0(View view) {
        this.f1351e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1348b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1349c = tapTimeout;
        this.f1350d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1353g;
        if (runnable != null) {
            this.f1351e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1352f;
        if (runnable2 != null) {
            this.f1351e.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        d0 d0Var;
        View view = this.f1351e;
        n0.h hVarB = b();
        if (hVarB == null || !hVarB.h() || (d0Var = (d0) hVarB.i()) == null || !d0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(d0Var, motionEventObtainNoHistory);
        boolean zE = d0Var.e(motionEventObtainNoHistory, this.f1355i);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f1351e;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1355i = motionEvent.getPointerId(0);
            if (this.f1352f == null) {
                this.f1352f = new a();
            }
            view.postDelayed(this.f1352f, this.f1349c);
            if (this.f1353g == null) {
                this.f1353g = new b();
            }
            view.postDelayed(this.f1353g, this.f1350d);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f1355i);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f1348b)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1356j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1356j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract n0.h b();

    protected abstract boolean c();

    protected boolean d() {
        n0.h hVarB = b();
        if (hVarB == null || !hVarB.h()) {
            return true;
        }
        hVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1351e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1354h = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = this.f1354h;
        if (z3) {
            z2 = f(motionEvent) || !d();
        } else {
            z2 = g(motionEvent) && c();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1351e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1354h = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1354h = false;
        this.f1355i = -1;
        Runnable runnable = this.f1352f;
        if (runnable != null) {
            this.f1351e.removeCallbacks(runnable);
        }
    }
}
