package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected static <T extends o0.a> void A(T t2, a aVar) {
        try {
            d(t2).getDeclaredMethod("write", t2.getClass(), a.class).invoke(null, t2, aVar);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (!(e5.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
            }
            throw ((RuntimeException) e5.getCause());
        }
    }

    private void C(o0.a aVar) {
        try {
            y(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    private static Class c(Class<? extends o0.a> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }

    private static <T extends o0.a> Class d(T t2) {
        return c(t2.getClass());
    }

    protected static <T extends o0.a> T i(String str, a aVar) {
        try {
            return (T) Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class).invoke(null, aVar);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    protected void B(o0.a aVar) {
        if (aVar == null) {
            y(null);
            return;
        }
        C(aVar);
        a aVarB = b();
        A(aVar, aVarB);
        aVarB.a();
    }

    protected abstract void a();

    protected abstract a b();

    public boolean e() {
        return false;
    }

    protected abstract byte[] f();

    public byte[] g(byte[] bArr, int i2) {
        return !h(i2) ? bArr : f();
    }

    protected abstract boolean h(int i2);

    protected abstract int j();

    public int k(int i2, int i3) {
        return !h(i3) ? i2 : j();
    }

    protected abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t2, int i2) {
        return !h(i2) ? t2 : (T) l();
    }

    protected abstract String n();

    public String o(String str, int i2) {
        return !h(i2) ? str : n();
    }

    protected <T extends o0.a> T p() {
        String strN = n();
        if (strN == null) {
            return null;
        }
        return (T) i(strN, b());
    }

    protected abstract void q(int i2);

    public void r(boolean z2, boolean z3) {
    }

    protected abstract void s(byte[] bArr);

    public void t(byte[] bArr, int i2) {
        q(i2);
        s(bArr);
    }

    protected abstract void u(int i2);

    public void v(int i2, int i3) {
        q(i3);
        u(i2);
    }

    protected abstract void w(Parcelable parcelable);

    public void x(Parcelable parcelable, int i2) {
        q(i2);
        w(parcelable);
    }

    protected abstract void y(String str);

    public void z(String str, int i2) {
        q(i2);
        y(str);
    }
}
