package w;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b.a f3980a = new b.a();

    private static boolean a(v.e eVar) {
        v.e.b bVarY = eVar.y();
        v.e.b bVarO = eVar.O();
        v.f fVar = eVar.I() != null ? (v.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            v.e.b bVar = v.e.b.FIXED;
        }
        if (fVar != null) {
            fVar.O();
            v.e.b bVar2 = v.e.b.FIXED;
        }
        v.e.b bVar3 = v.e.b.FIXED;
        boolean z2 = bVarY == bVar3 || bVarY == v.e.b.WRAP_CONTENT || (bVarY == v.e.b.MATCH_CONSTRAINT && eVar.f3887p == 0 && eVar.W == 0.0f && eVar.V(0)) || eVar.e0();
        boolean z3 = bVarO == bVar3 || bVarO == v.e.b.WRAP_CONTENT || (bVarO == v.e.b.MATCH_CONSTRAINT && eVar.f3889q == 0 && eVar.W == 0.0f && eVar.V(1)) || eVar.f0();
        if (eVar.W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    private static void b(v.e eVar, b.InterfaceC0046b interfaceC0046b, boolean z2) {
        v.d dVar;
        v.d dVar2;
        v.d dVar3;
        v.d dVar4;
        v.d dVar5;
        if (!(eVar instanceof v.f) && eVar.d0() && a(eVar)) {
            v.f.A1(eVar, interfaceC0046b, new b.a(), b.a.f3934k);
        }
        v.d dVarM = eVar.m(v.d.b.LEFT);
        v.d dVarM2 = eVar.m(v.d.b.RIGHT);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator<v.d> it = dVarM.c().iterator();
            while (it.hasNext()) {
                v.d next = it.next();
                v.e eVar2 = next.f3840d;
                boolean zA = a(eVar2);
                if (eVar2.d0() && zA) {
                    v.f.A1(eVar2, interfaceC0046b, new b.a(), b.a.f3934k);
                }
                v.e.b bVarY = eVar2.y();
                v.e.b bVar = v.e.b.MATCH_CONSTRAINT;
                if (bVarY != bVar || zA) {
                    if (!eVar2.d0()) {
                        v.d dVar6 = eVar2.H;
                        if (next == dVar6 && eVar2.J.f3842f == null) {
                            int iE = dVar6.e() + iD;
                            eVar2.p0(iE, eVar2.R() + iE);
                        } else {
                            v.d dVar7 = eVar2.J;
                            if (next == dVar7 && dVar6.f3842f == null) {
                                int iE2 = iD - dVar7.e();
                                eVar2.p0(iE2 - eVar2.R(), iE2);
                            } else if (next == dVar6 && (dVar3 = dVar7.f3842f) != null && dVar3.m() && !eVar2.Z()) {
                                d(interfaceC0046b, eVar2, z2);
                            }
                        }
                        b(eVar2, interfaceC0046b, z2);
                    }
                } else if (eVar2.y() == bVar && eVar2.f3895t >= 0 && eVar2.f3893s >= 0 && (eVar2.Q() == 8 || (eVar2.f3887p == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.Z() && !eVar2.c0()) {
                        if (((next == eVar2.H && (dVar5 = eVar2.J.f3842f) != null && dVar5.m()) || (next == eVar2.J && (dVar4 = eVar2.H.f3842f) != null && dVar4.m())) && !eVar2.Z()) {
                            e(eVar, interfaceC0046b, eVar2, z2);
                        }
                    }
                }
            }
        }
        if ((eVar instanceof v.g) || dVarM2.c() == null || !dVarM2.m()) {
            return;
        }
        Iterator<v.d> it2 = dVarM2.c().iterator();
        while (it2.hasNext()) {
            v.d next2 = it2.next();
            v.e eVar3 = next2.f3840d;
            boolean zA2 = a(eVar3);
            if (eVar3.d0() && zA2) {
                v.f.A1(eVar3, interfaceC0046b, new b.a(), b.a.f3934k);
            }
            boolean z3 = (next2 == eVar3.H && (dVar2 = eVar3.J.f3842f) != null && dVar2.m()) || (next2 == eVar3.J && (dVar = eVar3.H.f3842f) != null && dVar.m());
            v.e.b bVarY2 = eVar3.y();
            v.e.b bVar2 = v.e.b.MATCH_CONSTRAINT;
            if (bVarY2 != bVar2 || zA2) {
                if (!eVar3.d0()) {
                    v.d dVar8 = eVar3.H;
                    if (next2 == dVar8 && eVar3.J.f3842f == null) {
                        int iE3 = dVar8.e() + iD2;
                        eVar3.p0(iE3, eVar3.R() + iE3);
                    } else {
                        v.d dVar9 = eVar3.J;
                        if (next2 == dVar9 && dVar8.f3842f == null) {
                            int iE4 = iD2 - dVar9.e();
                            eVar3.p0(iE4 - eVar3.R(), iE4);
                        } else if (z3 && !eVar3.Z()) {
                            d(interfaceC0046b, eVar3, z2);
                        }
                    }
                    b(eVar3, interfaceC0046b, z2);
                }
            } else if (eVar3.y() == bVar2 && eVar3.f3895t >= 0 && eVar3.f3893s >= 0 && (eVar3.Q() == 8 || (eVar3.f3887p == 0 && eVar3.t() == 0.0f))) {
                if (!eVar3.Z() && !eVar3.c0() && z3 && !eVar3.Z()) {
                    e(eVar, interfaceC0046b, eVar3, z2);
                }
            }
        }
    }

    private static void c(v.a aVar, b.InterfaceC0046b interfaceC0046b, int i2, boolean z2) {
        if (aVar.c1()) {
            if (i2 == 0) {
                b(aVar, interfaceC0046b, z2);
            } else {
                i(aVar, interfaceC0046b);
            }
        }
    }

    private static void d(b.InterfaceC0046b interfaceC0046b, v.e eVar, boolean z2) {
        float fW = eVar.w();
        int iD = eVar.H.f3842f.d();
        int iD2 = eVar.J.f3842f.d();
        int iE = eVar.H.e() + iD;
        int iE2 = iD2 - eVar.J.e();
        if (iD == iD2) {
            fW = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = eVar.R();
        int i2 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i2 = (iD - iD2) - iR;
        }
        int i3 = ((int) ((fW * i2) + 0.5f)) + iD;
        int i4 = i3 + iR;
        if (iD > iD2) {
            i4 = i3 - iR;
        }
        eVar.p0(i3, i4);
        b(eVar, interfaceC0046b, z2);
    }

    private static void e(v.e eVar, b.InterfaceC0046b interfaceC0046b, v.e eVar2, boolean z2) {
        float fW = eVar2.w();
        int iD = eVar2.H.f3842f.d() + eVar2.H.e();
        int iD2 = eVar2.J.f3842f.d() - eVar2.J.e();
        if (iD2 >= iD) {
            int iR = eVar2.R();
            if (eVar2.Q() != 8) {
                int i2 = eVar2.f3887p;
                if (i2 == 2) {
                    if (!(eVar instanceof v.f)) {
                        eVar = eVar.I();
                    }
                    iR = (int) (eVar2.w() * 0.5f * eVar.R());
                } else if (i2 == 0) {
                    iR = iD2 - iD;
                }
                iR = Math.max(eVar2.f3893s, iR);
                int i3 = eVar2.f3895t;
                if (i3 > 0) {
                    iR = Math.min(i3, iR);
                }
            }
            int i4 = iD + ((int) ((fW * ((iD2 - iD) - iR)) + 0.5f));
            eVar2.p0(i4, iR + i4);
            b(eVar2, interfaceC0046b, z2);
        }
    }

    private static void f(b.InterfaceC0046b interfaceC0046b, v.e eVar) {
        float fM = eVar.M();
        int iD = eVar.I.f3842f.d();
        int iD2 = eVar.K.f3842f.d();
        int iE = eVar.I.e() + iD;
        int iE2 = iD2 - eVar.K.e();
        if (iD == iD2) {
            fM = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iV = eVar.v();
        int i2 = (iD2 - iD) - iV;
        if (iD > iD2) {
            i2 = (iD - iD2) - iV;
        }
        int i3 = (int) ((fM * i2) + 0.5f);
        int i4 = iD + i3;
        int i5 = i4 + iV;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iV;
        }
        eVar.s0(i4, i5);
        i(eVar, interfaceC0046b);
    }

    private static void g(v.e eVar, b.InterfaceC0046b interfaceC0046b, v.e eVar2) {
        float fM = eVar2.M();
        int iD = eVar2.I.f3842f.d() + eVar2.I.e();
        int iD2 = eVar2.K.f3842f.d() - eVar2.K.e();
        if (iD2 >= iD) {
            int iV = eVar2.v();
            if (eVar2.Q() != 8) {
                int i2 = eVar2.f3889q;
                if (i2 == 2) {
                    if (!(eVar instanceof v.f)) {
                        eVar = eVar.I();
                    }
                    iV = (int) (fM * 0.5f * eVar.v());
                } else if (i2 == 0) {
                    iV = iD2 - iD;
                }
                iV = Math.max(eVar2.f3899v, iV);
                int i3 = eVar2.f3901w;
                if (i3 > 0) {
                    iV = Math.min(i3, iV);
                }
            }
            int i4 = iD + ((int) ((fM * ((iD2 - iD) - iV)) + 0.5f));
            eVar2.s0(i4, iV + i4);
            i(eVar2, interfaceC0046b);
        }
    }

    public static void h(v.f fVar, b.InterfaceC0046b interfaceC0046b) {
        int iE1;
        int iE2;
        v.e.b bVarY = fVar.y();
        v.e.b bVarO = fVar.O();
        fVar.i0();
        ArrayList<v.e> arrayListA1 = fVar.a1();
        int size = arrayListA1.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayListA1.get(i2).i0();
        }
        boolean zX1 = fVar.x1();
        if (bVarY == v.e.b.FIXED) {
            fVar.p0(0, fVar.R());
        } else {
            fVar.q0(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            v.e eVar = arrayListA1.get(i3);
            if (eVar instanceof v.g) {
                v.g gVar = (v.g) eVar;
                if (gVar.b1() == 1) {
                    if (gVar.c1() != -1) {
                        iE2 = gVar.c1();
                    } else if (gVar.d1() == -1 || !fVar.e0()) {
                        if (fVar.e0()) {
                            iE2 = (int) ((gVar.e1() * fVar.R()) + 0.5f);
                        }
                        z2 = true;
                    } else {
                        iE2 = fVar.R() - gVar.d1();
                    }
                    gVar.f1(iE2);
                    z2 = true;
                }
            } else if ((eVar instanceof v.a) && ((v.a) eVar).g1() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                v.e eVar2 = arrayListA1.get(i4);
                if (eVar2 instanceof v.g) {
                    v.g gVar2 = (v.g) eVar2;
                    if (gVar2.b1() == 1) {
                        b(gVar2, interfaceC0046b, zX1);
                    }
                }
            }
        }
        b(fVar, interfaceC0046b, zX1);
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                v.e eVar3 = arrayListA1.get(i5);
                if (eVar3 instanceof v.a) {
                    v.a aVar = (v.a) eVar3;
                    if (aVar.g1() == 0) {
                        c(aVar, interfaceC0046b, 0, zX1);
                    }
                }
            }
        }
        if (bVarO == v.e.b.FIXED) {
            fVar.s0(0, fVar.v());
        } else {
            fVar.r0(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            v.e eVar4 = arrayListA1.get(i6);
            if (eVar4 instanceof v.g) {
                v.g gVar3 = (v.g) eVar4;
                if (gVar3.b1() == 0) {
                    if (gVar3.c1() != -1) {
                        iE1 = gVar3.c1();
                    } else if (gVar3.d1() == -1 || !fVar.f0()) {
                        if (fVar.f0()) {
                            iE1 = (int) ((gVar3.e1() * fVar.v()) + 0.5f);
                        }
                        z4 = true;
                    } else {
                        iE1 = fVar.v() - gVar3.d1();
                    }
                    gVar3.f1(iE1);
                    z4 = true;
                }
            } else if ((eVar4 instanceof v.a) && ((v.a) eVar4).g1() == 1) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                v.e eVar5 = arrayListA1.get(i7);
                if (eVar5 instanceof v.g) {
                    v.g gVar4 = (v.g) eVar5;
                    if (gVar4.b1() == 0) {
                        i(gVar4, interfaceC0046b);
                    }
                }
            }
        }
        i(fVar, interfaceC0046b);
        if (z5) {
            for (int i8 = 0; i8 < size; i8++) {
                v.e eVar6 = arrayListA1.get(i8);
                if (eVar6 instanceof v.a) {
                    v.a aVar2 = (v.a) eVar6;
                    if (aVar2.g1() == 1) {
                        c(aVar2, interfaceC0046b, 1, zX1);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            v.e eVar7 = arrayListA1.get(i9);
            if (eVar7.d0() && a(eVar7)) {
                v.f.A1(eVar7, interfaceC0046b, f3980a, b.a.f3934k);
                b(eVar7, interfaceC0046b, zX1);
                i(eVar7, interfaceC0046b);
            }
        }
    }

    private static void i(v.e eVar, b.InterfaceC0046b interfaceC0046b) {
        v.d dVar;
        v.d dVar2;
        v.d dVar3;
        v.d dVar4;
        v.d dVar5;
        if (!(eVar instanceof v.f) && eVar.d0() && a(eVar)) {
            v.f.A1(eVar, interfaceC0046b, new b.a(), b.a.f3934k);
        }
        v.d dVarM = eVar.m(v.d.b.TOP);
        v.d dVarM2 = eVar.m(v.d.b.BOTTOM);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator<v.d> it = dVarM.c().iterator();
            while (it.hasNext()) {
                v.d next = it.next();
                v.e eVar2 = next.f3840d;
                boolean zA = a(eVar2);
                if (eVar2.d0() && zA) {
                    v.f.A1(eVar2, interfaceC0046b, new b.a(), b.a.f3934k);
                }
                v.e.b bVarO = eVar2.O();
                v.e.b bVar = v.e.b.MATCH_CONSTRAINT;
                if (bVarO != bVar || zA) {
                    if (!eVar2.d0()) {
                        v.d dVar6 = eVar2.I;
                        if (next == dVar6 && eVar2.K.f3842f == null) {
                            int iE = dVar6.e() + iD;
                            eVar2.s0(iE, eVar2.v() + iE);
                        } else {
                            v.d dVar7 = eVar2.K;
                            if (next == dVar7 && dVar7.f3842f == null) {
                                int iE2 = iD - dVar7.e();
                                eVar2.s0(iE2 - eVar2.v(), iE2);
                            } else if (next == dVar6 && (dVar3 = dVar7.f3842f) != null && dVar3.m()) {
                                f(interfaceC0046b, eVar2);
                            }
                        }
                        i(eVar2, interfaceC0046b);
                    }
                } else if (eVar2.O() == bVar && eVar2.f3901w >= 0 && eVar2.f3899v >= 0 && (eVar2.Q() == 8 || (eVar2.f3889q == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.b0() && !eVar2.c0()) {
                        if (((next == eVar2.I && (dVar5 = eVar2.K.f3842f) != null && dVar5.m()) || (next == eVar2.K && (dVar4 = eVar2.I.f3842f) != null && dVar4.m())) && !eVar2.b0()) {
                            g(eVar, interfaceC0046b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof v.g) {
            return;
        }
        if (dVarM2.c() != null && dVarM2.m()) {
            Iterator<v.d> it2 = dVarM2.c().iterator();
            while (it2.hasNext()) {
                v.d next2 = it2.next();
                v.e eVar3 = next2.f3840d;
                boolean zA2 = a(eVar3);
                if (eVar3.d0() && zA2) {
                    v.f.A1(eVar3, interfaceC0046b, new b.a(), b.a.f3934k);
                }
                boolean z2 = (next2 == eVar3.I && (dVar2 = eVar3.K.f3842f) != null && dVar2.m()) || (next2 == eVar3.K && (dVar = eVar3.I.f3842f) != null && dVar.m());
                v.e.b bVarO2 = eVar3.O();
                v.e.b bVar2 = v.e.b.MATCH_CONSTRAINT;
                if (bVarO2 != bVar2 || zA2) {
                    if (!eVar3.d0()) {
                        v.d dVar8 = eVar3.I;
                        if (next2 == dVar8 && eVar3.K.f3842f == null) {
                            int iE3 = dVar8.e() + iD2;
                            eVar3.s0(iE3, eVar3.v() + iE3);
                        } else {
                            v.d dVar9 = eVar3.K;
                            if (next2 == dVar9 && dVar8.f3842f == null) {
                                int iE4 = iD2 - dVar9.e();
                                eVar3.s0(iE4 - eVar3.v(), iE4);
                            } else if (z2 && !eVar3.b0()) {
                                f(interfaceC0046b, eVar3);
                            }
                        }
                        i(eVar3, interfaceC0046b);
                    }
                } else if (eVar3.O() == bVar2 && eVar3.f3901w >= 0 && eVar3.f3899v >= 0 && (eVar3.Q() == 8 || (eVar3.f3889q == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.b0() && !eVar3.c0() && z2 && !eVar3.b0()) {
                        g(eVar, interfaceC0046b, eVar3);
                    }
                }
            }
        }
        v.d dVarM3 = eVar.m(v.d.b.BASELINE);
        if (dVarM3.c() == null || !dVarM3.m()) {
            return;
        }
        int iD3 = dVarM3.d();
        for (v.d dVar10 : dVarM3.c()) {
            v.e eVar4 = dVar10.f3840d;
            boolean zA3 = a(eVar4);
            if (eVar4.d0() && zA3) {
                v.f.A1(eVar4, interfaceC0046b, new b.a(), b.a.f3934k);
            }
            if (eVar4.O() != v.e.b.MATCH_CONSTRAINT || zA3) {
                if (!eVar4.d0() && dVar10 == eVar4.L) {
                    eVar4.o0(iD3);
                    i(eVar4, interfaceC0046b);
                }
            }
        }
    }
}
