package i0;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v4.app.t;
import android.support.v4.app.y;
import android.support.v7.widget.w0;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class a extends f implements b, y.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private android.support.v7.app.c f2884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2885p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Resources f2886q;

    private boolean y(int i2, KeyEvent keyEvent) {
        return false;
    }

    public boolean A(Intent intent) {
        return t.f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s().c(view, layoutParams);
    }

    @Override // i0.b
    public void c(m0.b bVar) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        android.support.v7.app.a aVarT = t();
        if (getWindow().hasFeature(0)) {
            if (aVarT == null || !aVarT.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // i0.b
    public void d(m0.b bVar) {
    }

    @Override // android.support.v4.app.x, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        android.support.v7.app.a aVarT = t();
        if (keyCode == 82 && aVarT != null && aVarT.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.support.v4.app.y.a
    public Intent f() {
        return t.a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) s().g(i2);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return s().i();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f2886q == null && w0.b()) {
            this.f2886q = new w0(this, super.getResources());
        }
        Resources resources = this.f2886q;
        return resources == null ? super.getResources() : resources;
    }

    @Override // i0.b
    public m0.b h(m0.b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        s().l();
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s().m(configuration);
        if (this.f2886q != null) {
            this.f2886q.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        w();
    }

    @Override // android.support.v4.app.f, android.support.v4.app.x, android.app.Activity
    protected void onCreate(Bundle bundle) {
        android.support.v7.app.c cVarS = s();
        cVarS.k();
        cVarS.n(bundle);
        if (cVarS.d() && this.f2885p != 0) {
            onApplyThemeResource(getTheme(), this.f2885p, false);
        }
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s().o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (y(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        android.support.v7.app.a aVarT = t();
        if (menuItem.getItemId() != 16908332 || aVarT == null || (aVarT.i() & 4) == 0) {
            return false;
        }
        return x();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // android.support.v4.app.f, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        s().p(bundle);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        s().q();
    }

    @Override // android.support.v4.app.f, android.support.v4.app.x, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        s().r(bundle);
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        s().s();
    }

    @Override // android.support.v4.app.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        s().t();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        s().y(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        android.support.v7.app.a aVarT = t();
        if (getWindow().hasFeature(0)) {
            if (aVarT == null || !aVarT.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.support.v4.app.f
    public void r() {
        s().l();
    }

    public android.support.v7.app.c s() {
        if (this.f2884o == null) {
            this.f2884o = android.support.v7.app.c.e(this, this);
        }
        return this.f2884o;
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        s().v(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        s().w(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s().x(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        this.f2885p = i2;
    }

    public android.support.v7.app.a t() {
        return s().j();
    }

    public void u(y yVar) {
        yVar.b(this);
    }

    public void v(y yVar) {
    }

    @Deprecated
    public void w() {
    }

    public boolean x() {
        Intent intentF = f();
        if (intentF == null) {
            return false;
        }
        if (!A(intentF)) {
            z(intentF);
            return true;
        }
        y yVarD = y.d(this);
        u(yVarD);
        v(yVarD);
        yVarD.e();
        try {
            android.support.v4.app.a.d(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void z(Intent intent) {
        t.e(this, intent);
    }
}
