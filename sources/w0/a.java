package w0;

import java.security.InvalidKeyException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f4025a;

    private a() {
    }

    public static a a() throws NoSuchPaddingException {
        a aVar = new a();
        c cVar = new c();
        aVar.f4025a = cVar;
        cVar.c("PKCS1Padding");
        return aVar;
    }

    public void b(int i2, d dVar) throws InvalidKeyException {
        this.f4025a.a(i2, dVar, b.f4026a);
    }

    public final byte[] c(byte[] bArr) {
        if (bArr != null) {
            return this.f4025a.e(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }
}
