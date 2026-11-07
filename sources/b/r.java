package b;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f1819c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r f1820d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f1821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f1822b = null;

    public r() {
        this.f1821a = null;
        if (com.baidu.location.f.c() != null) {
            this.f1821a = b(com.baidu.location.f.c());
        }
    }

    public static SharedPreferences b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences("MapCoreServicePreIA", 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static r c() {
        r rVar;
        synchronized (f1819c) {
            if (f1820d == null) {
                f1820d = new r();
            }
            rVar = f1820d;
        }
        return rVar;
    }

    public synchronized long a(String str, long j2) {
        SharedPreferences sharedPreferences = this.f1821a;
        if (sharedPreferences != null) {
            try {
                j2 = sharedPreferences.getLong(str, j2);
            } catch (Exception unused) {
            }
        }
        return j2;
    }

    public synchronized String d(String str, String str2) {
        SharedPreferences sharedPreferences = this.f1821a;
        if (sharedPreferences != null) {
            try {
                str2 = sharedPreferences.getString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public SharedPreferences e(Context context) {
        if (this.f1822b == null && context != null) {
            try {
                this.f1822b = context.getSharedPreferences("MapCoreServicePregck", 0);
            } catch (Exception e2) {
                e2.printStackTrace();
                this.f1822b = null;
            }
        }
        return this.f1822b;
    }

    public synchronized void f(String str, long j2) {
        SharedPreferences sharedPreferences = this.f1821a;
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str, j2);
                editorEdit.commit();
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void g(String str, String str2) {
        SharedPreferences sharedPreferences = this.f1821a;
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(str, str2);
                editorEdit.commit();
            } catch (Exception unused) {
            }
        }
    }
}
