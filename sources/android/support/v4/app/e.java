package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class e implements ComponentCallbacks, View.OnCreateContextMenuListener, android.arch.lifecycle.e, android.arch.lifecycle.o {
    private static final f0.k<String, Class<?>> X = new f0.k<>();
    static final Object Y = new Object();
    String A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean H;
    ViewGroup I;
    View J;
    View K;
    boolean L;
    d N;
    boolean O;
    boolean P;
    float Q;
    LayoutInflater R;
    boolean S;
    android.arch.lifecycle.f U;
    android.arch.lifecycle.e V;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Bundle f440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SparseArray<Parcelable> f441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Boolean f442e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Bundle f445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    e f446i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f452o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    k f456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    i f457t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    k f458u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    l f459v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    android.arch.lifecycle.n f460w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    e f461x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f462y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f463z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f439b = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f443f = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f447j = -1;
    boolean G = true;
    boolean M = true;
    android.arch.lifecycle.f T = new android.arch.lifecycle.f(this);
    android.arch.lifecycle.i<android.arch.lifecycle.e> W = new android.arch.lifecycle.i<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.b();
        }
    }

    class b extends g {
        b() {
        }

        @Override // android.support.v4.app.g
        public e a(Context context, String str, Bundle bundle) {
            return e.this.f457t.a(context, str, bundle);
        }

        @Override // android.support.v4.app.g
        public View b(int i2) {
            View view = e.this.J;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // android.support.v4.app.g
        public boolean c() {
            return e.this.J != null;
        }
    }

    class c implements android.arch.lifecycle.e {
        c() {
        }

        @Override // android.arch.lifecycle.e
        public android.arch.lifecycle.c a() {
            e eVar = e.this;
            if (eVar.U == null) {
                eVar.U = new android.arch.lifecycle.f(eVar.V);
            }
            return e.this.U;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Animator f468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f473g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f474h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f475i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f476j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f477k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f478l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Boolean f479m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Boolean f480n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f481o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        f f482p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f483q;

        d() {
            Object obj = e.Y;
            this.f474h = obj;
            this.f475i = null;
            this.f476j = obj;
            this.f477k = null;
            this.f478l = obj;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.app.e$e, reason: collision with other inner class name */
    public static class C0003e extends RuntimeException {
        public C0003e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public static e E(Context context, String str, Bundle bundle) {
        try {
            f0.k<String, Class<?>> kVar = X;
            Class<?> clsLoadClass = kVar.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                kVar.put(str, clsLoadClass);
            }
            e eVar = (e) clsLoadClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(eVar.getClass().getClassLoader());
                eVar.T0(bundle);
            }
            return eVar;
        } catch (ClassNotFoundException e2) {
            throw new C0003e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0003e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new C0003e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new C0003e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new C0003e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    static boolean K(Context context, String str) {
        try {
            f0.k<String, Class<?>> kVar = X;
            Class<?> clsLoadClass = kVar.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                kVar.put(str, clsLoadClass);
            }
            return e.class.isAssignableFrom(clsLoadClass);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private d d() {
        if (this.N == null) {
            this.N = new d();
        }
        return this.N;
    }

    public Object A() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f478l;
        return obj == Y ? z() : obj;
    }

    void A0() {
        if (this.J != null) {
            this.U.g(android.arch.lifecycle.c.a.ON_DESTROY);
        }
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.w();
        }
        this.f439b = 1;
        this.H = false;
        Z();
        if (this.H) {
            s.b(this).c();
            this.f454q = false;
        } else {
            throw new w("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    int B() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f469c;
    }

    void B0() {
        this.H = false;
        a0();
        this.R = null;
        if (!this.H) {
            throw new w("Fragment " + this + " did not call through to super.onDetach()");
        }
        k kVar = this.f458u;
        if (kVar != null) {
            if (this.E) {
                kVar.v();
                this.f458u = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }

    public View C() {
        return this.J;
    }

    LayoutInflater C0(Bundle bundle) {
        LayoutInflater layoutInflaterB0 = b0(bundle);
        this.R = layoutInflaterB0;
        return layoutInflaterB0;
    }

    void D() {
        this.f443f = -1;
        this.f444g = null;
        this.f449l = false;
        this.f450m = false;
        this.f451n = false;
        this.f452o = false;
        this.f453p = false;
        this.f455r = 0;
        this.f456s = null;
        this.f458u = null;
        this.f457t = null;
        this.f462y = 0;
        this.f463z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
        this.E = false;
    }

    void D0() {
        onLowMemory();
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.x();
        }
    }

    void E0(boolean z2) {
        f0(z2);
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.y(z2);
        }
    }

    void F() {
        if (this.f457t == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        k kVar = new k();
        this.f458u = kVar;
        kVar.i(this.f457t, new b(), this);
    }

    boolean F0(MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        if (this.F && this.G && g0(menuItem)) {
            return true;
        }
        k kVar = this.f458u;
        return kVar != null && kVar.N(menuItem);
    }

    boolean G() {
        d dVar = this.N;
        if (dVar == null) {
            return false;
        }
        return dVar.f483q;
    }

    void G0(Menu menu) {
        if (this.B) {
            return;
        }
        if (this.F && this.G) {
            h0(menu);
        }
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.O(menu);
        }
    }

    final boolean H() {
        return this.f455r > 0;
    }

    void H0() {
        if (this.J != null) {
            this.U.g(android.arch.lifecycle.c.a.ON_PAUSE);
        }
        this.T.g(android.arch.lifecycle.c.a.ON_PAUSE);
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.P();
        }
        this.f439b = 3;
        this.H = false;
        i0();
        if (this.H) {
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onPause()");
    }

    boolean I() {
        d dVar = this.N;
        if (dVar == null) {
            return false;
        }
        return dVar.f481o;
    }

    void I0(boolean z2) {
        j0(z2);
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.Q(z2);
        }
    }

    public final boolean J() {
        k kVar = this.f456s;
        if (kVar == null) {
            return false;
        }
        return kVar.c();
    }

    boolean J0(Menu menu) {
        boolean z2 = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            k0(menu);
            z2 = true;
        }
        k kVar = this.f458u;
        return kVar != null ? z2 | kVar.R(menu) : z2;
    }

    void K0() {
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.D0();
            this.f458u.a0();
        }
        this.f439b = 4;
        this.H = false;
        m0();
        if (!this.H) {
            throw new w("Fragment " + this + " did not call through to super.onResume()");
        }
        k kVar2 = this.f458u;
        if (kVar2 != null) {
            kVar2.S();
            this.f458u.a0();
        }
        android.arch.lifecycle.f fVar = this.T;
        android.arch.lifecycle.c.a aVar = android.arch.lifecycle.c.a.ON_RESUME;
        fVar.g(aVar);
        if (this.J != null) {
            this.U.g(aVar);
        }
    }

    void L() {
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.D0();
        }
    }

    void L0(Bundle bundle) {
        Parcelable parcelableP0;
        n0(bundle);
        k kVar = this.f458u;
        if (kVar == null || (parcelableP0 = kVar.P0()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", parcelableP0);
    }

    public void M(Bundle bundle) {
        this.H = true;
    }

    void M0() {
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.D0();
            this.f458u.a0();
        }
        this.f439b = 3;
        this.H = false;
        o0();
        if (!this.H) {
            throw new w("Fragment " + this + " did not call through to super.onStart()");
        }
        k kVar2 = this.f458u;
        if (kVar2 != null) {
            kVar2.T();
        }
        android.arch.lifecycle.f fVar = this.T;
        android.arch.lifecycle.c.a aVar = android.arch.lifecycle.c.a.ON_START;
        fVar.g(aVar);
        if (this.J != null) {
            this.U.g(aVar);
        }
    }

    public void N(int i2, int i3, Intent intent) {
    }

    void N0() {
        if (this.J != null) {
            this.U.g(android.arch.lifecycle.c.a.ON_STOP);
        }
        this.T.g(android.arch.lifecycle.c.a.ON_STOP);
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.V();
        }
        this.f439b = 2;
        this.H = false;
        p0();
        if (this.H) {
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onStop()");
    }

    @Deprecated
    public void O(Activity activity) {
        this.H = true;
    }

    public final Context O0() {
        Context contextM = m();
        if (contextM != null) {
            return contextM;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void P(Context context) {
        this.H = true;
        i iVar = this.f457t;
        Activity activityD = iVar == null ? null : iVar.d();
        if (activityD != null) {
            this.H = false;
            O(activityD);
        }
    }

    void P0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.f458u == null) {
            F();
        }
        this.f458u.M0(parcelable, this.f459v);
        this.f459v = null;
        this.f458u.t();
    }

    public void Q(e eVar) {
    }

    final void Q0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f441d;
        if (sparseArray != null) {
            this.K.restoreHierarchyState(sparseArray);
            this.f441d = null;
        }
        this.H = false;
        r0(bundle);
        if (this.H) {
            if (this.J != null) {
                this.U.g(android.arch.lifecycle.c.a.ON_CREATE);
            }
        } else {
            throw new w("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public boolean R(MenuItem menuItem) {
        return false;
    }

    void R0(View view) {
        d().f467a = view;
    }

    public void S(Bundle bundle) {
        this.H = true;
        P0(bundle);
        k kVar = this.f458u;
        if (kVar == null || kVar.q0(1)) {
            return;
        }
        this.f458u.t();
    }

    void S0(Animator animator) {
        d().f468b = animator;
    }

    public Animation T(int i2, boolean z2, int i3) {
        return null;
    }

    public void T0(Bundle bundle) {
        if (this.f443f >= 0 && J()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.f445h = bundle;
    }

    public Animator U(int i2, boolean z2, int i3) {
        return null;
    }

    void U0(boolean z2) {
        d().f483q = z2;
    }

    public void V(Menu menu, MenuInflater menuInflater) {
    }

    final void V0(int i2, e eVar) {
        StringBuilder sb;
        String str;
        this.f443f = i2;
        if (eVar != null) {
            sb = new StringBuilder();
            sb.append(eVar.f444g);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f443f);
        this.f444g = sb.toString();
    }

    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    void W0(int i2) {
        if (this.N == null && i2 == 0) {
            return;
        }
        d().f470d = i2;
    }

    public void X() {
        this.H = true;
        android.support.v4.app.f fVarF = f();
        boolean z2 = fVarF != null && fVarF.isChangingConfigurations();
        android.arch.lifecycle.n nVar = this.f460w;
        if (nVar == null || z2) {
            return;
        }
        nVar.a();
    }

    void X0(int i2, int i3) {
        if (this.N == null && i2 == 0 && i3 == 0) {
            return;
        }
        d();
        d dVar = this.N;
        dVar.f471e = i2;
        dVar.f472f = i3;
    }

    public void Y() {
    }

    void Y0(f fVar) {
        d();
        d dVar = this.N;
        f fVar2 = dVar.f482p;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.f481o) {
            dVar.f482p = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public void Z() {
        this.H = true;
    }

    void Z0(int i2) {
        d().f469c = i2;
    }

    @Override // android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
        return this.T;
    }

    public void a0() {
        this.H = true;
    }

    public void a1() {
        k kVar = this.f456s;
        if (kVar == null || kVar.f518n == null) {
            d().f481o = false;
        } else if (Looper.myLooper() != this.f456s.f518n.g().getLooper()) {
            this.f456s.f518n.g().postAtFrontOfQueue(new a());
        } else {
            b();
        }
    }

    void b() {
        d dVar = this.N;
        f fVar = null;
        if (dVar != null) {
            dVar.f481o = false;
            f fVar2 = dVar.f482p;
            dVar.f482p = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public LayoutInflater b0(Bundle bundle) {
        return s(bundle);
    }

    public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f462y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f463z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f439b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f443f);
        printWriter.print(" mWho=");
        printWriter.print(this.f444g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f455r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f449l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f450m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f451n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f452o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.f456s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f456s);
        }
        if (this.f457t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f457t);
        }
        if (this.f461x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f461x);
        }
        if (this.f445h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f445h);
        }
        if (this.f440c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f440c);
        }
        if (this.f441d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f441d);
        }
        if (this.f446i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f446i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f448k);
        }
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(t());
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.J);
        }
        if (j() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(j());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(B());
        }
        if (m() != null) {
            s.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.f458u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f458u + ":");
            this.f458u.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void c0(boolean z2) {
    }

    @Deprecated
    public void d0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
    }

    e e(String str) {
        if (str.equals(this.f444g)) {
            return this;
        }
        k kVar = this.f458u;
        if (kVar != null) {
            return kVar.g0(str);
        }
        return null;
    }

    public void e0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
        i iVar = this.f457t;
        Activity activityD = iVar == null ? null : iVar.d();
        if (activityD != null) {
            this.H = false;
            d0(activityD, attributeSet, bundle);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final android.support.v4.app.f f() {
        i iVar = this.f457t;
        if (iVar == null) {
            return null;
        }
        return (android.support.v4.app.f) iVar.d();
    }

    public void f0(boolean z2) {
    }

    @Override // android.arch.lifecycle.o
    public android.arch.lifecycle.n g() {
        if (m() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f460w == null) {
            this.f460w = new android.arch.lifecycle.n();
        }
        return this.f460w;
    }

    public boolean g0(MenuItem menuItem) {
        return false;
    }

    public boolean h() {
        Boolean bool;
        d dVar = this.N;
        if (dVar == null || (bool = dVar.f480n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void h0(Menu menu) {
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean i() {
        Boolean bool;
        d dVar = this.N;
        if (dVar == null || (bool = dVar.f479m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void i0() {
        this.H = true;
    }

    View j() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f467a;
    }

    public void j0(boolean z2) {
    }

    Animator k() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f468b;
    }

    public void k0(Menu menu) {
    }

    public final j l() {
        if (this.f458u == null) {
            F();
            int i2 = this.f439b;
            if (i2 >= 4) {
                this.f458u.S();
            } else if (i2 >= 3) {
                this.f458u.T();
            } else if (i2 >= 2) {
                this.f458u.q();
            } else if (i2 >= 1) {
                this.f458u.t();
            }
        }
        return this.f458u;
    }

    public void l0(int i2, String[] strArr, int[] iArr) {
    }

    public Context m() {
        i iVar = this.f457t;
        if (iVar == null) {
            return null;
        }
        return iVar.e();
    }

    public void m0() {
        this.H = true;
    }

    public Object n() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f473g;
    }

    public void n0(Bundle bundle) {
    }

    v o() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void o0() {
        this.H = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        f().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.H = true;
    }

    public Object p() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f475i;
    }

    public void p0() {
        this.H = true;
    }

    v q() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void q0(View view, Bundle bundle) {
    }

    public final j r() {
        return this.f456s;
    }

    public void r0(Bundle bundle) {
        this.H = true;
    }

    @Deprecated
    public LayoutInflater s(Bundle bundle) {
        i iVar = this.f457t;
        if (iVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterJ = iVar.j();
        l();
        g0.f.a(layoutInflaterJ, this.f458u.n0());
        return layoutInflaterJ;
    }

    j s0() {
        return this.f458u;
    }

    int t() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f470d;
    }

    void t0(Bundle bundle) {
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.D0();
        }
        this.f439b = 2;
        this.H = false;
        M(bundle);
        if (this.H) {
            k kVar2 = this.f458u;
            if (kVar2 != null) {
                kVar2.q();
                return;
            }
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        f0.d.a(this, sb);
        if (this.f443f >= 0) {
            sb.append(" #");
            sb.append(this.f443f);
        }
        if (this.f462y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f462y));
        }
        if (this.A != null) {
            sb.append(" ");
            sb.append(this.A);
        }
        sb.append('}');
        return sb.toString();
    }

    int u() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f471e;
    }

    void u0(Configuration configuration) {
        onConfigurationChanged(configuration);
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.r(configuration);
        }
    }

    int v() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f472f;
    }

    boolean v0(MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        if (R(menuItem)) {
            return true;
        }
        k kVar = this.f458u;
        return kVar != null && kVar.s(menuItem);
    }

    public Object w() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f476j;
        return obj == Y ? p() : obj;
    }

    void w0(Bundle bundle) {
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.D0();
        }
        this.f439b = 1;
        this.H = false;
        S(bundle);
        this.S = true;
        if (this.H) {
            this.T.g(android.arch.lifecycle.c.a.ON_CREATE);
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final Resources x() {
        return O0().getResources();
    }

    boolean x0(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            V(menu, menuInflater);
            z2 = true;
        }
        k kVar = this.f458u;
        return kVar != null ? z2 | kVar.u(menu, menuInflater) : z2;
    }

    public Object y() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f474h;
        return obj == Y ? n() : obj;
    }

    void y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.D0();
        }
        this.f454q = true;
        this.V = new c();
        this.U = null;
        View viewW = W(layoutInflater, viewGroup, bundle);
        this.J = viewW;
        if (viewW != null) {
            this.V.a();
            this.W.n(this.V);
        } else {
            if (this.U != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.V = null;
        }
    }

    public Object z() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f477k;
    }

    void z0() {
        this.T.g(android.arch.lifecycle.c.a.ON_DESTROY);
        k kVar = this.f458u;
        if (kVar != null) {
            kVar.v();
        }
        this.f439b = 0;
        this.H = false;
        this.S = false;
        X();
        if (this.H) {
            this.f458u = null;
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onDestroy()");
    }
}
