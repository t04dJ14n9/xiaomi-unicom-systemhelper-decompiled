package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class h extends CheckedTextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f1377c = {R.attr.checkMark};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f1378b;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(q0.b(context), attributeSet, i2);
        x xVar = new x(this);
        this.f1378b = xVar;
        xVar.k(attributeSet, i2);
        xVar.b();
        t0 t0VarT = t0.t(getContext(), attributeSet, f1377c, i2, 0);
        setCheckMarkDrawable(t0VarT.f(0));
        t0VarT.u();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1378b;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(k0.a.b(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.widget.l.j(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f1378b;
        if (xVar != null) {
            xVar.n(context, i2);
        }
    }
}
