package f0;

/* JADX INFO: loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f2512f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f2514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f2515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2516e;

    public f() {
        this(10);
    }

    public f(int i2) {
        this.f2513b = false;
        if (i2 == 0) {
            this.f2514c = c.f2508b;
            this.f2515d = c.f2509c;
        } else {
            int iF = c.f(i2);
            this.f2514c = new long[iF];
            this.f2515d = new Object[iF];
        }
        this.f2516e = 0;
    }

    private void d() {
        int i2 = this.f2516e;
        long[] jArr = this.f2514c;
        Object[] objArr = this.f2515d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2512f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2513b = false;
        this.f2516e = i3;
    }

    public void a() {
        int i2 = this.f2516e;
        Object[] objArr = this.f2515d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2516e = 0;
        this.f2513b = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f2514c = (long[]) this.f2514c.clone();
            fVar.f2515d = (Object[]) this.f2515d.clone();
            return fVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public void c(long j2) {
        int iB = c.b(this.f2514c, this.f2516e, j2);
        if (iB >= 0) {
            Object[] objArr = this.f2515d;
            Object obj = objArr[iB];
            Object obj2 = f2512f;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f2513b = true;
            }
        }
    }

    public E e(long j2) {
        return f(j2, null);
    }

    public E f(long j2, E e2) {
        E e3;
        int iB = c.b(this.f2514c, this.f2516e, j2);
        return (iB < 0 || (e3 = (E) this.f2515d[iB]) == f2512f) ? e2 : e3;
    }

    public long g(int i2) {
        if (this.f2513b) {
            d();
        }
        return this.f2514c[i2];
    }

    public void h(long j2, E e2) {
        int iB = c.b(this.f2514c, this.f2516e, j2);
        if (iB >= 0) {
            this.f2515d[iB] = e2;
            return;
        }
        int i2 = ~iB;
        int i3 = this.f2516e;
        if (i2 < i3) {
            Object[] objArr = this.f2515d;
            if (objArr[i2] == f2512f) {
                this.f2514c[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f2513b && i3 >= this.f2514c.length) {
            d();
            i2 = ~c.b(this.f2514c, this.f2516e, j2);
        }
        int i4 = this.f2516e;
        if (i4 >= this.f2514c.length) {
            int iF = c.f(i4 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f2514c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2515d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2514c = jArr;
            this.f2515d = objArr2;
        }
        int i5 = this.f2516e;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f2514c;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2515d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2516e - i2);
        }
        this.f2514c[i2] = j2;
        this.f2515d[i2] = e2;
        this.f2516e++;
    }

    public int i() {
        if (this.f2513b) {
            d();
        }
        return this.f2516e;
    }

    public E j(int i2) {
        if (this.f2513b) {
            d();
        }
        return (E) this.f2515d[i2];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2516e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2516e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(g(i2));
            sb.append('=');
            E eJ = j(i2);
            if (eJ != this) {
                sb.append(eJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
