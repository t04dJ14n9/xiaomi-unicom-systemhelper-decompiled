package u;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f3798n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3799a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3800b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3801c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f3802d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f3803e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f3804f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f3805g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f3806h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f3807i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f3808j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f3809k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f3810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f3811m;

    j(b bVar, c cVar) {
        this.f3810l = bVar;
        this.f3811m = cVar;
        clear();
    }

    private void l(i iVar, int i2) {
        int[] iArr;
        int i3 = iVar.f3777c % this.f3801c;
        int[] iArr2 = this.f3802d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f3803e;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                } else {
                    i4 = i5;
                }
            }
            iArr[i4] = i2;
        }
        this.f3803e[i2] = -1;
    }

    private void m(int i2, i iVar, float f2) {
        this.f3804f[i2] = iVar.f3777c;
        this.f3805g[i2] = f2;
        this.f3806h[i2] = -1;
        this.f3807i[i2] = -1;
        iVar.a(this.f3810l);
        iVar.f3787m++;
        this.f3808j++;
    }

    private int n() {
        for (int i2 = 0; i2 < this.f3800b; i2++) {
            if (this.f3804f[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    private void o() {
        int i2 = this.f3800b * 2;
        this.f3804f = Arrays.copyOf(this.f3804f, i2);
        this.f3805g = Arrays.copyOf(this.f3805g, i2);
        this.f3806h = Arrays.copyOf(this.f3806h, i2);
        this.f3807i = Arrays.copyOf(this.f3807i, i2);
        this.f3803e = Arrays.copyOf(this.f3803e, i2);
        for (int i3 = this.f3800b; i3 < i2; i3++) {
            this.f3804f[i3] = -1;
            this.f3803e[i3] = -1;
        }
        this.f3800b = i2;
    }

    private void q(int i2, i iVar, float f2) {
        int iN = n();
        m(iN, iVar, f2);
        if (i2 != -1) {
            this.f3806h[iN] = i2;
            int[] iArr = this.f3807i;
            iArr[iN] = iArr[i2];
            iArr[i2] = iN;
        } else {
            this.f3806h[iN] = -1;
            if (this.f3808j > 0) {
                this.f3807i[iN] = this.f3809k;
                this.f3809k = iN;
            } else {
                this.f3807i[iN] = -1;
            }
        }
        int i3 = this.f3807i[iN];
        if (i3 != -1) {
            this.f3806h[i3] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i2;
        int i3 = iVar.f3777c;
        int i4 = i3 % this.f3801c;
        int[] iArr2 = this.f3802d;
        int i5 = iArr2[i4];
        if (i5 == -1) {
            return;
        }
        if (this.f3804f[i5] == i3) {
            int[] iArr3 = this.f3803e;
            iArr2[i4] = iArr3[i5];
            iArr3[i5] = -1;
            return;
        }
        while (true) {
            iArr = this.f3803e;
            i2 = iArr[i5];
            if (i2 == -1 || this.f3804f[i2] == i3) {
                break;
            } else {
                i5 = i2;
            }
        }
        if (i2 == -1 || this.f3804f[i2] != i3) {
            return;
        }
        iArr[i5] = iArr[i2];
        iArr[i2] = -1;
    }

    @Override // u.b.a
    public float a(int i2) {
        int i3 = this.f3808j;
        int i4 = this.f3809k;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f3805g[i4];
            }
            i4 = this.f3807i[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // u.b.a
    public boolean b(i iVar) {
        return p(iVar) != -1;
    }

    @Override // u.b.a
    public void c(i iVar, float f2, boolean z2) {
        float f3 = f3798n;
        if (f2 <= (-f3) || f2 >= f3) {
            int iP = p(iVar);
            if (iP == -1) {
                e(iVar, f2);
                return;
            }
            float[] fArr = this.f3805g;
            float f4 = fArr[iP] + f2;
            fArr[iP] = f4;
            float f5 = f3798n;
            if (f4 <= (-f5) || f4 >= f5) {
                return;
            }
            fArr[iP] = 0.0f;
            g(iVar, z2);
        }
    }

    @Override // u.b.a
    public void clear() {
        int i2 = this.f3808j;
        for (int i3 = 0; i3 < i2; i3++) {
            i iVarF = f(i3);
            if (iVarF != null) {
                iVarF.c(this.f3810l);
            }
        }
        for (int i4 = 0; i4 < this.f3800b; i4++) {
            this.f3804f[i4] = -1;
            this.f3803e[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f3801c; i5++) {
            this.f3802d[i5] = -1;
        }
        this.f3808j = 0;
        this.f3809k = -1;
    }

    @Override // u.b.a
    public float d(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f3805g[iP];
        }
        return 0.0f;
    }

    @Override // u.b.a
    public void e(i iVar, float f2) {
        float f3 = f3798n;
        if (f2 > (-f3) && f2 < f3) {
            g(iVar, true);
            return;
        }
        if (this.f3808j == 0) {
            m(0, iVar, f2);
            l(iVar, 0);
            this.f3809k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f3805g[iP] = f2;
            return;
        }
        if (this.f3808j + 1 >= this.f3800b) {
            o();
        }
        int i2 = this.f3808j;
        int i3 = this.f3809k;
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = this.f3804f[i3];
            int i7 = iVar.f3777c;
            if (i6 == i7) {
                this.f3805g[i3] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i3;
            }
            i3 = this.f3807i[i3];
            if (i3 == -1) {
                break;
            }
        }
        q(i4, iVar, f2);
    }

    @Override // u.b.a
    public i f(int i2) {
        int i3 = this.f3808j;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f3809k;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f3811m.f3735d[this.f3804f[i4]];
            }
            i4 = this.f3807i[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // u.b.a
    public float g(i iVar, boolean z2) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f2 = this.f3805g[iP];
        if (this.f3809k == iP) {
            this.f3809k = this.f3807i[iP];
        }
        this.f3804f[iP] = -1;
        int[] iArr = this.f3806h;
        int i2 = iArr[iP];
        if (i2 != -1) {
            int[] iArr2 = this.f3807i;
            iArr2[i2] = iArr2[iP];
        }
        int i3 = this.f3807i[iP];
        if (i3 != -1) {
            iArr[i3] = iArr[iP];
        }
        this.f3808j--;
        iVar.f3787m--;
        if (z2) {
            iVar.c(this.f3810l);
        }
        return f2;
    }

    @Override // u.b.a
    public void h(float f2) {
        int i2 = this.f3808j;
        int i3 = this.f3809k;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3805g;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f3807i[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // u.b.a
    public float i(b bVar, boolean z2) {
        float fD = d(bVar.f3726a);
        g(bVar.f3726a, z2);
        j jVar = (j) bVar.f3730e;
        int iK = jVar.k();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iK) {
            int i4 = jVar.f3804f[i3];
            if (i4 != -1) {
                c(this.f3811m.f3735d[i4], jVar.f3805g[i3] * fD, z2);
                i2++;
            }
            i3++;
        }
        return fD;
    }

    @Override // u.b.a
    public void j() {
        int i2 = this.f3808j;
        int i3 = this.f3809k;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3805g;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f3807i[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // u.b.a
    public int k() {
        return this.f3808j;
    }

    public int p(i iVar) {
        if (this.f3808j != 0 && iVar != null) {
            int i2 = iVar.f3777c;
            int i3 = this.f3802d[i2 % this.f3801c];
            if (i3 == -1) {
                return -1;
            }
            if (this.f3804f[i3] == i2) {
                return i3;
            }
            do {
                i3 = this.f3803e[i3];
                if (i3 == -1) {
                    break;
                }
            } while (this.f3804f[i3] != i2);
            if (i3 != -1 && this.f3804f[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i2 = this.f3808j;
        for (int i3 = 0; i3 < i2; i3++) {
            i iVarF = f(i3);
            if (iVarF != null) {
                String str2 = str + iVarF + " = " + a(i3) + " ";
                int iP = p(iVarF);
                String str3 = str2 + "[p: ";
                if (this.f3806h[iP] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f3811m.f3735d[this.f3804f[this.f3806h[iP]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f3807i[iP] != -1 ? str4 + this.f3811m.f3735d[this.f3804f[this.f3807i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
