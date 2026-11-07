package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class s0 extends k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f1522b;

    public s0(Context context, Resources resources) {
        super(resources);
        this.f1522b = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.k0, android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Drawable drawable = super.getDrawable(i2);
        Context context = this.f1522b.get();
        if (drawable != null && context != null) {
            j.m();
            j.C(context, i2, drawable);
        }
        return drawable;
    }
}
