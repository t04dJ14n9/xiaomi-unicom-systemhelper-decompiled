package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends g0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void h(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                g0.a aVar = (g0.a) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    private void w(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    private static int x(View view) {
        int iF = g0.m.f(view);
        if (iF > 0) {
            return iF;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return x(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean y(int i2, int i3) {
        int iCombineMeasuredStates;
        int iX;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == j0.f.O) {
                    view = childAt;
                } else if (id == j0.f.f3102k) {
                    view2 = childAt;
                } else {
                    if ((id != j0.f.f3104m && id != j0.f.f3106o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i2, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            iX = x(view2);
            measuredHeight = view2.getMeasuredHeight() - iX;
            paddingTop += iX;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iX = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingTop;
        if (view2 != null) {
            int i6 = paddingTop - iX;
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                iX += iMin;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(iX, 1073741824));
            paddingTop = i6 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i5, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i2, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i3, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        h(childCount, i3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    @Override // android.support.v7.widget.g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i4 - i2;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int i10 = gravity & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - measuredHeight : getPaddingTop() + (((i5 - i3) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                g0.a aVar = (g0.a) childAt.getLayoutParams();
                int i12 = aVar.f1376b;
                if (i12 < 0) {
                    i12 = i10;
                }
                int iA = g0.d.a(i12, g0.m.e(this)) & 7;
                if (iA != 1) {
                    if (iA != 5) {
                        i7 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        i6 = paddingRight - measuredWidth;
                    }
                    if (p(i11)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i13 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    w(childAt, i7, i13, measuredWidth, measuredHeight2);
                    paddingTop = i13 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                } else {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                }
                i7 = i6 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                if (p(i11)) {
                    paddingTop += intrinsicHeight;
                }
                int i14 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                w(childAt, i7, i14, measuredWidth, measuredHeight2);
                paddingTop = i14 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // android.support.v7.widget.g0, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (y(i2, i3)) {
            return;
        }
        super.onMeasure(i2, i3);
    }
}
