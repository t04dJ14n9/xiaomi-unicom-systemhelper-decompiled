package f1;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public class h extends a {
    private boolean t(Context context) {
        Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 1);
        g1.h.a("DeviceInfoReaderSamSung", "isBootWizardCompleted: " + boolValueOf);
        return boolValueOf.booleanValue();
    }

    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        super.b(context, bVar);
        g1.h.a("DeviceInfoReaderSamSung", "DeviceInfoReaderSamSung module:" + Build.MODEL);
        bVar.f2453d = g1.l.o("ril.sw_ver");
        bVar.f2451c = g1.l.o("ril.hw_ver");
        g1.d.f2652e = t(context);
        g1.h.a("DeviceInfoReaderSamSung", "GlobalSetting.isUserPermissionOpen" + g1.d.f2652e);
        if (!g1.d.f2652e) {
            g1.h.b("DeviceInfoReaderSamSung", "isUserPermissionOpen==false, do not read!");
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            o(context, bVar);
            return;
        }
        g1.h.b("DeviceInfoReaderSamSung", "Unsupported API:" + i2);
    }
}
