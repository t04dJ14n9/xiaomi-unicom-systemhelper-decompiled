package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f1525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f1526c;

    private t0(Context context, TypedArray typedArray) {
        this.f1524a = context;
        this.f1525b = typedArray;
    }

    public static t0 r(Context context, int i2, int[] iArr) {
        return new t0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static t0 s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static t0 t(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z2) {
        return this.f1525b.getBoolean(i2, z2);
    }

    public int b(int i2, int i3) {
        return this.f1525b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f1525b.hasValue(i2) || (resourceId = this.f1525b.getResourceId(i2, 0)) == 0 || (colorStateListA = k0.a.a(this.f1524a, resourceId)) == null) ? this.f1525b.getColorStateList(i2) : colorStateListA;
    }

    public int d(int i2, int i3) {
        return this.f1525b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.f1525b.getDimensionPixelSize(i2, i3);
    }

    public Drawable f(int i2) {
        int resourceId;
        return (!this.f1525b.hasValue(i2) || (resourceId = this.f1525b.getResourceId(i2, 0)) == 0) ? this.f1525b.getDrawable(i2) : k0.a.b(this.f1524a, resourceId);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.f1525b.hasValue(i2) || (resourceId = this.f1525b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return j.m().p(this.f1524a, resourceId, true);
    }

    public float h(int i2, float f2) {
        return this.f1525b.getFloat(i2, f2);
    }

    public Typeface i(int i2, int i3, z.b.a aVar) {
        int resourceId = this.f1525b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1526c == null) {
            this.f1526c = new TypedValue();
        }
        return z.b.a(this.f1524a, resourceId, this.f1526c, i3, aVar);
    }

    public int j(int i2, int i3) {
        return this.f1525b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.f1525b.getInteger(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f1525b.getLayoutDimension(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.f1525b.getResourceId(i2, i3);
    }

    public String n(int i2) {
        return this.f1525b.getString(i2);
    }

    public CharSequence o(int i2) {
        return this.f1525b.getText(i2);
    }

    public CharSequence[] p(int i2) {
        return this.f1525b.getTextArray(i2);
    }

    public boolean q(int i2) {
        return this.f1525b.hasValue(i2);
    }

    public void u() {
        this.f1525b.recycle();
    }
}
