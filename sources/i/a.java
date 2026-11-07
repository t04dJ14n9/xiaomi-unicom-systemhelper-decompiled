package i;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.AsyncTask;
import android.os.Handler;
import b.o;
import com.baidu.location.Jni;
import j.k;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n.h;
import n.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static a f2733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f2734m = h.f3402a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f2735n = h.f3402a + "/ls.db";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2736a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2737b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2738c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f2739d = 0.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f2740e = 0.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f2741f = 0.0d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f2742g = 0.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f2743h = 0.0d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f2744i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f2745j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2746k = false;

    /* JADX INFO: renamed from: i.a$a, reason: collision with other inner class name */
    public class RunnableC0029a implements Runnable {
        public RunnableC0029a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.baidu.location.f.f2179f) {
                a.this.o();
            }
        }
    }

    public class b extends AsyncTask<Boolean, Void, Boolean> {
        public b(a aVar) {
        }

        public /* synthetic */ b(a aVar, RunnableC0029a runnableC0029a) {
            this(aVar);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            if (boolArr.length != 4) {
                return Boolean.FALSE;
            }
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = null;
            try {
                sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(a.f2735n, (SQLiteDatabase.CursorFactory) null);
            } catch (Exception unused) {
            }
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                return Boolean.FALSE;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() >> 28);
            try {
                sQLiteDatabaseOpenOrCreateDatabase.beginTransaction();
                if (boolArr[0].booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("delete from wof where ac < ");
                    sb.append(iCurrentTimeMillis - 35);
                    try {
                        sQLiteDatabaseOpenOrCreateDatabase.execSQL(sb.toString());
                    } catch (Exception unused2) {
                    }
                }
                if (boolArr[1].booleanValue()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("delete from bdcltb09 where ac is NULL or ac < ");
                    sb2.append(iCurrentTimeMillis - 130);
                    try {
                        sQLiteDatabaseOpenOrCreateDatabase.execSQL(sb2.toString());
                    } catch (Exception unused3) {
                    }
                }
                sQLiteDatabaseOpenOrCreateDatabase.setTransactionSuccessful();
                sQLiteDatabaseOpenOrCreateDatabase.endTransaction();
                sQLiteDatabaseOpenOrCreateDatabase.close();
            } catch (Exception unused4) {
            }
            return Boolean.TRUE;
        }
    }

    public class c extends AsyncTask<Object, Void, Boolean> {
        public c() {
        }

        public /* synthetic */ c(a aVar, RunnableC0029a runnableC0029a) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Object... objArr) {
            if (objArr.length != 4) {
                a.this.f2744i = false;
                return Boolean.FALSE;
            }
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = null;
            try {
                sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(a.f2735n, (SQLiteDatabase.CursorFactory) null);
            } catch (Exception unused) {
            }
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                a.this.f2744i = false;
                return Boolean.FALSE;
            }
            try {
                sQLiteDatabaseOpenOrCreateDatabase.beginTransaction();
                a.this.i((String) objArr[0], (j.a) objArr[1], sQLiteDatabaseOpenOrCreateDatabase);
                a.this.g((k) objArr[2], (b1.c) objArr[3], sQLiteDatabaseOpenOrCreateDatabase);
                sQLiteDatabaseOpenOrCreateDatabase.setTransactionSuccessful();
                sQLiteDatabaseOpenOrCreateDatabase.endTransaction();
                sQLiteDatabaseOpenOrCreateDatabase.close();
            } catch (Exception unused2) {
            }
            a.this.f2744i = false;
            return Boolean.TRUE;
        }
    }

    public a() {
        q();
    }

    public static synchronized a p() {
        if (f2733l == null) {
            f2733l = new a();
        }
        return f2733l;
    }

    public b1.c a(String str, List<ScanResult> list, boolean z2) {
        if (!this.f2746k) {
            return new b1.c("{\"result\":{\"time\":\"" + i.K() + "\",\"error\":\"67\"}}");
        }
        String str2 = "{\"result\":{\"time\":\"" + i.K() + "\",\"error\":\"67\"}}";
        try {
            k(str, list);
            String strC = c(true);
            if (strC != null) {
                str2 = strC;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return new b1.c(str2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:16:0x009a  */
    /* JADX WARN: Code duplicated, block: B:18:0x009e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ae  */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x002e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0063, please report this as an issue */
    public final String c(boolean z2) {
        double d2;
        boolean z3;
        boolean z4;
        double d3;
        double d4;
        StringBuilder sb;
        String str;
        if (!this.f2738c) {
            if (this.f2737b) {
                d2 = this.f2740e;
                d3 = this.f2741f;
                d4 = this.f2739d;
            } else {
                d2 = 0.0d;
                z3 = false;
                z4 = false;
                d3 = 0.0d;
                d4 = 0.0d;
            }
            if (z3) {
                if (z2) {
                    sb = new StringBuilder();
                    sb.append("{\"result\":{\"time\":\"");
                    sb.append(i.K());
                    str = "\",\"error\":\"67\"}}";
                } else {
                    sb = new StringBuilder();
                    sb.append("{\"result\":{\"time\":\"");
                    sb.append(i.K());
                    str = "\",\"error\":\"63\"}}";
                }
                sb.append(str);
                return sb.toString();
            }
            if (z2) {
                return String.format(Locale.CHINA, "{\"result\":{\"time\":\"" + i.K() + "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}", Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Boolean.TRUE);
            }
            return String.format(Locale.CHINA, "{\"result\":{\"time\":\"" + i.K() + "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}", Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Boolean.valueOf(z4));
        }
        d2 = this.f2742g;
        d3 = this.f2743h;
        d4 = 246.4d;
        z3 = true;
        z4 = true;
        if (z3) {
            if (z2) {
                sb = new StringBuilder();
                sb.append("{\"result\":{\"time\":\"");
                sb.append(i.K());
                str = "\",\"error\":\"67\"}}";
            } else {
                sb = new StringBuilder();
                sb.append("{\"result\":{\"time\":\"");
                sb.append(i.K());
                str = "\",\"error\":\"63\"}}";
            }
            sb.append(str);
            return sb.toString();
        }
        if (z2) {
            return String.format(Locale.CHINA, "{\"result\":{\"time\":\"" + i.K() + "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}", Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Boolean.TRUE);
        }
        return String.format(Locale.CHINA, "{\"result\":{\"time\":\"" + i.K() + "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}", Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Boolean.valueOf(z4));
    }

    public final void g(k kVar, b1.c cVar, SQLiteDatabase sQLiteDatabase) {
        Iterator<ScanResult> it;
        double d2;
        double d3;
        boolean z2;
        int i2;
        int i3;
        String str;
        Integer numValueOf;
        if (cVar == null || cVar.v() != 161) {
            return;
        }
        if (("wf".equals(cVar.z()) || cVar.E() < 300.0f) && kVar.f3019a != null) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() >> 28);
            System.currentTimeMillis();
            Iterator<ScanResult> it2 = kVar.f3019a.iterator();
            char c2 = 0;
            int i4 = 0;
            while (it2.hasNext()) {
                ScanResult next = it2.next();
                if (next.level != 0) {
                    i4++;
                    if (i4 > 6) {
                        return;
                    }
                    ContentValues contentValues = new ContentValues();
                    String strG = Jni.g(next.BSSID.replace(":", ""));
                    try {
                        String[] strArr = new String[1];
                        strArr[c2] = strG;
                        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select * from wof where id = ?", strArr);
                        if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
                            d2 = 0.0d;
                            d3 = 0.0d;
                            z2 = false;
                            i2 = 0;
                            i3 = 0;
                        } else {
                            double d4 = cursorRawQuery.getDouble(1) - 113.2349d;
                            double d5 = cursorRawQuery.getDouble(2) - 432.1238d;
                            int i5 = cursorRawQuery.getInt(4);
                            d2 = d4;
                            d3 = d5;
                            i3 = cursorRawQuery.getInt(5);
                            i2 = i5;
                            z2 = true;
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        if (z2) {
                            if (i3 != 0) {
                                float[] fArr = new float[1];
                                it = it2;
                                try {
                                    Location.distanceBetween(d3, d2, cVar.u(), cVar.x(), fArr);
                                    if (fArr[0] > 1500.0f) {
                                        int i6 = i3 + 1;
                                        if (i6 <= 10 || i6 <= i2 * 3) {
                                            str = "cc";
                                            numValueOf = Integer.valueOf(i6);
                                        } else {
                                            contentValues.put("mktime", Double.valueOf(cVar.x() + 113.2349d));
                                            contentValues.put("time", Double.valueOf(cVar.u() + 432.1238d));
                                            contentValues.put("bc", (Integer) 1);
                                            contentValues.put("cc", (Integer) 1);
                                        }
                                        contentValues.put(str, numValueOf);
                                        sQLiteDatabase.update("wof", contentValues, "id = \"" + strG + "\"", null);
                                    } else {
                                        double d6 = i2;
                                        int i7 = i2 + 1;
                                        double d7 = i7;
                                        double dX = ((d2 * d6) + cVar.x()) / d7;
                                        double dU = ((d3 * d6) + cVar.u()) / d7;
                                        contentValues.put("mktime", Double.valueOf(dX + 113.2349d));
                                        contentValues.put("time", Double.valueOf(dU + 432.1238d));
                                        contentValues.put("bc", Integer.valueOf(i7));
                                    }
                                    numValueOf = Integer.valueOf(iCurrentTimeMillis);
                                    str = "ac";
                                    contentValues.put(str, numValueOf);
                                    sQLiteDatabase.update("wof", contentValues, "id = \"" + strG + "\"", null);
                                } catch (Exception unused) {
                                }
                            }
                            it2 = it;
                            c2 = 0;
                        } else {
                            contentValues.put("mktime", Double.valueOf(cVar.x() + 113.2349d));
                            contentValues.put("time", Double.valueOf(cVar.u() + 432.1238d));
                            contentValues.put("bc", (Integer) 1);
                            contentValues.put("cc", (Integer) 1);
                            contentValues.put("ac", Integer.valueOf(iCurrentTimeMillis));
                            contentValues.put("id", strG);
                            sQLiteDatabase.insert("wof", null, contentValues);
                        }
                    } catch (Exception unused2) {
                    }
                    it = it2;
                    it2 = it;
                    c2 = 0;
                }
            }
        }
    }

    public final void h(String str, SQLiteDatabase sQLiteDatabase) {
        if (str == null || str.equals(this.f2736a)) {
            return;
        }
        this.f2737b = false;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select * from bdcltb09 where id = ?", new String[]{str});
            this.f2736a = str;
            if (cursorRawQuery.moveToFirst()) {
                this.f2740e = cursorRawQuery.getDouble(1) - 1235.4323d;
                this.f2739d = cursorRawQuery.getDouble(2) - 4326.0d;
                this.f2741f = cursorRawQuery.getDouble(3) - 2367.3217d;
                this.f2737b = true;
            }
        } catch (Exception unused) {
        } finally {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    /* JADX WARN: Code duplicated, block: B:28:0x010f A[Catch: Exception -> 0x0117, TRY_LEAVE, TryCatch #0 {Exception -> 0x0117, blocks: (B:8:0x0027, B:11:0x0048, B:13:0x0054, B:15:0x0061, B:17:0x0097, B:26:0x00f7, B:28:0x010f, B:16:0x0082, B:20:0x00a1), top: B:31:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public final void i(String str, j.a aVar, SQLiteDatabase sQLiteDatabase) {
        double d2;
        float f2;
        double d3;
        ContentValues contentValues;
        String string;
        if (aVar.f() && o.M().H()) {
            System.currentTimeMillis();
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() >> 28);
            String strL = j.f.M().L(aVar);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i2 = Integer.parseInt(jSONObject.getJSONObject("result").getString("error"));
                boolean z2 = true;
                if (i2 == 161) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                    if (jSONObject2.has("clf")) {
                        String string2 = jSONObject2.getString("clf");
                        if (string2.equals("0")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("point");
                            d2 = Double.parseDouble(jSONObject3.getString("x"));
                            d3 = Double.parseDouble(jSONObject3.getString("y"));
                            string = jSONObject2.getString("radius");
                        } else {
                            String[] strArrSplit = string2.split("\\|");
                            d2 = Double.parseDouble(strArrSplit[0]);
                            d3 = Double.parseDouble(strArrSplit[1]);
                            string = strArrSplit[2];
                        }
                        f2 = Float.parseFloat(string);
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                    contentValues = new ContentValues();
                    contentValues.put("time", Double.valueOf(d2 + 1235.4323d));
                    contentValues.put("tag", Float.valueOf(f2 + 4326.0f));
                    contentValues.put("type", Double.valueOf(d3 + 2367.3217d));
                    contentValues.put("ac", Integer.valueOf(iCurrentTimeMillis));
                    if (sQLiteDatabase.update("bdcltb09", contentValues, "id = \"" + strL + "\"", null) <= 0) {
                        contentValues.put("id", strL);
                        sQLiteDatabase.insert("bdcltb09", null, contentValues);
                    }
                }
                if (i2 == 167) {
                    sQLiteDatabase.delete("bdcltb09", "id = \"" + strL + "\"", null);
                    return;
                }
                d2 = 0.0d;
                f2 = 0.0f;
                d3 = 0.0d;
                if (z2) {
                    return;
                }
                contentValues = new ContentValues();
                contentValues.put("time", Double.valueOf(d2 + 1235.4323d));
                contentValues.put("tag", Float.valueOf(f2 + 4326.0f));
                contentValues.put("type", Double.valueOf(d3 + 2367.3217d));
                contentValues.put("ac", Integer.valueOf(iCurrentTimeMillis));
                if (sQLiteDatabase.update("bdcltb09", contentValues, "id = \"" + strL + "\"", null) <= 0) {
                    contentValues.put("id", strL);
                    sQLiteDatabase.insert("bdcltb09", null, contentValues);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void j(String str, j.a aVar, k kVar, b1.c cVar) {
        if (this.f2746k) {
            boolean z2 = (aVar.f() && o.M().H()) ? false : true;
            boolean z3 = cVar == null || cVar.v() != 161 || (!"wf".equals(cVar.z()) && cVar.E() >= 300.0f);
            if (kVar.f3019a == null) {
                z3 = true;
            }
            if ((z2 && z3) || this.f2744i) {
                return;
            }
            this.f2744i = true;
            new c(this, null).execute(str, aVar, kVar, cVar);
        }
    }

    public final void k(String str, List<ScanResult> list) {
        this.f2737b = false;
        this.f2738c = false;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = null;
        try {
            sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(f2735n, (SQLiteDatabase.CursorFactory) null);
        } catch (Throwable unused) {
        }
        if (str != null && sQLiteDatabaseOpenOrCreateDatabase != null) {
            h(str, sQLiteDatabaseOpenOrCreateDatabase);
        }
        if (list != null && sQLiteDatabaseOpenOrCreateDatabase != null) {
            l(list, sQLiteDatabaseOpenOrCreateDatabase);
        }
        if (sQLiteDatabaseOpenOrCreateDatabase == null || !sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
            return;
        }
        sQLiteDatabaseOpenOrCreateDatabase.close();
    }

    public final void l(List<ScanResult> list, SQLiteDatabase sQLiteDatabase) {
        double[] dArr;
        boolean z2;
        int i2;
        int i3;
        System.currentTimeMillis();
        this.f2738c = false;
        if (list == null || list.size() == 0 || sQLiteDatabase == null) {
            return;
        }
        int i4 = 8;
        double[] dArr2 = new double[8];
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = 0;
        for (ScanResult scanResult : list) {
            if (i5 > 10) {
                break;
            }
            if (i5 > 0) {
                stringBuffer.append(",");
            }
            i5++;
            String strG = Jni.g(scanResult.BSSID.replace(":", ""));
            stringBuffer.append("\"");
            stringBuffer.append(strG);
            stringBuffer.append("\"");
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select * from wof where id in (" + stringBuffer.toString() + ");", null);
            if (cursorRawQuery.moveToFirst()) {
                double d2 = 0.0d;
                boolean z3 = false;
                boolean z4 = false;
                int i6 = 0;
                int i7 = 0;
                double d3 = 0.0d;
                while (!cursorRawQuery.isAfterLast()) {
                    double d4 = cursorRawQuery.getDouble(1) - 113.2349d;
                    double d5 = cursorRawQuery.getDouble(2) - 432.1238d;
                    int i8 = cursorRawQuery.getInt(4);
                    int i9 = cursorRawQuery.getInt(5);
                    if (i9 <= i4 || i9 <= i8) {
                        if (this.f2737b) {
                            float[] fArr = new float[1];
                            dArr = dArr2;
                            Location.distanceBetween(d5, d4, this.f2741f, this.f2740e, fArr);
                            if (fArr[0] <= this.f2739d + 2000.0d) {
                                d2 += d4;
                                d3 += d5;
                                i7++;
                                z3 = true;
                                i2 = 8;
                                i3 = 4;
                                z2 = false;
                            }
                        } else {
                            dArr = dArr2;
                            if (z3) {
                                float[] fArr2 = new float[1];
                                double d6 = i7;
                                Location.distanceBetween(d5, d4, d3 / d6, d2 / d6, fArr2);
                                if (fArr2[0] <= 1000.0f) {
                                    i2 = 8;
                                    i3 = 4;
                                    z2 = false;
                                }
                                cursorRawQuery.moveToNext();
                                i4 = i2;
                                dArr2 = dArr;
                            } else if (z4) {
                                for (int i10 = 0; i10 < i6; i10 += 2) {
                                    float[] fArr3 = new float[1];
                                    int i11 = i10 + 1;
                                    Location.distanceBetween(d5, d4, dArr[i11], dArr[i10], fArr3);
                                    if (fArr3[0] < 1000.0f) {
                                        d2 += dArr[i10];
                                        d3 += dArr[i11];
                                        i7++;
                                        z3 = true;
                                    }
                                }
                                z2 = false;
                                if (!z3) {
                                    i2 = 8;
                                    if (i6 >= 8) {
                                        break;
                                    }
                                    int i12 = i6 + 1;
                                    dArr[i6] = d4;
                                    i6 = i12 + 1;
                                    dArr[i12] = d5;
                                } else {
                                    d2 += d4;
                                    d3 += d5;
                                    i7++;
                                    i2 = 8;
                                }
                                i3 = 4;
                            } else {
                                int i13 = i6 + 1;
                                dArr[i6] = d4;
                                i6 = i13 + 1;
                                dArr[i13] = d5;
                                i2 = 8;
                                i3 = 4;
                                z4 = true;
                                z2 = false;
                            }
                        }
                        if (i7 > i3) {
                            break;
                        }
                        cursorRawQuery.moveToNext();
                        i4 = i2;
                        dArr2 = dArr;
                    } else {
                        dArr = dArr2;
                    }
                    i2 = 8;
                    z2 = false;
                    cursorRawQuery.moveToNext();
                    i4 = i2;
                    dArr2 = dArr;
                }
                if (i7 > 0) {
                    this.f2738c = true;
                    double d7 = i7;
                    this.f2742g = d2 / d7;
                    this.f2743h = d3 / d7;
                }
            }
        } catch (Exception unused) {
        } finally {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public b1.c n(boolean z2) {
        if (!this.f2746k) {
            return new b1.c("{\"result\":{\"time\":\"" + i.K() + "\",\"error\":\"67\"}}");
        }
        j.a aVarE = j.f.M().e();
        String strL = (aVarE == null || !aVarE.e()) ? null : j.f.M().L(aVarE);
        k kVarS = j.f.M().S();
        b1.c cVarA = kVarS != null ? a(strL, kVarS.f3019a, true) : null;
        if (cVarA != null && cVarA.v() == 66) {
            StringBuffer stringBuffer = new StringBuffer(1024);
            stringBuffer.append(String.format(Locale.CHINA, "&ofl=%f|%f|%f", Double.valueOf(cVarA.u()), Double.valueOf(cVarA.x()), Float.valueOf(cVarA.E())));
            if (kVarS != null && kVarS.e() > 0) {
                stringBuffer.append("&wf=");
                stringBuffer.append(j.f.M().B(15, kVarS));
            }
            if (aVarE != null) {
                stringBuffer.append(j.f.M().l(aVarE));
            }
            stringBuffer.append("&uptype=oldoff");
            stringBuffer.append(i.B(com.baidu.location.f.c()));
            stringBuffer.append(n.b.g().b(false));
            stringBuffer.append(b.c.r().o());
        }
        return cVarA;
    }

    public final void o() {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        RunnableC0029a runnableC0029a = null;
        try {
            sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(f2735n, (SQLiteDatabase.CursorFactory) null);
        } catch (Exception unused) {
            sQLiteDatabaseOpenOrCreateDatabase = null;
        }
        if (sQLiteDatabaseOpenOrCreateDatabase == null) {
            return;
        }
        try {
            long jQueryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabaseOpenOrCreateDatabase, "wof");
            long jQueryNumEntries2 = DatabaseUtils.queryNumEntries(sQLiteDatabaseOpenOrCreateDatabase, "bdcltb09");
            boolean z2 = jQueryNumEntries > 10000;
            boolean z3 = jQueryNumEntries2 > 10000;
            sQLiteDatabaseOpenOrCreateDatabase.close();
            if (z2 || z3) {
                new b(this, runnableC0029a).execute(Boolean.valueOf(z2), Boolean.valueOf(z3));
            }
        } catch (Exception unused2) {
        }
    }

    public void q() {
        try {
            File file = new File(f2734m);
            File file2 = new File(f2735n);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            if (file2.exists()) {
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file2, (SQLiteDatabase.CursorFactory) null);
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS bdcltb09(id CHAR(40) PRIMARY KEY,time DOUBLE,tag DOUBLE, type DOUBLE , ac INT);");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS wof(id CHAR(15) PRIMARY KEY,mktime DOUBLE,time DOUBLE, ac INT, bc INT, cc INT);");
                sQLiteDatabaseOpenOrCreateDatabase.setVersion(1);
                sQLiteDatabaseOpenOrCreateDatabase.close();
            }
            this.f2746k = true;
        } catch (Throwable unused) {
            this.f2746k = false;
        }
    }

    public void r() {
        if (this.f2745j == null) {
            this.f2745j = new Handler();
        }
        this.f2745j.postDelayed(new RunnableC0029a(), 3000L);
    }
}
