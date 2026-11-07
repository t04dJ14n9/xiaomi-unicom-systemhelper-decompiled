package b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import com.baidu.location.Jni;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static l f1758g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f1760a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1761b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f1762c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1763d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1764e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Object f1757f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1759h = n.i.y() + "/hst.db";

    public class a extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f1765j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f1766k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f1767l = true;

        public a() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            this.f3380b = 1;
            String strT = j.f.M().T();
            if (strT != null) {
                this.f3385g = Jni.j(strT);
            }
            String strJ = Jni.j(this.f1766k);
            this.f1766k = null;
            this.f3382d.put("bloc", strJ);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003c A[Catch: Exception -> 0x00f3, PHI: r11
          0x003c: PHI (r11v6 java.lang.String) = 
          (r11v5 java.lang.String)
          (r11v5 java.lang.String)
          (r11v5 java.lang.String)
          (r11v5 java.lang.String)
          (r11v15 java.lang.String)
         binds: [B:7:0x0014, B:9:0x001e, B:15:0x0039, B:11:0x0029, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:18:0x0040 A[Catch: Exception -> 0x00f3, TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x004c A[Catch: Exception -> 0x00f3, TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0054 A[Catch: Exception -> 0x00f3, TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0082 A[Catch: Exception -> 0x00f3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f3, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0039, B:16:0x003c, B:18:0x0040, B:20:0x004c, B:23:0x0054, B:25:0x005a, B:27:0x0082, B:29:0x0089, B:31:0x009a, B:35:0x00d1, B:10:0x0020, B:12:0x002b), top: B:49:0x0010, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c3 A[Catch: Exception -> 0x00d1, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d1, blocks: (B:32:0x00a1, B:34:0x00c3), top: B:51:0x00a1 }] */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        
            r11 = r10.f3381c;
         */
        @Override // n.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(boolean r11) {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.a.h(boolean):void");
        }

        public void i(String str, String str2) {
            if (l.this.f1761b) {
                return;
            }
            l.this.f1761b = true;
            this.f1765j = str;
            if (n.a().d()) {
                this.f1766k = str2 + "&enc=2";
            } else {
                this.f1766k = str2;
            }
            ExecutorService executorServiceC = w.b().c();
            if (executorServiceC != null) {
                c(executorServiceC, n.d.f3356b);
            } else {
                b(n.d.f3356b);
            }
        }
    }

    public static l h() {
        l lVar;
        synchronized (f1757f) {
            if (f1758g == null) {
                f1758g = new l();
            }
            lVar = f1758g;
        }
        return lVar;
    }

    public synchronized int a() {
        int i2;
        int i3 = -3;
        if (this.f1761b) {
            return -3;
        }
        try {
            if (j.f.M().Y() && this.f1760a != null) {
                WifiInfo wifiInfoG = j.f.M().G();
                Cursor cursorRawQuery = null;
                String strK = j.f.M().k(wifiInfoG, null);
                if (wifiInfoG != null && strK != null) {
                    String strReplace = strK.replace(":", "");
                    Long lH = Jni.h(strReplace);
                    String str = this.f1763d;
                    if (str == null || !strReplace.equals(str) || (i2 = this.f1764e) <= -2) {
                        try {
                            cursorRawQuery = this.f1760a.rawQuery("select * from hstdata where id = ?", new String[]{String.valueOf(lH)});
                            if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
                                i3 = -2;
                            } else {
                                i3 = cursorRawQuery.getInt(1);
                                this.f1763d = strReplace;
                                this.f1764e = i3;
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        } catch (Exception unused) {
                            if (cursorRawQuery != null) {
                            }
                        } catch (Throwable th) {
                            if (cursorRawQuery != null) {
                                try {
                                    cursorRawQuery.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        i3 = i2;
                    }
                }
            }
        } catch (Exception unused3) {
        }
        this.f1764e = i3;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00bf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00d8, please report this as an issue */
    public final String c(boolean z2) {
        String strK;
        int iX;
        String string;
        String[] strArrSplit;
        String[] strArrSplit2;
        j.a aVarE = j.f.M().e();
        j.k kVarS = j.f.M().S();
        StringBuffer stringBuffer = new StringBuffer(1024);
        if (aVarE != null && aVarE.f()) {
            stringBuffer.append(j.f.M().l(aVarE));
        }
        if (kVarS == null || kVarS.e() <= 1) {
            strK = j.f.M().K();
            if (strK != null) {
            }
            if (z2) {
                stringBuffer.append("&imo=1");
            }
            stringBuffer.append(j.d.l0().M());
            stringBuffer.append(n.b.g().b(false));
            stringBuffer.append(c.r().o());
            stringBuffer.append(f.k().a());
            stringBuffer.append(n.i.D(com.baidu.location.f.c()));
            iX = n.i.x(com.baidu.location.f.c());
            if (iX >= 0) {
                stringBuffer.append("&lmd=");
                stringBuffer.append(iX);
            }
            string = stringBuffer.toString();
            if (string.length() > n.i.F0) {
                return string;
            }
            strArrSplit = string.split("&cl_list=");
            if (strArrSplit.length == 2) {
                return string;
            }
            strArrSplit2 = strArrSplit[1].split("&", 2);
            if (strArrSplit2.length == 2) {
                return strArrSplit[0] + "&cl_list=null";
            }
            return strArrSplit[0] + "&cl_list=null&" + strArrSplit2[1];
        }
        strK = j.f.M().j(15, false, kVarS, n.i.f3436q0);
        stringBuffer.append(strK);
        if (z2) {
            stringBuffer.append("&imo=1");
        }
        stringBuffer.append(j.d.l0().M());
        stringBuffer.append(n.b.g().b(false));
        stringBuffer.append(c.r().o());
        stringBuffer.append(f.k().a());
        stringBuffer.append(n.i.D(com.baidu.location.f.c()));
        iX = n.i.x(com.baidu.location.f.c());
        if (iX >= 0) {
            stringBuffer.append("&lmd=");
            stringBuffer.append(iX);
        }
        string = stringBuffer.toString();
        if (string.length() > n.i.F0) {
            return string;
        }
        strArrSplit = string.split("&cl_list=");
        if (strArrSplit.length == 2) {
            return string;
        }
        strArrSplit2 = strArrSplit[1].split("&", 2);
        if (strArrSplit2.length == 2) {
            return strArrSplit[0] + "&cl_list=null";
        }
        return strArrSplit[0] + "&cl_list=null&" + strArrSplit2[1];
    }

    public final void d(Bundle bundle) {
        c.r().c(bundle, 406);
    }

    public void f(String str) {
        if (this.f1761b) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has("content") ? jSONObject.getJSONObject("content") : null;
            if (jSONObject2 == null || !jSONObject2.has("imo")) {
                return;
            }
            Long lValueOf = Long.valueOf(jSONObject2.getJSONObject("imo").getString("mac"));
            int i2 = jSONObject2.getJSONObject("imo").getInt("mv");
            ContentValues contentValues = new ContentValues();
            contentValues.put("tt", Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
            contentValues.put("hst", Integer.valueOf(i2));
            if (this.f1760a.update("hstdata", contentValues, "id = \"" + lValueOf + "\"", null) <= 0) {
                contentValues.put("id", lValueOf);
                this.f1760a.insert("hstdata", null, contentValues);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008c A[EXC_TOP_SPLITTER, PHI: r2 r4
      0x008c: PHI (r2v2 boolean) = (r2v1 boolean), (r2v5 boolean) binds: [B:35:0x008a, B:29:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r4v3 android.database.Cursor) = (r4v2 android.database.Cursor), (r4v4 android.database.Cursor) binds: [B:35:0x008a, B:29:0x0080] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public void j() {
        WifiInfo wifiInfoG;
        if (this.f1761b) {
            return;
        }
        try {
            if (!j.f.M().Y() || this.f1760a == null || (wifiInfoG = j.f.M().G()) == null || wifiInfoG.getBSSID() == null) {
                l();
                return;
            }
            String strReplace = wifiInfoG.getBSSID().replace(":", "");
            boolean z2 = false;
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = this.f1760a.rawQuery("select * from hstdata where id = ?", new String[]{String.valueOf(Jni.h(strReplace))});
                if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
                    z2 = true;
                } else {
                    int i2 = cursorRawQuery.getInt(1);
                    if ((System.currentTimeMillis() / 1000) - ((long) cursorRawQuery.getInt(2)) > 259200) {
                        z2 = true;
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("mac", strReplace.getBytes());
                        bundle.putInt("hotspot", i2);
                        d(bundle);
                    }
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
            if (z2) {
                if (this.f1762c == null) {
                    this.f1762c = new a();
                }
                a aVar = this.f1762c;
                if (aVar != null) {
                    aVar.i(strReplace, c(true));
                }
            }
        } catch (Exception unused4) {
        }
    }

    public final void l() {
        Bundle bundle = new Bundle();
        bundle.putInt("hotspot", -1);
        d(bundle);
    }

    public void m() {
        try {
            File file = new File(f1759h);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                this.f1760a = sQLiteDatabaseOpenOrCreateDatabase;
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS hstdata(id Long PRIMARY KEY,hst INT,tt INT);");
                this.f1760a.setVersion(1);
            }
        } catch (Exception unused) {
            this.f1760a = null;
        }
    }

    public void n() {
        SQLiteDatabase sQLiteDatabase = this.f1760a;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            } finally {
                this.f1760a = null;
            }
        }
    }
}
