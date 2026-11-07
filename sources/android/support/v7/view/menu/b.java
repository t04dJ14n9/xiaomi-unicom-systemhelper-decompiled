package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.i0;
import android.support.v7.widget.j0;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = j0.g.f3122e;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Handler f972h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    View f981q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f986v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j.a f989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    ViewTreeObserver f990z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<e> f973i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final List<d> f974j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f975k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f976l = new ViewOnAttachStateChangeListenerC0009b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i0 f977m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f978n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f979o = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f987w = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f982r = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.h() || b.this.f974j.size() <= 0 || b.this.f974j.get(0).f998a.p()) {
                return;
            }
            View view = b.this.f981q;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f974j.iterator();
            while (it.hasNext()) {
                it.next().f998a.c();
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0009b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0009b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f990z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f990z = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f990z.removeGlobalOnLayoutListener(bVar.f975k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements i0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f994b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f995c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f996d;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f994b = dVar;
                this.f995c = menuItem;
                this.f996d = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f994b;
                if (dVar != null) {
                    b.this.B = true;
                    dVar.f999b.e(false);
                    b.this.B = false;
                }
                if (this.f995c.isEnabled() && this.f995c.hasSubMenu()) {
                    this.f996d.L(this.f995c, 4);
                }
            }
        }

        c() {
        }

        @Override // android.support.v7.widget.i0
        public void a(e eVar, MenuItem menuItem) {
            b.this.f972h.removeCallbacksAndMessages(null);
            int size = b.this.f974j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (eVar == b.this.f974j.get(i2).f999b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            b.this.f972h.postAtTime(new a(i3 < b.this.f974j.size() ? b.this.f974j.get(i3) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // android.support.v7.widget.i0
        public void b(e eVar, MenuItem menuItem) {
            b.this.f972h.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1000c;

        public d(j0 j0Var, e eVar, int i2) {
            this.f998a = j0Var;
            this.f999b = eVar;
            this.f1000c = i2;
        }

        public ListView a() {
            return this.f998a.i();
        }
    }

    public b(Context context, View view, int i2, int i3, boolean z2) {
        this.f967c = context;
        this.f980p = view;
        this.f969e = i2;
        this.f970f = i3;
        this.f971g = z2;
        Resources resources = context.getResources();
        this.f968d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(j0.d.f3061d));
        this.f972h = new Handler();
    }

    private int A(e eVar) {
        int size = this.f974j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (eVar == this.f974j.get(i2).f999b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = eVar.getItem(i2);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        android.support.v7.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f999b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (android.support.v7.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (android.support.v7.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return g0.m.e(this.f980p) == 1 ? 0 : 1;
    }

    private int E(int i2) {
        List<d> list = this.f974j;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f981q.getWindowVisibleDisplayFrame(rect);
        if (this.f982r == 1) {
            return (iArr[0] + listViewA.getWidth()) + i2 > rect.right ? 0 : 1;
        }
        return iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View viewC;
        int i2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f967c);
        android.support.v7.view.menu.d dVar2 = new android.support.v7.view.menu.d(eVar, layoutInflaterFrom, this.f971g, C);
        if (!h() && this.f987w) {
            dVar2.d(true);
        } else if (h()) {
            dVar2.d(h.x(eVar));
        }
        int iO = h.o(dVar2, null, this.f967c, this.f968d);
        j0 j0VarZ = z();
        j0VarZ.r(dVar2);
        j0VarZ.v(iO);
        j0VarZ.w(this.f979o);
        if (this.f974j.size() > 0) {
            List<d> list = this.f974j;
            dVar = list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            j0VarZ.M(false);
            j0VarZ.J(null);
            int iE = E(iO);
            boolean z2 = iE == 1;
            this.f982r = iE;
            j0VarZ.s(viewC);
            if ((this.f979o & 5) == 5) {
                if (z2) {
                    i2 = iO + 0;
                } else {
                    iO = viewC.getWidth();
                    i2 = 0 - iO;
                }
            } else if (z2) {
                iO = viewC.getWidth();
                i2 = iO + 0;
            } else {
                i2 = 0 - iO;
            }
            j0VarZ.y(i2);
            j0VarZ.D(true);
            j0VarZ.H(0);
        } else {
            if (this.f983s) {
                j0VarZ.y(this.f985u);
            }
            if (this.f984t) {
                j0VarZ.H(this.f986v);
            }
            j0VarZ.x(n());
        }
        this.f974j.add(new d(j0VarZ, eVar, this.f982r));
        j0VarZ.c();
        ListView listViewI = j0VarZ.i();
        listViewI.setOnKeyListener(this);
        if (dVar == null && this.f988x && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(j0.g.f3129l, (ViewGroup) listViewI, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewI.addHeaderView(frameLayout, null, false);
            j0VarZ.c();
        }
    }

    private j0 z() {
        j0 j0Var = new j0(this.f967c, null, this.f969e, this.f970f);
        j0Var.L(this.f977m);
        j0Var.C(this);
        j0Var.B(this);
        j0Var.s(this.f980p);
        j0Var.w(this.f979o);
        j0Var.A(true);
        j0Var.z(2);
        return j0Var;
    }

    @Override // android.support.v7.view.menu.j
    public void a(e eVar, boolean z2) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i2 = iA + 1;
        if (i2 < this.f974j.size()) {
            this.f974j.get(i2).f999b.e(false);
        }
        d dVarRemove = this.f974j.remove(iA);
        dVarRemove.f999b.O(this);
        if (this.B) {
            dVarRemove.f998a.K(null);
            dVarRemove.f998a.t(0);
        }
        dVarRemove.f998a.dismiss();
        int size = this.f974j.size();
        this.f982r = size > 0 ? this.f974j.get(size - 1).f1000c : D();
        if (size != 0) {
            if (z2) {
                this.f974j.get(0).f999b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f989y;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f990z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f990z.removeGlobalOnLayoutListener(this.f975k);
            }
            this.f990z = null;
        }
        this.f981q.removeOnAttachStateChangeListener(this.f976l);
        this.A.onDismiss();
    }

    @Override // android.support.v7.view.menu.j
    public boolean b(m mVar) {
        for (d dVar : this.f974j) {
            if (mVar == dVar.f999b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f989y;
        if (aVar != null) {
            aVar.b(mVar);
        }
        return true;
    }

    @Override // n0.h
    public void c() {
        if (h()) {
            return;
        }
        Iterator<e> it = this.f973i.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f973i.clear();
        View view = this.f980p;
        this.f981q = view;
        if (view != null) {
            boolean z2 = this.f990z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f990z = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f975k);
            }
            this.f981q.addOnAttachStateChangeListener(this.f976l);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean d() {
        return false;
    }

    @Override // n0.h
    public void dismiss() {
        int size = this.f974j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f974j.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f998a.h()) {
                    dVar.f998a.dismiss();
                }
            }
        }
    }

    @Override // android.support.v7.view.menu.j
    public void f(j.a aVar) {
        this.f989y = aVar;
    }

    @Override // n0.h
    public boolean h() {
        return this.f974j.size() > 0 && this.f974j.get(0).f998a.h();
    }

    @Override // n0.h
    public ListView i() {
        if (this.f974j.isEmpty()) {
            return null;
        }
        List<d> list = this.f974j;
        return list.get(list.size() - 1).a();
    }

    @Override // android.support.v7.view.menu.j
    public void k(boolean z2) {
        Iterator<d> it = this.f974j.iterator();
        while (it.hasNext()) {
            h.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f967c);
        if (h()) {
            F(eVar);
        } else {
            this.f973i.add(eVar);
        }
    }

    @Override // android.support.v7.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f974j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f974j.get(i2);
            if (!dVar.f998a.h()) {
                break;
            } else {
                i2++;
            }
        }
        if (dVar != null) {
            dVar.f999b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.support.v7.view.menu.h
    public void p(View view) {
        if (this.f980p != view) {
            this.f980p = view;
            this.f979o = g0.d.a(this.f978n, g0.m.e(view));
        }
    }

    @Override // android.support.v7.view.menu.h
    public void r(boolean z2) {
        this.f987w = z2;
    }

    @Override // android.support.v7.view.menu.h
    public void s(int i2) {
        if (this.f978n != i2) {
            this.f978n = i2;
            this.f979o = g0.d.a(i2, g0.m.e(this.f980p));
        }
    }

    @Override // android.support.v7.view.menu.h
    public void t(int i2) {
        this.f983s = true;
        this.f985u = i2;
    }

    @Override // android.support.v7.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // android.support.v7.view.menu.h
    public void v(boolean z2) {
        this.f988x = z2;
    }

    @Override // android.support.v7.view.menu.h
    public void w(int i2) {
        this.f984t = true;
        this.f986v = i2;
    }
}
