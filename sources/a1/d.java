package a1;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f36a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f37b = "BaiduApiAuth";

    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return stackTraceElement.getFileName() + "[" + stackTraceElement.getLineNumber() + "]";
    }

    public static void b(String str) {
        if (!f36a || Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        Log.d(f37b, a() + ";" + str);
    }

    public static void c(String str) {
        if (Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        Log.i(f37b, str);
    }

    public static void d(String str) {
        if (!f36a || Thread.currentThread().getStackTrace().length == 0) {
            return;
        }
        Log.e(f37b, a() + ";" + str);
    }
}
