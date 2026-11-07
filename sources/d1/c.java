package d1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public abstract int a();

    public abstract int b();

    public void c(byte[] bArr, int i2, int i3) {
        try {
            b bVarM = b.m(bArr, i2, i3);
            e(bVarM);
            bVarM.a();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public byte[] d() {
        int iB = b();
        byte[] bArr = new byte[iB];
        c(bArr, 0, iB);
        return bArr;
    }

    public abstract void e(b bVar);
}
