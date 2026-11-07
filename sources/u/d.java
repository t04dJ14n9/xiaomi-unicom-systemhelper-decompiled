package u;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f3736r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f3737s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f3738t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f3739u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f3740v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f3741w = 1000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f3742x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f3743y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f3747d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    u.b[] f3750g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final c f3757n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f3760q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3744a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3745b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, i> f3746c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3748e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3749f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3751h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3752i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean[] f3753j = new boolean[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f3754k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f3755l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f3756m = 32;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private i[] f3758o = new i[f3741w];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3759p = 0;

    interface a {
        void a(a aVar);

        i b(d dVar, boolean[] zArr);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends u.b {
        public b(c cVar) {
            this.f3730e = new j(this, cVar);
        }
    }

    public d() {
        this.f3750g = null;
        this.f3750g = new u.b[32];
        C();
        c cVar = new c();
        this.f3757n = cVar;
        this.f3747d = new h(cVar);
        this.f3760q = f3740v ? new b(cVar) : new u.b(cVar);
    }

    private final int B(a aVar, boolean z2) {
        for (int i2 = 0; i2 < this.f3754k; i2++) {
            this.f3753j[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            i3++;
            if (i3 >= this.f3754k * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f3753j[aVar.getKey().f3777c] = true;
            }
            i iVarB = aVar.b(this, this.f3753j);
            if (iVarB != null) {
                boolean[] zArr = this.f3753j;
                int i4 = iVarB.f3777c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (iVarB != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f3755l; i6++) {
                    u.b bVar = this.f3750g[i6];
                    if (bVar.f3726a.f3784j != i.a.UNRESTRICTED && !bVar.f3731f && bVar.t(iVarB)) {
                        float fD = bVar.f3730e.d(iVarB);
                        if (fD < 0.0f) {
                            float f3 = (-bVar.f3727b) / fD;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    u.b bVar2 = this.f3750g[i5];
                    bVar2.f3726a.f3778d = -1;
                    bVar2.x(iVarB);
                    i iVar = bVar2.f3726a;
                    iVar.f3778d = i5;
                    iVar.g(this, bVar2);
                }
            } else {
                z3 = true;
            }
        }
        return i3;
    }

    private void C() {
        int i2 = 0;
        if (f3740v) {
            while (i2 < this.f3755l) {
                u.b bVar = this.f3750g[i2];
                if (bVar != null) {
                    this.f3757n.f3732a.b(bVar);
                }
                this.f3750g[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.f3755l) {
            u.b bVar2 = this.f3750g[i2];
            if (bVar2 != null) {
                this.f3757n.f3733b.b(bVar2);
            }
            this.f3750g[i2] = null;
            i2++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarC = this.f3757n.f3734c.c();
        if (iVarC == null) {
            iVarC = new i(aVar, str);
        } else {
            iVarC.d();
        }
        iVarC.f(aVar, str);
        int i2 = this.f3759p;
        int i3 = f3741w;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f3741w = i4;
            this.f3758o = (i[]) Arrays.copyOf(this.f3758o, i4);
        }
        i[] iVarArr = this.f3758o;
        int i5 = this.f3759p;
        this.f3759p = i5 + 1;
        iVarArr[i5] = iVarC;
        return iVarC;
    }

    private final void l(u.b bVar) {
        int i2;
        if (f3738t && bVar.f3731f) {
            bVar.f3726a.e(this, bVar.f3727b);
        } else {
            u.b[] bVarArr = this.f3750g;
            int i3 = this.f3755l;
            bVarArr[i3] = bVar;
            i iVar = bVar.f3726a;
            iVar.f3778d = i3;
            this.f3755l = i3 + 1;
            iVar.g(this, bVar);
        }
        if (f3738t && this.f3744a) {
            int i4 = 0;
            while (i4 < this.f3755l) {
                if (this.f3750g[i4] == null) {
                    System.out.println("WTF");
                }
                u.b bVar2 = this.f3750g[i4];
                if (bVar2 != null && bVar2.f3731f) {
                    bVar2.f3726a.e(this, bVar2.f3727b);
                    (f3740v ? this.f3757n.f3732a : this.f3757n.f3733b).b(bVar2);
                    this.f3750g[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f3755l;
                        if (i5 >= i2) {
                            break;
                        }
                        u.b[] bVarArr2 = this.f3750g;
                        int i7 = i5 - 1;
                        u.b bVar3 = bVarArr2[i5];
                        bVarArr2[i7] = bVar3;
                        i iVar2 = bVar3.f3726a;
                        if (iVar2.f3778d == i5) {
                            iVar2.f3778d = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f3750g[i6] = null;
                    }
                    this.f3755l = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f3744a = false;
        }
    }

    private void n() {
        for (int i2 = 0; i2 < this.f3755l; i2++) {
            u.b bVar = this.f3750g[i2];
            bVar.f3726a.f3780f = bVar.f3727b;
        }
    }

    public static u.b s(d dVar, i iVar, i iVar2, float f2) {
        return dVar.r().j(iVar, iVar2, f2);
    }

    private int u(a aVar) {
        boolean z2;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f3755l) {
                z2 = false;
                break;
            }
            u.b bVar = this.f3750g[i2];
            if (bVar.f3726a.f3784j != i.a.UNRESTRICTED && bVar.f3727b < 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (!z2) {
            return 0;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            i3++;
            float f2 = Float.MAX_VALUE;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f3755l; i7++) {
                u.b bVar2 = this.f3750g[i7];
                if (bVar2.f3726a.f3784j != i.a.UNRESTRICTED && !bVar2.f3731f && bVar2.f3727b < 0.0f) {
                    int i8 = 9;
                    if (f3739u) {
                        int iK = bVar2.f3730e.k();
                        int i9 = 0;
                        while (i9 < iK) {
                            i iVarF = bVar2.f3730e.f(i9);
                            float fD = bVar2.f3730e.d(iVarF);
                            if (fD > 0.0f) {
                                int i10 = 0;
                                while (i10 < i8) {
                                    float f3 = iVarF.f3782h[i10] / fD;
                                    if ((f3 < f2 && i10 == i6) || i10 > i6) {
                                        i5 = iVarF.f3777c;
                                        i6 = i10;
                                        i4 = i7;
                                        f2 = f3;
                                    }
                                    i10++;
                                    i8 = 9;
                                }
                            }
                            i9++;
                            i8 = 9;
                        }
                    } else {
                        for (int i11 = 1; i11 < this.f3754k; i11++) {
                            i iVar = this.f3757n.f3735d[i11];
                            float fD2 = bVar2.f3730e.d(iVar);
                            if (fD2 > 0.0f) {
                                for (int i12 = 0; i12 < 9; i12++) {
                                    float f4 = iVar.f3782h[i12] / fD2;
                                    if ((f4 < f2 && i12 == i6) || i12 > i6) {
                                        i5 = i11;
                                        i4 = i7;
                                        i6 = i12;
                                        f2 = f4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i4 != -1) {
                u.b bVar3 = this.f3750g[i4];
                bVar3.f3726a.f3778d = -1;
                bVar3.x(this.f3757n.f3735d[i5]);
                i iVar2 = bVar3.f3726a;
                iVar2.f3778d = i4;
                iVar2.g(this, bVar3);
            } else {
                z3 = true;
            }
            if (i3 > this.f3754k / 2) {
                z3 = true;
            }
        }
        return i3;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i2 = this.f3748e * 2;
        this.f3748e = i2;
        this.f3750g = (u.b[]) Arrays.copyOf(this.f3750g, i2);
        c cVar = this.f3757n;
        cVar.f3735d = (i[]) Arrays.copyOf(cVar.f3735d, this.f3748e);
        int i3 = this.f3748e;
        this.f3753j = new boolean[i3];
        this.f3749f = i3;
        this.f3756m = i3;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f3757n;
            i[] iVarArr = cVar.f3735d;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.d();
            }
            i2++;
        }
        cVar.f3734c.a(this.f3758o, this.f3759p);
        this.f3759p = 0;
        Arrays.fill(this.f3757n.f3735d, (Object) null);
        HashMap<String, i> map = this.f3746c;
        if (map != null) {
            map.clear();
        }
        this.f3745b = 0;
        this.f3747d.clear();
        this.f3754k = 1;
        for (int i3 = 0; i3 < this.f3755l; i3++) {
            u.b bVar = this.f3750g[i3];
            if (bVar != null) {
                bVar.f3728c = false;
            }
        }
        C();
        this.f3755l = 0;
        this.f3760q = f3740v ? new b(this.f3757n) : new u.b(this.f3757n);
    }

    public void b(v.e eVar, v.e eVar2, float f2, int i2) {
        v.d.b bVar = v.d.b.LEFT;
        i iVarQ = q(eVar.m(bVar));
        v.d.b bVar2 = v.d.b.TOP;
        i iVarQ2 = q(eVar.m(bVar2));
        v.d.b bVar3 = v.d.b.RIGHT;
        i iVarQ3 = q(eVar.m(bVar3));
        v.d.b bVar4 = v.d.b.BOTTOM;
        i iVarQ4 = q(eVar.m(bVar4));
        i iVarQ5 = q(eVar2.m(bVar));
        i iVarQ6 = q(eVar2.m(bVar2));
        i iVarQ7 = q(eVar2.m(bVar3));
        i iVarQ8 = q(eVar2.m(bVar4));
        u.b bVarR = r();
        double d2 = f2;
        double d3 = i2;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d2) * d3));
        d(bVarR);
        u.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d2) * d3));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        u.b bVarR = r();
        bVarR.h(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i4 != 8) {
            bVarR.d(this, i4);
        }
        d(bVarR);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    public void d(u.b bVar) {
        i iVarV;
        if (bVar == null) {
            return;
        }
        boolean z2 = true;
        if (this.f3755l + 1 >= this.f3756m || this.f3754k + 1 >= this.f3749f) {
            y();
        }
        boolean z3 = false;
        if (!bVar.f3731f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f3726a = iVarP;
                int i2 = this.f3755l;
                l(bVar);
                if (this.f3755l == i2 + 1) {
                    this.f3760q.a(bVar);
                    B(this.f3760q, true);
                    if (iVarP.f3778d == -1) {
                        if (bVar.f3726a == iVarP && (iVarV = bVar.v(iVarP)) != null) {
                            bVar.x(iVarV);
                        }
                        if (!bVar.f3731f) {
                            bVar.f3726a.g(this, bVar);
                        }
                        (f3740v ? this.f3757n.f3732a : this.f3757n.f3733b).b(bVar);
                        this.f3755l--;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z3 = z2;
            }
        }
        if (z3) {
            return;
        }
        l(bVar);
    }

    public u.b e(i iVar, i iVar2, int i2, int i3) {
        if (f3737s && i3 == 8 && iVar2.f3781g && iVar.f3778d == -1) {
            iVar.e(this, iVar2.f3780f + i2);
            return null;
        }
        u.b bVarR = r();
        bVarR.n(iVar, iVar2, i2);
        if (i3 != 8) {
            bVarR.d(this, i3);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i2) {
        u.b bVarR;
        if (f3737s && iVar.f3778d == -1) {
            float f2 = i2;
            iVar.e(this, f2);
            for (int i3 = 0; i3 < this.f3745b + 1; i3++) {
                i iVar2 = this.f3757n.f3735d[i3];
                if (iVar2 != null && iVar2.f3788n && iVar2.f3789o == iVar.f3777c) {
                    iVar2.e(this, iVar2.f3790p + f2);
                }
            }
            return;
        }
        int i4 = iVar.f3778d;
        if (i4 != -1) {
            u.b bVar = this.f3750g[i4];
            if (!bVar.f3731f) {
                if (bVar.f3730e.k() == 0) {
                    bVar.f3731f = true;
                } else {
                    bVarR = r();
                    bVarR.m(iVar, i2);
                }
            }
            bVar.f3727b = i2;
            return;
        }
        bVarR = r();
        bVarR.i(iVar, i2);
        d(bVarR);
    }

    public void g(i iVar, i iVar2, int i2, boolean z2) {
        u.b bVarR = r();
        i iVarT = t();
        iVarT.f3779e = 0;
        bVarR.o(iVar, iVar2, iVarT, i2);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i2, int i3) {
        u.b bVarR = r();
        i iVarT = t();
        iVarT.f3779e = 0;
        bVarR.o(iVar, iVar2, iVarT, i2);
        if (i3 != 8) {
            m(bVarR, (int) (bVarR.f3730e.d(iVarT) * (-1.0f)), i3);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i2, boolean z2) {
        u.b bVarR = r();
        i iVarT = t();
        iVarT.f3779e = 0;
        bVarR.p(iVar, iVar2, iVarT, i2);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i2, int i3) {
        u.b bVarR = r();
        i iVarT = t();
        iVarT.f3779e = 0;
        bVarR.p(iVar, iVar2, iVarT, i2);
        if (i3 != 8) {
            m(bVarR, (int) (bVarR.f3730e.d(iVarT) * (-1.0f)), i3);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        u.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 8) {
            bVarR.d(this, i2);
        }
        d(bVarR);
    }

    void m(u.b bVar, int i2, int i3) {
        bVar.e(o(i3, null), i2);
    }

    public i o(int i2, String str) {
        if (this.f3754k + 1 >= this.f3749f) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i3 = this.f3745b + 1;
        this.f3745b = i3;
        this.f3754k++;
        iVarA.f3777c = i3;
        iVarA.f3779e = i2;
        this.f3757n.f3735d[i3] = iVarA;
        this.f3747d.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f3754k + 1 >= this.f3749f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i2 = this.f3745b + 1;
        this.f3745b = i2;
        this.f3754k++;
        iVarA.f3777c = i2;
        this.f3757n.f3735d[i2] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarH = null;
        if (obj == null) {
            return null;
        }
        if (this.f3754k + 1 >= this.f3749f) {
            y();
        }
        if (obj instanceof v.d) {
            v.d dVar = (v.d) obj;
            iVarH = dVar.h();
            if (iVarH == null) {
                dVar.r(this.f3757n);
                iVarH = dVar.h();
            }
            int i2 = iVarH.f3777c;
            if (i2 == -1 || i2 > this.f3745b || this.f3757n.f3735d[i2] == null) {
                if (i2 != -1) {
                    iVarH.d();
                }
                int i3 = this.f3745b + 1;
                this.f3745b = i3;
                this.f3754k++;
                iVarH.f3777c = i3;
                iVarH.f3784j = i.a.UNRESTRICTED;
                this.f3757n.f3735d[i3] = iVarH;
            }
        }
        return iVarH;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r0
      0x0038: PHI (r0v6 u.b) = (r0v4 u.b), (r0v11 u.b) binds: [B:8:0x0029, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    public u.b r() {
        u.b bVarC;
        if (f3740v) {
            bVarC = this.f3757n.f3732a.c();
            if (bVarC == null) {
                bVarC = new b(this.f3757n);
                f3743y++;
            } else {
                bVarC.y();
            }
        } else {
            bVarC = this.f3757n.f3733b.c();
            if (bVarC == null) {
                bVarC = new u.b(this.f3757n);
                f3742x++;
            } else {
                bVarC.y();
            }
        }
        i.b();
        return bVarC;
    }

    public i t() {
        if (this.f3754k + 1 >= this.f3749f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i2 = this.f3745b + 1;
        this.f3745b = i2;
        this.f3754k++;
        iVarA.f3777c = i2;
        this.f3757n.f3735d[i2] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f3757n;
    }

    public int x(Object obj) {
        i iVarH = ((v.d) obj).h();
        if (iVarH != null) {
            return (int) (iVarH.f3780f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f3747d.isEmpty()) {
            n();
            return;
        }
        if (this.f3751h || this.f3752i) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f3755l) {
                    z2 = true;
                    break;
                } else if (!this.f3750g[i2].f3731f) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                n();
                return;
            }
        }
        A(this.f3747d);
    }
}
