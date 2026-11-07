package n;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f3344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f3345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f3346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f3347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f3348j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3353e;

    /* JADX INFO: renamed from: n.b$b, reason: collision with other inner class name */
    public static class C0039b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3354a = new b();
    }

    public b() {
        this.f3349a = null;
        this.f3350b = null;
        this.f3351c = null;
        this.f3352d = null;
        this.f3353e = false;
        if (com.baidu.location.f.c() != null) {
            d(com.baidu.location.f.c());
        }
    }

    public static b g() {
        return C0039b.f3354a;
    }

    public String a() {
        String str;
        StringBuffer stringBuffer = new StringBuffer(200);
        if (this.f3351c != null) {
            stringBuffer.append("&cu=");
            str = this.f3351c;
        } else {
            stringBuffer.append("&im=");
            str = this.f3349a;
        }
        stringBuffer.append(str);
        try {
            stringBuffer.append("&mb=");
            stringBuffer.append(Build.MODEL);
        } catch (Exception unused) {
        }
        stringBuffer.append("&pack=");
        try {
            stringBuffer.append(f3344f);
        } catch (Exception unused2) {
        }
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.521f);
        return stringBuffer.toString();
    }

    public String b(boolean z2) {
        return c(z2, null);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    public String c(boolean z2, String str) {
        String strSubstring;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.521f);
        if (z2) {
            if (i.f3409d.equals("all")) {
                stringBuffer.append("&addr=allj2");
            }
            if (i.f3415g) {
                stringBuffer.append("&adtp=n2");
            }
            if (i.f3413f || i.f3419i || i.f3421j || i.f3417h) {
                stringBuffer.append("&sema=");
                if (i.f3413f) {
                    stringBuffer.append("aptag|");
                }
                if (i.f3417h) {
                    stringBuffer.append("aptagd2|");
                }
                if (i.f3419i) {
                    stringBuffer.append("poiregion|");
                }
                if (i.f3421j) {
                    stringBuffer.append("regular");
                }
            }
        }
        if (z2) {
            if (str == null) {
                str = "&coor=gcj02";
            } else {
                stringBuffer.append("&coor=");
            }
            stringBuffer.append(str);
            String strD0 = j.d.d0();
            if (strD0 != null) {
                stringBuffer.append(strD0);
            }
        }
        if (this.f3351c != null) {
            stringBuffer.append("&cu=");
            stringBuffer.append(this.f3351c);
            String str3 = this.f3349a;
            str2 = (str3 == null || str3.equals("NULL") || this.f3351c.contains(new StringBuffer(this.f3349a).reverse().toString())) ? "&im=" : "&Aim=";
            if (this.f3350b != null) {
                stringBuffer.append("&snd=");
                stringBuffer.append(this.f3350b);
            }
            if (this.f3352d != null) {
                stringBuffer.append("&Aid=");
                stringBuffer.append(this.f3352d);
            }
            stringBuffer.append("&fw=");
            stringBuffer.append(com.baidu.location.f.a());
            stringBuffer.append("&lt=1");
            stringBuffer.append("&mb=");
            stringBuffer.append(Build.MODEL);
            stringBuffer.append("&resid=");
            stringBuffer.append("12");
            stringBuffer.append("&os=A");
            stringBuffer.append(Build.VERSION.SDK_INT);
            if (z2) {
                stringBuffer.append("&sv=");
                strSubstring = Build.VERSION.RELEASE;
                if (strSubstring != null && strSubstring.length() > 6) {
                    strSubstring = strSubstring.substring(0, 6);
                }
                stringBuffer.append(strSubstring);
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(str2);
        stringBuffer.append(this.f3349a);
        if (this.f3350b != null) {
            stringBuffer.append("&snd=");
            stringBuffer.append(this.f3350b);
        }
        if (this.f3352d != null) {
            stringBuffer.append("&Aid=");
            stringBuffer.append(this.f3352d);
        }
        stringBuffer.append("&fw=");
        stringBuffer.append(com.baidu.location.f.a());
        stringBuffer.append("&lt=1");
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&resid=");
        stringBuffer.append("12");
        stringBuffer.append("&os=A");
        stringBuffer.append(Build.VERSION.SDK_INT);
        if (z2) {
            stringBuffer.append("&sv=");
            strSubstring = Build.VERSION.RELEASE;
            if (strSubstring != null) {
                strSubstring = strSubstring.substring(0, 6);
            }
            stringBuffer.append(strSubstring);
        }
        return stringBuffer.toString();
    }

    public void d(Context context) {
        if (context == null || this.f3353e) {
            return;
        }
        try {
            this.f3351c = a1.b.B(context).A();
        } catch (Exception unused) {
            this.f3351c = null;
        }
        try {
            f3344f = context.getPackageName();
        } catch (Exception unused2) {
            f3344f = null;
        }
        try {
            f3348j = i.F(context);
        } catch (Exception unused3) {
            f3348j = null;
        }
        i.f3425l = "" + this.f3351c;
        this.f3353e = true;
    }

    public void e(String str, String str2) {
        f3345g = str;
        f3344f = str2;
    }

    public String f() {
        return this.f3351c;
    }

    public String h() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f3351c == null) {
            stringBuffer.append("&im=");
            str = this.f3349a;
        } else {
            stringBuffer.append("&cu=");
            str = this.f3351c;
        }
        stringBuffer.append(str);
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.521f);
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&stp=1");
        stringBuffer.append("&os=A");
        stringBuffer.append(Build.VERSION.SDK);
        stringBuffer.append("&prod=");
        stringBuffer.append(f3345g + ":" + f3344f);
        stringBuffer.append(i.B(com.baidu.location.f.c()));
        stringBuffer.append("&resid=");
        stringBuffer.append("12");
        return stringBuffer.toString();
    }

    public String i() {
        StringBuilder sb;
        String str;
        if (this.f3351c != null) {
            sb = new StringBuilder();
            sb.append("v9.521|");
            str = this.f3351c;
        } else {
            sb = new StringBuilder();
            sb.append("v9.521|");
            str = this.f3349a;
        }
        sb.append(str);
        sb.append("|");
        sb.append(Build.MODEL);
        return sb.toString();
    }
}
