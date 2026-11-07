package w;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f3991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f3992l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3993a;

        static {
            int[] iArr = new int[p.b.values().length];
            f3993a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3993a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3993a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(v.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f3991k = fVar;
        this.f3992l = null;
        this.f4016h.f3962e = f.a.TOP;
        this.f4017i.f3962e = f.a.BOTTOM;
        fVar.f3962e = f.a.BASELINE;
        this.f4014f = 1;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    @Override // w.p, w.d
    public void a(d dVar) {
        int i2;
        float fT;
        int i3 = a.f3993a[this.f4018j.ordinal()];
        if (i3 == 1) {
            p(dVar);
        } else if (i3 == 2) {
            o(dVar);
        } else if (i3 == 3) {
            v.e eVar = this.f4010b;
            n(dVar, eVar.I, eVar.K, 1);
            return;
        }
        g gVar = this.f4013e;
        if (gVar.f3960c && !gVar.f3967j && this.f4012d == v.e.b.MATCH_CONSTRAINT) {
            v.e eVar2 = this.f4010b;
            int i4 = eVar2.f3889q;
            if (i4 == 2) {
                v.e eVarI = eVar2.I();
                if (eVarI != null) {
                    g gVar2 = eVarI.f3867f.f4013e;
                    if (gVar2.f3967j) {
                        i2 = (int) ((gVar2.f3964g * this.f4010b.f3903x) + 0.5f);
                        this.f4013e.d(i2);
                    }
                }
            } else if (i4 == 3 && eVar2.f3865e.f4013e.f3967j) {
                int iU = eVar2.u();
                if (iU == -1) {
                    v.e eVar3 = this.f4010b;
                    fT = eVar3.f3865e.f4013e.f3964g / eVar3.t();
                    i2 = (int) (fT + 0.5f);
                } else if (iU == 0) {
                    v.e eVar4 = this.f4010b;
                    fT = eVar4.f3865e.f4013e.f3964g * eVar4.t();
                    i2 = (int) (fT + 0.5f);
                } else if (iU != 1) {
                    i2 = 0;
                } else {
                    v.e eVar5 = this.f4010b;
                    fT = eVar5.f3865e.f4013e.f3964g / eVar5.t();
                    i2 = (int) (fT + 0.5f);
                }
                this.f4013e.d(i2);
            }
        }
        f fVar = this.f4016h;
        if (fVar.f3960c) {
            f fVar2 = this.f4017i;
            if (fVar2.f3960c) {
                if (fVar.f3967j && fVar2.f3967j && this.f4013e.f3967j) {
                    return;
                }
                if (!this.f4013e.f3967j && this.f4012d == v.e.b.MATCH_CONSTRAINT) {
                    v.e eVar6 = this.f4010b;
                    if (eVar6.f3887p == 0 && !eVar6.b0()) {
                        f fVar3 = this.f4016h.f3969l.get(0);
                        f fVar4 = this.f4017i.f3969l.get(0);
                        int i5 = fVar3.f3964g;
                        f fVar5 = this.f4016h;
                        int i6 = i5 + fVar5.f3963f;
                        int i7 = fVar4.f3964g + this.f4017i.f3963f;
                        fVar5.d(i6);
                        this.f4017i.d(i7);
                        this.f4013e.d(i7 - i6);
                        return;
                    }
                }
                if (!this.f4013e.f3967j && this.f4012d == v.e.b.MATCH_CONSTRAINT && this.f4009a == 1 && this.f4016h.f3969l.size() > 0 && this.f4017i.f3969l.size() > 0) {
                    f fVar6 = this.f4016h.f3969l.get(0);
                    int i8 = (this.f4017i.f3969l.get(0).f3964g + this.f4017i.f3963f) - (fVar6.f3964g + this.f4016h.f3963f);
                    g gVar3 = this.f4013e;
                    int i9 = gVar3.f3979m;
                    if (i8 < i9) {
                        gVar3.d(i8);
                    } else {
                        gVar3.d(i9);
                    }
                }
                if (this.f4013e.f3967j && this.f4016h.f3969l.size() > 0 && this.f4017i.f3969l.size() > 0) {
                    f fVar7 = this.f4016h.f3969l.get(0);
                    f fVar8 = this.f4017i.f3969l.get(0);
                    int i10 = fVar7.f3964g + this.f4016h.f3963f;
                    int i11 = fVar8.f3964g + this.f4017i.f3963f;
                    float fM = this.f4010b.M();
                    if (fVar7 == fVar8) {
                        i10 = fVar7.f3964g;
                        i11 = fVar8.f3964g;
                        fM = 0.5f;
                    }
                    this.f4016h.d((int) (i10 + 0.5f + (((i11 - i10) - this.f4013e.f3964g) * fM)));
                    this.f4017i.d(this.f4016h.f3964g + this.f4013e.f3964g);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x03d5 A[PHI: r0
      0x03d5: PHI (r0v32 w.l) = (r0v23 w.l), (r0v47 w.l) binds: [B:150:0x03d3, B:124:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d9, code lost:
    
        if (r10.f4010b.U() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
    
        r0 = r10.f3991k;
        r1 = r10.f4016h;
        r2 = r10.f3992l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035e, code lost:
    
        if (r10.f4010b.U() != false) goto L110;
     */
    @Override // w.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void d() {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.d():void");
    }

    @Override // w.p
    public void e() {
        f fVar = this.f4016h;
        if (fVar.f3967j) {
            this.f4010b.W0(fVar.f3964g);
        }
    }

    @Override // w.p
    void f() {
        this.f4011c = null;
        this.f4016h.c();
        this.f4017i.c();
        this.f3991k.c();
        this.f4013e.c();
        this.f4015g = false;
    }

    @Override // w.p
    boolean m() {
        return this.f4012d != v.e.b.MATCH_CONSTRAINT || this.f4010b.f3889q == 0;
    }

    void q() {
        this.f4015g = false;
        this.f4016h.c();
        this.f4016h.f3967j = false;
        this.f4017i.c();
        this.f4017i.f3967j = false;
        this.f3991k.c();
        this.f3991k.f3967j = false;
        this.f4013e.f3967j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f4010b.r();
    }
}
