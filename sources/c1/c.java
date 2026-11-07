package c1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b> f2123a = Collections.emptyList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2124b = -1;

    @Override // d1.c
    public int a() {
        if (this.f2124b < 0) {
            b();
        }
        return this.f2124b;
    }

    @Override // d1.c
    public int b() {
        Iterator<b> it = g().iterator();
        int iF = 0;
        while (it.hasNext()) {
            iF += d1.b.f(1, it.next());
        }
        this.f2124b = iF;
        return iF;
    }

    @Override // d1.c
    public void e(d1.b bVar) throws IOException {
        Iterator<b> it = g().iterator();
        while (it.hasNext()) {
            bVar.t(1, it.next());
        }
    }

    public c f(b bVar) {
        if (bVar == null) {
            return this;
        }
        if (this.f2123a.isEmpty()) {
            this.f2123a = new ArrayList();
        }
        this.f2123a.add(bVar);
        return this;
    }

    public List<b> g() {
        return this.f2123a;
    }
}
