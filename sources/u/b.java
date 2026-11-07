package u;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f3730e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f3726a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f3727b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f3728c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<i> f3729d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f3731f = false;

    public interface a {
        float a(int i2);

        boolean b(i iVar);

        void c(i iVar, float f2, boolean z2);

        void clear();

        float d(i iVar);

        void e(i iVar, float f2);

        i f(int i2);

        float g(i iVar, boolean z2);

        void h(float f2);

        float i(b bVar, boolean z2);

        void j();

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f3730e = new u.a(this, cVar);
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f3787m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iK = this.f3730e.k();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < iK; i2++) {
            float fA = this.f3730e.a(i2);
            if (fA < 0.0f) {
                i iVarF = this.f3730e.f(i2);
                if ((zArr == null || !zArr[iVarF.f3777c]) && iVarF != iVar && (((aVar = iVarF.f3784j) == i.a.SLACK || aVar == i.a.ERROR) && fA < f2)) {
                    f2 = fA;
                    iVar2 = iVarF;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z2) {
        if (iVar.f3781g) {
            this.f3727b += iVar.f3780f * this.f3730e.d(iVar);
            this.f3730e.g(iVar, z2);
            if (z2) {
                iVar.c(this);
            }
            if (d.f3738t && this.f3730e.k() == 0) {
                this.f3731f = true;
                dVar.f3744a = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z2) {
        this.f3727b += bVar.f3727b * this.f3730e.i(bVar, z2);
        if (z2) {
            bVar.f3726a.c(this);
        }
        if (d.f3738t && this.f3726a != null && this.f3730e.k() == 0) {
            this.f3731f = true;
            dVar.f3744a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z2) {
        if (iVar.f3788n) {
            float fD = this.f3730e.d(iVar);
            this.f3727b += iVar.f3790p * fD;
            this.f3730e.g(iVar, z2);
            if (z2) {
                iVar.c(this);
            }
            this.f3730e.c(dVar.f3757n.f3735d[iVar.f3789o], fD, z2);
            if (d.f3738t && this.f3730e.k() == 0) {
                this.f3731f = true;
                dVar.f3744a = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.f3750g.length == 0) {
            return;
        }
        boolean z2 = false;
        while (!z2) {
            int iK = this.f3730e.k();
            for (int i2 = 0; i2 < iK; i2++) {
                i iVarF = this.f3730e.f(i2);
                if (iVarF.f3778d != -1 || iVarF.f3781g || iVarF.f3788n) {
                    this.f3729d.add(iVarF);
                }
            }
            int size = this.f3729d.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = this.f3729d.get(i3);
                    if (iVar.f3781g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f3788n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f3750g[iVar.f3778d], true);
                    }
                }
                this.f3729d.clear();
            } else {
                z2 = true;
            }
        }
        if (d.f3738t && this.f3726a != null && this.f3730e.k() == 0) {
            this.f3731f = true;
            dVar.f3744a = true;
        }
    }

    @Override // u.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f3726a = null;
            this.f3730e.clear();
            for (int i2 = 0; i2 < bVar.f3730e.k(); i2++) {
                this.f3730e.c(bVar.f3730e.f(i2), bVar.f3730e.a(i2), true);
            }
        }
    }

    @Override // u.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // u.d.a
    public void c(i iVar) {
        int i2 = iVar.f3779e;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f3730e.e(iVar, f2);
    }

    @Override // u.d.a
    public void clear() {
        this.f3730e.clear();
        this.f3726a = null;
        this.f3727b = 0.0f;
    }

    public b d(d dVar, int i2) {
        this.f3730e.e(dVar.o(i2, "ep"), 1.0f);
        this.f3730e.e(dVar.o(i2, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i2) {
        this.f3730e.e(iVar, i2);
        return this;
    }

    boolean f(d dVar) {
        boolean z2;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z2 = true;
        } else {
            x(iVarG);
            z2 = false;
        }
        if (this.f3730e.k() == 0) {
            this.f3731f = true;
        }
        return z2;
    }

    i g(d dVar) {
        int iK = this.f3730e.k();
        i iVar = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean zU = false;
        boolean zU2 = false;
        i iVar2 = null;
        for (int i2 = 0; i2 < iK; i2++) {
            float fA = this.f3730e.a(i2);
            i iVarF = this.f3730e.f(i2);
            if (iVarF.f3784j == i.a.UNRESTRICTED) {
                if (iVar == null || f2 > fA) {
                    zU = u(iVarF, dVar);
                    f2 = fA;
                    iVar = iVarF;
                } else if (!zU && u(iVarF, dVar)) {
                    f2 = fA;
                    iVar = iVarF;
                    zU = true;
                }
            } else if (iVar == null && fA < 0.0f) {
                if (iVar2 == null || f3 > fA) {
                    zU2 = u(iVarF, dVar);
                    f3 = fA;
                    iVar2 = iVarF;
                } else if (!zU2 && u(iVarF, dVar)) {
                    f3 = fA;
                    iVar2 = iVarF;
                    zU2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // u.d.a
    public i getKey() {
        return this.f3726a;
    }

    b h(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        float f3;
        int i4;
        if (iVar2 == iVar3) {
            this.f3730e.e(iVar, 1.0f);
            this.f3730e.e(iVar4, 1.0f);
            this.f3730e.e(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f3730e.e(iVar, 1.0f);
            this.f3730e.e(iVar2, -1.0f);
            this.f3730e.e(iVar3, -1.0f);
            this.f3730e.e(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                i4 = (-i2) + i3;
                f3 = i4;
                this.f3727b = f3;
            }
        } else {
            if (f2 <= 0.0f) {
                this.f3730e.e(iVar, -1.0f);
                this.f3730e.e(iVar2, 1.0f);
                f3 = i2;
            } else if (f2 >= 1.0f) {
                this.f3730e.e(iVar4, -1.0f);
                this.f3730e.e(iVar3, 1.0f);
                i4 = -i3;
                f3 = i4;
            } else {
                float f4 = 1.0f - f2;
                this.f3730e.e(iVar, f4 * 1.0f);
                this.f3730e.e(iVar2, f4 * (-1.0f));
                this.f3730e.e(iVar3, (-1.0f) * f2);
                this.f3730e.e(iVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    f3 = ((-i2) * f4) + (i3 * f2);
                }
            }
            this.f3727b = f3;
        }
        return this;
    }

    b i(i iVar, int i2) {
        this.f3726a = iVar;
        float f2 = i2;
        iVar.f3780f = f2;
        this.f3727b = f2;
        this.f3731f = true;
        return this;
    }

    @Override // u.d.a
    public boolean isEmpty() {
        return this.f3726a == null && this.f3727b == 0.0f && this.f3730e.k() == 0;
    }

    b j(i iVar, i iVar2, float f2) {
        this.f3730e.e(iVar, -1.0f);
        this.f3730e.e(iVar2, f2);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f3730e.e(iVar, -1.0f);
        this.f3730e.e(iVar2, 1.0f);
        this.f3730e.e(iVar3, f2);
        this.f3730e.e(iVar4, -f2);
        return this;
    }

    public b l(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f3727b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f3730e.e(iVar, 1.0f);
            this.f3730e.e(iVar2, -1.0f);
            this.f3730e.e(iVar4, 1.0f);
            this.f3730e.e(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f3730e.e(iVar, 1.0f);
            this.f3730e.e(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f3730e.e(iVar3, 1.0f);
            this.f3730e.e(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f3730e.e(iVar, 1.0f);
            this.f3730e.e(iVar2, -1.0f);
            this.f3730e.e(iVar4, f5);
            this.f3730e.e(iVar3, -f5);
        }
        return this;
    }

    public b m(i iVar, int i2) {
        a aVar;
        float f2;
        if (i2 < 0) {
            this.f3727b = i2 * (-1);
            aVar = this.f3730e;
            f2 = 1.0f;
        } else {
            this.f3727b = i2;
            aVar = this.f3730e;
            f2 = -1.0f;
        }
        aVar.e(iVar, f2);
        return this;
    }

    public b n(i iVar, i iVar2, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3727b = i2;
        }
        if (z2) {
            this.f3730e.e(iVar, 1.0f);
            this.f3730e.e(iVar2, -1.0f);
        } else {
            this.f3730e.e(iVar, -1.0f);
            this.f3730e.e(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3727b = i2;
        }
        if (z2) {
            this.f3730e.e(iVar, 1.0f);
            this.f3730e.e(iVar2, -1.0f);
            this.f3730e.e(iVar3, -1.0f);
        } else {
            this.f3730e.e(iVar, -1.0f);
            this.f3730e.e(iVar2, 1.0f);
            this.f3730e.e(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3727b = i2;
        }
        if (z2) {
            this.f3730e.e(iVar, 1.0f);
            this.f3730e.e(iVar2, -1.0f);
            this.f3730e.e(iVar3, 1.0f);
        } else {
            this.f3730e.e(iVar, -1.0f);
            this.f3730e.e(iVar2, 1.0f);
            this.f3730e.e(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f3730e.e(iVar3, 0.5f);
        this.f3730e.e(iVar4, 0.5f);
        this.f3730e.e(iVar, -0.5f);
        this.f3730e.e(iVar2, -0.5f);
        this.f3727b = -f2;
        return this;
    }

    void r() {
        float f2 = this.f3727b;
        if (f2 < 0.0f) {
            this.f3727b = f2 * (-1.0f);
            this.f3730e.j();
        }
    }

    boolean s() {
        i iVar = this.f3726a;
        return iVar != null && (iVar.f3784j == i.a.UNRESTRICTED || this.f3727b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f3730e.b(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f3726a;
        if (iVar2 != null) {
            this.f3730e.e(iVar2, -1.0f);
            this.f3726a.f3778d = -1;
            this.f3726a = null;
        }
        float fG = this.f3730e.g(iVar, true) * (-1.0f);
        this.f3726a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f3727b /= fG;
        this.f3730e.h(fG);
    }

    public void y() {
        this.f3726a = null;
        this.f3730e.clear();
        this.f3727b = 0.0f;
        this.f3731f = false;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String z() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.b.z():java.lang.String");
    }
}
