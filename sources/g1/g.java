package g1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static String a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((int) Math.round(Double.valueOf((statFs.getFreeBlocksLong() * statFs.getBlockSizeLong()) / Math.pow(1024.0d, 3.0d)).doubleValue())) + "G";
    }

    public static long b(Context context) {
        long jF = f();
        return jF < 0 ? e(context) : jF;
    }

    public static JSONObject c(Context context) {
        String str = b(context) + "G";
        String strD = d();
        String strA = a();
        if (str == null) {
            str = "Unknown";
        }
        if (strD == null) {
            strD = "Unknown";
        }
        if (strA == null) {
            strA = "Unknown";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("RAM", str);
            jSONObject.put("ROM", strD);
            jSONObject.put("FREE", strA);
            return jSONObject;
        } catch (JSONException e2) {
            h.b("MemoryUtils", e2.getMessage());
            return null;
        }
    }

    public static String d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        Double dValueOf = Double.valueOf((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / Math.pow(1024.0d, 3.0d));
        int i2 = 0;
        while (dValueOf.doubleValue() > 0.0d) {
            int i3 = i2 + 1;
            if (dValueOf.doubleValue() < Math.pow(2.0d, i3) && dValueOf.doubleValue() >= Math.pow(2.0d, i2)) {
                break;
            }
            i2 = i3;
        }
        return ((int) Math.pow(2.0d, i2 + 1)) + "G";
    }

    private static long e(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long j2 = memoryInfo.totalMem / 1048576;
        if (j2 > 30720) {
            return 32L;
        }
        if (j2 > 28672) {
            return 30L;
        }
        if (j2 > 26624) {
            return 28L;
        }
        if (j2 > 24576) {
            return 26L;
        }
        if (j2 > 22528) {
            return 24L;
        }
        if (j2 > 20480) {
            return 22L;
        }
        if (j2 > 18432) {
            return 20L;
        }
        if (j2 > 16384) {
            return 18L;
        }
        if (j2 > 14336) {
            return 16L;
        }
        if (j2 > 12288) {
            return 14L;
        }
        if (j2 > 10240) {
            return 12L;
        }
        if (j2 > 6144) {
            return 8L;
        }
        if (j2 > 4096) {
            return 6L;
        }
        if (j2 > 3072) {
            return 4L;
        }
        if (j2 > 2048) {
            return 3L;
        }
        if (j2 > 1536) {
            return 2L;
        }
        return (j2 <= 1024 && j2 <= 768) ? 0L : 1L;
    }

    private static long f() {
        String strR = l.r("ro.boot.dram_info", "");
        if (strR == null || strR.isEmpty()) {
            h.b("MemoryUtils", "No dram_info property");
            return -1L;
        }
        h.a("MemoryUtils", "dramInfo:" + strR);
        String[] strArrSplit = strR.split(",");
        String strReplaceAll = strArrSplit[strArrSplit.length + (-1)].replaceAll("\\D+", "");
        h.a("MemoryUtils", "parsed value : " + strReplaceAll);
        if (strReplaceAll == null || strReplaceAll.isEmpty()) {
            return -1L;
        }
        return Long.valueOf(strReplaceAll).longValue() * 1;
    }
}
