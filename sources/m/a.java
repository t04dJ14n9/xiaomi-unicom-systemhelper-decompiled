package m;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import b.c;
import b.g;
import b.l;
import b.o;
import b.v;
import b.w;
import b.y;
import b.z;
import b1.f;
import c.e;
import d.i;
import i.d;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class a extends Service implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f3265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f3266i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Messenger f3267b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Looper f3268c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HandlerThread f3269d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3270e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3271f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3272g = true;

    /* JADX INFO: renamed from: m.a$a, reason: collision with other inner class name */
    public class RunnableC0038a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WeakReference f3273b;

        public RunnableC0038a(a aVar, WeakReference weakReference) {
            this.f3273b = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = (a) this.f3273b.get();
            if (aVar == null || aVar.f3271f != 3) {
                return;
            }
            Log.d("baidu_location_service", "baidu location service force stopped ...");
            aVar.f3272g = false;
            aVar.p();
        }
    }

    public static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f3274a;

        public b(Looper looper, a aVar) {
            super(looper);
            this.f3274a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f3274a.get();
            if (aVar == null) {
                return;
            }
            if (com.baidu.location.f.f2179f) {
                int i2 = message.what;
                if (i2 == 11) {
                    aVar.i(message);
                } else if (i2 == 12) {
                    aVar.m(message);
                } else if (i2 == 15) {
                    aVar.e(message);
                } else if (i2 == 22) {
                    o.M().I(message);
                } else if (i2 == 28) {
                    o.M().i(true, true);
                } else if (i2 == 41) {
                    o.M().T();
                } else if (i2 == 114) {
                    Object obj = message.obj;
                    if (obj != null) {
                        i.I().w((Bundle) obj);
                    }
                } else if (i2 == 401) {
                    try {
                        message.getData();
                    } catch (Exception unused) {
                    }
                } else if (i2 == 406) {
                    l.h().j();
                } else if (i2 != 705) {
                    switch (i2) {
                        case 110:
                            i.I().f0();
                            break;
                        case 111:
                            i.I().g0();
                            break;
                        case 112:
                            i.I().m();
                            break;
                    }
                } else {
                    c.r().g(message.getData().getBoolean("foreground"));
                }
            }
            if (message.what == 1) {
                aVar.p();
            }
            if (message.what == 0) {
                aVar.l();
            }
            super.handleMessage(message);
        }
    }

    public static long d() {
        return f3266i;
    }

    public static Handler h() {
        return f3265h;
    }

    @Override // b1.f
    public void a(Context context) {
        b.b.a().b(context);
        a1.b.B(com.baidu.location.f.c()).J(true);
        try {
            n.i.f3432o0 = context.getPackageName();
        } catch (Exception unused) {
        }
        f3266i = System.currentTimeMillis();
        HandlerThread handlerThreadA = v.a();
        this.f3269d = handlerThreadA;
        if (handlerThreadA != null) {
            this.f3268c = handlerThreadA.getLooper();
        }
        f3265h = this.f3268c == null ? new b(Looper.getMainLooper(), this) : new b(this.f3268c, this);
        System.currentTimeMillis();
        this.f3267b = new Messenger(f3265h);
        f3265h.sendEmptyMessage(0);
        this.f3271f = 1;
    }

    @Override // b1.f
    public double b() {
        return 9.520999908447266d;
    }

    public final void e(Message message) {
        c.r().h(message);
    }

    public final void i(Message message) {
        c.r().p(message);
        d.n();
        c.d.i().m();
    }

    public final void l() {
        c.d.i().r();
        n.b.g();
        b.f.k().d(com.baidu.location.f.c());
        b.d.s().m(false);
        b.d.s().r();
        try {
            z.b().e();
        } catch (Exception unused) {
        }
        l.h().m();
        j.d.l0().j();
        j.f.M().V();
        j.f.M().r(com.baidu.location.f.c());
        o.M().U();
        i.a.p().r();
        c.c.b().i();
        e.a().e();
        c.a.g().i();
        this.f3271f = 2;
    }

    public final void m(Message message) {
        c.r().s(message);
    }

    @Override // android.app.Service, b1.f
    public IBinder onBind(Intent intent) {
        boolean z2;
        String string;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            n.b.f3347i = extras.getString("key");
            n.b.f3346h = extras.getString("sign");
            this.f3270e = extras.getBoolean("kill_process");
            z2 = extras.getBoolean("cache_exception");
            string = extras.getString("auth_key");
            n.i.Q0 = extras.getString("proxyHost");
            n.i.R0 = extras.getInt("proxyPort");
            n.i.S0 = extras.getString("username");
            n.i.T0 = extras.getString("password");
        } else {
            z2 = false;
            string = null;
        }
        if (string != null) {
            a.a.e().c(com.baidu.location.f.c(), string);
        }
        if (!TextUtils.isEmpty(n.i.Q0) && n.i.R0 != -1) {
            a1.b.B(com.baidu.location.f.c()).K(n.i.Q0, n.i.R0);
        }
        if (!TextUtils.isEmpty(n.i.S0) && !TextUtils.isEmpty(n.i.T0)) {
            a1.b.B(com.baidu.location.f.c()).H(n.i.S0, n.i.T0);
        }
        a.a.e().g(com.baidu.location.f.c());
        if (!z2) {
            Thread.setDefaultUncaughtExceptionHandler(e.a());
        }
        return this.f3267b.getBinder();
    }

    @Override // android.app.Service, b1.f
    public void onDestroy() {
        try {
            f3265h.sendEmptyMessage(1);
        } catch (Exception unused) {
            Log.d("baidu_location_service", "baidu location service stop exception...");
            this.f3272g = false;
            p();
            Process.killProcess(Process.myPid());
        }
        this.f3271f = 3;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0038a(this, new WeakReference(this)), 1000L);
    }

    @Override // android.app.Service, b1.f
    public int onStartCommand(Intent intent, int i2, int i3) {
        return 2;
    }

    @Override // android.app.Service, b1.f
    public void onTaskRemoved(Intent intent) {
        Log.d("baidu_location_service", "baidu location service remove task...");
    }

    public final void p() {
        j.d.l0().F();
        if (this.f3272g) {
            d.n().k();
        }
        z.b().f();
        c.d.i().s();
        c.c.b().j();
        c.b.d().l();
        c.a.g().j();
        g.a().c();
        j.f.M().d0();
        o.M().V();
        i.I().g0();
        l.h().n();
        if (this.f3272g) {
            y.c();
        }
        c.r().m();
        try {
            w.b().d();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f3271f = 4;
        if (this.f3270e) {
            return;
        }
        Process.killProcess(Process.myPid());
    }
}
