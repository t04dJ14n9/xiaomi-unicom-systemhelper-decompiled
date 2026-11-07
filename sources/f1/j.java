package f1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public class j extends a {
    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        super.b(context, bVar);
        if (!g1.d.f2652e) {
            g1.h.b("DeviceInfoReaderWIKO", "isUserPermissionOpen==false, do not read!");
            return;
        }
        String strO = g1.l.o("ro.config.product_version_pre");
        String strO2 = g1.l.o("ro.huawei.build.display.id");
        String strReplaceFirst = "";
        if (strO2 != null) {
            if (TextUtils.isEmpty(strO)) {
                strReplaceFirst = strO2.replaceFirst(Build.PRODUCT + "[\\W]*", "").replaceFirst(Build.MODEL + "[\\W]*", "");
            } else {
                strReplaceFirst = strO2.replaceFirst(strO + "[\\W]*", "");
            }
        }
        bVar.f2453d = strReplaceFirst;
        bVar.f2451c = g1.l.o("ro.board.hardware_version");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            o(context, bVar);
            return;
        }
        g1.h.b("DeviceInfoReaderWIKO", "Unsupported API:" + i2);
    }
}
