package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver f644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f645d;

    private u(View view, Runnable runnable) {
        this.f643b = view;
        this.f644c = view.getViewTreeObserver();
        this.f645d = runnable;
    }

    public static u a(View view, Runnable runnable) {
        u uVar = new u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(uVar);
        view.addOnAttachStateChangeListener(uVar);
        return uVar;
    }

    public void b() {
        (this.f644c.isAlive() ? this.f644c : this.f643b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f643b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f645d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f644c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
