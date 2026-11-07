package g;

import android.content.Context;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f2594e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2596b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2595a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2597c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, a> f2598d = Collections.synchronizedMap(new HashMap());

    public static class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f2600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f2601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f2602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f2603f;
    }

    public b(Context context) {
        this.f2596b = "slr";
        this.f2596b = new File(context.getCacheDir(), this.f2596b).getAbsolutePath();
    }

    public static synchronized b a() {
        return f2594e;
    }

    public static b b(Context context) {
        if (f2594e == null) {
            f2594e = new b(context);
        }
        return f2594e;
    }

    public Map<String, a> c() {
        return this.f2598d;
    }

    public boolean d() {
        return this.f2595a;
    }

    public boolean e() {
        return this.f2597c.equals("on");
    }
}
