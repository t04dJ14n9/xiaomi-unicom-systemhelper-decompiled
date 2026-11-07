package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1180b = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t0 t0VarS = t0.s(context, attributeSet, f1180b);
        setBackgroundDrawable(t0VarS.f(0));
        t0VarS.u();
    }
}
