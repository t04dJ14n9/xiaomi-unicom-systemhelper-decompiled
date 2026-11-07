package r0;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public static String a(byte[] bArr) {
        byte[] bArrA = t0.g.a();
        return new String(t0.c.c(bArrA, bArrA, bArr));
    }

    public static Method b(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
