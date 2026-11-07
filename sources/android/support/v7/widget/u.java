package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class u extends SeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f1527b;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.H);
    }

    public u(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        v vVar = new v(this);
        this.f1527b = vVar;
        vVar.c(attributeSet, i2);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1527b.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1527b.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1527b.g(canvas);
    }
}
