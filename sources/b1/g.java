package b1;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements b.h.b {
    public static String K = null;
    public static boolean L = false;
    public Boolean A;
    public Boolean B;
    public Boolean C;
    public boolean D;
    public b.h E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String I;
    public ServiceConnection J;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f1971c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f1974f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f1976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Messenger f1977i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1986r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1969a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1970b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f1972d = new h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1973e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Messenger f1975g = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<b1.d> f1978j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<b1.b> f1979k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b1.c f1980l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1981m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1982n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1983o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1984p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f1985q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1987s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1988t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1989u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1990v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h.a f1991w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b1.d f1992x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1993y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1994z = true;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            g.this.f1975g = new Messenger(iBinder);
            if (g.this.f1975g == null) {
                return;
            }
            g.this.f1973e = true;
            if (g.this.f1994z) {
                g.this.f1976h.obtainMessage(2).sendToTarget();
                return;
            }
            try {
                Message messageObtain = Message.obtain((Handler) null, 11);
                messageObtain.replyTo = g.this.f1977i;
                messageObtain.setData(g.this.u());
                g.this.f1975g.send(messageObtain);
                g.this.f1973e = true;
                if (g.this.f1971c != null) {
                    g.this.C.booleanValue();
                    g.this.f1976h.obtainMessage(4).sendToTarget();
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g.this.f1975g = null;
            g.this.f1973e = false;
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (g.this.E != null) {
                    if (n.i.b(g.this.f1974f) > 0) {
                        g.this.E.v();
                    }
                    g.this.E.e();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<g> f1997a;

        public c(Looper looper, g gVar) {
            super(looper);
            this.f1997a = new WeakReference<>(gVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g gVar = this.f1997a.get();
            if (gVar == null) {
            }
            int i2 = message.what;
            if (i2 == 26) {
                gVar.k(message, 26);
                return;
            }
            if (i2 == 27) {
                gVar.j(message);
                return;
            }
            if (i2 == 54) {
                if (gVar.f1971c.f2007h) {
                    gVar.f1986r = true;
                    return;
                }
                return;
            }
            if (i2 == 55) {
                if (gVar.f1971c.f2007h) {
                    gVar.f1986r = false;
                    return;
                }
                return;
            }
            try {
                if (i2 == 703) {
                    Bundle data = message.getData();
                    int i3 = data.getInt("id", 0);
                    if (i3 > 0) {
                        gVar.i(i3, (Notification) data.getParcelable("notification"));
                        return;
                    }
                    return;
                }
                if (i2 == 704) {
                    gVar.r(message.getData().getBoolean("removenotify"));
                    return;
                }
                switch (i2) {
                    case 1:
                        gVar.Q();
                        break;
                    case 2:
                        gVar.T();
                        break;
                    case 3:
                        gVar.U(message);
                        break;
                    case 4:
                        gVar.B();
                        break;
                    case 5:
                        gVar.v(message);
                        break;
                    case 6:
                        gVar.Z(message);
                        break;
                    case 7:
                        break;
                    case 8:
                        gVar.M(message);
                        break;
                    case 9:
                        gVar.H(message);
                        break;
                    case 10:
                        gVar.R(message);
                        break;
                    case 11:
                        gVar.G();
                        break;
                    case 12:
                        gVar.L();
                        break;
                    default:
                        if (i2 != 21) {
                            if (i2 != 303) {
                                if (i2 == 406) {
                                    Bundle data2 = message.getData();
                                    byte[] byteArray = data2.getByteArray("mac");
                                    String str = byteArray != null ? new String(byteArray, "UTF-8") : null;
                                    int i4 = data2.getInt("hotspot", -1);
                                    if (gVar.f1979k != null) {
                                        Iterator it = gVar.f1979k.iterator();
                                        while (it.hasNext()) {
                                            ((b1.b) it.next()).a(str, i4);
                                        }
                                    }
                                } else if (i2 == 701) {
                                    gVar.l((b1.c) message.obj);
                                } else if (i2 == 708) {
                                    gVar.q((String) message.obj);
                                } else if (i2 == 804) {
                                    Bundle data3 = message.getData();
                                    data3.setClassLoader(b1.c.class.getClassLoader());
                                    b1.c cVar = (b1.c) data3.getParcelable("vdr_location");
                                    if (gVar.f1979k != null) {
                                        Iterator it2 = gVar.f1979k.iterator();
                                        while (it2.hasNext()) {
                                            ((b1.b) it2.next()).e(cVar);
                                        }
                                    }
                                } else if (i2 == 1300) {
                                    gVar.C(message);
                                } else if (i2 == 1400) {
                                    gVar.b0(message);
                                } else {
                                    super.handleMessage(message);
                                }
                                break;
                            } else {
                                Bundle data4 = message.getData();
                                int i5 = data4.getInt("loctype");
                                int i6 = data4.getInt("diagtype");
                                byte[] byteArray2 = data4.getByteArray("diagmessage");
                                if (i5 > 0 && i6 > 0 && byteArray2 != null && gVar.f1979k != null) {
                                    Iterator it3 = gVar.f1979k.iterator();
                                    while (it3.hasNext()) {
                                        ((b1.b) it3.next()).b(i5, i6, new String(byteArray2, "UTF-8"));
                                    }
                                    break;
                                }
                            }
                        } else {
                            Bundle data5 = message.getData();
                            data5.setClassLoader(b1.c.class.getClassLoader());
                            b1.c cVar2 = (b1.c) data5.getParcelable("locStr");
                            if (gVar.G || !gVar.F || cVar2.v() != 66) {
                                if (!gVar.G && gVar.F) {
                                    gVar.G = true;
                                } else {
                                    if (!gVar.G) {
                                        gVar.G = true;
                                    }
                                    gVar.k(message, 21);
                                }
                            }
                            break;
                        }
                        break;
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public /* synthetic */ d(g gVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.this.f1987s) {
                g.this.f1984p = false;
                if (g.this.f1975g != null && g.this.f1977i != null) {
                    if ((g.this.f1978j != null && g.this.f1978j.size() >= 1) || (g.this.f1979k != null && g.this.f1979k.size() >= 1)) {
                        if (!g.this.f1982n) {
                            g.this.f1976h.obtainMessage(4).sendToTarget();
                            return;
                        }
                        if (g.this.f1985q == null) {
                            g gVar = g.this;
                            gVar.f1985q = gVar.new d();
                        }
                        g.this.f1976h.postDelayed(g.this.f1985q, g.this.f1971c.f2003d);
                    }
                }
            }
        }
    }

    public class e extends Thread {
        public e() {
        }

        public /* synthetic */ e(g gVar, a aVar) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (g.this.C.booleanValue()) {
                    if (g.this.E == null) {
                        j.f.M().V();
                        g.this.E = new b.h(g.this.f1974f, g.this.f1972d, g.this, null, false);
                    }
                    g gVar = g.this;
                    gVar.I = gVar.E.k();
                    if (g.this.f1972d.D == h.a.ACCURACY_IN_FIRST_LOC) {
                        g.this.E.x();
                        g.this.E.y();
                    }
                }
                g.this.f1976h.obtainMessage(1).sendToTarget();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public g(Context context) throws Exception {
        this.f1971c = new h();
        this.f1974f = null;
        Boolean bool = Boolean.FALSE;
        this.A = bool;
        this.B = bool;
        this.C = Boolean.TRUE;
        this.E = null;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = null;
        this.J = new a();
        g();
        this.f1974f = context;
        this.f1971c = new h();
        this.f1976h = new c(Looper.getMainLooper(), this);
        this.f1977i = new Messenger(this.f1976h);
    }

    public static void r0(boolean z2) {
        L = z2;
    }

    public final void B() {
        int i2;
        int i3;
        h hVar;
        if (this.f1975g == null) {
            return;
        }
        int iB = n.i.b(this.f1974f);
        a aVar = null;
        if ((System.currentTimeMillis() - this.f1988t > 3000 || (!((hVar = this.f1971c) == null || hVar.f2007h) || this.f1982n)) && iB == 1) {
            if (!this.f1993y || System.currentTimeMillis() - this.f1989u > 20000 || this.f1982n) {
                Message messageObtain = Message.obtain((Handler) null, 22);
                if (this.f1982n) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isWaitingLocTag", this.f1982n);
                    this.f1982n = false;
                    messageObtain.setData(bundle);
                }
                try {
                    messageObtain.replyTo = this.f1977i;
                    this.f1975g.send(messageObtain);
                    this.f1969a = System.currentTimeMillis();
                    this.f1981m = true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else if (iB < 1) {
            b1.c cVar = new b1.c();
            if (iB == -1) {
                i3 = 69;
            } else if (iB == -2) {
                i3 = 70;
            } else {
                if (iB == 0) {
                    i3 = 71;
                }
                w(cVar);
            }
            cVar.o0(i3);
            w(cVar);
        }
        synchronized (this.f1987s) {
            h hVar2 = this.f1971c;
            if (hVar2 != null && (i2 = hVar2.f2003d) >= 1000 && !this.f1984p) {
                if (this.f1985q == null) {
                    this.f1985q = new d(this, aVar);
                }
                this.f1976h.postDelayed(this.f1985q, i2);
                this.f1984p = true;
            }
        }
    }

    public final void C(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        b1.b bVar = (b1.b) obj;
        if (this.f1979k == null) {
            this.f1979k = new ArrayList<>();
        }
        if (this.f1979k.contains(bVar)) {
            return;
        }
        this.f1979k.add(bVar);
    }

    public final void G() {
        if (this.f1975g == null) {
            return;
        }
        Message messageObtain = Message.obtain((Handler) null, 22);
        try {
            messageObtain.replyTo = this.f1977i;
            this.f1975g.send(messageObtain);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void H(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        b1.e eVar = (b1.e) obj;
        if (this.f1991w == null) {
            this.f1991w = new h.a(this.f1974f, this);
        }
        this.f1991w.f(eVar);
    }

    public final void L() {
        Message messageObtain = Message.obtain((Handler) null, 28);
        try {
            messageObtain.replyTo = this.f1977i;
            this.f1975g.send(messageObtain);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void M(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        this.f1992x = (b1.d) obj;
    }

    public final void Q() {
        if (this.f1973e) {
            return;
        }
        if (this.C.booleanValue()) {
            boolean zH = n.i.H(this.f1974f);
            if (this.f1972d.i()) {
                zH = true;
            }
            if (zH) {
                try {
                    new b().start();
                } catch (Throwable unused) {
                }
            }
        }
        if (this.f1972d.i()) {
            return;
        }
        this.C = Boolean.FALSE;
        this.f1970b = this.f1974f.getPackageName();
        Intent intent = new Intent(this.f1974f, (Class<?>) com.baidu.location.f.class);
        try {
            intent.putExtra("debug_dev", this.D);
        } catch (Exception unused2) {
        }
        if (this.f1971c == null) {
            this.f1971c = new h();
        }
        intent.putExtra("cache_exception", this.f1971c.f2011l);
        intent.putExtra("kill_process", this.f1971c.f2012m);
        intent.putExtra("auth_key", K);
        try {
            this.f1974f.bindService(intent, this.J, 1);
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f1973e = false;
        }
    }

    public final void R(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        b1.e eVar = (b1.e) obj;
        h.a aVar = this.f1991w;
        if (aVar != null) {
            aVar.i(eVar);
        }
    }

    public final void T() {
        if (!this.f1973e || this.f1975g == null) {
            return;
        }
        Message messageObtain = Message.obtain((Handler) null, 12);
        messageObtain.replyTo = this.f1977i;
        try {
            this.f1975g.send(messageObtain);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.f1974f.unbindService(this.J);
            if (this.H) {
                try {
                    this.f1974f.stopService(new Intent(this.f1974f, (Class<?>) com.baidu.location.f.class));
                } catch (Exception unused) {
                }
                this.H = false;
            }
        } catch (Exception unused2) {
        }
        synchronized (this.f1987s) {
            try {
                if (this.f1984p) {
                    this.f1976h.removeCallbacks(this.f1985q);
                    this.f1984p = false;
                }
            } catch (Exception unused3) {
            }
        }
        h.a aVar = this.f1991w;
        if (aVar != null) {
            aVar.j();
        }
        this.f1975g = null;
        this.f1982n = false;
        this.f1993y = false;
        this.f1973e = false;
        this.F = false;
        this.G = false;
        this.f1990v = -1L;
        this.f1983o = false;
        this.C = Boolean.TRUE;
    }

    public final void U(Message message) {
        Object obj;
        this.f1982n = false;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        h hVar = (h) obj;
        if (this.f1971c.j(hVar)) {
            return;
        }
        a aVar = null;
        if (this.f1971c.f2003d != hVar.f2003d) {
            try {
                synchronized (this.f1987s) {
                    try {
                        if (this.f1984p) {
                            this.f1976h.removeCallbacks(this.f1985q);
                            this.f1984p = false;
                        }
                        int i2 = hVar.f2003d;
                        if (i2 >= 1000 && !this.f1984p) {
                            if (this.f1985q == null) {
                                this.f1985q = new d(this, aVar);
                            }
                            this.f1976h.postDelayed(this.f1985q, i2);
                            this.f1984p = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.f1971c = new h(hVar);
        if (this.f1975g != null && n.i.b(this.f1974f) >= 1) {
            try {
                Message messageObtain = Message.obtain((Handler) null, 15);
                messageObtain.replyTo = this.f1977i;
                messageObtain.setData(u());
                this.f1975g.send(messageObtain);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public h X() {
        return this.f1971c;
    }

    public final void Z(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        b1.d dVar = (b1.d) obj;
        ArrayList<b1.d> arrayList = this.f1978j;
        if (arrayList == null || !arrayList.contains(dVar)) {
            return;
        }
        this.f1978j.remove(dVar);
    }

    @Override // b.h.b
    public void a(b1.c cVar) {
        if ((!this.G || this.F) && cVar != null) {
            Message messageObtainMessage = this.f1976h.obtainMessage(701);
            messageObtainMessage.obj = cVar;
            messageObtainMessage.sendToTarget();
        }
    }

    public final void b0(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        b1.b bVar = (b1.b) obj;
        ArrayList<b1.b> arrayList = this.f1979k;
        if (arrayList == null || !arrayList.contains(bVar)) {
            return;
        }
        this.f1979k.remove(bVar);
    }

    public final void g() throws Exception {
        if (L) {
            return;
        }
        Log.e("baidu_location_Client", "The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface");
        throw new Exception("The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface");
    }

    public final void h(int i2) {
        if (this.f1980l.j() == null) {
            this.f1980l.V(this.f1971c.f2000a);
        }
        if (this.f1981m || ((this.f1971c.f2007h && this.f1980l.v() == 61) || this.f1980l.v() == 66 || this.f1980l.v() == 67 || this.f1993y || this.f1980l.v() == 161)) {
            if (this.f1983o || this.f1990v == -1 || System.currentTimeMillis() - this.f1990v >= X().g() - 300) {
                ArrayList<b1.d> arrayList = this.f1978j;
                if (arrayList != null) {
                    Iterator<b1.d> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().a(this.f1980l);
                    }
                }
                ArrayList<b1.b> arrayList2 = this.f1979k;
                if (arrayList2 != null) {
                    Iterator<b1.b> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().d(this.f1980l);
                    }
                }
                this.f1990v = System.currentTimeMillis();
                if (this.f1983o) {
                    this.f1983o = false;
                }
            }
            if (this.f1980l.v() == 66 || this.f1980l.v() == 67) {
                return;
            }
            this.f1981m = false;
            this.f1989u = System.currentTimeMillis();
        }
    }

    public final void i(int i2, Notification notification) {
        try {
            Intent intent = new Intent(this.f1974f, (Class<?>) com.baidu.location.f.class);
            intent.putExtra("notification", notification);
            intent.putExtra("id", i2);
            intent.putExtra("command", 1);
            this.f1974f.startForegroundService(intent);
            this.H = true;
        } catch (Exception unused) {
        }
    }

    public final void j(Message message) {
        try {
            Bundle data = message.getData();
            data.setClassLoader(b1.c.class.getClassLoader());
            b1.c cVar = (b1.c) data.getParcelable("locStr");
            if (this.f1992x != null) {
                h hVar = this.f1971c;
                if (hVar != null && hVar.h() && cVar.v() == 65) {
                    return;
                }
                this.f1992x.a(cVar);
            }
        } catch (Exception unused) {
        }
    }

    public final void k(Message message, int i2) {
        if (this.f1973e) {
            try {
                Bundle data = message.getData();
                data.setClassLoader(b1.c.class.getClassLoader());
                b1.c cVar = (b1.c) data.getParcelable("locStr");
                this.f1980l = cVar;
                if (cVar.v() == 61) {
                    this.f1988t = System.currentTimeMillis();
                }
                if (this.f1980l.v() == 61 || this.f1980l.v() == 161) {
                    b.a.h().c(this.f1980l.u(), this.f1980l.x(), this.f1980l.j());
                }
                h(i2);
            } catch (Exception unused) {
            }
        }
    }

    public final void l(b1.c cVar) {
        if (this.f1994z) {
            return;
        }
        this.f1980l = cVar;
        if (!this.G && cVar.v() == 161) {
            this.F = true;
            b.a.h().c(cVar.u(), cVar.x(), cVar.j());
        }
        ArrayList<b1.d> arrayList = this.f1978j;
        if (arrayList != null) {
            Iterator<b1.d> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(cVar);
            }
        }
        ArrayList<b1.b> arrayList2 = this.f1979k;
        if (arrayList2 != null) {
            Iterator<b1.b> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().d(cVar);
            }
        }
    }

    public void n0(b1.b bVar) {
        if (bVar == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message messageObtainMessage = this.f1976h.obtainMessage(1300);
        messageObtainMessage.obj = bVar;
        messageObtainMessage.sendToTarget();
    }

    public void o0(b1.d dVar) {
        Message messageObtainMessage = this.f1976h.obtainMessage(8);
        messageObtainMessage.obj = dVar;
        messageObtainMessage.sendToTarget();
    }

    public void p0() {
        this.f1976h.obtainMessage(11).sendToTarget();
    }

    public final void q(String str) {
        ArrayList<b1.b> arrayList = this.f1979k;
        if (arrayList != null) {
            Iterator<b1.b> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(str);
            }
        }
    }

    public final void r(boolean z2) {
        try {
            Intent intent = new Intent(this.f1974f, (Class<?>) com.baidu.location.f.class);
            intent.putExtra("removenotify", z2);
            intent.putExtra("command", 2);
            this.f1974f.startService(intent);
            this.H = true;
        } catch (Exception unused) {
        }
    }

    public void s0(h hVar) {
        if (hVar == null) {
            hVar = new h();
        }
        if (hVar.b() > 0) {
            hVar.q(0);
            hVar.o(true);
        }
        this.f1972d = new h(hVar);
        Message messageObtainMessage = this.f1976h.obtainMessage(3);
        messageObtainMessage.obj = hVar;
        messageObtainMessage.sendToTarget();
    }

    public void t0() {
        this.f1994z = false;
        if (n.i.N()) {
            return;
        }
        a1.b.B(this.f1974f.getApplicationContext()).J(L);
        b.a.h().d(this.f1974f, this.f1972d, null);
        new e(this, null).start();
    }

    public final Bundle u() {
        if (this.f1971c == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packName", this.f1970b);
        bundle.putString("prodName", this.f1971c.f2005f);
        bundle.putString("coorType", this.f1971c.f2000a);
        bundle.putString("addrType", this.f1971c.f2001b);
        bundle.putBoolean("openGPS", this.f1971c.f2002c);
        bundle.putBoolean("location_change_notify", this.f1971c.f2007h);
        bundle.putInt("scanSpan", this.f1971c.f2003d);
        bundle.putBoolean("enableSimulateGps", this.f1971c.f2009j);
        bundle.putInt("timeOut", this.f1971c.f2004e);
        bundle.putInt("priority", this.f1971c.f2006g);
        bundle.putBoolean("map", this.A.booleanValue());
        bundle.putBoolean("import", this.B.booleanValue());
        bundle.putBoolean("needDirect", this.f1971c.f2013n);
        bundle.putBoolean("isneedaptag", this.f1971c.f2014o);
        bundle.putBoolean("isneedpoiregion", this.f1971c.f2016q);
        bundle.putBoolean("isneedregular", this.f1971c.f2017r);
        bundle.putBoolean("isneedaptagd", this.f1971c.f2015p);
        bundle.putBoolean("isneedaltitude", this.f1971c.f2018s);
        bundle.putBoolean("isneednewrgc", this.f1971c.f2019t);
        bundle.putInt("autoNotifyMaxInterval", this.f1971c.b());
        bundle.putInt("autoNotifyMinTimeInterval", this.f1971c.e());
        bundle.putInt("autoNotifyMinDistance", this.f1971c.d());
        bundle.putFloat("autoNotifyLocSensitivity", this.f1971c.a());
        bundle.putInt("wifitimeout", this.f1971c.A);
        bundle.putInt("wfnum", b.a.h().f1615c);
        bundle.putBoolean("ischeckper", b.a.h().f1614b);
        bundle.putFloat("wfsm", (float) b.a.h().f1617e);
        bundle.putDouble("gnmcrm", b.a.h().f1620h);
        bundle.putInt("gnmcon", b.a.h().f1621i);
        bundle.putInt("iupl", b.a.h().f1622j);
        bundle.putInt("lpcs", b.a.h().f1619g);
        bundle.putInt("hpdts", b.a.h().f1624l);
        bundle.putInt("oldts", b.a.h().f1625m);
        bundle.putBoolean("isEnableBeidouMode", this.f1971c.C);
        bundle.putInt("onic", b.a.h().f1626n);
        bundle.putInt("nlcs", b.a.h().f1627o);
        bundle.putFloat("ncsr", b.a.h().f1628p);
        bundle.putFloat("cscr", b.a.h().f1629q);
        bundle.putString("connectBssid", this.I);
        bundle.putInt("cls", b.a.h().f1630r);
        bundle.putIntArray("ocs", b.a.h().f1631s);
        bundle.putInt("topCellNumber", b.a.h().f1632t);
        bundle.putInt("locStrLength", b.a.h().f1633u);
        return bundle;
    }

    public final void v(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            return;
        }
        b1.d dVar = (b1.d) obj;
        if (this.f1978j == null) {
            this.f1978j = new ArrayList<>();
        }
        if (this.f1978j.contains(dVar)) {
            return;
        }
        this.f1978j.add(dVar);
    }

    public final void w(b1.c cVar) {
        ArrayList<b1.d> arrayList = this.f1978j;
        if (arrayList != null) {
            Iterator<b1.d> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(cVar);
            }
        }
        ArrayList<b1.b> arrayList2 = this.f1979k;
        if (arrayList2 != null) {
            Iterator<b1.b> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().d(cVar);
            }
        }
    }
}
