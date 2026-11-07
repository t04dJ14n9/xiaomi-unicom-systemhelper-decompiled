package n;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.baidu.location.Jni;
import j.k;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static int A = 3;
    public static float A0 = 0.2f;
    public static int B = 10;
    public static int B0 = 0;
    public static int C = 2;
    public static int[] C0 = null;
    public static int D = 7;
    public static boolean D0 = false;
    public static int E = 20;
    public static int E0 = 8;
    public static int F = 70;
    public static int F0 = 4000;
    public static int G = 120;
    public static int G0 = -1;
    public static float H = 2.0f;
    public static int H0 = 10;
    public static float I = 10.0f;
    public static int I0 = 3;
    public static float J = 50.0f;
    public static int J0 = 40;
    public static float K = 200.0f;
    public static double[] K0 = null;
    public static int L = 16;
    public static int L0 = 1;
    public static float M = 0.9f;
    public static int M0 = 1;
    public static int N = 10000;
    public static int N0 = 1;
    public static float O = 0.5f;
    public static float P = 0.0f;
    public static float Q = 0.1f;
    public static int R = 30;
    public static int S = 100;
    public static int T = 0;
    public static int U = 0;
    public static int V = 0;
    public static boolean W = true;
    public static boolean X = true;
    public static int Y = 20;
    public static int Z = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3403a = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static int f3404a0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3405b = false;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static long f3406b0 = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f3407c = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static long f3408c0 = 15;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f3409d = "no";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static long f3410d0 = 300000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f3411e = 4;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static int f3412e0 = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f3413f = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static int f3414f0 = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f3415g = false;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static int f3416g0 = 30000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f3417h = false;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static int f3418h0 = 30000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f3419i = false;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static float f3420i0 = 10.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f3421j = false;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static float f3422j0 = 6.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f3423k = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static float f3424k0 = 10.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f3425l = "";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static int f3426l0 = 60;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f3427m = true;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static int f3428m0 = 70;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f3429n = 3;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static int f3430n0 = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static double f3431o = 0.0d;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static String f3432o0 = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static double f3433p = 0.0d;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static boolean f3434p0 = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static double f3435q = 0.0d;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f3436q0 = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static double f3437r = 0.0d;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f3438r0 = 15;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f3439s = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static float f3440s0 = 0.75f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static byte[] f3441t = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static double f3442t0 = -0.10000000149011612d;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f3443u = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f3444u0 = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f3445v = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static int f3446v0 = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static float f3447w = 1.1f;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f3448w0 = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static float f3449x = 2.2f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f3450x0 = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static float f3451y = 2.3f;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f3452y0 = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static float f3453z = 3.8f;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static float f3454z0 = 0.8f;
    public static String O0 = Build.MANUFACTURER;
    public static boolean P0 = false;
    public static String Q0 = null;
    public static int R0 = -1;
    public static String S0 = null;
    public static String T0 = null;

    public static class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateNotYetValidException, CertificateExpiredException {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                x509Certificate.checkValidity();
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static String A() {
        try {
            File file = new File(com.baidu.location.f.c().getFilesDir() + File.separator + "/baidu/tempdata");
            if (!file.exists()) {
                file.mkdirs();
            }
            return com.baidu.location.f.c().getFilesDir().getPath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String B(Context context) {
        int type = -1;
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    type = activeNetworkInfo.getType();
                }
            } catch (Throwable unused) {
            }
        }
        return "&netc=" + type;
    }

    public static String C() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(com.baidu.location.f.c().getFilesDir());
            String str = File.separator;
            sb.append(str);
            sb.append("/baidu/tempdata");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            return com.baidu.location.f.c().getFilesDir().getPath() + str + "/baidu/tempdata";
        } catch (Exception unused) {
            return null;
        }
    }

    public static String D(Context context) {
        return "&per=" + c(context, "android.permission.ACCESS_COARSE_LOCATION") + "|" + c(context, "android.permission.ACCESS_FINE_LOCATION") + "|" + c(context, "android.permission.READ_PHONE_STATE") + "|" + c(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public static String E() {
        return z("ro.mediatek.platform");
    }

    public static String F(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static SSLSocketFactory G() throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustManagerArr = {new a()};
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        return sSLContext.getSocketFactory();
    }

    public static boolean H(Context context) {
        int iC;
        if (context == null) {
            return true;
        }
        try {
            iC = c(context, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception e2) {
            e2.printStackTrace();
            iC = 1;
        }
        boolean z2 = iC == 1;
        if (z2) {
            try {
                if (Settings.Secure.getInt(context.getContentResolver(), "location_mode", 1) == 0) {
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        return z2;
    }

    public static String I() {
        String strG = g();
        if (strG == null) {
            return null;
        }
        return strG + "/baidu/tempdata";
    }

    public static boolean J(Context context) {
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                allNetworkInfo = connectivityManager.getAllNetworkInfo();
            } catch (Exception unused) {
                allNetworkInfo = null;
            }
            if (allNetworkInfo != null) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String K() {
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(5);
        return String.format(Locale.CHINA, "%d-%02d-%02d %02d:%02d:%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(i2), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)));
    }

    public static String L() {
        return d.f3361g;
    }

    public static boolean M() {
        if (com.baidu.location.f.c() == null) {
            return false;
        }
        return c(com.baidu.location.f.c(), "android.permission.ACCESS_FINE_LOCATION") == 0 && c(com.baidu.location.f.c(), "android.permission.ACCESS_COARSE_LOCATION") == 1;
    }

    public static boolean N() {
        return false;
    }

    public static double a(double d2, double d3, double d4, double d5) {
        float[] fArr = new float[1];
        Location.distanceBetween(d2, d3, d4, d5, fArr);
        return fArr[0];
    }

    public static int b(Context context) {
        int iC = c(context, "android.permission.ACCESS_FINE_LOCATION") | c(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (x(context) != 0 && iC == 1) {
            return 1;
        }
        if (x(context) == 0 || iC == 1) {
            return (x(context) >= 1 || iC != 1) ? 0 : -1;
        }
        return -2;
    }

    public static int c(Context context, String str) {
        return !(context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) ? 0 : 1;
    }

    public static int d(String str, String str2, String str3) {
        int iIndexOf;
        int length;
        int iIndexOf2;
        String strSubstring;
        if (str != null && !str.equals("") && (iIndexOf = str.indexOf(str2)) != -1 && (iIndexOf2 = str.indexOf(str3, (length = iIndexOf + str2.length()))) != -1 && (strSubstring = str.substring(length, iIndexOf2)) != null && !strSubstring.equals("")) {
            try {
                return Integer.parseInt(strSubstring);
            } catch (NumberFormatException unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public static long e(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime() / 1000;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static Object f(Object obj, String str) throws NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static String g() {
        String absolutePath;
        if (com.baidu.location.f.c() != null) {
            try {
                absolutePath = com.baidu.location.f.c().getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
            } catch (Exception unused) {
                absolutePath = null;
            }
        } else {
            absolutePath = null;
        }
        if (absolutePath != null) {
            try {
                File file = new File(absolutePath + "/baidu/tempdata");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return absolutePath;
    }

    public static String h(j.a aVar, k kVar, Location location, String str, int i2) {
        return i(aVar, kVar, location, str, i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00df A[Catch: Exception -> 0x00e2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e2, blocks: (B:43:0x00a0, B:47:0x00be, B:50:0x00c4, B:51:0x00c7, B:56:0x00d3, B:58:0x00d7, B:60:0x00db, B:61:0x00df), top: B:65:0x00a0 }] */
    public static String i(j.a aVar, k kVar, Location location, String str, int i2, boolean z2) {
        String strL;
        StringBuffer stringBuffer = new StringBuffer(2048);
        if (aVar != null && (strL = j.f.M().l(aVar)) != null) {
            stringBuffer.append(strL);
        }
        if (kVar != null) {
            String strJ = j.f.M().j(i2 == 0 ? L : f3438r0, true, kVar, f3436q0);
            if (strJ != null) {
                stringBuffer.append(strJ);
            }
        }
        if (location != null) {
            String strC = (f3407c == 0 || i2 == 0) ? j.d.C(location) : j.d.N(location);
            if (strC != null) {
                stringBuffer.append(strC);
            }
        }
        String strB = b.g().b(i2 == 0);
        if (strB != null) {
            stringBuffer.append(strB);
        }
        if (str != null) {
            stringBuffer.append(str);
        }
        String strG = c.c.b().g();
        if (!TextUtils.isEmpty(strG)) {
            stringBuffer.append("&bc=");
            stringBuffer.append(strG);
        }
        stringBuffer.append(j.d.l0().M());
        String strC2 = j.f.M().C(aVar);
        if (strC2 != null && strC2.length() + stringBuffer.length() < 2000) {
            stringBuffer.append(strC2);
        }
        String string = stringBuffer.toString();
        if (location == null || kVar == null) {
            f3429n = 3;
        } else {
            try {
                float speed = location.getSpeed();
                int i3 = f3407c;
                int iJ = j.f.M().J(kVar);
                int iE = kVar.e();
                boolean z3 = kVar.f3022d;
                if (speed < f3422j0 && ((i3 == 1 || i3 == 0) && (iJ < f3426l0 || z3))) {
                    f3429n = 1;
                } else if (speed >= f3424k0 || (!(i3 == 1 || i3 == 0 || i3 == 3) || (iJ >= f3428m0 && iE <= f3430n0))) {
                    f3429n = 3;
                } else {
                    f3429n = 2;
                }
            } catch (Exception unused) {
                f3429n = 3;
            }
        }
        return string;
    }

    public static String j(byte[] bArr, String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (z2) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String k(byte[] bArr, boolean z2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return j(messageDigest.digest(), "", z2);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean l(double d2, double d3) {
        return Math.abs(d2 - d3) <= 1.192092896E-7d;
    }

    public static boolean m(float f2, float f3) {
        return Math.abs(f2 - f3) <= 1.1920929E-7f;
    }

    public static boolean n(Location location) {
        String str;
        if (location == null || (str = O0) == null || !"huawei".equalsIgnoreCase(str)) {
            return false;
        }
        try {
            Bundle extras = location.getExtras();
            return extras != null && (extras.getInt("SourceType") & 128) == 128;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean o(b1.c cVar) {
        int iV = cVar.v();
        return (iV > 100 && iV < 200) || iV == 62;
    }

    public static boolean p(int[] iArr) {
        if (iArr != null && iArr.length >= 18) {
            for (int i2 : iArr) {
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] q(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int r(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Exception unused) {
            return 2;
        }
    }

    public static int s(Object obj, String str) throws NoSuchMethodException {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return ((Integer) declaredMethod.invoke(obj, null)).intValue();
    }

    public static String t() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet6Address) && inetAddressNextElement.getHostAddress() != null && !inetAddressNextElement.getHostAddress().startsWith("fe80:")) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String u(String str) {
        return Jni.e(f3425l + ";" + str);
    }

    public static boolean v(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] w(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        IOException e2;
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                try {
                    byte[] bArr2 = new byte[2048];
                    while (true) {
                        int i2 = gZIPInputStream.read(bArr2);
                        if (i2 < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i2);
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable th) {
                th = th;
                gZIPInputStream2 = gZIPInputStream;
                if (gZIPInputStream2 != null) {
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            gZIPInputStream = null;
            e2 = e6;
        } catch (Throwable th2) {
            th = th2;
            if (gZIPInputStream2 != null) {
                gZIPInputStream2.close();
            }
            throw th;
        }
        gZIPInputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static int x(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String y() {
        try {
            File file = new File(com.baidu.location.f.c().getFilesDir() + File.separator + "lldt");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String z(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                if (TextUtils.isEmpty(line)) {
                    return null;
                }
                return line;
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
