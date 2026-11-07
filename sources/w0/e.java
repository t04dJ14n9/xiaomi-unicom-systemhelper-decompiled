package w0;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f4037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f4038b;

    public e(byte[] bArr, byte[] bArr2) {
        this.f4037a = new BigInteger(bArr);
        this.f4038b = new BigInteger(bArr2);
    }

    @Override // w0.d
    public BigInteger a() {
        return this.f4037a;
    }

    @Override // w0.d
    public BigInteger b() {
        return this.f4038b;
    }
}
