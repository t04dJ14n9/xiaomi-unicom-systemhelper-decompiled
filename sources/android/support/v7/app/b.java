package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public class b extends i0.c implements DialogInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AlertController f810d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f812b;

        public a(Context context) {
            this(context, b.g(context, 0));
        }

        public a(Context context, int i2) {
            this.f811a = new AlertController.b(new ContextThemeWrapper(context, b.g(context, i2)));
            this.f812b = i2;
        }

        public b a() {
            b bVar = new b(this.f811a.f761a, this.f812b);
            this.f811a.a(bVar.f810d);
            bVar.setCancelable(this.f811a.f778r);
            if (this.f811a.f778r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f811a.f779s);
            bVar.setOnDismissListener(this.f811a.f780t);
            DialogInterface.OnKeyListener onKeyListener = this.f811a.f781u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f811a.f761a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f811a;
            bVar.f783w = listAdapter;
            bVar.f784x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f811a.f767g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f811a.f764d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f811a.f781u = onKeyListener;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.f811a.f766f = charSequence;
            return this;
        }
    }

    protected b(Context context, int i2) {
        super(context, g(context, i2));
        this.f810d = new AlertController(getContext(), this, getWindow());
    }

    static int g(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(j0.a.f3038o, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // i0.c, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f810d.d();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f810d.e(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f810d.f(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // i0.c, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f810d.o(charSequence);
    }
}
