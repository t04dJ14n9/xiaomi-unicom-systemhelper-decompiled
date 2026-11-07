package g1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.mobiletools.systemhelper.control.AppInfoRegisterReceiver;
import com.mobiletools.systemhelper.control.GetSignalInfoReceiver;
import com.mobiletools.systemhelper.control.OnBootReceiver;
import com.mobiletools.systemhelper.control.SIMStateReceiver;
import com.mobiletools.systemhelper.control.ScheduleRegisterReceiver;
import com.mobiletools.systemhelper.control.SignalInfoRegisterReceiver;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static void a(Context context, long j2, long j3) {
        h.a("AlarmHelper", "AppInfoAlarmAfter--->");
        h.a("AlarmHelper", "GlobalSetting.count_app = " + d.f2664q);
        int i2 = d.f2664q;
        h.a("AlarmHelper", "AppInfoAlarmAfter--->");
        if (i2 != 0) {
            ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j3, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) AppInfoRegisterReceiver.class), 201326592));
            h.a("AlarmHelper", "GlobalSetting.DEFAULT_RANDOM AppInfoAlarmAfter: " + d.f2660m);
            h.a("AlarmHelper", "AppInfoAlarmAfter  SystemClock.elapsedRealtime() + ms: " + d.f2660m);
            return;
        }
        ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j2 + j3, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) AppInfoRegisterReceiver.class), 201326592));
        h.a("AlarmHelper", "GlobalSetting.DEFAULT_RANDOM AppInfoAlarmAfter test: " + d.f2660m);
        h.a("AlarmHelper", "测试助手修改后的app info rand ： " + j2);
        d.f2664q = d.f2664q + 1;
    }

    public static void b(Context context, long j2) {
        ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j2, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) OnBootReceiver.class), 201326592));
    }

    public static void c(Context context, long j2) {
        h.a("AlarmHelper", "GetSignalInfoAlarmAfter====>");
        Intent intent = new Intent(context, (Class<?>) GetSignalInfoReceiver.class);
        h.a("AlarmHelper", "intent: " + intent);
        ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j2, PendingIntent.getBroadcast(context, 0, intent, 201326592));
    }

    public static void d(Context context, long j2) {
        ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j2, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SIMStateReceiver.class), 201326592));
    }

    public static void e(Context context, long j2, long j3) {
        h.a("AlarmHelper", "ScheduleAlarmAfter--->");
        h.a("AlarmHelper", "GlobalSetting.count = " + d.f2663p);
        if (d.f2663p != 0) {
            ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j3, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) ScheduleRegisterReceiver.class), 201326592));
            h.a("AlarmHelper", "GlobalSetting.DEFAULT_RANDOM_SCHEGULE ScheduleAlarmAfter: " + d.f2661n);
            return;
        }
        ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j2 + j3, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) ScheduleRegisterReceiver.class), 201326592));
        h.a("AlarmHelper", "GlobalSetting.DEFAULT_RANDOM_SCHEGULE ScheduleAlarmAfter test: " + d.f2661n);
        h.a("AlarmHelper", "测试助手修改后的rand ： " + j2);
        d.f2663p = d.f2663p + 1;
    }

    public static void f(Context context, long j2, long j3) {
        h.a("AlarmHelper", "SignalInfoAlarmAfter--->");
        h.a("AlarmHelper", "GlobalSetting.count_sig = " + d.f2665r);
        if (d.f2665r != 0) {
            h.a("AlarmHelper", "GlobalSetting.count_sig > 0");
            ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j3, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SignalInfoRegisterReceiver.class), 201326592));
            return;
        }
        ((AlarmManager) context.getSystemService("alarm")).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j2 + j3, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SignalInfoRegisterReceiver.class), 201326592));
        h.a("AlarmHelper", "测试助手修改后的rand ： " + j2);
        d.f2665r = d.f2665r + 1;
    }
}
