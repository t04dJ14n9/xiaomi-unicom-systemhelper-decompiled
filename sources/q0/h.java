package q0;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f3555e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y0.a.C0047a f3557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0.c f3558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c f3559d;

    public static class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String[] f3560g = {"V", "O", "0"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f3564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3566f = 1;

        public String c() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dik", this.f3561a);
                jSONObject.put("v270fk", this.f3562b);
                jSONObject.put("cck", this.f3563c);
                jSONObject.put("vsk", this.f3566f);
                jSONObject.put("ctk", this.f3564d);
                jSONObject.put("ek", this.f3565e);
                return jSONObject.toString();
            } catch (JSONException e2) {
                z0.c.c(e2);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f3566f == aVar.f3566f && this.f3561a.equals(aVar.f3561a) && this.f3562b.equals(aVar.f3562b) && this.f3563c.equals(aVar.f3563c)) {
                String str = this.f3565e;
                String str2 = aVar.f3565e;
                if (str == str2) {
                    return true;
                }
                if (str != null && str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public String f() {
            String str = this.f3562b;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3561a);
            sb.append("|");
            sb.append(str);
            if ("V".equals(str)) {
                sb.append(this.f3563c);
            }
            if (!TextUtils.isEmpty(this.f3565e)) {
                sb.append(this.f3565e);
            }
            return sb.toString().trim();
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f3561a, this.f3562b, this.f3563c, this.f3565e, Integer.valueOf(this.f3566f)});
        }
    }

    public h(Context context, y0.a aVar, c cVar) {
        if (context == null) {
            throw new NullPointerException("context should not be null!!!");
        }
        this.f3556a = context.getApplicationContext();
        y0.a.C0047a c0047aC = aVar.e().c("bohrium");
        this.f3557b = c0047aC;
        c0047aC.d();
        this.f3559d = cVar;
        f(aVar);
    }

    private String a(Context context) {
        String str = f3555e;
        return TextUtils.isEmpty(str) ? "123456" : str;
    }

    public static a c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("dik", "");
            String strOptString2 = jSONObject.optString("cck", "");
            long jOptLong = jSONObject.optLong("ctk", 0L);
            int iOptInt = jSONObject.optInt("vsk", 1);
            String strOptString3 = jSONObject.optString("ek", "");
            String strOptString4 = jSONObject.optString("v270fk", "V");
            if (!TextUtils.isEmpty(strOptString)) {
                a aVar = new a();
                aVar.f3561a = strOptString;
                aVar.f3563c = strOptString2;
                aVar.f3564d = jOptLong;
                aVar.f3566f = iOptInt;
                aVar.f3565e = strOptString3;
                aVar.f3562b = strOptString4;
                return aVar;
            }
        } catch (Exception e2) {
            z0.c.c(e2);
        }
        return null;
    }

    public static a d(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String strI = i(str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                a aVar = new a();
                aVar.f3561a = str;
                aVar.f3563c = strI;
                aVar.f3564d = jCurrentTimeMillis;
                aVar.f3566f = 1;
                aVar.f3565e = str3;
                aVar.f3562b = str2;
                return aVar;
            } catch (Exception e2) {
                z0.c.c(e2);
            }
        }
        return null;
    }

    private void f(y0.a aVar) {
        s0.c cVar = new s0.c(new q0.a());
        s0.a.C0044a c0044a = new s0.a.C0044a();
        c0044a.f3617a = this.f3556a;
        c0044a.f3618b = aVar;
        s0.a.c cVar2 = new s0.a.c();
        for (s0.a aVar2 : cVar.a()) {
            aVar2.c(c0044a);
            aVar2.d(cVar2);
        }
        this.f3558c = cVar;
    }

    public static void g(String str) {
        f3555e = str;
    }

    private static String i(String str) {
        try {
            return new z0.a("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567=", false, false).b(new r0.a().a(str.getBytes("UTF-8")));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public a b() {
        a aVar;
        s0.a.d dVar = new s0.a.d();
        dVar.f3623a = true;
        List listA = this.f3558c.a();
        Collections.sort(listA, s0.a.f3612e);
        List<b> listH = this.f3559d.h(this.f3556a);
        if (listH == null) {
            return null;
        }
        for (b bVar : listH) {
            if (!bVar.f3545d && bVar.f3544c) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    s0.a.e eVarB = ((s0.a) it.next()).b(bVar.f3542a.packageName, dVar);
                    if (eVarB != null && eVarB.d() && (aVar = eVarB.f3624a) != null) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    public a e(f fVar) {
        String str;
        if (fVar == null) {
            throw new IllegalArgumentException("arg non-nullable is expected");
        }
        a aVar = new a();
        aVar.f3564d = System.currentTimeMillis();
        aVar.f3566f = 1;
        try {
            boolean z2 = false;
            aVar.f3562b = fVar.f3550b.substring(0, 1);
            aVar.f3561a = fVar.f3549a;
            aVar.f3563c = i(fVar.f3549a);
            String[] strArr = a.f3560g;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = true;
                    break;
                }
                if (strArr[i2].equals(aVar.f3562b)) {
                    break;
                }
                i2++;
            }
            if (z2 && (str = fVar.f3550b) != null && str.length() >= 2) {
                aVar.f3565e = fVar.f3550b.substring(1);
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public a h(String str) {
        String strB = x0.b.b(("com.baidu" + a(this.f3556a)).getBytes(), true);
        a aVar = new a();
        aVar.f3564d = System.currentTimeMillis();
        aVar.f3566f = 1;
        aVar.f3561a = strB;
        aVar.f3562b = "E";
        aVar.f3563c = i(strB);
        aVar.f3565e = "RO";
        return aVar;
    }
}
