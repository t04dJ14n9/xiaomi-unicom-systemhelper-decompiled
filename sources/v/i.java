package v;

import java.util.ArrayList;
import java.util.Arrays;
import w.o;

/* JADX INFO: loaded from: classes.dex */
public class i extends e implements h {
    public e[] D0 = new e[4];
    public int E0 = 0;

    @Override // v.h
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i2 = this.E0 + 1;
        e[] eVarArr = this.D0;
        if (i2 > eVarArr.length) {
            this.D0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.D0;
        int i3 = this.E0;
        eVarArr2[i3] = eVar;
        this.E0 = i3 + 1;
    }

    public void a1(ArrayList<o> arrayList, int i2, o oVar) {
        for (int i3 = 0; i3 < this.E0; i3++) {
            oVar.a(this.D0[i3]);
        }
        for (int i4 = 0; i4 < this.E0; i4++) {
            w.i.a(this.D0[i4], i2, arrayList, oVar);
        }
    }

    @Override // v.h
    public void b() {
        this.E0 = 0;
        Arrays.fill(this.D0, (Object) null);
    }

    public int b1(int i2) {
        int i3;
        int i4;
        for (int i5 = 0; i5 < this.E0; i5++) {
            e eVar = this.D0[i5];
            if (i2 == 0 && (i4 = eVar.A0) != -1) {
                return i4;
            }
            if (i2 == 1 && (i3 = eVar.B0) != -1) {
                return i3;
            }
        }
        return -1;
    }

    @Override // v.h
    public void c(f fVar) {
    }
}
