package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    n[] f563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d[] f565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f567f;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i2) {
            return new m[i2];
        }
    }

    public m() {
        this.f566e = -1;
    }

    public m(Parcel parcel) {
        this.f566e = -1;
        this.f563b = (n[]) parcel.createTypedArray(n.CREATOR);
        this.f564c = parcel.createIntArray();
        this.f565d = (d[]) parcel.createTypedArray(d.CREATOR);
        this.f566e = parcel.readInt();
        this.f567f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedArray(this.f563b, i2);
        parcel.writeIntArray(this.f564c);
        parcel.writeTypedArray(this.f565d, i2);
        parcel.writeInt(this.f566e);
        parcel.writeInt(this.f567f);
    }
}
