package a0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class f8a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Constructor f9b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Method f10c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Method f11d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Method f12e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Method f13f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Method f14g;

    public d() {
        Class clsR;
        Constructor constructorS;
        Method methodO;
        Method methodP;
        Method methodT;
        Method methodN;
        Method methodQ;
        try {
            clsR = r();
            constructorS = s(clsR);
            methodO = o(clsR);
            methodP = p(clsR);
            methodT = t(clsR);
            methodN = n(clsR);
            methodQ = q(clsR);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            clsR = null;
            constructorS = null;
            methodO = null;
            methodP = null;
            methodT = null;
            methodN = null;
            methodQ = null;
        }
        this.f8a = clsR;
        this.f9b = constructorS;
        this.f10c = methodO;
        this.f11d = methodP;
        this.f12e = methodT;
        this.f13f = methodN;
        this.f14g = methodQ;
    }

    private void g(Object obj) {
        try {
            this.f13f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean h(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean i(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f11d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean k(Object obj) {
        try {
            return ((Boolean) this.f12e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean l() {
        if (this.f10c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f10c != null;
    }

    private Object m() {
        try {
            return this.f9b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a0.f
    public Typeface a(Context context, z.a.b bVar, Resources resources, int i2) {
        if (!l()) {
            return super.a(context, bVar, resources, i2);
        }
        Object objM = m();
        for (z.a.c cVar : bVar.a()) {
            if (!h(context, objM, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                g(objM);
                return null;
            }
        }
        if (k(objM)) {
            return j(objM);
        }
        return null;
    }

    @Override // a0.f
    public Typeface b(Context context, CancellationSignal cancellationSignal, d0.b.f[] fVarArr, int i2) {
        if (fVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            d0.b.f fVarF = f(fVarArr, i2);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fVarF.c(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fVarF.d()).setItalic(fVarF.e()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapI = d0.b.i(context, fVarArr, cancellationSignal);
        Object objM = m();
        boolean z2 = false;
        for (d0.b.f fVar : fVarArr) {
            ByteBuffer byteBuffer = mapI.get(fVar.c());
            if (byteBuffer != null) {
                if (!i(objM, byteBuffer, fVar.b(), fVar.d(), fVar.e() ? 1 : 0)) {
                    g(objM);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            g(objM);
            return null;
        }
        if (k(objM)) {
            return Typeface.create(j(objM), i2);
        }
        return null;
    }

    @Override // a0.f
    public Typeface c(Context context, Resources resources, int i2, String str, int i3) {
        if (!l()) {
            return super.c(context, resources, i2, str, i3);
        }
        Object objM = m();
        if (!h(context, objM, str, 0, -1, -1, null)) {
            g(objM);
            return null;
        }
        if (k(objM)) {
            return j(objM);
        }
        return null;
    }

    protected Typeface j(Object obj) {
        throw null;
    }

    protected Method n(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method o(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method p(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method q(Class cls) {
        throw null;
    }

    protected Class r() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor s(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method t(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
