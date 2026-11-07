package b;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.util.Base64;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f1678a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1679b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Deque<String> f1680c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Deque<String> f1681d = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Deque<String> f1682e = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1683f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1684g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1685h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1686i = 1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static f f1687a = new f();
    }

    public static f k() {
        return a.f1687a;
    }

    public synchronized String a() {
        return b(this.f1686i, this.f1685h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final String b(int i2, int i3) {
        String str;
        if (i2 == 1) {
            String strI = i(this.f1682e);
            if ("".equals(strI)) {
                str = "";
            } else {
                str = "&ll_pre=" + strI;
            }
        } else {
            str = "";
        }
        if (i3 != 1) {
            return str;
        }
        String strC = c(this.f1680c);
        if (!"".equals(strC)) {
            str = str + "&cl_pre=" + strC;
        }
        String strC2 = c(this.f1681d);
        if ("".equals(strC2)) {
            return str;
        }
        return str + "&wf_pre=" + strC2;
    }

    public final String c(Deque<String> deque) {
        if (deque == null || deque.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strPeekFirst = deque.peekFirst();
        if (strPeekFirst != null) {
            try {
                String[] strArrSplit = strPeekFirst.split(",");
                int i2 = 0;
                for (String str : deque) {
                    if (strArrSplit.length != 3) {
                        break;
                    }
                    String[] strArrSplit2 = str.split(",");
                    if (i2 == 0) {
                        sb.append(strPeekFirst);
                    } else {
                        if (strArrSplit2.length == 3) {
                            try {
                                sb.append((int) ((Double.parseDouble(strArrSplit[0]) - Double.parseDouble(strArrSplit2[0])) * Math.pow(10.0d, 6.0d)));
                                sb.append(",");
                                sb.append((int) ((Double.parseDouble(strArrSplit[1]) - Double.parseDouble(strArrSplit2[1])) * Math.pow(10.0d, 6.0d)));
                                sb.append(",");
                                sb.append(Long.parseLong(strArrSplit[2]) - Long.parseLong(strArrSplit2[2]));
                            } catch (Exception unused) {
                            }
                        }
                        i2++;
                    }
                    if (i2 != deque.size() - 1) {
                        sb.append("|");
                    }
                    i2++;
                }
            } catch (Exception unused2) {
            }
        }
        return sb.toString();
    }

    public void d(Context context) {
        if (this.f1678a == null) {
            this.f1678a = r.c().e(context);
        }
        SharedPreferences sharedPreferences = this.f1678a;
        if (sharedPreferences == null || this.f1679b) {
            return;
        }
        try {
            String string = sharedPreferences.getString("cl_pre", "");
            String string2 = this.f1678a.getString("wf_pre", "");
            String string3 = this.f1678a.getString("ll_pre", "");
            j(string, this.f1680c);
            j(string2, this.f1681d);
            f(string3, this.f1682e);
        } catch (Exception unused) {
        }
        this.f1679b = true;
    }

    public synchronized void e(b1.c cVar, String str, Location location) {
        Deque<String> deque;
        String str2;
        if (cVar != null) {
            if ("gcj02".equals(str)) {
                String strZ = cVar.z();
                int iV = cVar.v();
                if (iV == 61 || iV == 161) {
                    if (strZ == null) {
                        strZ = "null";
                    }
                    try {
                        if (!strZ.contains("wf") || this.f1685h != 1) {
                            if (strZ.contains("cl") && this.f1685h == 1) {
                                this.f1680c.offerFirst(cVar.x() + "," + cVar.u() + "," + n.i.e(cVar.I()));
                                deque = this.f1680c;
                                str2 = "cl";
                            } else if (iV == 61 && this.f1686i == 1 && location != null) {
                                int iE = (int) cVar.E();
                                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                                DecimalFormat decimalFormat2 = new DecimalFormat("0.0");
                                DecimalFormat decimalFormat3 = new DecimalFormat("0.000000");
                                this.f1682e.offerFirst(cVar.G() + "," + iE + "," + decimalFormat.format(cVar.e()) + "," + n.i.e(cVar.I()) + "," + decimalFormat2.format(cVar.H()) + "," + decimalFormat3.format(location.getLongitude()) + "," + decimalFormat3.format(location.getLatitude()));
                                l(this.f1682e);
                            }
                        }
                        this.f1681d.offerFirst(cVar.x() + "," + cVar.u() + "," + n.i.e(cVar.I()));
                        deque = this.f1681d;
                        str2 = "wf";
                        g(deque, str2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public final void f(String str, Deque<String> deque) {
        if (str == null || "".equals(str)) {
            return;
        }
        deque.addAll(Arrays.asList(new String(Base64.decode(str.getBytes(), 0)).split("\\|")));
    }

    public final void g(Deque<String> deque, String str) {
        if (deque == null || deque.isEmpty()) {
            return;
        }
        while (deque.size() > this.f1683f) {
            deque.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = deque.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i2 != deque.size() - 1) {
                sb.append("|");
            }
            i2++;
        }
        try {
            String str2 = new String(Base64.encode(sb.toString().getBytes(), 0));
            SharedPreferences.Editor editorEdit = this.f1678a.edit();
            editorEdit.putString(str + "_pre", str2);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    public String h() {
        return b(this.f1686i, this.f1685h);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0103 A[Catch: Exception -> 0x010d, TRY_LEAVE, TryCatch #1 {Exception -> 0x010d, blocks: (B:9:0x0019, B:10:0x0023, B:12:0x0029, B:15:0x0035, B:17:0x003c, B:25:0x00fc, B:27:0x0103, B:19:0x0042), top: B:38:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0108 A[SYNTHETIC] */
    public final String i(Deque<String> deque) {
        int i2;
        if (deque == null || deque.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strPeekFirst = deque.peekFirst();
        if (strPeekFirst != null) {
            try {
                String[] strArrSplit = strPeekFirst.split(",");
                char c2 = 0;
                int i3 = 0;
                for (String str : deque) {
                    if (strArrSplit.length != 7) {
                        break;
                    }
                    String[] strArrSplit2 = str.split(",");
                    if (i3 == 0) {
                        sb.append(strPeekFirst);
                    } else {
                        if (strArrSplit2.length != 7) {
                            i2 = i3;
                        } else {
                            try {
                                sb.append(Integer.parseInt(strArrSplit[c2]) - Integer.parseInt(strArrSplit2[c2]));
                                sb.append(",");
                                sb.append(Integer.parseInt(strArrSplit[1]) - Integer.parseInt(strArrSplit2[1]));
                                sb.append(",");
                                sb.append(new BigDecimal(strArrSplit[2]).subtract(new BigDecimal(strArrSplit2[2])));
                                sb.append(",");
                                sb.append(Long.parseLong(strArrSplit[3]) - Long.parseLong(strArrSplit2[3]));
                                sb.append(",");
                                sb.append(new BigDecimal(strArrSplit[4]).subtract(new BigDecimal(strArrSplit2[4])));
                                sb.append(",");
                                double dDoubleValue = new BigDecimal(strArrSplit[5]).subtract(new BigDecimal(strArrSplit2[5])).doubleValue();
                                double dDoubleValue2 = new BigDecimal(strArrSplit[6]).subtract(new BigDecimal(strArrSplit2[6])).doubleValue();
                                i2 = i3;
                                try {
                                    sb.append((int) (dDoubleValue * Math.pow(10.0d, 6.0d)));
                                    sb.append(",");
                                    sb.append((int) (dDoubleValue2 * Math.pow(10.0d, 6.0d)));
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                i2 = i3;
                            }
                            if (i2 != deque.size() - 1) {
                                sb.append("|");
                            }
                        }
                        i3 = i2 + 1;
                        c2 = 0;
                    }
                    i2 = i3;
                    if (i2 != deque.size() - 1) {
                        sb.append("|");
                    }
                    i3 = i2 + 1;
                    c2 = 0;
                }
            } catch (Exception unused3) {
            }
        }
        return sb.toString();
    }

    public final void j(String str, Deque<String> deque) {
        if (str == null || "".equals(str)) {
            return;
        }
        deque.addAll(Arrays.asList(new String(Base64.decode(str.getBytes(), 0)).split("\\|")));
    }

    public final void l(Deque<String> deque) {
        if (deque == null || deque.isEmpty()) {
            return;
        }
        while (deque.size() > this.f1684g) {
            deque.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = deque.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i2 != deque.size() - 1) {
                sb.append("|");
            }
            i2++;
        }
        try {
            String str = new String(Base64.encode(sb.toString().getBytes(), 0));
            SharedPreferences.Editor editorEdit = this.f1678a.edit();
            editorEdit.putString("ll_pre", str);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }
}
