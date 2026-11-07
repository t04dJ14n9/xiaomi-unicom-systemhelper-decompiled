package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.t;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.a0;
import android.support.v7.widget.t0;
import android.support.v7.widget.w0;
import android.support.v7.widget.x0;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import g0.m;
import g0.q;
import g0.s;
import g0.u;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class d extends android.support.v7.app.c implements android.support.v7.view.menu.e.a, LayoutInflater.Factory2 {
    private static final boolean T = false;
    private static final int[] U = {R.attr.windowBackground};
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean E;
    private k[] F;
    private k G;
    private boolean H;
    boolean I;
    private boolean K;
    private i L;
    boolean M;
    int N;
    private boolean P;
    private Rect Q;
    private Rect R;
    private AppCompatViewInflater S;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Window f815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Window.Callback f816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Window.Callback f817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final i0.b f818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    android.support.v7.app.a f819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    MenuInflater f820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a0 f822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private f f823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    m0.b f825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ActionBarContextView f826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    PopupWindow f827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Runnable f828q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ViewGroup f832u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f836y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f837z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    q f829r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f830s = true;
    private int J = -100;
    private final Runnable O = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            if ((dVar.N & 1) != 0) {
                dVar.I(0);
            }
            d dVar2 = d.this;
            if ((dVar2.N & 4096) != 0) {
                dVar2.I(108);
            }
            d dVar3 = d.this;
            dVar3.M = false;
            dVar3.N = 0;
        }
    }

    class b implements g0.l {
        b() {
        }

        @Override // g0.l
        public u a(View view, u uVar) {
            int iD = uVar.d();
            int iV0 = d.this.v0(iD);
            if (iD != iV0) {
                uVar = uVar.e(uVar.b(), iV0, uVar.c(), uVar.a());
            }
            return m.m(view, uVar);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // android.support.v7.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            d.this.G();
        }
    }

    /* JADX INFO: renamed from: android.support.v7.app.d$d, reason: collision with other inner class name */
    class RunnableC0008d implements Runnable {

        /* JADX INFO: renamed from: android.support.v7.app.d$d$a */
        class a extends s {
            a() {
            }

            @Override // g0.r
            public void a(View view) {
                d.this.f826o.setAlpha(1.0f);
                d.this.f829r.f(null);
                d.this.f829r = null;
            }

            @Override // g0.s, g0.r
            public void b(View view) {
                d.this.f826o.setVisibility(0);
            }
        }

        RunnableC0008d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.f827p.showAtLocation(dVar.f826o, 55, 0, 0);
            d.this.J();
            if (!d.this.o0()) {
                d.this.f826o.setAlpha(1.0f);
                d.this.f826o.setVisibility(0);
            } else {
                d.this.f826o.setAlpha(0.0f);
                d dVar2 = d.this;
                dVar2.f829r = m.a(dVar2.f826o).a(1.0f);
                d.this.f829r.f(new a());
            }
        }
    }

    class e extends s {
        e() {
        }

        @Override // g0.r
        public void a(View view) {
            d.this.f826o.setAlpha(1.0f);
            d.this.f829r.f(null);
            d.this.f829r = null;
        }

        @Override // g0.s, g0.r
        public void b(View view) {
            d.this.f826o.setVisibility(0);
            d.this.f826o.sendAccessibilityEvent(32);
            if (d.this.f826o.getParent() instanceof View) {
                m.q((View) d.this.f826o.getParent());
            }
        }
    }

    private final class f implements android.support.v7.view.menu.j.a {
        f() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z2) {
            d.this.B(eVar);
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean b(android.support.v7.view.menu.e eVar) {
            Window.Callback callbackR = d.this.R();
            if (callbackR == null) {
                return true;
            }
            callbackR.onMenuOpened(108, eVar);
            return true;
        }
    }

    class g implements m0.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m0.b.a f845a;

        class a extends s {
            a() {
            }

            @Override // g0.r
            public void a(View view) {
                d.this.f826o.setVisibility(8);
                d dVar = d.this;
                PopupWindow popupWindow = dVar.f827p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (dVar.f826o.getParent() instanceof View) {
                    m.q((View) d.this.f826o.getParent());
                }
                d.this.f826o.removeAllViews();
                d.this.f829r.f(null);
                d.this.f829r = null;
            }
        }

        public g(m0.b.a aVar) {
            this.f845a = aVar;
        }

        @Override // m0.b.a
        public boolean a(m0.b bVar, Menu menu) {
            return this.f845a.a(bVar, menu);
        }

        @Override // m0.b.a
        public void b(m0.b bVar) {
            this.f845a.b(bVar);
            d dVar = d.this;
            if (dVar.f827p != null) {
                dVar.f815d.getDecorView().removeCallbacks(d.this.f828q);
            }
            d dVar2 = d.this;
            if (dVar2.f826o != null) {
                dVar2.J();
                d dVar3 = d.this;
                dVar3.f829r = m.a(dVar3.f826o).a(0.0f);
                d.this.f829r.f(new a());
            }
            d dVar4 = d.this;
            i0.b bVar2 = dVar4.f818g;
            if (bVar2 != null) {
                bVar2.d(dVar4.f825n);
            }
            d.this.f825n = null;
        }

        @Override // m0.b.a
        public boolean c(m0.b bVar, MenuItem menuItem) {
            return this.f845a.c(bVar, menuItem);
        }

        @Override // m0.b.a
        public boolean d(m0.b bVar, Menu menu) {
            return this.f845a.d(bVar, menu);
        }
    }

    class h extends m0.i {
        h(Window.Callback callback) {
            super(callback);
        }

        final ActionMode a(ActionMode.Callback callback) {
            m0.f.a aVar = new m0.f.a(d.this.f814c, callback);
            m0.b bVarR0 = d.this.r0(aVar);
            if (bVarR0 != null) {
                return aVar.e(bVarR0);
            }
            return null;
        }

        @Override // m0.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return d.this.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // m0.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || d.this.c0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // m0.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof android.support.v7.view.menu.e)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // m0.i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            d.this.f0(i2);
            return true;
        }

        @Override // m0.i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            d.this.g0(i2);
        }

        @Override // m0.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            android.support.v7.view.menu.e eVar = menu instanceof android.support.v7.view.menu.e ? (android.support.v7.view.menu.e) menu : null;
            if (i2 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // m0.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            android.support.v7.view.menu.e eVar;
            k kVarP = d.this.P(0, true);
            if (kVarP == null || (eVar = kVarP.f865j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i2);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // m0.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (d.this.X() && i2 == 0) ? a(callback) : super.onWindowStartingActionMode(callback, i2);
        }
    }

    final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.support.v7.app.f f849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BroadcastReceiver f851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IntentFilter f852d;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                i.this.b();
            }
        }

        i(android.support.v7.app.f fVar) {
            this.f849a = fVar;
            this.f850b = fVar.d();
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f851c;
            if (broadcastReceiver != null) {
                d.this.f814c.unregisterReceiver(broadcastReceiver);
                this.f851c = null;
            }
        }

        void b() {
            boolean zD = this.f849a.d();
            if (zD != this.f850b) {
                this.f850b = zD;
                d.this.d();
            }
        }

        int c() {
            boolean zD = this.f849a.d();
            this.f850b = zD;
            return zD ? 2 : 1;
        }

        void d() {
            a();
            if (this.f851c == null) {
                this.f851c = new a();
            }
            if (this.f852d == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f852d = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.f852d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f852d.addAction("android.intent.action.TIME_TICK");
            }
            d.this.f814c.registerReceiver(this.f851c, this.f852d);
        }
    }

    private class j extends ContentFrameLayout {
        public j(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return d.this.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            d.this.C(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(k0.a.b(getContext(), i2));
        }
    }

    protected static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f862g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f863h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f864i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        android.support.v7.view.menu.e f865j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        android.support.v7.view.menu.c f866k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f867l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f868m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f869n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f870o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f871p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f872q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f873r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f874s;

        k(int i2) {
            this.f856a = i2;
        }

        android.support.v7.view.menu.k a(android.support.v7.view.menu.j.a aVar) {
            if (this.f865j == null) {
                return null;
            }
            if (this.f866k == null) {
                android.support.v7.view.menu.c cVar = new android.support.v7.view.menu.c(this.f867l, j0.g.f3127j);
                this.f866k = cVar;
                cVar.f(aVar);
                this.f865j.b(this.f866k);
            }
            return this.f866k.h(this.f862g);
        }

        public boolean b() {
            if (this.f863h == null) {
                return false;
            }
            return this.f864i != null || this.f866k.c().getCount() > 0;
        }

        void c(android.support.v7.view.menu.e eVar) {
            android.support.v7.view.menu.c cVar;
            android.support.v7.view.menu.e eVar2 = this.f865j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f866k);
            }
            this.f865j = eVar;
            if (eVar == null || (cVar = this.f866k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(j0.a.f3024a, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            }
            themeNewTheme.resolveAttribute(j0.a.D, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = j0.i.f3149a;
            }
            themeNewTheme.applyStyle(i3, true);
            m0.d dVar = new m0.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f867l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(j0.j.f3193r0);
            this.f857b = typedArrayObtainStyledAttributes.getResourceId(j0.j.f3199u0, 0);
            this.f861f = typedArrayObtainStyledAttributes.getResourceId(j0.j.f3197t0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class l implements android.support.v7.view.menu.j.a {
        l() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z2) {
            android.support.v7.view.menu.e eVarD = eVar.D();
            boolean z3 = eVarD != eVar;
            d dVar = d.this;
            if (z3) {
                eVar = eVarD;
            }
            k kVarM = dVar.M(eVar);
            if (kVarM != null) {
                if (!z3) {
                    d.this.D(kVarM, z2);
                } else {
                    d.this.A(kVarM.f856a, kVarM, eVarD);
                    d.this.D(kVarM, true);
                }
            }
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean b(android.support.v7.view.menu.e eVar) {
            Window.Callback callbackR;
            if (eVar != null) {
                return true;
            }
            d dVar = d.this;
            if (!dVar.f837z || (callbackR = dVar.R()) == null || d.this.I) {
                return true;
            }
            callbackR.onMenuOpened(108, eVar);
            return true;
        }
    }

    d(Context context, Window window, i0.b bVar) {
        this.f814c = context;
        this.f815d = window;
        this.f818g = bVar;
        Window.Callback callback = window.getCallback();
        this.f816e = callback;
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f817f = hVar;
        window.setCallback(hVar);
        t0 t0VarS = t0.s(context, null, U);
        Drawable drawableG = t0VarS.g(0);
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        t0VarS.u();
    }

    private ViewGroup E() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f814c.obtainStyledAttributes(j0.j.f3193r0);
        int i2 = j0.j.f3203w0;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(j0.j.F0, false)) {
            u(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            u(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(j0.j.f3205x0, false)) {
            u(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(j0.j.f3207y0, false)) {
            u(10);
        }
        this.C = typedArrayObtainStyledAttributes.getBoolean(j0.j.f3195s0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f815d.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f814c);
        if (this.D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.B ? j0.g.f3132o : j0.g.f3131n, (ViewGroup) null);
            m.w(viewGroup, new b());
        } else if (this.C) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(j0.g.f3123f, (ViewGroup) null);
            this.A = false;
            this.f837z = false;
        } else if (this.f837z) {
            TypedValue typedValue = new TypedValue();
            this.f814c.getTheme().resolveAttribute(j0.a.f3029f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new m0.d(this.f814c, typedValue.resourceId) : this.f814c).inflate(j0.g.f3133p, (ViewGroup) null);
            a0 a0Var = (a0) viewGroup.findViewById(j0.f.f3107p);
            this.f822k = a0Var;
            a0Var.setWindowCallback(R());
            if (this.A) {
                this.f822k.h(109);
            }
            if (this.f835x) {
                this.f822k.h(2);
            }
            if (this.f836y) {
                this.f822k.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f837z + ", windowActionBarOverlay: " + this.A + ", android:windowIsFloating: " + this.C + ", windowActionModeOverlay: " + this.B + ", windowNoTitle: " + this.D + " }");
        }
        if (this.f822k == null) {
            this.f833v = (TextView) viewGroup.findViewById(j0.f.L);
        }
        x0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(j0.f.f3093b);
        ViewGroup viewGroup2 = (ViewGroup) this.f815d.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f815d.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void K() {
        if (this.L == null) {
            this.L = new i(android.support.v7.app.f.a(this.f814c));
        }
    }

    private void L() {
        if (this.f831t) {
            return;
        }
        this.f832u = E();
        CharSequence charSequenceQ = Q();
        if (!TextUtils.isEmpty(charSequenceQ)) {
            a0 a0Var = this.f822k;
            if (a0Var != null) {
                a0Var.setWindowTitle(charSequenceQ);
            } else if (j0() != null) {
                j0().s(charSequenceQ);
            } else {
                TextView textView = this.f833v;
                if (textView != null) {
                    textView.setText(charSequenceQ);
                }
            }
        }
        z();
        h0(this.f832u);
        this.f831t = true;
        k kVarP = P(0, false);
        if (this.I) {
            return;
        }
        if (kVarP == null || kVarP.f865j == null) {
            W(108);
        }
    }

    private int O() {
        int i2 = this.J;
        return i2 != -100 ? i2 : android.support.v7.app.c.h();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    private void S() {
        android.support.v7.app.g gVar;
        android.support.v7.app.a aVar;
        L();
        if (this.f837z && this.f819h == null) {
            Window.Callback callback = this.f816e;
            if (!(callback instanceof Activity)) {
                if (callback instanceof Dialog) {
                    gVar = new android.support.v7.app.g((Dialog) this.f816e);
                }
                aVar = this.f819h;
                if (aVar != null) {
                    aVar.q(this.P);
                }
            }
            gVar = new android.support.v7.app.g((Activity) this.f816e, this.A);
            this.f819h = gVar;
            aVar = this.f819h;
            if (aVar != null) {
                aVar.q(this.P);
            }
        }
    }

    private boolean T(k kVar) {
        View view = kVar.f864i;
        if (view != null) {
            kVar.f863h = view;
            return true;
        }
        if (kVar.f865j == null) {
            return false;
        }
        if (this.f824m == null) {
            this.f824m = new l();
        }
        View view2 = (View) kVar.a(this.f824m);
        kVar.f863h = view2;
        return view2 != null;
    }

    private boolean U(k kVar) {
        kVar.d(N());
        kVar.f862g = new j(kVar.f867l);
        kVar.f858c = 81;
        return true;
    }

    private boolean V(k kVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f814c;
        int i2 = kVar.f856a;
        if ((i2 == 0 || i2 == 108) && this.f822k != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(j0.a.f3029f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(j0.a.f3030g, typedValue, true);
            } else {
                theme.resolveAttribute(j0.a.f3030g, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                m0.d dVar = new m0.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        android.support.v7.view.menu.e eVar = new android.support.v7.view.menu.e(context);
        eVar.R(this);
        kVar.c(eVar);
        return true;
    }

    private void W(int i2) {
        this.N = (1 << i2) | this.N;
        if (this.M) {
            return;
        }
        m.o(this.f815d.getDecorView(), this.O);
        this.M = true;
    }

    private boolean b0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        k kVarP = P(i2, true);
        if (kVarP.f870o) {
            return false;
        }
        return l0(kVarP, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean e0(int i2, KeyEvent keyEvent) {
        boolean zL0;
        a0 a0Var;
        if (this.f825n != null) {
            return false;
        }
        boolean zD = true;
        k kVarP = P(i2, true);
        if (i2 != 0 || (a0Var = this.f822k) == null || !a0Var.g() || ViewConfiguration.get(this.f814c).hasPermanentMenuKey()) {
            boolean z2 = kVarP.f870o;
            if (z2 || kVarP.f869n) {
                D(kVarP, true);
                zD = z2;
            } else if (kVarP.f868m) {
                if (kVarP.f873r) {
                    kVarP.f868m = false;
                    zL0 = l0(kVarP, keyEvent);
                } else {
                    zL0 = true;
                }
                if (zL0) {
                    i0(kVarP, keyEvent);
                } else {
                    zD = false;
                }
            } else {
                zD = false;
            }
        } else if (this.f822k.b()) {
            zD = this.f822k.d();
        } else if (this.I || !l0(kVarP, keyEvent)) {
            zD = false;
        } else {
            zD = this.f822k.e();
        }
        if (zD) {
            AudioManager audioManager = (AudioManager) this.f814c.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zD;
    }

    private void i0(k kVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (kVar.f870o || this.I) {
            return;
        }
        if (kVar.f856a == 0) {
            if ((this.f814c.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackR = R();
        if (callbackR != null && !callbackR.onMenuOpened(kVar.f856a, kVar.f865j)) {
            D(kVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f814c.getSystemService("window");
        if (windowManager != null && l0(kVar, keyEvent)) {
            ViewGroup viewGroup = kVar.f862g;
            if (viewGroup != null && !kVar.f872q) {
                View view = kVar.f864i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                kVar.f869n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, kVar.f859d, kVar.f860e, 1002, 8519680, -3);
                layoutParams2.gravity = kVar.f858c;
                layoutParams2.windowAnimations = kVar.f861f;
                windowManager.addView(kVar.f862g, layoutParams2);
                kVar.f870o = true;
            }
            if (viewGroup == null) {
                if (!U(kVar) || kVar.f862g == null) {
                    return;
                }
            } else if (kVar.f872q && viewGroup.getChildCount() > 0) {
                kVar.f862g.removeAllViews();
            }
            if (!T(kVar) || !kVar.b()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = kVar.f863h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            kVar.f862g.setBackgroundResource(kVar.f857b);
            ViewParent parent = kVar.f863h.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(kVar.f863h);
            }
            kVar.f862g.addView(kVar.f863h, layoutParams3);
            if (!kVar.f863h.hasFocus()) {
                kVar.f863h.requestFocus();
            }
            i2 = -2;
            kVar.f869n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, kVar.f859d, kVar.f860e, 1002, 8519680, -3);
            layoutParams4.gravity = kVar.f858c;
            layoutParams4.windowAnimations = kVar.f861f;
            windowManager.addView(kVar.f862g, layoutParams4);
            kVar.f870o = true;
        }
    }

    private boolean k0(k kVar, int i2, KeyEvent keyEvent, int i3) {
        android.support.v7.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((kVar.f868m || l0(kVar, keyEvent)) && (eVar = kVar.f865j) != null) {
            zPerformShortcut = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f822k == null) {
            D(kVar, true);
        }
        return zPerformShortcut;
    }

    private boolean l0(k kVar, KeyEvent keyEvent) {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        if (this.I) {
            return false;
        }
        if (kVar.f868m) {
            return true;
        }
        k kVar2 = this.G;
        if (kVar2 != null && kVar2 != kVar) {
            D(kVar2, false);
        }
        Window.Callback callbackR = R();
        if (callbackR != null) {
            kVar.f864i = callbackR.onCreatePanelView(kVar.f856a);
        }
        int i2 = kVar.f856a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (a0Var3 = this.f822k) != null) {
            a0Var3.f();
        }
        if (kVar.f864i == null) {
            if (z2) {
                j0();
            }
            android.support.v7.view.menu.e eVar = kVar.f865j;
            if (eVar == null || kVar.f873r) {
                if (eVar == null && (!V(kVar) || kVar.f865j == null)) {
                    return false;
                }
                if (z2 && this.f822k != null) {
                    if (this.f823l == null) {
                        this.f823l = new f();
                    }
                    this.f822k.c(kVar.f865j, this.f823l);
                }
                kVar.f865j.d0();
                if (!callbackR.onCreatePanelMenu(kVar.f856a, kVar.f865j)) {
                    kVar.c(null);
                    if (z2 && (a0Var = this.f822k) != null) {
                        a0Var.c(null, this.f823l);
                    }
                    return false;
                }
                kVar.f873r = false;
            }
            kVar.f865j.d0();
            Bundle bundle = kVar.f874s;
            if (bundle != null) {
                kVar.f865j.P(bundle);
                kVar.f874s = null;
            }
            if (!callbackR.onPreparePanel(0, kVar.f864i, kVar.f865j)) {
                if (z2 && (a0Var2 = this.f822k) != null) {
                    a0Var2.c(null, this.f823l);
                }
                kVar.f865j.c0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            kVar.f871p = z3;
            kVar.f865j.setQwertyMode(z3);
            kVar.f865j.c0();
        }
        kVar.f868m = true;
        kVar.f869n = false;
        this.G = kVar;
        return true;
    }

    private void m0(android.support.v7.view.menu.e eVar, boolean z2) {
        a0 a0Var = this.f822k;
        if (a0Var == null || !a0Var.g() || (ViewConfiguration.get(this.f814c).hasPermanentMenuKey() && !this.f822k.a())) {
            k kVarP = P(0, true);
            kVarP.f872q = true;
            D(kVarP, false);
            i0(kVarP, null);
            return;
        }
        Window.Callback callbackR = R();
        if (this.f822k.b() && z2) {
            this.f822k.d();
            if (this.I) {
                return;
            }
            callbackR.onPanelClosed(108, P(0, true).f865j);
            return;
        }
        if (callbackR == null || this.I) {
            return;
        }
        if (this.M && (this.N & 1) != 0) {
            this.f815d.getDecorView().removeCallbacks(this.O);
            this.O.run();
        }
        k kVarP2 = P(0, true);
        android.support.v7.view.menu.e eVar2 = kVarP2.f865j;
        if (eVar2 == null || kVarP2.f873r || !callbackR.onPreparePanel(0, kVarP2.f864i, eVar2)) {
            return;
        }
        callbackR.onMenuOpened(108, kVarP2.f865j);
        this.f822k.e();
    }

    private int n0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean p0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f815d.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || m.k((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean q0() {
        if (this.K) {
            Context context = this.f814c;
            if (context instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    Context context2 = this.f814c;
                    return (packageManager.getActivityInfo(new ComponentName(context2, context2.getClass()), 0).configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    return true;
                }
            }
        }
        return false;
    }

    private void t0() {
        if (this.f831t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private boolean u0(int i2) {
        Resources resources = this.f814c.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        int i4 = i2 == 2 ? 32 : 16;
        if (i3 == i4) {
            return false;
        }
        if (q0()) {
            ((Activity) this.f814c).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        resources.updateConfiguration(configuration2, displayMetrics);
        return true;
    }

    private void z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f832u.findViewById(R.id.content);
        View decorView = this.f815d.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f814c.obtainStyledAttributes(j0.j.f3193r0);
        typedArrayObtainStyledAttributes.getValue(j0.j.D0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(j0.j.E0, contentFrameLayout.getMinWidthMinor());
        int i2 = j0.j.B0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = j0.j.C0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = j0.j.f3209z0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = j0.j.A0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    void A(int i2, k kVar, Menu menu) {
        if (menu == null) {
            if (kVar == null && i2 >= 0) {
                k[] kVarArr = this.F;
                if (i2 < kVarArr.length) {
                    kVar = kVarArr[i2];
                }
            }
            if (kVar != null) {
                menu = kVar.f865j;
            }
        }
        if ((kVar == null || kVar.f870o) && !this.I) {
            this.f816e.onPanelClosed(i2, menu);
        }
    }

    void B(android.support.v7.view.menu.e eVar) {
        if (this.E) {
            return;
        }
        this.E = true;
        this.f822k.i();
        Window.Callback callbackR = R();
        if (callbackR != null && !this.I) {
            callbackR.onPanelClosed(108, eVar);
        }
        this.E = false;
    }

    void C(int i2) {
        D(P(i2, true), true);
    }

    void D(k kVar, boolean z2) {
        ViewGroup viewGroup;
        a0 a0Var;
        if (z2 && kVar.f856a == 0 && (a0Var = this.f822k) != null && a0Var.b()) {
            B(kVar.f865j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f814c.getSystemService("window");
        if (windowManager != null && kVar.f870o && (viewGroup = kVar.f862g) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                A(kVar.f856a, kVar, null);
            }
        }
        kVar.f868m = false;
        kVar.f869n = false;
        kVar.f870o = false;
        kVar.f863h = null;
        kVar.f872q = true;
        if (this.G == kVar) {
            this.G = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View F(View view, String str, Context context, AttributeSet attributeSet) {
        AppCompatViewInflater appCompatViewInflater;
        boolean zP0 = false;
        if (this.S == null) {
            String string = this.f814c.obtainStyledAttributes(j0.j.f3193r0).getString(j0.j.f3201v0);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.S = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                    this.S = appCompatViewInflater;
                }
            }
            this.S = appCompatViewInflater;
        }
        boolean z2 = T;
        if (z2) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zP0 = p0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zP0 = true;
            }
        }
        return this.S.p(view, str, context, attributeSet, zP0, z2, true, w0.b());
    }

    void G() {
        android.support.v7.view.menu.e eVar;
        a0 a0Var = this.f822k;
        if (a0Var != null) {
            a0Var.i();
        }
        if (this.f827p != null) {
            this.f815d.getDecorView().removeCallbacks(this.f828q);
            if (this.f827p.isShowing()) {
                try {
                    this.f827p.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f827p = null;
        }
        J();
        k kVarP = P(0, false);
        if (kVarP == null || (eVar = kVarP.f865j) == null) {
            return;
        }
        eVar.close();
    }

    boolean H(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.f816e;
        if (((callback instanceof g0.e.a) || (callback instanceof i0.c)) && (decorView = this.f815d.getDecorView()) != null && g0.e.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f816e.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? a0(keyCode, keyEvent) : d0(keyCode, keyEvent);
    }

    void I(int i2) {
        k kVarP;
        k kVarP2 = P(i2, true);
        if (kVarP2.f865j != null) {
            Bundle bundle = new Bundle();
            kVarP2.f865j.Q(bundle);
            if (bundle.size() > 0) {
                kVarP2.f874s = bundle;
            }
            kVarP2.f865j.d0();
            kVarP2.f865j.clear();
        }
        kVarP2.f873r = true;
        kVarP2.f872q = true;
        if ((i2 != 108 && i2 != 0) || this.f822k == null || (kVarP = P(0, false)) == null) {
            return;
        }
        kVarP.f868m = false;
        l0(kVarP, null);
    }

    void J() {
        q qVar = this.f829r;
        if (qVar != null) {
            qVar.b();
        }
    }

    k M(Menu menu) {
        k[] kVarArr = this.F;
        int length = kVarArr != null ? kVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            k kVar = kVarArr[i2];
            if (kVar != null && kVar.f865j == menu) {
                return kVar;
            }
        }
        return null;
    }

    final Context N() {
        android.support.v7.app.a aVarJ = j();
        Context contextJ = aVarJ != null ? aVarJ.j() : null;
        return contextJ == null ? this.f814c : contextJ;
    }

    protected k P(int i2, boolean z2) {
        k[] kVarArr = this.F;
        if (kVarArr == null || kVarArr.length <= i2) {
            k[] kVarArr2 = new k[i2 + 1];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.F = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i2];
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(i2);
        kVarArr[i2] = kVar2;
        return kVar2;
    }

    final CharSequence Q() {
        Window.Callback callback = this.f816e;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f821j;
    }

    final Window.Callback R() {
        return this.f815d.getCallback();
    }

    public boolean X() {
        return this.f830s;
    }

    int Y(int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != 0) {
            return i2;
        }
        if (((UiModeManager) this.f814c.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        K();
        return this.L.c();
    }

    boolean Z() {
        m0.b bVar = this.f825n;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        android.support.v7.app.a aVarJ = j();
        return aVarJ != null && aVarJ.g();
    }

    @Override // android.support.v7.view.menu.e.a
    public void a(android.support.v7.view.menu.e eVar) {
        m0(eVar, true);
    }

    boolean a0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.H = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            b0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.e.a
    public boolean b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        k kVarM;
        Window.Callback callbackR = R();
        if (callbackR == null || this.I || (kVarM = M(eVar.D())) == null) {
            return false;
        }
        return callbackR.onMenuItemSelected(kVarM.f856a, menuItem);
    }

    @Override // android.support.v7.app.c
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ((ViewGroup) this.f832u.findViewById(R.id.content)).addView(view, layoutParams);
        this.f816e.onContentChanged();
    }

    boolean c0(int i2, KeyEvent keyEvent) {
        android.support.v7.app.a aVarJ = j();
        if (aVarJ != null && aVarJ.n(i2, keyEvent)) {
            return true;
        }
        k kVar = this.G;
        if (kVar != null && k0(kVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            k kVar2 = this.G;
            if (kVar2 != null) {
                kVar2.f869n = true;
            }
            return true;
        }
        if (this.G == null) {
            k kVarP = P(0, true);
            l0(kVarP, keyEvent);
            boolean zK0 = k0(kVarP, keyEvent.getKeyCode(), keyEvent, 1);
            kVarP.f868m = false;
            if (zK0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.app.c
    public boolean d() {
        int iO = O();
        int iY = Y(iO);
        boolean zU0 = iY != -1 ? u0(iY) : false;
        if (iO == 0) {
            K();
            this.L.d();
        }
        this.K = true;
        return zU0;
    }

    boolean d0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.H;
            this.H = false;
            k kVarP = P(0, false);
            if (kVarP != null && kVarP.f870o) {
                if (!z2) {
                    D(kVarP, true);
                }
                return true;
            }
            if (Z()) {
                return true;
            }
        } else if (i2 == 82) {
            e0(0, keyEvent);
            return true;
        }
        return false;
    }

    void f0(int i2) {
        android.support.v7.app.a aVarJ;
        if (i2 != 108 || (aVarJ = j()) == null) {
            return;
        }
        aVarJ.h(true);
    }

    @Override // android.support.v7.app.c
    public <T extends View> T g(int i2) {
        L();
        return (T) this.f815d.findViewById(i2);
    }

    void g0(int i2) {
        if (i2 == 108) {
            android.support.v7.app.a aVarJ = j();
            if (aVarJ != null) {
                aVarJ.h(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            k kVarP = P(i2, true);
            if (kVarP.f870o) {
                D(kVarP, false);
            }
        }
    }

    void h0(ViewGroup viewGroup) {
    }

    @Override // android.support.v7.app.c
    public MenuInflater i() {
        if (this.f820i == null) {
            S();
            android.support.v7.app.a aVar = this.f819h;
            this.f820i = new m0.g(aVar != null ? aVar.j() : this.f814c);
        }
        return this.f820i;
    }

    @Override // android.support.v7.app.c
    public android.support.v7.app.a j() {
        S();
        return this.f819h;
    }

    final android.support.v7.app.a j0() {
        return this.f819h;
    }

    @Override // android.support.v7.app.c
    public void k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f814c);
        if (layoutInflaterFrom.getFactory() == null) {
            g0.f.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof d) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.support.v7.app.c
    public void l() {
        android.support.v7.app.a aVarJ = j();
        if (aVarJ == null || !aVarJ.k()) {
            W(0);
        }
    }

    @Override // android.support.v7.app.c
    public void m(Configuration configuration) {
        android.support.v7.app.a aVarJ;
        if (this.f837z && this.f831t && (aVarJ = j()) != null) {
            aVarJ.l(configuration);
        }
        android.support.v7.widget.j.m().x(this.f814c);
        d();
    }

    @Override // android.support.v7.app.c
    public void n(Bundle bundle) {
        String strC;
        Window.Callback callback = this.f816e;
        if (callback instanceof Activity) {
            try {
                strC = t.c((Activity) callback);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                android.support.v7.app.a aVarJ0 = j0();
                if (aVarJ0 == null) {
                    this.P = true;
                } else {
                    aVarJ0.q(true);
                }
            }
        }
        if (bundle == null || this.J != -100) {
            return;
        }
        this.J = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // android.support.v7.app.c
    public void o() {
        if (this.M) {
            this.f815d.getDecorView().removeCallbacks(this.O);
        }
        this.I = true;
        android.support.v7.app.a aVar = this.f819h;
        if (aVar != null) {
            aVar.m();
        }
        i iVar = this.L;
        if (iVar != null) {
            iVar.a();
        }
    }

    final boolean o0() {
        ViewGroup viewGroup;
        return this.f831t && (viewGroup = this.f832u) != null && m.l(viewGroup);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return F(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.support.v7.app.c
    public void p(Bundle bundle) {
        L();
    }

    @Override // android.support.v7.app.c
    public void q() {
        android.support.v7.app.a aVarJ = j();
        if (aVarJ != null) {
            aVarJ.r(true);
        }
    }

    @Override // android.support.v7.app.c
    public void r(Bundle bundle) {
        int i2 = this.J;
        if (i2 != -100) {
            bundle.putInt("appcompat:local_night_mode", i2);
        }
    }

    public m0.b r0(m0.b.a aVar) {
        i0.b bVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        m0.b bVar2 = this.f825n;
        if (bVar2 != null) {
            bVar2.c();
        }
        g gVar = new g(aVar);
        android.support.v7.app.a aVarJ = j();
        if (aVarJ != null) {
            m0.b bVarT = aVarJ.t(gVar);
            this.f825n = bVarT;
            if (bVarT != null && (bVar = this.f818g) != null) {
                bVar.c(bVarT);
            }
        }
        if (this.f825n == null) {
            this.f825n = s0(gVar);
        }
        return this.f825n;
    }

    @Override // android.support.v7.app.c
    public void s() {
        d();
    }

    m0.b s0(m0.b.a aVar) {
        m0.b bVarH;
        Context dVar;
        i0.b bVar;
        J();
        m0.b bVar2 = this.f825n;
        if (bVar2 != null) {
            bVar2.c();
        }
        if (!(aVar instanceof g)) {
            aVar = new g(aVar);
        }
        i0.b bVar3 = this.f818g;
        if (bVar3 == null || this.I) {
            bVarH = null;
        } else {
            try {
                bVarH = bVar3.h(aVar);
            } catch (AbstractMethodError unused) {
                bVarH = null;
            }
        }
        if (bVarH != null) {
            this.f825n = bVarH;
        } else {
            if (this.f826o == null) {
                if (this.C) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f814c.getTheme();
                    theme.resolveAttribute(j0.a.f3029f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f814c.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new m0.d(this.f814c, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f814c;
                    }
                    this.f826o = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, j0.a.f3032i);
                    this.f827p = popupWindow;
                    android.support.v4.widget.j.b(popupWindow, 2);
                    this.f827p.setContentView(this.f826o);
                    this.f827p.setWidth(-1);
                    dVar.getTheme().resolveAttribute(j0.a.f3025b, typedValue, true);
                    this.f826o.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f827p.setHeight(-2);
                    this.f828q = new RunnableC0008d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f832u.findViewById(j0.f.f3099h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(N()));
                        this.f826o = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f826o != null) {
                J();
                this.f826o.k();
                m0.e eVar = new m0.e(this.f826o.getContext(), this.f826o, aVar, this.f827p == null);
                if (aVar.d(eVar, eVar.e())) {
                    eVar.k();
                    this.f826o.h(eVar);
                    this.f825n = eVar;
                    if (o0()) {
                        this.f826o.setAlpha(0.0f);
                        q qVarA = m.a(this.f826o).a(1.0f);
                        this.f829r = qVarA;
                        qVarA.f(new e());
                    } else {
                        this.f826o.setAlpha(1.0f);
                        this.f826o.setVisibility(0);
                        this.f826o.sendAccessibilityEvent(32);
                        if (this.f826o.getParent() instanceof View) {
                            m.q((View) this.f826o.getParent());
                        }
                    }
                    if (this.f827p != null) {
                        this.f815d.getDecorView().post(this.f828q);
                    }
                } else {
                    this.f825n = null;
                }
            }
        }
        m0.b bVar4 = this.f825n;
        if (bVar4 != null && (bVar = this.f818g) != null) {
            bVar.c(bVar4);
        }
        return this.f825n;
    }

    @Override // android.support.v7.app.c
    public void t() {
        android.support.v7.app.a aVarJ = j();
        if (aVarJ != null) {
            aVarJ.r(false);
        }
        i iVar = this.L;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // android.support.v7.app.c
    public boolean u(int i2) {
        int iN0 = n0(i2);
        if (this.D && iN0 == 108) {
            return false;
        }
        if (this.f837z && iN0 == 1) {
            this.f837z = false;
        }
        if (iN0 == 1) {
            t0();
            this.D = true;
            return true;
        }
        if (iN0 == 2) {
            t0();
            this.f835x = true;
            return true;
        }
        if (iN0 == 5) {
            t0();
            this.f836y = true;
            return true;
        }
        if (iN0 == 10) {
            t0();
            this.B = true;
            return true;
        }
        if (iN0 == 108) {
            t0();
            this.f837z = true;
            return true;
        }
        if (iN0 != 109) {
            return this.f815d.requestFeature(iN0);
        }
        t0();
        this.A = true;
        return true;
    }

    @Override // android.support.v7.app.c
    public void v(int i2) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.f832u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f814c).inflate(i2, viewGroup);
        this.f816e.onContentChanged();
    }

    int v0(int i2) {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f826o;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f826o.getLayoutParams();
            boolean z4 = true;
            if (this.f826o.isShown()) {
                if (this.Q == null) {
                    this.Q = new Rect();
                    this.R = new Rect();
                }
                Rect rect = this.Q;
                Rect rect2 = this.R;
                rect.set(0, i2, 0, 0);
                x0.a(this.f832u, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.f834w;
                    if (view == null) {
                        View view2 = new View(this.f814c);
                        this.f834w = view2;
                        view2.setBackgroundColor(this.f814c.getResources().getColor(j0.c.f3051a));
                        this.f832u.addView(this.f834w, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.f834w.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = this.f834w != null;
                if (!this.B && z4) {
                    i2 = 0;
                }
                boolean z5 = z4;
                z4 = z3;
                z2 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.f826o.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f834w;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        return i2;
    }

    @Override // android.support.v7.app.c
    public void w(View view) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.f832u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f816e.onContentChanged();
    }

    @Override // android.support.v7.app.c
    public void x(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.f832u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f816e.onContentChanged();
    }

    @Override // android.support.v7.app.c
    public final void y(CharSequence charSequence) {
        this.f821j = charSequence;
        a0 a0Var = this.f822k;
        if (a0Var != null) {
            a0Var.setWindowTitle(charSequence);
            return;
        }
        if (j0() != null) {
            j0().s(charSequence);
            return;
        }
        TextView textView = this.f833v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
