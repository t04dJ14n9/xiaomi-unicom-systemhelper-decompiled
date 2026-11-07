package f0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class h<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    h<K, V>.b f2525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h<K, V>.c f2526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    h<K, V>.e f2527c;

    final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f2528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f2531e = false;

        a(int i2) {
            this.f2528b = i2;
            this.f2529c = h.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2530d < this.f2529c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t2 = (T) h.this.b(this.f2530d, this.f2528b);
            this.f2530d++;
            this.f2531e = true;
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2531e) {
                throw new IllegalStateException();
            }
            int i2 = this.f2530d - 1;
            this.f2530d = i2;
            this.f2529c--;
            this.f2531e = false;
            h.this.h(i2);
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iD = h.this.d();
            for (Map.Entry<K, V> entry : collection) {
                h.this.g(entry.getKey(), entry.getValue());
            }
            return iD != h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = h.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return f0.c.c(h.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = h.this.d() - 1; iD >= 0; iD--) {
                Object objB = h.this.b(iD, 0);
                Object objB2 = h.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return h.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return h.j(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = h.this.d() - 1; iD >= 0; iD--) {
                Object objB = h.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = h.this.e(obj);
            if (iE < 0) {
                return false;
            }
            h.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return h.o(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return h.p(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return h.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.r(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2535b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f2537d = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2536c = -1;

        d() {
            this.f2535b = h.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f2536c++;
            this.f2537d = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f2537d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return f0.c.c(entry.getKey(), h.this.b(this.f2536c, 0)) && f0.c.c(entry.getValue(), h.this.b(this.f2536c, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f2537d) {
                return (K) h.this.b(this.f2536c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f2537d) {
                return (V) h.this.b(this.f2536c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2536c < this.f2535b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f2537d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = h.this.b(this.f2536c, 0);
            Object objB2 = h.this.b(this.f2536c, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2537d) {
                throw new IllegalStateException();
            }
            h.this.h(this.f2536c);
            this.f2536c--;
            this.f2535b--;
            this.f2537d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (this.f2537d) {
                return (V) h.this.i(this.f2536c, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return h.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = h.this.f(obj);
            if (iF < 0) {
                return false;
            }
            h.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iD = h.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < iD) {
                if (collection.contains(h.this.b(i2, 1))) {
                    h.this.h(i2);
                    i2--;
                    iD--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iD = h.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < iD) {
                if (!collection.contains(h.this.b(i2, 1))) {
                    h.this.h(i2);
                    i2--;
                    iD--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return h.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.r(tArr, 1);
        }
    }

    h() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i2, int i3);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k2, V v2);

    protected abstract void h(int i2);

    protected abstract V i(int i2, V v2);

    public Set<Map.Entry<K, V>> l() {
        if (this.f2525a == null) {
            this.f2525a = new b();
        }
        return this.f2525a;
    }

    public Set<K> m() {
        if (this.f2526b == null) {
            this.f2526b = new c();
        }
        return this.f2526b;
    }

    public Collection<V> n() {
        if (this.f2527c == null) {
            this.f2527c = new e();
        }
        return this.f2527c;
    }

    public Object[] q(int i2) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i3 = 0; i3 < iD; i3++) {
            objArr[i3] = b(i3, i2);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i2) {
        int iD = d();
        if (tArr.length < iD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iD));
        }
        for (int i3 = 0; i3 < iD; i3++) {
            tArr[i3] = b(i3, i2);
        }
        if (tArr.length > iD) {
            tArr[iD] = null;
        }
        return tArr;
    }
}
