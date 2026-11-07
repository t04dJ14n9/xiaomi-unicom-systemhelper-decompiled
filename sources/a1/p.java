package a1;

/* JADX INFO: loaded from: classes.dex */
class p implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f72a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f73b;

    p(b bVar, String str) {
        this.f73b = bVar;
        this.f72a = str;
    }

    @Override // a1.g.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
        this.f73b.j(str, this.f72a);
    }
}
