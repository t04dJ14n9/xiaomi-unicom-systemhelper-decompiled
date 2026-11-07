package w;

/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3979m;

    public g(p pVar) {
        super(pVar);
        this.f3962e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // w.f
    public void d(int i2) {
        if (this.f3967j) {
            return;
        }
        this.f3967j = true;
        this.f3964g = i2;
        for (d dVar : this.f3968k) {
            dVar.a(dVar);
        }
    }
}
