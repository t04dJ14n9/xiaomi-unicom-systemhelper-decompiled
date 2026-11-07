package t0;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
class d extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected byte[] f3696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f3697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f3698f;

    d(b bVar) {
        super(bVar);
        this.f3698f = null;
        int i2 = this.f3710b;
        this.f3697e = new byte[i2];
        this.f3696d = new byte[i2];
    }

    @Override // t0.f
    void a() {
        System.arraycopy(this.f3711c, 0, this.f3696d, 0, this.f3710b);
    }

    @Override // t0.f
    void b(boolean z2, String str, byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr == null || bArr2 == null || bArr2.length != this.f3710b) {
            throw new InvalidKeyException("Internal error");
        }
        this.f3711c = bArr2;
        a();
        this.f3709a.e(z2, str, bArr);
    }

    @Override // t0.f
    void c(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5 = i3 + i2;
        while (i2 < i5) {
            for (int i6 = 0; i6 < this.f3710b; i6++) {
                this.f3697e[i6] = (byte) (bArr[i6 + i2] ^ this.f3696d[i6]);
            }
            this.f3709a.f(this.f3697e, 0, bArr2, i4);
            System.arraycopy(bArr2, i4, this.f3696d, 0, this.f3710b);
            int i7 = this.f3710b;
            i2 += i7;
            i4 += i7;
        }
    }

    @Override // t0.f
    void d() {
        if (this.f3698f == null) {
            this.f3698f = new byte[this.f3710b];
        }
        System.arraycopy(this.f3696d, 0, this.f3698f, 0, this.f3710b);
    }

    @Override // t0.f
    void e(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5;
        int i6 = i3 + i2;
        byte[] bArr3 = (bArr != bArr2 || i2 < i4 || i2 - i4 >= this.f3710b) ? null : (byte[]) bArr.clone();
        while (i2 < i6) {
            this.f3709a.j(bArr, i2, this.f3697e, 0);
            int i7 = 0;
            while (true) {
                i5 = this.f3710b;
                if (i7 >= i5) {
                    break;
                }
                bArr2[i7 + i4] = (byte) (this.f3697e[i7] ^ this.f3696d[i7]);
                i7++;
            }
            byte[] bArr4 = this.f3696d;
            if (bArr3 == null) {
                System.arraycopy(bArr, i2, bArr4, 0, i5);
            } else {
                System.arraycopy(bArr3, i2, bArr4, 0, i5);
            }
            int i8 = this.f3710b;
            i2 += i8;
            i4 += i8;
        }
    }

    @Override // t0.f
    void f() {
        System.arraycopy(this.f3698f, 0, this.f3696d, 0, this.f3710b);
    }
}
