package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r0 f1577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r0 f1578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r0 f1579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r0 f1580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r0 f1581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r0 f1582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z f1583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1584i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Typeface f1585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1586k;

    class a extends z.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f1587a;

        a(WeakReference weakReference) {
            this.f1587a = weakReference;
        }

        @Override // z.b.a
        public void c(int i2) {
        }

        @Override // z.b.a
        public void d(Typeface typeface) {
            x.this.l(this.f1587a, typeface);
        }
    }

    x(TextView textView) {
        this.f1576a = textView;
        this.f1583h = new z(textView);
    }

    private void a(Drawable drawable, r0 r0Var) {
        if (drawable == null || r0Var == null) {
            return;
        }
        j.B(drawable, r0Var, this.f1576a.getDrawableState());
    }

    private static r0 d(Context context, j jVar, int i2) {
        ColorStateList colorStateListR = jVar.r(context, i2);
        if (colorStateListR == null) {
            return null;
        }
        r0 r0Var = new r0();
        r0Var.f1519d = true;
        r0Var.f1516a = colorStateListR;
        return r0Var;
    }

    private void t(int i2, float f2) {
        this.f1583h.s(i2, f2);
    }

    private void u(Context context, t0 t0Var) {
        String strN;
        Typeface typeface;
        this.f1584i = t0Var.j(j0.j.F2, this.f1584i);
        int i2 = j0.j.G2;
        if (t0Var.q(i2) || t0Var.q(j0.j.H2)) {
            this.f1585j = null;
            int i3 = j0.j.H2;
            if (t0Var.q(i3)) {
                i2 = i3;
            }
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceI = t0Var.i(i2, this.f1584i, new a(new WeakReference(this.f1576a)));
                    this.f1585j = typefaceI;
                    this.f1586k = typefaceI == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1585j != null || (strN = t0Var.n(i2)) == null) {
                return;
            }
            this.f1585j = Typeface.create(strN, this.f1584i);
            return;
        }
        int i4 = j0.j.E2;
        if (t0Var.q(i4)) {
            this.f1586k = false;
            int iJ = t0Var.j(i4, 1);
            if (iJ == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (iJ == 2) {
                typeface = Typeface.SERIF;
            } else if (iJ != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.f1585j = typeface;
        }
    }

    void b() {
        if (this.f1577b != null || this.f1578c != null || this.f1579d != null || this.f1580e != null) {
            Drawable[] compoundDrawables = this.f1576a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1577b);
            a(compoundDrawables[1], this.f1578c);
            a(compoundDrawables[2], this.f1579d);
            a(compoundDrawables[3], this.f1580e);
        }
        if (this.f1581f == null && this.f1582g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1576a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1581f);
        a(compoundDrawablesRelative[2], this.f1582g);
    }

    void c() {
        this.f1583h.a();
    }

    int e() {
        return this.f1583h.f();
    }

    int f() {
        return this.f1583h.g();
    }

    int g() {
        return this.f1583h.h();
    }

    int[] h() {
        return this.f1583h.i();
    }

    int i() {
        return this.f1583h.j();
    }

    boolean j() {
        return this.f1583h.m();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    @SuppressLint({"NewApi"})
    void k(AttributeSet attributeSet, int i2) {
        boolean zA;
        boolean z2;
        Context context = this.f1576a.getContext();
        j jVarM = j.m();
        t0 t0VarT = t0.t(context, attributeSet, j0.j.f3152a0, i2, 0);
        int iM = t0VarT.m(j0.j.f3155b0, -1);
        int i3 = j0.j.f3164e0;
        if (t0VarT.q(i3)) {
            this.f1577b = d(context, jVarM, t0VarT.m(i3, 0));
        }
        int i4 = j0.j.f3158c0;
        if (t0VarT.q(i4)) {
            this.f1578c = d(context, jVarM, t0VarT.m(i4, 0));
        }
        int i5 = j0.j.f3167f0;
        if (t0VarT.q(i5)) {
            this.f1579d = d(context, jVarM, t0VarT.m(i5, 0));
        }
        int i6 = j0.j.f3161d0;
        if (t0VarT.q(i6)) {
            this.f1580e = d(context, jVarM, t0VarT.m(i6, 0));
        }
        int i7 = j0.j.f3170g0;
        if (t0VarT.q(i7)) {
            this.f1581f = d(context, jVarM, t0VarT.m(i7, 0));
        }
        int i8 = j0.j.f3173h0;
        if (t0VarT.q(i8)) {
            this.f1582g = d(context, jVarM, t0VarT.m(i8, 0));
        }
        t0VarT.u();
        boolean z3 = this.f1576a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        if (iM != -1) {
            t0 t0VarR = t0.r(context, iM, j0.j.C2);
            if (z3) {
                zA = false;
                z2 = false;
            } else {
                int i9 = j0.j.I2;
                if (t0VarR.q(i9)) {
                    zA = t0VarR.a(i9, false);
                    z2 = true;
                } else {
                    zA = false;
                    z2 = false;
                }
            }
            u(context, t0VarR);
            t0VarR.u();
        } else {
            zA = false;
            z2 = false;
        }
        t0 t0VarT2 = t0.t(context, attributeSet, j0.j.C2, i2, 0);
        if (z3) {
            z4 = z2;
        } else {
            int i10 = j0.j.I2;
            if (t0VarT2.q(i10)) {
                zA = t0VarT2.a(i10, false);
            } else {
                z4 = z2;
            }
        }
        int i11 = j0.j.D2;
        if (t0VarT2.q(i11) && t0VarT2.e(i11, -1) == 0) {
            this.f1576a.setTextSize(0, 0.0f);
        }
        u(context, t0VarT2);
        t0VarT2.u();
        if (!z3 && z4) {
            o(zA);
        }
        Typeface typeface = this.f1585j;
        if (typeface != null) {
            this.f1576a.setTypeface(typeface, this.f1584i);
        }
        this.f1583h.n(attributeSet, i2);
        if (android.support.v4.widget.b.f716a && this.f1583h.j() != 0) {
            int[] iArrI = this.f1583h.i();
            if (iArrI.length > 0) {
                if (this.f1576a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f1576a.setAutoSizeTextTypeUniformWithConfiguration(this.f1583h.g(), this.f1583h.f(), this.f1583h.h(), 0);
                } else {
                    this.f1576a.setAutoSizeTextTypeUniformWithPresetSizes(iArrI, 0);
                }
            }
        }
        t0 t0VarS = t0.s(context, attributeSet, j0.j.f3175i0);
        int iE = t0VarS.e(j0.j.f3187o0, -1);
        int iE2 = t0VarS.e(j0.j.f3189p0, -1);
        int iE3 = t0VarS.e(j0.j.f3191q0, -1);
        t0VarS.u();
        if (iE != -1) {
            android.support.v4.widget.l.e(this.f1576a, iE);
        }
        if (iE2 != -1) {
            android.support.v4.widget.l.f(this.f1576a, iE2);
        }
        if (iE3 != -1) {
            android.support.v4.widget.l.g(this.f1576a, iE3);
        }
    }

    void l(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1586k) {
            this.f1585j = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1584i);
            }
        }
    }

    void m(boolean z2, int i2, int i3, int i4, int i5) {
        if (android.support.v4.widget.b.f716a) {
            return;
        }
        c();
    }

    void n(Context context, int i2) {
        t0 t0VarR = t0.r(context, i2, j0.j.C2);
        int i3 = j0.j.I2;
        if (t0VarR.q(i3)) {
            o(t0VarR.a(i3, false));
        }
        int i4 = j0.j.D2;
        if (t0VarR.q(i4) && t0VarR.e(i4, -1) == 0) {
            this.f1576a.setTextSize(0, 0.0f);
        }
        u(context, t0VarR);
        t0VarR.u();
        Typeface typeface = this.f1585j;
        if (typeface != null) {
            this.f1576a.setTypeface(typeface, this.f1584i);
        }
    }

    void o(boolean z2) {
        this.f1576a.setAllCaps(z2);
    }

    void p(int i2, int i3, int i4, int i5) {
        this.f1583h.o(i2, i3, i4, i5);
    }

    void q(int[] iArr, int i2) {
        this.f1583h.p(iArr, i2);
    }

    void r(int i2) {
        this.f1583h.q(i2);
    }

    void s(int i2, float f2) {
        if (android.support.v4.widget.b.f716a || j()) {
            return;
        }
        t(i2, f2);
    }
}
