package a1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
class r extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Handler f76b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f77c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f78d;

    r(String str) {
        super(str);
        this.f76b = null;
        this.f77c = new Object();
        this.f78d = false;
    }

    public void a() {
        if (d.f36a) {
            d.b("Looper thread quit()");
        }
        Handler handler = this.f76b;
        if (handler == null || handler.getLooper() == null) {
            return;
        }
        this.f76b.getLooper().quit();
    }

    public void b() {
        synchronized (this.f77c) {
            try {
                if (!this.f78d) {
                    this.f77c.wait();
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void c() {
        synchronized (this.f77c) {
            this.f78d = true;
            this.f77c.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f76b = new Handler();
        if (d.f36a) {
            d.b("new Handler() finish!!");
        }
        Looper.loop();
        if (d.f36a) {
            d.b("LooperThread run() thread id:" + String.valueOf(Thread.currentThread().getId()));
        }
    }
}
