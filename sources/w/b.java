package w;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<v.e> f3931a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f3932b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v.f f3933c;

    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f3934k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f3935l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f3936m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v.e.b f3937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v.e.b f3938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f3944h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f3945i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f3946j;
    }

    /* JADX INFO: renamed from: w.b$b, reason: collision with other inner class name */
    public interface InterfaceC0046b {
        void a();

        void b(v.e eVar, a aVar);
    }

    public b(v.f fVar) {
        this.f3933c = fVar;
    }

    private boolean a(InterfaceC0046b interfaceC0046b, v.e eVar, int i2) {
        this.f3932b.f3937a = eVar.y();
        this.f3932b.f3938b = eVar.O();
        this.f3932b.f3939c = eVar.R();
        this.f3932b.f3940d = eVar.v();
        a aVar = this.f3932b;
        aVar.f3945i = false;
        aVar.f3946j = i2;
        v.e.b bVar = aVar.f3937a;
        v.e.b bVar2 = v.e.b.MATCH_CONSTRAINT;
        boolean z2 = bVar == bVar2;
        boolean z3 = aVar.f3938b == bVar2;
        boolean z4 = z2 && eVar.W > 0.0f;
        boolean z5 = z3 && eVar.W > 0.0f;
        if (z4 && eVar.f3891r[0] == 4) {
            aVar.f3937a = v.e.b.FIXED;
        }
        if (z5 && eVar.f3891r[1] == 4) {
            aVar.f3938b = v.e.b.FIXED;
        }
        interfaceC0046b.b(eVar, aVar);
        eVar.U0(this.f3932b.f3941e);
        eVar.v0(this.f3932b.f3942f);
        eVar.u0(this.f3932b.f3944h);
        eVar.k0(this.f3932b.f3943g);
        a aVar2 = this.f3932b;
        aVar2.f3946j = a.f3934k;
        return aVar2.f3945i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(v.f fVar) {
        boolean z2;
        l lVar;
        n nVar;
        int size = fVar.D0.size();
        boolean zB1 = fVar.B1(64);
        InterfaceC0046b interfaceC0046bR1 = fVar.r1();
        for (int i2 = 0; i2 < size; i2++) {
            v.e eVar = fVar.D0.get(i2);
            if (!(eVar instanceof v.g) && !(eVar instanceof v.a) && !eVar.c0() && (!zB1 || (lVar = eVar.f3865e) == null || (nVar = eVar.f3867f) == null || !lVar.f4013e.f3967j || !nVar.f4013e.f3967j)) {
                v.e.b bVarS = eVar.s(0);
                v.e.b bVarS2 = eVar.s(1);
                v.e.b bVar = v.e.b.MATCH_CONSTRAINT;
                boolean z3 = bVarS == bVar && eVar.f3887p != 1 && bVarS2 == bVar && eVar.f3889q != 1;
                if (!z3 && fVar.B1(1) && !(eVar instanceof v.k)) {
                    if (bVarS == bVar && eVar.f3887p == 0 && bVarS2 != bVar && !eVar.Z()) {
                        z3 = true;
                    }
                    if (bVarS2 == bVar && eVar.f3889q == 0 && bVarS != bVar && !eVar.Z()) {
                        z3 = true;
                    }
                    z2 = (!(bVarS == bVar || bVarS2 == bVar) || eVar.W <= 0.0f) ? z3 : true;
                }
                if (!z2) {
                    a(interfaceC0046bR1, eVar, a.f3934k);
                }
            }
        }
        interfaceC0046bR1.a();
    }

    private void c(v.f fVar, String str, int i2, int i3) {
        int iG = fVar.G();
        int iF = fVar.F();
        fVar.K0(0);
        fVar.J0(0);
        fVar.U0(i2);
        fVar.v0(i3);
        fVar.K0(iG);
        fVar.J0(iF);
        this.f3933c.b1();
    }

    public long d(v.f fVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean zQ1;
        int i11;
        int i12;
        v.f fVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i13;
        boolean z5;
        boolean z6;
        InterfaceC0046b interfaceC0046bR1 = fVar.r1();
        int size = fVar.D0.size();
        int iR = fVar.R();
        int iV = fVar.v();
        boolean zB = v.j.b(i2, 128);
        boolean z7 = zB || v.j.b(i2, 64);
        if (z7) {
            for (int i14 = 0; i14 < size; i14++) {
                v.e eVar = fVar.D0.get(i14);
                v.e.b bVarY = eVar.y();
                v.e.b bVar = v.e.b.MATCH_CONSTRAINT;
                boolean z8 = (bVarY == bVar) && (eVar.O() == bVar) && eVar.t() > 0.0f;
                if ((eVar.Z() && z8) || ((eVar.b0() && z8) || (eVar instanceof v.k) || eVar.Z() || eVar.b0())) {
                    z7 = false;
                    break;
                }
            }
        }
        if (z7) {
            boolean z9 = u.d.f3736r;
        }
        boolean z10 = z7 & ((i5 == 1073741824 && i7 == 1073741824) || zB);
        int i15 = 2;
        if (z10) {
            int iMin = Math.min(fVar.E(), i6);
            int iMin2 = Math.min(fVar.D(), i8);
            if (i5 == 1073741824 && fVar.R() != iMin) {
                fVar.U0(iMin);
                fVar.u1();
            }
            if (i7 == 1073741824 && fVar.v() != iMin2) {
                fVar.v0(iMin2);
                fVar.u1();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                zQ1 = fVar.o1(zB);
                i11 = 2;
            } else {
                boolean zP1 = fVar.p1(zB);
                if (i5 == 1073741824) {
                    zP1 &= fVar.q1(zB, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    zQ1 = fVar.q1(zB, 1) & zP1;
                    i11++;
                } else {
                    zQ1 = zP1;
                }
            }
            if (zQ1) {
                fVar.Y0(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            zQ1 = false;
            i11 = 0;
        }
        if (zQ1 && i11 == 2) {
            return 0L;
        }
        int iS1 = fVar.s1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f3931a.size();
        if (size > 0) {
            c(fVar, "First pass", iR, iV);
        }
        if (size2 > 0) {
            v.e.b bVarY2 = fVar.y();
            v.e.b bVar2 = v.e.b.WRAP_CONTENT;
            boolean z11 = bVarY2 == bVar2;
            boolean z12 = fVar.O() == bVar2;
            int iMax = Math.max(fVar.R(), this.f3933c.G());
            int iMax2 = Math.max(fVar.v(), this.f3933c.F());
            int i16 = 0;
            boolean zD1 = false;
            while (i16 < size2) {
                v.e eVar2 = this.f3931a.get(i16);
                if (eVar2 instanceof v.k) {
                    int iR2 = eVar2.R();
                    int iV2 = eVar2.v();
                    boolean zA = a(interfaceC0046bR1, eVar2, a.f3935l) | zD1;
                    int iR3 = eVar2.R();
                    int iV3 = eVar2.v();
                    if (iR3 != iR2) {
                        eVar2.U0(iR3);
                        if (z11 && eVar2.K() > iMax) {
                            iMax = Math.max(iMax, eVar2.K() + eVar2.m(v.d.b.RIGHT).e());
                        }
                        z6 = true;
                    } else {
                        z6 = zA;
                    }
                    if (iV3 != iV2) {
                        eVar2.v0(iV3);
                        if (z12 && eVar2.p() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.p() + eVar2.m(v.d.b.BOTTOM).e());
                        }
                        z6 = true;
                    }
                    zD1 = z6 | ((v.k) eVar2).d1();
                }
                i16++;
                iS1 = iS1;
                i15 = 2;
            }
            i12 = iS1;
            int i17 = i15;
            int i18 = 0;
            while (i18 < i17) {
                int i19 = 0;
                while (i19 < size2) {
                    v.e eVar3 = this.f3931a.get(i19);
                    if (((eVar3 instanceof v.h) && !(eVar3 instanceof v.k)) || (eVar3 instanceof v.g) || eVar3.Q() == 8 || ((z10 && eVar3.f3865e.f4013e.f3967j && eVar3.f3867f.f4013e.f3967j) || (eVar3 instanceof v.k))) {
                        z4 = z10;
                        i13 = size2;
                    } else {
                        int iR4 = eVar3.R();
                        int iV4 = eVar3.v();
                        z4 = z10;
                        int iN = eVar3.n();
                        int i20 = a.f3935l;
                        i13 = size2;
                        if (i18 == 1) {
                            i20 = a.f3936m;
                        }
                        boolean zA2 = a(interfaceC0046bR1, eVar3, i20) | zD1;
                        int iR5 = eVar3.R();
                        int iV5 = eVar3.v();
                        if (iR5 != iR4) {
                            eVar3.U0(iR5);
                            if (z11 && eVar3.K() > iMax) {
                                iMax = Math.max(iMax, eVar3.K() + eVar3.m(v.d.b.RIGHT).e());
                            }
                            z5 = true;
                        } else {
                            z5 = zA2;
                        }
                        if (iV5 != iV4) {
                            eVar3.v0(iV5);
                            if (z12 && eVar3.p() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.p() + eVar3.m(v.d.b.BOTTOM).e());
                            }
                            z5 = true;
                        }
                        zD1 = (!eVar3.U() || iN == eVar3.n()) ? z5 : true;
                    }
                    i19++;
                    size2 = i13;
                    z10 = z4;
                }
                boolean z13 = z10;
                int i21 = size2;
                if (!zD1) {
                    break;
                }
                c(fVar, "intermediate pass", iR, iV);
                i18++;
                size2 = i21;
                z10 = z13;
                i17 = 2;
                zD1 = false;
            }
            fVar2 = fVar;
            if (zD1) {
                c(fVar2, "2nd pass", iR, iV);
                if (fVar.R() < iMax) {
                    fVar2.U0(iMax);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fVar.v() < iMax2) {
                    fVar2.v0(iMax2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    c(fVar2, "3rd pass", iR, iV);
                }
            }
        } else {
            i12 = iS1;
            fVar2 = fVar;
        }
        fVar2.E1(i12);
        return 0L;
    }

    public void e(v.f fVar) {
        this.f3931a.clear();
        int size = fVar.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            v.e eVar = fVar.D0.get(i2);
            v.e.b bVarY = eVar.y();
            v.e.b bVar = v.e.b.MATCH_CONSTRAINT;
            if (bVarY == bVar || eVar.O() == bVar) {
                this.f3931a.add(eVar);
            }
        }
        fVar.u1();
    }
}
