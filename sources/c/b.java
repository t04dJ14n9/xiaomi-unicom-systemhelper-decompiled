package c;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import b.o;
import n.i;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f2058g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2059a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f2060b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlarmManager f2061c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0018b f2062d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PendingIntent f2063e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2064f = 0;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 == 1) {
                    b.this.j();
                } else if (i2 != 2) {
                } else {
                    b.this.b();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    public class C0018b extends BroadcastReceiver {
        public C0018b() {
        }

        public /* synthetic */ C0018b(b bVar, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (b.this.f2059a && intent.getAction().equals("com.baidu.location.autonotifyloc_9.5.2.1") && b.this.f2060b != null) {
                b.this.f2063e = null;
                b.this.f2060b.sendEmptyMessage(1);
            }
        }
    }

    public static synchronized b d() {
        if (f2058g == null) {
            f2058g = new b();
        }
        return f2058g;
    }

    public final void b() {
        if (this.f2059a) {
            try {
                PendingIntent pendingIntent = this.f2063e;
                if (pendingIntent != null) {
                    this.f2061c.cancel(pendingIntent);
                    this.f2063e = null;
                }
                com.baidu.location.f.c().unregisterReceiver(this.f2062d);
            } catch (Exception unused) {
            }
            this.f2061c = null;
            this.f2062d = null;
            this.f2060b = null;
            this.f2059a = false;
        }
    }

    public void f() {
        Handler handler;
        if (this.f2059a && (handler = this.f2060b) != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public void i() {
        Handler handler;
        if (this.f2059a && (handler = this.f2060b) != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.f2064f < 1000) {
            return;
        }
        PendingIntent pendingIntent = this.f2063e;
        if (pendingIntent != null) {
            this.f2061c.cancel(pendingIntent);
            this.f2063e = null;
        }
        if (this.f2063e == null) {
            this.f2063e = PendingIntent.getBroadcast(com.baidu.location.f.c(), 0, new Intent("com.baidu.location.autonotifyloc_9.5.2.1"), 201326592);
            this.f2061c.set(0, System.currentTimeMillis() + ((long) i.T), this.f2063e);
        }
        Message message = new Message();
        message.what = 22;
        if (System.currentTimeMillis() - this.f2064f < i.U) {
            return;
        }
        this.f2064f = System.currentTimeMillis();
        if (j.d.l0().x0()) {
            return;
        }
        o.M().I(message);
    }

    public void k() {
        if (!this.f2059a && i.T >= 10000) {
            if (this.f2060b == null) {
                this.f2060b = new a();
            }
            this.f2061c = (AlarmManager) com.baidu.location.f.c().getSystemService("alarm");
            this.f2062d = new C0018b(this, null);
            com.baidu.location.f.c().registerReceiver(this.f2062d, new IntentFilter("com.baidu.location.autonotifyloc_9.5.2.1"), "android.permission.ACCESS_FINE_LOCATION", null);
            this.f2063e = PendingIntent.getBroadcast(com.baidu.location.f.c(), 0, new Intent("com.baidu.location.autonotifyloc_9.5.2.1"), 201326592);
            this.f2061c.set(0, System.currentTimeMillis() + ((long) i.T), this.f2063e);
            this.f2059a = true;
            this.f2064f = System.currentTimeMillis();
        }
    }

    public void l() {
        Handler handler;
        if (this.f2059a && (handler = this.f2060b) != null) {
            handler.sendEmptyMessage(2);
        }
    }
}
