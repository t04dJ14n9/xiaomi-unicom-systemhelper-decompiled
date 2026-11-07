package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.n;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float C0 = 0.5f;
    public int A0;
    public int B0;
    private boolean D;
    public d O;
    public d[] P;
    protected ArrayList<d> Q;
    private boolean[] R;
    public b[] S;
    public e T;
    int U;
    int V;
    public float W;
    protected int X;
    protected int Y;
    protected int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    int f3858a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    int f3860b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w.c f3861c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected int f3862c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w.c f3863d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected int f3864d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    int f3866e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected int f3868f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected int f3870g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    float f3872h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    float f3874i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Object f3876j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f3878k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f3880l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f3882m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private String f3884n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    boolean f3886o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f3888p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    boolean f3890q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    int f3892r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    int f3894s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    boolean f3896t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    boolean f3898u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float[] f3900v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected e[] f3902w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected e[] f3904x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    e f3906y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    e f3908z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3857a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p[] f3859b = new p[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w.l f3865e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f3867f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f3869g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f3871h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3873i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f3875j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f3877k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f3879l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f3881m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3883n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3885o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3887p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3889q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f3891r = new int[2];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3893s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3895t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f3897u = 1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3899v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3901w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f3903x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f3905y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f3907z = 1.0f;
    private int[] A = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float B = 0.0f;
    private boolean C = false;
    private boolean E = false;
    private int F = 0;
    private int G = 0;
    public d H = new d(this, d.b.LEFT);
    public d I = new d(this, d.b.TOP);
    public d J = new d(this, d.b.RIGHT);
    public d K = new d(this, d.b.BOTTOM);
    public d L = new d(this, d.b.BASELINE);
    d M = new d(this, d.b.CENTER_X);
    d N = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3910b;

        static {
            int[] iArr = new int[b.values().length];
            f3910b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3910b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3910b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3910b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f3909a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3909a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3909a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3909a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3909a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3909a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3909a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3909a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3909a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.O = dVar;
        this.P = new d[]{this.H, this.J, this.I, this.K, this.L, dVar};
        this.Q = new ArrayList<>();
        this.R = new boolean[2];
        b bVar = b.FIXED;
        this.S = new b[]{bVar, bVar};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f3858a0 = 0;
        this.f3860b0 = 0;
        this.f3862c0 = 0;
        this.f3864d0 = 0;
        this.f3866e0 = 0;
        float f2 = C0;
        this.f3872h0 = f2;
        this.f3874i0 = f2;
        this.f3878k0 = 0;
        this.f3880l0 = 0;
        this.f3882m0 = null;
        this.f3884n0 = null;
        this.f3890q0 = false;
        this.f3892r0 = 0;
        this.f3894s0 = 0;
        this.f3900v0 = new float[]{-1.0f, -1.0f};
        this.f3902w0 = new e[]{null, null};
        this.f3904x0 = new e[]{null, null};
        this.f3906y0 = null;
        this.f3908z0 = null;
        this.A0 = -1;
        this.B0 = -1;
        d();
    }

    private boolean Y(int i2) {
        d dVar;
        d dVar2;
        int i3 = i2 * 2;
        d[] dVarArr = this.P;
        d dVar3 = dVarArr[i3];
        d dVar4 = dVar3.f3842f;
        return (dVar4 == null || dVar4.f3842f == dVar3 || (dVar2 = (dVar = dVarArr[i3 + 1]).f3842f) == null || dVar2.f3842f != dVar) ? false : true;
    }

    private void d() {
        this.Q.add(this.H);
        this.Q.add(this.I);
        this.Q.add(this.J);
        this.Q.add(this.K);
        this.Q.add(this.M);
        this.Q.add(this.N);
        this.Q.add(this.O);
        this.Q.add(this.L);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019d  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:212:0x0370 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:215:0x0379  */
    /* JADX WARN: Code duplicated, block: B:217:0x037d  */
    /* JADX WARN: Code duplicated, block: B:218:0x037f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x0390  */
    /* JADX WARN: Code duplicated, block: B:225:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:228:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:232:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:233:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:242:0x0404  */
    /* JADX WARN: Code duplicated, block: B:244:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x0418  */
    /* JADX WARN: Code duplicated, block: B:252:0x041e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:274:0x044c  */
    /* JADX WARN: Code duplicated, block: B:276:0x0450  */
    /* JADX WARN: Code duplicated, block: B:278:0x0456 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:282:0x045f A[PHI: r1
      0x045f: PHI (r1v39 int) = (r1v38 int), (r1v43 int), (r1v43 int), (r1v43 int) binds: [B:275:0x044e, B:277:0x0454, B:278:0x0456, B:280:0x045a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:285:0x0471  */
    /* JADX WARN: Code duplicated, block: B:287:0x0475  */
    /* JADX WARN: Code duplicated, block: B:288:0x047a  */
    /* JADX WARN: Code duplicated, block: B:290:0x047d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:301:0x049a  */
    /* JADX WARN: Code duplicated, block: B:324:0x04cf A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:326:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:345:0x0510  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:357:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:74:0x0110  */
    /* JADX WARN: Code duplicated, block: B:78:0x0117  */
    /* JADX WARN: Code duplicated, block: B:80:0x011a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0141  */
    /* JADX WARN: Code duplicated, block: B:98:0x0163  */
    private void i(u.d dVar, boolean z2, boolean z3, boolean z4, boolean z5, u.i iVar, u.i iVar2, b bVar, boolean z6, d dVar2, d dVar3, int i2, int i3, int i4, int i5, float f2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i6, int i7, int i8, int i9, float f3, boolean z12) {
        int i10;
        boolean z13;
        int iMin;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z14;
        d.b bVarJ;
        d.b bVar2;
        u.i iVarQ;
        e eVar;
        d.b bVar3;
        boolean z15;
        int i17;
        char c2;
        int i18;
        d dVar4;
        int i19;
        boolean z16;
        char c3;
        boolean z17;
        boolean z18;
        boolean z19;
        int i20;
        int i21;
        boolean z20;
        u.i iVar3;
        e eVar2;
        int i22;
        boolean z21;
        boolean z22;
        int iMin2;
        int i23;
        int iE;
        int i24;
        int i25;
        int iE2;
        e eVar3;
        int i26;
        int i27;
        boolean z23;
        int i28;
        int i29;
        boolean z24;
        boolean z25;
        boolean z26;
        int i30;
        int i31;
        e eVar4;
        e eVar5;
        u.i iVarQ2 = dVar.q(dVar2);
        u.i iVarQ3 = dVar.q(dVar3);
        u.i iVarQ4 = dVar.q(dVar2.i());
        u.i iVarQ5 = dVar.q(dVar3.i());
        u.d.w();
        boolean zN = dVar2.n();
        boolean zN2 = dVar3.n();
        boolean zN3 = this.O.n();
        int i32 = zN2 ? (zN ? 1 : 0) + 1 : zN ? 1 : 0;
        if (zN3) {
            i32++;
        }
        int i33 = z7 ? 3 : i6;
        int i34 = a.f3910b[bVar.ordinal()];
        if (i34 != 1 && i34 != 2 && i34 != 3 && i34 == 4) {
            i10 = i33;
            z13 = i10 != 4;
            if (this.f3880l0 == 8) {
                iMin = 0;
                z13 = false;
            } else {
                iMin = i3;
            }
            if (!z12) {
                if (zN && !zN2 && !zN3) {
                    dVar.f(iVarQ2, i2);
                } else if (zN && !zN2) {
                    i11 = 8;
                    dVar.e(iVarQ2, iVarQ4, dVar2.e(), 8);
                }
                i11 = 8;
            } else {
                i11 = 8;
            }
            if (!z13) {
                if (i32 == 2 && !z7 && (i10 == 1 || i10 == 0)) {
                    int iMax = Math.max(i8, iMin);
                    if (i9 > 0) {
                        iMax = Math.min(i9, iMax);
                    }
                    dVar.e(iVarQ3, iVarQ2, iMax, 8);
                    i16 = i8;
                    i13 = i9;
                    iVarQ4 = iVarQ4;
                    iVarQ3 = iVarQ3;
                    z14 = false;
                    i15 = i32;
                } else {
                    if (i8 == -2) {
                        i12 = iMin;
                    } else {
                        i12 = i8;
                    }
                    if (i9 == -2) {
                        i13 = iMin;
                    } else {
                        i13 = i9;
                    }
                    if (iMin > 0 && i10 != 1) {
                        iMin = 0;
                    }
                    if (i12 > 0) {
                        dVar.h(iVarQ3, iVarQ2, i12, 8);
                        iMin = Math.max(iMin, i12);
                    }
                    if (i13 > 0) {
                        if (z3 || i10 != 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            i14 = 8;
                            dVar.j(iVarQ3, iVarQ2, i13, 8);
                        } else {
                            i14 = 8;
                        }
                        iMin = Math.min(iMin, i13);
                    } else {
                        i14 = 8;
                    }
                    if (i10 == 1) {
                        if (z3) {
                            dVar.e(iVarQ3, iVarQ2, iMin, i14);
                        } else {
                            dVar.e(iVarQ3, iVarQ2, iMin, 5);
                            dVar.j(iVarQ3, iVarQ2, iMin, i14);
                        }
                        i16 = i12;
                    } else if (i10 == 2) {
                        bVarJ = dVar2.j();
                        bVar2 = d.b.TOP;
                        if (bVarJ != bVar2 || dVar2.j() == d.b.BOTTOM) {
                            iVarQ = dVar.q(this.T.m(bVar2));
                            eVar = this.T;
                            bVar3 = d.b.BOTTOM;
                        } else {
                            iVarQ = dVar.q(this.T.m(d.b.LEFT));
                            eVar = this.T;
                            bVar3 = d.b.RIGHT;
                        }
                        u.i iVarQ6 = dVar.q(eVar.m(bVar3));
                        u.i iVar4 = iVarQ;
                        u.b bVarR = dVar.r();
                        int i35 = i12;
                        iVarQ5 = iVarQ5;
                        iVarQ4 = iVarQ4;
                        i15 = i32 == true ? 1 : 0;
                        iVarQ3 = iVarQ3;
                        dVar.d(bVarR.k(iVarQ3, iVarQ2, iVarQ6, iVar4, f3));
                        z5 = z5;
                        i16 = i35;
                        z14 = false;
                    } else {
                        iVarQ4 = iVarQ4;
                        iVarQ3 = iVarQ3;
                        int i36 = i12;
                        iVarQ5 = iVarQ5;
                        i15 = i32;
                        i16 = i36;
                        z14 = z13;
                        z5 = true;
                    }
                }
                if (z12 || z9) {
                    i17 = 0;
                    c2 = 2;
                    i18 = 1;
                    if (i15 >= c2 && z3 && z5) {
                        dVar.h(iVarQ2, iVar, i17, 8);
                        int i37 = (z2 || this.L.f3842f == null) ? i18 : i17;
                        if (z2 || (dVar4 = this.L.f3842f) == null) {
                            i18 = i37;
                        } else {
                            e eVar6 = dVar4.f3840d;
                            if (eVar6.W != 0.0f) {
                                b[] bVarArr = eVar6.S;
                                b bVar4 = bVarArr[i17];
                                b bVar5 = b.MATCH_CONSTRAINT;
                                if (bVar4 != bVar5 || bVarArr[i18] != bVar5) {
                                    i18 = i17;
                                }
                            } else {
                                i18 = i17;
                            }
                        }
                        if (i18 != 0) {
                            dVar.h(iVar2, iVarQ3, i17, 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ((zN || zN2 || zN3) && (!zN || zN2)) {
                    if (zN || !zN2) {
                        i19 = 0;
                        if (zN && zN2) {
                            e eVar7 = dVar2.f3842f.f3840d;
                            e eVar8 = dVar3.f3842f.f3840d;
                            e eVarI = I();
                            int i38 = 6;
                            if (z14) {
                                if (i10 == 0) {
                                    if (i13 != 0 || i16 != 0) {
                                        z24 = false;
                                        z25 = true;
                                        z26 = true;
                                        i30 = 5;
                                        i31 = 5;
                                    } else if (iVarQ4.f3781g && iVarQ5.f3781g) {
                                        dVar.e(iVarQ2, iVarQ4, dVar2.e(), 8);
                                        dVar.e(iVarQ3, iVarQ5, -dVar3.e(), 8);
                                        return;
                                    } else {
                                        z25 = false;
                                        z26 = false;
                                        z24 = true;
                                        i30 = 8;
                                        i31 = 8;
                                    }
                                    if ((eVar7 instanceof v.a) || (eVar8 instanceof v.a)) {
                                        z18 = z26;
                                        i21 = i30;
                                        z16 = true;
                                        i20 = 4;
                                        z17 = z25;
                                        z19 = z24;
                                    } else {
                                        z18 = z26;
                                        i21 = i30;
                                        i20 = i31;
                                        z16 = true;
                                        z17 = z25;
                                        z19 = z24;
                                    }
                                    c3 = 3;
                                    iVar2 = iVar2;
                                    if (z18 || iVarQ4 != iVarQ5 || eVar7 == eVarI) {
                                        z20 = z16;
                                    } else {
                                        z18 = false;
                                        z20 = false;
                                    }
                                    if (z17) {
                                        if (z14 && !z8 && !z10 && iVarQ4 == iVar && iVarQ5 == iVar2) {
                                            z21 = false;
                                            i38 = 8;
                                            i21 = 8;
                                            z20 = false;
                                        } else {
                                            z21 = z3;
                                        }
                                        iVar3 = iVarQ3;
                                        i22 = 4;
                                        eVar2 = eVarI;
                                        dVar.c(iVarQ2, iVarQ4, dVar2.e(), f2, iVarQ5, iVar3, dVar3.e(), i38);
                                    } else {
                                        iVar3 = iVarQ3;
                                        eVar2 = eVarI;
                                        i22 = 4;
                                        z21 = z3;
                                    }
                                    z22 = z20;
                                    if (this.f3880l0 != 8 && !dVar3.l()) {
                                        return;
                                    }
                                    if (z18) {
                                        if (z21 || iVarQ4 == iVarQ5 || z14 || !((eVar7 instanceof v.a) || (eVar8 instanceof v.a))) {
                                            i27 = i21;
                                        } else {
                                            i27 = 6;
                                        }
                                        dVar.h(iVarQ2, iVarQ4, dVar2.e(), i27);
                                        iVarQ3 = iVar3;
                                        dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i27);
                                        i21 = i27;
                                    } else {
                                        iVarQ3 = iVar3;
                                    }
                                    if (z21 || !z11 || (eVar7 instanceof v.a) || (eVar8 instanceof v.a)) {
                                        iMin2 = i20;
                                        i23 = i21;
                                    } else {
                                        iMin2 = 6;
                                        i23 = 6;
                                        z22 = z16;
                                    }
                                    if (z22) {
                                        if (z19 || (z10 && !z4)) {
                                            eVar3 = eVar2;
                                        } else {
                                            eVar3 = eVar2;
                                            if (eVar7 != eVar3 && eVar8 != eVar3) {
                                                i38 = iMin2;
                                            }
                                            if ((eVar7 instanceof g) || (eVar8 instanceof g)) {
                                                i38 = 5;
                                            }
                                            if ((eVar7 instanceof v.a) || (eVar8 instanceof v.a)) {
                                                i38 = 5;
                                            }
                                            iMin2 = Math.max(z10 ? 5 : i38, iMin2);
                                        }
                                        if (z21) {
                                            iMin2 = Math.min(i23, iMin2);
                                            if (z7 || z10 || !(eVar7 == eVar3 || eVar8 == eVar3)) {
                                                i26 = iMin2;
                                            } else {
                                                i26 = i22;
                                            }
                                        } else {
                                            i26 = iMin2;
                                        }
                                        dVar.e(iVarQ2, iVarQ4, dVar2.e(), i26);
                                        dVar.e(iVarQ3, iVarQ5, -dVar3.e(), i26);
                                    }
                                    if (z21) {
                                        if (iVar == iVarQ4) {
                                            iE2 = dVar2.e();
                                        } else {
                                            iE2 = 0;
                                        }
                                        if (iVarQ4 != iVar) {
                                            dVar.h(iVarQ2, iVar, iE2, 5);
                                        }
                                    }
                                    if (!z21 && z14 && i4 == 0 && i16 == 0) {
                                        if (z14 && i25 == 3) {
                                            i25 = i10;
                                            i24 = 8;
                                            iE = 0;
                                        } else {
                                            i25 = i10;
                                            iE = 0;
                                            i24 = 5;
                                        }
                                        dVar.h(iVarQ3, iVarQ2, iE, i24);
                                    } else {
                                        iE = 0;
                                    }
                                } else {
                                    if (i10 == 1) {
                                        i38 = 6;
                                        c3 = 3;
                                        z16 = true;
                                        z17 = true;
                                        z19 = false;
                                        z18 = true;
                                        i20 = 4;
                                    } else {
                                        if (i10 != 3) {
                                            z16 = true;
                                            c3 = 3;
                                            i38 = 6;
                                            z17 = false;
                                            z19 = false;
                                            z18 = false;
                                            i20 = 4;
                                            i21 = 5;
                                            iVar2 = iVar2;
                                        } else if (this.f3905y == -1) {
                                            c3 = 3;
                                            z16 = true;
                                            z17 = true;
                                            z19 = true;
                                            z18 = true;
                                            if (z10) {
                                                i38 = z3 ? 5 : 4;
                                            } else {
                                                i38 = 8;
                                            }
                                            i20 = 5;
                                        } else if (z7) {
                                            if (i7 != 2) {
                                                z16 = true;
                                                if (i7 != 1) {
                                                    z23 = false;
                                                }
                                                if (z23) {
                                                    i28 = 5;
                                                    i29 = 4;
                                                } else {
                                                    i28 = 8;
                                                    i29 = 5;
                                                }
                                                i21 = i28;
                                                i20 = i29;
                                                z17 = z16;
                                                z19 = z17;
                                                z18 = z19;
                                            } else {
                                                z16 = true;
                                            }
                                            z23 = z16;
                                            if (z23) {
                                                i28 = 8;
                                                i29 = 5;
                                            } else {
                                                i28 = 5;
                                                i29 = 4;
                                            }
                                            i21 = i28;
                                            i20 = i29;
                                            z17 = z16;
                                            z19 = z17;
                                            z18 = z19;
                                        } else {
                                            z16 = true;
                                            if (i13 > 0) {
                                                iVar2 = iVar2;
                                                z17 = true;
                                                z19 = true;
                                                z18 = true;
                                                i38 = 6;
                                                c3 = 3;
                                                i20 = 5;
                                            } else if (i13 != 0 || i16 != 0) {
                                                z17 = true;
                                                z19 = true;
                                                z18 = true;
                                                c3 = 3;
                                            } else if (z10) {
                                                iVar2 = iVar2;
                                                i21 = (eVar7 == eVarI || eVar8 == eVarI) ? 5 : 4;
                                                z17 = true;
                                                z19 = true;
                                                z18 = true;
                                                i38 = 6;
                                                c3 = 3;
                                                i20 = 4;
                                            } else {
                                                iVar2 = iVar2;
                                                z17 = true;
                                                z19 = true;
                                                z18 = true;
                                                i38 = 6;
                                                c3 = 3;
                                                i20 = 8;
                                            }
                                            i21 = 5;
                                        }
                                        if (z18) {
                                            z20 = z16;
                                        } else {
                                            z20 = z16;
                                        }
                                        if (z17) {
                                            if (z14) {
                                                z21 = z3;
                                            } else {
                                                z21 = z3;
                                            }
                                            iVar3 = iVarQ3;
                                            i22 = 4;
                                            eVar2 = eVarI;
                                            dVar.c(iVarQ2, iVarQ4, dVar2.e(), f2, iVarQ5, iVar3, dVar3.e(), i38);
                                        } else {
                                            iVar3 = iVarQ3;
                                            eVar2 = eVarI;
                                            i22 = 4;
                                            z21 = z3;
                                        }
                                        z22 = z20;
                                        if (this.f3880l0 != 8) {
                                        }
                                        if (z18) {
                                            if (z21) {
                                                i27 = i21;
                                            } else {
                                                i27 = i21;
                                            }
                                            dVar.h(iVarQ2, iVarQ4, dVar2.e(), i27);
                                            iVarQ3 = iVar3;
                                            dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i27);
                                            i21 = i27;
                                        } else {
                                            iVarQ3 = iVar3;
                                        }
                                        if (z21) {
                                            iMin2 = i20;
                                            i23 = i21;
                                        } else {
                                            iMin2 = i20;
                                            i23 = i21;
                                        }
                                        if (z22) {
                                            if (z19) {
                                                eVar3 = eVar2;
                                            } else {
                                                eVar3 = eVar2;
                                            }
                                            if (z21) {
                                                iMin2 = Math.min(i23, iMin2);
                                                if (z7) {
                                                    i26 = iMin2;
                                                } else {
                                                    i26 = iMin2;
                                                }
                                            } else {
                                                i26 = iMin2;
                                            }
                                            dVar.e(iVarQ2, iVarQ4, dVar2.e(), i26);
                                            dVar.e(iVarQ3, iVarQ5, -dVar3.e(), i26);
                                        }
                                        if (z21) {
                                            if (iVar == iVarQ4) {
                                                iE2 = dVar2.e();
                                            } else {
                                                iE2 = 0;
                                            }
                                            if (iVarQ4 != iVar) {
                                                dVar.h(iVarQ2, iVar, iE2, 5);
                                            }
                                        }
                                        if (!z21) {
                                            iE = 0;
                                        } else {
                                            iE = 0;
                                        }
                                    }
                                    i21 = 8;
                                    if (z18) {
                                        z20 = z16;
                                    } else {
                                        z20 = z16;
                                    }
                                    if (z17) {
                                        if (z14) {
                                            z21 = z3;
                                        } else {
                                            z21 = z3;
                                        }
                                        iVar3 = iVarQ3;
                                        i22 = 4;
                                        eVar2 = eVarI;
                                        dVar.c(iVarQ2, iVarQ4, dVar2.e(), f2, iVarQ5, iVar3, dVar3.e(), i38);
                                    } else {
                                        iVar3 = iVarQ3;
                                        eVar2 = eVarI;
                                        i22 = 4;
                                        z21 = z3;
                                    }
                                    z22 = z20;
                                    if (this.f3880l0 != 8) {
                                    }
                                    if (z18) {
                                        if (z21) {
                                            i27 = i21;
                                        } else {
                                            i27 = i21;
                                        }
                                        dVar.h(iVarQ2, iVarQ4, dVar2.e(), i27);
                                        iVarQ3 = iVar3;
                                        dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i27);
                                        i21 = i27;
                                    } else {
                                        iVarQ3 = iVar3;
                                    }
                                    if (z21) {
                                        iMin2 = i20;
                                        i23 = i21;
                                    } else {
                                        iMin2 = i20;
                                        i23 = i21;
                                    }
                                    if (z22) {
                                        if (z19) {
                                            eVar3 = eVar2;
                                        } else {
                                            eVar3 = eVar2;
                                        }
                                        if (z21) {
                                            iMin2 = Math.min(i23, iMin2);
                                            if (z7) {
                                                i26 = iMin2;
                                            } else {
                                                i26 = iMin2;
                                            }
                                        } else {
                                            i26 = iMin2;
                                        }
                                        dVar.e(iVarQ2, iVarQ4, dVar2.e(), i26);
                                        dVar.e(iVarQ3, iVarQ5, -dVar3.e(), i26);
                                    }
                                    if (z21) {
                                        if (iVar == iVarQ4) {
                                            iE2 = dVar2.e();
                                        } else {
                                            iE2 = 0;
                                        }
                                        if (iVarQ4 != iVar) {
                                            dVar.h(iVarQ2, iVar, iE2, 5);
                                        }
                                    }
                                    if (!z21) {
                                        iE = 0;
                                    } else {
                                        iE = 0;
                                    }
                                }
                                c3 = 3;
                                iVar2 = iVar2;
                                if (z18) {
                                    z20 = z16;
                                } else {
                                    z20 = z16;
                                }
                                if (z17) {
                                    if (z14) {
                                        z21 = z3;
                                    } else {
                                        z21 = z3;
                                    }
                                    iVar3 = iVarQ3;
                                    i22 = 4;
                                    eVar2 = eVarI;
                                    dVar.c(iVarQ2, iVarQ4, dVar2.e(), f2, iVarQ5, iVar3, dVar3.e(), i38);
                                } else {
                                    iVar3 = iVarQ3;
                                    eVar2 = eVarI;
                                    i22 = 4;
                                    z21 = z3;
                                }
                                z22 = z20;
                                if (this.f3880l0 != 8) {
                                }
                                if (z18) {
                                    if (z21) {
                                        i27 = i21;
                                    } else {
                                        i27 = i21;
                                    }
                                    dVar.h(iVarQ2, iVarQ4, dVar2.e(), i27);
                                    iVarQ3 = iVar3;
                                    dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i27);
                                    i21 = i27;
                                } else {
                                    iVarQ3 = iVar3;
                                }
                                if (z21) {
                                    iMin2 = i20;
                                    i23 = i21;
                                } else {
                                    iMin2 = i20;
                                    i23 = i21;
                                }
                                if (z22) {
                                    if (z19) {
                                        eVar3 = eVar2;
                                    } else {
                                        eVar3 = eVar2;
                                    }
                                    if (z21) {
                                        iMin2 = Math.min(i23, iMin2);
                                        if (z7) {
                                            i26 = iMin2;
                                        } else {
                                            i26 = iMin2;
                                        }
                                    } else {
                                        i26 = iMin2;
                                    }
                                    dVar.e(iVarQ2, iVarQ4, dVar2.e(), i26);
                                    dVar.e(iVarQ3, iVarQ5, -dVar3.e(), i26);
                                }
                                if (z21) {
                                    if (iVar == iVarQ4) {
                                        iE2 = dVar2.e();
                                    } else {
                                        iE2 = 0;
                                    }
                                    if (iVarQ4 != iVar) {
                                        dVar.h(iVarQ2, iVar, iE2, 5);
                                    }
                                }
                                if (!z21) {
                                    iE = 0;
                                } else {
                                    iE = 0;
                                }
                            } else {
                                z16 = true;
                                if (iVarQ4.f3781g && iVarQ5.f3781g) {
                                    dVar.c(iVarQ2, iVarQ4, dVar2.e(), f2, iVarQ5, iVarQ3, dVar3.e(), 8);
                                    if (z3 && z5) {
                                        int iE3 = dVar3.f3842f != null ? dVar3.e() : 0;
                                        if (iVarQ5 != iVar2) {
                                            dVar.h(iVar2, iVarQ3, iE3, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                c3 = 3;
                                z17 = true;
                                z18 = true;
                                z19 = false;
                            }
                            i20 = 4;
                            i21 = 5;
                            if (z18) {
                                z20 = z16;
                            } else {
                                z20 = z16;
                            }
                            if (z17) {
                                if (z14) {
                                    z21 = z3;
                                } else {
                                    z21 = z3;
                                }
                                iVar3 = iVarQ3;
                                i22 = 4;
                                eVar2 = eVarI;
                                dVar.c(iVarQ2, iVarQ4, dVar2.e(), f2, iVarQ5, iVar3, dVar3.e(), i38);
                            } else {
                                iVar3 = iVarQ3;
                                eVar2 = eVarI;
                                i22 = 4;
                                z21 = z3;
                            }
                            z22 = z20;
                            if (this.f3880l0 != 8) {
                            }
                            if (z18) {
                                if (z21) {
                                    i27 = i21;
                                } else {
                                    i27 = i21;
                                }
                                dVar.h(iVarQ2, iVarQ4, dVar2.e(), i27);
                                iVarQ3 = iVar3;
                                dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i27);
                                i21 = i27;
                            } else {
                                iVarQ3 = iVar3;
                            }
                            if (z21) {
                                iMin2 = i20;
                                i23 = i21;
                            } else {
                                iMin2 = i20;
                                i23 = i21;
                            }
                            if (z22) {
                                if (z19) {
                                    eVar3 = eVar2;
                                } else {
                                    eVar3 = eVar2;
                                }
                                if (z21) {
                                    iMin2 = Math.min(i23, iMin2);
                                    if (z7) {
                                        i26 = iMin2;
                                    } else {
                                        i26 = iMin2;
                                    }
                                } else {
                                    i26 = iMin2;
                                }
                                dVar.e(iVarQ2, iVarQ4, dVar2.e(), i26);
                                dVar.e(iVarQ3, iVarQ5, -dVar3.e(), i26);
                            }
                            if (z21) {
                                if (iVar == iVarQ4) {
                                    iE2 = dVar2.e();
                                } else {
                                    iE2 = 0;
                                }
                                if (iVarQ4 != iVar) {
                                    dVar.h(iVarQ2, iVar, iE2, 5);
                                }
                            }
                            if (!z21) {
                                iE = 0;
                            } else {
                                iE = 0;
                            }
                        }
                    } else {
                        dVar.e(iVarQ3, iVarQ5, -dVar3.e(), 8);
                        if (z3) {
                            if (this.f3875j && iVarQ2.f3781g && (eVar4 = this.T) != null) {
                                f fVar = (f) eVar4;
                                if (z2) {
                                    fVar.i1(dVar2);
                                } else {
                                    fVar.n1(dVar2);
                                }
                            } else {
                                i19 = 0;
                                dVar.h(iVarQ2, iVar, 0, 5);
                            }
                        }
                        iE = 0;
                        z21 = z3;
                    }
                    iE = i19;
                    z21 = z3;
                } else {
                    iE = 0;
                    z21 = z3;
                }
                if (z21 && z5) {
                    if (dVar3.f3842f != null) {
                        iE = dVar3.e();
                    }
                    if (iVarQ5 != iVar2) {
                        if (!this.f3875j || !iVarQ3.f3781g || (eVar5 = this.T) == null) {
                            dVar.h(iVar2, iVarQ3, iE, 5);
                            return;
                        }
                        f fVar2 = (f) eVar5;
                        if (z2) {
                            fVar2.h1(dVar3);
                            return;
                        } else {
                            fVar2.m1(dVar3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (z6) {
                dVar.e(iVarQ3, iVarQ2, 0, 3);
                if (i4 > 0) {
                    dVar.h(iVarQ3, iVarQ2, i4, 8);
                }
                if (i5 < Integer.MAX_VALUE) {
                    dVar.j(iVarQ3, iVarQ2, i5, 8);
                }
            } else {
                dVar.e(iVarQ3, iVarQ2, iMin, i11);
            }
            i16 = i8;
            i13 = i9;
            z14 = z13;
            i15 = i32;
            if (z12) {
                i17 = 0;
                c2 = 2;
                i18 = 1;
            } else {
                i17 = 0;
                c2 = 2;
                i18 = 1;
            }
            if (i15 >= c2) {
            }
        }
        i10 = i33;
        if (this.f3880l0 == 8) {
            iMin = 0;
            z13 = false;
        } else {
            iMin = i3;
        }
        if (!z12) {
            i11 = 8;
        } else if (zN) {
            if (zN) {
                i11 = 8;
            } else {
                i11 = 8;
            }
        } else if (zN) {
            i11 = 8;
        } else {
            i11 = 8;
        }
        if (!z13) {
            if (i32 == 2) {
            }
            if (i8 == -2) {
                i12 = iMin;
            } else {
                i12 = i8;
            }
            if (i9 == -2) {
                i13 = iMin;
            } else {
                i13 = i9;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i12 > 0) {
                dVar.h(iVarQ3, iVarQ2, i12, 8);
                iMin = Math.max(iMin, i12);
            }
            if (i13 > 0) {
                if (z3) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z15) {
                    i14 = 8;
                    dVar.j(iVarQ3, iVarQ2, i13, 8);
                } else {
                    i14 = 8;
                }
                iMin = Math.min(iMin, i13);
            } else {
                i14 = 8;
            }
            if (i10 == 1) {
                if (z3) {
                    dVar.e(iVarQ3, iVarQ2, iMin, i14);
                } else {
                    dVar.e(iVarQ3, iVarQ2, iMin, 5);
                    dVar.j(iVarQ3, iVarQ2, iMin, i14);
                }
                i16 = i12;
            } else if (i10 == 2) {
                bVarJ = dVar2.j();
                bVar2 = d.b.TOP;
                if (bVarJ != bVar2) {
                    iVarQ = dVar.q(this.T.m(bVar2));
                    eVar = this.T;
                    bVar3 = d.b.BOTTOM;
                } else {
                    iVarQ = dVar.q(this.T.m(bVar2));
                    eVar = this.T;
                    bVar3 = d.b.BOTTOM;
                }
                u.i iVarQ7 = dVar.q(eVar.m(bVar3));
                u.i iVar5 = iVarQ;
                u.b bVarR2 = dVar.r();
                int i39 = i12;
                iVarQ5 = iVarQ5;
                iVarQ4 = iVarQ4;
                i15 = i32 == true ? 1 : 0;
                iVarQ3 = iVarQ3;
                dVar.d(bVarR2.k(iVarQ3, iVarQ2, iVarQ7, iVar5, f3));
                z5 = z5;
                i16 = i39;
                z14 = false;
            } else {
                iVarQ4 = iVarQ4;
                iVarQ3 = iVarQ3;
                int i310 = i12;
                iVarQ5 = iVarQ5;
                i15 = i32;
                i16 = i310;
                z14 = z13;
                z5 = true;
            }
            if (z12) {
                i17 = 0;
                c2 = 2;
                i18 = 1;
            } else {
                i17 = 0;
                c2 = 2;
                i18 = 1;
            }
            if (i15 >= c2) {
            }
        }
        if (z6) {
            dVar.e(iVarQ3, iVarQ2, 0, 3);
            if (i4 > 0) {
                dVar.h(iVarQ3, iVarQ2, i4, 8);
            }
            if (i5 < Integer.MAX_VALUE) {
                dVar.j(iVarQ3, iVarQ2, i5, 8);
            }
        } else {
            dVar.e(iVarQ3, iVarQ2, iMin, i11);
        }
        i16 = i8;
        i13 = i9;
        z14 = z13;
        i15 = i32;
        if (z12) {
            i17 = 0;
            c2 = 2;
            i18 = 1;
        } else {
            i17 = 0;
            c2 = 2;
            i18 = 1;
        }
        if (i15 >= c2) {
        }
    }

    public int A() {
        return this.F;
    }

    public void A0(int i2, int i3, int i4, float f2) {
        this.f3887p = i2;
        this.f3893s = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.f3895t = i4;
        this.f3897u = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f3887p = 2;
    }

    public int B() {
        return this.G;
    }

    public void B0(float f2) {
        this.f3900v0[0] = f2;
    }

    public int C(int i2) {
        if (i2 == 0) {
            return R();
        }
        if (i2 == 1) {
            return v();
        }
        return 0;
    }

    protected void C0(int i2, boolean z2) {
        this.R[i2] = z2;
    }

    public int D() {
        return this.A[1];
    }

    public void D0(boolean z2) {
        this.D = z2;
    }

    public int E() {
        return this.A[0];
    }

    public void E0(boolean z2) {
        this.E = z2;
    }

    public int F() {
        return this.f3870g0;
    }

    public void F0(int i2, int i3) {
        this.F = i2;
        this.G = i3;
        I0(false);
    }

    public int G() {
        return this.f3868f0;
    }

    public void G0(int i2) {
        this.A[1] = i2;
    }

    public e H(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.K).f3842f) != null && dVar2.f3842f == dVar) {
                return dVar2.f3840d;
            }
            return null;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f3842f;
        if (dVar4 == null || dVar4.f3842f != dVar3) {
            return null;
        }
        return dVar4.f3840d;
    }

    public void H0(int i2) {
        this.A[0] = i2;
    }

    public e I() {
        return this.T;
    }

    public void I0(boolean z2) {
        this.f3873i = z2;
    }

    public e J(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.I).f3842f) != null && dVar2.f3842f == dVar) {
                return dVar2.f3840d;
            }
            return null;
        }
        d dVar3 = this.H;
        d dVar4 = dVar3.f3842f;
        if (dVar4 == null || dVar4.f3842f != dVar3) {
            return null;
        }
        return dVar4.f3840d;
    }

    public void J0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f3870g0 = i2;
    }

    public int K() {
        return S() + this.U;
    }

    public void K0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f3868f0 = i2;
    }

    public p L(int i2) {
        if (i2 == 0) {
            return this.f3865e;
        }
        if (i2 == 1) {
            return this.f3867f;
        }
        return null;
    }

    public void L0(int i2, int i3) {
        this.Y = i2;
        this.Z = i3;
    }

    public float M() {
        return this.f3874i0;
    }

    public void M0(e eVar) {
        this.T = eVar;
    }

    public int N() {
        return this.f3894s0;
    }

    public void N0(float f2) {
        this.f3874i0 = f2;
    }

    public b O() {
        return this.S[1];
    }

    public void O0(int i2) {
        this.f3894s0 = i2;
    }

    public int P() {
        int i2 = this.H != null ? 0 + this.I.f3843g : 0;
        return this.J != null ? i2 + this.K.f3843g : i2;
    }

    public void P0(int i2, int i3) {
        this.Z = i2;
        int i4 = i3 - i2;
        this.V = i4;
        int i5 = this.f3870g0;
        if (i4 < i5) {
            this.V = i5;
        }
    }

    public int Q() {
        return this.f3880l0;
    }

    public void Q0(b bVar) {
        this.S[1] = bVar;
    }

    public int R() {
        if (this.f3880l0 == 8) {
            return 0;
        }
        return this.U;
    }

    public void R0(int i2, int i3, int i4, float f2) {
        this.f3889q = i2;
        this.f3899v = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.f3901w = i4;
        this.f3903x = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f3889q = 2;
    }

    public int S() {
        e eVar = this.T;
        return (eVar == null || !(eVar instanceof f)) ? this.Y : ((f) eVar).J0 + this.Y;
    }

    public void S0(float f2) {
        this.f3900v0[1] = f2;
    }

    public int T() {
        e eVar = this.T;
        return (eVar == null || !(eVar instanceof f)) ? this.Z : ((f) eVar).K0 + this.Z;
    }

    public void T0(int i2) {
        this.f3880l0 = i2;
    }

    public boolean U() {
        return this.C;
    }

    public void U0(int i2) {
        this.U = i2;
        int i3 = this.f3868f0;
        if (i2 < i3) {
            this.U = i3;
        }
    }

    public boolean V(int i2) {
        if (i2 == 0) {
            return (this.H.f3842f != null ? 1 : 0) + (this.J.f3842f != null ? 1 : 0) < 2;
        }
        return ((this.I.f3842f != null ? 1 : 0) + (this.K.f3842f != null ? 1 : 0)) + (this.L.f3842f != null ? 1 : 0) < 2;
    }

    public void V0(int i2) {
        this.Y = i2;
    }

    public boolean W() {
        int size = this.Q.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.Q.get(i2).l()) {
                return true;
            }
        }
        return false;
    }

    public void W0(int i2) {
        this.Z = i2;
    }

    public void X(d.b bVar, e eVar, d.b bVar2, int i2, int i3) {
        m(bVar).a(eVar.m(bVar2), i2, i3, true);
    }

    public void X0(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.f3905y == -1) {
            if (z4 && !z5) {
                this.f3905y = 0;
            } else if (!z4 && z5) {
                this.f3905y = 1;
                if (this.X == -1) {
                    this.f3907z = 1.0f / this.f3907z;
                }
            }
        }
        if (this.f3905y == 0 && (!this.I.n() || !this.K.n())) {
            this.f3905y = 1;
        } else if (this.f3905y == 1 && (!this.H.n() || !this.J.n())) {
            this.f3905y = 0;
        }
        if (this.f3905y == -1 && (!this.I.n() || !this.K.n() || !this.H.n() || !this.J.n())) {
            if (this.I.n() && this.K.n()) {
                this.f3905y = 0;
            } else if (this.H.n() && this.J.n()) {
                this.f3907z = 1.0f / this.f3907z;
                this.f3905y = 1;
            }
        }
        if (this.f3905y == -1) {
            int i2 = this.f3893s;
            if (i2 > 0 && this.f3899v == 0) {
                this.f3905y = 0;
            } else {
                if (i2 != 0 || this.f3899v <= 0) {
                    return;
                }
                this.f3907z = 1.0f / this.f3907z;
                this.f3905y = 1;
            }
        }
    }

    public void Y0(boolean z2, boolean z3) {
        int i2;
        int i3;
        boolean zK = z2 & this.f3865e.k();
        boolean zK2 = z3 & this.f3867f.k();
        w.l lVar = this.f3865e;
        int i4 = lVar.f4016h.f3964g;
        n nVar = this.f3867f;
        int i5 = nVar.f4016h.f3964g;
        int i6 = lVar.f4017i.f3964g;
        int i7 = nVar.f4017i.f3964g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (zK) {
            this.Y = i4;
        }
        if (zK2) {
            this.Z = i5;
        }
        if (this.f3880l0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        if (zK) {
            if (this.S[0] == b.FIXED && i9 < (i3 = this.U)) {
                i9 = i3;
            }
            this.U = i9;
            int i11 = this.f3868f0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
        if (zK2) {
            if (this.S[1] == b.FIXED && i10 < (i2 = this.V)) {
                i10 = i2;
            }
            this.V = i10;
            int i12 = this.f3870g0;
            if (i10 < i12) {
                this.V = i12;
            }
        }
    }

    public boolean Z() {
        d dVar = this.H;
        d dVar2 = dVar.f3842f;
        if (dVar2 != null && dVar2.f3842f == dVar) {
            return true;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f3842f;
        return dVar4 != null && dVar4.f3842f == dVar3;
    }

    public void Z0(u.d dVar, boolean z2) {
        n nVar;
        w.l lVar;
        int iX = dVar.x(this.H);
        int iX2 = dVar.x(this.I);
        int iX3 = dVar.x(this.J);
        int iX4 = dVar.x(this.K);
        if (z2 && (lVar = this.f3865e) != null) {
            w.f fVar = lVar.f4016h;
            if (fVar.f3967j) {
                w.f fVar2 = lVar.f4017i;
                if (fVar2.f3967j) {
                    iX = fVar.f3964g;
                    iX3 = fVar2.f3964g;
                }
            }
        }
        if (z2 && (nVar = this.f3867f) != null) {
            w.f fVar3 = nVar.f4016h;
            if (fVar3.f3967j) {
                w.f fVar4 = nVar.f4017i;
                if (fVar4.f3967j) {
                    iX2 = fVar3.f3964g;
                    iX4 = fVar4.f3964g;
                }
            }
        }
        int i2 = iX4 - iX2;
        if (iX3 - iX < 0 || i2 < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX = 0;
            iX4 = 0;
            iX2 = 0;
            iX3 = 0;
        }
        t0(iX, iX2, iX3, iX4);
    }

    public boolean a0() {
        return this.D;
    }

    public boolean b0() {
        d dVar = this.I;
        d dVar2 = dVar.f3842f;
        if (dVar2 != null && dVar2.f3842f == dVar) {
            return true;
        }
        d dVar3 = this.K;
        d dVar4 = dVar3.f3842f;
        return dVar4 != null && dVar4.f3842f == dVar3;
    }

    public boolean c0() {
        return this.E;
    }

    public boolean d0() {
        return this.f3873i && this.f3880l0 != 8;
    }

    public void e(f fVar, u.d dVar, HashSet<e> hashSet, int i2, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.B1(64));
        }
        if (i2 == 0) {
            HashSet<d> hashSetC = this.H.c();
            if (hashSetC != null) {
                Iterator<d> it = hashSetC.iterator();
                while (it.hasNext()) {
                    it.next().f3840d.e(fVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<d> hashSetC2 = this.J.c();
            if (hashSetC2 != null) {
                Iterator<d> it2 = hashSetC2.iterator();
                while (it2.hasNext()) {
                    it2.next().f3840d.e(fVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetC3 = this.I.c();
        if (hashSetC3 != null) {
            Iterator<d> it3 = hashSetC3.iterator();
            while (it3.hasNext()) {
                it3.next().f3840d.e(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> hashSetC4 = this.K.c();
        if (hashSetC4 != null) {
            Iterator<d> it4 = hashSetC4.iterator();
            while (it4.hasNext()) {
                it4.next().f3840d.e(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> hashSetC5 = this.L.c();
        if (hashSetC5 != null) {
            Iterator<d> it5 = hashSetC5.iterator();
            while (it5.hasNext()) {
                it5.next().f3840d.e(fVar, dVar, hashSet, i2, true);
            }
        }
    }

    public boolean e0() {
        return this.f3879l || (this.H.m() && this.J.m());
    }

    boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0() {
        return this.f3881m || (this.I.m() && this.K.m());
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 14661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void g(u.d r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.g(u.d, boolean):void");
    }

    public boolean g0() {
        b[] bVarArr = this.S;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public boolean h() {
        return this.f3880l0 != 8;
    }

    public void h0() {
        this.H.p();
        this.I.p();
        this.J.p();
        this.K.p();
        this.L.p();
        this.M.p();
        this.N.p();
        this.O.p();
        this.T = null;
        this.B = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f3862c0 = 0;
        this.f3864d0 = 0;
        this.f3866e0 = 0;
        this.f3868f0 = 0;
        this.f3870g0 = 0;
        float f2 = C0;
        this.f3872h0 = f2;
        this.f3874i0 = f2;
        b[] bVarArr = this.S;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f3876j0 = null;
        this.f3878k0 = 0;
        this.f3880l0 = 0;
        this.f3884n0 = null;
        this.f3886o0 = false;
        this.f3888p0 = false;
        this.f3892r0 = 0;
        this.f3894s0 = 0;
        this.f3896t0 = false;
        this.f3898u0 = false;
        float[] fArr = this.f3900v0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3883n = -1;
        this.f3885o = -1;
        int[] iArr = this.A;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f3887p = 0;
        this.f3889q = 0;
        this.f3897u = 1.0f;
        this.f3903x = 1.0f;
        this.f3895t = Integer.MAX_VALUE;
        this.f3901w = Integer.MAX_VALUE;
        this.f3893s = 0;
        this.f3899v = 0;
        this.f3871h = false;
        this.f3905y = -1;
        this.f3907z = 1.0f;
        this.f3890q0 = false;
        boolean[] zArr = this.f3869g;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3873i = true;
    }

    public void i0() {
        this.f3879l = false;
        this.f3881m = false;
        int size = this.Q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.Q.get(i2).q();
        }
    }

    public void j(e eVar, float f2, int i2) {
        d.b bVar = d.b.CENTER;
        X(bVar, eVar, bVar, i2, 0);
        this.B = f2;
    }

    public void j0(u.c cVar) {
        this.H.r(cVar);
        this.I.r(cVar);
        this.J.r(cVar);
        this.K.r(cVar);
        this.L.r(cVar);
        this.O.r(cVar);
        this.M.r(cVar);
        this.N.r(cVar);
    }

    public void k(u.d dVar) {
        dVar.q(this.H);
        dVar.q(this.I);
        dVar.q(this.J);
        dVar.q(this.K);
        if (this.f3866e0 > 0) {
            dVar.q(this.L);
        }
    }

    public void k0(int i2) {
        this.f3866e0 = i2;
        this.C = i2 > 0;
    }

    public void l() {
        if (this.f3865e == null) {
            this.f3865e = new w.l(this);
        }
        if (this.f3867f == null) {
            this.f3867f = new n(this);
        }
    }

    public void l0(Object obj) {
        this.f3876j0 = obj;
    }

    public d m(d.b bVar) {
        switch (a.f3909a[bVar.ordinal()]) {
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(String str) {
        this.f3882m0 = str;
    }

    public int n() {
        return this.f3866e0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void n0(String str) {
        float fAbs;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            this.W = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i3 = 0;
        int i4 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i3 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i4 = i3;
            i3 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i3);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i2;
                }
            } else {
                String strSubstring3 = str.substring(i3, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i2;
                } else {
                    float f2 = Float.parseFloat(strSubstring3);
                    float f3 = Float.parseFloat(strSubstring4);
                    if (f2 <= 0.0f || f3 <= 0.0f) {
                        fAbs = i2;
                    } else {
                        fAbs = i4 == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i2 = (fAbs > i2 ? 1 : (fAbs == i2 ? 0 : -1));
        if (i2 > 0) {
            this.W = fAbs;
            this.X = i4;
        }
    }

    public float o(int i2) {
        if (i2 == 0) {
            return this.f3872h0;
        }
        if (i2 == 1) {
            return this.f3874i0;
        }
        return -1.0f;
    }

    public void o0(int i2) {
        if (this.C) {
            int i3 = i2 - this.f3866e0;
            int i4 = this.V + i3;
            this.Z = i3;
            this.I.s(i3);
            this.K.s(i4);
            this.L.s(i2);
            this.f3881m = true;
        }
    }

    public int p() {
        return T() + this.V;
    }

    public void p0(int i2, int i3) {
        this.H.s(i2);
        this.J.s(i3);
        this.Y = i2;
        this.U = i3 - i2;
        this.f3879l = true;
    }

    public Object q() {
        return this.f3876j0;
    }

    public void q0(int i2) {
        this.H.s(i2);
        this.Y = i2;
    }

    public String r() {
        return this.f3882m0;
    }

    public void r0(int i2) {
        this.I.s(i2);
        this.Z = i2;
    }

    public b s(int i2) {
        if (i2 == 0) {
            return y();
        }
        if (i2 == 1) {
            return O();
        }
        return null;
    }

    public void s0(int i2, int i3) {
        this.I.s(i2);
        this.K.s(i3);
        this.Z = i2;
        this.V = i3 - i2;
        if (this.C) {
            this.L.s(i2 + this.f3866e0);
        }
        this.f3881m = true;
    }

    public float t() {
        return this.W;
    }

    public void t0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.Y = i2;
        this.Z = i3;
        if (this.f3880l0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        b[] bVarArr = this.S;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.U)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.V)) {
            i9 = i6;
        }
        this.U = i8;
        this.V = i9;
        int i10 = this.f3870g0;
        if (i9 < i10) {
            this.V = i10;
        }
        int i11 = this.f3868f0;
        if (i8 < i11) {
            this.U = i11;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f3884n0 != null) {
            str = "type: " + this.f3884n0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f3882m0 != null) {
            str2 = "id: " + this.f3882m0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.X;
    }

    public void u0(boolean z2) {
        this.C = z2;
    }

    public int v() {
        if (this.f3880l0 == 8) {
            return 0;
        }
        return this.V;
    }

    public void v0(int i2) {
        this.V = i2;
        int i3 = this.f3870g0;
        if (i2 < i3) {
            this.V = i3;
        }
    }

    public float w() {
        return this.f3872h0;
    }

    public void w0(float f2) {
        this.f3872h0 = f2;
    }

    public int x() {
        return this.f3892r0;
    }

    public void x0(int i2) {
        this.f3892r0 = i2;
    }

    public b y() {
        return this.S[0];
    }

    public void y0(int i2, int i3) {
        this.Y = i2;
        int i4 = i3 - i2;
        this.U = i4;
        int i5 = this.f3868f0;
        if (i4 < i5) {
            this.U = i5;
        }
    }

    public int z() {
        d dVar = this.H;
        int i2 = dVar != null ? 0 + dVar.f3843g : 0;
        d dVar2 = this.J;
        return dVar2 != null ? i2 + dVar2.f3843g : i2;
    }

    public void z0(b bVar) {
        this.S[0] = bVar;
    }
}
