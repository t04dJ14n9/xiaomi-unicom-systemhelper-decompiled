package f0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static Object[] f2540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static int f2541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static Object[] f2542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static int f2543h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f2544b = c.f2507a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f2545c = c.f2509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2546d = 0;

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (a.class) {
                Object[] objArr = f2542g;
                if (objArr != null) {
                    this.f2545c = objArr;
                    f2542g = (Object[]) objArr[0];
                    this.f2544b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2543h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (a.class) {
                Object[] objArr2 = f2540e;
                if (objArr2 != null) {
                    this.f2545c = objArr2;
                    f2540e = (Object[]) objArr2[0];
                    this.f2544b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2541f--;
                    return;
                }
            }
        }
        this.f2544b = new int[i2];
        this.f2545c = new Object[i2 << 1];
    }

    private static int b(int[] iArr, int i2, int i3) {
        try {
            return c.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                if (f2543h < 10) {
                    objArr[0] = f2542g;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2542g = objArr;
                    f2543h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (a.class) {
                if (f2541f < 10) {
                    objArr[0] = f2540e;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2540e = objArr;
                    f2541f++;
                }
            }
        }
    }

    public void c(int i2) {
        int i3 = this.f2546d;
        int[] iArr = this.f2544b;
        if (iArr.length < i2) {
            Object[] objArr = this.f2545c;
            a(i2);
            if (this.f2546d > 0) {
                System.arraycopy(iArr, 0, this.f2544b, 0, i3);
                System.arraycopy(objArr, 0, this.f2545c, 0, i3 << 1);
            }
            d(iArr, objArr, i3);
        }
        if (this.f2546d != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f2546d;
        if (i2 > 0) {
            int[] iArr = this.f2544b;
            Object[] objArr = this.f2545c;
            this.f2544b = c.f2507a;
            this.f2545c = c.f2509c;
            this.f2546d = 0;
            d(iArr, objArr, i2);
        }
        if (this.f2546d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i2) {
        int i3 = this.f2546d;
        if (i3 == 0) {
            return -1;
        }
        int iB = b(this.f2544b, i3, i2);
        if (iB < 0 || obj.equals(this.f2545c[iB << 1])) {
            return iB;
        }
        int i4 = iB + 1;
        while (i4 < i3 && this.f2544b[i4] == i2) {
            if (obj.equals(this.f2545c[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iB - 1; i5 >= 0 && this.f2544b[i5] == i2; i5--) {
            if (obj.equals(this.f2545c[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (size() != kVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2546d; i2++) {
                try {
                    K kI = i(i2);
                    V vL = l(i2);
                    Object obj2 = kVar.get(kI);
                    if (vL == null) {
                        if (obj2 != null || !kVar.containsKey(kI)) {
                            return false;
                        }
                    } else if (!vL.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f2546d; i3++) {
                try {
                    K kI2 = i(i3);
                    V vL2 = l(i3);
                    Object obj3 = map.get(kI2);
                    if (vL2 == null) {
                        if (obj3 != null || !map.containsKey(kI2)) {
                            return false;
                        }
                    } else if (!vL2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i2 = this.f2546d;
        if (i2 == 0) {
            return -1;
        }
        int iB = b(this.f2544b, i2, 0);
        if (iB < 0 || this.f2545c[iB << 1] == null) {
            return iB;
        }
        int i3 = iB + 1;
        while (i3 < i2 && this.f2544b[i3] == 0) {
            if (this.f2545c[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iB - 1; i4 >= 0 && this.f2544b[i4] == 0; i4--) {
            if (this.f2545c[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public V get(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return (V) this.f2545c[(iF << 1) + 1];
        }
        return null;
    }

    int h(Object obj) {
        int i2 = this.f2546d * 2;
        Object[] objArr = this.f2545c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f2544b;
        Object[] objArr = this.f2545c;
        int i2 = this.f2546d;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public K i(int i2) {
        return (K) this.f2545c[i2 << 1];
    }

    public boolean isEmpty() {
        return this.f2546d <= 0;
    }

    public V j(int i2) {
        Object[] objArr = this.f2545c;
        int i3 = i2 << 1;
        V v2 = (V) objArr[i3 + 1];
        int i4 = this.f2546d;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.f2544b, objArr, i4);
            this.f2544b = c.f2507a;
            this.f2545c = c.f2509c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f2544b;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f2545c;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f2545c;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f2546d) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2544b, 0, i2);
                    System.arraycopy(objArr, 0, this.f2545c, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f2544b, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f2545c, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f2546d) {
            throw new ConcurrentModificationException();
        }
        this.f2546d = i5;
        return v2;
    }

    public V k(int i2, V v2) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2545c;
        V v3 = (V) objArr[i3];
        objArr[i3] = v2;
        return v3;
    }

    public V l(int i2) {
        return (V) this.f2545c[(i2 << 1) + 1];
    }

    public V put(K k2, V v2) {
        int i2;
        int iE;
        int i3 = this.f2546d;
        if (k2 == null) {
            iE = g();
            i2 = 0;
        } else {
            int iHashCode = k2.hashCode();
            i2 = iHashCode;
            iE = e(k2, iHashCode);
        }
        if (iE >= 0) {
            int i4 = (iE << 1) + 1;
            Object[] objArr = this.f2545c;
            V v3 = (V) objArr[i4];
            objArr[i4] = v2;
            return v3;
        }
        int i5 = ~iE;
        int[] iArr = this.f2544b;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f2545c;
            a(i6);
            if (i3 != this.f2546d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f2544b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f2545c, 0, objArr2.length);
            }
            d(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2544b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2545c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f2546d - i5) << 1);
        }
        int i8 = this.f2546d;
        if (i3 == i8) {
            int[] iArr4 = this.f2544b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f2545c;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v2;
                this.f2546d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return j(iF);
        }
        return null;
    }

    public int size() {
        return this.f2546d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2546d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2546d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kI = i(i2);
            if (kI != this) {
                sb.append(kI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vL = l(i2);
            if (vL != this) {
                sb.append(vL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
