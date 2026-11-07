package com.mobiletools.systemhelper.service;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import f1.o;
import g1.h;

/* JADX INFO: loaded from: classes.dex */
public class RegisterIntentService extends IntentService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ServiceConnection f2203c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2204b;

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h.a("RegisterIntentService", "onServiceConnected-->");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            h.a("RegisterIntentService", "onServiceDisconnected-->");
        }
    }

    public RegisterIntentService() {
        super("RegisterIntentService");
        this.f2204b = null;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        h.a("RegisterIntentService", "RegisterIntentService onCreate-->");
        this.f2204b = getApplicationContext();
        o.f();
        o.e(this.f2204b);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        intent.getStringExtra("RegType");
        o.e(this.f2204b);
    }
}
