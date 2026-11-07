package com.baidu.location.indoor.mapversion;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class IndoorJni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f2184a = false;

    static {
        try {
            System.loadLibrary("indoor");
            f2184a = true;
            System.err.println("load vdr indoor lib success.");
            Log.i("indoorJNI", "indoor lib loadJniSuccess:" + f2184a);
        } catch (Throwable th) {
            Log.i("indoorJNI", "indoor lib annot load indoor lib:" + th.toString());
            System.err.println("Cannot load indoor lib");
            th.printStackTrace();
            f2184a = false;
        }
    }

    public static native int destroyGpsChecker();

    public static native String getFloor(long j2, int i2);

    public static native int getGpsStatus(int i2, String str);

    public static native int getInout(long j2, int i2);

    public static native int initGpsChecker(int i2, String str, String str2);

    public static native void initPf();

    public static native float pgo();

    public static native String phs(int i2, float f2, float f3, float f4, long j2);

    public static native void resetPf();

    public static native void setBarometers(float f2, long j2);

    public static native void setBleLoc4Scenario(double d2, double d3, String str, int i2, long j2, int i3);

    public static native void setGps(double d2, double d3, float f2, float f3, float f4, double d4, int i2, long j2);

    public static native double[] setPfBle(double d2, double d3, double d4, double d5, String str, String str2, long j2, int i2, String str3);

    public static native double[] setPfDr(double d2, double d3, String str, long j2);

    public static native void setPfGeoMap(double[][] dArr, String str, int i2, int i3);

    public static native void setPfRdnt(String str, short[][] sArr, double d2, double d3, int i2, int i3, double d4, double d5, String str2);

    public static native double[] setPfWf(double d2, double d3, double d4, long j2);

    public static native void startPdr();

    public static native void stopPdr();
}
