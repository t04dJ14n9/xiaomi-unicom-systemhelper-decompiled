package android.support.constraint;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f390l;

    @Override // android.support.constraint.c
    protected void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f332a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == k.f338c1) {
                    this.f389k = true;
                } else if (index == k.h1) {
                    this.f390l = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void o(v.k kVar, int i2, int i3) {
    }

    @Override // android.support.constraint.c, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f389k || this.f390l) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f217c; i2++) {
                View viewH = constraintLayout.h(this.f216b[i2]);
                if (viewH != null) {
                    if (this.f389k) {
                        viewH.setVisibility(visibility);
                    }
                    if (this.f390l && elevation > 0.0f) {
                        viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        d();
    }
}
