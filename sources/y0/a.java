package y0;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import u0.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f4049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0047a f4050b;

    /* JADX INFO: renamed from: y0.a$a, reason: collision with other inner class name */
    public final class C0047a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f4051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0047a f4053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4054d = true;

        C0047a(File file) {
            this.f4051a = file;
            this.f4052b = file.getName();
        }

        C0047a(String str, C0047a c0047a) {
            this.f4052b = str;
            this.f4053c = c0047a;
        }

        public String a(String str, boolean z2) {
            return a.b(f(), str, "UTF-8", z2);
        }

        public C0047a b(File file) {
            if (this.f4054d) {
                throw new IllegalStateException("isolate session is not support");
            }
            ArrayList arrayList = new ArrayList();
            C0047a c0047aH = this;
            do {
                arrayList.add(c0047aH.g());
                c0047aH = c0047aH.h();
            } while (c0047aH != null);
            int size = arrayList.size() - 1;
            while (size >= 0) {
                File file2 = new File(file, (String) arrayList.get(size));
                size--;
                file = file2;
            }
            return a.this.new C0047a(file);
        }

        public C0047a c(String str) {
            return a.this.new C0047a(str, this);
        }

        public void d() {
            f().mkdirs();
        }

        public boolean e(String str, String str2, boolean z2) {
            return a.d(f(), str, str2, "UTF-8", z2);
        }

        public File f() {
            File file = this.f4051a;
            if (file != null) {
                return file;
            }
            File file2 = this.f4053c == null ? new File(a.this.a(), this.f4052b) : new File(this.f4053c.f(), this.f4052b);
            this.f4051a = file2;
            return file2;
        }

        public String g() {
            return this.f4052b;
        }

        public C0047a h() {
            return this.f4053c;
        }
    }

    public a(Context context) {
        this.f4049a = context;
        f().mkdirs();
    }

    public static String b(File file, String str, String str2, boolean z2) throws Throwable {
        FileInputStream fileInputStream;
        c(file);
        File file2 = new File(file, str);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 <= 0) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, i2);
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (z2) {
                        byteArray = new c().b(byteArray);
                    }
                    String str3 = new String(byteArray, str2);
                    z0.c.b(fileInputStream);
                    z0.c.b(byteArrayOutputStream2);
                    return str3;
                } catch (Exception unused) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    z0.c.b(fileInputStream);
                    z0.c.b(byteArrayOutputStream);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    z0.c.b(fileInputStream);
                    z0.c.b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                fileInputStream = null;
                byteArrayOutputStream = byteArrayOutputStream2;
                th = th2;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static void c(File file) {
        file.mkdirs();
    }

    public static boolean d(File file, String str, String str2, String str3, boolean z2) throws Throwable {
        c(file);
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                if (z2) {
                    fileOutputStream2.write(new c().a(str2.getBytes()));
                } else {
                    fileOutputStream2.write(str2.getBytes(str3));
                }
                z0.c.b(fileOutputStream2);
                return true;
            } catch (Exception unused) {
                fileOutputStream = fileOutputStream2;
                z0.c.b(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                z0.c.b(fileOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private File f() {
        return new File(a(), ".cesium");
    }

    public File a() {
        return new File(this.f4049a.getApplicationInfo().dataDir);
    }

    public synchronized C0047a e() {
        if (this.f4050b == null) {
            this.f4050b = new C0047a(".cesium", null);
        }
        return this.f4050b;
    }
}
