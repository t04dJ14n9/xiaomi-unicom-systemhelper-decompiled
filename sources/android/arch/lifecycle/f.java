package android.arch.lifecycle;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<e> f110c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q.a<d, b> f108a = new q.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f112e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f113f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<c.b> f114g = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.b f109b = c.b.INITIALIZED;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f116b;

        static {
            int[] iArr = new int[c.b.values().length];
            f116b = iArr;
            try {
                iArr[c.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116b[c.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116b[c.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116b[c.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116b[c.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.a.values().length];
            f115a = iArr2;
            try {
                iArr2[c.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115a[c.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f115a[c.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f115a[c.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f115a[c.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f115a[c.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f115a[c.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c.b f117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        GenericLifecycleObserver f118b;

        void a(e eVar, c.a aVar) {
            c.b bVarF = f.f(aVar);
            this.f117a = f.j(this.f117a, bVarF);
            this.f118b.g(eVar, aVar);
            this.f117a = bVarF;
        }
    }

    public f(e eVar) {
        this.f110c = new WeakReference<>(eVar);
    }

    private void c(e eVar) {
        Iterator<Map.Entry<d, b>> itDescendingIterator = this.f108a.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f113f) {
            Map.Entry<d, b> next = itDescendingIterator.next();
            b value = next.getValue();
            while (value.f117a.compareTo(this.f109b) > 0 && !this.f113f && this.f108a.contains(next.getKey())) {
                c.a aVarD = d(value.f117a);
                m(f(aVarD));
                value.a(eVar, aVarD);
                l();
            }
        }
    }

    private static c.a d(c.b bVar) {
        int i2 = a.f116b[bVar.ordinal()];
        if (i2 == 1) {
            throw new IllegalArgumentException();
        }
        if (i2 == 2) {
            return c.a.ON_DESTROY;
        }
        if (i2 == 3) {
            return c.a.ON_STOP;
        }
        if (i2 == 4) {
            return c.a.ON_PAUSE;
        }
        if (i2 == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    private void e(e eVar) {
        q.b<d, b>.e eVarD = this.f108a.d();
        while (eVarD.hasNext() && !this.f113f) {
            Map.Entry next = eVarD.next();
            b bVar = (b) next.getValue();
            while (bVar.f117a.compareTo(this.f109b) < 0 && !this.f113f && this.f108a.contains((d) next.getKey())) {
                m(bVar.f117a);
                bVar.a(eVar, o(bVar.f117a));
                l();
            }
        }
    }

    static c.b f(c.a aVar) {
        switch (a.f115a[aVar.ordinal()]) {
            case 1:
            case 2:
                return c.b.CREATED;
            case 3:
            case 4:
                return c.b.STARTED;
            case 5:
                return c.b.RESUMED;
            case 6:
                return c.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean h() {
        if (this.f108a.size() == 0) {
            return true;
        }
        c.b bVar = this.f108a.b().getValue().f117a;
        c.b bVar2 = this.f108a.e().getValue().f117a;
        return bVar == bVar2 && this.f109b == bVar2;
    }

    static c.b j(c.b bVar, c.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void k(c.b bVar) {
        if (this.f109b == bVar) {
            return;
        }
        this.f109b = bVar;
        if (this.f112e || this.f111d != 0) {
            this.f113f = true;
            return;
        }
        this.f112e = true;
        n();
        this.f112e = false;
    }

    private void l() {
        ArrayList<c.b> arrayList = this.f114g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void m(c.b bVar) {
        this.f114g.add(bVar);
    }

    private void n() {
        e eVar = this.f110c.get();
        if (eVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            boolean zH = h();
            this.f113f = false;
            if (zH) {
                return;
            }
            if (this.f109b.compareTo(this.f108a.b().getValue().f117a) < 0) {
                c(eVar);
            }
            Map.Entry<d, b> entryE = this.f108a.e();
            if (!this.f113f && entryE != null && this.f109b.compareTo(entryE.getValue().f117a) > 0) {
                e(eVar);
            }
        }
    }

    private static c.a o(c.b bVar) {
        int i2 = a.f116b[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return c.a.ON_START;
            }
            if (i2 == 3) {
                return c.a.ON_RESUME;
            }
            if (i2 == 4) {
                throw new IllegalArgumentException();
            }
            if (i2 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return c.a.ON_CREATE;
    }

    @Override // android.arch.lifecycle.c
    public c.b a() {
        return this.f109b;
    }

    @Override // android.arch.lifecycle.c
    public void b(d dVar) {
        this.f108a.f(dVar);
    }

    public void g(c.a aVar) {
        k(f(aVar));
    }

    public void i(c.b bVar) {
        k(bVar);
    }
}
