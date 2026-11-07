package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final RectF f1593k = new RectF();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1594l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1595a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1596b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1597c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f1598d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1599e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f1600f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1601g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f1602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f1603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f1604j;

    z(TextView textView) {
        this.f1603i = textView;
        this.f1604j = textView.getContext();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1595a = 0;
        this.f1598d = -1.0f;
        this.f1599e = -1.0f;
        this.f1597c = -1.0f;
        this.f1600f = new int[0];
        this.f1596b = false;
    }

    private StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) l(this.f1603i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1602h, i2).setAlignment(alignment).setLineSpacing(this.f1603i.getLineSpacingExtra(), this.f1603i.getLineSpacingMultiplier()).setIncludePad(this.f1603i.getIncludeFontPadding()).setBreakStrategy(this.f1603i.getBreakStrategy()).setHyphenationFrequency(this.f1603i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i3).setTextDirection(textDirectionHeuristic).build();
    }

    private int e(RectF rectF) {
        int length = this.f1600f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = 1;
        int i3 = length - 1;
        int i4 = 0;
        while (i2 <= i3) {
            int i5 = (i2 + i3) / 2;
            if (w(this.f1600f[i5], rectF)) {
                int i6 = i5 + 1;
                i4 = i2;
                i2 = i6;
            } else {
                i4 = i5 - 1;
                i3 = i4;
            }
        }
        return this.f1600f[i4];
    }

    private Method k(String str) {
        try {
            Method declaredMethod = f1594l.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f1594l.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private <T> T l(Object obj, String str, T t2) {
        try {
            return (T) k(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t2;
        }
    }

    private void r(float f2) {
        if (f2 != this.f1603i.getPaint().getTextSize()) {
            this.f1603i.getPaint().setTextSize(f2);
            boolean zIsInLayout = this.f1603i.isInLayout();
            if (this.f1603i.getLayout() != null) {
                this.f1596b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f1603i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    this.f1603i.forceLayout();
                } else {
                    this.f1603i.requestLayout();
                }
                this.f1603i.invalidate();
            }
        }
    }

    private boolean t() {
        if (x() && this.f1595a == 1) {
            if (!this.f1601g || this.f1600f.length == 0) {
                float fRound = Math.round(this.f1598d);
                int i2 = 1;
                while (Math.round(this.f1597c + fRound) <= Math.round(this.f1599e)) {
                    i2++;
                    fRound += this.f1597c;
                }
                int[] iArr = new int[i2];
                float f2 = this.f1598d;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Math.round(f2);
                    f2 += this.f1597c;
                }
                this.f1600f = b(iArr);
            }
            this.f1596b = true;
        } else {
            this.f1596b = false;
        }
        return this.f1596b;
    }

    private void u(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f1600f = b(iArr);
            v();
        }
    }

    private boolean v() {
        int[] iArr = this.f1600f;
        int length = iArr.length;
        boolean z2 = length > 0;
        this.f1601g = z2;
        if (z2) {
            this.f1595a = 1;
            this.f1598d = iArr[0];
            this.f1599e = iArr[length - 1];
            this.f1597c = -1.0f;
        }
        return z2;
    }

    private boolean w(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1603i.getText();
        TransformationMethod transformationMethod = this.f1603i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1603i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1603i.getMaxLines();
        TextPaint textPaint = this.f1602h;
        if (textPaint == null) {
            this.f1602h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1602h.set(this.f1603i.getPaint());
        this.f1602h.setTextSize(i2);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) l(this.f1603i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean x() {
        return !(this.f1603i instanceof k);
    }

    private void y(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f1595a = 1;
        this.f1598d = f2;
        this.f1599e = f3;
        this.f1597c = f4;
        this.f1601g = false;
    }

    void a() {
        if (m()) {
            if (this.f1596b) {
                if (this.f1603i.getMeasuredHeight() <= 0 || this.f1603i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) l(this.f1603i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f1603i.getMeasuredWidth() - this.f1603i.getTotalPaddingLeft()) - this.f1603i.getTotalPaddingRight();
                int height = (this.f1603i.getHeight() - this.f1603i.getCompoundPaddingBottom()) - this.f1603i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1593k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fE = e(rectF);
                    if (fE != this.f1603i.getTextSize()) {
                        s(0, fE);
                    }
                }
            }
            this.f1596b = true;
        }
    }

    int f() {
        return Math.round(this.f1599e);
    }

    int g() {
        return Math.round(this.f1598d);
    }

    int h() {
        return Math.round(this.f1597c);
    }

    int[] i() {
        return this.f1600f;
    }

    int j() {
        return this.f1595a;
    }

    boolean m() {
        return x() && this.f1595a != 0;
    }

    void n(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f1604j.obtainStyledAttributes(attributeSet, j0.j.f3175i0, i2, 0);
        int i3 = j0.j.f3185n0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f1595a = typedArrayObtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = j0.j.f3183m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i4) ? typedArrayObtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = j0.j.f3179k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i5) ? typedArrayObtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = j0.j.f3177j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = j0.j.f3181l0;
        if (typedArrayObtainStyledAttributes.hasValue(i7) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            u(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!x()) {
            this.f1595a = 0;
            return;
        }
        if (this.f1595a == 1) {
            if (!this.f1601g) {
                DisplayMetrics displayMetrics = this.f1604j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                y(dimension2, dimension3, dimension);
            }
            t();
        }
    }

    void o(int i2, int i3, int i4, int i5) {
        if (x()) {
            DisplayMetrics displayMetrics = this.f1604j.getResources().getDisplayMetrics();
            y(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (t()) {
                a();
            }
        }
    }

    void p(int[] iArr, int i2) {
        if (x()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1604j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f1600f = b(iArrCopyOf);
                if (!v()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1601g = false;
            }
            if (t()) {
                a();
            }
        }
    }

    void q(int i2) {
        if (x()) {
            if (i2 == 0) {
                c();
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = this.f1604j.getResources().getDisplayMetrics();
            y(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (t()) {
                a();
            }
        }
    }

    void s(int i2, float f2) {
        Context context = this.f1604j;
        r(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
