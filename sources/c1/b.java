package c1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2116a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2118c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2120e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f2117b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f2119d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f2121f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2122g = -1;

    @Override // d1.c
    public int a() {
        if (this.f2122g < 0) {
            b();
        }
        return this.f2122g;
    }

    @Override // d1.c
    public int b() {
        int iF = l() ? 0 + d1.b.f(1, i()) : 0;
        if (m()) {
            iF += d1.b.f(2, j());
        }
        if (n()) {
            iF += d1.b.f(3, k());
        }
        this.f2122g = iF;
        return iF;
    }

    @Override // d1.c
    public void e(d1.b bVar) throws IOException {
        if (l()) {
            bVar.t(1, i());
        }
        if (m()) {
            bVar.t(2, j());
        }
        if (n()) {
            bVar.t(3, k());
        }
    }

    public b f() {
        this.f2116a = false;
        this.f2117b = null;
        return this;
    }

    public b g() {
        this.f2118c = false;
        this.f2119d = null;
        return this;
    }

    public b h() {
        this.f2120e = false;
        this.f2121f = null;
        return this;
    }

    public a i() {
        return this.f2117b;
    }

    public d j() {
        return this.f2119d;
    }

    public e k() {
        return this.f2121f;
    }

    public boolean l() {
        return this.f2116a;
    }

    public boolean m() {
        return this.f2118c;
    }

    public boolean n() {
        return this.f2120e;
    }

    public b o(a aVar) {
        if (aVar == null) {
            return f();
        }
        this.f2116a = true;
        this.f2117b = aVar;
        return this;
    }

    public b p(d dVar) {
        if (dVar == null) {
            return g();
        }
        this.f2118c = true;
        this.f2119d = dVar;
        return this;
    }

    public b q(e eVar) {
        if (eVar == null) {
            return h();
        }
        this.f2120e = true;
        this.f2121f = eVar;
        return this;
    }
}
