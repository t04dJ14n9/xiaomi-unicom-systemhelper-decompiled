package q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d<K, V> f3529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d<K, V> f3530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakHashMap<g<K, V>, Boolean> f3531d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3532e = 0;

    /* JADX INFO: renamed from: q.b$b, reason: collision with other inner class name */
    static class C0043b<K, V> extends f<K, V> {
        C0043b(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // q.b.f
        d<K, V> b(d<K, V> dVar) {
            return dVar.f3536e;
        }

        @Override // q.b.f
        d<K, V> c(d<K, V> dVar) {
            return dVar.f3535d;
        }
    }

    private static class c<K, V> extends f<K, V> {
        c(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // q.b.f
        d<K, V> b(d<K, V> dVar) {
            return dVar.f3535d;
        }

        @Override // q.b.f
        d<K, V> c(d<K, V> dVar) {
            return dVar.f3536e;
        }
    }

    static class d<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f3533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final V f3534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d<K, V> f3535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        d<K, V> f3536e;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3533b.equals(dVar.f3533b) && this.f3534c.equals(dVar.f3534c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f3533b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f3534c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f3533b + "=" + this.f3534c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class e implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d<K, V> f3537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3538c;

        private e() {
            this.f3538c = true;
        }

        @Override // q.b.g
        public void a(d<K, V> dVar) {
            d<K, V> dVar2 = this.f3537b;
            if (dVar == dVar2) {
                d<K, V> dVar3 = dVar2.f3536e;
                this.f3537b = dVar3;
                this.f3538c = dVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            d<K, V> dVar;
            if (this.f3538c) {
                this.f3538c = false;
                dVar = b.this.f3529b;
            } else {
                d<K, V> dVar2 = this.f3537b;
                dVar = dVar2 != null ? dVar2.f3535d : null;
            }
            this.f3537b = dVar;
            return this.f3537b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3538c) {
                return b.this.f3529b != null;
            }
            d<K, V> dVar = this.f3537b;
            return (dVar == null || dVar.f3535d == null) ? false : true;
        }
    }

    private static abstract class f<K, V> implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d<K, V> f3540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        d<K, V> f3541c;

        f(d<K, V> dVar, d<K, V> dVar2) {
            this.f3540b = dVar2;
            this.f3541c = dVar;
        }

        private d<K, V> e() {
            d<K, V> dVar = this.f3541c;
            d<K, V> dVar2 = this.f3540b;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return c(dVar);
        }

        @Override // q.b.g
        public void a(d<K, V> dVar) {
            if (this.f3540b == dVar && dVar == this.f3541c) {
                this.f3541c = null;
                this.f3540b = null;
            }
            d<K, V> dVar2 = this.f3540b;
            if (dVar2 == dVar) {
                this.f3540b = b(dVar2);
            }
            if (this.f3541c == dVar) {
                this.f3541c = e();
            }
        }

        abstract d<K, V> b(d<K, V> dVar);

        abstract d<K, V> c(d<K, V> dVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            d<K, V> dVar = this.f3541c;
            this.f3541c = e();
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3541c != null;
        }
    }

    interface g<K, V> {
        void a(d<K, V> dVar);
    }

    public Map.Entry<K, V> b() {
        return this.f3529b;
    }

    protected d<K, V> c(K k2) {
        d<K, V> dVar = this.f3529b;
        while (dVar != null && !dVar.f3533b.equals(k2)) {
            dVar = dVar.f3535d;
        }
        return dVar;
    }

    public b<K, V>.e d() {
        b<K, V>.e eVar = new e();
        this.f3531d.put(eVar, Boolean.FALSE);
        return eVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        c cVar = new c(this.f3530c, this.f3529b);
        this.f3531d.put(cVar, Boolean.FALSE);
        return cVar;
    }

    public Map.Entry<K, V> e() {
        return this.f3530c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public V f(K k2) {
        d<K, V> dVarC = c(k2);
        if (dVarC == null) {
            return null;
        }
        this.f3532e--;
        if (!this.f3531d.isEmpty()) {
            Iterator<g<K, V>> it = this.f3531d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(dVarC);
            }
        }
        d<K, V> dVar = dVarC.f3536e;
        d<K, V> dVar2 = dVarC.f3535d;
        if (dVar != null) {
            dVar.f3535d = dVar2;
        } else {
            this.f3529b = dVar2;
        }
        d<K, V> dVar3 = dVarC.f3535d;
        if (dVar3 != null) {
            dVar3.f3536e = dVar;
        } else {
            this.f3530c = dVar;
        }
        dVarC.f3535d = null;
        dVarC.f3536e = null;
        return dVarC.f3534c;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0043b c0043b = new C0043b(this.f3529b, this.f3530c);
        this.f3531d.put(c0043b, Boolean.FALSE);
        return c0043b;
    }

    public int size() {
        return this.f3532e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
