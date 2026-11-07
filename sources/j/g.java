package j;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.telephony.TelephonyManager;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2981d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static e f2982e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2983a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2984b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2985c = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2986a;

        static {
            int[] iArr = new int[b.values().length];
            f2986a = iArr;
            try {
                iArr[b.ONLY_CELL_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2986a[b.ONLY_WIFI_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2986a[b.GET_ALL_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        ONLY_CELL_MODE,
        ONLY_WIFI_MODE,
        GET_ALL_DATA
    }

    public static boolean s() {
        return f2981d;
    }

    public static e v() {
        return f2982e;
    }

    public WifiInfo a() {
        return k.b.s().a();
    }

    public j.a b(int i2) {
        if (this.f2985c && this.f2983a) {
            return k.a.h().n(i2);
        }
        return null;
    }

    public j.a c(j.a aVar, TelephonyManager telephonyManager) {
        return k.a.h().e(aVar, telephonyManager);
    }

    public String d(int i2, boolean z2, k kVar, int i3) {
        return k.b.s().c(i2, z2, kVar, i3);
    }

    public String e(WifiInfo wifiInfo, String str) {
        return k.b.s().e(wifiInfo, str);
    }

    public String f(j.a aVar) {
        return k.a.h().p(aVar);
    }

    public String g(k kVar, int i2, String str, boolean z2, int i3) {
        return k.b.s().f(kVar, i2, str, z2, i3);
    }

    public void h(Context context, List<String> list) {
        if (this.f2983a) {
            k.a.h().i(context);
        }
        if (this.f2984b) {
            k.b.s().h(context, list);
        }
        this.f2985c = true;
    }

    public void i(e eVar) {
        f2982e = eVar;
    }

    public void j(b bVar) {
        int i2 = a.f2986a[bVar.ordinal()];
        if (i2 == 1) {
            this.f2983a = true;
            this.f2984b = false;
            return;
        }
        if (i2 == 2) {
            this.f2983a = false;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException("Illegal this mode : " + bVar);
            }
            this.f2983a = true;
        }
        this.f2984b = true;
    }

    public void k(boolean z2) {
        k.a.h().j(z2);
    }

    public boolean l(j.a aVar, j.a aVar2) {
        return k.a.h().k(aVar, aVar2);
    }

    public k m(int i2) {
        if (this.f2985c && this.f2984b) {
            return k.b.s().m(i2);
        }
        return null;
    }

    public String n() {
        return k.b.s().o();
    }

    public String o(j.a aVar) {
        return k.a.h().t(aVar);
    }

    public void p(boolean z2) {
        k.a.h().s(z2);
    }

    public HashSet<String> q(j.a aVar) {
        return k.a.h().x(aVar);
    }

    public void r(int i2) {
        k.a.h().u(Math.max(i2, 29));
    }

    public k t() {
        return k.b.s().r();
    }

    public void u(int i2) {
        if (i2 >= 0) {
            k.a.h().z(i2);
        }
    }

    public void w(int i2) {
        if (i2 >= 0) {
            k.b.s().g(i2);
        }
    }

    public long x() {
        return k.b.s().u();
    }

    public boolean y() {
        return k.a.h().v();
    }

    public void z() {
        if (this.f2983a) {
            k.a.h().I();
        }
        if (this.f2984b) {
            k.b.s().x();
        }
        this.f2985c = false;
    }
}
