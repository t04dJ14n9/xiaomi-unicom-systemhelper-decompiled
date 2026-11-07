package f1;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class c extends a {
    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        super.b(context, bVar);
        if (!g1.d.f2652e) {
            g1.h.b("DeviceInfoReaderNubia", "isUserPermissionOpen==false, do not read!");
            return;
        }
        if (!bVar.f2449b.equals("NX659J") && !bVar.f2449b.equals("NX651J") && !bVar.f2449b.equals("angelcare N9") && !bVar.f2449b.equals("NX724J")) {
            g1.h.b("DeviceInfoReaderNubia", "DeviceInfoReaderNubia model unknow!!!");
            return;
        }
        g1.h.a("DeviceInfoReaderNubia", "model : angelcare N9");
        bVar.f2453d = g1.l.o("ro.build.display.id");
        bVar.f2451c = g1.l.o("ro.product.hardware");
        o(context, bVar);
    }
}
