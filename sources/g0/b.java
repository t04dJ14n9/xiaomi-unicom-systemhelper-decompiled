package g0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final View.AccessibilityDelegate f2606b = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f2607a = new a(this);

    private static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f2608a;

        a(b bVar) {
            this.f2608a = bVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2608a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            h0.b bVarB = this.f2608a.b(view);
            if (bVarB != null) {
                return (AccessibilityNodeProvider) bVarB.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2608a.d(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f2608a.e(view, h0.a.x(accessibilityNodeInfo));
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2608a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2608a.g(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f2608a.h(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f2608a.i(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2608a.j(view, accessibilityEvent);
        }
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return f2606b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public h0.b b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = f2606b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new h0.b(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate c() {
        return this.f2607a;
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        f2606b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(View view, h0.a aVar) {
        f2606b.onInitializeAccessibilityNodeInfo(view, aVar.w());
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        f2606b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f2606b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean h(View view, int i2, Bundle bundle) {
        return f2606b.performAccessibilityAction(view, i2, bundle);
    }

    public void i(View view, int i2) {
        f2606b.sendAccessibilityEvent(view, i2);
    }

    public void j(View view, AccessibilityEvent accessibilityEvent) {
        f2606b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
