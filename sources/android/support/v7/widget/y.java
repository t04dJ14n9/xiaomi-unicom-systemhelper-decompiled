package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class y extends TextView implements android.support.v4.widget.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f1591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future<e0.a> f1592d;

    public y(Context context) {
        this(context, null);
    }

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public y(Context context, AttributeSet attributeSet, int i2) {
        super(q0.b(context), attributeSet, i2);
        e eVar = new e(this);
        this.f1590b = eVar;
        eVar.e(attributeSet, i2);
        x xVar = new x(this);
        this.f1591c = xVar;
        xVar.k(attributeSet, i2);
        xVar.b();
    }

    private void e() {
        Future<e0.a> future = this.f1592d;
        if (future != null) {
            try {
                this.f1592d = null;
                android.support.v4.widget.l.h(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1590b;
        if (eVar != null) {
            eVar.b();
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (android.support.v4.widget.b.f716a) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            return xVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (android.support.v4.widget.b.f716a) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            return xVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (android.support.v4.widget.b.f716a) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            return xVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (android.support.v4.widget.b.f716a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.f1591c;
        return xVar != null ? xVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (android.support.v4.widget.b.f716a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            return xVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return android.support.v4.widget.l.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return android.support.v4.widget.l.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1590b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1590b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    public e0.a.C0024a getTextMetricsParamsCompat() {
        return android.support.v4.widget.l.d(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        x xVar = this.f1591c;
        if (xVar != null) {
            xVar.m(z2, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        e();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        x xVar = this.f1591c;
        if (xVar == null || android.support.v4.widget.b.f716a || !xVar.j()) {
            return;
        }
        this.f1591c.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (android.support.v4.widget.b.f716a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            xVar.p(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (android.support.v4.widget.b.f716a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            xVar.q(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (android.support.v4.widget.b.f716a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            xVar.r(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1590b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1590b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.widget.l.j(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        super.setFirstBaselineToTopHeight(i2);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        super.setLastBaselineToBottomHeight(i2);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        android.support.v4.widget.l.g(this, i2);
    }

    public void setPrecomputedText(e0.a aVar) {
        android.support.v4.widget.l.h(this, aVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1590b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1590b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f1591c;
        if (xVar != null) {
            xVar.n(context, i2);
        }
    }

    public void setTextFuture(Future<e0.a> future) {
        this.f1592d = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(e0.a.C0024a c0024a) {
        android.support.v4.widget.l.i(this, c0024a);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (android.support.v4.widget.b.f716a) {
            super.setTextSize(i2, f2);
            return;
        }
        x xVar = this.f1591c;
        if (xVar != null) {
            xVar.s(i2, f2);
        }
    }
}
