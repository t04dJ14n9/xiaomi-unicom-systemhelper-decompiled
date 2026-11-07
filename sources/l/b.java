package l;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {
    public static int a(Object obj, String str) throws NoSuchMethodException {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return ((Integer) declaredMethod.invoke(obj, null)).intValue();
    }

    public static String b(Context context) {
        String absolutePath;
        if (context != null) {
            try {
                absolutePath = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
            } catch (Exception unused) {
                absolutePath = null;
            }
        } else {
            absolutePath = null;
        }
        if (absolutePath != null) {
            try {
                File file = new File(absolutePath + "/baidu/tempdata");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return absolutePath;
    }

    public static boolean c(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable th) {
            if (a.f3262a) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public static String d(Context context) {
        String strB = b(context);
        if (strB == null) {
            return null;
        }
        return strB + "/baidu/tempdata";
    }
}
