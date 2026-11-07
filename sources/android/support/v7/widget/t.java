package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class t extends RatingBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f1523b;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.F);
    }

    public t(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r rVar = new r(this);
        this.f1523b = rVar;
        rVar.c(attributeSet, i2);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmapB = this.f1523b.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
