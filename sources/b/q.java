package b;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f1816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1817b = null;

    public interface a {
        void a(int i2, String str);

        void b(int i2, String str);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f1818a = new q();
    }

    public q() {
        f();
    }

    public static q e() {
        return b.f1818a;
    }

    public final Request.Builder a() {
        Request.Builder builder = new Request.Builder();
        builder.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        String str = n.i.f3432o0;
        if (str != null) {
            builder.addHeader("bd-loc-android", str);
        }
        return builder;
    }

    public final synchronized RequestBody b(Map<String, Object> map) {
        StringBuilder sb;
        sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), sb.toString());
    }

    public void c(String str) {
        this.f1817b = str;
    }

    public void d(Map<String, Object> map, String str, a aVar) {
        int iCode;
        String strMessage;
        try {
            RequestBody requestBodyB = b(map);
            Request.Builder builderA = a();
            String str2 = this.f1817b;
            if (str2 != null) {
                builderA.addHeader("alwd", str2);
            }
            Response responseExecute = this.f1816a.newCall(builderA.url(str).post(requestBodyB).build()).execute();
            if (!responseExecute.isSuccessful()) {
                iCode = responseExecute.code();
                strMessage = responseExecute.message();
            } else if (responseExecute.body() != null) {
                aVar.b(200, responseExecute.body().string());
                return;
            } else {
                strMessage = responseExecute.message();
                iCode = 400;
            }
            aVar.a(iCode, strMessage);
        } catch (IOException e2) {
            e2.printStackTrace();
            if (aVar != null) {
                aVar.a(-100, "e=" + e2.getMessage());
            }
        }
    }

    public final synchronized void f() {
        if (this.f1816a == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f1816a = builder.connectTimeout(12000L, timeUnit).readTimeout(12000L, timeUnit).writeTimeout(12000L, timeUnit).build();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
