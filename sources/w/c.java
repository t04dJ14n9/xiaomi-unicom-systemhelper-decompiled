package w;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList<p> f3947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f3948l;

    public c(v.e eVar, int i2) {
        super(eVar);
        this.f3947k = new ArrayList<>();
        this.f4014f = i2;
        q();
    }

    private void q() {
        v.e eVar;
        v.e eVarJ = this.f4010b;
        do {
            eVar = eVarJ;
            eVarJ = eVarJ.J(this.f4014f);
        } while (eVarJ != null);
        this.f4010b = eVar;
        this.f3947k.add(eVar.L(this.f4014f));
        v.e eVarH = eVar.H(this.f4014f);
        while (eVarH != null) {
            this.f3947k.add(eVarH.L(this.f4014f));
            eVarH = eVarH.H(this.f4014f);
        }
        for (p pVar : this.f3947k) {
            int i2 = this.f4014f;
            if (i2 == 0) {
                pVar.f4010b.f3861c = this;
            } else if (i2 == 1) {
                pVar.f4010b.f3863d = this;
            }
        }
        if ((this.f4014f == 0 && ((v.f) this.f4010b.I()).x1()) && this.f3947k.size() > 1) {
            ArrayList<p> arrayList = this.f3947k;
            this.f4010b = arrayList.get(arrayList.size() - 1).f4010b;
        }
        this.f3948l = this.f4014f == 0 ? this.f4010b.x() : this.f4010b.N();
    }

    private v.e r() {
        for (int i2 = 0; i2 < this.f3947k.size(); i2++) {
            p pVar = this.f3947k.get(i2);
            if (pVar.f4010b.Q() != 8) {
                return pVar.f4010b;
            }
        }
        return null;
    }

    private v.e s() {
        for (int size = this.f3947k.size() - 1; size >= 0; size--) {
            p pVar = this.f3947k.get(size);
            if (pVar.f4010b.Q() != 8) {
                return pVar.f4010b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01c7 A[PHI: r1 r22 r23 r24
      0x01c7: PHI (r1v53 int) = (r1v51 int), (r1v59 int) binds: [B:119:0x01c5, B:110:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r22v3 float) = (r22v2 float), (r22v5 float) binds: [B:119:0x01c5, B:110:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r23v6 boolean) = (r23v5 boolean), (r23v8 boolean) binds: [B:119:0x01c5, B:110:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r24v6 int) = (r24v5 int), (r24v8 int) binds: [B:119:0x01c5, B:110:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:309:0x00f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee A[ADDED_TO_REGION] */
    @Override // w.p, w.d
    public void a(d dVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        float f3;
        int iMax;
        int i12;
        int i13;
        float f4;
        if (this.f4016h.f3967j && this.f4017i.f3967j) {
            v.e eVarI = this.f4010b.I();
            boolean zX1 = (eVarI == null || !(eVarI instanceof v.f)) ? false : ((v.f) eVarI).x1();
            int i14 = this.f4017i.f3964g - this.f4016h.f3964g;
            int size = this.f3947k.size();
            int i15 = 0;
            while (true) {
                i2 = -1;
                i3 = 8;
                if (i15 >= size) {
                    i15 = -1;
                    break;
                } else if (this.f3947k.get(i15).f4010b.Q() != 8) {
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = size - 1;
            for (int i17 = i16; i17 >= 0; i17--) {
                if (this.f3947k.get(i17).f4010b.Q() != 8) {
                    i2 = i17;
                    break;
                }
            }
            int i18 = 0;
            while (true) {
                if (i18 >= 2) {
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    f2 = 0.0f;
                    break;
                }
                int i19 = 0;
                i5 = 0;
                i6 = 0;
                int i20 = 0;
                f2 = 0.0f;
                while (i19 < size) {
                    p pVar = this.f3947k.get(i19);
                    if (pVar.f4010b.Q() != i3) {
                        i20++;
                        if (i19 > 0 && i19 >= i15) {
                            i5 += pVar.f4016h.f3963f;
                        }
                        g gVar = pVar.f4013e;
                        int i21 = gVar.f3964g;
                        boolean z4 = pVar.f4012d != v.e.b.MATCH_CONSTRAINT;
                        if (z4) {
                            int i22 = this.f4014f;
                            if (i22 == 0 && !pVar.f4010b.f3865e.f4013e.f3967j) {
                                return;
                            }
                            if (i22 == 1 && !pVar.f4010b.f3867f.f4013e.f3967j) {
                                return;
                            } else {
                                i12 = i21;
                            }
                        } else {
                            i12 = i21;
                            if (pVar.f4009a == 1 && i18 == 0) {
                                i13 = gVar.f3979m;
                                i6++;
                            } else {
                                if (gVar.f3967j) {
                                    i13 = i12;
                                }
                                if (z4) {
                                    i5 += i13;
                                } else {
                                    i6++;
                                    f4 = pVar.f4010b.f3900v0[this.f4014f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                }
                                if (i19 >= i16 && i19 < i2) {
                                    i5 += -pVar.f4017i.f3963f;
                                }
                            }
                            z4 = true;
                            if (z4) {
                                i6++;
                                f4 = pVar.f4010b.f3900v0[this.f4014f];
                                if (f4 >= 0.0f) {
                                    f2 += f4;
                                }
                            } else {
                                i5 += i13;
                            }
                            if (i19 >= i16) {
                            }
                        }
                        i13 = i12;
                        if (z4) {
                            i6++;
                            f4 = pVar.f4010b.f3900v0[this.f4014f];
                            if (f4 >= 0.0f) {
                                f2 += f4;
                            }
                        } else {
                            i5 += i13;
                        }
                        if (i19 >= i16) {
                        }
                    }
                    i19++;
                    i3 = 8;
                }
                if (i5 < i14 || i6 == 0) {
                    i4 = i20;
                    break;
                } else {
                    i18++;
                    i3 = 8;
                }
            }
            int i23 = this.f4016h.f3964g;
            if (zX1) {
                i23 = this.f4017i.f3964g;
            }
            if (i5 > i14) {
                int i24 = (int) (((i5 - i14) / 2.0f) + 0.5f);
                i23 = zX1 ? i23 + i24 : i23 - i24;
            }
            if (i6 > 0) {
                float f5 = i14 - i5;
                int i25 = (int) ((f5 / i6) + 0.5f);
                int i26 = 0;
                int i27 = 0;
                while (i26 < size) {
                    p pVar2 = this.f3947k.get(i26);
                    int i28 = i25;
                    int i29 = i5;
                    if (pVar2.f4010b.Q() != 8 && pVar2.f4012d == v.e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f4013e;
                        if (gVar2.f3967j) {
                            z3 = zX1;
                            i11 = i4;
                            i23 = i23;
                            f3 = f5;
                        } else {
                            int i30 = f2 > 0.0f ? (int) (((pVar2.f4010b.f3900v0[this.f4014f] * f5) / f2) + 0.5f) : i28;
                            if (this.f4014f == 0) {
                                v.e eVar = pVar2.f4010b;
                                f3 = f5;
                                int i31 = eVar.f3895t;
                                z3 = zX1;
                                i11 = i4;
                                iMax = Math.max(eVar.f3893s, pVar2.f4009a == 1 ? Math.min(i30, gVar2.f3979m) : i30);
                                if (i31 > 0) {
                                    iMax = Math.min(i31, iMax);
                                }
                                if (iMax != i30) {
                                    i27++;
                                    i30 = iMax;
                                }
                            } else {
                                z3 = zX1;
                                i11 = i4;
                                f3 = f5;
                                v.e eVar2 = pVar2.f4010b;
                                int i32 = eVar2.f3901w;
                                iMax = Math.max(eVar2.f3899v, pVar2.f4009a == 1 ? Math.min(i30, gVar2.f3979m) : i30);
                                if (i32 > 0) {
                                    iMax = Math.min(i32, iMax);
                                }
                                if (iMax != i30) {
                                    i27++;
                                    i30 = iMax;
                                }
                            }
                            pVar2.f4013e.d(i30);
                        }
                    } else {
                        z3 = zX1;
                        i11 = i4;
                        i23 = i23;
                        f3 = f5;
                    }
                    i26++;
                    i25 = i28;
                    i5 = i29;
                    i23 = i23;
                    f5 = f3;
                    zX1 = z3;
                    i4 = i11;
                }
                z2 = zX1;
                i7 = i4;
                i8 = i23;
                int i33 = i5;
                if (i27 > 0) {
                    i6 -= i27;
                    int i34 = 0;
                    for (int i35 = 0; i35 < size; i35++) {
                        p pVar3 = this.f3947k.get(i35);
                        if (pVar3.f4010b.Q() != 8) {
                            if (i35 > 0 && i35 >= i15) {
                                i34 += pVar3.f4016h.f3963f;
                            }
                            i34 += pVar3.f4013e.f3964g;
                            if (i35 < i16 && i35 < i2) {
                                i34 += -pVar3.f4017i.f3963f;
                            }
                        }
                    }
                    i5 = i34;
                } else {
                    i5 = i33;
                }
                i10 = 2;
                if (this.f3948l == 2 && i27 == 0) {
                    i9 = 0;
                    this.f3948l = 0;
                } else {
                    i9 = 0;
                }
            } else {
                z2 = zX1;
                i7 = i4;
                i8 = i23;
                i9 = 0;
                i10 = 2;
            }
            if (i5 > i14) {
                this.f3948l = i10;
            }
            if (i7 > 0 && i6 == 0 && i15 == i2) {
                this.f3948l = i10;
            }
            int i36 = this.f3948l;
            int i37 = i7;
            if (i36 == 1) {
                int i38 = i37 > 1 ? (i14 - i5) / (i37 - 1) : i37 == 1 ? (i14 - i5) / 2 : i9;
                if (i6 > 0) {
                    i38 = i9;
                }
                int i39 = i8;
                for (int i40 = i9; i40 < size; i40++) {
                    p pVar4 = this.f3947k.get(z2 ? size - (i40 + 1) : i40);
                    if (pVar4.f4010b.Q() == 8) {
                        pVar4.f4016h.d(i39);
                        pVar4.f4017i.d(i39);
                    } else {
                        if (i40 > 0) {
                            i39 = z2 ? i39 - i38 : i39 + i38;
                        }
                        if (i40 > 0 && i40 >= i15) {
                            int i41 = pVar4.f4016h.f3963f;
                            i39 = z2 ? i39 - i41 : i39 + i41;
                        }
                        (z2 ? pVar4.f4017i : pVar4.f4016h).d(i39);
                        g gVar3 = pVar4.f4013e;
                        int i42 = gVar3.f3964g;
                        if (pVar4.f4012d == v.e.b.MATCH_CONSTRAINT && pVar4.f4009a == 1) {
                            i42 = gVar3.f3979m;
                        }
                        i39 = z2 ? i39 - i42 : i39 + i42;
                        (z2 ? pVar4.f4016h : pVar4.f4017i).d(i39);
                        pVar4.f4015g = true;
                        if (i40 < i16 && i40 < i2) {
                            int i43 = -pVar4.f4017i.f3963f;
                            i39 = z2 ? i39 - i43 : i39 + i43;
                        }
                    }
                }
                return;
            }
            if (i36 == 0) {
                int i44 = (i14 - i5) / (i37 + 1);
                if (i6 > 0) {
                    i44 = i9;
                }
                int i45 = i8;
                for (int i46 = i9; i46 < size; i46++) {
                    p pVar5 = this.f3947k.get(z2 ? size - (i46 + 1) : i46);
                    if (pVar5.f4010b.Q() == 8) {
                        pVar5.f4016h.d(i45);
                        pVar5.f4017i.d(i45);
                    } else {
                        int i47 = z2 ? i45 - i44 : i45 + i44;
                        if (i46 > 0 && i46 >= i15) {
                            int i48 = pVar5.f4016h.f3963f;
                            i47 = z2 ? i47 - i48 : i47 + i48;
                        }
                        (z2 ? pVar5.f4017i : pVar5.f4016h).d(i47);
                        g gVar4 = pVar5.f4013e;
                        int iMin = gVar4.f3964g;
                        if (pVar5.f4012d == v.e.b.MATCH_CONSTRAINT && pVar5.f4009a == 1) {
                            iMin = Math.min(iMin, gVar4.f3979m);
                        }
                        i45 = z2 ? i47 - iMin : i47 + iMin;
                        (z2 ? pVar5.f4016h : pVar5.f4017i).d(i45);
                        if (i46 < i16 && i46 < i2) {
                            int i49 = -pVar5.f4017i.f3963f;
                            i45 = z2 ? i45 - i49 : i45 + i49;
                        }
                    }
                }
                return;
            }
            if (i36 == 2) {
                float fW = this.f4014f == 0 ? this.f4010b.w() : this.f4010b.M();
                if (z2) {
                    fW = 1.0f - fW;
                }
                int i50 = (int) (((i14 - i5) * fW) + 0.5f);
                if (i50 < 0 || i6 > 0) {
                    i50 = i9;
                }
                int i51 = z2 ? i8 - i50 : i8 + i50;
                for (int i52 = i9; i52 < size; i52++) {
                    p pVar6 = this.f3947k.get(z2 ? size - (i52 + 1) : i52);
                    if (pVar6.f4010b.Q() == 8) {
                        pVar6.f4016h.d(i51);
                        pVar6.f4017i.d(i51);
                    } else {
                        if (i52 > 0 && i52 >= i15) {
                            int i53 = pVar6.f4016h.f3963f;
                            i51 = z2 ? i51 - i53 : i51 + i53;
                        }
                        (z2 ? pVar6.f4017i : pVar6.f4016h).d(i51);
                        g gVar5 = pVar6.f4013e;
                        int i54 = gVar5.f3964g;
                        if (pVar6.f4012d == v.e.b.MATCH_CONSTRAINT && pVar6.f4009a == 1) {
                            i54 = gVar5.f3979m;
                        }
                        i51 = z2 ? i51 - i54 : i51 + i54;
                        (z2 ? pVar6.f4016h : pVar6.f4017i).d(i51);
                        if (i52 < i16 && i52 < i2) {
                            int i55 = -pVar6.f4017i.f3963f;
                            i51 = z2 ? i51 - i55 : i51 + i55;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[PHI: r0 r1
      0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r1v3 w.f) = (r1v2 w.f), (r1v7 w.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // w.p
    void d() {
        f fVarI;
        int iE;
        Iterator<p> it = this.f3947k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f3947k.size();
        if (size < 1) {
            return;
        }
        v.e eVar = this.f3947k.get(0).f4010b;
        v.e eVar2 = this.f3947k.get(size - 1).f4010b;
        if (this.f4014f == 0) {
            v.d dVar = eVar.H;
            v.d dVar2 = eVar2.J;
            f fVarI2 = i(dVar, 0);
            int iE2 = dVar.e();
            v.e eVarR = r();
            if (eVarR != null) {
                iE2 = eVarR.H.e();
            }
            if (fVarI2 != null) {
                b(this.f4016h, fVarI2, iE2);
            }
            fVarI = i(dVar2, 0);
            iE = dVar2.e();
            v.e eVarS = s();
            if (eVarS != null) {
                iE = eVarS.J.e();
            }
            if (fVarI != null) {
                b(this.f4017i, fVarI, -iE);
            }
        } else {
            v.d dVar3 = eVar.I;
            v.d dVar4 = eVar2.K;
            f fVarI3 = i(dVar3, 1);
            int iE3 = dVar3.e();
            v.e eVarR2 = r();
            if (eVarR2 != null) {
                iE3 = eVarR2.I.e();
            }
            if (fVarI3 != null) {
                b(this.f4016h, fVarI3, iE3);
            }
            fVarI = i(dVar4, 1);
            iE = dVar4.e();
            v.e eVarS2 = s();
            if (eVarS2 != null) {
                iE = eVarS2.K.e();
            }
            if (fVarI != null) {
                b(this.f4017i, fVarI, -iE);
            }
        }
        this.f4016h.f3958a = this;
        this.f4017i.f3958a = this;
    }

    @Override // w.p
    public void e() {
        for (int i2 = 0; i2 < this.f3947k.size(); i2++) {
            this.f3947k.get(i2).e();
        }
    }

    @Override // w.p
    void f() {
        this.f4011c = null;
        Iterator<p> it = this.f3947k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // w.p
    public long j() {
        int size = this.f3947k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = this.f3947k.get(i2);
            j2 = j2 + ((long) pVar.f4016h.f3963f) + pVar.j() + ((long) pVar.f4017i.f3963f);
        }
        return j2;
    }

    @Override // w.p
    boolean m() {
        int size = this.f3947k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f3947k.get(i2).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f4014f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator<p> it = this.f3947k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }
}
