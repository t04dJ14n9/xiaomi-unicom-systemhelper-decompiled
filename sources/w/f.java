package w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f3961d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3964g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f3958a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3959b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3960c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f3962e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f3965h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f3966i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3967j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<d> f3968k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<f> f3969l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f3961d = pVar;
    }

    @Override // w.d
    public void a(d dVar) {
        Iterator<f> it = this.f3969l.iterator();
        while (it.hasNext()) {
            if (!it.next().f3967j) {
                return;
            }
        }
        this.f3960c = true;
        d dVar2 = this.f3958a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f3959b) {
            this.f3961d.a(this);
            return;
        }
        f fVar = null;
        int i2 = 0;
        for (f fVar2 : this.f3969l) {
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f3967j) {
            g gVar = this.f3966i;
            if (gVar != null) {
                if (!gVar.f3967j) {
                    return;
                } else {
                    this.f3963f = this.f3965h * gVar.f3964g;
                }
            }
            d(fVar.f3964g + this.f3963f);
        }
        d dVar3 = this.f3958a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f3968k.add(dVar);
        if (this.f3967j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f3969l.clear();
        this.f3968k.clear();
        this.f3967j = false;
        this.f3964g = 0;
        this.f3960c = false;
        this.f3959b = false;
    }

    public void d(int i2) {
        if (this.f3967j) {
            return;
        }
        this.f3967j = true;
        this.f3964g = i2;
        for (d dVar : this.f3968k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3961d.f4010b.r());
        sb.append(":");
        sb.append(this.f3962e);
        sb.append("(");
        sb.append(this.f3967j ? Integer.valueOf(this.f3964g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3969l.size());
        sb.append(":d=");
        sb.append(this.f3968k.size());
        sb.append(">");
        return sb.toString();
    }
}
