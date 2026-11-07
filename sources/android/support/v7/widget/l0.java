package android.support.v7.widget;

/* JADX INFO: loaded from: classes.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1439a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1440b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1441c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1442d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1443e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1444f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1445g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1446h = false;

    l0() {
    }

    public int a() {
        return this.f1445g ? this.f1439a : this.f1440b;
    }

    public int b() {
        return this.f1439a;
    }

    public int c() {
        return this.f1440b;
    }

    public int d() {
        return this.f1445g ? this.f1440b : this.f1439a;
    }

    public void e(int i2, int i3) {
        this.f1446h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f1443e = i2;
            this.f1439a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1444f = i3;
            this.f1440b = i3;
        }
    }

    public void f(boolean z2) {
        int i2;
        if (z2 == this.f1445g) {
            return;
        }
        this.f1445g = z2;
        if (this.f1446h) {
            if (z2) {
                int i3 = this.f1442d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1443e;
                }
                this.f1439a = i3;
                i2 = this.f1441c;
                if (i2 == Integer.MIN_VALUE) {
                }
            } else {
                int i4 = this.f1441c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1443e;
                }
                this.f1439a = i4;
                i2 = this.f1442d;
                if (i2 == Integer.MIN_VALUE) {
                }
            }
            this.f1440b = i2;
        }
        this.f1439a = this.f1443e;
        i2 = this.f1444f;
        this.f1440b = i2;
    }

    public void g(int i2, int i3) {
        this.f1441c = i2;
        this.f1442d = i3;
        this.f1446h = true;
        if (this.f1445g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1439a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1440b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1439a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1440b = i3;
        }
    }
}
