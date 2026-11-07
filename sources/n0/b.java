package n0;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class b<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f3477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<c0.b, MenuItem> f3478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<c0.c, SubMenu> f3479d;

    b(Context context, T t2) {
        super(t2);
        this.f3477b = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof c0.b)) {
            return menuItem;
        }
        c0.b bVar = (c0.b) menuItem;
        if (this.f3478c == null) {
            this.f3478c = new f0.a();
        }
        MenuItem menuItem2 = this.f3478c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem menuItemB = f.b(this.f3477b, bVar);
        this.f3478c.put(bVar, menuItemB);
        return menuItemB;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c0.c)) {
            return subMenu;
        }
        c0.c cVar = (c0.c) subMenu;
        if (this.f3479d == null) {
            this.f3479d = new f0.a();
        }
        SubMenu subMenu2 = this.f3479d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu subMenuC = f.c(this.f3477b, cVar);
        this.f3479d.put(cVar, subMenuC);
        return subMenuC;
    }

    final void e() {
        Map<c0.b, MenuItem> map = this.f3478c;
        if (map != null) {
            map.clear();
        }
        Map<c0.c, SubMenu> map2 = this.f3479d;
        if (map2 != null) {
            map2.clear();
        }
    }

    final void f(int i2) {
        Map<c0.b, MenuItem> map = this.f3478c;
        if (map == null) {
            return;
        }
        Iterator<c0.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i2 == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    final void g(int i2) {
        Map<c0.b, MenuItem> map = this.f3478c;
        if (map == null) {
            return;
        }
        Iterator<c0.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i2 == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
