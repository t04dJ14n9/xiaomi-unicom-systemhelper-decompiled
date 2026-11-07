package t0;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SecureRandom f3694b = new SecureRandom();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f3695a;

    public c() {
        this.f3695a = null;
        this.f3695a = new e(new b(), 16);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidAlgorithmParameterException {
        c cVar = new c();
        cVar.a(2, bArr, bArr2);
        return cVar.b(bArr3);
    }

    public void a(int i2, byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f3695a.d(i2, bArr, bArr2, f3694b);
    }

    public final byte[] b(byte[] bArr) {
        if (bArr != null) {
            return this.f3695a.e(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }
}
