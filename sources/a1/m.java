package a1;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
class m implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f64a;

    m(k kVar) {
        this.f64a = kVar;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        if ("api.map.baidu.com".equals(str)) {
            return true;
        }
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
    }
}
