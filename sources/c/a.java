package c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import b.w;
import com.baidu.location.Jni;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import n.g;
import n.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f2044h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f2047a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2048b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0017a f2049c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f2051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f2052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object f2043g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f2045i = i.y() + "/gal.db";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Lock f2046j = new ReentrantLock();

    /* JADX INFO: renamed from: c.a$a, reason: collision with other inner class name */
    public class C0017a extends g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2053j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2054k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f2055l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2056m;

        public C0017a() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            Map<String, Object> map;
            String str;
            this.f3379a = "https://loc.map.baidu.com/gpsz";
            String str2 = String.format(Locale.CHINESE, "&is_vdr=1&x=%d&y=%d%s", Integer.valueOf(this.f2053j), Integer.valueOf(this.f2054k), n.b.g().a());
            String strF = Jni.f(str2);
            if (strF.contains("err!")) {
                try {
                    strF = new String(Base64.encode(str2.getBytes(), 0), "UTF-8");
                } catch (Exception unused) {
                    strF = "err2!";
                }
                map = this.f3382d;
                str = "gpszb";
            } else {
                map = this.f3382d;
                str = "gpsz";
            }
            map.put(str, strF);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0123 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:33:0x0104, B:35:0x0123), top: B:78:0x0104 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0155  */
        /* JADX WARN: Code duplicated, block: B:89:0x012f A[SYNTHETIC] */
        @Override // n.g
        public void h(boolean z2) {
            String str;
            String str2;
            String str3;
            String[] strArr;
            Double dValueOf;
            String str4;
            String str5 = "locStateData";
            String str6 = ":";
            String str7 = "info";
            if (z2 && this.f3381c != null) {
                a.f2046j.lock();
                try {
                    JSONObject jSONObject = new JSONObject(this.f3381c);
                    String str8 = "E";
                    String str9 = ",";
                    if (jSONObject.has("height")) {
                        String string = jSONObject.getString("height");
                        if (string.contains(",")) {
                            String[] strArrSplit = string.trim().split(",");
                            int length = strArrSplit.length;
                            int iSqrt = (int) Math.sqrt(length);
                            if (iSqrt * iSqrt == length) {
                                int i2 = iSqrt - 1;
                                int i3 = this.f2055l - (i2 / 2);
                                int i4 = this.f2056m - (i2 / 2);
                                for (int i5 = 0; i5 < iSqrt; i5++) {
                                    int i6 = 0;
                                    while (i6 < iSqrt) {
                                        String str10 = str9;
                                        ContentValues contentValues = new ContentValues();
                                        int i7 = (i5 * iSqrt) + i6;
                                        int i8 = iSqrt;
                                        String str11 = str8;
                                        String str12 = str7;
                                        try {
                                            if (strArrSplit[i7].contains(str8)) {
                                                contentValues.put("aldata", Double.valueOf(10000.0d));
                                            } else {
                                                if (strArrSplit[i7].contains(str6)) {
                                                    String[] strArrSplit2 = strArrSplit[i7].split(str6);
                                                    str3 = str6;
                                                    strArr = strArrSplit;
                                                    if (strArrSplit2.length == 2) {
                                                        contentValues.put("aldata", Double.valueOf(strArrSplit2[0]));
                                                        contentValues.put("sigma", strArrSplit2[1]);
                                                    } else {
                                                        contentValues.put("aldata", Double.valueOf(10000.0d));
                                                        dValueOf = Double.valueOf(10000.0d);
                                                        contentValues.put("sigma", dValueOf);
                                                    }
                                                } else {
                                                    contentValues.put("aldata", Double.valueOf(strArrSplit[i7]));
                                                }
                                                contentValues.put("tt", Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                                                str4 = String.format(Locale.CHINESE, "%d,%d", Integer.valueOf(i3 + i6), Integer.valueOf(i4 + i5));
                                                if (a.this.f2047a.update("galdata_new", contentValues, "id = \"" + str4 + "\"", null) <= 0) {
                                                    contentValues.put("id", str4);
                                                    a.this.f2047a.insert("galdata_new", null, contentValues);
                                                }
                                                i6++;
                                                str9 = str10;
                                                str6 = str3;
                                                iSqrt = i8;
                                                str8 = str11;
                                                str7 = str12;
                                                strArrSplit = strArr;
                                            }
                                            if (a.this.f2047a.update("galdata_new", contentValues, "id = \"" + str4 + "\"", null) <= 0) {
                                                contentValues.put("id", str4);
                                                a.this.f2047a.insert("galdata_new", null, contentValues);
                                            }
                                        } catch (Exception unused) {
                                        }
                                        dValueOf = Double.valueOf(10000.0d);
                                        str3 = str6;
                                        strArr = strArrSplit;
                                        contentValues.put("sigma", dValueOf);
                                        contentValues.put("tt", Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                                        str4 = String.format(Locale.CHINESE, "%d,%d", Integer.valueOf(i3 + i6), Integer.valueOf(i4 + i5));
                                        i6++;
                                        str9 = str10;
                                        str6 = str3;
                                        iSqrt = i8;
                                        str8 = str11;
                                        str7 = str12;
                                        strArrSplit = strArr;
                                    }
                                }
                            }
                            str = str7;
                        } else {
                            str5 = "locStateData";
                            str = "info";
                        }
                    } else {
                        str5 = "locStateData";
                        str = "info";
                    }
                    String str13 = str8;
                    String str14 = str9;
                    String str15 = str;
                    if (jSONObject.has(str15)) {
                        String string2 = jSONObject.getString(str15);
                        if (string2.contains(str14)) {
                            String[] strArrSplit3 = string2.trim().split(str14);
                            int length2 = strArrSplit3.length;
                            int iSqrt2 = (int) Math.sqrt(length2);
                            if (iSqrt2 * iSqrt2 == length2) {
                                int i9 = iSqrt2 - 1;
                                int i10 = this.f2055l - (i9 / 2);
                                int i11 = this.f2056m - (i9 / 2);
                                int i12 = 0;
                                while (i12 < iSqrt2) {
                                    int i13 = 0;
                                    while (i13 < iSqrt2) {
                                        ContentValues contentValues2 = new ContentValues();
                                        int i14 = (i12 * iSqrt2) + i13;
                                        String str16 = str13;
                                        contentValues2.put("state", strArrSplit3[i14].contains(str16) ? -1 : Integer.valueOf(Integer.valueOf(strArrSplit3[i14]).intValue()));
                                        String[] strArr2 = strArrSplit3;
                                        int i15 = i10;
                                        String str17 = String.format(Locale.CHINESE, "%d,%d", Integer.valueOf(i10 + i13), Integer.valueOf(i11 + i12));
                                        try {
                                            str2 = str5;
                                            try {
                                                if (a.this.f2047a.update(str2, contentValues2, "id = \"" + str17 + "\"", null) <= 0) {
                                                    contentValues2.put("id", str17);
                                                    a.this.f2047a.insert(str2, null, contentValues2);
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        } catch (Exception unused3) {
                                            str2 = str5;
                                        }
                                        i13++;
                                        str13 = str16;
                                        str5 = str2;
                                        strArrSplit3 = strArr2;
                                        i10 = i15;
                                    }
                                    i12++;
                                    strArrSplit3 = strArrSplit3;
                                }
                            }
                        }
                    }
                } catch (Exception unused4) {
                }
                a.f2046j.unlock();
            }
            Map<String, Object> map = this.f3382d;
            if (map != null) {
                map.clear();
            }
            a.this.f2048b = false;
        }

        public void i(double d2, double d3, double d4) {
            if (a.this.f2048b) {
                return;
            }
            double[] dArrD = Jni.d(d2, d3, "gcj2wgs");
            this.f2053j = (int) Math.floor(dArrD[0] * 100.0d);
            this.f2054k = (int) Math.floor(dArrD[1] * 100.0d);
            this.f2055l = (int) Math.floor(d2 * 100.0d);
            this.f2056m = (int) Math.floor(d3 * 100.0d);
            a.this.f2048b = true;
            if (i.N()) {
                return;
            }
            ExecutorService executorServiceC = w.b().c();
            if (executorServiceC != null) {
                c(executorServiceC, "https://loc.map.baidu.com/gpsz");
            } else {
                b("https://loc.map.baidu.com/gpsz");
            }
        }
    }

    public a() {
        new HashMap();
        this.f2050d = null;
        this.f2051e = Double.MAX_VALUE;
        this.f2052f = Double.MAX_VALUE;
    }

    public static a g() {
        a aVar;
        synchronized (f2043g) {
            if (f2044h == null) {
                f2044h = new a();
            }
            aVar = f2044h;
        }
        return aVar;
    }

    public int a(b1.c cVar) {
        float fE;
        double dE;
        if (cVar != null) {
            fE = cVar.E();
            dE = cVar.e();
        } else {
            fE = 0.0f;
            dE = 0.0d;
        }
        if (this.f2047a == null || fE <= 0.0f || dE <= 0.0d || cVar == null) {
            return 0;
        }
        double d2 = f(cVar.x(), cVar.u())[0];
        if (d2 == Double.MAX_VALUE) {
            return 0;
        }
        double dK = Jni.k(fE, dE, d2);
        if (dK > 50.0d) {
            return 3;
        }
        return dK > 20.0d ? 2 : 1;
    }

    public final void d(double d2, double d3, double d4) {
        if (this.f2049c == null) {
            this.f2049c = new C0017a();
        }
        this.f2049c.i(d2, d3, d4);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[Catch: all -> 0x0103, Exception -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0103, blocks: (B:34:0x00c2, B:36:0x00c9, B:47:0x00eb, B:49:0x00ef), top: B:85:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    public double[] f(double d2, double d3) throws Throwable {
        double d4;
        double d5;
        double d6;
        Cursor cursor;
        double d7;
        double[] dArr = new double[2];
        double d8 = Double.MAX_VALUE;
        if (this.f2047a != null && d2 > 0.1d && d3 > 0.1d) {
            String str = String.format(Locale.CHINESE, "%d,%d", Integer.valueOf((int) Math.floor(d2 * 100.0d)), Integer.valueOf((int) Math.floor(100.0d * d3)));
            String str2 = this.f2050d;
            if (str2 == null || !str2.equals(str)) {
                f2046j.lock();
                Cursor cursor2 = null;
                try {
                    Cursor cursorRawQuery = this.f2047a.rawQuery("select * from galdata_new where id = \"" + str + "\";", null);
                    try {
                        if (cursorRawQuery != null) {
                            try {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        double d9 = cursorRawQuery.getDouble(1);
                                        try {
                                            d6 = cursorRawQuery.getDouble(2);
                                            try {
                                                int i2 = cursorRawQuery.getInt(3);
                                                if (d9 == 10000.0d) {
                                                    d9 = Double.MAX_VALUE;
                                                }
                                                d8 = d6 > 0.0d ? d6 : Double.MAX_VALUE;
                                                try {
                                                    long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - ((long) i2);
                                                    if (this.f2048b || jCurrentTimeMillis <= 604800) {
                                                        d7 = d9;
                                                        cursorRawQuery = cursorRawQuery;
                                                    } else {
                                                        d7 = d9;
                                                        cursorRawQuery = cursorRawQuery;
                                                        try {
                                                            d(d2, d3, 9.520999908447266d);
                                                        } catch (Exception unused) {
                                                            d6 = d8;
                                                            cursor2 = cursorRawQuery;
                                                            d8 = d7;
                                                            if (cursor2 != null) {
                                                                cursor = cursor2;
                                                                d4 = d6;
                                                            } else {
                                                                d4 = d6;
                                                            }
                                                            f2046j.unlock();
                                                            d5 = 10000.0d;
                                                            if (d8 > d5) {
                                                                dArr[0] = d5;
                                                            } else {
                                                                dArr[0] = d8;
                                                            }
                                                            if (d4 > d5) {
                                                                dArr[1] = d5;
                                                            } else {
                                                                dArr[1] = d4;
                                                            }
                                                            return dArr;
                                                        }
                                                    }
                                                    this.f2050d = str;
                                                    this.f2051e = d7;
                                                    this.f2052f = d8;
                                                    d4 = d8;
                                                    d8 = d7;
                                                } catch (Exception unused2) {
                                                    d7 = d9;
                                                    cursorRawQuery = cursorRawQuery;
                                                }
                                            } catch (Exception unused3) {
                                                d8 = d9;
                                                cursor2 = cursorRawQuery;
                                                if (cursor2 != null) {
                                                    cursor = cursor2;
                                                    d4 = d6;
                                                    try {
                                                        cursor.close();
                                                    } catch (Exception unused4) {
                                                    }
                                                } else {
                                                    d4 = d6;
                                                }
                                                f2046j.unlock();
                                                d5 = 10000.0d;
                                                if (d8 > d5) {
                                                    dArr[0] = d5;
                                                } else {
                                                    dArr[0] = d8;
                                                }
                                                if (d4 > d5) {
                                                    dArr[1] = d5;
                                                } else {
                                                    dArr[1] = d4;
                                                }
                                                return dArr;
                                            }
                                        } catch (Exception unused5) {
                                            d6 = Double.MAX_VALUE;
                                        }
                                    } else {
                                        cursorRawQuery = cursorRawQuery;
                                        try {
                                            if (!this.f2048b) {
                                                d(d2, d3, 9.520999908447266d);
                                            }
                                            d4 = Double.MAX_VALUE;
                                        } catch (Exception unused6) {
                                            d6 = Double.MAX_VALUE;
                                            cursor2 = cursorRawQuery;
                                            if (cursor2 != null) {
                                                cursor = cursor2;
                                                d4 = d6;
                                            } else {
                                                d4 = d6;
                                            }
                                            f2046j.unlock();
                                            d5 = 10000.0d;
                                            if (d8 > d5) {
                                                dArr[0] = d5;
                                            } else {
                                                dArr[0] = d8;
                                            }
                                            if (d4 > d5) {
                                                dArr[1] = d5;
                                            } else {
                                                dArr[1] = d4;
                                            }
                                            return dArr;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursorRawQuery;
                                    if (cursor2 != null) {
                                        try {
                                            cursor2.close();
                                        } catch (Exception unused7) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception unused8) {
                                cursorRawQuery = cursorRawQuery;
                                d6 = Double.MAX_VALUE;
                                cursor2 = cursorRawQuery;
                                if (cursor2 != null) {
                                    cursor = cursor2;
                                    d4 = d6;
                                    cursor.close();
                                } else {
                                    d4 = d6;
                                }
                                f2046j.unlock();
                                d5 = 10000.0d;
                                if (d8 > d5) {
                                    dArr[0] = d5;
                                } else {
                                    dArr[0] = d8;
                                }
                                if (d4 > d5) {
                                    dArr[1] = d5;
                                } else {
                                    dArr[1] = d4;
                                }
                                return dArr;
                            }
                        } else {
                            cursorRawQuery = cursorRawQuery;
                            if (!this.f2048b) {
                                d(d2, d3, 9.520999908447266d);
                            }
                            d4 = Double.MAX_VALUE;
                        }
                        if (cursorRawQuery != null) {
                            cursor = cursorRawQuery;
                            cursor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused9) {
                    d6 = Double.MAX_VALUE;
                } catch (Throwable th3) {
                    th = th3;
                }
                f2046j.unlock();
            } else {
                d8 = this.f2051e;
                d4 = this.f2052f;
                d5 = 10000.0d;
            }
            if (d8 > d5) {
                dArr[0] = d5;
            } else {
                dArr[0] = d8;
            }
            if (d4 > d5) {
                dArr[1] = d5;
            } else {
                dArr[1] = d4;
            }
            return dArr;
        }
        d4 = Double.MAX_VALUE;
        d5 = 10000.0d;
        if (d8 > d5) {
            dArr[0] = d5;
        } else {
            dArr[0] = d8;
        }
        if (d4 > d5) {
            dArr[1] = d5;
        } else {
            dArr[1] = d4;
        }
        return dArr;
    }

    public void i() {
        SQLiteDatabase sQLiteDatabase;
        String str;
        try {
            File file = new File(f2045i);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                this.f2047a = sQLiteDatabaseOpenOrCreateDatabase;
                Cursor cursorRawQuery = sQLiteDatabaseOpenOrCreateDatabase.rawQuery("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='galdata'", null);
                if (cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery.getInt(0) == 0) {
                        sQLiteDatabase = this.f2047a;
                        str = "CREATE TABLE IF NOT EXISTS galdata_new(id CHAR(40) PRIMARY KEY,aldata DOUBLE, sigma DOUBLE,tt INT);";
                    } else {
                        this.f2047a.execSQL("DROP TABLE galdata");
                        sQLiteDatabase = this.f2047a;
                        str = "CREATE TABLE galdata_new(id CHAR(40) PRIMARY KEY,aldata DOUBLE, sigma DOUBLE,tt INT);";
                    }
                    sQLiteDatabase.execSQL(str);
                    this.f2047a.execSQL("CREATE TABLE IF NOT EXISTS locStateData(id CHAR(40) PRIMARY KEY,state INT);");
                }
                this.f2047a.setVersion(1);
                cursorRawQuery.close();
            }
        } catch (Exception unused) {
            this.f2047a = null;
        }
    }

    public void j() {
        SQLiteDatabase sQLiteDatabase = this.f2047a;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            } finally {
                this.f2047a = null;
            }
        }
    }
}
