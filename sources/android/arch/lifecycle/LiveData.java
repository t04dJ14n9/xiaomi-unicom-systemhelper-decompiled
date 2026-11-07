package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f83j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f84a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q.b<j<T>, LiveData<T>.b> f85b = new q.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f86c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Object f87d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f88e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f89f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f90g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f91h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f92i;

    class LifecycleBoundObserver extends LiveData<T>.b implements GenericLifecycleObserver {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e f93d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ LiveData f94e;

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        public void g(e eVar, c.a aVar) {
            if (this.f93d.a().a() == c.b.DESTROYED) {
                this.f94e.m(null);
            } else {
                h(j());
            }
        }

        @Override // android.arch.lifecycle.LiveData.b
        void i() {
            this.f93d.a().b(this);
        }

        @Override // android.arch.lifecycle.LiveData.b
        boolean j() {
            return this.f93d.a().a().a(c.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f84a) {
                obj = LiveData.this.f88e;
                LiveData.this.f88e = LiveData.f83j;
            }
            LiveData.this.n(obj);
        }
    }

    private abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f96a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f97b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LiveData f98c;

        void h(boolean z2) {
            if (z2 == this.f96a) {
                return;
            }
            this.f96a = z2;
            boolean z3 = this.f98c.f86c == 0;
            this.f98c.f86c += this.f96a ? 1 : -1;
            if (z3 && this.f96a) {
                this.f98c.k();
            }
            if (this.f98c.f86c == 0 && !this.f96a) {
                this.f98c.l();
            }
            if (this.f96a) {
                this.f98c.j(this);
            }
        }

        void i() {
        }

        abstract boolean j();
    }

    public LiveData() {
        Object obj = f83j;
        this.f87d = obj;
        this.f88e = obj;
        this.f89f = -1;
        this.f92i = new a();
    }

    private static void h(String str) {
        if (p.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void i(LiveData<T>.b bVar) {
        if (bVar.f96a) {
            if (!bVar.j()) {
                bVar.h(false);
                return;
            }
            int i2 = bVar.f97b;
            int i3 = this.f89f;
            if (i2 >= i3) {
                return;
            }
            bVar.f97b = i3;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(LiveData<T>.b bVar) {
        if (this.f90g) {
            this.f91h = true;
            return;
        }
        this.f90g = true;
        do {
            this.f91h = false;
            if (bVar != null) {
                i(bVar);
                bVar = null;
            } else {
                q.b<j<T>, LiveData<T>.b>.e eVarD = this.f85b.d();
                while (eVarD.hasNext()) {
                    i((b) eVarD.next().getValue());
                    if (this.f91h) {
                        break;
                    }
                }
            }
        } while (this.f91h);
        this.f90g = false;
    }

    protected void k() {
    }

    protected void l() {
    }

    public void m(j<T> jVar) {
        h("removeObserver");
        LiveData<T>.b bVarF = this.f85b.f(jVar);
        if (bVarF == null) {
            return;
        }
        bVarF.i();
        bVarF.h(false);
    }

    protected void n(T t2) {
        h("setValue");
        this.f89f++;
        this.f87d = t2;
        j(null);
    }
}
