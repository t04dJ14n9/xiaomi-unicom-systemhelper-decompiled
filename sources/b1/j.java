package b1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2042d;

    public static class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i2) {
            return new j[i2];
        }
    }

    public j(j jVar) {
        this.f2041c = jVar.b();
        this.f2040b = jVar.a();
        this.f2042d = jVar.c();
    }

    public j(String str, String str2, String str3) {
        this.f2041c = str2;
        this.f2040b = str;
        this.f2042d = str3;
    }

    public String a() {
        return this.f2040b;
    }

    public String b() {
        return this.f2041c;
    }

    public String c() {
        return this.f2042d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2041c);
        parcel.writeString(this.f2040b);
        parcel.writeString(this.f2042d);
    }
}
