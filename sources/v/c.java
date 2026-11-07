package v;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f3815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f3816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f3817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f3818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f3819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f3820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f3821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f3822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f3823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f3824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f3825k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f3826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f3827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f3828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f3829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f3831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f3832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f3833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f3834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f3835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f3836v;

    public c(e eVar, int i2, boolean z2) {
        this.f3815a = eVar;
        this.f3830p = i2;
        this.f3831q = z2;
    }

    private void b() {
        int i2 = this.f3830p * 2;
        e eVar = this.f3815a;
        this.f3829o = true;
        e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f3823i++;
            e[] eVarArr = eVar.f3904x0;
            int i3 = this.f3830p;
            e eVar3 = null;
            eVarArr[i3] = null;
            eVar.f3902w0[i3] = null;
            if (eVar.Q() != 8) {
                this.f3826l++;
                e.b bVarS = eVar.s(this.f3830p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f3827m += eVar.C(this.f3830p);
                }
                int iE = this.f3827m + eVar.P[i2].e();
                this.f3827m = iE;
                int i4 = i2 + 1;
                this.f3827m = iE + eVar.P[i4].e();
                int iE2 = this.f3828n + eVar.P[i2].e();
                this.f3828n = iE2;
                this.f3828n = iE2 + eVar.P[i4].e();
                if (this.f3816b == null) {
                    this.f3816b = eVar;
                }
                this.f3818d = eVar;
                e.b[] bVarArr = eVar.S;
                int i5 = this.f3830p;
                if (bVarArr[i5] == bVar) {
                    int i6 = eVar.f3891r[i5];
                    if (i6 == 0 || i6 == 3 || i6 == 2) {
                        this.f3824j++;
                        float f2 = eVar.f3900v0[i5];
                        if (f2 > 0.0f) {
                            this.f3825k += f2;
                        }
                        if (c(eVar, i5)) {
                            if (f2 < 0.0f) {
                                this.f3832r = true;
                            } else {
                                this.f3833s = true;
                            }
                            if (this.f3822h == null) {
                                this.f3822h = new ArrayList<>();
                            }
                            this.f3822h.add(eVar);
                        }
                        if (this.f3820f == null) {
                            this.f3820f = eVar;
                        }
                        e eVar4 = this.f3821g;
                        if (eVar4 != null) {
                            eVar4.f3902w0[this.f3830p] = eVar;
                        }
                        this.f3821g = eVar;
                    }
                    if (this.f3830p != 0 ? !(eVar.f3889q == 0 && eVar.f3899v == 0 && eVar.f3901w == 0) : !(eVar.f3887p == 0 && eVar.f3893s == 0 && eVar.f3895t == 0)) {
                        this.f3829o = false;
                    }
                    if (eVar.W != 0.0f) {
                        this.f3829o = false;
                        this.f3835u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f3904x0[this.f3830p] = eVar;
            }
            d dVar = eVar.P[i2 + 1].f3842f;
            if (dVar != null) {
                e eVar5 = dVar.f3840d;
                d dVar2 = eVar5.P[i2].f3842f;
                if (dVar2 != null && dVar2.f3840d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f3816b;
        if (eVar6 != null) {
            this.f3827m -= eVar6.P[i2].e();
        }
        e eVar7 = this.f3818d;
        if (eVar7 != null) {
            this.f3827m -= eVar7.P[i2 + 1].e();
        }
        this.f3817c = eVar;
        if (this.f3830p == 0 && this.f3831q) {
            this.f3819e = eVar;
        } else {
            this.f3819e = this.f3815a;
        }
        this.f3834t = this.f3833s && this.f3832r;
    }

    private static boolean c(e eVar, int i2) {
        int i3;
        return eVar.Q() != 8 && eVar.S[i2] == e.b.MATCH_CONSTRAINT && ((i3 = eVar.f3891r[i2]) == 0 || i3 == 3);
    }

    public void a() {
        if (!this.f3836v) {
            b();
        }
        this.f3836v = true;
    }
}
