package b1;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    void a(Context context);

    double b();

    IBinder onBind(Intent intent);

    void onDestroy();

    int onStartCommand(Intent intent, int i2, int i3);

    void onTaskRemoved(Intent intent);
}
