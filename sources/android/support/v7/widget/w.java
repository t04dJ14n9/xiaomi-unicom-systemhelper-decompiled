package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class w extends Spinner {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f1556j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f1559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SpinnerAdapter f1560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    c f1562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f1563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Rect f1564i;

    class a extends f0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ c f1565k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, c cVar) {
            super(view);
            this.f1565k = cVar;
        }

        @Override // android.support.v7.widget.f0
        public n0.h b() {
            return this.f1565k;
        }

        @Override // android.support.v7.widget.f0
        public boolean c() {
            if (w.this.f1562g.h()) {
                return true;
            }
            w.this.f1562g.c();
            return true;
        }
    }

    private static class b implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SpinnerAdapter f1567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListAdapter f1568c;

        public b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1567b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1568c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof p0) {
                    p0 p0Var = (p0) spinnerAdapter;
                    if (p0Var.getDropDownViewTheme() == null) {
                        p0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1568c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1567b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1567b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1567b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1567b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1567b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f1568c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1567b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1567b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    private class c extends h0 {
        private CharSequence L;
        ListAdapter M;
        private final Rect N;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f1569b;

            a(w wVar) {
                this.f1569b = wVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                w.this.setSelection(i2);
                if (w.this.getOnItemClickListener() != null) {
                    c cVar = c.this;
                    w.this.performItemClick(view, i2, cVar.M.getItemId(i2));
                }
                c.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                c cVar = c.this;
                if (!cVar.M(w.this)) {
                    c.this.dismiss();
                } else {
                    c.this.K();
                    c.super.c();
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v7.widget.w$c$c, reason: collision with other inner class name */
        class C0012c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1572b;

            C0012c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1572b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1572b);
                }
            }
        }

        public c(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.N = new Rect();
            s(w.this);
            A(true);
            F(0);
            C(new a(w.this));
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008d  */
        /* JADX WARN: Code duplicated, block: B:23:0x0095  */
        void K() {
            int i2;
            int iMax;
            int iN;
            Drawable drawableJ = j();
            if (drawableJ != null) {
                drawableJ.getPadding(w.this.f1564i);
                i2 = x0.b(w.this) ? w.this.f1564i.right : -w.this.f1564i.left;
            } else {
                Rect rect = w.this.f1564i;
                rect.right = 0;
                rect.left = 0;
                i2 = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i3 = wVar.f1563h;
            if (i3 != -2) {
                if (i3 == -1) {
                    iMax = (width - paddingLeft) - paddingRight;
                } else {
                    v(i3);
                }
                if (x0.b(w.this)) {
                    iN = i2 + ((width - paddingRight) - n());
                } else {
                    iN = i2 + paddingLeft;
                }
                y(iN);
            }
            int iA = wVar.a((SpinnerAdapter) this.M, j());
            int i4 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = w.this.f1564i;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (iA > i5) {
                iA = i5;
            }
            iMax = Math.max(iA, (width - paddingLeft) - paddingRight);
            v(iMax);
            if (x0.b(w.this)) {
                iN = i2 + ((width - paddingRight) - n());
            } else {
                iN = i2 + paddingLeft;
            }
            y(iN);
        }

        public CharSequence L() {
            return this.L;
        }

        boolean M(View view) {
            return g0.m.k(view) && view.getGlobalVisibleRect(this.N);
        }

        public void N(CharSequence charSequence) {
            this.L = charSequence;
        }

        @Override // android.support.v7.widget.h0, n0.h
        public void c() {
            ViewTreeObserver viewTreeObserver;
            boolean zH = h();
            K();
            z(2);
            super.c();
            i().setChoiceMode(1);
            G(w.this.getSelectedItemPosition());
            if (zH || (viewTreeObserver = w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            B(new C0012c(bVar));
        }

        @Override // android.support.v7.widget.h0
        public void r(ListAdapter listAdapter) {
            super.r(listAdapter);
            this.M = listAdapter;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.I);
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[Catch: Exception -> 0x004f, all -> 0x005f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:15:0x0041, B:17:0x0047), top: B:43:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public w(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) throws Throwable {
        m0.d dVar;
        CharSequence[] charSequenceArrP;
        SpinnerAdapter spinnerAdapter;
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i2);
        this.f1564i = new Rect();
        t0 t0VarT = t0.t(context, attributeSet, j0.j.t2, i2, 0);
        this.f1557b = new e(this);
        TypedArray typedArray = null;
        if (theme == null) {
            int iM = t0VarT.m(j0.j.y2, 0);
            if (iM != 0) {
                dVar = new m0.d(context, iM);
            } else {
                this.f1558c = null;
            }
            if (this.f1558c != null) {
                if (i3 == -1) {
                    try {
                        typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1556j, i2, 0);
                        try {
                            try {
                                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                                    i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                                if (typedArrayObtainStyledAttributes != null) {
                                }
                                if (i3 == 1) {
                                    c cVar = new c(this.f1558c, attributeSet, i2);
                                    t0 t0VarT2 = t0.t(this.f1558c, attributeSet, j0.j.t2, i2, 0);
                                    this.f1563h = t0VarT2.l(j0.j.x2, -2);
                                    cVar.u(t0VarT2.f(j0.j.v2));
                                    cVar.N(t0VarT.n(j0.j.w2));
                                    t0VarT2.u();
                                    this.f1562g = cVar;
                                    this.f1559d = new a(this, cVar);
                                }
                                charSequenceArrP = t0VarT.p(j0.j.u2);
                                if (charSequenceArrP != null) {
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
                                    arrayAdapter.setDropDownViewResource(j0.g.f3136s);
                                    setAdapter((SpinnerAdapter) arrayAdapter);
                                }
                                t0VarT.u();
                                this.f1561f = true;
                                spinnerAdapter = this.f1560e;
                                if (spinnerAdapter != null) {
                                    setAdapter(spinnerAdapter);
                                    this.f1560e = null;
                                }
                                this.f1557b.e(attributeSet, i2);
                            }
                        } catch (Throwable th) {
                            th = th;
                            typedArray = typedArrayObtainStyledAttributes;
                            if (typedArray != null) {
                                typedArray.recycle();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        typedArrayObtainStyledAttributes = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (typedArray != null) {
                            typedArray.recycle();
                        }
                        throw th;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                }
                if (i3 == 1) {
                    c cVar2 = new c(this.f1558c, attributeSet, i2);
                    t0 t0VarT3 = t0.t(this.f1558c, attributeSet, j0.j.t2, i2, 0);
                    this.f1563h = t0VarT3.l(j0.j.x2, -2);
                    cVar2.u(t0VarT3.f(j0.j.v2));
                    cVar2.N(t0VarT.n(j0.j.w2));
                    t0VarT3.u();
                    this.f1562g = cVar2;
                    this.f1559d = new a(this, cVar2);
                }
            }
            charSequenceArrP = t0VarT.p(j0.j.u2);
            if (charSequenceArrP != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
                arrayAdapter2.setDropDownViewResource(j0.g.f3136s);
                setAdapter((SpinnerAdapter) arrayAdapter2);
            }
            t0VarT.u();
            this.f1561f = true;
            spinnerAdapter = this.f1560e;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f1560e = null;
            }
            this.f1557b.e(attributeSet, i2);
        }
        dVar = new m0.d(context, theme);
        this.f1558c = dVar;
        if (this.f1558c != null) {
            if (i3 == -1) {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1556j, i2, 0);
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
                typedArrayObtainStyledAttributes.recycle();
            }
            if (i3 == 1) {
                c cVar3 = new c(this.f1558c, attributeSet, i2);
                t0 t0VarT4 = t0.t(this.f1558c, attributeSet, j0.j.t2, i2, 0);
                this.f1563h = t0VarT4.l(j0.j.x2, -2);
                cVar3.u(t0VarT4.f(j0.j.v2));
                cVar3.N(t0VarT.n(j0.j.w2));
                t0VarT4.u();
                this.f1562g = cVar3;
                this.f1559d = new a(this, cVar3);
            }
        }
        charSequenceArrP = t0VarT.p(j0.j.u2);
        if (charSequenceArrP != null) {
            ArrayAdapter arrayAdapter3 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
            arrayAdapter3.setDropDownViewResource(j0.g.f3136s);
            setAdapter((SpinnerAdapter) arrayAdapter3);
        }
        t0VarT.u();
        this.f1561f = true;
        spinnerAdapter = this.f1560e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1560e = null;
        }
        this.f1557b.e(attributeSet, i2);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f1564i);
        Rect rect = this.f1564i;
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1557b;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        c cVar = this.f1562g;
        return cVar != null ? cVar.k() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        c cVar = this.f1562g;
        return cVar != null ? cVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1562g != null ? this.f1563h : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        c cVar = this.f1562g;
        return cVar != null ? cVar.j() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1562g != null ? this.f1558c : super.getPopupContext();
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        c cVar = this.f1562g;
        return cVar != null ? cVar.L() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1557b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1557b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1562g;
        if (cVar == null || !cVar.h()) {
            return;
        }
        this.f1562g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1562g == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f1559d;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        c cVar = this.f1562g;
        if (cVar == null) {
            return super.performClick();
        }
        if (cVar.h()) {
            return true;
        }
        this.f1562g.c();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1561f) {
            this.f1560e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1562g != null) {
            Context context = this.f1558c;
            if (context == null) {
                context = getContext();
            }
            this.f1562g.r(new b(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1557b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1557b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        c cVar = this.f1562g;
        if (cVar != null) {
            cVar.y(i2);
        } else {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        c cVar = this.f1562g;
        if (cVar != null) {
            cVar.H(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f1562g != null) {
            this.f1563h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        c cVar = this.f1562g;
        if (cVar != null) {
            cVar.u(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(k0.a.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        c cVar = this.f1562g;
        if (cVar != null) {
            cVar.N(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1557b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1557b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
