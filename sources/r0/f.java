package r0;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f3594b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f3595c = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f3596a;

    public f() {
        b bVar = new b(f3595c);
        this.f3596a = bVar;
        bVar.d(0, f3595c, true);
    }

    public void a(b bVar, int i2, int i3, int i4) {
        b bVarM = this.f3596a.m(i2, i2 + i3);
        if (i4 == 0) {
            bVarM.f(bVar);
        } else if (i4 == 2) {
            bVarM.s(bVar);
        } else if (i4 != 3) {
            bVarM.n(bVar);
        } else {
            bVarM.k(bVar);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            this.f3596a.e(i2 + i5, bVarM.o(i5));
        }
    }

    public byte[] b() {
        return this.f3596a.g();
    }
}
