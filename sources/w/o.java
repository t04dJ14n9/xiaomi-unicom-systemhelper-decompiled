package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f3994g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3996b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3998d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<v.e> f3995a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f3997c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<a> f3999e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4000f = -1;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<v.e> f4001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4007g;

        public a(v.e eVar, u.d dVar, int i2) {
            this.f4001a = new WeakReference<>(eVar);
            this.f4002b = dVar.x(eVar.H);
            this.f4003c = dVar.x(eVar.I);
            this.f4004d = dVar.x(eVar.J);
            this.f4005e = dVar.x(eVar.K);
            this.f4006f = dVar.x(eVar.L);
            this.f4007g = i2;
        }
    }

    public o(int i2) {
        int i3 = f3994g;
        f3994g = i3 + 1;
        this.f3996b = i3;
        this.f3998d = i2;
    }

    private String e() {
        int i2 = this.f3998d;
        if (i2 == 0) {
            return "Horizontal";
        }
        if (i2 == 1) {
            return "Vertical";
        }
        return i2 == 2 ? "Both" : "Unknown";
    }

    private int j(u.d dVar, ArrayList<v.e> arrayList, int i2) {
        int iX;
        v.d dVar2;
        v.f fVar = (v.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).g(dVar, false);
        }
        if (i2 == 0 && fVar.N0 > 0) {
            v.b.b(fVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && fVar.O0 > 0) {
            v.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f3999e = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f3999e.add(new a(arrayList.get(i4), dVar, i2));
        }
        if (i2 == 0) {
            iX = dVar.x(fVar.H);
            dVar2 = fVar.J;
        } else {
            iX = dVar.x(fVar.I);
            dVar2 = fVar.K;
        }
        int iX2 = dVar.x(dVar2);
        dVar.D();
        return iX2 - iX;
    }

    public boolean a(v.e eVar) {
        if (this.f3995a.contains(eVar)) {
            return false;
        }
        this.f3995a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f3995a.size();
        if (this.f4000f != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o oVar = arrayList.get(i2);
                if (this.f4000f == oVar.f3996b) {
                    g(this.f3998d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f3996b;
    }

    public int d() {
        return this.f3998d;
    }

    public int f(u.d dVar, int i2) {
        if (this.f3995a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f3995a, i2);
    }

    public void g(int i2, o oVar) {
        for (v.e eVar : this.f3995a) {
            oVar.a(eVar);
            int iC = oVar.c();
            if (i2 == 0) {
                eVar.A0 = iC;
            } else {
                eVar.B0 = iC;
            }
        }
        this.f4000f = oVar.f3996b;
    }

    public void h(boolean z2) {
        this.f3997c = z2;
    }

    public void i(int i2) {
        this.f3998d = i2;
    }

    public String toString() {
        String str = e() + " [" + this.f3996b + "] <";
        Iterator<v.e> it = this.f3995a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
