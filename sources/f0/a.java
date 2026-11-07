package f0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends k<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    h<K, V> f2494i;

    /* JADX INFO: renamed from: f0.a$a, reason: collision with other inner class name */
    class C0025a extends h<K, V> {
        C0025a() {
        }

        @Override // f0.h
        protected void a() {
            a.this.clear();
        }

        @Override // f0.h
        protected Object b(int i2, int i3) {
            return a.this.f2545c[(i2 << 1) + i3];
        }

        @Override // f0.h
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // f0.h
        protected int d() {
            return a.this.f2546d;
        }

        @Override // f0.h
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // f0.h
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // f0.h
        protected void g(K k2, V v2) {
            a.this.put(k2, v2);
        }

        @Override // f0.h
        protected void h(int i2) {
            a.this.j(i2);
        }

        @Override // f0.h
        protected V i(int i2, V v2) {
            return a.this.k(i2, v2);
        }
    }

    private h<K, V> m() {
        if (this.f2494i == null) {
            this.f2494i = new C0025a();
        }
        return this.f2494i;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return h.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f2546d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
