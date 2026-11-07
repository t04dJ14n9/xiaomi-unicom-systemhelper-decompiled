package r0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    g[] f3588a = {new h(8, 0), new j(0, 1), new j(1, 1), new h(7, 1)};

    public byte[] a(byte[] bArr) {
        f fVar = new f();
        byte[] bArrB = c.b(bArr, bArr.length + ((this.f3588a.length + 1) * f.f3594b));
        c.a(bArrB, fVar.b(), bArr.length);
        int i2 = 0;
        while (true) {
            g[] gVarArr = this.f3588a;
            if (i2 >= gVarArr.length) {
                return Arrays.copyOf(fVar.b(), f.f3594b);
            }
            g gVar = gVarArr[i2];
            i2++;
            int length = bArr.length + (f.f3594b * i2);
            fVar.a(gVar.b(bArrB, 0, length), gVar.a(), gVar.c(), gVar.d());
            c.a(bArrB, fVar.b(), length);
        }
    }
}
