package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected v.h f219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View[] f223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HashMap<Integer, String> f224j;

    public c(Context context) {
        super(context);
        this.f216b = new int[32];
        this.f220f = false;
        this.f223i = null;
        this.f224j = new HashMap<>();
        this.f218d = context;
        h(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f218d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iG = g(strTrim);
        if (iG != 0) {
            this.f224j.put(Integer.valueOf(iG), strTrim);
            b(iG);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f217c + 1;
        int[] iArr = this.f216b;
        if (i3 > iArr.length) {
            this.f216b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f216b;
        int i4 = this.f217c;
        iArr2[i4] = i2;
        this.f217c = i4 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f218d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f218d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iF = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iF = ((Integer) objF).intValue();
            }
        }
        if (iF == 0 && constraintLayout != null) {
            iF = f(constraintLayout, str);
        }
        if (iF == 0) {
            try {
                iF = j.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iF == 0 ? this.f218d.getResources().getIdentifier(str, "id", this.f218d.getPackageName()) : iF;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f217c; i2++) {
            View viewH = constraintLayout.h(this.f216b[i2]);
            if (viewH != null) {
                viewH.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f216b, this.f217c);
    }

    protected void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f332a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == k.m1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f221g = string;
                    setIds(string);
                } else if (index == k.n1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f222h = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void i(v.e eVar, boolean z2) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
        String str;
        int iF;
        if (isInEditMode()) {
            setIds(this.f221g);
        }
        v.h hVar = this.f219e;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i2 = 0; i2 < this.f217c; i2++) {
            int i3 = this.f216b[i2];
            View viewH = constraintLayout.h(i3);
            if (viewH == null && (iF = f(constraintLayout, (str = this.f224j.get(Integer.valueOf(i3))))) != 0) {
                this.f216b[i2] = iF;
                this.f224j.put(Integer.valueOf(iF), str);
                viewH = constraintLayout.h(iF);
            }
            if (viewH != null) {
                this.f219e.a(constraintLayout.i(viewH));
            }
        }
        this.f219e.c(constraintLayout.f125d);
    }

    public void n() {
        if (this.f219e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f174n0 = (v.e) this.f219e;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f221g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f222h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f220f) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f221g = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f217c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f222h = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f217c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                c(str.substring(i2));
                return;
            } else {
                c(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f221g = null;
        this.f217c = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f221g == null) {
            b(i2);
        }
    }
}
