package a1;

/* JADX INFO: loaded from: classes.dex */
class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f42b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f43c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f44d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f45e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f46f;

    h(g gVar, String str, int i2, String str2, String str3) {
        this.f46f = gVar;
        this.f42b = str;
        this.f43c = i2;
        this.f44d = str2;
        this.f45e = str3;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        d.b("postWithHttps start Thread id = " + String.valueOf(Thread.currentThread().getId()));
        this.f46f.d(new k(this.f46f.f39a).d(this.f46f.f40b, this.f42b, this.f43c, this.f44d, this.f45e));
    }
}
