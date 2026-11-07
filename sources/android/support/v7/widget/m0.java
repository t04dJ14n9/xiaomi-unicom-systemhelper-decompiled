package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Interpolator f1449k = new DecelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f1450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f1451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g0 f1452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Spinner f1453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f1456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1458j;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1459b;

        a(View view) {
            this.f1459b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.smoothScrollTo(this.f1459b.getLeft() - ((m0.this.getWidth() - this.f1459b.getWidth()) / 2), 0);
            m0.this.f1450b = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return m0.this.f1452d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) m0.this.f1452d.getChildAt(i2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return m0.this.c((android.support.v7.app.a.c) getItem(i2), true);
            }
            ((d) view).a((android.support.v7.app.a.c) getItem(i2));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = m0.this.f1452d.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = m0.this.f1452d.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f1463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.support.v7.app.a.c f1464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextView f1465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ImageView f1466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f1467f;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, android.support.v7.app.a.c cVar, boolean z2) {
            int i2 = j0.a.f3027d;
            super(context, null, i2);
            int[] iArr = {R.attr.background};
            this.f1463b = iArr;
            this.f1464c = cVar;
            t0 t0VarT = t0.t(context, null, iArr, i2, 0);
            if (t0VarT.q(0)) {
                setBackgroundDrawable(t0VarT.f(0));
            }
            t0VarT.u();
            if (z2) {
                setGravity(8388627);
            }
            c();
        }

        public void a(android.support.v7.app.a.c cVar) {
            this.f1464c = cVar;
            c();
        }

        public android.support.v7.app.a.c b() {
            return this.f1464c;
        }

        public void c() {
            android.support.v7.app.a.c cVar = this.f1464c;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f1467f = viewB;
                TextView textView = this.f1465d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1466e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1466e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1467f;
            if (view != null) {
                removeView(view);
                this.f1467f = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f1466e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f1466e = oVar;
                }
                this.f1466e.setImageDrawable(drawableC);
                this.f1466e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1466e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1466e.setImageDrawable(null);
                }
            }
            boolean z2 = !TextUtils.isEmpty(charSequenceD);
            if (z2) {
                if (this.f1465d == null) {
                    y yVar = new y(getContext(), null, j0.a.f3028e);
                    yVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    yVar.setLayoutParams(layoutParams2);
                    addView(yVar);
                    this.f1465d = yVar;
                }
                this.f1465d.setText(charSequenceD);
                this.f1465d.setVisibility(0);
            } else {
                TextView textView2 = this.f1465d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1465d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1466e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            v0.a(this, z2 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(android.support.v7.app.a.c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(android.support.v7.app.a.c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (m0.this.f1455g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = m0.this.f1455g;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z2) {
            boolean z3 = isSelected() != z2;
            super.setSelected(z2);
            if (z3 && z2) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, j0.a.f3031h);
        wVar.setLayoutParams(new g0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f1453e;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1453e == null) {
            this.f1453e = b();
        }
        removeView(this.f1452d);
        addView(this.f1453e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1453e.getAdapter() == null) {
            this.f1453e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1450b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1450b = null;
        }
        this.f1453e.setSelection(this.f1458j);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1453e);
        addView(this.f1452d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1453e.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f1452d.getChildAt(i2);
        Runnable runnable = this.f1450b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1450b = aVar;
        post(aVar);
    }

    d c(android.support.v7.app.a.c cVar, boolean z2) {
        d dVar = new d(getContext(), cVar, z2);
        if (z2) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1457i));
        } else {
            dVar.setFocusable(true);
            if (this.f1451c == null) {
                this.f1451c = new c();
            }
            dVar.setOnClickListener(this.f1451c);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1450b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m0.a aVarB = m0.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f1456h = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1450b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1452d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            iMin = -1;
        } else {
            if (childCount > 2) {
                this.f1455g = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f1455g = View.MeasureSpec.getSize(i2) / 2;
            }
            iMin = Math.min(this.f1455g, this.f1456h);
        }
        this.f1455g = iMin;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1457i, 1073741824);
        if (!z2 && this.f1454f) {
            this.f1452d.measure(0, iMakeMeasureSpec);
            if (this.f1452d.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1458j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z2) {
        this.f1454f = z2;
    }

    public void setContentHeight(int i2) {
        this.f1457i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f1458j = i2;
        int childCount = this.f1452d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f1452d.getChildAt(i3);
            boolean z2 = i3 == i2;
            childAt.setSelected(z2);
            if (z2) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f1453e;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }
}
