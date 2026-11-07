package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class f extends x implements android.arch.lifecycle.o, android.support.v4.app.a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.arch.lifecycle.n f486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f488h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    f0.l<String> f494n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f484d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final h f485e = h.b(new b());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f489i = true;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
            } else {
                f.this.p();
                f.this.f485e.s();
            }
        }
    }

    class b extends i<f> {
        public b() {
            super(f.this);
        }

        @Override // android.support.v4.app.g
        public View b(int i2) {
            return f.this.findViewById(i2);
        }

        @Override // android.support.v4.app.g
        public boolean c() {
            Window window = f.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // android.support.v4.app.i
        public void h(e eVar) {
            f.this.n(eVar);
        }

        @Override // android.support.v4.app.i
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            f.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.v4.app.i
        public LayoutInflater j() {
            return f.this.getLayoutInflater().cloneInContext(f.this);
        }

        @Override // android.support.v4.app.i
        public int k() {
            Window window = f.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // android.support.v4.app.i
        public boolean l() {
            return f.this.getWindow() != null;
        }

        @Override // android.support.v4.app.i
        public boolean m(e eVar) {
            return !f.this.isFinishing();
        }

        @Override // android.support.v4.app.i
        public void n() {
            f.this.r();
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.arch.lifecycle.n f498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        l f499c;

        c() {
        }
    }

    static void i(int i2) {
        if ((i2 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void l() {
        while (m(k(), android.arch.lifecycle.c.b.CREATED)) {
        }
    }

    private static boolean m(j jVar, android.arch.lifecycle.c.b bVar) {
        boolean zM = false;
        for (e eVar : jVar.b()) {
            if (eVar != null) {
                if (eVar.a().a().a(android.arch.lifecycle.c.b.STARTED)) {
                    eVar.T.i(bVar);
                    zM = true;
                }
                j jVarS0 = eVar.s0();
                if (jVarS0 != null) {
                    zM |= m(jVarS0, bVar);
                }
            }
        }
        return zM;
    }

    @Override // android.support.v4.app.x, android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
        return super.a();
    }

    @Override // android.support.v4.app.a.b
    public final void b(int i2) {
        if (this.f490j || i2 == -1) {
            return;
        }
        i(i2);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f487g);
        printWriter.print(" mResumed=");
        printWriter.print(this.f488h);
        printWriter.print(" mStopped=");
        printWriter.print(this.f489i);
        if (getApplication() != null) {
            s.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f485e.u().a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.arch.lifecycle.o
    public android.arch.lifecycle.n g() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f486f == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f486f = cVar.f498b;
            }
            if (this.f486f == null) {
                this.f486f = new android.arch.lifecycle.n();
            }
        }
        return this.f486f;
    }

    final View j(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f485e.w(view, str, context, attributeSet);
    }

    public j k() {
        return this.f485e.u();
    }

    public void n(e eVar) {
    }

    protected boolean o(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.f485e.v();
        int i4 = i2 >> 16;
        if (i4 == 0) {
            android.support.v4.app.a.e();
            super.onActivityResult(i2, i3, intent);
            return;
        }
        int i5 = i4 - 1;
        String strF = this.f494n.f(i5);
        this.f494n.j(i5);
        if (strF == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        e eVarT = this.f485e.t(strF);
        if (eVarT != null) {
            eVarT.N(i2 & 65535, i3, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strF);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        j jVarU = this.f485e.u();
        if (jVarU.c() || !jVarU.d()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f485e.v();
        this.f485e.d(configuration);
    }

    @Override // android.support.v4.app.x, android.app.Activity
    protected void onCreate(Bundle bundle) {
        android.arch.lifecycle.n nVar;
        this.f485e.a(null);
        super.onCreate(bundle);
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null && (nVar = cVar.f498b) != null && this.f486f == null) {
            this.f486f = nVar;
        }
        if (bundle != null) {
            this.f485e.x(bundle.getParcelable("android:support:fragments"), cVar != null ? cVar.f499c : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f493m = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f494n = new f0.l<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.f494n.i(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.f494n == null) {
            this.f494n = new f0.l<>();
            this.f493m = 0;
        }
        this.f485e.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        return this.f485e.g(menu, getMenuInflater()) | super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewJ = j(view, str, context, attributeSet);
        return viewJ == null ? super.onCreateView(view, str, context, attributeSet) : viewJ;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewJ = j(null, str, context, attributeSet);
        return viewJ == null ? super.onCreateView(str, context, attributeSet) : viewJ;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f486f != null && !isChangingConfigurations()) {
            this.f486f.a();
        }
        this.f485e.h();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f485e.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f485e.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f485e.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        this.f485e.j(z2);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f485e.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f485e.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f488h = false;
        if (this.f484d.hasMessages(2)) {
            this.f484d.removeMessages(2);
            p();
        }
        this.f485e.m();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        this.f485e.n(z2);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f484d.removeMessages(2);
        p();
        this.f485e.s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0 || menu == null) {
            return super.onPreparePanel(i2, view, menu);
        }
        return this.f485e.o(menu) | o(view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f485e.v();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String strF = this.f494n.f(i4);
            this.f494n.j(i4);
            if (strF == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            e eVarT = this.f485e.t(strF);
            if (eVarT != null) {
                eVarT.l0(i2 & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strF);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f484d.sendEmptyMessage(2);
        this.f488h = true;
        this.f485e.s();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object objQ = q();
        l lVarY = this.f485e.y();
        if (lVarY == null && this.f486f == null && objQ == null) {
            return null;
        }
        c cVar = new c();
        cVar.f497a = objQ;
        cVar.f498b = this.f486f;
        cVar.f499c = lVarY;
        return cVar;
    }

    @Override // android.support.v4.app.x, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        l();
        Parcelable parcelableZ = this.f485e.z();
        if (parcelableZ != null) {
            bundle.putParcelable("android:support:fragments", parcelableZ);
        }
        if (this.f494n.k() > 0) {
            bundle.putInt("android:support:next_request_index", this.f493m);
            int[] iArr = new int[this.f494n.k()];
            String[] strArr = new String[this.f494n.k()];
            for (int i2 = 0; i2 < this.f494n.k(); i2++) {
                iArr[i2] = this.f494n.h(i2);
                strArr[i2] = this.f494n.l(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f489i = false;
        if (!this.f487g) {
            this.f487g = true;
            this.f485e.c();
        }
        this.f485e.v();
        this.f485e.s();
        this.f485e.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f485e.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f489i = true;
        l();
        this.f485e.r();
    }

    protected void p() {
        this.f485e.p();
    }

    public Object q() {
        return null;
    }

    @Deprecated
    public void r() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2) {
        if (!this.f492l && i2 != -1) {
            i(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (!this.f492l && i2 != -1) {
            i(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        if (!this.f491k && i2 != -1) {
            i(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.f491k && i2 != -1) {
            i(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
