package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
class d0 extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f1324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Field f1330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f1331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g0.q f1335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private android.support.v4.widget.h f1336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    b f1337o;

    private static class a extends l0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1338c;

        a(Drawable drawable) {
            super(drawable);
            this.f1338c = true;
        }

        void c(boolean z2) {
            this.f1338c = z2;
        }

        @Override // l0.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1338c) {
                super.draw(canvas);
            }
        }

        @Override // l0.a, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f1338c) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // l0.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1338c) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // l0.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1338c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // l0.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f1338c) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void a() {
            d0 d0Var = d0.this;
            d0Var.f1337o = null;
            d0Var.removeCallbacks(this);
        }

        public void b() {
            d0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = d0.this;
            d0Var.f1337o = null;
            d0Var.drawableStateChanged();
        }
    }

    d0(Context context, boolean z2) {
        super(context, null, j0.a.f3049z);
        this.f1324b = new Rect();
        this.f1325c = 0;
        this.f1326d = 0;
        this.f1327e = 0;
        this.f1328f = 0;
        this.f1333k = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1330h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.f1334l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1329g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        g0.q qVar = this.f1335m;
        if (qVar != null) {
            qVar.b();
            this.f1335m = null;
        }
    }

    private void b(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1324b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1324b);
        selector.draw(canvas);
    }

    private void f(int i2, View view) {
        Rect rect = this.f1324b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1325c;
        rect.top -= this.f1326d;
        rect.right += this.f1327e;
        rect.bottom += this.f1328f;
        try {
            boolean z2 = this.f1330h.getBoolean(this);
            if (view.isEnabled() != z2) {
                this.f1330h.set(this, Boolean.valueOf(!z2));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void g(int i2, View view) {
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        f(i2, view);
        if (z2) {
            Rect rect = this.f1324b;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            b0.a.d(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i2, View view, float f2, float f3) {
        g(i2, view);
        Drawable selector = getSelector();
        if (selector == null || i2 == -1) {
            return;
        }
        b0.a.d(selector, f2, f3);
    }

    private void i(View view, int i2, float f2, float f3) {
        View childAt;
        this.f1334l = true;
        drawableHotspotChanged(f2, f3);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f1329g;
        if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1329g = i2;
        view.drawableHotspotChanged(f2 - view.getLeft(), f3 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f1334l;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z2) {
        a aVar = this.f1331i;
        if (aVar != null) {
            aVar.c(z2);
        }
    }

    public int d(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View view = null;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i2, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return (i6 < 0 || i7 <= i6 || i9 <= 0 || measuredHeight == i5) ? i5 : i9;
            }
            if (i6 >= 0 && i7 >= i6) {
                i9 = measuredHeight;
            }
            i7++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1337o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i2) {
        boolean z2;
        boolean z3;
        android.support.v4.widget.h hVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    z3 = false;
                } else {
                    z3 = false;
                    z2 = false;
                }
                if (z2 || z3) {
                    a();
                }
                if (z2) {
                    if (this.f1336n == null) {
                        this.f1336n = new android.support.v4.widget.h(this);
                    }
                    this.f1336n.m(true);
                    this.f1336n.onTouch(this, motionEvent);
                } else {
                    hVar = this.f1336n;
                    if (hVar != null) {
                        hVar.m(false);
                    }
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex < 0) {
            z3 = false;
            z2 = false;
        } else {
            int x2 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x2, y2);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x2, y2);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z2 = true;
                z3 = false;
            }
        }
        if (z2) {
            a();
        } else {
            a();
        }
        if (z2) {
            if (this.f1336n == null) {
                this.f1336n = new android.support.v4.widget.h(this);
            }
            this.f1336n.m(true);
            this.f1336n.onTouch(this, motionEvent);
        } else {
            hVar = this.f1336n;
            if (hVar != null) {
                hVar.m(false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1333k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1333k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1333k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1333k && this.f1332j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1337o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1337o == null) {
            b bVar = new b();
            this.f1337o = bVar;
            bVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1329g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1337o;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z2) {
        this.f1332j = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1331i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1325c = rect.left;
        this.f1326d = rect.top;
        this.f1327e = rect.right;
        this.f1328f = rect.bottom;
    }
}
