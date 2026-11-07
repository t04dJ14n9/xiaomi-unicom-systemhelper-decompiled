package b;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<d> f1810a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocationManager f1811b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f1812c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1813d = false;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static p f1814a = new p();
    }

    public class c implements LocationListener {
        public c() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            Iterator<d> it = p.this.f1810a.iterator();
            while (it.hasNext()) {
                it.next().a(location);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    public interface d {
        void a(Location location);
    }

    public static p e() {
        return b.f1814a;
    }

    public void a() {
        LocationManager locationManager;
        c cVar = this.f1812c;
        if (cVar == null || (locationManager = this.f1811b) == null) {
            return;
        }
        locationManager.removeUpdates(cVar);
        this.f1812c = null;
    }

    public void b(d dVar) {
        if (dVar == null) {
            return;
        }
        if (!this.f1810a.contains(dVar)) {
            this.f1810a.add(dVar);
        }
        if (this.f1810a.size() != 1 || this.f1813d) {
            return;
        }
        c();
        this.f1813d = true;
    }

    public void c() {
        try {
            if (this.f1811b == null) {
                this.f1811b = (LocationManager) com.baidu.location.f.c().getSystemService("location");
            }
            if (this.f1812c == null) {
                this.f1812c = new c();
            }
            LocationManager locationManager = this.f1811b;
            if (locationManager == null || !locationManager.isProviderEnabled("network")) {
                return;
            }
            this.f1811b.requestLocationUpdates("network", 1000L, 0.0f, this.f1812c);
        } catch (Exception unused) {
        }
    }

    public void d(d dVar) {
        if (dVar == null) {
            return;
        }
        this.f1810a.remove(dVar);
        if (this.f1810a.size() == 0 && this.f1813d) {
            a();
            this.f1813d = false;
        }
    }
}
