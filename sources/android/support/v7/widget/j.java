package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static j f1418h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, f0.l<ColorStateList>> f1426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0.a<String, b> f1427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0.l<String> f1428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, f0.f<WeakReference<Drawable.ConstantState>>> f1429d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f1430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final PorterDuff.Mode f1417g = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f1419i = new a(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f1420j = {j0.e.Q, j0.e.O, j0.e.f3066a};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f1421k = {j0.e.f3078m, j0.e.f3091z, j0.e.f3083r, j0.e.f3079n, j0.e.f3080o, j0.e.f3082q, j0.e.f3081p};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f1422l = {j0.e.N, j0.e.P, j0.e.f3074i, j0.e.G, j0.e.H, j0.e.J, j0.e.L, j0.e.I, j0.e.K, j0.e.M};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f1423m = {j0.e.f3086u, j0.e.f3072g, j0.e.f3085t};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f1424n = {j0.e.F, j0.e.R};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f1425o = {j0.e.f3068c, j0.e.f3071f};

    private static class a extends f0.g<Integer, PorterDuffColorFilter> {
        public a(int i2) {
            super(i2);
        }

        private static int h(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i2, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i2, mode)));
        }

        PorterDuffColorFilter j(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i2, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    private Drawable A(Context context, int i2, boolean z2, Drawable drawable) {
        ColorStateList colorStateListR = r(context, i2);
        if (colorStateListR != null) {
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawableJ = b0.a.j(drawable);
            b0.a.h(drawableJ, colorStateListR);
            PorterDuff.Mode modeT = t(i2);
            if (modeT == null) {
                return drawableJ;
            }
            b0.a.i(drawableJ, modeT);
            return drawableJ;
        }
        if (i2 == j0.e.A) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
            int i3 = j0.a.f3046w;
            int iB = o0.b(context, i3);
            PorterDuff.Mode mode = f1417g;
            z(drawableFindDrawableByLayerId, iB, mode);
            z(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), o0.b(context, i3), mode);
            z(layerDrawable.findDrawableByLayerId(R.id.progress), o0.b(context, j0.a.f3044u), mode);
            return drawable;
        }
        if (i2 != j0.e.f3088w && i2 != j0.e.f3087v && i2 != j0.e.f3089x) {
            if (C(context, i2, drawable) || !z2) {
                return drawable;
            }
            return null;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
        int iA = o0.a(context, j0.a.f3046w);
        PorterDuff.Mode mode2 = f1417g;
        z(drawableFindDrawableByLayerId2, iA, mode2);
        Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
        int i4 = j0.a.f3044u;
        z(drawableFindDrawableByLayerId3, o0.b(context, i4), mode2);
        z(layerDrawable2.findDrawableByLayerId(R.id.progress), o0.b(context, i4), mode2);
        return drawable;
    }

    static void B(Drawable drawable, r0 r0Var, int[] iArr) {
        if (c0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = r0Var.f1519d;
        if (z2 || r0Var.f1518c) {
            drawable.setColorFilter(l(z2 ? r0Var.f1516a : null, r0Var.f1518c ? r0Var.f1517b : f1417g, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[RETURN] */
    static boolean C(Context context, int i2, Drawable drawable) {
        int i3;
        boolean z2;
        int iRound;
        PorterDuff.Mode mode = f1417g;
        if (!c(f1420j, i2)) {
            if (c(f1422l, i2)) {
                i3 = j0.a.f3044u;
            } else {
                if (c(f1423m, i2)) {
                    mode = PorterDuff.Mode.MULTIPLY;
                } else if (i2 == j0.e.f3084s) {
                    z2 = true;
                    iRound = Math.round(40.8f);
                    i3 = 16842800;
                    mode = mode;
                } else if (i2 != j0.e.f3075j) {
                    i3 = 0;
                    z2 = false;
                    iRound = -1;
                }
                mode = mode;
                iRound = -1;
                i3 = 16842801;
                z2 = true;
            }
            if (z2) {
                return false;
            }
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(q(o0.b(context, i3), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }
        i3 = j0.a.f3046w;
        z2 = true;
        iRound = -1;
        if (z2) {
            return false;
        }
        if (c0.a(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(q(o0.b(context, i3), mode));
        if (iRound != -1) {
            drawable.setAlpha(iRound);
        }
        return true;
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        f0.f<WeakReference<Drawable.ConstantState>> fVar = this.f1429d.get(context);
        if (fVar == null) {
            fVar = new f0.f<>();
            this.f1429d.put(context, fVar);
        }
        fVar.h(j2, new WeakReference<>(constantState));
        return true;
    }

    private void b(Context context, int i2, ColorStateList colorStateList) {
        if (this.f1426a == null) {
            this.f1426a = new WeakHashMap<>();
        }
        f0.l<ColorStateList> lVar = this.f1426a.get(context);
        if (lVar == null) {
            lVar = new f0.l<>();
            this.f1426a.put(context, lVar);
        }
        lVar.a(i2, colorStateList);
    }

    private static boolean c(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void d(Context context) {
        if (this.f1431f) {
            return;
        }
        this.f1431f = true;
        Drawable drawableO = o(context, j0.e.S);
        if (drawableO == null || !v(drawableO)) {
            this.f1431f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private ColorStateList e(Context context) {
        return f(context, 0);
    }

    private ColorStateList f(Context context, int i2) {
        int iB = o0.b(context, j0.a.f3045v);
        return new ColorStateList(new int[][]{o0.f1495b, o0.f1498e, o0.f1496c, o0.f1502i}, new int[]{o0.a(context, j0.a.f3043t), a0.a.b(iB, i2), a0.a.b(iB, i2), i2});
    }

    private static long g(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private ColorStateList h(Context context) {
        return f(context, o0.b(context, j0.a.f3042s));
    }

    private ColorStateList i(Context context) {
        return f(context, o0.b(context, j0.a.f3043t));
    }

    private Drawable j(Context context, int i2) {
        if (this.f1430e == null) {
            this.f1430e = new TypedValue();
        }
        TypedValue typedValue = this.f1430e;
        context.getResources().getValue(i2, typedValue, true);
        long jG = g(typedValue);
        Drawable drawableN = n(context, jG);
        if (drawableN != null) {
            return drawableN;
        }
        if (i2 == j0.e.f3073h) {
            drawableN = new LayerDrawable(new Drawable[]{o(context, j0.e.f3072g), o(context, j0.e.f3074i)});
        }
        if (drawableN != null) {
            drawableN.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jG, drawableN);
        }
        return drawableN;
    }

    private ColorStateList k(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        int i2 = j0.a.f3047x;
        ColorStateList colorStateListD = o0.d(context, i2);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = o0.f1495b;
            iArr2[0] = o0.a(context, i2);
            iArr[1] = o0.f1499f;
            iArr2[1] = o0.b(context, j0.a.f3044u);
            iArr[2] = o0.f1502i;
            iArr2[2] = o0.b(context, i2);
        } else {
            int[] iArr3 = o0.f1495b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = o0.f1499f;
            iArr2[1] = o0.b(context, j0.a.f3044u);
            iArr[2] = o0.f1502i;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private static PorterDuffColorFilter l(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return q(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized j m() {
        if (f1418h == null) {
            j jVar = new j();
            f1418h = jVar;
            u(jVar);
        }
        return f1418h;
    }

    private synchronized Drawable n(Context context, long j2) {
        f0.f<WeakReference<Drawable.ConstantState>> fVar = this.f1429d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceE = fVar.e(j2);
        if (weakReferenceE != null) {
            Drawable.ConstantState constantState = weakReferenceE.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.c(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter q(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterI;
        a aVar = f1419i;
        porterDuffColorFilterI = aVar.i(i2, mode);
        if (porterDuffColorFilterI == null) {
            porterDuffColorFilterI = new PorterDuffColorFilter(i2, mode);
            aVar.j(i2, mode, porterDuffColorFilterI);
        }
        return porterDuffColorFilterI;
    }

    private ColorStateList s(Context context, int i2) {
        f0.l<ColorStateList> lVar;
        WeakHashMap<Context, f0.l<ColorStateList>> weakHashMap = this.f1426a;
        if (weakHashMap == null || (lVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return lVar.f(i2);
    }

    static PorterDuff.Mode t(int i2) {
        if (i2 == j0.e.D) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    private static void u(j jVar) {
    }

    private static boolean v(Drawable drawable) {
        return (drawable instanceof x.b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable w(Context context, int i2) {
        int next;
        f0.a<String, b> aVar = this.f1427b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        f0.l<String> lVar = this.f1428c;
        if (lVar != null) {
            String strF = lVar.f(i2);
            if ("appcompat_skip_skip".equals(strF) || (strF != null && this.f1427b.get(strF) == null)) {
                return null;
            }
        } else {
            this.f1428c = new f0.l<>();
        }
        if (this.f1430e == null) {
            this.f1430e = new TypedValue();
        }
        TypedValue typedValue = this.f1430e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jG = g(typedValue);
        Drawable drawableN = n(context, jG);
        if (drawableN != null) {
            return drawableN;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1428c.a(i2, name);
                b bVar = this.f1427b.get(name);
                if (bVar != null) {
                    drawableN = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableN != null) {
                    drawableN.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jG, drawableN);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (drawableN == null) {
            this.f1428c.a(i2, "appcompat_skip_skip");
        }
        return drawableN;
    }

    private static void z(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (c0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1417g;
        }
        drawable.setColorFilter(q(i2, mode));
    }

    public synchronized Drawable o(Context context, int i2) {
        return p(context, i2, false);
    }

    synchronized Drawable p(Context context, int i2, boolean z2) {
        Drawable drawableW;
        d(context);
        drawableW = w(context, i2);
        if (drawableW == null) {
            drawableW = j(context, i2);
        }
        if (drawableW == null) {
            drawableW = y.a.b(context, i2);
        }
        if (drawableW != null) {
            drawableW = A(context, i2, z2, drawableW);
        }
        if (drawableW != null) {
            c0.b(drawableW);
        }
        return drawableW;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0078 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:8:0x000d, B:43:0x0078, B:9:0x0013, B:11:0x0017, B:12:0x001a, B:14:0x001e, B:15:0x0023, B:17:0x0027, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:23:0x0039, B:24:0x003e, B:26:0x0042, B:29:0x0047, B:31:0x004f, B:32:0x0056, B:34:0x005e, B:35:0x0061, B:37:0x0069, B:38:0x006c, B:40:0x0070, B:41:0x0073), top: B:49:0x0001 }] */
    synchronized ColorStateList r(Context context, int i2) {
        ColorStateList colorStateListS;
        int i3;
        colorStateListS = s(context, i2);
        if (colorStateListS == null) {
            if (i2 == j0.e.f3076k) {
                i3 = j0.c.f3054d;
            } else if (i2 == j0.e.E) {
                i3 = j0.c.f3057g;
            } else {
                if (i2 == j0.e.D) {
                    colorStateListS = k(context);
                } else if (i2 == j0.e.f3070e) {
                    colorStateListS = i(context);
                } else if (i2 == j0.e.f3067b) {
                    colorStateListS = e(context);
                } else if (i2 == j0.e.f3069d) {
                    colorStateListS = h(context);
                } else if (i2 == j0.e.B || i2 == j0.e.C) {
                    i3 = j0.c.f3056f;
                } else if (c(f1421k, i2)) {
                    colorStateListS = o0.d(context, j0.a.f3046w);
                } else if (c(f1424n, i2)) {
                    i3 = j0.c.f3053c;
                } else if (c(f1425o, i2)) {
                    i3 = j0.c.f3052b;
                } else if (i2 == j0.e.f3090y) {
                    i3 = j0.c.f3055e;
                }
                if (colorStateListS != null) {
                    b(context, i2, colorStateListS);
                }
            }
            colorStateListS = k0.a.a(context, i3);
            if (colorStateListS != null) {
                b(context, i2, colorStateListS);
            }
        }
        return colorStateListS;
    }

    public synchronized void x(Context context) {
        f0.f<WeakReference<Drawable.ConstantState>> fVar = this.f1429d.get(context);
        if (fVar != null) {
            fVar.a();
        }
    }

    synchronized Drawable y(Context context, w0 w0Var, int i2) {
        Drawable drawableW = w(context, i2);
        if (drawableW == null) {
            drawableW = w0Var.c(i2);
        }
        if (drawableW == null) {
            return null;
        }
        return A(context, i2, false, drawableW);
    }
}
