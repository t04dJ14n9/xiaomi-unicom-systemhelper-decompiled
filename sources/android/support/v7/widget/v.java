package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
class v extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f1550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f1552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1555i;

    v(SeekBar seekBar) {
        super(seekBar);
        this.f1552f = null;
        this.f1553g = null;
        this.f1554h = false;
        this.f1555i = false;
        this.f1550d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1551e;
        if (drawable != null) {
            if (this.f1554h || this.f1555i) {
                Drawable drawableJ = b0.a.j(drawable.mutate());
                this.f1551e = drawableJ;
                if (this.f1554h) {
                    b0.a.h(drawableJ, this.f1552f);
                }
                if (this.f1555i) {
                    b0.a.i(this.f1551e, this.f1553g);
                }
                if (this.f1551e.isStateful()) {
                    this.f1551e.setState(this.f1550d.getDrawableState());
                }
            }
        }
    }

    @Override // android.support.v7.widget.r
    void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        t0 t0VarT = t0.t(this.f1550d.getContext(), attributeSet, j0.j.V, i2, 0);
        Drawable drawableG = t0VarT.g(j0.j.W);
        if (drawableG != null) {
            this.f1550d.setThumb(drawableG);
        }
        j(t0VarT.f(j0.j.X));
        int i3 = j0.j.Z;
        if (t0VarT.q(i3)) {
            this.f1553g = c0.c(t0VarT.j(i3, -1), this.f1553g);
            this.f1555i = true;
        }
        int i4 = j0.j.Y;
        if (t0VarT.q(i4)) {
            this.f1552f = t0VarT.c(i4);
            this.f1554h = true;
        }
        t0VarT.u();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1551e != null) {
            int max = this.f1550d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1551e.getIntrinsicWidth();
                int intrinsicHeight = this.f1551e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1551e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1550d.getWidth() - this.f1550d.getPaddingLeft()) - this.f1550d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1550d.getPaddingLeft(), this.f1550d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1551e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1551e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1550d.getDrawableState())) {
            this.f1550d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f1551e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1551e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1551e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1550d);
            b0.a.f(drawable, g0.m.e(this.f1550d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1550d.getDrawableState());
            }
            f();
        }
        this.f1550d.invalidate();
    }
}
