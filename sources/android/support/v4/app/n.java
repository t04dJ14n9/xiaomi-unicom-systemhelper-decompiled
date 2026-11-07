package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Bundle f576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Bundle f578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    e f579m;

    static class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i2) {
            return new n[i2];
        }
    }

    n(Parcel parcel) {
        this.f568b = parcel.readString();
        this.f569c = parcel.readInt();
        this.f570d = parcel.readInt() != 0;
        this.f571e = parcel.readInt();
        this.f572f = parcel.readInt();
        this.f573g = parcel.readString();
        this.f574h = parcel.readInt() != 0;
        this.f575i = parcel.readInt() != 0;
        this.f576j = parcel.readBundle();
        this.f577k = parcel.readInt() != 0;
        this.f578l = parcel.readBundle();
    }

    n(e eVar) {
        this.f568b = eVar.getClass().getName();
        this.f569c = eVar.f443f;
        this.f570d = eVar.f451n;
        this.f571e = eVar.f462y;
        this.f572f = eVar.f463z;
        this.f573g = eVar.A;
        this.f574h = eVar.D;
        this.f575i = eVar.C;
        this.f576j = eVar.f445h;
        this.f577k = eVar.B;
    }

    public e a(i iVar, g gVar, e eVar, l lVar, android.arch.lifecycle.n nVar) {
        if (this.f579m == null) {
            Context contextE = iVar.e();
            Bundle bundle = this.f576j;
            if (bundle != null) {
                bundle.setClassLoader(contextE.getClassLoader());
            }
            this.f579m = gVar != null ? gVar.a(contextE, this.f568b, this.f576j) : e.E(contextE, this.f568b, this.f576j);
            Bundle bundle2 = this.f578l;
            if (bundle2 != null) {
                bundle2.setClassLoader(contextE.getClassLoader());
                this.f579m.f440c = this.f578l;
            }
            this.f579m.V0(this.f569c, eVar);
            e eVar2 = this.f579m;
            eVar2.f451n = this.f570d;
            eVar2.f453p = true;
            eVar2.f462y = this.f571e;
            eVar2.f463z = this.f572f;
            eVar2.A = this.f573g;
            eVar2.D = this.f574h;
            eVar2.C = this.f575i;
            eVar2.B = this.f577k;
            eVar2.f456s = iVar.f505e;
            if (k.F) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f579m);
            }
        }
        e eVar3 = this.f579m;
        eVar3.f459v = lVar;
        eVar3.f460w = nVar;
        return eVar3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f568b);
        parcel.writeInt(this.f569c);
        parcel.writeInt(this.f570d ? 1 : 0);
        parcel.writeInt(this.f571e);
        parcel.writeInt(this.f572f);
        parcel.writeString(this.f573g);
        parcel.writeInt(this.f574h ? 1 : 0);
        parcel.writeInt(this.f575i ? 1 : 0);
        parcel.writeBundle(this.f576j);
        parcel.writeInt(this.f577k ? 1 : 0);
        parcel.writeBundle(this.f578l);
    }
}
