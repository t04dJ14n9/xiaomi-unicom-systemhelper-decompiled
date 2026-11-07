package a0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class f {

    class a implements c<d0.b.f> {
        a() {
        }

        @Override // a0.f.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(d0.b.f fVar) {
            return fVar.d();
        }

        @Override // a0.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(d0.b.f fVar) {
            return fVar.e();
        }
    }

    class b implements c<z.a.c> {
        b() {
        }

        @Override // a0.f.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(z.a.c cVar) {
            return cVar.e();
        }

        @Override // a0.f.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(z.a.c cVar) {
            return cVar.f();
        }
    }

    private interface c<T> {
        int a(T t2);

        boolean b(T t2);
    }

    f() {
    }

    private z.a.c d(z.a.b bVar, int i2) {
        return (z.a.c) e(bVar.a(), i2, new b());
    }

    private static <T> T e(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        T t2 = null;
        int i4 = Integer.MAX_VALUE;
        for (T t3 : tArr) {
            int iAbs = (Math.abs(cVar.a(t3) - i3) * 2) + (cVar.b(t3) == z2 ? 0 : 1);
            if (t2 == null || i4 > iAbs) {
                t2 = t3;
                i4 = iAbs;
            }
        }
        return t2;
    }

    public Typeface a(Context context, z.a.b bVar, Resources resources, int i2) {
        z.a.c cVarD = d(bVar, i2);
        if (cVarD == null) {
            return null;
        }
        return a0.b.c(context, resources, cVarD.b(), cVarD.a(), i2);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, d0.b.f[] fVarArr, int i2) {
        throw null;
    }

    public Typeface c(Context context, Resources resources, int i2, String str, int i3) {
        File fileD = g.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (g.b(fileD, resources, i2)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    protected d0.b.f f(d0.b.f[] fVarArr, int i2) {
        return (d0.b.f) e(fVarArr, i2, new a());
    }
}
