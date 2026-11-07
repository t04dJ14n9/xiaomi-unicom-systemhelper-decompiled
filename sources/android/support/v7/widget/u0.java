package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class u0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f1528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f1534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f1536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f1537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f1538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f1539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f1540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f1541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f1544q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n0.a f1545b;

        a() {
            this.f1545b = new n0.a(u0.this.f1528a.getContext(), 0, R.id.home, 0, 0, u0.this.f1536i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u0 u0Var = u0.this;
            Window.Callback callback = u0Var.f1539l;
            if (callback == null || !u0Var.f1540m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1545b);
        }
    }

    class b extends g0.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1547a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1548b;

        b(int i2) {
            this.f1548b = i2;
        }

        @Override // g0.r
        public void a(View view) {
            if (this.f1547a) {
                return;
            }
            u0.this.f1528a.setVisibility(this.f1548b);
        }

        @Override // g0.s, g0.r
        public void b(View view) {
            u0.this.f1528a.setVisibility(0);
        }

        @Override // g0.s, g0.r
        public void c(View view) {
            this.f1547a = true;
        }
    }

    public u0(Toolbar toolbar, boolean z2) {
        this(toolbar, z2, j0.h.f3137a, j0.e.f3077l);
    }

    public u0(Toolbar toolbar, boolean z2, int i2, int i3) {
        Drawable drawable;
        this.f1542o = 0;
        this.f1543p = 0;
        this.f1528a = toolbar;
        this.f1536i = toolbar.getTitle();
        this.f1537j = toolbar.getSubtitle();
        this.f1535h = this.f1536i != null;
        this.f1534g = toolbar.getNavigationIcon();
        t0 t0VarT = t0.t(toolbar.getContext(), null, j0.j.f3151a, j0.a.f3026c, 0);
        this.f1544q = t0VarT.f(j0.j.f3180l);
        if (z2) {
            CharSequence charSequenceO = t0VarT.o(j0.j.f3192r);
            if (!TextUtils.isEmpty(charSequenceO)) {
                E(charSequenceO);
            }
            CharSequence charSequenceO2 = t0VarT.o(j0.j.f3188p);
            if (!TextUtils.isEmpty(charSequenceO2)) {
                D(charSequenceO2);
            }
            Drawable drawableF = t0VarT.f(j0.j.f3184n);
            if (drawableF != null) {
                z(drawableF);
            }
            Drawable drawableF2 = t0VarT.f(j0.j.f3182m);
            if (drawableF2 != null) {
                setIcon(drawableF2);
            }
            if (this.f1534g == null && (drawable = this.f1544q) != null) {
                C(drawable);
            }
            v(t0VarT.j(j0.j.f3172h, 0));
            int iM = t0VarT.m(j0.j.f3169g, 0);
            if (iM != 0) {
                x(LayoutInflater.from(this.f1528a.getContext()).inflate(iM, (ViewGroup) this.f1528a, false));
                v(this.f1529b | 16);
            }
            int iL = t0VarT.l(j0.j.f3176j, 0);
            if (iL > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1528a.getLayoutParams();
                layoutParams.height = iL;
                this.f1528a.setLayoutParams(layoutParams);
            }
            int iD = t0VarT.d(j0.j.f3166f, -1);
            int iD2 = t0VarT.d(j0.j.f3163e, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.f1528a.G(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iM2 = t0VarT.m(j0.j.f3194s, 0);
            if (iM2 != 0) {
                Toolbar toolbar2 = this.f1528a;
                toolbar2.J(toolbar2.getContext(), iM2);
            }
            int iM3 = t0VarT.m(j0.j.f3190q, 0);
            if (iM3 != 0) {
                Toolbar toolbar3 = this.f1528a;
                toolbar3.I(toolbar3.getContext(), iM3);
            }
            int iM4 = t0VarT.m(j0.j.f3186o, 0);
            if (iM4 != 0) {
                this.f1528a.setPopupTheme(iM4);
            }
        } else {
            this.f1529b = w();
        }
        t0VarT.u();
        y(i2);
        this.f1538k = this.f1528a.getNavigationContentDescription();
        this.f1528a.setNavigationOnClickListener(new a());
    }

    private void F(CharSequence charSequence) {
        this.f1536i = charSequence;
        if ((this.f1529b & 8) != 0) {
            this.f1528a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.f1529b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1538k)) {
                this.f1528a.setNavigationContentDescription(this.f1543p);
            } else {
                this.f1528a.setNavigationContentDescription(this.f1538k);
            }
        }
    }

    private void H() {
        if ((this.f1529b & 4) == 0) {
            this.f1528a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1528a;
        Drawable drawable = this.f1534g;
        if (drawable == null) {
            drawable = this.f1544q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i2 = this.f1529b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f1533f) == null) {
            drawable = this.f1532e;
        }
        this.f1528a.setLogo(drawable);
    }

    private int w() {
        if (this.f1528a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1544q = this.f1528a.getNavigationIcon();
        return 15;
    }

    public void A(int i2) {
        B(i2 == 0 ? null : n().getString(i2));
    }

    public void B(CharSequence charSequence) {
        this.f1538k = charSequence;
        G();
    }

    public void C(Drawable drawable) {
        this.f1534g = drawable;
        H();
    }

    public void D(CharSequence charSequence) {
        this.f1537j = charSequence;
        if ((this.f1529b & 8) != 0) {
            this.f1528a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.f1535h = true;
        F(charSequence);
    }

    @Override // android.support.v7.widget.b0
    public boolean a() {
        return this.f1528a.y();
    }

    @Override // android.support.v7.widget.b0
    public boolean b() {
        return this.f1528a.z();
    }

    @Override // android.support.v7.widget.b0
    public void c(Menu menu, android.support.v7.view.menu.j.a aVar) {
        if (this.f1541n == null) {
            c cVar = new c(this.f1528a.getContext());
            this.f1541n = cVar;
            cVar.p(j0.f.f3098g);
        }
        this.f1541n.f(aVar);
        this.f1528a.H((android.support.v7.view.menu.e) menu, this.f1541n);
    }

    @Override // android.support.v7.widget.b0
    public void collapseActionView() {
        this.f1528a.e();
    }

    @Override // android.support.v7.widget.b0
    public boolean d() {
        return this.f1528a.w();
    }

    @Override // android.support.v7.widget.b0
    public boolean e() {
        return this.f1528a.M();
    }

    @Override // android.support.v7.widget.b0
    public void f() {
        this.f1540m = true;
    }

    @Override // android.support.v7.widget.b0
    public boolean g() {
        return this.f1528a.d();
    }

    @Override // android.support.v7.widget.b0
    public CharSequence getTitle() {
        return this.f1528a.getTitle();
    }

    @Override // android.support.v7.widget.b0
    public void h() {
        this.f1528a.f();
    }

    @Override // android.support.v7.widget.b0
    public int i() {
        return this.f1529b;
    }

    @Override // android.support.v7.widget.b0
    public void j(int i2) {
        this.f1528a.setVisibility(i2);
    }

    @Override // android.support.v7.widget.b0
    public void k(int i2) {
        z(i2 != 0 ? k0.a.b(n(), i2) : null);
    }

    @Override // android.support.v7.widget.b0
    public ViewGroup l() {
        return this.f1528a;
    }

    @Override // android.support.v7.widget.b0
    public void m(boolean z2) {
    }

    @Override // android.support.v7.widget.b0
    public Context n() {
        return this.f1528a.getContext();
    }

    @Override // android.support.v7.widget.b0
    public int o() {
        return this.f1542o;
    }

    @Override // android.support.v7.widget.b0
    public void p(m0 m0Var) {
        View view = this.f1530c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1528a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1530c);
            }
        }
        this.f1530c = m0Var;
        if (m0Var == null || this.f1542o != 2) {
            return;
        }
        this.f1528a.addView(m0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1530c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f809a = 8388691;
        m0Var.setAllowCollapse(true);
    }

    @Override // android.support.v7.widget.b0
    public g0.q q(int i2, long j2) {
        return g0.m.a(this.f1528a).a(i2 == 0 ? 1.0f : 0.0f).d(j2).f(new b(i2));
    }

    @Override // android.support.v7.widget.b0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.b0
    public boolean s() {
        return this.f1528a.v();
    }

    @Override // android.support.v7.widget.b0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? k0.a.b(n(), i2) : null);
    }

    @Override // android.support.v7.widget.b0
    public void setIcon(Drawable drawable) {
        this.f1532e = drawable;
        I();
    }

    @Override // android.support.v7.widget.b0
    public void setWindowCallback(Window.Callback callback) {
        this.f1539l = callback;
    }

    @Override // android.support.v7.widget.b0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1535h) {
            return;
        }
        F(charSequence);
    }

    @Override // android.support.v7.widget.b0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.b0
    public void u(boolean z2) {
        this.f1528a.setCollapsible(z2);
    }

    @Override // android.support.v7.widget.b0
    public void v(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f1529b ^ i2;
        this.f1529b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i3 & 3) != 0) {
                I();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f1528a.setTitle(this.f1536i);
                    toolbar = this.f1528a;
                    charSequence = this.f1537j;
                } else {
                    charSequence = null;
                    this.f1528a.setTitle((CharSequence) null);
                    toolbar = this.f1528a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) == 0 || (view = this.f1531d) == null) {
                return;
            }
            int i4 = i2 & 16;
            Toolbar toolbar2 = this.f1528a;
            if (i4 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public void x(View view) {
        View view2 = this.f1531d;
        if (view2 != null && (this.f1529b & 16) != 0) {
            this.f1528a.removeView(view2);
        }
        this.f1531d = view;
        if (view == null || (this.f1529b & 16) == 0) {
            return;
        }
        this.f1528a.addView(view);
    }

    public void y(int i2) {
        if (i2 == this.f1543p) {
            return;
        }
        this.f1543p = i2;
        if (TextUtils.isEmpty(this.f1528a.getNavigationContentDescription())) {
            A(this.f1543p);
        }
    }

    public void z(Drawable drawable) {
        this.f1533f = drawable;
        I();
    }
}
