package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FullLifecycleObserver f81a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82a;

        static {
            int[] iArr = new int[c.a.values().length];
            f82a = iArr;
            try {
                iArr[c.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82a[c.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82a[c.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82a[c.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82a[c.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82a[c.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82a[c.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void g(e eVar, c.a aVar) {
        switch (a.f82a[aVar.ordinal()]) {
            case 1:
                this.f81a.d(eVar);
                return;
            case 2:
                this.f81a.c(eVar);
                return;
            case 3:
                this.f81a.f(eVar);
                return;
            case 4:
                this.f81a.e(eVar);
                return;
            case 5:
                this.f81a.b(eVar);
                return;
            case 6:
                this.f81a.a(eVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
