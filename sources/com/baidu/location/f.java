package com.baidu.location;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import m.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends Service {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f2178e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2179f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f2180g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1.f f2181b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1.f f2182c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1.f f2183d = null;

    public static float a() {
        return 9.521f;
    }

    public static String b() {
        return "app.jar";
    }

    public static Context c() {
        return f2178e;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b1.f fVar = this.f2183d;
        if (fVar != null) {
            return fVar.onBind(intent);
        }
        return null;
    }

    @Override // android.app.Service
    @SuppressLint({"NewApi"})
    public void onCreate() {
        if (f2179f) {
            Log.d("baidu_location_service", "baidu location service can not start again ...20190306..." + Process.myPid());
            return;
        }
        f2178e = getApplicationContext();
        System.currentTimeMillis();
        this.f2182c = new a();
        b1.f fVar = this.f2181b;
        if (fVar == null || fVar.b() < this.f2182c.b()) {
            this.f2183d = this.f2182c;
            this.f2181b = null;
        } else {
            this.f2183d = this.f2181b;
            this.f2182c = null;
        }
        f2179f = true;
        this.f2183d.a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f2179f = false;
        b1.f fVar = this.f2183d;
        if (fVar != null) {
            fVar.onDestroy();
        }
        if (f2180g) {
            stopForeground(true);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("command", 0);
                if (intExtra == 1) {
                    startForeground(intent.getIntExtra("id", 0), (Notification) intent.getParcelableExtra("notification"));
                    f2180g = true;
                } else if (intExtra == 2) {
                    stopForeground(intent.getBooleanExtra("removenotify", true));
                    f2180g = false;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        b1.f fVar = this.f2183d;
        if (fVar == null) {
            return 2;
        }
        return fVar.onStartCommand(intent, i2, i3);
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        b1.f fVar = this.f2183d;
        if (fVar != null) {
            fVar.onTaskRemoved(intent);
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
