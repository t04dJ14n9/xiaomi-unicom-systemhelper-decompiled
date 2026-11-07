package h;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import b1.c;
import b1.d;
import b1.e;
import b1.g;
import com.baidu.location.Jni;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f2718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f2719f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AlarmManager f2724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0028a f2725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f2726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2727n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<e> f2714a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2715b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f2716c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2717d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2720g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2721h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2722i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PendingIntent f2723j = null;

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    public class C0028a extends BroadcastReceiver {
        public C0028a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (a.this.f2714a == null || a.this.f2714a.isEmpty()) {
                return;
            }
            a.this.f2718e.p0();
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // b1.d
        public void a(c cVar) {
            if (a.this.f2714a == null || a.this.f2714a.size() <= 0) {
                return;
            }
            a.this.c(cVar);
        }
    }

    public a(Context context, g gVar) {
        this.f2718e = null;
        this.f2719f = null;
        this.f2724k = null;
        this.f2725l = null;
        b bVar = new b();
        this.f2726m = bVar;
        this.f2727n = false;
        this.f2719f = context;
        this.f2718e = gVar;
        gVar.o0(bVar);
        this.f2724k = (AlarmManager) this.f2719f.getSystemService("alarm");
        this.f2725l = new C0028a();
        this.f2727n = false;
    }

    public final void b(long j2) {
        try {
            PendingIntent pendingIntent = this.f2723j;
            if (pendingIntent != null) {
                this.f2724k.cancel(pendingIntent);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f2719f, 0, new Intent("android.com.baidu.location.TIMER.NOTIFY"), 201326592);
            this.f2723j = broadcast;
            if (broadcast == null) {
                return;
            }
            this.f2724k.set(0, System.currentTimeMillis() + j2, this.f2723j);
        } catch (Exception unused) {
        }
    }

    public final void c(c cVar) {
        if (cVar.v() != 61 && cVar.v() != 161 && cVar.v() != 65) {
            b(120000L);
            return;
        }
        if (System.currentTimeMillis() - this.f2717d < 5000 || this.f2714a == null) {
            return;
        }
        this.f2716c = cVar;
        this.f2717d = System.currentTimeMillis();
        float[] fArr = new float[1];
        float f2 = Float.MAX_VALUE;
        for (e eVar : this.f2714a) {
            Location.distanceBetween(cVar.u(), cVar.x(), eVar.f1964f, eVar.f1965g, fArr);
            float fE = (fArr[0] - eVar.f1961c) - cVar.E();
            if (fE <= 0.0f) {
                int i2 = eVar.f1966h;
                if (i2 < 3) {
                    eVar.f1966h = i2 + 1;
                    eVar.a(cVar, fArr[0]);
                    if (eVar.f1966h < 3) {
                        this.f2722i = true;
                    }
                }
            } else if (fE < f2) {
                f2 = fE;
            }
        }
        if (f2 < this.f2715b) {
            this.f2715b = f2;
        }
        this.f2720g = 0;
        h();
    }

    public final boolean e() {
        ArrayList<e> arrayList = this.f2714a;
        boolean z2 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<e> it = this.f2714a.iterator();
            while (it.hasNext()) {
                if (it.next().f1966h < 3) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public int f(e eVar) {
        if (this.f2714a == null) {
            this.f2714a = new ArrayList<>();
        }
        this.f2714a.add(eVar);
        eVar.f1967i = true;
        eVar.f1968j = this;
        if (!this.f2727n) {
            this.f2719f.registerReceiver(this.f2725l, new IntentFilter("android.com.baidu.location.TIMER.NOTIFY"), "android.permission.ACCESS_FINE_LOCATION", null);
            this.f2727n = true;
        }
        String str = eVar.f1963e;
        if (str == null) {
            return 1;
        }
        if (!str.equals("gcj02")) {
            double[] dArrD = Jni.d(eVar.f1960b, eVar.f1959a, eVar.f1963e + "2gcj");
            eVar.f1965g = dArrD[0];
            eVar.f1964f = dArrD[1];
        }
        if (this.f2716c == null || System.currentTimeMillis() - this.f2717d > 30000) {
            this.f2718e.p0();
        } else {
            float[] fArr = new float[1];
            Location.distanceBetween(this.f2716c.u(), this.f2716c.x(), eVar.f1964f, eVar.f1965g, fArr);
            float fE = (fArr[0] - eVar.f1961c) - this.f2716c.E();
            if (fE <= 0.0f) {
                int i2 = eVar.f1966h;
                if (i2 < 3) {
                    eVar.f1966h = i2 + 1;
                    eVar.a(this.f2716c, fArr[0]);
                    if (eVar.f1966h < 3) {
                        this.f2722i = true;
                    }
                }
            } else if (fE < this.f2715b) {
                this.f2715b = fE;
            }
        }
        h();
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    public final void h() {
        int i2;
        boolean z2;
        if (e()) {
            float f2 = this.f2715b;
            int i3 = 10000;
            if (f2 > 5000.0f) {
                i2 = 600000;
            } else if (f2 > 1000.0f) {
                i2 = 120000;
            } else {
                i2 = f2 > 500.0f ? 60000 : 10000;
            }
            if (this.f2722i) {
                this.f2722i = false;
            } else {
                i3 = i2;
            }
            int i4 = this.f2720g;
            if (i4 != 0) {
                z2 = ((long) i3) <= (this.f2721h + ((long) i4)) - System.currentTimeMillis();
            }
            if (z2) {
                this.f2720g = i3;
                this.f2721h = System.currentTimeMillis();
                b(this.f2720g);
            }
        }
    }

    public int i(e eVar) {
        PendingIntent pendingIntent;
        ArrayList<e> arrayList = this.f2714a;
        if (arrayList == null) {
            return 0;
        }
        if (arrayList.contains(eVar)) {
            this.f2714a.remove(eVar);
        }
        if (this.f2714a.size() != 0 || (pendingIntent = this.f2723j) == null) {
            return 1;
        }
        this.f2724k.cancel(pendingIntent);
        return 1;
    }

    public void j() {
        PendingIntent pendingIntent = this.f2723j;
        if (pendingIntent != null) {
            this.f2724k.cancel(pendingIntent);
        }
        this.f2716c = null;
        this.f2717d = 0L;
        if (this.f2727n) {
            this.f2719f.unregisterReceiver(this.f2725l);
        }
        this.f2727n = false;
    }
}
