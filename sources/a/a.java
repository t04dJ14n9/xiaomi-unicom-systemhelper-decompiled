package a;

import a1.b;
import a1.c;
import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Object f0d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f1e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f3b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4c = 0;

    public static String b(Context context) {
        try {
            return b.B(context).D(context);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static a e() {
        a aVar;
        synchronized (f0d) {
            if (f1e == null) {
                f1e = new a();
            }
            aVar = f1e;
        }
        return aVar;
    }

    public static String f(Context context) {
        try {
            return b.B(context).C();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // a1.c
    public void a(int i2, String str) {
        this.f2a = i2;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("token") && jSONObject.getString("token") != null) {
                    jSONObject.getString("token");
                }
                if (!jSONObject.has("ak_permission") || jSONObject.getInt("ak_permission") == 0) {
                    return;
                }
                jSONObject.getInt("ak_permission");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void c(Context context, String str) {
        b.B(context).I(str);
    }

    public boolean d() {
        int i2 = this.f2a;
        boolean z2 = i2 == 0 || i2 == 602 || i2 == 601 || i2 == -10 || i2 == -11;
        if (this.f3b != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f4c;
            if (!z2 ? jCurrentTimeMillis < 0 || jCurrentTimeMillis > 10000 : jCurrentTimeMillis > 86400000) {
                b.B(this.f3b).q(false, "lbs_locsdk", null, this);
                this.f4c = System.currentTimeMillis();
            }
        }
        return z2;
    }

    public void g(Context context) {
        this.f3b = context;
        b.B(context).q(false, "lbs_locsdk", null, this);
        this.f4c = System.currentTimeMillis();
    }
}
