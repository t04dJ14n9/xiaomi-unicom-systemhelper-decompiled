package b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Object f1892d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static z f1893e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f1894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f1895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1896c = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Bundle data = message.getData();
                    try {
                        Location location = (Location) data.getParcelable("loc");
                        data.getInt("satnum");
                        if (location != null) {
                            j.j().u(location);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    break;
                case 2:
                    y.e(u.i(), j.f.M().S(), u.h(), u.f(), u.a());
                    break;
                case 3:
                    y.e(u.i(), null, u.h(), c.r().o(), u.a());
                    break;
                case 4:
                    boolean zY = j.f.M().Y();
                    boolean z2 = false;
                    if (n.i.N()) {
                        zY = false;
                    }
                    if (!zY) {
                        z2 = zY;
                    } else if (l.h().a() != 1) {
                        z2 = true;
                    }
                    if (z2) {
                        if (c.c.b().h()) {
                            i.d.n().y();
                            i.d.n().z();
                        }
                        c.f.e().b();
                        if (c.c.b().h()) {
                            y.l().t();
                        }
                    }
                    try {
                        if (z.this.f1895b != null) {
                            z.this.f1895b.sendEmptyMessageDelayed(4, n.i.N);
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    x.a().c();
                    break;
                case 5:
                    c.f.e().g();
                    break;
                case 7:
                    y.l().t();
                    c.f.e().b();
                    break;
                case 8:
                case 9:
                    message.getData();
                    break;
                case 11:
                    Bundle data2 = message.getData();
                    try {
                        x.a().b((GnssNavigationMessage) data2.getParcelable("gnss_navigation_message"), data2.getLong("gps_time"));
                    } catch (Exception unused) {
                        return;
                    }
                    break;
            }
        }
    }

    public static z b() {
        z zVar;
        synchronized (f1892d) {
            if (f1893e == null) {
                f1893e = new z();
            }
            zVar = f1893e;
        }
        return zVar;
    }

    @TargetApi(24)
    public void c(GnssNavigationMessage gnssNavigationMessage, long j2) {
        if (!this.f1896c || gnssNavigationMessage == null) {
            return;
        }
        try {
            Handler handler = this.f1895b;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage(11);
                Bundle bundle = new Bundle();
                bundle.putParcelable("gnss_navigation_message", gnssNavigationMessage);
                bundle.putLong("gps_time", j2);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void d(Location location, int i2) {
        if (!this.f1896c || location == null) {
            return;
        }
        try {
            Handler handler = this.f1895b;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage(1);
                Bundle bundle = new Bundle();
                bundle.putParcelable("loc", new Location(location));
                bundle.putInt("satnum", i2);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void e() {
        if (this.f1896c) {
            return;
        }
        this.f1896c = true;
        if (this.f1894a == null) {
            HandlerThread handlerThread = new HandlerThread("LocUploadThreadManager");
            this.f1894a = handlerThread;
            handlerThread.start();
            if (this.f1894a != null) {
                this.f1895b = new a(this.f1894a.getLooper());
            }
        }
        try {
            Handler handler = this.f1895b;
            if (handler != null) {
                handler.obtainMessage(5).sendToTarget();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Handler handler2 = this.f1895b;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(4, n.i.N);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void f() {
        if (this.f1896c) {
            j.j().B();
            try {
                Handler handler = this.f1895b;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f1895b = null;
            try {
                HandlerThread handlerThread = this.f1894a;
                if (handlerThread != null) {
                    handlerThread.quit();
                    this.f1894a.interrupt();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            this.f1894a = null;
            this.f1896c = false;
        }
    }

    public void g() {
        if (this.f1896c) {
            try {
                Handler handler = this.f1895b;
                if (handler != null) {
                    handler.obtainMessage(7).sendToTarget();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void h() {
        if (this.f1896c) {
            try {
                Handler handler = this.f1895b;
                if (handler != null) {
                    handler.obtainMessage(3).sendToTarget();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void i() {
        if (this.f1896c) {
            try {
                Handler handler = this.f1895b;
                if (handler != null) {
                    handler.obtainMessage(2).sendToTarget();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
