package android.support.v4.app;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class a extends y.a {

    /* JADX INFO: renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0002a {
    }

    public interface b {
        void b(int i2);
    }

    public static void d(Activity activity) {
        activity.finishAffinity();
    }

    public static InterfaceC0002a e() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Activity activity, String[] strArr, int i2) {
        if (activity instanceof b) {
            ((b) activity).b(i2);
        }
        activity.requestPermissions(strArr, i2);
    }
}
