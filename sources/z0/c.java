package z0;

import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static String a(File file) throws Throwable {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                try {
                    char[] cArr = new char[8192];
                    CharArrayWriter charArrayWriter = new CharArrayWriter();
                    while (true) {
                        int i2 = fileReader.read(cArr);
                        if (i2 <= 0) {
                            break;
                        }
                        charArrayWriter.write(cArr, 0, i2);
                        th = th;
                        fileReader2 = fileReader;
                        if (fileReader2 != null) {
                            try {
                                fileReader2.close();
                            } catch (Exception e2) {
                                c(e2);
                            }
                        }
                        throw th;
                    }
                    String string = charArrayWriter.toString();
                    try {
                        fileReader.close();
                    } catch (Exception e3) {
                        c(e3);
                    }
                    return string;
                } catch (Exception e4) {
                    e = e4;
                    c(e);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Exception e5) {
                            c(e5);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
            }
        } catch (Exception e6) {
            e = e6;
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                c(e2);
            }
        }
    }

    public static void c(Throwable th) {
    }
}
