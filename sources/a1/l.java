package a1;

import android.text.TextUtils;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes.dex */
class l extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f63a;

    l(k kVar) {
        this.f63a = kVar;
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (!TextUtils.isEmpty(this.f63a.f61g) && !TextUtils.isEmpty(this.f63a.f62h)) {
            return new PasswordAuthentication(this.f63a.f61g, this.f63a.f62h.toCharArray());
        }
        d.b("Proxy Username or Password is null");
        return null;
    }
}
