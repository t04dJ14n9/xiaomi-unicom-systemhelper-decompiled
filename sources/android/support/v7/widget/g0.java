package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f1366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f1368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f1369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f1370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1374p;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f1375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1376b;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1376b = -1;
            this.f1375a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1376b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.j.f3165e1);
            this.f1375a = typedArrayObtainStyledAttributes.getFloat(j0.j.f3171g1, 0.0f);
            this.f1376b = typedArrayObtainStyledAttributes.getInt(j0.j.f3168f1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1376b = -1;
        }
    }

    public g0(Context context) {
        this(context, null);
    }

    public g0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1360b = true;
        this.f1361c = -1;
        this.f1362d = 0;
        this.f1364f = 8388659;
        t0 t0VarT = t0.t(context, attributeSet, j0.j.U0, i2, 0);
        int iJ = t0VarT.j(j0.j.W0, -1);
        if (iJ >= 0) {
            setOrientation(iJ);
        }
        int iJ2 = t0VarT.j(j0.j.V0, -1);
        if (iJ2 >= 0) {
            setGravity(iJ2);
        }
        boolean zA = t0VarT.a(j0.j.X0, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f1366h = t0VarT.h(j0.j.Z0, -1.0f);
        this.f1361c = t0VarT.j(j0.j.Y0, -1);
        this.f1367i = t0VarT.a(j0.j.f3159c1, false);
        setDividerDrawable(t0VarT.f(j0.j.f3153a1));
        this.f1373o = t0VarT.j(j0.j.f3162d1, 0);
        this.f1374p = t0VarT.e(j0.j.f3156b1, 0);
        t0VarT.u();
    }

    private void g(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewO = o(i4);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = viewO.getMeasuredWidth();
                    measureChildWithMargins(viewO, i3, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void h(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewO = o(i4);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = viewO.getMeasuredHeight();
                    measureChildWithMargins(viewO, iMakeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    private void w(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    void c(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = x0.b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewO = o(i2);
            if (viewO != null && viewO.getVisibility() != 8 && p(i2)) {
                a aVar = (a) viewO.getLayoutParams();
                f(canvas, zB ? viewO.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1371m);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            if (viewO2 != null) {
                a aVar2 = (a) viewO2.getLayoutParams();
                if (zB) {
                    left = viewO2.getLeft();
                    paddingRight = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f1371m;
                } else {
                    right = viewO2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f1371m;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewO = o(i2);
            if (viewO != null && viewO.getVisibility() != 8 && p(i2)) {
                e(canvas, (viewO.getTop() - ((ViewGroup.MarginLayoutParams) ((a) viewO.getLayoutParams())).topMargin) - this.f1372n);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            e(canvas, viewO2 == null ? (getHeight() - getPaddingBottom()) - this.f1372n : viewO2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) viewO2.getLayoutParams())).bottomMargin);
        }
    }

    void e(Canvas canvas, int i2) {
        this.f1370l.setBounds(getPaddingLeft() + this.f1374p, i2, (getWidth() - getPaddingRight()) - this.f1374p, this.f1372n + i2);
        this.f1370l.draw(canvas);
    }

    void f(Canvas canvas, int i2) {
        this.f1370l.setBounds(i2, getPaddingTop() + this.f1374p, this.f1371m + i2, (getHeight() - getPaddingBottom()) - this.f1374p);
        this.f1370l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f1361c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1361c;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1361c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1362d;
        if (this.f1363e == 1 && (i2 = this.f1364f & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1365g) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1365g;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1361c;
    }

    public Drawable getDividerDrawable() {
        return this.f1370l;
    }

    public int getDividerPadding() {
        return this.f1374p;
    }

    public int getDividerWidth() {
        return this.f1371m;
    }

    public int getGravity() {
        return this.f1364f;
    }

    public int getOrientation() {
        return this.f1363e;
    }

    public int getShowDividers() {
        return this.f1373o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1366h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i2 = this.f1363e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int l(View view, int i2) {
        return 0;
    }

    int m(View view) {
        return 0;
    }

    int n(View view) {
        return 0;
    }

    View o(int i2) {
        return getChildAt(i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1370l == null) {
            return;
        }
        if (this.f1363e == 1) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(g0.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(g0.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.f1363e == 1) {
            r(i2, i3, i4, i5);
        } else {
            q(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f1363e == 1) {
            v(i2, i3);
        } else {
            t(i2, i3);
        }
    }

    protected boolean p(int i2) {
        if (i2 == 0) {
            return (this.f1373o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f1373o & 4) != 0;
        }
        if ((this.f1373o & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    void q(int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int i6;
        int i7;
        boolean z2;
        int baseline;
        int i8;
        int i9;
        int measuredHeight;
        boolean zB = x0.b(this);
        int paddingTop = getPaddingTop();
        int i10 = i5 - i3;
        int paddingBottom = i10 - getPaddingBottom();
        int paddingBottom2 = (i10 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i11 = this.f1364f;
        int i12 = i11 & 112;
        boolean z3 = this.f1360b;
        int[] iArr = this.f1368j;
        int[] iArr2 = this.f1369k;
        int iA = g0.d.a(8388615 & i11, g0.m.e(this));
        boolean z4 = true;
        if (iA != 1) {
            paddingLeft = iA != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f1365g;
        } else {
            paddingLeft = getPaddingLeft() + (((i4 - i2) - this.f1365g) / 2);
        }
        if (zB) {
            i6 = virtualChildCount - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        int iL = 0;
        while (iL < virtualChildCount) {
            int i13 = i6 + (i7 * iL);
            View viewO = o(i13);
            if (viewO == null) {
                paddingLeft += u(i13);
                z2 = z4;
            } else {
                if (viewO.getVisibility() != 8) {
                    int measuredWidth = viewO.getMeasuredWidth();
                    int measuredHeight2 = viewO.getMeasuredHeight();
                    a aVar = (a) viewO.getLayoutParams();
                    int i14 = iL;
                    if (z3) {
                        virtualChildCount = virtualChildCount;
                        baseline = ((ViewGroup.MarginLayoutParams) aVar).height != -1 ? viewO.getBaseline() : -1;
                        i8 = aVar.f1376b;
                        if (i8 < 0) {
                            i8 = i12;
                        }
                        i9 = i8 & 112;
                        i12 = i12;
                        if (i9 != 16) {
                            if (i9 != 48) {
                                measuredHeight = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                                if (baseline != -1) {
                                    z2 = true;
                                    measuredHeight += iArr[1] - baseline;
                                }
                            } else if (i9 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (viewO.getMeasuredHeight() - baseline);
                                }
                            }
                            z2 = true;
                        } else {
                            z2 = true;
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        if (p(i13)) {
                            paddingLeft += this.f1371m;
                        }
                        int i15 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        w(viewO, i15 + m(viewO), measuredHeight, measuredWidth, measuredHeight2);
                        int iN = i15 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(viewO);
                        iL = i14 + l(viewO, i13);
                        paddingLeft = iN;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i8 = aVar.f1376b;
                    if (i8 < 0) {
                        i8 = i12;
                    }
                    i9 = i8 & 112;
                    i12 = i12;
                    if (i9 != 16) {
                        if (i9 != 48) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                z2 = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i9 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewO.getMeasuredHeight() - baseline);
                            }
                        }
                        z2 = true;
                    } else {
                        z2 = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    }
                    if (p(i13)) {
                        paddingLeft += this.f1371m;
                    }
                    int i16 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    w(viewO, i16 + m(viewO), measuredHeight, measuredWidth, measuredHeight2);
                    int iN2 = i16 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(viewO);
                    iL = i14 + l(viewO, i13);
                    paddingLeft = iN2;
                } else {
                    z2 = true;
                }
                iL++;
                virtualChildCount = virtualChildCount;
                i12 = i12;
                z4 = z2;
                paddingTop = paddingTop;
            }
            iL++;
            virtualChildCount = virtualChildCount;
            i12 = i12;
            z4 = z2;
            paddingTop = paddingTop;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    void r(int i2, int i3, int i4, int i5) {
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f1364f;
        int i11 = i10 & 112;
        int i12 = i10 & 8388615;
        if (i11 != 16) {
            paddingTop = i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f1365g;
        } else {
            paddingTop = getPaddingTop() + (((i5 - i3) - this.f1365g) / 2);
        }
        int iL = 0;
        while (iL < virtualChildCount) {
            View viewO = o(iL);
            if (viewO == null) {
                paddingTop += u(iL);
            } else {
                if (viewO.getVisibility() != 8) {
                    int measuredWidth = viewO.getMeasuredWidth();
                    int measuredHeight = viewO.getMeasuredHeight();
                    a aVar = (a) viewO.getLayoutParams();
                    int i13 = aVar.f1376b;
                    if (i13 < 0) {
                        i13 = i12;
                    }
                    int iA = g0.d.a(i13, g0.m.e(this)) & 7;
                    if (iA != 1) {
                        if (iA != 5) {
                            i7 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i6 = paddingRight - measuredWidth;
                        }
                        int i14 = i7;
                        if (p(iL)) {
                            paddingTop += this.f1372n;
                        }
                        int i15 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        w(viewO, i14, i15 + m(viewO), measuredWidth, measuredHeight);
                        int iN = i15 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(viewO);
                        iL += l(viewO, iL);
                        paddingTop = iN;
                        i8 = 1;
                    } else {
                        i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    }
                    i7 = i6 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                    int i16 = i7;
                    if (p(iL)) {
                        paddingTop += this.f1372n;
                    }
                    int i17 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    w(viewO, i16, i17 + m(viewO), measuredWidth, measuredHeight);
                    int iN2 = i17 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(viewO);
                    iL += l(viewO, iL);
                    paddingTop = iN2;
                    i8 = 1;
                }
                iL += i8;
            }
            i8 = 1;
            iL += i8;
        }
    }

    void s(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    public void setBaselineAligned(boolean z2) {
        this.f1360b = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f1361c = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1370l) {
            return;
        }
        this.f1370l = drawable;
        if (drawable != null) {
            this.f1371m = drawable.getIntrinsicWidth();
            this.f1372n = drawable.getIntrinsicHeight();
        } else {
            this.f1371m = 0;
            this.f1372n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f1374p = i2;
    }

    public void setGravity(int i2) {
        if (this.f1364f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1364f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1364f;
        if ((8388615 & i4) != i3) {
            this.f1364f = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f1367i = z2;
    }

    public void setOrientation(int i2) {
        if (this.f1363e != i2) {
            this.f1363e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f1373o) {
            requestLayout();
        }
        this.f1373o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f1364f;
        if ((i4 & 112) != i3) {
            this.f1364f = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1366h = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03b1 A[PHI: r3
      0x03b1: PHI (r3v32 int) = (r3v28 int), (r3v33 int) binds: [B:168:0x03af, B:164:0x03a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x043f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:70:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d7  */
    void t(int i2, int i3) {
        int[] iArr;
        int i4;
        int iMax;
        int iMax2;
        int i5;
        int i6;
        int baseline;
        int i7;
        int i8;
        byte b2;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        View view;
        int iMax3;
        int i11;
        boolean z4;
        int i12;
        int measuredHeight;
        int iL;
        int baseline2;
        int i13;
        this.f1365g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (this.f1368j == null || this.f1369k == null) {
            this.f1368j = new int[4];
            this.f1369k = new int[4];
        }
        int[] iArr2 = this.f1368j;
        int[] iArr3 = this.f1369k;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z5 = this.f1360b;
        boolean z6 = this.f1367i;
        int i14 = 1073741824;
        boolean z7 = mode == 1073741824;
        int iL2 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        int iMax7 = 0;
        boolean z8 = false;
        int iCombineMeasuredStates = 0;
        boolean z9 = false;
        boolean z10 = true;
        float f2 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iL2 >= virtualChildCount) {
                break;
            }
            View viewO = o(iL2);
            if (viewO == null) {
                this.f1365g += u(iL2);
            } else {
                if (viewO.getVisibility() == 8) {
                    iL2 += l(viewO, iL2);
                } else {
                    if (p(iL2)) {
                        this.f1365g += this.f1371m;
                    }
                    a aVar = (a) viewO.getLayoutParams();
                    float f3 = aVar.f1375a;
                    float f4 = f2 + f3;
                    if (mode == i14 && ((ViewGroup.MarginLayoutParams) aVar).width == 0 && f3 > 0.0f) {
                        int i15 = this.f1365g;
                        this.f1365g = z7 ? i15 + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : Math.max(i15, ((ViewGroup.MarginLayoutParams) aVar).leftMargin + i15 + ((ViewGroup.MarginLayoutParams) aVar).rightMargin);
                        if (z5) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewO.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i10 = iL2;
                            z2 = z6;
                            z3 = z5;
                            view = viewO;
                        } else {
                            i10 = iL2;
                            z2 = z6;
                            z3 = z5;
                            view = viewO;
                            z8 = true;
                            i11 = 1073741824;
                        }
                        if (mode2 == i11 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            z4 = true;
                            z9 = true;
                        } else {
                            z4 = false;
                        }
                        i12 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i12;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z3 && (baseline2 = view.getBaseline()) != -1) {
                            i13 = aVar.f1376b;
                            if (i13 < 0) {
                                i13 = this.f1364f;
                            }
                            int i16 = (((i13 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i16] = Math.max(iArr2[i16], baseline2);
                            iArr[i16] = Math.max(iArr[i16], measuredHeight - baseline2);
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                        if (z10 || ((ViewGroup.MarginLayoutParams) aVar).height != -1) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (aVar.f1375a > 0.0f) {
                            if (!z4) {
                                i12 = measuredHeight;
                            }
                            iMax7 = Math.max(iMax7, i12);
                        } else {
                            int i17 = iMax7;
                            if (!z4) {
                                i12 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i12);
                            iMax7 = i17;
                        }
                        int i18 = i10;
                        iL = l(view, i18) + i18;
                        f2 = f4;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) aVar).width != 0 || f3 <= 0.0f) {
                            b2 = -2;
                            i9 = Integer.MIN_VALUE;
                        } else {
                            b2 = -2;
                            ((ViewGroup.MarginLayoutParams) aVar).width = -2;
                            i9 = 0;
                        }
                        i10 = iL2;
                        int i19 = i9;
                        z2 = z6;
                        z3 = z5;
                        s(viewO, i10, i2, f4 == 0.0f ? this.f1365g : 0, i3, 0);
                        if (i19 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) aVar).width = i19;
                        }
                        int measuredWidth = viewO.getMeasuredWidth();
                        if (z7) {
                            view = viewO;
                            iMax3 = this.f1365g + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(view);
                        } else {
                            view = viewO;
                            int i20 = this.f1365g;
                            iMax3 = Math.max(i20, i20 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(view));
                        }
                        this.f1365g = iMax3;
                        if (z2) {
                            iMax4 = Math.max(measuredWidth, iMax4);
                        }
                    }
                    i11 = 1073741824;
                    if (mode2 == i11) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i12 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i12;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z3) {
                        i13 = aVar.f1376b;
                        if (i13 < 0) {
                            i13 = this.f1364f;
                        }
                        int i110 = (((i13 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i110] = Math.max(iArr2[i110], baseline2);
                        iArr[i110] = Math.max(iArr[i110], measuredHeight - baseline2);
                    }
                    iMax5 = Math.max(iMax5, measuredHeight);
                    if (z10) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (aVar.f1375a > 0.0f) {
                        if (!z4) {
                            i12 = measuredHeight;
                        }
                        iMax7 = Math.max(iMax7, i12);
                    } else {
                        int i111 = iMax7;
                        if (!z4) {
                            i12 = measuredHeight;
                        }
                        iMax6 = Math.max(iMax6, i12);
                        iMax7 = i111;
                    }
                    int i112 = i10;
                    iL = l(view, i112) + i112;
                    f2 = f4;
                }
                int i21 = iL + 1;
                iArr3 = iArr;
                z6 = z2;
                z5 = z3;
                i14 = i11;
                iL2 = i21;
            }
            z2 = z6;
            z3 = z5;
            int i22 = i14;
            iL = iL2;
            i11 = i22;
            int i23 = iL + 1;
            iArr3 = iArr;
            z6 = z2;
            z5 = z3;
            i14 = i11;
            iL2 = i23;
        }
        boolean z11 = z6;
        boolean z12 = z5;
        int i24 = iMax5;
        int i25 = iMax6;
        int i26 = iMax7;
        int i27 = iCombineMeasuredStates;
        if (this.f1365g > 0 && p(virtualChildCount)) {
            this.f1365g += this.f1371m;
        }
        int i28 = iArr2[1];
        int iMax8 = (i28 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i24 : Math.max(i24, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i28, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z11 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f1365g = 0;
            int iL3 = 0;
            while (iL3 < virtualChildCount) {
                View viewO2 = o(iL3);
                if (viewO2 == null) {
                    this.f1365g += u(iL3);
                } else if (viewO2.getVisibility() == 8) {
                    iL3 += l(viewO2, iL3);
                } else {
                    a aVar2 = (a) viewO2.getLayoutParams();
                    int i29 = this.f1365g;
                    if (z7) {
                        this.f1365g = i29 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + iMax4 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + n(viewO2);
                    } else {
                        this.f1365g = Math.max(i29, i29 + iMax4 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + n(viewO2));
                    }
                    iL3++;
                    iMax8 = iMax8;
                }
                iL3++;
                iMax8 = iMax8;
            }
        }
        int i30 = iMax8;
        int paddingLeft = this.f1365g + getPaddingLeft() + getPaddingRight();
        this.f1365g = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, 0);
        int i31 = (16777215 & iResolveSizeAndState) - this.f1365g;
        if (z8 || (i31 != 0 && f2 > 0.0f)) {
            float f5 = this.f1366h;
            if (f5 > 0.0f) {
                f2 = f5;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f1365g = 0;
            int i32 = i25;
            int iMax9 = -1;
            int iCombineMeasuredStates2 = i27;
            int i33 = 0;
            while (i33 < virtualChildCount) {
                View viewO3 = o(i33);
                if (viewO3 == null || viewO3.getVisibility() == 8) {
                    i5 = i31;
                    virtualChildCount = virtualChildCount;
                } else {
                    a aVar3 = (a) viewO3.getLayoutParams();
                    float f6 = aVar3.f1375a;
                    if (f6 > 0.0f) {
                        int measuredWidth2 = (int) ((i31 * f6) / f2);
                        float f7 = f2 - f6;
                        int i34 = i31 - measuredWidth2;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar3).height);
                        if (((ViewGroup.MarginLayoutParams) aVar3).width == 0) {
                            i8 = 1073741824;
                            if (mode == 1073741824) {
                                if (measuredWidth2 <= 0) {
                                    measuredWidth2 = 0;
                                }
                            }
                            viewO3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i8), childMeasureSpec);
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewO3.getMeasuredState() & (-16777216));
                            f2 = f7;
                            i5 = i34;
                        } else {
                            i8 = 1073741824;
                        }
                        measuredWidth2 = viewO3.getMeasuredWidth() + measuredWidth2;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewO3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i8), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewO3.getMeasuredState() & (-16777216));
                        f2 = f7;
                        i5 = i34;
                    } else {
                        i5 = i31;
                    }
                    int i35 = this.f1365g;
                    if (z7) {
                        this.f1365g = i35 + viewO3.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + n(viewO3);
                    } else {
                        this.f1365g = Math.max(i35, viewO3.getMeasuredWidth() + i35 + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + n(viewO3));
                    }
                    boolean z13 = mode2 != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == -1;
                    int i36 = ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewO3.getMeasuredHeight() + i36;
                    iMax9 = Math.max(iMax9, measuredHeight2);
                    if (!z13) {
                        i36 = measuredHeight2;
                    }
                    int iMax10 = Math.max(i32, i36);
                    if (z10) {
                        i6 = -1;
                        boolean z14 = ((ViewGroup.MarginLayoutParams) aVar3).height == -1;
                        if (z12 && (baseline = viewO3.getBaseline()) != i6) {
                            i7 = aVar3.f1376b;
                            if (i7 < 0) {
                                i7 = this.f1364f;
                            }
                            int i37 = (((i7 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i37] = Math.max(iArr2[i37], baseline);
                            iArr[i37] = Math.max(iArr[i37], measuredHeight2 - baseline);
                        }
                        z10 = z14;
                        i32 = iMax10;
                        f2 = f2;
                    } else {
                        i6 = -1;
                    }
                    if (z12) {
                        i7 = aVar3.f1376b;
                        if (i7 < 0) {
                            i7 = this.f1364f;
                        }
                        int i38 = (((i7 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i38] = Math.max(iArr2[i38], baseline);
                        iArr[i38] = Math.max(iArr[i38], measuredHeight2 - baseline);
                    }
                    z10 = z14;
                    i32 = iMax10;
                    f2 = f2;
                }
                i33++;
                i31 = i5;
                virtualChildCount = virtualChildCount;
            }
            i4 = virtualChildCount;
            this.f1365g += getPaddingLeft() + getPaddingRight();
            int i39 = iArr2[1];
            iMax = (i39 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax9 : Math.max(iMax9, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i39, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax2 = i32;
            i27 = iCombineMeasuredStates2;
        } else {
            iMax2 = Math.max(i25, i26);
            if (z11 && mode != 1073741824) {
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View viewO4 = o(i40);
                    if (viewO4 != null && viewO4.getVisibility() != 8 && ((a) viewO4.getLayoutParams()).f1375a > 0.0f) {
                        viewO4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(viewO4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = virtualChildCount;
            iMax = i30;
        }
        if (z10 || mode2 == 1073741824) {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState | (i27 & (-16777216)), View.resolveSizeAndState(Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i27 << 16));
        if (z9) {
            g(i4, i2);
        }
    }

    int u(int i2) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02dc A[PHI: r10
      0x02dc: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:135:0x02da, B:131:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x031b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0329  */
    void v(int i2, int i3) {
        int i4;
        int iCombineMeasuredStates;
        int iMax;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        int i8;
        int iMax2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View view;
        int iMax3;
        boolean z4;
        int iMax4;
        this.f1365g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i17 = this.f1361c;
        boolean z5 = this.f1367i;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iMax5 = 0;
        int i21 = 0;
        int iL = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = true;
        float f2 = 0.0f;
        while (true) {
            int i22 = 8;
            int i23 = iMax5;
            if (iL >= virtualChildCount) {
                int i24 = i18;
                int i25 = i20;
                int i26 = i21;
                int i27 = virtualChildCount;
                int i28 = mode2;
                int iMax6 = i19;
                if (this.f1365g > 0) {
                    i4 = i27;
                    if (p(i4)) {
                        this.f1365g += this.f1372n;
                    }
                } else {
                    i4 = i27;
                }
                if (z5 && (i28 == Integer.MIN_VALUE || i28 == 0)) {
                    this.f1365g = 0;
                    int iL2 = 0;
                    while (iL2 < i4) {
                        View viewO = o(iL2);
                        if (viewO == null) {
                            iMax2 = this.f1365g + u(iL2);
                        } else {
                            if (viewO.getVisibility() == i22) {
                                iL2 += l(viewO, iL2);
                            } else {
                                a aVar = (a) viewO.getLayoutParams();
                                int i29 = this.f1365g;
                                iMax2 = Math.max(i29, i29 + i25 + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(viewO));
                            }
                            iL2++;
                            i22 = 8;
                        }
                        this.f1365g = iMax2;
                        iL2++;
                        i22 = 8;
                    }
                }
                int paddingTop = this.f1365g + getPaddingTop() + getPaddingBottom();
                this.f1365g = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, 0);
                int i30 = (16777215 & iResolveSizeAndState) - this.f1365g;
                if (z6 || (i30 != 0 && f2 > 0.0f)) {
                    float f3 = this.f1366h;
                    if (f3 > 0.0f) {
                        f2 = f3;
                    }
                    this.f1365g = 0;
                    int i31 = i30;
                    int i32 = i26;
                    iCombineMeasuredStates = i24;
                    int i33 = 0;
                    while (i33 < i4) {
                        View viewO2 = o(i33);
                        if (viewO2.getVisibility() == 8) {
                            i5 = i31;
                        } else {
                            a aVar2 = (a) viewO2.getLayoutParams();
                            float f4 = aVar2.f1375a;
                            if (f4 > 0.0f) {
                                int measuredHeight = (int) ((i31 * f4) / f2);
                                float f5 = f2 - f4;
                                i5 = i31 - measuredHeight;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin, ((ViewGroup.MarginLayoutParams) aVar2).width);
                                if (((ViewGroup.MarginLayoutParams) aVar2).height == 0) {
                                    i8 = 1073741824;
                                    if (i28 == 1073741824) {
                                        if (measuredHeight <= 0) {
                                            measuredHeight = 0;
                                        }
                                    }
                                    viewO2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewO2.getMeasuredState() & (-256));
                                    f2 = f5;
                                } else {
                                    i8 = 1073741824;
                                }
                                measuredHeight = viewO2.getMeasuredHeight() + measuredHeight;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewO2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewO2.getMeasuredState() & (-256));
                                f2 = f5;
                            } else {
                                i5 = i31;
                            }
                            int i34 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewO2.getMeasuredWidth() + i34;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            float f6 = f2;
                            if (mode != 1073741824) {
                                i6 = iCombineMeasuredStates;
                                i7 = -1;
                                z2 = ((ViewGroup.MarginLayoutParams) aVar2).width == -1;
                                if (!z2) {
                                    i34 = measuredWidth;
                                }
                                int iMax7 = Math.max(i32, i34);
                                if (z8 || ((ViewGroup.MarginLayoutParams) aVar2).width != i7) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                int i35 = this.f1365g;
                                this.f1365g = Math.max(i35, viewO2.getMeasuredHeight() + i35 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + n(viewO2));
                                z8 = z3;
                                iCombineMeasuredStates = i6;
                                i32 = iMax7;
                                f2 = f6;
                            } else {
                                i6 = iCombineMeasuredStates;
                                i7 = -1;
                            }
                            if (!z2) {
                                i34 = measuredWidth;
                            }
                            int iMax8 = Math.max(i32, i34);
                            if (z8) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            int i36 = this.f1365g;
                            this.f1365g = Math.max(i36, viewO2.getMeasuredHeight() + i36 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + n(viewO2));
                            z8 = z3;
                            iCombineMeasuredStates = i6;
                            i32 = iMax8;
                            f2 = f6;
                        }
                        i33++;
                        i31 = i5;
                    }
                    this.f1365g += getPaddingTop() + getPaddingBottom();
                    iMax = i32;
                } else {
                    iMax = Math.max(i26, i23);
                    if (z5 && i28 != 1073741824) {
                        for (int i37 = 0; i37 < i4; i37++) {
                            View viewO3 = o(i37);
                            if (viewO3 != null && viewO3.getVisibility() != 8 && ((a) viewO3.getLayoutParams()).f1375a > 0.0f) {
                                viewO3.measure(View.MeasureSpec.makeMeasureSpec(viewO3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i24;
                }
                if (z8 || mode == 1073741824) {
                    iMax = iMax6;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates), iResolveSizeAndState);
                if (z7) {
                    h(i4, i3);
                    return;
                }
                return;
            }
            View viewO4 = o(iL);
            if (viewO4 == null) {
                this.f1365g += u(iL);
                i12 = virtualChildCount;
                i13 = mode2;
                iMax5 = i23;
            } else {
                int i38 = i18;
                if (viewO4.getVisibility() == 8) {
                    iL += l(viewO4, iL);
                    i12 = virtualChildCount;
                    iMax5 = i23;
                    i18 = i38;
                    i13 = mode2;
                } else {
                    if (p(iL)) {
                        this.f1365g += this.f1372n;
                    }
                    a aVar3 = (a) viewO4.getLayoutParams();
                    float f7 = aVar3.f1375a;
                    float f8 = f2 + f7;
                    if (mode2 == 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == 0 && f7 > 0.0f) {
                        int i39 = this.f1365g;
                        this.f1365g = Math.max(i39, ((ViewGroup.MarginLayoutParams) aVar3).topMargin + i39 + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin);
                        iMax3 = i20;
                        view = viewO4;
                        i15 = i21;
                        z6 = true;
                        i10 = i38;
                        i11 = i19;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i14 = i23;
                        i16 = iL;
                    } else {
                        int i40 = i19;
                        if (((ViewGroup.MarginLayoutParams) aVar3).height != 0 || f7 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = -2;
                            i9 = 0;
                        }
                        i10 = i38;
                        int i41 = i9;
                        i11 = i40;
                        int i42 = i20;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i14 = i23;
                        i15 = i21;
                        i16 = iL;
                        s(viewO4, iL, i2, 0, i3, f8 == 0.0f ? this.f1365g : 0);
                        if (i41 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = i41;
                        }
                        int measuredHeight2 = viewO4.getMeasuredHeight();
                        int i43 = this.f1365g;
                        view = viewO4;
                        this.f1365g = Math.max(i43, i43 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin + n(view));
                        iMax3 = z5 ? Math.max(measuredHeight2, i42) : i42;
                    }
                    if (i17 >= 0 && i17 == i16 + 1) {
                        this.f1362d = this.f1365g;
                    }
                    if (i16 < i17 && aVar3.f1375a > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) aVar3).width != -1) {
                        z4 = false;
                    } else {
                        z4 = true;
                        z7 = true;
                    }
                    int i44 = ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i44;
                    int iMax9 = Math.max(i11, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i10, view.getMeasuredState());
                    z8 = z8 && ((ViewGroup.MarginLayoutParams) aVar3).width == -1;
                    if (aVar3.f1375a > 0.0f) {
                        if (!z4) {
                            i44 = measuredWidth2;
                        }
                        iMax5 = Math.max(i14, i44);
                        iMax4 = i15;
                    } else {
                        if (!z4) {
                            i44 = measuredWidth2;
                        }
                        iMax4 = Math.max(i15, i44);
                        iMax5 = i14;
                    }
                    int iL3 = l(view, i16) + i16;
                    i20 = iMax3;
                    f2 = f8;
                    i21 = iMax4;
                    i18 = iCombineMeasuredStates2;
                    iL = iL3;
                    i19 = iMax9;
                }
            }
            iL++;
            mode2 = i13;
            virtualChildCount = i12;
        }
    }
}
