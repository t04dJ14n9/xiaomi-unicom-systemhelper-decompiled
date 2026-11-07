package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import g0.m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements g0.j {
    private static final a B = new a();
    private static final int[] C = {R.attr.fillViewport};
    private b A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OverScroller f662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EdgeEffect f663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EdgeEffect f664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f678t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f679u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c f681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final g0.k f682x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g0.i f683y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f684z;

    static class a extends g0.b {
        a() {
        }

        @Override // g0.b
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            h0.c.a(accessibilityEvent, nestedScrollView.getScrollX());
            h0.c.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // g0.b
        public void e(View view, h0.a aVar) {
            int scrollRange;
            super.e(view, aVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            aVar.u(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            aVar.v(true);
            if (nestedScrollView.getScrollY() > 0) {
                aVar.a(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                aVar.a(4096);
            }
        }

        @Override // g0.b
        public boolean h(View view, int i2, Bundle bundle) {
            if (super.h(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 == 4096) {
                int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.J(0, iMin);
                return true;
            }
            if (i2 != 8192) {
                return false;
            }
            int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
            if (iMax == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.J(0, iMax);
            return true;
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f685b;

        static class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f685b = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f685b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f685b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f661c = new Rect();
        this.f666h = true;
        this.f667i = false;
        this.f668j = null;
        this.f669k = false;
        this.f672n = true;
        this.f676r = -1;
        this.f677s = new int[2];
        this.f678t = new int[2];
        w();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, i2, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f682x = new g0.k(this);
        this.f683y = new g0.i(this);
        setNestedScrollingEnabled(true);
        m.r(this, B);
    }

    private boolean A(View view, int i2, int i3) {
        view.getDrawingRect(this.f661c);
        offsetDescendantRectToMyCoords(view, this.f661c);
        return this.f661c.bottom + i2 >= getScrollY() && this.f661c.top - i2 <= getScrollY() + i3;
    }

    private void B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f676r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f665g = (int) motionEvent.getY(i2);
            this.f676r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f670l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void E() {
        VelocityTracker velocityTracker = this.f670l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f670l = null;
        }
    }

    private boolean F(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View viewP = p(z3, i3, i4);
        if (viewP == null) {
            viewP = this;
        }
        if (i3 < scrollY || i4 > i5) {
            l(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        }
        if (viewP != findFocus()) {
            viewP.requestFocus(i2);
        }
        return z2;
    }

    private void G(View view) {
        view.getDrawingRect(this.f661c);
        offsetDescendantRectToMyCoords(view, this.f661c);
        int i2 = i(this.f661c);
        if (i2 != 0) {
            scrollBy(0, i2);
        }
    }

    private boolean H(Rect rect, boolean z2) {
        int i2 = i(rect);
        boolean z3 = i2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, i2);
            } else {
                I(0, i2);
            }
        }
        return z3;
    }

    private boolean g() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f684z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f684z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f684z;
    }

    private static int h(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private void l(int i2) {
        if (i2 != 0) {
            if (this.f672n) {
                I(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    private void m() {
        this.f669k = false;
        E();
        L(0);
        EdgeEffect edgeEffect = this.f663e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f664f.onRelease();
        }
    }

    private void n() {
        if (getOverScrollMode() == 2) {
            this.f663e = null;
            this.f664f = null;
        } else if (this.f663e == null) {
            Context context = getContext();
            this.f663e = new EdgeEffect(context);
            this.f664f = new EdgeEffect(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private View p(boolean z2, int i2, int i3) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private void r(int i2) {
        int scrollY = getScrollY();
        boolean z2 = (scrollY > 0 || i2 > 0) && (scrollY < getScrollRange() || i2 < 0);
        float f2 = i2;
        if (dispatchNestedPreFling(0.0f, f2)) {
            return;
        }
        dispatchNestedFling(0.0f, f2, z2);
        q(i2);
    }

    private boolean u(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    private void v() {
        VelocityTracker velocityTracker = this.f670l;
        if (velocityTracker == null) {
            this.f670l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void w() {
        this.f662d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f673o = viewConfiguration.getScaledTouchSlop();
        this.f674p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f675q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void x() {
        if (this.f670l == null) {
            this.f670l = VelocityTracker.obtain();
        }
    }

    private boolean y(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    boolean C(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        boolean z3;
        boolean z4;
        int overScrollMode = getOverScrollMode();
        boolean z5 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z6 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        int i10 = i4 + i2;
        int i11 = !z7 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z8 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i10 = i15;
            z3 = true;
        } else if (i10 < i14) {
            z3 = true;
            i10 = i14;
        } else {
            z3 = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z4 = true;
        } else if (i12 < i16) {
            z4 = true;
            i12 = i16;
        } else {
            z4 = false;
        }
        if (z4 && !t(1)) {
            this.f662d.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i10, i12, z3, z4);
        return z3 || z4;
    }

    public boolean D(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f661c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f661c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f661c.top = getScrollY() - height;
            Rect rect2 = this.f661c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f661c;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return F(i2, i3, i4);
    }

    public final void I(int i2, int i3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f660b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f680v = getScrollY();
            this.f662d.startScroll(getScrollX(), scrollY, 0, iMax);
            m.n(this);
        } else {
            if (!this.f662d.isFinished()) {
                this.f662d.abortAnimation();
            }
            scrollBy(i2, i3);
        }
        this.f660b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void J(int i2, int i3) {
        I(i2 - getScrollX(), i3 - getScrollY());
    }

    public boolean K(int i2, int i3) {
        return this.f683y.j(i2, i3);
    }

    public void L(int i2) {
        this.f683y.k(i2);
    }

    @Override // g0.j
    public void a(View view, View view2, int i2, int i3) {
        this.f682x.c(view, view2, i2, i3);
        K(2, i3);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // g0.j
    public void b(View view, int i2) {
        this.f682x.d(view, i2);
        L(i2);
    }

    @Override // g0.j
    public void c(View view, int i2, int i3, int[] iArr, int i4) {
        j(i2, i3, iArr, null, i4);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f662d.computeScrollOffset()) {
            if (t(1)) {
                L(1);
            }
            this.f680v = 0;
            return;
        }
        this.f662d.getCurrX();
        int currY = this.f662d.getCurrY();
        int i2 = currY - this.f680v;
        if (j(0, i2, this.f678t, null, 1)) {
            i2 -= this.f678t[1];
        }
        int i3 = i2;
        if (i3 != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            C(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            if (!k(0, scrollY2, 0, i3 - scrollY2, null, 1)) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    n();
                    if (currY <= 0 && scrollY > 0) {
                        edgeEffect = this.f663e;
                    } else if (currY >= scrollRange && scrollY < scrollRange) {
                        edgeEffect = this.f664f;
                    }
                    edgeEffect.onAbsorb((int) this.f662d.getCurrVelocity());
                }
            }
        }
        this.f680v = currY;
        m.n(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // g0.j
    public void d(View view, int i2, int i3, int i4, int i5, int i6) {
        int scrollY = getScrollY();
        scrollBy(0, i5);
        int scrollY2 = getScrollY() - scrollY;
        k(0, scrollY2, 0, i5 - scrollY2, null, i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f683y.a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f683y.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return j(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return k(i2, i3, i4, i5, iArr, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f663e != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f663e.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f663e.setSize(width, height);
                if (this.f663e.draw(canvas)) {
                    m.n(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f664f.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f664f.setSize(width2, height2);
            if (this.f664f.draw(canvas)) {
                m.n(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // g0.j
    public boolean e(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public boolean f(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            l(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f661c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f661c);
            l(i(this.f661c));
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !y(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f682x.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return t(0);
    }

    protected int i(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f683y.g();
    }

    public boolean j(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.f683y.c(i2, i3, iArr, iArr2, i4);
    }

    public boolean k(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return this.f683y.d(i2, i3, i4, i5, iArr, i6);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean o(KeyEvent keyEvent) {
        this.f661c.setEmpty();
        if (!g()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? f(33) : s(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? f(130) : s(130);
        }
        if (keyCode != 62) {
            return false;
        }
        D(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f667i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f669k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    scrollRange = 0;
                } else if (i2 <= scrollRange) {
                    scrollRange = i2;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f669k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int y2 = (int) motionEvent.getY();
            if (u((int) motionEvent.getX(), y2)) {
                this.f665g = y2;
                this.f676r = motionEvent.getPointerId(0);
                v();
                this.f670l.addMovement(motionEvent);
                this.f662d.computeScrollOffset();
                this.f669k = !this.f662d.isFinished();
                K(2, 0);
            } else {
                this.f669k = false;
                E();
            }
        } else if (i2 == 1) {
            this.f669k = false;
            this.f676r = -1;
            E();
            if (this.f662d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                m.n(this);
            }
            L(0);
        } else if (i2 == 2) {
            int i3 = this.f676r;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y3 - this.f665g) > this.f673o && (2 & getNestedScrollAxes()) == 0) {
                        this.f669k = true;
                        this.f665g = y3;
                        x();
                        this.f670l.addMovement(motionEvent);
                        this.f679u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i2 == 3) {
            this.f669k = false;
            this.f676r = -1;
            E();
            if (this.f662d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                m.n(this);
            }
            L(0);
        } else if (i2 == 6) {
            B(motionEvent);
        }
        return this.f669k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.f666h = false;
        View view = this.f668j;
        if (view != null && z(view, this)) {
            G(this.f668j);
        }
        this.f668j = null;
        if (!this.f667i) {
            if (this.f681w != null) {
                scrollTo(getScrollX(), this.f681w.f685b);
                this.f681w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iH = h(scrollY, paddingTop, measuredHeight);
            if (iH != scrollY) {
                scrollTo(getScrollX(), iH);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f667i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f671m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        r((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        c(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        d(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i2) : focusFinder.findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || y(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f681w = cVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f685b = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.A;
        if (bVar != null) {
            bVar.a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !A(viewFindFocus, 0, i5)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f661c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f661c);
        l(i(this.f661c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return e(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        EdgeEffect edgeEffect;
        x();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f679u = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.f679u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f670l;
                velocityTracker.computeCurrentVelocity(1000, this.f675q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f676r);
                if (Math.abs(yVelocity) > this.f674p) {
                    r(-yVelocity);
                } else if (this.f662d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    m.n(this);
                }
                this.f676r = -1;
                m();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f676r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f676r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f665g - y2;
                    if (j(0, i2, this.f678t, this.f677s, 0)) {
                        i2 -= this.f678t[1];
                        motionEventObtain.offsetLocation(0.0f, this.f677s[1]);
                        this.f679u += this.f677s[1];
                    }
                    if (!this.f669k && Math.abs(i2) > this.f673o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f669k = true;
                        int i3 = this.f673o;
                        i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                    }
                    int i4 = i2;
                    if (this.f669k) {
                        this.f665g = y2 - this.f677s[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (C(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !t(0)) {
                            this.f670l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (k(0, scrollY2, 0, i4 - scrollY2, this.f677s, 0)) {
                            int i5 = this.f665g;
                            int i6 = this.f677s[1];
                            this.f665g = i5 - i6;
                            motionEventObtain.offsetLocation(0.0f, i6);
                            this.f679u += this.f677s[1];
                        } else if (z2) {
                            n();
                            int i7 = scrollY + i4;
                            if (i7 < 0) {
                                f.a(this.f663e, i4 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f664f.isFinished()) {
                                    edgeEffect = this.f664f;
                                    edgeEffect.onRelease();
                                }
                            } else if (i7 > scrollRange) {
                                f.a(this.f664f, i4 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f663e.isFinished()) {
                                    edgeEffect = this.f663e;
                                    edgeEffect.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect2 = this.f663e;
                            if (edgeEffect2 != null && (!edgeEffect2.isFinished() || !this.f664f.isFinished())) {
                                m.n(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f669k && getChildCount() > 0 && this.f662d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    m.n(this);
                }
                this.f676r = -1;
                m();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f665g = (int) motionEvent.getY(actionIndex);
                this.f676r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                B(motionEvent);
                this.f665g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f676r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z3 = !this.f662d.isFinished();
            this.f669k = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f662d.isFinished()) {
                this.f662d.abortAnimation();
            }
            this.f665g = (int) motionEvent.getY();
            this.f676r = motionEvent.getPointerId(0);
            K(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f670l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void q(int i2) {
        if (getChildCount() > 0) {
            K(2, 1);
            this.f662d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f680v = getScrollY();
            m.n(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f666h) {
            this.f668j = view2;
        } else {
            G(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return H(rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            E();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f666h = true;
        super.requestLayout();
    }

    public boolean s(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f661c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f661c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f661c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f661c;
        return F(i2, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iH = h(i2, width, width2);
            int iH2 = h(i3, height, height2);
            if (iH == getScrollX() && iH2 == getScrollY()) {
                return;
            }
            super.scrollTo(iH, iH2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f671m) {
            this.f671m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        this.f683y.h(z2);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f672n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return K(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        L(0);
    }

    public boolean t(int i2) {
        return this.f683y.f(i2);
    }
}
