package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends Resources {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f1574b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f1575a;

    public w0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1575a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1574b;
    }

    public static boolean b() {
        a();
        return false;
    }

    final Drawable c(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Context context = this.f1575a.get();
        return context != null ? j.m().y(context, this, i2) : super.getDrawable(i2);
    }
}
