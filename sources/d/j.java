package d;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Location> f2339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Location f2341c = null;

    public j(String str, Location[] locationArr) {
        if (locationArr == null || locationArr.length <= 0) {
            return;
        }
        b(locationArr);
        this.f2340b = str;
    }

    public String a() {
        return this.f2340b;
    }

    public final void b(Location[] locationArr) {
        if (locationArr == null || locationArr.length <= 0) {
            return;
        }
        if (this.f2339a == null) {
            this.f2339a = new ArrayList();
        }
        double longitude = 0.0d;
        double latitude = 0.0d;
        for (int i2 = 0; i2 < locationArr.length; i2++) {
            latitude += locationArr[i2].getLatitude();
            longitude += locationArr[i2].getLongitude();
            this.f2339a.add(locationArr[i2]);
        }
        if (this.f2341c == null) {
            Location location = new Location("gps");
            this.f2341c = location;
            location.setLatitude(latitude / ((double) locationArr.length));
            this.f2341c.setLongitude(longitude / ((double) locationArr.length));
        }
    }
}
