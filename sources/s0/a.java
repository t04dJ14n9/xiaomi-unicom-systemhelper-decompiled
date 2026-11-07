package s0;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Comparator;
import org.json.JSONObject;
import q0.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Comparator f3612e = new s0.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected C0044a f3613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected y0.a.C0047a f3614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f3616d;

    /* JADX INFO: renamed from: s0.a$a, reason: collision with other inner class name */
    public static class C0044a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f3617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y0.a f3618b;
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y0.a.C0047a f3619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3622d = true;

        public b(y0.a.C0047a c0047a, String str) {
            this.f3619a = c0047a;
            this.f3620b = str;
            this.f3621c = "target-pkg-" + Base64.encodeToString(str.getBytes(), 3);
        }

        public abstract void a(JSONObject jSONObject);

        public void b(boolean z2) {
            this.f3622d = z2;
        }

        public boolean c() {
            String strA = this.f3619a.a(this.f3621c, true);
            if (!TextUtils.isEmpty(strA)) {
                try {
                    a(new JSONObject(strA));
                    b(false);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public abstract void d(JSONObject jSONObject);

        public boolean e() {
            if (this.f3622d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    d(jSONObject);
                    this.f3619a.e(this.f3621c, jSONObject.toString(), true);
                    b(false);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    public static class c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3623a;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h.a f3624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Exception f3626c;

        public e(int i2, h.a aVar, Exception exc) {
            this.f3625b = i2;
            this.f3624a = aVar;
            this.f3626c = exc;
        }

        public static e a() {
            return new e(-1, null, null);
        }

        public static e b(int i2) {
            return new e(i2, null, null);
        }

        public static e c(h.a aVar) {
            return new e(0, aVar, null);
        }

        public boolean d() {
            return this.f3625b == 0;
        }
    }

    public a(String str, long j2) {
        this.f3615c = str;
        this.f3616d = j2;
    }

    public String a() {
        return this.f3615c;
    }

    public abstract e b(String str, d dVar);

    public final void c(C0044a c0044a) {
        this.f3613a = c0044a;
        this.f3614b = c0044a.f3618b.e().c("cs");
    }

    public abstract void d(c cVar);

    public long e() {
        return this.f3616d;
    }
}
