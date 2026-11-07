package t0;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f3709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f3710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte[] f3711c;

    f(b bVar) {
        this.f3709a = bVar;
        this.f3710b = bVar.a();
    }

    abstract void a();

    abstract void b(boolean z2, String str, byte[] bArr, byte[] bArr2);

    abstract void c(byte[] bArr, int i2, int i3, byte[] bArr2, int i4);

    abstract void d();

    abstract void e(byte[] bArr, int i2, int i3, byte[] bArr2, int i4);

    abstract void f();

    void g(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        c(bArr, i2, i3, bArr2, i4);
    }

    void h(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        e(bArr, i2, i3, bArr2, i4);
    }
}
