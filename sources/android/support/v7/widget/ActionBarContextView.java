package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends android.support.v7.widget.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f1122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f1123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f1124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f1125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearLayout f1126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f1127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f1128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1132t;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0.b f1133b;

        a(m0.b bVar) {
            this.f1133b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1133b.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.f3033j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        t0 t0VarT = t0.t(context, attributeSet, j0.j.f3206y, i2, 0);
        g0.m.s(this, t0VarT.f(j0.j.f3208z));
        this.f1129q = t0VarT.m(j0.j.D, 0);
        this.f1130r = t0VarT.m(j0.j.C, 0);
        this.f1286f = t0VarT.l(j0.j.B, 0);
        this.f1132t = t0VarT.m(j0.j.A, j0.g.f3121d);
        t0VarT.u();
    }

    private void i() {
        if (this.f1126n == null) {
            LayoutInflater.from(getContext()).inflate(j0.g.f3118a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1126n = linearLayout;
            this.f1127o = (TextView) linearLayout.findViewById(j0.f.f3096e);
            this.f1128p = (TextView) this.f1126n.findViewById(j0.f.f3095d);
            if (this.f1129q != 0) {
                this.f1127o.setTextAppearance(getContext(), this.f1129q);
            }
            if (this.f1130r != 0) {
                this.f1128p.setTextAppearance(getContext(), this.f1130r);
            }
        }
        this.f1127o.setText(this.f1122j);
        this.f1128p.setText(this.f1123k);
        boolean z2 = !TextUtils.isEmpty(this.f1122j);
        boolean z3 = !TextUtils.isEmpty(this.f1123k);
        int i2 = 0;
        this.f1128p.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1126n;
        if (!z2 && !z3) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f1126n.getParent() == null) {
            addView(this.f1126n);
        }
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ g0.q f(int i2, long j2) {
        return super.f(i2, j2);
    }

    public void g() {
        if (this.f1124l == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1123k;
    }

    public CharSequence getTitle() {
        return this.f1122j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    public void h(m0.b bVar) {
        View viewInflate;
        c cVar;
        View view = this.f1124l;
        if (view != null) {
            if (view.getParent() == null) {
                viewInflate = this.f1124l;
            }
            this.f1124l.findViewById(j0.f.f3100i).setOnClickListener(new a(bVar));
            android.support.v7.view.menu.e eVar = (android.support.v7.view.menu.e) bVar.e();
            cVar = this.f1285e;
            if (cVar != null) {
                cVar.x();
            }
            c cVar2 = new c(getContext());
            this.f1285e = cVar2;
            cVar2.I(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            eVar.c(this.f1285e, this.f1283c);
            ActionMenuView actionMenuView = (ActionMenuView) this.f1285e.o(this);
            this.f1284d = actionMenuView;
            g0.m.s(actionMenuView, null);
            addView(this.f1284d, layoutParams);
        }
        viewInflate = LayoutInflater.from(getContext()).inflate(this.f1132t, (ViewGroup) this, false);
        this.f1124l = viewInflate;
        addView(viewInflate);
        this.f1124l.findViewById(j0.f.f3100i).setOnClickListener(new a(bVar));
        android.support.v7.view.menu.e eVar2 = (android.support.v7.view.menu.e) bVar.e();
        cVar = this.f1285e;
        if (cVar != null) {
            cVar.x();
        }
        c cVar3 = new c(getContext());
        this.f1285e = cVar3;
        cVar3.I(true);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        eVar2.c(this.f1285e, this.f1283c);
        ActionMenuView actionMenuView2 = (ActionMenuView) this.f1285e.o(this);
        this.f1284d = actionMenuView2;
        g0.m.s(actionMenuView2, null);
        addView(this.f1284d, layoutParams2);
    }

    public boolean j() {
        return this.f1131s;
    }

    public void k() {
        removeAllViews();
        this.f1125m = null;
        this.f1284d = null;
    }

    public boolean l() {
        c cVar = this.f1285e;
        if (cVar != null) {
            return cVar.J();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1285e;
        if (cVar != null) {
            cVar.A();
            this.f1285e.B();
        }
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1122j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean zB = x0.b(this);
        int paddingRight = zB ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1124l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1124l.getLayoutParams();
            int i6 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = android.support.v7.widget.a.d(paddingRight, i6, zB);
            paddingRight = android.support.v7.widget.a.d(iD + e(this.f1124l, iD, paddingTop, paddingTop2, zB), i7, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f1126n;
        if (linearLayout != null && this.f1125m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f1126n, iE, paddingTop, paddingTop2, zB);
        }
        int i8 = iE;
        View view2 = this.f1125m;
        if (view2 != null) {
            e(view2, i8, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1284d;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f1286f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1124l;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1124l.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1284d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f1284d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1126n;
        if (linearLayout != null && this.f1125m == null) {
            if (this.f1131s) {
                this.f1126n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1126n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1126n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f1125m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f1125m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f1286f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.a
    public void setContentHeight(int i2) {
        this.f1286f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1125m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1125m = view;
        if (view != null && (linearLayout = this.f1126n) != null) {
            removeView(linearLayout);
            this.f1126n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1123k = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1122j = charSequence;
        i();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1131s) {
            requestLayout();
        }
        this.f1131s = z2;
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
