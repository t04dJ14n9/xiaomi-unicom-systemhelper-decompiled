package b;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.location.Jni;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f1769l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j.k f1770a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j.a f1771b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet<String> f1772c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1773d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1774e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1775f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f1776g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1777h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1778i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1779j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1780k = 0;

    public static class a extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f1781j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1782k;

        public a() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            StringBuffer stringBuffer = new StringBuffer(256);
            stringBuffer.append("os=A");
            stringBuffer.append(Build.VERSION.SDK_INT);
            stringBuffer.append("&prod=");
            stringBuffer.append(n.b.f3344f);
            stringBuffer.append("&resid=");
            stringBuffer.append("12");
            String str = n.b.f3348j;
            if (str == null) {
                str = "";
            }
            stringBuffer.append("&mapver=");
            stringBuffer.append(str);
            stringBuffer.append(n.i.B(com.baidu.location.f.c()));
            stringBuffer.append("&cu=");
            stringBuffer.append(n.b.g().f());
            stringBuffer.append("&error=");
            stringBuffer.append(this.f1782k);
            if (this.f1781j > 0) {
                stringBuffer.append("&tm=");
                stringBuffer.append(this.f1781j);
            }
            this.f3382d.put("info", Jni.j(stringBuffer.toString()));
            this.f3382d.put("qt", "monitor");
        }

        @Override // n.g
        public void h(boolean z2) {
            Map<String, Object> map = this.f3382d;
            if (map != null) {
                map.clear();
            }
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (com.baidu.location.f.f2179f) {
                int i2 = message.what;
                if (i2 == 21) {
                    m.this.d(message);
                } else if (i2 == 62 || i2 == 63) {
                    m.this.f();
                }
            }
        }
    }

    public class c extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f1784j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f1785k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f1786l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f1787m = 0;

        public c() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            if ((n.i.f3413f || n.i.f3417h) && m.this.f1777h != null && m.this.f1778i != null) {
                this.f1785k += String.format(Locale.CHINA, "&ki=%s&sn=%s", m.this.f1777h, m.this.f1778i);
            }
            if (n.a().d()) {
                this.f1785k += "&enc=2";
            }
            String strT = j.f.M().T();
            if (strT != null) {
                this.f3385g = Jni.j(strT);
            }
            String strJ = Jni.j(this.f1785k);
            this.f1785k = null;
            if (this.f1784j == null) {
                this.f1784j = y.r();
            }
            this.f3382d.put("bloc", strJ);
            String str = this.f1784j;
            if (str != null) {
                this.f3382d.put("up", str);
            }
            this.f3382d.put("trtm", String.format(Locale.CHINA, "%d", Long.valueOf(System.currentTimeMillis())));
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        
            r12 = r11.f3381c;
         */
        @Override // n.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(boolean r12) {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b.m.c.h(boolean):void");
        }

        public void i(String str, long j2) {
            this.f1785k = str;
            this.f1787m = System.currentTimeMillis();
            this.f1786l = j2;
            ExecutorService executorServiceA = w.b().a();
            if (n.i.N()) {
                d(executorServiceA, false, null);
            } else if (executorServiceA != null) {
                c(executorServiceA, n.d.f3356b);
            } else {
                b(n.d.f3356b);
            }
        }
    }

    public String a() {
        String strO = b.c.r().o();
        String str = j.f.M().Y() ? "&cn=32" : String.format(Locale.CHINA, "&cn=%d", Integer.valueOf(j.f.M().O()));
        if (System.currentTimeMillis() - this.f1780k > 60000) {
            this.f1780k = System.currentTimeMillis();
            String strT = n.i.t();
            if (!TextUtils.isEmpty(strT)) {
                str = str + "&qcip6c=" + strT;
            }
        }
        if (this.f1773d) {
            this.f1773d = false;
        } else if (!this.f1775f) {
            String strN = y.n();
            if (strN != null) {
                str = str + strN;
            }
            this.f1775f = true;
        }
        return str + strO;
    }

    public String c(String str) {
        j.k kVar;
        String strK;
        if (this.f1777h == null) {
            this.f1777h = a.a.b(com.baidu.location.f.c());
        }
        if (this.f1778i == null) {
            this.f1778i = a.a.f(com.baidu.location.f.c());
        }
        j.a aVar = this.f1771b;
        if (aVar == null || !aVar.a()) {
            this.f1771b = j.f.M().e();
        }
        j.k kVar2 = this.f1770a;
        if (kVar2 == null || !kVar2.d()) {
            this.f1770a = j.f.M().S();
        }
        Location locationX = j.d.l0().x0() ? j.d.l0().X() : null;
        j.a aVar2 = this.f1771b;
        if ((aVar2 == null || aVar2.d() || this.f1771b.c()) && (((kVar = this.f1770a) == null || kVar.e() == 0) && locationX == null)) {
            return null;
        }
        String strA = a();
        if (l.h().a() == -2) {
            strA = strA + "&imo=1";
        }
        int iX = n.i.x(com.baidu.location.f.c());
        if (iX >= 0) {
            strA = strA + "&lmd=" + iX;
            if (!this.f1779j) {
                this.f1779j = true;
                try {
                    if (com.baidu.location.f.c().getPackageManager().hasSystemFeature("android.hardware.wifi.rtt")) {
                        strA = strA + "&rtt=1";
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        j.k kVar3 = this.f1770a;
        if ((kVar3 == null || kVar3.e() == 0) && (strK = j.f.M().K()) != null) {
            strA = strK + strA;
        }
        if (j.f.M().X()) {
            strA = strA + "&wf_freq=1";
        }
        String str2 = strA;
        if (!this.f1774e) {
            return n.i.h(this.f1771b, this.f1770a, locationX, str2, 0);
        }
        this.f1774e = false;
        return n.i.i(this.f1771b, this.f1770a, locationX, str2, 0, true);
    }

    public abstract void d(Message message);

    public abstract void f();
}
