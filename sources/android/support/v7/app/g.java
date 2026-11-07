package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.b0;
import android.support.v7.widget.m0;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import g0.m;
import g0.q;
import g0.r;
import g0.s;
import g0.t;
import j0.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m0.h;

/* JADX INFO: loaded from: classes.dex */
public class g extends android.support.v7.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator F = new AccelerateInterpolator();
    private static final Interpolator G = new DecelerateInterpolator();
    private boolean A;
    boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Dialog f893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarOverlayLayout f894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ActionBarContainer f895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    b0 f896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ActionBarContextView f897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    m0 f899j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    d f903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    m0.b f904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    m0.b.a f905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f906q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f908s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f913x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    h f915z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<Object> f900k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f901l = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<android.support.v7.app.a.b> f907r = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f909t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f910u = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f914y = true;
    final r C = new a();
    final r D = new b();
    final t E = new c();

    class a extends s {
        a() {
        }

        @Override // g0.r
        public void a(View view) {
            View view2;
            g gVar = g.this;
            if (gVar.f910u && (view2 = gVar.f898i) != null) {
                view2.setTranslationY(0.0f);
                g.this.f895f.setTranslationY(0.0f);
            }
            g.this.f895f.setVisibility(8);
            g.this.f895f.setTransitioning(false);
            g gVar2 = g.this;
            gVar2.f915z = null;
            gVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = g.this.f894e;
            if (actionBarOverlayLayout != null) {
                m.q(actionBarOverlayLayout);
            }
        }
    }

    class b extends s {
        b() {
        }

        @Override // g0.r
        public void a(View view) {
            g gVar = g.this;
            gVar.f915z = null;
            gVar.f895f.requestLayout();
        }
    }

    class c implements t {
        c() {
        }

        @Override // g0.t
        public void a(View view) {
            ((View) g.this.f895f.getParent()).invalidate();
        }
    }

    public class d extends m0.b implements android.support.v7.view.menu.e.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final android.support.v7.view.menu.e f920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private m0.b.a f921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private WeakReference<View> f922g;

        public d(Context context, m0.b.a aVar) {
            this.f919d = context;
            this.f921f = aVar;
            android.support.v7.view.menu.e eVarS = new android.support.v7.view.menu.e(context).S(1);
            this.f920e = eVarS;
            eVarS.R(this);
        }

        @Override // android.support.v7.view.menu.e.a
        public void a(android.support.v7.view.menu.e eVar) {
            if (this.f921f == null) {
                return;
            }
            k();
            g.this.f897h.l();
        }

        @Override // android.support.v7.view.menu.e.a
        public boolean b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
            m0.b.a aVar = this.f921f;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // m0.b
        public void c() {
            g gVar = g.this;
            if (gVar.f903n != this) {
                return;
            }
            if (g.v(gVar.f911v, gVar.f912w, false)) {
                this.f921f.b(this);
            } else {
                g gVar2 = g.this;
                gVar2.f904o = this;
                gVar2.f905p = this.f921f;
            }
            this.f921f = null;
            g.this.u(false);
            g.this.f897h.g();
            g.this.f896g.l().sendAccessibilityEvent(32);
            g gVar3 = g.this;
            gVar3.f894e.setHideOnContentScrollEnabled(gVar3.B);
            g.this.f903n = null;
        }

        @Override // m0.b
        public View d() {
            WeakReference<View> weakReference = this.f922g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // m0.b
        public Menu e() {
            return this.f920e;
        }

        @Override // m0.b
        public MenuInflater f() {
            return new m0.g(this.f919d);
        }

        @Override // m0.b
        public CharSequence g() {
            return g.this.f897h.getSubtitle();
        }

        @Override // m0.b
        public CharSequence i() {
            return g.this.f897h.getTitle();
        }

        @Override // m0.b
        public void k() {
            if (g.this.f903n != this) {
                return;
            }
            this.f920e.d0();
            try {
                this.f921f.a(this, this.f920e);
            } finally {
                this.f920e.c0();
            }
        }

        @Override // m0.b
        public boolean l() {
            return g.this.f897h.j();
        }

        @Override // m0.b
        public void m(View view) {
            g.this.f897h.setCustomView(view);
            this.f922g = new WeakReference<>(view);
        }

        @Override // m0.b
        public void n(int i2) {
            o(g.this.f890a.getResources().getString(i2));
        }

        @Override // m0.b
        public void o(CharSequence charSequence) {
            g.this.f897h.setSubtitle(charSequence);
        }

        @Override // m0.b
        public void q(int i2) {
            r(g.this.f890a.getResources().getString(i2));
        }

        @Override // m0.b
        public void r(CharSequence charSequence) {
            g.this.f897h.setTitle(charSequence);
        }

        @Override // m0.b
        public void s(boolean z2) {
            super.s(z2);
            g.this.f897h.setTitleOptional(z2);
        }

        public boolean t() {
            this.f920e.d0();
            try {
                return this.f921f.d(this, this.f920e);
            } finally {
                this.f920e.c0();
            }
        }
    }

    public g(Activity activity, boolean z2) {
        this.f892c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z2) {
            return;
        }
        this.f898i = decorView.findViewById(R.id.content);
    }

    public g(Dialog dialog) {
        this.f893d = dialog;
        C(dialog.getWindow().getDecorView());
    }

    private void B() {
        if (this.f913x) {
            this.f913x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f894e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    private void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(j0.f.f3107p);
        this.f894e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f896g = z(view.findViewById(j0.f.f3092a));
        this.f897h = (ActionBarContextView) view.findViewById(j0.f.f3097f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(j0.f.f3094c);
        this.f895f = actionBarContainer;
        b0 b0Var = this.f896g;
        if (b0Var == null || this.f897h == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f890a = b0Var.n();
        boolean z2 = (this.f896g.i() & 4) != 0;
        if (z2) {
            this.f902m = true;
        }
        m0.a aVarB = m0.a.b(this.f890a);
        I(aVarB.a() || z2);
        G(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f890a.obtainStyledAttributes(null, j.f3151a, j0.a.f3026c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(j.f3178k, false)) {
            H(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f3174i, 0);
        if (dimensionPixelSize != 0) {
            F(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void G(boolean z2) {
        this.f908s = z2;
        if (z2) {
            this.f895f.setTabContainer(null);
            this.f896g.p(this.f899j);
        } else {
            this.f896g.p(null);
            this.f895f.setTabContainer(this.f899j);
        }
        boolean z3 = A() == 2;
        m0 m0Var = this.f899j;
        if (m0Var != null) {
            if (z3) {
                m0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f894e;
                if (actionBarOverlayLayout != null) {
                    m.q(actionBarOverlayLayout);
                }
            } else {
                m0Var.setVisibility(8);
            }
        }
        this.f896g.u(!this.f908s && z3);
        this.f894e.setHasNonEmbeddedTabs(!this.f908s && z3);
    }

    private boolean J() {
        return m.l(this.f895f);
    }

    private void K() {
        if (this.f913x) {
            return;
        }
        this.f913x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f894e;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        L(false);
    }

    private void L(boolean z2) {
        if (v(this.f911v, this.f912w, this.f913x)) {
            if (this.f914y) {
                return;
            }
            this.f914y = true;
            y(z2);
            return;
        }
        if (this.f914y) {
            this.f914y = false;
            x(z2);
        }
    }

    static boolean v(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b0 z(View view) {
        if (view instanceof b0) {
            return (b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int A() {
        return this.f896g.o();
    }

    public void D(boolean z2) {
        E(z2 ? 4 : 0, 4);
    }

    public void E(int i2, int i3) {
        int i4 = this.f896g.i();
        if ((i3 & 4) != 0) {
            this.f902m = true;
        }
        this.f896g.v((i2 & i3) | ((~i3) & i4));
    }

    public void F(float f2) {
        m.v(this.f895f, f2);
    }

    public void H(boolean z2) {
        if (z2 && !this.f894e.q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z2;
        this.f894e.setHideOnContentScrollEnabled(z2);
    }

    public void I(boolean z2) {
        this.f896g.m(z2);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void a(boolean z2) {
        this.f910u = z2;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void b() {
        if (this.f912w) {
            this.f912w = false;
            L(true);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void c() {
        h hVar = this.f915z;
        if (hVar != null) {
            hVar.a();
            this.f915z = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f912w) {
            return;
        }
        this.f912w = true;
        L(true);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void e() {
    }

    @Override // android.support.v7.app.a
    public boolean g() {
        b0 b0Var = this.f896g;
        if (b0Var == null || !b0Var.s()) {
            return false;
        }
        this.f896g.collapseActionView();
        return true;
    }

    @Override // android.support.v7.app.a
    public void h(boolean z2) {
        if (z2 == this.f906q) {
            return;
        }
        this.f906q = z2;
        int size = this.f907r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f907r.get(i2).a(z2);
        }
    }

    @Override // android.support.v7.app.a
    public int i() {
        return this.f896g.i();
    }

    @Override // android.support.v7.app.a
    public Context j() {
        if (this.f891b == null) {
            TypedValue typedValue = new TypedValue();
            this.f890a.getTheme().resolveAttribute(j0.a.f3030g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f891b = new ContextThemeWrapper(this.f890a, i2);
            } else {
                this.f891b = this.f890a;
            }
        }
        return this.f891b;
    }

    @Override // android.support.v7.app.a
    public void l(Configuration configuration) {
        G(m0.a.b(this.f890a).g());
    }

    @Override // android.support.v7.app.a
    public boolean n(int i2, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f903n;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i2, keyEvent, 0);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i2) {
        this.f909t = i2;
    }

    @Override // android.support.v7.app.a
    public void q(boolean z2) {
        if (this.f902m) {
            return;
        }
        D(z2);
    }

    @Override // android.support.v7.app.a
    public void r(boolean z2) {
        h hVar;
        this.A = z2;
        if (z2 || (hVar = this.f915z) == null) {
            return;
        }
        hVar.a();
    }

    @Override // android.support.v7.app.a
    public void s(CharSequence charSequence) {
        this.f896g.setWindowTitle(charSequence);
    }

    @Override // android.support.v7.app.a
    public m0.b t(m0.b.a aVar) {
        d dVar = this.f903n;
        if (dVar != null) {
            dVar.c();
        }
        this.f894e.setHideOnContentScrollEnabled(false);
        this.f897h.k();
        d dVar2 = new d(this.f897h.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f903n = dVar2;
        dVar2.k();
        this.f897h.h(dVar2);
        u(true);
        this.f897h.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void u(boolean z2) {
        q qVarF;
        q qVarF2;
        if (z2) {
            K();
        } else {
            B();
        }
        if (!J()) {
            if (z2) {
                this.f896g.j(4);
                this.f897h.setVisibility(0);
                return;
            } else {
                this.f896g.j(0);
                this.f897h.setVisibility(8);
                return;
            }
        }
        if (z2) {
            qVarF = this.f896g.q(4, 100L);
            qVarF2 = this.f897h.f(0, 200L);
        } else {
            q qVarQ = this.f896g.q(0, 200L);
            qVarF = this.f897h.f(8, 100L);
            qVarF2 = qVarQ;
        }
        h hVar = new h();
        hVar.d(qVarF, qVarF2);
        hVar.h();
    }

    void w() {
        m0.b.a aVar = this.f905p;
        if (aVar != null) {
            aVar.b(this.f904o);
            this.f904o = null;
            this.f905p = null;
        }
    }

    public void x(boolean z2) {
        View view;
        h hVar = this.f915z;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f909t != 0 || (!this.A && !z2)) {
            this.C.a(null);
            return;
        }
        this.f895f.setAlpha(1.0f);
        this.f895f.setTransitioning(true);
        h hVar2 = new h();
        float f2 = -this.f895f.getHeight();
        if (z2) {
            int[] iArr = {0, 0};
            this.f895f.getLocationInWindow(iArr);
            f2 -= iArr[1];
        }
        q qVarK = m.a(this.f895f).k(f2);
        qVarK.i(this.E);
        hVar2.c(qVarK);
        if (this.f910u && (view = this.f898i) != null) {
            hVar2.c(m.a(view).k(f2));
        }
        hVar2.f(F);
        hVar2.e(250L);
        hVar2.g(this.C);
        this.f915z = hVar2;
        hVar2.h();
    }

    public void y(boolean z2) {
        View view;
        View view2;
        h hVar = this.f915z;
        if (hVar != null) {
            hVar.a();
        }
        this.f895f.setVisibility(0);
        if (this.f909t == 0 && (this.A || z2)) {
            this.f895f.setTranslationY(0.0f);
            float f2 = -this.f895f.getHeight();
            if (z2) {
                int[] iArr = {0, 0};
                this.f895f.getLocationInWindow(iArr);
                f2 -= iArr[1];
            }
            this.f895f.setTranslationY(f2);
            h hVar2 = new h();
            q qVarK = m.a(this.f895f).k(0.0f);
            qVarK.i(this.E);
            hVar2.c(qVarK);
            if (this.f910u && (view2 = this.f898i) != null) {
                view2.setTranslationY(f2);
                hVar2.c(m.a(this.f898i).k(0.0f));
            }
            hVar2.f(G);
            hVar2.e(250L);
            hVar2.g(this.D);
            this.f915z = hVar2;
            hVar2.h();
        } else {
            this.f895f.setAlpha(1.0f);
            this.f895f.setTranslationY(0.0f);
            if (this.f910u && (view = this.f898i) != null) {
                view.setTranslationY(0.0f);
            }
            this.D.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f894e;
        if (actionBarOverlayLayout != null) {
            m.q(actionBarOverlayLayout);
        }
    }
}
