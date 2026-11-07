package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public class Jni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f2169a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f2170b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f2171c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f2172d = 11;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f2173e = 12;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f2174f = 13;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f2175g = 15;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f2176h = 1024;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f2177i = false;

    static {
        try {
            System.loadLibrary("locSDK8b");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            f2177i = true;
        }
    }

    public static native String a(byte[] bArr, int i2);

    public static native String b(double d2, double d3, int i2, int i3);

    public static native String c(byte[] bArr, int i2);

    public static double[] d(double d2, double d3, String str) {
        int i2;
        double[] dArr = {0.0d, 0.0d};
        if (f2177i) {
            return dArr;
        }
        if (str.equals("bd09")) {
            i2 = f2169a;
        } else if (str.equals("bd09ll")) {
            i2 = f2170b;
        } else if (str.equals("gcj02")) {
            i2 = f2171c;
        } else if (str.equals("gps2gcj")) {
            i2 = f2172d;
        } else if (str.equals("bd092gcj")) {
            i2 = f2173e;
        } else if (str.equals("bd09ll2gcj")) {
            i2 = f2174f;
        } else {
            i2 = str.equals("wgs842mc") ? f2175g : -1;
        }
        if (str.equals("gcj2wgs")) {
            i2 = 16;
        }
        try {
            String[] strArrSplit = b(d2, d3, i2, 132456).split(":");
            dArr[0] = Double.parseDouble(strArrSplit[0]);
            dArr[1] = Double.parseDouble(strArrSplit[1]);
        } catch (Throwable unused) {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        return dArr;
    }

    public static String e(String str) {
        if (f2177i) {
            return "err!";
        }
        if (str == null) {
            return "null";
        }
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[f2176h];
        int length = bytes.length;
        if (length > 740) {
            length = 740;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            byte b2 = bytes[i3];
            if (b2 != 0) {
                bArr[i2] = b2;
                i2++;
            }
        }
        try {
            return a(bArr, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return "err!";
        }
    }

    public static native String ee(String str, int i2);

    public static native String encodeNotLimit(String str, int i2);

    public static String f(String str) {
        if (f2177i) {
            return "err!";
        }
        return e(str) + "|tp=3";
    }

    public static String g(String str) {
        if (f2177i) {
            return "err!";
        }
        if (str == null) {
            return "null";
        }
        try {
            return c(str.getBytes(), 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return "err!";
        }
    }

    public static native double gsr(float f2, double d2, double d3);

    public static Long h(String str) {
        String str2;
        if (f2177i) {
            return null;
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            return Long.valueOf(murmur(str2));
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String i(String str) {
        String str2;
        String strEncodeNotLimit = "err!";
        if (f2177i) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            strEncodeNotLimit = encodeNotLimit(str2, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        return strEncodeNotLimit + "|tp=3";
    }

    public static String j(String str) {
        String str2;
        String strEe = "err!";
        if (f2177i) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            strEe = ee(str2, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        return strEe + "|tp=4";
    }

    public static double k(float f2, double d2, double d3) {
        if (f2177i) {
            return 0.0d;
        }
        try {
            return gsr(f2, d2, d3);
        } catch (UnsatisfiedLinkError unused) {
            return 0.0d;
        }
    }

    public static String l() {
        if (f2177i) {
            return null;
        }
        try {
            return ldkaiv();
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static native String ldkaiv();

    public static native long murmur(String str);
}
