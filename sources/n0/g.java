package n0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
class g extends b<c0.a> implements Menu {
    g(Context context, c0.a aVar) {
        super(context, aVar);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return c(((c0.a) this.f3480a).add(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return c(((c0.a) this.f3480a).add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return c(((c0.a) this.f3480a).add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(((c0.a) this.f3480a).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = ((c0.a) this.f3480a).addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = c(menuItemArr2[i6]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return d(((c0.a) this.f3480a).addSubMenu(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return d(((c0.a) this.f3480a).addSubMenu(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return d(((c0.a) this.f3480a).addSubMenu(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(((c0.a) this.f3480a).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        ((c0.a) this.f3480a).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((c0.a) this.f3480a).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        return c(((c0.a) this.f3480a).findItem(i2));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return c(((c0.a) this.f3480a).getItem(i2));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((c0.a) this.f3480a).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return ((c0.a) this.f3480a).isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return ((c0.a) this.f3480a).performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return ((c0.a) this.f3480a).performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        f(i2);
        ((c0.a) this.f3480a).removeGroup(i2);
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        g(i2);
        ((c0.a) this.f3480a).removeItem(i2);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ((c0.a) this.f3480a).setGroupCheckable(i2, z2, z3);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        ((c0.a) this.f3480a).setGroupEnabled(i2, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        ((c0.a) this.f3480a).setGroupVisible(i2, z2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        ((c0.a) this.f3480a).setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public int size() {
        return ((c0.a) this.f3480a).size();
    }
}
