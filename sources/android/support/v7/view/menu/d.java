package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f1012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1013c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LayoutInflater f1016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1017g;

    public d(e eVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f1015e = z2;
        this.f1016f = layoutInflater;
        this.f1012b = eVar;
        this.f1017g = i2;
        a();
    }

    void a() {
        g gVarV = this.f1012b.v();
        if (gVarV != null) {
            ArrayList<g> arrayListZ = this.f1012b.z();
            int size = arrayListZ.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayListZ.get(i2) == gVarV) {
                    this.f1013c = i2;
                    return;
                }
            }
        }
        this.f1013c = -1;
    }

    public e b() {
        return this.f1012b;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i2) {
        ArrayList<g> arrayListZ = this.f1015e ? this.f1012b.z() : this.f1012b.E();
        int i3 = this.f1013c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayListZ.get(i2);
    }

    public void d(boolean z2) {
        this.f1014d = z2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListZ = this.f1015e ? this.f1012b.z() : this.f1012b.E();
        return this.f1013c < 0 ? arrayListZ.size() : arrayListZ.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1016f.inflate(this.f1017g, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1012b.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f1014d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.b(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
