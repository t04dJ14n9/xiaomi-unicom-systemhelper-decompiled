package i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.baidu.location.Jni;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double[] f2866f = {45.0d, 135.0d, 225.0d, 315.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteDatabase f2869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2870d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2871e = -1;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f2872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f2873b;

        public b(double d2, double d3) {
            this.f2872a = d2;
            this.f2873b = d3;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f2874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f2875h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f2876i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c f2877j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ c[] f2878k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f2880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f2881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f2882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2883f;

        public static enum a extends c {
            public a(String str, int i2, String str2, String str3, String str4, int i3, int i4) {
                super(str, i2, str2, str3, str4, i3, i4);
            }

            @Override // i.g.c
            public List<String> f(JSONObject jSONObject, String str, int i2) {
                int i3;
                String str2;
                String str3 = "dist";
                String str4 = "ct";
                String str5 = "ctc";
                String str6 = "prov";
                String str7 = "cyc";
                String str8 = "cy";
                Iterator<String> itKeys = jSONObject.keys();
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Iterator<String> it = itKeys;
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        String string = jSONObject2.has(str8) ? jSONObject2.getString(str8) : null;
                        try {
                            String string2 = jSONObject2.has(str7) ? jSONObject2.getString(str7) : null;
                            try {
                                String string3 = jSONObject2.has(str6) ? jSONObject2.getString(str6) : null;
                                try {
                                    String string4 = jSONObject2.has(str5) ? jSONObject2.getString(str5) : null;
                                    try {
                                        String string5 = jSONObject2.has(str4) ? jSONObject2.getString(str4) : null;
                                        try {
                                            String string6 = jSONObject2.has(str3) ? jSONObject2.getString(str3) : null;
                                            if (stringBuffer.length() > 0) {
                                                str2 = str3;
                                                try {
                                                    stringBuffer.append(",");
                                                } catch (JSONException unused) {
                                                }
                                            } else {
                                                str2 = str3;
                                            }
                                            stringBuffer.append("(\"");
                                            stringBuffer.append(next);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string2);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string3);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string5);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string4);
                                            stringBuffer.append("\",\"");
                                            stringBuffer.append(string6);
                                            stringBuffer.append("\",");
                                            stringBuffer.append(System.currentTimeMillis() / 1000);
                                            stringBuffer.append(",\"\")");
                                            try {
                                                c.i(stringBuffer2, next, str, 0);
                                            } catch (JSONException unused2) {
                                            }
                                        } catch (JSONException unused3) {
                                            str2 = str3;
                                        }
                                    } catch (JSONException unused4) {
                                        str2 = str3;
                                        str4 = str4;
                                    }
                                } catch (JSONException unused5) {
                                    str2 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                }
                            } catch (JSONException unused6) {
                                str2 = str3;
                                str4 = str4;
                                str5 = str5;
                                str6 = str6;
                            }
                        } catch (JSONException unused7) {
                            str2 = str3;
                            str4 = str4;
                            str5 = str5;
                            str6 = str6;
                            str7 = str7;
                        }
                    } catch (JSONException unused8) {
                        str2 = str3;
                        str4 = str4;
                        str5 = str5;
                        str6 = str6;
                        str7 = str7;
                        str8 = str8;
                    }
                    if (i4 % 50 == 49 && stringBuffer.length() > 0) {
                        Locale locale = Locale.US;
                        arrayList.add(String.format(locale, "INSERT OR REPLACE INTO %s VALUES %s", "RGCAREA", stringBuffer));
                        arrayList.add(String.format(locale, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer2));
                        stringBuffer.setLength(0);
                    }
                    i4++;
                    itKeys = it;
                    str8 = str8;
                    str3 = str2;
                    str7 = str7;
                    str6 = str6;
                    str5 = str5;
                    str4 = str4;
                }
                if (stringBuffer.length() > 0) {
                    Locale locale2 = Locale.US;
                    i3 = 1;
                    arrayList.add(String.format(locale2, "INSERT OR REPLACE INTO %s VALUES %s", "RGCAREA", stringBuffer));
                    arrayList.add(String.format(locale2, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer2));
                    stringBuffer.setLength(0);
                } else {
                    i3 = 1;
                }
                Locale locale3 = Locale.US;
                Object[] objArr = new Object[i3];
                objArr[0] = Integer.valueOf(i2);
                arrayList.add(String.format(locale3, "DELETE FROM RGCAREA WHERE gridkey NOT IN (SELECT gridkey FROM RGCAREA LIMIT %d);", objArr));
                return arrayList;
            }
        }

        public static enum b extends c {
            public b(String str, int i2, String str2, String str3, String str4, int i3, int i4) {
                super(str, i2, str2, str3, str4, i3, i4);
            }

            /* JADX WARN: Code duplicated, block: B:59:0x0149  */
            @Override // i.g.c
            public List<String> f(JSONObject jSONObject, String str, int i2) throws JSONException {
                int i3;
                char c2;
                JSONArray jSONArray;
                String str2;
                Iterator<String> it;
                String str3 = "y2";
                String str4 = "x2";
                String str5 = "y1";
                String str6 = "x1";
                String str7 = "st";
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    int i4 = 0;
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    String next = itKeys.next();
                    c.i(stringBuffer, next, str, 0);
                    try {
                        jSONArray = jSONObject.getJSONArray(next);
                    } catch (JSONException unused) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        while (i4 < jSONArray.length()) {
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                                String string = jSONObject2.has(str7) ? jSONObject2.getString(str7) : null;
                                try {
                                    Double dValueOf = jSONObject2.has(str6) ? Double.valueOf(jSONObject2.getDouble(str6)) : null;
                                    try {
                                        Double dValueOf2 = jSONObject2.has(str5) ? Double.valueOf(jSONObject2.getDouble(str5)) : null;
                                        try {
                                            Double dValueOf3 = jSONObject2.has(str4) ? Double.valueOf(jSONObject2.getDouble(str4)) : null;
                                            try {
                                                Double dValueOf4 = jSONObject2.has(str3) ? Double.valueOf(jSONObject2.getDouble(str3)) : null;
                                                if (string == null || dValueOf == null || dValueOf2 == null || dValueOf3 == null || dValueOf4 == null) {
                                                    str2 = str3;
                                                } else {
                                                    str2 = str3;
                                                    if (stringBuffer2.length() > 0) {
                                                        try {
                                                            stringBuffer2.append(",");
                                                        } catch (JSONException unused2) {
                                                            it = itKeys;
                                                        }
                                                    }
                                                    it = itKeys;
                                                    try {
                                                        stringBuffer2.append("(NULL,\"");
                                                        stringBuffer2.append(next);
                                                        stringBuffer2.append("\",\"");
                                                        stringBuffer2.append(string);
                                                        stringBuffer2.append("\",");
                                                        stringBuffer2.append(dValueOf);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(dValueOf2);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(dValueOf3);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(dValueOf4);
                                                        stringBuffer2.append(")");
                                                    } catch (JSONException unused3) {
                                                    }
                                                    if (i4 % 50 != 49 && stringBuffer2.length() > 0) {
                                                        arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCROAD", stringBuffer2.toString()));
                                                        stringBuffer2.setLength(0);
                                                    }
                                                    i4++;
                                                    str7 = str7;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    str4 = str4;
                                                    itKeys = it;
                                                    str3 = str2;
                                                }
                                            } catch (JSONException unused4) {
                                            }
                                        } catch (JSONException unused5) {
                                            str2 = str3;
                                            str4 = str4;
                                        }
                                    } catch (JSONException unused6) {
                                        str2 = str3;
                                        str4 = str4;
                                        str5 = str5;
                                    }
                                } catch (JSONException unused7) {
                                    str2 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                    str6 = str6;
                                }
                            } catch (JSONException unused8) {
                                str2 = str3;
                                str4 = str4;
                                str5 = str5;
                                str6 = str6;
                                str7 = str7;
                            }
                            it = itKeys;
                            if (i4 % 50 != 49) {
                            }
                            i4++;
                            str7 = str7;
                            str6 = str6;
                            str5 = str5;
                            str4 = str4;
                            itKeys = it;
                            str3 = str2;
                        }
                        String str8 = str3;
                        String str9 = str4;
                        String str10 = str5;
                        String str11 = str6;
                        String str12 = str7;
                        Iterator<String> it2 = itKeys;
                        if (stringBuffer2.length() > 0) {
                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCROAD", stringBuffer2.toString()));
                        }
                        str7 = str12;
                        str6 = str11;
                        str5 = str10;
                        str4 = str9;
                        itKeys = it2;
                        str3 = str8;
                    }
                }
                if (stringBuffer.length() > 0) {
                    c2 = 0;
                    i3 = 1;
                    arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer));
                } else {
                    i3 = 1;
                    c2 = 0;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[i3];
                objArr[c2] = Integer.valueOf(i2);
                arrayList.add(String.format(locale, "DELETE FROM RGCROAD WHERE _id NOT IN (SELECT _id FROM RGCROAD LIMIT %d);", objArr));
                return arrayList;
            }
        }

        /* JADX INFO: renamed from: i.g$c$c, reason: collision with other inner class name */
        public static enum C0032c extends c {
            public C0032c(String str, int i2, String str2, String str3, String str4, int i3, int i4) {
                super(str, i2, str2, str3, str4, i3, i4);
            }

            @Override // i.g.c
            public List<String> f(JSONObject jSONObject, String str, int i2) throws JSONException {
                int i3;
                char c2;
                JSONArray jSONArray;
                String str2;
                Iterator<String> it;
                String str3 = "y";
                String str4 = "x";
                String str5 = "stn";
                String str6 = "st";
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    int i4 = 0;
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    String next = itKeys.next();
                    c.i(stringBuffer, next, str, 0);
                    try {
                        jSONArray = jSONObject.getJSONArray(next);
                    } catch (JSONException unused) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        while (i4 < jSONArray.length()) {
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                                String string = jSONObject2.has(str6) ? jSONObject2.getString(str6) : null;
                                try {
                                    String string2 = jSONObject2.has(str5) ? jSONObject2.getString(str5) : null;
                                    try {
                                        Double dValueOf = jSONObject2.has(str4) ? Double.valueOf(jSONObject2.getDouble(str4)) : null;
                                        try {
                                            Double dValueOf2 = jSONObject2.has(str3) ? Double.valueOf(jSONObject2.getDouble(str3)) : null;
                                            str2 = str3;
                                            if (stringBuffer2.length() > 0) {
                                                try {
                                                    stringBuffer2.append(",");
                                                } catch (JSONException unused2) {
                                                    it = itKeys;
                                                }
                                            }
                                            it = itKeys;
                                            try {
                                                stringBuffer2.append("(NULL,\"");
                                                stringBuffer2.append(next);
                                                stringBuffer2.append("\",\"");
                                                stringBuffer2.append(string);
                                                stringBuffer2.append("\",\"");
                                                stringBuffer2.append(string2);
                                                stringBuffer2.append("\",");
                                                stringBuffer2.append(dValueOf);
                                                stringBuffer2.append(",");
                                                stringBuffer2.append(dValueOf2);
                                                stringBuffer2.append(")");
                                            } catch (JSONException unused3) {
                                            }
                                        } catch (JSONException unused4) {
                                            str2 = str3;
                                        }
                                    } catch (JSONException unused5) {
                                        str2 = str3;
                                        str4 = str4;
                                    }
                                } catch (JSONException unused6) {
                                    str2 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                }
                            } catch (JSONException unused7) {
                                str2 = str3;
                                str4 = str4;
                                str5 = str5;
                                str6 = str6;
                            }
                            if (i4 % 50 == 49 && stringBuffer2.length() > 0) {
                                arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCSITE", stringBuffer2.toString()));
                                stringBuffer2.setLength(0);
                            }
                            i4++;
                            str6 = str6;
                            str5 = str5;
                            str4 = str4;
                            itKeys = it;
                            str3 = str2;
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = str5;
                        String str10 = str6;
                        Iterator<String> it2 = itKeys;
                        if (stringBuffer2.length() > 0) {
                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCSITE", stringBuffer2.toString()));
                        }
                        str6 = str10;
                        str5 = str9;
                        str4 = str8;
                        itKeys = it2;
                        str3 = str7;
                    }
                }
                if (stringBuffer.length() > 0) {
                    c2 = 0;
                    i3 = 1;
                    arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer));
                } else {
                    i3 = 1;
                    c2 = 0;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[i3];
                objArr[c2] = Integer.valueOf(i2);
                arrayList.add(String.format(locale, "DELETE FROM RGCSITE WHERE _id NOT IN (SELECT _id FROM RGCSITE LIMIT %d);", objArr));
                return arrayList;
            }
        }

        public static enum d extends c {
            public d(String str, int i2, String str2, String str3, String str4, int i3, int i4) {
                super(str, i2, str2, str3, str4, i3, i4);
            }

            @Override // i.g.c
            public List<String> f(JSONObject jSONObject, String str, int i2) throws JSONException {
                int i3;
                char c2;
                JSONArray jSONArray;
                String str2;
                JSONArray jSONArray2;
                String str3 = "y";
                String str4 = "x";
                String str5 = "rk";
                String str6 = "tp";
                String str7 = "ne";
                String str8 = "pid";
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                StringBuffer stringBuffer = new StringBuffer();
                while (itKeys.hasNext()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    String next = itKeys.next();
                    c.i(stringBuffer, next, str, 1);
                    try {
                        jSONArray = jSONObject.getJSONArray(next);
                    } catch (JSONException unused) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        Iterator<String> it = itKeys;
                        int i4 = 0;
                        while (i4 < jSONArray.length()) {
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                                String string = jSONObject2.has(str8) ? jSONObject2.getString(str8) : null;
                                try {
                                    String string2 = jSONObject2.has(str7) ? jSONObject2.getString(str7) : null;
                                    try {
                                        String string3 = jSONObject2.has(str6) ? jSONObject2.getString(str6) : null;
                                        try {
                                            Integer numValueOf = jSONObject2.has(str5) ? Integer.valueOf(jSONObject2.getInt(str5)) : null;
                                            try {
                                                Double dValueOf = jSONObject2.has(str4) ? Double.valueOf(jSONObject2.getDouble(str4)) : null;
                                                try {
                                                    Double dValueOf2 = jSONObject2.has(str3) ? Double.valueOf(jSONObject2.getDouble(str3)) : null;
                                                    str2 = str3;
                                                    if (stringBuffer2.length() > 0) {
                                                        try {
                                                            stringBuffer2.append(",");
                                                        } catch (JSONException unused2) {
                                                            jSONArray2 = jSONArray;
                                                        }
                                                    }
                                                    jSONArray2 = jSONArray;
                                                    try {
                                                        stringBuffer2.append("(\"");
                                                        stringBuffer2.append(string);
                                                        stringBuffer2.append("\",\"");
                                                        stringBuffer2.append(next);
                                                        stringBuffer2.append("\",\"");
                                                        stringBuffer2.append(string2);
                                                        stringBuffer2.append("\",\"");
                                                        stringBuffer2.append(string3);
                                                        stringBuffer2.append("\",");
                                                        stringBuffer2.append(dValueOf);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(dValueOf2);
                                                        stringBuffer2.append(",");
                                                        stringBuffer2.append(numValueOf);
                                                        stringBuffer2.append(")");
                                                    } catch (JSONException unused3) {
                                                    }
                                                } catch (JSONException unused4) {
                                                    str2 = str3;
                                                }
                                            } catch (JSONException unused5) {
                                                str2 = str3;
                                                str4 = str4;
                                            }
                                        } catch (JSONException unused6) {
                                            str2 = str3;
                                            str4 = str4;
                                            str5 = str5;
                                        }
                                    } catch (JSONException unused7) {
                                        str2 = str3;
                                        str4 = str4;
                                        str5 = str5;
                                        str6 = str6;
                                    }
                                } catch (JSONException unused8) {
                                    str2 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                    str6 = str6;
                                    str7 = str7;
                                }
                            } catch (JSONException unused9) {
                                str2 = str3;
                                str4 = str4;
                                str5 = str5;
                                str6 = str6;
                                str7 = str7;
                                str8 = str8;
                            }
                            if (i4 % 50 == 49) {
                                arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCPOI", stringBuffer2.toString()));
                                stringBuffer2.setLength(0);
                            }
                            i4++;
                            str8 = str8;
                            str7 = str7;
                            str6 = str6;
                            str5 = str5;
                            str4 = str4;
                            jSONArray = jSONArray2;
                            str3 = str2;
                        }
                        String str9 = str3;
                        String str10 = str4;
                        String str11 = str5;
                        String str12 = str6;
                        String str13 = str7;
                        String str14 = str8;
                        if (stringBuffer2.length() > 0) {
                            arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCPOI", stringBuffer2.toString()));
                        }
                        itKeys = it;
                        str8 = str14;
                        str7 = str13;
                        str6 = str12;
                        str5 = str11;
                        str4 = str10;
                        str3 = str9;
                    }
                }
                if (stringBuffer.length() > 0) {
                    c2 = 0;
                    i3 = 1;
                    arrayList.add(String.format(Locale.US, "INSERT OR REPLACE INTO %s VALUES %s", "RGCUPDATE", stringBuffer));
                } else {
                    i3 = 1;
                    c2 = 0;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[i3];
                objArr[c2] = Integer.valueOf(i2);
                arrayList.add(String.format(locale, "DELETE FROM RGCPOI WHERE pid NOT IN (SELECT pid FROM RGCPOI LIMIT %d);", objArr));
                return arrayList;
            }
        }

        static {
            a aVar = new a("AREA", 0, "RGCAREA", "area", "addrv", 0, 1000);
            f2874g = aVar;
            b bVar = new b("ROAD", 1, "RGCROAD", "road", "addrv", 1000, 10000);
            f2875h = bVar;
            C0032c c0032c = new C0032c("SITE", 2, "RGCSITE", "site", "addrv", 100, 50000);
            f2876i = c0032c;
            d dVar = new d("POI", 3, "RGCPOI", "poi", "poiv", 1000, 5000);
            f2877j = dVar;
            f2878k = new c[]{aVar, bVar, c0032c, dVar};
        }

        public c(String str, int i2, String str2, String str3, String str4, int i3, int i4) {
            super(str, i2);
            this.f2880c = str2;
            this.f2881d = str3;
            this.f2882e = str4;
            this.f2879b = i3;
            this.f2883f = i4;
        }

        public static void i(StringBuffer stringBuffer, String str, String str2, int i2) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append("(\"");
            stringBuffer.append(str);
            stringBuffer.append("\",\"");
            stringBuffer.append(str2);
            stringBuffer.append("\",");
            stringBuffer.append(i2);
            stringBuffer.append(",");
            stringBuffer.append(System.currentTimeMillis() / 86400000);
            stringBuffer.append(")");
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f2878k.clone();
        }

        public final String a(int i2, double d2, double d3) {
            HashSet<String> hashSet = new HashSet();
            hashSet.add(g.i(i2, d2, d3));
            int i3 = this.f2879b;
            double d4 = ((double) i3) * 1.414d;
            if (i3 > 0) {
                for (int i4 = 0; i4 < g.f2866f.length; i4++) {
                    double[] dArrM = g.m(d3, d2, d4, g.f2866f[i4]);
                    hashSet.add(g.i(i2, dArrM[1], dArrM[0]));
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            boolean z2 = true;
            for (String str : hashSet) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append("\"");
                stringBuffer.append(str);
                stringBuffer.append("\"");
            }
            return String.format("SELECT * FROM %s WHERE gridkey IN (%s);", this.f2880c, stringBuffer.toString());
        }

        public final String e(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            StringBuffer stringBuffer = new StringBuffer();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (stringBuffer.length() != 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append("\"");
                stringBuffer.append(next);
                stringBuffer.append("\"");
            }
            return String.format(Locale.US, "DELETE FROM %s WHERE gridkey IN (%s)", this.f2880c, stringBuffer);
        }

        public abstract List<String> f(JSONObject jSONObject, String str, int i2);
    }

    public g(d dVar, SQLiteDatabase sQLiteDatabase, int i2) {
        this.f2867a = dVar;
        this.f2869c = sQLiteDatabase;
        this.f2868b = i2;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCAREA(gridkey VARCHAR(10) PRIMARY KEY, country VARCHAR(100),countrycode VARCHAR(100), province VARCHAR(100), city VARCHAR(100), citycode VARCHAR(100), district VARCHAR(100), timestamp INTEGER, version VARCHAR(50))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCROAD(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), x1 DOUBLE, y1 DOUBLE, x2 DOUBLE, y2 DOUBLE)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCSITE(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), streetnumber VARCHAR(100), x DOUBLE, y DOUBLE)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCPOI(pid VARCHAR(50) PRIMARY KEY , gridkey VARCHAR(10), name VARCHAR(100), type VARCHAR(50), x DOUBLE, y DOUBLE, rank INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RGCUPDATE(gridkey VARCHAR(10), version VARCHAR(50), type INTEGER, timestamp INTEGER, PRIMARY KEY(gridkey, type))");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static int b(int i2, int i3) {
        double d2;
        int i4;
        if (100 > i3) {
            d2 = -0.1d;
            i4 = 60000;
        } else if (500 > i3) {
            d2 = -0.75d;
            i4 = 55500;
        } else {
            d2 = -0.5d;
            i4 = 0;
        }
        return ((int) ((d2 * ((double) i3)) + ((double) i4))) + i2;
    }

    public static String i(int i2, double d2, double d3) {
        double d4;
        b bVar;
        int i3 = i2 * 5;
        char[] cArr = new char[i2 + 1];
        b bVar2 = new b(90.0d, -90.0d);
        b bVar3 = new b(180.0d, -180.0d);
        int i4 = 1;
        boolean z2 = true;
        int i5 = 0;
        for (int i6 = 1; i6 <= i3; i6++) {
            if (z2) {
                d4 = d2;
                bVar = bVar3;
            } else {
                d4 = d3;
                bVar = bVar2;
            }
            double d5 = (bVar.f2873b + bVar.f2872a) / 2.0d;
            i5 <<= i4;
            if (((int) (d4 * 1000000.0d)) > ((int) (d5 * 1000000.0d))) {
                bVar.f2873b = d5;
                i5 |= 1;
            } else {
                bVar.f2872a = d5;
            }
            if (i6 % 5 == 0) {
                i4 = 1;
                cArr[(i6 / 5) - 1] = "0123456789bcdefghjkmnpqrstuvwxyz".charAt(i5);
                i5 = 0;
            } else {
                i4 = 1;
            }
            z2 = !z2;
        }
        cArr[i2] = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 0; i7 < i2; i7++) {
            stringBuffer.append(cArr[i7]);
        }
        return stringBuffer.toString();
    }

    public static double[] m(double d2, double d3, double d4, double d5) {
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(d3);
        double radians3 = Math.toRadians(d5);
        double d6 = d4 / 6378137.0d;
        double dAsin = Math.asin((Math.sin(radians) * Math.cos(d6)) + (Math.cos(radians) * Math.sin(d6) * Math.cos(radians3)));
        return new double[]{Math.toDegrees(dAsin), Math.toDegrees(radians2 + Math.atan2(Math.sin(radians3) * Math.sin(d6) * Math.cos(radians), Math.cos(d6) - (Math.sin(radians) * Math.sin(dAsin))))};
    }

    public final double a(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d6 - d4;
        double d9 = d2 - d4;
        double d10 = d7 - d5;
        double d11 = d3 - d5;
        double d12 = (d8 * d9) + (d10 * d11);
        if (d12 <= 0.0d) {
            return Math.sqrt((d9 * d9) + (d11 * d11));
        }
        double d13 = (d8 * d8) + (d10 * d10);
        if (d12 >= d13) {
            double d14 = d2 - d6;
            double d15 = d3 - d7;
            return Math.sqrt((d14 * d14) + (d15 * d15));
        }
        double d16 = d12 / d13;
        double d17 = d2 - (d4 + (d8 * d16));
        double d18 = (d5 + (d10 * d16)) - d3;
        return Math.sqrt((d17 * d17) + (d18 * d18));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:117:0x0209  */
    /* JADX WARN: Code duplicated, block: B:119:0x0219  */
    /* JADX WARN: Code duplicated, block: B:121:0x0229  */
    /* JADX WARN: Code duplicated, block: B:123:0x0239  */
    /* JADX WARN: Code duplicated, block: B:125:0x0249  */
    /* JADX WARN: Code duplicated, block: B:126:0x0257  */
    /* JADX WARN: Code duplicated, block: B:128:0x025b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0269  */
    /* JADX WARN: Code duplicated, block: B:153:0x0157 A[EXC_TOP_SPLITTER, PHI: r9 r15 r21
      0x0157: PHI (r9v1 android.database.Cursor) = (r9v2 android.database.Cursor), (r9v7 android.database.Cursor) binds: [B:73:0x0155, B:60:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r15v4 ??) = (r15v5 ??), (r15v8 ??) binds: [B:73:0x0155, B:60:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r21v4 java.lang.String) = (r21v5 java.lang.String), (r21v8 java.lang.String) binds: [B:73:0x0155, B:60:0x0138] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0098 A[EXC_TOP_SPLITTER, PHI: r8 r18 r21
      0x0098: PHI (r8v2 android.database.Cursor) = (r8v8 android.database.Cursor), (r8v11 android.database.Cursor) binds: [B:35:0x0096, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r18v2 java.lang.String) = (r18v4 java.lang.String), (r18v7 java.lang.String) binds: [B:35:0x0096, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r21v1 java.lang.String) = (r21v13 java.lang.String), (r21v15 java.lang.String) binds: [B:35:0x0096, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01e0 A[EXC_TOP_SPLITTER, PHI: r0 r1 r2 r3 r4 r11 r15
      0x01e0: PHI (r0v26 ??) = (r0v11 ??), (r0v34 ??) binds: [B:108:0x01de, B:95:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r1v16 ??) = (r1v10 ??), (r1v22 ??) binds: [B:108:0x01de, B:95:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r2v13 ??) = (r2v7 ??), (r2v18 ??) binds: [B:108:0x01de, B:95:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r3v15 ??) = (r3v9 ??), (r3v19 ??) binds: [B:108:0x01de, B:95:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r4v11 ??) = (r4v5 ??), (r4v14 ??) binds: [B:108:0x01de, B:95:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r11v18 ??) = (r11v14 ??), (r11v19 ??) binds: [B:108:0x01de, B:95:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r15v15 ??) = (r15v13 ??), (r15v17 ??) binds: [B:108:0x01de, B:95:0x01c5] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6 A[Catch: all -> 0x013e, Exception -> 0x0144, TryCatch #11 {all -> 0x013e, blocks: (B:40:0x00b0, B:42:0x00b6, B:43:0x00be, B:45:0x00c4, B:46:0x00cc), top: B:159:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[Catch: all -> 0x013e, Exception -> 0x0144, TRY_LEAVE, TryCatch #11 {all -> 0x013e, blocks: (B:40:0x00b0, B:42:0x00b6, B:43:0x00be, B:45:0x00c4, B:46:0x00cc), top: B:159:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010d A[Catch: all -> 0x0132, Exception -> 0x0147, TRY_LEAVE, TryCatch #7 {all -> 0x0132, blocks: (B:48:0x0105, B:50:0x010d, B:54:0x011c), top: B:151:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174 A[Catch: all -> 0x01c8, Exception -> 0x01ca, TryCatch #14 {Exception -> 0x01ca, blocks: (B:79:0x016e, B:81:0x0174, B:83:0x017a), top: B:163:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14, types: [b1.a$a] */
    /* JADX WARN: Type inference failed for: r0v15, types: [b1.a$a] */
    /* JADX WARN: Type inference failed for: r0v16, types: [b1.a$a] */
    /* JADX WARN: Type inference failed for: r0v17, types: [b1.a$a] */
    /* JADX WARN: Type inference failed for: r0v18, types: [b1.a$a] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v19, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r6v6, types: [b1.a$a] */
    public b1.a c(double d2, double d3) throws Throwable {
        Cursor cursorRawQuery;
        String str;
        String str2;
        char c2;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        ?? r15;
        Cursor cursorRawQuery2;
        Cursor cursor4;
        Cursor cursor5;
        double[] dArrD;
        String string;
        double dA;
        ?? RawQuery;
        ?? string2;
        ?? str3;
        ?? str4;
        ?? str5;
        ?? str6;
        ?? str7;
        int i2;
        ?? str8;
        String str9;
        String str10;
        ?? r1;
        ?? r2;
        ?? r3;
        ?? r4;
        ?? r5;
        ?? string3;
        ?? r16;
        Cursor cursor6;
        Cursor cursor7;
        int i3 = 4;
        int i4 = 5;
        int i5 = 3;
        int i6 = 2;
        double d4 = Double.MAX_VALUE;
        Cursor cursor8 = null;
        try {
            cursorRawQuery = this.f2869c.rawQuery(c.f2876i.a(this.f2868b, d2, d3), null);
            try {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        str = null;
                        str2 = null;
                        double d5 = Double.MAX_VALUE;
                        while (!cursorRawQuery.isAfterLast()) {
                            try {
                                String string4 = cursorRawQuery.getString(2);
                                String string5 = cursorRawQuery.getString(3);
                                cursor6 = cursorRawQuery;
                                try {
                                    double dH = h(d3, d2, cursorRawQuery.getDouble(5), cursorRawQuery.getDouble(4));
                                    if (dH < d5 && dH <= c.f2876i.f2879b) {
                                        d5 = dH;
                                        str2 = string4;
                                        str = string5;
                                    }
                                    cursor6.moveToNext();
                                    cursorRawQuery = cursor6;
                                } catch (Exception unused) {
                                    cursorRawQuery = cursor6;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    c2 = 0;
                                    if (str == null) {
                                        try {
                                            cursorRawQuery2 = this.f2869c.rawQuery(c.f2875h.a(this.f2868b, d2, d3), null);
                                            try {
                                                try {
                                                    if (cursorRawQuery2.moveToFirst()) {
                                                        dArrD = Jni.d(d2, d3, "wgs842mc");
                                                        while (!cursorRawQuery2.isAfterLast()) {
                                                            string = cursorRawQuery2.getString(i6);
                                                            try {
                                                                double[] dArrD2 = Jni.d(cursorRawQuery2.getDouble(i5), cursorRawQuery2.getDouble(i3), "wgs842mc");
                                                                double[] dArrD3 = Jni.d(cursorRawQuery2.getDouble(i4), cursorRawQuery2.getDouble(6), "wgs842mc");
                                                                cursor4 = cursorRawQuery2;
                                                                cursor5 = null;
                                                                r15 = 0;
                                                                int i7 = i4;
                                                                int i8 = i5;
                                                                try {
                                                                    try {
                                                                        dA = a(dArrD[c2], dArrD[1], dArrD2[c2], dArrD2[1], dArrD3[c2], dArrD3[1]);
                                                                        if (dA < d4) {
                                                                            d4 = dA;
                                                                            str2 = string;
                                                                        }
                                                                        try {
                                                                            cursor4.moveToNext();
                                                                            cursor8 = null;
                                                                            i6 = 2;
                                                                            i4 = i7;
                                                                            cursorRawQuery2 = cursor4;
                                                                            i5 = i8;
                                                                            c2 = 0;
                                                                            i3 = 4;
                                                                        } catch (Exception unused2) {
                                                                            cursor3 = cursor4;
                                                                            if (cursor3 != null) {
                                                                                cursor3.close();
                                                                            }
                                                                            RawQuery = this.f2869c.rawQuery(c.f2874g.a(this.f2868b, d2, d3), r15);
                                                                            try {
                                                                                if (RawQuery.moveToFirst()) {
                                                                                    ?? r6 = r15;
                                                                                    ?? r7 = r6;
                                                                                    ?? r8 = r7;
                                                                                    ?? r9 = r8;
                                                                                    string3 = r9;
                                                                                    str3 = r6;
                                                                                    str4 = r7;
                                                                                    str5 = r8;
                                                                                    str6 = r9;
                                                                                    r16 = r15;
                                                                                } else {
                                                                                    ?? r10 = r15;
                                                                                    ?? r11 = r10;
                                                                                    ?? r12 = r11;
                                                                                    ?? r13 = r12;
                                                                                    string3 = r13;
                                                                                    str3 = r10;
                                                                                    str4 = r11;
                                                                                    str5 = r12;
                                                                                    str6 = r13;
                                                                                    r16 = r15;
                                                                                }
                                                                                string2 = r16;
                                                                                r15 = string3;
                                                                            } catch (Exception unused3) {
                                                                                ?? r14 = r15;
                                                                                r1 = r14;
                                                                                r2 = r14;
                                                                            }
                                                                            RawQuery.close();
                                                                            str7 = r15;
                                                                            if (string2 != 0) {
                                                                                i2 = 0;
                                                                                str8 = new String(Base64.decode(string2.getBytes(), 0));
                                                                            } else {
                                                                                i2 = 0;
                                                                            }
                                                                            if (str3 != 0) {
                                                                                str8 = string2;
                                                                                str3 = new String(Base64.decode(str3.getBytes(), i2));
                                                                            }
                                                                            if (str4 != 0) {
                                                                                str4 = new String(Base64.decode(str4.getBytes(), i2));
                                                                            }
                                                                            if (str5 != 0) {
                                                                                str5 = new String(Base64.decode(str5.getBytes(), i2));
                                                                            }
                                                                            if (str6 != 0) {
                                                                                str6 = new String(Base64.decode(str6.getBytes(), i2));
                                                                            }
                                                                            if (str7 != 0) {
                                                                                str7 = new String(Base64.decode(str7.getBytes(), i2));
                                                                            }
                                                                            if (str2 != null) {
                                                                                str9 = new String(Base64.decode(str2.getBytes(), i2));
                                                                            } else {
                                                                                str9 = str2;
                                                                            }
                                                                            if (str != null) {
                                                                                str10 = new String(Base64.decode(str.getBytes(), i2));
                                                                            } else {
                                                                                str10 = str;
                                                                            }
                                                                            return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        cursor8 = cursor4;
                                                                        if (cursor8 != null) {
                                                                            try {
                                                                                cursor8.close();
                                                                            } catch (Exception unused4) {
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Exception unused5) {
                                                                    cursor2 = cursor4;
                                                                    cursor = cursor5;
                                                                    cursor3 = cursor2;
                                                                    r15 = cursor;
                                                                    if (cursor3 != null) {
                                                                        cursor3.close();
                                                                    }
                                                                    RawQuery = this.f2869c.rawQuery(c.f2874g.a(this.f2868b, d2, d3), r15);
                                                                    if (RawQuery.moveToFirst()) {
                                                                        ?? r17 = r15;
                                                                        ?? r18 = r17;
                                                                        ?? r19 = r18;
                                                                        ?? r110 = r19;
                                                                        string3 = r110;
                                                                        str3 = r17;
                                                                        str4 = r18;
                                                                        str5 = r19;
                                                                        str6 = r110;
                                                                        r16 = r15;
                                                                    } else {
                                                                        ?? r111 = r15;
                                                                        ?? r112 = r111;
                                                                        ?? r113 = r112;
                                                                        ?? r114 = r113;
                                                                        string3 = r114;
                                                                        str3 = r111;
                                                                        str4 = r112;
                                                                        str5 = r113;
                                                                        str6 = r114;
                                                                        r16 = r15;
                                                                    }
                                                                    string2 = r16;
                                                                    r15 = string3;
                                                                    RawQuery.close();
                                                                    str7 = r15;
                                                                    if (string2 != 0) {
                                                                        i2 = 0;
                                                                        str8 = new String(Base64.decode(string2.getBytes(), 0));
                                                                    } else {
                                                                        i2 = 0;
                                                                    }
                                                                    if (str3 != 0) {
                                                                        str8 = string2;
                                                                        str3 = new String(Base64.decode(str3.getBytes(), i2));
                                                                    }
                                                                    if (str4 != 0) {
                                                                        str4 = new String(Base64.decode(str4.getBytes(), i2));
                                                                    }
                                                                    if (str5 != 0) {
                                                                        str5 = new String(Base64.decode(str5.getBytes(), i2));
                                                                    }
                                                                    if (str6 != 0) {
                                                                        str6 = new String(Base64.decode(str6.getBytes(), i2));
                                                                    }
                                                                    if (str7 != 0) {
                                                                        str7 = new String(Base64.decode(str7.getBytes(), i2));
                                                                    }
                                                                    if (str2 != null) {
                                                                        str9 = new String(Base64.decode(str2.getBytes(), i2));
                                                                    } else {
                                                                        str9 = str2;
                                                                    }
                                                                    if (str != null) {
                                                                        str10 = new String(Base64.decode(str.getBytes(), i2));
                                                                    } else {
                                                                        str10 = str;
                                                                    }
                                                                    return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
                                                                }
                                                            } catch (Exception unused6) {
                                                                cursor4 = cursorRawQuery2;
                                                                cursor5 = null;
                                                            }
                                                        }
                                                    }
                                                    r15 = cursor8;
                                                    cursor3 = cursorRawQuery2;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cursor4 = cursorRawQuery2;
                                                }
                                            } catch (Exception unused7) {
                                                cursor4 = cursorRawQuery2;
                                                cursor5 = cursor8;
                                            }
                                        } catch (Exception unused8) {
                                            cursor = null;
                                            cursor2 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        try {
                                            cursor3.close();
                                        } catch (Exception unused9) {
                                        }
                                    } else {
                                        r15 = 0;
                                    }
                                    RawQuery = this.f2869c.rawQuery(c.f2874g.a(this.f2868b, d2, d3), r15);
                                    try {
                                        if (RawQuery.moveToFirst()) {
                                            ?? r115 = r15;
                                            ?? r116 = r115;
                                            ?? r117 = r116;
                                            ?? r118 = r117;
                                            string3 = r118;
                                            str3 = r115;
                                            str4 = r116;
                                            str5 = r117;
                                            str6 = r118;
                                            r16 = r15;
                                        } else {
                                            ?? r119 = r15;
                                            ?? r1110 = r119;
                                            ?? r1111 = r1110;
                                            ?? r1112 = r1111;
                                            string3 = r1112;
                                            str3 = r119;
                                            str4 = r1110;
                                            str5 = r1111;
                                            str6 = r1112;
                                            r16 = r15;
                                        }
                                        string2 = r16;
                                        r15 = string3;
                                        RawQuery.close();
                                        str7 = r15;
                                        if (string2 != 0) {
                                            i2 = 0;
                                            str8 = new String(Base64.decode(string2.getBytes(), 0));
                                        } else {
                                            i2 = 0;
                                        }
                                        if (str3 != 0) {
                                            str8 = string2;
                                            str3 = new String(Base64.decode(str3.getBytes(), i2));
                                        }
                                        if (str4 != 0) {
                                            str4 = new String(Base64.decode(str4.getBytes(), i2));
                                        }
                                        if (str5 != 0) {
                                            str5 = new String(Base64.decode(str5.getBytes(), i2));
                                        }
                                        if (str6 != 0) {
                                            str6 = new String(Base64.decode(str6.getBytes(), i2));
                                        }
                                        if (str7 != 0) {
                                            str7 = new String(Base64.decode(str7.getBytes(), i2));
                                        }
                                        if (str2 != null) {
                                            str9 = new String(Base64.decode(str2.getBytes(), i2));
                                        } else {
                                            str9 = str2;
                                        }
                                        if (str != null) {
                                            str10 = new String(Base64.decode(str.getBytes(), i2));
                                        } else {
                                            str10 = str;
                                        }
                                        return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (RawQuery != 0) {
                                            try {
                                                RawQuery.close();
                                            } catch (Exception unused10) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor8 = cursor6;
                                    if (cursor8 != null) {
                                        try {
                                            cursor8.close();
                                        } catch (Exception unused11) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception unused12) {
                                cursor6 = cursorRawQuery;
                            }
                        }
                        cursor7 = cursorRawQuery;
                    } else {
                        cursor7 = cursorRawQuery;
                        str = null;
                        str2 = null;
                    }
                    cursorRawQuery = cursor7;
                } catch (Throwable th6) {
                    th = th6;
                    cursor6 = cursorRawQuery;
                }
            } catch (Exception unused13) {
                str = null;
                str2 = str;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                c2 = 0;
                if (str == null) {
                    cursorRawQuery2 = this.f2869c.rawQuery(c.f2875h.a(this.f2868b, d2, d3), null);
                    if (cursorRawQuery2.moveToFirst()) {
                        dArrD = Jni.d(d2, d3, "wgs842mc");
                        while (!cursorRawQuery2.isAfterLast()) {
                            string = cursorRawQuery2.getString(i6);
                            double[] dArrD4 = Jni.d(cursorRawQuery2.getDouble(i5), cursorRawQuery2.getDouble(i3), "wgs842mc");
                            double[] dArrD5 = Jni.d(cursorRawQuery2.getDouble(i4), cursorRawQuery2.getDouble(6), "wgs842mc");
                            cursor4 = cursorRawQuery2;
                            cursor5 = null;
                            r15 = 0;
                            int i9 = i4;
                            int i10 = i5;
                            dA = a(dArrD[c2], dArrD[1], dArrD4[c2], dArrD4[1], dArrD5[c2], dArrD5[1]);
                            if (dA < d4) {
                                d4 = dA;
                                str2 = string;
                            }
                            cursor4.moveToNext();
                            cursor8 = null;
                            i6 = 2;
                            i4 = i9;
                            cursorRawQuery2 = cursor4;
                            i5 = i10;
                            c2 = 0;
                            i3 = 4;
                        }
                    }
                    r15 = cursor8;
                    cursor3 = cursorRawQuery2;
                    cursor3.close();
                } else {
                    r15 = 0;
                }
                RawQuery = this.f2869c.rawQuery(c.f2874g.a(this.f2868b, d2, d3), r15);
                if (RawQuery.moveToFirst()) {
                    ?? r1113 = r15;
                    ?? r1114 = r1113;
                    ?? r1115 = r1114;
                    ?? r1116 = r1115;
                    string3 = r1116;
                    str3 = r1113;
                    str4 = r1114;
                    str5 = r1115;
                    str6 = r1116;
                    r16 = r15;
                } else {
                    ?? r1117 = r15;
                    ?? r1118 = r1117;
                    ?? r1119 = r1118;
                    ?? r11110 = r1119;
                    string3 = r11110;
                    str3 = r1117;
                    str4 = r1118;
                    str5 = r1119;
                    str6 = r11110;
                    r16 = r15;
                }
                string2 = r16;
                r15 = string3;
                RawQuery.close();
                str7 = r15;
                if (string2 != 0) {
                    i2 = 0;
                    str8 = new String(Base64.decode(string2.getBytes(), 0));
                } else {
                    i2 = 0;
                }
                if (str3 != 0) {
                    str8 = string2;
                    str3 = new String(Base64.decode(str3.getBytes(), i2));
                }
                if (str4 != 0) {
                    str4 = new String(Base64.decode(str4.getBytes(), i2));
                }
                if (str5 != 0) {
                    str5 = new String(Base64.decode(str5.getBytes(), i2));
                }
                if (str6 != 0) {
                    str6 = new String(Base64.decode(str6.getBytes(), i2));
                }
                if (str7 != 0) {
                    str7 = new String(Base64.decode(str7.getBytes(), i2));
                }
                if (str2 != null) {
                    str9 = new String(Base64.decode(str2.getBytes(), i2));
                } else {
                    str9 = str2;
                }
                if (str != null) {
                    str10 = new String(Base64.decode(str.getBytes(), i2));
                } else {
                    str10 = str;
                }
                return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
            }
        } catch (Exception unused14) {
            cursorRawQuery = null;
            str = null;
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            cursorRawQuery.close();
        } catch (Exception unused15) {
        }
        c2 = 0;
        if (str == null) {
            cursorRawQuery2 = this.f2869c.rawQuery(c.f2875h.a(this.f2868b, d2, d3), null);
            if (cursorRawQuery2.moveToFirst()) {
                dArrD = Jni.d(d2, d3, "wgs842mc");
                while (!cursorRawQuery2.isAfterLast()) {
                    string = cursorRawQuery2.getString(i6);
                    double[] dArrD6 = Jni.d(cursorRawQuery2.getDouble(i5), cursorRawQuery2.getDouble(i3), "wgs842mc");
                    double[] dArrD7 = Jni.d(cursorRawQuery2.getDouble(i4), cursorRawQuery2.getDouble(6), "wgs842mc");
                    cursor4 = cursorRawQuery2;
                    cursor5 = null;
                    r15 = 0;
                    int i11 = i4;
                    int i12 = i5;
                    dA = a(dArrD[c2], dArrD[1], dArrD6[c2], dArrD6[1], dArrD7[c2], dArrD7[1]);
                    if (dA < d4 && dA <= c.f2875h.f2879b) {
                        d4 = dA;
                        str2 = string;
                    }
                    cursor4.moveToNext();
                    cursor8 = null;
                    i6 = 2;
                    i4 = i11;
                    cursorRawQuery2 = cursor4;
                    i5 = i12;
                    c2 = 0;
                    i3 = 4;
                }
            }
            r15 = cursor8;
            cursor3 = cursorRawQuery2;
            cursor3.close();
        } else {
            r15 = 0;
        }
        try {
            RawQuery = this.f2869c.rawQuery(c.f2874g.a(this.f2868b, d2, d3), r15);
            if (RawQuery.moveToFirst() || RawQuery.isAfterLast()) {
                ?? r11111 = r15;
                ?? r11112 = r11111;
                ?? r11113 = r11112;
                ?? r11114 = r11113;
                string3 = r11114;
                str3 = r11111;
                str4 = r11112;
                str5 = r11113;
                str6 = r11114;
                r16 = r15;
            } else {
                string2 = RawQuery.getString(RawQuery.getColumnIndex("country"));
                try {
                    str3 = RawQuery.getString(RawQuery.getColumnIndex("countrycode"));
                    try {
                        str4 = RawQuery.getString(RawQuery.getColumnIndex("province"));
                        try {
                            str5 = RawQuery.getString(RawQuery.getColumnIndex("city"));
                            try {
                                str6 = RawQuery.getString(RawQuery.getColumnIndex("citycode"));
                                try {
                                    r16 = string2;
                                    str3 = str3;
                                    str4 = str4;
                                    str5 = str5;
                                    str6 = str6;
                                    string3 = RawQuery.getString(RawQuery.getColumnIndex("district"));
                                } catch (Exception unused16) {
                                    if (RawQuery != 0) {
                                    }
                                    str7 = r15;
                                    if (string2 != 0) {
                                        i2 = 0;
                                        str8 = new String(Base64.decode(string2.getBytes(), 0));
                                    } else {
                                        i2 = 0;
                                    }
                                    if (str3 != 0) {
                                        str8 = string2;
                                        str3 = new String(Base64.decode(str3.getBytes(), i2));
                                    }
                                    if (str4 != 0) {
                                        str4 = new String(Base64.decode(str4.getBytes(), i2));
                                    }
                                    if (str5 != 0) {
                                        str5 = new String(Base64.decode(str5.getBytes(), i2));
                                    }
                                    if (str6 != 0) {
                                        str6 = new String(Base64.decode(str6.getBytes(), i2));
                                    }
                                    if (str7 != 0) {
                                        str7 = new String(Base64.decode(str7.getBytes(), i2));
                                    }
                                    if (str2 != null) {
                                        str9 = new String(Base64.decode(str2.getBytes(), i2));
                                    } else {
                                        str9 = str2;
                                    }
                                    if (str != null) {
                                        str10 = new String(Base64.decode(str.getBytes(), i2));
                                    } else {
                                        str10 = str;
                                    }
                                    return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
                                }
                            } catch (Exception unused17) {
                                str6 = r15;
                            }
                        } catch (Exception unused18) {
                            str5 = r15;
                            string2 = string2;
                            str3 = str3;
                            str4 = str4;
                            str6 = str5;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            str7 = r15;
                            if (string2 != 0) {
                                i2 = 0;
                                str8 = new String(Base64.decode(string2.getBytes(), 0));
                            } else {
                                i2 = 0;
                            }
                            if (str3 != 0) {
                                str8 = string2;
                                str3 = new String(Base64.decode(str3.getBytes(), i2));
                            }
                            if (str4 != 0) {
                                str4 = new String(Base64.decode(str4.getBytes(), i2));
                            }
                            if (str5 != 0) {
                                str5 = new String(Base64.decode(str5.getBytes(), i2));
                            }
                            if (str6 != 0) {
                                str6 = new String(Base64.decode(str6.getBytes(), i2));
                            }
                            if (str7 != 0) {
                                str7 = new String(Base64.decode(str7.getBytes(), i2));
                            }
                            if (str2 != null) {
                                str9 = new String(Base64.decode(str2.getBytes(), i2));
                            } else {
                                str9 = str2;
                            }
                            if (str != null) {
                                str10 = new String(Base64.decode(str.getBytes(), i2));
                            } else {
                                str10 = str;
                            }
                            return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
                        }
                    } catch (Exception unused19) {
                        r3 = r15;
                        r5 = string2;
                        r4 = str3;
                        str5 = r3;
                        string2 = r5;
                        str3 = r4;
                        str4 = r3;
                        str6 = str5;
                        if (RawQuery != 0) {
                            RawQuery.close();
                        }
                        str7 = r15;
                        if (string2 != 0) {
                            i2 = 0;
                            str8 = new String(Base64.decode(string2.getBytes(), 0));
                        } else {
                            i2 = 0;
                        }
                        if (str3 != 0) {
                            str8 = string2;
                            str3 = new String(Base64.decode(str3.getBytes(), i2));
                        }
                        if (str4 != 0) {
                            str4 = new String(Base64.decode(str4.getBytes(), i2));
                        }
                        if (str5 != 0) {
                            str5 = new String(Base64.decode(str5.getBytes(), i2));
                        }
                        if (str6 != 0) {
                            str6 = new String(Base64.decode(str6.getBytes(), i2));
                        }
                        if (str7 != 0) {
                            str7 = new String(Base64.decode(str7.getBytes(), i2));
                        }
                        if (str2 != null) {
                            str9 = new String(Base64.decode(str2.getBytes(), i2));
                        } else {
                            str9 = str2;
                        }
                        if (str != null) {
                            str10 = new String(Base64.decode(str.getBytes(), i2));
                        } else {
                            str10 = str;
                        }
                        return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
                    }
                } catch (Exception unused20) {
                    r1 = r15;
                    r2 = string2;
                    r3 = r1;
                    r5 = r2;
                    r4 = r1;
                    str5 = r3;
                    string2 = r5;
                    str3 = r4;
                    str4 = r3;
                    str6 = str5;
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    str7 = r15;
                    if (string2 != 0) {
                        i2 = 0;
                        str8 = new String(Base64.decode(string2.getBytes(), 0));
                    } else {
                        i2 = 0;
                    }
                    if (str3 != 0) {
                        str8 = string2;
                        str3 = new String(Base64.decode(str3.getBytes(), i2));
                    }
                    if (str4 != 0) {
                        str4 = new String(Base64.decode(str4.getBytes(), i2));
                    }
                    if (str5 != 0) {
                        str5 = new String(Base64.decode(str5.getBytes(), i2));
                    }
                    if (str6 != 0) {
                        str6 = new String(Base64.decode(str6.getBytes(), i2));
                    }
                    if (str7 != 0) {
                        str7 = new String(Base64.decode(str7.getBytes(), i2));
                    }
                    if (str2 != null) {
                        str9 = new String(Base64.decode(str2.getBytes(), i2));
                    } else {
                        str9 = str2;
                    }
                    if (str != null) {
                        str10 = new String(Base64.decode(str.getBytes(), i2));
                    } else {
                        str10 = str;
                    }
                    return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
                }
            }
            string2 = r16;
            r15 = string3;
        } catch (Exception unused21) {
            string2 = r15;
            str3 = string2;
            str4 = str3;
            str5 = str4;
            str6 = str5;
            RawQuery = str6;
        } catch (Throwable th8) {
            th = th8;
            RawQuery = r15;
        }
        try {
            RawQuery.close();
        } catch (Exception unused22) {
        }
        str7 = r15;
        if (string2 != 0) {
            i2 = 0;
            str8 = new String(Base64.decode(string2.getBytes(), 0));
        } else {
            i2 = 0;
        }
        if (str3 != 0) {
            str8 = string2;
            str3 = new String(Base64.decode(str3.getBytes(), i2));
        }
        if (str4 != 0) {
            str4 = new String(Base64.decode(str4.getBytes(), i2));
        }
        if (str5 != 0) {
            str5 = new String(Base64.decode(str5.getBytes(), i2));
        }
        if (str6 != 0) {
            str6 = new String(Base64.decode(str6.getBytes(), i2));
        }
        if (str7 != 0) {
            str7 = new String(Base64.decode(str7.getBytes(), i2));
        }
        if (str2 != null) {
            str9 = new String(Base64.decode(str2.getBytes(), i2));
        } else {
            str9 = str2;
        }
        if (str != null) {
            str10 = new String(Base64.decode(str.getBytes(), i2));
        } else {
            str10 = str;
        }
        return new b1.a.C0016a().p(str8).q(str3).s(str4).n(str5).o(str6).r(str7).t(str9).u(str10).m();
    }

    public void e(JSONObject jSONObject) {
        SQLiteDatabase sQLiteDatabase = this.f2869c;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            this.f2869c.beginTransaction();
            for (c cVar : c.values()) {
                if (jSONObject.has(cVar.f2881d)) {
                    String string = jSONObject.has(cVar.f2882e) ? jSONObject.getString(cVar.f2882e) : "";
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(cVar.f2881d);
                    arrayList.add(cVar.e(jSONObject2));
                    arrayList.addAll(cVar.f(jSONObject2, string, cVar.f2883f));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.f2869c.execSQL((String) it.next());
                    }
                }
            }
            this.f2869c.setTransactionSuccessful();
            this.f2870d = -1;
            this.f2871e = -1;
        } catch (Exception unused) {
        } catch (Throwable th) {
            try {
                this.f2869c.endTransaction();
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            this.f2869c.endTransaction();
        } catch (Exception unused3) {
        }
    }

    public final double h(double d2, double d3, double d4, double d5) {
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r11 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<b1.i> j(double r26, double r28) {
        /*
            r25 = this;
            r0 = r25
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            i.g$c r1 = i.g.c.f2877j
            int r2 = r0.f2868b
            r3 = r26
            r5 = r28
            java.lang.String r1 = i.g.c.c(r1, r2, r3, r5)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r0.f2869c     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La3
            android.database.Cursor r11 = r3.rawQuery(r1, r2)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> La3
            boolean r1 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            if (r1 == 0) goto La8
            r12 = 0
            r13 = r2
            r14 = r12
        L23:
            boolean r1 = r11.isAfterLast()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            if (r1 != 0) goto La7
            java.lang.String r15 = r11.getString(r12)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r1 = 2
            java.lang.String r16 = r11.getString(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r1 = 4
            double r8 = r11.getDouble(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r1 = 5
            double r6 = r11.getDouble(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r1 = 6
            int r4 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r1 = r25
            r2 = r28
            r17 = r4
            r4 = r26
            double r1 = r1.h(r2, r4, r6, r8)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            i.g$c r3 = i.g.c.f2877j     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            int r3 = i.g.c.k(r3)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L92
            b1.i r3 = new b1.i     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            byte[] r5 = r15.getBytes()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            byte[] r5 = android.util.Base64.decode(r5, r12)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            byte[] r6 = r16.getBytes()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            byte[] r6 = android.util.Base64.decode(r6, r12)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r23 = ""
            java.lang.String r24 = ""
            r18 = r3
            r19 = r4
            r20 = r5
            r18.<init>(r19, r20, r21, r23, r24)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            int r1 = java.lang.Math.round(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            r2 = r17
            int r1 = b(r2, r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9a
            if (r1 <= r14) goto L92
            r14 = r1
            r13 = r3
        L92:
            r11.moveToNext()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> La5
            goto L23
        L96:
            r0 = move-exception
            r2 = r11
            goto L9d
        L99:
            r13 = r2
        L9a:
            r2 = r11
            goto La4
        L9c:
            r0 = move-exception
        L9d:
            if (r2 == 0) goto La2
            r2.close()     // Catch: java.lang.Exception -> La2
        La2:
            throw r0
        La3:
            r13 = r2
        La4:
            r11 = r2
        La5:
            if (r11 == 0) goto Lac
        La7:
            r2 = r13
        La8:
            r11.close()     // Catch: java.lang.Exception -> Lab
        Lab:
            r13 = r2
        Lac:
            if (r13 == 0) goto Lb1
            r10.add(r13)
        Lb1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.j(double, double):java.util.List");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x0201  */
    public JSONObject k() {
        Cursor cursorRawQuery;
        Cursor cursorRawQuery2;
        Cursor cursor;
        Cursor cursor2;
        g gVar;
        String str;
        String str2 = "poi";
        JSONObject jSONObject = new JSONObject();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        try {
            SQLiteDatabase sQLiteDatabase = this.f2869c;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                cursorRawQuery2 = null;
                cursor2 = null;
            } else {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                JSONArray jSONArray4 = new JSONArray();
                cursorRawQuery2 = this.f2869c.rawQuery(String.format("SELECT * FROM RGCUPDATE WHERE type=%d AND %d > timestamp+%d ORDER BY gridkey", 0, Integer.valueOf(iCurrentTimeMillis), Integer.valueOf(this.f2867a.l().k())), null);
                try {
                    cursorRawQuery = this.f2869c.rawQuery(String.format("SELECT * FROM RGCUPDATE WHERE type=%d AND %d > timestamp+%d ORDER BY gridkey", 1, Integer.valueOf(iCurrentTimeMillis), Integer.valueOf(this.f2867a.l().D())), null);
                    try {
                        try {
                            if (cursorRawQuery2.moveToFirst()) {
                                HashSet hashSet = new HashSet();
                                while (!cursorRawQuery2.isAfterLast()) {
                                    String string = cursorRawQuery2.getString(0);
                                    str = str2;
                                    try {
                                        String string2 = cursorRawQuery2.getString(1);
                                        jSONArray3.put(string);
                                        hashSet.add(string2);
                                        if (stringBuffer2.length() > 0) {
                                            stringBuffer2.append(",");
                                        }
                                        stringBuffer2.append("\"");
                                        stringBuffer2.append(string);
                                        stringBuffer2.append("\"");
                                        cursorRawQuery2.moveToNext();
                                        str2 = str;
                                    } catch (Exception unused) {
                                        str2 = str;
                                        cursor = cursorRawQuery2;
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        if (cursorRawQuery != null) {
                                            cursor2 = cursorRawQuery;
                                            try {
                                                cursor2.close();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        if (jSONObject.has(str2)) {
                                            return jSONObject;
                                        }
                                        return jSONObject;
                                    }
                                }
                                str = str2;
                                int size = hashSet.size();
                                String[] strArr = new String[size];
                                hashSet.toArray(strArr);
                                for (int i2 = 0; i2 < size; i2++) {
                                    jSONArray4.put(strArr[i2]);
                                }
                            } else {
                                str = "poi";
                            }
                            if (cursorRawQuery.moveToFirst()) {
                                HashSet hashSet2 = new HashSet();
                                while (!cursorRawQuery.isAfterLast()) {
                                    String string3 = cursorRawQuery.getString(0);
                                    String string4 = cursorRawQuery.getString(1);
                                    jSONArray.put(string3);
                                    hashSet2.add(string4);
                                    if (stringBuffer.length() > 0) {
                                        stringBuffer.append(",");
                                    }
                                    stringBuffer.append("\"");
                                    stringBuffer.append(string3);
                                    stringBuffer.append("\"");
                                    cursorRawQuery.moveToNext();
                                }
                                int size2 = hashSet2.size();
                                String[] strArr2 = new String[size2];
                                hashSet2.toArray(strArr2);
                                for (int i3 = 0; i3 < size2; i3++) {
                                    jSONArray2.put(strArr2[i3]);
                                }
                            }
                            if (jSONArray3.length() != 0) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("gk", jSONArray3);
                                jSONObject2.put("ver", jSONArray4);
                                jSONObject.put("addr", jSONObject2);
                            }
                            if (jSONArray.length() != 0) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("gk", jSONArray);
                                jSONObject3.put("ver", jSONArray2);
                                str2 = str;
                                jSONObject.put(str2, jSONObject3);
                            } else {
                                str2 = str;
                            }
                            cursor2 = cursorRawQuery;
                        } catch (Exception unused4) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorRawQuery2 != null) {
                            try {
                                cursorRawQuery2.close();
                            } catch (Exception unused5) {
                            }
                        }
                        if (cursorRawQuery != null) {
                            throw th;
                        }
                        try {
                            cursorRawQuery.close();
                            throw th;
                        } catch (Exception unused6) {
                            throw th;
                        }
                    }
                } catch (Exception unused7) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (cursorRawQuery != null) {
                        cursor2 = cursorRawQuery;
                    }
                    if (jSONObject.has(str2)) {
                        return jSONObject;
                    }
                    return jSONObject;
                } catch (Throwable th2) {
                    th = th2;
                    cursorRawQuery = null;
                }
            }
            try {
                if (stringBuffer2.length() > 0) {
                    String str3 = String.format(Locale.US, "UPDATE RGCUPDATE SET timestamp=timestamp+1 WHERE type = %d AND gridkey IN (%s)", 0, stringBuffer2.toString());
                    gVar = this;
                    SQLiteDatabase sQLiteDatabase2 = gVar.f2869c;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.execSQL(str3);
                    }
                } else {
                    gVar = this;
                }
                if (stringBuffer.length() > 0) {
                    String str4 = String.format(Locale.US, "UPDATE RGCUPDATE SET timestamp=timestamp+1 WHERE type = %d AND gridkey IN (%s)", 1, stringBuffer.toString());
                    SQLiteDatabase sQLiteDatabase3 = gVar.f2869c;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.execSQL(str4);
                    }
                }
                if (cursorRawQuery2 != null) {
                    try {
                        cursorRawQuery2.close();
                    } catch (Exception unused8) {
                    }
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
            } catch (Exception unused9) {
                cursorRawQuery = cursor2;
                cursor = cursorRawQuery2;
                if (cursor != null) {
                    cursor.close();
                }
                if (cursorRawQuery != null) {
                    cursor2 = cursorRawQuery;
                }
                if (jSONObject.has(str2)) {
                    return jSONObject;
                }
                return jSONObject;
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = cursor2;
                if (cursorRawQuery2 != null) {
                    cursorRawQuery2.close();
                }
                if (cursorRawQuery != null) {
                    throw th;
                }
                cursorRawQuery.close();
                throw th;
            }
        } catch (Exception unused10) {
            cursorRawQuery = null;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursorRawQuery = null;
            cursorRawQuery2 = null;
        }
        if (jSONObject.has(str2) || jSONObject.has("addr")) {
            return jSONObject;
        }
        return null;
    }

    public boolean l() {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        Cursor cursor2;
        if (this.f2867a.l().Z() && this.f2871e == -1 && this.f2870d == -1 && (sQLiteDatabase = this.f2869c) != null && sQLiteDatabase.isOpen()) {
            Cursor cursorRawQuery = null;
            try {
                try {
                    Cursor cursorRawQuery2 = this.f2869c.rawQuery("SELECT COUNT(*) FROM RGCSITE;", null);
                    try {
                        cursorRawQuery2.moveToFirst();
                        this.f2871e = cursorRawQuery2.getInt(0);
                        cursorRawQuery = this.f2869c.rawQuery("SELECT COUNT(*) FROM RGCAREA;", null);
                        cursorRawQuery.moveToFirst();
                        this.f2870d = cursorRawQuery.getInt(0);
                        try {
                            cursorRawQuery2.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        cursor2 = cursorRawQuery;
                        cursorRawQuery = cursorRawQuery2;
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (cursor2 != null) {
                            cursorRawQuery = cursor2;
                        }
                        if (this.f2871e != 0) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        cursorRawQuery = cursorRawQuery2;
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Exception unused4) {
                            }
                        }
                        if (cursor == null) {
                            throw th;
                        }
                        try {
                            cursor.close();
                            throw th;
                        } catch (Exception unused5) {
                            throw th;
                        }
                    }
                } catch (Exception unused6) {
                    cursor2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
                cursorRawQuery.close();
            } catch (Exception unused7) {
            }
        }
        return this.f2871e != 0 && this.f2870d == 0;
    }
}
