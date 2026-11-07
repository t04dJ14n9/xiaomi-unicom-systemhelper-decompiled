package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
class q extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f1507b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1508a;

    public q(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        t0 t0VarT = t0.t(context, attributeSet, j0.j.U1, i2, i3);
        int i4 = j0.j.W1;
        if (t0VarT.q(i4)) {
            b(t0VarT.a(i4, false));
        }
        setBackgroundDrawable(t0VarT.f(j0.j.V1));
        t0VarT.u();
    }

    private void b(boolean z2) {
        if (f1507b) {
            this.f1508a = z2;
        } else {
            android.support.v4.widget.j.a(this, z2);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (f1507b && this.f1508a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f1507b && this.f1508a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f1507b && this.f1508a) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}
