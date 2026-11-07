package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f1606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Parcel f1607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1612g;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    b(Parcel parcel, int i2, int i3, String str) {
        this.f1606a = new SparseIntArray();
        this.f1611f = -1;
        this.f1607b = parcel;
        this.f1608c = i2;
        this.f1609d = i3;
        this.f1612g = i2;
        this.f1610e = str;
    }

    private int D(int i2) {
        int i3;
        do {
            int i4 = this.f1612g;
            if (i4 >= this.f1609d) {
                return -1;
            }
            this.f1607b.setDataPosition(i4);
            int i5 = this.f1607b.readInt();
            i3 = this.f1607b.readInt();
            this.f1612g += i5;
        } while (i3 != i2);
        return this.f1607b.dataPosition();
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i2 = this.f1611f;
        if (i2 >= 0) {
            int i3 = this.f1606a.get(i2);
            int iDataPosition = this.f1607b.dataPosition();
            this.f1607b.setDataPosition(i3);
            this.f1607b.writeInt(iDataPosition - i3);
            this.f1607b.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f1607b;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f1612g;
        if (i2 == this.f1608c) {
            i2 = this.f1609d;
        }
        return new b(parcel, iDataPosition, i2, this.f1610e + "  ");
    }

    @Override // androidx.versionedparcelable.a
    public byte[] f() {
        int i2 = this.f1607b.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.f1607b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    public boolean h(int i2) {
        int iD = D(i2);
        if (iD == -1) {
            return false;
        }
        this.f1607b.setDataPosition(iD);
        return true;
    }

    @Override // androidx.versionedparcelable.a
    public int j() {
        return this.f1607b.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T l() {
        return (T) this.f1607b.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String n() {
        return this.f1607b.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void q(int i2) {
        a();
        this.f1611f = i2;
        this.f1606a.put(i2, this.f1607b.dataPosition());
        u(0);
        u(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void s(byte[] bArr) {
        if (bArr == null) {
            this.f1607b.writeInt(-1);
        } else {
            this.f1607b.writeInt(bArr.length);
            this.f1607b.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void u(int i2) {
        this.f1607b.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void w(Parcelable parcelable) {
        this.f1607b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void y(String str) {
        this.f1607b.writeString(str);
    }
}
