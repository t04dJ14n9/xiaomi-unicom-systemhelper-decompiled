package q0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f3548a;

    d(c cVar) {
        this.f3548a = cVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        int i2 = bVar2.f3543b - bVar.f3543b;
        if (i2 != 0) {
            return i2;
        }
        boolean z2 = bVar.f3545d;
        if (z2 && bVar2.f3545d) {
            return 0;
        }
        if (z2) {
            return -1;
        }
        if (bVar2.f3545d) {
            return 1;
        }
        return i2;
    }
}
