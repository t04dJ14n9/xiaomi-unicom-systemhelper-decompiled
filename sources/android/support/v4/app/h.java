package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<?> f500a;

    private h(i<?> iVar) {
        this.f500a = iVar;
    }

    public static h b(i<?> iVar) {
        return new h(iVar);
    }

    public void a(e eVar) {
        i<?> iVar = this.f500a;
        iVar.f505e.i(iVar, iVar, eVar);
    }

    public void c() {
        this.f500a.f505e.q();
    }

    public void d(Configuration configuration) {
        this.f500a.f505e.r(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f500a.f505e.s(menuItem);
    }

    public void f() {
        this.f500a.f505e.t();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f500a.f505e.u(menu, menuInflater);
    }

    public void h() {
        this.f500a.f505e.v();
    }

    public void i() {
        this.f500a.f505e.x();
    }

    public void j(boolean z2) {
        this.f500a.f505e.y(z2);
    }

    public boolean k(MenuItem menuItem) {
        return this.f500a.f505e.N(menuItem);
    }

    public void l(Menu menu) {
        this.f500a.f505e.O(menu);
    }

    public void m() {
        this.f500a.f505e.P();
    }

    public void n(boolean z2) {
        this.f500a.f505e.Q(z2);
    }

    public boolean o(Menu menu) {
        return this.f500a.f505e.R(menu);
    }

    public void p() {
        this.f500a.f505e.S();
    }

    public void q() {
        this.f500a.f505e.T();
    }

    public void r() {
        this.f500a.f505e.V();
    }

    public boolean s() {
        return this.f500a.f505e.a0();
    }

    public e t(String str) {
        return this.f500a.f505e.g0(str);
    }

    public j u() {
        return this.f500a.f();
    }

    public void v() {
        this.f500a.f505e.D0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f500a.f505e.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable, l lVar) {
        this.f500a.f505e.M0(parcelable, lVar);
    }

    public l y() {
        return this.f500a.f505e.N0();
    }

    public Parcelable z() {
        return this.f500a.f505e.P0();
    }
}
