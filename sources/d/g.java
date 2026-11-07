package d;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final char[] f2231n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2232a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BluetoothAdapter f2235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f2237f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2233b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2234c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2238g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2239h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2240i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ConcurrentMap<String, ScanResult> f2241j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f2242k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2243l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2244m = -1;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f2247c;

        public a(g gVar, String str, int i2, long j2) {
            this.f2245a = str;
            this.f2246b = i2;
            this.f2247c = j2 / 1000000;
        }

        public String toString() {
            return this.f2245a.toUpperCase() + ";" + this.f2246b + ";" + this.f2247c;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f2251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f2252e;

        public String toString() {
            return this.f2251d + "," + this.f2248a + "," + this.f2249b + "," + this.f2250c;
        }
    }

    public interface c {
        void a(boolean z2, String str, String str2, String str3);
    }

    public class d implements Comparator<b> {
        public d(g gVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.f2250c - bVar2.f2250c;
        }
    }

    public class e implements Comparator<a> {
        public e(g gVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            return aVar2.f2246b - aVar.f2246b;
        }
    }

    @TargetApi(21)
    public g(Context context) {
        this.f2236e = false;
        this.f2232a = context;
        if (this.f2235d == null) {
            try {
                this.f2235d = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
                this.f2236e = this.f2232a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = f2231n;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        String str = new String(cArr);
        try {
            return str.toUpperCase();
        } catch (Exception unused) {
            return str;
        }
    }

    public b a(byte[] bArr, int i2, String str) {
        int i3 = -i2;
        if (str != null && i3 >= 0) {
            d.d.b().a();
        }
        return null;
    }

    public final String b(List<a> list, int i2) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, new e(this));
        sb.append(list.get(0).toString());
        for (int i3 = 1; i3 < list.size() && i3 < i2; i3++) {
            sb.append("|");
            sb.append(list.get(i3).toString());
        }
        list.size();
        return sb.toString();
    }

    @TargetApi(21)
    public final void d(ConcurrentMap<String, ScanResult> concurrentMap) {
        ArrayList<ScanResult> arrayList = new ArrayList(concurrentMap.values());
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ScanResult scanResult : arrayList) {
            byte[] bytes = scanResult.getScanRecord().getBytes();
            if (bytes.length >= 26) {
                b bVarA = a(bytes, scanResult.getRssi(), scanResult.getDevice().getAddress().replaceAll(":", ""));
                if (bVarA != null) {
                    arrayList4.add(bVarA);
                    arrayList3.add(new a(this, bVarA.f2252e, scanResult.getRssi(), scanResult.getTimestampNanos()));
                }
                String strC = c(Arrays.copyOfRange(bytes, 9, 25));
                arrayList2.add(strC);
                map.put(strC, scanResult.getDevice().getName());
                map2.put(strC, c(Arrays.copyOfRange(bytes, 0, 9)));
                if (map3.get(strC) == null) {
                    map3.put(strC, 0);
                }
                map3.put(strC, Integer.valueOf(((Integer) map3.get(strC)).intValue() + 1));
            }
        }
        String str = null;
        int iIntValue = 0;
        for (String str2 : map3.keySet()) {
            if (((Integer) map3.get(str2)).intValue() > iIntValue) {
                iIntValue = ((Integer) map3.get(str2)).intValue();
                str = str2;
            }
        }
        boolean z2 = iIntValue > 3;
        c cVar = this.f2237f;
        if (cVar != null && this.f2233b) {
            cVar.a(z2, str, (String) map.get(str), (String) map2.get(str));
            this.f2233b = false;
        }
        if (arrayList3.size() > 2) {
            this.f2239h = b(arrayList3, 32);
            f(arrayList4, 32);
        } else {
            this.f2239h = "";
        }
        if (this.f2238g) {
            d.d.b().a();
        }
    }

    public boolean e(c cVar) {
        if (this.f2233b || this.f2234c) {
            return false;
        }
        this.f2234c = true;
        if (!l() || j()) {
            return false;
        }
        n();
        this.f2237f = cVar;
        return true;
    }

    public final String f(List<b> list, int i2) {
        if (list == null || list.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, new d(this));
        sb.append(list.get(0).toString());
        for (int i3 = 1; i3 < list.size() && i3 < i2; i3++) {
            sb.append("|");
            sb.append(list.get(i3).toString());
        }
        list.size();
        return sb.toString();
    }

    public final void g() {
        this.f2239h = "";
        this.f2240i = -1L;
    }

    public String h() {
        d(this.f2241j);
        return this.f2239h;
    }

    public long i() {
        return this.f2240i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[RETURN] */
    public final boolean j() {
        String line;
        Exception e2;
        File file = new File(this.f2232a.getCacheDir(), "ibct");
        if (!file.exists()) {
            return false;
        }
        String str = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            line = null;
            str = "";
            while (true) {
                try {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    str = str + line;
                } catch (Exception e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    str = line;
                }
                e2.printStackTrace();
                str = line;
                if (str != null && !str.trim().equals("")) {
                    try {
                        if (System.currentTimeMillis() - Long.valueOf(str).longValue() < 259200) {
                            return true;
                        }
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            bufferedReader.close();
        } catch (Exception e4) {
            line = str;
            e2 = e4;
        }
        if (str != null) {
            if (System.currentTimeMillis() - Long.valueOf(str).longValue() < 259200) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        return System.currentTimeMillis() - this.f2240i <= 20000;
    }

    public boolean l() {
        BluetoothAdapter bluetoothAdapter = this.f2235d;
        if (bluetoothAdapter != null && this.f2236e) {
            try {
                return bluetoothAdapter.isEnabled();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public void m() {
        this.f2234c = false;
        this.f2233b = false;
        this.f2243l = false;
        this.f2244m = -1L;
    }

    public final void n() {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f2232a.getCacheDir(), "ibct"));
            fileWriter.write(System.currentTimeMillis() + "");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception unused) {
        }
    }

    @TargetApi(21)
    public void o() {
        if (this.f2238g) {
            try {
                BluetoothLeScanner bluetoothLeScanner = this.f2235d.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan((ScanCallback) this.f2242k);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.f2238g = false;
            this.f2243l = false;
            this.f2244m = -1L;
            g();
        }
    }
}
