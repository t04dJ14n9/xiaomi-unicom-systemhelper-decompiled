package g0;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public interface a {
        boolean e(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        return m.b(view, keyEvent);
    }

    public static boolean b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return aVar.e(keyEvent);
    }
}
