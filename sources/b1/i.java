package b1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f2035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f2038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f2039f;

    public static class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i2) {
            return new i[i2];
        }
    }

    public i(String str, String str2, double d2, String str3, String str4) {
        this.f2036c = str;
        this.f2037d = str2;
        this.f2035b = d2;
        this.f2038e = str3;
        this.f2039f = str4;
    }

    public String a() {
        return this.f2039f;
    }

    public String b() {
        return this.f2036c;
    }

    public String c() {
        return this.f2037d;
    }

    public double d() {
        return this.f2035b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f2038e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2036c);
        parcel.writeString(this.f2037d);
        parcel.writeDouble(this.f2035b);
        parcel.writeString(this.f2038e);
        parcel.writeString(this.f2039f);
    }
}
