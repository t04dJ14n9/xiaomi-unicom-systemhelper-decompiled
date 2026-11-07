package android.support.v4.app;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f580a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f581b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f582c = w();

    static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f583b;

        a(ArrayList arrayList) {
            this.f583b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.A(this.f583b, 4);
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ArrayList f590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f591i;

        b(Object obj, r rVar, View view, android.support.v4.app.e eVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f584b = obj;
            this.f585c = rVar;
            this.f586d = view;
            this.f587e = eVar;
            this.f588f = arrayList;
            this.f589g = arrayList2;
            this.f590h = arrayList3;
            this.f591i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f584b;
            if (obj != null) {
                this.f585c.p(obj, this.f586d);
                this.f589g.addAll(p.k(this.f585c, this.f584b, this.f587e, this.f588f, this.f586d));
            }
            if (this.f590h != null) {
                if (this.f591i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f586d);
                    this.f585c.q(this.f591i, this.f590h, arrayList);
                }
                this.f590h.clear();
                this.f590h.add(this.f586d);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0.a f595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Rect f598h;

        c(android.support.v4.app.e eVar, android.support.v4.app.e eVar2, boolean z2, f0.a aVar, View view, r rVar, Rect rect) {
            this.f592b = eVar;
            this.f593c = eVar2;
            this.f594d = z2;
            this.f595e = aVar;
            this.f596f = view;
            this.f597g = rVar;
            this.f598h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.f(this.f592b, this.f593c, this.f594d, this.f595e, false);
            View view = this.f596f;
            if (view != null) {
                this.f597g.k(view, this.f598h);
            }
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0.a f600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f605h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ android.support.v4.app.e f606i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f607j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ ArrayList f608k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f609l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Rect f610m;

        d(r rVar, f0.a aVar, Object obj, e eVar, ArrayList arrayList, View view, android.support.v4.app.e eVar2, android.support.v4.app.e eVar3, boolean z2, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f599b = rVar;
            this.f600c = aVar;
            this.f601d = obj;
            this.f602e = eVar;
            this.f603f = arrayList;
            this.f604g = view;
            this.f605h = eVar2;
            this.f606i = eVar3;
            this.f607j = z2;
            this.f608k = arrayList2;
            this.f609l = obj2;
            this.f610m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.a<String, View> aVarH = p.h(this.f599b, this.f600c, this.f601d, this.f602e);
            if (aVarH != null) {
                this.f603f.addAll(aVarH.values());
                this.f603f.add(this.f604g);
            }
            p.f(this.f605h, this.f606i, this.f607j, aVarH, false);
            Object obj = this.f601d;
            if (obj != null) {
                this.f599b.z(obj, this.f608k, this.f603f);
                View viewS = p.s(aVarH, this.f602e, this.f609l, this.f607j);
                if (viewS != null) {
                    this.f599b.k(viewS, this.f610m);
                }
            }
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.support.v4.app.e f611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public android.support.v4.app.c f613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public android.support.v4.app.e f614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public android.support.v4.app.c f616f;

        e() {
        }
    }

    static void A(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    static void B(k kVar, ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z2) {
        if (kVar.f517m < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            android.support.v4.app.c cVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(cVar, sparseArray, z2);
            } else {
                c(cVar, sparseArray, z2);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(kVar.f518n.e());
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                f0.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i2, i3);
                e eVar = (e) sparseArray.valueAt(i5);
                if (z2) {
                    o(kVar, iKeyAt, eVar, view, aVarD);
                } else {
                    n(kVar, iKeyAt, eVar, view, aVarD);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, f0.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewL = aVar.l(size);
            if (collection.contains(g0.m.g(viewL))) {
                arrayList.add(viewL);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x005f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0076  */
    /* JADX WARN: Code duplicated, block: B:56:0x0078  */
    /* JADX WARN: Code duplicated, block: B:62:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0087  */
    /* JADX WARN: Code duplicated, block: B:64:0x008a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0092  */
    /* JADX WARN: Code duplicated, block: B:69:0x0094  */
    private static void b(android.support.v4.app.c cVar, android.support.v4.app.c.a aVar, SparseArray<e> sparseArray, boolean z2, boolean z3) {
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        View view;
        boolean z8;
        android.support.v4.app.e eVar = aVar.f422b;
        if (eVar == null || (i2 = eVar.f463z) == 0) {
            return;
        }
        int i3 = z2 ? f580a[aVar.f421a] : aVar.f421a;
        boolean z9 = false;
        if (i3 == 1) {
            if (z3) {
                z4 = eVar.O;
            } else if (!eVar.f449l || eVar.B) {
                z4 = false;
            } else {
                z4 = true;
            }
            z5 = false;
            z6 = false;
            z9 = z4;
            z7 = true;
        } else if (i3 == 3) {
            boolean z10 = eVar.f449l;
            if (z3 ? !z10 || eVar.B : z10 || (view = eVar.J) == null || view.getVisibility() != 0 || eVar.Q < 0.0f) {
                z8 = false;
            } else {
                z8 = true;
            }
            z6 = z8;
            z7 = false;
            z5 = true;
        } else if (i3 == 4) {
            if (!z3 ? !(!eVar.f449l || eVar.B) : eVar.P && eVar.f449l && eVar.B) {
                z8 = false;
            } else {
                z8 = true;
            }
            z6 = z8;
            z7 = false;
            z5 = true;
        } else if (i3 == 5) {
            if (!z3) {
                z4 = eVar.B;
            } else if (eVar.P && !eVar.B && eVar.f449l) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = false;
            z6 = false;
            z9 = z4;
            z7 = true;
        } else if (i3 == 6) {
            boolean z11 = eVar.f449l;
            if (z3) {
                z8 = false;
            } else {
                z8 = false;
            }
            z6 = z8;
            z7 = false;
            z5 = true;
        } else if (i3 != 7) {
            z7 = false;
            z5 = false;
            z6 = false;
        } else {
            if (z3) {
                z4 = eVar.O;
            } else {
                if (eVar.f449l) {
                }
                z4 = false;
            }
            z5 = false;
            z6 = false;
            z9 = z4;
            z7 = true;
        }
        e eVarP = sparseArray.get(i2);
        if (z9) {
            eVarP = p(eVarP, sparseArray, i2);
            eVarP.f611a = eVar;
            eVarP.f612b = z2;
            eVarP.f613c = cVar;
        }
        e eVarP2 = eVarP;
        if (!z3 && z7) {
            if (eVarP2 != null && eVarP2.f614d == eVar) {
                eVarP2.f614d = null;
            }
            k kVar = cVar.f400a;
            if (eVar.f439b < 1 && kVar.f517m >= 1 && !cVar.f419t) {
                kVar.s0(eVar);
                kVar.C0(eVar, 1, 0, 0, false);
            }
        }
        if (z6 && (eVarP2 == null || eVarP2.f614d == null)) {
            eVarP2 = p(eVarP2, sparseArray, i2);
            eVarP2.f614d = eVar;
            eVarP2.f615e = z2;
            eVarP2.f616f = cVar;
        }
        if (z3 || !z5 || eVarP2 == null || eVarP2.f611a != eVar) {
            return;
        }
        eVarP2.f611a = null;
    }

    public static void c(android.support.v4.app.c cVar, SparseArray<e> sparseArray, boolean z2) {
        int size = cVar.f401b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(cVar, cVar.f401b.get(i2), sparseArray, false, z2);
        }
    }

    private static f0.a<String, String> d(int i2, ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        f0.a<String, String> aVar = new f0.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            android.support.v4.app.c cVar = arrayList.get(i5);
            if (cVar.j(i2)) {
                boolean zBooleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = cVar.f417r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = cVar.f417r;
                        arrayList4 = cVar.f418s;
                    } else {
                        ArrayList<String> arrayList6 = cVar.f417r;
                        arrayList3 = cVar.f418s;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(android.support.v4.app.c cVar, SparseArray<e> sparseArray, boolean z2) {
        if (cVar.f400a.f519o.c()) {
            for (int size = cVar.f401b.size() - 1; size >= 0; size--) {
                b(cVar, cVar.f401b.get(size), sparseArray, true, z2);
            }
        }
    }

    static void f(android.support.v4.app.e eVar, android.support.v4.app.e eVar2, boolean z2, f0.a<String, View> aVar, boolean z3) {
        if (z2) {
            eVar2.o();
        } else {
            eVar.o();
        }
    }

    private static boolean g(r rVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!rVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static f0.a<String, View> h(r rVar, f0.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        android.support.v4.app.e eVar2 = eVar.f611a;
        View viewC = eVar2.C();
        if (aVar.isEmpty() || obj == null || viewC == null) {
            aVar.clear();
            return null;
        }
        f0.a<String, View> aVar2 = new f0.a<>();
        rVar.j(aVar2, viewC);
        android.support.v4.app.c cVar = eVar.f613c;
        if (eVar.f612b) {
            eVar2.q();
            arrayList = cVar.f417r;
        } else {
            eVar2.o();
            arrayList = cVar.f418s;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static f0.a<String, View> i(r rVar, f0.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        android.support.v4.app.e eVar2 = eVar.f614d;
        f0.a<String, View> aVar2 = new f0.a<>();
        rVar.j(aVar2, eVar2.C());
        android.support.v4.app.c cVar = eVar.f616f;
        if (eVar.f615e) {
            eVar2.o();
            arrayList = cVar.f418s;
        } else {
            eVar2.q();
            arrayList = cVar.f417r;
        }
        aVar2.n(arrayList);
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static r j(android.support.v4.app.e eVar, android.support.v4.app.e eVar2) {
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            Object objP = eVar.p();
            if (objP != null) {
                arrayList.add(objP);
            }
            Object objY = eVar.y();
            if (objY != null) {
                arrayList.add(objY);
            }
            Object objA = eVar.A();
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        if (eVar2 != null) {
            Object objN = eVar2.n();
            if (objN != null) {
                arrayList.add(objN);
            }
            Object objW = eVar2.w();
            if (objW != null) {
                arrayList.add(objW);
            }
            Object objZ = eVar2.z();
            if (objZ != null) {
                arrayList.add(objZ);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        r rVar = f581b;
        if (rVar != null && g(rVar, arrayList)) {
            return rVar;
        }
        r rVar2 = f582c;
        if (rVar2 != null && g(rVar2, arrayList)) {
            return rVar2;
        }
        if (rVar == null && rVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(r rVar, Object obj, android.support.v4.app.e eVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewC = eVar.C();
        if (viewC != null) {
            rVar.f(arrayList2, viewC);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        rVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(r rVar, ViewGroup viewGroup, View view, f0.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        android.support.v4.app.e eVar2 = eVar.f611a;
        android.support.v4.app.e eVar3 = eVar.f614d;
        if (eVar2 == null || eVar3 == null) {
            return null;
        }
        boolean z2 = eVar.f612b;
        Object objT = aVar.isEmpty() ? null : t(rVar, eVar2, eVar3, z2);
        f0.a<String, View> aVarI = i(rVar, aVar, objT, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(eVar2, eVar3, z2, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            rVar.y(obj3, view, arrayList);
            z(rVar, obj3, obj2, aVarI, eVar.f615e, eVar.f616f);
            if (obj != null) {
                rVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        u.a(viewGroup, new d(rVar, aVar, obj3, eVar, arrayList2, view, eVar2, eVar3, z2, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(r rVar, ViewGroup viewGroup, View view, f0.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        android.support.v4.app.e eVar2 = eVar.f611a;
        android.support.v4.app.e eVar3 = eVar.f614d;
        if (eVar2 != null) {
            eVar2.C().setVisibility(0);
        }
        if (eVar2 == null || eVar3 == null) {
            return null;
        }
        boolean z2 = eVar.f612b;
        Object objT = aVar.isEmpty() ? null : t(rVar, eVar2, eVar3, z2);
        f0.a<String, View> aVarI = i(rVar, aVar, objT, eVar);
        f0.a<String, View> aVarH = h(rVar, aVar, objT, eVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(eVar2, eVar3, z2, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            rVar.y(obj3, view, arrayList);
            z(rVar, obj3, obj2, aVarI, eVar.f615e, eVar.f616f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, eVar, obj, z2);
            if (viewS != null) {
                rVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        u.a(viewGroup, new c(eVar2, eVar3, z2, aVarH, view2, rVar, rect));
        return obj3;
    }

    private static void n(k kVar, int i2, e eVar, View view, f0.a<String, String> aVar) {
        android.support.v4.app.e eVar2;
        android.support.v4.app.e eVar3;
        r rVarJ;
        Object obj;
        ViewGroup viewGroup = kVar.f519o.c() ? (ViewGroup) kVar.f519o.b(i2) : null;
        if (viewGroup == null || (rVarJ = j((eVar3 = eVar.f614d), (eVar2 = eVar.f611a))) == null) {
            return;
        }
        boolean z2 = eVar.f612b;
        boolean z3 = eVar.f615e;
        Object objQ = q(rVarJ, eVar2, z2);
        Object objR = r(rVarJ, eVar3, z3);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(rVarJ, viewGroup, view, aVar, eVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(rVarJ, obj, eVar3, arrayList, view);
        Object obj2 = (arrayListK == null || arrayListK.isEmpty()) ? null : obj;
        rVarJ.a(objQ, view);
        Object objU = u(rVarJ, objQ, obj2, objL, eVar2, eVar.f612b);
        if (objU != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            rVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(rVarJ, viewGroup, eVar2, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            rVarJ.w(viewGroup, arrayList2, aVar);
            rVarJ.c(viewGroup, objU);
            rVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(k kVar, int i2, e eVar, View view, f0.a<String, String> aVar) {
        android.support.v4.app.e eVar2;
        android.support.v4.app.e eVar3;
        r rVarJ;
        Object obj;
        ViewGroup viewGroup = kVar.f519o.c() ? (ViewGroup) kVar.f519o.b(i2) : null;
        if (viewGroup == null || (rVarJ = j((eVar3 = eVar.f614d), (eVar2 = eVar.f611a))) == null) {
            return;
        }
        boolean z2 = eVar.f612b;
        boolean z3 = eVar.f615e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objQ = q(rVarJ, eVar2, z2);
        Object objR = r(rVarJ, eVar3, z3);
        Object objM = m(rVarJ, viewGroup, view, aVar, eVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(rVarJ, obj, eVar3, arrayList2, view);
        ArrayList<View> arrayListK2 = k(rVarJ, objQ, eVar2, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(rVarJ, objQ, obj, objM, eVar2, z2);
        if (objU != null) {
            v(rVarJ, obj, eVar3, arrayListK);
            ArrayList<String> arrayListO = rVarJ.o(arrayList);
            rVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            rVarJ.c(viewGroup, objU);
            rVarJ.x(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            rVarJ.z(objM, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i2) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i2, eVar2);
        return eVar2;
    }

    private static Object q(r rVar, android.support.v4.app.e eVar, boolean z2) {
        if (eVar == null) {
            return null;
        }
        return rVar.g(z2 ? eVar.w() : eVar.n());
    }

    private static Object r(r rVar, android.support.v4.app.e eVar, boolean z2) {
        if (eVar == null) {
            return null;
        }
        return rVar.g(z2 ? eVar.y() : eVar.p());
    }

    static View s(f0.a<String, View> aVar, e eVar, Object obj, boolean z2) {
        ArrayList<String> arrayList;
        android.support.v4.app.c cVar = eVar.f613c;
        if (obj == null || aVar == null || (arrayList = cVar.f417r) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z2 ? cVar.f417r : cVar.f418s).get(0));
    }

    private static Object t(r rVar, android.support.v4.app.e eVar, android.support.v4.app.e eVar2, boolean z2) {
        if (eVar == null || eVar2 == null) {
            return null;
        }
        return rVar.A(rVar.g(z2 ? eVar2.A() : eVar.z()));
    }

    private static Object u(r rVar, Object obj, Object obj2, Object obj3, android.support.v4.app.e eVar, boolean z2) {
        boolean zI;
        if (obj == null || obj2 == null || eVar == null) {
            zI = true;
        } else {
            zI = z2 ? eVar.i() : eVar.h();
        }
        return zI ? rVar.n(obj2, obj, obj3) : rVar.m(obj2, obj, obj3);
    }

    private static void v(r rVar, Object obj, android.support.v4.app.e eVar, ArrayList<View> arrayList) {
        if (eVar != null && obj != null && eVar.f449l && eVar.B && eVar.P) {
            eVar.U0(true);
            rVar.r(obj, eVar.C(), arrayList);
            u.a(eVar.I, new a(arrayList));
        }
    }

    private static r w() {
        try {
            return (r) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(f0.a<String, String> aVar, f0.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void y(r rVar, ViewGroup viewGroup, android.support.v4.app.e eVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        u.a(viewGroup, new b(obj, rVar, view, eVar, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(r rVar, Object obj, Object obj2, f0.a<String, View> aVar, boolean z2, android.support.v4.app.c cVar) {
        ArrayList<String> arrayList = cVar.f417r;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z2 ? cVar.f418s : cVar.f417r).get(0));
        rVar.v(obj, view);
        if (obj2 != null) {
            rVar.v(obj2, view);
        }
    }
}
