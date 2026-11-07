package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class i<E> extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final k f505e;

    i(Activity activity, Context context, Handler handler, int i2) {
        this.f505e = new k();
        this.f501a = activity;
        this.f502b = (Context) f0.j.c(context, "context == null");
        this.f503c = (Handler) f0.j.c(handler, "handler == null");
        this.f504d = i2;
    }

    i(f fVar) {
        this(fVar, fVar, fVar.f484d, 0);
    }

    Activity d() {
        return this.f501a;
    }

    Context e() {
        return this.f502b;
    }

    k f() {
        return this.f505e;
    }

    Handler g() {
        return this.f503c;
    }

    abstract void h(e eVar);

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract LayoutInflater j();

    public abstract int k();

    public abstract boolean l();

    public abstract boolean m(e eVar);

    public abstract void n();
}
