package u;

/* JADX INFO: loaded from: classes.dex */
class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f3762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3763b;

    g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3762a = new Object[i2];
    }

    @Override // u.f
    public void a(T[] tArr, int i2) {
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            T t2 = tArr[i3];
            int i4 = this.f3763b;
            Object[] objArr = this.f3762a;
            if (i4 < objArr.length) {
                objArr[i4] = t2;
                this.f3763b = i4 + 1;
            }
        }
    }

    @Override // u.f
    public boolean b(T t2) {
        int i2 = this.f3763b;
        Object[] objArr = this.f3762a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t2;
        this.f3763b = i2 + 1;
        return true;
    }

    @Override // u.f
    public T c() {
        int i2 = this.f3763b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f3762a;
        T t2 = (T) objArr[i3];
        objArr[i3] = null;
        this.f3763b = i2 - 1;
        return t2;
    }
}
