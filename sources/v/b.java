package v;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:100:0x0168  */
    /* JADX WARN: Code duplicated, block: B:102:0x0189  */
    /* JADX WARN: Code duplicated, block: B:173:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:189:0x030c  */
    /* JADX WARN: Code duplicated, block: B:190:0x031e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0326  */
    /* JADX WARN: Code duplicated, block: B:193:0x0329  */
    /* JADX WARN: Code duplicated, block: B:196:0x0333  */
    /* JADX WARN: Code duplicated, block: B:198:0x033a  */
    /* JADX WARN: Code duplicated, block: B:255:0x0400  */
    /* JADX WARN: Code duplicated, block: B:258:0x0412  */
    /* JADX WARN: Code duplicated, block: B:259:0x0415  */
    /* JADX WARN: Code duplicated, block: B:25:0x003e A[PHI: r8 r15
      0x003e: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r15v3 boolean) = (r15v1 boolean), (r15v35 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:265:0x0435  */
    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[PHI: r8 r15
      0x0040: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r15v33 boolean) = (r15v1 boolean), (r15v35 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x015f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0162  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0, types: [u.d] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [u.i] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [v.e] */
    static void a(f fVar, u.d dVar, int i2, int i3, c cVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        int i4;
        int i5;
        d dVar2;
        u.i iVar;
        d dVar3;
        u.i iVar2;
        int i6;
        d dVar4;
        int iE;
        int i7;
        int iE2;
        d dVar5;
        u.i iVar3;
        u.i iVar4;
        ?? r5;
        u.i iVar5;
        int size;
        d dVar6;
        int i8;
        e eVar = cVar.f3815a;
        e eVar2 = cVar.f3817c;
        e eVar3 = cVar.f3816b;
        e eVar4 = cVar.f3818d;
        e eVar5 = cVar.f3819e;
        float f2 = cVar.f3825k;
        boolean z5 = fVar.S[i2] == e.b.WRAP_CONTENT;
        if (i2 == 0) {
            int i9 = eVar5.f3892r0;
            z2 = i9 == 0;
            z3 = i9 == 1;
            if (i9 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            int i10 = eVar5.f3894s0;
            z2 = i10 == 0;
            z3 = i10 == 1;
            if (i10 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        boolean z6 = z3;
        boolean z7 = false;
        boolean z8 = z2;
        ?? r8 = eVar;
        while (true) {
            obj = null;
            if (z7) {
                break;
            }
            d dVar7 = r8.P[i3];
            int i11 = z4 ? 1 : 4;
            int iE3 = dVar7.e();
            e.b bVar = r8.S[i2];
            float f3 = f2;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z9 = bVar == bVar2 && r8.f3891r[i2] == 0;
            d dVar8 = dVar7.f3842f;
            if (dVar8 != null && r8 != eVar) {
                iE3 += dVar8.e();
            }
            int i12 = iE3;
            if (z4 && r8 != eVar && r8 != eVar3) {
                i11 = 8;
            }
            d dVar9 = dVar7.f3842f;
            e eVar6 = eVar5;
            if (dVar9 != null) {
                if (r8 == eVar3) {
                    dVar.h(dVar7.f3845i, dVar9.f3845i, i12, 6);
                } else {
                    dVar.h(dVar7.f3845i, dVar9.f3845i, i12, 8);
                }
                dVar.e(dVar7.f3845i, dVar7.f3842f.f3845i, i12, (!z9 || z4) ? i11 : 5);
            } else {
                eVar = eVar;
            }
            if (z5) {
                if (r8.Q() == 8 || r8.S[i2] != bVar2) {
                    i8 = 0;
                } else {
                    d[] dVarArr = r8.P;
                    i8 = 0;
                    dVar.h(dVarArr[i3 + 1].f3845i, dVarArr[i3].f3845i, 0, 5);
                }
                dVar.h(r8.P[i3].f3845i, fVar.P[i3].f3845i, i8, 8);
            }
            d dVar10 = r8.P[i3 + 1].f3842f;
            if (dVar10 != null) {
                e eVar7 = dVar10.f3840d;
                d dVar11 = eVar7.P[i3].f3842f;
                if (dVar11 != null && dVar11.f3840d == r8) {
                    obj = eVar7;
                }
            }
            if (obj != null) {
                r8 = obj;
                z7 = z7;
            } else {
                z7 = true;
            }
            z8 = z8;
            f2 = f3;
            eVar5 = eVar6;
            eVar = eVar;
            r8 = r8;
        }
        e eVar8 = eVar5;
        float f4 = f2;
        e eVar9 = eVar;
        boolean z10 = z8;
        if (eVar4 != null) {
            int i13 = i3 + 1;
            if (eVar2.P[i13].f3842f != null) {
                d dVar12 = eVar4.P[i13];
                if ((eVar4.S[i2] == e.b.MATCH_CONSTRAINT && eVar4.f3891r[i2] == 0) && !z4) {
                    d dVar13 = dVar12.f3842f;
                    if (dVar13.f3840d == fVar) {
                        dVar.e(dVar12.f3845i, dVar13.f3845i, -dVar12.e(), 5);
                    } else if (z4) {
                        dVar6 = dVar12.f3842f;
                        if (dVar6.f3840d == fVar) {
                            dVar.e(dVar12.f3845i, dVar6.f3845i, -dVar12.e(), 4);
                        }
                    }
                } else if (z4) {
                    dVar6 = dVar12.f3842f;
                    if (dVar6.f3840d == fVar) {
                        dVar.e(dVar12.f3845i, dVar6.f3845i, -dVar12.e(), 4);
                    }
                }
                dVar.j(dVar12.f3845i, eVar2.P[i13].f3842f.f3845i, -dVar12.e(), 6);
            }
        }
        if (z5) {
            int i14 = i3 + 1;
            u.i iVar6 = fVar.P[i14].f3845i;
            d dVar14 = eVar2.P[i14];
            dVar.h(iVar6, dVar14.f3845i, dVar14.e(), 8);
        }
        ArrayList<e> arrayList = cVar.f3822h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f5 = (!cVar.f3832r || cVar.f3834t) ? f4 : cVar.f3824j;
            float f6 = 0.0f;
            float f7 = 0.0f;
            e eVar10 = null;
            int i15 = 0;
            while (i15 < size) {
                e eVar11 = arrayList.get(i15);
                float f8 = eVar11.f3900v0[i2];
                if (f8 < f6) {
                    if (cVar.f3834t) {
                        d[] dVarArr2 = eVar11.P;
                        dVar.e(dVarArr2[i3 + 1].f3845i, dVarArr2[i3].f3845i, 0, 4);
                    } else {
                        f8 = 1.0f;
                    }
                    arrayList = arrayList;
                    i15++;
                    arrayList = arrayList;
                    f6 = 0.0f;
                }
                if (f8 == f6) {
                    d[] dVarArr3 = eVar11.P;
                    dVar.e(dVarArr3[i3 + 1].f3845i, dVarArr3[i3].f3845i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (eVar10 != null) {
                        d[] dVarArr4 = eVar10.P;
                        u.i iVar7 = dVarArr4[i3].f3845i;
                        int i16 = i3 + 1;
                        u.i iVar8 = dVarArr4[i16].f3845i;
                        d[] dVarArr5 = eVar11.P;
                        u.i iVar9 = dVarArr5[i3].f3845i;
                        u.i iVar10 = dVarArr5[i16].f3845i;
                        u.b bVarR = dVar.r();
                        bVarR.l(f7, f5, f8, iVar7, iVar8, iVar9, iVar10);
                        dVar.d(bVarR);
                    }
                    eVar10 = eVar11;
                    f7 = f8;
                }
                i15++;
                arrayList = arrayList;
                f6 = 0.0f;
            }
        }
        if (eVar3 != null && (eVar3 == eVar4 || z4)) {
            d dVar15 = eVar9.P[i3];
            int i17 = i3 + 1;
            d dVar16 = eVar2.P[i17];
            d dVar17 = dVar15.f3842f;
            u.i iVar11 = dVar17 != null ? dVar17.f3845i : null;
            d dVar18 = dVar16.f3842f;
            u.i iVar12 = dVar18 != null ? dVar18.f3845i : null;
            d dVar19 = eVar3.P[i3];
            d dVar20 = eVar4.P[i17];
            if (iVar11 != null && iVar12 != null) {
                dVar.c(dVar19.f3845i, iVar11, dVar19.e(), i2 == 0 ? eVar8.f3872h0 : eVar8.f3874i0, iVar12, dVar20.f3845i, dVar20.e(), 7);
            }
        } else if (!z10 || eVar3 == null) {
            int i18 = 8;
            if (z6 && eVar3 != null) {
                int i19 = cVar.f3824j;
                boolean z11 = i19 > 0 && cVar.f3823i == i19;
                e eVar12 = eVar3;
                e eVar13 = eVar12;
                while (eVar12 != null) {
                    e eVar14 = eVar12.f3904x0[i2];
                    while (eVar14 != null && eVar14.Q() == i18) {
                        eVar14 = eVar14.f3904x0[i2];
                    }
                    if (eVar12 == eVar3 || eVar12 == eVar4 || eVar14 == null) {
                        eVar13 = eVar13;
                        i5 = i18;
                    } else {
                        e eVar15 = eVar14 == eVar4 ? null : eVar14;
                        d dVar21 = eVar12.P[i3];
                        u.i iVar13 = dVar21.f3845i;
                        d dVar22 = dVar21.f3842f;
                        if (dVar22 != null) {
                            u.i iVar14 = dVar22.f3845i;
                        }
                        int i20 = i3 + 1;
                        u.i iVar15 = eVar13.P[i20].f3845i;
                        int iE4 = dVar21.e();
                        int iE5 = eVar12.P[i20].e();
                        if (eVar15 != null) {
                            dVar2 = eVar15.P[i3];
                            iVar = dVar2.f3845i;
                            dVar3 = dVar2.f3842f;
                            if (dVar3 == null) {
                                iVar2 = null;
                            }
                            if (dVar2 != null) {
                                iE5 += dVar2.e();
                            }
                            int i21 = iE5;
                            int iE6 = eVar13.P[i20].e() + iE4;
                            if (z11) {
                                i6 = 8;
                            } else {
                                i6 = 4;
                            }
                            if (iVar13 != null || iVar15 == null || iVar == null || iVar2 == null) {
                                i5 = 8;
                            } else {
                                i5 = 8;
                                dVar.c(iVar13, iVar15, iE6, 0.5f, iVar, iVar2, i21, i6);
                            }
                            eVar14 = eVar15;
                        } else {
                            dVar2 = eVar4.P[i3];
                            iVar = dVar2 != null ? dVar2.f3845i : null;
                            dVar3 = eVar12.P[i20];
                        }
                        iVar2 = dVar3.f3845i;
                        if (dVar2 != null) {
                            iE5 += dVar2.e();
                        }
                        int i22 = iE5;
                        int iE7 = eVar13.P[i20].e() + iE4;
                        if (z11) {
                            i6 = 8;
                        } else {
                            i6 = 4;
                        }
                        if (iVar13 != null) {
                            i5 = 8;
                        } else {
                            i5 = 8;
                        }
                        eVar14 = eVar15;
                    }
                    if (eVar12.Q() == i5) {
                        eVar12 = eVar13;
                    }
                    i18 = i5;
                    eVar13 = eVar12;
                    eVar12 = eVar14;
                }
                d dVar23 = eVar3.P[i3];
                d dVar24 = eVar9.P[i3].f3842f;
                int i23 = i3 + 1;
                d dVar25 = eVar4.P[i23];
                d dVar26 = eVar2.P[i23].f3842f;
                if (dVar24 == null) {
                    i4 = 5;
                } else if (eVar3 != eVar4) {
                    i4 = 5;
                    dVar.e(dVar23.f3845i, dVar24.f3845i, dVar23.e(), 5);
                } else {
                    i4 = 5;
                    if (dVar26 != null) {
                        dVar.c(dVar23.f3845i, dVar24.f3845i, dVar23.e(), 0.5f, dVar25.f3845i, dVar26.f3845i, dVar25.e(), 5);
                    }
                }
                if (dVar26 != null && eVar3 != eVar4) {
                    dVar.e(dVar25.f3845i, dVar26.f3845i, -dVar25.e(), i4);
                }
            }
        } else {
            int i24 = cVar.f3824j;
            boolean z12 = i24 > 0 && cVar.f3823i == i24;
            e eVar16 = eVar3;
            e eVar17 = eVar16;
            while (eVar16 != null) {
                e eVar18 = eVar16.f3904x0[i2];
                while (eVar18 != null && eVar18.Q() == 8) {
                    eVar18 = eVar18.f3904x0[i2];
                }
                if (eVar18 != null || eVar16 == eVar4) {
                    d dVar27 = eVar16.P[i3];
                    u.i iVar16 = dVar27.f3845i;
                    d dVar28 = dVar27.f3842f;
                    u.i iVar17 = dVar28 != null ? dVar28.f3845i : null;
                    if (eVar17 != eVar16) {
                        dVar4 = eVar17.P[i3 + 1];
                    } else {
                        if (eVar16 == eVar3 && eVar17 == eVar16) {
                            dVar4 = eVar9.P[i3].f3842f;
                            if (dVar4 == null) {
                                iVar17 = null;
                            }
                        }
                        iE = dVar27.e();
                        i7 = i3 + 1;
                        iE2 = eVar16.P[i7].e();
                        if (eVar18 != null) {
                            dVar5 = eVar18.P[i3];
                            u.i iVar18 = dVar5.f3845i;
                            iVar4 = eVar16.P[i7].f3845i;
                            iVar3 = iVar18;
                        } else {
                            dVar5 = eVar2.P[i7].f3842f;
                            if (dVar5 != null) {
                                iVar3 = dVar5.f3845i;
                            } else {
                                iVar3 = null;
                            }
                            iVar4 = eVar16.P[i7].f3845i;
                        }
                        if (dVar5 != null) {
                            iE2 += dVar5.e();
                        }
                        if (eVar17 != null) {
                            iE += eVar17.P[i7].e();
                        }
                        if (iVar16 == null && iVar17 != null && iVar3 != null && iVar4 != null) {
                            if (eVar16 == eVar3) {
                                iE = eVar3.P[i3].e();
                            }
                            dVar.c(iVar16, iVar17, iE, 0.5f, iVar3, iVar4, eVar16 == eVar4 ? eVar4.P[i7].e() : iE2, z12 ? 8 : 5);
                        }
                    }
                    iVar17 = dVar4.f3845i;
                    iE = dVar27.e();
                    i7 = i3 + 1;
                    iE2 = eVar16.P[i7].e();
                    if (eVar18 != null) {
                        dVar5 = eVar18.P[i3];
                        u.i iVar19 = dVar5.f3845i;
                        iVar4 = eVar16.P[i7].f3845i;
                        iVar3 = iVar19;
                    } else {
                        dVar5 = eVar2.P[i7].f3842f;
                        if (dVar5 != null) {
                            iVar3 = dVar5.f3845i;
                        } else {
                            iVar3 = null;
                        }
                        iVar4 = eVar16.P[i7].f3845i;
                    }
                    if (dVar5 != null) {
                        iE2 += dVar5.e();
                    }
                    if (eVar17 != null) {
                        iE += eVar17.P[i7].e();
                    }
                    if (iVar16 == null) {
                    }
                }
                if (eVar16.Q() != 8) {
                    eVar17 = eVar16;
                }
                eVar16 = eVar18;
            }
        }
        if ((!z10 && !z6) || eVar3 == null || eVar3 == eVar4) {
            return;
        }
        d[] dVarArr6 = eVar3.P;
        d dVar29 = dVarArr6[i3];
        int i25 = i3 + 1;
        d dVar30 = eVar4.P[i25];
        d dVar31 = dVar29.f3842f;
        u.i iVar20 = dVar31 != null ? dVar31.f3845i : null;
        d dVar32 = dVar30.f3842f;
        if (dVar32 != null) {
            iVar5 = dVar32.f3845i;
        } else {
            r5 = 0;
        }
        if (eVar2 != eVar4) {
            d dVar33 = eVar2.P[i25].f3842f;
            if (dVar33 != null) {
                r5 = iVar5;
                obj = dVar33.f3845i;
            }
            r5 = iVar5;
            r5 = obj;
        }
        if (eVar3 == eVar4) {
            dVar30 = dVarArr6[i25];
        }
        if (iVar20 == null || r5 == 0) {
            return;
        }
        dVar.c(dVar29.f3845i, iVar20, dVar29.e(), 0.5f, r5, dVar30.f3845i, eVar4.P[i25].e(), 5);
    }

    public static void b(f fVar, u.d dVar, ArrayList<e> arrayList, int i2) {
        int i3;
        c[] cVarArr;
        int i4;
        if (i2 == 0) {
            i3 = fVar.N0;
            cVarArr = fVar.Q0;
            i4 = 0;
        } else {
            i3 = fVar.O0;
            cVarArr = fVar.P0;
            i4 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            c cVar = cVarArr[i5];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f3815a)) {
                a(fVar, dVar, i2, i4, cVar);
            }
        }
    }
}
