package c;

import android.content.Context;
import android.content.SharedPreferences;
import b.w;
import com.baidu.location.Jni;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import n.g;
import n.h;
import n.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f2073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2074e = h.f3402a + "/conlts.dat";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f2075f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f2076g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f2077h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f2078a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2079b = 604800;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2080c = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a();
        }
    }

    public class b extends g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f2082j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2083k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2084l = false;

        public b() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            Map<String, Object> map;
            String str;
            this.f3380b = 2;
            String strF = Jni.f(this.f2082j);
            this.f2082j = null;
            if (this.f2083k) {
                map = this.f3382d;
                str = "grid";
            } else {
                map = this.f3382d;
                str = "conf";
            }
            map.put("qt", str);
            this.f3382d.put("req", strF);
        }

        @Override // n.g
        public void h(boolean z2) {
            String str;
            if (!z2 || (str = this.f3381c) == null) {
                d.this.k(null);
            } else if (this.f2083k) {
                d.this.g(this.f3383e);
            } else {
                d.this.k(str);
            }
            Map<String, Object> map = this.f3382d;
            if (map != null) {
                map.clear();
            }
            this.f2084l = false;
        }

        public void i(String str, boolean z2) {
            if (this.f2084l) {
                return;
            }
            this.f2084l = true;
            this.f2082j = str;
            this.f2083k = z2;
            ExecutorService executorServiceC = w.b().c();
            if (z2) {
                d(executorServiceC, true, "loc.map.baidu.com");
            } else if (executorServiceC != null) {
                c(executorServiceC, n.d.f3357c);
            } else {
                b(n.d.f3357c);
            }
        }
    }

    public static d i() {
        if (f2073d == null) {
            f2073d = new d();
        }
        return f2073d;
    }

    public final void a() {
        String str = "&ver=" + i.f3445v + "&usr=" + n.b.g().i() + "&app=" + n.b.f3344f + "&prod=" + n.b.f3345g;
        if (this.f2078a == null) {
            this.f2078a = new b();
        }
        if (i.N()) {
            return;
        }
        this.f2078a.i(str, false);
    }

    public final void b(int i2) {
        this.f2080c = (i2 & 1) == 1;
    }

    public final void f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            boolean z2 = (jSONObject.has("ipen") && jSONObject.getInt("ipen") == 0) ? false : true;
            int i2 = jSONObject.has("ipvt") ? jSONObject.getInt("ipvt") : 14400000;
            int i3 = jSONObject.has("ipvn") ? jSONObject.getInt("ipvn") : 10;
            SharedPreferences.Editor editorEdit = com.baidu.location.f.c().getSharedPreferences("MapCoreServicePre", 0).edit();
            editorEdit.putBoolean("ipLocInfoUpload", z2);
            editorEdit.putInt("ipValidTime", i2);
            editorEdit.putInt("ipLocInfoUploadTimesPerDay", i3);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    public final void g(byte[] bArr) {
        int i2 = 0;
        if (bArr != null) {
            try {
                if (bArr.length < 640) {
                    i.f3443u = false;
                    i.f3437r = i.f3433p + 0.025d;
                    i.f3435q = i.f3431o - 0.025d;
                } else {
                    i.f3443u = true;
                    i.f3435q = Double.longBitsToDouble(((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (((long) bArr[0]) & 255));
                    i.f3437r = Double.longBitsToDouble(((((long) bArr[15]) & 255) << 56) | ((((long) bArr[14]) & 255) << 48) | ((((long) bArr[13]) & 255) << 40) | ((((long) bArr[12]) & 255) << 32) | ((((long) bArr[11]) & 255) << 24) | ((((long) bArr[10]) & 255) << 16) | ((((long) bArr[9]) & 255) << 8) | (255 & ((long) bArr[8])));
                    i.f3441t = new byte[625];
                    while (i2 < 625) {
                        i.f3441t[i2] = bArr[i2 + 16];
                        i2++;
                    }
                }
                i2 = 1;
            } catch (Exception unused) {
                return;
            }
        }
        if (i2 != 0) {
            q();
        }
    }

    public final boolean h(String str) {
        if (str == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("ipconf")) {
                try {
                    f(jSONObject.getJSONObject("ipconf"));
                } catch (Exception unused) {
                }
            }
            if (jSONObject.has("is_check_Per")) {
                try {
                    if (jSONObject.getInt("is_check_Per") > 0) {
                        i.f3434p0 = true;
                    }
                } catch (Exception unused2) {
                }
            }
            int i2 = Integer.parseInt(jSONObject.getString("ver"));
            if (i2 <= i.f3445v) {
                return false;
            }
            i.f3445v = i2;
            if (jSONObject.has("gps")) {
                String[] strArrSplit = jSONObject.getString("gps").split("\\|");
                if (strArrSplit.length > 10) {
                    String str2 = strArrSplit[0];
                    if (str2 != null && !str2.equals("")) {
                        i.f3447w = Float.parseFloat(strArrSplit[0]);
                    }
                    String str3 = strArrSplit[1];
                    if (str3 != null && !str3.equals("")) {
                        i.f3449x = Float.parseFloat(strArrSplit[1]);
                    }
                    String str4 = strArrSplit[2];
                    if (str4 != null && !str4.equals("")) {
                        i.f3451y = Float.parseFloat(strArrSplit[2]);
                    }
                    String str5 = strArrSplit[3];
                    if (str5 != null && !str5.equals("")) {
                        i.f3453z = Float.parseFloat(strArrSplit[3]);
                    }
                    String str6 = strArrSplit[4];
                    if (str6 != null && !str6.equals("")) {
                        i.A = Integer.parseInt(strArrSplit[4]);
                    }
                    String str7 = strArrSplit[5];
                    if (str7 != null && !str7.equals("")) {
                        i.B = Integer.parseInt(strArrSplit[5]);
                    }
                    String str8 = strArrSplit[6];
                    if (str8 != null && !str8.equals("")) {
                        i.C = Integer.parseInt(strArrSplit[6]);
                    }
                    String str9 = strArrSplit[7];
                    if (str9 != null && !str9.equals("")) {
                        i.D = Integer.parseInt(strArrSplit[7]);
                    }
                    String str10 = strArrSplit[8];
                    if (str10 != null && !str10.equals("")) {
                        i.E = Integer.parseInt(strArrSplit[8]);
                    }
                    String str11 = strArrSplit[9];
                    if (str11 != null && !str11.equals("")) {
                        i.F = Integer.parseInt(strArrSplit[9]);
                    }
                    String str12 = strArrSplit[10];
                    if (str12 != null && !str12.equals("")) {
                        i.G = Integer.parseInt(strArrSplit[10]);
                    }
                }
            }
            if (jSONObject.has("up")) {
                String[] strArrSplit2 = jSONObject.getString("up").split("\\|");
                if (strArrSplit2.length > 3) {
                    String str13 = strArrSplit2[0];
                    if (str13 != null && !str13.equals("")) {
                        i.H = Float.parseFloat(strArrSplit2[0]);
                    }
                    String str14 = strArrSplit2[1];
                    if (str14 != null && !str14.equals("")) {
                        i.I = Float.parseFloat(strArrSplit2[1]);
                    }
                    String str15 = strArrSplit2[2];
                    if (str15 != null && !str15.equals("")) {
                        i.J = Float.parseFloat(strArrSplit2[2]);
                    }
                    String str16 = strArrSplit2[3];
                    if (str16 != null && !str16.equals("")) {
                        i.K = Float.parseFloat(strArrSplit2[3]);
                    }
                }
            }
            if (jSONObject.has("wf")) {
                String[] strArrSplit3 = jSONObject.getString("wf").split("\\|");
                if (strArrSplit3.length > 3) {
                    String str17 = strArrSplit3[0];
                    if (str17 != null && !str17.equals("")) {
                        i.L = Integer.parseInt(strArrSplit3[0]);
                    }
                    String str18 = strArrSplit3[1];
                    if (str18 != null && !str18.equals("")) {
                        i.M = Float.parseFloat(strArrSplit3[1]);
                    }
                    String str19 = strArrSplit3[2];
                    if (str19 != null && !str19.equals("")) {
                        i.N = Integer.parseInt(strArrSplit3[2]);
                    }
                    String str20 = strArrSplit3[3];
                    if (str20 != null && !str20.equals("")) {
                        i.O = Float.parseFloat(strArrSplit3[3]);
                    }
                }
            }
            if (jSONObject.has("ab")) {
                String[] strArrSplit4 = jSONObject.getString("ab").split("\\|");
                if (strArrSplit4.length > 3) {
                    String str21 = strArrSplit4[0];
                    if (str21 != null && !str21.equals("")) {
                        i.P = Float.parseFloat(strArrSplit4[0]);
                    }
                    String str22 = strArrSplit4[1];
                    if (str22 != null && !str22.equals("")) {
                        i.Q = Float.parseFloat(strArrSplit4[1]);
                    }
                    String str23 = strArrSplit4[2];
                    if (str23 != null && !str23.equals("")) {
                        i.R = Integer.parseInt(strArrSplit4[2]);
                    }
                    String str24 = strArrSplit4[3];
                    if (str24 != null && !str24.equals("")) {
                        i.S = Integer.parseInt(strArrSplit4[3]);
                    }
                }
            }
            if (jSONObject.has("zxd")) {
                String[] strArrSplit5 = jSONObject.getString("zxd").split("\\|");
                if (strArrSplit5.length > 4) {
                    String str25 = strArrSplit5[0];
                    if (str25 != null && !str25.equals("")) {
                        i.f3422j0 = Float.parseFloat(strArrSplit5[0]);
                    }
                    String str26 = strArrSplit5[1];
                    if (str26 != null && !str26.equals("")) {
                        i.f3424k0 = Float.parseFloat(strArrSplit5[1]);
                    }
                    String str27 = strArrSplit5[2];
                    if (str27 != null && !str27.equals("")) {
                        i.f3426l0 = Integer.parseInt(strArrSplit5[2]);
                    }
                    String str28 = strArrSplit5[3];
                    if (str28 != null && !str28.equals("")) {
                        i.f3428m0 = Integer.parseInt(strArrSplit5[3]);
                    }
                    String str29 = strArrSplit5[4];
                    if (str29 != null && !str29.equals("")) {
                        i.f3430n0 = Integer.parseInt(strArrSplit5[4]);
                    }
                }
            }
            if (jSONObject.has("gpc")) {
                String[] strArrSplit6 = jSONObject.getString("gpc").split("\\|");
                if (strArrSplit6.length > 5) {
                    String str30 = strArrSplit6[0];
                    if (str30 != null && !str30.equals("")) {
                        if (Integer.parseInt(strArrSplit6[0]) > 0) {
                            i.W = true;
                        } else {
                            i.W = false;
                        }
                    }
                    String str31 = strArrSplit6[1];
                    if (str31 != null && !str31.equals("")) {
                        if (Integer.parseInt(strArrSplit6[1]) > 0) {
                            i.X = true;
                        } else {
                            i.X = false;
                        }
                    }
                    String str32 = strArrSplit6[2];
                    if (str32 != null && !str32.equals("")) {
                        i.Y = Integer.parseInt(strArrSplit6[2]);
                    }
                    String str33 = strArrSplit6[3];
                    if (str33 != null && !str33.equals("")) {
                        i.Z = Integer.parseInt(strArrSplit6[3]);
                    }
                    String str34 = strArrSplit6[4];
                    if (str34 != null && !str34.equals("")) {
                        int i3 = Integer.parseInt(strArrSplit6[4]);
                        if (i3 > 0) {
                            long j2 = i3;
                            i.f3408c0 = j2;
                            long j3 = j2 * 1000 * 60;
                            i.f3406b0 = j3;
                            i.f3410d0 = j3 >> 2;
                        } else {
                            i.f3427m = false;
                        }
                    }
                    String str35 = strArrSplit6[5];
                    if (str35 != null && !str35.equals("")) {
                        i.f3414f0 = Integer.parseInt(strArrSplit6[5]);
                    }
                }
            }
            if (jSONObject.has("shak")) {
                String[] strArrSplit7 = jSONObject.getString("shak").split("\\|");
                if (strArrSplit7.length > 2) {
                    String str36 = strArrSplit7[0];
                    if (str36 != null && !str36.equals("")) {
                        i.f3416g0 = Integer.parseInt(strArrSplit7[0]);
                    }
                    String str37 = strArrSplit7[1];
                    if (str37 != null && !str37.equals("")) {
                        i.f3418h0 = Integer.parseInt(strArrSplit7[1]);
                    }
                    String str38 = strArrSplit7[2];
                    if (str38 != null && !str38.equals("")) {
                        i.f3420i0 = Float.parseFloat(strArrSplit7[2]);
                    }
                }
            }
            if (jSONObject.has("dmx")) {
                i.f3412e0 = jSONObject.getInt("dmx");
            }
            return true;
        } catch (Exception unused3) {
            return false;
        }
    }

    public final void j(int i2) {
        File file = new File(f2074e);
        if (!file.exists()) {
            l();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(4L);
            int i3 = randomAccessFile.readInt();
            int i4 = randomAccessFile.readInt();
            randomAccessFile.seek((i3 * f2077h) + 128);
            byte[] bytes = (n.b.f3344f + (char) 0).getBytes();
            randomAccessFile.writeInt(bytes.length);
            randomAccessFile.write(bytes, 0, bytes.length);
            randomAccessFile.writeInt(i2);
            if (i4 == f2077h) {
                randomAccessFile.seek(8L);
                randomAccessFile.writeInt(i4 + 1);
            }
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public final void k(String str) {
        f2076g = -1;
        if (str != null) {
            try {
                if (h(str)) {
                    p();
                }
            } catch (Exception unused) {
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ctr")) {
                    f2076g = Integer.parseInt(jSONObject.getString("ctr"));
                }
            } catch (Exception unused2) {
            }
            try {
                o();
                int i2 = f2076g;
                if (i2 != -1) {
                    j(i2);
                } else {
                    i2 = f2075f;
                    if (i2 == -1) {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    b(i2);
                }
            } catch (Exception unused3) {
            }
        }
    }

    public final void l() {
        try {
            File file = new File(f2074e);
            if (file.exists()) {
                return;
            }
            File file2 = new File(h.f3402a);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (!file.createNewFile()) {
                file = null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(128);
            randomAccessFile.writeInt(0);
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public void m() {
        if (System.currentTimeMillis() - n.e.g().e() > this.f2079b * 1000) {
            n.e.g().f(System.currentTimeMillis());
            m.a.h().postDelayed(new a(), 1000L);
        }
    }

    public final void n() {
        try {
            File file = new File(h.f3402a + "/config.dat");
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                if (randomAccessFile.readBoolean()) {
                    randomAccessFile.seek(2L);
                    int i2 = randomAccessFile.readInt();
                    byte[] bArr = new byte[i2];
                    randomAccessFile.read(bArr, 0, i2);
                    h(new String(bArr));
                }
                randomAccessFile.seek(1L);
                if (randomAccessFile.readBoolean()) {
                    randomAccessFile.seek(1024L);
                    i.f3435q = randomAccessFile.readDouble();
                    i.f3437r = randomAccessFile.readDouble();
                    boolean z2 = randomAccessFile.readBoolean();
                    i.f3443u = z2;
                    if (z2) {
                        byte[] bArr2 = new byte[625];
                        i.f3441t = bArr2;
                        randomAccessFile.read(bArr2, 0, 625);
                    }
                }
                randomAccessFile.close();
            }
        } catch (Exception unused) {
        }
        if (i.f3427m) {
            Context context = com.baidu.location.f.f2178e;
        }
    }

    public final void o() {
        try {
            File file = new File(f2074e);
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(4L);
                int i2 = randomAccessFile.readInt();
                if (i2 > 3000) {
                    randomAccessFile.close();
                    f2077h = 0;
                    l();
                    return;
                }
                int i3 = randomAccessFile.readInt();
                randomAccessFile.seek(128L);
                byte[] bArr = new byte[i2];
                int i4 = 0;
                while (i4 < i3) {
                    randomAccessFile.seek((i2 * i4) + 128);
                    int i5 = randomAccessFile.readInt();
                    if (i5 > 0 && i5 < i2) {
                        randomAccessFile.read(bArr, 0, i5);
                        int i6 = i5 - 1;
                        if (bArr[i6] == 0) {
                            String str = new String(bArr, 0, i6);
                            n.b.g();
                            if (str.equals(n.b.f3344f)) {
                                f2075f = randomAccessFile.readInt();
                                f2077h = i4;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i4++;
                }
                if (i4 == i3) {
                    f2077h = i3;
                }
                randomAccessFile.close();
            }
        } catch (Exception unused) {
        }
    }

    public final void p() {
        String str = h.f3402a + "/config.dat";
        byte[] bytes = String.format(Locale.CHINA, "{\"ver\":\"%d\",\"gps\":\"%.1f|%.1f|%.1f|%.1f|%d|%d|%d|%d|%d|%d|%d\",\"up\":\"%.1f|%.1f|%.1f|%.1f\",\"wf\":\"%d|%.1f|%d|%.1f\",\"ab\":\"%.2f|%.2f|%d|%d\",\"gpc\":\"%d|%d|%d|%d|%d|%d\",\"zxd\":\"%.1f|%.1f|%d|%d|%d\",\"shak\":\"%d|%d|%.1f\",\"dmx\":%d}", Integer.valueOf(i.f3445v), Float.valueOf(i.f3447w), Float.valueOf(i.f3449x), Float.valueOf(i.f3451y), Float.valueOf(i.f3453z), Integer.valueOf(i.A), Integer.valueOf(i.B), Integer.valueOf(i.C), Integer.valueOf(i.D), Integer.valueOf(i.E), Integer.valueOf(i.F), Integer.valueOf(i.G), Float.valueOf(i.H), Float.valueOf(i.I), Float.valueOf(i.J), Float.valueOf(i.K), Integer.valueOf(i.L), Float.valueOf(i.M), Integer.valueOf(i.N), Float.valueOf(i.O), Float.valueOf(i.P), Float.valueOf(i.Q), Integer.valueOf(i.R), Integer.valueOf(i.S), Integer.valueOf(i.W ? 1 : 0), Integer.valueOf(i.X ? 1 : 0), Integer.valueOf(i.Y), Integer.valueOf(i.Z), Long.valueOf(i.f3408c0), Integer.valueOf(i.f3414f0), Float.valueOf(i.f3422j0), Float.valueOf(i.f3424k0), Integer.valueOf(i.f3426l0), Integer.valueOf(i.f3428m0), Integer.valueOf(i.f3430n0), Integer.valueOf(i.f3416g0), Integer.valueOf(i.f3418h0), Float.valueOf(i.f3420i0), Integer.valueOf(i.f3412e0)).getBytes();
        try {
            File file = new File(str);
            if (!file.exists()) {
                File file2 = new File(h.f3402a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(0L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(0L);
            randomAccessFile2.writeBoolean(true);
            randomAccessFile2.seek(2L);
            randomAccessFile2.writeInt(bytes.length);
            randomAccessFile2.write(bytes);
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    public final void q() {
        byte[] bArr;
        try {
            File file = new File(h.f3402a + "/config.dat");
            if (!file.exists()) {
                File file2 = new File(h.f3402a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(0L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(1L);
            randomAccessFile2.writeBoolean(true);
            randomAccessFile2.seek(1024L);
            randomAccessFile2.writeDouble(i.f3435q);
            randomAccessFile2.writeDouble(i.f3437r);
            randomAccessFile2.writeBoolean(i.f3443u);
            if (i.f3443u && (bArr = i.f3441t) != null) {
                randomAccessFile2.write(bArr);
            }
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    public void r() {
        n();
    }

    public void s() {
    }
}
