package android.support.v4.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class x extends Activity implements android.arch.lifecycle.e, g0.e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0.k<Class<Object>, Object> f646b = new f0.k<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.arch.lifecycle.f f647c = new android.arch.lifecycle.f(this);

    public android.arch.lifecycle.c a() {
        return this.f647c;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g0.e.a(decorView, keyEvent)) {
            return g0.e.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g0.e.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // g0.e.a
    public boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        android.arch.lifecycle.k.e(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f647c.i(android.arch.lifecycle.c.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
