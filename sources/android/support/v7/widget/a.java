package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C0010a f1282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Context f1283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ActionMenuView f1284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected c f1285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f1286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected g0.q f1287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1289i;

    /* JADX INFO: renamed from: android.support.v7.widget.a$a, reason: collision with other inner class name */
    protected class C0010a implements g0.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1290a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1291b;

        protected C0010a() {
        }

        @Override // g0.r
        public void a(View view) {
            if (this.f1290a) {
                return;
            }
            a aVar = a.this;
            aVar.f1287g = null;
            a.super.setVisibility(this.f1291b);
        }

        @Override // g0.r
        public void b(View view) {
            a.super.setVisibility(0);
            this.f1290a = false;
        }

        @Override // g0.r
        public void c(View view) {
            this.f1290a = true;
        }

        public C0010a d(g0.q qVar, int i2) {
            a.this.f1287g = qVar;
            this.f1291b = i2;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1282b = new C0010a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(j0.a.f3024a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1283c = context;
        } else {
            this.f1283c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i2, int i3, boolean z2) {
        return z2 ? i2 - i3 : i2 + i3;
    }

    protected int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    protected int e(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public g0.q f(int i2, long j2) {
        g0.q qVarA;
        g0.q qVar = this.f1287g;
        if (qVar != null) {
            qVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            qVarA = g0.m.a(this).a(1.0f);
        } else {
            qVarA = g0.m.a(this).a(0.0f);
        }
        qVarA.d(j2);
        qVarA.f(this.f1282b.d(qVarA, i2));
        return qVarA;
    }

    public int getAnimatedVisibility() {
        return this.f1287g != null ? this.f1282b.f1291b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1286f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, j0.j.f3151a, j0.a.f3026c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(j0.j.f3176j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f1285e;
        if (cVar != null) {
            cVar.E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1289i = false;
        }
        if (!this.f1289i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1289i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1289i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1288h = false;
        }
        if (!this.f1288h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1288h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1288h = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f1286f = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            g0.q qVar = this.f1287g;
            if (qVar != null) {
                qVar.b();
            }
            super.setVisibility(i2);
        }
    }
}
