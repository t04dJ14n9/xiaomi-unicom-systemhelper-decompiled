package android.support.v7.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f1001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LayoutInflater f1002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f1003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ExpandedMenuView f1004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f1007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f1008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f1009j;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1010b = -1;

        public a() {
            a();
        }

        void a() {
            g gVarV = c.this.f1003d.v();
            if (gVarV != null) {
                ArrayList<g> arrayListZ = c.this.f1003d.z();
                int size = arrayListZ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListZ.get(i2) == gVarV) {
                        this.f1010b = i2;
                        return;
                    }
                }
            }
            this.f1010b = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i2) {
            ArrayList<g> arrayListZ = c.this.f1003d.z();
            int i3 = i2 + c.this.f1005f;
            int i4 = this.f1010b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayListZ.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f1003d.z().size() - c.this.f1005f;
            return this.f1010b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f1002c.inflate(cVar.f1007h, viewGroup, false);
            }
            ((k.a) view).b(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i2, int i3) {
        this.f1007h = i2;
        this.f1006g = i3;
    }

    public c(Context context, int i2) {
        this(i2, 0);
        this.f1001b = context;
        this.f1002c = LayoutInflater.from(context);
    }

    @Override // android.support.v7.view.menu.j
    public void a(e eVar, boolean z2) {
        j.a aVar = this.f1008i;
        if (aVar != null) {
            aVar.a(eVar, z2);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean b(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f1008i;
        if (aVar == null) {
            return true;
        }
        aVar.b(mVar);
        return true;
    }

    public ListAdapter c() {
        if (this.f1009j == null) {
            this.f1009j = new a();
        }
        return this.f1009j;
    }

    @Override // android.support.v7.view.menu.j
    public boolean d() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void f(j.a aVar) {
        this.f1008i = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.support.v7.view.menu.j
    public void g(Context context, e eVar) {
        LayoutInflater layoutInflaterFrom;
        a aVar;
        if (this.f1006g == 0) {
            if (this.f1001b != null) {
                this.f1001b = context;
                if (this.f1002c == null) {
                    layoutInflaterFrom = LayoutInflater.from(context);
                }
            }
            this.f1003d = eVar;
            aVar = this.f1009j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1006g);
        this.f1001b = contextThemeWrapper;
        layoutInflaterFrom = LayoutInflater.from(contextThemeWrapper);
        this.f1002c = layoutInflaterFrom;
        this.f1003d = eVar;
        aVar = this.f1009j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public k h(ViewGroup viewGroup) {
        if (this.f1004e == null) {
            this.f1004e = (ExpandedMenuView) this.f1002c.inflate(j0.g.f3124g, viewGroup, false);
            if (this.f1009j == null) {
                this.f1009j = new a();
            }
            this.f1004e.setAdapter((ListAdapter) this.f1009j);
            this.f1004e.setOnItemClickListener(this);
        }
        return this.f1004e;
    }

    @Override // android.support.v7.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void k(boolean z2) {
        a aVar = this.f1009j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1003d.M(this.f1009j.getItem(i2), this, 0);
    }
}
