package b;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f1755a = "Temp_in.dat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static File f1756b = new File(n.h.f3402a, f1755a);

    public static boolean a() {
        if (f1756b.exists()) {
            f1756b.delete();
        }
        if (!f1756b.getParentFile().exists()) {
            f1756b.getParentFile().mkdirs();
        }
        try {
            f1756b.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(f1756b, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(0);
            randomAccessFile.writeInt(1);
            randomAccessFile.close();
            d();
            return f1756b.exists();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean b(int i2, int i3, int i4) {
        int i5;
        int i6;
        return i2 >= 0 && i2 <= (i5 = n.i.Z) && i3 >= 0 && i3 <= (i6 = i2 + 1) && i4 >= 1 && i4 <= i6 && i4 <= i5;
    }

    public static String c() {
        File file = f1756b;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(f1756b, "rw");
            randomAccessFile.seek(0L);
            int i2 = randomAccessFile.readInt();
            int i3 = randomAccessFile.readInt();
            int i4 = randomAccessFile.readInt();
            if (!b(i2, i3, i4)) {
                randomAccessFile.close();
                a();
                return null;
            }
            if (i3 != 0 && i3 != i4) {
                long j2 = ((long) (((i3 - 1) * 1024) + 12)) + 0;
                randomAccessFile.seek(j2);
                int i5 = randomAccessFile.readInt();
                byte[] bArr = new byte[i5];
                randomAccessFile.seek(j2 + 4);
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i6] = randomAccessFile.readByte();
                }
                String str = new String(bArr);
                int i7 = n.i.Z;
                int i8 = 1;
                if (i2 < i7 || i3 != i7) {
                    i8 = 1 + i3;
                }
                randomAccessFile.seek(4L);
                randomAccessFile.writeInt(i8);
                randomAccessFile.close();
                return str;
            }
            randomAccessFile.close();
            return null;
        } catch (IOException unused) {
        }
    }

    public static void d() {
    }
}
