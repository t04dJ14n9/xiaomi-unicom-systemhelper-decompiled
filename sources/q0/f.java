package q0;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3551c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3552d = 0;

    public static f a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = new f();
        fVar.f3549a = str;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        fVar.f3552d = length;
        if (length < 14) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "0";
            }
            fVar.f3550b = str2;
        }
        return fVar;
    }

    public static boolean c(int i2) {
        return i2 >= 14;
    }

    public static boolean d(String str) {
        return TextUtils.isEmpty(str);
    }

    public static f e(String str) {
        return g(j(str));
    }

    private static f g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            String str2 = "0";
            String strOptString = "0";
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!i("ZGV2aWNlaWQ=").equals(next) && !i("dmVy").equals(next)) {
                    strOptString = jSONObject.optString(next, "0");
                }
            }
            String string = jSONObject.getString(i("ZGV2aWNlaWQ="));
            int i2 = jSONObject.getInt(i("dmVy"));
            int length = TextUtils.isEmpty(strOptString) ? 0 : strOptString.length();
            if (!TextUtils.isEmpty(string)) {
                f fVar = new f();
                fVar.f3549a = string;
                fVar.f3551c = i2;
                fVar.f3552d = length;
                if (length < 14) {
                    if (!TextUtils.isEmpty(strOptString)) {
                        str2 = strOptString;
                    }
                    fVar.f3550b = str2;
                }
                fVar.h();
                return fVar;
            }
        } catch (JSONException e2) {
            z0.c.c(e2);
        }
        return null;
    }

    private static String i(String str) {
        return new String(x0.a.a(str.getBytes()));
    }

    private static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrA = t0.g.a();
            return new String(t0.c.c(bArrA, bArrA, x0.a.a(str.getBytes())));
        } catch (Exception e2) {
            z0.c.c(e2);
            return "";
        }
    }

    boolean b() {
        return d(this.f3550b);
    }

    boolean f() {
        return c(this.f3552d);
    }

    boolean h() {
        String str;
        if (f()) {
            str = "O";
        } else {
            if (!b()) {
                return false;
            }
            str = "0";
        }
        this.f3550b = str;
        return true;
    }
}
