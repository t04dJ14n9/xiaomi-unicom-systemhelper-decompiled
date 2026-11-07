package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static f f880d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f883c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f888e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f889f;

        a() {
        }
    }

    f(Context context, LocationManager locationManager) {
        this.f881a = context;
        this.f882b = locationManager;
    }

    static f a(Context context) {
        if (f880d == null) {
            Context applicationContext = context.getApplicationContext();
            f880d = new f(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f880d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = y.c.b(this.f881a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = y.c.b(this.f881a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f882b.isProviderEnabled(str)) {
                return this.f882b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f883c.f889f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        long j3;
        a aVar = this.f883c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        e eVarB = e.b();
        eVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j4 = eVarB.f877a;
        eVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = eVarB.f879c == 1;
        long j5 = eVarB.f878b;
        long j6 = eVarB.f877a;
        eVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j7 = eVarB.f878b;
        if (j5 == -1 || j6 == -1) {
            j2 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j6) {
                j3 = 0 + j7;
            } else {
                j3 = jCurrentTimeMillis > j5 ? 0 + j6 : 0 + j5;
            }
            j2 = j3 + 60000;
        }
        aVar.f884a = z2;
        aVar.f885b = j4;
        aVar.f886c = j5;
        aVar.f887d = j6;
        aVar.f888e = j7;
        aVar.f889f = j2;
    }

    boolean d() {
        a aVar = this.f883c;
        if (e()) {
            return aVar.f884a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f884a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
