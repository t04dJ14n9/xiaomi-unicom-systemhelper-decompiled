package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.t0;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RadioButton f941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CheckBox f943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LinearLayout f947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private LayoutInflater f955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f956s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.C);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        t0 t0VarT = t0.t(getContext(), attributeSet, j0.j.P1, i2, 0);
        this.f948k = t0VarT.f(j0.j.R1);
        this.f949l = t0VarT.m(j0.j.Q1, -1);
        this.f951n = t0VarT.a(j0.j.S1, false);
        this.f950m = context;
        this.f952o = t0VarT.f(j0.j.T1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, j0.a.f3049z, 0);
        this.f953p = typedArrayObtainStyledAttributes.hasValue(0);
        t0VarT.u();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        c(view, -1);
    }

    private void c(View view, int i2) {
        LinearLayout linearLayout = this.f947j;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(j0.g.f3125h, (ViewGroup) this, false);
        this.f943f = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(j0.g.f3126i, (ViewGroup) this, false);
        this.f940c = imageView;
        c(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(j0.g.f3128k, (ViewGroup) this, false);
        this.f941d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f955r == null) {
            this.f955r = LayoutInflater.from(getContext());
        }
        return this.f955r;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f945h;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f946i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f946i.getLayoutParams();
        rect.top += this.f946i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.support.v7.view.menu.k.a
    public void b(g gVar, int i2) {
        this.f939b = gVar;
        this.f954q = i2;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // android.support.v7.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // android.support.v7.view.menu.k.a
    public g getItemData() {
        return this.f939b;
    }

    public void h(boolean z2, char c2) {
        int i2 = (z2 && this.f939b.A()) ? 0 : 8;
        if (i2 == 0) {
            this.f944g.setText(this.f939b.h());
        }
        if (this.f944g.getVisibility() != i2) {
            this.f944g.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        g0.m.s(this, this.f948k);
        TextView textView = (TextView) findViewById(j0.f.L);
        this.f942e = textView;
        int i2 = this.f949l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f950m, i2);
        }
        this.f944g = (TextView) findViewById(j0.f.E);
        ImageView imageView = (ImageView) findViewById(j0.f.H);
        this.f945h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f952o);
        }
        this.f946i = (ImageView) findViewById(j0.f.f3109r);
        this.f947j = (LinearLayout) findViewById(j0.f.f3103l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f940c != null && this.f951n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f940c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f941d == null && this.f943f == null) {
            return;
        }
        if (this.f939b.m()) {
            if (this.f941d == null) {
                g();
            }
            compoundButton = this.f941d;
            view = this.f943f;
        } else {
            if (this.f943f == null) {
                e();
            }
            compoundButton = this.f943f;
            view = this.f941d;
        }
        if (z2) {
            compoundButton.setChecked(this.f939b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f943f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f941d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f939b.m()) {
            if (this.f941d == null) {
                g();
            }
            compoundButton = this.f941d;
        } else {
            if (this.f943f == null) {
                e();
            }
            compoundButton = this.f943f;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f956s = z2;
        this.f951n = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f946i;
        if (imageView != null) {
            imageView.setVisibility((this.f953p || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z2 = this.f939b.z() || this.f956s;
        if (z2 || this.f951n) {
            ImageView imageView = this.f940c;
            if (imageView == null && drawable == null && !this.f951n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f951n) {
                this.f940c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f940c;
            if (!z2) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f940c.getVisibility() != 0) {
                this.f940c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f942e.getVisibility() != 8) {
                this.f942e.setVisibility(8);
            }
        } else {
            this.f942e.setText(charSequence);
            if (this.f942e.getVisibility() != 0) {
                this.f942e.setVisibility(0);
            }
        }
    }
}
