package h0;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f2730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2731b = -1;

    private a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2730a = accessibilityNodeInfo;
    }

    private static String b(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public static a x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new a(accessibilityNodeInfo);
    }

    public void a(int i2) {
        this.f2730a.addAction(i2);
    }

    public int c() {
        return this.f2730a.getActions();
    }

    public void d(Rect rect) {
        this.f2730a.getBoundsInParent(rect);
    }

    public void e(Rect rect) {
        this.f2730a.getBoundsInScreen(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2730a;
        if (accessibilityNodeInfo == null) {
            if (aVar.f2730a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(aVar.f2730a)) {
            return false;
        }
        return true;
    }

    public CharSequence f() {
        return this.f2730a.getClassName();
    }

    public CharSequence g() {
        return this.f2730a.getContentDescription();
    }

    public CharSequence h() {
        return this.f2730a.getPackageName();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2730a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public CharSequence i() {
        return this.f2730a.getText();
    }

    public String j() {
        return this.f2730a.getViewIdResourceName();
    }

    public boolean k() {
        return this.f2730a.isCheckable();
    }

    public boolean l() {
        return this.f2730a.isChecked();
    }

    public boolean m() {
        return this.f2730a.isClickable();
    }

    public boolean n() {
        return this.f2730a.isEnabled();
    }

    public boolean o() {
        return this.f2730a.isFocusable();
    }

    public boolean p() {
        return this.f2730a.isFocused();
    }

    public boolean q() {
        return this.f2730a.isLongClickable();
    }

    public boolean r() {
        return this.f2730a.isPassword();
    }

    public boolean s() {
        return this.f2730a.isScrollable();
    }

    public boolean t() {
        return this.f2730a.isSelected();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb.append("; boundsInParent: " + rect);
        e(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(h());
        sb.append("; className: ");
        sb.append(f());
        sb.append("; text: ");
        sb.append(i());
        sb.append("; contentDescription: ");
        sb.append(g());
        sb.append("; viewId: ");
        sb.append(j());
        sb.append("; checkable: ");
        sb.append(k());
        sb.append("; checked: ");
        sb.append(l());
        sb.append("; focusable: ");
        sb.append(o());
        sb.append("; focused: ");
        sb.append(p());
        sb.append("; selected: ");
        sb.append(t());
        sb.append("; clickable: ");
        sb.append(m());
        sb.append("; longClickable: ");
        sb.append(q());
        sb.append("; enabled: ");
        sb.append(n());
        sb.append("; password: ");
        sb.append(r());
        sb.append("; scrollable: " + s());
        sb.append("; [");
        int iC = c();
        while (iC != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iC);
            iC &= ~iNumberOfTrailingZeros;
            sb.append(b(iNumberOfTrailingZeros));
            if (iC != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void u(CharSequence charSequence) {
        this.f2730a.setClassName(charSequence);
    }

    public void v(boolean z2) {
        this.f2730a.setScrollable(z2);
    }

    public AccessibilityNodeInfo w() {
        return this.f2730a;
    }
}
