package m0;

import android.view.View;
import android.view.animation.Interpolator;
import g0.q;
import g0.r;
import g0.s;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f3333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    r f3334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3335e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3332b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f3336f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<q> f3331a = new ArrayList<>();

    class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3337a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3338b = 0;

        a() {
        }

        @Override // g0.r
        public void a(View view) {
            int i2 = this.f3338b + 1;
            this.f3338b = i2;
            if (i2 == h.this.f3331a.size()) {
                r rVar = h.this.f3334d;
                if (rVar != null) {
                    rVar.a(null);
                }
                d();
            }
        }

        @Override // g0.s, g0.r
        public void b(View view) {
            if (this.f3337a) {
                return;
            }
            this.f3337a = true;
            r rVar = h.this.f3334d;
            if (rVar != null) {
                rVar.b(null);
            }
        }

        void d() {
            this.f3338b = 0;
            this.f3337a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f3335e) {
            Iterator<q> it = this.f3331a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f3335e = false;
        }
    }

    void b() {
        this.f3335e = false;
    }

    public h c(q qVar) {
        if (!this.f3335e) {
            this.f3331a.add(qVar);
        }
        return this;
    }

    public h d(q qVar, q qVar2) {
        this.f3331a.add(qVar);
        qVar2.h(qVar.c());
        this.f3331a.add(qVar2);
        return this;
    }

    public h e(long j2) {
        if (!this.f3335e) {
            this.f3332b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f3335e) {
            this.f3333c = interpolator;
        }
        return this;
    }

    public h g(r rVar) {
        if (!this.f3335e) {
            this.f3334d = rVar;
        }
        return this;
    }

    public void h() {
        if (this.f3335e) {
            return;
        }
        for (q qVar : this.f3331a) {
            long j2 = this.f3332b;
            if (j2 >= 0) {
                qVar.d(j2);
            }
            Interpolator interpolator = this.f3333c;
            if (interpolator != null) {
                qVar.e(interpolator);
            }
            if (this.f3334d != null) {
                qVar.f(this.f3336f);
            }
            qVar.j();
        }
        this.f3335e = true;
    }
}
