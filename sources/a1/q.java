package a1;

/* JADX INFO: loaded from: classes.dex */
class q implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f74a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f75b;

    q(b bVar, String str) {
        this.f75b = bVar;
        this.f74a = str;
    }

    @Override // a1.i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
        this.f75b.j(str, this.f74a);
    }
}
