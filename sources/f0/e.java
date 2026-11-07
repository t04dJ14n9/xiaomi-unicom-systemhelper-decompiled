package f0;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class e extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f2511c = new StringBuilder(128);

    public e(String str) {
        this.f2510b = str;
    }

    private void a() {
        if (this.f2511c.length() > 0) {
            Log.d(this.f2510b, this.f2511c.toString());
            StringBuilder sb = this.f2511c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f2511c.append(c2);
            }
        }
    }
}
