package d0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f2401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f2402c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f2406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f2407h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2400a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler.Callback f2404e = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2403d = 0;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c.this.a();
                return true;
            }
            if (i2 != 1) {
                return true;
            }
            c.this.b((Runnable) message.obj);
            return true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f2409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Handler f2410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f2411d;

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f2413b;

            a(Object obj) {
                this.f2413b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2411d.a(this.f2413b);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f2409b = callable;
            this.f2410c = handler;
            this.f2411d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f2409b.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f2410c.post(new a(objCall));
        }
    }

    /* JADX INFO: renamed from: d0.c$c, reason: collision with other inner class name */
    class RunnableC0023c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f2415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callable f2416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f2417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f2418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Condition f2419f;

        RunnableC0023c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f2415b = atomicReference;
            this.f2416c = callable;
            this.f2417d = reentrantLock;
            this.f2418e = atomicBoolean;
            this.f2419f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2415b.set(this.f2416c.call());
            } catch (Exception unused) {
            }
            this.f2417d.lock();
            try {
                this.f2418e.set(false);
                this.f2419f.signal();
            } finally {
                this.f2417d.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t2);
    }

    public c(String str, int i2, int i3) {
        this.f2407h = str;
        this.f2406g = i2;
        this.f2405f = i3;
    }

    private void c(Runnable runnable) {
        synchronized (this.f2400a) {
            if (this.f2401b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f2407h, this.f2406g);
                this.f2401b = handlerThread;
                handlerThread.start();
                this.f2402c = new Handler(this.f2401b.getLooper(), this.f2404e);
                this.f2403d++;
            }
            this.f2402c.removeMessages(0);
            Handler handler = this.f2402c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    void a() {
        synchronized (this.f2400a) {
            if (this.f2402c.hasMessages(1)) {
                return;
            }
            this.f2401b.quit();
            this.f2401b = null;
            this.f2402c = null;
        }
    }

    void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f2400a) {
            this.f2402c.removeMessages(0);
            Handler handler = this.f2402c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f2405f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        c(new RunnableC0023c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t2 = (T) atomicReference.get();
                reentrantLock.unlock();
                return t2;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t3 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t3;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
