package w;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class k extends p {
    public k(v.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f4016h.f3968k.add(fVar);
        fVar.f3969l.add(this.f4016h);
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        v.a aVar = (v.a) this.f4010b;
        int iE1 = aVar.e1();
        Iterator<f> it = this.f4016h.f3969l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f3964g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (iE1 == 0 || iE1 == 2) {
            this.f4016h.d(i3 + aVar.f1());
        } else {
            this.f4016h.d(i2 + aVar.f1());
        }
    }

    @Override // w.p
    void d() {
        p pVar;
        v.e eVar = this.f4010b;
        if (eVar instanceof v.a) {
            this.f4016h.f3959b = true;
            v.a aVar = (v.a) eVar;
            int iE1 = aVar.e1();
            boolean zD1 = aVar.d1();
            int i2 = 0;
            if (iE1 != 0) {
                if (iE1 != 1) {
                    if (iE1 == 2) {
                        this.f4016h.f3962e = f.a.TOP;
                        while (i2 < aVar.E0) {
                            v.e eVar2 = aVar.D0[i2];
                            if (zD1 || eVar2.Q() != 8) {
                                f fVar = eVar2.f3867f.f4016h;
                                fVar.f3968k.add(this.f4016h);
                                this.f4016h.f3969l.add(fVar);
                            }
                            i2++;
                        }
                    } else {
                        if (iE1 != 3) {
                            return;
                        }
                        this.f4016h.f3962e = f.a.BOTTOM;
                        while (i2 < aVar.E0) {
                            v.e eVar3 = aVar.D0[i2];
                            if (zD1 || eVar3.Q() != 8) {
                                f fVar2 = eVar3.f3867f.f4017i;
                                fVar2.f3968k.add(this.f4016h);
                                this.f4016h.f3969l.add(fVar2);
                            }
                            i2++;
                        }
                    }
                    q(this.f4010b.f3867f.f4016h);
                    pVar = this.f4010b.f3867f;
                } else {
                    this.f4016h.f3962e = f.a.RIGHT;
                    while (i2 < aVar.E0) {
                        v.e eVar4 = aVar.D0[i2];
                        if (zD1 || eVar4.Q() != 8) {
                            f fVar3 = eVar4.f3865e.f4017i;
                            fVar3.f3968k.add(this.f4016h);
                            this.f4016h.f3969l.add(fVar3);
                        }
                        i2++;
                    }
                }
                q(pVar.f4017i);
            }
            this.f4016h.f3962e = f.a.LEFT;
            while (i2 < aVar.E0) {
                v.e eVar5 = aVar.D0[i2];
                if (zD1 || eVar5.Q() != 8) {
                    f fVar4 = eVar5.f3865e.f4016h;
                    fVar4.f3968k.add(this.f4016h);
                    this.f4016h.f3969l.add(fVar4);
                }
                i2++;
            }
            q(this.f4010b.f3865e.f4016h);
            pVar = this.f4010b.f3865e;
            q(pVar.f4017i);
        }
    }

    @Override // w.p
    public void e() {
        v.e eVar = this.f4010b;
        if (eVar instanceof v.a) {
            int iE1 = ((v.a) eVar).e1();
            if (iE1 == 0 || iE1 == 1) {
                this.f4010b.V0(this.f4016h.f3964g);
            } else {
                this.f4010b.W0(this.f4016h.f3964g);
            }
        }
    }

    @Override // w.p
    void f() {
        this.f4011c = null;
        this.f4016h.c();
    }

    @Override // w.p
    boolean m() {
        return false;
    }
}
