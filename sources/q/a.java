package q;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<K, b.d<K, V>> f3528f = new HashMap<>();

    @Override // q.b
    protected b.d<K, V> c(K k2) {
        return this.f3528f.get(k2);
    }

    public boolean contains(K k2) {
        return this.f3528f.containsKey(k2);
    }

    @Override // q.b
    public V f(K k2) {
        V v2 = (V) super.f(k2);
        this.f3528f.remove(k2);
        return v2;
    }
}
