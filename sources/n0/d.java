package n0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class d extends n0.b<c0.b> implements MenuItem {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f3481e;

    class a extends g0.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ActionProvider f3482d;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f3482d = actionProvider;
        }

        @Override // g0.c
        public boolean a() {
            return this.f3482d.hasSubMenu();
        }

        @Override // g0.c
        public View c() {
            return this.f3482d.onCreateActionView();
        }

        @Override // g0.c
        public boolean e() {
            return this.f3482d.onPerformDefaultAction();
        }

        @Override // g0.c
        public void f(SubMenu subMenu) {
            this.f3482d.onPrepareSubMenu(d.this.d(subMenu));
        }
    }

    static class b extends FrameLayout implements m0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CollapsibleActionView f3484b;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f3484b = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f3484b;
        }

        @Override // m0.c
        public void onActionViewCollapsed() {
            this.f3484b.onActionViewCollapsed();
        }

        @Override // m0.c
        public void onActionViewExpanded() {
            this.f3484b.onActionViewExpanded();
        }
    }

    private class c extends n0.c<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f3480a).onMenuItemActionCollapse(d.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f3480a).onMenuItemActionExpand(d.this.c(menuItem));
        }
    }

    /* JADX INFO: renamed from: n0.d$d, reason: collision with other inner class name */
    private class MenuItemOnMenuItemClickListenerC0041d extends n0.c<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        MenuItemOnMenuItemClickListenerC0041d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f3480a).onMenuItemClick(d.this.c(menuItem));
        }
    }

    d(Context context, c0.b bVar) {
        super(context, bVar);
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((c0.b) this.f3480a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((c0.b) this.f3480a).expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        g0.c cVarB = ((c0.b) this.f3480a).b();
        if (cVarB instanceof a) {
            return ((a) cVarB).f3482d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((c0.b) this.f3480a).getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((c0.b) this.f3480a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((c0.b) this.f3480a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((c0.b) this.f3480a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((c0.b) this.f3480a).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((c0.b) this.f3480a).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((c0.b) this.f3480a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((c0.b) this.f3480a).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((c0.b) this.f3480a).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((c0.b) this.f3480a).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((c0.b) this.f3480a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((c0.b) this.f3480a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((c0.b) this.f3480a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((c0.b) this.f3480a).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(((c0.b) this.f3480a).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((c0.b) this.f3480a).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((c0.b) this.f3480a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((c0.b) this.f3480a).getTooltipText();
    }

    a h(ActionProvider actionProvider) {
        return new a(this.f3477b, actionProvider);
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((c0.b) this.f3480a).hasSubMenu();
    }

    public void i(boolean z2) {
        try {
            if (this.f3481e == null) {
                this.f3481e = ((c0.b) this.f3480a).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f3481e.invoke(this.f3480a, Boolean.valueOf(z2));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((c0.b) this.f3480a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((c0.b) this.f3480a).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((c0.b) this.f3480a).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((c0.b) this.f3480a).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((c0.b) this.f3480a).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((c0.b) this.f3480a).a(actionProvider != null ? h(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        ((c0.b) this.f3480a).setActionView(i2);
        View actionView = ((c0.b) this.f3480a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((c0.b) this.f3480a).setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((c0.b) this.f3480a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        ((c0.b) this.f3480a).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        ((c0.b) this.f3480a).setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        ((c0.b) this.f3480a).setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        ((c0.b) this.f3480a).setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((c0.b) this.f3480a).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        ((c0.b) this.f3480a).setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        ((c0.b) this.f3480a).setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((c0.b) this.f3480a).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((c0.b) this.f3480a).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((c0.b) this.f3480a).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((c0.b) this.f3480a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        ((c0.b) this.f3480a).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        ((c0.b) this.f3480a).setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((c0.b) this.f3480a).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((c0.b) this.f3480a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC0041d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        ((c0.b) this.f3480a).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        ((c0.b) this.f3480a).setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        ((c0.b) this.f3480a).setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        ((c0.b) this.f3480a).setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        ((c0.b) this.f3480a).setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((c0.b) this.f3480a).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((c0.b) this.f3480a).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((c0.b) this.f3480a).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        return ((c0.b) this.f3480a).setVisible(z2);
    }
}
