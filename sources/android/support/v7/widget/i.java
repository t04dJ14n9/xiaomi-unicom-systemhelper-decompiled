package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f1411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1412b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1413c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1414d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1415e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1416f;

    i(CompoundButton compoundButton) {
        this.f1411a = compoundButton;
    }

    void a() {
        Drawable drawableA = android.support.v4.widget.c.a(this.f1411a);
        if (drawableA != null) {
            if (this.f1414d || this.f1415e) {
                Drawable drawableMutate = b0.a.j(drawableA).mutate();
                if (this.f1414d) {
                    b0.a.h(drawableMutate, this.f1412b);
                }
                if (this.f1415e) {
                    b0.a.i(drawableMutate, this.f1413c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1411a.getDrawableState());
                }
                this.f1411a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i2) {
        return i2;
    }

    ColorStateList c() {
        return this.f1412b;
    }

    PorterDuff.Mode d() {
        return this.f1413c;
    }

    void e(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f1411a.getContext().obtainStyledAttributes(attributeSet, j0.j.J0, i2, 0);
        try {
            int i3 = j0.j.K0;
            if (typedArrayObtainStyledAttributes.hasValue(i3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i3, 0)) != 0) {
                CompoundButton compoundButton = this.f1411a;
                compoundButton.setButtonDrawable(k0.a.b(compoundButton.getContext(), resourceId));
            }
            int i4 = j0.j.L0;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                android.support.v4.widget.c.b(this.f1411a, typedArrayObtainStyledAttributes.getColorStateList(i4));
            }
            int i5 = j0.j.M0;
            if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                android.support.v4.widget.c.c(this.f1411a, c0.c(typedArrayObtainStyledAttributes.getInt(i5, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    void f() {
        if (this.f1416f) {
            this.f1416f = false;
        } else {
            this.f1416f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f1412b = colorStateList;
        this.f1414d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f1413c = mode;
        this.f1415e = true;
        a();
    }
}
