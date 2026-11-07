package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final CharSequence f433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final CharSequence f435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ArrayList<String> f436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList<String> f437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f438m;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public d(Parcel parcel) {
        this.f427b = parcel.createIntArray();
        this.f428c = parcel.readInt();
        this.f429d = parcel.readInt();
        this.f430e = parcel.readString();
        this.f431f = parcel.readInt();
        this.f432g = parcel.readInt();
        this.f433h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f434i = parcel.readInt();
        this.f435j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f436k = parcel.createStringArrayList();
        this.f437l = parcel.createStringArrayList();
        this.f438m = parcel.readInt() != 0;
    }

    public d(c cVar) {
        int size = cVar.f401b.size();
        this.f427b = new int[size * 6];
        if (!cVar.f408i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            c.a aVar = cVar.f401b.get(i3);
            int[] iArr = this.f427b;
            int i4 = i2 + 1;
            iArr[i2] = aVar.f421a;
            int i5 = i4 + 1;
            e eVar = aVar.f422b;
            iArr[i4] = eVar != null ? eVar.f443f : -1;
            int i6 = i5 + 1;
            iArr[i5] = aVar.f423c;
            int i7 = i6 + 1;
            iArr[i6] = aVar.f424d;
            int i8 = i7 + 1;
            iArr[i7] = aVar.f425e;
            i2 = i8 + 1;
            iArr[i8] = aVar.f426f;
        }
        this.f428c = cVar.f406g;
        this.f429d = cVar.f407h;
        this.f430e = cVar.f410k;
        this.f431f = cVar.f412m;
        this.f432g = cVar.f413n;
        this.f433h = cVar.f414o;
        this.f434i = cVar.f415p;
        this.f435j = cVar.f416q;
        this.f436k = cVar.f417r;
        this.f437l = cVar.f418s;
        this.f438m = cVar.f419t;
    }

    public c a(k kVar) {
        c cVar = new c(kVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f427b.length) {
            c.a aVar = new c.a();
            int i4 = i2 + 1;
            aVar.f421a = this.f427b[i2];
            if (k.F) {
                Log.v("FragmentManager", "Instantiate " + cVar + " op #" + i3 + " base fragment #" + this.f427b[i4]);
            }
            int i5 = i4 + 1;
            int i6 = this.f427b[i4];
            aVar.f422b = i6 >= 0 ? kVar.f510f.get(i6) : null;
            int[] iArr = this.f427b;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar.f423c = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar.f424d = i10;
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            aVar.f425e = i12;
            int i13 = iArr[i11];
            aVar.f426f = i13;
            cVar.f402c = i8;
            cVar.f403d = i10;
            cVar.f404e = i12;
            cVar.f405f = i13;
            cVar.b(aVar);
            i3++;
            i2 = i11 + 1;
        }
        cVar.f406g = this.f428c;
        cVar.f407h = this.f429d;
        cVar.f410k = this.f430e;
        cVar.f412m = this.f431f;
        cVar.f408i = true;
        cVar.f413n = this.f432g;
        cVar.f414o = this.f433h;
        cVar.f415p = this.f434i;
        cVar.f416q = this.f435j;
        cVar.f417r = this.f436k;
        cVar.f418s = this.f437l;
        cVar.f419t = this.f438m;
        cVar.c(1);
        return cVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f427b);
        parcel.writeInt(this.f428c);
        parcel.writeInt(this.f429d);
        parcel.writeString(this.f430e);
        parcel.writeInt(this.f431f);
        parcel.writeInt(this.f432g);
        TextUtils.writeToParcel(this.f433h, parcel, 0);
        parcel.writeInt(this.f434i);
        TextUtils.writeToParcel(this.f435j, parcel, 0);
        parcel.writeStringList(this.f436k);
        parcel.writeStringList(this.f437l);
        parcel.writeInt(this.f438m ? 1 : 0);
    }
}
