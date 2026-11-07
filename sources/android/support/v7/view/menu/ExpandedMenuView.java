package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.widget.t0;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f936d = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f938c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t0 t0VarT = t0.t(context, attributeSet, f936d, i2, 0);
        if (t0VarT.q(0)) {
            setBackgroundDrawable(t0VarT.f(0));
        }
        if (t0VarT.q(1)) {
            setDivider(t0VarT.f(1));
        }
        t0VarT.u();
    }

    @Override // android.support.v7.view.menu.e.b
    public boolean a(g gVar) {
        return this.f937b.L(gVar, 0);
    }

    @Override // android.support.v7.view.menu.k
    public void b(e eVar) {
        this.f937b = eVar;
    }

    public int getWindowAnimations() {
        return this.f938c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((g) getAdapter().getItem(i2));
    }
}
