package a1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class f {

    static class a {
        public static String a(byte[] bArr) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                sb.append(cArr[(bArr[i2] & 240) >> 4]);
                sb.append(cArr[bArr[i2] & 15]);
            }
            return sb.toString();
        }
    }

    static String a() {
        return Locale.getDefault().getLanguage();
    }

    protected static String b(Context context) {
        String packageName = context.getPackageName();
        return c(context, packageName) + ";" + packageName;
    }

    private static String c(Context context, String str) {
        StringBuilder sb;
        String strD;
        try {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo;
            strD = d((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream((signingInfo == null ? context.getPackageManager().getPackageInfo(str, 64).signatures : signingInfo.hasMultipleSigners() ? context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getApkContentsSigners() : context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getSigningCertificateHistory())[0].toByteArray())));
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("getFingerPrint：");
            sb.append(e.toString());
            d.b(sb.toString());
            strD = "";
        } catch (CertificateException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("getFingerPrint：");
            sb.append(e.toString());
            d.b(sb.toString());
            strD = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strD != null) {
            for (int i2 = 0; i2 < strD.length(); i2++) {
                stringBuffer.append(strD.charAt(i2));
                if (i2 > 0 && i2 % 2 == 1 && i2 < strD.length() - 1) {
                    stringBuffer.append(":");
                }
            }
        }
        return stringBuffer.toString();
    }

    static String d(X509Certificate x509Certificate) {
        try {
            return a.a(e(x509Certificate.getEncoded()));
        } catch (CertificateEncodingException e2) {
            d.b("getFingerprintAs：" + e2.toString());
            return null;
        }
    }

    static byte[] e(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            d.b("generateSHA1：" + e2.toString());
            return null;
        }
    }

    protected static String[] f(Context context) {
        String packageName = context.getPackageName();
        String[] strArrG = g(context, packageName);
        if (strArrG == null || strArrG.length <= 0) {
            return null;
        }
        int length = strArrG.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = strArrG[i2] + ";" + packageName;
            if (d.f36a) {
                d.b("mcode" + strArr[i2]);
            }
        }
        return strArr;
    }

    private static String[] g(Context context, String str) {
        String[] strArr;
        StringBuilder sb;
        String[] strArr2 = null;
        try {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo;
            Signature[] apkContentsSigners = signingInfo == null ? context.getPackageManager().getPackageInfo(str, 64).signatures : signingInfo.hasMultipleSigners() ? context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getApkContentsSigners() : context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getSigningCertificateHistory();
            if (apkContentsSigners == null || apkContentsSigners.length <= 0) {
                strArr = null;
            } else {
                strArr = new String[apkContentsSigners.length];
                for (int i2 = 0; i2 < apkContentsSigners.length; i2++) {
                    try {
                        strArr[i2] = d((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(apkContentsSigners[i2].toByteArray())));
                    } catch (PackageManager.NameNotFoundException e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("getFingerPrint：");
                        sb.append(e.toString());
                        d.b(sb.toString());
                    } catch (CertificateException e3) {
                        e = e3;
                        sb = new StringBuilder();
                        sb.append("getFingerPrint：");
                        sb.append(e.toString());
                        d.b(sb.toString());
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            e = e4;
            strArr = null;
        } catch (CertificateException e5) {
            e = e5;
            strArr = null;
        }
        if (strArr != null && strArr.length > 0) {
            strArr2 = new String[strArr.length];
            for (int i3 = 0; i3 < strArr.length; i3++) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i4 = 0; i4 < strArr[i3].length(); i4++) {
                    stringBuffer.append(strArr[i3].charAt(i4));
                    if (i4 > 0 && i4 % 2 == 1 && i4 < strArr[i3].length() - 1) {
                        stringBuffer.append(":");
                    }
                }
                strArr2[i3] = stringBuffer.toString();
            }
        }
        return strArr2;
    }
}
