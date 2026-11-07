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
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class d extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f1321d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f1323c;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.f3039p);
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(q0.b(context), attributeSet, i2);
        t0 t0VarT = t0.t(getContext(), attributeSet, f1321d, i2, 0);
        if (t0VarT.q(0)) {
            setDropDownBackgroundDrawable(t0VarT.f(0));
        }
        t0VarT.u();
        e eVar = new e(this);
        this.f1322b = eVar;
        eVar.e(attributeSet, i2);
        x xVar = new x(this);
        this.f1323c = xVar;
        xVar.k(attributeSet, i2);
        xVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1322b;
        if (eVar != null) {
            eVar.b();
        }
        x xVar = this.f1323c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1322b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1322b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1322b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1322b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.widget.l.j(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(k0.a.b(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1322b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1322b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f1323c;
        if (xVar != null) {
            xVar.n(context, i2);
        }
    }
}
