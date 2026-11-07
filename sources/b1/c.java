package b1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public String A;
    public String B;
    public String C;
    public double D;
    public boolean E;
    public int F;
    public int G;
    public String H;
    public int I;
    public String J;
    public int K;
    public int L;
    public int M;
    public int N;
    public String O;
    public String P;
    public String Q;
    public int R;
    public List<i> S;
    public String T;
    public String U;
    public String V;
    public Bundle W;
    public int X;
    public int Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f1920a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1921b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f1922b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1923c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public double f1924c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f1925d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public double f1926d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f1927e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f1928e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1929f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public j f1930f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f1931g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f1932g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1933h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public double f1934h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1935i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1936i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1937j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f1938j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1939k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public c f1940k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1941l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Bundle f1942l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1943m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f1944m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1945n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f1946n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f1950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f1951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1952t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f1953u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f1954v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f1955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f1956x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1957y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b1.a f1958z;

    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i2) {
            return new c[i2];
        }
    }

    public c() {
        this.f1921b = 0;
        this.f1923c = null;
        this.f1925d = Double.MIN_VALUE;
        this.f1927e = Double.MIN_VALUE;
        this.f1929f = false;
        this.f1931g = Double.MIN_VALUE;
        this.f1933h = false;
        this.f1935i = 0.0f;
        this.f1937j = false;
        this.f1939k = 0.0f;
        this.f1943m = 0.0f;
        this.f1945n = -1;
        this.f1947o = 0.0f;
        this.f1948p = false;
        this.f1949q = -1;
        this.f1950r = -1.0f;
        this.f1951s = null;
        this.f1952t = false;
        this.f1953u = null;
        this.f1954v = null;
        this.f1955w = null;
        this.f1956x = null;
        this.f1957y = false;
        this.f1958z = new b1.a.C0016a().m();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.f1920a0 = null;
        this.f1922b0 = null;
        this.f1924c0 = Double.MIN_VALUE;
        this.f1926d0 = Double.MIN_VALUE;
        this.f1928e0 = false;
        this.f1930f0 = null;
        this.f1932g0 = -1.0f;
        this.f1934h0 = -1.0d;
        this.f1936i0 = 0;
        this.f1938j0 = -1;
        this.f1942l0 = null;
        this.f1944m0 = null;
        this.f1946n0 = -1L;
    }

    public c(Parcel parcel) {
        this.f1921b = 0;
        this.f1923c = null;
        this.f1925d = Double.MIN_VALUE;
        this.f1927e = Double.MIN_VALUE;
        this.f1929f = false;
        this.f1931g = Double.MIN_VALUE;
        this.f1933h = false;
        this.f1935i = 0.0f;
        this.f1937j = false;
        this.f1939k = 0.0f;
        this.f1943m = 0.0f;
        this.f1945n = -1;
        this.f1947o = 0.0f;
        this.f1948p = false;
        this.f1949q = -1;
        this.f1950r = -1.0f;
        this.f1951s = null;
        this.f1952t = false;
        this.f1953u = null;
        this.f1954v = null;
        this.f1955w = null;
        this.f1956x = null;
        this.f1957y = false;
        this.f1958z = new b1.a.C0016a().m();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.f1920a0 = null;
        this.f1922b0 = null;
        this.f1924c0 = Double.MIN_VALUE;
        this.f1926d0 = Double.MIN_VALUE;
        this.f1928e0 = false;
        this.f1930f0 = null;
        this.f1932g0 = -1.0f;
        this.f1934h0 = -1.0d;
        this.f1936i0 = 0;
        this.f1938j0 = -1;
        this.f1942l0 = null;
        this.f1944m0 = null;
        this.f1946n0 = -1L;
        this.f1921b = parcel.readInt();
        this.f1923c = parcel.readString();
        this.f1946n0 = parcel.readLong();
        this.f1925d = parcel.readDouble();
        this.f1927e = parcel.readDouble();
        this.f1931g = parcel.readDouble();
        this.f1935i = parcel.readFloat();
        this.f1939k = parcel.readFloat();
        this.f1941l = parcel.readString();
        this.f1943m = parcel.readFloat();
        this.f1945n = parcel.readInt();
        this.f1947o = parcel.readFloat();
        this.f1949q = parcel.readInt();
        this.f1950r = parcel.readFloat();
        this.A = parcel.readString();
        this.F = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readDouble();
        this.H = parcel.readString();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        this.f1958z = new b1.a.C0016a().p(string7).q(string8).s(string).n(string2).o(string6).r(string3).t(string4).u(string5).l(string9).v(parcel.readString()).m();
        boolean[] zArr = new boolean[8];
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.f1954v = parcel.readString();
        this.f1955w = parcel.readString();
        this.f1956x = parcel.readString();
        this.G = parcel.readInt();
        this.T = parcel.readString();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readInt();
        this.X = parcel.readInt();
        this.U = parcel.readString();
        this.Y = parcel.readInt();
        this.V = parcel.readString();
        this.f1920a0 = parcel.readString();
        this.f1922b0 = parcel.readString();
        this.Z = parcel.readLong();
        this.f1924c0 = parcel.readDouble();
        this.f1926d0 = parcel.readDouble();
        this.f1932g0 = parcel.readFloat();
        this.f1934h0 = parcel.readDouble();
        this.f1936i0 = parcel.readInt();
        this.f1938j0 = parcel.readInt();
        this.f1951s = parcel.readString();
        this.f1944m0 = parcel.readString();
        try {
            this.f1940k0 = (c) parcel.readParcelable(c.class.getClassLoader());
        } catch (Exception e2) {
            this.f1940k0 = null;
            e2.printStackTrace();
        }
        try {
            parcel.readBooleanArray(zArr);
            this.f1929f = zArr[0];
            this.f1933h = zArr[1];
            this.f1937j = zArr[2];
            this.f1948p = zArr[3];
            this.f1952t = zArr[4];
            this.f1957y = zArr[5];
            this.E = zArr[6];
            this.f1928e0 = zArr[7];
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        try {
            parcel.readList(arrayList, i.class.getClassLoader());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (arrayList.size() == 0) {
            this.S = null;
        } else {
            this.S = arrayList;
        }
        try {
            this.W = parcel.readBundle();
        } catch (Exception e4) {
            e4.printStackTrace();
            this.W = new Bundle();
        }
        try {
            this.f1942l0 = parcel.readBundle();
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f1942l0 = new Bundle();
        }
        try {
            this.f1930f0 = (j) parcel.readParcelable(j.class.getClassLoader());
        } catch (Exception e6) {
            this.f1930f0 = null;
            e6.printStackTrace();
        }
    }

    public /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public c(c cVar) {
        this.f1921b = 0;
        ArrayList arrayList = null;
        this.f1923c = null;
        this.f1925d = Double.MIN_VALUE;
        this.f1927e = Double.MIN_VALUE;
        this.f1929f = false;
        this.f1931g = Double.MIN_VALUE;
        this.f1933h = false;
        this.f1935i = 0.0f;
        this.f1937j = false;
        this.f1939k = 0.0f;
        this.f1943m = 0.0f;
        this.f1945n = -1;
        this.f1947o = 0.0f;
        this.f1948p = false;
        this.f1949q = -1;
        this.f1950r = -1.0f;
        this.f1951s = null;
        this.f1952t = false;
        this.f1953u = null;
        this.f1954v = null;
        this.f1955w = null;
        this.f1956x = null;
        this.f1957y = false;
        this.f1958z = new b1.a.C0016a().m();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.f1920a0 = null;
        this.f1922b0 = null;
        this.f1924c0 = Double.MIN_VALUE;
        this.f1926d0 = Double.MIN_VALUE;
        this.f1928e0 = false;
        this.f1930f0 = null;
        this.f1932g0 = -1.0f;
        this.f1934h0 = -1.0d;
        this.f1936i0 = 0;
        this.f1938j0 = -1;
        this.f1942l0 = null;
        this.f1944m0 = null;
        this.f1946n0 = -1L;
        this.f1921b = cVar.f1921b;
        this.f1923c = cVar.f1923c;
        this.f1946n0 = cVar.f1946n0;
        this.f1925d = cVar.f1925d;
        this.f1927e = cVar.f1927e;
        this.f1929f = cVar.f1929f;
        this.f1931g = cVar.f1931g;
        this.f1933h = cVar.f1933h;
        this.f1935i = cVar.f1935i;
        this.f1937j = cVar.f1937j;
        this.f1939k = cVar.f1939k;
        this.f1941l = cVar.f1941l;
        this.f1943m = cVar.f1943m;
        this.f1945n = cVar.f1945n;
        this.f1947o = cVar.f1947o;
        this.f1948p = cVar.f1948p;
        this.f1949q = cVar.f1949q;
        this.f1950r = cVar.f1950r;
        this.f1951s = cVar.f1951s;
        this.f1952t = cVar.f1952t;
        this.f1953u = cVar.f1953u;
        this.f1957y = cVar.f1957y;
        this.f1958z = new b1.a.C0016a().p(cVar.f1958z.f1898a).q(cVar.f1958z.f1899b).s(cVar.f1958z.f1900c).n(cVar.f1958z.f1901d).o(cVar.f1958z.f1902e).r(cVar.f1958z.f1903f).t(cVar.f1958z.f1904g).u(cVar.f1958z.f1905h).l(cVar.f1958z.f1907j).v(cVar.f1958z.f1908k).m();
        this.A = cVar.A;
        this.B = cVar.B;
        this.C = cVar.C;
        this.D = cVar.D;
        this.G = cVar.G;
        this.F = cVar.F;
        this.E = cVar.E;
        this.H = cVar.H;
        this.I = cVar.I;
        this.J = cVar.J;
        this.f1954v = cVar.f1954v;
        this.f1955w = cVar.f1955w;
        this.f1956x = cVar.f1956x;
        this.K = cVar.K;
        this.L = cVar.L;
        this.M = cVar.L;
        this.N = cVar.N;
        this.O = cVar.O;
        this.P = cVar.P;
        this.Q = cVar.Q;
        this.R = cVar.R;
        this.X = cVar.X;
        this.V = cVar.V;
        this.f1920a0 = cVar.f1920a0;
        this.f1922b0 = cVar.f1922b0;
        this.f1924c0 = cVar.f1924c0;
        this.f1926d0 = cVar.f1926d0;
        this.Z = cVar.Z;
        this.f1934h0 = cVar.f1934h0;
        this.f1936i0 = cVar.f1936i0;
        this.f1938j0 = cVar.f1938j0;
        this.f1940k0 = cVar.f1940k0;
        this.U = cVar.U;
        if (cVar.S != null) {
            arrayList = new ArrayList();
            for (int i2 = 0; i2 < cVar.S.size(); i2++) {
                i iVar = cVar.S.get(i2);
                arrayList.add(new i(iVar.b(), iVar.c(), iVar.d(), iVar.e(), iVar.a()));
            }
        }
        this.S = arrayList;
        this.T = cVar.T;
        this.W = cVar.W;
        this.Y = cVar.Y;
        this.f1928e0 = cVar.f1928e0;
        this.f1930f0 = cVar.f1930f0;
        this.f1932g0 = cVar.f1932g0;
        this.f1942l0 = cVar.f1942l0;
        this.f1944m0 = cVar.f1944m0;
    }

    /* JADX WARN: Code duplicated, block: B:219:0x048c A[Catch: Exception -> 0x0184, Error -> 0x0783, TRY_LEAVE, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:228:0x04dd A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x04eb A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x04f6 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0502 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0515 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x0523 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x052e A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x053c A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x0547 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0555 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0560 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x0570 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x057c  */
    /* JADX WARN: Code duplicated, block: B:259:0x057e A[Catch: Exception -> 0x0184, Error -> 0x0783, TRY_LEAVE, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x05aa A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x05ba A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:274:0x05c2 A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x05cd A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x05e6 A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x05f6 A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x0606 A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x0627 A[Catch: Exception -> 0x0643, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:293:0x0631 A[Catch: Exception -> 0x0643, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x064b A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:301:0x0657 A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x065b A[Catch: Exception -> 0x0665, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x0660 A[Catch: Exception -> 0x0665, Error -> 0x0783, TRY_LEAVE, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:310:0x0672 A[Catch: Exception -> 0x0184, Error -> 0x0783, TRY_LEAVE, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x067c  */
    /* JADX WARN: Code duplicated, block: B:316:0x0686 A[Catch: Exception -> 0x0696, Error -> 0x0783, TryCatch #8 {Exception -> 0x0696, blocks: (B:314:0x0680, B:316:0x0686, B:317:0x0692), top: B:394:0x0680 }] */
    /* JADX WARN: Code duplicated, block: B:317:0x0692 A[Catch: Exception -> 0x0696, Error -> 0x0783, TRY_LEAVE, TryCatch #8 {Exception -> 0x0696, blocks: (B:314:0x0680, B:316:0x0686, B:317:0x0692), top: B:394:0x0680 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x069a  */
    /* JADX WARN: Code duplicated, block: B:323:0x06a7 A[Catch: Exception -> 0x0184, Error -> 0x0783, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:326:0x06b7 A[Catch: Exception -> 0x0184, Error -> 0x0783, TRY_LEAVE, TryCatch #12 {Error -> 0x0783, blocks: (B:7:0x00b7, B:8:0x00b9, B:11:0x00ec, B:13:0x0144, B:14:0x014d, B:16:0x0155, B:17:0x015e, B:19:0x0164, B:20:0x0170, B:21:0x0174, B:24:0x017a, B:25:0x017f, B:30:0x018e, B:32:0x01bd, B:33:0x01c4, B:35:0x01ca, B:36:0x01d5, B:38:0x01db, B:39:0x01e2, B:41:0x01e8, B:42:0x01f3, B:45:0x01fd, B:47:0x020b, B:49:0x0217, B:50:0x021a, B:52:0x0221, B:54:0x0229, B:55:0x023b, B:57:0x0241, B:59:0x025f, B:61:0x026a, B:63:0x0270, B:65:0x0279, B:66:0x0286, B:67:0x0288, B:69:0x0290, B:71:0x029c, B:72:0x029e, B:74:0x02a6, B:76:0x02b4, B:78:0x02bc, B:80:0x02c4, B:82:0x02cc, B:84:0x02d4, B:86:0x02dc, B:87:0x02e3, B:89:0x02eb, B:91:0x02f7, B:93:0x02fc, B:96:0x0304, B:100:0x030e, B:102:0x0316, B:104:0x031e, B:106:0x0326, B:108:0x032e, B:110:0x0336, B:112:0x033e, B:114:0x0346, B:116:0x034e, B:118:0x0356, B:120:0x0362, B:122:0x036a, B:124:0x0375, B:126:0x037d, B:128:0x0388, B:130:0x0390, B:132:0x039b, B:134:0x03a3, B:136:0x03ab, B:138:0x03b3, B:219:0x048c, B:226:0x04d5, B:228:0x04dd, B:230:0x04eb, B:231:0x04ee, B:233:0x04f6, B:235:0x0502, B:236:0x050d, B:238:0x0515, B:240:0x0523, B:241:0x0526, B:243:0x052e, B:245:0x053c, B:246:0x053f, B:248:0x0547, B:250:0x0555, B:251:0x0558, B:253:0x0560, B:254:0x0568, B:256:0x0570, B:262:0x0587, B:259:0x057e, B:264:0x058a, B:265:0x0594, B:267:0x059c, B:269:0x05aa, B:271:0x05ba, B:274:0x05c2, B:275:0x05c5, B:277:0x05cd, B:278:0x05de, B:280:0x05e6, B:281:0x05ee, B:283:0x05f6, B:284:0x05fe, B:286:0x0606, B:287:0x060f, B:289:0x0617, B:291:0x0627, B:293:0x0631, B:295:0x0635, B:297:0x0643, B:299:0x064b, B:301:0x0657, B:302:0x065b, B:303:0x0660, B:308:0x066a, B:310:0x0672, B:314:0x0680, B:316:0x0686, B:317:0x0692, B:318:0x0696, B:321:0x069c, B:323:0x06a7, B:324:0x06af, B:326:0x06b7, B:341:0x06ed, B:342:0x06f0, B:351:0x0726, B:313:0x067d, B:307:0x0667, B:142:0x03db, B:144:0x03e6, B:148:0x03ef, B:154:0x03fc, B:162:0x0409, B:170:0x0416, B:178:0x0422, B:186:0x0431, B:194:0x0441, B:202:0x0453, B:216:0x0475, B:223:0x04cf, B:225:0x04d2, B:361:0x073e, B:362:0x0743), top: B:386:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x06c7 A[Catch: all -> 0x06eb, TryCatch #9 {all -> 0x06eb, blocks: (B:329:0x06c1, B:331:0x06c7, B:333:0x06cd, B:335:0x06d1, B:337:0x06e8), top: B:395:0x06c1 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x06e8 A[Catch: all -> 0x06eb, TRY_LEAVE, TryCatch #9 {all -> 0x06eb, blocks: (B:329:0x06c1, B:331:0x06c7, B:333:0x06cd, B:335:0x06d1, B:337:0x06e8), top: B:395:0x06c1 }] */
    /* JADX WARN: Code duplicated, block: B:346:0x0706 A[Catch: all -> 0x0724, TryCatch #1 {all -> 0x0724, blocks: (B:344:0x06f8, B:346:0x0706, B:348:0x070e), top: B:380:0x06f8 }] */
    /* JADX WARN: Code duplicated, block: B:348:0x070e A[Catch: all -> 0x0724, TRY_LEAVE, TryCatch #1 {all -> 0x0724, blocks: (B:344:0x06f8, B:346:0x0706, B:348:0x070e), top: B:380:0x06f8 }] */
    /* JADX WARN: Code duplicated, block: B:380:0x06f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x059c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0617 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0640 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v46 */
    public c(String str) {
        ?? r2;
        boolean z2;
        Exception exc;
        boolean z3;
        String str2;
        String str3;
        JSONObject jSONObject;
        boolean z4;
        Exception exc2;
        String string;
        String str4;
        String str5;
        String string2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String string3;
        String string4;
        String str11;
        String string5;
        String str12;
        String string6;
        int i2;
        int i3;
        String str13;
        boolean z5;
        JSONObject jSONObject2;
        int i4;
        String[] strArrSplit;
        int iOptInt;
        int iIntValue;
        JSONObject jSONObject3;
        String str14;
        String str15;
        String string7;
        String[] strArrSplit2;
        int iIntValue2;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        this.f1921b = 0;
        this.f1923c = null;
        this.f1925d = Double.MIN_VALUE;
        this.f1927e = Double.MIN_VALUE;
        this.f1929f = false;
        this.f1931g = Double.MIN_VALUE;
        this.f1933h = false;
        this.f1935i = 0.0f;
        this.f1937j = false;
        this.f1939k = 0.0f;
        this.f1943m = 0.0f;
        this.f1945n = -1;
        this.f1947o = 0.0f;
        this.f1948p = false;
        this.f1949q = -1;
        this.f1950r = -1.0f;
        this.f1951s = null;
        this.f1952t = false;
        this.f1953u = null;
        this.f1954v = null;
        this.f1955w = null;
        this.f1956x = null;
        this.f1957y = false;
        this.f1958z = new b1.a.C0016a().m();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.f1920a0 = null;
        this.f1922b0 = null;
        this.f1924c0 = Double.MIN_VALUE;
        this.f1926d0 = Double.MIN_VALUE;
        this.f1928e0 = false;
        this.f1930f0 = null;
        this.f1932g0 = -1.0f;
        this.f1934h0 = -1.0d;
        this.f1936i0 = 0;
        this.f1938j0 = -1;
        this.f1942l0 = null;
        this.f1944m0 = null;
        this.f1946n0 = -1L;
        if (str == null || str.equals("")) {
            return;
        }
        try {
            try {
                try {
                    JSONObject jSONObject4 = new JSONObject(str);
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("result");
                    int i5 = Integer.parseInt(jSONObject5.getString("error"));
                    o0(i5);
                    G0(jSONObject5.getString("time"));
                    String str16 = "x";
                    String str17 = "y";
                    try {
                        if (i5 == 61) {
                            JSONObject jSONObject6 = jSONObject4.getJSONObject("content");
                            JSONObject jSONObject7 = jSONObject6.getJSONObject("point");
                            n0(Double.parseDouble(jSONObject7.getString("y")));
                            t0(Double.parseDouble(jSONObject7.getString("x")));
                            B0(Float.parseFloat(jSONObject6.getString("radius")));
                            F0(Float.parseFloat(jSONObject6.getString("s")));
                            X(Float.parseFloat(jSONObject6.getString("d")));
                            E0(Integer.parseInt(jSONObject6.getString("n")));
                            if (jSONObject6.has("is_mock")) {
                                v0(jSONObject6.getInt("is_mock"));
                            }
                            if (jSONObject6.has("h")) {
                                try {
                                    S(jSONObject6.getDouble("h"));
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                if (jSONObject6.has("in_cn")) {
                                    s0(Integer.parseInt(jSONObject6.getString("in_cn")));
                                } else {
                                    s0(1);
                                }
                            } catch (Exception unused2) {
                            }
                            if (this.G != 0) {
                                V("gcj02");
                                return;
                            }
                            str2 = "wgs84";
                        } else {
                            str2 = "gcj02";
                            if (i5 == 161) {
                                JSONObject jSONObject8 = jSONObject4.getJSONObject("content");
                                JSONObject jSONObject9 = jSONObject8.getJSONObject("point");
                                n0(Double.parseDouble(jSONObject9.getString("y")));
                                t0(Double.parseDouble(jSONObject9.getString("x")));
                                B0(Float.parseFloat(jSONObject8.getString("radius")));
                                if (jSONObject8.has("traffic")) {
                                    H0(jSONObject8.getString("traffic"));
                                }
                                if (jSONObject8.has("traffic_prop")) {
                                    I0(Float.parseFloat(jSONObject8.optString("traffic_prop")));
                                }
                                if (jSONObject8.has("is_station")) {
                                    m0(jSONObject8.optInt("is_station"));
                                }
                                if (jSONObject8.has("traffic_skip_prop")) {
                                    J0(Float.parseFloat(jSONObject8.optString("traffic_skip_prop")));
                                }
                                if (jSONObject8.has("sema")) {
                                    JSONObject jSONObject10 = jSONObject8.getJSONObject("sema");
                                    if (jSONObject10.has("aptag")) {
                                        String string14 = jSONObject10.getString("aptag");
                                        if (TextUtils.isEmpty(string14)) {
                                            str3 = "";
                                            this.f1954v = str3;
                                        } else {
                                            this.f1954v = string14;
                                            str3 = "";
                                        }
                                    } else {
                                        str3 = "";
                                    }
                                    if (jSONObject10.has("aptagd")) {
                                        JSONArray jSONArray = jSONObject10.getJSONObject("aptagd").getJSONArray("pois");
                                        ArrayList arrayList = new ArrayList();
                                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                                            JSONObject jSONObject11 = jSONArray.getJSONObject(i6);
                                            arrayList.add(new i(jSONObject11.getString("pid"), jSONObject11.getString("pname"), jSONObject11.getDouble("pr"), jSONObject11.has("tags") ? jSONObject11.getString("tags") : str3, jSONObject11.has("addr") ? jSONObject11.getString("addr") : str3));
                                        }
                                        this.S = arrayList;
                                    }
                                    if (jSONObject10.has("poiregion")) {
                                        String string15 = jSONObject10.getString("poiregion");
                                        if (!TextUtils.isEmpty(string15)) {
                                            this.f1955w = string15;
                                        }
                                    }
                                    if (jSONObject10.has("poi_regions")) {
                                        JSONObject jSONObject12 = jSONObject10.getJSONObject("poi_regions");
                                        this.f1930f0 = new j(jSONObject12.has("direction_desc") ? jSONObject12.getString("direction_desc") : str3, jSONObject12.has("name") ? jSONObject12.getString("name") : str3, jSONObject12.has("tag") ? jSONObject12.getString("tag") : str3);
                                    }
                                    if (jSONObject10.has("regular")) {
                                        String string16 = jSONObject10.getString("regular");
                                        if (!TextUtils.isEmpty(string16)) {
                                            this.f1956x = string16;
                                        }
                                    }
                                } else {
                                    str3 = "";
                                }
                                if (jSONObject8.has("addr")) {
                                    try {
                                        jSONObject = jSONObject8.getJSONObject("addr");
                                        z4 = true;
                                    } catch (Exception unused3) {
                                        jSONObject = null;
                                        z4 = false;
                                    }
                                    if (jSONObject != null) {
                                        String string17 = jSONObject.has("city") ? jSONObject.getString("city") : str3;
                                        string6 = jSONObject.has("city_code") ? jSONObject.getString("city_code") : str3;
                                        string3 = jSONObject.has("country") ? jSONObject.getString("country") : str3;
                                        string4 = jSONObject.has("country_code") ? jSONObject.getString("country_code") : str3;
                                        String string18 = jSONObject.has("province") ? jSONObject.getString("province") : str3;
                                        string2 = jSONObject.has("district") ? jSONObject.getString("district") : str3;
                                        string = jSONObject.has("street") ? jSONObject.getString("street") : str3;
                                        String string19 = jSONObject.has("street_number") ? jSONObject.getString("street_number") : str3;
                                        String string20 = jSONObject.has("adcode") ? jSONObject.getString("adcode") : str3;
                                        string5 = jSONObject.has("town") ? jSONObject.getString("town") : null;
                                        str12 = string18;
                                        str6 = string19;
                                        String str18 = string20;
                                        str10 = string17;
                                        str17 = "y";
                                        str11 = str18;
                                    } else {
                                        try {
                                            String[] strArrSplit3 = jSONObject8.getString("addr").split(",");
                                            int length = strArrSplit3.length;
                                            if (length > 0) {
                                                str4 = strArrSplit3[0];
                                                i2 = 1;
                                            } else {
                                                i2 = 1;
                                                str4 = null;
                                            }
                                            if (length > i2) {
                                                try {
                                                    str5 = strArrSplit3[i2];
                                                    i3 = 2;
                                                } catch (Exception e2) {
                                                    exc2 = e2;
                                                    string = null;
                                                    str5 = null;
                                                    string2 = null;
                                                    str6 = null;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z4 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str19 = str7;
                                                    str12 = str4;
                                                    string6 = str19;
                                                    if (z4) {
                                                        this.f1958z = new b1.a.C0016a().p(string3).q(string4).s(str12).n(str10).o(string6).r(string2).t(string).u(str6).l(str11).v(string5).m();
                                                        this.f1952t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            K0(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        try {
                                                            jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                            if (jSONObject2.has("area")) {
                                                                iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                                if (iIntValue == 0) {
                                                                    i0(2);
                                                                } else if (iIntValue == 1) {
                                                                    i0(1);
                                                                }
                                                            }
                                                            if (jSONObject2.has("support")) {
                                                                h0(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                            }
                                                            if (jSONObject2.has("inbldg")) {
                                                                this.O = jSONObject2.getString("inbldg");
                                                            }
                                                            if (jSONObject2.has("inbldgid")) {
                                                                this.P = jSONObject2.getString("inbldgid");
                                                            }
                                                            if (jSONObject2.has("polygon")) {
                                                                k0(jSONObject2.getString("polygon"));
                                                            }
                                                            if (jSONObject2.has("ret_fields")) {
                                                                try {
                                                                    for (String str20 : jSONObject2.getString("ret_fields").split("\\|")) {
                                                                        strArrSplit = str20.split("=");
                                                                        if (strArrSplit == null) {
                                                                        }
                                                                    }
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            if (jSONObject2.has("inout_ble")) {
                                                                iOptInt = jSONObject2.optInt("inout_ble");
                                                                f0(iOptInt);
                                                                if (iOptInt == 1) {
                                                                    l0(true);
                                                                } else {
                                                                    l0(false);
                                                                }
                                                            } else {
                                                                f0(-1);
                                                            }
                                                        } catch (Exception e3) {
                                                            e3.printStackTrace();
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        e0(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z5 = false;
                                                        e0(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        s0(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        s0(1);
                                                    }
                                                    V(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.f1920a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        try {
                                                            if (string7.contains(",")) {
                                                                iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                                Integer.valueOf(strArrSplit2[1]).intValue();
                                                                if (iIntValue2 > 0) {
                                                                    this.f1928e0 = true;
                                                                }
                                                            }
                                                        } catch (Throwable th) {
                                                            th.printStackTrace();
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        try {
                                                            jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                            str14 = str16;
                                                            if (jSONObject3.has(str14)) {
                                                                str15 = str17;
                                                                if (jSONObject3.has(str15)) {
                                                                    this.f1924c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                    this.f1926d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        } catch (Throwable unused5) {
                                                            this.f1924c0 = Double.MIN_VALUE;
                                                            this.f1926d0 = Double.MIN_VALUE;
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                }
                                            } else {
                                                i3 = 2;
                                                str5 = null;
                                            }
                                            if (length > i3) {
                                                try {
                                                    string2 = strArrSplit3[i3];
                                                } catch (Exception e4) {
                                                    exc2 = e4;
                                                    string = null;
                                                    string2 = null;
                                                    str6 = null;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z4 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str110 = str7;
                                                    str12 = str4;
                                                    string6 = str110;
                                                    if (z4) {
                                                        this.f1958z = new b1.a.C0016a().p(string3).q(string4).s(str12).n(str10).o(string6).r(string2).t(string).u(str6).l(str11).v(string5).m();
                                                        this.f1952t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            K0(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                i0(2);
                                                            } else if (iIntValue == 1) {
                                                                i0(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            h0(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            k0(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i4 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            f0(iOptInt);
                                                            if (iOptInt == 1) {
                                                                l0(true);
                                                            } else {
                                                                l0(false);
                                                            }
                                                        } else {
                                                            f0(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        e0(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z5 = false;
                                                        e0(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        s0(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        s0(1);
                                                    }
                                                    V(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.f1920a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.f1928e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.f1924c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.f1926d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                string2 = null;
                                            }
                                            if (length > 3) {
                                                try {
                                                    string = strArrSplit3[3];
                                                } catch (Exception e5) {
                                                    exc2 = e5;
                                                    string = null;
                                                    str6 = null;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z4 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str111 = str7;
                                                    str12 = str4;
                                                    string6 = str111;
                                                    if (z4) {
                                                        this.f1958z = new b1.a.C0016a().p(string3).q(string4).s(str12).n(str10).o(string6).r(string2).t(string).u(str6).l(str11).v(string5).m();
                                                        this.f1952t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            K0(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                i0(2);
                                                            } else if (iIntValue == 1) {
                                                                i0(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            h0(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            k0(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i4 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            f0(iOptInt);
                                                            if (iOptInt == 1) {
                                                                l0(true);
                                                            } else {
                                                                l0(false);
                                                            }
                                                        } else {
                                                            f0(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        e0(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z5 = false;
                                                        e0(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        s0(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        s0(1);
                                                    }
                                                    V(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.f1920a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.f1928e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.f1924c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.f1926d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                string = null;
                                            }
                                            if (length > 4) {
                                                try {
                                                    str6 = strArrSplit3[4];
                                                } catch (Exception e6) {
                                                    exc2 = e6;
                                                    str6 = null;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z4 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str112 = str7;
                                                    str12 = str4;
                                                    string6 = str112;
                                                    if (z4) {
                                                        this.f1958z = new b1.a.C0016a().p(string3).q(string4).s(str12).n(str10).o(string6).r(string2).t(string).u(str6).l(str11).v(string5).m();
                                                        this.f1952t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            K0(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                i0(2);
                                                            } else if (iIntValue == 1) {
                                                                i0(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            h0(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            k0(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i4 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            f0(iOptInt);
                                                            if (iOptInt == 1) {
                                                                l0(true);
                                                            } else {
                                                                l0(false);
                                                            }
                                                        } else {
                                                            f0(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        e0(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z5 = false;
                                                        e0(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        s0(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        s0(1);
                                                    }
                                                    V(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.f1920a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.f1928e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.f1924c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.f1926d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                str6 = null;
                                            }
                                            if (length > 5) {
                                                try {
                                                    str7 = strArrSplit3[5];
                                                } catch (Exception e7) {
                                                    exc2 = e7;
                                                    str7 = null;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z4 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str113 = str7;
                                                    str12 = str4;
                                                    string6 = str113;
                                                    if (z4) {
                                                        this.f1958z = new b1.a.C0016a().p(string3).q(string4).s(str12).n(str10).o(string6).r(string2).t(string).u(str6).l(str11).v(string5).m();
                                                        this.f1952t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            K0(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                i0(2);
                                                            } else if (iIntValue == 1) {
                                                                i0(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            h0(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            k0(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i4 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            f0(iOptInt);
                                                            if (iOptInt == 1) {
                                                                l0(true);
                                                            } else {
                                                                l0(false);
                                                            }
                                                        } else {
                                                            f0(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        e0(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z5 = false;
                                                        e0(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        s0(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        s0(1);
                                                    }
                                                    V(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.f1920a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.f1928e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.f1924c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.f1926d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                str7 = null;
                                            }
                                            if (length > 6) {
                                                try {
                                                    str8 = strArrSplit3[6];
                                                } catch (Exception e8) {
                                                    string = string;
                                                    exc2 = e8;
                                                    str8 = null;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z4 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str114 = str7;
                                                    str12 = str4;
                                                    string6 = str114;
                                                    if (z4) {
                                                        this.f1958z = new b1.a.C0016a().p(string3).q(string4).s(str12).n(str10).o(string6).r(string2).t(string).u(str6).l(str11).v(string5).m();
                                                        this.f1952t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            K0(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                i0(2);
                                                            } else if (iIntValue == 1) {
                                                                i0(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            h0(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            k0(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i4 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            f0(iOptInt);
                                                            if (iOptInt == 1) {
                                                                l0(true);
                                                            } else {
                                                                l0(false);
                                                            }
                                                        } else {
                                                            f0(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        e0(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z5 = false;
                                                        e0(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        s0(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        s0(1);
                                                    }
                                                    V(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.f1920a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.f1928e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.f1924c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.f1926d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                str8 = null;
                                            }
                                            if (length > 7) {
                                                try {
                                                    str9 = strArrSplit3[7];
                                                } catch (Exception e9) {
                                                    string = string;
                                                    exc2 = e9;
                                                    str9 = null;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z4 = false;
                                                    str16 = "x";
                                                    string5 = null;
                                                    String str115 = str7;
                                                    str12 = str4;
                                                    string6 = str115;
                                                    if (z4) {
                                                        this.f1958z = new b1.a.C0016a().p(string3).q(string4).s(str12).n(str10).o(string6).r(string2).t(string).u(str6).l(str11).v(string5).m();
                                                        this.f1952t = true;
                                                    }
                                                    if (jSONObject8.has("floor")) {
                                                        string13 = jSONObject8.getString("floor");
                                                        this.A = string13;
                                                        if (TextUtils.isEmpty(string13)) {
                                                            this.A = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoor")) {
                                                        string12 = jSONObject8.getString("indoor");
                                                        if (!TextUtils.isEmpty(string12)) {
                                                            K0(Integer.valueOf(string12).intValue());
                                                        }
                                                    }
                                                    if (jSONObject8.has("loctp")) {
                                                        string11 = jSONObject8.getString("loctp");
                                                        this.H = string11;
                                                        if (TextUtils.isEmpty(string11)) {
                                                            this.H = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldgid")) {
                                                        string10 = jSONObject8.getString("bldgid");
                                                        this.B = string10;
                                                        if (TextUtils.isEmpty(string10)) {
                                                            this.B = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("bldg")) {
                                                        string9 = jSONObject8.getString("bldg");
                                                        this.C = string9;
                                                        if (TextUtils.isEmpty(string9)) {
                                                            this.C = null;
                                                        }
                                                    }
                                                    if (jSONObject8.has("acc")) {
                                                        this.D = jSONObject8.getDouble("acc");
                                                    }
                                                    if (jSONObject8.has("ibav")) {
                                                        string8 = jSONObject8.getString("ibav");
                                                        if (TextUtils.isEmpty(string8)) {
                                                            this.F = 0;
                                                        } else {
                                                            this.F = Integer.valueOf(string8).intValue();
                                                        }
                                                    }
                                                    if (jSONObject8.has("indoorflags")) {
                                                        jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                                        if (jSONObject2.has("area")) {
                                                            iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                                            if (iIntValue == 0) {
                                                                i0(2);
                                                            } else if (iIntValue == 1) {
                                                                i0(1);
                                                            }
                                                        }
                                                        if (jSONObject2.has("support")) {
                                                            h0(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                                        }
                                                        if (jSONObject2.has("inbldg")) {
                                                            this.O = jSONObject2.getString("inbldg");
                                                        }
                                                        if (jSONObject2.has("inbldgid")) {
                                                            this.P = jSONObject2.getString("inbldgid");
                                                        }
                                                        if (jSONObject2.has("polygon")) {
                                                            k0(jSONObject2.getString("polygon"));
                                                        }
                                                        if (jSONObject2.has("ret_fields")) {
                                                            while (i4 < r5) {
                                                                strArrSplit = str20.split("=");
                                                                if (strArrSplit == null) {
                                                                }
                                                            }
                                                        }
                                                        if (jSONObject2.has("inout_ble")) {
                                                            iOptInt = jSONObject2.optInt("inout_ble");
                                                            f0(iOptInt);
                                                            if (iOptInt == 1) {
                                                                l0(true);
                                                            } else {
                                                                l0(false);
                                                            }
                                                        } else {
                                                            f0(-1);
                                                        }
                                                    }
                                                    if (jSONObject8.has("gpscs")) {
                                                        e0(jSONObject8.getInt("gpscs"));
                                                    } else {
                                                        z5 = false;
                                                        e0(0);
                                                    }
                                                    if (jSONObject8.has("in_cn")) {
                                                        s0(Integer.parseInt(jSONObject8.getString("in_cn")));
                                                    } else {
                                                        s0(1);
                                                    }
                                                    V(this.G == 0 ? "wgs84" : "gcj02");
                                                    if (jSONObject8.has("navi")) {
                                                        this.f1920a0 = jSONObject8.getString("navi");
                                                    }
                                                    if (jSONObject8.has("navi_client")) {
                                                        if (string7.contains(",")) {
                                                            iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                                            Integer.valueOf(strArrSplit2[1]).intValue();
                                                            if (iIntValue2 > 0) {
                                                                this.f1928e0 = true;
                                                            }
                                                        }
                                                    }
                                                    if (jSONObject8.has("nrl_point")) {
                                                        jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                                        str14 = str16;
                                                        if (jSONObject3.has(str14)) {
                                                            str15 = str17;
                                                            if (jSONObject3.has(str15)) {
                                                                this.f1924c0 = Double.parseDouble(jSONObject3.getString(str15));
                                                                this.f1926d0 = Double.parseDouble(jSONObject3.getString(str14));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                str9 = null;
                                            }
                                            if (length > 8) {
                                                try {
                                                    str13 = strArrSplit3[8];
                                                } catch (Exception e10) {
                                                    string = string;
                                                    exc2 = e10;
                                                    exc2.printStackTrace();
                                                    str10 = str5;
                                                    string3 = str8;
                                                    string4 = str9;
                                                    str11 = null;
                                                    z4 = false;
                                                }
                                            } else {
                                                str13 = null;
                                            }
                                            string = string;
                                            str10 = str5;
                                            string3 = str8;
                                            z4 = true;
                                            str11 = str13;
                                            string4 = str9;
                                        } catch (Exception e11) {
                                            exc2 = e11;
                                            string = null;
                                            str4 = null;
                                        }
                                        str16 = "x";
                                        string5 = null;
                                        String str116 = str7;
                                        str12 = str4;
                                        string6 = str116;
                                    }
                                    if (z4) {
                                        this.f1958z = new b1.a.C0016a().p(string3).q(string4).s(str12).n(str10).o(string6).r(string2).t(string).u(str6).l(str11).v(string5).m();
                                        this.f1952t = true;
                                    }
                                } else {
                                    str16 = "x";
                                    str17 = "y";
                                    z5 = false;
                                    try {
                                        this.f1952t = false;
                                        R(null);
                                    } catch (Exception e12) {
                                        e = e12;
                                        z2 = z5;
                                        exc = e;
                                        z3 = z2;
                                        exc.printStackTrace();
                                        r2 = z3;
                                        this.f1921b = r2;
                                        this.f1952t = r2;
                                    }
                                }
                                if (jSONObject8.has("floor")) {
                                    string13 = jSONObject8.getString("floor");
                                    this.A = string13;
                                    if (TextUtils.isEmpty(string13)) {
                                        this.A = null;
                                    }
                                }
                                if (jSONObject8.has("indoor")) {
                                    string12 = jSONObject8.getString("indoor");
                                    if (!TextUtils.isEmpty(string12)) {
                                        K0(Integer.valueOf(string12).intValue());
                                    }
                                }
                                if (jSONObject8.has("loctp")) {
                                    string11 = jSONObject8.getString("loctp");
                                    this.H = string11;
                                    if (TextUtils.isEmpty(string11)) {
                                        this.H = null;
                                    }
                                }
                                if (jSONObject8.has("bldgid")) {
                                    string10 = jSONObject8.getString("bldgid");
                                    this.B = string10;
                                    if (TextUtils.isEmpty(string10)) {
                                        this.B = null;
                                    }
                                }
                                if (jSONObject8.has("bldg")) {
                                    string9 = jSONObject8.getString("bldg");
                                    this.C = string9;
                                    if (TextUtils.isEmpty(string9)) {
                                        this.C = null;
                                    }
                                }
                                if (jSONObject8.has("acc")) {
                                    this.D = jSONObject8.getDouble("acc");
                                }
                                if (jSONObject8.has("ibav")) {
                                    string8 = jSONObject8.getString("ibav");
                                    if (TextUtils.isEmpty(string8) && !string8.equals("0")) {
                                        this.F = Integer.valueOf(string8).intValue();
                                    } else {
                                        this.F = 0;
                                    }
                                }
                                if (jSONObject8.has("indoorflags")) {
                                    jSONObject2 = jSONObject8.getJSONObject("indoorflags");
                                    if (jSONObject2.has("area")) {
                                        iIntValue = Integer.valueOf(jSONObject2.getString("area")).intValue();
                                        if (iIntValue == 0) {
                                            i0(2);
                                        } else if (iIntValue == 1) {
                                            i0(1);
                                        }
                                    }
                                    if (jSONObject2.has("support")) {
                                        h0(Integer.valueOf(jSONObject2.getString("support")).intValue());
                                    }
                                    if (jSONObject2.has("inbldg")) {
                                        this.O = jSONObject2.getString("inbldg");
                                    }
                                    if (jSONObject2.has("inbldgid")) {
                                        this.P = jSONObject2.getString("inbldgid");
                                    }
                                    if (jSONObject2.has("polygon")) {
                                        k0(jSONObject2.getString("polygon"));
                                    }
                                    if (jSONObject2.has("ret_fields")) {
                                        while (i4 < r5) {
                                            strArrSplit = str20.split("=");
                                            if (strArrSplit == null && strArrSplit.length >= 2) {
                                                this.W.putString(strArrSplit[0], strArrSplit[1]);
                                            }
                                        }
                                    }
                                    if (jSONObject2.has("inout_ble")) {
                                        iOptInt = jSONObject2.optInt("inout_ble");
                                        f0(iOptInt);
                                        if (iOptInt == 1) {
                                            l0(true);
                                        } else {
                                            l0(false);
                                        }
                                    } else {
                                        f0(-1);
                                    }
                                }
                                if (jSONObject8.has("gpscs")) {
                                    e0(jSONObject8.getInt("gpscs"));
                                } else {
                                    z5 = false;
                                    e0(0);
                                }
                                try {
                                    if (jSONObject8.has("in_cn")) {
                                        s0(Integer.parseInt(jSONObject8.getString("in_cn")));
                                    } else {
                                        s0(1);
                                    }
                                } catch (Exception unused6) {
                                }
                                V(this.G == 0 ? "wgs84" : "gcj02");
                                if (jSONObject8.has("navi")) {
                                    this.f1920a0 = jSONObject8.getString("navi");
                                }
                                if (jSONObject8.has("navi_client") && (string7 = jSONObject8.getString("navi_client")) != null) {
                                    if (string7.contains(",") && (strArrSplit2 = string7.split(",")) != null && strArrSplit2.length >= 2) {
                                        iIntValue2 = Integer.valueOf(strArrSplit2[0]).intValue();
                                        Integer.valueOf(strArrSplit2[1]).intValue();
                                        if (iIntValue2 > 0) {
                                            this.f1928e0 = true;
                                        }
                                    }
                                }
                                if (jSONObject8.has("nrl_point")) {
                                    jSONObject3 = jSONObject8.getJSONObject("nrl_point");
                                    str14 = str16;
                                    if (jSONObject3.has(str14)) {
                                        str15 = str17;
                                        if (jSONObject3.has(str15)) {
                                            this.f1924c0 = Double.parseDouble(jSONObject3.getString(str15));
                                            this.f1926d0 = Double.parseDouble(jSONObject3.getString(str14));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (i5 != 66 && i5 != 68) {
                                if (i5 == 167) {
                                    s0(2);
                                    return;
                                }
                                return;
                            }
                            JSONObject jSONObject13 = jSONObject4.getJSONObject("content");
                            JSONObject jSONObject14 = jSONObject13.getJSONObject("point");
                            n0(Double.parseDouble(jSONObject14.getString("y")));
                            t0(Double.parseDouble(jSONObject14.getString("x")));
                            B0(Float.parseFloat(jSONObject13.getString("radius")));
                            a(Boolean.valueOf(Boolean.parseBoolean(jSONObject13.getString("isCellChanged"))));
                        }
                        V(str2);
                    } catch (Exception e13) {
                        exc = e13;
                        z3 = false;
                        exc.printStackTrace();
                        r2 = z3;
                        this.f1921b = r2;
                        this.f1952t = r2;
                    }
                } catch (Exception e14) {
                    exc = e14;
                    z3 = false;
                }
            } catch (Exception e15) {
                e = e15;
                z2 = false;
            }
        } catch (Error e16) {
            e16.printStackTrace();
            r2 = 0;
            this.f1921b = r2;
            this.f1952t = r2;
        }
    }

    public String A() {
        return this.f1920a0;
    }

    public void A0(j jVar) {
        this.f1930f0 = jVar;
    }

    public List<i> B() {
        return this.S;
    }

    public void B0(float f2) {
        this.f1939k = f2;
        this.f1937j = true;
    }

    public j C() {
        return this.f1930f0;
    }

    public void C0(c cVar) {
        if (y() > 0) {
            this.f1940k0 = cVar;
        }
    }

    public String D() {
        return this.f1958z.f1900c;
    }

    public void D0(float f2, float f3, String str, String str2) {
        String str3;
        String str4 = ((double) f2) > 0.001d ? String.format("%.2f", Float.valueOf(f2)) : "";
        String str5 = ((double) f3) > 0.001d ? String.format("%.2f", Float.valueOf(f3)) : "";
        String str6 = this.f1920a0;
        if (str6 != null) {
            Locale locale = Locale.US;
            str3 = String.format(locale, "%s|%s,%s", str6, str4, str5);
            String str7 = this.f1922b0;
            if (str7 != null) {
                str3 = String.format(locale, "%s|%s", str3, str7);
            }
        } else {
            str3 = null;
        }
        if (str == null) {
            str = str3;
        } else if (str3 != null) {
            str = String.format(Locale.US, "%s|%s", str3, str);
        }
        if (str2 == null) {
            str2 = str;
        } else if (str != null) {
            str2 = String.format(Locale.US, "%s|%s", str, str2);
        }
        this.V = str2;
    }

    public float E() {
        return this.f1939k;
    }

    public void E0(int i2) {
        this.f1949q = i2;
    }

    public String F(String str) {
        return this.W.getString(str);
    }

    public void F0(float f2) {
        this.f1935i = f2;
        this.f1933h = true;
    }

    public int G() {
        this.f1948p = true;
        return this.f1949q;
    }

    public void G0(String str) {
        this.f1923c = str;
        r0(n.i.u(str));
    }

    public float H() {
        return this.f1935i;
    }

    public void H0(String str) {
        this.f1941l = str;
    }

    public String I() {
        return this.f1923c;
    }

    public void I0(float f2) {
        this.f1943m = f2;
    }

    public long J() {
        return this.f1946n0;
    }

    public void J0(float f2) {
        this.f1947o = f2;
    }

    public String K() {
        return this.f1941l;
    }

    public void K0(int i2) {
        this.K = i2;
    }

    public int L() {
        return this.K;
    }

    public boolean M() {
        return this.f1952t;
    }

    public boolean N() {
        return this.f1929f;
    }

    public boolean O() {
        return this.f1928e0;
    }

    public int P() {
        return this.F;
    }

    public void Q(b1.a aVar) {
        if (aVar != null) {
            this.f1958z = aVar;
            this.f1952t = true;
        }
    }

    public void R(String str) {
        this.f1953u = str;
        this.f1952t = str != null;
    }

    public void S(double d2) {
        if (d2 < 9999.0d) {
            this.f1931g = d2;
            this.f1929f = true;
        }
    }

    public void T(String str) {
        this.B = str;
    }

    public void U(String str) {
        this.C = str;
    }

    public void V(String str) {
        this.f1951s = str;
    }

    public void W(long j2) {
        this.Z = j2;
    }

    public void X(float f2) {
        this.f1950r = f2;
    }

    public void Y(double d2) {
        this.f1934h0 = d2;
    }

    public void Z(Bundle bundle) {
        this.f1942l0 = bundle == null ? null : new Bundle(bundle);
    }

    public final void a(Boolean bool) {
        this.f1957y = bool.booleanValue();
    }

    public void a0(String str) {
        this.A = str;
    }

    public double b() {
        return this.D;
    }

    public void b0(String str, double[] dArr) {
        if (this.W == null) {
            this.W = new Bundle();
        }
        this.W.putDoubleArray(str, dArr);
    }

    public String c() {
        return this.f1958z.f1906i;
    }

    public void c0(String str) {
        this.f1944m0 = str;
    }

    public b1.a d() {
        return this.f1958z;
    }

    @Deprecated
    public void d0(int i2) {
        this.X = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double e() {
        return this.f1931g;
    }

    @Deprecated
    public void e0(int i2) {
        this.Y = i2;
    }

    public String f() {
        return this.B;
    }

    public void f0(int i2) {
        this.R = i2;
    }

    public String g() {
        return this.C;
    }

    public void g0(boolean z2) {
        this.E = z2;
    }

    public String h() {
        return this.f1958z.f1901d;
    }

    public void h0(int i2) {
        this.N = i2;
    }

    public String i() {
        return this.f1958z.f1902e;
    }

    public void i0(int i2) {
        this.L = i2;
    }

    public String j() {
        return this.f1951s;
    }

    public void j0(int i2) {
        this.M = i2;
    }

    public String k() {
        return this.f1958z.f1898a;
    }

    public void k0(String str) {
        this.Q = str;
    }

    public float l() {
        return this.f1950r;
    }

    public void l0(boolean z2) {
        this.f1928e0 = z2;
    }

    public String m() {
        return this.f1958z.f1903f;
    }

    public void m0(int i2) {
        this.f1945n = i2;
    }

    public Bundle n() {
        return this.f1942l0;
    }

    public void n0(double d2) {
        this.f1925d = d2;
    }

    public String o() {
        return this.A;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    public void o0(int i2) {
        String str;
        this.f1921b = i2;
        if (i2 == 66) {
            str = "Offline location successful!";
        } else if (i2 == 67) {
            str = "Offline location failed, please check the net (wifi/cell)!";
        } else if (i2 == 167) {
            str = "NetWork location failed because baidu location service can not caculate the location!";
        } else if (i2 != 505) {
            switch (i2) {
                case 61:
                    p0("GPS location successful!");
                    K0(0);
                    c0("system");
                    return;
                case 62:
                    str = "Location failed beacuse we can not get any loc information!";
                    break;
                case 63:
                    str = "Offline location failed, please check the net (wifi/cell)!";
                    break;
                default:
                    switch (i2) {
                        case 69:
                            str = "Location failed because the location service switch is not on";
                            break;
                        case 70:
                            str = "Location failed because the location permission is not enabled";
                            break;
                        case 71:
                            str = "Location failed because the location service switch is not on and the location permission is not enabled";
                            break;
                        default:
                            switch (i2) {
                                case 160:
                                    str = "Coarse location successful";
                                    break;
                                case 161:
                                    str = "NetWork location successful!";
                                    break;
                                case 162:
                                    str = "NetWork location failed because baidu location service can not decrypt the request query, please check the so file !";
                                    break;
                                default:
                                    str = "UnKnown!";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            str = "NetWork location failed because baidu location service check the key is unlegal, please check the key in AndroidManifest.xml !";
        }
        p0(str);
    }

    @Deprecated
    public float p() {
        return this.f1932g0;
    }

    public void p0(String str) {
        this.T = str;
    }

    public int q() {
        return this.R;
    }

    public void q0(String str) {
        this.f1954v = str;
    }

    public String r() {
        return this.P;
    }

    public void r0(String str) {
        this.U = str;
    }

    public String s() {
        return this.O;
    }

    public void s0(int i2) {
        this.G = i2;
    }

    public String t() {
        return this.Q;
    }

    public void t0(double d2) {
        this.f1927e = d2;
    }

    public String toString() {
        return "&loctype=" + v() + "&lat=" + u() + "&lon=" + x() + "&radius=" + E() + "&biasprob=" + p() + "&altitude=" + e() + "&speed=" + H() + "&time=" + J() + "&extrainfo=" + n();
    }

    public double u() {
        return this.f1925d;
    }

    @Deprecated
    public void u0(int i2) {
        this.f1938j0 = i2;
    }

    public int v() {
        return this.f1921b;
    }

    @Deprecated
    public void v0(int i2) {
        this.f1936i0 = i2;
    }

    public String w() {
        return this.f1954v;
    }

    public void w0(String str) {
        this.H = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1921b);
        parcel.writeString(this.f1923c);
        parcel.writeLong(this.f1946n0);
        parcel.writeDouble(this.f1925d);
        parcel.writeDouble(this.f1927e);
        parcel.writeDouble(this.f1931g);
        parcel.writeFloat(this.f1935i);
        parcel.writeFloat(this.f1939k);
        parcel.writeString(this.f1941l);
        parcel.writeFloat(this.f1943m);
        parcel.writeInt(this.f1945n);
        parcel.writeFloat(this.f1947o);
        parcel.writeInt(this.f1949q);
        parcel.writeFloat(this.f1950r);
        parcel.writeString(this.A);
        parcel.writeInt(this.F);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeDouble(this.D);
        parcel.writeString(this.H);
        parcel.writeString(this.f1958z.f1900c);
        parcel.writeString(this.f1958z.f1901d);
        parcel.writeString(this.f1958z.f1903f);
        parcel.writeString(this.f1958z.f1904g);
        parcel.writeString(this.f1958z.f1905h);
        parcel.writeString(this.f1958z.f1902e);
        parcel.writeString(this.f1958z.f1906i);
        parcel.writeString(this.f1958z.f1898a);
        parcel.writeString(this.f1958z.f1899b);
        parcel.writeString(this.f1958z.f1907j);
        parcel.writeString(this.f1958z.f1908k);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.f1954v);
        parcel.writeString(this.f1955w);
        parcel.writeString(this.f1956x);
        parcel.writeInt(this.G);
        parcel.writeString(this.T);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.X);
        parcel.writeString(this.U);
        parcel.writeInt(this.Y);
        parcel.writeString(this.V);
        parcel.writeString(this.f1920a0);
        parcel.writeString(this.f1922b0);
        parcel.writeLong(this.Z);
        parcel.writeDouble(this.f1924c0);
        parcel.writeDouble(this.f1926d0);
        parcel.writeFloat(this.f1932g0);
        parcel.writeDouble(this.f1934h0);
        parcel.writeInt(this.f1936i0);
        parcel.writeInt(this.f1938j0);
        parcel.writeString(this.f1951s);
        parcel.writeString(this.f1944m0);
        parcel.writeParcelable(this.f1940k0, i2);
        parcel.writeBooleanArray(new boolean[]{this.f1929f, this.f1933h, this.f1937j, this.f1948p, this.f1952t, this.f1957y, this.E, this.f1928e0});
        parcel.writeList(this.S);
        parcel.writeBundle(this.W);
        parcel.writeBundle(this.f1942l0);
        parcel.writeParcelable(this.f1930f0, i2);
    }

    public double x() {
        return this.f1927e;
    }

    public void x0(String str) {
        this.f1920a0 = str;
    }

    @Deprecated
    public int y() {
        return this.f1936i0;
    }

    public void y0(int i2) {
        this.F = i2;
    }

    public String z() {
        return this.H;
    }

    public void z0(List<i> list) {
        this.S = list;
    }
}
