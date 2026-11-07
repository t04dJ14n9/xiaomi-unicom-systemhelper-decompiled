package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Parcelable f2605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2604c = new C0027a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: g0.a$a, reason: collision with other inner class name */
    static class C0027a extends a {
        C0027a() {
            super((C0027a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2604c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    private a() {
        this.f2605b = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f2605b = parcelable == null ? f2604c : parcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2605b = parcelable == f2604c ? null : parcelable;
    }

    /* synthetic */ a(C0027a c0027a) {
        this();
    }

    public final Parcelable a() {
        return this.f2605b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2605b, i2);
    }
}
