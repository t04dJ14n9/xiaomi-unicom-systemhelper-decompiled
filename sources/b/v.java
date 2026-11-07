package b;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HandlerThread f1854a;

    public static synchronized HandlerThread a() {
        if (f1854a == null) {
            try {
                HandlerThread handlerThread = new HandlerThread("ServiceStartArguments", 10);
                f1854a = handlerThread;
                handlerThread.start();
            } catch (Throwable th) {
                th.printStackTrace();
                f1854a = null;
            }
        }
        return f1854a;
    }
}
