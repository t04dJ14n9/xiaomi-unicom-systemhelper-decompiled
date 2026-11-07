package f1;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public class k extends a {
    private String u() {
        String strO = g1.l.o("ro.vivo.hardware_version");
        return (strO == null || strO.isEmpty()) ? "MP_0.1" : strO;
    }

    private String v() {
        return g1.l.o(w() ? "ro.vivo.op.entry.version" : "ro.vivo.product.version");
    }

    private boolean w() {
        String upperCase = g1.l.o("ro.vivo.op.entry").toUpperCase();
        g1.h.a("DeviceInfoReaderVIVO", "isUnicomEntry-->opEntry:" + upperCase);
        return upperCase.contains("UNICOM");
    }

    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        super.b(context, bVar);
        g1.d.f2652e = t(context);
        g1.h.a("DeviceInfoReaderVIVO", "GlobalSetting.isUserPermissionOpen" + g1.d.f2652e);
        if (!g1.d.f2652e) {
            g1.h.b("DeviceInfoReaderVIVO", "isUserPermissionOpen==false, do not read!");
            return;
        }
        bVar.f2451c = u();
        bVar.f2453d = v();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            g1.h.a("DeviceInfoReaderVIVO", "enter DeviceInfoReaderVIVO read vivo");
            p(context, bVar);
        } else {
            g1.h.b("DeviceInfoReaderVIVO", "Unsupported API:" + i2);
        }
    }

    protected boolean t(Context context) {
        boolean z2 = false;
        Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 1);
        g1.h.a("DeviceInfoReaderVIVO", "isBootWizardCompleted: " + boolValueOf);
        if (boolValueOf.booleanValue()) {
            z2 = Settings.Secure.getInt(context.getContentResolver(), "operator_service_improve_plan", 0) == 1;
            g1.h.a("DeviceInfoReaderVIVO", "checkUserPermission:" + z2);
        }
        return z2;
    }
}
