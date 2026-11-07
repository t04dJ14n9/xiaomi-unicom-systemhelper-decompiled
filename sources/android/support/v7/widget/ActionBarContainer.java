package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f1115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f1116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f1117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Drawable f1118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f1119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f1120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1121k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g0.m.s(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.j.f3151a);
        this.f1116f = typedArrayObtainStyledAttributes.getDrawable(j0.j.f3154b);
        this.f1117g = typedArrayObtainStyledAttributes.getDrawable(j0.j.f3160d);
        this.f1121k = typedArrayObtainStyledAttributes.getDimensionPixelSize(j0.j.f3176j, -1);
        boolean z2 = true;
        if (getId() == j0.f.G) {
            this.f1119i = true;
            this.f1118h = typedArrayObtainStyledAttributes.getDrawable(j0.j.f3157c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1119i ? this.f1116f != null || this.f1117g != null : this.f1118h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1116f;
        if (drawable != null && drawable.isStateful()) {
            this.f1116f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1117g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1117g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1118h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1118h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1113c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1116f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1117g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1118h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1114d = findViewById(j0.f.f3092a);
        this.f1115e = findViewById(j0.f.f3097f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1112b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:32:0x009d, B:34:0x00a1, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z2, i2, i3, i4, i5);
        View view2 = this.f1113c;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            view2.layout(i2, measuredHeight2 - i6, i4, measuredHeight - i6);
        }
        if (this.f1119i) {
            Drawable drawable3 = this.f1118h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = z4;
            }
        } else {
            if (this.f1116f != null) {
                if (this.f1114d.getVisibility() == 0) {
                    drawable2 = this.f1116f;
                    left = this.f1114d.getLeft();
                    top = this.f1114d.getTop();
                    right = this.f1114d.getRight();
                    view = this.f1114d;
                } else {
                    View view3 = this.f1115e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1116f.setBounds(0, 0, 0, 0);
                    } else {
                        drawable2 = this.f1116f;
                        left = this.f1115e.getLeft();
                        top = this.f1115e.getTop();
                        right = this.f1115e.getRight();
                        view = this.f1115e;
                    }
                    z4 = true;
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z4 = true;
            }
            this.f1120j = z5;
            if (!z5 || (drawable = this.f1117g) == null) {
                z3 = z4;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z3) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iA;
        View view;
        int size;
        int i4;
        if (this.f1114d == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1121k) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1114d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view2 = this.f1113c;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f1114d)) {
            if (b(this.f1115e)) {
                iA = 0;
            } else {
                view = this.f1115e;
            }
            if (mode == Integer.MIN_VALUE) {
                size = View.MeasureSpec.getSize(i3);
            } else {
                size = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f1113c), size));
        }
        view = this.f1114d;
        iA = a(view);
        if (mode == Integer.MIN_VALUE) {
            size = View.MeasureSpec.getSize(i3);
        } else {
            size = Integer.MAX_VALUE;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f1113c), size));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1116f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1116f);
        }
        this.f1116f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1114d;
            if (view != null) {
                this.f1116f.setBounds(view.getLeft(), this.f1114d.getTop(), this.f1114d.getRight(), this.f1114d.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f1119i ? this.f1116f != null || this.f1117g != null : this.f1118h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1118h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1118h);
        }
        this.f1118h = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1119i && (drawable2 = this.f1118h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1119i ? !(this.f1116f != null || this.f1117g != null) : this.f1118h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1117g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1117g);
        }
        this.f1117g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1120j && (drawable2 = this.f1117g) != null) {
                drawable2.setBounds(this.f1113c.getLeft(), this.f1113c.getTop(), this.f1113c.getRight(), this.f1113c.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f1119i ? this.f1116f != null || this.f1117g != null : this.f1118h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    public void setTabContainer(m0 m0Var) {
        View view = this.f1113c;
        if (view != null) {
            removeView(view);
        }
        this.f1113c = m0Var;
        if (m0Var != null) {
            addView(m0Var);
            ViewGroup.LayoutParams layoutParams = m0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            m0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f1112b = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1116f;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1117g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1118h;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1116f && !this.f1119i) || (drawable == this.f1117g && this.f1120j) || ((drawable == this.f1118h && this.f1119i) || super.verifyDrawable(drawable));
    }
}
