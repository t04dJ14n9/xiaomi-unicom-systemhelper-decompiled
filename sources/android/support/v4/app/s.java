package android.support.v4.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static <T extends android.arch.lifecycle.e & android.arch.lifecycle.o> s b(T t2) {
        return new LoaderManagerImpl(t2, t2.g());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
