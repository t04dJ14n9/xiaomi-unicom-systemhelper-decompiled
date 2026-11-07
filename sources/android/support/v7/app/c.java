package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f813b = -1;

    c() {
    }

    public static c e(Activity activity, i0.b bVar) {
        return new d(activity, activity.getWindow(), bVar);
    }

    public static c f(Dialog dialog, i0.b bVar) {
        return new d(dialog.getContext(), dialog.getWindow(), bVar);
    }

    public static int h() {
        return f813b;
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public abstract <T extends View> T g(int i2);

    public abstract MenuInflater i();

    public abstract a j();

    public abstract void k();

    public abstract void l();

    public abstract void m(Configuration configuration);

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t();

    public abstract boolean u(int i2);

    public abstract void v(int i2);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(CharSequence charSequence);
}
