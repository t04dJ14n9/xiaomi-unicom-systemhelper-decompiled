package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import j0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: android.support.v7.app.a$a, reason: collision with other inner class name */
    public static class C0007a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f809a;

        public C0007a(int i2, int i3) {
            super(i2, i3);
            this.f809a = 8388627;
        }

        public C0007a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f809a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3196t);
            this.f809a = typedArrayObtainStyledAttributes.getInt(j.f3198u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0007a(C0007a c0007a) {
            super((ViewGroup.MarginLayoutParams) c0007a);
            this.f809a = 0;
            this.f809a = c0007a.f809a;
        }

        public C0007a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f809a = 0;
        }
    }

    public interface b {
        void a(boolean z2);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z2);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract void l(Configuration configuration);

    void m() {
    }

    public abstract boolean n(int i2, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z2);

    public abstract void r(boolean z2);

    public abstract void s(CharSequence charSequence);

    public abstract m0.b t(m0.b.a aVar);
}
