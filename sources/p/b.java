package p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3517a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f3518b = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Handler f3519c;

    @Override // p.c
    public void a(Runnable runnable) {
        this.f3518b.execute(runnable);
    }

    @Override // p.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p.c
    public void c(Runnable runnable) {
        if (this.f3519c == null) {
            synchronized (this.f3517a) {
                if (this.f3519c == null) {
                    this.f3519c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f3519c.post(runnable);
    }
}
