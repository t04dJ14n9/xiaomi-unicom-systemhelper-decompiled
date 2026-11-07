package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final PorterDuff.Mode f650j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f657g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f658h = f650j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f659i;

    private static int b(Icon icon) {
        return icon.getResId();
    }

    private static String d(Icon icon) {
        return icon.getResPackage();
    }

    private static String g(int i2) {
        if (i2 == 1) {
            return "BITMAP";
        }
        if (i2 == 2) {
            return "RESOURCE";
        }
        if (i2 == 3) {
            return "DATA";
        }
        if (i2 != 4) {
            return i2 != 5 ? "UNKNOWN" : "BITMAP_MASKABLE";
        }
        return "URI";
    }

    public int a() {
        int i2 = this.f651a;
        if (i2 == -1) {
            return b((Icon) this.f652b);
        }
        if (i2 == 2) {
            return this.f655e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String c() {
        int i2 = this.f651a;
        if (i2 == -1) {
            return d((Icon) this.f652b);
        }
        if (i2 == 2) {
            return ((String) this.f652b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public void e() {
        Parcelable parcelable;
        this.f658h = PorterDuff.Mode.valueOf(this.f659i);
        int i2 = this.f651a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.f652b = this.f653c;
                        return;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    }
                }
                this.f652b = new String(this.f653c, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.f654d;
            if (parcelable == null) {
                byte[] bArr = this.f653c;
                this.f652b = bArr;
                this.f651a = 3;
                this.f655e = 0;
                this.f656f = bArr.length;
                return;
            }
        } else {
            parcelable = this.f654d;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.f652b = parcelable;
    }

    public void f(boolean z2) {
        this.f659i = this.f658h.name();
        int i2 = this.f651a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f653c = ((String) this.f652b).getBytes(Charset.forName("UTF-16"));
                    return;
                }
                if (i2 == 3) {
                    this.f653c = (byte[]) this.f652b;
                    return;
                } else if (i2 == 4) {
                    this.f653c = this.f652b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 != 5) {
                    return;
                }
            }
            if (z2) {
                Bitmap bitmap = (Bitmap) this.f652b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f653c = byteArrayOutputStream.toByteArray();
                return;
            }
        } else if (z2) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.f654d = (Parcelable) this.f652b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r1 != 5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f651a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r4 = r4.f652b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f651a
            java.lang.String r1 = g(r1)
            r0.append(r1)
            int r1 = r4.f651a
            r2 = 1
            if (r1 == r2) goto L77
            r3 = 2
            if (r1 == r3) goto L4f
            r2 = 3
            if (r1 == r2) goto L39
            r2 = 4
            if (r1 == r2) goto L2e
            r2 = 5
            if (r1 == r2) goto L77
            goto L97
        L2e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f652b
            r0.append(r1)
            goto L97
        L39:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f655e
            r0.append(r1)
            int r1 = r4.f656f
            if (r1 == 0) goto L97
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f656f
            goto L94
        L4f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.c()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r2 = r4.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L97
        L77:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f652b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f652b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L94:
            r0.append(r1)
        L97:
            android.content.res.ColorStateList r1 = r4.f657g
            if (r1 == 0) goto La5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f657g
            r0.append(r1)
        La5:
            android.graphics.PorterDuff$Mode r1 = r4.f658h
            android.graphics.PorterDuff$Mode r2 = android.support.v4.graphics.drawable.IconCompat.f650j
            if (r1 == r2) goto Lb5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r4 = r4.f658h
            r0.append(r4)
        Lb5:
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
