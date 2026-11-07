package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    private final ActionMenuView.e H;
    private u0 I;
    private android.support.v7.widget.c J;
    private d K;
    private android.support.v7.view.menu.j.a L;
    private android.support.v7.view.menu.e.a M;
    private boolean N;
    private final Runnable O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionMenuView f1244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f1245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f1246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageButton f1247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f1248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f1249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f1250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ImageButton f1251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    View f1252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f1253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f1257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1262t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private l0 f1263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f1267y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f1268z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // android.support.v7.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.M();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements android.support.v7.view.menu.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.support.v7.view.menu.e f1272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.support.v7.view.menu.g f1273c;

        d() {
        }

        @Override // android.support.v7.view.menu.j
        public void a(android.support.v7.view.menu.e eVar, boolean z2) {
        }

        @Override // android.support.v7.view.menu.j
        public boolean b(android.support.v7.view.menu.m mVar) {
            return false;
        }

        @Override // android.support.v7.view.menu.j
        public boolean d() {
            return false;
        }

        @Override // android.support.v7.view.menu.j
        public boolean e(android.support.v7.view.menu.e eVar, android.support.v7.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f1252j;
            if (callback instanceof m0.c) {
                ((m0.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1252j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1251i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1252j = null;
            toolbar3.a();
            this.f1273c = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // android.support.v7.view.menu.j
        public void g(Context context, android.support.v7.view.menu.e eVar) {
            android.support.v7.view.menu.g gVar;
            android.support.v7.view.menu.e eVar2 = this.f1272b;
            if (eVar2 != null && (gVar = this.f1273c) != null) {
                eVar2.f(gVar);
            }
            this.f1272b = eVar;
        }

        @Override // android.support.v7.view.menu.j
        public boolean j(android.support.v7.view.menu.e eVar, android.support.v7.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1251i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1251i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1251i);
            }
            Toolbar.this.f1252j = gVar.getActionView();
            this.f1273c = gVar;
            ViewParent parent2 = Toolbar.this.f1252j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1252j);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f809a = (toolbar4.f1257o & 112) | 8388611;
                eVarGenerateDefaultLayoutParams.f1275b = 2;
                toolbar4.f1252j.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1252j);
            }
            Toolbar.this.F();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1252j;
            if (callback instanceof m0.c) {
                ((m0.c) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.j
        public void k(boolean z2) {
            if (this.f1273c != null) {
                android.support.v7.view.menu.e eVar = this.f1272b;
                boolean z3 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.f1272b.getItem(i2) == this.f1273c) {
                            z3 = true;
                            break;
                        }
                    }
                }
                if (z3) {
                    return;
                }
                e(this.f1272b, this.f1273c);
            }
        }
    }

    public static class e extends android.support.v7.app.a.C0007a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1275b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.f1275b = 0;
            this.f809a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1275b = 0;
        }

        public e(android.support.v7.app.a.C0007a c0007a) {
            super(c0007a);
            this.f1275b = 0;
        }

        public e(e eVar) {
            super((android.support.v7.app.a.C0007a) eVar);
            this.f1275b = 0;
            this.f1275b = eVar.f1275b;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1275b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1275b = 0;
            a(marginLayoutParams);
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
    }

    public static class g extends g0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f1277e;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1276d = parcel.readInt();
            this.f1277e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // g0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1276d);
            parcel.writeInt(this.f1277e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.L);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1266x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.H = new a();
        this.O = new b();
        t0 t0VarT = t0.t(getContext(), attributeSet, j0.j.J2, i2, 0);
        this.f1255m = t0VarT.m(j0.j.k3, 0);
        this.f1256n = t0VarT.m(j0.j.b3, 0);
        this.f1266x = t0VarT.k(j0.j.K2, this.f1266x);
        this.f1257o = t0VarT.k(j0.j.L2, 48);
        int iD = t0VarT.d(j0.j.e3, 0);
        int i3 = j0.j.j3;
        iD = t0VarT.q(i3) ? t0VarT.d(i3, iD) : iD;
        this.f1262t = iD;
        this.f1261s = iD;
        this.f1260r = iD;
        this.f1259q = iD;
        int iD2 = t0VarT.d(j0.j.h3, -1);
        if (iD2 >= 0) {
            this.f1259q = iD2;
        }
        int iD3 = t0VarT.d(j0.j.g3, -1);
        if (iD3 >= 0) {
            this.f1260r = iD3;
        }
        int iD4 = t0VarT.d(j0.j.i3, -1);
        if (iD4 >= 0) {
            this.f1261s = iD4;
        }
        int iD5 = t0VarT.d(j0.j.f3, -1);
        if (iD5 >= 0) {
            this.f1262t = iD5;
        }
        this.f1258p = t0VarT.e(j0.j.W2, -1);
        int iD6 = t0VarT.d(j0.j.S2, Integer.MIN_VALUE);
        int iD7 = t0VarT.d(j0.j.O2, Integer.MIN_VALUE);
        int iE = t0VarT.e(j0.j.Q2, 0);
        int iE2 = t0VarT.e(j0.j.R2, 0);
        h();
        this.f1263u.e(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.f1263u.g(iD6, iD7);
        }
        this.f1264v = t0VarT.d(j0.j.T2, Integer.MIN_VALUE);
        this.f1265w = t0VarT.d(j0.j.P2, Integer.MIN_VALUE);
        this.f1249g = t0VarT.f(j0.j.N2);
        this.f1250h = t0VarT.o(j0.j.M2);
        CharSequence charSequenceO = t0VarT.o(j0.j.d3);
        if (!TextUtils.isEmpty(charSequenceO)) {
            setTitle(charSequenceO);
        }
        CharSequence charSequenceO2 = t0VarT.o(j0.j.a3);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            setSubtitle(charSequenceO2);
        }
        this.f1253k = getContext();
        setPopupTheme(t0VarT.m(j0.j.Z2, 0));
        Drawable drawableF = t0VarT.f(j0.j.Y2);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence charSequenceO3 = t0VarT.o(j0.j.X2);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            setNavigationContentDescription(charSequenceO3);
        }
        Drawable drawableF2 = t0VarT.f(j0.j.U2);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence charSequenceO4 = t0VarT.o(j0.j.V2);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            setLogoDescription(charSequenceO4);
        }
        int i4 = j0.j.l3;
        if (t0VarT.q(i4)) {
            setTitleTextColor(t0VarT.b(i4, -1));
        }
        int i5 = j0.j.c3;
        if (t0VarT.q(i5)) {
            setSubtitleTextColor(t0VarT.b(i5, -1));
        }
        t0VarT.u();
    }

    private int A(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int C(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void D(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void E() {
        removeCallbacks(this.O);
        post(this.O);
    }

    private boolean K() {
        if (!this.N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (L(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean L(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z2 = g0.m.e(this) == 1;
        int childCount = getChildCount();
        int iA = g0.d.a(i2, g0.m.e(this));
        list.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1275b == 0 && L(childAt) && p(eVar.f809a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1275b == 0 && L(childAt2) && p(eVar2.f809a) == iA) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z2) {
        e eVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            eVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        }
        eVarGenerateLayoutParams.f1275b = 1;
        if (!z2 || this.f1252j == null) {
            addView(view, eVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateLayoutParams);
            this.F.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new m0.g(getContext());
    }

    private void h() {
        if (this.f1263u == null) {
            this.f1263u = new l0();
        }
    }

    private void i() {
        if (this.f1248f == null) {
            this.f1248f = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1244b.J() == null) {
            android.support.v7.view.menu.e eVar = (android.support.v7.view.menu.e) this.f1244b.getMenu();
            if (this.K == null) {
                this.K = new d();
            }
            this.f1244b.setExpandedActionViewsExclusive(true);
            eVar.c(this.K, this.f1253k);
        }
    }

    private void k() {
        if (this.f1244b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1244b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1254l);
            this.f1244b.setOnMenuItemClickListener(this.H);
            this.f1244b.K(this.L, this.M);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f809a = (this.f1257o & 112) | 8388613;
            this.f1244b.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f1244b, false);
        }
    }

    private void l() {
        if (this.f1247e == null) {
            this.f1247e = new m(getContext(), null, j0.a.K);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f809a = (this.f1257o & 112) | 8388611;
            this.f1247e.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i2) {
        int iE = g0.m.e(this);
        int iA = g0.d.a(i2, iE) & 7;
        if (iA == 1 || iA == 3 || iA == 5) {
            return iA;
        }
        return iE == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iR = r(eVar.f809a);
        if (iR == 48) {
            return getPaddingTop() - i3;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.f1266x & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return g0.g.b(marginLayoutParams) + g0.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int measuredWidth = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, i6);
            int iMax3 = Math.max(0, -i5);
            int iMax4 = Math.max(0, -i6);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i4++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    private boolean x(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    void F() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1275b != 2 && childAt != this.f1244b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void G(int i2, int i3) {
        h();
        this.f1263u.g(i2, i3);
    }

    public void H(android.support.v7.view.menu.e eVar, android.support.v7.widget.c cVar) {
        if (eVar == null && this.f1244b == null) {
            return;
        }
        k();
        android.support.v7.view.menu.e eVarJ = this.f1244b.J();
        if (eVarJ == eVar) {
            return;
        }
        if (eVarJ != null) {
            eVarJ.O(this.J);
            eVarJ.O(this.K);
        }
        if (this.K == null) {
            this.K = new d();
        }
        cVar.F(true);
        if (eVar != null) {
            eVar.c(cVar, this.f1253k);
            eVar.c(this.K, this.f1253k);
        } else {
            cVar.g(this.f1253k, null);
            this.K.g(this.f1253k, null);
            cVar.k(true);
            this.K.k(true);
        }
        this.f1244b.setPopupTheme(this.f1254l);
        this.f1244b.setPresenter(cVar);
        this.J = cVar;
    }

    public void I(Context context, int i2) {
        this.f1256n = i2;
        TextView textView = this.f1246d;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void J(Context context, int i2) {
        this.f1255m = i2;
        TextView textView = this.f1245c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean M() {
        ActionMenuView actionMenuView = this.f1244b;
        return actionMenuView != null && actionMenuView.L();
    }

    void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1244b) != null && actionMenuView.G();
    }

    public void e() {
        d dVar = this.K;
        android.support.v7.view.menu.g gVar = dVar == null ? null : dVar.f1273c;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1244b;
        if (actionMenuView != null) {
            actionMenuView.x();
        }
    }

    void g() {
        if (this.f1251i == null) {
            m mVar = new m(getContext(), null, j0.a.K);
            this.f1251i = mVar;
            mVar.setImageDrawable(this.f1249g);
            this.f1251i.setContentDescription(this.f1250h);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f809a = (this.f1257o & 112) | 8388611;
            eVarGenerateDefaultLayoutParams.f1275b = 2;
            this.f1251i.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f1251i.setOnClickListener(new c());
        }
    }

    public int getContentInsetEnd() {
        l0 l0Var = this.f1263u;
        if (l0Var != null) {
            return l0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1265w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        l0 l0Var = this.f1263u;
        if (l0Var != null) {
            return l0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        l0 l0Var = this.f1263u;
        if (l0Var != null) {
            return l0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        l0 l0Var = this.f1263u;
        if (l0Var != null) {
            return l0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1264v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        android.support.v7.view.menu.e eVarJ;
        ActionMenuView actionMenuView = this.f1244b;
        return actionMenuView != null && (eVarJ = actionMenuView.J()) != null && eVarJ.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1265w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return g0.m.e(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return g0.m.e(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1264v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1248f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1248f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1244b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1247e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1247e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    android.support.v7.widget.c getOuterActionMenuPresenter() {
        return this.J;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1244b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1253k;
    }

    public int getPopupTheme() {
        return this.f1254l;
    }

    public CharSequence getSubtitle() {
        return this.f1268z;
    }

    public CharSequence getTitle() {
        return this.f1267y;
    }

    public int getTitleMarginBottom() {
        return this.f1262t;
    }

    public int getTitleMarginEnd() {
        return this.f1260r;
    }

    public int getTitleMarginStart() {
        return this.f1259q;
    }

    public int getTitleMarginTop() {
        return this.f1261s;
    }

    public b0 getWrapper() {
        if (this.I == null) {
            this.I = new u0(this, true);
        }
        return this.I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof android.support.v7.app.a.C0007a) {
            return new e((android.support.v7.app.a.C0007a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0237  */
    /* JADX WARN: Code duplicated, block: B:102:0x025a  */
    /* JADX WARN: Code duplicated, block: B:104:0x025d  */
    /* JADX WARN: Code duplicated, block: B:105:0x027f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0282  */
    /* JADX WARN: Code duplicated, block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:81:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x0211  */
    /* JADX WARN: Code duplicated, block: B:94:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x021f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0223  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iA;
        int iB;
        int iMax;
        int iMin;
        boolean zL;
        boolean zL2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        e eVar;
        e eVar2;
        boolean z3;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int i20;
        int i21;
        int size2;
        int i22;
        int i23;
        int i24;
        int size3;
        ImageView imageView;
        View view;
        ActionMenuView actionMenuView;
        ImageButton imageButton;
        boolean z4 = g0.m.e(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.G;
        iArr[1] = 0;
        iArr[0] = 0;
        int iF = g0.m.f(this);
        int iMin2 = iF >= 0 ? Math.min(iF, i5 - i3) : 0;
        if (L(this.f1247e)) {
            ImageButton imageButton2 = this.f1247e;
            if (z4) {
                iB = B(imageButton2, i25, iArr, iMin2);
                iA = paddingLeft;
            } else {
                iA = A(imageButton2, paddingLeft, iArr, iMin2);
            }
            if (L(this.f1251i)) {
                imageButton = this.f1251i;
                if (z4) {
                    iB = B(imageButton, iB, iArr, iMin2);
                } else {
                    iA = A(imageButton, iA, iArr, iMin2);
                }
            }
            if (L(this.f1244b)) {
                actionMenuView = this.f1244b;
                if (z4) {
                    iA = A(actionMenuView, iA, iArr, iMin2);
                } else {
                    iB = B(actionMenuView, iB, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iA);
            iArr[1] = Math.max(0, currentContentInsetRight - (i25 - iB));
            iMax = Math.max(iA, currentContentInsetLeft);
            iMin = Math.min(iB, i25 - currentContentInsetRight);
            if (L(this.f1252j)) {
                view = this.f1252j;
                if (z4) {
                    iMin = B(view, iMin, iArr, iMin2);
                } else {
                    iMax = A(view, iMax, iArr, iMin2);
                }
            }
            if (L(this.f1248f)) {
                imageView = this.f1248f;
                if (z4) {
                    iMin = B(imageView, iMin, iArr, iMin2);
                } else {
                    iMax = A(imageView, iMax, iArr, iMin2);
                }
            }
            zL = L(this.f1245c);
            zL2 = L(this.f1246d);
            if (zL) {
                e eVar3 = (e) this.f1245c.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.f1245c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zL2) {
                e eVar4 = (e) this.f1246d.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) eVar4).topMargin + this.f1246d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin;
            }
            if (!zL || zL2) {
                if (zL) {
                    textView = this.f1245c;
                } else {
                    textView = this.f1246d;
                }
                if (zL2) {
                    textView2 = this.f1246d;
                } else {
                    textView2 = this.f1245c;
                }
                eVar = (e) textView.getLayoutParams();
                eVar2 = (e) textView2.getLayoutParams();
                z3 = (!zL && this.f1245c.getMeasuredWidth() > 0) || (zL2 && this.f1246d.getMeasuredWidth() > 0);
                i6 = this.f1266x & 112;
                i7 = paddingLeft;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.f1261s;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    i16 = this.f1261s;
                    if (iMax2 < i15 + i16) {
                        iMax2 = i15 + i16;
                    } else {
                        i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        i19 = this.f1262t;
                        if (i17 < i18 + i19) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.f1262t) - measuredHeight;
                }
                if (z4) {
                    if (z3) {
                        i12 = this.f1259q;
                    } else {
                        i12 = 0;
                    }
                    int i26 = i12 - iArr[1];
                    iMin -= Math.max(0, i26);
                    iArr[1] = Math.max(0, -i26);
                    if (zL) {
                        e eVar5 = (e) this.f1245c.getLayoutParams();
                        int measuredWidth = iMin - this.f1245c.getMeasuredWidth();
                        int measuredHeight2 = this.f1245c.getMeasuredHeight() + paddingTop;
                        this.f1245c.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth - this.f1260r;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zL2) {
                        int i27 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1246d.getLayoutParams())).topMargin;
                        this.f1246d.layout(iMin - this.f1246d.getMeasuredWidth(), i27, iMin, this.f1246d.getMeasuredHeight() + i27);
                        i14 = iMin - this.f1260r;
                    } else {
                        i14 = iMin;
                    }
                    if (z3) {
                        iMin = Math.min(i13, i14);
                    }
                    iMax = iMax;
                } else {
                    if (z3) {
                        i9 = this.f1259q;
                        i8 = 0;
                    } else {
                        i8 = 0;
                        i9 = 0;
                    }
                    int i28 = i9 - iArr[i8];
                    iMax += Math.max(i8, i28);
                    iArr[i8] = Math.max(i8, -i28);
                    if (zL) {
                        e eVar6 = (e) this.f1245c.getLayoutParams();
                        int measuredWidth2 = this.f1245c.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1245c.getMeasuredHeight() + paddingTop;
                        this.f1245c.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i10 = measuredWidth2 + this.f1260r;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                    } else {
                        i10 = iMax;
                    }
                    if (zL2) {
                        int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1246d.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f1246d.getMeasuredWidth() + iMax;
                        this.f1246d.layout(iMax, i29, measuredWidth3, this.f1246d.getMeasuredHeight() + i29);
                        i11 = measuredWidth3 + this.f1260r;
                    } else {
                        i11 = iMax;
                    }
                    if (z3) {
                        iMax = Math.max(i10, i11);
                    }
                }
                b(this.E, 3);
                size = this.E.size();
                for (i20 = i8; i20 < size; i20++) {
                    iMax = A(this.E.get(i20), iMax, iArr, iMin2);
                }
                i21 = iMin2;
                b(this.E, 5);
                size2 = this.E.size();
                for (i22 = i8; i22 < size2; i22++) {
                    iMin = B(this.E.get(i22), iMin, iArr, i21);
                }
                b(this.E, 1);
                int iU = u(this.E, iArr);
                i23 = (i7 + (((width - i7) - paddingRight) / 2)) - (iU / 2);
                i24 = iU + i23;
                if (i23 >= iMax) {
                    if (i24 > iMin) {
                        iMax = i23 - (i24 - iMin);
                    } else {
                        iMax = i23;
                    }
                }
                size3 = this.E.size();
                while (i8 < size3) {
                    iMax = A(this.E.get(i8), iMax, iArr, i21);
                    i8++;
                }
                this.E.clear();
            }
            i7 = paddingLeft;
            iMin2 = iMin2;
            i8 = 0;
            b(this.E, 3);
            size = this.E.size();
            while (i20 < size) {
                iMax = A(this.E.get(i20), iMax, iArr, iMin2);
            }
            i21 = iMin2;
            b(this.E, 5);
            size2 = this.E.size();
            while (i22 < size2) {
                iMin = B(this.E.get(i22), iMin, iArr, i21);
            }
            b(this.E, 1);
            int iU2 = u(this.E, iArr);
            i23 = (i7 + (((width - i7) - paddingRight) / 2)) - (iU2 / 2);
            i24 = iU2 + i23;
            if (i23 >= iMax) {
                if (i24 > iMin) {
                    iMax = i23 - (i24 - iMin);
                } else {
                    iMax = i23;
                }
            }
            size3 = this.E.size();
            while (i8 < size3) {
                iMax = A(this.E.get(i8), iMax, iArr, i21);
                i8++;
            }
            this.E.clear();
        }
        iA = paddingLeft;
        iB = i25;
        if (L(this.f1251i)) {
            imageButton = this.f1251i;
            if (z4) {
                iB = B(imageButton, iB, iArr, iMin2);
            } else {
                iA = A(imageButton, iA, iArr, iMin2);
            }
        }
        if (L(this.f1244b)) {
            actionMenuView = this.f1244b;
            if (z4) {
                iA = A(actionMenuView, iA, iArr, iMin2);
            } else {
                iB = B(actionMenuView, iB, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iA);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - iB));
        iMax = Math.max(iA, currentContentInsetLeft2);
        iMin = Math.min(iB, i25 - currentContentInsetRight2);
        if (L(this.f1252j)) {
            view = this.f1252j;
            if (z4) {
                iMin = B(view, iMin, iArr, iMin2);
            } else {
                iMax = A(view, iMax, iArr, iMin2);
            }
        }
        if (L(this.f1248f)) {
            imageView = this.f1248f;
            if (z4) {
                iMin = B(imageView, iMin, iArr, iMin2);
            } else {
                iMax = A(imageView, iMax, iArr, iMin2);
            }
        }
        zL = L(this.f1245c);
        zL2 = L(this.f1246d);
        if (zL) {
            e eVar7 = (e) this.f1245c.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar7).topMargin + this.f1245c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar7).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zL2) {
            e eVar8 = (e) this.f1246d.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) eVar8).topMargin + this.f1246d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar8).bottomMargin;
        }
        if (zL) {
            if (zL) {
                textView = this.f1245c;
            } else {
                textView = this.f1246d;
            }
            if (zL2) {
                textView2 = this.f1246d;
            } else {
                textView2 = this.f1245c;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zL) {
            }
            i6 = this.f1266x & 112;
            i7 = paddingLeft;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.f1261s;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i16 = this.f1261s;
                if (iMax2 < i15 + i16) {
                    iMax2 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i19 = this.f1262t;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.f1262t) - measuredHeight;
            }
            if (z4) {
                if (z3) {
                    i12 = this.f1259q;
                } else {
                    i12 = 0;
                }
                int i210 = i12 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zL) {
                    e eVar9 = (e) this.f1245c.getLayoutParams();
                    int measuredWidth4 = iMin - this.f1245c.getMeasuredWidth();
                    int measuredHeight4 = this.f1245c.getMeasuredHeight() + paddingTop;
                    this.f1245c.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth4 - this.f1260r;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) eVar9).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zL2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1246d.getLayoutParams())).topMargin;
                    this.f1246d.layout(iMin - this.f1246d.getMeasuredWidth(), i211, iMin, this.f1246d.getMeasuredHeight() + i211);
                    i14 = iMin - this.f1260r;
                } else {
                    i14 = iMin;
                }
                if (z3) {
                    iMin = Math.min(i13, i14);
                }
                iMax = iMax;
                i8 = 0;
            } else {
                if (z3) {
                    i9 = this.f1259q;
                    i8 = 0;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                int i212 = i9 - iArr[i8];
                iMax += Math.max(i8, i212);
                iArr[i8] = Math.max(i8, -i212);
                if (zL) {
                    e eVar10 = (e) this.f1245c.getLayoutParams();
                    int measuredWidth5 = this.f1245c.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1245c.getMeasuredHeight() + paddingTop;
                    this.f1245c.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i10 = measuredWidth5 + this.f1260r;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) eVar10).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (zL2) {
                    int i213 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1246d.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f1246d.getMeasuredWidth() + iMax;
                    this.f1246d.layout(iMax, i213, measuredWidth6, this.f1246d.getMeasuredHeight() + i213);
                    i11 = measuredWidth6 + this.f1260r;
                } else {
                    i11 = iMax;
                }
                if (z3) {
                    iMax = Math.max(i10, i11);
                }
            }
        } else {
            if (zL) {
                textView = this.f1245c;
            } else {
                textView = this.f1246d;
            }
            if (zL2) {
                textView2 = this.f1246d;
            } else {
                textView2 = this.f1245c;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zL) {
            }
            i6 = this.f1266x & 112;
            i7 = paddingLeft;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.f1261s;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i16 = this.f1261s;
                if (iMax2 < i15 + i16) {
                    iMax2 = i15 + i16;
                } else {
                    i17 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i19 = this.f1262t;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.f1262t) - measuredHeight;
            }
            if (z4) {
                if (z3) {
                    i12 = this.f1259q;
                } else {
                    i12 = 0;
                }
                int i214 = i12 - iArr[1];
                iMin -= Math.max(0, i214);
                iArr[1] = Math.max(0, -i214);
                if (zL) {
                    e eVar11 = (e) this.f1245c.getLayoutParams();
                    int measuredWidth7 = iMin - this.f1245c.getMeasuredWidth();
                    int measuredHeight6 = this.f1245c.getMeasuredHeight() + paddingTop;
                    this.f1245c.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth7 - this.f1260r;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) eVar11).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zL2) {
                    int i215 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1246d.getLayoutParams())).topMargin;
                    this.f1246d.layout(iMin - this.f1246d.getMeasuredWidth(), i215, iMin, this.f1246d.getMeasuredHeight() + i215);
                    i14 = iMin - this.f1260r;
                } else {
                    i14 = iMin;
                }
                if (z3) {
                    iMin = Math.min(i13, i14);
                }
                iMax = iMax;
                i8 = 0;
            } else {
                if (z3) {
                    i9 = this.f1259q;
                    i8 = 0;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                int i216 = i9 - iArr[i8];
                iMax += Math.max(i8, i216);
                iArr[i8] = Math.max(i8, -i216);
                if (zL) {
                    e eVar12 = (e) this.f1245c.getLayoutParams();
                    int measuredWidth8 = this.f1245c.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1245c.getMeasuredHeight() + paddingTop;
                    this.f1245c.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i10 = measuredWidth8 + this.f1260r;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (zL2) {
                    int i217 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1246d.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f1246d.getMeasuredWidth() + iMax;
                    this.f1246d.layout(iMax, i217, measuredWidth9, this.f1246d.getMeasuredHeight() + i217);
                    i11 = measuredWidth9 + this.f1260r;
                } else {
                    i11 = iMax;
                }
                if (z3) {
                    iMax = Math.max(i10, i11);
                }
            }
        }
        b(this.E, 3);
        size = this.E.size();
        while (i20 < size) {
            iMax = A(this.E.get(i20), iMax, iArr, iMin2);
        }
        i21 = iMin2;
        b(this.E, 5);
        size2 = this.E.size();
        while (i22 < size2) {
            iMin = B(this.E.get(i22), iMin, iArr, i21);
        }
        b(this.E, 1);
        int iU3 = u(this.E, iArr);
        i23 = (i7 + (((width - i7) - paddingRight) / 2)) - (iU3 / 2);
        i24 = iU3 + i23;
        if (i23 >= iMax) {
            if (i24 > iMin) {
                iMax = i23 - (i24 - iMin);
            } else {
                iMax = i23;
            }
        }
        size3 = this.E.size();
        while (i8 < size3) {
            iMax = A(this.E.get(i8), iMax, iArr, i21);
            i8++;
        }
        this.E.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.G;
        boolean zB = x0.b(this);
        int i4 = !zB ? 1 : 0;
        if (L(this.f1247e)) {
            D(this.f1247e, i2, 0, i3, 0, this.f1258p);
            measuredWidth = this.f1247e.getMeasuredWidth() + s(this.f1247e);
            iMax = Math.max(0, this.f1247e.getMeasuredHeight() + t(this.f1247e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1247e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (L(this.f1251i)) {
            D(this.f1251i, i2, 0, i3, 0, this.f1258p);
            measuredWidth = this.f1251i.getMeasuredWidth() + s(this.f1251i);
            iMax = Math.max(iMax, this.f1251i.getMeasuredHeight() + t(this.f1251i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1251i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (L(this.f1244b)) {
            D(this.f1244b, i2, iMax3, i3, 0, this.f1258p);
            measuredWidth2 = this.f1244b.getMeasuredWidth() + s(this.f1244b);
            iMax = Math.max(iMax, this.f1244b.getMeasuredHeight() + t(this.f1244b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1244b.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (L(this.f1252j)) {
            iMax4 += C(this.f1252j, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f1252j.getMeasuredHeight() + t(this.f1252j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1252j.getMeasuredState());
        }
        if (L(this.f1248f)) {
            iMax4 += C(this.f1248f, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f1248f.getMeasuredHeight() + t(this.f1248f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1248f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((e) childAt.getLayoutParams()).f1275b == 0 && L(childAt)) {
                iMax4 += C(childAt, i2, iMax4, i3, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i6 = this.f1261s + this.f1262t;
        int i7 = this.f1259q + this.f1260r;
        if (L(this.f1245c)) {
            C(this.f1245c, i2, iMax4 + i7, i3, i6, iArr);
            int measuredWidth3 = this.f1245c.getMeasuredWidth() + s(this.f1245c);
            measuredHeight = this.f1245c.getMeasuredHeight() + t(this.f1245c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1245c.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (L(this.f1246d)) {
            iMax2 = Math.max(iMax2, C(this.f1246d, i2, iMax4 + i7, i3, measuredHeight + i6, iArr));
            measuredHeight += this.f1246d.getMeasuredHeight() + t(this.f1246d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1246d.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), K() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f1244b;
        android.support.v7.view.menu.e eVarJ = actionMenuView != null ? actionMenuView.J() : null;
        int i2 = gVar.f1276d;
        if (i2 != 0 && this.K != null && eVarJ != null && (menuItemFindItem = eVarJ.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f1277e) {
            E();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        h();
        this.f1263u.f(i2 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        android.support.v7.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.K;
        if (dVar != null && (gVar = dVar.f1273c) != null) {
            gVar2.f1276d = gVar.getItemId();
        }
        gVar2.f1277e = z();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z2) {
        this.N = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1265w) {
            this.f1265w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1264v) {
            this.f1264v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(k0.a.b(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!x(this.f1248f)) {
                c(this.f1248f, true);
            }
        } else {
            ImageView imageView = this.f1248f;
            if (imageView != null && x(imageView)) {
                removeView(this.f1248f);
                this.F.remove(this.f1248f);
            }
        }
        ImageView imageView2 = this.f1248f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1248f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1247e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(k0.a.b(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!x(this.f1247e)) {
                c(this.f1247e, true);
            }
        } else {
            ImageButton imageButton = this.f1247e;
            if (imageButton != null && x(imageButton)) {
                removeView(this.f1247e);
                this.F.remove(this.f1247e);
            }
        }
        ImageButton imageButton2 = this.f1247e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1247e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1244b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1254l != i2) {
            this.f1254l = i2;
            if (i2 == 0) {
                this.f1253k = getContext();
            } else {
                this.f1253k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1246d;
            if (textView != null && x(textView)) {
                removeView(this.f1246d);
                this.F.remove(this.f1246d);
            }
        } else {
            if (this.f1246d == null) {
                Context context = getContext();
                y yVar = new y(context);
                this.f1246d = yVar;
                yVar.setSingleLine();
                this.f1246d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1256n;
                if (i2 != 0) {
                    this.f1246d.setTextAppearance(context, i2);
                }
                int i3 = this.B;
                if (i3 != 0) {
                    this.f1246d.setTextColor(i3);
                }
            }
            if (!x(this.f1246d)) {
                c(this.f1246d, true);
            }
        }
        TextView textView2 = this.f1246d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1268z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        this.B = i2;
        TextView textView = this.f1246d;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1245c;
            if (textView != null && x(textView)) {
                removeView(this.f1245c);
                this.F.remove(this.f1245c);
            }
        } else {
            if (this.f1245c == null) {
                Context context = getContext();
                y yVar = new y(context);
                this.f1245c = yVar;
                yVar.setSingleLine();
                this.f1245c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1255m;
                if (i2 != 0) {
                    this.f1245c.setTextAppearance(context, i2);
                }
                int i3 = this.A;
                if (i3 != 0) {
                    this.f1245c.setTextColor(i3);
                }
            }
            if (!x(this.f1245c)) {
                c(this.f1245c, true);
            }
        }
        TextView textView2 = this.f1245c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1267y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.f1262t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1260r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1259q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1261s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        this.A = i2;
        TextView textView = this.f1245c;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public boolean v() {
        d dVar = this.K;
        return (dVar == null || dVar.f1273c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1244b;
        return actionMenuView != null && actionMenuView.D();
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f1244b;
        return actionMenuView != null && actionMenuView.E();
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f1244b;
        return actionMenuView != null && actionMenuView.F();
    }
}
