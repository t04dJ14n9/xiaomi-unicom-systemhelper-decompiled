package c1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2125a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2127c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2129e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2131g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2133i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2135k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2137m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2139o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2141q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2143s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2145u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2126b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2128d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2130f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2132h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2134j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2136l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2138n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2140p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2142r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2144t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2146v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f2147w = -1;

    public boolean A() {
        return this.f2145u;
    }

    public d B(int i2) {
        this.f2133i = true;
        this.f2134j = i2;
        return this;
    }

    public d C(int i2) {
        this.f2125a = true;
        this.f2126b = i2;
        return this;
    }

    public d D(int i2) {
        this.f2143s = true;
        this.f2144t = i2;
        return this;
    }

    public d E(int i2) {
        this.f2131g = true;
        this.f2132h = i2;
        return this;
    }

    public d F(int i2) {
        this.f2127c = true;
        this.f2128d = i2;
        return this;
    }

    public d G(int i2) {
        this.f2137m = true;
        this.f2138n = i2;
        return this;
    }

    public d H(int i2) {
        this.f2139o = true;
        this.f2140p = i2;
        return this;
    }

    public d I(int i2) {
        this.f2135k = true;
        this.f2136l = i2;
        return this;
    }

    public d J(int i2) {
        this.f2141q = true;
        this.f2142r = i2;
        return this;
    }

    public d K(int i2) {
        this.f2129e = true;
        this.f2130f = i2;
        return this;
    }

    public d L(int i2) {
        this.f2145u = true;
        this.f2146v = i2;
        return this;
    }

    @Override // d1.c
    public int a() {
        if (this.f2147w < 0) {
            b();
        }
        return this.f2147w;
    }

    @Override // d1.c
    public int b() {
        int iD = r() ? 0 + d1.b.d(1, g()) : 0;
        if (u()) {
            iD += d1.b.d(2, j());
        }
        if (z()) {
            iD += d1.b.d(3, o());
        }
        if (t()) {
            iD += d1.b.d(4, i());
        }
        if (q()) {
            iD += d1.b.d(5, f());
        }
        if (x()) {
            iD += d1.b.d(6, m());
        }
        if (v()) {
            iD += d1.b.d(7, k());
        }
        if (w()) {
            iD += d1.b.d(8, l());
        }
        if (y()) {
            iD += d1.b.d(9, n());
        }
        if (s()) {
            iD += d1.b.d(10, h());
        }
        if (A()) {
            iD += d1.b.d(11, p());
        }
        this.f2147w = iD;
        return iD;
    }

    @Override // d1.c
    public void e(d1.b bVar) throws IOException {
        if (r()) {
            bVar.r(1, g());
        }
        if (u()) {
            bVar.r(2, j());
        }
        if (z()) {
            bVar.r(3, o());
        }
        if (t()) {
            bVar.r(4, i());
        }
        if (q()) {
            bVar.r(5, f());
        }
        if (x()) {
            bVar.r(6, m());
        }
        if (v()) {
            bVar.r(7, k());
        }
        if (w()) {
            bVar.r(8, l());
        }
        if (y()) {
            bVar.r(9, n());
        }
        if (s()) {
            bVar.r(10, h());
        }
        if (A()) {
            bVar.r(11, p());
        }
    }

    public int f() {
        return this.f2134j;
    }

    public int g() {
        return this.f2126b;
    }

    public int h() {
        return this.f2144t;
    }

    public int i() {
        return this.f2132h;
    }

    public int j() {
        return this.f2128d;
    }

    public int k() {
        return this.f2138n;
    }

    public int l() {
        return this.f2140p;
    }

    public int m() {
        return this.f2136l;
    }

    public int n() {
        return this.f2142r;
    }

    public int o() {
        return this.f2130f;
    }

    public int p() {
        return this.f2146v;
    }

    public boolean q() {
        return this.f2133i;
    }

    public boolean r() {
        return this.f2125a;
    }

    public boolean s() {
        return this.f2143s;
    }

    public boolean t() {
        return this.f2131g;
    }

    public boolean u() {
        return this.f2127c;
    }

    public boolean v() {
        return this.f2137m;
    }

    public boolean w() {
        return this.f2139o;
    }

    public boolean x() {
        return this.f2135k;
    }

    public boolean y() {
        return this.f2141q;
    }

    public boolean z() {
        return this.f2129e;
    }
}
