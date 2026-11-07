package b;

import android.location.Location;
import android.net.wifi.ScanResult;
import com.baidu.location.Jni;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayList<String> f1865b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<String> f1866c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<String> f1867d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f1868e = n.h.f3402a + "/yo.dat";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f1869f = n.h.f3402a + "/yoh.dat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f1870g = n.h.f3402a + "/yom.dat";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f1871h = n.h.f3402a + "/yol.dat";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f1872i = n.h.f3402a + "/yor.dat";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static File f1873j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f1874k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f1875l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f1876m = 16;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f1877n = 2048;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f1878o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f1879p = 64;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f1880q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Location f1881r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Location f1882s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Location f1883t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static j.k f1884u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static y f1885v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f1886a;

    public class a extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f1887j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1888k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1889l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ArrayList<String> f1890m = new ArrayList<>();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f1891n = true;

        public a(y yVar) {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            Map<String, Object> map;
            StringBuilder sb;
            String str;
            if (this.f1888k != 1) {
                this.f3379a = n.i.L();
            }
            this.f3380b = 2;
            if (this.f1890m != null) {
                for (int i2 = 0; i2 < this.f1890m.size(); i2++) {
                    if (this.f1888k == 1) {
                        map = this.f3382d;
                        sb = new StringBuilder();
                        str = "cldc[";
                    } else {
                        map = this.f3382d;
                        sb = new StringBuilder();
                        str = "cltr[";
                    }
                    sb.append(str);
                    sb.append(i2);
                    sb.append("]");
                    map.put(sb.toString(), this.f1890m.get(i2));
                }
                this.f3382d.put("trtm", String.format(Locale.CHINA, "%d", Long.valueOf(System.currentTimeMillis())));
                if (this.f1888k != 1) {
                    this.f3382d.put("qt", "cltrg");
                }
            }
        }

        @Override // n.g
        public void h(boolean z2) {
            if (z2 && this.f3381c != null) {
                ArrayList<String> arrayList = this.f1890m;
                if (arrayList != null) {
                    arrayList.clear();
                }
                try {
                    JSONObject jSONObject = new JSONObject(this.f3381c);
                    if (jSONObject.has("ison") && jSONObject.getInt("ison") == 0) {
                        this.f1891n = false;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            Map<String, Object> map = this.f3382d;
            if (map != null) {
                map.clear();
            }
            this.f1887j = false;
        }

        public synchronized void i() {
            ExecutorService executorServiceC;
            String strL;
            String strL2;
            int i2;
            try {
                if (this.f1887j) {
                    return;
                }
                int i3 = n.g.f3378i;
                if (i3 > 4 && (i2 = this.f1889l) < i3) {
                    this.f1889l = i2 + 1;
                    return;
                }
                this.f1889l = 0;
                this.f1887j = true;
                this.f1888k = 0;
                try {
                    ArrayList<String> arrayList = this.f1890m;
                    if (arrayList == null || arrayList.size() < 1) {
                        if (this.f1890m == null) {
                            this.f1890m = new ArrayList<>();
                        }
                        this.f1888k = 0;
                        int length = 0;
                        while (true) {
                            String strC = null;
                            String strR = this.f1888k < 2 ? y.r() : null;
                            if (strR == null && this.f1888k != 1 && this.f1891n) {
                                this.f1888k = 2;
                                try {
                                    strC = k.c();
                                } catch (Exception unused) {
                                }
                            } else {
                                this.f1888k = 1;
                                strC = strR;
                            }
                            if (strC == null) {
                                break;
                            }
                            if (!strC.contains("err!")) {
                                this.f1890m.add(strC);
                                length += strC.length();
                                if (length >= n.a.f3343c) {
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList2 = this.f1890m;
                    if (arrayList2 == null || arrayList2.size() < 1) {
                        ArrayList<String> arrayList3 = this.f1890m;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        this.f1887j = false;
                        return;
                    }
                    if (this.f1888k != 1) {
                        executorServiceC = w.b().c();
                        if (executorServiceC != null) {
                            strL2 = n.i.L();
                            c(executorServiceC, strL2);
                        } else {
                            strL = n.i.L();
                            b(strL);
                        }
                    } else {
                        executorServiceC = w.b().c();
                        if (executorServiceC != null) {
                            strL2 = n.d.f3356b;
                            c(executorServiceC, strL2);
                        } else {
                            strL = n.d.f3356b;
                            b(strL);
                        }
                    }
                } catch (Exception unused2) {
                    ArrayList<String> arrayList4 = this.f1890m;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public y() {
        this.f1886a = null;
        this.f1886a = new a(this);
        String strC = n.i.C();
        if (strC != null) {
            f1868e = strC + "/yo2.dat";
            f1869f = strC + "/yoh2.dat";
            f1870g = strC + "/yom2.dat";
            f1871h = strC + "/yol2.dat";
            f1872i = strC + "/yor2.dat";
        }
    }

    public static synchronized int a(List<String> list, int i2) {
        if (list != null && i2 <= 256) {
            if (i2 >= 0) {
                try {
                    if (f1873j == null) {
                        File file = new File(f1868e);
                        f1873j = file;
                        if (!file.exists()) {
                            f1873j = null;
                            return -2;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(f1873j, "rw");
                    if (randomAccessFile.length() < 1) {
                        randomAccessFile.close();
                        return -3;
                    }
                    long j2 = i2;
                    randomAccessFile.seek(j2);
                    int i3 = randomAccessFile.readInt();
                    int i4 = randomAccessFile.readInt();
                    int i5 = randomAccessFile.readInt();
                    int i6 = randomAccessFile.readInt();
                    long j3 = randomAccessFile.readLong();
                    long j4 = j3;
                    if (g(i3, i4, i5, i6, j3)) {
                        int i7 = 1;
                        if (i4 >= 1) {
                            byte[] bArr = new byte[f1877n];
                            int i8 = f1874k;
                            while (i8 > 0 && i4 > 0) {
                                long j5 = (((i3 + i4) - i7) % i5) * i6;
                                byte[] bArr2 = bArr;
                                long j6 = j4;
                                randomAccessFile.seek(j5 + j6);
                                int i9 = randomAccessFile.readInt();
                                if (i9 > 0 && i9 < i6) {
                                    randomAccessFile.read(bArr2, 0, i9);
                                    int i10 = i9 - 1;
                                    if (bArr2[i10] == 0) {
                                        list.add(new String(bArr2, 0, i10));
                                    }
                                }
                                i8--;
                                i4--;
                                j4 = j6;
                                bArr = bArr2;
                                i7 = 1;
                            }
                            randomAccessFile.seek(j2);
                            randomAccessFile.writeInt(i3);
                            randomAccessFile.writeInt(i4);
                            randomAccessFile.writeInt(i5);
                            randomAccessFile.writeInt(i6);
                            randomAccessFile.writeLong(j4);
                            randomAccessFile.close();
                            return f1874k - i8;
                        }
                    }
                    randomAccessFile.close();
                    return -4;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return -5;
                }
            }
        }
        return -1;
    }

    public static String b(int i2) {
        String str;
        ArrayList<String> arrayList;
        String str2 = null;
        if (i2 == 1) {
            str = f1869f;
            arrayList = f1865b;
        } else if (i2 == 2) {
            str = f1870g;
            arrayList = f1866c;
        } else {
            if (i2 == 3) {
                str = f1871h;
            } else {
                if (i2 != 4) {
                    return null;
                }
                str = f1872i;
            }
            arrayList = f1867d;
        }
        if (arrayList == null) {
            return null;
        }
        if (arrayList.size() < 1) {
            k(str, arrayList);
        }
        synchronized (y.class) {
            int size = arrayList.size();
            if (size > 0) {
                int i3 = size - 1;
                try {
                    String str3 = arrayList.get(i3);
                    try {
                        arrayList.remove(i3);
                    } catch (Exception unused) {
                    }
                    str2 = str3;
                } catch (Exception unused2) {
                }
            }
        }
        return str2;
    }

    public static void c() {
        f1875l = 0;
        d(1, false);
        d(2, false);
        d(3, false);
        f1875l = 8;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x005e A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:24:0x0033, B:25:0x0057, B:28:0x005e, B:30:0x0062, B:35:0x00c4, B:32:0x0093, B:37:0x00c8, B:40:0x00dd), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:24:0x0033, B:25:0x0057, B:28:0x005e, B:30:0x0062, B:35:0x00c4, B:32:0x0093, B:37:0x00c8, B:40:0x00dd), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:24:0x0033, B:25:0x0057, B:28:0x005e, B:30:0x0062, B:35:0x00c4, B:32:0x0093, B:37:0x00c8, B:40:0x00dd), top: B:43:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8 A[EDGE_INSN: B:45:0x00c8->B:37:0x00c8 BREAK  A[LOOP:0: B:25:0x0057->B:35:0x00c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0062, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0093, please report this as an issue */
    public static void d(int i2, boolean z2) {
        String str;
        ArrayList<String> arrayList;
        File file;
        RandomAccessFile randomAccessFile;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size;
        boolean z3;
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    str = f1870g;
                    if (z2) {
                    }
                    file = new File(str);
                    if (!file.exists()) {
                        f(str);
                    }
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.seek(4L);
                    i3 = randomAccessFile.readInt();
                    i4 = randomAccessFile.readInt();
                    i5 = randomAccessFile.readInt();
                    i6 = randomAccessFile.readInt();
                    i7 = randomAccessFile.readInt();
                    size = arrayList.size();
                    while (true) {
                        z3 = false;
                        if (size <= f1875l) {
                            break;
                        }
                        if (z2) {
                            i7++;
                        }
                        if (i5 >= i3) {
                            if (!z2) {
                                z3 = true;
                                break;
                            }
                            randomAccessFile.seek((i6 * i4) + 128);
                            byte[] bytes = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes.length);
                            randomAccessFile.write(bytes, 0, bytes.length);
                            arrayList.remove(0);
                            i6++;
                            if (i6 > i5) {
                                i6 = 0;
                            }
                        } else {
                            randomAccessFile.seek((i4 * i5) + 128);
                            byte[] bytes2 = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes2.length);
                            randomAccessFile.write(bytes2, 0, bytes2.length);
                            arrayList.remove(0);
                            i5++;
                        }
                        size--;
                    }
                    randomAccessFile.seek(12L);
                    randomAccessFile.writeInt(i5);
                    randomAccessFile.writeInt(i6);
                    randomAccessFile.writeInt(i7);
                    randomAccessFile.close();
                    if (z3 || i2 >= 4) {
                        return;
                    }
                    d(i2 + 1, true);
                    return;
                }
                if (i2 == 3) {
                    str = f1871h;
                    if (z2) {
                    }
                    file = new File(str);
                    if (!file.exists()) {
                        f(str);
                    }
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.seek(4L);
                    i3 = randomAccessFile.readInt();
                    i4 = randomAccessFile.readInt();
                    i5 = randomAccessFile.readInt();
                    i6 = randomAccessFile.readInt();
                    i7 = randomAccessFile.readInt();
                    size = arrayList.size();
                    while (true) {
                        z3 = false;
                        if (size <= f1875l) {
                            break;
                            break;
                        }
                        if (z2) {
                            i7++;
                        }
                        if (i5 >= i3) {
                            if (!z2) {
                                z3 = true;
                                break;
                            }
                            randomAccessFile.seek((i6 * i4) + 128);
                            byte[] bytes3 = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes3.length);
                            randomAccessFile.write(bytes3, 0, bytes3.length);
                            arrayList.remove(0);
                            i6++;
                            if (i6 > i5) {
                                i6 = 0;
                            }
                        } else {
                            randomAccessFile.seek((i4 * i5) + 128);
                            byte[] bytes4 = (arrayList.get(0) + (char) 0).getBytes();
                            randomAccessFile.writeInt(bytes4.length);
                            randomAccessFile.write(bytes4, 0, bytes4.length);
                            arrayList.remove(0);
                            i5++;
                        }
                        size--;
                    }
                    randomAccessFile.seek(12L);
                    randomAccessFile.writeInt(i5);
                    randomAccessFile.writeInt(i6);
                    randomAccessFile.writeInt(i7);
                    randomAccessFile.close();
                    if (z3) {
                        return;
                    } else {
                        return;
                    }
                }
                if (i2 != 4) {
                    return;
                }
                str = f1872i;
                if (!z2) {
                    return;
                }
                arrayList = f1867d;
                file = new File(str);
                if (!file.exists()) {
                    f(str);
                }
                randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(4L);
                i3 = randomAccessFile.readInt();
                i4 = randomAccessFile.readInt();
                i5 = randomAccessFile.readInt();
                i6 = randomAccessFile.readInt();
                i7 = randomAccessFile.readInt();
                size = arrayList.size();
                while (true) {
                    z3 = false;
                    if (size <= f1875l) {
                        break;
                        break;
                    }
                    if (z2) {
                        i7++;
                    }
                    if (i5 >= i3) {
                        if (!z2) {
                            z3 = true;
                            break;
                        }
                        randomAccessFile.seek((i6 * i4) + 128);
                        byte[] bytes5 = (arrayList.get(0) + (char) 0).getBytes();
                        randomAccessFile.writeInt(bytes5.length);
                        randomAccessFile.write(bytes5, 0, bytes5.length);
                        arrayList.remove(0);
                        i6++;
                        if (i6 > i5) {
                            i6 = 0;
                        }
                    } else {
                        randomAccessFile.seek((i4 * i5) + 128);
                        byte[] bytes6 = (arrayList.get(0) + (char) 0).getBytes();
                        randomAccessFile.writeInt(bytes6.length);
                        randomAccessFile.write(bytes6, 0, bytes6.length);
                        arrayList.remove(0);
                        i5++;
                    }
                    size--;
                }
                randomAccessFile.seek(12L);
                randomAccessFile.writeInt(i5);
                randomAccessFile.writeInt(i6);
                randomAccessFile.writeInt(i7);
                randomAccessFile.close();
                if (z3) {
                    return;
                } else {
                    return;
                }
                arrayList = f1866c;
                file = new File(str);
                if (!file.exists()) {
                    f(str);
                }
                randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(4L);
                i3 = randomAccessFile.readInt();
                i4 = randomAccessFile.readInt();
                i5 = randomAccessFile.readInt();
                i6 = randomAccessFile.readInt();
                i7 = randomAccessFile.readInt();
                size = arrayList.size();
                while (true) {
                    z3 = false;
                    if (size <= f1875l) {
                        break;
                        break;
                    }
                    if (z2) {
                        i7++;
                    }
                    if (i5 >= i3) {
                        if (!z2) {
                            z3 = true;
                            break;
                        }
                        randomAccessFile.seek((i6 * i4) + 128);
                        byte[] bytes7 = (arrayList.get(0) + (char) 0).getBytes();
                        randomAccessFile.writeInt(bytes7.length);
                        randomAccessFile.write(bytes7, 0, bytes7.length);
                        arrayList.remove(0);
                        i6++;
                        if (i6 > i5) {
                            i6 = 0;
                        }
                    } else {
                        randomAccessFile.seek((i4 * i5) + 128);
                        byte[] bytes8 = (arrayList.get(0) + (char) 0).getBytes();
                        randomAccessFile.writeInt(bytes8.length);
                        randomAccessFile.write(bytes8, 0, bytes8.length);
                        arrayList.remove(0);
                        i5++;
                    }
                    size--;
                }
                randomAccessFile.seek(12L);
                randomAccessFile.writeInt(i5);
                randomAccessFile.writeInt(i6);
                randomAccessFile.writeInt(i7);
                randomAccessFile.close();
                if (z3) {
                    return;
                } else {
                    return;
                }
            }
            str = f1869f;
            if (z2) {
                return;
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(4L);
            i3 = randomAccessFile.readInt();
            i4 = randomAccessFile.readInt();
            i5 = randomAccessFile.readInt();
            i6 = randomAccessFile.readInt();
            i7 = randomAccessFile.readInt();
            size = arrayList.size();
            while (true) {
                z3 = false;
                if (size <= f1875l) {
                    break;
                    break;
                }
                if (z2) {
                    i7++;
                }
                if (i5 >= i3) {
                    if (!z2) {
                        z3 = true;
                        break;
                    }
                    randomAccessFile.seek((i6 * i4) + 128);
                    byte[] bytes9 = (arrayList.get(0) + (char) 0).getBytes();
                    randomAccessFile.writeInt(bytes9.length);
                    randomAccessFile.write(bytes9, 0, bytes9.length);
                    arrayList.remove(0);
                    i6++;
                    if (i6 > i5) {
                        i6 = 0;
                    }
                } else {
                    randomAccessFile.seek((i4 * i5) + 128);
                    byte[] bytes10 = (arrayList.get(0) + (char) 0).getBytes();
                    randomAccessFile.writeInt(bytes10.length);
                    randomAccessFile.write(bytes10, 0, bytes10.length);
                    arrayList.remove(0);
                    i5++;
                }
                size--;
            }
            randomAccessFile.seek(12L);
            randomAccessFile.writeInt(i5);
            randomAccessFile.writeInt(i6);
            randomAccessFile.writeInt(i7);
            randomAccessFile.close();
            if (z3) {
                return;
            } else {
                return;
            }
        } catch (Exception unused) {
            return;
        }
        arrayList = f1865b;
        file = new File(str);
        if (!file.exists()) {
            f(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0184  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0201  */
    /* JADX WARN: Code duplicated, block: B:96:0x020c  */
    public static void e(j.a aVar, j.k kVar, Location location, String str, String str2) {
        String string;
        StringBuilder sb;
        String str3;
        StringBuilder sb2;
        String str4;
        int i2;
        if (c.d.i().f2080c) {
            if ((n.i.f3439s == 3 && !i(location, kVar) && !j(location, false)) || aVar == null || aVar.c()) {
                return;
            }
            b1.c cVarC = i.d.n().c(aVar, kVar, null, n.i.J(com.baidu.location.f.c()) ? i.d.c.IS_MIX_MODE : i.d.c.IS_NOT_MIX_MODE, i.d.b.NO_NEED_TO_LOG);
            if (cVarC == null || cVarC.v() == 67) {
                string = str + String.format(Locale.CHINA, "&ofl=%s|0", "1");
            } else {
                String strZ = cVarC.z() != null ? cVarC.z() : null;
                if (strZ == null || !strZ.equals("cl")) {
                    i2 = (strZ == null || !strZ.equals("wf")) ? 0 : 2;
                } else {
                    i2 = 1;
                }
                string = str + String.format(Locale.CHINA, "&ofl=%s|%d|%f|%f|%d", "1", Integer.valueOf(i2), Double.valueOf(cVarC.x()), Double.valueOf(cVarC.u()), Integer.valueOf((int) cVarC.E()));
            }
            if (aVar.a()) {
                if (!i(location, kVar)) {
                    kVar = null;
                }
                String str5 = n.i.h(aVar, kVar, location, string, 1) + str2;
                if (str5 != null) {
                    m(Jni.j(str5));
                    f1882s = location;
                    f1881r = location;
                    if (kVar != null) {
                        f1884u = kVar;
                        return;
                    }
                    return;
                }
                return;
            }
            if (kVar != null && kVar.a() && i(location, kVar)) {
                if (h(location) || j.f.M().W()) {
                    if (!h(location) && j.f.M().W()) {
                        string = "&cfr=3" + string;
                    } else if (j.f.M().W()) {
                        sb2 = new StringBuilder();
                        sb2.append("&cfr=2");
                    }
                    str4 = n.i.h(aVar, kVar, location, string, 2) + str2;
                    if (str4 != null) {
                        q(Jni.j(str4));
                        f1883t = location;
                        f1881r = location;
                        f1884u = kVar;
                        return;
                    }
                    return;
                }
                sb2 = new StringBuilder();
                sb2.append("&cfr=1");
                sb2.append(string);
                string = sb2.toString();
                str4 = n.i.h(aVar, kVar, location, string, 2) + str2;
                if (str4 != null) {
                    q(Jni.j(str4));
                    f1883t = location;
                    f1881r = location;
                    f1884u = kVar;
                    return;
                }
                return;
            }
            if (h(location) || j.f.M().W()) {
                if (!h(location) && j.f.M().W()) {
                    string = "&cfr=3" + string;
                } else if (j.f.M().W()) {
                    sb = new StringBuilder();
                    sb.append("&cfr=2");
                }
                if (!i(location, kVar)) {
                    kVar = null;
                }
                str3 = n.i.h(aVar, kVar, location, string, 3) + str2;
                if (str3 != null) {
                    o(Jni.j(str3));
                    f1881r = location;
                    if (kVar != null) {
                        f1884u = kVar;
                    }
                }
            }
            sb = new StringBuilder();
            sb.append("&cfr=1");
            sb.append(string);
            string = sb.toString();
            if (!i(location, kVar)) {
                kVar = null;
            }
            str3 = n.i.h(aVar, kVar, location, string, 3) + str2;
            if (str3 != null) {
                o(Jni.j(str3));
                f1881r = location;
                if (kVar != null) {
                    f1884u = kVar;
                }
            }
        }
    }

    public static void f(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return;
            }
            File file2 = new File(n.h.f3402a);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (!file.createNewFile()) {
                file = null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(32);
            randomAccessFile.writeInt(2048);
            randomAccessFile.writeInt(5120);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public static boolean g(int i2, int i3, int i4, int i5, long j2) {
        return i2 >= 0 && i2 < i4 && i3 >= 0 && i3 <= i4 && i4 >= 0 && i4 <= 1024 && i5 >= 128 && i5 <= 1024;
    }

    public static boolean h(Location location) {
        if (location == null) {
            return false;
        }
        Location location2 = f1882s;
        if (location2 == null || f1881r == null) {
            f1882s = location;
            return true;
        }
        double dDistanceTo = location.distanceTo(location2);
        return ((double) location.distanceTo(f1881r)) > (((((double) n.i.P) * dDistanceTo) * dDistanceTo) + (((double) n.i.Q) * dDistanceTo)) + ((double) n.i.R);
    }

    public static boolean i(Location location, j.k kVar) {
        List<ScanResult> list;
        boolean z2 = false;
        if (location != null && kVar != null && (list = kVar.f3019a) != null && !list.isEmpty()) {
            if (kVar.b(f1884u)) {
                return false;
            }
            z2 = true;
            if (f1883t == null) {
                f1883t = location;
            }
        }
        return z2;
    }

    public static boolean j(Location location, boolean z2) {
        return j.d.w(f1881r, location, z2);
    }

    public static boolean k(String str, List<String> list) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(8L);
            int i2 = randomAccessFile.readInt();
            int i3 = randomAccessFile.readInt();
            int i4 = randomAccessFile.readInt();
            byte[] bArr = new byte[f1877n];
            int i5 = f1875l + 1;
            boolean z2 = false;
            while (i5 > 0 && i3 > 0) {
                if (i3 < i4) {
                    i4 = 0;
                }
                try {
                    randomAccessFile.seek(((i3 - 1) * i2) + 128);
                    int i6 = randomAccessFile.readInt();
                    if (i6 > 0 && i6 < i2) {
                        randomAccessFile.read(bArr, 0, i6);
                        int i7 = i6 - 1;
                        if (bArr[i7] == 0) {
                            list.add(0, new String(bArr, 0, i7));
                            z2 = true;
                        }
                    }
                    i5--;
                    i3--;
                } catch (Exception unused) {
                    return z2;
                }
            }
            randomAccessFile.seek(12L);
            randomAccessFile.writeInt(i3);
            randomAccessFile.writeInt(i4);
            randomAccessFile.close();
            return z2;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static synchronized y l() {
        if (f1885v == null) {
            f1885v = new y();
        }
        return f1885v;
    }

    public static void m(String str) {
        s(str);
    }

    public static String n() {
        File file = new File(f1870g);
        String str = null;
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(20L);
                int i2 = randomAccessFile.readInt();
                if (i2 > 128) {
                    String str2 = "&p1=" + i2;
                    try {
                        randomAccessFile.seek(20L);
                        randomAccessFile.writeInt(0);
                        randomAccessFile.close();
                        return str2;
                    } catch (Exception unused) {
                        str = str2;
                    }
                } else {
                    randomAccessFile.close();
                }
            } catch (Exception unused2) {
            }
        }
        File file2 = new File(f1871h);
        if (file2.exists()) {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                randomAccessFile2.seek(20L);
                int i3 = randomAccessFile2.readInt();
                if (i3 > 256) {
                    String str3 = "&p2=" + i3;
                    try {
                        randomAccessFile2.seek(20L);
                        randomAccessFile2.writeInt(0);
                        randomAccessFile2.close();
                        return str3;
                    } catch (Exception unused3) {
                        str = str3;
                    }
                } else {
                    randomAccessFile2.close();
                }
            } catch (Exception unused4) {
            }
        }
        File file3 = new File(f1872i);
        if (file3.exists()) {
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file3, "rw");
                randomAccessFile3.seek(20L);
                int i4 = randomAccessFile3.readInt();
                if (i4 > 512) {
                    String str4 = "&p3=" + i4;
                    try {
                        randomAccessFile3.seek(20L);
                        randomAccessFile3.writeInt(0);
                        randomAccessFile3.close();
                        return str4;
                    } catch (Exception unused5) {
                        str = str4;
                    }
                } else {
                    randomAccessFile3.close();
                }
            } catch (Exception unused6) {
            }
        }
        return str;
    }

    public static void o(String str) {
        s(str);
    }

    public static String p() {
        String strB = null;
        for (int i2 = 1; i2 < 5; i2++) {
            strB = b(i2);
            if (strB != null) {
                return strB;
            }
        }
        a(f1867d, f1879p);
        try {
            if (f1867d.size() > 0) {
                String str = f1867d.get(0);
                try {
                    f1867d.remove(0);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                strB = str;
            }
        } catch (ArrayIndexOutOfBoundsException unused2) {
        }
        if (strB != null) {
            return strB;
        }
        a(f1867d, f1878o);
        try {
            if (f1867d.size() > 0) {
                String str2 = f1867d.get(0);
                try {
                    f1867d.remove(0);
                } catch (ArrayIndexOutOfBoundsException unused3) {
                }
                strB = str2;
            }
        } catch (ArrayIndexOutOfBoundsException unused4) {
        }
        if (strB != null) {
            return strB;
        }
        a(f1867d, f1880q);
        try {
            if (f1867d.size() <= 0) {
                return strB;
            }
            String str3 = f1867d.get(0);
            try {
                f1867d.remove(0);
            } catch (ArrayIndexOutOfBoundsException unused5) {
            }
            return str3;
        } catch (ArrayIndexOutOfBoundsException unused6) {
            return strB;
        }
    }

    public static void q(String str) {
        s(str);
    }

    public static String r() {
        return p();
    }

    public static synchronized void s(String str) {
        ArrayList<String> arrayList;
        if (str.contains("err!")) {
            return;
        }
        int i2 = n.i.f3429n;
        if (i2 == 1) {
            arrayList = f1865b;
        } else if (i2 == 2) {
            arrayList = f1866c;
        } else if (i2 != 3) {
            return;
        } else {
            arrayList = f1867d;
        }
        if (arrayList == null) {
            return;
        }
        if (arrayList.size() <= f1876m) {
            arrayList.add(str);
        }
        if (arrayList.size() >= f1876m) {
            d(i2, false);
        }
        while (arrayList.size() > f1876m) {
            arrayList.remove(0);
        }
    }

    public void t() {
        if (j.f.M().Y() && !n.i.N()) {
            this.f1886a.i();
        }
    }
}
