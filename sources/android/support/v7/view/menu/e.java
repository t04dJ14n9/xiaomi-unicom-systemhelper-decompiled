package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import g0.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements c0.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f1019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f1022e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f1031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f1032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f1033p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f1041x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1043z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1029l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1034q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1035r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1036s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1037t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1038u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<g> f1039v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f1040w = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1042y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<g> f1023f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<g> f1024g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1025h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<g> f1026i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<g> f1027j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1028k = true;

    public interface a {
        void a(e eVar);

        boolean b(e eVar, MenuItem menuItem);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f1018a = context;
        this.f1019b = context.getResources();
        b0(true);
    }

    private static int B(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i2, boolean z2) {
        if (i2 < 0 || i2 >= this.f1023f.size()) {
            return;
        }
        this.f1023f.remove(i2);
        if (z2) {
            K(true);
        }
    }

    private void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f1033p = view;
            this.f1031n = null;
            this.f1032o = null;
        } else {
            if (i2 > 0) {
                this.f1031n = resourcesC.getText(i2);
            } else if (charSequence != null) {
                this.f1031n = charSequence;
            }
            if (i3 > 0) {
                this.f1032o = y.a.b(u(), i3);
            } else if (drawable != null) {
                this.f1032o = drawable;
            }
            this.f1033p = null;
        }
        K(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void b0(boolean z2) {
        boolean z3;
        if (z2) {
            z3 = this.f1019b.getConfiguration().keyboard != 1 && n.a(ViewConfiguration.get(this.f1018a), this.f1018a);
        }
        this.f1021d = z3;
    }

    private g g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new g(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z2) {
        if (this.f1040w.isEmpty()) {
            return;
        }
        d0();
        for (WeakReference<j> weakReference : this.f1040w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f1040w.remove(weakReference);
            } else {
                jVar.k(z2);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f1040w.isEmpty()) {
            return false;
        }
        boolean zB = jVar != null ? jVar.b(mVar) : false;
        for (WeakReference<j> weakReference : this.f1040w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null) {
                this.f1040w.remove(weakReference);
            } else if (!zB) {
                zB = jVar2.b(mVar);
            }
        }
        return zB;
    }

    private static int n(ArrayList<g> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f1037t;
    }

    Resources C() {
        return this.f1019b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (!this.f1025h) {
            return this.f1024g;
        }
        this.f1024g.clear();
        int size = this.f1023f.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f1023f.get(i2);
            if (gVar.isVisible()) {
                this.f1024g.add(gVar);
            }
        }
        this.f1025h = false;
        this.f1028k = true;
        return this.f1024g;
    }

    public boolean F() {
        return this.f1042y;
    }

    boolean G() {
        return this.f1020c;
    }

    public boolean H() {
        return this.f1021d;
    }

    void I(g gVar) {
        this.f1028k = true;
        K(true);
    }

    void J(g gVar) {
        this.f1025h = true;
        K(true);
    }

    public void K(boolean z2) {
        if (this.f1034q) {
            this.f1035r = true;
            if (z2) {
                this.f1036s = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f1025h = true;
            this.f1028k = true;
        }
        i(z2);
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, null, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[PHI: r1
      0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean M(MenuItem menuItem, j jVar, int i2) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        g0.c cVarB = gVar.b();
        boolean z2 = cVarB != null && cVarB.a();
        if (gVar.j()) {
            zK |= gVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z2) {
                cVarB.f(mVar);
            }
            zK |= j(mVar, jVar);
            if (!zK) {
                e(true);
            }
        } else if ((i2 & 1) == 0) {
            e(true);
        }
        return zK;
    }

    public void O(j jVar) {
        for (WeakReference<j> weakReference : this.f1040w) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f1040w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f1022e = aVar;
    }

    public e S(int i2) {
        this.f1029l = i2;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1023f.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f1023f.get(i2);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    protected e U(int i2) {
        W(0, null, i2, null, null);
        return this;
    }

    protected e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected e X(int i2) {
        W(i2, null, 0, null, null);
        return this;
    }

    protected e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int iB = B(i4);
        g gVarG = g(i2, i3, i4, iB, charSequence, this.f1029l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1030m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f1023f;
        arrayList.add(n(arrayList, iB), gVarG);
        K(true);
        return gVarG;
    }

    public void a0(boolean z2) {
        this.f1043z = z2;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f1019b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f1019b.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f1018a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f1019b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f1019b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        g gVar = (g) a(i2, i3, i4, charSequence);
        m mVar = new m(this.f1018a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f1018a);
    }

    public void c(j jVar, Context context) {
        this.f1040w.add(new WeakReference<>(jVar));
        jVar.g(context, this);
        this.f1028k = true;
    }

    public void c0() {
        this.f1034q = false;
        if (this.f1035r) {
            this.f1035r = false;
            K(this.f1036s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f1041x;
        if (gVar != null) {
            f(gVar);
        }
        this.f1023f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f1032o = null;
        this.f1031n = null;
        this.f1033p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1022e;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void d0() {
        if (this.f1034q) {
            return;
        }
        this.f1034q = true;
        this.f1035r = false;
        this.f1036s = false;
    }

    public final void e(boolean z2) {
        if (this.f1038u) {
            return;
        }
        this.f1038u = true;
        for (WeakReference<j> weakReference : this.f1040w) {
            j jVar = weakReference.get();
            if (jVar == null) {
                this.f1040w.remove(weakReference);
            } else {
                jVar.a(this, z2);
            }
        }
        this.f1038u = false;
    }

    public boolean f(g gVar) {
        boolean zE = false;
        if (!this.f1040w.isEmpty() && this.f1041x == gVar) {
            d0();
            for (WeakReference<j> weakReference : this.f1040w) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zE = jVar.e(this, gVar);
                    if (zE) {
                        break;
                    }
                } else {
                    this.f1040w.remove(weakReference);
                }
            }
            c0();
            if (zE) {
                this.f1041x = null;
            }
        }
        return zE;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f1023f.get(i3);
            if (gVar.getItemId() == i2) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f1023f.get(i2);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f1022e;
        return aVar != null && aVar.b(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1043z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1023f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean zJ = false;
        if (this.f1040w.isEmpty()) {
            return false;
        }
        d0();
        for (WeakReference<j> weakReference : this.f1040w) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zJ = jVar.j(this, gVar);
                if (zJ) {
                    break;
                }
            } else {
                this.f1040w.remove(weakReference);
            }
        }
        c0();
        if (zJ) {
            this.f1041x = gVar;
        }
        return zJ;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f1023f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f1023f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    g p(int i2, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f1039v;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zG = G();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = arrayList.get(i3);
            char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i2 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        g gVarP = p(i2, keyEvent);
        boolean zL = gVarP != null ? L(gVarP, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(List<g> list, int i2, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f1023f.size();
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = this.f1023f.get(i3);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = zG ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zG ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i2 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> arrayListE = E();
        if (this.f1028k) {
            boolean zD = false;
            for (WeakReference<j> weakReference : this.f1040w) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    this.f1040w.remove(weakReference);
                } else {
                    zD |= jVar.d();
                }
            }
            if (zD) {
                this.f1026i.clear();
                this.f1027j.clear();
                int size = arrayListE.size();
                for (int i2 = 0; i2 < size; i2++) {
                    g gVar = arrayListE.get(i2);
                    (gVar.l() ? this.f1026i : this.f1027j).add(gVar);
                }
            } else {
                this.f1026i.clear();
                this.f1027j.clear();
                this.f1027j.addAll(E());
            }
            this.f1028k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int iL = l(i2);
        if (iL >= 0) {
            int size = this.f1023f.size() - iL;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f1023f.get(iL).getGroupId() != i2) {
                    break;
                }
                N(iL, false);
                i3 = i4;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f1026i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f1023f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f1023f.get(i3);
            if (gVar.getGroupId() == i2) {
                gVar.t(z3);
                gVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f1042y = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f1023f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f1023f.get(i3);
            if (gVar.getGroupId() == i2) {
                gVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f1023f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f1023f.get(i3);
            if (gVar.getGroupId() == i2 && gVar.y(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f1020c = z2;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1023f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f1018a;
    }

    public g v() {
        return this.f1041x;
    }

    public Drawable w() {
        return this.f1032o;
    }

    public CharSequence x() {
        return this.f1031n;
    }

    public View y() {
        return this.f1033p;
    }

    public ArrayList<g> z() {
        r();
        return this.f1027j;
    }
}
