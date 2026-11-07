package w;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    v.e f4010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f4011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected v.e.b f4012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f4013e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4014f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f4015g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f4016h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f4017i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f4018j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4019a;

        static {
            int[] iArr = new int[v.d.b.values().length];
            f4019a = iArr;
            try {
                iArr[v.d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4019a[v.d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4019a[v.d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4019a[v.d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4019a[v.d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(v.e eVar) {
        this.f4010b = eVar;
    }

    private void l(int i2, int i3) {
        g gVar;
        int iMin;
        int i4 = this.f4009a;
        if (i4 != 0) {
            if (i4 == 1) {
                int iG = g(this.f4013e.f3979m, i2);
                gVar = this.f4013e;
                iMin = Math.min(iG, i3);
            } else if (i4 == 2) {
                v.e eVarI = this.f4010b.I();
                if (eVarI == null) {
                    return;
                }
                g gVar2 = (i2 == 0 ? eVarI.f3865e : eVarI.f3867f).f4013e;
                if (!gVar2.f3967j) {
                    return;
                }
                v.e eVar = this.f4010b;
                i3 = (int) ((gVar2.f3964g * (i2 == 0 ? eVar.f3897u : eVar.f3903x)) + 0.5f);
            } else {
                if (i4 != 3) {
                    return;
                }
                v.e eVar2 = this.f4010b;
                p pVar = eVar2.f3865e;
                v.e.b bVar = pVar.f4012d;
                v.e.b bVar2 = v.e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f4009a == 3) {
                    n nVar = eVar2.f3867f;
                    if (nVar.f4012d == bVar2 && nVar.f4009a == 3) {
                        return;
                    }
                }
                if (i2 == 0) {
                    pVar = eVar2.f3867f;
                }
                if (!pVar.f4013e.f3967j) {
                    return;
                }
                float fT = eVar2.t();
                iMin = i2 == 1 ? (int) ((pVar.f4013e.f3964g / fT) + 0.5f) : (int) ((fT * pVar.f4013e.f3964g) + 0.5f);
                gVar = this.f4013e;
            }
            gVar.d(iMin);
            return;
        }
        this.f4013e.d(g(i3, i2));
    }

    @Override // w.d
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i2) {
        fVar.f3969l.add(fVar2);
        fVar.f3963f = i2;
        fVar2.f3968k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f3969l.add(fVar2);
        fVar.f3969l.add(this.f4013e);
        fVar.f3965h = i2;
        fVar.f3966i = gVar;
        fVar2.f3968k.add(fVar);
        gVar.f3968k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i2, int i3) {
        int iMax;
        v.e eVar = this.f4010b;
        if (i3 == 0) {
            int i4 = eVar.f3895t;
            iMax = Math.max(eVar.f3893s, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        } else {
            int i5 = eVar.f3901w;
            iMax = Math.max(eVar.f3899v, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        }
        return iMax;
    }

    protected final f h(v.d dVar) {
        p pVar;
        p pVar2;
        v.d dVar2 = dVar.f3842f;
        if (dVar2 == null) {
            return null;
        }
        v.e eVar = dVar2.f3840d;
        int i2 = a.f4019a[dVar2.f3841e.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                pVar2 = eVar.f3865e;
            } else if (i2 == 3) {
                pVar = eVar.f3867f;
            } else {
                if (i2 == 4) {
                    return eVar.f3867f.f3991k;
                }
                if (i2 != 5) {
                    return null;
                }
                pVar2 = eVar.f3867f;
            }
            return pVar2.f4017i;
        }
        pVar = eVar.f3865e;
        return pVar.f4016h;
    }

    protected final f i(v.d dVar, int i2) {
        v.d dVar2 = dVar.f3842f;
        if (dVar2 == null) {
            return null;
        }
        v.e eVar = dVar2.f3840d;
        p pVar = i2 == 0 ? eVar.f3865e : eVar.f3867f;
        int i3 = a.f4019a[dVar2.f3841e.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f4017i;
        }
        return pVar.f4016h;
    }

    public long j() {
        g gVar = this.f4013e;
        if (gVar.f3967j) {
            return gVar.f3964g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f4015g;
    }

    abstract boolean m();

    protected void n(d dVar, v.d dVar2, v.d dVar3, int i2) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f3967j && fVarH2.f3967j) {
            int iE = fVarH.f3964g + dVar2.e();
            int iE2 = fVarH2.f3964g - dVar3.e();
            int i3 = iE2 - iE;
            if (!this.f4013e.f3967j && this.f4012d == v.e.b.MATCH_CONSTRAINT) {
                l(i2, i3);
            }
            g gVar = this.f4013e;
            if (gVar.f3967j) {
                if (gVar.f3964g == i3) {
                    this.f4016h.d(iE);
                    this.f4017i.d(iE2);
                    return;
                }
                v.e eVar = this.f4010b;
                float fW = i2 == 0 ? eVar.w() : eVar.M();
                if (fVarH == fVarH2) {
                    iE = fVarH.f3964g;
                    iE2 = fVarH2.f3964g;
                    fW = 0.5f;
                }
                this.f4016h.d((int) (iE + 0.5f + (((iE2 - iE) - this.f4013e.f3964g) * fW)));
                this.f4017i.d(this.f4016h.f3964g + this.f4013e.f3964g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
