package android.support.v4.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    public interface a {
        void onBackStackChanged();
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract List<e> b();

    public abstract boolean c();

    public abstract boolean d();
}
