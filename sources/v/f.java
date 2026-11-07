package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class f extends l {
    int J0;
    int K0;
    int L0;
    int M0;
    w.b E0 = new w.b(this);
    public w.e F0 = new w.e(this);
    protected w.b.InterfaceC0046b G0 = null;
    private boolean H0 = false;
    protected u.d I0 = new u.d();
    public int N0 = 0;
    public int O0 = 0;
    c[] P0 = new c[4];
    c[] Q0 = new c[4];
    public boolean R0 = false;
    public boolean S0 = false;
    public boolean T0 = false;
    public int U0 = 0;
    public int V0 = 0;
    private int W0 = 257;
    public boolean X0 = false;
    private boolean Y0 = false;
    private boolean Z0 = false;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    int f3916a1 = 0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private WeakReference<d> f3917b1 = null;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private WeakReference<d> f3918c1 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private WeakReference<d> f3919d1 = null;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private WeakReference<d> f3920e1 = null;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public w.b.a f3921f1 = new w.b.a();

    public static boolean A1(e eVar, w.b.InterfaceC0046b interfaceC0046b, w.b.a aVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0046b == null) {
            return false;
        }
        aVar.f3937a = eVar.y();
        aVar.f3938b = eVar.O();
        aVar.f3939c = eVar.R();
        aVar.f3940d = eVar.v();
        aVar.f3945i = false;
        aVar.f3946j = i2;
        e.b bVar = aVar.f3937a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z2 = bVar == bVar2;
        boolean z3 = aVar.f3938b == bVar2;
        boolean z4 = z2 && eVar.W > 0.0f;
        boolean z5 = z3 && eVar.W > 0.0f;
        if (z2 && eVar.V(0) && eVar.f3887p == 0 && !z4) {
            aVar.f3937a = e.b.WRAP_CONTENT;
            if (z3 && eVar.f3889q == 0) {
                aVar.f3937a = e.b.FIXED;
            }
            z2 = false;
        }
        if (z3 && eVar.V(1) && eVar.f3889q == 0 && !z5) {
            aVar.f3938b = e.b.WRAP_CONTENT;
            if (z2 && eVar.f3887p == 0) {
                aVar.f3938b = e.b.FIXED;
            }
            z3 = false;
        }
        if (eVar.e0()) {
            aVar.f3937a = e.b.FIXED;
            z2 = false;
        }
        if (eVar.f0()) {
            aVar.f3938b = e.b.FIXED;
            z3 = false;
        }
        if (z4) {
            if (eVar.f3891r[0] == 4) {
                aVar.f3937a = e.b.FIXED;
            } else if (!z3) {
                e.b bVar3 = aVar.f3938b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i4 = aVar.f3940d;
                } else {
                    aVar.f3937a = e.b.WRAP_CONTENT;
                    interfaceC0046b.b(eVar, aVar);
                    i4 = aVar.f3942f;
                }
                aVar.f3937a = bVar4;
                int i5 = eVar.X;
                aVar.f3939c = (int) ((i5 == 0 || i5 == -1) ? eVar.t() * i4 : eVar.t() / i4);
            }
        }
        if (z5) {
            if (eVar.f3891r[1] == 4) {
                aVar.f3938b = e.b.FIXED;
            } else if (!z2) {
                e.b bVar5 = aVar.f3937a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i3 = aVar.f3939c;
                } else {
                    aVar.f3938b = e.b.WRAP_CONTENT;
                    interfaceC0046b.b(eVar, aVar);
                    i3 = aVar.f3941e;
                }
                aVar.f3938b = bVar6;
                int i6 = eVar.X;
                aVar.f3940d = (int) ((i6 == 0 || i6 == -1) ? i3 / eVar.t() : i3 * eVar.t());
            }
        }
        interfaceC0046b.b(eVar, aVar);
        eVar.U0(aVar.f3941e);
        eVar.v0(aVar.f3942f);
        eVar.u0(aVar.f3944h);
        eVar.k0(aVar.f3943g);
        aVar.f3946j = w.b.a.f3934k;
        return aVar.f3945i;
    }

    private void C1() {
        this.N0 = 0;
        this.O0 = 0;
    }

    private void g1(e eVar) {
        int i2 = this.N0 + 1;
        c[] cVarArr = this.Q0;
        if (i2 >= cVarArr.length) {
            this.Q0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Q0[this.N0] = new c(eVar, 0, x1());
        this.N0++;
    }

    private void j1(d dVar, u.i iVar) {
        this.I0.h(iVar, this.I0.q(dVar), 0, 5);
    }

    private void k1(d dVar, u.i iVar) {
        this.I0.h(this.I0.q(dVar), iVar, 0, 5);
    }

    private void l1(e eVar) {
        int i2 = this.O0 + 1;
        c[] cVarArr = this.P0;
        if (i2 >= cVarArr.length) {
            this.P0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.P0[this.O0] = new c(eVar, 1, x1());
        this.O0++;
    }

    public boolean B1(int i2) {
        return (this.W0 & i2) == i2;
    }

    public void D1(w.b.InterfaceC0046b interfaceC0046b) {
        this.G0 = interfaceC0046b;
        this.F0.n(interfaceC0046b);
    }

    public void E1(int i2) {
        this.W0 = i2;
        u.d.f3736r = B1(512);
    }

    public void F1(boolean z2) {
        this.H0 = z2;
    }

    public void G1(u.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zB1 = B1(64);
        Z0(dVar, zB1);
        int size = this.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.D0.get(i2).Z0(dVar, zB1);
        }
    }

    public void H1() {
        this.E0.e(this);
    }

    @Override // v.e
    public void Y0(boolean z2, boolean z3) {
        super.Y0(z2, z3);
        int size = this.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.D0.get(i2).Y0(z2, z3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02f4 A[PHI: r0 r2
      0x02f4: PHI (r0v20 ??) = (r0v19 ??), (r0v22 ??), (r0v22 ??), (r0v22 ??) binds: [B:138:0x02b8, B:146:0x02dc, B:147:0x02de, B:149:0x02e4] A[DONT_GENERATE, DONT_INLINE]
      0x02f4: PHI (r2v14 boolean) = (r2v13 boolean), (r2v16 boolean), (r2v16 boolean), (r2v16 boolean) binds: [B:138:0x02b8, B:146:0x02dc, B:147:0x02de, B:149:0x02e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // v.l
    public void b1() {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        ?? r6;
        boolean z4;
        ?? r1;
        ?? r14;
        boolean z5;
        e.b bVar;
        int i4 = 0;
        this.Y = 0;
        this.Z = 0;
        this.Y0 = false;
        this.Z0 = false;
        int size = this.D0.size();
        int iMax = Math.max(0, R());
        int iMax2 = Math.max(0, v());
        e.b[] bVarArr = this.S;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        if (j.b(this.W0, 1)) {
            w.h.h(this, r1());
            for (int i5 = 0; i5 < size; i5++) {
                e eVar = this.D0.get(i5);
                if (eVar.d0() && !(eVar instanceof g) && !(eVar instanceof a) && !(eVar instanceof k) && !eVar.c0()) {
                    e.b bVarS = eVar.s(0);
                    e.b bVarS2 = eVar.s(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (!(bVarS == bVar4 && eVar.f3887p != 1 && bVarS2 == bVar4 && eVar.f3889q != 1)) {
                        A1(eVar, this.G0, new w.b.a(), w.b.a.f3934k);
                    }
                }
            }
        }
        if (size <= 2 || !((bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) && j.b(this.W0, 1024) && w.i.c(this, r1()))) {
            i2 = iMax2;
            i3 = iMax;
            z2 = false;
        } else {
            if (bVar3 == bVar) {
                if (iMax >= R() || iMax <= 0) {
                    iMax = R();
                } else {
                    U0(iMax);
                    this.Y0 = true;
                }
            }
            if (bVar2 == bVar) {
                if (iMax2 >= v() || iMax2 <= 0) {
                    iMax2 = v();
                } else {
                    v0(iMax2);
                    this.Z0 = true;
                }
            }
            i2 = iMax2;
            i3 = iMax;
            z2 = true;
        }
        boolean z6 = B1(64) || B1(128);
        u.d dVar = this.I0;
        dVar.f3751h = false;
        dVar.f3752i = false;
        if (this.W0 != 0 && z6) {
            dVar.f3752i = true;
        }
        ArrayList<e> arrayList = this.D0;
        e.b bVarY = y();
        e.b bVar5 = e.b.WRAP_CONTENT;
        boolean z7 = bVarY == bVar5 || O() == bVar5;
        C1();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar2 = this.D0.get(i6);
            if (eVar2 instanceof l) {
                ((l) eVar2).b1();
            }
        }
        boolean zB1 = B1(64);
        boolean z8 = z2;
        int i7 = 0;
        ?? F1 = 1;
        while (F1 != 0) {
            int i8 = i7 + 1;
            try {
                this.I0.D();
                C1();
                k(this.I0);
                for (int i9 = i4; i9 < size; i9++) {
                    this.D0.get(i9).k(this.I0);
                }
                F1 = f1(this.I0);
                WeakReference<d> weakReference = this.f3917b1;
                if (weakReference != null && weakReference.get() != null) {
                    k1(this.f3917b1.get(), this.I0.q(this.I));
                    this.f3917b1 = null;
                }
                WeakReference<d> weakReference2 = this.f3919d1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    j1(this.f3919d1.get(), this.I0.q(this.K));
                    this.f3919d1 = null;
                }
                WeakReference<d> weakReference3 = this.f3918c1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    k1(this.f3918c1.get(), this.I0.q(this.H));
                    this.f3918c1 = null;
                }
                WeakReference<d> weakReference4 = this.f3920e1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    j1(this.f3920e1.get(), this.I0.q(this.J));
                    this.f3920e1 = null;
                }
                if (F1 != 0) {
                    this.I0.z();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("EXCEPTION : " + e2);
            }
            u.d dVar2 = this.I0;
            if (F1 != 0) {
                G1(dVar2, j.f3923a);
            } else {
                Z0(dVar2, zB1);
                for (int i10 = 0; i10 < size; i10++) {
                    this.D0.get(i10).Z0(this.I0, zB1);
                }
            }
            if (z7 && i8 < 8 && j.f3923a[2]) {
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    e eVar3 = this.D0.get(i11);
                    iMax3 = Math.max(iMax3, eVar3.Y + eVar3.R());
                    iMax4 = Math.max(iMax4, eVar3.Z + eVar3.v());
                }
                int iMax5 = Math.max(this.f3868f0, iMax3);
                int iMax6 = Math.max(this.f3870g0, iMax4);
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar3 != bVar6 || R() >= iMax5) {
                    z3 = false;
                    z8 = z8;
                } else {
                    U0(iMax5);
                    this.S[0] = bVar6;
                    z3 = true;
                    z8 = true;
                }
                if (bVar2 == bVar6 && v() < iMax6) {
                    v0(iMax6);
                    this.S[1] = bVar6;
                    z3 = true;
                    z8 = true;
                }
            } else {
                z3 = false;
            }
            int iMax7 = Math.max(this.f3868f0, R());
            boolean z9 = z3;
            boolean z10 = z8;
            if (iMax7 > R()) {
                U0(iMax7);
                this.S[0] = e.b.FIXED;
                z9 = true;
                z10 = true;
            }
            int iMax8 = Math.max(this.f3870g0, v());
            if (iMax8 > v()) {
                v0(iMax8);
                r6 = 1;
                this.S[1] = e.b.FIXED;
                r1 = 1;
                z4 = true;
            } else {
                r6 = 1;
                z4 = z10;
            }
            if (z4) {
                r1 = z9;
                r14 = r1;
                z5 = z4;
            } else {
                r1 = z9;
                e.b bVar7 = this.S[0];
                e.b bVar8 = e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i3 > 0) {
                    r1 = r1;
                    z4 = z4;
                    if (R() > i3) {
                        this.Y0 = r6;
                        this.S[0] = e.b.FIXED;
                        U0(i3);
                        ?? r2 = r6;
                        z4 = r2 == true ? 1 : 0;
                        r1 = r2;
                    }
                }
                r1 = r1;
                r1 = r1;
                z4 = z4;
                z4 = z4;
                if (this.S[r6] != bVar8 || i2 <= 0 || v() <= i2) {
                    r1 = z9;
                    r14 = r1;
                    z5 = z4;
                } else {
                    this.Z0 = r6;
                    this.S[r6] = e.b.FIXED;
                    v0(i2);
                    z5 = true;
                    r14 = 1;
                }
            }
            i7 = i8;
            i4 = 0;
            z8 = z5;
            F1 = r14;
        }
        this.D0 = arrayList;
        if (z8) {
            e.b[] bVarArr2 = this.S;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        j0(this.I0.v());
    }

    void e1(e eVar, int i2) {
        if (i2 == 0) {
            g1(eVar);
        } else if (i2 == 1) {
            l1(eVar);
        }
    }

    public boolean f1(u.d dVar) {
        boolean zB1 = B1(64);
        g(dVar, zB1);
        int size = this.D0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.D0.get(i2);
            eVar.C0(0, false);
            eVar.C0(1, false);
            if (eVar instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.D0.get(i3);
                if (eVar2 instanceof a) {
                    ((a) eVar2).h1();
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            e eVar3 = this.D0.get(i4);
            if (eVar3.f()) {
                eVar3.g(dVar, zB1);
            }
        }
        if (u.d.f3736r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i5 = 0; i5 < size; i5++) {
                e eVar4 = this.D0.get(i5);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar5 : hashSet) {
                j.a(this, dVar, eVar5);
                eVar5.g(dVar, zB1);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                e eVar6 = this.D0.get(i6);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.S;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.z0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.Q0(e.b.FIXED);
                    }
                    eVar6.g(dVar, zB1);
                    if (bVar == bVar3) {
                        eVar6.z0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.Q0(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, zB1);
                    }
                }
            }
        }
        if (this.N0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.O0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    @Override // v.l, v.e
    public void h0() {
        this.I0.D();
        this.J0 = 0;
        this.L0 = 0;
        this.K0 = 0;
        this.M0 = 0;
        this.X0 = false;
        super.h0();
    }

    public void h1(d dVar) {
        WeakReference<d> weakReference = this.f3920e1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f3920e1.get().d()) {
            this.f3920e1 = new WeakReference<>(dVar);
        }
    }

    public void i1(d dVar) {
        WeakReference<d> weakReference = this.f3918c1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f3918c1.get().d()) {
            this.f3918c1 = new WeakReference<>(dVar);
        }
    }

    void m1(d dVar) {
        WeakReference<d> weakReference = this.f3919d1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f3919d1.get().d()) {
            this.f3919d1 = new WeakReference<>(dVar);
        }
    }

    void n1(d dVar) {
        WeakReference<d> weakReference = this.f3917b1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f3917b1.get().d()) {
            this.f3917b1 = new WeakReference<>(dVar);
        }
    }

    public boolean o1(boolean z2) {
        return this.F0.f(z2);
    }

    public boolean p1(boolean z2) {
        return this.F0.g(z2);
    }

    public boolean q1(boolean z2, int i2) {
        return this.F0.h(z2, i2);
    }

    public w.b.InterfaceC0046b r1() {
        return this.G0;
    }

    public int s1() {
        return this.W0;
    }

    public u.d t1() {
        return this.I0;
    }

    public void u1() {
        this.F0.j();
    }

    public void v1() {
        this.F0.k();
    }

    public boolean w1() {
        return this.Z0;
    }

    public boolean x1() {
        return this.H0;
    }

    public boolean y1() {
        return this.Y0;
    }

    public long z1(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.J0 = i9;
        this.K0 = i10;
        return this.E0.d(this, i2, i9, i10, i3, i4, i5, i6, i7, i8);
    }
}
