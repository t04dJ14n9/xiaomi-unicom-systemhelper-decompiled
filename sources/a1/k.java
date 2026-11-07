package a1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f55a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f59e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f61g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f56b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f57c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f58d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f60f = -1;

    public k(Context context) {
        this.f55a = context;
    }

    private String b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                boolean zHasTransport = networkCapabilities.hasTransport(1);
                boolean zHasTransport2 = networkCapabilities.hasTransport(0);
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                boolean zHasTransport4 = networkCapabilities.hasTransport(6);
                boolean zHasTransport5 = networkCapabilities.hasTransport(4);
                boolean zHasTransport6 = networkCapabilities.hasTransport(5);
                if (zHasTransport) {
                    return "WIFI";
                }
                if (zHasTransport2) {
                    return "CELLULAR";
                }
                if (zHasTransport3) {
                    return "ETHERNET";
                }
                if (zHasTransport4) {
                    return "LoWPAN";
                }
                if (zHasTransport5) {
                    return "VPN";
                }
                if (zHasTransport6) {
                    return "WifiAware";
                }
            }
            return "wifi";
        } catch (Exception e2) {
            if (d.f36a) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    private static String c(HashMap map) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z2) {
                z2 = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0160 A[Catch: all -> 0x0127, TryCatch #12 {all -> 0x0127, blocks: (B:7:0x002e, B:86:0x012c, B:88:0x0130, B:89:0x0133, B:99:0x015c, B:101:0x0160, B:102:0x0163, B:112:0x018b, B:114:0x018f, B:115:0x0192), top: B:151:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:114:0x018f A[Catch: all -> 0x0127, TryCatch #12 {all -> 0x0127, blocks: (B:7:0x002e, B:86:0x012c, B:88:0x0130, B:89:0x0133, B:99:0x015c, B:101:0x0160, B:102:0x0163, B:112:0x018b, B:114:0x018f, B:115:0x0192), top: B:151:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:145:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0 A[Catch: all -> 0x0102, TryCatch #3 {all -> 0x0102, blocks: (B:44:0x00ac, B:46:0x00b0, B:47:0x00cb), top: B:143:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd A[PHI: r5 r9 r13
      0x00fd: PHI (r5v1 boolean) = (r5v0 boolean), (r5v0 boolean), (r5v0 boolean), (r5v3 boolean) binds: [B:95:0x0157, B:108:0x0185, B:121:0x01b6, B:57:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r9v6 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r9v22 int) binds: [B:95:0x0157, B:108:0x0185, B:121:0x01b6, B:57:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r13v20 'e' java.io.IOException) = 
      (r13v8 'e' java.io.IOException)
      (r13v13 'e' java.io.IOException)
      (r13v18 'e' java.io.IOException)
      (r13v40 'e' java.io.IOException)
     binds: [B:95:0x0157, B:108:0x0185, B:121:0x01b6, B:57:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0130 A[Catch: all -> 0x0127, TryCatch #12 {all -> 0x0127, blocks: (B:7:0x002e, B:86:0x012c, B:88:0x0130, B:89:0x0133, B:99:0x015c, B:101:0x0160, B:102:0x0163, B:112:0x018b, B:114:0x018f, B:115:0x0192), top: B:151:0x002e }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x01fa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00b0, please report this as an issue */
    private void e(HttpsURLConnection httpsURLConnection) throws Throwable {
        BufferedReader bufferedReader;
        d.b("https Post start,url:" + this.f56b);
        if (this.f57c == null) {
            this.f58d = a.b("httpsPost request paramters is null.");
            return;
        }
        int responseCode = -1;
        OutputStream outputStream = null;
        BufferedReader bufferedReader2 = null;
        inputStream = null;
        InputStream inputStream = null;
        OutputStream outputStream2 = null;
        OutputStream outputStream3 = null;
        OutputStream outputStream4 = null;
        boolean z2 = false;
        try {
            try {
                OutputStream outputStream5 = httpsURLConnection.getOutputStream();
                try {
                    try {
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream5, "UTF-8"));
                            bufferedWriter.write(c(this.f57c));
                            d.b(c(this.f57c));
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            httpsURLConnection.connect();
                            try {
                                InputStream inputStream2 = httpsURLConnection.getInputStream();
                                try {
                                    responseCode = httpsURLConnection.getResponseCode();
                                    if (200 == responseCode) {
                                        try {
                                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                                            try {
                                                StringBuffer stringBuffer = new StringBuffer();
                                                while (true) {
                                                    int i2 = bufferedReader.read();
                                                    if (i2 == -1) {
                                                        break;
                                                    } else {
                                                        stringBuffer.append((char) i2);
                                                    }
                                                }
                                                this.f58d = stringBuffer.toString();
                                                bufferedReader2 = bufferedReader;
                                            } catch (IOException e2) {
                                                e = e2;
                                                inputStream = inputStream2;
                                                try {
                                                    if (d.f36a) {
                                                        e.printStackTrace();
                                                        d.b("httpsPost parse failed;" + e.getMessage());
                                                    }
                                                    this.f58d = a.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                                                    if (inputStream != null && bufferedReader != null) {
                                                        bufferedReader.close();
                                                        inputStream.close();
                                                    }
                                                    httpsURLConnection.disconnect();
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (inputStream != null && bufferedReader != null) {
                                                        bufferedReader.close();
                                                        inputStream.close();
                                                    }
                                                    httpsURLConnection.disconnect();
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                if (inputStream != null) {
                                                    bufferedReader.close();
                                                    inputStream.close();
                                                }
                                                httpsURLConnection.disconnect();
                                                throw th;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                            bufferedReader = null;
                                            inputStream = inputStream2;
                                            if (d.f36a) {
                                                e.printStackTrace();
                                                d.b("httpsPost parse failed;" + e.getMessage());
                                            }
                                            this.f58d = a.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                                            if (inputStream != null) {
                                                bufferedReader.close();
                                                inputStream.close();
                                            }
                                            httpsURLConnection.disconnect();
                                            if (outputStream5 != null) {
                                                try {
                                                    outputStream5.close();
                                                } catch (IOException e4) {
                                                    e = e4;
                                                    if (d.f36a) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            }
                                            if (z2) {
                                            }
                                            if (this.f58d == null) {
                                                d.b("httpsPost failed,mResult is null");
                                                this.f58d = a.a(-1, "httpsPost failed,internal error");
                                                return;
                                            } else {
                                                d.b("httpsPost success end,parse result = " + this.f58d);
                                                return;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bufferedReader = null;
                                            inputStream = inputStream2;
                                            if (inputStream != null) {
                                                bufferedReader.close();
                                                inputStream.close();
                                            }
                                            httpsURLConnection.disconnect();
                                            throw th;
                                        }
                                    }
                                    if (inputStream2 != null && bufferedReader2 != null) {
                                        bufferedReader2.close();
                                        inputStream2.close();
                                    }
                                    httpsURLConnection.disconnect();
                                    z2 = true;
                                } catch (IOException e5) {
                                    e = e5;
                                    responseCode = -1;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (IOException e6) {
                                e = e6;
                                responseCode = -1;
                                bufferedReader = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = null;
                            }
                            if (outputStream5 != null) {
                                outputStream5.close();
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            outputStream2 = outputStream5;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e7) {
                                    if (d.f36a) {
                                        e7.printStackTrace();
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (MalformedURLException e8) {
                        e = e8;
                        outputStream3 = outputStream5;
                        if (d.f36a) {
                            e.printStackTrace();
                        }
                        this.f58d = a.a(-11, "httpsPost failed,MalformedURLException:" + e.getMessage());
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e9) {
                                e = e9;
                                if (d.f36a) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        outputStream4 = outputStream5;
                        if (d.f36a) {
                            e.printStackTrace();
                        }
                        this.f58d = a.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                        if (outputStream4 != null) {
                            try {
                                outputStream4.close();
                            } catch (IOException e11) {
                                e = e11;
                                if (d.f36a) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        outputStream = outputStream5;
                        if (d.f36a) {
                            e.printStackTrace();
                        }
                        this.f58d = a.a(-11, "httpsPost failed,Exception:" + e.getMessage());
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e13) {
                                e = e13;
                                if (d.f36a) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (MalformedURLException e14) {
                    e = e14;
                    outputStream3 = outputStream5;
                    if (d.f36a) {
                        e.printStackTrace();
                    }
                    this.f58d = a.a(-11, "httpsPost failed,MalformedURLException:" + e.getMessage());
                    if (outputStream3 != null) {
                        outputStream3.close();
                    }
                } catch (IOException e15) {
                    e = e15;
                    outputStream4 = outputStream5;
                    if (d.f36a) {
                        e.printStackTrace();
                    }
                    this.f58d = a.a(-11, "httpsPost failed,IOException:" + e.getMessage());
                    if (outputStream4 != null) {
                        outputStream4.close();
                    }
                } catch (Exception e16) {
                    e = e16;
                    outputStream = outputStream5;
                    if (d.f36a) {
                        e.printStackTrace();
                    }
                    this.f58d = a.a(-11, "httpsPost failed,Exception:" + e.getMessage());
                    if (outputStream != null) {
                        outputStream.close();
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (MalformedURLException e17) {
            e = e17;
        } catch (IOException e18) {
            e = e18;
        } catch (Exception e19) {
            e = e19;
        }
        if (z2 || 200 == responseCode) {
            if (this.f58d == null) {
                d.b("httpsPost failed,mResult is null");
                this.f58d = a.a(-1, "httpsPost failed,internal error");
                return;
            } else {
                d.b("httpsPost success end,parse result = " + this.f58d);
                return;
            }
        }
        d.b("httpsPost failed,statusCode:" + responseCode);
        this.f58d = a.a(-11, "httpsPost failed,statusCode:" + responseCode);
    }

    private HashMap h(HashMap map) {
        HashMap map2 = new HashMap();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String string = ((String) it.next()).toString();
            map2.put(string, map.get(string));
        }
        return map2;
    }

    private HttpsURLConnection i() {
        String str;
        URLConnection uRLConnectionOpenConnection;
        try {
            URL url = new URL(this.f56b);
            d.b("https URL: " + this.f56b);
            String strB = b(this.f55a);
            if (strB != null && !strB.equals("")) {
                if (TextUtils.isEmpty(this.f59e) || this.f60f == -1) {
                    d.b("checkNetwork = " + strB);
                    if ("cmwap".equals(strB)) {
                        uRLConnectionOpenConnection = url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.172", 80)));
                    } else {
                        uRLConnectionOpenConnection = "ctwap".equals(strB) ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection();
                    }
                } else {
                    d.b("Proxy mProxyHost: = " + this.f59e + " mProxyPort: " + this.f60f);
                    Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(this.f59e, this.f60f));
                    Authenticator.setDefault(new l(this));
                    uRLConnectionOpenConnection = url.openConnection(proxy);
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setHostnameVerifier(new m(this));
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setConnectTimeout(50000);
                httpsURLConnection.setReadTimeout(50000);
                return httpsURLConnection;
            }
            d.d("Current network is not available.");
            this.f58d = a.a(-10, "Current network is not available.");
            return null;
        } catch (MalformedURLException e2) {
            if (d.f36a) {
                e2.printStackTrace();
                d.b(e2.getMessage());
            }
            str = "Auth server could not be parsed as a URL.";
            this.f58d = a.a(-11, str);
            return null;
        } catch (Exception e3) {
            if (d.f36a) {
                e3.printStackTrace();
                d.b(e3.getMessage());
            }
            str = "Init httpsurlconnection failed.";
            this.f58d = a.a(-11, str);
            return null;
        }
    }

    protected String d(HashMap map, String str, int i2, String str2, String str3) throws Throwable {
        HashMap mapH = h(map);
        this.f57c = mapH;
        this.f56b = (String) mapH.get("url");
        this.f59e = str;
        this.f60f = i2;
        this.f61g = str2;
        this.f62h = str3;
        HttpsURLConnection httpsURLConnectionI = i();
        if (httpsURLConnectionI == null) {
            d.d("syncConnect failed,httpsURLConnection is null");
        } else {
            e(httpsURLConnectionI);
        }
        return this.f58d;
    }

    protected boolean f() {
        NetworkCapabilities networkCapabilities;
        d.b("checkNetwork start");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f55a.getSystemService("connectivity");
            return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        } catch (Exception e2) {
            if (d.f36a) {
                e2.printStackTrace();
            }
            return false;
        }
    }
}
