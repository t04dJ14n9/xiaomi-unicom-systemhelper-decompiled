package b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f1858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1859b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1860c = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static x f1861a = new x();
    }

    public class b extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f1862j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f1863k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f1864l = 0;

        public b(x xVar) {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            String strA = n.b.g().a();
            if (strA != null) {
                strA = strA + "&gnsst=" + this.f1864l;
            }
            String strC = n.a().c(strA);
            String strReplaceAll = !TextUtils.isEmpty(strC) ? strC.trim().replaceAll("\r|\n", "") : "null";
            String strC2 = n.a().c(this.f1863k);
            String strReplaceAll2 = TextUtils.isEmpty(strC2) ? "null" : strC2.trim().replaceAll("\r|\n", "");
            try {
                this.f3382d.put("info", URLEncoder.encode(strReplaceAll, "utf-8"));
                this.f3382d.put("enl", URLEncoder.encode(strReplaceAll2, "utf-8"));
            } catch (Exception unused) {
            }
        }

        @Override // n.g
        public void h(boolean z2) {
            if (z2 && this.f3381c != null) {
                try {
                    new JSONObject(this.f3381c);
                } catch (Throwable unused) {
                }
            }
            Map<String, Object> map = this.f3382d;
            if (map != null) {
                map.clear();
            }
            this.f1862j = false;
        }

        public void i(String str, long j2) {
            if (this.f1862j) {
                return;
            }
            this.f1862j = true;
            this.f1863k = str;
            this.f1864l = j2;
            ExecutorService executorServiceC = w.b().c();
            if (executorServiceC != null) {
                c(executorServiceC, "https://ofloc.map.baidu.com/locnu");
            } else {
                b("https://ofloc.map.baidu.com/locnu");
            }
        }

        public boolean j() {
            return this.f1862j;
        }
    }

    public static x a() {
        return a.f1861a;
    }

    @TargetApi(24)
    public void b(GnssNavigationMessage gnssNavigationMessage, long j2) {
        s.c().a(gnssNavigationMessage, j2);
        this.f1859b = System.currentTimeMillis();
        this.f1860c = j2;
    }

    public void c() {
        ArrayList<String> arrayListD;
        if (this.f1859b == 0 || Math.abs(System.currentTimeMillis() - this.f1859b) >= 20000) {
            return;
        }
        if (this.f1858a == null) {
            this.f1858a = new b(this);
        }
        b bVar = this.f1858a;
        if (bVar == null || bVar.j() || (arrayListD = s.c().d()) == null || arrayListD.size() <= 0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = arrayListD.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            i2++;
            if (i2 != arrayListD.size()) {
                stringBuffer.append(";");
            }
        }
        this.f1858a.i(stringBuffer.toString(), this.f1860c);
    }
}
