package g1;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Method b(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Object c(Method method, Object obj, Object... objArr) {
        try {
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
