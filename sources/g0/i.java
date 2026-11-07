package g0;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f2612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f2613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f2614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f2616e;

    public i(View view) {
        this.f2614c = view;
    }

    private ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f2612a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f2613b;
    }

    private void i(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f2612a = viewParent;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f2613b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z2) {
        ViewParent viewParentE;
        if (!g() || (viewParentE = e(0)) == null) {
            return false;
        }
        return p.a(viewParentE, this.f2614c, f2, f3, z2);
    }

    public boolean b(float f2, float f3) {
        ViewParent viewParentE;
        if (!g() || (viewParentE = e(0)) == null) {
            return false;
        }
        return p.b(viewParentE, this.f2614c, f2, f3);
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentE;
        int i5;
        int i6;
        if (!g() || (viewParentE = e(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f2614c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f2616e == null) {
                this.f2616e = new int[2];
            }
            iArr = this.f2616e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        p.c(viewParentE, this.f2614c, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f2614c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean d(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        ViewParent viewParentE;
        int i7;
        int i8;
        if (!g() || (viewParentE = e(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2614c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        p.d(viewParentE, this.f2614c, i2, i3, i4, i5, i6);
        if (iArr != null) {
            this.f2614c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public boolean f(int i2) {
        return e(i2) != null;
    }

    public boolean g() {
        return this.f2615d;
    }

    public void h(boolean z2) {
        if (this.f2615d) {
            m.z(this.f2614c);
        }
        this.f2615d = z2;
    }

    public boolean j(int i2, int i3) {
        if (f(i3)) {
            return true;
        }
        if (!g()) {
            return false;
        }
        View view = this.f2614c;
        for (ViewParent parent = this.f2614c.getParent(); parent != null; parent = parent.getParent()) {
            if (p.f(parent, view, this.f2614c, i2, i3)) {
                i(i3, parent);
                p.e(parent, view, this.f2614c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void k(int i2) {
        ViewParent viewParentE = e(i2);
        if (viewParentE != null) {
            p.g(viewParentE, this.f2614c, i2);
            i(i2, null);
        }
    }
}
