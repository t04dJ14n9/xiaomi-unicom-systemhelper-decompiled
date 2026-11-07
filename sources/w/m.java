package w;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f3983h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p f3986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f3987d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3990g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3984a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3985b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<p> f3988e = new ArrayList<>();

    public m(p pVar, int i2) {
        this.f3986c = null;
        this.f3987d = null;
        int i3 = f3983h;
        this.f3989f = i3;
        f3983h = i3 + 1;
        this.f3986c = pVar;
        this.f3987d = pVar;
        this.f3990g = i2;
    }

    private long c(f fVar, long j2) {
        p pVar = fVar.f3961d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f3968k.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f3968k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f3961d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f3963f) + j2));
                }
            }
        }
        if (fVar != pVar.f4017i) {
            return jMin;
        }
        long j3 = j2 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f4016h, j3)), j3 - ((long) pVar.f4016h.f3963f));
    }

    private long d(f fVar, long j2) {
        p pVar = fVar.f3961d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f3968k.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f3968k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f3961d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f3963f) + j2));
                }
            }
        }
        if (fVar != pVar.f4016h) {
            return jMax;
        }
        long j3 = j2 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f4017i, j3)), j3 - ((long) pVar.f4017i.f3963f));
    }

    public void a(p pVar) {
        this.f3988e.add(pVar);
        this.f3987d = pVar;
    }

    public long b(v.f fVar, int i2) {
        p pVar = this.f3986c;
        if (pVar instanceof c) {
            if (((c) pVar).f4014f != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i2 == 0 ? fVar.f3865e : fVar.f3867f).f4016h;
        f fVar3 = (i2 == 0 ? fVar.f3865e : fVar.f3867f).f4017i;
        boolean zContains = pVar.f4016h.f3969l.contains(fVar2);
        boolean zContains2 = this.f3986c.f4017i.f3969l.contains(fVar3);
        long j2 = this.f3986c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                f fVar4 = this.f3986c.f4016h;
                return Math.max(d(fVar4, fVar4.f3963f), ((long) this.f3986c.f4016h.f3963f) + j2);
            }
            if (!zContains2) {
                p pVar2 = this.f3986c;
                return (((long) pVar2.f4016h.f3963f) + pVar2.j()) - ((long) this.f3986c.f4017i.f3963f);
            }
            f fVar5 = this.f3986c.f4017i;
            return Math.max(-c(fVar5, fVar5.f3963f), ((long) (-this.f3986c.f4017i.f3963f)) + j2);
        }
        long jD = d(this.f3986c.f4016h, 0L);
        long jC = c(this.f3986c.f4017i, 0L);
        long j3 = jD - j2;
        p pVar3 = this.f3986c;
        int i3 = pVar3.f4017i.f3963f;
        if (j3 >= (-i3)) {
            j3 += (long) i3;
        }
        int i4 = pVar3.f4016h.f3963f;
        long j4 = ((-jC) - j2) - ((long) i4);
        if (j4 >= i4) {
            j4 -= (long) i4;
        }
        float fO = pVar3.f4010b.o(i2);
        float f2 = fO > 0.0f ? (long) ((j4 / fO) + (j3 / (1.0f - fO))) : 0L;
        long j5 = ((long) ((f2 * fO) + 0.5f)) + j2 + ((long) ((f2 * (1.0f - fO)) + 0.5f));
        p pVar4 = this.f3986c;
        return (((long) pVar4.f4016h.f3963f) + j5) - ((long) pVar4.f4017i.f3963f);
    }
}
