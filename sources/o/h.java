package o;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3497a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f3498b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f3499c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f3500d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f3501e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f3502f = -1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3503a;

        static {
            int[] iArr = new int[c.values().length];
            f3503a = iArr;
            try {
                iArr[c.SUBWAY_STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3503a[c.TRAFFIC_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3503a[c.VDR_INDOOR_SPEED_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3503a[c.INDOOR_POI_DATA_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3503a[c.OUTDOOR_POI_DATA_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3503a[c.GPS_CHECKER_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f3504a = new h(null);
    }

    public enum c {
        SUBWAY_STATIC,
        TRAFFIC_STATUS,
        VDR_INDOOR_SPEED_STATUS,
        INDOOR_POI_DATA_STATUS,
        OUTDOOR_POI_DATA_STATUS,
        GPS_CHECKER_STATUS
    }

    public h() {
    }

    public /* synthetic */ h(g gVar) {
        this();
    }

    public static h b() {
        return b.f3504a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String a(c cVar) {
        switch (a.f3503a[cVar.ordinal()]) {
            case 1:
                if (f3497a == 0) {
                    return e.f3495a;
                }
                return null;
            case 2:
                if (f3498b == 0) {
                    return f.f3496a;
                }
                return null;
            case 3:
                if (f3499c == 0) {
                    return o.c.f3492a;
                }
                return null;
            case 4:
                if (f3500d == 0) {
                    return o.b.f3491b;
                }
                return null;
            case 5:
                if (f3501e == 0) {
                    return d.f3494b;
                }
                return null;
            case 6:
                if (f3502f == 0) {
                    return o.a.f3489a;
                }
                return null;
            default:
                return null;
        }
    }
}
