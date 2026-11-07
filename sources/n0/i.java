package n0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class i extends g implements SubMenu {
    i(Context context, c0.c cVar) {
        super(context, cVar);
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        h().clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(h().getItem());
    }

    public c0.c h() {
        return (c0.c) this.f3480a;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        h().setHeaderIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        h().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        h().setHeaderTitle(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        h().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        h().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        h().setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        h().setIcon(drawable);
        return this;
    }
}
