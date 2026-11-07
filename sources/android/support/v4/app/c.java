package android.support.v4.app;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class c extends o implements k.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k f400a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f408i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f411l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    CharSequence f416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList<String> f417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<String> f418s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    ArrayList<Runnable> f420u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<a> f401b = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f409j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f412m = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f419t = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f426f;

        a() {
        }

        a(int i2, e eVar) {
            this.f421a = i2;
            this.f422b = eVar;
        }
    }

    public c(k kVar) {
        this.f400a = kVar;
    }

    private static boolean l(a aVar) {
        e eVar = aVar.f422b;
        return (eVar == null || !eVar.f449l || eVar.J == null || eVar.C || eVar.B || !eVar.I()) ? false : true;
    }

    @Override // android.support.v4.app.k.l
    public boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        if (k.F) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f408i) {
            return true;
        }
        this.f400a.f(this);
        return true;
    }

    void b(a aVar) {
        this.f401b.add(aVar);
        aVar.f423c = this.f402c;
        aVar.f424d = this.f403d;
        aVar.f425e = this.f404e;
        aVar.f426f = this.f405f;
    }

    void c(int i2) {
        if (this.f408i) {
            if (k.F) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f401b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f401b.get(i3);
                e eVar = aVar.f422b;
                if (eVar != null) {
                    eVar.f455r += i2;
                    if (k.F) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f422b + " to " + aVar.f422b.f455r);
                    }
                }
            }
        }
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        e(str, printWriter, true);
    }

    public void e(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f410k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f412m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f411l);
            if (this.f406g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f406g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f407h));
            }
            if (this.f402c != 0 || this.f403d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f402c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f403d));
            }
            if (this.f404e != 0 || this.f405f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f404e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f405f));
            }
            if (this.f413n != 0 || this.f414o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f413n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f414o);
            }
            if (this.f415p != 0 || this.f416q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f415p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f416q);
            }
        }
        if (this.f401b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f401b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f401b.get(i2);
            switch (aVar.f421a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                default:
                    str2 = "cmd=" + aVar.f421a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f422b);
            if (z2) {
                if (aVar.f423c != 0 || aVar.f424d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f423c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f424d));
                }
                if (aVar.f425e != 0 || aVar.f426f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f425e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f426f));
                }
            }
        }
    }

    void f() {
        int size = this.f401b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f401b.get(i2);
            e eVar = aVar.f422b;
            if (eVar != null) {
                eVar.X0(this.f406g, this.f407h);
            }
            switch (aVar.f421a) {
                case 1:
                    eVar.W0(aVar.f423c);
                    this.f400a.g(eVar, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f421a);
                case 3:
                    eVar.W0(aVar.f424d);
                    this.f400a.J0(eVar);
                    break;
                case 4:
                    eVar.W0(aVar.f424d);
                    this.f400a.p0(eVar);
                    break;
                case 5:
                    eVar.W0(aVar.f423c);
                    this.f400a.Z0(eVar);
                    break;
                case 6:
                    eVar.W0(aVar.f424d);
                    this.f400a.p(eVar);
                    break;
                case 7:
                    eVar.W0(aVar.f423c);
                    this.f400a.j(eVar);
                    break;
                case 8:
                    this.f400a.W0(eVar);
                    break;
                case 9:
                    this.f400a.W0(null);
                    break;
            }
            if (!this.f419t && aVar.f421a != 1 && eVar != null) {
                this.f400a.z0(eVar);
            }
        }
        if (this.f419t) {
            return;
        }
        k kVar = this.f400a;
        kVar.A0(kVar.f517m, true);
    }

    void g(boolean z2) {
        for (int size = this.f401b.size() - 1; size >= 0; size--) {
            a aVar = this.f401b.get(size);
            e eVar = aVar.f422b;
            if (eVar != null) {
                eVar.X0(k.O0(this.f406g), this.f407h);
            }
            switch (aVar.f421a) {
                case 1:
                    eVar.W0(aVar.f426f);
                    this.f400a.J0(eVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f421a);
                case 3:
                    eVar.W0(aVar.f425e);
                    this.f400a.g(eVar, false);
                    break;
                case 4:
                    eVar.W0(aVar.f425e);
                    this.f400a.Z0(eVar);
                    break;
                case 5:
                    eVar.W0(aVar.f426f);
                    this.f400a.p0(eVar);
                    break;
                case 6:
                    eVar.W0(aVar.f425e);
                    this.f400a.j(eVar);
                    break;
                case 7:
                    eVar.W0(aVar.f426f);
                    this.f400a.p(eVar);
                    break;
                case 8:
                    this.f400a.W0(null);
                    break;
                case 9:
                    this.f400a.W0(eVar);
                    break;
            }
            if (!this.f419t && aVar.f421a != 3 && eVar != null) {
                this.f400a.z0(eVar);
            }
        }
        if (this.f419t || !z2) {
            return;
        }
        k kVar = this.f400a;
        kVar.A0(kVar.f517m, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    e h(ArrayList<e> arrayList, e eVar) {
        e eVar2 = eVar;
        int i2 = 0;
        while (i2 < this.f401b.size()) {
            a aVar = this.f401b.get(i2);
            int i3 = aVar.f421a;
            if (i3 == 1) {
                arrayList.add(aVar.f422b);
            } else if (i3 == 2) {
                e eVar3 = aVar.f422b;
                int i4 = eVar3.f463z;
                boolean z2 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e eVar4 = arrayList.get(size);
                    if (eVar4.f463z == i4) {
                        if (eVar4 == eVar3) {
                            z2 = true;
                        } else {
                            if (eVar4 == eVar2) {
                                this.f401b.add(i2, new a(9, eVar4));
                                i2++;
                                eVar2 = null;
                            }
                            a aVar2 = new a(3, eVar4);
                            aVar2.f423c = aVar.f423c;
                            aVar2.f425e = aVar.f425e;
                            aVar2.f424d = aVar.f424d;
                            aVar2.f426f = aVar.f426f;
                            this.f401b.add(i2, aVar2);
                            arrayList.remove(eVar4);
                            i2++;
                        }
                    }
                }
                if (z2) {
                    this.f401b.remove(i2);
                    i2--;
                } else {
                    aVar.f421a = 1;
                    arrayList.add(eVar3);
                }
            } else if (i3 == 3 || i3 == 6) {
                arrayList.remove(aVar.f422b);
                e eVar5 = aVar.f422b;
                if (eVar5 == eVar2) {
                    this.f401b.add(i2, new a(9, eVar5));
                    i2++;
                    eVar2 = null;
                }
            } else if (i3 == 7) {
                arrayList.add(aVar.f422b);
            } else if (i3 == 8) {
                this.f401b.add(i2, new a(9, eVar2));
                i2++;
                eVar2 = aVar.f422b;
            }
            i2++;
        }
        return eVar2;
    }

    public String i() {
        return this.f410k;
    }

    boolean j(int i2) {
        int size = this.f401b.size();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = this.f401b.get(i3).f422b;
            int i4 = eVar != null ? eVar.f463z : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    boolean k(ArrayList<c> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f401b.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f401b.get(i5).f422b;
            int i6 = eVar != null ? eVar.f463z : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    c cVar = arrayList.get(i7);
                    int size2 = cVar.f401b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        e eVar2 = cVar.f401b.get(i8).f422b;
                        if ((eVar2 != null ? eVar2.f463z : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    boolean m() {
        for (int i2 = 0; i2 < this.f401b.size(); i2++) {
            if (l(this.f401b.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void n() {
        ArrayList<Runnable> arrayList = this.f420u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f420u.get(i2).run();
            }
            this.f420u = null;
        }
    }

    void o(e.f fVar) {
        for (int i2 = 0; i2 < this.f401b.size(); i2++) {
            a aVar = this.f401b.get(i2);
            if (l(aVar)) {
                aVar.f422b.Y0(fVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    e p(ArrayList<e> arrayList, e eVar) {
        for (int i2 = 0; i2 < this.f401b.size(); i2++) {
            a aVar = this.f401b.get(i2);
            int i3 = aVar.f421a;
            if (i3 == 1) {
                arrayList.remove(aVar.f422b);
            } else if (i3 != 3) {
                switch (i3) {
                    case 6:
                        arrayList.add(aVar.f422b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f422b);
                        break;
                    case 8:
                        eVar = null;
                        break;
                    case 9:
                        eVar = aVar.f422b;
                        break;
                }
            } else {
                arrayList.add(aVar.f422b);
            }
        }
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f412m >= 0) {
            sb.append(" #");
            sb.append(this.f412m);
        }
        if (this.f410k != null) {
            sb.append(" ");
            sb.append(this.f410k);
        }
        sb.append("}");
        return sb.toString();
    }
}
