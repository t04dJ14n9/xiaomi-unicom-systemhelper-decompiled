package b1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f1907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f1908k;

    /* JADX INFO: renamed from: b1.a$a, reason: collision with other inner class name */
    public static class C0016a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1909a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1910b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1911c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f1912d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f1913e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f1914f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f1915g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f1916h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f1917i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f1918j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f1919k = null;

        public C0016a l(String str) {
            this.f1918j = str;
            return this;
        }

        public a m() {
            String str;
            StringBuffer stringBuffer = new StringBuffer();
            String str2 = this.f1909a;
            if (str2 != null) {
                stringBuffer.append(str2);
            }
            String str3 = this.f1911c;
            if (str3 != null) {
                stringBuffer.append(str3);
            }
            String str4 = this.f1911c;
            if (str4 != null && (str = this.f1912d) != null && !str4.equals(str)) {
                stringBuffer.append(this.f1912d);
            }
            String str5 = this.f1914f;
            if (str5 != null) {
                String str6 = this.f1912d;
                if (str6 == null) {
                    stringBuffer.append(str5);
                } else if (!str6.equals(str5)) {
                    str5 = this.f1914f;
                    stringBuffer.append(str5);
                }
            }
            String str7 = this.f1919k;
            if (str7 != null) {
                stringBuffer.append(str7);
            }
            String str8 = this.f1915g;
            if (str8 != null) {
                stringBuffer.append(str8);
            }
            String str9 = this.f1916h;
            if (str9 != null) {
                stringBuffer.append(str9);
            }
            if (stringBuffer.length() > 0) {
                this.f1917i = stringBuffer.toString();
            }
            return new a(this);
        }

        public C0016a n(String str) {
            this.f1912d = str;
            return this;
        }

        public C0016a o(String str) {
            this.f1913e = str;
            return this;
        }

        public C0016a p(String str) {
            this.f1909a = str;
            return this;
        }

        public C0016a q(String str) {
            this.f1910b = str;
            return this;
        }

        public C0016a r(String str) {
            this.f1914f = str;
            return this;
        }

        public C0016a s(String str) {
            this.f1911c = str;
            return this;
        }

        public C0016a t(String str) {
            this.f1915g = str;
            return this;
        }

        public C0016a u(String str) {
            this.f1916h = str;
            return this;
        }

        public C0016a v(String str) {
            this.f1919k = str;
            return this;
        }
    }

    private a(C0016a c0016a) {
        this.f1898a = c0016a.f1909a;
        this.f1899b = c0016a.f1910b;
        this.f1900c = c0016a.f1911c;
        this.f1901d = c0016a.f1912d;
        this.f1902e = c0016a.f1913e;
        this.f1903f = c0016a.f1914f;
        this.f1904g = c0016a.f1915g;
        this.f1905h = c0016a.f1916h;
        this.f1906i = c0016a.f1917i;
        this.f1907j = c0016a.f1918j;
        this.f1908k = c0016a.f1919k;
    }
}
