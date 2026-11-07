package m0;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import j0.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3275a;

    private a(Context context) {
        this.f3275a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f3275a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f3275a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f3275a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f3275a.getResources().getDimensionPixelSize(j0.d.f3059b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f3275a.obtainStyledAttributes(null, j.f3151a, j0.a.f3026c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.f3176j, 0);
        Resources resources = this.f3275a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(j0.d.f3058a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f3275a.getResources().getBoolean(j0.b.f3050a);
    }

    public boolean h() {
        return true;
    }
}
