package z0;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4072c;

    public a(String str, boolean z2, boolean z3) {
        this.f4070a = str;
        this.f4071b = z2;
        this.f4072c = z3;
    }

    private static int a(int i2) {
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 3;
        }
        if (i2 != 4) {
            return i2 != 5 ? -1 : 0;
        }
        return 1;
    }

    public String b(byte[] bArr) {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i3 = 0; i3 < (bArr.length + 4) / 5; i3++) {
            short[] sArr = new short[5];
            int[] iArr = new int[8];
            int i4 = 5;
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = (i3 * 5) + i5;
                if (i6 < bArr.length) {
                    sArr[i5] = (short) (bArr[i6] & 255);
                } else {
                    sArr[i5] = 0;
                    i4--;
                }
            }
            int iA = a(i4);
            short s2 = sArr[0];
            iArr[0] = (byte) ((s2 >> 3) & 31);
            short s3 = sArr[1];
            iArr[1] = (byte) (((s2 & 7) << 2) | ((s3 >> 6) & 3));
            iArr[2] = (byte) ((s3 >> 1) & 31);
            short s4 = sArr[2];
            iArr[3] = (byte) (((s3 & 1) << 4) | ((s4 >> 4) & 15));
            int i7 = (s4 & 15) << 1;
            short s5 = sArr[3];
            iArr[4] = (byte) (i7 | (1 & (s5 >> 7)));
            iArr[5] = (byte) ((s5 >> 2) & 31);
            short s6 = sArr[4];
            iArr[6] = (byte) (((s6 >> 5) & 7) | ((s5 & 3) << 3));
            iArr[7] = (byte) (s6 & 31);
            int i8 = 0;
            while (true) {
                i2 = 8 - iA;
                if (i8 >= i2) {
                    break;
                }
                char cCharAt = this.f4070a.charAt(iArr[i8]);
                if (this.f4072c) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
                byteArrayOutputStream.write(cCharAt);
                i8++;
            }
            if (this.f4071b) {
                while (i2 < 8) {
                    byteArrayOutputStream.write(61);
                    i2++;
                }
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }
}
