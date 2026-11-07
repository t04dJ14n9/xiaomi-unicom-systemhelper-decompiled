package f0;

/* JADX INFO: loaded from: classes.dex */
public class l<E> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f2547f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f2549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f2550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2551e;

    public l() {
        this(10);
    }

    public l(int i2) {
        this.f2548b = false;
        if (i2 == 0) {
            this.f2549c = c.f2507a;
            this.f2550d = c.f2509c;
        } else {
            int iE = c.e(i2);
            this.f2549c = new int[iE];
            this.f2550d = new Object[iE];
        }
        this.f2551e = 0;
    }

    private void e() {
        int i2 = this.f2551e;
        int[] iArr = this.f2549c;
        Object[] objArr = this.f2550d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2547f) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2548b = false;
        this.f2551e = i3;
    }

    public void a(int i2, E e2) {
        int i3 = this.f2551e;
        if (i3 != 0 && i2 <= this.f2549c[i3 - 1]) {
            i(i2, e2);
            return;
        }
        if (this.f2548b && i3 >= this.f2549c.length) {
            e();
        }
        int i4 = this.f2551e;
        if (i4 >= this.f2549c.length) {
            int iE = c.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f2549c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2550d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2549c = iArr;
            this.f2550d = objArr;
        }
        this.f2549c[i4] = i2;
        this.f2550d[i4] = e2;
        this.f2551e = i4 + 1;
    }

    public void b() {
        int i2 = this.f2551e;
        Object[] objArr = this.f2550d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2551e = 0;
        this.f2548b = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l<E> clone() {
        try {
            l<E> lVar = (l) super.clone();
            lVar.f2549c = (int[]) this.f2549c.clone();
            lVar.f2550d = (Object[]) this.f2550d.clone();
            return lVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public void d(int i2) {
        int iA = c.a(this.f2549c, this.f2551e, i2);
        if (iA >= 0) {
            Object[] objArr = this.f2550d;
            Object obj = objArr[iA];
            Object obj2 = f2547f;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f2548b = true;
            }
        }
    }

    public E f(int i2) {
        return g(i2, null);
    }

    public E g(int i2, E e2) {
        E e3;
        int iA = c.a(this.f2549c, this.f2551e, i2);
        return (iA < 0 || (e3 = (E) this.f2550d[iA]) == f2547f) ? e2 : e3;
    }

    public int h(int i2) {
        if (this.f2548b) {
            e();
        }
        return this.f2549c[i2];
    }

    public void i(int i2, E e2) {
        int iA = c.a(this.f2549c, this.f2551e, i2);
        if (iA >= 0) {
            this.f2550d[iA] = e2;
            return;
        }
        int i3 = ~iA;
        int i4 = this.f2551e;
        if (i3 < i4) {
            Object[] objArr = this.f2550d;
            if (objArr[i3] == f2547f) {
                this.f2549c[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f2548b && i4 >= this.f2549c.length) {
            e();
            i3 = ~c.a(this.f2549c, this.f2551e, i2);
        }
        int i5 = this.f2551e;
        if (i5 >= this.f2549c.length) {
            int iE = c.e(i5 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f2549c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2550d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2549c = iArr;
            this.f2550d = objArr2;
        }
        int i6 = this.f2551e;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f2549c;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f2550d;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f2551e - i3);
        }
        this.f2549c[i3] = i2;
        this.f2550d[i3] = e2;
        this.f2551e++;
    }

    public void j(int i2) {
        d(i2);
    }

    public int k() {
        if (this.f2548b) {
            e();
        }
        return this.f2551e;
    }

    public E l(int i2) {
        if (this.f2548b) {
            e();
        }
        return (E) this.f2550d[i2];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2551e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2551e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            E eL = l(i2);
            if (eL != this) {
                sb.append(eL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
