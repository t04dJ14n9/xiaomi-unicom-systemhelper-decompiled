package b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double[] f1823c = {1999.0d, 8.0d, 22.0d, 0.0d, 0.0d, 0.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, c> f1824a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, String> f1825b = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static s f1826a = new s();
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1827a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f1828b = 0.0d;

        public b(s sVar) {
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f1831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<String> f1834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<Integer> f1835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f1837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f1838j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f1839k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1840l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public b f1841m;

        public c(int i2, int i3) {
            f(i2, i3);
            this.f1836h = 0;
            this.f1837i = 0.0d;
            this.f1838j = 0.0d;
            this.f1839k = 0.0d;
            this.f1840l = 0;
            this.f1841m = new b(s.this);
        }

        public final b a(int i2, double d2) {
            b bVarB = b(s.f1823c);
            if (d2 < -1.0E9d || 1.0E9d < d2) {
                d2 = 0.0d;
            }
            int i3 = (int) d2;
            bVarB.f1827a += (i2 * 604800) + i3;
            bVarB.f1828b = d2 - ((double) i3);
            return bVarB;
        }

        public final b b(double[] dArr) {
            int[] iArr = {1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
            b bVar = new b(s.this);
            int i2 = 0;
            int i3 = (int) dArr[0];
            int i4 = (int) dArr[1];
            int i5 = (int) dArr[2];
            if (i3 >= 1970 && 2099 >= i3 && i4 >= 1 && 12 >= i4) {
                int i6 = (((((i3 - 1970) * 365) + ((i3 - 1969) / 4)) + iArr[i4 - 1]) + i5) - 2;
                if (i3 % 4 == 0 && i4 >= 3) {
                    i2 = 1;
                }
                int iFloor = (int) Math.floor(dArr[5]);
                bVar.f1827a = ((i6 + i2) * 86400) + (((int) dArr[3]) * 3600) + (((int) dArr[4]) * 60) + iFloor;
                bVar.f1828b = dArr[5] - ((double) iFloor);
            }
            return bVar;
        }

        @TargetApi(24)
        public final String c(GnssNavigationMessage gnssNavigationMessage) {
            StringBuilder sb = new StringBuilder();
            for (byte b2 : gnssNavigationMessage.getData()) {
                sb.append(String.format("%8s", Integer.toBinaryString(b2 & 255)).replace(' ', '0'));
            }
            return sb.toString();
        }

        public final void e() {
            boolean z2;
            if (this.f1834f.size() == 0) {
                z2 = false;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.f1834f.size()) {
                    z2 = true;
                    break;
                } else {
                    if (this.f1834f.get(i2).contains("None")) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                this.f1830b = true;
            } else {
                this.f1830b = false;
            }
        }

        public final void f(int i2, int i3) {
            int i4;
            int i5 = this.f1833e;
            if (i5 == 257 || i5 == 769) {
                i4 = 5;
            } else if (i5 == 1537) {
                i4 = 6;
            } else if (i5 != 1281) {
                i4 = i5 != 1282 ? 0 : 10;
            } else {
                i4 = 3;
            }
            ArrayList<String> arrayList = this.f1834f;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f1834f = new ArrayList<>();
            }
            ArrayList<Integer> arrayList2 = this.f1835g;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                this.f1835g = new ArrayList<>();
            }
            for (int i6 = 0; i6 < i4; i6++) {
                this.f1834f.add("None");
            }
            this.f1832d = i2;
            this.f1833e = i3;
            this.f1829a = false;
            this.f1830b = false;
            this.f1831c = 0L;
        }

        @TargetApi(24)
        public final void g(GnssNavigationMessage gnssNavigationMessage, long j2) {
            int type = gnssNavigationMessage.getType();
            int svid = gnssNavigationMessage.getSvid();
            int submessageId = gnssNavigationMessage.getSubmessageId();
            byte[] data = gnssNavigationMessage.getData();
            if (j2 - this.f1831c > 1200 || this.f1829a || this.f1834f.size() == 0 || type != this.f1833e || svid != this.f1832d) {
                f(svid, type);
            }
            if ((type == 1282 || type == 1281) && !l()) {
                f(svid, type);
            }
            if (this.f1834f.size() == 0) {
                return;
            }
            int i2 = this.f1833e;
            boolean z2 = true;
            int i3 = i2 == 1537 ? 0 : 1;
            if (i2 == 1282) {
                if (submessageId != 1) {
                    return;
                }
                i(j(gnssNavigationMessage));
                submessageId = this.f1840l;
            }
            int i4 = submessageId - i3;
            if (i4 >= this.f1834f.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b2 : data) {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(',');
                }
                sb.append((int) b2);
            }
            this.f1834f.set(i4, sb.toString());
            if (type == 1281 || type == 1282) {
                this.f1835g.add(Integer.valueOf(i4));
            }
            if (this.f1833e == 1537) {
                k(c(gnssNavigationMessage));
            }
            e();
            this.f1831c = j2;
        }

        public final void i(String str) {
            this.f1840l = Integer.parseInt(str.substring(42, 46), 2);
        }

        @TargetApi(24)
        public final String j(GnssNavigationMessage gnssNavigationMessage) {
            StringBuilder sb = new StringBuilder();
            byte[] data = gnssNavigationMessage.getData();
            int length = data.length;
            for (int i2 = 0; i2 < length; i2++) {
                String strReplace = String.format("%8s", Integer.toBinaryString(data[i2] & 255)).replace(' ', '0');
                if (i2 % 4 == 0) {
                    strReplace = strReplace.substring(2, 8);
                }
                sb.append(strReplace);
            }
            return sb.toString();
        }

        public final void k(String str) {
            StringBuilder sb;
            int i2;
            char cCharAt = str.charAt(0);
            char cCharAt2 = str.charAt(120);
            if (cCharAt == '1' && cCharAt2 == '0') {
                sb = new StringBuilder();
                sb.append(str.substring(2, 18));
                i2 = 234;
            } else {
                if (cCharAt != '0' || cCharAt2 != '1') {
                    return;
                }
                sb = new StringBuilder();
                sb.append(str.substring(2, 114));
                i2 = 138;
            }
            sb.append(str.substring(122, i2));
            String string = sb.toString();
            int i3 = Integer.parseInt(string.substring(0, 6), 2);
            if (i3 == 0) {
                q(string);
            } else if (i3 == 1) {
                p(string);
            } else if (i3 == 4) {
                n(string);
            }
        }

        public final boolean l() {
            if (this.f1835g == null) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1835g.size(); i2++) {
                if (this.f1835g.get(i2).intValue() != i2) {
                    return false;
                }
            }
            return true;
        }

        public final String m() {
            StringBuilder sb = new StringBuilder();
            if (!this.f1830b) {
                return sb.toString();
            }
            if (this.f1833e == 1537) {
                o();
            }
            sb.append(this.f1841m.f1827a);
            sb.append('|');
            boolean z2 = true;
            for (int i2 = 0; i2 < this.f1834f.size(); i2++) {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(',');
                }
                sb.append(this.f1834f.get(i2));
            }
            this.f1829a = true;
            return sb.toString();
        }

        public final void n(String str) {
            this.f1839k = Long.parseLong(str.substring(54, 68), 2) * 60;
        }

        public final void o() {
            int i2;
            b bVarA = a(this.f1836h, this.f1837i);
            b bVarA2 = a(this.f1836h, this.f1838j);
            double d2 = (((double) (bVarA2.f1827a - bVarA.f1827a)) + bVarA2.f1828b) - bVarA.f1828b;
            if (d2 <= 302400.0d) {
                if (d2 < -302400.0d) {
                    i2 = this.f1836h + 1;
                }
                this.f1841m = a(this.f1836h, this.f1839k);
            }
            i2 = this.f1836h - 1;
            this.f1836h = i2;
            this.f1841m = a(this.f1836h, this.f1839k);
        }

        public final void p(String str) {
            this.f1838j = Long.parseLong(str.substring(16, 30), 2) * 60.0d;
        }

        public final void q(String str) {
            this.f1836h = Integer.parseInt(str.substring(96, 108), 2);
            this.f1837i = Long.parseLong(str.substring(108, 128), 2);
        }
    }

    public static s c() {
        return a.f1826a;
    }

    @TargetApi(24)
    public void a(GnssNavigationMessage gnssNavigationMessage, long j2) {
        String str;
        HashMap<String, c> map;
        int svid = gnssNavigationMessage.getSvid();
        int type = gnssNavigationMessage.getType();
        if (type == 257) {
            str = "G";
        } else if (type == 769) {
            str = "R";
        } else if (type == 1537) {
            str = "E";
        } else if (type != 1281) {
            str = type != 1282 ? "none" : "CT";
        } else {
            str = "CO";
        }
        String str2 = str + svid;
        if (str2.contains("none") || (map = this.f1824a) == null) {
            return;
        }
        if (!map.containsKey(str2)) {
            this.f1824a.put(str2, new c(svid, type));
        }
        this.f1824a.get(str2).g(gnssNavigationMessage, j2);
    }

    public ArrayList<String> d() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, c> entry : this.f1824a.entrySet()) {
            String key = entry.getKey();
            String strM = entry.getValue().m();
            if (strM != null && strM.length() != 0) {
                if (this.f1825b.containsKey(key)) {
                    if (strM.substring(0, 100).equals(this.f1825b.get(key).substring(0, 100))) {
                    }
                } else {
                    this.f1825b.put(key, strM);
                }
                arrayList.add(key + '|' + strM);
            }
        }
        return arrayList;
    }
}
