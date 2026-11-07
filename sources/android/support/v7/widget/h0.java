package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements n0.h {
    private static Method I;
    private static Method J;
    private static Method K;
    private final e A;
    private final c B;
    private Runnable C;
    final Handler D;
    private final Rect E;
    private Rect F;
    private boolean G;
    PopupWindow H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f1379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListAdapter f1380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d0 f1381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f1394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f1395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private DataSetObserver f1397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f1398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f1399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final g f1402y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final f f1403z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewG = h0.this.g();
            if (viewG == null || viewG.getWindowToken() == null) {
                return;
            }
            h0.this.c();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            d0 d0Var;
            if (i2 == -1 || (d0Var = h0.this.f1381d) == null) {
                return;
            }
            d0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0.this.e();
        }
    }

    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (h0.this.h()) {
                h0.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            h0.this.dismiss();
        }
    }

    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || h0.this.o() || h0.this.H.getContentView() == null) {
                return;
            }
            h0 h0Var = h0.this;
            h0Var.D.removeCallbacks(h0Var.f1402y);
            h0.this.f1402y.run();
        }
    }

    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = h0.this.H) != null && popupWindow.isShowing() && x2 >= 0 && x2 < h0.this.H.getWidth() && y2 >= 0 && y2 < h0.this.H.getHeight()) {
                h0 h0Var = h0.this;
                h0Var.D.postDelayed(h0Var.f1402y, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            h0 h0Var2 = h0.this;
            h0Var2.D.removeCallbacks(h0Var2.f1402y);
            return false;
        }
    }

    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = h0.this.f1381d;
            if (d0Var == null || !g0.m.k(d0Var) || h0.this.f1381d.getCount() <= h0.this.f1381d.getChildCount()) {
                return;
            }
            int childCount = h0.this.f1381d.getChildCount();
            h0 h0Var = h0.this;
            if (childCount <= h0Var.f1394q) {
                h0Var.H.setInputMethodMode(2);
                h0.this.c();
            }
        }
    }

    static {
        try {
            I = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            J = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            K = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public h0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public h0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1382e = -2;
        this.f1383f = -2;
        this.f1386i = 1002;
        this.f1388k = true;
        this.f1391n = 0;
        this.f1392o = false;
        this.f1393p = false;
        this.f1394q = Integer.MAX_VALUE;
        this.f1396s = 0;
        this.f1402y = new g();
        this.f1403z = new f();
        this.A = new e();
        this.B = new c();
        this.E = new Rect();
        this.f1379b = context;
        this.D = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.j.h1, i2, i3);
        this.f1384g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j0.j.i1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j0.j.j1, 0);
        this.f1385h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1387j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i2, i3);
        this.H = qVar;
        qVar.setInputMethodMode(1);
    }

    private void E(boolean z2) {
        Method method = I;
        if (method != null) {
            try {
                method.invoke(this.H, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012a A[PHI: r1
      0x012a: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x011f, B:47:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    private int d() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        int i4 = Integer.MIN_VALUE;
        if (this.f1381d == null) {
            Context context = this.f1379b;
            this.C = new a();
            d0 d0VarF = f(context, !this.G);
            this.f1381d = d0VarF;
            Drawable drawable = this.f1399v;
            if (drawable != null) {
                d0VarF.setSelector(drawable);
            }
            this.f1381d.setAdapter(this.f1380c);
            this.f1381d.setOnItemClickListener(this.f1400w);
            this.f1381d.setFocusable(true);
            this.f1381d.setFocusableInTouchMode(true);
            this.f1381d.setOnItemSelectedListener(new b());
            this.f1381d.setOnScrollListener(this.A);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1401x;
            if (onItemSelectedListener != null) {
                this.f1381d.setOnItemSelectedListener(onItemSelectedListener);
            }
            d0 d0Var = this.f1381d;
            View view2 = this.f1395r;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.f1396s;
                if (i5 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(d0Var, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1396s);
                } else {
                    linearLayout.addView(d0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i6 = this.f1383f;
                if (i6 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = d0Var;
            }
            this.H.setContentView(view);
        } else {
            View view3 = this.f1395r;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.H.getBackground();
        if (background != null) {
            background.getPadding(this.E);
            Rect rect = this.E;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.f1387j) {
                this.f1385h = -i7;
            }
        } else {
            this.E.setEmpty();
            i2 = 0;
        }
        int iL = l(g(), this.f1385h, this.H.getInputMethodMode() == 2);
        if (this.f1392o || this.f1382e == -1) {
            return iL + i2;
        }
        int i8 = this.f1383f;
        if (i8 != -2) {
            i4 = 1073741824;
            if (i8 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                int i9 = this.f1379b.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.E;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), i4);
            }
        } else {
            int i10 = this.f1379b.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.E;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), i4);
        }
        int iD = this.f1381d.d(iMakeMeasureSpec, 0, -1, iL - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i2 + this.f1381d.getPaddingTop() + this.f1381d.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int l(View view, int i2, boolean z2) {
        Method method = J;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.H, view, Integer.valueOf(i2), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.H.getMaxAvailableHeight(view, i2);
    }

    private void q() {
        View view = this.f1395r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1395r);
            }
        }
    }

    public void A(boolean z2) {
        this.G = z2;
        this.H.setFocusable(z2);
    }

    public void B(PopupWindow.OnDismissListener onDismissListener) {
        this.H.setOnDismissListener(onDismissListener);
    }

    public void C(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1400w = onItemClickListener;
    }

    public void D(boolean z2) {
        this.f1390m = true;
        this.f1389l = z2;
    }

    public void F(int i2) {
        this.f1396s = i2;
    }

    public void G(int i2) {
        d0 d0Var = this.f1381d;
        if (!h() || d0Var == null) {
            return;
        }
        d0Var.setListSelectionHidden(false);
        d0Var.setSelection(i2);
        if (d0Var.getChoiceMode() != 0) {
            d0Var.setItemChecked(i2, true);
        }
    }

    public void H(int i2) {
        this.f1385h = i2;
        this.f1387j = true;
    }

    public void I(int i2) {
        this.f1383f = i2;
    }

    @Override // n0.h
    public void c() {
        int iD = d();
        boolean zO = o();
        android.support.v4.widget.j.b(this.H, this.f1386i);
        if (this.H.isShowing()) {
            if (g0.m.k(g())) {
                int width = this.f1383f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = g().getWidth();
                }
                int i2 = this.f1382e;
                if (i2 == -1) {
                    if (!zO) {
                        iD = -1;
                    }
                    if (zO) {
                        this.H.setWidth(this.f1383f == -1 ? -1 : 0);
                        this.H.setHeight(0);
                    } else {
                        this.H.setWidth(this.f1383f == -1 ? -1 : 0);
                        this.H.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iD = i2;
                }
                this.H.setOutsideTouchable((this.f1393p || this.f1392o) ? false : true);
                this.H.update(g(), this.f1384g, this.f1385h, width < 0 ? -1 : width, iD < 0 ? -1 : iD);
                return;
            }
            return;
        }
        int width2 = this.f1383f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = g().getWidth();
        }
        int i3 = this.f1382e;
        if (i3 == -1) {
            iD = -1;
        } else if (i3 != -2) {
            iD = i3;
        }
        this.H.setWidth(width2);
        this.H.setHeight(iD);
        E(true);
        this.H.setOutsideTouchable((this.f1393p || this.f1392o) ? false : true);
        this.H.setTouchInterceptor(this.f1403z);
        if (this.f1390m) {
            android.support.v4.widget.j.a(this.H, this.f1389l);
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.H, this.F);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        android.support.v4.widget.j.c(this.H, g(), this.f1384g, this.f1385h, this.f1391n);
        this.f1381d.setSelection(-1);
        if (!this.G || this.f1381d.isInTouchMode()) {
            e();
        }
        if (this.G) {
            return;
        }
        this.D.post(this.B);
    }

    @Override // n0.h
    public void dismiss() {
        this.H.dismiss();
        q();
        this.H.setContentView(null);
        this.f1381d = null;
        this.D.removeCallbacks(this.f1402y);
    }

    public void e() {
        d0 d0Var = this.f1381d;
        if (d0Var != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
    }

    d0 f(Context context, boolean z2) {
        return new d0(context, z2);
    }

    public View g() {
        return this.f1398u;
    }

    @Override // n0.h
    public boolean h() {
        return this.H.isShowing();
    }

    @Override // n0.h
    public ListView i() {
        return this.f1381d;
    }

    public Drawable j() {
        return this.H.getBackground();
    }

    public int k() {
        return this.f1384g;
    }

    public int m() {
        if (this.f1387j) {
            return this.f1385h;
        }
        return 0;
    }

    public int n() {
        return this.f1383f;
    }

    public boolean o() {
        return this.H.getInputMethodMode() == 2;
    }

    public boolean p() {
        return this.G;
    }

    public void r(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1397t;
        if (dataSetObserver == null) {
            this.f1397t = new d();
        } else {
            ListAdapter listAdapter2 = this.f1380c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1380c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1397t);
        }
        d0 d0Var = this.f1381d;
        if (d0Var != null) {
            d0Var.setAdapter(this.f1380c);
        }
    }

    public void s(View view) {
        this.f1398u = view;
    }

    public void t(int i2) {
        this.H.setAnimationStyle(i2);
    }

    public void u(Drawable drawable) {
        this.H.setBackgroundDrawable(drawable);
    }

    public void v(int i2) {
        Drawable background = this.H.getBackground();
        if (background == null) {
            I(i2);
            return;
        }
        background.getPadding(this.E);
        Rect rect = this.E;
        this.f1383f = rect.left + rect.right + i2;
    }

    public void w(int i2) {
        this.f1391n = i2;
    }

    public void x(Rect rect) {
        this.F = rect;
    }

    public void y(int i2) {
        this.f1384g = i2;
    }

    public void z(int i2) {
        this.H.setInputMethodMode(i2);
    }
}
