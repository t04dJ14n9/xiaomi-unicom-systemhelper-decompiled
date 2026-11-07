package m0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f3279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f3280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f3281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f3282e;

    public d() {
        super(null);
    }

    public d(Context context, int i2) {
        super(context);
        this.f3278a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f3279b = theme;
    }

    private Resources a() {
        if (this.f3282e == null) {
            Configuration configuration = this.f3281d;
            this.f3282e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f3282e;
    }

    private void c() {
        boolean z2 = this.f3279b == null;
        if (z2) {
            this.f3279b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3279b.setTo(theme);
            }
        }
        d(this.f3279b, this.f3278a, z2);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.f3278a;
    }

    protected void d(Resources.Theme theme, int i2, boolean z2) {
        theme.applyStyle(i2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3280c == null) {
            this.f3280c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3280c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3279b;
        if (theme != null) {
            return theme;
        }
        if (this.f3278a == 0) {
            this.f3278a = j0.i.f3150b;
        }
        c();
        return this.f3279b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f3278a != i2) {
            this.f3278a = i2;
            c();
        }
    }
}
