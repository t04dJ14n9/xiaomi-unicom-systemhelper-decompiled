package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static void a(PopupWindow popupWindow, boolean z2) {
        popupWindow.setOverlapAnchor(z2);
    }

    public static void b(PopupWindow popupWindow, int i2) {
        popupWindow.setWindowLayoutType(i2);
    }

    public static void c(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        popupWindow.showAsDropDown(view, i2, i3, i4);
    }
}
