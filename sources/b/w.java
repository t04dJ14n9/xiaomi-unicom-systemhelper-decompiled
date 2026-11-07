package b;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f1855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f1856b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static w f1857a = new w();
    }

    public w() {
        this.f1855a = null;
        this.f1856b = null;
    }

    public static w b() {
        return b.f1857a;
    }

    public synchronized ExecutorService a() {
        return this.f1855a;
    }

    public synchronized ExecutorService c() {
        return this.f1856b;
    }

    public void d() {
        ExecutorService executorService = this.f1855a;
        if (executorService != null) {
            executorService.shutdown();
        }
        ExecutorService executorService2 = this.f1856b;
        if (executorService2 != null) {
            executorService2.shutdown();
        }
    }
}
