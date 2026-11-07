package w;

/* JADX INFO: loaded from: classes.dex */
class j extends p {
    public j(v.e eVar) {
        super(eVar);
        eVar.f3865e.f();
        eVar.f3867f.f();
        this.f4014f = ((v.g) eVar).b1();
    }

    private void q(f fVar) {
        this.f4016h.f3968k.add(fVar);
        fVar.f3969l.add(this.f4016h);
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        f fVar = this.f4016h;
        if (fVar.f3960c && !fVar.f3967j) {
            this.f4016h.d((int) ((fVar.f3969l.get(0).f3964g * ((v.g) this.f4010b).e1()) + 0.5f));
        }
    }

    @Override // w.p
    void d() {
        f fVar;
        p pVar;
        f fVar2;
        v.g gVar = (v.g) this.f4010b;
        int iC1 = gVar.c1();
        int iD1 = gVar.d1();
        gVar.e1();
        if (gVar.b1() == 1) {
            f fVar3 = this.f4016h;
            if (iC1 != -1) {
                fVar3.f3969l.add(this.f4010b.T.f3865e.f4016h);
                this.f4010b.T.f3865e.f4016h.f3968k.add(this.f4016h);
                fVar2 = this.f4016h;
            } else {
                if (iD1 != -1) {
                    fVar3.f3969l.add(this.f4010b.T.f3865e.f4017i);
                    this.f4010b.T.f3865e.f4017i.f3968k.add(this.f4016h);
                    fVar2 = this.f4016h;
                    iC1 = -iD1;
                } else {
                    fVar3.f3959b = true;
                    fVar3.f3969l.add(this.f4010b.T.f3865e.f4017i);
                    this.f4010b.T.f3865e.f4017i.f3968k.add(this.f4016h);
                }
                q(this.f4010b.f3865e.f4016h);
                pVar = this.f4010b.f3865e;
            }
            fVar2.f3963f = iC1;
            q(this.f4010b.f3865e.f4016h);
            pVar = this.f4010b.f3865e;
        } else {
            f fVar4 = this.f4016h;
            if (iC1 != -1) {
                fVar4.f3969l.add(this.f4010b.T.f3867f.f4016h);
                this.f4010b.T.f3867f.f4016h.f3968k.add(this.f4016h);
                fVar = this.f4016h;
            } else {
                if (iD1 != -1) {
                    fVar4.f3969l.add(this.f4010b.T.f3867f.f4017i);
                    this.f4010b.T.f3867f.f4017i.f3968k.add(this.f4016h);
                    fVar = this.f4016h;
                    iC1 = -iD1;
                } else {
                    fVar4.f3959b = true;
                    fVar4.f3969l.add(this.f4010b.T.f3867f.f4017i);
                    this.f4010b.T.f3867f.f4017i.f3968k.add(this.f4016h);
                }
                q(this.f4010b.f3867f.f4016h);
                pVar = this.f4010b.f3867f;
            }
            fVar.f3963f = iC1;
            q(this.f4010b.f3867f.f4016h);
            pVar = this.f4010b.f3867f;
        }
        q(pVar.f4017i);
    }

    @Override // w.p
    public void e() {
        if (((v.g) this.f4010b).b1() == 1) {
            this.f4010b.V0(this.f4016h.f3964g);
        } else {
            this.f4010b.W0(this.f4016h.f3964g);
        }
    }

    @Override // w.p
    void f() {
        this.f4016h.c();
    }

    @Override // w.p
    boolean m() {
        return false;
    }
}
