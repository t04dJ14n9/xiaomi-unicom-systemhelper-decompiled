package i0;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import g0.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends Dialog implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.v7.app.c f2887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e.a f2888c;

    class a implements e.a {
        a() {
        }

        @Override // g0.e.a
        public boolean e(KeyEvent keyEvent) {
            return c.this.e(keyEvent);
        }
    }

    public c(Context context, int i2) {
        super(context, b(context, i2));
        this.f2888c = new a();
        a().n(null);
        a().d();
    }

    private static int b(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(j0.a.f3048y, typedValue, true);
        return typedValue.resourceId;
    }

    public android.support.v7.app.c a() {
        if (this.f2887b == null) {
            this.f2887b = android.support.v7.app.c.f(this, this);
        }
        return this.f2887b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    @Override // i0.b
    public void c(m0.b bVar) {
    }

    @Override // i0.b
    public void d(m0.b bVar) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.b(this.f2888c, getWindow().getDecorView(), this, keyEvent);
    }

    boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean f(int i2) {
        return a().u(i2);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().g(i2);
    }

    @Override // i0.b
    public m0.b h(m0.b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().k();
        super.onCreate(bundle);
        a().n(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().t();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().v(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().w(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().x(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().y(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().y(charSequence);
    }
}
