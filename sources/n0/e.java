package n0;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class e extends d {

    class a extends d.a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        g0.c.b f3487f;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // g0.c
        public boolean b() {
            return this.f3482d.isVisible();
        }

        @Override // g0.c
        public View d(MenuItem menuItem) {
            return this.f3482d.onCreateActionView(menuItem);
        }

        @Override // g0.c
        public boolean g() {
            return this.f3482d.overridesItemVisibility();
        }

        @Override // g0.c
        public void j(g0.c.b bVar) {
            this.f3487f = bVar;
            ActionProvider actionProvider = this.f3482d;
            if (bVar == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z2) {
            g0.c.b bVar = this.f3487f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z2);
            }
        }
    }

    e(Context context, c0.b bVar) {
        super(context, bVar);
    }

    @Override // n0.d
    d.a h(ActionProvider actionProvider) {
        return new a(this.f3477b, actionProvider);
    }
}
