package g0;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2633a;

    private u(Object obj) {
        this.f2633a = obj;
    }

    static Object f(u uVar) {
        if (uVar == null) {
            return null;
        }
        return uVar.f2633a;
    }

    static u g(Object obj) {
        if (obj == null) {
            return null;
        }
        return new u(obj);
    }

    public int a() {
        return ((WindowInsets) this.f2633a).getSystemWindowInsetBottom();
    }

    public int b() {
        return ((WindowInsets) this.f2633a).getSystemWindowInsetLeft();
    }

    public int c() {
        return ((WindowInsets) this.f2633a).getSystemWindowInsetRight();
    }

    public int d() {
        return ((WindowInsets) this.f2633a).getSystemWindowInsetTop();
    }

    public u e(int i2, int i3, int i4, int i5) {
        return new u(((WindowInsets) this.f2633a).replaceSystemWindowInsets(i2, i3, i4, i5));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        Object obj2 = this.f2633a;
        if (obj2 == null) {
            return uVar.f2633a == null;
        }
        return obj2.equals(uVar.f2633a);
    }

    public int hashCode() {
        Object obj = this.f2633a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
