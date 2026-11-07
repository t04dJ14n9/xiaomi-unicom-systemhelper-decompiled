package v;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {
    private int F0 = 0;
    private boolean G0 = true;
    private int H0 = 0;
    boolean I0 = false;

    public boolean c1() {
        int i2;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i3;
        int i4;
        boolean z2 = true;
        int i5 = 0;
        while (true) {
            i2 = this.E0;
            if (i5 >= i2) {
                break;
            }
            e eVar = this.D0[i5];
            if ((this.G0 || eVar.h()) && ((((i3 = this.F0) == 0 || i3 == 1) && !eVar.e0()) || (((i4 = this.F0) == 2 || i4 == 3) && !eVar.f0()))) {
                z2 = false;
            }
            i5++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.E0; i6++) {
            e eVar2 = this.D0[i6];
            if (this.G0 || eVar2.h()) {
                if (!z3) {
                    int i7 = this.F0;
                    if (i7 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i7 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i7 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i7 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z3 = true;
                    }
                    iMax = eVar2.m(bVar3).d();
                    z3 = true;
                }
                int i8 = this.F0;
                if (i8 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i8 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i8 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i8 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    iMax = Math.max(iMax, eVar2.m(bVar).d());
                }
                iMax = Math.min(iMax, eVar2.m(bVar2).d());
            }
        }
        int i9 = iMax + this.H0;
        int i10 = this.F0;
        if (i10 == 0 || i10 == 1) {
            p0(i9, i9);
        } else {
            s0(i9, i9);
        }
        this.I0 = true;
        return true;
    }

    public boolean d1() {
        return this.G0;
    }

    @Override // v.e
    public boolean e0() {
        return this.I0;
    }

    public int e1() {
        return this.F0;
    }

    @Override // v.e
    public boolean f0() {
        return this.I0;
    }

    public int f1() {
        return this.H0;
    }

    @Override // v.e
    public void g(u.d dVar, boolean z2) {
        d[] dVarArr;
        boolean z3;
        u.i iVar;
        d dVar2;
        int i2;
        int i3;
        int i4;
        u.i iVar2;
        int i5;
        d[] dVarArr2 = this.P;
        dVarArr2[0] = this.H;
        dVarArr2[2] = this.I;
        dVarArr2[1] = this.J;
        dVarArr2[3] = this.K;
        int i6 = 0;
        while (true) {
            dVarArr = this.P;
            if (i6 >= dVarArr.length) {
                break;
            }
            d dVar3 = dVarArr[i6];
            dVar3.f3845i = dVar.q(dVar3);
            i6++;
        }
        int i7 = this.F0;
        if (i7 < 0 || i7 >= 4) {
            return;
        }
        d dVar4 = dVarArr[i7];
        if (!this.I0) {
            c1();
        }
        if (this.I0) {
            this.I0 = false;
            int i8 = this.F0;
            if (i8 == 0 || i8 == 1) {
                dVar.f(this.H.f3845i, this.Y);
                iVar2 = this.J.f3845i;
                i5 = this.Y;
            } else {
                if (i8 != 2 && i8 != 3) {
                    return;
                }
                dVar.f(this.I.f3845i, this.Z);
                iVar2 = this.K.f3845i;
                i5 = this.Z;
            }
            dVar.f(iVar2, i5);
            return;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= this.E0) {
                z3 = false;
                break;
            }
            e eVar = this.D0[i9];
            if ((this.G0 || eVar.h()) && ((((i3 = this.F0) == 0 || i3 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.H.f3842f != null && eVar.J.f3842f != null) || (((i4 = this.F0) == 2 || i4 == 3) && eVar.O() == e.b.MATCH_CONSTRAINT && eVar.I.f3842f != null && eVar.K.f3842f != null))) {
                z3 = true;
                break;
            }
            i9++;
        }
        boolean z4 = this.H.k() || this.J.k();
        boolean z5 = this.I.k() || this.K.k();
        int i10 = !(!z3 && (((i2 = this.F0) == 0 && z4) || ((i2 == 2 && z5) || ((i2 == 1 && z4) || (i2 == 3 && z5))))) ? 4 : 5;
        for (int i11 = 0; i11 < this.E0; i11++) {
            e eVar2 = this.D0[i11];
            if (this.G0 || eVar2.h()) {
                u.i iVarQ = dVar.q(eVar2.P[this.F0]);
                d[] dVarArr3 = eVar2.P;
                int i12 = this.F0;
                d dVar5 = dVarArr3[i12];
                dVar5.f3845i = iVarQ;
                d dVar6 = dVar5.f3842f;
                int i13 = (dVar6 == null || dVar6.f3840d != this) ? 0 : dVar5.f3843g + 0;
                if (i12 == 0 || i12 == 2) {
                    dVar.i(dVar4.f3845i, iVarQ, this.H0 - i13, z3);
                } else {
                    dVar.g(dVar4.f3845i, iVarQ, this.H0 + i13, z3);
                }
                dVar.e(dVar4.f3845i, iVarQ, this.H0 + i13, i10);
            }
        }
        int i14 = this.F0;
        if (i14 == 0) {
            dVar.e(this.J.f3845i, this.H.f3845i, 0, 8);
            dVar.e(this.H.f3845i, this.T.J.f3845i, 0, 4);
            iVar = this.H.f3845i;
            dVar2 = this.T.H;
        } else if (i14 == 1) {
            dVar.e(this.H.f3845i, this.J.f3845i, 0, 8);
            dVar.e(this.H.f3845i, this.T.H.f3845i, 0, 4);
            iVar = this.H.f3845i;
            dVar2 = this.T.J;
        } else if (i14 == 2) {
            dVar.e(this.K.f3845i, this.I.f3845i, 0, 8);
            dVar.e(this.I.f3845i, this.T.K.f3845i, 0, 4);
            iVar = this.I.f3845i;
            dVar2 = this.T.I;
        } else {
            if (i14 != 3) {
                return;
            }
            dVar.e(this.I.f3845i, this.K.f3845i, 0, 8);
            dVar.e(this.I.f3845i, this.T.I.f3845i, 0, 4);
            iVar = this.I.f3845i;
            dVar2 = this.T.K;
        }
        dVar.e(iVar, dVar2.f3845i, 0, 0);
    }

    public int g1() {
        int i2 = this.F0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // v.e
    public boolean h() {
        return true;
    }

    protected void h1() {
        for (int i2 = 0; i2 < this.E0; i2++) {
            e eVar = this.D0[i2];
            int i3 = this.F0;
            if (i3 == 0 || i3 == 1) {
                eVar.C0(0, true);
            } else if (i3 == 2 || i3 == 3) {
                eVar.C0(1, true);
            }
        }
    }

    public void i1(boolean z2) {
        this.G0 = z2;
    }

    public void j1(int i2) {
        this.F0 = i2;
    }

    public void k1(int i2) {
        this.H0 = i2;
    }

    @Override // v.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i2 = 0; i2 < this.E0; i2++) {
            e eVar = this.D0[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
