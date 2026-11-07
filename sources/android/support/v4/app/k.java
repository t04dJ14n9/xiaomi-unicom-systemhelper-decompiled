package android.support.v4.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
final class k extends android.support.v4.app.j implements LayoutInflater.Factory2 {
    static boolean F = false;
    static Field G;
    static final Interpolator H = new DecelerateInterpolator(2.5f);
    static final Interpolator I = new DecelerateInterpolator(1.5f);
    static final Interpolator J = new AccelerateInterpolator(2.5f);
    static final Interpolator K = new AccelerateInterpolator(1.5f);
    ArrayList<m> C;
    android.support.v4.app.l D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<l> f506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f507c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SparseArray<android.support.v4.app.e> f510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<android.support.v4.app.c> f511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<android.support.v4.app.e> f512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<android.support.v4.app.c> f513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ArrayList<Integer> f514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList<android.support.v4.app.j.a> f515k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    android.support.v4.app.i f518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    android.support.v4.app.g f519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    android.support.v4.app.e f520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    android.support.v4.app.e f521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f525u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String f526v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ArrayList<android.support.v4.app.c> f528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ArrayList<Boolean> f529y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    ArrayList<android.support.v4.app.e> f530z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f508d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ArrayList<android.support.v4.app.e> f509e = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArrayList<j> f516l = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f517m = 0;
    Bundle A = null;
    SparseArray<Parcelable> B = null;
    Runnable E = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.a0();
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f533c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f533c.j() != null) {
                    b.this.f533c.R0(null);
                    b bVar = b.this;
                    k kVar = k.this;
                    android.support.v4.app.e eVar = bVar.f533c;
                    kVar.C0(eVar, eVar.B(), 0, 0, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener animationListener, ViewGroup viewGroup, android.support.v4.app.e eVar) {
            super(animationListener);
            this.f532b = viewGroup;
            this.f533c = eVar;
        }

        @Override // android.support.v4.app.k.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f532b.post(new a());
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f538c;

        c(ViewGroup viewGroup, View view, android.support.v4.app.e eVar) {
            this.f536a = viewGroup;
            this.f537b = view;
            this.f538c = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f536a.endViewTransition(this.f537b);
            Animator animatorK = this.f538c.k();
            this.f538c.S0(null);
            if (animatorK == null || this.f536a.indexOfChild(this.f537b) >= 0) {
                return;
            }
            k kVar = k.this;
            android.support.v4.app.e eVar = this.f538c;
            kVar.C0(eVar, eVar.B(), 0, 0, false);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f542c;

        d(ViewGroup viewGroup, View view, android.support.v4.app.e eVar) {
            this.f540a = viewGroup;
            this.f541b = view;
            this.f542c = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f540a.endViewTransition(this.f541b);
            animator.removeListener(this);
            View view = this.f542c.J;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    private static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f544b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f544b.setLayerType(0, null);
            }
        }

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f544b = view;
        }

        @Override // android.support.v4.app.k.f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            g0.m.k(this.f544b);
            this.f544b.post(new a());
            super.onAnimationEnd(animation);
        }
    }

    private static class f implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animation.AnimationListener f546a;

        f(Animation.AnimationListener animationListener) {
            this.f546a = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f546a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f546a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f546a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f548b;

        g(Animator animator) {
            this.f547a = null;
            this.f548b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f547a = animation;
            this.f548b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f549a;

        h(View view) {
            this.f549a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f549a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f549a.setLayerType(2, null);
        }
    }

    private static class i extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ViewGroup f550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f554f;

        i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f554f = true;
            this.f550b = viewGroup;
            this.f551c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f554f = true;
            if (this.f552d) {
                return !this.f553e;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f552d = true;
                u.a(this.f550b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f554f = true;
            if (this.f552d) {
                return !this.f553e;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f552d = true;
                u.a(this.f550b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f552d || !this.f554f) {
                this.f550b.endViewTransition(this.f551c);
                this.f553e = true;
            } else {
                this.f554f = false;
                this.f550b.post(this);
            }
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f555a;
    }

    /* JADX INFO: renamed from: android.support.v4.app.k$k, reason: collision with other inner class name */
    static class C0004k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f556a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface l {
        boolean a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2);
    }

    static class m implements android.support.v4.app.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.support.v4.app.c f558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f559c;

        m(android.support.v4.app.c cVar, boolean z2) {
            this.f557a = z2;
            this.f558b = cVar;
        }

        @Override // android.support.v4.app.e.f
        public void a() {
            int i2 = this.f559c - 1;
            this.f559c = i2;
            if (i2 != 0) {
                return;
            }
            this.f558b.f400a.T0();
        }

        @Override // android.support.v4.app.e.f
        public void b() {
            this.f559c++;
        }

        public void c() {
            android.support.v4.app.c cVar = this.f558b;
            cVar.f400a.n(cVar, this.f557a, false, false);
        }

        public void d() {
            boolean z2 = this.f559c > 0;
            k kVar = this.f558b.f400a;
            int size = kVar.f509e.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.e eVar = kVar.f509e.get(i2);
                eVar.Y0(null);
                if (z2 && eVar.I()) {
                    eVar.a1();
                }
            }
            android.support.v4.app.c cVar = this.f558b;
            cVar.f400a.n(cVar, this.f557a, !z2, true);
        }

        public boolean e() {
            return this.f559c == 0;
        }
    }

    k() {
    }

    private boolean F0(String str, int i2, int i3) {
        android.support.v4.app.j jVarS0;
        a0();
        Y(true);
        android.support.v4.app.e eVar = this.f521q;
        if (eVar != null && i2 < 0 && str == null && (jVarS0 = eVar.s0()) != null && jVarS0.d()) {
            return true;
        }
        boolean zG0 = G0(this.f528x, this.f529y, str, i2, i3);
        if (zG0) {
            this.f507c = true;
            try {
                K0(this.f528x, this.f529y);
                m();
            } catch (Throwable th) {
                m();
                throw th;
            }
        }
        W();
        k();
        return zG0;
    }

    private int H0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, f0.b<android.support.v4.app.e> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            android.support.v4.app.c cVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (cVar.m() && !cVar.k(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                m mVar = new m(cVar, zBooleanValue);
                this.C.add(mVar);
                cVar.o(mVar);
                if (zBooleanValue) {
                    cVar.f();
                } else {
                    cVar.g(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, cVar);
                }
                e(bVar);
            }
        }
        return i4;
    }

    private void K0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        d0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f419t) {
                if (i3 != i2) {
                    c0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f419t) {
                        i3++;
                    }
                }
                c0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            c0(arrayList, arrayList2, i3, size);
        }
    }

    public static int O0(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void U(int i2) {
        try {
            this.f507c = true;
            A0(i2, false);
            this.f507c = false;
            a0();
        } catch (Throwable th) {
            this.f507c = false;
            throw th;
        }
    }

    private static void V0(View view, g gVar) {
        if (view == null || gVar == null || !Y0(view, gVar)) {
            return;
        }
        Animator animator = gVar.f548b;
        if (animator != null) {
            animator.addListener(new h(view));
            return;
        }
        Animation.AnimationListener animationListenerL0 = l0(gVar.f547a);
        view.setLayerType(2, null);
        gVar.f547a.setAnimationListener(new e(view, animationListenerL0));
    }

    private void X() {
        SparseArray<android.support.v4.app.e> sparseArray = this.f510f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.e eVarValueAt = this.f510f.valueAt(i2);
            if (eVarValueAt != null) {
                if (eVarValueAt.j() != null) {
                    int iB = eVarValueAt.B();
                    View viewJ = eVarValueAt.j();
                    Animation animation = viewJ.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewJ.clearAnimation();
                    }
                    eVarValueAt.R0(null);
                    C0(eVarValueAt, iB, 0, 0, false);
                } else if (eVarValueAt.k() != null) {
                    eVarValueAt.k().end();
                }
            }
        }
    }

    private static void X0(android.support.v4.app.l lVar) {
        if (lVar == null) {
            return;
        }
        List<android.support.v4.app.e> listB = lVar.b();
        if (listB != null) {
            Iterator<android.support.v4.app.e> it = listB.iterator();
            while (it.hasNext()) {
                it.next().E = true;
            }
        }
        List<android.support.v4.app.l> listA = lVar.a();
        if (listA != null) {
            Iterator<android.support.v4.app.l> it2 = listA.iterator();
            while (it2.hasNext()) {
                X0(it2.next());
            }
        }
    }

    private void Y(boolean z2) {
        if (this.f507c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f518n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f518n.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2) {
            l();
        }
        if (this.f528x == null) {
            this.f528x = new ArrayList<>();
            this.f529y = new ArrayList<>();
        }
        this.f507c = true;
        try {
            d0(null, null);
        } finally {
            this.f507c = false;
        }
    }

    static boolean Y0(View view, g gVar) {
        return view != null && gVar != null && view.getLayerType() == 0 && g0.m.j(view) && y0(gVar);
    }

    private static void b0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            android.support.v4.app.c cVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                cVar.c(-1);
                cVar.g(i2 == i3 + (-1));
            } else {
                cVar.c(1);
                cVar.f();
            }
            i2++;
        }
    }

    private void b1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new f0.e("FragmentManager"));
        android.support.v4.app.i iVar = this.f518n;
        try {
            if (iVar != null) {
                iVar.i("  ", null, printWriter, new String[0]);
            } else {
                a("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    private void c0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z2 = arrayList.get(i6).f419t;
        ArrayList<android.support.v4.app.e> arrayList3 = this.f530z;
        if (arrayList3 == null) {
            this.f530z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f530z.addAll(this.f509e);
        android.support.v4.app.e eVarO0 = o0();
        boolean z3 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            android.support.v4.app.c cVar = arrayList.get(i7);
            eVarO0 = !arrayList2.get(i7).booleanValue() ? cVar.h(this.f530z, eVarO0) : cVar.p(this.f530z, eVarO0);
            z3 = z3 || cVar.f408i;
        }
        this.f530z.clear();
        if (!z2) {
            p.B(this, arrayList, arrayList2, i2, i3, false);
        }
        b0(arrayList, arrayList2, i2, i3);
        if (z2) {
            f0.b<android.support.v4.app.e> bVar = new f0.b<>();
            e(bVar);
            int iH0 = H0(arrayList, arrayList2, i2, i3, bVar);
            w0(bVar);
            i4 = iH0;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z2) {
            p.B(this, arrayList, arrayList2, i2, i4, true);
            A0(this.f517m, true);
        }
        while (i6 < i3) {
            android.support.v4.app.c cVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = cVar2.f412m) >= 0) {
                j0(i5);
                cVar2.f412m = -1;
            }
            cVar2.n();
            i6++;
        }
        if (z3) {
            L0();
        }
    }

    public static int c1(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[PHI: r0 r2
      0x0031: PHI (r0v6 int) = (r0v4 int), (r0v3 int) binds: [B:29:0x006a, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r2v5 int) = (r2v2 int), (r2v1 int) binds: [B:29:0x006a, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    private void d0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<m> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.C.get(i2);
            if (arrayList != null && !mVar.f557a && (iIndexOf2 = arrayList.indexOf(mVar.f558b)) != -1 && arrayList2.get(iIndexOf2).booleanValue()) {
                mVar.c();
            } else if (mVar.e() || (arrayList != null && mVar.f558b.k(arrayList, 0, arrayList.size()))) {
                this.C.remove(i2);
                i2--;
                size--;
                if (arrayList == null || mVar.f557a || (iIndexOf = arrayList.indexOf(mVar.f558b)) == -1 || !arrayList2.get(iIndexOf).booleanValue()) {
                    mVar.d();
                } else {
                    mVar.c();
                }
            }
            i2++;
        }
    }

    private void e(f0.b<android.support.v4.app.e> bVar) {
        int i2 = this.f517m;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 3);
        int size = this.f509e.size();
        for (int i3 = 0; i3 < size; i3++) {
            android.support.v4.app.e eVar = this.f509e.get(i3);
            if (eVar.f439b < iMin) {
                C0(eVar, iMin, eVar.t(), eVar.u(), false);
                if (eVar.J != null && !eVar.B && eVar.O) {
                    bVar.add(eVar);
                }
            }
        }
    }

    private void h(android.support.v4.app.e eVar, g gVar, int i2) {
        View view = eVar.J;
        ViewGroup viewGroup = eVar.I;
        viewGroup.startViewTransition(view);
        eVar.Z0(i2);
        if (gVar.f547a != null) {
            i iVar = new i(gVar.f547a, viewGroup, view);
            eVar.R0(eVar.J);
            iVar.setAnimationListener(new b(l0(iVar), viewGroup, eVar));
            V0(view, gVar);
            eVar.J.startAnimation(iVar);
            return;
        }
        Animator animator = gVar.f548b;
        eVar.S0(animator);
        animator.addListener(new c(viewGroup, view, eVar));
        animator.setTarget(eVar.J);
        V0(eVar.J, gVar);
        animator.start();
    }

    private android.support.v4.app.e h0(android.support.v4.app.e eVar) {
        ViewGroup viewGroup = eVar.I;
        View view = eVar.J;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.f509e.indexOf(eVar) - 1; iIndexOf >= 0; iIndexOf--) {
                android.support.v4.app.e eVar2 = this.f509e.get(iIndexOf);
                if (eVar2.I == viewGroup && eVar2.J != null) {
                    return eVar2;
                }
            }
        }
        return null;
    }

    private void i0() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private void k() {
        SparseArray<android.support.v4.app.e> sparseArray = this.f510f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f510f.valueAt(size) == null) {
                    SparseArray<android.support.v4.app.e> sparseArray2 = this.f510f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private boolean k0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<l> arrayList3 = this.f506b;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f506b.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= this.f506b.get(i2).a(arrayList, arrayList2);
                }
                this.f506b.clear();
                this.f518n.g().removeCallbacks(this.E);
                return zA;
            }
            return false;
        }
    }

    private void l() {
        if (c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f526v == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.f526v);
    }

    private static Animation.AnimationListener l0(Animation animation) {
        String str;
        try {
            if (G == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                G = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) G.get(animation);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (NoSuchFieldException e3) {
            e = e3;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    private void m() {
        this.f507c = false;
        this.f529y.clear();
        this.f528x.clear();
    }

    static g t0(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g v0(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void w0(f0.b<android.support.v4.app.e> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.e eVarH = bVar.h(i2);
            if (!eVarH.f449l) {
                View viewC = eVarH.C();
                eVarH.Q = viewC.getAlpha();
                viewC.setAlpha(0.0f);
            }
        }
    }

    static boolean x0(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (x0(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean y0(g gVar) {
        Animation animation = gVar.f547a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return x0(gVar.f548b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    void A(android.support.v4.app.e eVar, Context context, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).A(eVar, context, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    void A0(int i2, boolean z2) {
        android.support.v4.app.i iVar;
        if (this.f518n == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f517m) {
            this.f517m = i2;
            if (this.f510f != null) {
                int size = this.f509e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    z0(this.f509e.get(i3));
                }
                int size2 = this.f510f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    android.support.v4.app.e eVarValueAt = this.f510f.valueAt(i4);
                    if (eVarValueAt != null && ((eVarValueAt.f450m || eVarValueAt.C) && !eVarValueAt.O)) {
                        z0(eVarValueAt);
                    }
                }
                a1();
                if (this.f522r && (iVar = this.f518n) != null && this.f517m == 4) {
                    iVar.n();
                    this.f522r = false;
                }
            }
        }
    }

    void B(android.support.v4.app.e eVar, Bundle bundle, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).B(eVar, bundle, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    void B0(android.support.v4.app.e eVar) {
        C0(eVar, this.f517m, 0, 0, false);
    }

    void C(android.support.v4.app.e eVar, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).C(eVar, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0292  */
    /* JADX WARN: Code duplicated, block: B:133:0x0296  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:193:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:218:0x041d  */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:133:0x0296, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x02b6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:218:0x041d, please report this as an issue */
    void C0(android.support.v4.app.e eVar, int i2, int i3, int i4, boolean z2) {
        int i5;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        String resourceName;
        int i6;
        int i7 = 1;
        if (!eVar.f449l || eVar.C) {
            i5 = i2;
            if (i5 > 1) {
                i5 = 1;
            }
        } else {
            i5 = i2;
        }
        if (eVar.f450m && i5 > (i6 = eVar.f439b)) {
            i5 = (i6 == 0 && eVar.H()) ? 1 : eVar.f439b;
        }
        int i8 = (!eVar.L || eVar.f439b >= 3 || i5 <= 2) ? i5 : 2;
        int i9 = eVar.f439b;
        if (i9 > i8) {
            if (i9 > i8) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4) {
                                if (i8 < 4) {
                                    if (F) {
                                        Log.v("FragmentManager", "movefrom RESUMED: " + eVar);
                                    }
                                    eVar.H0();
                                    E(eVar, false);
                                }
                            }
                        }
                        if (i8 < 3) {
                            if (F) {
                                Log.v("FragmentManager", "movefrom STARTED: " + eVar);
                            }
                            eVar.N0();
                            K(eVar, false);
                        }
                    }
                    if (i8 < 2) {
                        if (F) {
                            Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + eVar);
                        }
                        if (eVar.J != null && this.f518n.m(eVar) && eVar.f441d == null) {
                            R0(eVar);
                        }
                        eVar.A0();
                        M(eVar, false);
                        View view = eVar.J;
                        if (view != null && (viewGroup = eVar.I) != null) {
                            viewGroup.endViewTransition(view);
                            eVar.J.clearAnimation();
                            g gVarR0 = (this.f517m <= 0 || this.f525u || eVar.J.getVisibility() != 0 || eVar.Q < 0.0f) ? null : r0(eVar, i3, false, i4);
                            eVar.Q = 0.0f;
                            if (gVarR0 != null) {
                                h(eVar, gVarR0, i8);
                            }
                            eVar.I.removeView(eVar.J);
                        }
                        eVar.I = null;
                        eVar.J = null;
                        eVar.V = null;
                        eVar.W.n(null);
                        eVar.K = null;
                        eVar.f452o = false;
                    }
                    if (i8 >= 1) {
                        if (this.f525u) {
                            if (eVar.j() != null) {
                                View viewJ = eVar.j();
                                eVar.R0(null);
                                viewJ.clearAnimation();
                            } else if (eVar.k() != null) {
                                Animator animatorK = eVar.k();
                                eVar.S0(null);
                                animatorK.cancel();
                            }
                        }
                        if (eVar.j() == null) {
                        }
                        eVar.Z0(i8);
                    }
                } else if (i8 >= 1) {
                    if (this.f525u) {
                        if (eVar.j() != null) {
                            View viewJ2 = eVar.j();
                            eVar.R0(null);
                            viewJ2.clearAnimation();
                        } else if (eVar.k() != null) {
                            Animator animatorK2 = eVar.k();
                            eVar.S0(null);
                            animatorK2.cancel();
                        }
                    }
                    if (eVar.j() == null || eVar.k() != null) {
                        eVar.Z0(i8);
                    } else {
                        if (F) {
                            Log.v("FragmentManager", "movefrom CREATED: " + eVar);
                        }
                        if (eVar.E) {
                            eVar.f439b = 0;
                        } else {
                            eVar.z0();
                            C(eVar, false);
                        }
                        eVar.B0();
                        D(eVar, false);
                        if (!z2) {
                            if (eVar.E) {
                                eVar.f457t = null;
                                eVar.f461x = null;
                                eVar.f456s = null;
                            } else {
                                u0(eVar);
                            }
                        }
                    }
                }
            }
            if (eVar.f439b != i7) {
                Log.w("FragmentManager", "moveToState: Fragment state for " + eVar + " not updated inline; expected state " + i7 + " found " + eVar.f439b);
                eVar.f439b = i7;
            }
        }
        if (eVar.f451n && !eVar.f452o) {
            return;
        }
        if (eVar.j() != null || eVar.k() != null) {
            eVar.R0(null);
            eVar.S0(null);
            C0(eVar, eVar.B(), 0, 0, true);
        }
        int i10 = eVar.f439b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                    }
                }
                if (i8 > 3) {
                    if (F) {
                        Log.v("FragmentManager", "moveto RESUMED: " + eVar);
                    }
                    eVar.K0();
                    H(eVar, false);
                    eVar.f440c = null;
                    eVar.f441d = null;
                }
            }
            if (i8 > 2) {
                if (F) {
                    Log.v("FragmentManager", "moveto STARTED: " + eVar);
                }
                eVar.M0();
                J(eVar, false);
            }
            if (i8 > 3) {
                if (F) {
                    Log.v("FragmentManager", "moveto RESUMED: " + eVar);
                }
                eVar.K0();
                H(eVar, false);
                eVar.f440c = null;
                eVar.f441d = null;
            }
        } else if (i8 > 0) {
            if (F) {
                Log.v("FragmentManager", "moveto CREATED: " + eVar);
            }
            Bundle bundle = eVar.f440c;
            if (bundle != null) {
                bundle.setClassLoader(this.f518n.e().getClassLoader());
                eVar.f441d = eVar.f440c.getSparseParcelableArray("android:view_state");
                android.support.v4.app.e eVarM0 = m0(eVar.f440c, "android:target_state");
                eVar.f446i = eVarM0;
                if (eVarM0 != null) {
                    eVar.f448k = eVar.f440c.getInt("android:target_req_state", 0);
                }
                Boolean bool = eVar.f442e;
                if (bool != null) {
                    eVar.M = bool.booleanValue();
                    eVar.f442e = null;
                } else {
                    eVar.M = eVar.f440c.getBoolean("android:user_visible_hint", true);
                }
                if (!eVar.M) {
                    eVar.L = true;
                    if (i8 > 2) {
                        i8 = 2;
                    }
                }
            }
            android.support.v4.app.i iVar = this.f518n;
            eVar.f457t = iVar;
            android.support.v4.app.e eVar2 = this.f520p;
            eVar.f461x = eVar2;
            eVar.f456s = eVar2 != null ? eVar2.f458u : iVar.f();
            android.support.v4.app.e eVar3 = eVar.f446i;
            if (eVar3 != null) {
                android.support.v4.app.e eVar4 = this.f510f.get(eVar3.f443f);
                android.support.v4.app.e eVar5 = eVar.f446i;
                if (eVar4 != eVar5) {
                    throw new IllegalStateException("Fragment " + eVar + " declared target fragment " + eVar.f446i + " that does not belong to this FragmentManager!");
                }
                if (eVar5.f439b < 1) {
                    C0(eVar5, 1, 0, 0, true);
                }
            }
            F(eVar, this.f518n.e(), false);
            eVar.H = false;
            eVar.P(this.f518n.e());
            if (!eVar.H) {
                throw new w("Fragment " + eVar + " did not call through to super.onAttach()");
            }
            android.support.v4.app.e eVar6 = eVar.f461x;
            if (eVar6 == null) {
                this.f518n.h(eVar);
            } else {
                eVar6.Q(eVar);
            }
            A(eVar, this.f518n.e(), false);
            if (eVar.S) {
                eVar.P0(eVar.f440c);
                eVar.f439b = 1;
            } else {
                G(eVar, eVar.f440c, false);
                eVar.w0(eVar.f440c);
                B(eVar, eVar.f440c, false);
            }
            eVar.E = false;
        }
        Z(eVar);
        if (i8 > 1) {
            if (F) {
                Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + eVar);
            }
            if (!eVar.f451n) {
                int i11 = eVar.f463z;
                if (i11 != 0) {
                    if (i11 == -1) {
                        b1(new IllegalArgumentException("Cannot create fragment " + eVar + " for a container view with no id"));
                    }
                    viewGroup2 = (ViewGroup) this.f519o.b(eVar.f463z);
                    if (viewGroup2 == null && !eVar.f453p) {
                        try {
                            resourceName = eVar.x().getResourceName(eVar.f463z);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        b1(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(eVar.f463z) + " (" + resourceName + ") for fragment " + eVar));
                    }
                } else {
                    viewGroup2 = null;
                }
                eVar.I = viewGroup2;
                eVar.y0(eVar.C0(eVar.f440c), viewGroup2, eVar.f440c);
                View view2 = eVar.J;
                if (view2 != null) {
                    eVar.K = view2;
                    view2.setSaveFromParentEnabled(false);
                    if (viewGroup2 != null) {
                        viewGroup2.addView(eVar.J);
                    }
                    if (eVar.B) {
                        eVar.J.setVisibility(8);
                    }
                    eVar.q0(eVar.J, eVar.f440c);
                    L(eVar, eVar.J, eVar.f440c, false);
                    eVar.O = eVar.J.getVisibility() == 0 && eVar.I != null;
                } else {
                    eVar.K = null;
                }
            }
            eVar.t0(eVar.f440c);
            z(eVar, eVar.f440c, false);
            if (eVar.J != null) {
                eVar.Q0(eVar.f440c);
            }
            eVar.f440c = null;
        }
        if (i8 > 2) {
            if (F) {
                Log.v("FragmentManager", "moveto STARTED: " + eVar);
            }
            eVar.M0();
            J(eVar, false);
        }
        if (i8 > 3) {
            if (F) {
                Log.v("FragmentManager", "moveto RESUMED: " + eVar);
            }
            eVar.K0();
            H(eVar, false);
            eVar.f440c = null;
            eVar.f441d = null;
        }
        i7 = i8;
        if (eVar.f439b != i7) {
            Log.w("FragmentManager", "moveToState: Fragment state for " + eVar + " not updated inline; expected state " + i7 + " found " + eVar.f439b);
            eVar.f439b = i7;
        }
    }

    void D(android.support.v4.app.e eVar, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).D(eVar, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    public void D0() {
        this.D = null;
        this.f523s = false;
        this.f524t = false;
        int size = this.f509e.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.e eVar = this.f509e.get(i2);
            if (eVar != null) {
                eVar.L();
            }
        }
    }

    void E(android.support.v4.app.e eVar, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).E(eVar, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    public void E0(android.support.v4.app.e eVar) {
        if (eVar.L) {
            if (this.f507c) {
                this.f527w = true;
            } else {
                eVar.L = false;
                C0(eVar, this.f517m, 0, 0, false);
            }
        }
    }

    void F(android.support.v4.app.e eVar, Context context, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).F(eVar, context, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    void G(android.support.v4.app.e eVar, Bundle bundle, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).G(eVar, bundle, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    boolean G0(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<android.support.v4.app.c> arrayList3 = this.f511g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f511g.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    android.support.v4.app.c cVar = this.f511g.get(size2);
                    if ((str != null && str.equals(cVar.i())) || (i2 >= 0 && i2 == cVar.f412m)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        android.support.v4.app.c cVar2 = this.f511g.get(size2);
                        if (str == null || !str.equals(cVar2.i())) {
                            if (i2 < 0 || i2 != cVar2.f412m) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f511g.size() - 1) {
                return false;
            }
            for (int size3 = this.f511g.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f511g.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void H(android.support.v4.app.e eVar, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).H(eVar, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    void I(android.support.v4.app.e eVar, Bundle bundle, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).I(eVar, bundle, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    public void I0(Bundle bundle, String str, android.support.v4.app.e eVar) {
        if (eVar.f443f < 0) {
            b1(new IllegalStateException("Fragment " + eVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, eVar.f443f);
    }

    void J(android.support.v4.app.e eVar, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).J(eVar, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    public void J0(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "remove: " + eVar + " nesting=" + eVar.f455r);
        }
        boolean z2 = !eVar.H();
        if (!eVar.C || z2) {
            synchronized (this.f509e) {
                this.f509e.remove(eVar);
            }
            if (eVar.F && eVar.G) {
                this.f522r = true;
            }
            eVar.f449l = false;
            eVar.f450m = true;
        }
    }

    void K(android.support.v4.app.e eVar, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).K(eVar, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    void L(android.support.v4.app.e eVar, View view, Bundle bundle, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).L(eVar, view, bundle, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    void L0() {
        if (this.f515k != null) {
            for (int i2 = 0; i2 < this.f515k.size(); i2++) {
                this.f515k.get(i2).onBackStackChanged();
            }
        }
    }

    void M(android.support.v4.app.e eVar, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).M(eVar, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    void M0(Parcelable parcelable, android.support.v4.app.l lVar) {
        List<android.support.v4.app.l> listA;
        List<android.arch.lifecycle.n> listC;
        n[] nVarArr;
        if (parcelable == null) {
            return;
        }
        android.support.v4.app.m mVar = (android.support.v4.app.m) parcelable;
        if (mVar.f563b == null) {
            return;
        }
        if (lVar != null) {
            List<android.support.v4.app.e> listB = lVar.b();
            listA = lVar.a();
            listC = lVar.c();
            int size = listB != null ? listB.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.e eVar = listB.get(i2);
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + eVar);
                }
                int i3 = 0;
                while (true) {
                    nVarArr = mVar.f563b;
                    if (i3 >= nVarArr.length || nVarArr[i3].f569c == eVar.f443f) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 == nVarArr.length) {
                    b1(new IllegalStateException("Could not find active fragment with index " + eVar.f443f));
                }
                n nVar = mVar.f563b[i3];
                nVar.f579m = eVar;
                eVar.f441d = null;
                eVar.f455r = 0;
                eVar.f452o = false;
                eVar.f449l = false;
                eVar.f446i = null;
                Bundle bundle = nVar.f578l;
                if (bundle != null) {
                    bundle.setClassLoader(this.f518n.e().getClassLoader());
                    eVar.f441d = nVar.f578l.getSparseParcelableArray("android:view_state");
                    eVar.f440c = nVar.f578l;
                }
            }
        } else {
            listA = null;
            listC = null;
        }
        this.f510f = new SparseArray<>(mVar.f563b.length);
        int i4 = 0;
        while (true) {
            n[] nVarArr2 = mVar.f563b;
            if (i4 >= nVarArr2.length) {
                break;
            }
            n nVar2 = nVarArr2[i4];
            if (nVar2 != null) {
                android.support.v4.app.e eVarA = nVar2.a(this.f518n, this.f519o, this.f520p, (listA == null || i4 >= listA.size()) ? null : listA.get(i4), (listC == null || i4 >= listC.size()) ? null : listC.get(i4));
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + eVarA);
                }
                this.f510f.put(eVarA.f443f, eVarA);
                nVar2.f579m = null;
            }
            i4++;
        }
        if (lVar != null) {
            List<android.support.v4.app.e> listB2 = lVar.b();
            int size2 = listB2 != null ? listB2.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                android.support.v4.app.e eVar2 = listB2.get(i5);
                int i6 = eVar2.f447j;
                if (i6 >= 0) {
                    android.support.v4.app.e eVar3 = this.f510f.get(i6);
                    eVar2.f446i = eVar3;
                    if (eVar3 == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + eVar2 + " target no longer exists: " + eVar2.f447j);
                    }
                }
            }
        }
        this.f509e.clear();
        if (mVar.f564c != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = mVar.f564c;
                if (i7 >= iArr.length) {
                    break;
                }
                android.support.v4.app.e eVar4 = this.f510f.get(iArr[i7]);
                if (eVar4 == null) {
                    b1(new IllegalStateException("No instantiated fragment for index #" + mVar.f564c[i7]));
                }
                eVar4.f449l = true;
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: added #" + i7 + ": " + eVar4);
                }
                if (this.f509e.contains(eVar4)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.f509e) {
                    this.f509e.add(eVar4);
                }
                i7++;
            }
        }
        if (mVar.f565d != null) {
            this.f511g = new ArrayList<>(mVar.f565d.length);
            int i8 = 0;
            while (true) {
                android.support.v4.app.d[] dVarArr = mVar.f565d;
                if (i8 >= dVarArr.length) {
                    break;
                }
                android.support.v4.app.c cVarA = dVarArr[i8].a(this);
                if (F) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + cVarA.f412m + "): " + cVarA);
                    PrintWriter printWriter = new PrintWriter(new f0.e("FragmentManager"));
                    cVarA.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f511g.add(cVarA);
                int i9 = cVarA.f412m;
                if (i9 >= 0) {
                    U0(i9, cVarA);
                }
                i8++;
            }
        } else {
            this.f511g = null;
        }
        int i10 = mVar.f566e;
        if (i10 >= 0) {
            this.f521q = this.f510f.get(i10);
        }
        this.f508d = mVar.f567f;
    }

    public boolean N(MenuItem menuItem) {
        if (this.f517m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f509e.size(); i2++) {
            android.support.v4.app.e eVar = this.f509e.get(i2);
            if (eVar != null && eVar.F0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    android.support.v4.app.l N0() {
        X0(this.D);
        return this.D;
    }

    public void O(Menu menu) {
        if (this.f517m < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f509e.size(); i2++) {
            android.support.v4.app.e eVar = this.f509e.get(i2);
            if (eVar != null) {
                eVar.G0(menu);
            }
        }
    }

    public void P() {
        U(3);
    }

    Parcelable P0() {
        int[] iArr;
        int size;
        i0();
        X();
        a0();
        this.f523s = true;
        android.support.v4.app.d[] dVarArr = null;
        this.D = null;
        SparseArray<android.support.v4.app.e> sparseArray = this.f510f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f510f.size();
        n[] nVarArr = new n[size2];
        boolean z2 = false;
        for (int i2 = 0; i2 < size2; i2++) {
            android.support.v4.app.e eVarValueAt = this.f510f.valueAt(i2);
            if (eVarValueAt != null) {
                if (eVarValueAt.f443f < 0) {
                    b1(new IllegalStateException("Failure saving state: active " + eVarValueAt + " has cleared index: " + eVarValueAt.f443f));
                }
                n nVar = new n(eVarValueAt);
                nVarArr[i2] = nVar;
                if (eVarValueAt.f439b <= 0 || nVar.f578l != null) {
                    nVar.f578l = eVarValueAt.f440c;
                } else {
                    nVar.f578l = Q0(eVarValueAt);
                    android.support.v4.app.e eVar = eVarValueAt.f446i;
                    if (eVar != null) {
                        if (eVar.f443f < 0) {
                            b1(new IllegalStateException("Failure saving state: " + eVarValueAt + " has target not in fragment manager: " + eVarValueAt.f446i));
                        }
                        if (nVar.f578l == null) {
                            nVar.f578l = new Bundle();
                        }
                        I0(nVar.f578l, "android:target_state", eVarValueAt.f446i);
                        int i3 = eVarValueAt.f448k;
                        if (i3 != 0) {
                            nVar.f578l.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (F) {
                    Log.v("FragmentManager", "Saved state of " + eVarValueAt + ": " + nVar.f578l);
                }
                z2 = true;
            }
        }
        if (!z2) {
            if (F) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f509e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                int i5 = this.f509e.get(i4).f443f;
                iArr[i4] = i5;
                if (i5 < 0) {
                    b1(new IllegalStateException("Failure saving state: active " + this.f509e.get(i4) + " has cleared index: " + iArr[i4]));
                }
                if (F) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.f509e.get(i4));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<android.support.v4.app.c> arrayList = this.f511g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            dVarArr = new android.support.v4.app.d[size];
            for (int i6 = 0; i6 < size; i6++) {
                dVarArr[i6] = new android.support.v4.app.d(this.f511g.get(i6));
                if (F) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.f511g.get(i6));
                }
            }
        }
        android.support.v4.app.m mVar = new android.support.v4.app.m();
        mVar.f563b = nVarArr;
        mVar.f564c = iArr;
        mVar.f565d = dVarArr;
        android.support.v4.app.e eVar2 = this.f521q;
        if (eVar2 != null) {
            mVar.f566e = eVar2.f443f;
        }
        mVar.f567f = this.f508d;
        S0();
        return mVar;
    }

    public void Q(boolean z2) {
        for (int size = this.f509e.size() - 1; size >= 0; size--) {
            android.support.v4.app.e eVar = this.f509e.get(size);
            if (eVar != null) {
                eVar.I0(z2);
            }
        }
    }

    Bundle Q0(android.support.v4.app.e eVar) {
        if (this.A == null) {
            this.A = new Bundle();
        }
        eVar.L0(this.A);
        I(eVar, this.A, false);
        Bundle bundle = null;
        if (!this.A.isEmpty()) {
            Bundle bundle2 = this.A;
            this.A = null;
            bundle = bundle2;
        }
        if (eVar.J != null) {
            R0(eVar);
        }
        if (eVar.f441d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", eVar.f441d);
        }
        if (!eVar.M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", eVar.M);
        }
        return bundle;
    }

    public boolean R(Menu menu) {
        if (this.f517m < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f509e.size(); i2++) {
            android.support.v4.app.e eVar = this.f509e.get(i2);
            if (eVar != null && eVar.J0(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    void R0(android.support.v4.app.e eVar) {
        if (eVar.K == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.B;
        if (sparseArray == null) {
            this.B = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        eVar.K.saveHierarchyState(this.B);
        if (this.B.size() > 0) {
            eVar.f441d = this.B;
            this.B = null;
        }
    }

    public void S() {
        this.f523s = false;
        this.f524t = false;
        U(4);
    }

    void S0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        android.support.v4.app.l lVar;
        if (this.f510f != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i2 = 0; i2 < this.f510f.size(); i2++) {
                android.support.v4.app.e eVarValueAt = this.f510f.valueAt(i2);
                if (eVarValueAt != null) {
                    if (eVarValueAt.D) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(eVarValueAt);
                        android.support.v4.app.e eVar = eVarValueAt.f446i;
                        eVarValueAt.f447j = eVar != null ? eVar.f443f : -1;
                        if (F) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + eVarValueAt);
                        }
                    }
                    k kVar = eVarValueAt.f458u;
                    if (kVar != null) {
                        kVar.S0();
                        lVar = eVarValueAt.f458u.D;
                    } else {
                        lVar = eVarValueAt.f459v;
                    }
                    if (arrayList2 == null && lVar != null) {
                        arrayList2 = new ArrayList(this.f510f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(lVar);
                    }
                    if (arrayList3 == null && eVarValueAt.f460w != null) {
                        arrayList3 = new ArrayList(this.f510f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(eVarValueAt.f460w);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.D = null;
        } else {
            this.D = new android.support.v4.app.l(arrayList, arrayList2, arrayList3);
        }
    }

    public void T() {
        this.f523s = false;
        this.f524t = false;
        U(3);
    }

    void T0() {
        synchronized (this) {
            ArrayList<m> arrayList = this.C;
            boolean z2 = false;
            boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<l> arrayList2 = this.f506b;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.f518n.g().removeCallbacks(this.E);
                this.f518n.g().post(this.E);
            }
        }
    }

    public void U0(int i2, android.support.v4.app.c cVar) {
        synchronized (this) {
            if (this.f513i == null) {
                this.f513i = new ArrayList<>();
            }
            int size = this.f513i.size();
            if (i2 < size) {
                if (F) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + cVar);
                }
                this.f513i.set(i2, cVar);
            } else {
                while (size < i2) {
                    this.f513i.add(null);
                    if (this.f514j == null) {
                        this.f514j = new ArrayList<>();
                    }
                    if (F) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f514j.add(Integer.valueOf(size));
                    size++;
                }
                if (F) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + cVar);
                }
                this.f513i.add(cVar);
            }
        }
    }

    public void V() {
        this.f524t = true;
        U(2);
    }

    void W() {
        if (this.f527w) {
            this.f527w = false;
            a1();
        }
    }

    public void W0(android.support.v4.app.e eVar) {
        if (eVar == null || (this.f510f.get(eVar.f443f) == eVar && (eVar.f457t == null || eVar.r() == this))) {
            this.f521q = eVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + eVar + " is not an active fragment of FragmentManager " + this);
    }

    void Z(android.support.v4.app.e eVar) {
        if (!eVar.f451n || eVar.f454q) {
            return;
        }
        eVar.y0(eVar.C0(eVar.f440c), null, eVar.f440c);
        View view = eVar.J;
        if (view == null) {
            eVar.K = null;
            return;
        }
        eVar.K = view;
        view.setSaveFromParentEnabled(false);
        if (eVar.B) {
            eVar.J.setVisibility(8);
        }
        eVar.q0(eVar.J, eVar.f440c);
        L(eVar, eVar.J, eVar.f440c, false);
    }

    public void Z0(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "show: " + eVar);
        }
        if (eVar.B) {
            eVar.B = false;
            eVar.P = !eVar.P;
        }
    }

    @Override // android.support.v4.app.j
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<android.support.v4.app.e> sparseArray = this.f510f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                android.support.v4.app.e eVarValueAt = this.f510f.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(eVarValueAt);
                if (eVarValueAt != null) {
                    eVarValueAt.c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f509e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                android.support.v4.app.e eVar = this.f509e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(eVar.toString());
            }
        }
        ArrayList<android.support.v4.app.e> arrayList = this.f512h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                android.support.v4.app.e eVar2 = this.f512h.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(eVar2.toString());
            }
        }
        ArrayList<android.support.v4.app.c> arrayList2 = this.f511g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                android.support.v4.app.c cVar = this.f511g.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.d(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            ArrayList<android.support.v4.app.c> arrayList3 = this.f513i;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = (android.support.v4.app.c) this.f513i.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            ArrayList<Integer> arrayList4 = this.f514j;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f514j.toArray()));
            }
        }
        ArrayList<l> arrayList5 = this.f506b;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (l) this.f506b.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f518n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f519o);
        if (this.f520p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f520p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f517m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f523s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f524t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f525u);
        if (this.f522r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f522r);
        }
        if (this.f526v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f526v);
        }
    }

    public boolean a0() {
        Y(true);
        boolean z2 = false;
        while (k0(this.f528x, this.f529y)) {
            this.f507c = true;
            try {
                K0(this.f528x, this.f529y);
                m();
                z2 = true;
            } catch (Throwable th) {
                m();
                throw th;
            }
        }
        W();
        k();
        return z2;
    }

    void a1() {
        if (this.f510f == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f510f.size(); i2++) {
            android.support.v4.app.e eVarValueAt = this.f510f.valueAt(i2);
            if (eVarValueAt != null) {
                E0(eVarValueAt);
            }
        }
    }

    @Override // android.support.v4.app.j
    public List<android.support.v4.app.e> b() {
        List<android.support.v4.app.e> list;
        if (this.f509e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f509e) {
            list = (List) this.f509e.clone();
        }
        return list;
    }

    @Override // android.support.v4.app.j
    public boolean c() {
        return this.f523s || this.f524t;
    }

    @Override // android.support.v4.app.j
    public boolean d() {
        l();
        return F0(null, -1, 0);
    }

    public android.support.v4.app.e e0(int i2) {
        for (int size = this.f509e.size() - 1; size >= 0; size--) {
            android.support.v4.app.e eVar = this.f509e.get(size);
            if (eVar != null && eVar.f462y == i2) {
                return eVar;
            }
        }
        SparseArray<android.support.v4.app.e> sparseArray = this.f510f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            android.support.v4.app.e eVarValueAt = this.f510f.valueAt(size2);
            if (eVarValueAt != null && eVarValueAt.f462y == i2) {
                return eVarValueAt;
            }
        }
        return null;
    }

    void f(android.support.v4.app.c cVar) {
        if (this.f511g == null) {
            this.f511g = new ArrayList<>();
        }
        this.f511g.add(cVar);
    }

    public android.support.v4.app.e f0(String str) {
        if (str != null) {
            for (int size = this.f509e.size() - 1; size >= 0; size--) {
                android.support.v4.app.e eVar = this.f509e.get(size);
                if (eVar != null && str.equals(eVar.A)) {
                    return eVar;
                }
            }
        }
        SparseArray<android.support.v4.app.e> sparseArray = this.f510f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            android.support.v4.app.e eVarValueAt = this.f510f.valueAt(size2);
            if (eVarValueAt != null && str.equals(eVarValueAt.A)) {
                return eVarValueAt;
            }
        }
        return null;
    }

    public void g(android.support.v4.app.e eVar, boolean z2) {
        if (F) {
            Log.v("FragmentManager", "add: " + eVar);
        }
        s0(eVar);
        if (eVar.C) {
            return;
        }
        if (this.f509e.contains(eVar)) {
            throw new IllegalStateException("Fragment already added: " + eVar);
        }
        synchronized (this.f509e) {
            this.f509e.add(eVar);
        }
        eVar.f449l = true;
        eVar.f450m = false;
        if (eVar.J == null) {
            eVar.P = false;
        }
        if (eVar.F && eVar.G) {
            this.f522r = true;
        }
        if (z2) {
            B0(eVar);
        }
    }

    public android.support.v4.app.e g0(String str) {
        android.support.v4.app.e eVarE;
        SparseArray<android.support.v4.app.e> sparseArray = this.f510f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            android.support.v4.app.e eVarValueAt = this.f510f.valueAt(size);
            if (eVarValueAt != null && (eVarE = eVarValueAt.e(str)) != null) {
                return eVarE;
            }
        }
        return null;
    }

    public void i(android.support.v4.app.i iVar, android.support.v4.app.g gVar, android.support.v4.app.e eVar) {
        if (this.f518n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f518n = iVar;
        this.f519o = gVar;
        this.f520p = eVar;
    }

    public void j(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "attach: " + eVar);
        }
        if (eVar.C) {
            eVar.C = false;
            if (eVar.f449l) {
                return;
            }
            if (this.f509e.contains(eVar)) {
                throw new IllegalStateException("Fragment already added: " + eVar);
            }
            if (F) {
                Log.v("FragmentManager", "add from attach: " + eVar);
            }
            synchronized (this.f509e) {
                this.f509e.add(eVar);
            }
            eVar.f449l = true;
            if (eVar.F && eVar.G) {
                this.f522r = true;
            }
        }
    }

    public void j0(int i2) {
        synchronized (this) {
            this.f513i.set(i2, null);
            if (this.f514j == null) {
                this.f514j = new ArrayList<>();
            }
            if (F) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.f514j.add(Integer.valueOf(i2));
        }
    }

    public android.support.v4.app.e m0(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        android.support.v4.app.e eVar = this.f510f.get(i2);
        if (eVar == null) {
            b1(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        }
        return eVar;
    }

    void n(android.support.v4.app.c cVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            cVar.g(z4);
        } else {
            cVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            p.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            A0(this.f517m, true);
        }
        SparseArray<android.support.v4.app.e> sparseArray = this.f510f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.e eVarValueAt = this.f510f.valueAt(i2);
                if (eVarValueAt != null && eVarValueAt.J != null && eVarValueAt.O && cVar.j(eVarValueAt.f463z)) {
                    float f2 = eVarValueAt.Q;
                    if (f2 > 0.0f) {
                        eVarValueAt.J.setAlpha(f2);
                    }
                    if (z4) {
                        eVarValueAt.Q = 0.0f;
                    } else {
                        eVarValueAt.Q = -1.0f;
                        eVarValueAt.O = false;
                    }
                }
            }
        }
    }

    LayoutInflater.Factory2 n0() {
        return this;
    }

    void o(android.support.v4.app.e eVar) {
        Animator animator;
        if (eVar.J != null) {
            g gVarR0 = r0(eVar, eVar.u(), !eVar.B, eVar.v());
            if (gVarR0 == null || (animator = gVarR0.f548b) == null) {
                if (gVarR0 != null) {
                    V0(eVar.J, gVarR0);
                    eVar.J.startAnimation(gVarR0.f547a);
                    gVarR0.f547a.start();
                }
                eVar.J.setVisibility((!eVar.B || eVar.G()) ? 0 : 8);
                if (eVar.G()) {
                    eVar.U0(false);
                }
            } else {
                animator.setTarget(eVar.J);
                if (!eVar.B) {
                    eVar.J.setVisibility(0);
                } else if (eVar.G()) {
                    eVar.U0(false);
                } else {
                    ViewGroup viewGroup = eVar.I;
                    View view = eVar.J;
                    viewGroup.startViewTransition(view);
                    gVarR0.f548b.addListener(new d(viewGroup, view, eVar));
                }
                V0(eVar.J, gVarR0);
                gVarR0.f548b.start();
            }
        }
        if (eVar.f449l && eVar.F && eVar.G) {
            this.f522r = true;
        }
        eVar.P = false;
        eVar.c0(eVar.B);
    }

    public android.support.v4.app.e o0() {
        return this.f521q;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0004k.f556a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (!android.support.v4.app.e.K(this.f518n.e(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        android.support.v4.app.e eVarE0 = resourceId != -1 ? e0(resourceId) : null;
        if (eVarE0 == null && string != null) {
            eVarE0 = f0(string);
        }
        if (eVarE0 == null && id != -1) {
            eVarE0 = e0(id);
        }
        if (F) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + eVarE0);
        }
        if (eVarE0 == null) {
            eVarE0 = this.f519o.a(context, str2, null);
            eVarE0.f451n = true;
            eVarE0.f462y = resourceId != 0 ? resourceId : id;
            eVarE0.f463z = id;
            eVarE0.A = string;
            eVarE0.f452o = true;
            eVarE0.f456s = this;
            android.support.v4.app.i iVar = this.f518n;
            eVarE0.f457t = iVar;
            eVarE0.e0(iVar.e(), attributeSet, eVarE0.f440c);
            g(eVarE0, true);
        } else {
            if (eVarE0.f452o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            eVarE0.f452o = true;
            android.support.v4.app.i iVar2 = this.f518n;
            eVarE0.f457t = iVar2;
            if (!eVarE0.E) {
                eVarE0.e0(iVar2.e(), attributeSet, eVarE0.f440c);
            }
        }
        android.support.v4.app.e eVar = eVarE0;
        if (this.f517m >= 1 || !eVar.f451n) {
            B0(eVar);
        } else {
            C0(eVar, 1, 0, 0, false);
        }
        View view2 = eVar.J;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (eVar.J.getTag() == null) {
                eVar.J.setTag(string);
            }
            return eVar.J;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public void p(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "detach: " + eVar);
        }
        if (eVar.C) {
            return;
        }
        eVar.C = true;
        if (eVar.f449l) {
            if (F) {
                Log.v("FragmentManager", "remove from detach: " + eVar);
            }
            synchronized (this.f509e) {
                this.f509e.remove(eVar);
            }
            if (eVar.F && eVar.G) {
                this.f522r = true;
            }
            eVar.f449l = false;
        }
    }

    public void p0(android.support.v4.app.e eVar) {
        if (F) {
            Log.v("FragmentManager", "hide: " + eVar);
        }
        if (eVar.B) {
            return;
        }
        eVar.B = true;
        eVar.P = true ^ eVar.P;
    }

    public void q() {
        this.f523s = false;
        this.f524t = false;
        U(2);
    }

    boolean q0(int i2) {
        return this.f517m >= i2;
    }

    public void r(Configuration configuration) {
        for (int i2 = 0; i2 < this.f509e.size(); i2++) {
            android.support.v4.app.e eVar = this.f509e.get(i2);
            if (eVar != null) {
                eVar.u0(configuration);
            }
        }
    }

    g r0(android.support.v4.app.e eVar, int i2, boolean z2, int i3) {
        int iC1;
        boolean z3;
        int iT = eVar.t();
        Animation animationT = eVar.T(i2, z2, iT);
        if (animationT != null) {
            return new g(animationT);
        }
        Animator animatorU = eVar.U(i2, z2, iT);
        if (animatorU != null) {
            return new g(animatorU);
        }
        if (iT != 0) {
            boolean zEquals = "anim".equals(this.f518n.e().getResources().getResourceTypeName(iT));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f518n.e(), iT);
                    if (animationLoadAnimation != null) {
                        return new g(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.f518n.e(), iT);
                    if (animatorLoadAnimator != null) {
                        return new g(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.f518n.e(), iT);
                    if (animationLoadAnimation2 != null) {
                        return new g(animationLoadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (iC1 = c1(i2, z2)) < 0) {
            return null;
        }
        switch (iC1) {
            case 1:
                return v0(this.f518n.e(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return v0(this.f518n.e(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return v0(this.f518n.e(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return v0(this.f518n.e(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return t0(this.f518n.e(), 0.0f, 1.0f);
            case 6:
                return t0(this.f518n.e(), 1.0f, 0.0f);
            default:
                if (i3 == 0 && this.f518n.l()) {
                    this.f518n.k();
                }
                return null;
        }
    }

    public boolean s(MenuItem menuItem) {
        if (this.f517m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f509e.size(); i2++) {
            android.support.v4.app.e eVar = this.f509e.get(i2);
            if (eVar != null && eVar.v0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void s0(android.support.v4.app.e eVar) {
        if (eVar.f443f >= 0) {
            return;
        }
        int i2 = this.f508d;
        this.f508d = i2 + 1;
        eVar.V0(i2, this.f520p);
        if (this.f510f == null) {
            this.f510f = new SparseArray<>();
        }
        this.f510f.put(eVar.f443f, eVar);
        if (F) {
            Log.v("FragmentManager", "Allocated fragment index " + eVar);
        }
    }

    public void t() {
        this.f523s = false;
        this.f524t = false;
        U(1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.app.e eVar = this.f520p;
        if (eVar != null) {
            f0.d.a(eVar, sb);
        } else {
            f0.d.a(this.f518n, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public boolean u(Menu menu, MenuInflater menuInflater) {
        if (this.f517m < 1) {
            return false;
        }
        ArrayList<android.support.v4.app.e> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f509e.size(); i2++) {
            android.support.v4.app.e eVar = this.f509e.get(i2);
            if (eVar != null && eVar.x0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(eVar);
                z2 = true;
            }
        }
        if (this.f512h != null) {
            for (int i3 = 0; i3 < this.f512h.size(); i3++) {
                android.support.v4.app.e eVar2 = this.f512h.get(i3);
                if (arrayList == null || !arrayList.contains(eVar2)) {
                    eVar2.Y();
                }
            }
        }
        this.f512h = arrayList;
        return z2;
    }

    void u0(android.support.v4.app.e eVar) {
        if (eVar.f443f < 0) {
            return;
        }
        if (F) {
            Log.v("FragmentManager", "Freeing fragment index " + eVar);
        }
        this.f510f.put(eVar.f443f, null);
        eVar.D();
    }

    public void v() {
        this.f525u = true;
        a0();
        U(0);
        this.f518n = null;
        this.f519o = null;
        this.f520p = null;
    }

    public void w() {
        U(1);
    }

    public void x() {
        for (int i2 = 0; i2 < this.f509e.size(); i2++) {
            android.support.v4.app.e eVar = this.f509e.get(i2);
            if (eVar != null) {
                eVar.D0();
            }
        }
    }

    public void y(boolean z2) {
        for (int size = this.f509e.size() - 1; size >= 0; size--) {
            android.support.v4.app.e eVar = this.f509e.get(size);
            if (eVar != null) {
                eVar.E0(z2);
            }
        }
    }

    void z(android.support.v4.app.e eVar, Bundle bundle, boolean z2) {
        android.support.v4.app.e eVar2 = this.f520p;
        if (eVar2 != null) {
            android.support.v4.app.j jVarR = eVar2.r();
            if (jVarR instanceof k) {
                ((k) jVarR).z(eVar, bundle, true);
            }
        }
        for (j jVar : this.f516l) {
            if (!z2 || jVar.f555a) {
                jVar.getClass();
                throw null;
            }
        }
    }

    void z0(android.support.v4.app.e eVar) {
        if (eVar == null) {
            return;
        }
        int iMin = this.f517m;
        if (eVar.f450m) {
            iMin = eVar.H() ? Math.min(iMin, 1) : Math.min(iMin, 0);
        }
        C0(eVar, iMin, eVar.u(), eVar.v(), false);
        if (eVar.J != null) {
            android.support.v4.app.e eVarH0 = h0(eVar);
            if (eVarH0 != null) {
                View view = eVarH0.J;
                ViewGroup viewGroup = eVar.I;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(eVar.J);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(eVar.J, iIndexOfChild);
                }
            }
            if (eVar.O && eVar.I != null) {
                float f2 = eVar.Q;
                if (f2 > 0.0f) {
                    eVar.J.setAlpha(f2);
                }
                eVar.Q = 0.0f;
                eVar.O = false;
                g gVarR0 = r0(eVar, eVar.u(), true, eVar.v());
                if (gVarR0 != null) {
                    V0(eVar.J, gVarR0);
                    Animation animation = gVarR0.f547a;
                    if (animation != null) {
                        eVar.J.startAnimation(animation);
                    } else {
                        gVarR0.f548b.setTarget(eVar.J);
                        gVarR0.f548b.start();
                    }
                }
            }
        }
        if (eVar.P) {
            o(eVar);
        }
    }
}
