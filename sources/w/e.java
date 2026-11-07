package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v.f f3949a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v.f f3952d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3950b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3951c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<p> f3953e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<m> f3954f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.InterfaceC0046b f3955g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.a f3956h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<m> f3957i = new ArrayList<>();

    public e(v.f fVar) {
        this.f3949a = fVar;
        this.f3952d = fVar;
    }

    private void a(f fVar, int i2, int i3, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f3961d;
        if (pVar.f4011c == null) {
            v.f fVar3 = this.f3949a;
            if (pVar == fVar3.f3865e || pVar == fVar3.f3867f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i3);
                arrayList.add(mVar);
            }
            pVar.f4011c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f4016h.f3968k) {
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f4017i.f3968k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, fVar2, arrayList, mVar);
                }
            }
            if (i2 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f3991k.f3968k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f4016h.f3969l) {
                if (fVar4 == fVar2) {
                    mVar.f3985b = true;
                }
                a(fVar4, i2, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f4017i.f3969l) {
                if (fVar5 == fVar2) {
                    mVar.f3985b = true;
                }
                a(fVar5, i2, 1, fVar2, arrayList, mVar);
            }
            if (i2 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f3991k.f3969l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i2, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:98:0x0141  */
    /* JADX WARN: Code duplicated, block: B:99:0x0143  */
    private boolean b(v.f fVar) {
        int iR;
        v.e.b bVar;
        int iV;
        v.e.b bVar2;
        v.e.b[] bVarArr;
        v.e.b bVar3;
        g gVar;
        int iV2;
        v.e.b bVar4;
        v.e.b bVar5;
        for (v.e eVar : fVar.D0) {
            v.e.b[] bVarArr2 = eVar.S;
            v.e.b bVar6 = bVarArr2[0];
            v.e.b bVar7 = bVarArr2[1];
            if (eVar.Q() != 8) {
                if (eVar.f3897u < 1.0f && bVar6 == v.e.b.MATCH_CONSTRAINT) {
                    eVar.f3887p = 2;
                }
                if (eVar.f3903x < 1.0f && bVar7 == v.e.b.MATCH_CONSTRAINT) {
                    eVar.f3889q = 2;
                }
                if (eVar.t() > 0.0f) {
                    v.e.b bVar8 = v.e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == v.e.b.WRAP_CONTENT || bVar7 == v.e.b.FIXED)) {
                        eVar.f3887p = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == v.e.b.WRAP_CONTENT || bVar6 == v.e.b.FIXED)) {
                        eVar.f3889q = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f3887p == 0) {
                            eVar.f3887p = 3;
                        }
                        if (eVar.f3889q == 0) {
                            eVar.f3889q = 3;
                        }
                    }
                }
                v.e.b bVar9 = v.e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f3887p == 1 && (eVar.H.f3842f == null || eVar.J.f3842f == null)) {
                    bVar6 = v.e.b.WRAP_CONTENT;
                }
                v.e.b bVar10 = bVar6;
                if (bVar7 == bVar9 && eVar.f3889q == 1 && (eVar.I.f3842f == null || eVar.K.f3842f == null)) {
                    bVar7 = v.e.b.WRAP_CONTENT;
                }
                v.e.b bVar11 = bVar7;
                l lVar = eVar.f3865e;
                lVar.f4012d = bVar10;
                int i2 = eVar.f3887p;
                lVar.f4009a = i2;
                n nVar = eVar.f3867f;
                nVar.f4012d = bVar11;
                int i3 = eVar.f3889q;
                nVar.f4009a = i3;
                v.e.b bVar12 = v.e.b.MATCH_PARENT;
                if ((bVar10 == bVar12 || bVar10 == v.e.b.FIXED || bVar10 == v.e.b.WRAP_CONTENT) && (bVar11 == bVar12 || bVar11 == v.e.b.FIXED || bVar11 == v.e.b.WRAP_CONTENT)) {
                    int iR2 = eVar.R();
                    if (bVar10 == bVar12) {
                        iR = (fVar.R() - eVar.H.f3843g) - eVar.J.f3843g;
                        bVar = v.e.b.FIXED;
                    } else {
                        iR = iR2;
                        bVar = bVar10;
                    }
                    int iV3 = eVar.v();
                    if (bVar11 == bVar12) {
                        iV = (fVar.v() - eVar.I.f3843g) - eVar.K.f3843g;
                        bVar2 = v.e.b.FIXED;
                    } else {
                        iV = iV3;
                        bVar2 = bVar11;
                    }
                    this = this;
                    eVar = eVar;
                    this.l(eVar, bVar, iR, bVar2, iV);
                    eVar.f3865e.f4013e.d(eVar.R());
                    eVar.f3867f.f4013e.d(eVar.v());
                } else if (bVar10 == bVar9 && (bVar11 == (bVar5 = v.e.b.WRAP_CONTENT) || bVar11 == v.e.b.FIXED)) {
                    if (i2 == 3) {
                        if (bVar11 == bVar5) {
                            l(eVar, bVar5, 0, bVar5, 0);
                        }
                        iV = eVar.v();
                        iR = (int) ((iV * eVar.W) + 0.5f);
                    } else {
                        if (i2 == 1) {
                            l(eVar, bVar5, 0, bVar11, 0);
                            gVar = eVar.f3865e.f4013e;
                            iV2 = eVar.R();
                        } else if (i2 == 2) {
                            v.e.b bVar13 = fVar.S[0];
                            bVar5 = v.e.b.FIXED;
                            if (bVar13 == bVar5 || bVar13 == bVar12) {
                                iR = (int) ((eVar.f3897u * fVar.R()) + 0.5f);
                                iV = eVar.v();
                                bVar = bVar5;
                                bVar2 = bVar11;
                                this.l(eVar, bVar, iR, bVar2, iV);
                                eVar.f3865e.f4013e.d(eVar.R());
                                eVar.f3867f.f4013e.d(eVar.v());
                            } else if (bVar11 != bVar9) {
                                if (bVar10 != bVar9) {
                                }
                            } else if (bVar10 != bVar9) {
                            }
                        } else {
                            v.d[] dVarArr = eVar.P;
                            if (dVarArr[0].f3842f == null || dVarArr[1].f3842f == null) {
                                iR = 0;
                                iV = 0;
                                bVar = bVar5;
                                bVar2 = bVar11;
                                this.l(eVar, bVar, iR, bVar2, iV);
                                eVar.f3865e.f4013e.d(eVar.R());
                                eVar.f3867f.f4013e.d(eVar.v());
                            } else if (bVar11 != bVar9) {
                                if (bVar10 != bVar9) {
                                }
                            } else if (bVar10 != bVar9) {
                            }
                        }
                        gVar.f3979m = iV2;
                    }
                    bVar2 = v.e.b.FIXED;
                    this = this;
                    eVar = eVar;
                    bVar = bVar2;
                    this.l(eVar, bVar, iR, bVar2, iV);
                    eVar.f3865e.f4013e.d(eVar.R());
                    eVar.f3867f.f4013e.d(eVar.v());
                } else if (bVar11 != bVar9 && (bVar10 == (bVar4 = v.e.b.WRAP_CONTENT) || bVar10 == v.e.b.FIXED)) {
                    if (i3 == 3) {
                        if (bVar10 == bVar4) {
                            l(eVar, bVar4, 0, bVar4, 0);
                        }
                        iR = eVar.R();
                        float f2 = eVar.W;
                        if (eVar.u() == -1) {
                            f2 = 1.0f / f2;
                        }
                        iV = (int) ((iR * f2) + 0.5f);
                        bVar2 = v.e.b.FIXED;
                        this = this;
                        eVar = eVar;
                        bVar = bVar2;
                    } else {
                        if (i3 == 1) {
                            l(eVar, bVar10, 0, bVar4, 0);
                        } else {
                            if (i3 == 2) {
                                v.e.b bVar14 = fVar.S[1];
                                bVar2 = v.e.b.FIXED;
                                if (bVar14 == bVar2 || bVar14 == bVar12) {
                                    float f3 = eVar.f3903x;
                                    iR = eVar.R();
                                    this = this;
                                    eVar = eVar;
                                    bVar = bVar10;
                                    iV = (int) ((f3 * fVar.v()) + 0.5f);
                                }
                            } else {
                                v.d[] dVarArr2 = eVar.P;
                                if (dVarArr2[2].f3842f == null || dVarArr2[3].f3842f == null) {
                                    iR = 0;
                                    iV = 0;
                                    bVar = bVar4;
                                    bVar2 = bVar11;
                                }
                            }
                            if (bVar10 != bVar9) {
                            }
                        }
                        gVar = eVar.f3867f.f4013e;
                        iV2 = eVar.v();
                        gVar.f3979m = iV2;
                    }
                    this.l(eVar, bVar, iR, bVar2, iV);
                    eVar.f3865e.f4013e.d(eVar.R());
                    eVar.f3867f.f4013e.d(eVar.v());
                } else if (bVar10 != bVar9 && bVar11 == bVar9) {
                    if (i2 == 1 || i3 == 1) {
                        v.e.b bVar15 = v.e.b.WRAP_CONTENT;
                        l(eVar, bVar15, 0, bVar15, 0);
                        eVar.f3865e.f4013e.f3979m = eVar.R();
                        gVar = eVar.f3867f.f4013e;
                        iV2 = eVar.v();
                        gVar.f3979m = iV2;
                    } else if (i3 == 2 && i2 == 2 && ((bVar3 = (bVarArr = fVar.S)[0]) == (bVar2 = v.e.b.FIXED) || bVar3 == bVar2)) {
                        v.e.b bVar16 = bVarArr[1];
                        if (bVar16 == bVar2 || bVar16 == bVar2) {
                            float f4 = eVar.f3897u;
                            float f5 = eVar.f3903x;
                            iR = (int) ((f4 * fVar.R()) + 0.5f);
                            iV = (int) ((f5 * fVar.v()) + 0.5f);
                            this = this;
                            eVar = eVar;
                            bVar = bVar2;
                            this.l(eVar, bVar, iR, bVar2, iV);
                            eVar.f3865e.f4013e.d(eVar.R());
                            eVar.f3867f.f4013e.d(eVar.v());
                        }
                    }
                }
            }
            eVar.f3857a = true;
        }
        return false;
    }

    private int e(v.f fVar, int i2) {
        int size = this.f3957i.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jMax = Math.max(jMax, this.f3957i.get(i3).b(fVar, i2));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i2, ArrayList<m> arrayList) {
        for (d dVar : pVar.f4016h.f3968k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, pVar.f4017i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f4016h, i2, 0, pVar.f4017i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f4017i.f3968k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, pVar.f4016h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f4017i, i2, 1, pVar.f4016h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((n) pVar).f3991k.f3968k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(v.e eVar, v.e.b bVar, int i2, v.e.b bVar2, int i3) {
        b.a aVar = this.f3956h;
        aVar.f3937a = bVar;
        aVar.f3938b = bVar2;
        aVar.f3939c = i2;
        aVar.f3940d = i3;
        this.f3955g.b(eVar, aVar);
        eVar.U0(this.f3956h.f3941e);
        eVar.v0(this.f3956h.f3942f);
        eVar.u0(this.f3956h.f3944h);
        eVar.k0(this.f3956h.f3943g);
    }

    public void c() {
        d(this.f3953e);
        this.f3957i.clear();
        m.f3983h = 0;
        i(this.f3949a.f3865e, 0, this.f3957i);
        i(this.f3949a.f3867f, 1, this.f3957i);
        this.f3950b = false;
    }

    public void d(ArrayList<p> arrayList) {
        p jVar;
        arrayList.clear();
        this.f3952d.f3865e.f();
        this.f3952d.f3867f.f();
        arrayList.add(this.f3952d.f3865e);
        arrayList.add(this.f3952d.f3867f);
        HashSet hashSet = null;
        for (v.e eVar : this.f3952d.D0) {
            if (eVar instanceof v.g) {
                jVar = new j(eVar);
            } else {
                if (eVar.Z()) {
                    if (eVar.f3861c == null) {
                        eVar.f3861c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f3861c);
                } else {
                    arrayList.add(eVar.f3865e);
                }
                if (eVar.b0()) {
                    if (eVar.f3863d == null) {
                        eVar.f3863d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f3863d);
                } else {
                    arrayList.add(eVar.f3867f);
                }
                if (eVar instanceof v.i) {
                    jVar = new k(eVar);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (p pVar : arrayList) {
            if (pVar.f4010b != this.f3952d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = z2 & true;
        if (this.f3950b || this.f3951c) {
            for (v.e eVar : this.f3949a.D0) {
                eVar.l();
                eVar.f3857a = false;
                eVar.f3865e.r();
                eVar.f3867f.q();
            }
            this.f3949a.l();
            v.f fVar = this.f3949a;
            fVar.f3857a = false;
            fVar.f3865e.r();
            this.f3949a.f3867f.q();
            this.f3951c = false;
        }
        if (b(this.f3952d)) {
            return false;
        }
        this.f3949a.V0(0);
        this.f3949a.W0(0);
        v.e.b bVarS = this.f3949a.s(0);
        v.e.b bVarS2 = this.f3949a.s(1);
        if (this.f3950b) {
            c();
        }
        int iS = this.f3949a.S();
        int iT = this.f3949a.T();
        this.f3949a.f3865e.f4016h.d(iS);
        this.f3949a.f3867f.f4016h.d(iT);
        m();
        v.e.b bVar = v.e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z5) {
                Iterator<p> it = this.f3953e.iterator();
                while (it.hasNext()) {
                    if (!it.next().m()) {
                        z5 = false;
                        break;
                    }
                }
            }
            if (z5 && bVarS == v.e.b.WRAP_CONTENT) {
                this.f3949a.z0(v.e.b.FIXED);
                v.f fVar2 = this.f3949a;
                fVar2.U0(e(fVar2, 0));
                v.f fVar3 = this.f3949a;
                fVar3.f3865e.f4013e.d(fVar3.R());
            }
            if (z5 && bVarS2 == v.e.b.WRAP_CONTENT) {
                this.f3949a.Q0(v.e.b.FIXED);
                v.f fVar4 = this.f3949a;
                fVar4.v0(e(fVar4, 1));
                v.f fVar5 = this.f3949a;
                fVar5.f3867f.f4013e.d(fVar5.v());
            }
        }
        v.f fVar6 = this.f3949a;
        v.e.b bVar2 = fVar6.S[0];
        v.e.b bVar3 = v.e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == v.e.b.MATCH_PARENT) {
            int iR = fVar6.R() + iS;
            this.f3949a.f3865e.f4017i.d(iR);
            this.f3949a.f3865e.f4013e.d(iR - iS);
            m();
            v.f fVar7 = this.f3949a;
            v.e.b bVar4 = fVar7.S[1];
            if (bVar4 == bVar3 || bVar4 == v.e.b.MATCH_PARENT) {
                int iV = fVar7.v() + iT;
                this.f3949a.f3867f.f4017i.d(iV);
                this.f3949a.f3867f.f4013e.d(iV - iT);
            }
            m();
            z3 = true;
        } else {
            z3 = false;
        }
        for (p pVar : this.f3953e) {
            if (pVar.f4010b != this.f3949a || pVar.f4015g) {
                pVar.e();
            }
        }
        for (p pVar2 : this.f3953e) {
            if (z3 || pVar2.f4010b != this.f3949a) {
                if (!pVar2.f4016h.f3967j || ((!pVar2.f4017i.f3967j && !(pVar2 instanceof j)) || (!pVar2.f4013e.f3967j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    z4 = false;
                    break;
                }
            }
        }
        this.f3949a.z0(bVarS);
        this.f3949a.Q0(bVarS2);
        return z4;
    }

    public boolean g(boolean z2) {
        if (this.f3950b) {
            for (v.e eVar : this.f3949a.D0) {
                eVar.l();
                eVar.f3857a = false;
                l lVar = eVar.f3865e;
                lVar.f4013e.f3967j = false;
                lVar.f4015g = false;
                lVar.r();
                n nVar = eVar.f3867f;
                nVar.f4013e.f3967j = false;
                nVar.f4015g = false;
                nVar.q();
            }
            this.f3949a.l();
            v.f fVar = this.f3949a;
            fVar.f3857a = false;
            l lVar2 = fVar.f3865e;
            lVar2.f4013e.f3967j = false;
            lVar2.f4015g = false;
            lVar2.r();
            n nVar2 = this.f3949a.f3867f;
            nVar2.f4013e.f3967j = false;
            nVar2.f4015g = false;
            nVar2.q();
            c();
        }
        if (b(this.f3952d)) {
            return false;
        }
        this.f3949a.V0(0);
        this.f3949a.W0(0);
        this.f3949a.f3865e.f4016h.d(0);
        this.f3949a.f3867f.f4016h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    public boolean h(boolean z2, int i2) {
        boolean z3;
        v.e.b bVar;
        g gVar;
        int iV;
        boolean z4 = true;
        boolean z5 = z2 & true;
        v.e.b bVarS = this.f3949a.s(0);
        v.e.b bVarS2 = this.f3949a.s(1);
        int iS = this.f3949a.S();
        int iT = this.f3949a.T();
        if (z5 && (bVarS == (bVar = v.e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            for (p pVar : this.f3953e) {
                if (pVar.f4014f == i2 && !pVar.m()) {
                    z5 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z5 && bVarS == v.e.b.WRAP_CONTENT) {
                    this.f3949a.z0(v.e.b.FIXED);
                    v.f fVar = this.f3949a;
                    fVar.U0(e(fVar, 0));
                    v.f fVar2 = this.f3949a;
                    gVar = fVar2.f3865e.f4013e;
                    iV = fVar2.R();
                    gVar.d(iV);
                }
            } else if (z5 && bVarS2 == v.e.b.WRAP_CONTENT) {
                this.f3949a.Q0(v.e.b.FIXED);
                v.f fVar3 = this.f3949a;
                fVar3.v0(e(fVar3, 1));
                v.f fVar4 = this.f3949a;
                gVar = fVar4.f3867f.f4013e;
                iV = fVar4.v();
                gVar.d(iV);
            }
        }
        v.f fVar5 = this.f3949a;
        if (i2 == 0) {
            v.e.b bVar2 = fVar5.S[0];
            if (bVar2 == v.e.b.FIXED || bVar2 == v.e.b.MATCH_PARENT) {
                int iR = fVar5.R() + iS;
                this.f3949a.f3865e.f4017i.d(iR);
                this.f3949a.f3865e.f4013e.d(iR - iS);
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            v.e.b bVar3 = fVar5.S[1];
            if (bVar3 == v.e.b.FIXED || bVar3 == v.e.b.MATCH_PARENT) {
                int iV2 = fVar5.v() + iT;
                this.f3949a.f3867f.f4017i.d(iV2);
                this.f3949a.f3867f.f4013e.d(iV2 - iT);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        m();
        for (p pVar2 : this.f3953e) {
            if (pVar2.f4014f == i2 && (pVar2.f4010b != this.f3949a || pVar2.f4015g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : this.f3953e) {
            if (pVar3.f4014f == i2 && (z3 || pVar3.f4010b != this.f3949a)) {
                if (!pVar3.f4016h.f3967j || !pVar3.f4017i.f3967j || (!(pVar3 instanceof c) && !pVar3.f4013e.f3967j)) {
                    z4 = false;
                    break;
                }
            }
        }
        this.f3949a.z0(bVarS);
        this.f3949a.Q0(bVarS2);
        return z4;
    }

    public void j() {
        this.f3950b = true;
    }

    public void k() {
        this.f3951c = true;
    }

    public void m() {
        g gVar;
        int iR;
        g gVar2;
        int iR2;
        g gVar3;
        for (v.e eVar : this.f3949a.D0) {
            if (!eVar.f3857a) {
                v.e.b[] bVarArr = eVar.S;
                boolean z2 = false;
                v.e.b bVar = bVarArr[0];
                v.e.b bVar2 = bVarArr[1];
                int i2 = eVar.f3887p;
                int i3 = eVar.f3889q;
                v.e.b bVar3 = v.e.b.WRAP_CONTENT;
                boolean z3 = bVar == bVar3 || (bVar == v.e.b.MATCH_CONSTRAINT && i2 == 1);
                if (bVar2 == bVar3 || (bVar2 == v.e.b.MATCH_CONSTRAINT && i3 == 1)) {
                    z2 = true;
                }
                g gVar4 = eVar.f3865e.f4013e;
                boolean z4 = gVar4.f3967j;
                g gVar5 = eVar.f3867f.f4013e;
                boolean z5 = gVar5.f3967j;
                if (z4 && z5) {
                    v.e.b bVar4 = v.e.b.FIXED;
                    l(eVar, bVar4, gVar4.f3964g, bVar4, gVar5.f3964g);
                } else {
                    if (z4 && z2) {
                        l(eVar, v.e.b.FIXED, gVar4.f3964g, bVar3, gVar5.f3964g);
                        if (bVar2 == v.e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.f3867f.f4013e;
                            iR2 = eVar.v();
                            gVar2.f3979m = iR2;
                        } else {
                            gVar = eVar.f3867f.f4013e;
                            iR = eVar.v();
                            gVar.d(iR);
                        }
                    } else if (z5 && z3) {
                        l(eVar, bVar3, gVar4.f3964g, v.e.b.FIXED, gVar5.f3964g);
                        if (bVar == v.e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.f3865e.f4013e;
                            iR2 = eVar.R();
                            gVar2.f3979m = iR2;
                        } else {
                            gVar = eVar.f3865e.f4013e;
                            iR = eVar.R();
                            gVar.d(iR);
                        }
                    }
                    if (!eVar.f3857a && (gVar3 = eVar.f3867f.f3992l) != null) {
                        gVar3.d(eVar.n());
                    }
                }
                eVar.f3857a = true;
                if (!eVar.f3857a) {
                }
            }
        }
    }

    public void n(b.InterfaceC0046b interfaceC0046b) {
        this.f3955g = interfaceC0046b;
    }
}
