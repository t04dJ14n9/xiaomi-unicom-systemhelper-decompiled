package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f1081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f1084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f1085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1087l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z2, int i2) {
        this(context, eVar, view, z2, i2, 0);
    }

    public i(Context context, e eVar, View view, boolean z2, int i2, int i3) {
        this.f1082g = 8388611;
        this.f1087l = new a();
        this.f1076a = context;
        this.f1077b = eVar;
        this.f1081f = view;
        this.f1078c = z2;
        this.f1079d = i2;
        this.f1080e = i3;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f1076a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f1076a.getResources().getDimensionPixelSize(j0.d.f3060c) ? new b(this.f1076a, this.f1081f, this.f1079d, this.f1080e, this.f1078c) : new l(this.f1076a, this.f1077b, this.f1081f, this.f1079d, this.f1080e, this.f1078c);
        bVar.l(this.f1077b);
        bVar.u(this.f1087l);
        bVar.p(this.f1081f);
        bVar.f(this.f1084i);
        bVar.r(this.f1083h);
        bVar.s(this.f1082g);
        return bVar;
    }

    private void l(int i2, int i3, boolean z2, boolean z3) {
        h hVarC = c();
        hVarC.v(z3);
        if (z2) {
            if ((g0.d.a(this.f1082g, g0.m.e(this.f1081f)) & 7) == 5) {
                i2 -= this.f1081f.getWidth();
            }
            hVarC.t(i2);
            hVarC.w(i3);
            int i4 = (int) ((this.f1076a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.q(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        hVarC.c();
    }

    public void b() {
        if (d()) {
            this.f1085j.dismiss();
        }
    }

    public h c() {
        if (this.f1085j == null) {
            this.f1085j = a();
        }
        return this.f1085j;
    }

    public boolean d() {
        h hVar = this.f1085j;
        return hVar != null && hVar.h();
    }

    protected void e() {
        this.f1085j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1086k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1081f = view;
    }

    public void g(boolean z2) {
        this.f1083h = z2;
        h hVar = this.f1085j;
        if (hVar != null) {
            hVar.r(z2);
        }
    }

    public void h(int i2) {
        this.f1082g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1086k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f1084i = aVar;
        h hVar = this.f1085j;
        if (hVar != null) {
            hVar.f(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1081f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f1081f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }
}
