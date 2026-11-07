package u;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f3714l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f3716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f3717c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3715a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3718d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f3719e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f3720f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f3721g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f3722h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3723i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3724j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f3725k = false;

    a(b bVar, c cVar) {
        this.f3716b = bVar;
        this.f3717c = cVar;
    }

    @Override // u.b.a
    public float a(int i2) {
        int i3 = this.f3723i;
        for (int i4 = 0; i3 != -1 && i4 < this.f3715a; i4++) {
            if (i4 == i2) {
                return this.f3722h[i3];
            }
            i3 = this.f3721g[i3];
        }
        return 0.0f;
    }

    @Override // u.b.a
    public boolean b(i iVar) {
        int i2 = this.f3723i;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f3715a; i3++) {
            if (this.f3720f[i2] == iVar.f3777c) {
                return true;
            }
            i2 = this.f3721g[i2];
        }
        return false;
    }

    @Override // u.b.a
    public void c(i iVar, float f2, boolean z2) {
        float f3 = f3714l;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f3723i;
            if (i2 == -1) {
                this.f3723i = 0;
                this.f3722h[0] = f2;
                this.f3720f[0] = iVar.f3777c;
                this.f3721g[0] = -1;
                iVar.f3787m++;
                iVar.a(this.f3716b);
                this.f3715a++;
                if (this.f3725k) {
                    return;
                }
                int i3 = this.f3724j + 1;
                this.f3724j = i3;
                int[] iArr = this.f3720f;
                if (i3 >= iArr.length) {
                    this.f3725k = true;
                    this.f3724j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f3715a; i5++) {
                int i6 = this.f3720f[i2];
                int i7 = iVar.f3777c;
                if (i6 == i7) {
                    float[] fArr = this.f3722h;
                    float f4 = fArr[i2] + f2;
                    float f5 = f3714l;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f3723i) {
                            this.f3723i = this.f3721g[i2];
                        } else {
                            int[] iArr2 = this.f3721g;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            iVar.c(this.f3716b);
                        }
                        if (this.f3725k) {
                            this.f3724j = i2;
                        }
                        iVar.f3787m--;
                        this.f3715a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f3721g[i2];
            }
            int length = this.f3724j;
            int i8 = length + 1;
            if (this.f3725k) {
                int[] iArr3 = this.f3720f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f3720f;
            if (length >= iArr4.length && this.f3715a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3720f;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f3720f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f3718d * 2;
                this.f3718d = i10;
                this.f3725k = false;
                this.f3724j = length - 1;
                this.f3722h = Arrays.copyOf(this.f3722h, i10);
                this.f3720f = Arrays.copyOf(this.f3720f, this.f3718d);
                this.f3721g = Arrays.copyOf(this.f3721g, this.f3718d);
            }
            this.f3720f[length] = iVar.f3777c;
            this.f3722h[length] = f2;
            int[] iArr7 = this.f3721g;
            if (i4 != -1) {
                iArr7[length] = iArr7[i4];
                iArr7[i4] = length;
            } else {
                iArr7[length] = this.f3723i;
                this.f3723i = length;
            }
            iVar.f3787m++;
            iVar.a(this.f3716b);
            this.f3715a++;
            if (!this.f3725k) {
                this.f3724j++;
            }
            int i11 = this.f3724j;
            int[] iArr8 = this.f3720f;
            if (i11 >= iArr8.length) {
                this.f3725k = true;
                this.f3724j = iArr8.length - 1;
            }
        }
    }

    @Override // u.b.a
    public final void clear() {
        int i2 = this.f3723i;
        for (int i3 = 0; i2 != -1 && i3 < this.f3715a; i3++) {
            i iVar = this.f3717c.f3735d[this.f3720f[i2]];
            if (iVar != null) {
                iVar.c(this.f3716b);
            }
            i2 = this.f3721g[i2];
        }
        this.f3723i = -1;
        this.f3724j = -1;
        this.f3725k = false;
        this.f3715a = 0;
    }

    @Override // u.b.a
    public final float d(i iVar) {
        int i2 = this.f3723i;
        for (int i3 = 0; i2 != -1 && i3 < this.f3715a; i3++) {
            if (this.f3720f[i2] == iVar.f3777c) {
                return this.f3722h[i2];
            }
            i2 = this.f3721g[i2];
        }
        return 0.0f;
    }

    @Override // u.b.a
    public final void e(i iVar, float f2) {
        if (f2 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i2 = this.f3723i;
        if (i2 == -1) {
            this.f3723i = 0;
            this.f3722h[0] = f2;
            this.f3720f[0] = iVar.f3777c;
            this.f3721g[0] = -1;
            iVar.f3787m++;
            iVar.a(this.f3716b);
            this.f3715a++;
            if (this.f3725k) {
                return;
            }
            int i3 = this.f3724j + 1;
            this.f3724j = i3;
            int[] iArr = this.f3720f;
            if (i3 >= iArr.length) {
                this.f3725k = true;
                this.f3724j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f3715a; i5++) {
            int i6 = this.f3720f[i2];
            int i7 = iVar.f3777c;
            if (i6 == i7) {
                this.f3722h[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f3721g[i2];
        }
        int length = this.f3724j;
        int i8 = length + 1;
        if (this.f3725k) {
            int[] iArr2 = this.f3720f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i8;
        }
        int[] iArr3 = this.f3720f;
        if (length >= iArr3.length && this.f3715a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3720f;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f3720f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i10 = this.f3718d * 2;
            this.f3718d = i10;
            this.f3725k = false;
            this.f3724j = length - 1;
            this.f3722h = Arrays.copyOf(this.f3722h, i10);
            this.f3720f = Arrays.copyOf(this.f3720f, this.f3718d);
            this.f3721g = Arrays.copyOf(this.f3721g, this.f3718d);
        }
        this.f3720f[length] = iVar.f3777c;
        this.f3722h[length] = f2;
        int[] iArr6 = this.f3721g;
        if (i4 != -1) {
            iArr6[length] = iArr6[i4];
            iArr6[i4] = length;
        } else {
            iArr6[length] = this.f3723i;
            this.f3723i = length;
        }
        iVar.f3787m++;
        iVar.a(this.f3716b);
        int i11 = this.f3715a + 1;
        this.f3715a = i11;
        if (!this.f3725k) {
            this.f3724j++;
        }
        int[] iArr7 = this.f3720f;
        if (i11 >= iArr7.length) {
            this.f3725k = true;
        }
        if (this.f3724j >= iArr7.length) {
            this.f3725k = true;
            this.f3724j = iArr7.length - 1;
        }
    }

    @Override // u.b.a
    public i f(int i2) {
        int i3 = this.f3723i;
        for (int i4 = 0; i3 != -1 && i4 < this.f3715a; i4++) {
            if (i4 == i2) {
                return this.f3717c.f3735d[this.f3720f[i3]];
            }
            i3 = this.f3721g[i3];
        }
        return null;
    }

    @Override // u.b.a
    public final float g(i iVar, boolean z2) {
        if (this.f3719e == iVar) {
            this.f3719e = null;
        }
        int i2 = this.f3723i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f3715a) {
            if (this.f3720f[i2] == iVar.f3777c) {
                if (i2 == this.f3723i) {
                    this.f3723i = this.f3721g[i2];
                } else {
                    int[] iArr = this.f3721g;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    iVar.c(this.f3716b);
                }
                iVar.f3787m--;
                this.f3715a--;
                this.f3720f[i2] = -1;
                if (this.f3725k) {
                    this.f3724j = i2;
                }
                return this.f3722h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f3721g[i2];
        }
        return 0.0f;
    }

    @Override // u.b.a
    public void h(float f2) {
        int i2 = this.f3723i;
        for (int i3 = 0; i2 != -1 && i3 < this.f3715a; i3++) {
            float[] fArr = this.f3722h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f3721g[i2];
        }
    }

    @Override // u.b.a
    public float i(b bVar, boolean z2) {
        float fD = d(bVar.f3726a);
        g(bVar.f3726a, z2);
        b.a aVar = bVar.f3730e;
        int iK = aVar.k();
        for (int i2 = 0; i2 < iK; i2++) {
            i iVarF = aVar.f(i2);
            c(iVarF, aVar.d(iVarF) * fD, z2);
        }
        return fD;
    }

    @Override // u.b.a
    public void j() {
        int i2 = this.f3723i;
        for (int i3 = 0; i2 != -1 && i3 < this.f3715a; i3++) {
            float[] fArr = this.f3722h;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f3721g[i2];
        }
    }

    @Override // u.b.a
    public int k() {
        return this.f3715a;
    }

    public String toString() {
        int i2 = this.f3723i;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f3715a; i3++) {
            str = ((str + " -> ") + this.f3722h[i2] + " : ") + this.f3717c.f3735d[this.f3720f[i2]];
            i2 = this.f3721g[i2];
        }
        return str;
    }
}
