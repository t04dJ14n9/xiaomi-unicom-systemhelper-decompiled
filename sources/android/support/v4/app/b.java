package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static int a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static String b(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
