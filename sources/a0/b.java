package a0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f6a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f0.g<String, Typeface> f7b = new f0.g<>(16);

    public static Typeface a(Context context, CancellationSignal cancellationSignal, d0.b.f[] fVarArr, int i2) {
        return f6a.b(context, cancellationSignal, fVarArr, i2);
    }

    public static Typeface b(Context context, z.a.InterfaceC0048a interfaceC0048a, Resources resources, int i2, int i3, z.b.a aVar, Handler handler, boolean z2) {
        Typeface typefaceA;
        if (interfaceC0048a instanceof z.a.d) {
            z.a.d dVar = (z.a.d) interfaceC0048a;
            boolean z3 = false;
            if (!z2 ? aVar == null : dVar.a() == 0) {
                z3 = true;
            }
            typefaceA = d0.b.g(context, dVar.b(), aVar, handler, z3, z2 ? dVar.c() : -1, i3);
        } else {
            typefaceA = f6a.a(context, (z.a.b) interfaceC0048a, resources, i3);
            if (aVar != null) {
                if (typefaceA != null) {
                    aVar.b(typefaceA, handler);
                } else {
                    aVar.a(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f7b.d(d(resources, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface c(Context context, Resources resources, int i2, String str, int i3) {
        Typeface typefaceC = f6a.c(context, resources, i2, str, i3);
        if (typefaceC != null) {
            f7b.d(d(resources, i2, i3), typefaceC);
        }
        return typefaceC;
    }

    private static String d(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface e(Resources resources, int i2, int i3) {
        return f7b.c(d(resources, i2, i3));
    }
}
