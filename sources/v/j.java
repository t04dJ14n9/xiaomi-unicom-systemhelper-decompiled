package v;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f3923a = new boolean[3];

    static void a(f fVar, u.d dVar, e eVar) {
        eVar.f3883n = -1;
        eVar.f3885o = -1;
        e.b bVar = fVar.S[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.S[0] == e.b.MATCH_PARENT) {
            int i2 = eVar.H.f3843g;
            int iR = fVar.R() - eVar.J.f3843g;
            d dVar2 = eVar.H;
            dVar2.f3845i = dVar.q(dVar2);
            d dVar3 = eVar.J;
            dVar3.f3845i = dVar.q(dVar3);
            dVar.f(eVar.H.f3845i, i2);
            dVar.f(eVar.J.f3845i, iR);
            eVar.f3883n = 2;
            eVar.y0(i2, iR);
        }
        if (fVar.S[1] == bVar2 || eVar.S[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i3 = eVar.I.f3843g;
        int iV = fVar.v() - eVar.K.f3843g;
        d dVar4 = eVar.I;
        dVar4.f3845i = dVar.q(dVar4);
        d dVar5 = eVar.K;
        dVar5.f3845i = dVar.q(dVar5);
        dVar.f(eVar.I.f3845i, i3);
        dVar.f(eVar.K.f3845i, iV);
        if (eVar.f3866e0 > 0 || eVar.Q() == 8) {
            d dVar6 = eVar.L;
            dVar6.f3845i = dVar.q(dVar6);
            dVar.f(eVar.L.f3845i, eVar.f3866e0 + i3);
        }
        eVar.f3885o = 2;
        eVar.P0(i3, iV);
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
