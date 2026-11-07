package g0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f2610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f2611c;

    public interface a {
    }

    public interface b {
        void onActionProviderVisibilityChanged(boolean z2);
    }

    public c(Context context) {
        this.f2609a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f2611c = null;
        this.f2610b = null;
    }

    public void i(a aVar) {
        this.f2610b = aVar;
    }

    public void j(b bVar) {
        if (this.f2611c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2611c = bVar;
    }
}
