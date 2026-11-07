package a1;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f66b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f67c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f68d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f69e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Hashtable f70f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f71g;

    o(b bVar, int i2, boolean z2, String str, String str2, Hashtable hashtable) {
        this.f71g = bVar;
        this.f66b = i2;
        this.f67c = z2;
        this.f68d = str;
        this.f69e = str2;
        this.f70f = hashtable;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.b("status = " + this.f66b + "; forced = " + this.f67c + "checkAK = " + this.f71g.t(this.f68d));
        int i2 = this.f66b;
        if (i2 != 601 && !this.f67c && i2 != -1 && !this.f71g.t(this.f68d)) {
            if (602 == this.f66b) {
                d.b("authenticate wait ");
                if (b.f22k != null) {
                    b.f22k.b();
                }
            } else {
                d.b("authenticate else");
            }
            this.f71g.j(null, this.f68d);
            return;
        }
        d.b("authenticate sendAuthRequest");
        String[] strArrF = f.f(b.f17f);
        if (strArrF == null || strArrF.length <= 1) {
            this.f71g.n(this.f67c, this.f69e, this.f70f, this.f68d, b.f18g, b.f19h, b.f20i, b.f21j);
            return;
        }
        d.b("authStrings.length:" + strArrF.length);
        d.b("more sha1 auth");
        this.f71g.o(this.f67c, this.f69e, this.f70f, strArrF, this.f68d, b.f18g, b.f19h, b.f20i, b.f21j);
    }
}
