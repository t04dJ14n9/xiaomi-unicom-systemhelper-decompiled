package c;

import android.net.wifi.WifiConfiguration;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import b.w;
import com.baidu.location.Jni;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import n.g;
import n.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Object f2088f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f2089g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f2090a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2091b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2092c = 24;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f2093d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2094e = 0;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            f.this.h();
        }
    }

    public class b extends g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2096j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2097k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public JSONArray f2098l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public JSONArray f2099m = null;

        public b() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            this.f3379a = i.L();
            this.f3382d.clear();
            this.f3382d.put("qt", "cltrw");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", this.f2098l);
                jSONObject.put("frt", this.f2097k);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            String strI = Jni.i(jSONObject.toString());
            this.f3382d.put("cltr[0]", "" + strI);
            this.f3382d.put("cfg", 1);
            this.f3382d.put("info", Jni.f(n.b.g().a()));
            this.f3382d.put("trtm", String.format(Locale.CHINA, "%d", Long.valueOf(System.currentTimeMillis())));
        }

        @Override // n.g
        public void h(boolean z2) {
            JSONObject jSONObject;
            boolean z3;
            if (z2 && this.f3381c != null) {
                try {
                    jSONObject = new JSONObject(this.f3381c);
                    z3 = true;
                } catch (Exception unused) {
                    jSONObject = null;
                    z3 = false;
                }
                if (z3 && jSONObject != null) {
                    try {
                        jSONObject.put("tt", System.currentTimeMillis());
                        jSONObject.put("data", this.f2099m);
                        try {
                            File file = new File(f.this.f2091b, "wcnf.dat");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                            bufferedWriter.write(new String(Base64.encode(jSONObject.toString().getBytes(), 0), "UTF-8"));
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            this.f2096j = false;
        }

        public void i(boolean z2, JSONArray jSONArray, JSONArray jSONArray2) {
            if (this.f2096j) {
                return;
            }
            this.f2096j = true;
            if (z2) {
                this.f2097k = 1;
            } else {
                this.f2097k = 0;
            }
            this.f2098l = jSONArray;
            this.f2099m = jSONArray2;
            ExecutorService executorServiceC = w.b().c();
            if (executorServiceC != null) {
                c(executorServiceC, i.L());
            } else {
                b(i.L());
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2102b;

        public c(f fVar, String str, int i2) {
            this.f2101a = str;
            this.f2102b = i2;
        }
    }

    public static f e() {
        f fVar;
        synchronized (f2088f) {
            if (f2089g == null) {
                f2089g = new f();
            }
            fVar = f2089g;
        }
        return fVar;
    }

    public final List<c> a(List<WifiConfiguration> list) {
        int iIntValue;
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (WifiConfiguration wifiConfiguration : list) {
            String str = wifiConfiguration.SSID;
            try {
                iIntValue = ((Integer) i.f(wifiConfiguration, "numAssociation")).intValue();
            } catch (Throwable unused) {
                iIntValue = 0;
            }
            if (iIntValue > 0 && str != null) {
                arrayList.add(new c(this, str, iIntValue));
            }
        }
        return arrayList;
    }

    public void b() {
        Handler handler;
        if (System.currentTimeMillis() - this.f2094e <= 3600000 || (handler = this.f2090a) == null) {
            return;
        }
        handler.sendEmptyMessage(1);
        this.f2094e = System.currentTimeMillis();
    }

    public final void d(boolean z2, JSONArray jSONArray, JSONArray jSONArray2) {
        if (this.f2093d == null) {
            this.f2093d = new b();
        }
        if (i.N()) {
            return;
        }
        this.f2093d.i(z2, jSONArray, jSONArray2);
    }

    public void g() {
        if (this.f2090a == null) {
            this.f2090a = new a();
        }
        this.f2091b = i.I();
    }

    /* JADX WARN: Code duplicated, block: B:116:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd A[ADDED_TO_REGION] */
    public final void h() {
        boolean z2;
        HashMap map;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        boolean z3;
        if (this.f2091b != null) {
            try {
                File file = new File(this.f2091b, "wcnf.dat");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (file.exists()) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        StringBuffer stringBuffer = new StringBuffer();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                stringBuffer.append(line);
                            }
                            map = null;
                            e.printStackTrace();
                        }
                        bufferedReader.close();
                        String string = stringBuffer.toString();
                        if (string != null) {
                            JSONObject jSONObject = new JSONObject(new String(Base64.decode(string.getBytes(), 0)));
                            z2 = (jSONObject.has("ison") && jSONObject.getInt("ison") == 0) ? false : true;
                            try {
                                if (jSONObject.has("cfg")) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("cfg");
                                    if (jSONObject2.has("frq")) {
                                        this.f2092c = jSONObject2.getInt("frq");
                                    }
                                }
                                if (jSONObject.has("tt")) {
                                    jCurrentTimeMillis = jSONObject.getLong("tt");
                                }
                                if (jSONObject.has("data")) {
                                    JSONArray jSONArray3 = jSONObject.getJSONArray("data");
                                    map = new HashMap();
                                    try {
                                        int length = jSONArray3.length();
                                        for (int i2 = 0; i2 < length; i2++) {
                                            JSONObject jSONObject3 = jSONArray3.getJSONObject(i2);
                                            if (jSONObject3.has("ssid") && jSONObject3.has("num")) {
                                                map.put(jSONObject3.getString("ssid"), new c(this, jSONObject3.getString("ssid"), jSONObject3.getInt("num")));
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                map = null;
                            }
                        } else {
                            z2 = true;
                        }
                        map = null;
                    } catch (Exception e4) {
                        e = e4;
                        z2 = true;
                    }
                } else {
                    jCurrentTimeMillis = 0;
                    map = null;
                    z2 = true;
                }
                if (!z2) {
                    this.f2092c *= 4;
                }
                if (System.currentTimeMillis() - jCurrentTimeMillis > this.f2092c * 60 * 60 * 1000) {
                    List<c> listA = a(j.f.M().R());
                    if (jCurrentTimeMillis == 0) {
                        if (listA != null && listA.size() > 0) {
                            JSONArray jSONArray4 = new JSONArray();
                            jSONArray = new JSONArray();
                            for (c cVar : listA) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("ssid", cVar.f2101a);
                                jSONObject4.put("num", cVar.f2102b);
                                jSONArray4.put(jSONObject4);
                                jSONArray.put(jSONObject4);
                            }
                            jSONArray2 = jSONArray4;
                            z3 = true;
                        }
                        if (jSONArray2 != null || jSONArray == null) {
                        }
                        d(z3, jSONArray2, jSONArray);
                        return;
                    }
                    if (listA != null && listA.size() > 0) {
                        jSONArray = new JSONArray();
                        if (map != null && map.size() > 0) {
                            JSONArray jSONArray5 = null;
                            for (c cVar2 : listA) {
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("ssid", cVar2.f2101a);
                                jSONObject5.put("num", cVar2.f2102b);
                                jSONArray.put(jSONObject5);
                                if ((map.containsKey(cVar2.f2101a) && cVar2.f2102b == ((c) map.get(cVar2.f2101a)).f2102b) ? false : true) {
                                    if (jSONArray5 == null) {
                                        jSONArray5 = new JSONArray();
                                    }
                                    JSONArray jSONArray6 = jSONArray5;
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("ssid", cVar2.f2101a);
                                    jSONObject6.put("num", cVar2.f2102b);
                                    jSONArray6.put(jSONObject6);
                                    jSONArray5 = jSONArray6;
                                }
                            }
                            jSONArray2 = jSONArray5;
                        }
                        z3 = false;
                        if (jSONArray2 != null) {
                        }
                    }
                    jSONArray2 = null;
                    z3 = false;
                    if (jSONArray2 != null) {
                    }
                    jSONArray = null;
                    jSONArray2 = null;
                    z3 = false;
                    if (jSONArray2 != null) {
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
