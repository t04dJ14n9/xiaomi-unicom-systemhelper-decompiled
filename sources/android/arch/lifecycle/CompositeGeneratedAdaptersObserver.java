package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f80a;

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void g(e eVar, c.a aVar) {
        h hVar = new h();
        for (b bVar : this.f80a) {
            bVar.a(eVar, aVar, false, hVar);
        }
        for (b bVar2 : this.f80a) {
            bVar2.a(eVar, aVar, true, hVar);
        }
    }
}
