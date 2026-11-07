package c1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2104b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d1.a f2106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d1.a f2108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f2112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2115m;

    public a() {
        d1.a aVar = d1.a.f2421c;
        this.f2106d = aVar;
        this.f2108f = aVar;
        this.f2110h = 0;
        this.f2112j = 0L;
        this.f2114l = 0;
        this.f2115m = -1;
    }

    @Override // d1.c
    public int a() {
        if (this.f2115m < 0) {
            b();
        }
        return this.f2115m;
    }

    @Override // d1.c
    public int b() {
        int iD = l() ? 0 + d1.b.d(1, f()) : 0;
        if (n()) {
            iD += d1.b.b(2, h());
        }
        if (o()) {
            iD += d1.b.b(3, i());
        }
        if (p()) {
            iD += d1.b.d(4, j());
        }
        if (q()) {
            iD += d1.b.k(5, k());
        }
        if (m()) {
            iD += d1.b.d(6, g());
        }
        this.f2115m = iD;
        return iD;
    }

    @Override // d1.c
    public void e(d1.b bVar) throws IOException {
        if (l()) {
            bVar.r(1, f());
        }
        if (n()) {
            bVar.p(2, h());
        }
        if (o()) {
            bVar.p(3, i());
        }
        if (p()) {
            bVar.r(4, j());
        }
        if (q()) {
            bVar.C(5, k());
        }
        if (m()) {
            bVar.r(6, g());
        }
    }

    public int f() {
        return this.f2104b;
    }

    public int g() {
        return this.f2114l;
    }

    public d1.a h() {
        return this.f2106d;
    }

    public d1.a i() {
        return this.f2108f;
    }

    public int j() {
        return this.f2110h;
    }

    public long k() {
        return this.f2112j;
    }

    public boolean l() {
        return this.f2103a;
    }

    public boolean m() {
        return this.f2113k;
    }

    public boolean n() {
        return this.f2105c;
    }

    public boolean o() {
        return this.f2107e;
    }

    public boolean p() {
        return this.f2109g;
    }

    public boolean q() {
        return this.f2111i;
    }

    public a r(int i2) {
        this.f2103a = true;
        this.f2104b = i2;
        return this;
    }

    public a s(int i2) {
        this.f2113k = true;
        this.f2114l = i2;
        return this;
    }

    public a t(d1.a aVar) {
        this.f2105c = true;
        this.f2106d = aVar;
        return this;
    }

    public a u(d1.a aVar) {
        this.f2107e = true;
        this.f2108f = aVar;
        return this;
    }

    public a v(int i2) {
        this.f2109g = true;
        this.f2110h = i2;
        return this;
    }

    public a w(long j2) {
        this.f2111i = true;
        this.f2112j = j2;
        return this;
    }
}
