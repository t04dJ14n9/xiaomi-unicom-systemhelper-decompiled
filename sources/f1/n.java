package f1;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class n extends a {
    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        super.b(context, bVar);
        bVar.f2451c = g1.l.r("ro.product.hardware", "UnKnow");
        bVar.f2453d = Build.DISPLAY;
        if (!g1.d.f2652e) {
            g1.h.b("DeviceInfoReaderZTE", "isUserPermissionOpen==false, do not read!");
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            o(context, bVar);
            return;
        }
        g1.h.b("DeviceInfoReaderZTE", "Unsupported API:" + i2);
    }
}
