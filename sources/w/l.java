package w;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f3981k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3982a;

        static {
            int[] iArr = new int[p.b.values().length];
            f3982a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3982a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3982a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(v.e eVar) {
        super(eVar);
        this.f4016h.f3962e = f.a.LEFT;
        this.f4017i.f3962e = f.a.RIGHT;
        this.f4014f = 0;
    }

    private void q(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0292, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // w.p, w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(w.d r17) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.a(w.d):void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0331  */
    /* JADX WARN: Code duplicated, block: B:104:0x0337  */
    /* JADX WARN: Code duplicated, block: B:105:0x0344  */
    /* JADX WARN: Code duplicated, block: B:107:0x034a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0350  */
    /* JADX WARN: Code duplicated, block: B:110:0x036b  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x0238  */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:83:0x0259  */
    /* JADX WARN: Code duplicated, block: B:84:0x0260  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b5  */
    @Override // w.p
    void d() {
        v.e eVarI;
        v.e eVar;
        v.d[] dVarArr;
        v.d dVar;
        v.d dVar2;
        v.d dVar3;
        f fVarH;
        f fVar;
        int iS;
        f fVarH2;
        f fVar2;
        v.d dVar4;
        v.e eVar2;
        int i2;
        v.e eVarI2;
        List<d> list;
        d dVar5;
        f fVar3;
        f fVarH3;
        f fVar4;
        int iS2;
        f fVar5;
        f fVar6;
        int i3;
        v.e eVarI3;
        v.e eVar3 = this.f4010b;
        if (eVar3.f3857a) {
            this.f4013e.d(eVar3.R());
        }
        if (this.f4013e.f3967j) {
            v.e.b bVar = this.f4012d;
            v.e.b bVar2 = v.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((eVarI = this.f4010b.I()) != null && eVarI.y() == v.e.b.FIXED) || eVarI.y() == bVar2)) {
                b(this.f4016h, eVarI.f3865e.f4016h, this.f4010b.H.e());
                b(this.f4017i, eVarI.f3865e.f4017i, -this.f4010b.J.e());
                return;
            }
        } else {
            v.e.b bVarY = this.f4010b.y();
            this.f4012d = bVarY;
            if (bVarY != v.e.b.MATCH_CONSTRAINT) {
                v.e.b bVar3 = v.e.b.MATCH_PARENT;
                if (bVarY == bVar3 && (((eVarI3 = this.f4010b.I()) != null && eVarI3.y() == v.e.b.FIXED) || eVarI3.y() == bVar3)) {
                    int iR = (eVarI3.R() - this.f4010b.H.e()) - this.f4010b.J.e();
                    b(this.f4016h, eVarI3.f3865e.f4016h, this.f4010b.H.e());
                    b(this.f4017i, eVarI3.f3865e.f4017i, -this.f4010b.J.e());
                    this.f4013e.d(iR);
                    return;
                }
                if (this.f4012d == v.e.b.FIXED) {
                    this.f4013e.d(this.f4010b.R());
                }
            }
        }
        g gVar = this.f4013e;
        if (!gVar.f3967j) {
            if (this.f4012d == v.e.b.MATCH_CONSTRAINT) {
                eVar2 = this.f4010b;
                i2 = eVar2.f3887p;
                if (i2 != 2) {
                    eVarI2 = eVar2.I();
                    if (eVarI2 != null) {
                        g gVar2 = eVarI2.f3867f.f4013e;
                        this.f4013e.f3969l.add(gVar2);
                        gVar2.f3968k.add(this.f4013e);
                        g gVar3 = this.f4013e;
                        gVar3.f3959b = true;
                        gVar3.f3968k.add(this.f4016h);
                        list = this.f4013e.f3968k;
                        dVar5 = this.f4017i;
                        list.add(dVar5);
                    }
                } else if (i2 == 3) {
                    if (eVar2.f3889q == 3) {
                        this.f4016h.f3958a = this;
                        this.f4017i.f3958a = this;
                        n nVar = eVar2.f3867f;
                        nVar.f4016h.f3958a = this;
                        nVar.f4017i.f3958a = this;
                        gVar.f3958a = this;
                        if (eVar2.b0()) {
                            this.f4013e.f3969l.add(this.f4010b.f3867f.f4013e);
                            this.f4010b.f3867f.f4013e.f3968k.add(this.f4013e);
                            n nVar2 = this.f4010b.f3867f;
                            nVar2.f4013e.f3958a = this;
                            this.f4013e.f3969l.add(nVar2.f4016h);
                            this.f4013e.f3969l.add(this.f4010b.f3867f.f4017i);
                            this.f4010b.f3867f.f4016h.f3968k.add(this.f4013e);
                            list = this.f4010b.f3867f.f4017i.f3968k;
                            dVar5 = this.f4013e;
                        } else if (this.f4010b.Z()) {
                            this.f4010b.f3867f.f4013e.f3969l.add(this.f4013e);
                            list = this.f4013e.f3968k;
                            dVar5 = this.f4010b.f3867f.f4013e;
                        } else {
                            fVar3 = this.f4010b.f3867f.f4013e;
                        }
                        list.add(dVar5);
                    } else {
                        g gVar4 = eVar2.f3867f.f4013e;
                        gVar.f3969l.add(gVar4);
                        gVar4.f3968k.add(this.f4013e);
                        this.f4010b.f3867f.f4016h.f3968k.add(this.f4013e);
                        this.f4010b.f3867f.f4017i.f3968k.add(this.f4013e);
                        g gVar5 = this.f4013e;
                        gVar5.f3959b = true;
                        gVar5.f3968k.add(this.f4016h);
                        this.f4013e.f3968k.add(this.f4017i);
                        this.f4016h.f3969l.add(this.f4013e);
                        fVar3 = this.f4017i;
                    }
                    list = fVar3.f3969l;
                    dVar5 = this.f4013e;
                    list.add(dVar5);
                }
            }
            eVar = this.f4010b;
            dVarArr = eVar.P;
            dVar = dVarArr[0];
            dVar2 = dVar.f3842f;
            if (dVar2 != null) {
            }
            if (dVar2 == null) {
                dVar3 = dVarArr[1];
                if (dVar3.f3842f == null) {
                    if (eVar instanceof v.h) {
                        return;
                    } else {
                        return;
                    }
                }
                fVarH2 = h(dVar3);
                if (fVarH2 != null) {
                    b(this.f4017i, fVarH2, -this.f4010b.P[1].e());
                    c(this.f4016h, this.f4017i, -1, this.f4013e);
                    return;
                }
                return;
            }
            fVarH = h(dVar);
            if (fVarH != null) {
                return;
            }
            fVar = this.f4016h;
            iS = this.f4010b.P[0].e();
            b(fVar, fVarH, iS);
            c(this.f4017i, this.f4016h, 1, this.f4013e);
            return;
        }
        v.e eVar4 = this.f4010b;
        if (eVar4.f3857a) {
            v.d[] dVarArr2 = eVar4.P;
            v.d dVar6 = dVarArr2[0];
            v.d dVar7 = dVar6.f3842f;
            if (dVar7 == null || dVarArr2[1].f3842f == null) {
                if (dVar7 == null) {
                    v.d dVar8 = dVarArr2[1];
                    if (dVar8.f3842f != null) {
                        f fVarH4 = h(dVar8);
                        if (fVarH4 == null) {
                            return;
                        }
                        b(this.f4017i, fVarH4, -this.f4010b.P[1].e());
                        fVar5 = this.f4016h;
                        fVar6 = this.f4017i;
                        i3 = -this.f4013e.f3964g;
                    } else {
                        if ((eVar4 instanceof v.h) || eVar4.I() == null || this.f4010b.m(v.d.b.CENTER).f3842f != null) {
                            return;
                        }
                        fVarH3 = this.f4010b.I().f3865e.f4016h;
                        fVar4 = this.f4016h;
                        iS2 = this.f4010b.S();
                    }
                    b(fVar5, fVar6, i3);
                    return;
                }
                fVarH3 = h(dVar6);
                if (fVarH3 == null) {
                    return;
                }
                fVar4 = this.f4016h;
                iS2 = this.f4010b.P[0].e();
                b(fVar4, fVarH3, iS2);
                fVar5 = this.f4017i;
                fVar6 = this.f4016h;
                i3 = this.f4013e.f3964g;
                b(fVar5, fVar6, i3);
                return;
            }
            if (!eVar4.Z()) {
                f fVarH5 = h(this.f4010b.P[0]);
                if (fVarH5 != null) {
                    b(this.f4016h, fVarH5, this.f4010b.P[0].e());
                }
                f fVarH6 = h(this.f4010b.P[1]);
                if (fVarH6 != null) {
                    b(this.f4017i, fVarH6, -this.f4010b.P[1].e());
                }
                this.f4016h.f3959b = true;
                this.f4017i.f3959b = true;
                return;
            }
            this.f4016h.f3963f = this.f4010b.P[0].e();
            fVar2 = this.f4017i;
            dVar4 = this.f4010b.P[1];
        } else {
            if (this.f4012d == v.e.b.MATCH_CONSTRAINT) {
                eVar2 = this.f4010b;
                i2 = eVar2.f3887p;
                if (i2 != 2) {
                    eVarI2 = eVar2.I();
                    if (eVarI2 != null) {
                        g gVar6 = eVarI2.f3867f.f4013e;
                        this.f4013e.f3969l.add(gVar6);
                        gVar6.f3968k.add(this.f4013e);
                        g gVar7 = this.f4013e;
                        gVar7.f3959b = true;
                        gVar7.f3968k.add(this.f4016h);
                        list = this.f4013e.f3968k;
                        dVar5 = this.f4017i;
                        list.add(dVar5);
                    }
                } else if (i2 == 3) {
                    if (eVar2.f3889q == 3) {
                        this.f4016h.f3958a = this;
                        this.f4017i.f3958a = this;
                        n nVar3 = eVar2.f3867f;
                        nVar3.f4016h.f3958a = this;
                        nVar3.f4017i.f3958a = this;
                        gVar.f3958a = this;
                        if (eVar2.b0()) {
                            this.f4013e.f3969l.add(this.f4010b.f3867f.f4013e);
                            this.f4010b.f3867f.f4013e.f3968k.add(this.f4013e);
                            n nVar4 = this.f4010b.f3867f;
                            nVar4.f4013e.f3958a = this;
                            this.f4013e.f3969l.add(nVar4.f4016h);
                            this.f4013e.f3969l.add(this.f4010b.f3867f.f4017i);
                            this.f4010b.f3867f.f4016h.f3968k.add(this.f4013e);
                            list = this.f4010b.f3867f.f4017i.f3968k;
                            dVar5 = this.f4013e;
                        } else if (this.f4010b.Z()) {
                            this.f4010b.f3867f.f4013e.f3969l.add(this.f4013e);
                            list = this.f4013e.f3968k;
                            dVar5 = this.f4010b.f3867f.f4013e;
                        } else {
                            fVar3 = this.f4010b.f3867f.f4013e;
                        }
                        list.add(dVar5);
                    } else {
                        g gVar8 = eVar2.f3867f.f4013e;
                        gVar.f3969l.add(gVar8);
                        gVar8.f3968k.add(this.f4013e);
                        this.f4010b.f3867f.f4016h.f3968k.add(this.f4013e);
                        this.f4010b.f3867f.f4017i.f3968k.add(this.f4013e);
                        g gVar9 = this.f4013e;
                        gVar9.f3959b = true;
                        gVar9.f3968k.add(this.f4016h);
                        this.f4013e.f3968k.add(this.f4017i);
                        this.f4016h.f3969l.add(this.f4013e);
                        fVar3 = this.f4017i;
                    }
                    list = fVar3.f3969l;
                    dVar5 = this.f4013e;
                    list.add(dVar5);
                }
            }
            eVar = this.f4010b;
            dVarArr = eVar.P;
            dVar = dVarArr[0];
            dVar2 = dVar.f3842f;
            if (dVar2 != null || dVarArr[1].f3842f == null) {
                if (dVar2 == null) {
                    fVarH = h(dVar);
                    if (fVarH != null) {
                        return;
                    }
                    fVar = this.f4016h;
                    iS = this.f4010b.P[0].e();
                } else {
                    dVar3 = dVarArr[1];
                    if (dVar3.f3842f == null) {
                        fVarH2 = h(dVar3);
                        if (fVarH2 != null) {
                            b(this.f4017i, fVarH2, -this.f4010b.P[1].e());
                            c(this.f4016h, this.f4017i, -1, this.f4013e);
                            return;
                        }
                        return;
                    }
                    if ((eVar instanceof v.h) || eVar.I() == null) {
                        return;
                    }
                    fVarH = this.f4010b.I().f3865e.f4016h;
                    fVar = this.f4016h;
                    iS = this.f4010b.S();
                }
                b(fVar, fVarH, iS);
                c(this.f4017i, this.f4016h, 1, this.f4013e);
                return;
            }
            if (!eVar.Z()) {
                f fVarH7 = h(this.f4010b.P[0]);
                f fVarH8 = h(this.f4010b.P[1]);
                fVarH7.b(this);
                fVarH8.b(this);
                this.f4018j = p.b.CENTER;
                return;
            }
            this.f4016h.f3963f = this.f4010b.P[0].e();
            fVar2 = this.f4017i;
            dVar4 = this.f4010b.P[1];
        }
        fVar2.f3963f = -dVar4.e();
    }

    @Override // w.p
    public void e() {
        f fVar = this.f4016h;
        if (fVar.f3967j) {
            this.f4010b.V0(fVar.f3964g);
        }
    }

    @Override // w.p
    void f() {
        this.f4011c = null;
        this.f4016h.c();
        this.f4017i.c();
        this.f4013e.c();
        this.f4015g = false;
    }

    @Override // w.p
    boolean m() {
        return this.f4012d != v.e.b.MATCH_CONSTRAINT || this.f4010b.f3887p == 0;
    }

    void r() {
        this.f4015g = false;
        this.f4016h.c();
        this.f4016h.f3967j = false;
        this.f4017i.c();
        this.f4017i.f3967j = false;
        this.f4013e.f3967j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f4010b.r();
    }
}
