package f0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f2496f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object[] f2497g = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Object[] f2498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f2499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Object[] f2500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f2501k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f2502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f2503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h<E, E> f2505e;

    class a extends h<E, E> {
        a() {
        }

        @Override // f0.h
        protected void a() {
            b.this.clear();
        }

        @Override // f0.h
        protected Object b(int i2, int i3) {
            return b.this.f2503c[i2];
        }

        @Override // f0.h
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // f0.h
        protected int d() {
            return b.this.f2504d;
        }

        @Override // f0.h
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // f0.h
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // f0.h
        protected void g(E e2, E e3) {
            b.this.add(e2);
        }

        @Override // f0.h
        protected void h(int i2) {
            b.this.g(i2);
        }

        @Override // f0.h
        protected E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f2502b = f2496f;
            this.f2503c = f2497g;
        } else {
            a(i2);
        }
        this.f2504d = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f2500j;
                if (objArr != null) {
                    this.f2503c = objArr;
                    f2500j = (Object[]) objArr[0];
                    this.f2502b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2501k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f2498h;
                if (objArr2 != null) {
                    this.f2503c = objArr2;
                    f2498h = (Object[]) objArr2[0];
                    this.f2502b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2499i--;
                    return;
                }
            }
        }
        this.f2502b = new int[i2];
        this.f2503c = new Object[i2];
    }

    private static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f2501k < 10) {
                    objArr[0] = f2500j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2500j = objArr;
                    f2501k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f2499i < 10) {
                    objArr[0] = f2498h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2498h = objArr;
                    f2499i++;
                }
            }
        }
    }

    private h<E, E> d() {
        if (this.f2505e == null) {
            this.f2505e = new a();
        }
        return this.f2505e;
    }

    private int e(Object obj, int i2) {
        int i3 = this.f2504d;
        if (i3 == 0) {
            return -1;
        }
        int iA = c.a(this.f2502b, i3, i2);
        if (iA < 0 || obj.equals(this.f2503c[iA])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f2502b[i4] == i2) {
            if (obj.equals(this.f2503c[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f2502b[i5] == i2; i5--) {
            if (obj.equals(this.f2503c[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private int f() {
        int i2 = this.f2504d;
        if (i2 == 0) {
            return -1;
        }
        int iA = c.a(this.f2502b, i2, 0);
        if (iA < 0 || this.f2503c[iA] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f2502b[i3] == 0) {
            if (this.f2503c[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f2502b[i4] == 0; i4--) {
            if (this.f2503c[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int iE;
        if (e2 == null) {
            iE = f();
            i2 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i2 = iHashCode;
            iE = e(e2, iHashCode);
        }
        if (iE >= 0) {
            return false;
        }
        int i3 = ~iE;
        int i4 = this.f2504d;
        int[] iArr = this.f2502b;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f2503c;
            a(i5);
            int[] iArr2 = this.f2502b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2503c, 0, objArr.length);
            }
            c(iArr, objArr, this.f2504d);
        }
        int i6 = this.f2504d;
        if (i3 < i6) {
            int[] iArr3 = this.f2502b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f2503c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f2504d - i3);
        }
        this.f2502b[i3] = i2;
        this.f2503c[i3] = e2;
        this.f2504d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.f2504d + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void b(int i2) {
        int[] iArr = this.f2502b;
        if (iArr.length < i2) {
            Object[] objArr = this.f2503c;
            a(i2);
            int i3 = this.f2504d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f2502b, 0, i3);
                System.arraycopy(objArr, 0, this.f2503c, 0, this.f2504d);
            }
            c(iArr, objArr, this.f2504d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f2504d;
        if (i2 != 0) {
            c(this.f2502b, this.f2503c, i2);
            this.f2502b = f2496f;
            this.f2503c = f2497g;
            this.f2504d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2504d; i2++) {
                try {
                    if (!set.contains(h(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E g(int i2) {
        Object[] objArr = this.f2503c;
        E e2 = (E) objArr[i2];
        int i3 = this.f2504d;
        if (i3 <= 1) {
            c(this.f2502b, objArr, i3);
            this.f2502b = f2496f;
            this.f2503c = f2497g;
            this.f2504d = 0;
        } else {
            int[] iArr = this.f2502b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f2504d = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f2503c;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f2504d - i2);
                }
                this.f2503c[this.f2504d] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f2504d--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2502b, 0, i2);
                    System.arraycopy(objArr, 0, this.f2503c, 0, i2);
                }
                int i6 = this.f2504d;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f2502b, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f2503c, i2, this.f2504d - i2);
                }
            }
        }
        return e2;
    }

    public E h(int i2) {
        return (E) this.f2503c[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2502b;
        int i2 = this.f2504d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2504d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z2 = false;
        for (int i2 = this.f2504d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2503c[i2])) {
                g(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2504d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f2504d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f2503c, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2504d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2504d));
        }
        System.arraycopy(this.f2503c, 0, tArr, 0, this.f2504d);
        int length = tArr.length;
        int i2 = this.f2504d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2504d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2504d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eH = h(i2);
            if (eH != this) {
                sb.append(eH);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
