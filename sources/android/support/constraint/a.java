package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v.a f199m;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    private void p(v.e eVar, int i2, boolean z2) {
        this.f198l = i2;
        if (z2) {
            int i3 = this.f197k;
            if (i3 == 5) {
                this.f198l = 1;
            } else if (i3 == 6) {
                this.f198l = 0;
            }
        } else {
            int i4 = this.f197k;
            if (i4 == 5) {
                this.f198l = 0;
            } else if (i4 == 6) {
                this.f198l = 1;
            }
        }
        if (eVar instanceof v.a) {
            ((v.a) eVar).j1(this.f198l);
        }
    }

    public int getMargin() {
        return this.f199m.f1();
    }

    public int getType() {
        return this.f197k;
    }

    @Override // android.support.constraint.c
    protected void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f199m = new v.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f332a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == k.j1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == k.i1) {
                    this.f199m.i1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.k1) {
                    this.f199m.k1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f219e = this.f199m;
        n();
    }

    @Override // android.support.constraint.c
    public void i(v.e eVar, boolean z2) {
        p(eVar, this.f197k, z2);
    }

    public boolean o() {
        return this.f199m.d1();
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f199m.i1(z2);
    }

    public void setDpMargin(int i2) {
        this.f199m.k1((int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i2) {
        this.f199m.k1(i2);
    }

    public void setType(int i2) {
        this.f197k = i2;
    }
}
