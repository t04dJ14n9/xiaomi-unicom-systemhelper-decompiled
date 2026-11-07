package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends g0 implements android.support.v7.view.menu.e.b, android.support.v7.view.menu.k {
    private int A;
    e B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private android.support.v7.view.menu.e f1163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Context f1164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private android.support.v7.widget.c f1167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private android.support.v7.view.menu.j.a f1168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    android.support.v7.view.menu.e.a f1169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1171y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1172z;

    public interface a {
        boolean a();

        boolean c();
    }

    private static class b implements android.support.v7.view.menu.j.a {
        b() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z2) {
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean b(android.support.v7.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends g0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1176f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1177g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f1178h;

        public c(int i2, int i3) {
            super(i2, i3);
            this.f1173c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(c cVar) {
            super(cVar);
            this.f1173c = cVar.f1173c;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private class d implements android.support.v7.view.menu.e.a {
        d() {
        }

        @Override // android.support.v7.view.menu.e.a
        public void a(android.support.v7.view.menu.e eVar) {
            android.support.v7.view.menu.e.a aVar = ActionMenuView.this.f1169w;
            if (aVar != null) {
                aVar.a(eVar);
            }
        }

        @Override // android.support.v7.view.menu.e.a
        public boolean b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.B;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1172z = (int) (56.0f * f2);
        this.A = (int) (f2 * 4.0f);
        this.f1164r = context;
        this.f1165s = 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    static int H(View view, int i2, int i3, int i4, int i5) {
        int i6;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.f();
        if (i3 > 0) {
            i6 = 2;
            if (!z2 || i3 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i7 = measuredWidth / i2;
                if (measuredWidth % i2 != 0) {
                    i7++;
                }
                if (!z2 || i7 >= 2) {
                    i6 = i7;
                }
            } else {
                i6 = 0;
            }
        } else {
            i6 = 0;
        }
        cVar.f1176f = !cVar.f1173c && z2;
        cVar.f1174d = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), iMakeMeasureSpec);
        return i6;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void I(int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i6 = size - paddingLeft;
        int i7 = this.f1172z;
        int i8 = i6 / i7;
        int i9 = i6 % i7;
        if (i8 == 0) {
            setMeasuredDimension(i6, 0);
            return;
        }
        int i10 = i7 + (i9 / i8);
        int childCount = getChildCount();
        int iMax = 0;
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        int iMax2 = 0;
        int i13 = 0;
        long j2 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            int i14 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i15 = i12 + 1;
                if (z5) {
                    int i16 = this.A;
                    r14 = 0;
                    childAt.setPadding(i16, 0, i16, 0);
                } else {
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1178h = r14;
                cVar.f1175e = r14;
                cVar.f1174d = r14;
                cVar.f1176f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.f1177g = z5 && ((ActionMenuItemView) childAt).f();
                int iH = H(childAt, i10, cVar.f1173c ? 1 : i8, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iH);
                if (cVar.f1176f) {
                    i13++;
                }
                if (cVar.f1173c) {
                    z4 = true;
                }
                i8 -= iH;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iH == 1) {
                    j2 |= (long) (1 << i11);
                    iMax = iMax;
                }
                i12 = i15;
            }
            i11++;
            size2 = i14;
        }
        int i17 = size2;
        boolean z6 = z4 && i12 == 2;
        boolean z7 = false;
        while (true) {
            if (i13 <= 0 || i8 <= 0) {
                z2 = z7;
                i4 = iMax;
                break;
            }
            int i18 = Integer.MAX_VALUE;
            int i19 = 0;
            int i20 = 0;
            long j3 = 0;
            while (i20 < childCount) {
                boolean z8 = z7;
                c cVar2 = (c) getChildAt(i20).getLayoutParams();
                int i21 = iMax;
                if (cVar2.f1176f) {
                    int i22 = cVar2.f1174d;
                    if (i22 < i18) {
                        j3 = 1 << i20;
                        i18 = i22;
                        i19 = 1;
                    } else if (i22 == i18) {
                        i19++;
                        j3 |= 1 << i20;
                    }
                }
                i20++;
                iMax = i21;
                z7 = z8;
            }
            z2 = z7;
            i4 = iMax;
            j2 |= j3;
            if (i19 > i8) {
                break;
            }
            int i23 = i18 + 1;
            int i24 = 0;
            while (i24 < childCount) {
                View childAt2 = getChildAt(i24);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i25 = i6;
                int i26 = mode;
                long j4 = 1 << i24;
                if ((j3 & j4) == 0) {
                    if (cVar3.f1174d == i23) {
                        j2 |= j4;
                    }
                    z6 = z6;
                } else {
                    if (z6 && cVar3.f1177g && i8 == 1) {
                        int i27 = this.A;
                        childAt2.setPadding(i27 + i10, 0, i27, 0);
                    }
                    cVar3.f1174d++;
                    cVar3.f1178h = true;
                    i8--;
                }
                i24++;
                mode = i26;
                i6 = i25;
                z6 = z6;
            }
            iMax = i4;
            z7 = true;
        }
        boolean z9 = !z4 && i12 == 1;
        if (i8 <= 0 || j2 == 0 || (i8 >= i12 - 1 && !z9 && iMax2 <= 1)) {
            i5 = 0;
            z3 = z2;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (z9) {
                i5 = 0;
            } else {
                i5 = 0;
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1177g) {
                    fBitCount -= 0.5f;
                }
                int i28 = childCount - 1;
                if ((j2 & ((long) (1 << i28))) != 0 && !((c) getChildAt(i28).getLayoutParams()).f1177g) {
                    fBitCount -= 0.5f;
                }
            }
            int i29 = fBitCount > 0.0f ? (int) ((i8 * i10) / fBitCount) : i5;
            z3 = z2;
            for (int i30 = i5; i30 < childCount; i30++) {
                if ((j2 & ((long) (1 << i30))) != 0) {
                    View childAt3 = getChildAt(i30);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1175e = i29;
                        cVar4.f1178h = true;
                        if (i30 == 0 && !cVar4.f1177g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i29) / 2;
                        }
                        z3 = true;
                    } else if (cVar4.f1173c) {
                        cVar4.f1175e = i29;
                        cVar4.f1178h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i29) / 2;
                        z3 = true;
                    } else {
                        if (i30 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i29 / 2;
                        }
                        if (i30 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i29 / 2;
                        }
                    }
                }
            }
        }
        if (z3) {
            for (int i31 = i5; i31 < childCount; i31++) {
                View childAt4 = getChildAt(i31);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1178h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1174d * i10) + cVar5.f1175e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i6, mode != 1073741824 ? i4 : i17);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.g0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f1376b <= 0) {
            cVar.f1376b = 16;
        }
        return cVar;
    }

    public c B() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f1173c = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean C(int i2) {
        boolean zA = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).c();
    }

    public boolean D() {
        android.support.v7.widget.c cVar = this.f1167u;
        return cVar != null && cVar.A();
    }

    public boolean E() {
        android.support.v7.widget.c cVar = this.f1167u;
        return cVar != null && cVar.C();
    }

    public boolean F() {
        android.support.v7.widget.c cVar = this.f1167u;
        return cVar != null && cVar.D();
    }

    public boolean G() {
        return this.f1166t;
    }

    public android.support.v7.view.menu.e J() {
        return this.f1163q;
    }

    public void K(android.support.v7.view.menu.j.a aVar, android.support.v7.view.menu.e.a aVar2) {
        this.f1168v = aVar;
        this.f1169w = aVar2;
    }

    public boolean L() {
        android.support.v7.widget.c cVar = this.f1167u;
        return cVar != null && cVar.J();
    }

    @Override // android.support.v7.view.menu.e.b
    public boolean a(android.support.v7.view.menu.g gVar) {
        return this.f1163q.L(gVar, 0);
    }

    @Override // android.support.v7.view.menu.k
    public void b(android.support.v7.view.menu.e eVar) {
        this.f1163q = eVar;
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1163q == null) {
            Context context = getContext();
            android.support.v7.view.menu.e eVar = new android.support.v7.view.menu.e(context);
            this.f1163q = eVar;
            eVar.R(new d());
            android.support.v7.widget.c cVar = new android.support.v7.widget.c(context);
            this.f1167u = cVar;
            cVar.I(true);
            android.support.v7.widget.c cVar2 = this.f1167u;
            android.support.v7.view.menu.j.a bVar = this.f1168v;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.f(bVar);
            this.f1163q.c(this.f1167u, this.f1164r);
            this.f1167u.G(this);
        }
        return this.f1163q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1167u.z();
    }

    public int getPopupTheme() {
        return this.f1165s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.support.v7.widget.c cVar = this.f1167u;
        if (cVar != null) {
            cVar.k(false);
            if (this.f1167u.D()) {
                this.f1167u.A();
                this.f1167u.J();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f1170x) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zB = x0.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1173c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (C(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    C(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1173c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1173c) {
                int i19 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // android.support.v7.widget.g0, android.view.View
    protected void onMeasure(int i2, int i3) {
        android.support.v7.view.menu.e eVar;
        boolean z2 = this.f1170x;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1170x = z3;
        if (z2 != z3) {
            this.f1171y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1170x && (eVar = this.f1163q) != null && size != this.f1171y) {
            this.f1171y = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f1170x && childCount > 0) {
            I(i2, i3);
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar = (c) getChildAt(i4).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1167u.F(z2);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1167u.H(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.f1166t = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f1165s != i2) {
            this.f1165s = i2;
            if (i2 == 0) {
                this.f1164r = getContext();
            } else {
                this.f1164r = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(android.support.v7.widget.c cVar) {
        this.f1167u = cVar;
        cVar.G(this);
    }

    public void x() {
        android.support.v7.widget.c cVar = this.f1167u;
        if (cVar != null) {
            cVar.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.g0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f1376b = 16;
        return cVar;
    }

    @Override // android.support.v7.widget.g0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
