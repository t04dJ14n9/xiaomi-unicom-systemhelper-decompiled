package k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.j;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f3259a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<Object>> f3260b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f3261c = new Object();

    public static ColorStateList a(Context context, int i2) {
        return context.getColorStateList(i2);
    }

    public static Drawable b(Context context, int i2) {
        return j.m().o(context, i2);
    }
}
