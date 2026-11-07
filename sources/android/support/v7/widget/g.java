package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class g extends CheckBox {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f1359b;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.f3041r);
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(q0.b(context), attributeSet, i2);
        i iVar = new i(this);
        this.f1359b = iVar;
        iVar.e(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f1359b;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f1359b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f1359b;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(k0.a.b(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f1359b;
        if (iVar != null) {
            iVar.f();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f1359b;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f1359b;
        if (iVar != null) {
            iVar.h(mode);
        }
    }
}
