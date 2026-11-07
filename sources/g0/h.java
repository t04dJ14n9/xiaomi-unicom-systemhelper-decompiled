package g0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static MenuItem a(MenuItem menuItem, c cVar) {
        if (menuItem instanceof c0.b) {
            return ((c0.b) menuItem).a(cVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof c0.b) {
            ((c0.b) menuItem).setAlphabeticShortcut(c2, i2);
        } else {
            menuItem.setAlphabeticShortcut(c2, i2);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof c0.b) {
            ((c0.b) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof c0.b) {
            ((c0.b) menuItem).setIconTintList(colorStateList);
        } else {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof c0.b) {
            ((c0.b) menuItem).setIconTintMode(mode);
        } else {
            menuItem.setIconTintMode(mode);
        }
    }

    public static void f(MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof c0.b) {
            ((c0.b) menuItem).setNumericShortcut(c2, i2);
        } else {
            menuItem.setNumericShortcut(c2, i2);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof c0.b) {
            ((c0.b) menuItem).setTooltipText(charSequence);
        } else {
            menuItem.setTooltipText(charSequence);
        }
    }
}
