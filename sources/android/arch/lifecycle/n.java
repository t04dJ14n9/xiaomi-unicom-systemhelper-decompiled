package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, l> f122a = new HashMap<>();

    public final void a() {
        Iterator<l> it = this.f122a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f122a.clear();
    }

    final l b(String str) {
        return this.f122a.get(str);
    }

    final void c(String str, l lVar) {
        l lVarPut = this.f122a.put(str, lVar);
        if (lVarPut != null) {
            lVarPut.a();
        }
    }
}
