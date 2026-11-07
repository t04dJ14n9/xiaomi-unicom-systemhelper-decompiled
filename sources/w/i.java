package w;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static o a(v.e eVar, int i2, ArrayList<o> arrayList, o oVar) {
        v.d dVar;
        int iB1;
        int i3 = i2 == 0 ? eVar.A0 : eVar.B0;
        if (i3 != -1 && (oVar == null || i3 != oVar.f3996b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                o oVar2 = arrayList.get(i4);
                if (oVar2.c() == i3) {
                    if (oVar != null) {
                        oVar.g(i2, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof v.i) && (iB1 = ((v.i) eVar).b1(i2)) != -1) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    o oVar3 = arrayList.get(i5);
                    if (oVar3.c() == iB1) {
                        oVar = oVar3;
                        break;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i2);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof v.g) {
                v.g gVar = (v.g) eVar;
                gVar.a1().b(gVar.b1() == 0 ? 1 : 0, arrayList, oVar);
            }
            int iC = oVar.c();
            if (i2 == 0) {
                eVar.A0 = iC;
                eVar.H.b(i2, arrayList, oVar);
                dVar = eVar.J;
            } else {
                eVar.B0 = iC;
                eVar.I.b(i2, arrayList, oVar);
                eVar.L.b(i2, arrayList, oVar);
                dVar = eVar.K;
            }
            dVar.b(i2, arrayList, oVar);
            eVar.O.b(i2, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = arrayList.get(i3);
            if (i2 == oVar.f3996b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0336  */
    public static boolean c(v.f fVar, b.InterfaceC0046b interfaceC0046b) {
        o oVar;
        boolean z2;
        o oVar2;
        Object obj;
        ArrayList<v.e> arrayListA1 = fVar.a1();
        int size = arrayListA1.size();
        for (int i2 = 0; i2 < size; i2++) {
            v.e eVar = arrayListA1.get(i2);
            if (!d(fVar.y(), fVar.O(), eVar.y(), eVar.O())) {
                return false;
            }
        }
        ArrayList arrayList = null;
        ArrayList<v.i> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<v.i> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        for (int i3 = 0; i3 < size; i3++) {
            v.e eVar2 = arrayListA1.get(i3);
            if (!d(fVar.y(), fVar.O(), eVar2.y(), eVar2.O())) {
                v.f.A1(eVar2, interfaceC0046b, fVar.f3921f1, b.a.f3934k);
            }
            boolean z3 = eVar2 instanceof v.g;
            if (z3) {
                v.g gVar = (v.g) eVar2;
                if (gVar.b1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(gVar);
                }
                if (gVar.b1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gVar);
                }
            }
            if (eVar2 instanceof v.i) {
                if (eVar2 instanceof v.a) {
                    v.a aVar = (v.a) eVar2;
                    if (aVar.g1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    int iG1 = aVar.g1();
                    obj = aVar;
                    if (iG1 == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            obj = aVar;
                        }
                    }
                } else {
                    v.i iVar = (v.i) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar);
                    obj = iVar;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        obj = iVar;
                    }
                }
                arrayList4.add(obj);
            }
            if (eVar2.H.f3842f == null && eVar2.J.f3842f == null && !z3 && !(eVar2 instanceof v.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.I.f3842f == null && eVar2.K.f3842f == null && eVar2.L.f3842f == null && !z3 && !(eVar2 instanceof v.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
        }
        ArrayList<o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((v.g) it.next(), 0, arrayList7, null);
            }
        }
        o oVar3 = null;
        int i4 = 0;
        if (arrayList2 != null) {
            for (v.i iVar2 : arrayList2) {
                o oVarA = a(iVar2, i4, arrayList7, oVar3);
                iVar2.a1(arrayList7, i4, oVarA);
                oVarA.b(arrayList7);
                oVar3 = null;
                i4 = 0;
            }
        }
        v.d dVarM = fVar.m(v.d.b.LEFT);
        if (dVarM.c() != null) {
            Iterator<v.d> it2 = dVarM.c().iterator();
            while (it2.hasNext()) {
                a(it2.next().f3840d, 0, arrayList7, null);
            }
        }
        v.d dVarM2 = fVar.m(v.d.b.RIGHT);
        if (dVarM2.c() != null) {
            Iterator<v.d> it3 = dVarM2.c().iterator();
            while (it3.hasNext()) {
                a(it3.next().f3840d, 0, arrayList7, null);
            }
        }
        v.d dVarM3 = fVar.m(v.d.b.CENTER);
        if (dVarM3.c() != null) {
            Iterator<v.d> it4 = dVarM3.c().iterator();
            while (it4.hasNext()) {
                a(it4.next().f3840d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((v.e) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((v.g) it6.next(), 1, arrayList7, null);
            }
        }
        if (arrayList4 != null) {
            for (v.i iVar3 : arrayList4) {
                o oVarA2 = a(iVar3, 1, arrayList7, oVar4);
                iVar3.a1(arrayList7, 1, oVarA2);
                oVarA2.b(arrayList7);
                oVar4 = null;
            }
        }
        v.d dVarM4 = fVar.m(v.d.b.TOP);
        if (dVarM4.c() != null) {
            Iterator<v.d> it7 = dVarM4.c().iterator();
            while (it7.hasNext()) {
                a(it7.next().f3840d, 1, arrayList7, null);
            }
        }
        v.d dVarM5 = fVar.m(v.d.b.BASELINE);
        if (dVarM5.c() != null) {
            Iterator<v.d> it8 = dVarM5.c().iterator();
            while (it8.hasNext()) {
                a(it8.next().f3840d, 1, arrayList7, null);
            }
        }
        v.d dVarM6 = fVar.m(v.d.b.BOTTOM);
        if (dVarM6.c() != null) {
            Iterator<v.d> it9 = dVarM6.c().iterator();
            while (it9.hasNext()) {
                a(it9.next().f3840d, 1, arrayList7, null);
            }
        }
        v.d dVarM7 = fVar.m(v.d.b.CENTER);
        if (dVarM7.c() != null) {
            Iterator<v.d> it10 = dVarM7.c().iterator();
            while (it10.hasNext()) {
                a(it10.next().f3840d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((v.e) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            v.e eVar3 = arrayListA1.get(i5);
            if (eVar3.g0()) {
                o oVarB = b(arrayList7, eVar3.A0);
                o oVarB2 = b(arrayList7, eVar3.B0);
                if (oVarB != null && oVarB2 != null) {
                    oVarB.g(0, oVarB2);
                    oVarB2.i(2);
                    arrayList7.remove(oVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.y() == v.e.b.WRAP_CONTENT) {
            oVar = null;
            int i6 = 0;
            for (o oVar5 : arrayList7) {
                if (oVar5.d() != 1) {
                    oVar5.h(false);
                    int iF = oVar5.f(fVar.t1(), 0);
                    if (iF > i6) {
                        oVar = oVar5;
                        i6 = iF;
                    }
                }
            }
            if (oVar != null) {
                fVar.z0(v.e.b.FIXED);
                fVar.U0(i6);
                oVar.h(true);
            } else {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (fVar.O() == v.e.b.WRAP_CONTENT) {
            o oVar6 = null;
            int i7 = 0;
            for (o oVar7 : arrayList7) {
                if (oVar7.d() != 0) {
                    oVar7.h(false);
                    int iF2 = oVar7.f(fVar.t1(), 1);
                    if (iF2 > i7) {
                        oVar6 = oVar7;
                        i7 = iF2;
                    }
                }
            }
            z2 = false;
            if (oVar6 != null) {
                fVar.Q0(v.e.b.FIXED);
                fVar.v0(i7);
                oVar6.h(true);
                oVar2 = oVar6;
            }
            if (oVar == null || oVar2 != null) {
                return true;
            }
            return z2;
        }
        z2 = false;
        oVar2 = null;
        if (oVar == null) {
        }
        return true;
    }

    public static boolean d(v.e.b bVar, v.e.b bVar2, v.e.b bVar3, v.e.b bVar4) {
        v.e.b bVar5;
        v.e.b bVar6;
        v.e.b bVar7 = v.e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = v.e.b.WRAP_CONTENT) || (bVar3 == v.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = v.e.b.WRAP_CONTENT) || (bVar4 == v.e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
