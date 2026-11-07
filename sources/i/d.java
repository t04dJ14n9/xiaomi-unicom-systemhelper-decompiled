package i;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import j.k;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f2821g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile d f2822h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object f2823i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f2824j = "http://ofloc.map.baidu.com/offline_loc";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f2825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f2826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.b f2827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f2828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i.c f2829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExecutorService f2830f = null;

    public class a implements Callable<b1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f2831a;

        public a(String[] strArr) {
            this.f2831a = strArr;
        }

        /* JADX WARN: Code duplicated, block: B:57:0x005e A[EXC_TOP_SPLITTER, PHI: r2 r11
          0x005e: PHI (r2v6 b1.c) = (r2v15 b1.c), (r2v5 b1.c), (r2v17 b1.c), (r2v12 b1.c) binds: [B:25:0x005c, B:16:0x004e, B:40:0x0085, B:31:0x0077] A[DONT_GENERATE, DONT_INLINE]
          0x005e: PHI (r11v4 android.database.Cursor) = 
          (r11v2 android.database.Cursor)
          (r11v3 android.database.Cursor)
          (r11v8 android.database.Cursor)
          (r11v11 android.database.Cursor)
         binds: [B:25:0x005c, B:16:0x004e, B:40:0x0085, B:31:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b1.c call() throws Throwable {
            Cursor cursorQuery;
            b1.c cVar = new b1.c();
            if (this.f2831a.length > 0) {
                Cursor cursor = null;
                cVarB = null;
                cVarB = null;
                cVarB = null;
                b1.c cVarB = null;
                Cursor cursor2 = null;
                ProviderInfo providerInfoResolveContentProvider = null;
                for (String str : d.this.f2829e.T()) {
                    try {
                        providerInfoResolveContentProvider = d.f2821g.getPackageManager().resolveContentProvider(str, 0);
                    } catch (Exception unused) {
                        providerInfoResolveContentProvider = null;
                    }
                    if (providerInfoResolveContentProvider != null) {
                        break;
                    }
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = d.f2821g.getContentResolver().query(d.j(providerInfoResolveContentProvider.authority), this.f2831a, null, null, null);
                        try {
                            cVarB = e.b(cursorQuery);
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception unused2) {
                                }
                            }
                        } catch (Exception unused3) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused5) {
                        cursorQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    try {
                        cursorQuery = d.this.f2827c.c(new e.a(this.f2831a));
                        try {
                            cVarB = e.b(cursorQuery);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Exception unused6) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursorQuery;
                            if (cursor2 != null) {
                                try {
                                    cursor2.close();
                                } catch (Exception unused7) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused8) {
                        cursorQuery = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                cVar = cVarB;
                if (cVar != null && cVar.v() != 67) {
                    cVar.o0(66);
                }
            }
            return cVar;
        }
    }

    public enum b {
        NEED_TO_LOG,
        NO_NEED_TO_LOG
    }

    public enum c {
        IS_MIX_MODE,
        IS_NOT_MIX_MODE
    }

    /* JADX INFO: renamed from: i.d$d, reason: collision with other inner class name */
    public enum EnumC0031d {
        NETWORK_UNKNOWN,
        NETWORK_WIFI,
        NETWORK_2G,
        NETWORK_3G,
        NETWORK_4G
    }

    public d() {
        File file = null;
        try {
            File file2 = new File(f2821g.getFilesDir(), "ofld");
            try {
                if (!file2.exists()) {
                    file2.mkdir();
                }
            } catch (Exception unused) {
            }
            file = file2;
        } catch (Exception unused2) {
        }
        this.f2825a = file;
        i.b bVar = new i.b(this);
        this.f2827c = bVar;
        this.f2826b = new f(bVar.d());
        i.c cVar = new i.c(this, bVar.d());
        this.f2829e = cVar;
        this.f2828d = new g(this, bVar.d(), cVar.q());
    }

    public static void f(Context context) {
        if (f2821g == null) {
            f2821g = context;
            n.b.g().d(f2821g);
        }
    }

    public static final Uri j(String str) {
        return Uri.parse(String.format("content://%s/", str));
    }

    public static d n() {
        d dVar;
        synchronized (f2823i) {
            if (f2822h == null) {
                if (f2821g == null) {
                    f(com.baidu.location.f.c());
                }
                f2822h = new d();
            }
            f2822h.i();
            dVar = f2822h;
        }
        return dVar;
    }

    public b1.c c(j.a aVar, k kVar, b1.c cVar, c cVar2, b bVar) {
        String strH;
        int iX;
        if (cVar2 == c.IS_MIX_MODE) {
            iX = this.f2829e.x();
            strH = n.b.g().h() + "&mixMode=1";
        } else {
            strH = n.b.g().h();
            iX = 0;
        }
        String[] strArrE = e.e(aVar, kVar, cVar, strH, (bVar == b.NEED_TO_LOG ? Boolean.TRUE : Boolean.FALSE).booleanValue(), iX);
        if (strArrE.length <= 0) {
            return null;
        }
        b1.c cVarD = d(strArrE);
        if (cVarD == null) {
            return cVarD;
        }
        cVarD.v();
        return cVarD;
    }

    public final b1.c d(String[] strArr) {
        new b1.c();
        if (this.f2830f == null) {
            this.f2830f = Executors.newSingleThreadExecutor();
        }
        FutureTask futureTask = (FutureTask) this.f2830f.submit(new a(strArr));
        try {
            return (b1.c) futureTask.get(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            futureTask.cancel(true);
            return null;
        }
    }

    public long g(String str) {
        return this.f2829e.e(str);
    }

    public final void i() {
        this.f2829e.f();
    }

    public void k() {
    }

    public i.c l() {
        return this.f2829e;
    }

    public Context m() {
        return f2821g;
    }

    public f o() {
        return this.f2826b;
    }

    public double p() {
        NetworkInfo activeNetworkInfo;
        EnumC0031d enumC0031d;
        try {
            activeNetworkInfo = ((ConnectivityManager) f2821g.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            th.printStackTrace();
            activeNetworkInfo = null;
        }
        EnumC0031d enumC0031d2 = EnumC0031d.NETWORK_UNKNOWN;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            enumC0031d = enumC0031d2;
        } else {
            enumC0031d = activeNetworkInfo.getType() == 1 ? EnumC0031d.NETWORK_WIFI : enumC0031d2;
            if (activeNetworkInfo.getType() == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    enumC0031d = EnumC0031d.NETWORK_2G;
                } else if (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) {
                    enumC0031d = EnumC0031d.NETWORK_3G;
                } else if (subtype == 13) {
                    enumC0031d = EnumC0031d.NETWORK_4G;
                }
            }
        }
        if (enumC0031d == enumC0031d2) {
            return this.f2829e.O();
        }
        if (enumC0031d == EnumC0031d.NETWORK_WIFI) {
            return this.f2829e.Q();
        }
        if (enumC0031d == EnumC0031d.NETWORK_2G) {
            return this.f2829e.G();
        }
        if (enumC0031d == EnumC0031d.NETWORK_3G) {
            return this.f2829e.J();
        }
        if (enumC0031d == EnumC0031d.NETWORK_4G) {
            return this.f2829e.M();
        }
        return 0.0d;
    }

    public g q() {
        return this.f2828d;
    }

    public File r() {
        return this.f2825a;
    }

    public boolean s() {
        return this.f2829e.V();
    }

    public boolean t() {
        return this.f2829e.X();
    }

    public boolean u() {
        return this.f2829e.b0();
    }

    public final boolean v() {
        String packageName = f2821g.getPackageName();
        ProviderInfo providerInfoResolveContentProvider = null;
        for (String str : this.f2829e.T()) {
            try {
                providerInfoResolveContentProvider = f2821g.getPackageManager().resolveContentProvider(str, 0);
            } catch (Exception unused) {
                providerInfoResolveContentProvider = null;
            }
            if (providerInfoResolveContentProvider != null) {
                break;
            }
        }
        return providerInfoResolveContentProvider == null || packageName.equals(providerInfoResolveContentProvider.packageName);
    }

    public boolean w() {
        return this.f2829e.d0();
    }

    public boolean x() {
        return this.f2829e.e0();
    }

    public void y() {
        if (!v() || i.N()) {
            return;
        }
        this.f2827c.u();
    }

    public void z() {
        if (i.N()) {
            return;
        }
        this.f2826b.f();
    }
}
