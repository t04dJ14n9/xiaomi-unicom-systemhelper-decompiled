package android.support.v4.app;

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f391c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.arch.lifecycle.e f392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LoaderViewModel f393b;

    static class LoaderViewModel extends android.arch.lifecycle.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final android.arch.lifecycle.m.a f394c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f0.l<a> f395a = new f0.l<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f396b = false;

        static class a implements android.arch.lifecycle.m.a {
            a() {
            }

            @Override // android.arch.lifecycle.m.a
            public <T extends android.arch.lifecycle.l> T a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        static LoaderViewModel c(android.arch.lifecycle.n nVar) {
            return (LoaderViewModel) new android.arch.lifecycle.m(nVar, f394c).a(LoaderViewModel.class);
        }

        @Override // android.arch.lifecycle.l
        protected void a() {
            super.a();
            int iK = this.f395a.k();
            for (int i2 = 0; i2 < iK; i2++) {
                this.f395a.l(i2).o(true);
            }
            this.f395a.b();
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f395a.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f395a.k(); i2++) {
                    a aVarL = this.f395a.l(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f395a.h(i2));
                    printWriter.print(": ");
                    printWriter.println(aVarL.toString());
                    aVarL.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void d() {
            int iK = this.f395a.k();
            for (int i2 = 0; i2 < iK; i2++) {
                this.f395a.l(i2).q();
            }
        }
    }

    public static class a<D> extends android.arch.lifecycle.i<D> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f397k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Bundle f398l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private android.arch.lifecycle.e f399m;

        @Override // android.arch.lifecycle.LiveData
        protected void k() {
            if (LoaderManagerImpl.f391c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // android.arch.lifecycle.LiveData
        protected void l() {
            if (LoaderManagerImpl.f391c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        public void m(android.arch.lifecycle.j<? super D> jVar) {
            super.m(jVar);
            this.f399m = null;
        }

        @Override // android.arch.lifecycle.i, android.arch.lifecycle.LiveData
        public void n(D d2) {
            super.n(d2);
        }

        y.b<D> o(boolean z2) {
            if (LoaderManagerImpl.f391c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f397k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f398l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void q() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f397k);
            sb.append(" : ");
            f0.d.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    LoaderManagerImpl(android.arch.lifecycle.e eVar, android.arch.lifecycle.n nVar) {
        this.f392a = eVar;
        this.f393b = LoaderViewModel.c(nVar);
    }

    @Override // android.support.v4.app.s
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f393b.b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.support.v4.app.s
    public void c() {
        this.f393b.d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        f0.d.a(this.f392a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
