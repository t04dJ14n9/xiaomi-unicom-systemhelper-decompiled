package b1;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public int A;
    public int B;
    public boolean C;
    public a D;
    public String E;
    public int F;
    public String G;
    public String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2016q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2017r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2018s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2019t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2020u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f2021v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f2023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2024y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2025z;

    public enum a {
        SPEED_IN_FIRST_LOC,
        ACCURACY_IN_FIRST_LOC
    }

    public enum b {
        Hight_Accuracy,
        Battery_Saving,
        Device_Sensors,
        Fuzzy_Locating
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2034a;

        static {
            int[] iArr = new int[b.values().length];
            f2034a = iArr;
            try {
                iArr[b.Hight_Accuracy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2034a[b.Battery_Saving.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2034a[b.Device_Sensors.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2034a[b.Fuzzy_Locating.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h() {
        this.f2000a = "gcj02";
        this.f2001b = "noaddr";
        this.f2002c = false;
        this.f2003d = 0;
        this.f2004e = 12000;
        this.f2005f = "SDK6.0";
        this.f2006g = 1;
        this.f2007h = false;
        this.f2008i = true;
        this.f2009j = false;
        this.f2010k = "com.baidu.location.service_v2.9";
        this.f2011l = true;
        this.f2012m = true;
        this.f2013n = false;
        this.f2014o = false;
        this.f2015p = false;
        this.f2016q = false;
        this.f2017r = false;
        this.f2018s = false;
        this.f2019t = true;
        this.f2020u = false;
        this.f2022w = 0;
        this.f2023x = 0.5f;
        this.f2024y = 0;
        this.f2025z = 0;
        this.A = Integer.MAX_VALUE;
        this.B = 1;
        this.C = false;
        this.D = a.SPEED_IN_FIRST_LOC;
        this.E = null;
        this.F = -1;
        this.G = null;
        this.H = null;
    }

    public h(h hVar) {
        this.f2000a = "gcj02";
        this.f2001b = "noaddr";
        this.f2002c = false;
        this.f2003d = 0;
        this.f2004e = 12000;
        this.f2005f = "SDK6.0";
        this.f2006g = 1;
        this.f2007h = false;
        this.f2008i = true;
        this.f2009j = false;
        this.f2010k = "com.baidu.location.service_v2.9";
        this.f2011l = true;
        this.f2012m = true;
        this.f2013n = false;
        this.f2014o = false;
        this.f2015p = false;
        this.f2016q = false;
        this.f2017r = false;
        this.f2018s = false;
        this.f2019t = true;
        this.f2020u = false;
        this.f2022w = 0;
        this.f2023x = 0.5f;
        this.f2024y = 0;
        this.f2025z = 0;
        this.A = Integer.MAX_VALUE;
        this.B = 1;
        this.C = false;
        this.D = a.SPEED_IN_FIRST_LOC;
        this.E = null;
        this.F = -1;
        this.G = null;
        this.H = null;
        this.f2000a = hVar.f2000a;
        this.f2001b = hVar.f2001b;
        this.f2002c = hVar.f2002c;
        this.f2003d = hVar.f2003d;
        this.f2004e = hVar.f2004e;
        this.f2005f = hVar.f2005f;
        this.f2006g = hVar.f2006g;
        this.f2007h = hVar.f2007h;
        this.f2010k = hVar.f2010k;
        this.f2008i = hVar.f2008i;
        this.f2011l = hVar.f2011l;
        this.f2012m = hVar.f2012m;
        this.f2009j = hVar.f2009j;
        this.f2021v = hVar.f2021v;
        this.f2014o = hVar.f2014o;
        this.f2015p = hVar.f2015p;
        this.f2016q = hVar.f2016q;
        this.f2017r = hVar.f2017r;
        this.f2013n = hVar.f2013n;
        this.f2018s = hVar.f2018s;
        this.f2022w = hVar.f2022w;
        this.f2023x = hVar.f2023x;
        this.f2024y = hVar.f2024y;
        this.f2025z = hVar.f2025z;
        this.A = hVar.A;
        this.f2019t = hVar.f2019t;
        this.f2020u = hVar.f2020u;
        this.B = hVar.B;
        this.C = hVar.C;
        this.D = hVar.D;
        this.E = hVar.E;
        this.F = hVar.F;
        this.G = hVar.G;
        this.H = hVar.H;
    }

    public float a() {
        return this.f2023x;
    }

    public int b() {
        return this.f2022w;
    }

    public String c() {
        return this.f2001b;
    }

    public int d() {
        return this.f2025z;
    }

    public int e() {
        return this.f2024y;
    }

    public String f() {
        return this.f2000a;
    }

    public int g() {
        return this.f2003d;
    }

    public boolean h() {
        return this.f2008i;
    }

    public boolean i() {
        return this.f2020u;
    }

    public boolean j(h hVar) {
        return this.f2000a.equals(hVar.f2000a) && this.f2001b.equals(hVar.f2001b) && this.f2002c == hVar.f2002c && this.f2003d == hVar.f2003d && this.f2004e == hVar.f2004e && this.f2005f.equals(hVar.f2005f) && this.f2007h == hVar.f2007h && this.f2006g == hVar.f2006g && this.f2008i == hVar.f2008i && this.f2011l == hVar.f2011l && this.f2019t == hVar.f2019t && this.f2012m == hVar.f2012m && this.f2014o == hVar.f2014o && this.f2015p == hVar.f2015p && this.f2016q == hVar.f2016q && this.f2017r == hVar.f2017r && this.f2013n == hVar.f2013n && this.f2022w == hVar.f2022w && this.f2023x == hVar.f2023x && this.f2024y == hVar.f2024y && this.f2025z == hVar.f2025z && this.A == hVar.A && this.f2020u == hVar.f2020u && this.B == hVar.B && this.C == hVar.C && this.f2018s == hVar.f2018s && this.f2021v == hVar.f2021v && this.f2009j == hVar.f2009j && this.D == hVar.D;
    }

    public void k(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("gcj02") || lowerCase.equals("bd09") || lowerCase.equals("bd09ll")) {
            this.f2000a = lowerCase;
        }
    }

    public void l(boolean z2) {
        this.f2001b = z2 ? "all" : "noaddr";
    }

    public void m(boolean z2) {
        this.f2018s = z2;
    }

    public void n(b bVar) {
        int i2 = c.f2034a[bVar.ordinal()];
        if (i2 == 1) {
            this.f2002c = true;
            this.f2006g = 1;
        } else if (i2 == 2) {
            this.f2002c = false;
            this.f2006g = 3;
        } else if (i2 == 3) {
            this.f2006g = 2;
            this.f2002c = true;
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("Illegal this mode : " + bVar);
            }
            this.f2006g = 4;
            this.f2002c = false;
        }
        this.f2021v = bVar;
    }

    public void o(boolean z2) {
        this.f2007h = z2;
    }

    public void p(boolean z2) {
        this.f2002c = z2;
    }

    public void q(int i2) {
        if (i2 >= 0) {
            this.f2003d = i2;
        }
    }
}
