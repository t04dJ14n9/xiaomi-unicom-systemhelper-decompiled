package u;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends u.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f3765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f3766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f3768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f3769l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f3777c - iVar2.f3777c;
        }
    }

    class b implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        i f3771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        h f3772c;

        public b(h hVar) {
            this.f3772c = hVar;
        }

        public boolean a(i iVar, float f2) {
            boolean z2 = true;
            if (!this.f3771b.f3775a) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float f3 = iVar.f3783i[i2];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f3771b.f3783i[i2] = f4;
                    } else {
                        this.f3771b.f3783i[i2] = 0.0f;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.f3771b.f3783i;
                float f5 = fArr[i3] + (iVar.f3783i[i3] * f2);
                fArr[i3] = f5;
                if (Math.abs(f5) < 1.0E-4f) {
                    this.f3771b.f3783i[i3] = 0.0f;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                h.this.G(this.f3771b);
            }
            return false;
        }

        public void b(i iVar) {
            this.f3771b = iVar;
        }

        public final boolean c() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.f3771b.f3783i[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f3771b.f3777c - ((i) obj).f3777c;
        }

        public final boolean d(i iVar) {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = iVar.f3783i[i2];
                float f3 = this.f3771b.f3783i[i2];
                if (f3 != f2) {
                    if (f3 < f2) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f3771b.f3783i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f3771b != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f3771b.f3783i[i2] + " ";
                }
            }
            return str + "] " + this.f3771b;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f3764g = 128;
        this.f3765h = new i[128];
        this.f3766i = new i[128];
        this.f3767j = 0;
        this.f3768k = new b(this);
        this.f3769l = cVar;
    }

    private final void F(i iVar) {
        int i2;
        int i3 = this.f3767j + 1;
        i[] iVarArr = this.f3765h;
        if (i3 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f3765h = iVarArr2;
            this.f3766i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f3765h;
        int i4 = this.f3767j;
        iVarArr3[i4] = iVar;
        int i5 = i4 + 1;
        this.f3767j = i5;
        if (i5 > 1 && iVarArr3[i5 - 1].f3777c > iVar.f3777c) {
            int i6 = 0;
            while (true) {
                i2 = this.f3767j;
                if (i6 >= i2) {
                    break;
                }
                this.f3766i[i6] = this.f3765h[i6];
                i6++;
            }
            Arrays.sort(this.f3766i, 0, i2, new a());
            for (int i7 = 0; i7 < this.f3767j; i7++) {
                this.f3765h[i7] = this.f3766i[i7];
            }
        }
        iVar.f3775a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i2 = 0;
        while (i2 < this.f3767j) {
            if (this.f3765h[i2] == iVar) {
                while (true) {
                    int i3 = this.f3767j;
                    if (i2 >= i3 - 1) {
                        this.f3767j = i3 - 1;
                        iVar.f3775a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f3765h;
                        int i4 = i2 + 1;
                        iVarArr[i2] = iVarArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // u.b
    public void B(d dVar, u.b bVar, boolean z2) {
        i iVar = bVar.f3726a;
        if (iVar == null) {
            return;
        }
        u.b.a aVar = bVar.f3730e;
        int iK = aVar.k();
        for (int i2 = 0; i2 < iK; i2++) {
            i iVarF = aVar.f(i2);
            float fA = aVar.a(i2);
            this.f3768k.b(iVarF);
            if (this.f3768k.a(iVar, fA)) {
                F(iVarF);
            }
            this.f3727b += bVar.f3727b * fA;
        }
        G(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // u.b, u.d.a
    public i b(d dVar, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f3767j; i3++) {
            i iVar = this.f3765h[i3];
            if (!zArr[iVar.f3777c]) {
                this.f3768k.b(iVar);
                b bVar = this.f3768k;
                if (i2 == -1) {
                    if (bVar.c()) {
                        i2 = i3;
                    }
                } else if (bVar.d(this.f3765h[i2])) {
                    i2 = i3;
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f3765h[i2];
    }

    @Override // u.b, u.d.a
    public void c(i iVar) {
        this.f3768k.b(iVar);
        this.f3768k.e();
        iVar.f3783i[iVar.f3779e] = 1.0f;
        F(iVar);
    }

    @Override // u.b, u.d.a
    public void clear() {
        this.f3767j = 0;
        this.f3727b = 0.0f;
    }

    @Override // u.b, u.d.a
    public boolean isEmpty() {
        return this.f3767j == 0;
    }

    @Override // u.b
    public String toString() {
        String str = " goal -> (" + this.f3727b + ") : ";
        for (int i2 = 0; i2 < this.f3767j; i2++) {
            this.f3768k.b(this.f3765h[i2]);
            str = str + this.f3768k + " ";
        }
        return str;
    }
}
