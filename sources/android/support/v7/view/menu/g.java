package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c0.b {
    private View A;
    private g0.c B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f1052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f1053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f1054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f1055h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f1057j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f1059l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f1061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f1062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f1063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f1065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f1066s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1073z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1056i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1058k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1060m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f1067t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f1068u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1069v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1070w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1071x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1072y = 16;
    private boolean D = false;

    class a implements g0.c.b {
        a() {
        }

        @Override // g0.c.b
        public void onActionProviderVisibilityChanged(boolean z2) {
            g gVar = g.this;
            gVar.f1061n.J(gVar);
        }
    }

    g(e eVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f1061n = eVar;
        this.f1048a = i3;
        this.f1049b = i2;
        this.f1050c = i4;
        this.f1051d = i5;
        this.f1052e = charSequence;
        this.f1073z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1071x && (this.f1069v || this.f1070w)) {
            drawable = b0.a.j(drawable).mutate();
            if (this.f1069v) {
                b0.a.h(drawable, this.f1067t);
            }
            if (this.f1070w) {
                b0.a.i(drawable, this.f1068u);
            }
            this.f1071x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f1061n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f1073z & 4) == 4;
    }

    @Override // c0.b
    public c0.b a(g0.c cVar) {
        g0.c cVar2 = this.B;
        if (cVar2 != null) {
            cVar2.h();
        }
        this.A = null;
        this.B = cVar;
        this.f1061n.K(true);
        g0.c cVar3 = this.B;
        if (cVar3 != null) {
            cVar3.j(new a());
        }
        return this;
    }

    @Override // c0.b
    public g0.c b() {
        return this.B;
    }

    public void c() {
        this.f1061n.I(this);
    }

    @Override // c0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1073z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1061n.f(this);
        }
        return false;
    }

    @Override // c0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1061n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f1051d;
    }

    char g() {
        return this.f1061n.G() ? this.f1057j : this.f1055h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // c0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        g0.c cVar = this.B;
        if (cVar == null) {
            return null;
        }
        View viewD = cVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // c0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1058k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1057j;
    }

    @Override // c0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1065r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1049b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1059l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1060m == 0) {
            return null;
        }
        Drawable drawableB = k0.a.b(this.f1061n.u(), this.f1060m);
        this.f1060m = 0;
        this.f1059l = drawableB;
        return e(drawableB);
    }

    @Override // c0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1067t;
    }

    @Override // c0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1068u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1054g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1048a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // c0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1056i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1055h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1050c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1062o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1052e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1053f;
        return charSequence != null ? charSequence : this.f1052e;
    }

    @Override // c0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1066s;
    }

    String h() {
        int i2;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f1061n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1061n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(j0.h.f3147k));
        }
        int i3 = this.f1061n.G() ? this.f1058k : this.f1056i;
        d(sb, i3, 65536, resources.getString(j0.h.f3143g));
        d(sb, i3, 4096, resources.getString(j0.h.f3139c));
        d(sb, i3, 2, resources.getString(j0.h.f3138b));
        d(sb, i3, 1, resources.getString(j0.h.f3144h));
        d(sb, i3, 4, resources.getString(j0.h.f3146j));
        d(sb, i3, 8, resources.getString(j0.h.f3142f));
        if (cG == '\b') {
            i2 = j0.h.f3140d;
        } else {
            if (cG != '\n') {
                if (cG != ' ') {
                    sb.append(cG);
                } else {
                    i2 = j0.h.f3145i;
                }
                return sb.toString();
            }
            i2 = j0.h.f3141e;
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1062o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // c0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1072y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1072y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1072y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        g0.c cVar = this.B;
        if (cVar == null || !cVar.g()) {
            return (this.f1072y & 8) == 0;
        }
        return (this.f1072y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        g0.c cVar;
        if ((this.f1073z & 8) == 0) {
            return false;
        }
        if (this.A == null && (cVar = this.B) != null) {
            this.A = cVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1064q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f1061n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f1063p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1054g != null) {
            try {
                this.f1061n.u().startActivity(this.f1054g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        g0.c cVar = this.B;
        return cVar != null && cVar.e();
    }

    public boolean l() {
        return (this.f1072y & 32) == 32;
    }

    public boolean m() {
        return (this.f1072y & 4) != 0;
    }

    public boolean n() {
        return (this.f1073z & 1) == 1;
    }

    public boolean o() {
        return (this.f1073z & 2) == 2;
    }

    @Override // c0.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public c0.b setActionView(int i2) {
        Context contextU = this.f1061n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i2, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c0.b setActionView(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f1048a) > 0) {
            view.setId(i2);
        }
        this.f1061n.I(this);
        return this;
    }

    public void r(boolean z2) {
        this.D = z2;
        this.f1061n.K(false);
    }

    void s(boolean z2) {
        int i2 = this.f1072y;
        int i3 = (z2 ? 2 : 0) | (i2 & (-3));
        this.f1072y = i3;
        if (i2 != i3) {
            this.f1061n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f1057j == c2) {
            return this;
        }
        this.f1057j = Character.toLowerCase(c2);
        this.f1061n.K(false);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f1057j == c2 && this.f1058k == i2) {
            return this;
        }
        this.f1057j = Character.toLowerCase(c2);
        this.f1058k = KeyEvent.normalizeMetaState(i2);
        this.f1061n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f1072y;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f1072y = i3;
        if (i2 != i3) {
            this.f1061n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.f1072y & 4) != 0) {
            this.f1061n.T(this);
        } else {
            s(z2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public c0.b setContentDescription(CharSequence charSequence) {
        this.f1065r = charSequence;
        this.f1061n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f1072y = z2 ? this.f1072y | 16 : this.f1072y & (-17);
        this.f1061n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f1059l = null;
        this.f1060m = i2;
        this.f1071x = true;
        this.f1061n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1060m = 0;
        this.f1059l = drawable;
        this.f1071x = true;
        this.f1061n.K(false);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1067t = colorStateList;
        this.f1069v = true;
        this.f1071x = true;
        this.f1061n.K(false);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1068u = mode;
        this.f1070w = true;
        this.f1071x = true;
        this.f1061n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1054g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f1055h == c2) {
            return this;
        }
        this.f1055h = c2;
        this.f1061n.K(false);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f1055h == c2 && this.f1056i == i2) {
            return this;
        }
        this.f1055h = c2;
        this.f1056i = KeyEvent.normalizeMetaState(i2);
        this.f1061n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1064q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1055h = c2;
        this.f1057j = Character.toLowerCase(c3);
        this.f1061n.K(false);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1055h = c2;
        this.f1056i = KeyEvent.normalizeMetaState(i2);
        this.f1057j = Character.toLowerCase(c3);
        this.f1058k = KeyEvent.normalizeMetaState(i3);
        this.f1061n.K(false);
        return this;
    }

    @Override // c0.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1073z = i2;
        this.f1061n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f1061n.u().getString(i2));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1052e = charSequence;
        this.f1061n.K(false);
        m mVar = this.f1062o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1053f = charSequence;
        this.f1061n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public c0.b setTooltipText(CharSequence charSequence) {
        this.f1066s = charSequence;
        this.f1061n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (y(z2)) {
            this.f1061n.J(this);
        }
        return this;
    }

    public void t(boolean z2) {
        this.f1072y = (z2 ? 4 : 0) | (this.f1072y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1052e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z2) {
        this.f1072y = z2 ? this.f1072y | 32 : this.f1072y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // c0.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public c0.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(m mVar) {
        this.f1062o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z2) {
        int i2 = this.f1072y;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f1072y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.f1061n.A();
    }
}
