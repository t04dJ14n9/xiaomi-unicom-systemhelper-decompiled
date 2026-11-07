package a1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f17f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f18g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f20i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f21j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static r f22k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f23l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static b f25n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f34d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Hashtable f24m = new Hashtable();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f26o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f27p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f28q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f29r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f30s = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f31a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f32b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f35e = new n(this, Looper.getMainLooper());

    private b(Context context) {
        f17f = context;
        r rVar = f22k;
        if (rVar != null && !rVar.isAlive()) {
            f22k = null;
        }
        d.c("BaiduApiAuth SDK Version:1.0.29");
        E();
    }

    public static b B(Context context) {
        if (f25n == null) {
            synchronized (b.class) {
                if (f25n == null) {
                    f25n = new b(context);
                }
            }
        } else if (context != null) {
            f17f = context;
        } else if (d.f36a) {
            d.d("input context is null");
            new RuntimeException("here").printStackTrace();
        }
        return f25n;
    }

    private void E() {
        synchronized (b.class) {
            if (f22k == null) {
                r rVar = new r("auth");
                f22k = rVar;
                rVar.start();
                while (f22k.f76b == null) {
                    try {
                        d.b("wait for create auth thread.");
                        Thread.sleep(3L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    private String F() {
        try {
            JSONObject jSONObject = new JSONObject(G());
            return !jSONObject.has("extend") ? "" : jSONObject.getString("extend");
        } catch (JSONException unused) {
            return "";
        }
    }

    private String G() {
        return f17f.getSharedPreferences("authStatus_" + c(f17f), 0).getString("status", "{\"status\":601}");
    }

    private int a(String str) {
        int i2 = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
            i2 = jSONObject.getInt("status");
            if (jSONObject.has("current") && i2 == 0) {
                long j2 = jSONObject.getLong("current");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if ((jCurrentTimeMillis - j2) / 3600000.0d >= 24.0d) {
                    i2 = 601;
                } else if (this.f33c) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    if (!simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis)).equals(simpleDateFormat.format(Long.valueOf(j2)))) {
                        i2 = 601;
                    }
                    return i2;
                }
            }
            if (jSONObject.has("current") && i2 == 602) {
                if ((System.currentTimeMillis() - jSONObject.getLong("current")) / 1000 > 180.0d) {
                    return 601;
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0035 A[PHI: r4 r5
      0x0035: PHI (r4v7 java.lang.String) = (r4v1 java.lang.String), (r4v1 java.lang.String), (r4v13 java.lang.String) binds: [B:34:0x0070, B:42:0x0080, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r5v10 java.io.FileInputStream) = (r5v8 java.io.FileInputStream), (r5v9 java.io.FileInputStream), (r5v13 java.io.FileInputStream) binds: [B:34:0x0070, B:42:0x0080, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private String b(int i2) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        String line = null;
        try {
            fileInputStream = new FileInputStream(new File("/proc/" + i2 + "/cmdline"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                        inputStreamReader.close();
                    } catch (FileNotFoundException unused) {
                        if (bufferedReader != 0) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                        }
                        return line;
                    } catch (IOException unused2) {
                        if (bufferedReader != 0) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                        }
                        return line;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != 0) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused3) {
                    bufferedReader = 0;
                } catch (IOException unused4) {
                    bufferedReader = 0;
                } catch (Throwable th3) {
                    bufferedReader = 0;
                    th = th3;
                }
            } catch (FileNotFoundException unused5) {
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                if (bufferedReader != 0) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return line;
            } catch (IOException unused6) {
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                if (bufferedReader != 0) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return line;
            } catch (Throwable th4) {
                bufferedReader = 0;
                th = th4;
                inputStreamReader = null;
            }
        } catch (FileNotFoundException unused7) {
            fileInputStream = null;
            inputStreamReader = null;
        } catch (IOException unused8) {
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = 0;
            th = th5;
            fileInputStream = null;
        }
        fileInputStream.close();
        return line;
    }

    private String c(Context context) throws Throwable {
        String strB;
        try {
            strB = b(Process.myPid());
        } catch (IOException unused) {
            strB = null;
        }
        return strB != null ? strB : f17f.getPackageName();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[Catch: NameNotFoundException -> 0x0058, TryCatch #1 {NameNotFoundException -> 0x0058, blocks: (B:14:0x003f, B:16:0x0045, B:18:0x004f), top: B:29:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f A[Catch: NameNotFoundException -> 0x0058, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x0058, blocks: (B:14:0x003f, B:16:0x0045, B:18:0x004f), top: B:29:0x003f }] */
    private String d(Context context, String str) {
        c cVar;
        String str2 = "";
        if (!TextUtils.isEmpty(f26o)) {
            return f26o;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                String string = bundle.getString("com.baidu.lbsapi.API_KEY");
                if (string != null) {
                    try {
                        if (string.equals("")) {
                            cVar = (c) f24m.get(str);
                            if (cVar != null) {
                                cVar.a(101, a.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                            }
                        }
                        str2 = string;
                    } catch (PackageManager.NameNotFoundException unused) {
                        str2 = string;
                        c cVar2 = (c) f24m.get(str);
                        if (cVar2 != null) {
                            cVar2.a(101, a.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                        }
                    }
                } else {
                    cVar = (c) f24m.get(str);
                    if (cVar != null) {
                        cVar.a(101, a.a(101, "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"));
                    }
                    str2 = string;
                }
                return str2;
            }
            c cVar3 = (c) f24m.get(str);
            if (cVar3 != null) {
                cVar3.a(101, a.a(101, "AndroidManifest.xml的application中没有meta-data标签"));
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[Catch: JSONException -> 0x0062, all -> 0x00b4, TryCatch #0 {JSONException -> 0x0062, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[Catch: JSONException -> 0x0062, all -> 0x00b4, TryCatch #0 {JSONException -> 0x0062, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0085 A[Catch: all -> 0x00b4, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0007, B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045, B:20:0x0081, B:22:0x0085, B:23:0x0088, B:25:0x00a8, B:27:0x00ac, B:19:0x0063), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[Catch: JSONException -> 0x0062, all -> 0x00b4, TryCatch #0 {JSONException -> 0x0062, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0020, B:12:0x0028, B:13:0x0031, B:15:0x0040, B:16:0x0045), top: B:33:0x000e, outer: #1 }] */
    public synchronized void j(String str, String str2) {
        Message messageObtainMessage;
        int i2;
        r rVar;
        r rVar2;
        JSONObject jSONObject;
        if (str == null) {
            str = G();
            messageObtainMessage = this.f35e.obtainMessage();
            i2 = -1;
            try {
                jSONObject = new JSONObject(str);
                if (!jSONObject.has("status")) {
                    jSONObject.put("status", -1);
                }
                if (!jSONObject.has("current")) {
                    jSONObject.put("current", System.currentTimeMillis());
                }
                v(jSONObject.toString());
                if (jSONObject.has("current")) {
                    jSONObject.remove("current");
                }
                i2 = jSONObject.getInt("status");
                messageObtainMessage.what = i2;
                messageObtainMessage.obj = jSONObject;
                Bundle bundle = new Bundle();
                bundle.putString("listenerKey", str2);
                messageObtainMessage.setData(bundle);
                this.f35e.sendMessage(messageObtainMessage);
            } catch (JSONException e2) {
                e2.printStackTrace();
                messageObtainMessage.what = i2;
                messageObtainMessage.obj = new JSONObject();
                Bundle bundle2 = new Bundle();
                bundle2.putString("listenerKey", str2);
                messageObtainMessage.setData(bundle2);
                this.f35e.sendMessage(messageObtainMessage);
            }
            rVar = f22k;
            if (rVar != null) {
                rVar.c();
            }
            f23l--;
            d.b("httpRequest called mAuthCounter-- = " + f23l);
            if (f23l == 0 && (rVar2 = f22k) != null) {
                rVar2.a();
                f22k = null;
            }
        } else {
            messageObtainMessage = this.f35e.obtainMessage();
            i2 = -1;
            jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
            if (!jSONObject.has("current")) {
                jSONObject.put("current", System.currentTimeMillis());
            }
            v(jSONObject.toString());
            if (jSONObject.has("current")) {
                jSONObject.remove("current");
            }
            i2 = jSONObject.getInt("status");
            messageObtainMessage.what = i2;
            messageObtainMessage.obj = jSONObject;
            Bundle bundle3 = new Bundle();
            bundle3.putString("listenerKey", str2);
            messageObtainMessage.setData(bundle3);
            this.f35e.sendMessage(messageObtainMessage);
            rVar = f22k;
            if (rVar != null) {
                rVar.c();
            }
            f23l--;
            d.b("httpRequest called mAuthCounter-- = " + f23l);
            if (f23l == 0) {
                rVar2.a();
                f22k = null;
            }
        }
        throw th;
    }

    private void k(HashMap map, String str, String str2) {
        if (map == null || map.size() <= 0 || str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return;
        }
        try {
            String strA = t.a(str2);
            if (strA == null || strA.length() <= 0) {
                map.put(str, str2);
            } else {
                map.put(str, strA);
            }
        } catch (Exception e2) {
            map.put(str, str2);
            Log.e("LBSAuthManager", "encodeAuthParam", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("en")) {
            return;
        }
        if (jSONObject.optInt("en", 0) == 0) {
            if (jSONObject.optString("ck").length() > 0) {
                this.f34d = e.b(jSONObject.optString("ck").getBytes(StandardCharsets.UTF_8));
            }
        } else {
            m(jSONObject, "ak");
            m(jSONObject, "ck");
            m(jSONObject, "sk");
            m(jSONObject, "uid");
            s(jSONObject);
        }
    }

    private void m(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.length() <= 0 || str == null || str.length() <= 0 || !jSONObject.has(str)) {
            return;
        }
        try {
            byte[] bArrD = t.d(jSONObject.optString(str));
            if (bArrD != null && bArrD.length > 0) {
                jSONObject.put(str, new String(bArrD, StandardCharsets.UTF_8));
                if ("ck".equals(str)) {
                    this.f34d = bArrD;
                    return;
                }
                return;
            }
            jSONObject.put(str, "");
            jSONObject.put("decode_status", -1);
        } catch (Exception e2) {
            Log.e("LBSAuthManager", " decodeAuthResult ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(boolean z2, String str, Hashtable hashtable, String str2, String str3, int i2, String str4, String str5) {
        String strA;
        StringBuilder sb;
        int i3;
        String strD = d(f17f, str2);
        if (strD == null || strD.equals("")) {
            return;
        }
        HashMap map = new HashMap();
        t.b();
        map.put("pk", t.c() != null ? t.c() : "");
        map.put("url", "https://api.map.baidu.com/sdkcs/verify");
        d.b("url:https://api.map.baidu.com/sdkcs/verify");
        map.put("output", "json");
        k(map, "ak", strD);
        d.b("ak:" + ((String) map.get("ak")));
        k(map, "mcode", f.b(f17f));
        map.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry entry : hashtable.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                    map.put(str6, str7);
                }
            }
        }
        String strA2 = !TextUtils.isEmpty(f27p) ? A() : f30s;
        d.b("cuid:" + f30s);
        if (TextUtils.isEmpty(strA2)) {
            map.put("cuid", "");
        } else {
            map.put("cuid", strA2);
        }
        map.put("pcn", f17f.getPackageName());
        map.put("version", "1.0.29");
        map.put("macaddr", "");
        try {
            strA = f.a();
        } catch (Exception unused) {
            strA = "";
        }
        if (TextUtils.isEmpty(strA)) {
            map.put("language", "");
        } else {
            map.put("language", strA);
        }
        if (z2) {
            if (z2) {
                sb = new StringBuilder();
                i3 = 1;
            } else {
                sb = new StringBuilder();
                i3 = 0;
            }
            sb.append(i3);
            sb.append("");
            map.put("force", sb.toString());
        }
        if (str == null) {
            map.put("from_service", "");
        } else {
            map.put("from_service", str);
        }
        String strF = F();
        if (!TextUtils.isEmpty(strF)) {
            map.put("extend", strF);
        }
        g gVar = new g(f17f);
        this.f31a = gVar;
        gVar.e(map, str3, i2, str4, str5, new p(this, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(boolean z2, String str, Hashtable hashtable, String[] strArr, String str2, String str3, int i2, String str4, String str5) {
        String strA;
        StringBuilder sb;
        String strD = d(f17f, str2);
        if (strD == null || strD.equals("")) {
            return;
        }
        HashMap map = new HashMap();
        t.b();
        map.put("pk", t.c() != null ? t.c() : "");
        map.put("url", "https://api.map.baidu.com/sdkcs/verify");
        map.put("output", "json");
        k(map, "ak", strD);
        map.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry entry : hashtable.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                    map.put(str6, str7);
                }
            }
        }
        String strA2 = !TextUtils.isEmpty(f27p) ? A() : f30s;
        d.b("sendAuthRequests : cuid: " + strA2);
        if (TextUtils.isEmpty(strA2)) {
            map.put("cuid", "");
        } else {
            map.put("cuid", strA2);
        }
        map.put("pcn", f17f.getPackageName());
        map.put("version", "1.0.29");
        map.put("macaddr", "");
        try {
            strA = f.a();
        } catch (Exception unused) {
            strA = "";
        }
        if (TextUtils.isEmpty(strA)) {
            map.put("language", "");
        } else {
            map.put("language", strA);
        }
        if (z2) {
            if (z2) {
                sb = new StringBuilder();
                sb.append(1);
            } else {
                sb = new StringBuilder();
                sb.append(0);
            }
            sb.append("");
            map.put("force", sb.toString());
        }
        if (str == null) {
            map.put("from_service", "");
        } else {
            map.put("from_service", str);
        }
        String strF = F();
        if (!TextUtils.isEmpty(strF)) {
            map.put("extend", strF);
        }
        String[] strArr2 = new String[strArr.length];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String strA3 = t.a(strArr[i3]);
            if (strA3 == null || strA3.length() <= 0) {
                strArr2[i3] = strArr[i3];
            } else {
                strArr2[i3] = strA3;
            }
        }
        i iVar = new i(f17f);
        this.f32b = iVar;
        iVar.e(map, strArr2, str3, i2, str4, str5, new q(this, str2));
    }

    private void s(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        if (jSONObject.has("ck")) {
            jSONObject.remove("ck");
        }
        if (jSONObject.has("en")) {
            jSONObject.remove("en");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(String str) {
        String string;
        String strD = d(f17f, str);
        try {
            JSONObject jSONObject = new JSONObject(G());
            if (!jSONObject.has("ak")) {
                return true;
            }
            string = jSONObject.getString("ak");
        } catch (JSONException e2) {
            e2.printStackTrace();
            string = "";
        }
        return (strD == null || string == null || strD.equals(string)) ? false : true;
    }

    private void v(String str) {
        f17f.getSharedPreferences("authStatus_" + c(f17f), 0).edit().putString("status", str).apply();
    }

    public String A() {
        if (!TextUtils.isEmpty(f30s)) {
            return f30s;
        }
        if (f17f == null) {
            return "";
        }
        try {
            d.b("mIsPrivacyMode " + f29r);
            if (f29r) {
                if (!TextUtils.isEmpty(f27p)) {
                    p0.a.c(f27p);
                }
                String strA = p0.a.a(f17f);
                f30s = strA;
                d.b("getCUID: " + strA);
                return strA;
            }
            SharedPreferences sharedPreferences = f17f.getSharedPreferences("Map_Privacy", 0);
            if (sharedPreferences.contains("cuid")) {
                return sharedPreferences.getString("cuid", "");
            }
            String str = s.b(UUID.randomUUID().toString().getBytes(), true) + "|MAPSDK001";
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("cuid", str);
            editorEdit.apply();
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String C() {
        Context context = f17f;
        return context == null ? "" : f.b(context);
    }

    public String D(Context context) {
        if (!TextUtils.isEmpty(f26o)) {
            return f26o;
        }
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.baidu.lbsapi.API_KEY");
    }

    public void H(String str, String str2) {
        f20i = str;
        f21j = str2;
    }

    public void I(String str) {
        if (f17f == null || TextUtils.isEmpty(str)) {
            return;
        }
        f26o = str;
    }

    public void J(boolean z2) {
        Context context = f17f;
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Map_Privacy", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (!z2) {
            f29r = sharedPreferences.getBoolean("privacyMode", false);
            return;
        }
        editorEdit.putBoolean("privacyMode", z2);
        editorEdit.apply();
        f29r = z2;
    }

    public void K(String str, int i2) {
        f18g = str;
        f19h = i2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036 A[Catch: all -> 0x00e0, TryCatch #0 {, blocks: (B:6:0x0007, B:9:0x0012, B:12:0x001d, B:14:0x0036, B:15:0x003b, B:17:0x0043, B:20:0x004d, B:23:0x0088, B:27:0x00a1, B:29:0x00a8, B:32:0x00ad, B:33:0x00d7, B:35:0x00d9, B:26:0x009e, B:38:0x00dc), top: B:44:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public int q(boolean z2, String str, Hashtable hashtable, c cVar) {
        String str2;
        String strD;
        int iA;
        r rVar;
        synchronized (b.class) {
            boolean z3 = false;
            if (hashtable == null) {
                this.f33c = z3;
                str2 = System.currentTimeMillis() + "";
                if (cVar != null) {
                    f24m.put(str2, cVar);
                }
                strD = d(f17f, str2);
                if (strD != null) {
                    f23l++;
                    d.b(" mAuthCounter  ++ = " + f23l);
                    String strG = G();
                    d.b("getAuthMessage from cache:" + strG);
                    iA = a(strG);
                    if (iA == 601) {
                        v(new JSONObject().put("status", 602).toString());
                    }
                    E();
                    rVar = f22k;
                    if (rVar != null) {
                        d.b("mThreadLooper.mHandler = " + f22k.f76b);
                        f22k.f76b.post(new o(this, iA, z2, str2, str, hashtable));
                        return iA;
                    }
                    return -1;
                }
                return 101;
            }
            String str3 = (String) hashtable.get("zero_auth");
            if (str3 != null && Integer.valueOf(str3).intValue() == 1) {
                z3 = true;
            }
            this.f33c = z3;
            str2 = System.currentTimeMillis() + "";
            if (cVar != null) {
                f24m.put(str2, cVar);
            }
            strD = d(f17f, str2);
            if (strD != null && !strD.equals("")) {
                f23l++;
                d.b(" mAuthCounter  ++ = " + f23l);
                String strG2 = G();
                d.b("getAuthMessage from cache:" + strG2);
                iA = a(strG2);
                if (iA == 601) {
                    try {
                        v(new JSONObject().put("status", 602).toString());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                E();
                rVar = f22k;
                if (rVar != null && rVar.f76b != null) {
                    d.b("mThreadLooper.mHandler = " + f22k.f76b);
                    f22k.f76b.post(new o(this, iA, z2, str2, str, hashtable));
                    return iA;
                }
                return -1;
            }
            return 101;
            throw th;
        }
    }
}
