package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<View> f2623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f2624b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f2625c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2626d = -1;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f2627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2628b;

        a(r rVar, View view) {
            this.f2627a = rVar;
            this.f2628b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2627a.c(this.f2628b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2627a.a(this.f2628b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2627a.b(this.f2628b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f2630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2631b;

        b(t tVar, View view) {
            this.f2630a = tVar;
            this.f2631b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2630a.a(this.f2631b);
        }
    }

    q(View view) {
        this.f2623a = new WeakReference<>(view);
    }

    private void g(View view, r rVar) {
        if (rVar != null) {
            view.animate().setListener(new a(rVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public q a(float f2) {
        View view = this.f2623a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f2623a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f2623a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public q d(long j2) {
        View view = this.f2623a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public q e(Interpolator interpolator) {
        View view = this.f2623a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public q f(r rVar) {
        View view = this.f2623a.get();
        if (view != null) {
            g(view, rVar);
        }
        return this;
    }

    public q h(long j2) {
        View view = this.f2623a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public q i(t tVar) {
        View view = this.f2623a.get();
        if (view != null) {
            view.animate().setUpdateListener(tVar != null ? new b(tVar, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.f2623a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public q k(float f2) {
        View view = this.f2623a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
