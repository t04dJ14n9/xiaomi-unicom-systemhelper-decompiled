package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f1469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r0 f1470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r0 f1471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r0 f1472d;

    public n(ImageView imageView) {
        this.f1469a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1472d == null) {
            this.f1472d = new r0();
        }
        r0 r0Var = this.f1472d;
        r0Var.a();
        ColorStateList colorStateListA = android.support.v4.widget.g.a(this.f1469a);
        if (colorStateListA != null) {
            r0Var.f1519d = true;
            r0Var.f1516a = colorStateListA;
        }
        PorterDuff.Mode modeB = android.support.v4.widget.g.b(this.f1469a);
        if (modeB != null) {
            r0Var.f1518c = true;
            r0Var.f1517b = modeB;
        }
        if (!r0Var.f1519d && !r0Var.f1518c) {
            return false;
        }
        j.B(drawable, r0Var, this.f1469a.getDrawableState());
        return true;
    }

    private boolean j() {
        return this.f1470b != null;
    }

    void b() {
        Drawable drawable = this.f1469a.getDrawable();
        if (drawable != null) {
            c0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            r0 r0Var = this.f1471c;
            if (r0Var != null) {
                j.B(drawable, r0Var, this.f1469a.getDrawableState());
                return;
            }
            r0 r0Var2 = this.f1470b;
            if (r0Var2 != null) {
                j.B(drawable, r0Var2, this.f1469a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        r0 r0Var = this.f1471c;
        if (r0Var != null) {
            return r0Var.f1516a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        r0 r0Var = this.f1471c;
        if (r0Var != null) {
            return r0Var.f1517b;
        }
        return null;
    }

    boolean e() {
        return !(this.f1469a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i2) {
        int iM;
        t0 t0VarT = t0.t(this.f1469a.getContext(), attributeSet, j0.j.R, i2, 0);
        try {
            Drawable drawable = this.f1469a.getDrawable();
            if (drawable == null && (iM = t0VarT.m(j0.j.S, -1)) != -1 && (drawable = k0.a.b(this.f1469a.getContext(), iM)) != null) {
                this.f1469a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c0.b(drawable);
            }
            int i3 = j0.j.T;
            if (t0VarT.q(i3)) {
                android.support.v4.widget.g.c(this.f1469a, t0VarT.c(i3));
            }
            int i4 = j0.j.U;
            if (t0VarT.q(i4)) {
                android.support.v4.widget.g.d(this.f1469a, c0.c(t0VarT.j(i4, -1), null));
            }
        } finally {
            t0VarT.u();
        }
    }

    public void g(int i2) {
        if (i2 != 0) {
            Drawable drawableB = k0.a.b(this.f1469a.getContext(), i2);
            if (drawableB != null) {
                c0.b(drawableB);
            }
            this.f1469a.setImageDrawable(drawableB);
        } else {
            this.f1469a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f1471c == null) {
            this.f1471c = new r0();
        }
        r0 r0Var = this.f1471c;
        r0Var.f1516a = colorStateList;
        r0Var.f1519d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f1471c == null) {
            this.f1471c = new r0();
        }
        r0 r0Var = this.f1471c;
        r0Var.f1517b = mode;
        r0Var.f1518c = true;
        b();
    }
}
