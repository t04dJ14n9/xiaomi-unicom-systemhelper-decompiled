package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class f extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f315b;

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f316p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f317q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f318r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public float f319s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f320t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f321u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public float f322v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public float f323w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f324x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public float f325y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public float f326z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f316p0 = 1.0f;
            this.f317q0 = false;
            this.f318r0 = 0.0f;
            this.f319s0 = 0.0f;
            this.f320t0 = 0.0f;
            this.f321u0 = 0.0f;
            this.f322v0 = 1.0f;
            this.f323w0 = 1.0f;
            this.f324x0 = 0.0f;
            this.f325y0 = 0.0f;
            this.f326z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f316p0 = 1.0f;
            this.f317q0 = false;
            this.f318r0 = 0.0f;
            this.f319s0 = 0.0f;
            this.f320t0 = 0.0f;
            this.f321u0 = 0.0f;
            this.f322v0 = 1.0f;
            this.f323w0 = 1.0f;
            this.f324x0 = 0.0f;
            this.f325y0 = 0.0f;
            this.f326z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.p2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == k.q2) {
                    this.f316p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f316p0);
                } else if (index == k.B2) {
                    this.f318r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f318r0);
                    this.f317q0 = true;
                } else if (index == k.y2) {
                    this.f320t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f320t0);
                } else if (index == k.z2) {
                    this.f321u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f321u0);
                } else if (index == k.x2) {
                    this.f319s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f319s0);
                } else if (index == k.v2) {
                    this.f322v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f322v0);
                } else if (index == k.w2) {
                    this.f323w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f323w0);
                } else if (index == k.r2) {
                    this.f324x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f324x0);
                } else if (index == k.s2) {
                    this.f325y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f325y0);
                } else if (index == k.t2) {
                    this.f326z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f326z0);
                } else if (index == k.u2) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == k.A2) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e getConstraintSet() {
        if (this.f315b == null) {
            this.f315b = new e();
        }
        this.f315b.f(this);
        return this.f315b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }
}
