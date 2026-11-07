package f1;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class g extends a {
    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        super.b(context, bVar);
        bVar.f2453d = g1.l.o("ro.build.display.id");
        bVar.f2451c = g1.l.o("ro.build.hardware.version");
        if (!g1.d.f2652e) {
            g1.h.b("DeviceInfoReaderRealme", "isUserPermissionOpen==false, do not read!");
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            o(context, bVar);
            return;
        }
        g1.h.b("DeviceInfoReaderRealme", "Unsupported API:" + i2);
    }
}
