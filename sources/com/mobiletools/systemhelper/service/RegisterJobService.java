package com.mobiletools.systemhelper.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import g1.h;

/* JADX INFO: loaded from: classes.dex */
public class RegisterJobService extends JobService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f2205b = "RegisterJobService";

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        h.a(f2205b, "Service created");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        h.a(f2205b, "Service destroyed");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        h.a(f2205b, "onStartCommand");
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        h.a(f2205b, "on start jobId: " + jobParameters.getJobId());
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        Log.i(f2205b, "on stop job: " + jobParameters.getJobId());
        return false;
    }
}
