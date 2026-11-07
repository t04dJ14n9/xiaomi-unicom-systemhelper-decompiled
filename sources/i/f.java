package i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b.w;
import com.baidu.location.Jni;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2856e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f2858b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2857a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2859c = new a(this, this);

    public class a extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2860j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f2861k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f2862l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f2863m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f2864n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public f f2865o;

        public a(f fVar, f fVar2) {
            this.f2865o = fVar2;
            this.f3382d = new HashMap();
            this.f2860j = 0;
            this.f2861k = -1L;
        }

        @Override // n.g
        public void a() {
            this.f3382d.clear();
            this.f3382d.put("qt", "ofbh");
            this.f3382d.put("req", this.f2862l);
            this.f3379a = d.f2824j;
        }

        @Override // n.g
        public void h(boolean z2) {
            String str;
            this.f2864n = false;
            if (z2 && (str = this.f3381c) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("error") && jSONObject.getInt("error") == 161) {
                        this.f2864n = true;
                    }
                } catch (Exception unused) {
                }
            }
            if (!this.f2864n) {
                this.f2860j++;
                this.f2861k = System.currentTimeMillis();
            }
            this.f2865o.e(this.f2864n);
            this.f2863m = false;
        }

        public final void j() {
            if (this.f2863m) {
                return;
            }
            this.f2862l = this.f2865o.a();
            long j2 = this.f2861k;
            if (j2 != -1 && j2 + 86400000 <= System.currentTimeMillis()) {
                this.f2860j = 0;
                this.f2861k = -1L;
            }
            if (this.f2862l == null || this.f2860j >= 2) {
                return;
            }
            this.f2863m = true;
            ExecutorService executorServiceC = w.b().c();
            if (executorServiceC != null) {
                c(executorServiceC, "https://ofloc.map.baidu.com/offline_loc");
            } else {
                b("https://ofloc.map.baidu.com/offline_loc");
            }
        }
    }

    static {
        Locale locale = Locale.US;
        f2855d = String.format(locale, "DELETE FROM LOG WHERE timestamp NOT IN (SELECT timestamp FROM LOG ORDER BY timestamp DESC LIMIT %d);", 3000);
        f2856e = String.format(locale, "SELECT * FROM LOG ORDER BY timestamp DESC LIMIT %d;", 3);
    }

    public f(SQLiteDatabase sQLiteDatabase) {
        this.f2858b = sQLiteDatabase;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS LOG(timestamp LONG PRIMARY KEY, log VARCHAR(4000))");
        } catch (Exception unused) {
        }
    }

    public final String a() throws Throwable {
        String str;
        Cursor cursorRawQuery;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        Cursor cursor = null;
        string = null;
        string = null;
        string = null;
        String string = null;
        Cursor cursor2 = null;
        try {
            cursorRawQuery = this.f2858b.rawQuery(f2856e, null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        StringBuffer stringBuffer = new StringBuffer();
                        cursorRawQuery.moveToFirst();
                        while (!cursorRawQuery.isAfterLast()) {
                            jSONArray.put(cursorRawQuery.getString(1));
                            if (stringBuffer.length() != 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(cursorRawQuery.getLong(0));
                            cursorRawQuery.moveToNext();
                        }
                        try {
                            jSONObject.put("ofloc", jSONArray);
                            string = jSONObject.toString();
                        } catch (JSONException unused) {
                        }
                        this.f2857a = stringBuffer.toString();
                    }
                } catch (Exception unused2) {
                    str = string;
                    cursor2 = cursorRawQuery;
                    if (cursor2 == null) {
                        return str;
                    }
                    cursorRawQuery = cursor2;
                    string = str;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            }
            if (cursorRawQuery == null) {
                return string;
            }
        } catch (Exception unused4) {
            str = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            cursorRawQuery.close();
            return string;
        } catch (Exception unused5) {
            return string;
        }
    }

    public void d(String str) {
        try {
            this.f2858b.execSQL(String.format(Locale.US, "INSERT OR IGNORE INTO LOG VALUES (%d,\"%s\");", Long.valueOf(System.currentTimeMillis()), Jni.i(str)));
            this.f2858b.execSQL(f2855d);
        } catch (Exception unused) {
        }
    }

    public final void e(boolean z2) {
        String str;
        if (z2 && (str = this.f2857a) != null) {
            String str2 = String.format("DELETE FROM LOG WHERE timestamp in (%s);", str);
            try {
                if (this.f2857a.length() > 0) {
                    this.f2858b.execSQL(str2);
                }
            } catch (Exception unused) {
            }
        }
        this.f2857a = null;
    }

    public void f() {
        this.f2859c.j();
    }
}
