package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class i extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f329d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f328c == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f328c.getLayoutParams();
        bVar2.f174n0.T0(0);
        v.e.b bVarY = bVar.f174n0.y();
        v.e.b bVar3 = v.e.b.FIXED;
        if (bVarY != bVar3) {
            bVar.f174n0.U0(bVar2.f174n0.R());
        }
        if (bVar.f174n0.O() != bVar3) {
            bVar.f174n0.v0(bVar2.f174n0.v());
        }
        bVar2.f174n0.T0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f327b == -1 && !isInEditMode()) {
            setVisibility(this.f329d);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f327b);
        this.f328c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f150b0 = true;
            this.f328c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f328c;
    }

    public int getEmptyVisibility() {
        return this.f329d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View viewFindViewById;
        if (this.f327b == i2) {
            return;
        }
        View view = this.f328c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f328c.getLayoutParams()).f150b0 = false;
            this.f328c = null;
        }
        this.f327b = i2;
        if (i2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f329d = i2;
    }
}
