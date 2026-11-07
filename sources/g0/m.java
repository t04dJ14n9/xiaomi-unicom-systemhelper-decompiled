package g0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f2619a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakHashMap<View, q> f2620b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f2621c = false;

    static class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f2622a;

        a(l lVar) {
            this.f2622a = lVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) u.f(this.f2622a.a(view, u.g(windowInsets)));
        }
    }

    public static q a(View view) {
        if (f2620b == null) {
            f2620b = new WeakHashMap<>();
        }
        q qVar = f2620b.get(view);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(view);
        f2620b.put(view, qVar2);
        return qVar2;
    }

    static boolean b(View view, KeyEvent keyEvent) {
        return false;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static int e(View view) {
        return view.getLayoutDirection();
    }

    public static int f(View view) {
        return view.getMinimumHeight();
    }

    public static String g(View view) {
        return view.getTransitionName();
    }

    public static int h(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean i(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean j(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean k(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean l(View view) {
        return view.isLaidOut();
    }

    public static u m(View view, u uVar) {
        WindowInsets windowInsets = (WindowInsets) u.f(uVar);
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
        }
        return u.g(windowInsets);
    }

    public static void n(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void o(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void p(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static void q(View view) {
        view.requestApplyInsets();
    }

    public static void r(View view, b bVar) {
        view.setAccessibilityDelegate(bVar == null ? null : bVar.c());
    }

    public static void s(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void t(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void u(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void v(View view, float f2) {
        view.setElevation(f2);
    }

    public static void w(View view, l lVar) {
        if (lVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(lVar));
        }
    }

    public static void x(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }

    public static void y(View view, String str) {
        view.setTransitionName(str);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
