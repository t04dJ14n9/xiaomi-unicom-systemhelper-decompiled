package s0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import q0.h;

/* JADX INFO: loaded from: classes.dex */
public class d extends s0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    y0.a.C0047a f3629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f3630g;

    class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f3632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h.a f3633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3634d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3636f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z0.b f3631a = new z0.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3635e = true;

        a() {
        }

        private boolean c(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f3632b = jSONObject.getLong("pub_lst_ts");
                    this.f3633c = h.c(jSONObject.getString("pub_info"));
                    this.f3636f = jSONObject.getInt("d_form_ver");
                    this.f3634d = false;
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public long a() {
            return this.f3632b;
        }

        public boolean b(PackageInfo packageInfo) {
            String strA = d.this.f3629f.b(new File(packageInfo.applicationInfo.dataDir)).a("pub.dat", true);
            this.f3635e = false;
            return c(strA);
        }

        public h.a d() {
            return this.f3633c;
        }
    }

    class b extends s0.a.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f3639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f3640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f3641h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f3642i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private h.a f3643j;

        public b(String str) {
            super(d.this.f3629f, str);
        }

        @Override // s0.a.b
        public void a(JSONObject jSONObject) {
            this.f3639f = jSONObject.getString("pkg");
            this.f3641h = jSONObject.getInt("tar_pkg_lst_pub_ts");
            this.f3640g = jSONObject.getLong("last_fe_ts");
            this.f3643j = h.c(jSONObject.getString("info"));
            this.f3642i = jSONObject.getLong("tar_pkg_lst_up_ts");
            this.f3638e = jSONObject.getInt("d_form_ver");
        }

        @Override // s0.a.b
        public void d(JSONObject jSONObject) throws JSONException {
            jSONObject.put("pkg", this.f3639f);
            jSONObject.put("last_fe_ts", this.f3640g);
            jSONObject.put("tar_pkg_lst_pub_ts", this.f3641h);
            jSONObject.put("info", this.f3643j.c());
            jSONObject.put("tar_pkg_lst_up_ts", this.f3642i);
            jSONObject.put("d_form_ver", 1);
        }

        public void f(a aVar) {
            i(aVar.d());
            j(aVar.a());
        }

        public boolean g(long j2) {
            if (this.f3640g == j2) {
                return false;
            }
            this.f3640g = j2;
            b(true);
            return true;
        }

        public boolean h(String str) {
            if (str.equals(this.f3639f)) {
                return false;
            }
            this.f3639f = str;
            b(true);
            return true;
        }

        public boolean i(h.a aVar) {
            if (aVar.equals(this.f3643j)) {
                return false;
            }
            this.f3643j = aVar;
            b(true);
            return true;
        }

        public boolean j(long j2) {
            if (this.f3641h == j2) {
                return false;
            }
            this.f3641h = j2;
            b(true);
            return true;
        }

        public String k() {
            return this.f3639f;
        }

        public boolean l(long j2) {
            if (this.f3642i == j2) {
                return false;
            }
            this.f3642i = j2;
            b(true);
            return true;
        }

        public h.a m() {
            return this.f3643j;
        }

        public long n() {
            return this.f3642i;
        }
    }

    public d() {
        super("isc", 8000000L);
        this.f3630g = new a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[PHI: r2
      0x0041: PHI (r2v1 s0.d$b) = (r2v0 s0.d$b), (r2v2 s0.d$b), (r2v2 s0.d$b) binds: [B:11:0x001a, B:13:0x002c, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    @Override // s0.a
    public s0.a.e b(String str, s0.a.d dVar) {
        PackageInfo packageInfo;
        a aVar;
        h.a aVarD;
        b bVar = null;
        try {
            packageInfo = this.f3613a.f3617a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return s0.a.e.b(-2);
        }
        if (dVar.f3623a) {
            bVar = new b(str);
            bVar.c();
            if (str.equals(bVar.k()) && packageInfo.lastUpdateTime == bVar.n()) {
                aVarD = bVar.m();
            } else {
                aVar = new a();
                if (!aVar.b(packageInfo)) {
                    return s0.a.e.b(-2);
                }
                if (dVar.f3623a && bVar != null) {
                    bVar.f(aVar);
                    bVar.g(System.currentTimeMillis());
                    bVar.l(packageInfo.lastUpdateTime);
                    bVar.h(str);
                    bVar.e();
                }
                aVarD = aVar.d();
            }
        } else {
            aVar = new a();
            if (!aVar.b(packageInfo)) {
                return s0.a.e.b(-2);
            }
            if (dVar.f3623a) {
                bVar.f(aVar);
                bVar.g(System.currentTimeMillis());
                bVar.l(packageInfo.lastUpdateTime);
                bVar.h(str);
                bVar.e();
            }
            aVarD = aVar.d();
        }
        return s0.a.e.c(aVarD);
    }

    @Override // s0.a
    public void d(s0.a.c cVar) {
        this.f3629f = this.f3614b.c("isc");
    }
}
