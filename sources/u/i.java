package u;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f3774r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3776b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3780f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f3784j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3777c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3778d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3779e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3781g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f3782h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f3783i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b[] f3785k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f3786l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3787m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f3788n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f3789o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f3790p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    HashSet<b> f3791q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f3784j = aVar;
    }

    static void b() {
        f3774r++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f3786l;
            if (i2 >= i3) {
                b[] bVarArr = this.f3785k;
                if (i3 >= bVarArr.length) {
                    this.f3785k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3785k;
                int i4 = this.f3786l;
                bVarArr2[i4] = bVar;
                this.f3786l = i4 + 1;
                return;
            }
            if (this.f3785k[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.f3786l;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f3785k[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f3785k;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f3786l--;
                return;
            }
            i3++;
        }
    }

    public void d() {
        this.f3776b = null;
        this.f3784j = a.UNKNOWN;
        this.f3779e = 0;
        this.f3777c = -1;
        this.f3778d = -1;
        this.f3780f = 0.0f;
        this.f3781g = false;
        this.f3788n = false;
        this.f3789o = -1;
        this.f3790p = 0.0f;
        int i2 = this.f3786l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3785k[i3] = null;
        }
        this.f3786l = 0;
        this.f3787m = 0;
        this.f3775a = false;
        Arrays.fill(this.f3783i, 0.0f);
    }

    public void e(d dVar, float f2) {
        this.f3780f = f2;
        this.f3781g = true;
        this.f3788n = false;
        this.f3789o = -1;
        this.f3790p = 0.0f;
        int i2 = this.f3786l;
        this.f3778d = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3785k[i3].A(dVar, this, false);
        }
        this.f3786l = 0;
    }

    public void f(a aVar, String str) {
        this.f3784j = aVar;
    }

    public final void g(d dVar, b bVar) {
        int i2 = this.f3786l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3785k[i3].B(dVar, bVar, false);
        }
        this.f3786l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f3776b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f3776b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f3777c);
        }
        return sb.toString();
    }
}
