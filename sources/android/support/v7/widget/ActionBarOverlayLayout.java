package android.support.v7.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements a0 {
    static final int[] C = {j0.a.f3025b, R.attr.windowContentOverlay};
    private final Runnable A;
    private final g0.k B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ContentFrameLayout f1137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f1138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b0 f1139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f1140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f1145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f1148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f1149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f1150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f1151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f1152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f1153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Rect f1154u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d f1155v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private OverScroller f1156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ViewPropertyAnimator f1157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final AnimatorListenerAdapter f1158y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Runnable f1159z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1157x = null;
            actionBarOverlayLayout.f1145l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1157x = null;
            actionBarOverlayLayout.f1145l = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1157x = actionBarOverlayLayout.f1138e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1158y);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1157x = actionBarOverlayLayout.f1138e.animate().translationY(-ActionBarOverlayLayout.this.f1138e.getHeight()).setListener(ActionBarOverlayLayout.this.f1158y);
        }
    }

    public interface d {
        void a(boolean z2);

        void b();

        void c();

        void d();

        void e();

        void onWindowVisibilityChanged(int i2);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1136c = 0;
        this.f1148o = new Rect();
        this.f1149p = new Rect();
        this.f1150q = new Rect();
        this.f1151r = new Rect();
        this.f1152s = new Rect();
        this.f1153t = new Rect();
        this.f1154u = new Rect();
        this.f1158y = new a();
        this.f1159z = new b();
        this.A = new c();
        p(context);
        this.B = new g0.k(this);
    }

    private void j() {
        o();
        this.A.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean k(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        e eVar = (e) view.getLayoutParams();
        if (z2) {
            int i2 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i3 = rect.left;
            if (i2 != i3) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i3;
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        if (z3) {
            int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i5 = rect.top;
            if (i4 != i5) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i5;
                z6 = true;
            }
        }
        if (z5) {
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i7 = rect.right;
            if (i6 != i7) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i7;
                z6 = true;
            }
        }
        if (z4) {
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i9;
                return true;
            }
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b0 n(View view) {
        if (view instanceof b0) {
            return (b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void p(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f1135b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1140g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1141h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1156w = new OverScroller(context);
    }

    private void r() {
        o();
        postDelayed(this.A, 600L);
    }

    private void s() {
        o();
        postDelayed(this.f1159z, 600L);
    }

    private void u() {
        o();
        this.f1159z.run();
    }

    private boolean v(float f2, float f3) {
        this.f1156w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1156w.getFinalY() > this.f1138e.getHeight();
    }

    @Override // android.support.v7.widget.a0
    public boolean a() {
        t();
        return this.f1139f.a();
    }

    @Override // android.support.v7.widget.a0
    public boolean b() {
        t();
        return this.f1139f.b();
    }

    @Override // android.support.v7.widget.a0
    public void c(Menu menu, android.support.v7.view.menu.j.a aVar) {
        t();
        this.f1139f.c(menu, aVar);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.support.v7.widget.a0
    public boolean d() {
        t();
        return this.f1139f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1140g == null || this.f1141h) {
            return;
        }
        int bottom = this.f1138e.getVisibility() == 0 ? (int) (this.f1138e.getBottom() + this.f1138e.getTranslationY() + 0.5f) : 0;
        this.f1140g.setBounds(0, bottom, getWidth(), this.f1140g.getIntrinsicHeight() + bottom);
        this.f1140g.draw(canvas);
    }

    @Override // android.support.v7.widget.a0
    public boolean e() {
        t();
        return this.f1139f.e();
    }

    @Override // android.support.v7.widget.a0
    public void f() {
        t();
        this.f1139f.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        t();
        g0.m.h(this);
        boolean zK = k(this.f1138e, rect, true, true, false, true);
        this.f1151r.set(rect);
        x0.a(this, this.f1151r, this.f1148o);
        if (!this.f1152s.equals(this.f1151r)) {
            this.f1152s.set(this.f1151r);
            zK = true;
        }
        if (!this.f1149p.equals(this.f1148o)) {
            this.f1149p.set(this.f1148o);
            zK = true;
        }
        if (zK) {
            requestLayout();
        }
        return true;
    }

    @Override // android.support.v7.widget.a0
    public boolean g() {
        t();
        return this.f1139f.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1138e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        t();
        return this.f1139f.getTitle();
    }

    @Override // android.support.v7.widget.a0
    public void h(int i2) {
        t();
        if (i2 == 2) {
            this.f1139f.r();
        } else if (i2 == 5) {
            this.f1139f.t();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.support.v7.widget.a0
    public void i() {
        t();
        this.f1139f.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void o() {
        removeCallbacks(this.f1159z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1157x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        g0.m.q(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        t();
        measureChildWithMargins(this.f1138e, i2, 0, i3, 0);
        e eVar = (e) this.f1138e.getLayoutParams();
        int iMax = Math.max(0, this.f1138e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f1138e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1138e.getMeasuredState());
        boolean z2 = (g0.m.h(this) & 256) != 0;
        if (z2) {
            measuredHeight = this.f1135b;
            if (this.f1143j && this.f1138e.getTabContainer() != null) {
                measuredHeight += this.f1135b;
            }
        } else {
            measuredHeight = this.f1138e.getVisibility() != 8 ? this.f1138e.getMeasuredHeight() : 0;
        }
        this.f1150q.set(this.f1148o);
        this.f1153t.set(this.f1151r);
        Rect rect = (this.f1142i || z2) ? this.f1153t : this.f1150q;
        rect.top += measuredHeight;
        rect.bottom += 0;
        k(this.f1137d, this.f1150q, true, true, true, true);
        if (!this.f1154u.equals(this.f1153t)) {
            this.f1154u.set(this.f1153t);
            this.f1137d.a(this.f1153t);
        }
        measureChildWithMargins(this.f1137d, i2, 0, i3, 0);
        e eVar2 = (e) this.f1137d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1137d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1137d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1137d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1144k || !z2) {
            return false;
        }
        if (v(f2, f3)) {
            j();
        } else {
            u();
        }
        this.f1145l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1146m + i3;
        this.f1146m = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.b(view, view2, i2);
        this.f1146m = getActionBarHideOffset();
        o();
        d dVar = this.f1155v;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1138e.getVisibility() != 0) {
            return false;
        }
        return this.f1144k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1144k && !this.f1145l) {
            if (this.f1146m <= this.f1138e.getHeight()) {
                s();
            } else {
                r();
            }
        }
        d dVar = this.f1155v;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        t();
        int i3 = this.f1147n ^ i2;
        this.f1147n = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.f1155v;
        if (dVar != null) {
            dVar.a(!z3);
            if (z2 || !z3) {
                this.f1155v.b();
            } else {
                this.f1155v.d();
            }
        }
        if ((i3 & 256) == 0 || this.f1155v == null) {
            return;
        }
        g0.m.q(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f1136c = i2;
        d dVar = this.f1155v;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i2);
        }
    }

    public boolean q() {
        return this.f1142i;
    }

    public void setActionBarHideOffset(int i2) {
        o();
        this.f1138e.setTranslationY(-Math.max(0, Math.min(i2, this.f1138e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1155v = dVar;
        if (getWindowToken() != null) {
            this.f1155v.onWindowVisibilityChanged(this.f1136c);
            int i2 = this.f1147n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                g0.m.q(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1143j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1144k) {
            this.f1144k = z2;
            if (z2) {
                return;
            }
            o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        t();
        this.f1139f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        t();
        this.f1139f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        t();
        this.f1139f.k(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f1142i = z2;
        this.f1141h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // android.support.v7.widget.a0
    public void setWindowCallback(Window.Callback callback) {
        t();
        this.f1139f.setWindowCallback(callback);
    }

    @Override // android.support.v7.widget.a0
    public void setWindowTitle(CharSequence charSequence) {
        t();
        this.f1139f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void t() {
        if (this.f1137d == null) {
            this.f1137d = (ContentFrameLayout) findViewById(j0.f.f3093b);
            this.f1138e = (ActionBarContainer) findViewById(j0.f.f3094c);
            this.f1139f = n(findViewById(j0.f.f3092a));
        }
    }
}
