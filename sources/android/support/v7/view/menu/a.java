package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected LayoutInflater f961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j.a f962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected k f965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f966k;

    public a(Context context, int i2, int i3) {
        this.f957b = context;
        this.f960e = LayoutInflater.from(context);
        this.f963h = i2;
        this.f964i = i3;
    }

    @Override // android.support.v7.view.menu.j
    public void a(e eVar, boolean z2) {
        j.a aVar = this.f962g;
        if (aVar != null) {
            aVar.a(eVar, z2);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean b(m mVar) {
        j.a aVar = this.f962g;
        if (aVar != null) {
            return aVar.b(mVar);
        }
        return false;
    }

    protected void c(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f965j).addView(view, i2);
    }

    @Override // android.support.v7.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void f(j.a aVar) {
        this.f962g = aVar;
    }

    @Override // android.support.v7.view.menu.j
    public void g(Context context, e eVar) {
        this.f958c = context;
        this.f961f = LayoutInflater.from(context);
        this.f959d = eVar;
    }

    public abstract void h(g gVar, k.a aVar);

    public k.a i(ViewGroup viewGroup) {
        return (k.a) this.f960e.inflate(this.f964i, viewGroup, false);
    }

    @Override // android.support.v7.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.j
    public void k(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.f965j;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f959d;
        int i2 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> arrayListE = this.f959d.E();
            int size = arrayListE.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                g gVar = arrayListE.get(i4);
                if (q(i3, gVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        c(viewN, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i2)) {
                i2++;
            }
        }
    }

    protected boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public j.a m() {
        return this.f962g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarI = view instanceof k.a ? (k.a) view : i(viewGroup);
        h(gVar, aVarI);
        return (View) aVarI;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f965j == null) {
            k kVar = (k) this.f960e.inflate(this.f963h, viewGroup, false);
            this.f965j = kVar;
            kVar.b(this.f959d);
            k(true);
        }
        return this.f965j;
    }

    public void p(int i2) {
        this.f966k = i2;
    }

    public abstract boolean q(int i2, g gVar);
}
