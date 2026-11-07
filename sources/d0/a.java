package d0;

import android.util.Base64;
import f0.j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f2376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f2378f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) j.b(str);
        this.f2373a = str4;
        String str5 = (String) j.b(str2);
        this.f2374b = str5;
        String str6 = (String) j.b(str3);
        this.f2375c = str6;
        this.f2376d = (List) j.b(list);
        this.f2377e = 0;
        this.f2378f = str4 + "-" + str5 + "-" + str6;
    }

    public List<List<byte[]>> a() {
        return this.f2376d;
    }

    public int b() {
        return this.f2377e;
    }

    public String c() {
        return this.f2378f;
    }

    public String d() {
        return this.f2373a;
    }

    public String e() {
        return this.f2374b;
    }

    public String f() {
        return this.f2375c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2373a + ", mProviderPackage: " + this.f2374b + ", mQuery: " + this.f2375c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f2376d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f2376d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2377e);
        return sb.toString();
    }
}
