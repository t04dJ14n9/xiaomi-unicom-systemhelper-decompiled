package k;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import j.e;
import j.g;
import j.k;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b implements l.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f3245g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3241c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WifiManager f3242d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f3243e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f3244f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3246h = 2000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3247i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f3248j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3249k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f3250l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3251m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f3252n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f3253o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f3254p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f3255q = null;

    /* JADX INFO: renamed from: k.b$b, reason: collision with other inner class name */
    public static class C0037b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f3256a = new b();
    }

    public class c extends BroadcastReceiver {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.v();
                synchronized (b.this.f3252n) {
                    b.this.f3252n.notifyAll();
                    if (l.a.f3262a && l.a.f3263b) {
                        g.v().a("WifiScan finished, in callback.");
                    }
                }
            }
        }

        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null) {
                return;
            }
            if ((!l.a.f3263b || g.v().b(intent)) && intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
                b.this.f3247i = System.currentTimeMillis() / 1000;
                b.this.f3254p.post(new a());
            }
        }
    }

    public static boolean k(k kVar, k kVar2, float f2) {
        if (kVar != null && kVar2 != null) {
            List<ScanResult> list = kVar.f3019a;
            List<ScanResult> list2 = kVar2.f3019a;
            if (list == list2) {
                return true;
            }
            if (list != null && list2 != null) {
                int size = list.size();
                int size2 = list2.size();
                if (size == 0 && size2 == 0) {
                    return true;
                }
                if (size != 0 && size2 != 0) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        String str = list.get(i3) != null ? list.get(i3).BSSID : null;
                        if (str != null) {
                            for (int i4 = 0; i4 < size2; i4++) {
                                String str2 = list2.get(i4) != null ? list2.get(i4).BSSID : null;
                                if (str2 != null && str.equals(str2)) {
                                    i2++;
                                    break;
                                }
                            }
                        }
                    }
                    if (l.a.f3262a && l.a.f3263b) {
                        g.v().a("wifi same!" + (i2 / size));
                    }
                    if (i2 >= size * f2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static b s() {
        return C0037b.f3256a;
    }

    public WifiInfo a() {
        try {
            WifiManager wifiManager = this.f3242d;
            WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
            String strE = e(connectionInfo, null);
            if (connectionInfo != null && strE != null && connectionInfo.getRssi() > -100) {
                String strReplace = strE.replace(":", "");
                if (!"000000000000".equals(strReplace) && !"".equals(strReplace) && !"020000000000".equals(strReplace)) {
                    return connectionInfo;
                }
            }
        } catch (Error | Exception unused) {
        }
        return null;
    }

    public final k b(k kVar) {
        if (kVar != null) {
            return new k(kVar.f3019a, kVar.f3020b);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0211  */
    /* JADX WARN: Code duplicated, block: B:120:0x0265  */
    /* JADX WARN: Code duplicated, block: B:122:0x026c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02bb A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02bf A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0319  */
    /* JADX WARN: Code duplicated, block: B:148:0x0338 A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0354  */
    /* JADX WARN: Code duplicated, block: B:153:0x035f A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:175:0x03cf A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03e7 A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0447 A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x044f A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0458 A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0466 A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x04bb A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x04ca A[Catch: Error | Exception -> 0x04db, Error | Exception -> 0x04db, TryCatch #2 {Error | Exception -> 0x04db, blocks: (B:7:0x0014, B:11:0x003a, B:11:0x003a, B:14:0x004d, B:14:0x004d, B:16:0x0051, B:16:0x0051, B:18:0x0055, B:18:0x0055, B:22:0x008d, B:34:0x00a8, B:34:0x00a8, B:44:0x00d4, B:44:0x00d4, B:46:0x00dc, B:46:0x00dc, B:50:0x00ec, B:52:0x00f8, B:63:0x0113, B:63:0x0113, B:65:0x0117, B:65:0x0117, B:67:0x011b, B:67:0x011b, B:69:0x013c, B:69:0x013c, B:72:0x0149, B:72:0x0149, B:87:0x0194, B:87:0x0194, B:89:0x0199, B:89:0x0199, B:91:0x01a7, B:91:0x01a7, B:93:0x01b3, B:93:0x01b3, B:96:0x01ca, B:96:0x01ca, B:98:0x01e4, B:98:0x01e4, B:100:0x01ec, B:100:0x01ec, B:109:0x0215, B:111:0x021b, B:113:0x0227, B:115:0x0237, B:145:0x031f, B:145:0x031f, B:133:0x02b7, B:133:0x02b7, B:135:0x02bb, B:135:0x02bb, B:123:0x026e, B:125:0x0274, B:127:0x0280, B:129:0x0290, B:136:0x02bf, B:136:0x02bf, B:138:0x02c7, B:138:0x02c7, B:140:0x02cb, B:140:0x02cb, B:141:0x02ed, B:141:0x02ed, B:90:0x01a1, B:90:0x01a1, B:59:0x010a, B:59:0x010a, B:61:0x010e, B:61:0x010e, B:146:0x032b, B:146:0x032b, B:148:0x0338, B:148:0x0338, B:151:0x0357, B:151:0x0357, B:153:0x035f, B:153:0x035f, B:155:0x036a, B:155:0x036a, B:159:0x0379, B:159:0x0379, B:161:0x0383, B:161:0x0383, B:163:0x038f, B:163:0x038f, B:166:0x03a3, B:166:0x03a3, B:173:0x03c7, B:173:0x03c7, B:160:0x0380, B:160:0x0380, B:175:0x03cf, B:175:0x03cf, B:177:0x03e7, B:177:0x03e7, B:181:0x03fa, B:181:0x03fa, B:184:0x0414, B:184:0x0414, B:186:0x041a, B:186:0x041a, B:188:0x0429, B:188:0x0429, B:189:0x0441, B:189:0x0441, B:191:0x0447, B:191:0x0447, B:193:0x044f, B:193:0x044f, B:197:0x046c, B:197:0x046c, B:194:0x0458, B:194:0x0458, B:196:0x0466, B:196:0x0466, B:198:0x0470, B:198:0x0470, B:200:0x0474, B:200:0x0474, B:202:0x0478, B:202:0x0478, B:203:0x0494, B:203:0x0494, B:204:0x049b, B:204:0x049b, B:206:0x04bb, B:206:0x04bb, B:208:0x04ca, B:208:0x04ca, B:209:0x04d4, B:209:0x04d4), top: B:225:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x04d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:237:0x032b A[EDGE_INSN: B:237:0x032b->B:146:0x032b BREAK  A[LOOP:0: B:41:0x00c8->B:145:0x031f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x046c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x0338, please report this as an issue */
    @SuppressLint({"NewApi"})
    public String c(int i2, boolean z2, k kVar, int i3) {
        String str;
        int rssi;
        String strReplace;
        long jElapsedRealtimeNanos;
        boolean z3;
        boolean z4;
        String str2;
        int i4;
        long j2;
        int i5;
        char c2;
        int i6;
        StringBuffer stringBuffer;
        int i7;
        boolean z5;
        String str3;
        boolean z6;
        int i8;
        b bVar;
        int i9;
        StringBuffer stringBuffer2;
        Long l2;
        boolean z7;
        long jLongValue;
        int i10;
        boolean z8;
        Random random;
        char c3;
        Random random2;
        long j3;
        Throwable th;
        boolean z9;
        Exception exc;
        b bVar2 = this;
        int i11 = i2;
        if (kVar == null || kVar.e() < 1) {
            return null;
        }
        try {
            Random random3 = new Random();
            StringBuffer stringBuffer3 = new StringBuffer(512);
            StringBuilder sb = new StringBuilder();
            ArrayList<Long> arrayList = new ArrayList();
            WifiInfo wifiInfoA = a();
            String strE = bVar2.e(wifiInfoA, null);
            if (wifiInfoA == null || strE == null) {
                str = null;
                rssi = -1;
                strReplace = null;
            } else {
                strReplace = strE.replace(":", "");
                rssi = wifiInfoA.getRssi();
                String strT = s().t();
                if (rssi < 0) {
                    rssi = -rssi;
                }
                if (l.a.f3262a && l.a.f3263b) {
                    g.v().a("wifi connected mac = " + strReplace);
                    g.v().a("wifi connected mac rssi= " + rssi);
                }
                str = strT;
            }
            try {
                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
                while (true) {
                    str3 = ";%d;";
                    z6 = z4;
                    if (i5 < i11) {
                        break;
                    }
                    i6++;
                    int i12 = i11;
                    if (kVar.f3019a.get(i5) != null) {
                        this = bVar2;
                        z8 = z3;
                        random = random3;
                        c3 = c2;
                        c2 = c3;
                    } else {
                        this = bVar2;
                        z8 = z3;
                        random = random3;
                        c3 = c2;
                        c2 = c3;
                    }
                    i5++;
                    z4 = z6;
                    bVar2 = this;
                    random3 = random;
                    z3 = z8;
                    i11 = i12;
                }
            } catch (Error unused) {
                jElapsedRealtimeNanos = 0;
            }
            z3 = jElapsedRealtimeNanos > 0;
            if (z3) {
                z3 = z3 && z2;
            }
            int size = kVar.f3019a.size();
            if (size > i11) {
                z4 = i11 < i3;
                str2 = str;
                i4 = rssi;
                j2 = 0;
                i5 = 0;
                c2 = 0;
                i6 = 0;
                int i13 = 0;
                stringBuffer = null;
                i7 = 0;
                z5 = true;
                while (true) {
                    str3 = ";%d;";
                    z6 = z4;
                    if (i5 < i11) {
                        break;
                        break;
                    }
                    i6++;
                    int i14 = i11;
                    if (kVar.f3019a.get(i5) != null || kVar.f3019a.get(i5).level == 0) {
                        this = bVar2;
                        z8 = z3;
                        random = random3;
                        c3 = c2;
                    } else {
                        if (z3) {
                            try {
                                random2 = random3;
                                z8 = z3;
                                try {
                                    j3 = (jElapsedRealtimeNanos - kVar.f3019a.get(i5).timestamp) / 1000000;
                                } catch (Exception e2) {
                                    e = e2;
                                    Exception exc2 = e;
                                    if (l.a.f3262a) {
                                        exc2.printStackTrace();
                                    }
                                    j3 = 0;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                random2 = random3;
                                z8 = z3;
                            }
                            boolean z10 = l.a.f3262a;
                            if (z10 && l.a.f3263b) {
                                g.v().a("wifi noUpdateTime = " + j3);
                            }
                            arrayList.add(Long.valueOf(j3));
                            if (j3 > j2) {
                                if (z10) {
                                    g.v().a("wifi maxScanTime = " + j3);
                                }
                                j2 = j3;
                            }
                        } else {
                            random2 = random3;
                            z8 = z3;
                            c2 = c2;
                            strReplace = strReplace;
                        }
                        try {
                            if (kVar.f3019a.get(i5).is80211mcResponder()) {
                                StringBuffer stringBuffer4 = stringBuffer == null ? new StringBuffer() : stringBuffer;
                                try {
                                    stringBuffer4.append(i5);
                                    stringBuffer4.append("|");
                                    stringBuffer = stringBuffer4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    stringBuffer = stringBuffer4;
                                    th.printStackTrace();
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        if (z5) {
                            stringBuffer3.append("&wf=");
                            z5 = false;
                        } else {
                            stringBuffer3.append("|");
                            sb.append("|");
                        }
                        String str4 = kVar.f3019a.get(i5).BSSID;
                        if (str4 != null) {
                            String strReplace2 = str4.replace(":", "");
                            stringBuffer3.append(strReplace2);
                            sb.append(strReplace2);
                            int i15 = kVar.f3019a.get(i5).level;
                            if (i15 < 0) {
                                i15 = -i15;
                            }
                            String str5 = String.format(Locale.CHINA, ";%d;", Integer.valueOf(i15));
                            stringBuffer3.append(str5);
                            sb.append(str5);
                            i13++;
                            if (strReplace != null) {
                                strReplace = strReplace;
                                if (strReplace.equals(strReplace2)) {
                                    this = this;
                                    kVar.f3023e = this.l(kVar.f3019a.get(i5).capabilities);
                                    i7 = i13;
                                    z9 = true;
                                }
                                if (z9) {
                                    random = random2;
                                    c3 = c2;
                                    if (l.a.f3262a && l.a.f3263b) {
                                        g.v().a("wifi str add connected ssid = " + kVar.f3019a.get(i5).SSID);
                                    }
                                    stringBuffer3.append(this.p(kVar.f3019a.get(i5).SSID));
                                    sb.append(this.p(kVar.f3019a.get(i5).SSID));
                                } else {
                                    if (c2 == 0) {
                                        random = random2;
                                        try {
                                            if (random.nextInt(10) == 2 || kVar.f3019a.get(i5).SSID == null || kVar.f3019a.get(i5).SSID.length() >= 30) {
                                                c3 = c2;
                                            } else {
                                                stringBuffer3.append(this.p(kVar.f3019a.get(i5).SSID));
                                                sb.append(this.p(kVar.f3019a.get(i5).SSID));
                                                c2 = 1;
                                            }
                                        } catch (Exception e4) {
                                            exc = e4;
                                            c3 = c2;
                                            if (l.a.f3262a) {
                                                exc.printStackTrace();
                                            }
                                        }
                                    } else {
                                        random = random2;
                                        c3 = c2;
                                        if (c3 == 1) {
                                            try {
                                                if (random.nextInt(20) != 1 && kVar.f3019a.get(i5).SSID != null && kVar.f3019a.get(i5).SSID.length() < 30) {
                                                    stringBuffer3.append(this.p(kVar.f3019a.get(i5).SSID));
                                                    sb.append(this.p(kVar.f3019a.get(i5).SSID));
                                                    c2 = 2;
                                                }
                                            } catch (Exception e5) {
                                                exc = e5;
                                                if (l.a.f3262a) {
                                                    exc.printStackTrace();
                                                }
                                            }
                                        }
                                    }
                                    i5++;
                                    z4 = z6;
                                    bVar2 = this;
                                    random3 = random;
                                    z3 = z8;
                                    i11 = i14;
                                }
                            } else {
                                strReplace = strReplace;
                            }
                            z9 = false;
                            if (z9) {
                                if (c2 == 0) {
                                    random = random2;
                                    if (random.nextInt(10) == 2) {
                                    }
                                    c3 = c2;
                                } else {
                                    random = random2;
                                    c3 = c2;
                                    if (c3 == 1) {
                                        if (random.nextInt(20) != 1) {
                                        }
                                    }
                                }
                                i5++;
                                z4 = z6;
                                bVar2 = this;
                                random3 = random;
                                z3 = z8;
                                i11 = i14;
                            } else {
                                random = random2;
                                c3 = c2;
                                if (l.a.f3262a) {
                                    g.v().a("wifi str add connected ssid = " + kVar.f3019a.get(i5).SSID);
                                }
                                stringBuffer3.append(this.p(kVar.f3019a.get(i5).SSID));
                                sb.append(this.p(kVar.f3019a.get(i5).SSID));
                            }
                        } else {
                            this = this;
                            random = random2;
                            c3 = c2;
                            strReplace = strReplace;
                        }
                    }
                    c2 = c3;
                    i5++;
                    z4 = z6;
                    bVar2 = this;
                    random3 = random;
                    z3 = z8;
                    i11 = i14;
                }
                i8 = i11;
                bVar = bVar2;
                bVar.f3255q = sb.toString();
                if (l.a.f3262a) {
                    g.v().a("last wifi str = " + bVar.f3255q);
                }
                if (z6) {
                    i10 = i8;
                    boolean z11 = true;
                    while (i10 < kVar.f3019a.size()) {
                        int i16 = i6 + 1;
                        if (kVar.f3019a.get(i10) == null && kVar.f3019a.get(i10).level != 0) {
                            if (z11) {
                                stringBuffer3.append("&wf2=");
                                z11 = false;
                            } else {
                                stringBuffer3.append("|");
                            }
                            String str6 = kVar.f3019a.get(i10).BSSID;
                            if (str6 != null) {
                                stringBuffer3.append(str6.replace(":", ""));
                                int i17 = kVar.f3019a.get(i10).level;
                                if (i17 < 0) {
                                    i17 = -i17;
                                }
                                stringBuffer3.append(String.format(Locale.CHINA, str3, Integer.valueOf(i17)));
                            }
                            if (i16 >= i3) {
                                break;
                            }
                            z11 = z11;
                        }
                        i10++;
                        str3 = str3;
                        i6 = i16;
                    }
                }
                if (!z5) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("&wf_n=");
                i9 = i7;
                sb2.append(i9);
                stringBuffer3.append(sb2.toString());
                if (stringBuffer != null) {
                    stringBuffer3.append("&wf_mc=");
                    stringBuffer3.append(stringBuffer.toString());
                }
                if (strReplace != null && i4 != -1) {
                    stringBuffer3.append("&wf_rs=" + i4);
                }
                if (j2 > 10 && arrayList.size() > 0 && ((Long) arrayList.get(0)).longValue() > 0) {
                    stringBuffer2 = new StringBuffer(128);
                    stringBuffer2.append("&wf_ut=");
                    l2 = (Long) arrayList.get(0);
                    z7 = true;
                    for (Long l3 : arrayList) {
                        if (z7) {
                            stringBuffer2.append(l3.longValue());
                            z7 = false;
                        } else {
                            jLongValue = l3.longValue() - l2.longValue();
                            if (jLongValue != 0) {
                                stringBuffer2.append("");
                                stringBuffer2.append(jLongValue);
                            }
                        }
                        stringBuffer2.append("|");
                    }
                    if (l.a.f3262a && l.a.f3263b) {
                        g.v().a("wifi scantime list str = " + stringBuffer2.toString());
                    }
                    stringBuffer3.append(stringBuffer2.toString());
                }
                stringBuffer3.append("&wf_st=");
                stringBuffer3.append(kVar.f3020b);
                stringBuffer3.append("&wf_et=");
                stringBuffer3.append(kVar.f3021c);
                stringBuffer3.append("&wf_vt=");
                stringBuffer3.append(bVar.f3247i);
                if (i9 > 0) {
                    kVar.f3022d = true;
                    stringBuffer3.append("&wf_en=");
                    stringBuffer3.append(kVar.f3023e ? 1 : 0);
                }
                if (str2 != null) {
                    stringBuffer3.append("&wf_gw=");
                    stringBuffer3.append(str2);
                }
                return stringBuffer3.toString();
            }
            i11 = size;
            str2 = str;
            i4 = rssi;
            j2 = 0;
            i5 = 0;
            c2 = 0;
            i6 = 0;
            int i18 = 0;
            stringBuffer = null;
            i7 = 0;
            z5 = true;
            i8 = i11;
            bVar = bVar2;
            bVar.f3255q = sb.toString();
            if (l.a.f3262a) {
                g.v().a("last wifi str = " + bVar.f3255q);
            }
            if (z6) {
                i10 = i8;
                boolean z12 = true;
                while (i10 < kVar.f3019a.size()) {
                    int i19 = i6 + 1;
                    if (kVar.f3019a.get(i10) == null) {
                    }
                    i10++;
                    str3 = str3;
                    i6 = i19;
                }
            }
            if (!z5) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&wf_n=");
            i9 = i7;
            sb3.append(i9);
            stringBuffer3.append(sb3.toString());
            if (stringBuffer != null) {
                stringBuffer3.append("&wf_mc=");
                stringBuffer3.append(stringBuffer.toString());
            }
            if (strReplace != null) {
                stringBuffer3.append("&wf_rs=" + i4);
            }
            if (j2 > 10) {
                stringBuffer2 = new StringBuffer(128);
                stringBuffer2.append("&wf_ut=");
                l2 = (Long) arrayList.get(0);
                z7 = true;
                while (r6.hasNext()) {
                    if (z7) {
                        stringBuffer2.append(l3.longValue());
                        z7 = false;
                    } else {
                        jLongValue = l3.longValue() - l2.longValue();
                        if (jLongValue != 0) {
                            stringBuffer2.append("");
                            stringBuffer2.append(jLongValue);
                        }
                    }
                    stringBuffer2.append("|");
                }
                if (l.a.f3262a) {
                    g.v().a("wifi scantime list str = " + stringBuffer2.toString());
                }
                stringBuffer3.append(stringBuffer2.toString());
            }
            stringBuffer3.append("&wf_st=");
            stringBuffer3.append(kVar.f3020b);
            stringBuffer3.append("&wf_et=");
            stringBuffer3.append(kVar.f3021c);
            stringBuffer3.append("&wf_vt=");
            stringBuffer3.append(bVar.f3247i);
            if (i9 > 0) {
                kVar.f3022d = true;
                stringBuffer3.append("&wf_en=");
                stringBuffer3.append(kVar.f3023e ? 1 : 0);
            }
            if (str2 != null) {
                stringBuffer3.append("&wf_gw=");
                stringBuffer3.append(str2);
            }
            return stringBuffer3.toString();
        } catch (Error | Exception e6) {
            if (!l.a.f3262a) {
                return null;
            }
            e6.printStackTrace();
            return null;
        }
    }

    public final String d(long j2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf((int) (j2 & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j2 >> 8) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j2 >> 16) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j2 >> 24) & 255)));
        return stringBuffer.toString();
    }

    public synchronized String e(WifiInfo wifiInfo, String str) {
        if (wifiInfo == null && str == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f3250l > 1000) {
            if (wifiInfo != null) {
                this.f3251m = wifiInfo.getBSSID();
            } else {
                this.f3251m = str;
            }
            this.f3250l = jCurrentTimeMillis;
        }
        return this.f3251m;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:105:0x0205  */
    /* JADX WARN: Code duplicated, block: B:107:0x0210  */
    /* JADX WARN: Code duplicated, block: B:132:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b9  */
    /* JADX WARN: Instruction removed from duplicated block: B:107:0x0210, please report this as an issue */
    public String f(k kVar, int i2, String str, boolean z2, int i3) {
        long jElapsedRealtimeNanos;
        boolean z3;
        StringBuffer stringBuffer;
        int size;
        boolean z4;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2;
        int i8;
        int i9;
        String str3;
        boolean z5;
        StringBuffer stringBuffer2;
        Long l2;
        Iterator it;
        long jLongValue;
        long jLongValue2;
        boolean z6;
        long j3;
        if (kVar.e() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
            while (true) {
                if (i4 >= size) {
                    str2 = ";%d;";
                    i8 = size;
                    i9 = i6;
                    break;
                }
                i8 = size;
                if (kVar.f3019a.get(i4) == null || kVar.f3019a.get(i4).level == 0) {
                    jElapsedRealtimeNanos = jElapsedRealtimeNanos;
                } else {
                    int i10 = i5 + 1;
                    if (z4) {
                        stringBuffer.append("&wf=");
                        z6 = false;
                    } else {
                        stringBuffer.append("|");
                        z6 = z4;
                    }
                    String strReplace = kVar.f3019a.get(i4).BSSID.replace(":", "");
                    stringBuffer.append(strReplace);
                    if (str != 0 && strReplace.equals(str)) {
                        i7 = i10;
                    }
                    int i11 = kVar.f3019a.get(i4).level;
                    if (i11 < 0) {
                        i11 = -i11;
                    }
                    stringBuffer.append(String.format(Locale.CHINA, ";%d;", Integer.valueOf(i11)));
                    i9 = i6 + 1;
                    if (z3) {
                        try {
                            str2 = ";%d;";
                            try {
                                j3 = (jElapsedRealtimeNanos - kVar.f3019a.get(i4).timestamp) / 1000000;
                            } catch (Throwable th) {
                                th = th;
                                if (l.a.f3262a) {
                                    th.printStackTrace();
                                }
                                j3 = 0;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = ";%d;";
                        }
                        boolean z7 = l.a.f3262a;
                        if (z7 && l.a.f3263b) {
                            g.v().a("wifi noUpdateTime = " + j3);
                        }
                        arrayList.add(Long.valueOf(j3));
                        if (j3 > j2) {
                            if (z7 && l.a.f3263b) {
                                g.v().a("wifi maxScanTime = " + j3);
                            }
                            j2 = j3;
                        }
                    } else {
                        str2 = ";%d;";
                        jElapsedRealtimeNanos = jElapsedRealtimeNanos;
                    }
                    if (i9 > i2) {
                        z4 = z6;
                        break;
                    }
                    i6 = i9;
                    z4 = z6;
                    i5 = i10;
                }
                i4++;
                size = i8;
                jElapsedRealtimeNanos = jElapsedRealtimeNanos;
            }
        } catch (Error unused) {
            jElapsedRealtimeNanos = 0;
        }
        z3 = jElapsedRealtimeNanos > 0;
        stringBuffer = new StringBuffer(512);
        size = kVar.f3019a.size();
        z4 = true;
        j2 = 0;
        i4 = 0;
        i5 = 0;
        i6 = 0;
        i7 = 0;
        int i12 = i7;
        if (z2) {
            return stringBuffer.toString();
        }
        if (i12 > 0) {
            stringBuffer.append("&wf_n=");
            stringBuffer.append(i12);
        }
        if (i9 > i2) {
            str3 = "|";
            if (i3 > i2 + 1) {
                int i13 = i9;
                int i14 = i8;
                while (true) {
                    if (i13 < i14) {
                        if (i13 == i9) {
                            stringBuffer.append("&wf2=");
                        } else {
                            stringBuffer.append(str3);
                        }
                        stringBuffer.append(kVar.f3019a.get(i13).BSSID.replace(":", ""));
                        int i15 = kVar.f3019a.get(i13).level;
                        if (i15 < 0) {
                            i15 = -i15;
                        }
                        Locale locale = Locale.CHINA;
                        z5 = true;
                        Object[] objArr = {Integer.valueOf(i15)};
                        String str4 = str2;
                        stringBuffer.append(String.format(locale, str4, objArr));
                        if (i13 >= i3) {
                            break;
                        }
                        i13++;
                        str2 = str4;
                    }
                }
            }
            if (z4) {
                return null;
            }
            if (j2 > 10 && arrayList.size() > 0 && ((Long) arrayList.get(0)).longValue() > 0) {
                stringBuffer2 = new StringBuffer(128);
                stringBuffer2.append("&wf_ut=");
                l2 = (Long) arrayList.get(0);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    jLongValue = ((Long) it.next()).longValue();
                    if (z5) {
                        stringBuffer2.append(jLongValue);
                        z5 = false;
                    } else {
                        jLongValue2 = jLongValue - l2.longValue();
                        if (jLongValue2 != 0) {
                            stringBuffer2.append("" + jLongValue2);
                        }
                    }
                    stringBuffer2.append(str3);
                }
                if (l.a.f3262a && l.a.f3263b) {
                    g.v().a("wifi scantime list str = " + stringBuffer2.toString());
                }
                stringBuffer.append(stringBuffer2.toString());
            }
            return stringBuffer.toString();
        }
        str3 = r4;
        z5 = true;
        if (z4) {
            return null;
        }
        if (j2 > 10) {
            stringBuffer2 = new StringBuffer(128);
            stringBuffer2.append("&wf_ut=");
            l2 = (Long) arrayList.get(0);
            it = arrayList.iterator();
            while (it.hasNext()) {
                jLongValue = ((Long) it.next()).longValue();
                if (z5) {
                    stringBuffer2.append(jLongValue);
                    z5 = false;
                } else {
                    jLongValue2 = jLongValue - l2.longValue();
                    if (jLongValue2 != 0) {
                        stringBuffer2.append("" + jLongValue2);
                    }
                }
                stringBuffer2.append(str3);
            }
            if (l.a.f3262a) {
                g.v().a("wifi scantime list str = " + stringBuffer2.toString());
            }
            stringBuffer.append(stringBuffer2.toString());
        }
        return stringBuffer.toString();
    }

    public void g(int i2) {
        this.f3246h = i2;
    }

    public void h(Context context, List<String> list) {
        if (this.f3241c) {
            return;
        }
        this.f3245g = context;
        this.f3242d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f3243e = new c();
        if (this.f3254p == null) {
            this.f3254p = new Handler(Looper.getMainLooper());
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains("android.net.wifi.SCAN_RESULTS")) {
            list.add("android.net.wifi.SCAN_RESULTS");
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f3245g.registerReceiver(this.f3243e, new IntentFilter(it.next()));
            }
        } catch (Exception e2) {
            if (l.a.f3262a) {
                e2.printStackTrace();
            }
        }
        this.f3241c = true;
        if (l.a.f3262a && l.a.f3263b) {
            g.v().a("wifimanager start ...");
        }
    }

    public boolean j(k kVar, k kVar2) {
        List<ScanResult> list = kVar.f3019a;
        if (list == null || kVar2 == null || kVar2.f3019a == null) {
            return false;
        }
        int iMin = Math.min(list.size(), kVar2.f3019a.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            try {
                if (kVar.f3019a.get(i2) != null) {
                    String str = kVar.f3019a.get(i2).BSSID;
                    String str2 = kVar2.f3019a.get(i2).BSSID;
                    if (!TextUtils.isEmpty(str) && !str.equals(str2)) {
                        return false;
                    }
                }
            } catch (Exception e2) {
                if (l.a.f3262a) {
                    e2.printStackTrace();
                }
                return false;
            }
        }
        return true;
    }

    public final boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("wpa|wep", 2).matcher(str).find();
    }

    public k m(long j2) {
        e eVarV;
        String str;
        if (this.f3242d != null && j2 < 2147483647L) {
            boolean z2 = l.a.f3262a;
            if (z2 && l.a.f3263b) {
                g.v().a("Wi-Fi diffTime = " + j2 + "mLastDiffTime = " + this.f3249k);
            }
            if (j2 == this.f3249k) {
                if (z2 && l.a.f3263b) {
                    g.v().a("System.currentTimeMillis() = " + System.currentTimeMillis() + "wifi diffTime = " + j2 + ", mScanTime = " + this.f3248j);
                }
                if (System.currentTimeMillis() - this.f3248j > j2) {
                    if (z2 && l.a.f3263b) {
                        eVarV = g.v();
                        str = "time is over";
                        eVarV.a(str);
                    }
                    w();
                }
            } else {
                if (z2 && l.a.f3263b) {
                    eVarV = g.v();
                    str = "diffTime is changed";
                    eVarV.a(str);
                }
                w();
            }
        }
        this.f3249k = j2;
        return this.f3244f;
    }

    public String o() {
        StringBuffer stringBuffer = new StringBuffer();
        WifiInfo wifiInfoA = s().a();
        String strE = e(wifiInfoA, null);
        if (wifiInfoA == null || strE == null) {
            return null;
        }
        String strReplace = strE.replace(":", "");
        int rssi = wifiInfoA.getRssi();
        String strT = s().t();
        if (rssi < 0) {
            rssi = -rssi;
        }
        if (strReplace == null || rssi >= 100 || "020000000000".equals(strReplace)) {
            return null;
        }
        stringBuffer.append("&wf=");
        stringBuffer.append(strReplace);
        stringBuffer.append(";");
        stringBuffer.append("" + rssi + ";");
        String ssid = wifiInfoA.getSSID();
        if (ssid != null && (ssid.contains("&") || ssid.contains(";"))) {
            ssid = ssid.replace("&", "_");
        }
        stringBuffer.append(ssid);
        stringBuffer.append("&wf_n=1");
        if (strT != null) {
            stringBuffer.append("&wf_gw=");
            stringBuffer.append(strT);
        }
        return stringBuffer.toString();
    }

    public final String p(String str) {
        if (str != null) {
            return (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str;
        }
        return str;
    }

    public k r() {
        k kVarB;
        synchronized (this.f3253o) {
            kVarB = b(this.f3244f);
        }
        if (kVarB == null || !kVarB.d()) {
            try {
                WifiManager wifiManager = this.f3242d;
                kVarB = wifiManager != null ? new k(wifiManager.getScanResults(), this.f3248j) : new k(null, 0L);
            } catch (Exception e2) {
                if (l.a.f3262a) {
                    e2.printStackTrace();
                }
            }
        }
        return kVarB;
    }

    public final String t() {
        DhcpInfo dhcpInfo;
        WifiManager wifiManager = this.f3242d;
        if (wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null) {
            return null;
        }
        return d(dhcpInfo.gateway);
    }

    public long u() {
        return this.f3248j;
    }

    public final void v() {
        WifiManager wifiManager = this.f3242d;
        if (wifiManager == null) {
            return;
        }
        try {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (l.a.f3262a && l.a.f3263b) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (scanResults != null && scanResults.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    long j2 = 0;
                    for (int i2 = 0; i2 < scanResults.size(); i2++) {
                        if (i2 == 0) {
                            try {
                                j2 = (jCurrentTimeMillis - scanResults.get(0).timestamp) / 1000000;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                j2 = 0;
                            }
                            sb.append(scanResults.get(0).BSSID + ";" + Math.abs(scanResults.get(0).level) + ";" + scanResults.get(0).SSID.trim() + ";" + scanResults.get(0).frequency + ";" + j2 + "|");
                        }
                        sb.append(scanResults.get(i2).BSSID + ";" + Math.abs(scanResults.get(i2).level) + ";" + scanResults.get(i2).SSID.trim() + ";" + scanResults.get(i2).frequency + ";" + (((jCurrentTimeMillis - scanResults.get(i2).timestamp) / 1000000) - j2) + "|");
                    }
                    sb.append("\t");
                    sb.append(simpleDateFormat.format(new Date(jCurrentTimeMillis)));
                    sb.append("\t");
                    sb.append(jCurrentTimeMillis);
                    sb.append("\tnull\n");
                    g.v().a(sb.toString());
                }
            }
            if (scanResults != null) {
                k kVar = new k(scanResults, System.currentTimeMillis());
                synchronized (this.f3253o) {
                    k kVar2 = this.f3244f;
                    if (kVar2 == null || !j(kVar, kVar2)) {
                        this.f3244f = kVar;
                    }
                }
            }
        } catch (Exception e3) {
            if (l.a.f3262a) {
                e3.printStackTrace();
            }
        }
    }

    public final void w() {
        try {
            if (this.f3242d.isWifiEnabled() || this.f3242d.isScanAlwaysAvailable()) {
                this.f3242d.startScan();
                if (l.a.f3262a && l.a.f3263b) {
                    g.v().a("wifimanager start scan ...");
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f3248j = System.currentTimeMillis();
        synchronized (this.f3252n) {
            try {
                int i2 = this.f3246h;
                if (i2 != 0) {
                    this.f3252n.wait(i2);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public void x() {
        if (this.f3241c) {
            try {
                this.f3245g.unregisterReceiver(this.f3243e);
                this.f3247i = 0L;
            } catch (Exception e2) {
                if (l.a.f3262a) {
                    e2.printStackTrace();
                }
            }
            this.f3243e = null;
            this.f3242d = null;
            this.f3241c = false;
            if (l.a.f3262a && l.a.f3263b) {
                g.v().a("wifimanager stop ...");
            }
        }
    }
}
