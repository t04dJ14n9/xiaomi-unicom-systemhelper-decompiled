package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.f0;
import android.support.v7.widget.v0;
import android.support.v7.widget.y;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends y implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    e.b f927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f0 f928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    b f929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f934o;

    private class a extends f0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.f0
        public n0.h b() {
            b bVar = ActionMenuItemView.this.f929j;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // android.support.v7.widget.f0
        protected boolean c() {
            n0.h hVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f927h;
            return bVar != null && bVar.a(actionMenuItemView.f924e) && (hVarB = b()) != null && hVarB.h();
        }
    }

    public static abstract class b {
        public abstract n0.h a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f930k = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.j.f3200v, i2, 0);
        this.f932m = typedArrayObtainStyledAttributes.getDimensionPixelSize(j0.j.f3202w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f934o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f933n = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f925f);
        if (this.f926g != null && (!this.f924e.B() || (!this.f930k && !this.f931l))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f925f : null);
        CharSequence contentDescription = this.f924e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z4 ? null : this.f924e.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f924e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            v0.a(this, z4 ? null : this.f924e.getTitle());
        } else {
            v0.a(this, tooltipText);
        }
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // android.support.v7.view.menu.k.a
    public void b(g gVar, int i2) {
        this.f924e = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f928i == null) {
            this.f928i = new a();
        }
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean c() {
        return f() && this.f924e.getIcon() == null;
    }

    @Override // android.support.v7.view.menu.k.a
    public boolean d() {
        return true;
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.support.v7.view.menu.k.a
    public g getItemData() {
        return this.f924e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f927h;
        if (bVar != null) {
            bVar.a(this.f924e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f930k = g();
        h();
    }

    @Override // android.support.v7.widget.y, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean zF = f();
        if (zF && (i4 = this.f933n) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f932m) : this.f932m;
        if (mode != 1073741824 && this.f932m > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (zF || this.f926g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f926g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        if (this.f924e.hasSubMenu() && (f0Var = this.f928i) != null && f0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f931l != z2) {
            this.f931l = z2;
            g gVar = this.f924e;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f926g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f934o;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f927h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f933n = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f929j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f925f = charSequence;
        h();
    }
}
