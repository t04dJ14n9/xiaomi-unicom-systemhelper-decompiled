package com.mobiletools.systemhelper.control;

import android.app.Application;
import f1.a;
import g1.h;

/* JADX INFO: loaded from: classes.dex */
public class DMApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        h.a("DMApplication", "onCreate--->");
        a.n(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        h.a("DMApplication", "onTerminate--->");
    }
}
