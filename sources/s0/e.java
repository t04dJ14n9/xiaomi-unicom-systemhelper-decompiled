package s0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q0.h;

/* JADX INFO: loaded from: classes.dex */
public class e extends s0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f3645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f3646g;

    static final class a implements Comparable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f3647c = {"read0", "read1", "read2", "read3", "access0", "access1", "access2", "access3", "sync0", "sync1", "sync2", "sync3", "open0", "open1", "open2", "open3"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3648b;

        private a(int i2) {
            this.f3648b = i2;
        }

        public static a c(byte b2, boolean z2) {
            int i2 = b2 & 255;
            return d(z2 ? i2 >> 4 : i2 & 15);
        }

        public static a d(int i2) {
            if (i2 >= 0 && i2 < 16) {
                return new a(i2);
            }
            throw new IllegalArgumentException("invalid idx " + i2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f3648b - aVar.f3648b;
        }

        public String b() {
            return f3647c[this.f3648b];
        }

        public byte e() {
            return (byte) this.f3648b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && this.f3648b == ((a) obj).f3648b;
        }

        public int hashCode() {
            return this.f3648b;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3649a = 33;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a[] f3650b = new a[33];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3651c;

        public b() {
        }

        private void d(int i2) {
            a[] aVarArr = this.f3650b;
            if (i2 - aVarArr.length > 0) {
                int length = aVarArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 >= 0) {
                    i2 = i3;
                }
                this.f3650b = (a[]) Arrays.copyOf(aVarArr, i2);
            }
        }

        public int a() {
            return this.f3651c;
        }

        public a b(int i2) {
            if (i2 < this.f3651c) {
                return this.f3650b[i2];
            }
            throw new IndexOutOfBoundsException("idx " + i2 + " size " + this.f3651c);
        }

        public void c(a aVar) {
            d(this.f3651c + 1);
            a[] aVarArr = this.f3650b;
            int i2 = this.f3651c;
            this.f3651c = i2 + 1;
            aVarArr[i2] = aVar;
        }

        public byte[] e() {
            int i2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i3 = 0;
            while (true) {
                i2 = this.f3651c;
                if (i3 >= i2 / 2) {
                    break;
                }
                int i4 = i3 * 2;
                byteArrayOutputStream.write((byte) (((b(i4 + 1).e() & 255) << 4) | (b(i4).e() & 255)));
                i3++;
            }
            if (i2 % 2 != 0) {
                byteArrayOutputStream.write((byte) (b(i2 - 1).e() & 255));
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f3653a = new ArrayList();

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f3654a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private a f3655b;

            public a(a aVar) {
                this.f3655b = aVar;
            }

            public void b() {
                this.f3654a++;
            }
        }

        c() {
        }

        public List a() {
            ArrayList arrayList = new ArrayList(this.f3653a);
            Collections.sort(arrayList, new s0.f(this));
            return arrayList;
        }

        public void b(a aVar) {
            this.f3653a.add(new a(aVar));
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f3656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte f3657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte[] f3658c;

        public d(byte[] bArr, byte b2, byte[] bArr2) {
            this.f3656a = bArr;
            this.f3657b = b2;
            this.f3658c = bArr2;
        }

        public h.a a() {
            try {
                String strA = x0.b.a(this.f3656a, "", true);
                String str = new String(new byte[]{this.f3657b}, "UTF-8");
                byte[] bArr = this.f3658c;
                return h.d(strA, str, bArr != null ? new String(bArr, "UTF-8") : null);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: s0.e$e, reason: collision with other inner class name */
    static class C0045e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3661c = 16;

        C0045e() {
        }

        public String toString() {
            return "";
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f3662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f3663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f3664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Method f3665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Method f3666e;

        f() {
        }

        public int a(Context context, Uri uri, int i2, int i3, int i4) throws r0.e.a {
            try {
                return ((Integer) this.f3662a.invoke(context, uri, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4))).intValue();
            } catch (Exception e2) {
                throw new r0.e.a(e2);
            }
        }

        void b() {
            try {
                String strA = r0.e.a(r0.d.d());
                Class cls = Integer.TYPE;
                this.f3662a = r0.e.b(Context.class, strA, new Class[]{Uri.class, cls, cls, cls});
                this.f3663b = r0.e.b(Context.class, r0.e.a(r0.d.e()), new Class[]{String.class, Uri.class, cls});
                this.f3664c = r0.e.b(ContentResolver.class, r0.e.a(r0.d.f()), new Class[]{Uri.class, cls});
                this.f3665d = r0.e.b(Context.class, r0.e.a(r0.d.g()), new Class[]{Uri.class, cls});
                this.f3666e = r0.e.b(ContentResolver.class, r0.e.a(r0.d.h()), new Class[]{Uri.class, cls});
            } catch (Exception unused) {
            }
        }
    }

    public e() {
        super("upc", 9000000L);
        f fVar = new f();
        this.f3646g = fVar;
        fVar.b();
    }

    private String f(String str) {
        return str + ".cesium";
    }

    private String g(String str, int i2, a aVar) {
        return String.format("content://%s/dat/v1/i%d/%s", f(str), Integer.valueOf(i2), aVar.b());
    }

    private String h(String str, a aVar) {
        return String.format("content://%s/dic/v1/%s", f(str), aVar.b());
    }

    private a i(String str, int i2, List list, int i3, C0045e c0045e) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c.a aVar = (c.a) it.next();
            if (j(str, i2, aVar.f3655b, i3, c0045e)) {
                aVar.b();
                return aVar.f3655b;
            }
        }
        return null;
    }

    private boolean j(String str, int i2, a aVar, int i3, C0045e c0045e) {
        int iA;
        Uri uri = Uri.parse(g(str, i2, aVar));
        int i4 = 0;
        while (true) {
            if (i4 >= 2) {
                iA = -1;
                break;
            }
            if (c0045e != null) {
                try {
                    c0045e.f3659a++;
                } catch (Throwable unused) {
                    try {
                        Thread.sleep(5L);
                    } catch (Exception unused2) {
                    }
                    i4++;
                }
            }
            iA = this.f3646g.a(this.f3645f, uri, 0, i3, 1);
            break;
        }
        if (iA == 0) {
            return true;
        }
        if (c0045e != null) {
            c0045e.f3660b++;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[RETURN] */
    private boolean k(String str, a aVar, int i2) {
        int iA;
        Uri uri = Uri.parse(h(str, aVar));
        for (int i3 = 0; i3 < 2; i3++) {
            try {
                iA = this.f3646g.a(this.f3645f, uri, 0, i2, 1);
                if (iA == 0) {
                    return true;
                }
                return false;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused2) {
                }
            }
        }
        iA = -1;
        if (iA == 0) {
            return true;
        }
        return false;
    }

    @Override // s0.a
    public s0.a.e b(String str, s0.a.d dVar) {
        int packageUid;
        byte[] bArrE;
        boolean z2;
        Byte bValueOf;
        try {
            packageUid = this.f3645f.getPackageManager().getPackageUid(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageUid = -1;
        }
        int i2 = packageUid;
        if (i2 < 0) {
            return s0.a.e.a();
        }
        C0045e c0045e = new C0045e();
        b bVar = new b();
        c cVar = new c();
        c cVar2 = new c();
        for (int i3 = 0; i3 < 16; i3++) {
            a aVarD = a.d(i3);
            if (k(str, aVarD, i2)) {
                cVar.b(aVarD);
            } else {
                cVar2.b(aVarD);
            }
        }
        for (int i4 = 0; i4 < 32; i4++) {
            a aVarI = i(str, i4, cVar.a(), i2, c0045e);
            if (aVarI == null) {
                aVarI = i(str, i4, cVar2.a(), i2, c0045e);
            }
            if (aVarI == null) {
                return s0.a.e.a();
            }
            bVar.c(aVarI);
        }
        byte[] bArrE2 = bVar.e();
        int i5 = 3;
        boolean z3 = true;
        byte[] bArr = {"0".getBytes()[0], "O".getBytes()[0], "V".getBytes()[0]};
        int i6 = 0;
        while (true) {
            bArrE = null;
            if (i6 >= i5) {
                z2 = z3;
                bValueOf = null;
                break;
            }
            byte b2 = bArr[i6];
            a aVarC = a.c(b2, false);
            int i7 = i6;
            z2 = z3;
            byte[] bArr2 = bArr;
            if (j(str, 32, aVarC, i2, c0045e)) {
                a aVarC2 = a.c(b2, z2);
                if (j(str, 33, aVarC2, i2, c0045e)) {
                    b bVar2 = new b();
                    bVar2.c(aVarC);
                    bVar2.c(aVarC2);
                    bValueOf = Byte.valueOf(bVar2.e()[0]);
                    break;
                }
            }
            i6 = i7 + 1;
            z3 = z2;
            bArr = bArr2;
            i5 = 3;
        }
        if (bValueOf == null) {
            b bVar3 = new b();
            int i8 = 32;
            for (int i9 = 34; i8 < i9; i9 = 34) {
                int i10 = i8;
                b bVar4 = bVar3;
                a aVarI2 = i(str, i8, cVar.a(), i2, c0045e);
                if (aVarI2 == null) {
                    aVarI2 = i(str, i10, cVar2.a(), i2, c0045e);
                }
                if (aVarI2 == null) {
                    return s0.a.e.a();
                }
                bVar4.c(aVarI2);
                i8 = i10 + 1;
                bVar3 = bVar4;
            }
            bValueOf = Byte.valueOf(bVar3.e()[0]);
        } else {
            z2 = false;
        }
        Byte b3 = bValueOf;
        if (z2) {
            b bVar5 = new b();
            for (int i11 = 34; i11 < 94; i11++) {
                a aVarI3 = i(str, i11, cVar.a(), i2, c0045e);
                if (aVarI3 == null) {
                    aVarI3 = i(str, i11, cVar2.a(), i2, c0045e);
                }
                if (aVarI3 == null) {
                    break;
                }
                bVar5.c(aVarI3);
            }
            if (bVar5.a() > 0) {
                bArrE = bVar5.e();
            }
        }
        return s0.a.e.c(new d(bArrE2, b3.byteValue(), bArrE).a());
    }

    @Override // s0.a
    public void d(s0.a.c cVar) {
        this.f3645f = this.f3613a.f3617a;
    }
}
