package f1;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    @Override // f1.a, f1.o.c
    public void b(Context context, e1.b bVar) {
        super.b(context, bVar);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            o(context, bVar);
            return;
        }
        g1.h.b("DeviceInfoReaderLiantong", "Unsupported API:" + i2);
    }
}
