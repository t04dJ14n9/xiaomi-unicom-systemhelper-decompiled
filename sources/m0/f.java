package m0;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import f0.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f3290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f3291b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f3292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f3293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f> f3294c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final k<Menu, Menu> f3295d = new k<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f3293b = context;
            this.f3292a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f3295d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu menuA = n0.f.a(this.f3293b, (c0.a) menu);
            this.f3295d.put(menu, menuA);
            return menuA;
        }

        @Override // m0.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f3292a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // m0.b.a
        public void b(b bVar) {
            this.f3292a.onDestroyActionMode(e(bVar));
        }

        @Override // m0.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f3292a.onActionItemClicked(e(bVar), n0.f.b(this.f3293b, (c0.b) menuItem));
        }

        @Override // m0.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f3292a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f3294c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f3294c.get(i2);
                if (fVar != null && fVar.f3291b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f3293b, bVar);
            this.f3294c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f3290a = context;
        this.f3291b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f3291b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f3291b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return n0.f.a(this.f3290a, (c0.a) this.f3291b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f3291b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f3291b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f3291b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f3291b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f3291b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f3291b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f3291b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f3291b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f3291b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f3291b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f3291b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f3291b.q(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f3291b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z2) {
        this.f3291b.s(z2);
    }
}
