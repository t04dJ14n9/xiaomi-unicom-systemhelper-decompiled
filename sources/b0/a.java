package b0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void b(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void c(Drawable drawable, boolean z2) {
        drawable.setAutoMirrored(z2);
    }

    public static void d(Drawable drawable, float f2, float f3) {
        drawable.setHotspot(f2, f3);
    }

    public static void e(Drawable drawable, int i2, int i3, int i4, int i5) {
        drawable.setHotspotBounds(i2, i3, i4, i5);
    }

    public static boolean f(Drawable drawable, int i2) {
        return drawable.setLayoutDirection(i2);
    }

    public static void g(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    public static void h(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void i(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static Drawable j(Drawable drawable) {
        return drawable;
    }
}
