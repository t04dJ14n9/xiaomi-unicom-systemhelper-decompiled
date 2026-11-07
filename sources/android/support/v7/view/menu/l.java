package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.j0;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f1089w = j0.g.f3130m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f1091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f1092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final j0 f1097j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f1101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    View f1102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j.a f1103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ViewTreeObserver f1104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1107t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1109v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1098k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1099l = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1108u = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.h() || l.this.f1097j.p()) {
                return;
            }
            View view = l.this.f1102o;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f1097j.c();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1104q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1104q = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1104q.removeGlobalOnLayoutListener(lVar.f1098k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i2, int i3, boolean z2) {
        this.f1090c = context;
        this.f1091d = eVar;
        this.f1093f = z2;
        this.f1092e = new d(eVar, LayoutInflater.from(context), z2, f1089w);
        this.f1095h = i2;
        this.f1096i = i3;
        Resources resources = context.getResources();
        this.f1094g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(j0.d.f3061d));
        this.f1101n = view;
        this.f1097j = new j0(context, null, i2, i3);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (h()) {
            return true;
        }
        if (this.f1105r || (view = this.f1101n) == null) {
            return false;
        }
        this.f1102o = view;
        this.f1097j.B(this);
        this.f1097j.C(this);
        this.f1097j.A(true);
        View view2 = this.f1102o;
        boolean z2 = this.f1104q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1104q = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1098k);
        }
        view2.addOnAttachStateChangeListener(this.f1099l);
        this.f1097j.s(view2);
        this.f1097j.w(this.f1108u);
        if (!this.f1106s) {
            this.f1107t = h.o(this.f1092e, null, this.f1090c, this.f1094g);
            this.f1106s = true;
        }
        this.f1097j.v(this.f1107t);
        this.f1097j.z(2);
        this.f1097j.x(n());
        this.f1097j.c();
        ListView listViewI = this.f1097j.i();
        listViewI.setOnKeyListener(this);
        if (this.f1109v && this.f1091d.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1090c).inflate(j0.g.f3129l, (ViewGroup) listViewI, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1091d.x());
            }
            frameLayout.setEnabled(false);
            listViewI.addHeaderView(frameLayout, null, false);
        }
        this.f1097j.r(this.f1092e);
        this.f1097j.c();
        return true;
    }

    @Override // android.support.v7.view.menu.j
    public void a(e eVar, boolean z2) {
        if (eVar != this.f1091d) {
            return;
        }
        dismiss();
        j.a aVar = this.f1103p;
        if (aVar != null) {
            aVar.a(eVar, z2);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean b(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f1090c, mVar, this.f1102o, this.f1093f, this.f1095h, this.f1096i);
            iVar.j(this.f1103p);
            iVar.g(h.x(mVar));
            iVar.i(this.f1100m);
            this.f1100m = null;
            this.f1091d.e(false);
            int iK = this.f1097j.k();
            int iM = this.f1097j.m();
            if ((Gravity.getAbsoluteGravity(this.f1108u, g0.m.e(this.f1101n)) & 7) == 5) {
                iK += this.f1101n.getWidth();
            }
            if (iVar.n(iK, iM)) {
                j.a aVar = this.f1103p;
                if (aVar == null) {
                    return true;
                }
                aVar.b(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // n0.h
    public void c() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean d() {
        return false;
    }

    @Override // n0.h
    public void dismiss() {
        if (h()) {
            this.f1097j.dismiss();
        }
    }

    @Override // android.support.v7.view.menu.j
    public void f(j.a aVar) {
        this.f1103p = aVar;
    }

    @Override // n0.h
    public boolean h() {
        return !this.f1105r && this.f1097j.h();
    }

    @Override // n0.h
    public ListView i() {
        return this.f1097j.i();
    }

    @Override // android.support.v7.view.menu.j
    public void k(boolean z2) {
        this.f1106s = false;
        d dVar = this.f1092e;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1105r = true;
        this.f1091d.close();
        ViewTreeObserver viewTreeObserver = this.f1104q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1104q = this.f1102o.getViewTreeObserver();
            }
            this.f1104q.removeGlobalOnLayoutListener(this.f1098k);
            this.f1104q = null;
        }
        this.f1102o.removeOnAttachStateChangeListener(this.f1099l);
        PopupWindow.OnDismissListener onDismissListener = this.f1100m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.support.v7.view.menu.h
    public void p(View view) {
        this.f1101n = view;
    }

    @Override // android.support.v7.view.menu.h
    public void r(boolean z2) {
        this.f1092e.d(z2);
    }

    @Override // android.support.v7.view.menu.h
    public void s(int i2) {
        this.f1108u = i2;
    }

    @Override // android.support.v7.view.menu.h
    public void t(int i2) {
        this.f1097j.y(i2);
    }

    @Override // android.support.v7.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1100m = onDismissListener;
    }

    @Override // android.support.v7.view.menu.h
    public void v(boolean z2) {
        this.f1109v = z2;
    }

    @Override // android.support.v7.view.menu.h
    public void w(int i2) {
        this.f1097j.H(i2);
    }
}
