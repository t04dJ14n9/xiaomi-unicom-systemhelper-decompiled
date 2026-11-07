package c1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2148a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2150c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2152e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2154g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2156i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2158k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2160m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2162o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2164q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2166s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2149b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2151d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2153f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2155h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2157j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2159l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2161n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2163p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2165r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2167t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2168u = -1;

    public e A(int i2) {
        this.f2162o = true;
        this.f2163p = i2;
        return this;
    }

    public e B(int i2) {
        this.f2164q = true;
        this.f2165r = i2;
        return this;
    }

    public e C(int i2) {
        this.f2166s = true;
        this.f2167t = i2;
        return this;
    }

    public e D(int i2) {
        this.f2154g = true;
        this.f2155h = i2;
        return this;
    }

    public e E(int i2) {
        this.f2150c = true;
        this.f2151d = i2;
        return this;
    }

    public e F(int i2) {
        this.f2156i = true;
        this.f2157j = i2;
        return this;
    }

    public e G(int i2) {
        this.f2158k = true;
        this.f2159l = i2;
        return this;
    }

    public e H(int i2) {
        this.f2160m = true;
        this.f2161n = i2;
        return this;
    }

    public e I(int i2) {
        this.f2152e = true;
        this.f2153f = i2;
        return this;
    }

    @Override // d1.c
    public int a() {
        if (this.f2168u < 0) {
            b();
        }
        return this.f2168u;
    }

    @Override // d1.c
    public int b() {
        int iK = p() ? 0 + d1.b.k(1, f()) : 0;
        if (u()) {
            iK += d1.b.d(2, k());
        }
        if (y()) {
            iK += d1.b.d(3, o());
        }
        if (t()) {
            iK += d1.b.d(4, j());
        }
        if (v()) {
            iK += d1.b.d(5, l());
        }
        if (w()) {
            iK += d1.b.d(6, m());
        }
        if (x()) {
            iK += d1.b.d(7, n());
        }
        if (q()) {
            iK += d1.b.d(8, g());
        }
        if (r()) {
            iK += d1.b.d(9, h());
        }
        if (s()) {
            iK += d1.b.d(10, i());
        }
        this.f2168u = iK;
        return iK;
    }

    @Override // d1.c
    public void e(d1.b bVar) throws IOException {
        if (p()) {
            bVar.C(1, f());
        }
        if (u()) {
            bVar.r(2, k());
        }
        if (y()) {
            bVar.r(3, o());
        }
        if (t()) {
            bVar.r(4, j());
        }
        if (v()) {
            bVar.r(5, l());
        }
        if (w()) {
            bVar.r(6, m());
        }
        if (x()) {
            bVar.r(7, n());
        }
        if (q()) {
            bVar.r(8, g());
        }
        if (r()) {
            bVar.r(9, h());
        }
        if (s()) {
            bVar.r(10, i());
        }
    }

    public long f() {
        return this.f2149b;
    }

    public int g() {
        return this.f2163p;
    }

    public int h() {
        return this.f2165r;
    }

    public int i() {
        return this.f2167t;
    }

    public int j() {
        return this.f2155h;
    }

    public int k() {
        return this.f2151d;
    }

    public int l() {
        return this.f2157j;
    }

    public int m() {
        return this.f2159l;
    }

    public int n() {
        return this.f2161n;
    }

    public int o() {
        return this.f2153f;
    }

    public boolean p() {
        return this.f2148a;
    }

    public boolean q() {
        return this.f2162o;
    }

    public boolean r() {
        return this.f2164q;
    }

    public boolean s() {
        return this.f2166s;
    }

    public boolean t() {
        return this.f2154g;
    }

    public boolean u() {
        return this.f2150c;
    }

    public boolean v() {
        return this.f2156i;
    }

    public boolean w() {
        return this.f2158k;
    }

    public boolean x() {
        return this.f2160m;
    }

    public boolean y() {
        return this.f2152e;
    }

    public e z(long j2) {
        this.f2148a = true;
        this.f2149b = j2;
        return this;
    }
}
