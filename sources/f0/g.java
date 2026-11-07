package f0;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f2517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2524h;

    public g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2519c = i2;
        this.f2517a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int e(K k2, V v2) {
        int iF = f(k2, v2);
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v2);
    }

    protected V a(K k2) {
        return null;
    }

    protected void b(boolean z2, K k2, V v2, V v3) {
    }

    public final V c(K k2) {
        V vPut;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.f2517a.get(k2);
            if (v2 != null) {
                this.f2523g++;
                return v2;
            }
            this.f2524h++;
            V vA = a(k2);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                this.f2521e++;
                vPut = this.f2517a.put(k2, vA);
                if (vPut != null) {
                    this.f2517a.put(k2, vPut);
                } else {
                    this.f2518b += e(k2, vA);
                }
            }
            if (vPut != null) {
                b(false, k2, vA, vPut);
                return vPut;
            }
            g(this.f2519c);
            return vA;
        }
    }

    public final V d(K k2, V v2) {
        V vPut;
        if (k2 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2520d++;
            this.f2518b += e(k2, v2);
            vPut = this.f2517a.put(k2, v2);
            if (vPut != null) {
                this.f2518b -= e(k2, vPut);
            }
        }
        if (vPut != null) {
            b(false, k2, vPut, v2);
        }
        g(this.f2519c);
        return vPut;
    }

    protected int f(K k2, V v2) {
        return 1;
    }

    public void g(int i2) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f2518b < 0 || (this.f2517a.isEmpty() && this.f2518b != 0)) {
                    break;
                }
                if (this.f2518b > i2 && !this.f2517a.isEmpty()) {
                    Map.Entry<K, V> next = this.f2517a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f2517a.remove(key);
                    this.f2518b -= e(key, value);
                    this.f2522f++;
                }
                return;
            }
            b(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f2523g;
        i3 = this.f2524h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2519c), Integer.valueOf(this.f2523g), Integer.valueOf(this.f2524h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
