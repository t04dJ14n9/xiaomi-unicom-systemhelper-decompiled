package c;

import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import com.baidu.location.Jni;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import n.i;

/* JADX INFO: loaded from: classes.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f2086b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2087a = 0;

    public static e a() {
        if (f2086b == null) {
            f2086b = new e();
        }
        return f2086b;
    }

    public final String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    public final void c(File file, String str, String str2) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(280L);
            randomAccessFile.writeInt(12346);
            randomAccessFile.seek(300L);
            randomAccessFile.writeLong(System.currentTimeMillis());
            byte[] bytes = str.getBytes();
            randomAccessFile.writeInt(bytes.length);
            randomAccessFile.write(bytes, 0, bytes.length);
            randomAccessFile.seek(600L);
            byte[] bytes2 = str2.getBytes();
            randomAccessFile.writeInt(bytes2.length);
            randomAccessFile.write(bytes2, 0, bytes2.length);
            if (!d(str, str2)) {
                randomAccessFile.seek(280L);
                randomAccessFile.writeInt(1326);
            }
            randomAccessFile.close();
        } catch (Exception unused) {
        }
    }

    public final boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !j.f.M().Y()) {
            return false;
        }
        try {
            URL url = new URL(n.d.f3355a);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("e0");
            stringBuffer.append("=");
            stringBuffer.append(str);
            stringBuffer.append("&");
            stringBuffer.append("e1");
            stringBuffer.append("=");
            stringBuffer.append(str2);
            stringBuffer.append("&");
            if (stringBuffer.length() > 0) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setConnectTimeout(n.a.f3341a);
            httpsURLConnection.setReadTimeout(n.a.f3341a);
            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
            httpsURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(stringBuffer.toString().getBytes());
            outputStream.flush();
            outputStream.close();
            return httpsURLConnection.getResponseCode() == 200;
        } catch (Exception unused) {
        }
    }

    public void e() {
        String str;
        try {
            File file = new File((Environment.getExternalStorageDirectory().getPath() + "/traces") + "/error_fs2.dat");
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(280L);
                if (1326 == randomAccessFile.readInt()) {
                    randomAccessFile.seek(308L);
                    int i2 = randomAccessFile.readInt();
                    String str2 = null;
                    if (i2 <= 0 || i2 >= 2048) {
                        str = null;
                    } else {
                        byte[] bArr = new byte[i2];
                        randomAccessFile.read(bArr, 0, i2);
                        str = new String(bArr, 0, i2);
                    }
                    randomAccessFile.seek(600L);
                    int i3 = randomAccessFile.readInt();
                    if (i3 > 0 && i3 < 2048) {
                        byte[] bArr2 = new byte[i3];
                        randomAccessFile.read(bArr2, 0, i3);
                        str2 = new String(bArr2, 0, i3);
                    }
                    if (d(str, str2)) {
                        randomAccessFile.seek(280L);
                        randomAccessFile.writeInt(12346);
                    }
                }
                randomAccessFile.close();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8 A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b4, blocks: (B:19:0x007d, B:23:0x0087, B:25:0x00a8), top: B:49:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ed A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:31:0x00b8, B:33:0x00ed, B:35:0x00f8, B:36:0x00fb, B:40:0x0103, B:41:0x0108, B:43:0x0124, B:44:0x0127), top: B:48:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8 A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:31:0x00b8, B:33:0x00ed, B:35:0x00f8, B:36:0x00fb, B:40:0x0103, B:41:0x0108, B:43:0x0124, B:44:0x0127), top: B:48:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:41:0x0108 A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:31:0x00b8, B:33:0x00ed, B:35:0x00f8, B:36:0x00fb, B:40:0x0103, B:41:0x0108, B:43:0x0124, B:44:0x0127), top: B:48:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0124 A[Catch: Exception -> 0x0009, TryCatch #0 {Exception -> 0x0009, blocks: (B:31:0x00b8, B:33:0x00ed, B:35:0x00f8, B:36:0x00fb, B:40:0x0103, B:41:0x0108, B:43:0x0124, B:44:0x0127), top: B:48:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String strB;
        String str;
        String strF;
        String str2;
        File file;
        RandomAccessFile randomAccessFile;
        File file2;
        String str3;
        boolean z2 = true;
        int i2 = this.f2087a + 1;
        this.f2087a = i2;
        if (i2 <= 2) {
            if (System.currentTimeMillis() - m.a.d() < 10000 && 9.521f > com.baidu.location.f.a()) {
                if (System.currentTimeMillis() - n.e.g().a() < 40000) {
                    File file3 = new File(i.y() + File.separator + com.baidu.location.f.b());
                    if (file3.exists()) {
                        file3.delete();
                    }
                } else {
                    n.e.g().d(System.currentTimeMillis());
                }
            }
            boolean z3 = false;
            File file4 = null;
            try {
                strB = b(th);
                if (strB != null) {
                    try {
                        if (!strB.contains("com.baidu.location")) {
                            z2 = false;
                        }
                        str3 = n.b.g().b(false) + b.c.r().o();
                        if (str3 != null) {
                            strF = Jni.f(str3);
                            z3 = z2;
                            str = strB;
                        } else {
                            z3 = z2;
                            str = strB;
                            strF = null;
                        }
                    } catch (Exception unused) {
                    }
                    if (z3) {
                        try {
                            str2 = Environment.getExternalStorageDirectory().getPath() + "/traces";
                            file = new File(str2 + "/error_fs2.dat");
                            if (file.exists()) {
                                randomAccessFile = new RandomAccessFile(file, "rw");
                                randomAccessFile.seek(300L);
                                if (System.currentTimeMillis() - randomAccessFile.readLong() > 86400000) {
                                    c(file, strF, str);
                                }
                                randomAccessFile.close();
                            } else {
                                file2 = new File(str2);
                                if (!file2.exists()) {
                                    file2.mkdirs();
                                }
                                if (!file.createNewFile()) {
                                    file4 = file;
                                }
                                c(file4, strF, str);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    z2 = false;
                    str3 = n.b.g().b(false) + b.c.r().o();
                    if (str3 != null) {
                        strF = Jni.f(str3);
                        z3 = z2;
                        str = strB;
                    } else {
                        z3 = z2;
                        str = strB;
                        strF = null;
                    }
                    if (z3) {
                        str2 = Environment.getExternalStorageDirectory().getPath() + "/traces";
                        file = new File(str2 + "/error_fs2.dat");
                        if (file.exists()) {
                            file2 = new File(str2);
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            if (!file.createNewFile()) {
                                file4 = file;
                            }
                            c(file4, strF, str);
                        } else {
                            randomAccessFile = new RandomAccessFile(file, "rw");
                            randomAccessFile.seek(300L);
                            if (System.currentTimeMillis() - randomAccessFile.readLong() > 86400000) {
                                c(file, strF, str);
                            }
                            randomAccessFile.close();
                        }
                    }
                }
            } catch (Exception unused3) {
                strB = null;
            }
        }
        Process.killProcess(Process.myPid());
    }
}
