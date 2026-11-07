package b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object f1688b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f1689c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1690a = -1;

    public static g a() {
        g gVar;
        synchronized (f1688b) {
            if (f1689c == null) {
                f1689c = new g();
            }
            gVar = f1689c;
        }
        return gVar;
    }

    public void b(int i2, int i3, String str) {
        if (i3 != this.f1690a) {
            this.f1690a = i3;
            Bundle bundle = new Bundle();
            bundle.putInt("loctype", i2);
            bundle.putInt("diagtype", i3);
            bundle.putByteArray("diagmessage", str.getBytes());
            c.r().c(bundle, 303);
        }
    }

    public void c() {
        this.f1690a = -1;
    }
}
