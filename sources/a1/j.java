package a1;

/* JADX INFO: loaded from: classes.dex */
class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f50b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f51c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f52d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f53e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f54f;

    j(i iVar, String str, int i2, String str2, String str3) {
        this.f54f = iVar;
        this.f50b = str;
        this.f51c = i2;
        this.f52d = str2;
        this.f53e = str3;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        i iVar = this.f54f;
        iVar.f(iVar.f48b, this.f50b, this.f51c, this.f52d, this.f53e);
    }
}
