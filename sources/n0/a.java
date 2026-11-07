package n0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a implements c0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f3459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f3460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f3461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f3462h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f3464j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f3466l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f3468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f3469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f3470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f3471q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3463i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3465k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f3467m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ColorStateList f3472r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PorterDuff.Mode f3473s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3474t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f3475u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f3476v = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f3468n = context;
        this.f3455a = i3;
        this.f3456b = i2;
        this.f3457c = i4;
        this.f3458d = i5;
        this.f3459e = charSequence;
    }

    private void c() {
        Drawable drawable = this.f3466l;
        if (drawable != null) {
            if (this.f3474t || this.f3475u) {
                Drawable drawableJ = b0.a.j(drawable);
                this.f3466l = drawableJ;
                Drawable drawableMutate = drawableJ.mutate();
                this.f3466l = drawableMutate;
                if (this.f3474t) {
                    b0.a.h(drawableMutate, this.f3472r);
                }
                if (this.f3475u) {
                    b0.a.i(this.f3466l, this.f3473s);
                }
            }
        }
    }

    @Override // c0.b
    public c0.b a(g0.c cVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c0.b
    public g0.c b() {
        return null;
    }

    @Override // c0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // c0.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c0.b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // c0.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // c0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // c0.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c0.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // c0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // c0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f3465k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f3464j;
    }

    @Override // c0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f3470p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f3456b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f3466l;
    }

    @Override // c0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f3472r;
    }

    @Override // c0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f3473s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f3461g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f3455a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // c0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f3463i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f3462h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f3458d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f3459e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3460f;
        return charSequence != null ? charSequence : this.f3459e;
    }

    @Override // c0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f3471q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // c0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f3476v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f3476v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f3476v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f3476v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f3464j = Character.toLowerCase(c2);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f3464j = Character.toLowerCase(c2);
        this.f3465k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f3476v = (z2 ? 1 : 0) | (this.f3476v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f3476v = (z2 ? 2 : 0) | (this.f3476v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public c0.b setContentDescription(CharSequence charSequence) {
        this.f3470p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f3476v = (z2 ? 16 : 0) | (this.f3476v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f3467m = i2;
        this.f3466l = y.a.b(this.f3468n, i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f3466l = drawable;
        this.f3467m = 0;
        c();
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3472r = colorStateList;
        this.f3474t = true;
        c();
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3473s = mode;
        this.f3475u = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f3461g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f3462h = c2;
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f3462h = c2;
        this.f3463i = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3469o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f3462h = c2;
        this.f3464j = Character.toLowerCase(c3);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3462h = c2;
        this.f3463i = KeyEvent.normalizeMetaState(i2);
        this.f3464j = Character.toLowerCase(c3);
        this.f3465k = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f3459e = this.f3468n.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f3459e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3460f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public c0.b setTooltipText(CharSequence charSequence) {
        this.f3471q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        this.f3476v = (this.f3476v & 8) | (z2 ? 0 : 8);
        return this;
    }
}
