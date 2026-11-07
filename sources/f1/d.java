package f1;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public class d extends a {
    private boolean t(Context context) {
        Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 1);
        g1.h.a("DeviceInfoReaderOPPO", "isBootWizardCompleted: " + boolValueOf);
        return boolValueOf.booleanValue();
    }

    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        super.b(context, bVar);
        g1.h.a("DeviceInfoReaderOPPO", "DeviceInfoReaderOPPO module:" + Build.MODEL);
        bVar.f2451c = g1.l.o("ro.build.hardware.version");
        g1.d.f2652e = t(context);
        g1.h.a("DeviceInfoReaderOPPO", "GlobalSetting.isUserPermissionOpen" + g1.d.f2652e);
        if (g1.d.f2652e) {
            o(context, bVar);
        } else {
            g1.h.b("DeviceInfoReaderOPPO", "isUserPermissionOpen==false, do not read!");
        }
    }
}
