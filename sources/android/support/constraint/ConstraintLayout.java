package android.support.constraint;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SparseArray<View> f123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<android.support.constraint.c> f124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected v.f f125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected d f133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap<String, Integer> f135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SparseArray<v.e> f142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    c f143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f145x;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f146a;

        static {
            int[] iArr = new int[v.e.b.values().length];
            f146a = iArr;
            try {
                iArr[v.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f146a[v.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f146a[v.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f146a[v.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        boolean f148a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f149b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        boolean f150b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f151c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        boolean f152c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f153d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        int f154d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f155e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        int f156e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f157f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        int f158f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f159g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f160g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f161h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        int f162h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f163i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        int f164i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f165j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        float f166j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f167k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        int f168k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f169l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f170l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f171m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        float f172m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f173n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        v.e f174n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f175o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f176o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f177p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f178q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f179r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f180s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f181t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f182u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f183v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f184w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f185x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f186y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f187z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f188a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f188a = sparseIntArray;
                sparseIntArray.append(k.N1, 8);
                sparseIntArray.append(k.O1, 9);
                sparseIntArray.append(k.Q1, 10);
                sparseIntArray.append(k.R1, 11);
                sparseIntArray.append(k.X1, 12);
                sparseIntArray.append(k.W1, 13);
                sparseIntArray.append(k.v1, 14);
                sparseIntArray.append(k.u1, 15);
                sparseIntArray.append(k.s1, 16);
                sparseIntArray.append(k.w1, 2);
                sparseIntArray.append(k.y1, 3);
                sparseIntArray.append(k.x1, 4);
                sparseIntArray.append(k.f2, 49);
                sparseIntArray.append(k.g2, 50);
                sparseIntArray.append(k.C1, 5);
                sparseIntArray.append(k.D1, 6);
                sparseIntArray.append(k.E1, 7);
                sparseIntArray.append(k.f335b1, 1);
                sparseIntArray.append(k.S1, 17);
                sparseIntArray.append(k.T1, 18);
                sparseIntArray.append(k.B1, 19);
                sparseIntArray.append(k.A1, 20);
                sparseIntArray.append(k.j2, 21);
                sparseIntArray.append(k.m2, 22);
                sparseIntArray.append(k.k2, 23);
                sparseIntArray.append(k.h2, 24);
                sparseIntArray.append(k.l2, 25);
                sparseIntArray.append(k.i2, 26);
                sparseIntArray.append(k.J1, 29);
                sparseIntArray.append(k.Y1, 30);
                sparseIntArray.append(k.z1, 44);
                sparseIntArray.append(k.L1, 45);
                sparseIntArray.append(k.a2, 46);
                sparseIntArray.append(k.K1, 47);
                sparseIntArray.append(k.Z1, 48);
                sparseIntArray.append(k.q1, 27);
                sparseIntArray.append(k.p1, 28);
                sparseIntArray.append(k.b2, 31);
                sparseIntArray.append(k.F1, 32);
                sparseIntArray.append(k.d2, 33);
                sparseIntArray.append(k.c2, 34);
                sparseIntArray.append(k.e2, 35);
                sparseIntArray.append(k.H1, 36);
                sparseIntArray.append(k.G1, 37);
                sparseIntArray.append(k.I1, 38);
                sparseIntArray.append(k.M1, 39);
                sparseIntArray.append(k.V1, 40);
                sparseIntArray.append(k.P1, 41);
                sparseIntArray.append(k.t1, 42);
                sparseIntArray.append(k.r1, 43);
                sparseIntArray.append(k.U1, 51);
            }
        }

        public b(int i2, int i3) {
            super(i2, i3);
            this.f147a = -1;
            this.f149b = -1;
            this.f151c = -1.0f;
            this.f153d = -1;
            this.f155e = -1;
            this.f157f = -1;
            this.f159g = -1;
            this.f161h = -1;
            this.f163i = -1;
            this.f165j = -1;
            this.f167k = -1;
            this.f169l = -1;
            this.f171m = -1;
            this.f173n = 0;
            this.f175o = 0.0f;
            this.f177p = -1;
            this.f178q = -1;
            this.f179r = -1;
            this.f180s = -1;
            this.f181t = -1;
            this.f182u = -1;
            this.f183v = -1;
            this.f184w = -1;
            this.f185x = -1;
            this.f186y = -1;
            this.f187z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f148a0 = false;
            this.f150b0 = false;
            this.f152c0 = false;
            this.f154d0 = -1;
            this.f156e0 = -1;
            this.f158f0 = -1;
            this.f160g0 = -1;
            this.f162h0 = -1;
            this.f164i0 = -1;
            this.f166j0 = 0.5f;
            this.f174n0 = new v.e();
            this.f176o0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            String str;
            int i2;
            float fAbs;
            super(context, attributeSet);
            this.f147a = -1;
            this.f149b = -1;
            this.f151c = -1.0f;
            this.f153d = -1;
            this.f155e = -1;
            this.f157f = -1;
            this.f159g = -1;
            this.f161h = -1;
            this.f163i = -1;
            this.f165j = -1;
            this.f167k = -1;
            this.f169l = -1;
            this.f171m = -1;
            this.f173n = 0;
            this.f175o = 0.0f;
            this.f177p = -1;
            this.f178q = -1;
            this.f179r = -1;
            this.f180s = -1;
            this.f181t = -1;
            this.f182u = -1;
            this.f183v = -1;
            this.f184w = -1;
            this.f185x = -1;
            this.f186y = -1;
            this.f187z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f148a0 = false;
            this.f150b0 = false;
            this.f152c0 = false;
            this.f154d0 = -1;
            this.f156e0 = -1;
            this.f158f0 = -1;
            this.f160g0 = -1;
            this.f162h0 = -1;
            this.f164i0 = -1;
            this.f166j0 = 0.5f;
            this.f174n0 = new v.e();
            this.f176o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f332a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = a.f188a.get(index);
                switch (i4) {
                    case 1:
                        this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f171m);
                        this.f171m = resourceId;
                        if (resourceId == -1) {
                            this.f171m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.f173n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f173n);
                        continue;
                        break;
                    case 4:
                        float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.f175o) % 360.0f;
                        this.f175o = f2;
                        if (f2 < 0.0f) {
                            this.f175o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f147a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f147a);
                        continue;
                        break;
                    case 6:
                        this.f149b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f149b);
                        continue;
                        break;
                    case 7:
                        this.f151c = typedArrayObtainStyledAttributes.getFloat(index, this.f151c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f153d);
                        this.f153d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f153d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f155e);
                        this.f155e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f155e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f157f);
                        this.f157f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f157f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f159g);
                        this.f159g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f159g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f161h);
                        this.f161h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f161h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f163i);
                        this.f163i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f163i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f165j);
                        this.f165j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f165j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f167k);
                        this.f167k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f167k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f169l);
                        this.f169l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f169l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f177p);
                        this.f177p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f177p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f178q);
                        this.f178q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f178q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f179r);
                        this.f179r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f179r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f180s);
                        this.f180s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f180s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.f181t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f181t);
                        continue;
                        break;
                    case 22:
                        this.f182u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f182u);
                        continue;
                        break;
                    case 23:
                        this.f183v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f183v);
                        continue;
                        break;
                    case 24:
                        this.f184w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f184w);
                        continue;
                        break;
                    case 25:
                        this.f185x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f185x);
                        continue;
                        break;
                    case 26:
                        this.f186y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f186y);
                        continue;
                        break;
                    case 27:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                        break;
                    case 28:
                        this.U = typedArrayObtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                        break;
                    case 29:
                        this.f187z = typedArrayObtainStyledAttributes.getFloat(index, this.f187z);
                        continue;
                        break;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        continue;
                        break;
                    case 31:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                        break;
                    case 32:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.J = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                        break;
                    case 33:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        continue;
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i2 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.B.substring(i2);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                            this.C = fAbs;
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(i2, iIndexOf2);
                                        String strSubstring4 = this.B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f3 = Float.parseFloat(strSubstring3);
                                                float f4 = Float.parseFloat(strSubstring4);
                                                if (f3 > 0.0f && f4 > 0.0f) {
                                                    fAbs = this.D == 1 ? Math.abs(f4 / f3) : Math.abs(f3 / f4);
                                                    this.C = fAbs;
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = typedArrayObtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f147a = -1;
            this.f149b = -1;
            this.f151c = -1.0f;
            this.f153d = -1;
            this.f155e = -1;
            this.f157f = -1;
            this.f159g = -1;
            this.f161h = -1;
            this.f163i = -1;
            this.f165j = -1;
            this.f167k = -1;
            this.f169l = -1;
            this.f171m = -1;
            this.f173n = 0;
            this.f175o = 0.0f;
            this.f177p = -1;
            this.f178q = -1;
            this.f179r = -1;
            this.f180s = -1;
            this.f181t = -1;
            this.f182u = -1;
            this.f183v = -1;
            this.f184w = -1;
            this.f185x = -1;
            this.f186y = -1;
            this.f187z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f148a0 = false;
            this.f150b0 = false;
            this.f152c0 = false;
            this.f154d0 = -1;
            this.f156e0 = -1;
            this.f158f0 = -1;
            this.f160g0 = -1;
            this.f162h0 = -1;
            this.f164i0 = -1;
            this.f166j0 = 0.5f;
            this.f174n0 = new v.e();
            this.f176o0 = false;
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.W = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.X = false;
                if (i3 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f151c == -1.0f && this.f147a == -1 && this.f149b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.f174n0 instanceof v.g)) {
                this.f174n0 = new v.g();
            }
            ((v.g) this.f174n0).j1(this.S);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
        /* JADX WARN: Code duplicated, block: B:40:0x0085 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x0087  */
        /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i8 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i2);
            boolean z2 = false;
            boolean z3 = 1 == getLayoutDirection();
            this.f158f0 = -1;
            this.f160g0 = -1;
            this.f154d0 = -1;
            this.f156e0 = -1;
            this.f162h0 = this.f181t;
            this.f164i0 = this.f183v;
            float f2 = this.f187z;
            this.f166j0 = f2;
            int i9 = this.f147a;
            this.f168k0 = i9;
            int i10 = this.f149b;
            this.f170l0 = i10;
            float f3 = this.f151c;
            this.f172m0 = f3;
            if (z3) {
                int i11 = this.f177p;
                if (i11 != -1) {
                    this.f158f0 = i11;
                } else {
                    int i12 = this.f178q;
                    if (i12 != -1) {
                        this.f160g0 = i12;
                    } else {
                        i3 = this.f179r;
                        if (i3 != -1) {
                            this.f156e0 = i3;
                            z2 = true;
                        }
                        i4 = this.f180s;
                        if (i4 != -1) {
                            this.f154d0 = i4;
                            z2 = true;
                        }
                        i5 = this.f185x;
                        if (i5 != -1) {
                            this.f164i0 = i5;
                        }
                        i6 = this.f186y;
                        if (i6 != -1) {
                            this.f162h0 = i6;
                        }
                        if (z2) {
                            this.f166j0 = 1.0f - f2;
                        }
                        if (this.Z && this.S == 1) {
                            if (f3 != -1.0f) {
                                this.f172m0 = 1.0f - f3;
                                this.f168k0 = -1;
                                this.f170l0 = -1;
                            } else {
                                if (i9 != -1) {
                                    this.f170l0 = i9;
                                    this.f168k0 = -1;
                                } else if (i10 != -1) {
                                    this.f168k0 = i10;
                                    this.f170l0 = -1;
                                }
                                this.f172m0 = -1.0f;
                            }
                        }
                    }
                }
                z2 = true;
                i3 = this.f179r;
                if (i3 != -1) {
                    this.f156e0 = i3;
                    z2 = true;
                }
                i4 = this.f180s;
                if (i4 != -1) {
                    this.f154d0 = i4;
                    z2 = true;
                }
                i5 = this.f185x;
                if (i5 != -1) {
                    this.f164i0 = i5;
                }
                i6 = this.f186y;
                if (i6 != -1) {
                    this.f162h0 = i6;
                }
                if (z2) {
                    this.f166j0 = 1.0f - f2;
                }
                if (this.Z) {
                    if (f3 != -1.0f) {
                        this.f172m0 = 1.0f - f3;
                        this.f168k0 = -1;
                        this.f170l0 = -1;
                    } else {
                        if (i9 != -1) {
                            this.f170l0 = i9;
                            this.f168k0 = -1;
                        } else if (i10 != -1) {
                            this.f168k0 = i10;
                            this.f170l0 = -1;
                        }
                        this.f172m0 = -1.0f;
                    }
                }
            } else {
                int i13 = this.f177p;
                if (i13 != -1) {
                    this.f156e0 = i13;
                }
                int i14 = this.f178q;
                if (i14 != -1) {
                    this.f154d0 = i14;
                }
                int i15 = this.f179r;
                if (i15 != -1) {
                    this.f158f0 = i15;
                }
                int i16 = this.f180s;
                if (i16 != -1) {
                    this.f160g0 = i16;
                }
                int i17 = this.f185x;
                if (i17 != -1) {
                    this.f162h0 = i17;
                }
                int i18 = this.f186y;
                if (i18 != -1) {
                    this.f164i0 = i18;
                }
            }
            if (this.f179r == -1 && this.f180s == -1 && this.f178q == -1 && this.f177p == -1) {
                int i19 = this.f157f;
                if (i19 != -1) {
                    this.f158f0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i8 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i8;
                    }
                } else {
                    int i20 = this.f159g;
                    if (i20 != -1) {
                        this.f160g0 = i20;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i8 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i8;
                        }
                    }
                }
                int i21 = this.f153d;
                if (i21 != -1) {
                    this.f154d0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                        return;
                    }
                } else {
                    int i22 = this.f155e;
                    if (i22 == -1) {
                        return;
                    }
                    this.f156e0 = i22;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
            }
        }
    }

    class c implements w.b.InterfaceC0046b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195g;

        public c(ConstraintLayout constraintLayout) {
            this.f189a = constraintLayout;
        }

        private boolean d(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        @Override // w.b.InterfaceC0046b
        public final void a() {
            int childCount = this.f189a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f189a.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.f189a);
                }
            }
            int size = this.f189a.f124c.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((android.support.constraint.c) this.f189a.f124c.get(i3)).k(this.f189a);
                }
            }
        }

        @Override // w.b.InterfaceC0046b
        @SuppressLint({"WrongCall"})
        public final void b(v.e eVar, w.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int iMakeMeasureSpec3;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            if (eVar == null) {
                return;
            }
            if (eVar.Q() == 8 && !eVar.a0()) {
                aVar.f3941e = 0;
                aVar.f3942f = 0;
                aVar.f3943g = 0;
                return;
            }
            if (eVar.I() == null) {
                return;
            }
            v.e.b bVar = aVar.f3937a;
            v.e.b bVar2 = aVar.f3938b;
            int iR = aVar.f3939c;
            int iV = aVar.f3940d;
            int iP = this.f190b + this.f191c;
            int iZ = this.f192d;
            View view = (View) eVar.q();
            int[] iArr = a.f146a;
            int i7 = iArr[bVar.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iR, 1073741824);
            } else {
                if (i7 == 2) {
                    i5 = this.f194f;
                    i6 = -2;
                } else if (i7 == 3) {
                    i5 = this.f194f;
                    iZ += eVar.z();
                    i6 = -1;
                } else if (i7 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f194f, iZ, -2);
                    boolean z2 = eVar.f3887p == 1;
                    int i8 = aVar.f3946j;
                    if (i8 == w.b.a.f3935l || i8 == w.b.a.f3936m) {
                        if (aVar.f3946j == w.b.a.f3936m || !z2 || (z2 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof i) || eVar.e0()) {
                            iR = eVar.R();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iR, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i5, iZ, i6);
            }
            int i9 = iArr[bVar2.ordinal()];
            if (i9 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iV, 1073741824);
            } else {
                if (i9 == 2) {
                    i3 = this.f195g;
                    i4 = -2;
                } else if (i9 == 3) {
                    i3 = this.f195g;
                    iP += eVar.P();
                    i4 = -1;
                } else if (i9 != 4) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f195g, iP, -2);
                    boolean z3 = eVar.f3889q == 1;
                    int i10 = aVar.f3946j;
                    if (i10 == w.b.a.f3935l || i10 == w.b.a.f3936m) {
                        if (aVar.f3946j == w.b.a.f3936m || !z3 || (z3 && (view.getMeasuredWidth() == eVar.R())) || (view instanceof i) || eVar.f0()) {
                            iV = eVar.v();
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iV, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, iP, i4);
            }
            v.f fVar = (v.f) eVar.I();
            if (fVar != null && v.j.b(ConstraintLayout.this.f131j, 256) && view.getMeasuredWidth() == eVar.R() && view.getMeasuredWidth() < fVar.R() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.d0()) {
                if (d(eVar.A(), iMakeMeasureSpec, eVar.R()) && d(eVar.B(), iMakeMeasureSpec2, eVar.v())) {
                    aVar.f3941e = eVar.R();
                    aVar.f3942f = eVar.v();
                    aVar.f3943g = eVar.n();
                    return;
                }
            }
            v.e.b bVar3 = v.e.b.MATCH_CONSTRAINT;
            boolean z4 = bVar == bVar3;
            boolean z5 = bVar2 == bVar3;
            v.e.b bVar4 = v.e.b.MATCH_PARENT;
            boolean z6 = bVar2 == bVar4 || bVar2 == v.e.b.FIXED;
            boolean z7 = bVar == bVar4 || bVar == v.e.b.FIXED;
            boolean z8 = z4 && eVar.W > 0.0f;
            boolean z9 = z5 && eVar.W > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i11 = aVar.f3946j;
            if (i11 != w.b.a.f3935l && i11 != w.b.a.f3936m && z4 && eVar.f3887p == 0 && z5 && eVar.f3889q == 0) {
                i2 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof l) && (eVar instanceof v.k)) {
                    ((l) view).o((v.k) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.F0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i12 = eVar.f3893s;
                iMax = i12 > 0 ? Math.max(i12, measuredWidth) : measuredWidth;
                int i13 = eVar.f3895t;
                if (i13 > 0) {
                    iMax = Math.min(i13, iMax);
                }
                int i14 = eVar.f3899v;
                iMax2 = i14 > 0 ? Math.max(i14, measuredHeight) : measuredHeight;
                int i15 = eVar.f3901w;
                if (i15 > 0) {
                    iMax2 = Math.min(i15, iMax2);
                }
                if (!v.j.b(ConstraintLayout.this.f131j, 1)) {
                    if (z8 && z6) {
                        iMax = (int) ((iMax2 * eVar.W) + 0.5f);
                    } else if (z9 && z7) {
                        iMax2 = (int) ((iMax / eVar.W) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec;
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    eVar.F0(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i2 = -1;
            }
            boolean z10 = baseline != i2;
            aVar.f3945i = (iMax == aVar.f3939c && iMax2 == aVar.f3940d) ? false : true;
            if (bVar5.Y) {
                z10 = true;
            }
            if (z10 && baseline != -1 && eVar.n() != baseline) {
                aVar.f3945i = true;
            }
            aVar.f3941e = iMax;
            aVar.f3942f = iMax2;
            aVar.f3944h = z10;
            aVar.f3943g = baseline;
        }

        public void c(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f190b = i4;
            this.f191c = i5;
            this.f192d = i6;
            this.f193e = i7;
            this.f194f = i2;
            this.f195g = i3;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f123b = new SparseArray<>();
        this.f124c = new ArrayList<>(4);
        this.f125d = new v.f();
        this.f126e = 0;
        this.f127f = 0;
        this.f128g = Integer.MAX_VALUE;
        this.f129h = Integer.MAX_VALUE;
        this.f130i = true;
        this.f131j = 257;
        this.f132k = null;
        this.f133l = null;
        this.f134m = -1;
        this.f135n = new HashMap<>();
        this.f136o = -1;
        this.f137p = -1;
        this.f138q = -1;
        this.f139r = -1;
        this.f140s = 0;
        this.f141t = 0;
        this.f142u = new SparseArray<>();
        this.f143v = new c(this);
        this.f144w = 0;
        this.f145x = 0;
        j(attributeSet, 0, 0);
    }

    private final v.e g(int i2) {
        if (i2 == 0) {
            return this.f125d;
        }
        View viewFindViewById = this.f123b.get(i2);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f125d;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f174n0;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private void j(AttributeSet attributeSet, int i2, int i3) {
        this.f125d.l0(this);
        this.f125d.D1(this.f143v);
        this.f123b.put(getId(), this);
        this.f132k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f332a1, i2, i3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == k.f347f1) {
                    this.f126e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f126e);
                } else if (index == k.f350g1) {
                    this.f127f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f127f);
                } else if (index == k.f341d1) {
                    this.f128g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f128g);
                } else if (index == k.f344e1) {
                    this.f129h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f129h);
                } else if (index == k.n2) {
                    this.f131j = typedArrayObtainStyledAttributes.getInt(index, this.f131j);
                } else if (index == k.o1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f133l = null;
                        }
                    }
                } else if (index == k.l1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f132k = eVar;
                        eVar.i(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f132k = null;
                    }
                    this.f134m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f125d.E1(this.f131j);
    }

    private void l() {
        this.f130i = true;
        this.f136o = -1;
        this.f137p = -1;
        this.f138q = -1;
        this.f139r = -1;
        this.f140s = 0;
        this.f141t = 0;
    }

    private void p() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            v.e eVarI = i(getChildAt(i2));
            if (eVarI != null) {
                eVarI.h0();
            }
        }
        if (zIsInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f134m != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.f134m && (childAt2 instanceof f)) {
                    this.f132k = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.f132k;
        if (eVar != null) {
            eVar.c(this, true);
        }
        this.f125d.d1();
        int size = this.f124c.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f124c.get(i5).m(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.f142u.clear();
        this.f142u.put(0, this.f125d);
        this.f142u.put(getId(), this.f125d);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.f142u.put(childAt4.getId(), i(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            v.e eVarI2 = i(childAt5);
            if (eVarI2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f125d.a(eVarI2);
                c(zIsInEditMode, childAt5, eVarI2, bVar, this.f142u);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).isLayoutRequested()) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            p();
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    protected void c(boolean z2, View view, v.e eVar, b bVar, SparseArray<v.e> sparseArray) {
        float f2;
        v.e eVar2;
        v.d.b bVar2;
        v.d.b bVar3;
        int i2;
        v.e eVar3;
        v.d.b bVar4;
        int i3;
        v.d.b bVar5;
        v.e eVar4;
        v.d.b bVar6;
        v.d.b bVar7;
        int i4;
        int i5;
        v.e eVar5;
        v.d.b bVar8;
        int i6;
        int i7;
        v.d.b bVar9;
        int i8;
        bVar.a();
        bVar.f176o0 = false;
        eVar.T0(view.getVisibility());
        if (bVar.f150b0) {
            eVar.D0(true);
            eVar.T0(8);
        }
        eVar.l0(view);
        if (view instanceof android.support.constraint.c) {
            ((android.support.constraint.c) view).i(eVar, this.f125d.x1());
        }
        if (bVar.Z) {
            v.g gVar = (v.g) eVar;
            int i9 = bVar.f168k0;
            int i10 = bVar.f170l0;
            float f3 = bVar.f172m0;
            if (f3 != -1.0f) {
                gVar.i1(f3);
                return;
            } else if (i9 != -1) {
                gVar.g1(i9);
                return;
            } else {
                if (i10 != -1) {
                    gVar.h1(i10);
                    return;
                }
                return;
            }
        }
        int i11 = bVar.f154d0;
        int i12 = bVar.f156e0;
        int i13 = bVar.f158f0;
        int i14 = bVar.f160g0;
        int i15 = bVar.f162h0;
        int i16 = bVar.f164i0;
        float f4 = bVar.f166j0;
        int i17 = bVar.f171m;
        if (i17 != -1) {
            v.e eVar6 = sparseArray.get(i17);
            if (eVar6 != null) {
                eVar.j(eVar6, bVar.f175o, bVar.f173n);
            }
        } else {
            if (i11 != -1) {
                eVar2 = sparseArray.get(i11);
                if (eVar2 != null) {
                    bVar3 = v.d.b.LEFT;
                    bVar2 = bVar3;
                    f2 = f4;
                    i2 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    eVar.X(bVar2, eVar2, bVar3, i2, i15);
                } else {
                    f2 = f4;
                }
            } else {
                f2 = f4;
                if (i12 != -1 && (eVar2 = sparseArray.get(i12)) != null) {
                    bVar2 = v.d.b.LEFT;
                    bVar3 = v.d.b.RIGHT;
                    i2 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    eVar.X(bVar2, eVar2, bVar3, i2, i15);
                }
            }
            if (i13 != -1) {
                eVar3 = sparseArray.get(i13);
                if (eVar3 != null) {
                    bVar5 = v.d.b.RIGHT;
                    bVar4 = v.d.b.LEFT;
                    i3 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                    eVar.X(bVar5, eVar3, bVar4, i3, i16);
                }
            } else if (i14 != -1 && (eVar3 = sparseArray.get(i14)) != null) {
                bVar4 = v.d.b.RIGHT;
                i3 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                bVar5 = bVar4;
                eVar.X(bVar5, eVar3, bVar4, i3, i16);
            }
            int i18 = bVar.f161h;
            if (i18 != -1) {
                eVar4 = sparseArray.get(i18);
                if (eVar4 != null) {
                    bVar7 = v.d.b.TOP;
                    i4 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i5 = bVar.f182u;
                    bVar6 = bVar7;
                    eVar.X(bVar6, eVar4, bVar7, i4, i5);
                }
            } else {
                int i19 = bVar.f163i;
                if (i19 != -1 && (eVar4 = sparseArray.get(i19)) != null) {
                    bVar6 = v.d.b.TOP;
                    bVar7 = v.d.b.BOTTOM;
                    i4 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i5 = bVar.f182u;
                    eVar.X(bVar6, eVar4, bVar7, i4, i5);
                }
            }
            int i20 = bVar.f165j;
            if (i20 != -1) {
                eVar5 = sparseArray.get(i20);
                if (eVar5 != null) {
                    bVar9 = v.d.b.BOTTOM;
                    bVar8 = v.d.b.TOP;
                    i6 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i7 = bVar.f184w;
                    eVar.X(bVar9, eVar5, bVar8, i6, i7);
                }
            } else {
                int i21 = bVar.f167k;
                if (i21 != -1 && (eVar5 = sparseArray.get(i21)) != null) {
                    bVar8 = v.d.b.BOTTOM;
                    i6 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i7 = bVar.f184w;
                    bVar9 = bVar8;
                    eVar.X(bVar9, eVar5, bVar8, i6, i7);
                }
            }
            int i22 = bVar.f169l;
            if (i22 != -1) {
                View view2 = this.f123b.get(i22);
                v.e eVar7 = sparseArray.get(bVar.f169l);
                if (eVar7 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                    b bVar10 = (b) view2.getLayoutParams();
                    bVar.Y = true;
                    bVar10.Y = true;
                    v.d.b bVar11 = v.d.b.BASELINE;
                    eVar.m(bVar11).a(eVar7.m(bVar11), 0, -1, true);
                    eVar.u0(true);
                    bVar10.f174n0.u0(true);
                    eVar.m(v.d.b.TOP).p();
                    eVar.m(v.d.b.BOTTOM).p();
                }
            }
            float f5 = f2;
            if (f5 >= 0.0f) {
                eVar.w0(f5);
            }
            float f6 = bVar.A;
            if (f6 >= 0.0f) {
                eVar.N0(f6);
            }
        }
        if (z2 && ((i8 = bVar.Q) != -1 || bVar.R != -1)) {
            eVar.L0(i8, bVar.R);
        }
        if (bVar.W) {
            eVar.z0(v.e.b.FIXED);
            eVar.U0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.z0(v.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            eVar.z0(bVar.T ? v.e.b.MATCH_CONSTRAINT : v.e.b.MATCH_PARENT);
            eVar.m(v.d.b.LEFT).f3843g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.m(v.d.b.RIGHT).f3843g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.z0(v.e.b.MATCH_CONSTRAINT);
            eVar.U0(0);
        }
        if (bVar.X) {
            eVar.Q0(v.e.b.FIXED);
            eVar.v0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.Q0(v.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            eVar.Q0(bVar.U ? v.e.b.MATCH_CONSTRAINT : v.e.b.MATCH_PARENT);
            eVar.m(v.d.b.TOP).f3843g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.m(v.d.b.BOTTOM).f3843g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.Q0(v.e.b.MATCH_CONSTRAINT);
            eVar.v0(0);
        }
        eVar.n0(bVar.B);
        eVar.B0(bVar.E);
        eVar.S0(bVar.F);
        eVar.x0(bVar.G);
        eVar.O0(bVar.H);
        eVar.A0(bVar.I, bVar.K, bVar.M, bVar.O);
        eVar.R0(bVar.J, bVar.L, bVar.N, bVar.P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<android.support.constraint.c> arrayList = this.f124c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f124c.get(i2).l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        int i9 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i7;
                        float f3 = i8;
                        float f4 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i8 + i9;
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f135n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f135n.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f129h;
    }

    public int getMaxWidth() {
        return this.f128g;
    }

    public int getMinHeight() {
        return this.f127f;
    }

    public int getMinWidth() {
        return this.f126e;
    }

    public int getOptimizationLevel() {
        return this.f125d.s1();
    }

    public View h(int i2) {
        return this.f123b.get(i2);
    }

    public final v.e i(View view) {
        if (view == this) {
            return this.f125d;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f174n0;
    }

    protected boolean k() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    protected void m(int i2) {
        this.f133l = new d(getContext(), this, i2);
    }

    protected void n(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        c cVar = this.f143v;
        int i6 = cVar.f193e;
        int iResolveSizeAndState = View.resolveSizeAndState(i4 + cVar.f192d, i2, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i5 + i6, i3, 0) & 16777215;
        int iMin = Math.min(this.f128g, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f129h, iResolveSizeAndState2);
        if (z2) {
            iMin |= 16777216;
        }
        if (z3) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f136o = iMin;
        this.f137p = iMin2;
    }

    protected void o(v.f fVar, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i5 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f143v.c(i3, i4, iMax, iMax2, paddingWidth, i5);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax4 = Math.max(0, getPaddingLeft());
        } else if (!k()) {
            iMax4 = iMax3;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        r(fVar, mode, i6, mode2, i7);
        fVar.z1(i2, mode, i6, mode2, i7, this.f136o, this.f137p, iMax4, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            b bVar = (b) childAt.getLayoutParams();
            v.e eVar = bVar.f174n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.f148a0 || bVar.f152c0 || zIsInEditMode) && !bVar.f150b0) {
                int iS = eVar.S();
                int iT = eVar.T();
                int iR = eVar.R() + iS;
                int iV = eVar.v() + iT;
                childAt.layout(iS, iT, iR, iV);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iS, iT, iR, iV);
                }
            }
        }
        int size = this.f124c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f124c.get(i7).j(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (!this.f130i) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).isLayoutRequested()) {
                    this.f130i = true;
                    break;
                }
            }
        }
        if (this.f130i) {
            this.f144w = i2;
            this.f145x = i3;
            this.f125d.F1(k());
            if (this.f130i) {
                this.f130i = false;
                if (s()) {
                    this.f125d.H1();
                }
            }
            o(this.f125d, this.f131j, i2, i3);
        } else {
            int i5 = this.f144w;
            if (i5 != i2 || this.f145x != i3) {
                if (i5 == i2 && View.MeasureSpec.getMode(i2) == 1073741824 && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f145x) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i3) >= this.f125d.v()) {
                    this.f144w = i2;
                    this.f145x = i3;
                } else {
                    this.f144w = i2;
                    this.f145x = i3;
                    this.f125d.F1(k());
                    if (this.f130i) {
                        this.f130i = false;
                        if (s()) {
                            this.f125d.H1();
                        }
                    }
                    o(this.f125d, this.f131j, i2, i3);
                }
            }
        }
        n(i2, i3, this.f125d.R(), this.f125d.v(), this.f125d.y1(), this.f125d.w1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        v.e eVarI = i(view);
        if ((view instanceof h) && !(eVarI instanceof v.g)) {
            b bVar = (b) view.getLayoutParams();
            v.g gVar = new v.g();
            bVar.f174n0 = gVar;
            bVar.Z = true;
            gVar.j1(bVar.S);
        }
        if (view instanceof android.support.constraint.c) {
            android.support.constraint.c cVar = (android.support.constraint.c) view;
            cVar.n();
            ((b) view.getLayoutParams()).f148a0 = true;
            if (!this.f124c.contains(cVar)) {
                this.f124c.add(cVar);
            }
        }
        this.f123b.put(view.getId(), view);
        this.f130i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f123b.remove(view.getId());
        this.f125d.c1(i(view));
        this.f124c.remove(view);
        this.f130i = true;
    }

    public void q(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f135n == null) {
                this.f135n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f135n.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r9
      0x002c: PHI (r9v2 v.e$b) = (r9v1 v.e$b), (r9v6 v.e$b) binds: [B:13:0x002a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r2
      0x004b: PHI (r2v2 v.e$b) = (r2v1 v.e$b), (r2v4 v.e$b) binds: [B:24:0x0049, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    protected void r(v.f fVar, int i2, int i3, int i4, int i5) {
        v.e.b bVar;
        c cVar = this.f143v;
        int i6 = cVar.f193e;
        int i7 = cVar.f192d;
        v.e.b bVar2 = v.e.b.FIXED;
        int childCount = getChildCount();
        if (i2 != Integer.MIN_VALUE) {
            if (i2 == 0) {
                bVar = v.e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i3 = Math.max(0, this.f126e);
                }
            } else if (i2 != 1073741824) {
                bVar = bVar2;
            } else {
                i3 = Math.min(this.f128g - i7, i3);
                bVar = bVar2;
            }
            i3 = 0;
        } else {
            bVar = v.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i3 = Math.max(0, this.f126e);
            }
        }
        if (i4 != Integer.MIN_VALUE) {
            if (i4 == 0) {
                bVar2 = v.e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i5 = Math.max(0, this.f127f);
                }
            } else if (i4 == 1073741824) {
                i5 = Math.min(this.f129h - i6, i5);
            }
            i5 = 0;
        } else {
            bVar2 = v.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i5 = Math.max(0, this.f127f);
            }
        }
        if (i3 != fVar.R() || i5 != fVar.v()) {
            fVar.v1();
        }
        fVar.V0(0);
        fVar.W0(0);
        fVar.H0(this.f128g - i7);
        fVar.G0(this.f129h - i6);
        fVar.K0(0);
        fVar.J0(0);
        fVar.z0(bVar);
        fVar.U0(i3);
        fVar.Q0(bVar2);
        fVar.v0(i5);
        fVar.K0(this.f126e - i7);
        fVar.J0(this.f127f - i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f132k = eVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f123b.remove(getId());
        super.setId(i2);
        this.f123b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f129h) {
            return;
        }
        this.f129h = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f128g) {
            return;
        }
        this.f128g = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f127f) {
            return;
        }
        this.f127f = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f126e) {
            return;
        }
        this.f126e = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.f133l;
        if (dVar != null) {
            dVar.c(gVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f131j = i2;
        this.f125d.E1(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
