package d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Base64;
import b.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends n.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static HashMap<String, Long> f2206s = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f2209l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2211n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Handler f2214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Runnable f2215r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2207j = "https://loc.map.baidu.com/indoorlocbuildinginfo.php";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SimpleDateFormat f2208k = new SimpleDateFormat("yyyyMM");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2213p = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashSet<String> f2212o = new HashSet<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2210m = false;

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public class RunnableC0020a implements Runnable {
        public RunnableC0020a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f2213p != null) {
                a aVar = a.this;
                aVar.f2211n = aVar.f2213p;
                ExecutorService executorServiceC = w.b().c();
                a aVar2 = a.this;
                if (executorServiceC != null) {
                    aVar2.c(executorServiceC, aVar2.f2207j);
                } else {
                    aVar2.b(aVar2.f2207j);
                }
            }
        }
    }

    public interface b {
    }

    public a(Context context) {
        this.f2209l = context;
        this.f3382d = new HashMap();
        this.f2214q = new Handler();
        this.f2215r = new RunnableC0020a();
    }

    @Override // n.g
    public void a() {
        this.f3379a = this.f2207j;
        this.f3382d.clear();
        this.f3382d.put("bid", "none");
        this.f3382d.put("bldg", this.f2211n);
        this.f3382d.put("mb", Build.MODEL);
        this.f3382d.put("msdk", "2.0");
        this.f3382d.put("cuid", n.b.g().f3351c);
        this.f3382d.put("anchors", "v1");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    @Override // n.g
    public void h(boolean z2) {
        boolean z3;
        String str;
        String strOptString;
        if (!z2 || (str = this.f3381c) == null) {
            z3 = false;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str.getBytes(), 0)));
                if (!jSONObject.has("anchorinfo") || (strOptString = jSONObject.optString("anchorinfo")) == null || strOptString.equals("")) {
                    z3 = false;
                } else {
                    this.f2212o.clear();
                    s(strOptString);
                    u(strOptString);
                    z3 = true;
                    try {
                        o();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (!z3 && this.f2213p == null) {
            this.f2213p = this.f2211n;
            this.f2214q.postDelayed(this.f2215r, 60000L);
        } else if (z3) {
            this.f2213p = null;
        } else {
            v(this.f2213p);
            this.f2213p = null;
            String strK = k(q());
            if (strK != null) {
                s(strK);
            }
        }
        this.f2210m = false;
    }

    public final String k(Date date) {
        File file = new File(this.f2209l.getCacheDir(), n.i.k((this.f2211n + this.f2208k.format(date)).getBytes(), false));
        if (!file.isFile()) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                str = str + line + "\n";
            }
            bufferedReader.close();
            if (!str.equals("")) {
                return new String(Base64.decode(str.getBytes(), 0));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public boolean l(String str, b bVar) {
        if (!this.f2210m) {
            this.f2210m = true;
            this.f2211n = str;
            try {
                String strK = k(new Date());
                if (strK == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (f2206s.get(str) == null || jCurrentTimeMillis - f2206s.get(str).longValue() > 86400000) {
                        f2206s.put(str, Long.valueOf(jCurrentTimeMillis));
                        ExecutorService executorServiceC = w.b().c();
                        if (executorServiceC != null) {
                            c(executorServiceC, this.f2207j);
                        } else {
                            b(this.f2207j);
                        }
                    }
                } else {
                    s(strK);
                    this.f2210m = false;
                }
            } catch (Exception unused) {
                this.f2210m = false;
            }
        }
        return false;
    }

    public void n() {
        this.f2211n = null;
        this.f2212o.clear();
    }

    public final void o() {
        try {
            File file = new File(this.f2209l.getCacheDir(), n.i.k((this.f2211n + this.f2208k.format(q())).getBytes(), false));
            if (file.isFile()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public boolean p(String str) {
        String str2 = this.f2211n;
        return (str2 == null || !str2.equalsIgnoreCase(str) || this.f2212o.isEmpty()) ? false : true;
    }

    public final Date q() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, -1);
        return calendar.getTime();
    }

    public boolean r(String str) {
        HashSet<String> hashSet;
        return (this.f2211n == null || (hashSet = this.f2212o) == null || hashSet.isEmpty() || !this.f2212o.contains(str)) ? false : true;
    }

    public final void s(String str) {
        for (String str2 : str.split(",")) {
            this.f2212o.add(str2.toLowerCase());
        }
    }

    public boolean t() {
        HashSet<String> hashSet = this.f2212o;
        return (hashSet == null || hashSet.isEmpty()) ? false : true;
    }

    public final void u(String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f2209l.getCacheDir(), n.i.k((this.f2211n + this.f2208k.format(new Date())).getBytes(), false)));
            fileWriter.write(new String(Base64.encode(str.getBytes(), 0), "UTF-8"));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException unused) {
        }
    }

    public final void v(String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f2209l.getCacheDir(), "buildings"), true);
            fileWriter.write(str + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
