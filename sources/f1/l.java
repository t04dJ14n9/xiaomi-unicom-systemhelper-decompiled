package f1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class l extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f2554c;

    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        String imei;
        super.b(context, bVar);
        if (!g1.d.f2652e) {
            g1.h.b("DeviceInfoReaderWIKO", "isUserPermissionOpen==false, do not read!");
            return;
        }
        g1.h.a("DeviceInfoReaderWIKO", "DeviceInfoReaderWIKO");
        bVar.f2453d = Build.DISPLAY.split("\\s+")[1];
        bVar.f2451c = g1.l.o("ro.board.hardware_version");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            o(context, bVar);
        } else {
            g1.h.b("DeviceInfoReaderWIKO", "Unsupported API:" + i2);
        }
        f2554c = 0;
        try {
            f2554c = Settings.System.getInt(context.getContentResolver(), "switch_dual_card_slots");
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (f2554c == 0) {
                bVar.f2456g = telephonyManager.getImei(0);
                imei = telephonyManager.getImei(1);
            } else {
                bVar.f2456g = telephonyManager.getImei(1);
                imei = telephonyManager.getImei(0);
            }
            bVar.f2469t = imei;
        } catch (Settings.SettingNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }
}
