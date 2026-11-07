package r0;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class h extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f3602f;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class f3603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f3604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f3605c;

        private a() {
            d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a(Object obj) throws e.a {
            try {
                return ((Long) this.f3605c.invoke(obj, new Object[0])).longValue();
            } catch (Exception unused) {
                throw new e.a("");
            }
        }

        private void d() {
            try {
                this.f3603a = Class.forName(e.a(d.a()), true, Object.class.getClassLoader());
                String strA = e.a(d.b());
                Class cls = this.f3603a;
                Class cls2 = Integer.TYPE;
                this.f3604b = e.b(cls, strA, new Class[]{byte[].class, cls2, cls2});
                this.f3605c = e.b(this.f3603a, e.a(d.c()), null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Object obj, byte[] bArr, int i2, int i3) throws e.a {
            try {
                this.f3604b.invoke(obj, bArr, Integer.valueOf(i2), Integer.valueOf(i3));
            } catch (Exception unused) {
                throw new e.a("");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object g() {
            return this.f3603a.newInstance();
        }
    }

    public h(int i2, int i3) {
        this.f3597a = 1099511627775L;
        this.f3598b = 4;
        this.f3599c = 32;
        this.f3600d = i2;
        this.f3601e = i3;
        this.f3602f = new a();
    }

    @Override // r0.g
    public b b(byte[] bArr, int i2, int i3) {
        long jA;
        try {
            Object objG = this.f3602f.g();
            this.f3602f.e(objG, bArr, i2, i3);
            jA = this.f3602f.a(objG);
        } catch (Exception unused) {
            jA = 4294967295L;
        }
        return b.a(new long[]{jA});
    }
}
