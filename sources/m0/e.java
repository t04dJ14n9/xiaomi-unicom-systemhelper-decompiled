package m0;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements android.support.v7.view.menu.e.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f3283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ActionBarContextView f3284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b.a f3285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<View> f3286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private android.support.v7.view.menu.e f3289j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z2) {
        this.f3283d = context;
        this.f3284e = actionBarContextView;
        this.f3285f = aVar;
        android.support.v7.view.menu.e eVarS = new android.support.v7.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f3289j = eVarS;
        eVarS.R(this);
        this.f3288i = z2;
    }

    @Override // android.support.v7.view.menu.e.a
    public void a(android.support.v7.view.menu.e eVar) {
        k();
        this.f3284e.l();
    }

    @Override // android.support.v7.view.menu.e.a
    public boolean b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        return this.f3285f.c(this, menuItem);
    }

    @Override // m0.b
    public void c() {
        if (this.f3287h) {
            return;
        }
        this.f3287h = true;
        this.f3284e.sendAccessibilityEvent(32);
        this.f3285f.b(this);
    }

    @Override // m0.b
    public View d() {
        WeakReference<View> weakReference = this.f3286g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // m0.b
    public Menu e() {
        return this.f3289j;
    }

    @Override // m0.b
    public MenuInflater f() {
        return new g(this.f3284e.getContext());
    }

    @Override // m0.b
    public CharSequence g() {
        return this.f3284e.getSubtitle();
    }

    @Override // m0.b
    public CharSequence i() {
        return this.f3284e.getTitle();
    }

    @Override // m0.b
    public void k() {
        this.f3285f.a(this, this.f3289j);
    }

    @Override // m0.b
    public boolean l() {
        return this.f3284e.j();
    }

    @Override // m0.b
    public void m(View view) {
        this.f3284e.setCustomView(view);
        this.f3286g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // m0.b
    public void n(int i2) {
        o(this.f3283d.getString(i2));
    }

    @Override // m0.b
    public void o(CharSequence charSequence) {
        this.f3284e.setSubtitle(charSequence);
    }

    @Override // m0.b
    public void q(int i2) {
        r(this.f3283d.getString(i2));
    }

    @Override // m0.b
    public void r(CharSequence charSequence) {
        this.f3284e.setTitle(charSequence);
    }

    @Override // m0.b
    public void s(boolean z2) {
        super.s(z2);
        this.f3284e.setTitleOptional(z2);
    }
}
