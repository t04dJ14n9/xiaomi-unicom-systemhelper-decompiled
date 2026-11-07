package android.support.v4.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f635f;

        a(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f631b = i2;
            this.f632c = arrayList;
            this.f633d = arrayList2;
            this.f634e = arrayList3;
            this.f635f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i2 = 0; i2 < this.f631b; i2++) {
                g0.m.y((View) this.f632c.get(i2), (String) this.f633d.get(i2));
                g0.m.y((View) this.f634e.get(i2), (String) this.f635f.get(i2));
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f638c;

        b(ArrayList arrayList, Map map) {
            this.f637b = arrayList;
            this.f638c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f637b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f637b.get(i2);
                String strG = g0.m.g(view);
                if (strG != null) {
                    g0.m.y(view, r.i(this.f638c, strG));
                }
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f641c;

        c(ArrayList arrayList, Map map) {
            this.f640b = arrayList;
            this.f641c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f640b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f640b.get(i2);
                g0.m.y(view, (String) this.f641c.get(g0.m.g(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList<View> arrayList, View view) {
        View view2;
        ViewGroup viewGroup;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
                if (!g0.o.a(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        view2 = view;
                        view2 = viewGroup;
                        f(arrayList, viewGroup.getChildAt(i2));
                    }
                    view2 = view;
                    view2 = viewGroup;
                    return;
                }
            }
            view2 = view;
            view2 = viewGroup;
            view2 = view;
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String strG = g0.m.g(view);
            if (strG != null) {
                map.put(strG, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    j(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        rect.set(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(g0.m.g(view));
            g0.m.y(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        u.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        u.a(view, new b(arrayList, map));
    }

    void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String strG = g0.m.g(view2);
            arrayList4.add(strG);
            if (strG != null) {
                g0.m.y(view2, null);
                String str = map.get(strG);
                for (int i3 = 0; i3 < size; i3++) {
                    if (str.equals(arrayList3.get(i3))) {
                        g0.m.y(arrayList2.get(i3), strG);
                        break;
                    }
                }
            }
        }
        u.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
