package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f1044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.support.v7.app.b f1045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c f1046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j.a f1047e;

    public f(e eVar) {
        this.f1044b = eVar;
    }

    @Override // android.support.v7.view.menu.j.a
    public void a(e eVar, boolean z2) {
        if (z2 || eVar == this.f1044b) {
            c();
        }
        j.a aVar = this.f1047e;
        if (aVar != null) {
            aVar.a(eVar, z2);
        }
    }

    @Override // android.support.v7.view.menu.j.a
    public boolean b(e eVar) {
        j.a aVar = this.f1047e;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        android.support.v7.app.b bVar = this.f1045c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.f1044b;
        android.support.v7.app.b.a aVar = new android.support.v7.app.b.a(eVar.u());
        c cVar = new c(aVar.b(), j0.g.f3127j);
        this.f1046d = cVar;
        cVar.f(this);
        this.f1044b.b(this.f1046d);
        aVar.c(this.f1046d.c(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            aVar.d(viewY);
        } else {
            aVar.e(eVar.w()).g(eVar.x());
        }
        aVar.f(this);
        android.support.v7.app.b bVarA = aVar.a();
        this.f1045c = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1045c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1045c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f1044b.L((g) this.f1046d.c().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1046d.a(this.f1044b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1045c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1045c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1044b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1044b.performShortcut(i2, keyEvent, 0);
    }
}
