package j;

import android.net.wifi.ScanResult;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<ScanResult> f3019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3022d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3023e;

    public k(List<ScanResult> list, long j2) {
        this.f3021c = 0L;
        this.f3020b = j2;
        this.f3019a = list;
        this.f3021c = System.currentTimeMillis();
        try {
            f();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean a() {
        return System.currentTimeMillis() - this.f3020b > 0 && System.currentTimeMillis() - this.f3020b < 5000;
    }

    public boolean b(k kVar) {
        List<ScanResult> list = this.f3019a;
        if (list == null || kVar == null || kVar.f3019a == null) {
            return false;
        }
        int iMin = Math.min(list.size(), kVar.f3019a.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            if (this.f3019a.get(i2) != null) {
                String str = this.f3019a.get(i2).BSSID;
                int i3 = this.f3019a.get(i2).level;
                String str2 = kVar.f3019a.get(i2).BSSID;
                int i4 = kVar.f3019a.get(i2).level;
                if ((!TextUtils.isEmpty(str) && !str.equals(str2)) || i3 != i4) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean c(k kVar, float f2) {
        return k.b.k(kVar, this, f2);
    }

    public boolean d() {
        return System.currentTimeMillis() - this.f3021c > 0 && System.currentTimeMillis() - this.f3021c < 5000;
    }

    public int e() {
        List<ScanResult> list = this.f3019a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void f() {
        /*
            r7 = this;
            int r0 = r7.e()
            r1 = 1
            if (r0 >= r1) goto L8
            return
        L8:
            java.util.List<android.net.wifi.ScanResult> r0 = r7.f3019a
            int r0 = r0.size()
            int r0 = r0 - r1
            r2 = r1
        L10:
            if (r0 < r1) goto L5e
            if (r2 == 0) goto L5e
            r2 = 0
            r3 = r2
        L16:
            if (r2 >= r0) goto L5a
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f3019a
            java.lang.Object r4 = r4.get(r2)
            if (r4 == 0) goto L57
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f3019a
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L57
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f3019a
            java.lang.Object r4 = r4.get(r2)
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4
            int r4 = r4.level
            java.util.List<android.net.wifi.ScanResult> r6 = r7.f3019a
            java.lang.Object r6 = r6.get(r5)
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6
            int r6 = r6.level
            if (r4 >= r6) goto L57
            java.util.List<android.net.wifi.ScanResult> r3 = r7.f3019a
            java.lang.Object r3 = r3.get(r5)
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f3019a
            java.lang.Object r6 = r4.get(r2)
            r4.set(r5, r6)
            java.util.List<android.net.wifi.ScanResult> r4 = r7.f3019a
            r4.set(r2, r3)
            r3 = r1
        L57:
            int r2 = r2 + 1
            goto L16
        L5a:
            int r0 = r0 + (-1)
            r2 = r3
            goto L10
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.k.f():void");
    }
}
