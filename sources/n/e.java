package n;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static e f3364e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3365a = "firll.dat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3366b = 3164;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3367c = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3368d = 60;

    public static e g() {
        if (f3364e == null) {
            f3364e = new e();
        }
        return f3364e;
    }

    public long a() {
        return b(this.f3367c);
    }

    public final long b(int i2) throws Throwable {
        RandomAccessFile randomAccessFile;
        String strY = i.y();
        if (strY == null) {
            return -1L;
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(strY + File.separator + this.f3365a, "rw");
            try {
                randomAccessFile.seek(i2);
                int i3 = randomAccessFile.readInt();
                long j2 = randomAccessFile.readLong();
                if (i3 == randomAccessFile.readInt()) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                    return j2;
                }
            } catch (Exception unused2) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile = randomAccessFile2;
                }
                return -1L;
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused5) {
        }
        return -1L;
    }

    public final void c(int i2, long j2) {
        String strY = i.y();
        if (strY == null) {
            return;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(strY + File.separator + this.f3365a, "rw");
            randomAccessFile.seek(i2);
            randomAccessFile.writeInt(this.f3366b);
            randomAccessFile.writeLong(j2);
            randomAccessFile.writeInt(this.f3366b);
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public void d(long j2) {
        c(this.f3367c, j2);
    }

    public long e() {
        return b(this.f3368d);
    }

    public void f(long j2) {
        c(this.f3368d, j2);
    }
}
