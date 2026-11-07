package android.support.v7.app;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static e f876d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f879c;

    e() {
    }

    static e b() {
        if (f876d == null) {
            f876d = new e();
        }
        return f876d;
    }

    public void a(long j2, double d2, double d3) {
        float f2 = (j2 - 946728000000L) / 8.64E7f;
        float f3 = (0.01720197f * f2) + 6.24006f;
        double d4 = f3;
        double dSin = (Math.sin(d4) * 0.03341960161924362d) + d4 + (Math.sin(2.0f * f3) * 3.4906598739326E-4d) + (Math.sin(f3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f2 - 9.0E-4f)) - d5) + 9.0E-4f)) + d5 + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d2;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(dAsin))) / (Math.cos(d6) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f879c = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
                this.f877a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
                this.f878b = jRound;
                if (jRound >= j2 || this.f877a <= j2) {
                    this.f879c = 1;
                    return;
                } else {
                    this.f879c = 0;
                    return;
                }
            }
            this.f879c = 0;
        }
        this.f877a = -1L;
        this.f878b = -1L;
    }
}
