package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f1184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f1185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f1186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f1187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f1188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TypedValue f1189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f1190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f1191i;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1190h = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.f1190h.set(i2, i3, i4, i5);
        if (g0.m.l(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1188f == null) {
            this.f1188f = new TypedValue();
        }
        return this.f1188f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1189g == null) {
            this.f1189g = new TypedValue();
        }
        return this.f1189g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1186d == null) {
            this.f1186d = new TypedValue();
        }
        return this.f1186d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1187e == null) {
            this.f1187e = new TypedValue();
        }
        return this.f1187e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1184b == null) {
            this.f1184b = new TypedValue();
        }
        return this.f1184b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1185c == null) {
            this.f1185c = new TypedValue();
        }
        return this.f1185c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1191i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1191i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        float fraction;
        int i6;
        int i7;
        float fraction2;
        int i8;
        int i9;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue = z4 ? this.f1187e : this.f1186d;
            if (typedValue == null || (i8 = typedValue.type) == 0) {
                z2 = false;
            } else {
                if (i8 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i8 == 6) {
                        int i10 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i10, i10);
                    } else {
                        i9 = 0;
                    }
                    if (i9 > 0) {
                        Rect rect = this.f1190h;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.left + rect.right), View.MeasureSpec.getSize(i2)), 1073741824);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                i9 = (int) fraction3;
                if (i9 > 0) {
                    Rect rect2 = this.f1190h;
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i2)), 1073741824);
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z4 ? this.f1188f : this.f1189g;
            if (typedValue2 != null && (i6 = typedValue2.type) != 0) {
                if (i6 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i6 == 6) {
                        int i11 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i11, i11);
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        Rect rect3 = this.f1190h;
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i7 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                    }
                }
                i7 = (int) fraction2;
                if (i7 > 0) {
                    Rect rect4 = this.f1190h;
                    i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i7 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                }
            }
        }
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z2 || mode != Integer.MIN_VALUE) {
            z3 = false;
        } else {
            TypedValue typedValue3 = z4 ? this.f1185c : this.f1184b;
            if (typedValue3 == null || (i4 = typedValue3.type) == 0) {
                z3 = false;
            } else {
                if (i4 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i4 == 6) {
                        int i12 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i12, i12);
                    } else {
                        i5 = 0;
                    }
                    if (i5 > 0) {
                        Rect rect5 = this.f1190h;
                        i5 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i5) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else {
                        z3 = false;
                    }
                }
                i5 = (int) fraction;
                if (i5 > 0) {
                    Rect rect6 = this.f1190h;
                    i5 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i5) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                } else {
                    z3 = false;
                }
            }
        }
        if (z3) {
            super.onMeasure(iMakeMeasureSpec, i3);
        }
    }

    public void setAttachListener(a aVar) {
        this.f1191i = aVar;
    }
}
