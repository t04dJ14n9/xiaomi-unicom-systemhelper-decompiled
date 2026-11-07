package g0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f2617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2618b;

    public k(ViewGroup viewGroup) {
        this.f2617a = viewGroup;
    }

    public int a() {
        return this.f2618b;
    }

    public void b(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    public void c(View view, View view2, int i2, int i3) {
        this.f2618b = i2;
    }

    public void d(View view, int i2) {
        this.f2618b = 0;
    }
}
