package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1340a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r0 f1343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r0 f1344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r0 f1345f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1342c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f1341b = j.m();

    e(View view) {
        this.f1340a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1345f == null) {
            this.f1345f = new r0();
        }
        r0 r0Var = this.f1345f;
        r0Var.a();
        ColorStateList colorStateListC = g0.m.c(this.f1340a);
        if (colorStateListC != null) {
            r0Var.f1519d = true;
            r0Var.f1516a = colorStateListC;
        }
        PorterDuff.Mode modeD = g0.m.d(this.f1340a);
        if (modeD != null) {
            r0Var.f1518c = true;
            r0Var.f1517b = modeD;
        }
        if (!r0Var.f1519d && !r0Var.f1518c) {
            return false;
        }
        j.B(drawable, r0Var, this.f1340a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1343d != null;
    }

    void b() {
        Drawable background = this.f1340a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            r0 r0Var = this.f1344e;
            if (r0Var != null) {
                j.B(background, r0Var, this.f1340a.getDrawableState());
                return;
            }
            r0 r0Var2 = this.f1343d;
            if (r0Var2 != null) {
                j.B(background, r0Var2, this.f1340a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        r0 r0Var = this.f1344e;
        if (r0Var != null) {
            return r0Var.f1516a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        r0 r0Var = this.f1344e;
        if (r0Var != null) {
            return r0Var.f1517b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i2) {
        t0 t0VarT = t0.t(this.f1340a.getContext(), attributeSet, j0.j.p3, i2, 0);
        try {
            int i3 = j0.j.q3;
            if (t0VarT.q(i3)) {
                this.f1342c = t0VarT.m(i3, -1);
                ColorStateList colorStateListR = this.f1341b.r(this.f1340a.getContext(), this.f1342c);
                if (colorStateListR != null) {
                    h(colorStateListR);
                }
            }
            int i4 = j0.j.r3;
            if (t0VarT.q(i4)) {
                g0.m.t(this.f1340a, t0VarT.c(i4));
            }
            int i5 = j0.j.s3;
            if (t0VarT.q(i5)) {
                g0.m.u(this.f1340a, c0.c(t0VarT.j(i5, -1), null));
            }
        } finally {
            t0VarT.u();
        }
    }

    void f(Drawable drawable) {
        this.f1342c = -1;
        h(null);
        b();
    }

    void g(int i2) {
        this.f1342c = i2;
        j jVar = this.f1341b;
        h(jVar != null ? jVar.r(this.f1340a.getContext(), i2) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1343d == null) {
                this.f1343d = new r0();
            }
            r0 r0Var = this.f1343d;
            r0Var.f1516a = colorStateList;
            r0Var.f1519d = true;
        } else {
            this.f1343d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1344e == null) {
            this.f1344e = new r0();
        }
        r0 r0Var = this.f1344e;
        r0Var.f1516a = colorStateList;
        r0Var.f1519d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1344e == null) {
            this.f1344e = new r0();
        }
        r0 r0Var = this.f1344e;
        r0Var.f1517b = mode;
        r0Var.f1518c = true;
        b();
    }
}
