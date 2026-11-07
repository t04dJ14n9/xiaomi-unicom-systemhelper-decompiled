package b;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import com.baidu.location.Jni;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static j H = null;
    public static String I = "0";
    public Handler B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1723a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f1724b = 0.699999988079071d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1725c = "3G|4G";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1726d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1727e = 307200;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1728f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f1729g = 3.5d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f1730h = 3.0d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f1731i = 0.5d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1732j = 300;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1733k = 60;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1734l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1735m = 60;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1736n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1737o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f1738p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1739q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1740r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1741s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f1742t = 0.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f1743u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1744v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1745w = 500;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1746x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Location f1747y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Location f1748z = null;
    public long A = 0;
    public byte[] C = new byte[4];
    public byte[] D = null;
    public int E = 0;
    public List<Byte> F = null;
    public boolean G = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Location f1749b;

        public a(Location location) {
            this.f1749b = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.p(this.f1749b);
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.b(new File(n.i.A() + "/baidu/tempdata", "intime.dat"), "https://itsdata.map.baidu.com/long-conn-gps/sdk.php");
        }
    }

    public static class c implements HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URL f1752a;

        public c(URL url) {
            this.f1752a = url;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return this.f1752a.getHost().equals(str);
        }
    }

    public class d extends n.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f1753j = null;

        public d() {
            this.f3382d = new HashMap();
        }

        @Override // n.g
        public void a() {
            this.f3379a = "https://loc.map.baidu.com/cc.php";
            String strF = Jni.f(this.f1753j);
            this.f1753j = null;
            this.f3382d.put("q", strF);
        }

        @Override // n.g
        public void h(boolean z2) {
            String str;
            if (z2 && (str = this.f3381c) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("prod", n.b.f3344f);
                    jSONObject.put("uptime", System.currentTimeMillis());
                    j.this.v(jSONObject.toString());
                } catch (Exception unused) {
                }
            }
            Map<String, Object> map = this.f3382d;
            if (map != null) {
                map.clear();
            }
        }

        public void i(String str) {
            this.f1753j = str;
            b("https://loc.map.baidu.com/cc.php");
        }
    }

    public j() {
        this.B = null;
        this.B = new Handler();
    }

    public static j j() {
        if (H == null) {
            H = new j();
        }
        return H;
    }

    public final void A() {
        if (this.G) {
            return;
        }
        this.G = true;
        q(n.b.f3344f);
        C();
        n();
    }

    public void B() {
        if (this.G) {
            this.G = false;
            z();
        }
    }

    public final void C() {
        if (System.currentTimeMillis() - this.f1737o > 86400000) {
            if (this.f1738p == null) {
                this.f1738p = new d();
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(n.b.g().b(false));
            stringBuffer.append(b.c.r().o());
            this.f1738p.i(stringBuffer.toString());
        }
        y();
    }

    public final String b(File file, String str) {
        String string = UUID.randomUUID().toString();
        try {
            try {
                HttpsURLConnection.setDefaultSSLSocketFactory(n.i.G());
                URL url = new URL(str);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setUseCaches(false);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setRequestProperty("Charset", "utf-8");
                httpsURLConnection.setHostnameVerifier(new c(url));
                httpsURLConnection.setRequestProperty("connection", "close");
                httpsURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + string);
                if (file == null || !file.exists()) {
                    return "0";
                }
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("--");
                stringBuffer.append(string);
                stringBuffer.append("\r\n");
                stringBuffer.append("Content-Disposition: form-data; name=\"location_dat\"; filename=\"" + file.getName() + "\"\r\n");
                StringBuilder sb = new StringBuilder();
                sb.append("Content-Type: application/octet-stream; charset=utf-8");
                sb.append("\r\n");
                stringBuffer.append(sb.toString());
                stringBuffer.append("\r\n");
                dataOutputStream.write(stringBuffer.toString().getBytes());
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    dataOutputStream.write(bArr, 0, i2);
                }
                fileInputStream.close();
                dataOutputStream.write("\r\n".getBytes());
                dataOutputStream.write(("--" + string + "--\r\n").getBytes());
                dataOutputStream.flush();
                dataOutputStream.close();
                int responseCode = httpsURLConnection.getResponseCode();
                outputStream.close();
                httpsURLConnection.disconnect();
                int i3 = this.f1736n + 400;
                this.f1736n = i3;
                o(i3);
                return responseCode == 200 ? "1" : "0";
            } catch (MalformedURLException | IOException unused) {
                return "0";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return "0";
        }
    }

    public final void c() {
        if (this.A == 0 || System.currentTimeMillis() - this.A < this.f1728f * 1000) {
            return;
        }
        if (com.baidu.location.f.c().getSharedPreferences("loc_navi_mode", 4).getBoolean("is_navi_on", false)) {
            z();
            return;
        }
        if (this.f1726d == 1 && !x()) {
            z();
            return;
        }
        if (n.b.f3344f.equals("com.ubercab.driver")) {
            if (w()) {
                z();
                return;
            }
        } else if (!h(n.b.f3344f, com.baidu.location.f.c())) {
            z();
            return;
        }
        List<Byte> list = this.F;
        if (list != null) {
            try {
                int size = list.size();
                this.F.set(0, Byte.valueOf((byte) (size & 255)));
                this.F.set(1, Byte.valueOf((byte) ((65280 & size) >> 8)));
                this.F.set(3, Byte.valueOf((byte) (this.E & 255)));
                byte[] bArr = new byte[size];
                for (int i2 = 0; i2 < size; i2++) {
                    bArr[i2] = this.F.get(i2).byteValue();
                }
                File file = new File(n.i.A(), "baidu/tempdata");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (file.exists()) {
                    File file2 = new File(file, "intime.dat");
                    if (file2.exists()) {
                        file2.delete();
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        new b().start();
                    } catch (Exception unused) {
                    }
                }
                z();
                this.f1744v = System.currentTimeMillis();
            } catch (Exception unused2) {
            }
        }
    }

    public final void d(int i2) {
        byte[] bArrM = m(i2);
        for (int i3 = 0; i3 < 4; i3++) {
            this.F.add(Byte.valueOf(bArrM[i3]));
        }
    }

    public final void e(Location location) {
        this.A = System.currentTimeMillis();
        d((int) (location.getTime() / 1000));
        d((int) (location.getLongitude() * 1000000.0d));
        d((int) (location.getLatitude() * 1000000.0d));
        int i2 = !location.hasBearing() ? 1 : 0;
        int i3 = !location.hasSpeed() ? 1 : 0;
        if (i2 > 0) {
            this.F.add((byte) 32);
        } else {
            this.F.add(Byte.valueOf((byte) (((byte) (((int) (location.getBearing() / 15.0f)) & 255)) & (-33))));
        }
        if (i3 > 0) {
            this.F.add((byte) -128);
        } else {
            this.F.add(Byte.valueOf((byte) (((byte) (((int) ((((double) location.getSpeed()) * 3.6d) / 4.0d)) & 255)) & 127)));
        }
        this.f1747y = location;
    }

    public final boolean h(String str, Context context) {
        return true;
    }

    public final byte[] i(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes();
        byte bNextInt = (byte) new SecureRandom().nextInt(255);
        byte bNextInt2 = (byte) new SecureRandom().nextInt(255);
        byte[] bArr = new byte[bytes.length + 2];
        int length = bytes.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            bArr[i3] = (byte) (bytes[i2] ^ bNextInt);
            i2++;
            i3++;
        }
        bArr[i3] = bNextInt;
        bArr[i3 + 1] = bNextInt2;
        return bArr;
    }

    public final String k(String str) {
        Calendar calendar = Calendar.getInstance();
        return String.format(str, Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0115 A[PHI: r3
      0x0115: PHI (r3v17 byte) = (r3v14 byte), (r3v25 byte) binds: [B:35:0x0113, B:30:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    public final void l(Location location) {
        byte bearing;
        List<Byte> list;
        byte bValueOf;
        if (location == null) {
            return;
        }
        int longitude = (int) ((location.getLongitude() - this.f1747y.getLongitude()) * 1000000.0d);
        int latitude = (int) ((location.getLatitude() - this.f1747y.getLatitude()) * 1000000.0d);
        int i2 = !location.hasBearing() ? 1 : 0;
        int i3 = !location.hasSpeed() ? 1 : 0;
        char c2 = longitude > 0 ? (char) 0 : (char) 1;
        int iAbs = Math.abs(longitude);
        char c3 = latitude > 0 ? (char) 0 : (char) 1;
        int iAbs2 = Math.abs(latitude);
        if (this.E > 1) {
            this.f1748z = this.f1747y;
        }
        this.f1747y = location;
        if (this.f1748z != null && location.getTime() > this.f1748z.getTime() && this.f1747y.getTime() - this.f1748z.getTime() < 5000) {
            long time = this.f1747y.getTime() - this.f1748z.getTime();
            float[] fArr = new float[2];
            Location.distanceBetween(this.f1747y.getAltitude(), this.f1747y.getLongitude(), this.f1748z.getLatitude(), this.f1748z.getLongitude(), fArr);
            double speed = ((fArr[0] - (this.f1748z.getSpeed() * time)) * 2.0f) / (time * time);
            if (speed > this.f1743u) {
                this.f1743u = (float) speed;
            }
        }
        this.F.add(Byte.valueOf((byte) (iAbs & 255)));
        this.F.add(Byte.valueOf((byte) ((iAbs & 65280) >> 8)));
        this.F.add(Byte.valueOf((byte) (iAbs2 & 255)));
        this.F.add(Byte.valueOf((byte) ((iAbs2 & 65280) >> 8)));
        if (i2 > 0) {
            bearing = c3 > 0 ? (byte) 96 : (byte) 32;
            if (c2 > 0) {
                bearing = (byte) (bearing | (-128));
            }
        } else {
            bearing = (byte) (((byte) (((int) (location.getBearing() / 15.0f)) & 255)) & 31);
            if (c3 > 0) {
                bearing = (byte) (bearing | 64);
            }
            if (c2 > 0) {
                bearing = (byte) (bearing | (-128));
            }
        }
        this.F.add(Byte.valueOf(bearing));
        if (i3 > 0) {
            list = this.F;
            bValueOf = (byte) -128;
        } else {
            byte speed2 = (byte) (((byte) (((int) ((((double) location.getSpeed()) * 3.6d) / 4.0d)) & 255)) & 127);
            list = this.F;
            bValueOf = Byte.valueOf(speed2);
        }
        list.add(bValueOf);
    }

    public final byte[] m(int i2) {
        return new byte[]{(byte) (i2 & 255), (byte) ((65280 & i2) >> 8), (byte) ((16711680 & i2) >> 16), (byte) ((i2 & (-16777216)) >> 24)};
    }

    public final void n() {
        String[] strArrSplit = "9.5.2.1".split("\\.");
        int length = strArrSplit.length;
        byte[] bArr = this.C;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        bArr[3] = 0;
        if (length >= 4) {
            length = 4;
        }
        for (int i2 = 0; i2 < length; i2++) {
            try {
                this.C[i2] = (byte) (Integer.valueOf(strArrSplit[i2]).intValue() & 255);
            } catch (Exception unused) {
            }
        }
        this.D = i(n.b.f3344f + ":" + n.b.g().f3351c);
    }

    public final void o(int i2) {
        if (i2 == 0) {
            return;
        }
        try {
            File file = new File(n.h.f3402a + "/grtcf.dat");
            if (!file.exists()) {
                File file2 = new File(n.h.f3402a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                randomAccessFile.writeInt(0);
                randomAccessFile.seek(8L);
                byte[] bytes = "1980_01_01:0".getBytes();
                randomAccessFile.writeInt(bytes.length);
                randomAccessFile.write(bytes);
                randomAccessFile.seek(200L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.seek(800L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(8L);
            byte[] bytes2 = (k("%d_%02d_%02d") + ":" + i2).getBytes();
            randomAccessFile2.writeInt(bytes2.length);
            randomAccessFile2.write(bytes2);
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    public final void p(Location location) {
        s(location);
        c();
    }

    public final void q(String str) {
        try {
            File file = new File(n.h.f3402a + "/grtcf.dat");
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                int i2 = randomAccessFile.readInt();
                randomAccessFile.seek(8L);
                int i3 = randomAccessFile.readInt();
                if (i3 < 4096) {
                    byte[] bArr = new byte[i3];
                    randomAccessFile.read(bArr, 0, i3);
                    String str2 = new String(bArr);
                    if (str2.contains(k("%d_%02d_%02d")) && str2.contains(":")) {
                        try {
                            String[] strArrSplit = str2.split(":");
                            if (strArrSplit.length > 1) {
                                this.f1736n = Integer.valueOf(strArrSplit[1]).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                for (int i4 = 1; i4 <= i2; i4++) {
                    randomAccessFile.seek(i4 * 2048);
                    int i5 = randomAccessFile.readInt();
                    if (i5 <= 4096) {
                        byte[] bArr2 = new byte[i5];
                        randomAccessFile.read(bArr2, 0, i5);
                        String str3 = new String(bArr2);
                        if (str != null && str3.contains(str)) {
                            t(str3);
                            break;
                        }
                    }
                }
                randomAccessFile.close();
            }
        } catch (Exception unused2) {
        }
    }

    public final void r() {
        List<Byte> list;
        byte b2;
        this.F.add((byte) 0);
        this.F.add((byte) 0);
        if (I.equals("0")) {
            list = this.F;
            b2 = -82;
        } else {
            list = this.F;
            b2 = -66;
        }
        list.add(Byte.valueOf(b2));
        this.F.add((byte) 0);
        this.F.add(Byte.valueOf(this.C[0]));
        this.F.add(Byte.valueOf(this.C[1]));
        this.F.add(Byte.valueOf(this.C[2]));
        this.F.add(Byte.valueOf(this.C[3]));
        int length = this.D.length;
        this.F.add(Byte.valueOf((byte) ((length + 1) & 255)));
        for (int i2 = 0; i2 < length; i2++) {
            this.F.add(Byte.valueOf(this.D[i2]));
        }
    }

    public final void s(Location location) {
        if (System.currentTimeMillis() - this.f1746x < this.f1745w || location == null) {
            return;
        }
        if (location.hasSpeed() && location.getSpeed() > this.f1742t) {
            this.f1742t = location.getSpeed();
        }
        try {
            if (this.F == null) {
                this.F = new ArrayList();
                r();
                e(location);
            } else {
                l(location);
            }
        } catch (Exception unused) {
        }
        this.E++;
    }

    public final void t(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("on")) {
                    this.f1723a = jSONObject.getInt("on");
                }
                if (jSONObject.has("bash")) {
                    this.f1724b = jSONObject.getDouble("bash");
                }
                if (jSONObject.has("net")) {
                    this.f1725c = jSONObject.getString("net");
                }
                if (jSONObject.has("tcon")) {
                    this.f1726d = jSONObject.getInt("tcon");
                }
                if (jSONObject.has("tcsh")) {
                    this.f1727e = jSONObject.getInt("tcsh");
                }
                if (jSONObject.has("per")) {
                    this.f1728f = jSONObject.getInt("per");
                }
                if (jSONObject.has("chdron")) {
                    jSONObject.getInt("chdron");
                }
                if (jSONObject.has("spsh")) {
                    this.f1729g = jSONObject.getDouble("spsh");
                }
                if (jSONObject.has("acsh")) {
                    this.f1730h = jSONObject.getDouble("acsh");
                }
                if (jSONObject.has("stspsh")) {
                    this.f1731i = jSONObject.getDouble("stspsh");
                }
                if (jSONObject.has("drstsh")) {
                    this.f1732j = jSONObject.getInt("drstsh");
                }
                if (jSONObject.has("stper")) {
                    this.f1733k = jSONObject.getInt("stper");
                }
                if (jSONObject.has("nondron")) {
                    this.f1734l = jSONObject.getInt("nondron");
                }
                if (jSONObject.has("nondrper")) {
                    this.f1735m = jSONObject.getInt("nondrper");
                }
                if (jSONObject.has("uptime")) {
                    this.f1737o = jSONObject.getLong("uptime");
                }
                y();
            } catch (JSONException unused) {
            }
        }
    }

    public void u(Location location) {
        if (!this.G) {
            A();
        }
        boolean z2 = ((double) c.c.b().e()) < this.f1724b * 100.0d;
        if (this.f1723a == 1 && z2 && this.f1725c.contains(j.b.a(j.f.M().O()))) {
            if (this.f1726d != 1 || this.f1736n <= this.f1727e) {
                this.B.post(new a(location));
            }
        }
    }

    public final void v(String str) {
        try {
            File file = new File(n.h.f3402a + "/grtcf.dat");
            if (!file.exists()) {
                File file2 = new File(n.h.f3402a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                randomAccessFile.writeInt(0);
                randomAccessFile.seek(8L);
                byte[] bytes = "1980_01_01:0".getBytes();
                randomAccessFile.writeInt(bytes.length);
                randomAccessFile.write(bytes);
                randomAccessFile.seek(200L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.seek(800L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(2L);
            int i2 = randomAccessFile2.readInt();
            int i3 = 1;
            while (i3 <= i2) {
                randomAccessFile2.seek(i3 * 2048);
                int i4 = randomAccessFile2.readInt();
                byte[] bArr = new byte[i4];
                randomAccessFile2.read(bArr, 0, i4);
                if (new String(bArr).contains(n.b.f3344f)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 >= i2) {
                randomAccessFile2.seek(2L);
                randomAccessFile2.writeInt(i3);
            }
            randomAccessFile2.seek(i3 * 2048);
            byte[] bytes2 = str.getBytes();
            randomAccessFile2.writeInt(bytes2.length);
            randomAccessFile2.write(bytes2);
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #3 {Exception -> 0x005c, blocks: (B:25:0x0054, B:27:0x0059), top: B:36:0x0054 }] */
    public final boolean w() throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        Throwable th;
        FileChannel fileChannel = null;
        FileLock fileLockTryLock = null;
        RandomAccessFile randomAccessFile2 = null;
        boolean z2 = false;
        try {
            File file = new File(n.i.I() + File.separator + "gflk.dat");
            if (!file.exists()) {
                file.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (Exception unused) {
                    z2 = true;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                        } catch (Exception unused2) {
                            throw th;
                        }
                    } else if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
                if (fileLockTryLock != null) {
                    try {
                        fileLockTryLock.release();
                    } catch (Exception unused3) {
                    }
                }
                if (channel != null) {
                    channel.close();
                }
            } catch (Exception unused4) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile = randomAccessFile2;
                }
                return z2;
            } catch (Throwable th3) {
                channel = null;
                th = th3;
            }
        } catch (Exception unused5) {
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
        randomAccessFile.close();
        return z2;
    }

    public final boolean x() {
        if (this.f1739q) {
            if (!this.f1740r) {
                if (this.f1742t >= this.f1731i) {
                    return true;
                }
                this.f1740r = true;
                this.f1741s = this.f1728f + 0;
                return true;
            }
            if (this.f1742t >= this.f1731i) {
                this.f1741s = 0;
                this.f1740r = false;
                return true;
            }
            int i2 = this.f1741s + this.f1728f;
            this.f1741s = i2;
            if (i2 <= this.f1732j || System.currentTimeMillis() - this.f1744v > this.f1733k * 1000) {
                return true;
            }
        } else {
            if (this.f1742t >= this.f1729g || this.f1743u >= this.f1730h) {
                this.f1739q = true;
                return true;
            }
            if (this.f1734l == 1 && System.currentTimeMillis() - this.f1744v > this.f1735m * 1000) {
                return true;
            }
        }
        return false;
    }

    public final void y() {
    }

    public final void z() {
        this.F = null;
        this.A = 0L;
        this.E = 0;
        this.f1747y = null;
        this.f1748z = null;
        this.f1742t = 0.0f;
        this.f1743u = 0.0f;
    }
}
