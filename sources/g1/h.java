package g1;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f2680a = 3072;

    public static void a(String str, String str2) {
        if (!d.f2648a || str == null || str2 == null) {
            return;
        }
        if (str2.length() > f2680a) {
            int length = str2.length() / f2680a;
            int i2 = 0;
            while (i2 < length) {
                int i3 = f2680a;
                int i4 = i2 * i3;
                i2++;
                Log.d(str, str2.substring(i4, i3 * i2));
            }
            int length2 = str2.length() % f2680a;
            if (length2 <= 0) {
                return;
            } else {
                str2 = str2.substring(str2.length() - length2);
            }
        }
        Log.d(str, str2);
    }

    public static void b(String str, String str2) {
        if (!d.f2648a || str == null || str2 == null) {
            return;
        }
        Log.e(str, str2);
    }

    public static void c(Context context, String str) {
    }
}
