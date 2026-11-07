package n;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import b.q;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f3378i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3379a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3380b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3381c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f3382d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f3383e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3384f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3385g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3386h;

    public class a implements q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f3387a;

        public a(long j2) {
            this.f3387a = j2;
        }

        @Override // b.q.a
        public void a(int i2, String str) {
            g gVar = g.this;
            gVar.f3381c = null;
            gVar.h(false);
        }

        @Override // b.q.a
        public void b(int i2, String str) {
            g gVar;
            boolean z2;
            if (i2 == 200) {
                g.this.f3386h = System.currentTimeMillis() - this.f3387a;
                gVar = g.this;
                gVar.f3381c = str;
                z2 = true;
            } else {
                gVar = g.this;
                gVar.f3381c = null;
                z2 = false;
            }
            gVar.h(z2);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f3390c;

        public b(String str, boolean z2) {
            this.f3389b = str;
            this.f3390c = z2;
        }

        /* JADX WARN: Code duplicated, block: B:114:0x01c1 A[LOOP:0: B:3:0x001a->B:114:0x01c1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:118:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:133:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:134:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:141:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01b2 A[EXC_TOP_SPLITTER, PHI: r11 r13
          0x01b2: PHI (r11v5 javax.net.ssl.HttpsURLConnection) = (r11v4 javax.net.ssl.HttpsURLConnection), (r11v7 javax.net.ssl.HttpsURLConnection) binds: [B:105:0x01b0, B:89:0x018c] A[DONT_GENERATE, DONT_INLINE]
          0x01b2: PHI (r13v3 java.io.ByteArrayOutputStream) = (r13v2 java.io.ByteArrayOutputStream), (r13v4 java.io.ByteArrayOutputStream) binds: [B:105:0x01b0, B:89:0x018c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:151:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:155:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:176:0x01e8 A[EDGE_INSN: B:176:0x01e8->B:132:0x01e8 BREAK  A[LOOP:0: B:3:0x001a->B:114:0x01c1], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:179:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x0177  */
        /* JADX WARN: Code duplicated, block: B:96:0x019b  */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            OutputStream outputStream;
            OutputStream outputStream2;
            OutputStream outputStream3;
            InputStream inputStream;
            OutputStream outputStream4;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            boolean z2;
            g gVar = g.this;
            gVar.f3379a = n.d.f3356b;
            gVar.a();
            HttpsURLConnection httpsURLConnection = null;
            for (int i2 = g.this.f3380b; i2 > 0; i2--) {
                try {
                    URL url = new URL(g.this.f3379a);
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Map.Entry<String, Object> entry : g.this.f3382d.entrySet()) {
                        stringBuffer.append(entry.getKey());
                        stringBuffer.append("=");
                        stringBuffer.append(entry.getValue());
                        stringBuffer.append("&");
                    }
                    if (stringBuffer.length() > 0) {
                        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    }
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
                    try {
                        httpsURLConnection2.setRequestMethod("POST");
                        httpsURLConnection2.setDoInput(true);
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setUseCaches(false);
                        httpsURLConnection2.setConnectTimeout(n.a.f3341a);
                        httpsURLConnection2.setReadTimeout(n.a.f3341a);
                        httpsURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
                        httpsURLConnection2.setRequestProperty("Accept-Charset", "UTF-8");
                        httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                        String str = i.f3432o0;
                        if (str != null) {
                            httpsURLConnection2.setRequestProperty("bd-loc-android", str);
                        }
                        if (!TextUtils.isEmpty(this.f3389b)) {
                            httpsURLConnection2.setRequestProperty("Host", this.f3389b);
                        }
                        outputStream4 = httpsURLConnection2.getOutputStream();
                        try {
                            outputStream4.write(stringBuffer.toString().getBytes());
                            outputStream4.flush();
                            if (httpsURLConnection2.getResponseCode() == 200) {
                                inputStream = httpsURLConnection2.getInputStream();
                                try {
                                    String contentEncoding = httpsURLConnection2.getContentEncoding();
                                    if (contentEncoding != null && contentEncoding.contains("gzip")) {
                                        inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            try {
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i3 = inputStream.read(bArr);
                                                    if (i3 == -1) {
                                                        break;
                                                    } else {
                                                        byteArrayOutputStream.write(bArr, 0, i3);
                                                    }
                                                }
                                                g.this.f3381c = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                                if (this.f3390c) {
                                                    g.this.f3383e = byteArrayOutputStream.toByteArray();
                                                }
                                                g.this.h(true);
                                                z2 = true;
                                            } catch (Throwable th) {
                                                th = th;
                                                byteArrayOutputStream2 = byteArrayOutputStream;
                                                if (httpsURLConnection2 != null) {
                                                    httpsURLConnection2.disconnect();
                                                }
                                                if (outputStream4 != null) {
                                                    try {
                                                        outputStream4.close();
                                                    } catch (Exception unused) {
                                                        Log.d("baidu_location_service", "close os IOException!");
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception unused2) {
                                                        Log.d("baidu_location_service", "close is IOException!");
                                                    }
                                                }
                                                if (byteArrayOutputStream2 == null) {
                                                    throw th;
                                                }
                                                try {
                                                    byteArrayOutputStream2.close();
                                                    throw th;
                                                } catch (Exception unused3) {
                                                    Log.d("baidu_location_service", "close baos IOException!");
                                                    throw th;
                                                }
                                            }
                                        } catch (Error unused4) {
                                            Log.d("baidu_location_service", "NetworkCommunicationError!");
                                            if (httpsURLConnection2 != null) {
                                                httpsURLConnection2.disconnect();
                                            }
                                            if (outputStream4 != null) {
                                                try {
                                                    outputStream4.close();
                                                } catch (Exception unused5) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused6) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                } catch (Exception unused7) {
                                                    z2 = false;
                                                    Log.d("baidu_location_service", "close baos IOException!");
                                                    httpsURLConnection = httpsURLConnection2;
                                                }
                                            }
                                            httpsURLConnection = httpsURLConnection2;
                                            z2 = false;
                                        } catch (Exception unused8) {
                                            Log.d("baidu_location_service", "NetworkCommunicationException!");
                                            if (httpsURLConnection2 != null) {
                                                httpsURLConnection2.disconnect();
                                            }
                                            if (outputStream4 != null) {
                                                try {
                                                    outputStream4.close();
                                                } catch (Exception unused9) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused10) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            httpsURLConnection = httpsURLConnection2;
                                            z2 = false;
                                        }
                                    } catch (Error unused11) {
                                        byteArrayOutputStream = null;
                                    } catch (Exception unused12) {
                                        byteArrayOutputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream2 = null;
                                        if (httpsURLConnection2 != null) {
                                            httpsURLConnection2.disconnect();
                                        }
                                        if (outputStream4 != null) {
                                            outputStream4.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (byteArrayOutputStream2 == null) {
                                            throw th;
                                        }
                                        byteArrayOutputStream2.close();
                                        throw th;
                                    }
                                } catch (Error unused13) {
                                    outputStream3 = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    byteArrayOutputStream = null;
                                    outputStream4 = outputStream3;
                                    Log.d("baidu_location_service", "NetworkCommunicationError!");
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    httpsURLConnection = httpsURLConnection2;
                                    z2 = false;
                                    if (z2) {
                                        break;
                                        if (i2 > 0) {
                                            g.f3378i = 0;
                                            return;
                                        }
                                        g.f3378i++;
                                        g gVar2 = g.this;
                                        gVar2.f3381c = null;
                                        gVar2.h(false);
                                    }
                                } catch (Exception unused14) {
                                    outputStream2 = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    byteArrayOutputStream = null;
                                    outputStream4 = outputStream2;
                                    Log.d("baidu_location_service", "NetworkCommunicationException!");
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    httpsURLConnection = httpsURLConnection2;
                                    z2 = false;
                                    if (z2) {
                                        break;
                                        if (i2 > 0) {
                                            g.f3378i = 0;
                                            return;
                                        }
                                        g.f3378i++;
                                        g gVar3 = g.this;
                                        gVar3.f3381c = null;
                                        gVar3.h(false);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    outputStream = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    outputStream4 = outputStream;
                                    byteArrayOutputStream2 = null;
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream2 == null) {
                                        throw th;
                                    }
                                    byteArrayOutputStream2.close();
                                    throw th;
                                }
                            } else {
                                z2 = false;
                                inputStream = null;
                                byteArrayOutputStream = null;
                            }
                            httpsURLConnection2.disconnect();
                            try {
                                outputStream4.close();
                            } catch (Exception unused15) {
                                Log.d("baidu_location_service", "close os IOException!");
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused16) {
                                    Log.d("baidu_location_service", "close is IOException!");
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused17) {
                                    Log.d("baidu_location_service", "close baos IOException!");
                                }
                            }
                            httpsURLConnection = httpsURLConnection2;
                        } catch (Error unused18) {
                            outputStream3 = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            byteArrayOutputStream = null;
                            outputStream4 = outputStream3;
                            Log.d("baidu_location_service", "NetworkCommunicationError!");
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            httpsURLConnection = httpsURLConnection2;
                            z2 = false;
                            if (z2) {
                                break;
                                if (i2 > 0) {
                                    g.f3378i = 0;
                                    return;
                                }
                                g.f3378i++;
                                g gVar4 = g.this;
                                gVar4.f3381c = null;
                                gVar4.h(false);
                            }
                        } catch (Exception unused19) {
                            outputStream2 = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            byteArrayOutputStream = null;
                            outputStream4 = outputStream2;
                            Log.d("baidu_location_service", "NetworkCommunicationException!");
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            httpsURLConnection = httpsURLConnection2;
                            z2 = false;
                            if (z2) {
                                break;
                                if (i2 > 0) {
                                    g.f3378i = 0;
                                    return;
                                }
                                g.f3378i++;
                                g gVar5 = g.this;
                                gVar5.f3381c = null;
                                gVar5.h(false);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            outputStream4 = outputStream;
                            byteArrayOutputStream2 = null;
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream2 == null) {
                                throw th;
                            }
                            byteArrayOutputStream2.close();
                            throw th;
                        }
                    } catch (Error unused20) {
                        httpsURLConnection = httpsURLConnection2;
                        outputStream3 = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        byteArrayOutputStream = null;
                        outputStream4 = outputStream3;
                        Log.d("baidu_location_service", "NetworkCommunicationError!");
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        httpsURLConnection = httpsURLConnection2;
                        z2 = false;
                        if (z2) {
                            break;
                            if (i2 > 0) {
                                g.f3378i = 0;
                                return;
                            }
                            g.f3378i++;
                            g gVar6 = g.this;
                            gVar6.f3381c = null;
                            gVar6.h(false);
                        }
                    } catch (Exception unused21) {
                        httpsURLConnection = httpsURLConnection2;
                        outputStream2 = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        byteArrayOutputStream = null;
                        outputStream4 = outputStream2;
                        Log.d("baidu_location_service", "NetworkCommunicationException!");
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        httpsURLConnection = httpsURLConnection2;
                        z2 = false;
                        if (z2) {
                            break;
                            if (i2 > 0) {
                                g.f3378i = 0;
                                return;
                            }
                            g.f3378i++;
                            g gVar7 = g.this;
                            gVar7.f3381c = null;
                            gVar7.h(false);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpsURLConnection = httpsURLConnection2;
                        outputStream = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        outputStream4 = outputStream;
                        byteArrayOutputStream2 = null;
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream2 == null) {
                            throw th;
                        }
                        byteArrayOutputStream2.close();
                        throw th;
                    }
                } catch (Error unused22) {
                } catch (Exception unused23) {
                } catch (Throwable th6) {
                    th = th6;
                }
                if (z2) {
                    break;
                }
            }
            if (i2 > 0) {
                g.f3378i = 0;
                return;
            }
            g.f3378i++;
            g gVar8 = g.this;
            gVar8.f3381c = null;
            gVar8.h(false);
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f3393c;

        public c(String str, boolean z2) {
            this.f3392b = str;
            this.f3393c = z2;
        }

        /* JADX WARN: Code duplicated, block: B:114:0x01d0 A[LOOP:0: B:3:0x001a->B:114:0x01d0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:118:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:133:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:134:0x0208  */
        /* JADX WARN: Code duplicated, block: B:141:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:163:0x01c1 A[EXC_TOP_SPLITTER, PHI: r12 r13
          0x01c1: PHI (r12v3 java.io.ByteArrayOutputStream) = (r12v2 java.io.ByteArrayOutputStream), (r12v4 java.io.ByteArrayOutputStream) binds: [B:105:0x01bf, B:89:0x019b] A[DONT_GENERATE, DONT_INLINE]
          0x01c1: PHI (r13v5 javax.net.ssl.HttpsURLConnection) = (r13v4 javax.net.ssl.HttpsURLConnection), (r13v7 javax.net.ssl.HttpsURLConnection) binds: [B:105:0x01bf, B:89:0x019b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:176:0x01f7 A[EDGE_INSN: B:176:0x01f7->B:132:0x01f7 BREAK  A[LOOP:0: B:3:0x001a->B:114:0x01d0], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:179:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x0186  */
        /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            OutputStream outputStream;
            OutputStream outputStream2;
            OutputStream outputStream3;
            InputStream inputStream;
            OutputStream outputStream4;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            boolean z2;
            g gVar = g.this;
            gVar.f3379a = n.d.f3356b;
            gVar.a();
            HttpsURLConnection httpsURLConnection = null;
            for (int i2 = g.this.f3380b; i2 > 0; i2--) {
                try {
                    HttpsURLConnection.setDefaultSSLSocketFactory(i.G());
                    URL url = new URL(g.this.f3379a);
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Map.Entry<String, Object> entry : g.this.f3382d.entrySet()) {
                        stringBuffer.append(entry.getKey());
                        stringBuffer.append("=");
                        stringBuffer.append(entry.getValue());
                        stringBuffer.append("&");
                    }
                    if (stringBuffer.length() > 0) {
                        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    }
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
                    try {
                        httpsURLConnection2.setRequestMethod("POST");
                        httpsURLConnection2.setDoInput(true);
                        httpsURLConnection2.setDoOutput(true);
                        httpsURLConnection2.setUseCaches(false);
                        httpsURLConnection2.setConnectTimeout(n.a.f3341a);
                        httpsURLConnection2.setReadTimeout(n.a.f3341a);
                        httpsURLConnection2.setHostnameVerifier(new C0040g(url));
                        httpsURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
                        httpsURLConnection2.setRequestProperty("Accept-Charset", "UTF-8");
                        httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                        String str = i.f3432o0;
                        if (str != null) {
                            httpsURLConnection2.setRequestProperty("bd-loc-android", str);
                        }
                        if (!TextUtils.isEmpty(this.f3392b)) {
                            httpsURLConnection2.setRequestProperty("Host", this.f3392b);
                        }
                        outputStream4 = httpsURLConnection2.getOutputStream();
                        try {
                            outputStream4.write(stringBuffer.toString().getBytes());
                            outputStream4.flush();
                            if (httpsURLConnection2.getResponseCode() == 200) {
                                inputStream = httpsURLConnection2.getInputStream();
                                try {
                                    String contentEncoding = httpsURLConnection2.getContentEncoding();
                                    if (contentEncoding != null && contentEncoding.contains("gzip")) {
                                        inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            try {
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i3 = inputStream.read(bArr);
                                                    if (i3 == -1) {
                                                        break;
                                                    } else {
                                                        byteArrayOutputStream.write(bArr, 0, i3);
                                                    }
                                                }
                                                g.this.f3381c = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                                if (this.f3393c) {
                                                    g.this.f3383e = byteArrayOutputStream.toByteArray();
                                                }
                                                g.this.h(true);
                                                z2 = true;
                                            } catch (Throwable th) {
                                                th = th;
                                                byteArrayOutputStream2 = byteArrayOutputStream;
                                                if (httpsURLConnection2 != null) {
                                                    httpsURLConnection2.disconnect();
                                                }
                                                if (outputStream4 != null) {
                                                    try {
                                                        outputStream4.close();
                                                    } catch (Exception unused) {
                                                        Log.d("baidu_location_service", "close os IOException!");
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception unused2) {
                                                        Log.d("baidu_location_service", "close is IOException!");
                                                    }
                                                }
                                                if (byteArrayOutputStream2 == null) {
                                                    throw th;
                                                }
                                                try {
                                                    byteArrayOutputStream2.close();
                                                    throw th;
                                                } catch (Exception unused3) {
                                                    Log.d("baidu_location_service", "close baos IOException!");
                                                    throw th;
                                                }
                                            }
                                        } catch (Error unused4) {
                                            Log.d("baidu_location_service", "NetworkCommunicationError!");
                                            if (httpsURLConnection2 != null) {
                                                httpsURLConnection2.disconnect();
                                            }
                                            if (outputStream4 != null) {
                                                try {
                                                    outputStream4.close();
                                                } catch (Exception unused5) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused6) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                } catch (Exception unused7) {
                                                    z2 = false;
                                                    Log.d("baidu_location_service", "close baos IOException!");
                                                    httpsURLConnection = httpsURLConnection2;
                                                }
                                            }
                                            httpsURLConnection = httpsURLConnection2;
                                            z2 = false;
                                        } catch (Exception unused8) {
                                            Log.d("baidu_location_service", "NetworkCommunicationException!");
                                            if (httpsURLConnection2 != null) {
                                                httpsURLConnection2.disconnect();
                                            }
                                            if (outputStream4 != null) {
                                                try {
                                                    outputStream4.close();
                                                } catch (Exception unused9) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused10) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            httpsURLConnection = httpsURLConnection2;
                                            z2 = false;
                                        }
                                    } catch (Error unused11) {
                                        byteArrayOutputStream = null;
                                    } catch (Exception unused12) {
                                        byteArrayOutputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream2 = null;
                                        if (httpsURLConnection2 != null) {
                                            httpsURLConnection2.disconnect();
                                        }
                                        if (outputStream4 != null) {
                                            outputStream4.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (byteArrayOutputStream2 == null) {
                                            throw th;
                                        }
                                        byteArrayOutputStream2.close();
                                        throw th;
                                    }
                                } catch (Error unused13) {
                                    outputStream3 = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    byteArrayOutputStream = null;
                                    outputStream4 = outputStream3;
                                    Log.d("baidu_location_service", "NetworkCommunicationError!");
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    httpsURLConnection = httpsURLConnection2;
                                    z2 = false;
                                    if (z2) {
                                        break;
                                        if (i2 > 0) {
                                            g.f3378i = 0;
                                            return;
                                        }
                                        g.f3378i++;
                                        g gVar2 = g.this;
                                        gVar2.f3381c = null;
                                        gVar2.h(false);
                                    }
                                } catch (Exception unused14) {
                                    outputStream2 = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    byteArrayOutputStream = null;
                                    outputStream4 = outputStream2;
                                    Log.d("baidu_location_service", "NetworkCommunicationException!");
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    httpsURLConnection = httpsURLConnection2;
                                    z2 = false;
                                    if (z2) {
                                        break;
                                        if (i2 > 0) {
                                            g.f3378i = 0;
                                            return;
                                        }
                                        g.f3378i++;
                                        g gVar3 = g.this;
                                        gVar3.f3381c = null;
                                        gVar3.h(false);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    outputStream = outputStream4;
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection2 = httpsURLConnection;
                                    outputStream4 = outputStream;
                                    byteArrayOutputStream2 = null;
                                    if (httpsURLConnection2 != null) {
                                        httpsURLConnection2.disconnect();
                                    }
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream2 == null) {
                                        throw th;
                                    }
                                    byteArrayOutputStream2.close();
                                    throw th;
                                }
                            } else {
                                z2 = false;
                                inputStream = null;
                                byteArrayOutputStream = null;
                            }
                            httpsURLConnection2.disconnect();
                            try {
                                outputStream4.close();
                            } catch (Exception unused15) {
                                Log.d("baidu_location_service", "close os IOException!");
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused16) {
                                    Log.d("baidu_location_service", "close is IOException!");
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused17) {
                                    Log.d("baidu_location_service", "close baos IOException!");
                                }
                            }
                            httpsURLConnection = httpsURLConnection2;
                        } catch (Error unused18) {
                            outputStream3 = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            byteArrayOutputStream = null;
                            outputStream4 = outputStream3;
                            Log.d("baidu_location_service", "NetworkCommunicationError!");
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            httpsURLConnection = httpsURLConnection2;
                            z2 = false;
                            if (z2) {
                                break;
                                if (i2 > 0) {
                                    g.f3378i = 0;
                                    return;
                                }
                                g.f3378i++;
                                g gVar4 = g.this;
                                gVar4.f3381c = null;
                                gVar4.h(false);
                            }
                        } catch (Exception unused19) {
                            outputStream2 = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            byteArrayOutputStream = null;
                            outputStream4 = outputStream2;
                            Log.d("baidu_location_service", "NetworkCommunicationException!");
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            httpsURLConnection = httpsURLConnection2;
                            z2 = false;
                            if (z2) {
                                break;
                                if (i2 > 0) {
                                    g.f3378i = 0;
                                    return;
                                }
                                g.f3378i++;
                                g gVar5 = g.this;
                                gVar5.f3381c = null;
                                gVar5.h(false);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream = outputStream4;
                            httpsURLConnection = httpsURLConnection2;
                            inputStream = null;
                            httpsURLConnection2 = httpsURLConnection;
                            outputStream4 = outputStream;
                            byteArrayOutputStream2 = null;
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection2.disconnect();
                            }
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream2 == null) {
                                throw th;
                            }
                            byteArrayOutputStream2.close();
                            throw th;
                        }
                    } catch (Error unused20) {
                        httpsURLConnection = httpsURLConnection2;
                        outputStream3 = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        byteArrayOutputStream = null;
                        outputStream4 = outputStream3;
                        Log.d("baidu_location_service", "NetworkCommunicationError!");
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        httpsURLConnection = httpsURLConnection2;
                        z2 = false;
                        if (z2) {
                            break;
                            if (i2 > 0) {
                                g.f3378i = 0;
                                return;
                            }
                            g.f3378i++;
                            g gVar6 = g.this;
                            gVar6.f3381c = null;
                            gVar6.h(false);
                        }
                    } catch (Exception unused21) {
                        httpsURLConnection = httpsURLConnection2;
                        outputStream2 = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        byteArrayOutputStream = null;
                        outputStream4 = outputStream2;
                        Log.d("baidu_location_service", "NetworkCommunicationException!");
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        httpsURLConnection = httpsURLConnection2;
                        z2 = false;
                        if (z2) {
                            break;
                            if (i2 > 0) {
                                g.f3378i = 0;
                                return;
                            }
                            g.f3378i++;
                            g gVar7 = g.this;
                            gVar7.f3381c = null;
                            gVar7.h(false);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpsURLConnection = httpsURLConnection2;
                        outputStream = null;
                        inputStream = null;
                        httpsURLConnection2 = httpsURLConnection;
                        outputStream4 = outputStream;
                        byteArrayOutputStream2 = null;
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream2 == null) {
                            throw th;
                        }
                        byteArrayOutputStream2.close();
                        throw th;
                    }
                } catch (Error unused22) {
                } catch (Exception unused23) {
                } catch (Throwable th6) {
                    th = th6;
                }
                if (z2) {
                    break;
                }
            }
            if (i2 > 0) {
                g.f3378i = 0;
                return;
            }
            g.f3378i++;
            g gVar8 = g.this;
            gVar8.f3381c = null;
            gVar8.h(false);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3395b;

        public d(String str) {
            this.f3395b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.g(this.f3395b);
        }
    }

    public class e extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3397b;

        public e(String str) {
            this.f3397b = str;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:119:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:133:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:144:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:152:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:170:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x0196  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 10, insn: 0x01e2: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:116:0x01e2 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.io.ByteArrayOutputStream] */
        /* JADX WARN: Type inference failed for: r6v6 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            ?? r6;
            InputStream inputStream;
            OutputStream outputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            HttpsURLConnection httpsURLConnection;
            InputStream inputStream2;
            ?? r7;
            g.this.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            g.this.f3379a = this.f3397b;
            HttpsURLConnection httpsURLConnection2 = null;
            InputStream inputStream3 = null;
            try {
                try {
                    HttpsURLConnection.setDefaultSSLSocketFactory(i.G());
                    StringBuffer stringBuffer = new StringBuffer();
                    URL url = new URL(g.this.f3379a);
                    try {
                        httpsURLConnection = (HttpsURLConnection) url.openConnection();
                        try {
                            httpsURLConnection.setInstanceFollowRedirects(false);
                            httpsURLConnection.setDoOutput(true);
                            httpsURLConnection.setDoInput(true);
                            httpsURLConnection.setConnectTimeout(n.a.f3341a);
                            httpsURLConnection.setReadTimeout(n.a.f3342b);
                            httpsURLConnection.setRequestMethod("POST");
                            httpsURLConnection.setHostnameVerifier(new C0040g(url));
                            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
                            String str = g.this.f3385g;
                            if (str != null) {
                                httpsURLConnection.setRequestProperty("alwd", str);
                            }
                            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                            String str2 = i.f3432o0;
                            if (str2 != null) {
                                httpsURLConnection.setRequestProperty("bd-loc-android", str2);
                            }
                            for (Map.Entry<String, Object> entry : g.this.f3382d.entrySet()) {
                                stringBuffer.append(entry.getKey());
                                stringBuffer.append("=");
                                stringBuffer.append(entry.getValue());
                                stringBuffer.append("&");
                            }
                            if (stringBuffer.length() > 0) {
                                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                            }
                            outputStream = httpsURLConnection.getOutputStream();
                            try {
                                outputStream.write(stringBuffer.toString().getBytes());
                                outputStream.flush();
                                if (httpsURLConnection.getResponseCode() == 200) {
                                    inputStream = httpsURLConnection.getInputStream();
                                    try {
                                        g.this.f3386h = System.currentTimeMillis() - jCurrentTimeMillis;
                                        String contentEncoding = httpsURLConnection.getContentEncoding();
                                        if (contentEncoding != null && contentEncoding.contains("gzip")) {
                                            inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                                        }
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int i2 = inputStream.read(bArr);
                                                if (i2 == -1) {
                                                    break;
                                                } else {
                                                    byteArrayOutputStream.write(bArr, 0, i2);
                                                }
                                            }
                                            g.this.f3381c = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                            g.this.h(true);
                                            inputStream3 = inputStream;
                                        } catch (Error e2) {
                                            e = e2;
                                            e.printStackTrace();
                                            Log.i("baidu_location_service", "https NetworkCommunicationError!");
                                            g gVar = g.this;
                                            gVar.f3381c = null;
                                            gVar.h(false);
                                            if (httpsURLConnection != null) {
                                                httpsURLConnection.disconnect();
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception unused) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused2) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream == null) {
                                                return;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            e.printStackTrace();
                                            Log.i("baidu_location_service", "https NetworkCommunicationException!");
                                            g gVar2 = g.this;
                                            gVar2.f3381c = null;
                                            gVar2.h(false);
                                            if (httpsURLConnection != null) {
                                                httpsURLConnection.disconnect();
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception unused3) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused4) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream == null) {
                                                return;
                                            }
                                        }
                                    } catch (Error e4) {
                                        e = e4;
                                        byteArrayOutputStream = null;
                                        e.printStackTrace();
                                        Log.i("baidu_location_service", "https NetworkCommunicationError!");
                                        g gVar3 = g.this;
                                        gVar3.f3381c = null;
                                        gVar3.h(false);
                                        if (httpsURLConnection != null) {
                                            httpsURLConnection.disconnect();
                                        }
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (byteArrayOutputStream == null) {
                                            return;
                                        }
                                        byteArrayOutputStream.close();
                                    } catch (Exception e5) {
                                        e = e5;
                                        byteArrayOutputStream = null;
                                        e.printStackTrace();
                                        Log.i("baidu_location_service", "https NetworkCommunicationException!");
                                        g gVar4 = g.this;
                                        gVar4.f3381c = null;
                                        gVar4.h(false);
                                        if (httpsURLConnection != null) {
                                            httpsURLConnection.disconnect();
                                        }
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (byteArrayOutputStream == null) {
                                            return;
                                        }
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        r7 = 0;
                                        httpsURLConnection2 = httpsURLConnection;
                                        r6 = r7;
                                        if (httpsURLConnection2 != null) {
                                            httpsURLConnection2.disconnect();
                                        }
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (Exception unused5) {
                                                Log.d("baidu_location_service", "close os IOException!");
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception unused6) {
                                                Log.d("baidu_location_service", "close is IOException!");
                                            }
                                        }
                                        if (r6 != 0) {
                                            throw th;
                                        }
                                        try {
                                            r6.close();
                                            throw th;
                                        } catch (Exception unused7) {
                                            Log.d("baidu_location_service", "close baos IOException!");
                                            throw th;
                                        }
                                    }
                                } else {
                                    g gVar5 = g.this;
                                    gVar5.f3381c = null;
                                    gVar5.h(false);
                                    byteArrayOutputStream = null;
                                }
                                httpsURLConnection.disconnect();
                                try {
                                    outputStream.close();
                                } catch (Exception unused8) {
                                    Log.d("baidu_location_service", "close os IOException!");
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (Exception unused9) {
                                        Log.d("baidu_location_service", "close is IOException!");
                                    }
                                }
                                if (byteArrayOutputStream == null) {
                                    return;
                                }
                            } catch (Error e6) {
                                e = e6;
                                inputStream = null;
                            } catch (Exception e7) {
                                e = e7;
                                inputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                            }
                        } catch (Error e8) {
                            e = e8;
                            inputStream = null;
                            outputStream = null;
                        } catch (Exception e9) {
                            e = e9;
                            inputStream = null;
                            outputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            outputStream = null;
                        }
                    } catch (Error e10) {
                        e = e10;
                        inputStream = null;
                        outputStream = null;
                        httpsURLConnection = null;
                    } catch (Exception e11) {
                        e = e11;
                        inputStream = null;
                        outputStream = null;
                        httpsURLConnection = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        outputStream = null;
                        httpsURLConnection = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = inputStream2;
                    r7 = jCurrentTimeMillis;
                }
            } catch (Error e12) {
                e = e12;
                byteArrayOutputStream = null;
                inputStream = null;
                outputStream = null;
                httpsURLConnection = null;
            } catch (Exception e13) {
                e = e13;
                byteArrayOutputStream = null;
                inputStream = null;
                outputStream = null;
                httpsURLConnection = null;
            } catch (Throwable th6) {
                th = th6;
                r6 = 0;
                inputStream = null;
                outputStream = null;
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (r6 != 0) {
                    throw th;
                }
                r6.close();
                throw th;
            }
            try {
                byteArrayOutputStream.close();
            } catch (Exception unused10) {
                Log.d("baidu_location_service", "close baos IOException!");
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3399b;

        public f(String str) {
            this.f3399b = str;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:120:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:134:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x01d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:144:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:146:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:151:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:173:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0177  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            OutputStream outputStream;
            Exception e2;
            ByteArrayOutputStream byteArrayOutputStream2;
            HttpsURLConnection httpsURLConnection;
            Error e3;
            String str = "gzip";
            g.this.a();
            g.this.f3379a = this.f3399b;
            HttpsURLConnection httpsURLConnection2 = null;
            InputStream inputStream2 = null;
            try {
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    try {
                        httpsURLConnection = (HttpsURLConnection) new URL(g.this.f3379a).openConnection();
                        try {
                            httpsURLConnection.setInstanceFollowRedirects(false);
                            httpsURLConnection.setDoOutput(true);
                            httpsURLConnection.setDoInput(true);
                            httpsURLConnection.setConnectTimeout(n.a.f3341a);
                            httpsURLConnection.setReadTimeout(n.a.f3342b);
                            httpsURLConnection.setRequestMethod("POST");
                            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
                            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                            String str2 = i.f3432o0;
                            if (str2 != null) {
                                httpsURLConnection.setRequestProperty("bd-loc-android", str2);
                            }
                            for (Map.Entry<String, Object> entry : g.this.f3382d.entrySet()) {
                                stringBuffer.append(entry.getKey());
                                stringBuffer.append("=");
                                stringBuffer.append(entry.getValue());
                                stringBuffer.append("&");
                            }
                            if (stringBuffer.length() > 0) {
                                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                            }
                            outputStream = httpsURLConnection.getOutputStream();
                            try {
                                outputStream.write(stringBuffer.toString().getBytes());
                                outputStream.flush();
                                if (httpsURLConnection.getResponseCode() == 200) {
                                    inputStream = httpsURLConnection.getInputStream();
                                    try {
                                        try {
                                            String contentEncoding = httpsURLConnection.getContentEncoding();
                                            if (contentEncoding != null && contentEncoding.contains("gzip")) {
                                                inputStream = new GZIPInputStream(new BufferedInputStream(inputStream));
                                            }
                                            try {
                                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                try {
                                                    byte[] bArr = new byte[1024];
                                                    while (true) {
                                                        int i2 = inputStream.read(bArr);
                                                        if (i2 == -1) {
                                                            break;
                                                        } else {
                                                            byteArrayOutputStream2.write(bArr, 0, i2);
                                                        }
                                                    }
                                                    g.this.f3381c = new String(byteArrayOutputStream2.toByteArray(), "utf-8");
                                                    g.this.h(true);
                                                    inputStream2 = inputStream;
                                                } catch (Error e4) {
                                                    e3 = e4;
                                                    e3.printStackTrace();
                                                    Log.i("baidu_location_service", "https NetworkCommunicationError!");
                                                    g gVar = g.this;
                                                    gVar.f3381c = null;
                                                    gVar.h(false);
                                                    if (httpsURLConnection != null) {
                                                        httpsURLConnection.disconnect();
                                                    }
                                                    if (outputStream != null) {
                                                        try {
                                                            outputStream.close();
                                                        } catch (Exception unused) {
                                                            Log.d("baidu_location_service", "close os IOException!");
                                                        }
                                                    }
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Exception unused2) {
                                                            Log.d("baidu_location_service", "close is IOException!");
                                                        }
                                                    }
                                                    if (byteArrayOutputStream2 == null) {
                                                        return;
                                                    }
                                                } catch (Exception e5) {
                                                    e2 = e5;
                                                    e2.printStackTrace();
                                                    Log.i("baidu_location_service", "https NetworkCommunicationException!");
                                                    g gVar2 = g.this;
                                                    gVar2.f3381c = null;
                                                    gVar2.h(false);
                                                    if (httpsURLConnection != null) {
                                                        httpsURLConnection.disconnect();
                                                    }
                                                    if (outputStream != null) {
                                                        try {
                                                            outputStream.close();
                                                        } catch (Exception unused3) {
                                                            Log.d("baidu_location_service", "close os IOException!");
                                                        }
                                                    }
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Exception unused4) {
                                                            Log.d("baidu_location_service", "close is IOException!");
                                                        }
                                                    }
                                                    if (byteArrayOutputStream2 == null) {
                                                        return;
                                                    }
                                                }
                                            } catch (Error e6) {
                                                e = e6;
                                                e3 = e;
                                                byteArrayOutputStream2 = null;
                                                e3.printStackTrace();
                                                Log.i("baidu_location_service", "https NetworkCommunicationError!");
                                                g gVar3 = g.this;
                                                gVar3.f3381c = null;
                                                gVar3.h(false);
                                                if (httpsURLConnection != null) {
                                                    httpsURLConnection.disconnect();
                                                }
                                                if (outputStream != null) {
                                                    outputStream.close();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream2 == null) {
                                                    return;
                                                }
                                                byteArrayOutputStream2.close();
                                            } catch (Exception e7) {
                                                e = e7;
                                                e2 = e;
                                                byteArrayOutputStream2 = null;
                                                e2.printStackTrace();
                                                Log.i("baidu_location_service", "https NetworkCommunicationException!");
                                                g gVar4 = g.this;
                                                gVar4.f3381c = null;
                                                gVar4.h(false);
                                                if (httpsURLConnection != null) {
                                                    httpsURLConnection.disconnect();
                                                }
                                                if (outputStream != null) {
                                                    outputStream.close();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream2 == null) {
                                                    return;
                                                }
                                                byteArrayOutputStream2.close();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            str = null;
                                            httpsURLConnection2 = httpsURLConnection;
                                            byteArrayOutputStream = str;
                                            if (httpsURLConnection2 != null) {
                                                httpsURLConnection2.disconnect();
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception unused5) {
                                                    Log.d("baidu_location_service", "close os IOException!");
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception unused6) {
                                                    Log.d("baidu_location_service", "close is IOException!");
                                                }
                                            }
                                            if (byteArrayOutputStream != 0) {
                                                throw th;
                                            }
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th;
                                            } catch (Exception unused7) {
                                                Log.d("baidu_location_service", "close baos IOException!");
                                                throw th;
                                            }
                                        }
                                    } catch (Error e8) {
                                        e = e8;
                                    } catch (Exception e9) {
                                        e = e9;
                                    }
                                } else {
                                    g gVar5 = g.this;
                                    gVar5.f3381c = null;
                                    gVar5.h(false);
                                    byteArrayOutputStream2 = null;
                                }
                                httpsURLConnection.disconnect();
                                try {
                                    outputStream.close();
                                } catch (Exception unused8) {
                                    Log.d("baidu_location_service", "close os IOException!");
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception unused9) {
                                        Log.d("baidu_location_service", "close is IOException!");
                                    }
                                }
                                if (byteArrayOutputStream2 == null) {
                                    return;
                                }
                            } catch (Error e10) {
                                e = e10;
                                inputStream = null;
                            } catch (Exception e11) {
                                e = e11;
                                inputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                            }
                        } catch (Error e12) {
                            e = e12;
                            inputStream = null;
                            outputStream = null;
                        } catch (Exception e13) {
                            e = e13;
                            inputStream = null;
                            outputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            outputStream = null;
                        }
                    } catch (Error e14) {
                        e = e14;
                        inputStream = null;
                        httpsURLConnection = null;
                        outputStream = null;
                    } catch (Exception e15) {
                        e = e15;
                        inputStream = null;
                        httpsURLConnection = null;
                        outputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        httpsURLConnection = null;
                        outputStream = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Error e16) {
                e3 = e16;
                byteArrayOutputStream2 = null;
                inputStream = null;
                httpsURLConnection = null;
                outputStream = null;
            } catch (Exception e17) {
                e2 = e17;
                byteArrayOutputStream2 = null;
                inputStream = null;
                httpsURLConnection = null;
                outputStream = null;
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = 0;
                inputStream = null;
                outputStream = null;
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (byteArrayOutputStream != 0) {
                    throw th;
                }
                byteArrayOutputStream.close();
                throw th;
            }
            try {
                byteArrayOutputStream2.close();
            } catch (Exception unused10) {
                Log.d("baidu_location_service", "close baos IOException!");
            }
        }
    }

    /* JADX INFO: renamed from: n.g$g, reason: collision with other inner class name */
    public static class C0040g implements HostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URL f3401a;

        public C0040g(URL url) {
            this.f3401a = url;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return this.f3401a.getHost().equals(str);
        }
    }

    static {
        int i2 = n.a.f3341a;
        f3378i = 0;
    }

    public abstract void a();

    public void b(String str) {
        if (b.d.s().Q != 1) {
            try {
                new e(str).start();
            } catch (Throwable unused) {
                h(false);
            }
        } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            new Thread(new d(str)).start();
        } else {
            g(str);
        }
    }

    public void c(ExecutorService executorService, String str) {
        try {
            executorService.execute(new f(str));
        } catch (Throwable unused) {
            h(false);
        }
    }

    public void d(ExecutorService executorService, boolean z2, String str) {
        try {
            executorService.execute(new b(str, z2));
        } catch (Throwable unused) {
            h(false);
        }
    }

    public void f(boolean z2, String str) {
        try {
            new c(str, z2).start();
        } catch (Throwable unused) {
            h(false);
        }
    }

    public final void g(String str) {
        q qVarE;
        String str2;
        a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f3385g != null) {
            qVarE = q.e();
            str2 = this.f3385g;
        } else {
            qVarE = q.e();
            str2 = null;
        }
        qVarE.c(str2);
        q.e().d(this.f3382d, str, new a(jCurrentTimeMillis));
    }

    public abstract void h(boolean z2);
}
