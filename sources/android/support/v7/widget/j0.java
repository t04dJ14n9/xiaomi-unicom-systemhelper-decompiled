package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends h0 implements i0 {
    private static Method M;
    private i0 L;

    public static class a extends d0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final int f1432p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final int f1433q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private i0 f1434r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private MenuItem f1435s;

        public a(Context context, boolean z2) {
            super(context, z2);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1432p = 21;
                this.f1433q = 22;
            } else {
                this.f1432p = 22;
                this.f1433q = 21;
            }
        }

        @Override // android.support.v7.widget.d0
        public /* bridge */ /* synthetic */ int d(int i2, int i3, int i4, int i5, int i6) {
            return super.d(i2, i3, i4, i5, i6);
        }

        @Override // android.support.v7.widget.d0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i2) {
            return super.e(motionEvent, i2);
        }

        @Override // android.support.v7.widget.d0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // android.support.v7.widget.d0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // android.support.v7.widget.d0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // android.support.v7.widget.d0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // android.support.v7.widget.d0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            android.support.v7.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i2;
            if (this.f1434r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (android.support.v7.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (android.support.v7.view.menu.d) adapter;
                    headersCount = 0;
                }
                android.support.v7.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= dVar.getCount()) ? null : dVar.getItem(i2);
                MenuItem menuItem = this.f1435s;
                if (menuItem != item) {
                    android.support.v7.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f1434r.b(eVarB, menuItem);
                    }
                    this.f1435s = item;
                    if (item != null) {
                        this.f1434r.a(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f1432p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i2 != this.f1433q) {
                return super.onKeyDown(i2, keyEvent);
            }
            setSelection(-1);
            ((android.support.v7.view.menu.d) getAdapter()).b().e(false);
            return true;
        }

        @Override // android.support.v7.widget.d0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(i0 i0Var) {
            this.f1434r = i0Var;
        }

        @Override // android.support.v7.widget.d0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            M = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void J(Object obj) {
        this.H.setEnterTransition((Transition) obj);
    }

    public void K(Object obj) {
        this.H.setExitTransition((Transition) obj);
    }

    public void L(i0 i0Var) {
        this.L = i0Var;
    }

    public void M(boolean z2) {
        Method method = M;
        if (method != null) {
            try {
                method.invoke(this.H, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // android.support.v7.widget.i0
    public void a(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        i0 i0Var = this.L;
        if (i0Var != null) {
            i0Var.a(eVar, menuItem);
        }
    }

    @Override // android.support.v7.widget.i0
    public void b(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
        i0 i0Var = this.L;
        if (i0Var != null) {
            i0Var.b(eVar, menuItem);
        }
    }

    @Override // android.support.v7.widget.h0
    d0 f(Context context, boolean z2) {
        a aVar = new a(context, z2);
        aVar.setHoverListener(this);
        return aVar;
    }
}
