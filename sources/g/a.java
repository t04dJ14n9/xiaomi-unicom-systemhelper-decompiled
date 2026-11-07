package g;

import android.content.Context;
import android.location.Location;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import n.i;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static a f2561k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f2562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2563b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f2566e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2564c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2567f = "gcj02";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2568g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f2571j = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap<String, e> f2569h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap<String, double[][]> f2570i = new HashMap<>();

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    public class C0026a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2572a;

        public C0026a(String str) {
            this.f2572a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.n(this.f2572a));
            sb.append("_");
            return str.startsWith(sb.toString());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f2574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f2575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f2576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f2577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f2578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f2579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f2580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f2581h;

        public b(String str) {
            a(str);
        }

        public void a(String str) {
            String[] strArrSplit = str.trim().split("\\|");
            this.f2574a = Double.valueOf(strArrSplit[0]).doubleValue();
            this.f2575b = Double.valueOf(strArrSplit[1]).doubleValue();
            this.f2576c = Double.valueOf(strArrSplit[2]).doubleValue();
            this.f2577d = Double.valueOf(strArrSplit[3]).doubleValue();
            this.f2578e = Double.valueOf(strArrSplit[4]).doubleValue();
            this.f2579f = Double.valueOf(strArrSplit[5]).doubleValue();
            this.f2580g = Double.valueOf(strArrSplit[6]).doubleValue();
            this.f2581h = Double.valueOf(strArrSplit[7]).doubleValue();
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2583c;

        public c(String str, String str2) {
            this.f2582b = str;
            this.f2583c = str2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String str;
            String str2;
            boolean zW;
            try {
                File file = new File(a.this.f2565d);
                if (!file.exists() || !file.isDirectory()) {
                    file.mkdirs();
                }
                HttpsURLConnection.setDefaultSSLSocketFactory(i.G());
                URL url = new URL(n.d.f3358d);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setHostnameVerifier(new f(url));
                httpsURLConnection.addRequestProperty("Accept-encoding", "gzip");
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                StringBuilder sb = new StringBuilder();
                sb.append("bldg=");
                sb.append(this.f2582b);
                sb.append("&md5=");
                String str3 = this.f2583c;
                if (str3 == null) {
                    str3 = "null";
                }
                sb.append(str3);
                outputStream.write(sb.toString().getBytes());
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpsURLConnection.getHeaderField("Hash");
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    File file2 = new File(file, a.this.o(this.f2582b, headerField));
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 < 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i2);
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    if (a.e(file2).equalsIgnoreCase(headerField)) {
                        a.this.j(this.f2582b, this.f2583c);
                        a.this.f2563b = this.f2582b;
                        zW = a.this.w();
                        str = "OK";
                    } else {
                        file2.delete();
                        str2 = "Download failed";
                        str = str2;
                        zW = false;
                    }
                } else if (responseCode == 304) {
                    a.this.f2563b = this.f2582b;
                    zW = a.this.w();
                    str = "No roadnet update for " + this.f2582b + "," + this.f2583c;
                } else {
                    if (responseCode == 204) {
                        str2 = "Not found bldg " + this.f2582b;
                        a.this.f2568g = true;
                        str = str2;
                    } else {
                        str = null;
                    }
                    zW = false;
                }
                if (a.this.f2562a != null) {
                    a.this.f2562a.a(zW, str);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            a.this.f2564c = false;
        }
    }

    public interface d {
        void a(boolean z2, String str);
    }

    public static class e implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2585b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b f2587d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f2589f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public short[][] f2591h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2586c = "0|3";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f2588e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f2590g = this.f2588e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f2592i = "gcj02";

        public e(String str) {
        }

        public double a(double d2) {
            b bVar = this.f2590g;
            return (d2 + bVar.f2579f) * bVar.f2578e;
        }

        public b b() {
            return this.f2590g;
        }

        public void c(String str) {
            String[] strArrSplit = str.split("\\t");
            this.f2585b = strArrSplit[1];
            this.f2587d = new b(strArrSplit[2]);
            this.f2589f = new b(strArrSplit[3]);
            b bVar = new b(strArrSplit[4]);
            this.f2588e = bVar;
            this.f2590g = bVar;
            this.f2591h = (short[][]) Array.newInstance((Class<?>) Short.TYPE, (int) bVar.f2580g, (int) bVar.f2581h);
            for (int i2 = 0; i2 < this.f2590g.f2580g; i2++) {
                int i3 = 0;
                while (true) {
                    double d2 = i3;
                    double d3 = this.f2590g.f2581h;
                    if (d2 < d3) {
                        this.f2591h[i2][i3] = (short) (strArrSplit[5].charAt((((int) d3) * i2) + i3) - '0');
                        i3++;
                    }
                }
            }
            if (strArrSplit.length >= 7) {
                this.f2586c = strArrSplit[6];
            }
        }

        public double d(double d2) {
            b bVar = this.f2590g;
            return (d2 + bVar.f2577d) * bVar.f2576c;
        }

        public void e(String str) {
            b bVar;
            if (str != null) {
                String lowerCase = str.toLowerCase();
                this.f2592i = lowerCase;
                if (lowerCase.startsWith("wgs84")) {
                    bVar = this.f2587d;
                } else if (this.f2592i.startsWith("bd09")) {
                    bVar = this.f2589f;
                } else if (!this.f2592i.startsWith("gcj02")) {
                    return;
                } else {
                    bVar = this.f2588e;
                }
                this.f2590g = bVar;
            }
        }

        public double f(double d2) {
            b bVar = this.f2590g;
            return (d2 / bVar.f2576c) - bVar.f2577d;
        }

        public double g(double d2) {
            b bVar = this.f2590g;
            return (d2 / bVar.f2578e) - bVar.f2579f;
        }
    }

    public static class f implements HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URL f2593a;

        public f(URL url) {
            this.f2593a = url;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return this.f2593a.getHost().equals(str);
        }
    }

    public a(Context context) {
        this.f2565d = "rn";
        this.f2565d = new File(context.getCacheDir(), this.f2565d).getAbsolutePath();
    }

    public static a a(Context context) {
        if (f2561k == null) {
            f2561k = new a(context);
        }
        return f2561k;
    }

    public static String e(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(map);
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            fileInputStream.close();
            for (int length = 32 - string.length(); length > 0; length--) {
                string = "0" + string;
            }
            return string;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static a t() {
        return f2561k;
    }

    public final boolean A(String str) {
        File fileX = x(str);
        return fileX.exists() && fileX.length() > 0;
    }

    public final boolean B(String str) {
        return System.currentTimeMillis() - x(str).lastModified() > 1296000000;
    }

    public final void C(String str) {
        String[] strArrSplit = str.split("\\t");
        String lowerCase = strArrSplit[1].split("_")[1].toLowerCase();
        try {
            if (this.f2569h.containsKey(lowerCase)) {
                ArrayList<Double> arrayListU = u(strArrSplit[5]);
                int length = this.f2569h.get(lowerCase).f2591h.length;
                int length2 = this.f2569h.get(lowerCase).f2591h[0].length;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    for (int i4 = 0; i4 < length2; i4++) {
                        if (this.f2569h.get(lowerCase).f2591h[i3][i4] <= 0 || this.f2569h.get(lowerCase).f2591h[i3][i4] == 9) {
                            dArr[i3][i4] = 0.0d;
                        } else {
                            dArr[i3][i4] = arrayListU.get(i2).doubleValue();
                            i2++;
                        }
                    }
                }
                this.f2570i.put(lowerCase.toLowerCase(), dArr);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void D(String str) {
        this.f2567f = str;
    }

    public void f() {
        this.f2569h.clear();
        this.f2570i.clear();
        this.f2563b = null;
        this.f2564c = false;
    }

    public void g(double d2, double d3) {
        if (this.f2571j == null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            Location.distanceBetween(d3, d2, d3, d2 + 0.01d, fArr);
            double d4 = ((double) fArr[0]) / 0.01d;
            Location.distanceBetween(d3, d2, d3 + 0.01d, d2, fArr2);
            double d5 = ((double) fArr2[0]) / 0.01d;
            e eVar = new e("outdoor");
            this.f2571j = eVar;
            eVar.f2585b = "out";
            eVar.f2590g = new b("0|1.0|" + d4 + "|" + (-d2) + "|" + d5 + "|" + (-d3) + "|0|0");
        }
    }

    public final void h(String str) {
        if (this.f2564c) {
            return;
        }
        this.f2564c = true;
        c cVar = new c(str, v(str));
        this.f2566e = cVar;
        cVar.start();
    }

    public void i(String str, d dVar) {
        String str2 = this.f2563b;
        if ((str2 == null || !str.equals(str2)) && !this.f2568g) {
            this.f2562a = dVar;
            if (!A(str) || B(str)) {
                h(str);
                return;
            }
            this.f2563b = str;
            w();
            d dVar2 = this.f2562a;
            if (dVar2 != null) {
                dVar2.a(true, "OK");
            }
        }
    }

    public final void j(String str, String str2) {
        try {
            File file = new File(this.f2565d + "/" + o(str, str2));
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public e l() {
        return this.f2571j;
    }

    public final String n(String str) {
        return str;
    }

    public final String o(String str, String str2) {
        return n(str) + "_" + str2;
    }

    public final ArrayList<Double> u(String str) {
        double dDoubleValue;
        ArrayList<Double> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) == ',') {
                int i3 = i2 + 1;
                i2 += 2;
                dDoubleValue = Integer.valueOf(str.substring(i3, i2)).intValue();
            } else if (str.charAt(i2) == '.') {
                int i4 = i2 + 1;
                i2 += 4;
                dDoubleValue = Double.valueOf(str.substring(i4, i2)).doubleValue();
            } else {
                int i5 = i2 + 2;
                double dIntValue = Integer.valueOf(str.substring(i2, i5)).intValue();
                i2 = i5;
                dDoubleValue = dIntValue;
            }
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public final String v(String str) {
        File file = new File(this.f2565d);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles(new C0026a(str));
            if (fileArrListFiles != null && fileArrListFiles.length == 1) {
                String[] strArrSplit = fileArrListFiles[0].getName().split("_");
                if (strArrSplit.length < 2) {
                    return null;
                }
                return strArrSplit[1];
            }
            for (int i2 = 0; fileArrListFiles != null && i2 < fileArrListFiles.length; i2++) {
                fileArrListFiles[i2].delete();
            }
        }
        return null;
    }

    public final boolean w() {
        String str = this.f2563b;
        if (str == null) {
            return false;
        }
        File fileX = x(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!g.c.a(fileX, byteArrayOutputStream)) {
            return false;
        }
        this.f2569h.clear();
        this.f2570i.clear();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.split("\\t")[1].split("_")[0].equals("geo")) {
                    C(line);
                } else {
                    e eVar = new e(this.f2563b);
                    eVar.c(line);
                    eVar.e(this.f2567f);
                    this.f2569h.put(eVar.f2585b.toLowerCase(), eVar);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        bufferedReader.close();
        return true;
    }

    public final File x(String str) {
        return new File(this.f2565d + "/" + o(str, v(str)));
    }

    public double[][] y(String str) {
        return this.f2570i.get(str.toLowerCase());
    }

    public e z(String str) {
        return this.f2569h.get(str.toLowerCase());
    }
}
