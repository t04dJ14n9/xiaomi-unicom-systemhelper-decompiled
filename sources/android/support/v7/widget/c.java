package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class c extends android.support.v7.view.menu.a implements g0.c.a {
    e A;
    a B;
    RunnableC0011c C;
    private b D;
    final f E;
    int F;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    d f1294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f1295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1302t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1303u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1306x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final SparseBooleanArray f1307y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f1308z;

    private class a extends android.support.v7.view.menu.i {
        public a(Context context, android.support.v7.view.menu.m mVar, View view) {
            super(context, mVar, view, false, j0.a.f3035l);
            if (!((android.support.v7.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f1294l;
                f(view2 == null ? (View) ((android.support.v7.view.menu.a) c.this).f965j : view2);
            }
            j(c.this.E);
        }

        @Override // android.support.v7.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.B = null;
            cVar.F = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public n0.h a() {
            a aVar = c.this.B;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0011c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f1311b;

        public RunnableC0011c(e eVar) {
            this.f1311b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((android.support.v7.view.menu.a) c.this).f959d != null) {
                ((android.support.v7.view.menu.a) c.this).f959d.d();
            }
            View view = (View) ((android.support.v7.view.menu.a) c.this).f965j;
            if (view != null && view.getWindowToken() != null && this.f1311b.m()) {
                c.this.A = this.f1311b;
            }
            c.this.C = null;
        }
    }

    private class d extends o implements ActionMenuView.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f1313d;

        class a extends f0 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c f1315k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1315k = cVar;
            }

            @Override // android.support.v7.widget.f0
            public n0.h b() {
                e eVar = c.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // android.support.v7.widget.f0
            public boolean c() {
                c.this.J();
                return true;
            }

            @Override // android.support.v7.widget.f0
            public boolean d() {
                c cVar = c.this;
                if (cVar.C != null) {
                    return false;
                }
                cVar.A();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, j0.a.f3034k);
            this.f1313d = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            v0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.J();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                b0.a.e(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends android.support.v7.view.menu.i {
        public e(Context context, android.support.v7.view.menu.e eVar, View view, boolean z2) {
            super(context, eVar, view, z2, j0.a.f3035l);
            h(8388613);
            j(c.this.E);
        }

        @Override // android.support.v7.view.menu.i
        protected void e() {
            if (((android.support.v7.view.menu.a) c.this).f959d != null) {
                ((android.support.v7.view.menu.a) c.this).f959d.close();
            }
            c.this.A = null;
            super.e();
        }
    }

    private class f implements android.support.v7.view.menu.j.a {
        f() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z2) {
            if (eVar instanceof android.support.v7.view.menu.m) {
                eVar.D().e(false);
            }
            android.support.v7.view.menu.j.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.a(eVar, z2);
            }
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean b(android.support.v7.view.menu.e eVar) {
            if (eVar == null) {
                return false;
            }
            c.this.F = ((android.support.v7.view.menu.m) eVar).getItem().getItemId();
            android.support.v7.view.menu.j.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.b(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, j0.g.f3120c, j0.g.f3119b);
        this.f1307y = new SparseBooleanArray();
        this.E = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f965j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof android.support.v7.view.menu.k.a) && ((android.support.v7.view.menu.k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        Object obj;
        RunnableC0011c runnableC0011c = this.C;
        if (runnableC0011c != null && (obj = this.f965j) != null) {
            ((View) obj).removeCallbacks(runnableC0011c);
            this.C = null;
            return true;
        }
        e eVar = this.A;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean B() {
        a aVar = this.B;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean C() {
        return this.C != null || D();
    }

    public boolean D() {
        e eVar = this.A;
        return eVar != null && eVar.d();
    }

    public void E(Configuration configuration) {
        if (!this.f1302t) {
            this.f1301s = m0.a.b(this.f958c).d();
        }
        android.support.v7.view.menu.e eVar = this.f959d;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void F(boolean z2) {
        this.f1305w = z2;
    }

    public void G(ActionMenuView actionMenuView) {
        this.f965j = actionMenuView;
        actionMenuView.b(this.f959d);
    }

    public void H(Drawable drawable) {
        d dVar = this.f1294l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1296n = true;
            this.f1295m = drawable;
        }
    }

    public void I(boolean z2) {
        this.f1297o = z2;
        this.f1298p = true;
    }

    public boolean J() {
        android.support.v7.view.menu.e eVar;
        if (!this.f1297o || D() || (eVar = this.f959d) == null || this.f965j == null || this.C != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0011c runnableC0011c = new RunnableC0011c(new e(this.f958c, this.f959d, this.f1294l, true));
        this.C = runnableC0011c;
        ((View) this.f965j).post(runnableC0011c);
        super.b(null);
        return true;
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public void a(android.support.v7.view.menu.e eVar, boolean z2) {
        x();
        super.a(eVar, z2);
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public boolean b(android.support.v7.view.menu.m mVar) {
        boolean z2 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        android.support.v7.view.menu.m mVar2 = mVar;
        while (mVar2.e0() != this.f959d) {
            mVar2 = (android.support.v7.view.menu.m) mVar2.e0();
        }
        View viewY = y(mVar2.getItem());
        if (viewY == null) {
            return false;
        }
        this.F = mVar.getItem().getItemId();
        int size = mVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = mVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
        }
        a aVar = new a(this.f958c, mVar, viewY);
        this.B = aVar;
        aVar.g(z2);
        this.B.k();
        super.b(mVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v7.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.support.v7.view.menu.g] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    @Override // android.support.v7.view.menu.j
    public boolean d() {
        ArrayList<android.support.v7.view.menu.g> arrayListE;
        int size;
        int i2;
        int iH;
        ?? r1;
        c cVar = this;
        android.support.v7.view.menu.e eVar = cVar.f959d;
        ?? r2 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i3 = cVar.f1301s;
        int i4 = cVar.f1300r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f965j;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            android.support.v7.view.menu.g gVar = arrayListE.get(i7);
            if (gVar.o()) {
                i5++;
            } else if (gVar.n()) {
                i6++;
            } else {
                z2 = true;
            }
            if (cVar.f1305w && gVar.isActionViewExpanded()) {
                i3 = 0;
            }
        }
        if (cVar.f1297o && (z2 || i6 + i5 > i3)) {
            i3--;
        }
        int i8 = i3 - i5;
        SparseBooleanArray sparseBooleanArray = cVar.f1307y;
        sparseBooleanArray.clear();
        if (cVar.f1303u) {
            int i9 = cVar.f1306x;
            iH = i4 / i9;
            i2 = i9 + ((i4 % i9) / iH);
        } else {
            i2 = 0;
            iH = 0;
        }
        int i10 = 0;
        int i11 = 0;
        ?? r3 = cVar;
        while (i10 < size) {
            android.support.v7.view.menu.g gVar2 = arrayListE.get(i10);
            if (gVar2.o()) {
                View viewN = r3.n(gVar2, r3.f1308z, viewGroup);
                if (r3.f1308z == null) {
                    r3.f1308z = viewN;
                }
                if (r3.f1303u) {
                    iH -= ActionMenuView.H(viewN, i2, iH, iMakeMeasureSpec, r2);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                r1 = r2;
                size = size;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i8 > 0 || z3) && i4 > 0 && (!r3.f1303u || iH > 0);
                boolean z5 = z4;
                if (z4) {
                    View viewN2 = r3.n(gVar2, r3.f1308z, viewGroup);
                    if (r3.f1308z == null) {
                        r3.f1308z = viewN2;
                    }
                    if (r3.f1303u) {
                        int iH2 = ActionMenuView.H(viewN2, i2, iH, iMakeMeasureSpec, 0);
                        iH -= iH2;
                        if (iH2 == 0) {
                            z5 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 = z5 & (!r3.f1303u ? i4 + i11 <= 0 : i4 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i12 = 0; i12 < i10; i12++) {
                        android.support.v7.view.menu.g gVar3 = arrayListE.get(i12);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i8++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z4) {
                    i8--;
                }
                gVar2.u(z4);
                r1 = 0;
            } else {
                r1 = r2;
                size = size;
                gVar2.u(r1);
            }
            i10++;
            r2 = r1;
            size = size;
            r3 = this;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public void g(Context context, android.support.v7.view.menu.e eVar) {
        super.g(context, eVar);
        Resources resources = context.getResources();
        m0.a aVarB = m0.a.b(context);
        if (!this.f1298p) {
            this.f1297o = aVarB.h();
        }
        if (!this.f1304v) {
            this.f1299q = aVarB.c();
        }
        if (!this.f1302t) {
            this.f1301s = aVarB.d();
        }
        int measuredWidth = this.f1299q;
        if (this.f1297o) {
            if (this.f1294l == null) {
                d dVar = new d(this.f957b);
                this.f1294l = dVar;
                if (this.f1296n) {
                    dVar.setImageDrawable(this.f1295m);
                    this.f1295m = null;
                    this.f1296n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1294l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1294l.getMeasuredWidth();
        } else {
            this.f1294l = null;
        }
        this.f1300r = measuredWidth;
        this.f1306x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f1308z = null;
    }

    @Override // android.support.v7.view.menu.a
    public void h(android.support.v7.view.menu.g gVar, android.support.v7.view.menu.k.a aVar) {
        aVar.b(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f965j);
        if (this.D == null) {
            this.D = new b();
        }
        actionMenuItemView.setPopupCallback(this.D);
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public void k(boolean z2) {
        super.k(z2);
        ((View) this.f965j).requestLayout();
        android.support.v7.view.menu.e eVar = this.f959d;
        boolean z3 = false;
        if (eVar != null) {
            ArrayList<android.support.v7.view.menu.g> arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i2 = 0; i2 < size; i2++) {
                g0.c cVarB = arrayListS.get(i2).b();
                if (cVarB != null) {
                    cVarB.i(this);
                }
            }
        }
        android.support.v7.view.menu.e eVar2 = this.f959d;
        ArrayList<android.support.v7.view.menu.g> arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f1297o && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z3 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.f1294l;
        if (z3) {
            if (dVar == null) {
                this.f1294l = new d(this.f957b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1294l.getParent();
            if (viewGroup != this.f965j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1294l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f965j;
                actionMenuView.addView(this.f1294l, actionMenuView.B());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f965j;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1294l);
            }
        }
        ((ActionMenuView) this.f965j).setOverflowReserved(this.f1297o);
    }

    @Override // android.support.v7.view.menu.a
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f1294l) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    @Override // android.support.v7.view.menu.a
    public View n(android.support.v7.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.a
    public android.support.v7.view.menu.k o(ViewGroup viewGroup) {
        android.support.v7.view.menu.k kVar = this.f965j;
        android.support.v7.view.menu.k kVarO = super.o(viewGroup);
        if (kVar != kVarO) {
            ((ActionMenuView) kVarO).setPresenter(this);
        }
        return kVarO;
    }

    @Override // android.support.v7.view.menu.a
    public boolean q(int i2, android.support.v7.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean x() {
        return B() | A();
    }

    public Drawable z() {
        d dVar = this.f1294l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1296n) {
            return this.f1295m;
        }
        return null;
    }
}
