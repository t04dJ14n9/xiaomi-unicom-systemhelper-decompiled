package i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b.w;
import b1.i;
import com.baidu.location.Jni;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.d f2749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f2751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f2752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f2753e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SQLiteDatabase f2756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SQLiteDatabase f2757i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2764p = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f2754f = new d(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f2755g = new d(this, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public StringBuffer f2763o = new StringBuffer();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public StringBuffer f2758j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public StringBuffer f2759k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet<Long> f2760l = new HashSet<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ConcurrentMap<Long, Integer> f2761m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ConcurrentMap<Long, String> f2762n = new ConcurrentHashMap();

    public class a extends c {
        public a(b bVar, String str, Long l2, b1.c cVar, b1.c cVar2, b1.c cVar3, String str2, LinkedHashMap linkedHashMap) {
            super(bVar, str, l2, cVar, cVar2, cVar3, str2, linkedHashMap, null);
        }
    }

    /* JADX INFO: renamed from: i.b$b, reason: collision with other inner class name */
    public static final class C0030b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f2765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f2766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f2767c;

        public C0030b(double d2, double d3, double d4) {
            this.f2765a = d2;
            this.f2766b = d3;
            this.f2767c = d4;
        }

        public /* synthetic */ C0030b(double d2, double d3, double d4, a aVar) {
            this(d2, d3, d4);
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f2769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b1.c f2770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b1.c f2771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b1.c f2772f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f2773g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinkedHashMap<String, Integer> f2774h;

        public c(String str, Long l2, b1.c cVar, b1.c cVar2, b1.c cVar3, String str2, LinkedHashMap<String, Integer> linkedHashMap) {
            this.f2768b = str;
            this.f2769c = l2;
            this.f2770d = cVar;
            this.f2771e = cVar2;
            this.f2772f = cVar3;
            this.f2773g = str2;
            this.f2774h = linkedHashMap;
        }

        public /* synthetic */ c(b bVar, String str, Long l2, b1.c cVar, b1.c cVar2, b1.c cVar3, String str2, LinkedHashMap linkedHashMap, a aVar) {
            this(str, l2, cVar, cVar2, cVar3, str2, linkedHashMap);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                b.this.o(this.f2768b, this.f2769c, this.f2770d);
                b.this.f2758j = null;
                b.this.f2759k = null;
                b.this.q(this.f2774h);
                b.this.i(this.f2772f, this.f2770d, this.f2771e, this.f2768b, this.f2769c);
                if (this.f2773g != null) {
                    b.this.f2749a.o().d(this.f2773g);
                }
            } catch (Exception unused) {
            }
            this.f2774h = null;
            this.f2768b = null;
            this.f2773g = null;
            this.f2769c = null;
            this.f2770d = null;
            this.f2771e = null;
            this.f2772f = null;
        }
    }

    public final class d extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f2776j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f2777k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f2778l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public b f2779m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f2780n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f2781o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f2782p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f2783q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f2784r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f2785s = -1;

        public class a extends Thread {
            public a() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                JSONObject jSONObject2;
                JSONObject jSONObject3;
                b bVar;
                String str;
                String str2;
                String str3;
                String str4;
                JSONObject jSONObject4;
                int i2;
                String str5 = "DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY timestamp DESC, frequency DESC LIMIT %d);";
                String str6 = "CL";
                super.run();
                if (b.this.f2756h == null || b.this.f2757i == null || !b.this.f2756h.isOpen() || !b.this.f2757i.isOpen()) {
                    d.this.f2780n = false;
                    return;
                }
                try {
                    String str7 = d.this.f3381c;
                    if (str7 != null) {
                        jSONObject2 = new JSONObject(str7);
                        try {
                            jSONObject = jSONObject2.has("model") ? jSONObject2.getJSONObject("model") : null;
                            try {
                                jSONObject3 = jSONObject2.has("rgc") ? jSONObject2.getJSONObject("rgc") : null;
                            } catch (Exception e2) {
                                e = e2;
                                e.printStackTrace();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            jSONObject = null;
                        }
                    } else {
                        jSONObject3 = null;
                        jSONObject = null;
                        jSONObject2 = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    jSONObject = null;
                    jSONObject2 = null;
                }
                try {
                    b.this.f2756h.beginTransaction();
                    b.this.f2757i.beginTransaction();
                } catch (Exception unused) {
                }
                try {
                    try {
                        if (jSONObject3 != null) {
                            b.this.f2749a.q().e(jSONObject3);
                        }
                        if (jSONObject2 != null && jSONObject2.has("type") && jSONObject2.getString("type").equals("0")) {
                            d.this.f2783q = System.currentTimeMillis();
                        }
                        if (jSONObject2 != null && jSONObject2.has("bdlist")) {
                            d.this.f2779m.r(jSONObject2.getString("bdlist").split(";"));
                        }
                        if (jSONObject2 != null && jSONObject2.has("loadurl")) {
                            d.this.f2779m.p(jSONObject2.getJSONObject("loadurl").getString("host"), jSONObject2.getJSONObject("loadurl").getString("module"), jSONObject2.getJSONObject("loadurl").getString("req"));
                        }
                        String str8 = "cell";
                        String str9 = ",";
                        char c2 = 3;
                        if (jSONObject == null || !jSONObject.has("cell")) {
                            str = "cell";
                            str2 = "CL";
                        } else {
                            JSONObject jSONObject5 = jSONObject.getJSONObject("cell");
                            Iterator<String> itKeys = jSONObject5.keys();
                            StringBuffer stringBuffer = new StringBuffer();
                            StringBuffer stringBuffer2 = new StringBuffer();
                            StringBuffer stringBuffer3 = new StringBuffer();
                            int i3 = 0;
                            boolean z2 = true;
                            int i4 = 0;
                            int i5 = 0;
                            boolean z3 = true;
                            boolean z4 = true;
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = jSONObject5.getString(next);
                                Double dValueOf = Double.valueOf(string.split(",")[c2]);
                                if (z2) {
                                    z2 = false;
                                } else {
                                    stringBuffer2.append(',');
                                }
                                stringBuffer2.append(next);
                                int i6 = i3 + 1;
                                if (dValueOf.doubleValue() > 0.0d) {
                                    if (z4) {
                                        z4 = false;
                                    } else {
                                        stringBuffer3.append(',');
                                    }
                                    stringBuffer3.append('(');
                                    stringBuffer3.append(next);
                                    stringBuffer3.append(',');
                                    stringBuffer3.append(string);
                                    stringBuffer3.append("," + (System.currentTimeMillis() / 1000));
                                    stringBuffer3.append(')');
                                    i4++;
                                } else {
                                    jSONObject5 = jSONObject5;
                                    if (z3) {
                                        z3 = false;
                                    } else {
                                        stringBuffer.append(',');
                                    }
                                    stringBuffer.append(next);
                                    i5++;
                                }
                                int i7 = i4;
                                int i8 = i5;
                                if (i6 >= 100) {
                                    b.this.f2757i.execSQL(String.format("DELETE FROM CL WHERE id IN (%s);", stringBuffer2.toString()));
                                    stringBuffer2.setLength(0);
                                    i3 = i6 - 100;
                                    i2 = 100;
                                    z2 = true;
                                } else {
                                    i3 = i6;
                                    i2 = 100;
                                }
                                if (i7 >= i2) {
                                    b.this.f2756h.execSQL(String.format("INSERT OR REPLACE INTO CL (id,x,y,r,cl,timestamp) VALUES %s;", stringBuffer3.toString()));
                                    stringBuffer3.setLength(0);
                                    i4 = i7 - 100;
                                    i2 = 100;
                                    z4 = true;
                                } else {
                                    i4 = i7;
                                }
                                if (i8 >= i2) {
                                    b.this.f2756h.execSQL(String.format("DELETE FROM CL WHERE id IN (%s);", stringBuffer.toString()));
                                    stringBuffer.setLength(0);
                                    i5 = i8 - 100;
                                    c2 = 3;
                                    z3 = true;
                                } else {
                                    i5 = i8;
                                    c2 = 3;
                                }
                            }
                            str = str8;
                            str2 = str6;
                            if (i3 > 0) {
                                b.this.f2757i.execSQL(String.format("DELETE FROM CL WHERE id IN (%s);", stringBuffer2.toString()));
                            }
                            if (i4 > 0) {
                                b.this.f2756h.execSQL(String.format("INSERT OR REPLACE INTO CL (id,x,y,r,cl,timestamp) VALUES %s;", stringBuffer3.toString()));
                            }
                            if (i5 > 0) {
                                b.this.f2756h.execSQL(String.format("DELETE FROM CL WHERE id IN (%s);", stringBuffer.toString()));
                            }
                        }
                        String str10 = "ap";
                        if (jSONObject == null || !jSONObject.has("ap")) {
                            str3 = "ap";
                            str4 = "DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY timestamp DESC, frequency DESC LIMIT %d);";
                            jSONObject4 = jSONObject;
                        } else {
                            JSONObject jSONObject6 = jSONObject.getJSONObject("ap");
                            Iterator<String> itKeys2 = jSONObject6.keys();
                            StringBuffer stringBuffer4 = new StringBuffer();
                            StringBuffer stringBuffer5 = new StringBuffer();
                            StringBuffer stringBuffer6 = new StringBuffer();
                            int i9 = 0;
                            boolean z5 = true;
                            int i10 = 0;
                            int i11 = 0;
                            boolean z6 = true;
                            boolean z7 = true;
                            while (true) {
                                str3 = str10;
                                jSONObject4 = jSONObject;
                                if (!itKeys2.hasNext()) {
                                    break;
                                }
                                Iterator<String> it = itKeys2;
                                String next2 = itKeys2.next();
                                String str11 = str5;
                                String string2 = jSONObject6.getString(next2);
                                Double dValueOf2 = Double.valueOf(string2.split(str9)[3]);
                                if (z5) {
                                    z5 = false;
                                } else {
                                    stringBuffer5.append(',');
                                }
                                stringBuffer5.append(next2);
                                i9++;
                                if (dValueOf2.doubleValue() > 0.0d) {
                                    if (z7) {
                                        z7 = false;
                                    } else {
                                        stringBuffer6.append(',');
                                    }
                                    stringBuffer6.append('(');
                                    stringBuffer6.append(next2);
                                    stringBuffer6.append(',');
                                    stringBuffer6.append(string2);
                                    stringBuffer6.append(str9 + (System.currentTimeMillis() / 1000));
                                    stringBuffer6.append(')');
                                    i10++;
                                } else {
                                    if (z6) {
                                        z6 = false;
                                    } else {
                                        stringBuffer4.append(',');
                                    }
                                    stringBuffer4.append(next2);
                                    i11++;
                                }
                                int i12 = 100;
                                if (i9 >= 100) {
                                    b.this.f2757i.execSQL(String.format("DELETE FROM AP WHERE id IN (%s);", stringBuffer5.toString()));
                                    stringBuffer5.setLength(0);
                                    i9 -= 100;
                                    i12 = 100;
                                    z5 = true;
                                }
                                if (i10 >= i12) {
                                    b.this.f2756h.execSQL(String.format("INSERT OR REPLACE INTO AP (id,x,y,r,cl,timestamp) VALUES %s;", stringBuffer6.toString()));
                                    stringBuffer6.setLength(0);
                                    i10 -= 100;
                                    z7 = true;
                                }
                                if (i11 > 0) {
                                    b.this.f2756h.execSQL(String.format("DELETE FROM AP WHERE id IN (%s);", stringBuffer4.toString()));
                                }
                                str5 = str11;
                                str10 = str3;
                                jSONObject = jSONObject4;
                                itKeys2 = it;
                                str9 = str9;
                                jSONObject6 = jSONObject6;
                            }
                            str4 = str5;
                            if (i9 > 0) {
                                b.this.f2757i.execSQL(String.format("DELETE FROM AP WHERE id IN (%s);", stringBuffer5.toString()));
                            }
                            if (i10 > 0) {
                                b.this.f2756h.execSQL(String.format("INSERT OR REPLACE INTO AP (id,x,y,r,cl,timestamp) VALUES %s;", stringBuffer6.toString()));
                            }
                            if (i11 > 0) {
                                b.this.f2756h.execSQL(String.format("DELETE FROM AP WHERE id IN (%s);", stringBuffer4.toString()));
                            }
                        }
                        String str12 = str4;
                        b.this.f2756h.execSQL(String.format(str12, "AP", "AP", 200000));
                        b.this.f2756h.execSQL(String.format(str12, str2, str2, 200000));
                        b.this.f2757i.execSQL(String.format("DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY frequency DESC LIMIT %d);", "AP", "AP", 10000));
                        b.this.f2757i.execSQL(String.format("DELETE FROM %s WHERE id NOT IN (SELECT id FROM %s ORDER BY frequency DESC LIMIT %d);", str2, str2, 10000));
                        if (jSONObject4 != null) {
                            JSONObject jSONObject7 = jSONObject4;
                            if (!jSONObject7.has(str3) && !jSONObject7.has(str)) {
                                d.this.n();
                            }
                        }
                        b.this.f2756h.setTransactionSuccessful();
                        b.this.f2757i.setTransactionSuccessful();
                        if (b.this.f2756h != null && b.this.f2756h.isOpen()) {
                            b.this.f2756h.endTransaction();
                        }
                        if (b.this.f2757i != null && b.this.f2757i.isOpen()) {
                            bVar = b.this;
                            bVar.f2757i.endTransaction();
                        }
                    } catch (Exception unused2) {
                        d.this.n();
                        if (b.this.f2756h != null && b.this.f2756h.isOpen()) {
                            b.this.f2756h.endTransaction();
                        }
                        if (b.this.f2757i != null && b.this.f2757i.isOpen()) {
                            bVar = b.this;
                        }
                    } finally {
                        try {
                            if (b.this.f2756h != null && b.this.f2756h.isOpen()) {
                                b.this.f2756h.endTransaction();
                            }
                            if (b.this.f2757i != null && b.this.f2757i.isOpen()) {
                                b.this.f2757i.endTransaction();
                            }
                        } catch (Exception unused3) {
                        }
                        d dVar = d.this;
                        dVar.f3381c = null;
                        dVar.f2780n = false;
                    }
                } catch (Exception unused4) {
                }
            }
        }

        public d(b bVar, boolean z2) {
            this.f2779m = bVar;
            this.f2777k = z2 ? "load" : "update";
            this.f3382d = new HashMap();
            this.f2776j = i.d.f2824j;
        }

        @Override // n.g
        public void a() {
            this.f2780n = true;
            this.f3379a = this.f2776j;
            this.f3382d.clear();
            this.f3382d.put("qt", this.f2777k);
            this.f3382d.put("req", this.f2778l);
        }

        @Override // n.g
        public void h(boolean z2) {
            if (z2 && this.f3381c != null) {
                new a().start();
            } else {
                this.f2780n = false;
                n();
            }
        }

        public final void l(String str, String str2, String str3) {
            this.f2778l = str3;
            this.f2776j = String.format("http://%s/%s", str, str2);
            f(false, "ofloc.map.baidu.com");
        }

        public final void n() {
            this.f2781o++;
            this.f2782p = System.currentTimeMillis();
        }

        public final String p() {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject();
                jSONObject.put("type", "0");
                jSONObject.put("cuid", n.b.g().f3351c);
                jSONObject.put("ver", "1");
                jSONObject.put("prod", n.b.f3345g + ":" + n.b.f3344f);
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return Jni.i(jSONObject.toString());
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:104:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:112:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:24:0x0094 A[Catch: all -> 0x00f4, Exception -> 0x0116, TryCatch #16 {Exception -> 0x0116, all -> 0x00f4, blocks: (B:22:0x008e, B:24:0x0094, B:25:0x009d, B:27:0x00a3, B:28:0x00ae, B:29:0x00b3, B:31:0x00ba, B:33:0x00ca, B:36:0x00e9), top: B:104:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00a3 A[Catch: all -> 0x00f4, Exception -> 0x0116, LOOP:0: B:25:0x009d->B:27:0x00a3, LOOP_END, TryCatch #16 {Exception -> 0x0116, all -> 0x00f4, blocks: (B:22:0x008e, B:24:0x0094, B:25:0x009d, B:27:0x00a3, B:28:0x00ae, B:29:0x00b3, B:31:0x00ba, B:33:0x00ca, B:36:0x00e9), top: B:104:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e9 A[Catch: all -> 0x00f4, Exception -> 0x0116, TRY_LEAVE, TryCatch #16 {Exception -> 0x0116, all -> 0x00f4, blocks: (B:22:0x008e, B:24:0x0094, B:25:0x009d, B:27:0x00a3, B:28:0x00ae, B:29:0x00b3, B:31:0x00ba, B:33:0x00ca, B:36:0x00e9), top: B:104:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0122  */
        /* JADX WARN: Code duplicated, block: B:71:0x014b  */
        /* JADX WARN: Code duplicated, block: B:73:0x014e  */
        /* JADX WARN: Code duplicated, block: B:86:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x011d A[EXC_TOP_SPLITTER, PHI: r6 r7 r8
          0x011d: PHI (r6v2 org.json.JSONObject) = (r6v1 org.json.JSONObject), (r6v4 org.json.JSONObject) binds: [B:61:0x011b, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE]
          0x011d: PHI (r7v4 android.database.Cursor) = (r7v3 android.database.Cursor), (r7v8 android.database.Cursor) binds: [B:61:0x011b, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE]
          0x011d: PHI (r8v3 android.database.Cursor) = (r8v2 android.database.Cursor), (r8v13 android.database.Cursor) binds: [B:61:0x011b, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        public final String q() {
            Cursor cursor;
            Cursor cursorRawQuery;
            JSONObject jSONObject;
            Cursor cursorRawQuery2;
            String str;
            int count;
            JSONArray jSONArray;
            Cursor cursor2 = null;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject = new JSONObject();
                    try {
                        int count2 = 0;
                        cursorRawQuery2 = b.this.f2757i.rawQuery(String.format("SELECT * FROM %s WHERE frequency>%d ORDER BY frequency DESC LIMIT %d;", "CL", 5, 50), null);
                        if (cursorRawQuery2 != null) {
                            try {
                                try {
                                    if (cursorRawQuery2.moveToFirst()) {
                                        count = cursorRawQuery2.getCount();
                                        JSONArray jSONArray2 = new JSONArray();
                                        while (!cursorRawQuery2.isAfterLast()) {
                                            try {
                                                jSONArray2.put(cursorRawQuery2.getString(1));
                                                cursorRawQuery2.moveToNext();
                                                cursor2 = null;
                                            } catch (Exception unused) {
                                                cursor = null;
                                                cursorRawQuery = cursor;
                                                if (cursorRawQuery != null) {
                                                    try {
                                                        cursorRawQuery.close();
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                                if (cursorRawQuery2 != null) {
                                                    try {
                                                        cursorRawQuery2.close();
                                                    } catch (Exception unused3) {
                                                    }
                                                }
                                                if (jSONObject != null) {
                                                    str = cursor;
                                                } else {
                                                    str = cursor;
                                                }
                                                if (jSONObject == null) {
                                                    return str;
                                                }
                                            }
                                        }
                                        jSONObject2.put("cell", jSONArray2);
                                    } else {
                                        count = 0;
                                    }
                                    try {
                                        cursor = null;
                                        try {
                                            cursorRawQuery = b.this.f2757i.rawQuery(String.format("SELECT * FROM %s WHERE frequency>%d ORDER BY frequency DESC LIMIT %d;", "AP", 5, 50), null);
                                            if (cursorRawQuery != null) {
                                                try {
                                                    if (cursorRawQuery.moveToFirst()) {
                                                        count2 = cursorRawQuery.getCount();
                                                        jSONArray = new JSONArray();
                                                        while (!cursorRawQuery.isAfterLast()) {
                                                            jSONArray.put(cursorRawQuery.getString(1));
                                                            cursorRawQuery.moveToNext();
                                                        }
                                                        jSONObject2.put("ap", jSONArray);
                                                    }
                                                } catch (Exception unused4) {
                                                    if (cursorRawQuery != null) {
                                                        cursorRawQuery.close();
                                                    }
                                                    if (cursorRawQuery2 != null) {
                                                        cursorRawQuery2.close();
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursor2 = cursorRawQuery;
                                                    if (cursor2 != null) {
                                                        try {
                                                            cursor2.close();
                                                        } catch (Exception unused5) {
                                                        }
                                                    }
                                                    if (cursorRawQuery2 == null) {
                                                        throw th;
                                                    }
                                                    try {
                                                        cursorRawQuery2.close();
                                                        throw th;
                                                    } catch (Exception unused6) {
                                                        throw th;
                                                    }
                                                }
                                            }
                                            jSONObject.put("type", "1");
                                            jSONObject.put("cuid", n.b.g().f3351c);
                                            jSONObject.put("ver", "1");
                                            jSONObject.put("prod", n.b.f3345g + ":" + n.b.f3344f);
                                            if (count == 0 || count2 != 0) {
                                                jSONObject.put("model", jSONObject2);
                                            }
                                            if (cursorRawQuery != null) {
                                                try {
                                                    cursorRawQuery.close();
                                                } catch (Exception unused7) {
                                                }
                                            }
                                            if (cursorRawQuery2 != null) {
                                                cursorRawQuery2.close();
                                            }
                                        } catch (Exception unused8) {
                                            cursorRawQuery = cursor;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (cursorRawQuery2 != null) {
                                                cursorRawQuery2.close();
                                            }
                                            if (jSONObject != null) {
                                                str = cursor;
                                            } else {
                                                str = cursor;
                                            }
                                            if (jSONObject == null) {
                                                return str;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (cursorRawQuery2 == null) {
                                                throw th;
                                            }
                                            cursorRawQuery2.close();
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor = null;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor2 = null;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (cursorRawQuery2 == null) {
                                        throw th;
                                    }
                                    cursorRawQuery2.close();
                                    throw th;
                                }
                            } catch (Exception unused9) {
                                cursor = cursor2;
                                cursorRawQuery = cursor;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (cursorRawQuery2 != null) {
                                    cursorRawQuery2.close();
                                }
                                if (jSONObject != null) {
                                    str = cursor;
                                } else {
                                    str = cursor;
                                }
                                if (jSONObject == null) {
                                    return str;
                                }
                            }
                        } else {
                            count = 0;
                            cursor = null;
                            cursorRawQuery = b.this.f2757i.rawQuery(String.format("SELECT * FROM %s WHERE frequency>%d ORDER BY frequency DESC LIMIT %d;", "AP", 5, 50), null);
                            if (cursorRawQuery != null) {
                                if (cursorRawQuery.moveToFirst()) {
                                    count2 = cursorRawQuery.getCount();
                                    jSONArray = new JSONArray();
                                    while (!cursorRawQuery.isAfterLast()) {
                                        jSONArray.put(cursorRawQuery.getString(1));
                                        cursorRawQuery.moveToNext();
                                    }
                                    jSONObject2.put("ap", jSONArray);
                                }
                            }
                            jSONObject.put("type", "1");
                            jSONObject.put("cuid", n.b.g().f3351c);
                            jSONObject.put("ver", "1");
                            jSONObject.put("prod", n.b.f3345g + ":" + n.b.f3344f);
                            if (count == 0) {
                                jSONObject.put("model", jSONObject2);
                            } else {
                                jSONObject.put("model", jSONObject2);
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            if (cursorRawQuery2 != null) {
                                cursorRawQuery2.close();
                            }
                        }
                    } catch (Exception unused10) {
                        cursor = null;
                        cursorRawQuery = null;
                        cursorRawQuery2 = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cursorRawQuery2 = null;
                }
            } catch (Exception unused11) {
                cursor = null;
                cursorRawQuery = null;
                jSONObject = null;
                cursorRawQuery2 = null;
            }
            if (jSONObject != null || jSONObject.has("model")) {
                str = cursor;
            } else {
                long j2 = this.f2785s;
                if (j2 == -1 || j2 + 86400000 < System.currentTimeMillis()) {
                    String strI = Jni.i(jSONObject.toString());
                    this.f2785s = System.currentTimeMillis();
                    str = strI;
                } else {
                    str = cursor;
                }
            }
            return (jSONObject == null || !jSONObject.has("model")) ? str : Jni.i(jSONObject.toString());
        }

        public final String r() {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", "2");
                    jSONObject.put("ver", "1");
                    jSONObject.put("cuid", n.b.g().f3351c);
                    jSONObject.put("prod", n.b.f3345g + ":" + n.b.f3344f);
                    this.f2784r = System.currentTimeMillis();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return Jni.i(jSONObject.toString());
            }
            return null;
        }

        public final String s() {
            JSONObject jSONObject;
            try {
                JSONObject jSONObjectK = b.this.f2749a.q().k();
                if (jSONObjectK != null) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", "3");
                        jSONObject.put("ver", "1");
                        jSONObject.put("cuid", n.b.g().f3351c);
                        jSONObject.put("prod", n.b.f3345g + ":" + n.b.f3344f);
                        jSONObject.put("rgc", jSONObjectK);
                        this.f2784r = System.currentTimeMillis();
                    } catch (Exception unused) {
                    }
                } else {
                    jSONObject = null;
                }
            } catch (Exception unused2) {
            }
            if (jSONObject != null) {
                return Jni.i(jSONObject.toString());
            }
            return null;
        }

        public final boolean t() {
            Cursor cursor;
            Cursor cursor2;
            Cursor cursorRawQuery = null;
            boolean z2 = true;
            try {
                Cursor cursorRawQuery2 = b.this.f2756h.rawQuery("SELECT COUNT(*) FROM AP;", null);
                try {
                    cursorRawQuery = b.this.f2756h.rawQuery("SELECT COUNT(*) FROM CL", null);
                    if (cursorRawQuery2 != null && cursorRawQuery2.moveToFirst() && cursorRawQuery != null && cursorRawQuery.moveToFirst() && (cursorRawQuery2.getInt(0) != 0 || cursorRawQuery.getInt(0) != 0)) {
                        z2 = false;
                    }
                    if (cursorRawQuery2 != null) {
                        try {
                            cursorRawQuery2.close();
                        } catch (Exception unused) {
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Exception unused3) {
                    cursor2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused4) {
                        }
                    }
                    if (cursor2 != null) {
                        cursorRawQuery = cursor2;
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (cursor == null) {
                        throw th;
                    }
                    try {
                        cursor.close();
                        throw th;
                    } catch (Exception unused6) {
                        throw th;
                    }
                }
            } catch (Exception unused7) {
                cursor2 = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
            return z2;
        }

        public final boolean u() {
            if (this.f2781o < 2) {
                return true;
            }
            if (this.f2782p + 43200000 >= System.currentTimeMillis()) {
                return false;
            }
            this.f2781o = 0;
            this.f2782p = -1L;
            return true;
        }

        public void v() {
            if (!u() || this.f2780n) {
                return;
            }
            b.this.f2755g.w();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        /* JADX WARN: Code duplicated, block: B:17:0x003b  */
        /* JADX WARN: Code duplicated, block: B:19:0x004b  */
        /* JADX WARN: Code duplicated, block: B:20:0x0050  */
        /* JADX WARN: Code duplicated, block: B:24:0x005a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0066  */
        /* JADX WARN: Code duplicated, block: B:27:0x006a  */
        /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
        public final void w() {
            String strQ;
            ExecutorService executorServiceC;
            long j2;
            String strS;
            this.f2778l = null;
            if (t()) {
                long j3 = this.f2783q;
                if (j3 == -1 || j3 + 86400000 <= System.currentTimeMillis()) {
                    strQ = p();
                }
                if (this.f2778l == null) {
                    j2 = this.f2784r;
                    if (j2 != -1 || j2 + 86400000 <= System.currentTimeMillis()) {
                        if (b.this.f2749a.q().l()) {
                            strS = r();
                        } else {
                            strS = s();
                        }
                        this.f2778l = strS;
                    }
                }
                if (this.f2778l != null) {
                    executorServiceC = w.b().c();
                    if (executorServiceC != null) {
                        c(executorServiceC, "https://ofloc.map.baidu.com/offline_loc");
                    } else {
                        b("https://ofloc.map.baidu.com/offline_loc");
                    }
                }
            }
            strQ = q();
            this.f2778l = strQ;
            if (this.f2778l == null) {
                j2 = this.f2784r;
                if (j2 != -1) {
                    if (b.this.f2749a.q().l()) {
                        strS = r();
                    } else {
                        strS = s();
                    }
                    this.f2778l = strS;
                } else {
                    if (b.this.f2749a.q().l()) {
                        strS = r();
                    } else {
                        strS = s();
                    }
                    this.f2778l = strS;
                }
            }
            if (this.f2778l != null) {
                executorServiceC = w.b().c();
                if (executorServiceC != null) {
                    c(executorServiceC, "https://ofloc.map.baidu.com/offline_loc");
                } else {
                    b("https://ofloc.map.baidu.com/offline_loc");
                }
            }
        }
    }

    public b(i.d dVar) {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        this.f2749a = dVar;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase2 = null;
        try {
            File file = new File(dVar.r(), "ofl_location.db");
            if (!file.exists()) {
                file.createNewFile();
            }
            sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        } catch (Exception unused) {
            sQLiteDatabaseOpenOrCreateDatabase = null;
        }
        this.f2756h = sQLiteDatabaseOpenOrCreateDatabase;
        if (sQLiteDatabaseOpenOrCreateDatabase != null) {
            try {
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS AP (id LONG PRIMARY KEY,x DOUBLE,y DOUBLE,r INTEGER,cl DOUBLE,timestamp INTEGER, frequency INTEGER DEFAULT 0);");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS CL (id LONG PRIMARY KEY,x DOUBLE,y DOUBLE,r INTEGER,cl DOUBLE,timestamp INTEGER, frequency INTEGER DEFAULT 0);");
            } catch (Exception unused2) {
            }
        }
        try {
            File file2 = new File(this.f2749a.r(), "ofl_statistics.db");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            sQLiteDatabaseOpenOrCreateDatabase2 = SQLiteDatabase.openOrCreateDatabase(file2, (SQLiteDatabase.CursorFactory) null);
        } catch (Exception unused3) {
        }
        this.f2757i = sQLiteDatabaseOpenOrCreateDatabase2;
        if (sQLiteDatabaseOpenOrCreateDatabase2 != null) {
            try {
                sQLiteDatabaseOpenOrCreateDatabase2.execSQL("CREATE TABLE IF NOT EXISTS AP (id LONG PRIMARY KEY, originid VARCHAR(15), frequency INTEGER DEFAULT 0);");
                sQLiteDatabaseOpenOrCreateDatabase2.execSQL("CREATE TABLE IF NOT EXISTS CL (id LONG PRIMARY KEY, originid VARCHAR(40), frequency INTEGER DEFAULT 0);");
            } catch (Exception unused4) {
            }
        }
    }

    public final double a(double d2, double d3, double d4, double d5) {
        double radians = Math.toRadians(d2);
        Math.toRadians(d3);
        double radians2 = Math.toRadians(d4);
        Math.toRadians(d5);
        double radians3 = Math.toRadians(d5 - d3);
        double radians4 = Math.toRadians(d4 - d2) / 2.0d;
        double d6 = radians3 / 2.0d;
        double dSin = (Math.sin(radians4) * Math.sin(radians4)) + (Math.cos(radians) * Math.cos(radians2) * Math.sin(d6) * Math.sin(d6));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * 6378137.0d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    public final int b(ArrayList<C0030b> arrayList, double d2) {
        boolean z2;
        int i2 = 0;
        if (arrayList.size() == 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            if (arrayList.size() >= 3) {
                double d3 = 0.0d;
                double d4 = 0.0d;
                for (int i4 = i2; i4 < arrayList.size(); i4++) {
                    d4 += arrayList.get(i4).f2765a;
                    d3 += arrayList.get(i4).f2766b;
                }
                double size = d4 / ((double) arrayList.size());
                double size2 = d3 / ((double) arrayList.size());
                double d5 = -1.0d;
                int i5 = i2;
                int i6 = -1;
                while (i5 < arrayList.size()) {
                    double d6 = size;
                    int i7 = i5;
                    int i8 = i6;
                    double dA = a(size2, d6, arrayList.get(i5).f2766b, arrayList.get(i5).f2765a);
                    if (dA > d5) {
                        d5 = dA;
                        i6 = i7;
                    } else {
                        i6 = i8;
                    }
                    i5 = i7 + 1;
                    size = d6;
                }
                int i9 = i6;
                if (d5 <= d2 || i9 < 0 || i9 >= arrayList.size()) {
                    z2 = false;
                } else {
                    i3++;
                    arrayList.remove(i9);
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                return i3;
            }
            i2 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    public Cursor c(e.a aVar) throws Throwable {
        b1.c cVarG;
        Double d2;
        Double dValueOf;
        Double d3;
        Double d4;
        int i2;
        b1.c cVar;
        int i3;
        List<i> listJ;
        int i4;
        String str;
        b1.c cVar2;
        String string;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        b1.c cVar3 = new b1.c();
        cVar3.o0(67);
        if (aVar.f2848c) {
            String str2 = aVar.f2847b;
            LinkedHashMap<String, Integer> linkedHashMap = aVar.f2854i;
            int i5 = aVar.f2851f;
            b1.c cVar4 = aVar.f2852g;
            long jH = Long.MIN_VALUE;
            b1.c cVarF = (str2 == null || this.f2756h == null || (jH = Jni.h(str2)) == null) ? null : f(jH);
            if (linkedHashMap == null || linkedHashMap.size() <= 0 || this.f2756h == null) {
                cVarG = null;
            } else {
                this.f2761m.clear();
                this.f2760l.clear();
                this.f2762n.clear();
                cVarG = g(linkedHashMap, cVarF, i5);
            }
            if (cVarF != null) {
                dValueOf4 = Double.valueOf(cVarF.x());
                dValueOf = Double.valueOf(cVarF.u());
                double[] dArrD = Jni.d(cVarF.x(), cVarF.u(), "bd09ll2gcj");
                cVarF.V("gcj02");
                cVarF.n0(dArrD[1]);
                cVarF.t0(dArrD[0]);
                cVarF.w0("cl");
            } else {
                d2 = null;
                dValueOf = null;
            }
            if (cVarG != null) {
                dValueOf2 = Double.valueOf(cVarG.x());
                dValueOf3 = Double.valueOf(cVarG.u());
                double[] dArrD2 = Jni.d(cVarG.x(), cVarG.u(), "bd09ll2gcj");
                cVarG.V("gcj02");
                cVarG.n0(dArrD2[1]);
                cVarG.t0(dArrD2[0]);
                cVarG.w0("wf");
            } else {
                d3 = null;
                d4 = null;
            }
            if (cVarF != null && cVarG == null) {
                i2 = 1;
            } else if (cVarF != null || cVarG == null) {
                i2 = (cVarF == null || cVarG == null) ? 0 : 4;
            } else {
                i2 = 2;
            }
            boolean z2 = aVar.f2851f > 0;
            boolean z3 = linkedHashMap == 0 || linkedHashMap.size() <= 0;
            if (z2) {
                if (cVarG != null) {
                    d2 = d3;
                    dValueOf = d4;
                    cVar = cVarG;
                } else if (!z3 || cVarF == null) {
                    cVar = cVar3;
                    d2 = null;
                    dValueOf = null;
                } else {
                    cVar = cVarF;
                }
            } else if (cVarG != null) {
                d2 = d3;
                dValueOf = d4;
                cVar = cVarG;
            } else if (cVarF != null) {
                cVar = cVarF;
            } else {
                cVar = cVar3;
                d2 = null;
                dValueOf = null;
            }
            if (aVar.f2850e && this.f2749a.l().Z() && dValueOf != null && d2 != null) {
                cVar.Q(this.f2749a.q().c(d2.doubleValue(), dValueOf.doubleValue()));
            }
            if (z2 && aVar.f2850e && cVar.c() == null) {
                cVar = cVar3;
                i3 = 0;
                d2 = null;
                dValueOf = null;
            } else {
                i3 = i2;
            }
            if ((!aVar.f2849d && !aVar.f2853h) || dValueOf == null || d2 == null) {
                listJ = null;
            } else {
                listJ = this.f2749a.q().j(d2.doubleValue(), dValueOf.doubleValue());
                if (aVar.f2849d) {
                    cVar.z0(listJ);
                }
            }
            if (z2 && aVar.f2849d && (listJ == null || listJ.size() <= 0)) {
                cVar = cVar3;
                i3 = 0;
            }
            if (!aVar.f2853h || listJ == null || listJ.size() <= 0) {
                i4 = 0;
                str = null;
            } else {
                i4 = 0;
                str = String.format(Locale.CHINA, "在%s附近", listJ.get(0).c());
                cVar.q0(str);
            }
            if (z2 && aVar.f2853h && str == null) {
                cVar2 = cVar3;
            } else {
                cVar2 = cVar;
                i4 = i3;
            }
            StringBuffer stringBuffer = new StringBuffer();
            String str3 = aVar.f2846a;
            if (str3 != null) {
                stringBuffer.append(str3);
                stringBuffer.append(e.d(cVarG, cVarF, aVar));
                stringBuffer.append(e.c(cVar2, i4));
                string = stringBuffer.toString();
            } else {
                string = null;
            }
            new a(this, str2, jH, cVarF, cVarG, cVar4, string, linkedHashMap).start();
            cVar3 = cVar2;
        }
        return e.a(cVar3);
    }

    public SQLiteDatabase d() {
        return this.f2757i;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca A[EXC_TOP_SPLITTER, PHI: r0 r1 r3 r6 r7
      0x00ca: PHI (r0v6 int) = (r0v5 int), (r0v12 int) binds: [B:41:0x00c8, B:33:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r1v3 double) = (r1v2 double), (r1v6 double) binds: [B:41:0x00c8, B:33:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r3v6 android.database.Cursor) = (r3v5 android.database.Cursor), (r3v7 android.database.Cursor) binds: [B:41:0x00c8, B:33:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r6v4 boolean) = (r6v3 boolean), (r6v6 boolean) binds: [B:41:0x00c8, B:33:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r7v4 double) = (r7v3 double), (r7v7 double) binds: [B:41:0x00c8, B:33:0x00ba] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final b1.c f(Long l2) throws Throwable {
        double d2;
        int i2;
        Cursor cursorRawQuery;
        double d3;
        int i3 = 0;
        this.f2764p = false;
        Long l3 = this.f2753e;
        Cursor cursor = null;
        boolean z2 = true;
        if (l3 == null || !l3.equals(l2)) {
            d2 = 0.0d;
            try {
                cursorRawQuery = this.f2756h.rawQuery(String.format(Locale.US, "SELECT * FROM CL WHERE id = %d AND timestamp + %d > %d;", l2, 15552000, Long.valueOf(System.currentTimeMillis() / 1000)), null);
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (!cursorRawQuery.moveToFirst() || cursorRawQuery.getDouble(cursorRawQuery.getColumnIndex("cl")) <= 0.0d) {
                                i2 = 0;
                                z2 = false;
                                d3 = 0.0d;
                            } else {
                                try {
                                    double d4 = cursorRawQuery.getDouble(cursorRawQuery.getColumnIndex("x"));
                                    try {
                                        d2 = cursorRawQuery.getDouble(cursorRawQuery.getColumnIndex("y"));
                                        i3 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("r"));
                                        if (cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("timestamp")) + 604800 < System.currentTimeMillis() / 1000) {
                                            this.f2764p = true;
                                        }
                                        int i4 = 300;
                                        if (i3 < 300) {
                                            i3 = i4;
                                        } else {
                                            i4 = 2000;
                                            if (2000 < i3) {
                                                i3 = i4;
                                            }
                                        }
                                        this.f2751c = d4;
                                        this.f2752d = d2;
                                        this.f2750b = i3;
                                        this.f2753e = l2;
                                        i2 = i3;
                                        d3 = d4;
                                    } catch (Exception unused) {
                                        i2 = i3;
                                        d3 = d4;
                                        if (cursorRawQuery != null) {
                                            try {
                                                cursorRawQuery.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    }
                                } catch (Exception unused3) {
                                    i2 = 0;
                                    d3 = 0.0d;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (z2) {
                                        return null;
                                    }
                                    b1.c cVar = new b1.c();
                                    cVar.B0(i2);
                                    cVar.n0(d2);
                                    cVar.t0(d3);
                                    cVar.w0("cl");
                                    cVar.o0(66);
                                    return cVar;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused5) {
                        i2 = 0;
                        z2 = false;
                    }
                } else {
                    i2 = 0;
                    z2 = false;
                    d3 = 0.0d;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception unused6) {
                i2 = 0;
                z2 = false;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            d3 = this.f2751c;
            d2 = this.f2752d;
            i2 = this.f2750b;
        }
        if (z2) {
            return null;
        }
        b1.c cVar2 = new b1.c();
        cVar2.B0(i2);
        cVar2.n0(d2);
        cVar2.t0(d3);
        cVar2.w0("cl");
        cVar2.o0(66);
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x030a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0333  */
    /* JADX WARN: Code duplicated, block: B:147:0x033b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0355  */
    /* JADX WARN: Code duplicated, block: B:163:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x028c A[PHI: r1
      0x028c: PHI (r1v35 int) = (r1v32 int), (r1v33 int) binds: [B:91:0x028a, B:94:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final b1.c g(LinkedHashMap<String, Integer> linkedHashMap, b1.c cVar, int i2) throws Throwable {
        int i3;
        double dU;
        double dX;
        int i4;
        Cursor cursor;
        double d2;
        double d3;
        Cursor cursor2;
        int i5;
        int i6;
        int i7;
        Cursor cursor3;
        double d4;
        Cursor cursor4;
        double d5;
        int i8;
        int i9;
        int i10;
        ArrayList<C0030b> arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        this.f2763o.setLength(0);
        int i16 = 1;
        if (cVar != null) {
            dU = cVar.u();
            dX = cVar.x();
            i3 = 1;
        } else {
            i3 = 0;
            dU = 0.0d;
            dX = 0.0d;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<Map.Entry<String, Integer>> it = linkedHashMap.entrySet().iterator();
        int i17 = 0;
        boolean z2 = true;
        while (true) {
            i4 = 30;
            if (i17 >= Math.min(linkedHashMap.size(), 30)) {
                break;
            }
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            Integer value = next.getValue();
            if (value.intValue() < 0) {
                value = Integer.valueOf(-value.intValue());
            }
            Long lH = Jni.h(key);
            if (lH != null) {
                this.f2762n.put(lH, key);
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                this.f2761m.put(lH, value);
                stringBuffer.append(lH);
            }
            i17++;
        }
        int i18 = 3;
        int i19 = 2;
        Cursor cursor5 = null;
        try {
            Cursor cursorRawQuery = this.f2756h.rawQuery(String.format(Locale.US, "SELECT * FROM AP WHERE id IN (%s) AND timestamp+%d>%d;", stringBuffer, 7776000, Long.valueOf(System.currentTimeMillis() / 1000)), null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        ArrayList<C0030b> arrayList2 = new ArrayList<>();
                        while (!cursorRawQuery.isAfterLast()) {
                            Long lValueOf = Long.valueOf(cursorRawQuery.getLong(i15));
                            double d6 = cursorRawQuery.getDouble(i16);
                            double d7 = cursorRawQuery.getDouble(i19);
                            int i20 = cursorRawQuery.getInt(i18);
                            double d8 = cursorRawQuery.getDouble(4);
                            int i21 = cursorRawQuery.getInt(5);
                            this.f2760l.add(lValueOf);
                            Cursor cursor6 = cursorRawQuery;
                            try {
                                if (i21 + 604800 < System.currentTimeMillis() / 1000) {
                                    try {
                                        if (this.f2763o.length() > 0) {
                                            this.f2763o.append(",");
                                        }
                                        StringBuffer stringBuffer2 = this.f2763o;
                                        Locale locale = Locale.US;
                                        Object[] objArr = new Object[i18];
                                        objArr[i15] = lValueOf;
                                        objArr[i16] = this.f2762n.get(lValueOf);
                                        objArr[i19] = 100000;
                                        stringBuffer2.append(String.format(locale, "(%d,\"%s\",%d)", objArr));
                                    } catch (Exception unused) {
                                        cursor4 = cursor6;
                                        d5 = 0.0d;
                                        cursor = null;
                                        d2 = d5;
                                        d3 = d2;
                                        cursor2 = cursor4;
                                        i6 = 0;
                                        i5 = 0;
                                        i7 = i6;
                                        if (cursor2 != null) {
                                            cursor3 = cursor2;
                                            try {
                                                cursor3.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        d4 = d3;
                                        if (i7 == 0) {
                                            return cursor;
                                        }
                                        b1.c cVar2 = new b1.c();
                                        cVar2.B0(i5);
                                        cVar2.n0(d4);
                                        cVar2.t0(d2);
                                        cVar2.w0("wf");
                                        cVar2.o0(66);
                                        return cVar2;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor5 = cursor6;
                                        if (cursor5 != null) {
                                            try {
                                                cursor5.close();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                if (d8 > 0.0d && d6 > 0.0d && d7 > 0.0d && i20 > 0 && i20 < 1000) {
                                    if (i3 == i16) {
                                        cursor4 = cursor6;
                                        cursor = null;
                                        arrayList = arrayList2;
                                        i11 = i19;
                                        i14 = 3;
                                        i12 = i3;
                                        i13 = i4;
                                        if (a(dU, dX, d7, d6) > 10000.0d) {
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                        i11 = i19;
                                        i12 = i3;
                                        i13 = i4;
                                        cursor4 = cursor6;
                                        cursor = null;
                                        i14 = 3;
                                    }
                                    int iMin = Math.min(100, Math.max(i13, this.f2761m.get(lValueOf).intValue()));
                                    arrayList.add(new C0030b(d6, d7, Math.exp(Math.pow(Math.max(50.0d, i20), 0.6d) * (-0.065d) * ((iMin > 70 ? ((double) (iMin - 70)) / 30.0d : ((double) (iMin - 70)) / 50.0d) + 1.0d)), null));
                                } else {
                                    arrayList = arrayList2;
                                    i11 = i19;
                                    i12 = i3;
                                    i13 = i4;
                                    cursor4 = cursor6;
                                    cursor = null;
                                    i14 = 3;
                                }
                                try {
                                    try {
                                        cursor4.moveToNext();
                                        i4 = i13;
                                        arrayList2 = arrayList;
                                        i19 = i11;
                                        cursor5 = cursor;
                                        cursorRawQuery = cursor4;
                                        i18 = i14;
                                        i3 = i12;
                                        i15 = 0;
                                        i16 = 1;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor5 = cursor4;
                                        if (cursor5 != null) {
                                            cursor5.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused4) {
                                    d5 = 0.0d;
                                    d2 = d5;
                                    d3 = d2;
                                    cursor2 = cursor4;
                                    i6 = 0;
                                    i5 = 0;
                                    i7 = i6;
                                    if (cursor2 != null) {
                                        cursor3 = cursor2;
                                        cursor3.close();
                                    }
                                    d4 = d3;
                                    if (i7 == 0) {
                                        return cursor;
                                    }
                                    b1.c cVar3 = new b1.c();
                                    cVar3.B0(i5);
                                    cVar3.n0(d4);
                                    cVar3.t0(d2);
                                    cVar3.w0("wf");
                                    cVar3.o0(66);
                                    return cVar3;
                                }
                            } catch (Exception unused5) {
                                cursor4 = cursor6;
                                cursor = null;
                                d5 = 0.0d;
                                d2 = d5;
                                d3 = d2;
                                cursor2 = cursor4;
                                i6 = 0;
                                i5 = 0;
                                i7 = i6;
                                if (cursor2 != null) {
                                    cursor3 = cursor2;
                                    cursor3.close();
                                }
                                d4 = d3;
                                if (i7 == 0) {
                                    return cursor;
                                }
                                b1.c cVar4 = new b1.c();
                                cVar4.B0(i5);
                                cVar4.n0(d4);
                                cVar4.t0(d2);
                                cVar4.w0("wf");
                                cVar4.o0(66);
                                return cVar4;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor4 = cursor6;
                                cursor5 = cursor4;
                                if (cursor5 != null) {
                                    cursor5.close();
                                }
                                throw th;
                            }
                        }
                        ArrayList<C0030b> arrayList3 = arrayList2;
                        cursor = cursor5;
                        cursor4 = cursorRawQuery;
                        int i22 = i3;
                        b(arrayList3, 1000.0d);
                        double d9 = 0.0d;
                        double d10 = 0.0d;
                        double d11 = 0.0d;
                        int i23 = 0;
                        while (i23 < arrayList3.size()) {
                            C0030b c0030b = arrayList3.get(i23);
                            double d12 = c0030b.f2767c;
                            if (d12 > 0.0d) {
                                d9 += c0030b.f2765a * d12;
                                d11 += c0030b.f2766b * d12;
                                d10 += d12;
                            }
                            i23++;
                            arrayList3 = arrayList3;
                        }
                        ArrayList<C0030b> arrayList4 = arrayList3;
                        if (d10 <= 0.0d || d9 <= 0.0d || d11 <= 0.0d) {
                            d2 = 0.0d;
                            d3 = 0.0d;
                            i6 = 0;
                            i5 = 0;
                        } else {
                            d2 = d9 / d10;
                            double d13 = d11 / d10;
                            float fA = 0.0f;
                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                try {
                                    ArrayList<C0030b> arrayList5 = arrayList4;
                                    arrayList4 = arrayList5;
                                    fA = (float) (((double) fA) + a(d2, d13, arrayList5.get(i24).f2765a, arrayList5.get(i24).f2766b));
                                } catch (Exception unused6) {
                                    d3 = d13;
                                    cursor2 = cursor4;
                                    i6 = 1;
                                    i5 = 0;
                                    i7 = i6;
                                    if (cursor2 != null) {
                                        cursor3 = cursor2;
                                        cursor3.close();
                                    }
                                    d4 = d3;
                                    if (i7 == 0) {
                                        return cursor;
                                    }
                                    b1.c cVar5 = new b1.c();
                                    cVar5.B0(i5);
                                    cVar5.n0(d4);
                                    cVar5.t0(d2);
                                    cVar5.w0("wf");
                                    cVar5.o0(66);
                                    return cVar5;
                                }
                            }
                            int iRound = Math.round(fA / arrayList4.size());
                            int i25 = 30;
                            if (iRound < 30) {
                                d3 = d13;
                                i5 = i25;
                                i6 = 1;
                            } else {
                                i25 = 100;
                                if (100 < iRound) {
                                    d3 = d13;
                                    i5 = i25;
                                    i6 = 1;
                                } else {
                                    d3 = d13;
                                    i6 = 1;
                                    i5 = iRound;
                                }
                            }
                        }
                        if (i22 == 0) {
                            try {
                                if (arrayList4.size() <= 1) {
                                    i6 = 0;
                                }
                            } catch (Exception unused7) {
                                cursor2 = cursor4;
                                i7 = i6;
                                if (cursor2 != null) {
                                    cursor3 = cursor2;
                                    cursor3.close();
                                }
                                d4 = d3;
                                if (i7 == 0) {
                                    return cursor;
                                }
                                b1.c cVar6 = new b1.c();
                                cVar6.B0(i5);
                                cVar6.n0(d4);
                                cVar6.t0(d2);
                                cVar6.w0("wf");
                                cVar6.o0(66);
                                return cVar6;
                            }
                        }
                        if (arrayList4.size() >= i2 || (((double) arrayList4.size()) * 1.0d) / ((double) linkedHashMap.size()) >= 0.5d) {
                            i8 = i6;
                            i9 = 1;
                        } else {
                            i9 = 1;
                            i8 = 0;
                        }
                        if (i22 == i9 && i8 == i9) {
                            i10 = i8;
                            try {
                                if (a(dU, dX, d3, d2) > 10000.0d) {
                                }
                            } catch (Exception unused8) {
                                i6 = i10;
                                cursor2 = cursor4;
                                i7 = i6;
                                if (cursor2 != null) {
                                    cursor3 = cursor2;
                                }
                                d4 = d3;
                                if (i7 == 0) {
                                    return cursor;
                                }
                                b1.c cVar7 = new b1.c();
                                cVar7.B0(i5);
                                cVar7.n0(d4);
                                cVar7.t0(d2);
                                cVar7.w0("wf");
                                cVar7.o0(66);
                                return cVar7;
                            }
                        } else {
                            i10 = i8;
                        }
                        i7 = i10;
                    } else {
                        cursor = null;
                        cursor4 = cursorRawQuery;
                        d2 = 0.0d;
                        d3 = 0.0d;
                        i5 = 0;
                    }
                    i7 = 0;
                } catch (Exception unused9) {
                    cursor = cursor5;
                    cursor4 = cursorRawQuery;
                } catch (Throwable th4) {
                    th = th4;
                    cursor4 = cursorRawQuery;
                }
            } else {
                cursor = null;
                cursor4 = cursorRawQuery;
                d2 = 0.0d;
                d3 = 0.0d;
                i5 = 0;
                i7 = 0;
            }
            if (cursor4 != null) {
                cursor3 = cursor4;
                cursor3.close();
            }
        } catch (Exception unused10) {
            cursor = null;
            d2 = 0.0d;
            d3 = 0.0d;
            cursor2 = null;
        } catch (Throwable th5) {
            th = th5;
        }
        d4 = d3;
        if (i7 == 0) {
            return cursor;
        }
        b1.c cVar8 = new b1.c();
        cVar8.B0(i5);
        cVar8.n0(d4);
        cVar8.t0(d2);
        cVar8.w0("wf");
        cVar8.o0(66);
        return cVar8;
    }

    public final void i(b1.c cVar, b1.c cVar2, b1.c cVar3, String str, Long l2) {
        if (cVar == null || cVar.v() != 161) {
            return;
        }
        if (cVar2 != null && cVar.z() != null && cVar.z().equals("cl") && a(cVar2.u(), cVar2.x(), cVar.u(), cVar.x()) > 300.0d) {
            Locale locale = Locale.US;
            String str2 = String.format(locale, "UPDATE CL SET cl = 0 WHERE id = %d;", l2);
            String str3 = String.format(locale, "INSERT OR REPLACE INTO CL VALUES (%d,\"%s\",%d);", l2, str, 100000);
            try {
                this.f2756h.execSQL(str2);
                this.f2757i.execSQL(str3);
            } catch (Exception unused) {
            }
        }
        if (cVar3 == null || cVar.z() == null || !cVar.z().equals("wf") || a(cVar3.u(), cVar3.x(), cVar.u(), cVar.x()) <= 100.0d) {
            return;
        }
        try {
            String str4 = String.format("UPDATE AP SET cl = 0 WHERE id In (%s);", this.f2758j.toString());
            String str5 = String.format("INSERT OR REPLACE INTO AP VALUES %s;", this.f2759k.toString());
            this.f2756h.execSQL(str4);
            this.f2757i.execSQL(str5);
        } catch (Exception unused2) {
        }
    }

    public final void o(String str, Long l2, b1.c cVar) {
        String str2;
        SQLiteDatabase sQLiteDatabase;
        if (str != null) {
            try {
                if (cVar != null) {
                    str2 = String.format(Locale.US, "UPDATE CL SET frequency=frequency+1 WHERE id = %d;", l2);
                    sQLiteDatabase = this.f2756h;
                } else {
                    Locale locale = Locale.US;
                    String str3 = String.format(locale, "INSERT OR IGNORE INTO CL VALUES (%d,\"%s\",0);", l2, str);
                    str2 = String.format(locale, "UPDATE CL SET frequency=frequency+1 WHERE id = %d;", l2);
                    this.f2757i.execSQL(str3);
                    sQLiteDatabase = this.f2757i;
                }
                sQLiteDatabase.execSQL(str2);
            } catch (Exception unused) {
            }
            if (this.f2764p) {
                try {
                    this.f2757i.execSQL(String.format(Locale.US, "INSERT OR IGNORE INTO CL VALUES (%d,\"%s\",%d);", l2, str, 100000));
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void p(String str, String str2, String str3) {
        this.f2754f.l(str, str2, str3);
    }

    public final void q(LinkedHashMap<String, Integer> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            return;
        }
        this.f2758j = new StringBuffer();
        this.f2759k = new StringBuffer();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        ConcurrentMap<Long, Integer> concurrentMap = this.f2761m;
        if (concurrentMap != null && concurrentMap.keySet() != null) {
            boolean z2 = true;
            boolean z3 = true;
            for (Long l2 : this.f2761m.keySet()) {
                try {
                    if (this.f2760l.contains(l2)) {
                        if (z3) {
                            z3 = false;
                        } else {
                            this.f2758j.append(',');
                            this.f2759k.append(',');
                        }
                        this.f2758j.append(l2);
                        String str = this.f2762n.get(l2);
                        StringBuffer stringBuffer3 = this.f2759k;
                        stringBuffer3.append('(');
                        stringBuffer3.append(l2);
                        stringBuffer3.append(',');
                        stringBuffer3.append('\"');
                        stringBuffer3.append(str);
                        stringBuffer3.append('\"');
                        stringBuffer3.append(',');
                        stringBuffer3.append(100000);
                        stringBuffer3.append(')');
                    } else {
                        String str2 = this.f2762n.get(l2);
                        if (z2) {
                            z2 = false;
                        } else {
                            stringBuffer.append(',');
                            stringBuffer2.append(',');
                        }
                        stringBuffer.append(l2);
                        stringBuffer2.append('(');
                        stringBuffer2.append(l2);
                        stringBuffer2.append(',');
                        stringBuffer2.append('\"');
                        stringBuffer2.append(str2);
                        stringBuffer2.append('\"');
                        stringBuffer2.append(",0)");
                    }
                } catch (Exception unused) {
                }
            }
        }
        try {
            this.f2756h.execSQL(String.format(Locale.US, "UPDATE AP SET frequency=frequency+1 WHERE id IN(%s)", this.f2758j.toString()));
        } catch (Exception unused2) {
        }
        StringBuffer stringBuffer4 = this.f2763o;
        if (stringBuffer4 != null && stringBuffer4.length() > 0) {
            if (stringBuffer2.length() > 0) {
                stringBuffer2.append(",");
            }
            stringBuffer2.append(this.f2763o);
        }
        try {
            String str3 = String.format("INSERT OR IGNORE INTO AP VALUES %s;", stringBuffer2.toString());
            String str4 = String.format("UPDATE AP SET frequency=frequency+1 WHERE id in (%s);", stringBuffer.toString());
            if (stringBuffer2.length() > 0) {
                this.f2757i.execSQL(str3);
            }
            if (stringBuffer.length() > 0) {
                this.f2757i.execSQL(str4);
            }
        } catch (Exception unused3) {
        }
    }

    public final void r(String[] strArr) {
        this.f2749a.l().g(strArr);
    }

    public void u() {
        this.f2755g.v();
    }
}
