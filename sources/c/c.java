package c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f2067e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2068a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2069b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f2070c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2071d = -1;

    public interface a {
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x0030, B:16:0x0047, B:28:0x0072, B:24:0x0060, B:25:0x0064, B:27:0x006f, B:26:0x006a, B:17:0x004d, B:18:0x0051, B:19:0x0055, B:9:0x0039), top: B:32:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x006a A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x0030, B:16:0x0047, B:28:0x0072, B:24:0x0060, B:25:0x0064, B:27:0x006f, B:26:0x006a, B:17:0x004d, B:18:0x0051, B:19:0x0055, B:9:0x0039), top: B:32:0x0005 }] */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c cVar;
            String str;
            c cVar2;
            String str2;
            try {
                if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                    c.this.f2068a = false;
                    int intExtra = intent.getIntExtra("status", 0);
                    int intExtra2 = intent.getIntExtra("plugged", 0);
                    int intExtra3 = intent.getIntExtra("level", -1);
                    int intExtra4 = intent.getIntExtra("scale", -1);
                    if (intExtra3 <= 0 || intExtra4 <= 0) {
                        c.this.f2071d = -1;
                    } else {
                        c.this.f2071d = (intExtra3 * 100) / intExtra4;
                    }
                    if (intExtra != 2) {
                        if (intExtra == 3 || intExtra == 4) {
                            cVar = c.this;
                            str = "3";
                        } else {
                            c.this.f2069b = null;
                        }
                        if (intExtra2 != 1) {
                            if (intExtra2 != 2) {
                                cVar2 = c.this;
                                str2 = "5";
                            }
                            c.f(c.this);
                        }
                        cVar2 = c.this;
                        str2 = "6";
                        cVar2.f2069b = str2;
                        c.this.f2068a = true;
                        c.f(c.this);
                    }
                    cVar = c.this;
                    str = "4";
                    cVar.f2069b = str;
                    if (intExtra2 != 1) {
                        if (intExtra2 != 2) {
                            cVar2 = c.this;
                            str2 = "5";
                        }
                        c.f(c.this);
                    }
                    cVar2 = c.this;
                    str2 = "6";
                    cVar2.f2069b = str2;
                    c.this.f2068a = true;
                    c.f(c.this);
                }
            } catch (Exception unused) {
                c.this.f2069b = null;
            }
        }
    }

    public static synchronized c b() {
        if (f2067e == null) {
            f2067e = new c();
        }
        return f2067e;
    }

    public static /* synthetic */ a f(c cVar) {
        cVar.getClass();
        return null;
    }

    public int e() {
        return this.f2071d;
    }

    public String g() {
        return this.f2069b;
    }

    public boolean h() {
        return this.f2068a;
    }

    public void i() {
        this.f2070c = new b();
        try {
            com.baidu.location.f.c().registerReceiver(this.f2070c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
        }
    }

    public void j() {
        if (this.f2070c != null) {
            try {
                com.baidu.location.f.c().unregisterReceiver(this.f2070c);
            } catch (Exception unused) {
            }
        }
        this.f2070c = null;
    }
}
