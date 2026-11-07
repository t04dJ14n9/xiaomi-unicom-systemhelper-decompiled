package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.o;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f3840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f3841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f3842f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    u.i f3845i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<d> f3837a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3843g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f3844h = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3846a;

        static {
            int[] iArr = new int[b.values().length];
            f3846a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3846a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3846a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3846a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3846a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3846a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3846a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3846a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3846a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f3840d = eVar;
        this.f3841e = bVar;
    }

    public boolean a(d dVar, int i2, int i3, boolean z2) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z2 && !o(dVar)) {
            return false;
        }
        this.f3842f = dVar;
        if (dVar.f3837a == null) {
            dVar.f3837a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f3842f.f3837a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i2 > 0) {
            this.f3843g = i2;
        } else {
            this.f3843g = 0;
        }
        this.f3844h = i3;
        return true;
    }

    public void b(int i2, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f3837a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                w.i.a(it.next().f3840d, i2, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f3837a;
    }

    public int d() {
        if (this.f3839c) {
            return this.f3838b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f3840d.Q() == 8) {
            return 0;
        }
        return (this.f3844h <= -1 || (dVar = this.f3842f) == null || dVar.f3840d.Q() != 8) ? this.f3843g : this.f3844h;
    }

    public final d f() {
        switch (a.f3846a[this.f3841e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f3840d.J;
            case 3:
                return this.f3840d.H;
            case 4:
                return this.f3840d.K;
            case 5:
                return this.f3840d.I;
            default:
                throw new AssertionError(this.f3841e.name());
        }
    }

    public e g() {
        return this.f3840d;
    }

    public u.i h() {
        return this.f3845i;
    }

    public d i() {
        return this.f3842f;
    }

    public b j() {
        return this.f3841e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f3837a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f3837a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f3839c;
    }

    public boolean n() {
        return this.f3842f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarJ = dVar.j();
        b bVar = this.f3841e;
        if (bVarJ == bVar) {
            return bVar != b.BASELINE || (dVar.g().U() && g().U());
        }
        switch (a.f3846a[bVar.ordinal()]) {
            case 1:
                return (bVarJ == b.BASELINE || bVarJ == b.CENTER_X || bVarJ == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = bVarJ == b.LEFT || bVarJ == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z2 || bVarJ == b.CENTER_X;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = bVarJ == b.TOP || bVarJ == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z3 || bVarJ == b.CENTER_Y;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f3841e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f3842f;
        if (dVar != null && (hashSet = dVar.f3837a) != null) {
            hashSet.remove(this);
            if (this.f3842f.f3837a.size() == 0) {
                this.f3842f.f3837a = null;
            }
        }
        this.f3837a = null;
        this.f3842f = null;
        this.f3843g = 0;
        this.f3844h = -1;
        this.f3839c = false;
        this.f3838b = 0;
    }

    public void q() {
        this.f3839c = false;
        this.f3838b = 0;
    }

    public void r(u.c cVar) {
        u.i iVar = this.f3845i;
        if (iVar == null) {
            this.f3845i = new u.i(u.i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void s(int i2) {
        this.f3838b = i2;
        this.f3839c = true;
    }

    public String toString() {
        return this.f3840d.r() + ":" + this.f3841e.toString();
    }
}
