package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f3512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f3513d = new ExecutorC0042a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f3514e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f3515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f3516b;

    /* JADX INFO: renamed from: p.a$a, reason: collision with other inner class name */
    static class ExecutorC0042a implements Executor {
        ExecutorC0042a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().c(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().a(runnable);
        }
    }

    private a() {
        p.b bVar = new p.b();
        this.f3516b = bVar;
        this.f3515a = bVar;
    }

    public static a d() {
        if (f3512c != null) {
            return f3512c;
        }
        synchronized (a.class) {
            if (f3512c == null) {
                f3512c = new a();
            }
        }
        return f3512c;
    }

    @Override // p.c
    public void a(Runnable runnable) {
        this.f3515a.a(runnable);
    }

    @Override // p.c
    public boolean b() {
        return this.f3515a.b();
    }

    @Override // p.c
    public void c(Runnable runnable) {
        this.f3515a.c(runnable);
    }
}
