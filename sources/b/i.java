package b;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f1720b = "NULL";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1721a = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f1722a = new i();
    }

    public static i f() {
        return a.f1722a;
    }

    public final int a(String str) {
        return e.a(str);
    }

    public final String b(Location location) {
        StringBuilder sb = new StringBuilder();
        sb.append(location.getAccuracy());
        sb.append("|");
        sb.append(j.d.W);
        sb.append("|");
        Bundle extras = location.getExtras();
        if (extras == null || !extras.containsKey("meanCn0")) {
            sb.append(-1);
        } else {
            sb.append(extras.get("meanCn0"));
        }
        sb.append("|");
        if (extras == null || !extras.containsKey("SourceType")) {
            sb.append(-1);
        } else {
            sb.append(extras.get("SourceType"));
        }
        sb.append("|");
        sb.append(f1720b);
        return sb.toString();
    }

    public void c() {
        e.d();
        this.f1721a = false;
        f1720b = "";
    }

    public void d(ArrayList<ArrayList<Float>> arrayList) {
        String string;
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 0) {
            string = "NULL";
        } else {
            boolean z2 = true;
            for (ArrayList<Float> arrayList2 : arrayList) {
                if (arrayList2.size() == 6) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sb.append(";");
                    }
                    sb.append(String.format("%.1f,", arrayList2.get(2)));
                    sb.append(String.format("%.0f", arrayList2.get(3)));
                }
            }
            string = sb.toString();
        }
        f1720b = string;
    }

    public int e(Location location) {
        if (location == null) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (!h()) {
            g();
        }
        if (h()) {
            return a(b(location));
        }
        return -1;
    }

    public final void g() {
        String strA = o.h.b().a(o.h.c.GPS_CHECKER_STATUS);
        if (strA != null && e.b(strA, d.s().H) == 0) {
            this.f1721a = true;
        }
    }

    public boolean h() {
        return this.f1721a;
    }
}
