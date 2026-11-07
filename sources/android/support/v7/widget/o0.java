package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1494a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f1495b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f1496c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f1497d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f1498e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f1499f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f1500g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f1501h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f1502i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f1503j = new int[1];

    public static int a(Context context, int i2) {
        ColorStateList colorStateListD = d(context, i2);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f1495b, colorStateListD.getDefaultColor());
        }
        TypedValue typedValueE = e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueE, true);
        return c(context, i2, typedValueE.getFloat());
    }

    public static int b(Context context, int i2) {
        int[] iArr = f1503j;
        iArr[0] = i2;
        t0 t0VarS = t0.s(context, null, iArr);
        try {
            return t0VarS.b(0, 0);
        } finally {
            t0VarS.u();
        }
    }

    static int c(Context context, int i2, float f2) {
        int iB = b(context, i2);
        return a0.a.d(iB, Math.round(Color.alpha(iB) * f2));
    }

    public static ColorStateList d(Context context, int i2) {
        int[] iArr = f1503j;
        iArr[0] = i2;
        t0 t0VarS = t0.s(context, null, iArr);
        try {
            return t0VarS.c(0);
        } finally {
            t0VarS.u();
        }
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f1494a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
