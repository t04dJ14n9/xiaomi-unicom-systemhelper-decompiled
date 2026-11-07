package j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f2898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2904o;

    public a() {
        this.f2890a = -1;
        this.f2891b = -1L;
        this.f2892c = -1;
        this.f2893d = -1;
        this.f2894e = Integer.MAX_VALUE;
        this.f2895f = Integer.MAX_VALUE;
        this.f2896g = 0L;
        this.f2897h = -1;
        this.f2898i = '0';
        this.f2899j = Integer.MAX_VALUE;
        this.f2900k = 0;
        this.f2901l = 0;
        this.f2902m = null;
        this.f2903n = null;
        this.f2904o = null;
        this.f2896g = System.currentTimeMillis();
    }

    public a(int i2, long j2, int i3, int i4, int i5, char c2, int i6) {
        this.f2894e = Integer.MAX_VALUE;
        this.f2895f = Integer.MAX_VALUE;
        this.f2896g = 0L;
        this.f2899j = Integer.MAX_VALUE;
        this.f2900k = 0;
        this.f2901l = 0;
        this.f2902m = null;
        this.f2903n = null;
        this.f2904o = null;
        this.f2890a = i2;
        this.f2891b = j2;
        this.f2892c = i3;
        this.f2893d = i4;
        this.f2897h = i5;
        this.f2898i = c2;
        this.f2896g = System.currentTimeMillis();
        this.f2899j = i6;
    }

    public a(a aVar) {
        this(aVar.f2890a, aVar.f2891b, aVar.f2892c, aVar.f2893d, aVar.f2897h, aVar.f2898i, aVar.f2899j);
        this.f2896g = aVar.f2896g;
        this.f2902m = aVar.f2902m;
        this.f2900k = aVar.f2900k;
        this.f2904o = aVar.f2904o;
        this.f2901l = aVar.f2901l;
        this.f2903n = aVar.f2903n;
    }

    public boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f2896g;
        return jCurrentTimeMillis > 0 && jCurrentTimeMillis < 3000;
    }

    public boolean b(a aVar) {
        if (this.f2890a != aVar.f2890a || this.f2891b != aVar.f2891b || this.f2893d != aVar.f2893d || this.f2892c != aVar.f2892c) {
            return false;
        }
        String str = this.f2903n;
        if (str == null || !str.equals(aVar.f2903n)) {
            return this.f2903n == null && aVar.f2903n == null;
        }
        return true;
    }

    public boolean c() {
        return this.f2890a == -1 && this.f2891b == -1 && this.f2893d == -1 && this.f2892c == -1;
    }

    public boolean d() {
        return this.f2890a > -1 && this.f2891b > -1 && this.f2893d == -1 && this.f2892c == -1;
    }

    public boolean e() {
        return this.f2890a > -1 && this.f2891b > -1 && this.f2893d > -1 && this.f2892c > -1;
    }

    public boolean f() {
        return this.f2890a > -1 && this.f2891b > 0;
    }
}
