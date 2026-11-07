package p0;

import android.content.Context;
import q0.c;
import q0.f;
import q0.g;
import q0.h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f3520h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f3522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f3523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f3524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f3525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h.a f3526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f3527g;

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3521a = applicationContext;
        this.f3524d = new c();
        this.f3522b = new h(applicationContext, new y0.a(applicationContext), this.f3524d);
        this.f3523c = new g(applicationContext, this.f3524d);
    }

    public static String a(Context context) {
        String strF;
        synchronized (a.class) {
            strF = d(context).b().f();
        }
        return strF;
    }

    private h.a b() {
        h.a aVar = this.f3526f;
        if (aVar != null) {
            return aVar;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.f3527g) > 3600000) {
            this.f3526f = e();
            this.f3527g = jCurrentTimeMillis;
        }
        h.a aVar2 = this.f3526f;
        if (aVar2 != null) {
            return aVar2;
        }
        if (this.f3525e == null) {
            this.f3526f = h(null);
        }
        return this.f3526f;
    }

    public static void c(String str) {
        h.g(str);
    }

    static a d(Context context) {
        a aVar;
        synchronized (f.class) {
            if (f3520h == null) {
                f3520h = new a(context);
            }
            aVar = f3520h;
        }
        return aVar;
    }

    private h.a e() {
        return f(null);
    }

    private h.a f(String str) {
        h.a aVarB = this.f3522b.b();
        return aVarB == null ? g(str) : aVarB;
    }

    private h.a g(String str) {
        f fVarC = this.f3523c.c(str);
        if (fVarC != null) {
            return this.f3522b.e(fVarC);
        }
        return null;
    }

    private h.a h(String str) {
        return this.f3522b.h(str);
    }
}
