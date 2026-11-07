package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f240d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static SparseIntArray f241e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, android.support.constraint.b> f242a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f243b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<Integer, a> f244c = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f246b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f247c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f248d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C0001e f249e = new C0001e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap<String, android.support.constraint.b> f250f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i2, ConstraintLayout.b bVar) {
            this.f245a = i2;
            b bVar2 = this.f248d;
            bVar2.f266h = bVar.f153d;
            bVar2.f268i = bVar.f155e;
            bVar2.f270j = bVar.f157f;
            bVar2.f272k = bVar.f159g;
            bVar2.f273l = bVar.f161h;
            bVar2.f274m = bVar.f163i;
            bVar2.f275n = bVar.f165j;
            bVar2.f276o = bVar.f167k;
            bVar2.f277p = bVar.f169l;
            bVar2.f278q = bVar.f177p;
            bVar2.f279r = bVar.f178q;
            bVar2.f280s = bVar.f179r;
            bVar2.f281t = bVar.f180s;
            bVar2.f282u = bVar.f187z;
            bVar2.f283v = bVar.A;
            bVar2.f284w = bVar.B;
            bVar2.f285x = bVar.f171m;
            bVar2.f286y = bVar.f173n;
            bVar2.f287z = bVar.f175o;
            bVar2.A = bVar.Q;
            bVar2.B = bVar.R;
            bVar2.C = bVar.S;
            bVar2.f264g = bVar.f151c;
            bVar2.f260e = bVar.f147a;
            bVar2.f262f = bVar.f149b;
            bVar2.f256c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f258d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.P = bVar.F;
            bVar2.Q = bVar.E;
            bVar2.S = bVar.H;
            bVar2.R = bVar.G;
            bVar2.f267h0 = bVar.T;
            bVar2.f269i0 = bVar.U;
            bVar2.T = bVar.I;
            bVar2.U = bVar.J;
            bVar2.V = bVar.M;
            bVar2.W = bVar.N;
            bVar2.X = bVar.K;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.O;
            bVar2.f253a0 = bVar.P;
            bVar2.f265g0 = bVar.V;
            bVar2.K = bVar.f182u;
            bVar2.M = bVar.f184w;
            bVar2.J = bVar.f181t;
            bVar2.L = bVar.f183v;
            bVar2.O = bVar.f185x;
            bVar2.N = bVar.f186y;
            bVar2.H = bVar.getMarginEnd();
            this.f248d.I = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i2, f.a aVar) {
            f(i2, aVar);
            this.f246b.f299d = aVar.f316p0;
            C0001e c0001e = this.f249e;
            c0001e.f303b = aVar.f319s0;
            c0001e.f304c = aVar.f320t0;
            c0001e.f305d = aVar.f321u0;
            c0001e.f306e = aVar.f322v0;
            c0001e.f307f = aVar.f323w0;
            c0001e.f308g = aVar.f324x0;
            c0001e.f309h = aVar.f325y0;
            c0001e.f310i = aVar.f326z0;
            c0001e.f311j = aVar.A0;
            c0001e.f312k = aVar.B0;
            c0001e.f314m = aVar.f318r0;
            c0001e.f313l = aVar.f317q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(android.support.constraint.c cVar, int i2, f.a aVar) {
            g(i2, aVar);
            if (cVar instanceof android.support.constraint.a) {
                b bVar = this.f248d;
                bVar.f259d0 = 1;
                android.support.constraint.a aVar2 = (android.support.constraint.a) cVar;
                bVar.f255b0 = aVar2.getType();
                this.f248d.f261e0 = aVar2.getReferencedIds();
                this.f248d.f257c0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f248d;
            bVar.f153d = bVar2.f266h;
            bVar.f155e = bVar2.f268i;
            bVar.f157f = bVar2.f270j;
            bVar.f159g = bVar2.f272k;
            bVar.f161h = bVar2.f273l;
            bVar.f163i = bVar2.f274m;
            bVar.f165j = bVar2.f275n;
            bVar.f167k = bVar2.f276o;
            bVar.f169l = bVar2.f277p;
            bVar.f177p = bVar2.f278q;
            bVar.f178q = bVar2.f279r;
            bVar.f179r = bVar2.f280s;
            bVar.f180s = bVar2.f281t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.G;
            bVar.f185x = bVar2.O;
            bVar.f186y = bVar2.N;
            bVar.f182u = bVar2.K;
            bVar.f184w = bVar2.M;
            bVar.f187z = bVar2.f282u;
            bVar.A = bVar2.f283v;
            bVar.f171m = bVar2.f285x;
            bVar.f173n = bVar2.f286y;
            bVar.f175o = bVar2.f287z;
            bVar.B = bVar2.f284w;
            bVar.Q = bVar2.A;
            bVar.R = bVar2.B;
            bVar.F = bVar2.P;
            bVar.E = bVar2.Q;
            bVar.H = bVar2.S;
            bVar.G = bVar2.R;
            bVar.T = bVar2.f267h0;
            bVar.U = bVar2.f269i0;
            bVar.I = bVar2.T;
            bVar.J = bVar2.U;
            bVar.M = bVar2.V;
            bVar.N = bVar2.W;
            bVar.K = bVar2.X;
            bVar.L = bVar2.Y;
            bVar.O = bVar2.Z;
            bVar.P = bVar2.f253a0;
            bVar.S = bVar2.C;
            bVar.f151c = bVar2.f264g;
            bVar.f147a = bVar2.f260e;
            bVar.f149b = bVar2.f262f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f256c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f258d;
            String str = bVar2.f265g0;
            if (str != null) {
                bVar.V = str;
            }
            bVar.setMarginStart(bVar2.I);
            bVar.setMarginEnd(this.f248d.H);
            bVar.a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f248d.a(this.f248d);
            aVar.f247c.a(this.f247c);
            aVar.f246b.a(this.f246b);
            aVar.f249e.a(this.f249e);
            aVar.f245a = this.f245a;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f251k0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f258d;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int[] f261e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public String f263f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public String f265g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f252a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f254b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f260e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f262f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f264g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f266h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f268i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f270j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f272k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f273l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f274m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f275n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f276o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f277p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f278q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f279r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f280s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f281t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f282u = 0.5f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f283v = 0.5f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f284w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f285x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f286y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f287z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public float f253a0 = 1.0f;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f255b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f257c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f259d0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f267h0 = false;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f269i0 = false;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f271j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f251k0 = sparseIntArray;
            sparseIntArray.append(k.H3, 24);
            f251k0.append(k.I3, 25);
            f251k0.append(k.K3, 28);
            f251k0.append(k.L3, 29);
            f251k0.append(k.Q3, 35);
            f251k0.append(k.P3, 34);
            f251k0.append(k.s3, 4);
            f251k0.append(k.r3, 3);
            f251k0.append(k.p3, 1);
            f251k0.append(k.V3, 6);
            f251k0.append(k.W3, 7);
            f251k0.append(k.z3, 17);
            f251k0.append(k.A3, 18);
            f251k0.append(k.B3, 19);
            f251k0.append(k.a3, 26);
            f251k0.append(k.M3, 31);
            f251k0.append(k.N3, 32);
            f251k0.append(k.y3, 10);
            f251k0.append(k.x3, 9);
            f251k0.append(k.Z3, 13);
            f251k0.append(k.c4, 16);
            f251k0.append(k.a4, 14);
            f251k0.append(k.X3, 11);
            f251k0.append(k.b4, 15);
            f251k0.append(k.Y3, 12);
            f251k0.append(k.T3, 38);
            f251k0.append(k.F3, 37);
            f251k0.append(k.E3, 39);
            f251k0.append(k.S3, 40);
            f251k0.append(k.D3, 20);
            f251k0.append(k.R3, 36);
            f251k0.append(k.w3, 5);
            f251k0.append(k.G3, 76);
            f251k0.append(k.O3, 76);
            f251k0.append(k.J3, 76);
            f251k0.append(k.q3, 76);
            f251k0.append(k.o3, 76);
            f251k0.append(k.d3, 23);
            f251k0.append(k.f3, 27);
            f251k0.append(k.h3, 30);
            f251k0.append(k.i3, 8);
            f251k0.append(k.e3, 33);
            f251k0.append(k.g3, 2);
            f251k0.append(k.b3, 22);
            f251k0.append(k.c3, 21);
            f251k0.append(k.t3, 61);
            f251k0.append(k.v3, 62);
            f251k0.append(k.u3, 63);
            f251k0.append(k.U3, 69);
            f251k0.append(k.C3, 70);
            f251k0.append(k.m3, 71);
            f251k0.append(k.k3, 72);
            f251k0.append(k.l3, 73);
            f251k0.append(k.n3, 74);
            f251k0.append(k.j3, 75);
        }

        public void a(b bVar) {
            this.f252a = bVar.f252a;
            this.f256c = bVar.f256c;
            this.f254b = bVar.f254b;
            this.f258d = bVar.f258d;
            this.f260e = bVar.f260e;
            this.f262f = bVar.f262f;
            this.f264g = bVar.f264g;
            this.f266h = bVar.f266h;
            this.f268i = bVar.f268i;
            this.f270j = bVar.f270j;
            this.f272k = bVar.f272k;
            this.f273l = bVar.f273l;
            this.f274m = bVar.f274m;
            this.f275n = bVar.f275n;
            this.f276o = bVar.f276o;
            this.f277p = bVar.f277p;
            this.f278q = bVar.f278q;
            this.f279r = bVar.f279r;
            this.f280s = bVar.f280s;
            this.f281t = bVar.f281t;
            this.f282u = bVar.f282u;
            this.f283v = bVar.f283v;
            this.f284w = bVar.f284w;
            this.f285x = bVar.f285x;
            this.f286y = bVar.f286y;
            this.f287z = bVar.f287z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f253a0 = bVar.f253a0;
            this.f255b0 = bVar.f255b0;
            this.f257c0 = bVar.f257c0;
            this.f259d0 = bVar.f259d0;
            this.f265g0 = bVar.f265g0;
            int[] iArr = bVar.f261e0;
            if (iArr != null) {
                this.f261e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f261e0 = null;
            }
            this.f263f0 = bVar.f263f0;
            this.f267h0 = bVar.f267h0;
            this.f269i0 = bVar.f269i0;
            this.f271j0 = bVar.f271j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Z2);
            this.f254b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = f251k0.get(index);
                if (i3 == 80) {
                    this.f267h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f267h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.f277p = e.k(typedArrayObtainStyledAttributes, index, this.f277p);
                            break;
                        case 2:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.f276o = e.k(typedArrayObtainStyledAttributes, index, this.f276o);
                            break;
                        case 4:
                            this.f275n = e.k(typedArrayObtainStyledAttributes, index, this.f275n);
                            break;
                        case 5:
                            this.f284w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.f281t = e.k(typedArrayObtainStyledAttributes, index, this.f281t);
                            break;
                        case 10:
                            this.f280s = e.k(typedArrayObtainStyledAttributes, index, this.f280s);
                            break;
                        case 11:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.f260e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f260e);
                            break;
                        case 18:
                            this.f262f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f262f);
                            break;
                        case 19:
                            this.f264g = typedArrayObtainStyledAttributes.getFloat(index, this.f264g);
                            break;
                        case 20:
                            this.f282u = typedArrayObtainStyledAttributes.getFloat(index, this.f282u);
                            break;
                        case 21:
                            this.f258d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f258d);
                            break;
                        case 22:
                            this.f256c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f256c);
                            break;
                        case 23:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.f266h = e.k(typedArrayObtainStyledAttributes, index, this.f266h);
                            break;
                        case 25:
                            this.f268i = e.k(typedArrayObtainStyledAttributes, index, this.f268i);
                            break;
                        case 26:
                            this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.f270j = e.k(typedArrayObtainStyledAttributes, index, this.f270j);
                            break;
                        case 29:
                            this.f272k = e.k(typedArrayObtainStyledAttributes, index, this.f272k);
                            break;
                        case 30:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.f278q = e.k(typedArrayObtainStyledAttributes, index, this.f278q);
                            break;
                        case 32:
                            this.f279r = e.k(typedArrayObtainStyledAttributes, index, this.f279r);
                            break;
                        case 33:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.f274m = e.k(typedArrayObtainStyledAttributes, index, this.f274m);
                            break;
                        case 35:
                            this.f273l = e.k(typedArrayObtainStyledAttributes, index, this.f273l);
                            break;
                        case 36:
                            this.f283v = typedArrayObtainStyledAttributes.getFloat(index, this.f283v);
                            break;
                        case 37:
                            this.Q = typedArrayObtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.f285x = e.k(typedArrayObtainStyledAttributes, index, this.f285x);
                                            break;
                                        case 62:
                                            this.f286y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f286y);
                                            break;
                                        case 63:
                                            this.f287z = typedArrayObtainStyledAttributes.getFloat(index, this.f287z);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f253a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f255b0 = typedArrayObtainStyledAttributes.getInt(index, this.f255b0);
                                                    continue;
                                                case 73:
                                                    this.f257c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f257c0);
                                                    continue;
                                                case 74:
                                                    this.f263f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f271j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f271j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f265g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f251k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f269i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f269i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static SparseIntArray f288h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f289a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f290b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f291c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f292d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f293e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f294f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f295g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f288h = sparseIntArray;
            sparseIntArray.append(k.n4, 1);
            f288h.append(k.p4, 2);
            f288h.append(k.q4, 3);
            f288h.append(k.m4, 4);
            f288h.append(k.l4, 5);
            f288h.append(k.o4, 6);
        }

        public void a(c cVar) {
            this.f289a = cVar.f289a;
            this.f290b = cVar.f290b;
            this.f291c = cVar.f291c;
            this.f292d = cVar.f292d;
            this.f293e = cVar.f293e;
            this.f295g = cVar.f295g;
            this.f294f = cVar.f294f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.k4);
            this.f289a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f288h.get(index)) {
                    case 1:
                        this.f295g = typedArrayObtainStyledAttributes.getFloat(index, this.f295g);
                        break;
                    case 2:
                        this.f292d = typedArrayObtainStyledAttributes.getInt(index, this.f292d);
                        break;
                    case 3:
                        this.f291c = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : t.a.f3669c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f293e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f290b = e.k(typedArrayObtainStyledAttributes, index, this.f290b);
                        break;
                    case 6:
                        this.f294f = typedArrayObtainStyledAttributes.getFloat(index, this.f294f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f296a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f297b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f298c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f299d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f300e = Float.NaN;

        public void a(d dVar) {
            this.f296a = dVar.f296a;
            this.f297b = dVar.f297b;
            this.f299d = dVar.f299d;
            this.f300e = dVar.f300e;
            this.f298c = dVar.f298c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.z4);
            this.f296a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == k.B4) {
                    this.f299d = typedArrayObtainStyledAttributes.getFloat(index, this.f299d);
                } else if (index == k.A4) {
                    this.f297b = typedArrayObtainStyledAttributes.getInt(index, this.f297b);
                    this.f297b = e.f240d[this.f297b];
                } else if (index == k.D4) {
                    this.f298c = typedArrayObtainStyledAttributes.getInt(index, this.f298c);
                } else if (index == k.C4) {
                    this.f300e = typedArrayObtainStyledAttributes.getFloat(index, this.f300e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: android.support.constraint.e$e, reason: collision with other inner class name */
    public static class C0001e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f301n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f302a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f303b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f304c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f305d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f306e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f307f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f308g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f309h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f310i = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f311j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f312k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f313l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f314m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f301n = sparseIntArray;
            sparseIntArray.append(k.X4, 1);
            f301n.append(k.Y4, 2);
            f301n.append(k.Z4, 3);
            f301n.append(k.V4, 4);
            f301n.append(k.W4, 5);
            f301n.append(k.R4, 6);
            f301n.append(k.S4, 7);
            f301n.append(k.T4, 8);
            f301n.append(k.U4, 9);
            f301n.append(k.a5, 10);
            f301n.append(k.b5, 11);
        }

        public void a(C0001e c0001e) {
            this.f302a = c0001e.f302a;
            this.f303b = c0001e.f303b;
            this.f304c = c0001e.f304c;
            this.f305d = c0001e.f305d;
            this.f306e = c0001e.f306e;
            this.f307f = c0001e.f307f;
            this.f308g = c0001e.f308g;
            this.f309h = c0001e.f309h;
            this.f310i = c0001e.f310i;
            this.f311j = c0001e.f311j;
            this.f312k = c0001e.f312k;
            this.f313l = c0001e.f313l;
            this.f314m = c0001e.f314m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Q4);
            this.f302a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f301n.get(index)) {
                    case 1:
                        this.f303b = typedArrayObtainStyledAttributes.getFloat(index, this.f303b);
                        break;
                    case 2:
                        this.f304c = typedArrayObtainStyledAttributes.getFloat(index, this.f304c);
                        break;
                    case 3:
                        this.f305d = typedArrayObtainStyledAttributes.getFloat(index, this.f305d);
                        break;
                    case 4:
                        this.f306e = typedArrayObtainStyledAttributes.getFloat(index, this.f306e);
                        break;
                    case 5:
                        this.f307f = typedArrayObtainStyledAttributes.getFloat(index, this.f307f);
                        break;
                    case 6:
                        this.f308g = typedArrayObtainStyledAttributes.getDimension(index, this.f308g);
                        break;
                    case 7:
                        this.f309h = typedArrayObtainStyledAttributes.getDimension(index, this.f309h);
                        break;
                    case 8:
                        this.f310i = typedArrayObtainStyledAttributes.getDimension(index, this.f310i);
                        break;
                    case 9:
                        this.f311j = typedArrayObtainStyledAttributes.getDimension(index, this.f311j);
                        break;
                    case 10:
                        this.f312k = typedArrayObtainStyledAttributes.getDimension(index, this.f312k);
                        break;
                    case 11:
                        this.f313l = true;
                        this.f314m = typedArrayObtainStyledAttributes.getDimension(index, this.f314m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f241e = sparseIntArray;
        sparseIntArray.append(k.f378u0, 25);
        f241e.append(k.f380v0, 26);
        f241e.append(k.f384x0, 29);
        f241e.append(k.f386y0, 30);
        f241e.append(k.E0, 36);
        f241e.append(k.D0, 35);
        f241e.append(k.f337c0, 4);
        f241e.append(k.f334b0, 3);
        f241e.append(k.Z, 1);
        f241e.append(k.M0, 6);
        f241e.append(k.N0, 7);
        f241e.append(k.f356j0, 17);
        f241e.append(k.f358k0, 18);
        f241e.append(k.f360l0, 19);
        f241e.append(k.f373s, 27);
        f241e.append(k.f388z0, 32);
        f241e.append(k.A0, 33);
        f241e.append(k.f354i0, 10);
        f241e.append(k.f352h0, 9);
        f241e.append(k.Q0, 13);
        f241e.append(k.T0, 16);
        f241e.append(k.R0, 14);
        f241e.append(k.O0, 11);
        f241e.append(k.S0, 15);
        f241e.append(k.P0, 12);
        f241e.append(k.H0, 40);
        f241e.append(k.f374s0, 39);
        f241e.append(k.f372r0, 41);
        f241e.append(k.G0, 42);
        f241e.append(k.f370q0, 20);
        f241e.append(k.F0, 37);
        f241e.append(k.f349g0, 5);
        f241e.append(k.f376t0, 82);
        f241e.append(k.C0, 82);
        f241e.append(k.f382w0, 82);
        f241e.append(k.f331a0, 82);
        f241e.append(k.Y, 82);
        f241e.append(k.f383x, 24);
        f241e.append(k.f387z, 28);
        f241e.append(k.L, 31);
        f241e.append(k.M, 8);
        f241e.append(k.f385y, 34);
        f241e.append(k.A, 2);
        f241e.append(k.f379v, 23);
        f241e.append(k.f381w, 21);
        f241e.append(k.f377u, 22);
        f241e.append(k.B, 43);
        f241e.append(k.O, 44);
        f241e.append(k.J, 45);
        f241e.append(k.K, 46);
        f241e.append(k.I, 60);
        f241e.append(k.G, 47);
        f241e.append(k.H, 48);
        f241e.append(k.C, 49);
        f241e.append(k.D, 50);
        f241e.append(k.E, 51);
        f241e.append(k.F, 52);
        f241e.append(k.N, 53);
        f241e.append(k.I0, 54);
        f241e.append(k.f362m0, 55);
        f241e.append(k.J0, 56);
        f241e.append(k.f364n0, 57);
        f241e.append(k.K0, 58);
        f241e.append(k.f366o0, 59);
        f241e.append(k.f340d0, 61);
        f241e.append(k.f346f0, 62);
        f241e.append(k.f343e0, 63);
        f241e.append(k.P, 64);
        f241e.append(k.X0, 65);
        f241e.append(k.V, 66);
        f241e.append(k.Y0, 67);
        f241e.append(k.V0, 79);
        f241e.append(k.f375t, 38);
        f241e.append(k.U0, 68);
        f241e.append(k.L0, 69);
        f241e.append(k.f368p0, 70);
        f241e.append(k.T, 71);
        f241e.append(k.R, 72);
        f241e.append(k.S, 73);
        f241e.append(k.U, 74);
        f241e.append(k.Q, 75);
        f241e.append(k.W0, 76);
        f241e.append(k.B0, 77);
        f241e.append(k.Z0, 78);
        f241e.append(k.X, 80);
        f241e.append(k.W, 81);
    }

    private int[] g(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = j.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a h(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f371r);
        l(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    private void l(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String string;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != k.f375t && k.L != index && k.M != index) {
                aVar.f247c.f289a = true;
                aVar.f248d.f254b = true;
                aVar.f246b.f296a = true;
                aVar.f249e.f302a = true;
            }
            switch (f241e.get(index)) {
                case 1:
                    b bVar = aVar.f248d;
                    bVar.f277p = k(typedArray, index, bVar.f277p);
                    continue;
                    break;
                case 2:
                    b bVar2 = aVar.f248d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    continue;
                    break;
                case 3:
                    b bVar3 = aVar.f248d;
                    bVar3.f276o = k(typedArray, index, bVar3.f276o);
                    continue;
                    break;
                case 4:
                    b bVar4 = aVar.f248d;
                    bVar4.f275n = k(typedArray, index, bVar4.f275n);
                    continue;
                    break;
                case 5:
                    aVar.f248d.f284w = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    b bVar5 = aVar.f248d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                    break;
                case 7:
                    b bVar6 = aVar.f248d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                    break;
                case 8:
                    b bVar7 = aVar.f248d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    continue;
                    break;
                case 9:
                    b bVar8 = aVar.f248d;
                    bVar8.f281t = k(typedArray, index, bVar8.f281t);
                    continue;
                    break;
                case 10:
                    b bVar9 = aVar.f248d;
                    bVar9.f280s = k(typedArray, index, bVar9.f280s);
                    continue;
                    break;
                case 11:
                    b bVar10 = aVar.f248d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    continue;
                    break;
                case 12:
                    b bVar11 = aVar.f248d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    continue;
                    break;
                case 13:
                    b bVar12 = aVar.f248d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    continue;
                    break;
                case 14:
                    b bVar13 = aVar.f248d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    continue;
                    break;
                case 15:
                    b bVar14 = aVar.f248d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    continue;
                    break;
                case 16:
                    b bVar15 = aVar.f248d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    continue;
                    break;
                case 17:
                    b bVar16 = aVar.f248d;
                    bVar16.f260e = typedArray.getDimensionPixelOffset(index, bVar16.f260e);
                    continue;
                    break;
                case 18:
                    b bVar17 = aVar.f248d;
                    bVar17.f262f = typedArray.getDimensionPixelOffset(index, bVar17.f262f);
                    continue;
                    break;
                case 19:
                    b bVar18 = aVar.f248d;
                    bVar18.f264g = typedArray.getFloat(index, bVar18.f264g);
                    continue;
                    break;
                case 20:
                    b bVar19 = aVar.f248d;
                    bVar19.f282u = typedArray.getFloat(index, bVar19.f282u);
                    continue;
                    break;
                case 21:
                    b bVar20 = aVar.f248d;
                    bVar20.f258d = typedArray.getLayoutDimension(index, bVar20.f258d);
                    continue;
                    break;
                case 22:
                    d dVar = aVar.f246b;
                    dVar.f297b = typedArray.getInt(index, dVar.f297b);
                    d dVar2 = aVar.f246b;
                    dVar2.f297b = f240d[dVar2.f297b];
                    continue;
                    break;
                case 23:
                    b bVar21 = aVar.f248d;
                    bVar21.f256c = typedArray.getLayoutDimension(index, bVar21.f256c);
                    continue;
                    break;
                case 24:
                    b bVar22 = aVar.f248d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    continue;
                    break;
                case 25:
                    b bVar23 = aVar.f248d;
                    bVar23.f266h = k(typedArray, index, bVar23.f266h);
                    continue;
                    break;
                case 26:
                    b bVar24 = aVar.f248d;
                    bVar24.f268i = k(typedArray, index, bVar24.f268i);
                    continue;
                    break;
                case 27:
                    b bVar25 = aVar.f248d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    continue;
                    break;
                case 28:
                    b bVar26 = aVar.f248d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    continue;
                    break;
                case 29:
                    b bVar27 = aVar.f248d;
                    bVar27.f270j = k(typedArray, index, bVar27.f270j);
                    continue;
                    break;
                case 30:
                    b bVar28 = aVar.f248d;
                    bVar28.f272k = k(typedArray, index, bVar28.f272k);
                    continue;
                    break;
                case 31:
                    b bVar29 = aVar.f248d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    continue;
                    break;
                case 32:
                    b bVar30 = aVar.f248d;
                    bVar30.f278q = k(typedArray, index, bVar30.f278q);
                    continue;
                    break;
                case 33:
                    b bVar31 = aVar.f248d;
                    bVar31.f279r = k(typedArray, index, bVar31.f279r);
                    continue;
                    break;
                case 34:
                    b bVar32 = aVar.f248d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    continue;
                    break;
                case 35:
                    b bVar33 = aVar.f248d;
                    bVar33.f274m = k(typedArray, index, bVar33.f274m);
                    continue;
                    break;
                case 36:
                    b bVar34 = aVar.f248d;
                    bVar34.f273l = k(typedArray, index, bVar34.f273l);
                    continue;
                    break;
                case 37:
                    b bVar35 = aVar.f248d;
                    bVar35.f283v = typedArray.getFloat(index, bVar35.f283v);
                    continue;
                    break;
                case 38:
                    aVar.f245a = typedArray.getResourceId(index, aVar.f245a);
                    continue;
                    break;
                case 39:
                    b bVar36 = aVar.f248d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    continue;
                    break;
                case 40:
                    b bVar37 = aVar.f248d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    continue;
                    break;
                case 41:
                    b bVar38 = aVar.f248d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    continue;
                    break;
                case 42:
                    b bVar39 = aVar.f248d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    continue;
                    break;
                case 43:
                    d dVar3 = aVar.f246b;
                    dVar3.f299d = typedArray.getFloat(index, dVar3.f299d);
                    continue;
                    break;
                case 44:
                    C0001e c0001e = aVar.f249e;
                    c0001e.f313l = true;
                    c0001e.f314m = typedArray.getDimension(index, c0001e.f314m);
                    continue;
                    break;
                case 45:
                    C0001e c0001e2 = aVar.f249e;
                    c0001e2.f304c = typedArray.getFloat(index, c0001e2.f304c);
                    continue;
                    break;
                case 46:
                    C0001e c0001e3 = aVar.f249e;
                    c0001e3.f305d = typedArray.getFloat(index, c0001e3.f305d);
                    continue;
                    break;
                case 47:
                    C0001e c0001e4 = aVar.f249e;
                    c0001e4.f306e = typedArray.getFloat(index, c0001e4.f306e);
                    continue;
                    break;
                case 48:
                    C0001e c0001e5 = aVar.f249e;
                    c0001e5.f307f = typedArray.getFloat(index, c0001e5.f307f);
                    continue;
                    break;
                case 49:
                    C0001e c0001e6 = aVar.f249e;
                    c0001e6.f308g = typedArray.getDimension(index, c0001e6.f308g);
                    continue;
                    break;
                case 50:
                    C0001e c0001e7 = aVar.f249e;
                    c0001e7.f309h = typedArray.getDimension(index, c0001e7.f309h);
                    continue;
                    break;
                case 51:
                    C0001e c0001e8 = aVar.f249e;
                    c0001e8.f310i = typedArray.getDimension(index, c0001e8.f310i);
                    continue;
                    break;
                case 52:
                    C0001e c0001e9 = aVar.f249e;
                    c0001e9.f311j = typedArray.getDimension(index, c0001e9.f311j);
                    continue;
                    break;
                case 53:
                    C0001e c0001e10 = aVar.f249e;
                    c0001e10.f312k = typedArray.getDimension(index, c0001e10.f312k);
                    continue;
                    break;
                case 54:
                    b bVar40 = aVar.f248d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    continue;
                    break;
                case 55:
                    b bVar41 = aVar.f248d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    continue;
                    break;
                case 56:
                    b bVar42 = aVar.f248d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    continue;
                    break;
                case 57:
                    b bVar43 = aVar.f248d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    continue;
                    break;
                case 58:
                    b bVar44 = aVar.f248d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    continue;
                    break;
                case 59:
                    b bVar45 = aVar.f248d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                    break;
                case 60:
                    C0001e c0001e11 = aVar.f249e;
                    c0001e11.f303b = typedArray.getFloat(index, c0001e11.f303b);
                    continue;
                    break;
                case 61:
                    b bVar46 = aVar.f248d;
                    bVar46.f285x = k(typedArray, index, bVar46.f285x);
                    continue;
                    break;
                case 62:
                    b bVar47 = aVar.f248d;
                    bVar47.f286y = typedArray.getDimensionPixelSize(index, bVar47.f286y);
                    continue;
                    break;
                case 63:
                    b bVar48 = aVar.f248d;
                    bVar48.f287z = typedArray.getFloat(index, bVar48.f287z);
                    continue;
                    break;
                case 64:
                    c cVar2 = aVar.f247c;
                    cVar2.f290b = k(typedArray, index, cVar2.f290b);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f247c;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f247c;
                        string = t.a.f3669c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f291c = string;
                    continue;
                    break;
                case 66:
                    aVar.f247c.f293e = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    c cVar3 = aVar.f247c;
                    cVar3.f295g = typedArray.getFloat(index, cVar3.f295g);
                    continue;
                    break;
                case 68:
                    d dVar4 = aVar.f246b;
                    dVar4.f300e = typedArray.getFloat(index, dVar4.f300e);
                    continue;
                    break;
                case 69:
                    aVar.f248d.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.f248d.f253a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case 72:
                    b bVar49 = aVar.f248d;
                    bVar49.f255b0 = typedArray.getInt(index, bVar49.f255b0);
                    continue;
                    break;
                case 73:
                    b bVar50 = aVar.f248d;
                    bVar50.f257c0 = typedArray.getDimensionPixelSize(index, bVar50.f257c0);
                    continue;
                    break;
                case 74:
                    aVar.f248d.f263f0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    b bVar51 = aVar.f248d;
                    bVar51.f271j0 = typedArray.getBoolean(index, bVar51.f271j0);
                    continue;
                    break;
                case 76:
                    c cVar4 = aVar.f247c;
                    cVar4.f292d = typedArray.getInt(index, cVar4.f292d);
                    continue;
                    break;
                case 77:
                    aVar.f248d.f265g0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    d dVar5 = aVar.f246b;
                    dVar5.f298c = typedArray.getInt(index, dVar5.f298c);
                    continue;
                    break;
                case 79:
                    c cVar5 = aVar.f247c;
                    cVar5.f294f = typedArray.getFloat(index, cVar5.f294f);
                    continue;
                    break;
                case 80:
                    b bVar52 = aVar.f248d;
                    bVar52.f267h0 = typedArray.getBoolean(index, bVar52.f267h0);
                    continue;
                    break;
                case 81:
                    b bVar53 = aVar.f248d;
                    bVar53.f269i0 = typedArray.getBoolean(index, bVar53.f269i0);
                    continue;
                    break;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f241e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    void c(ConstraintLayout constraintLayout, boolean z2) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f244c.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f244c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + s.a.a(childAt));
            } else {
                if (this.f243b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f244c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f244c.get(Integer.valueOf(id));
                        if (childAt instanceof android.support.constraint.a) {
                            aVar.f248d.f259d0 = 1;
                        }
                        int i3 = aVar.f248d.f259d0;
                        if (i3 != -1 && i3 == 1) {
                            android.support.constraint.a aVar2 = (android.support.constraint.a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f248d.f255b0);
                            aVar2.setMargin(aVar.f248d.f257c0);
                            aVar2.setAllowsGoneWidget(aVar.f248d.f271j0);
                            b bVar = aVar.f248d;
                            int[] iArr = bVar.f261e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f263f0;
                                if (str != null) {
                                    bVar.f261e0 = g(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f248d.f261e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z2) {
                            android.support.constraint.b.c(childAt, aVar.f250f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f246b;
                        if (dVar.f298c == 0) {
                            childAt.setVisibility(dVar.f297b);
                        }
                        childAt.setAlpha(aVar.f246b.f299d);
                        childAt.setRotation(aVar.f249e.f303b);
                        childAt.setRotationX(aVar.f249e.f304c);
                        childAt.setRotationY(aVar.f249e.f305d);
                        childAt.setScaleX(aVar.f249e.f306e);
                        childAt.setScaleY(aVar.f249e.f307f);
                        if (!Float.isNaN(aVar.f249e.f308g)) {
                            childAt.setPivotX(aVar.f249e.f308g);
                        }
                        if (!Float.isNaN(aVar.f249e.f309h)) {
                            childAt.setPivotY(aVar.f249e.f309h);
                        }
                        childAt.setTranslationX(aVar.f249e.f310i);
                        childAt.setTranslationY(aVar.f249e.f311j);
                        childAt.setTranslationZ(aVar.f249e.f312k);
                        C0001e c0001e = aVar.f249e;
                        if (c0001e.f313l) {
                            childAt.setElevation(c0001e.f314m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = this.f244c.get(num);
            int i4 = aVar3.f248d.f259d0;
            if (i4 != -1 && i4 == 1) {
                android.support.constraint.a aVar4 = new android.support.constraint.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                b bVar3 = aVar3.f248d;
                int[] iArr2 = bVar3.f261e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f263f0;
                    if (str2 != null) {
                        bVar3.f261e0 = g(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.f248d.f261e0);
                    }
                }
                aVar4.setType(aVar3.f248d.f255b0);
                aVar4.setMargin(aVar3.f248d.f257c0);
                ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                aVar4.n();
                aVar3.d(bVarD);
                constraintLayout.addView(aVar4, bVarD);
            }
            if (aVar3.f248d.f252a) {
                View hVar = new h(constraintLayout.getContext());
                hVar.setId(num.intValue());
                ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.d(bVarD2);
                constraintLayout.addView(hVar, bVarD2);
            }
        }
    }

    public void d(Context context, int i2) {
        e((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f244c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f243b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f244c.containsKey(Integer.valueOf(id))) {
                this.f244c.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f244c.get(Integer.valueOf(id));
            aVar.f250f = android.support.constraint.b.a(this.f242a, childAt);
            aVar.f(id, bVar);
            aVar.f246b.f297b = childAt.getVisibility();
            aVar.f246b.f299d = childAt.getAlpha();
            aVar.f249e.f303b = childAt.getRotation();
            aVar.f249e.f304c = childAt.getRotationX();
            aVar.f249e.f305d = childAt.getRotationY();
            aVar.f249e.f306e = childAt.getScaleX();
            aVar.f249e.f307f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C0001e c0001e = aVar.f249e;
                c0001e.f308g = pivotX;
                c0001e.f309h = pivotY;
            }
            aVar.f249e.f310i = childAt.getTranslationX();
            aVar.f249e.f311j = childAt.getTranslationY();
            aVar.f249e.f312k = childAt.getTranslationZ();
            C0001e c0001e2 = aVar.f249e;
            if (c0001e2.f313l) {
                c0001e2.f314m = childAt.getElevation();
            }
            if (childAt instanceof android.support.constraint.a) {
                android.support.constraint.a aVar2 = (android.support.constraint.a) childAt;
                aVar.f248d.f271j0 = aVar2.o();
                aVar.f248d.f261e0 = aVar2.getReferencedIds();
                aVar.f248d.f255b0 = aVar2.getType();
                aVar.f248d.f257c0 = aVar2.getMargin();
            }
        }
    }

    public void f(f fVar) {
        int childCount = fVar.getChildCount();
        this.f244c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = fVar.getChildAt(i2);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f243b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f244c.containsKey(Integer.valueOf(id))) {
                this.f244c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f244c.get(Integer.valueOf(id));
            if (childAt instanceof android.support.constraint.c) {
                aVar2.h((android.support.constraint.c) childAt, id, aVar);
            }
            aVar2.g(id, aVar);
        }
    }

    public void i(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarH = h(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarH.f248d.f252a = true;
                    }
                    this.f244c.put(Integer.valueOf(aVarH.f245a), aVarH);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    public void j(Context context, XmlPullParser xmlPullParser) {
        a aVarH;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                aVarH = h(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Guideline":
                                aVarH = h(context, Xml.asAttributeSet(xmlPullParser));
                                b bVar = aVarH.f248d;
                                bVar.f252a = true;
                                bVar.f254b = true;
                                break;
                            case "Barrier":
                                aVarH = h(context, Xml.asAttributeSet(xmlPullParser));
                                aVarH.f248d.f259d0 = 1;
                                break;
                            case "PropertySet":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f246b.b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Transform":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f249e.b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Layout":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f248d.b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Motion":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f247c.b(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "CustomAttribute":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                android.support.constraint.b.b(context, xmlPullParser, aVar.f250f);
                                continue;
                                break;
                                break;
                            default:
                                continue;
                                break;
                        }
                        aVar = aVarH;
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name)) {
                            return;
                        }
                        if (name.equalsIgnoreCase("Constraint")) {
                            this.f244c.put(Integer.valueOf(aVar.f245a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
