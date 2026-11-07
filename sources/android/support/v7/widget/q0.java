package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1509c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<q0>> f1510d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f1511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1512b;

    private q0(Context context) {
        super(context);
        if (!w0.b()) {
            this.f1511a = new s0(this, context.getResources());
            this.f1512b = null;
            return;
        }
        w0 w0Var = new w0(this, context.getResources());
        this.f1511a = w0Var;
        Resources.Theme themeNewTheme = w0Var.newTheme();
        this.f1512b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof q0) || (context.getResources() instanceof s0) || (context.getResources() instanceof w0) || !w0.b()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1509c) {
            ArrayList<WeakReference<q0>> arrayList = f1510d;
            if (arrayList == null) {
                f1510d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<q0> weakReference = f1510d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1510d.remove(size);
                    }
                }
                for (int size2 = f1510d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<q0> weakReference2 = f1510d.get(size2);
                    q0 q0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (q0Var != null && q0Var.getBaseContext() == context) {
                        return q0Var;
                    }
                }
            }
            q0 q0Var2 = new q0(context);
            f1510d.add(new WeakReference<>(q0Var2));
            return q0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1511a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1511a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1512b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f1512b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
