package d;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorManager f2343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Sensor f2345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Sensor f2346e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SensorEventListener f2354m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<c> f2342a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2347f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f2348g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f2349h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2350i = -1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2351j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2352k = null;

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            String strA;
            int type = sensorEvent.sensor.getType();
            if (type != 1) {
                if (type != 11) {
                    return;
                }
                SensorManager.getRotationMatrixFromVector(k.this.f2349h, (float[]) sensorEvent.values.clone());
                SensorManager.getOrientation(k.this.f2349h, k.this.f2348g);
                float[] fArr = new float[3];
                double degrees = Math.toDegrees(k.this.f2348g[0]);
                if (degrees < 0.0d) {
                    fArr[2] = ((float) (degrees + 360.0d)) % 360.0f;
                } else {
                    fArr[2] = (float) degrees;
                }
                k.this.f2350i = fArr[2];
                fArr[0] = (float) Math.toDegrees(k.this.f2348g[1]);
                fArr[1] = (float) Math.toDegrees(k.this.f2348g[2]);
                if (k.this.f2347f && e.a.b()) {
                    e.a.a(5, fArr, System.currentTimeMillis());
                    return;
                }
                return;
            }
            float[] fArr2 = (float[]) sensorEvent.values.clone();
            k.this.f2353l = System.currentTimeMillis();
            if (!k.this.f2347f || !e.a.b() || (strA = e.a.a(1, fArr2, System.currentTimeMillis())) == null || strA.length() <= 1) {
                return;
            }
            float fC = e.a.c();
            if (fC > 0.01f) {
                k.h(k.this);
            }
            try {
                synchronized (k.this.f2342a) {
                    Iterator it = k.this.f2342a.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a(fC, k.this.f2350i, k.this.f2350i, System.currentTimeMillis(), strA);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static k f2356a = new k();
    }

    public interface c {
        void a(double d2, double d3, double d4, long j2, String str);
    }

    public k() {
        new ArrayList();
        this.f2354m = new a();
        d(com.baidu.location.f.c(), 1);
    }

    public static k c() {
        return b.f2356a;
    }

    public static /* synthetic */ int h(k kVar) {
        int i2 = kVar.f2351j;
        kVar.f2351j = i2 + 1;
        return i2;
    }

    public final void d(Context context, int i2) {
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.f2343b = sensorManager;
            this.f2344c = i2;
            this.f2345d = sensorManager.getDefaultSensor(1);
            this.f2346e = this.f2343b.getDefaultSensor(11);
            k();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void e(c cVar) {
        Sensor sensor;
        synchronized (this.f2342a) {
            if (!this.f2342a.contains(cVar)) {
                this.f2342a.add(cVar);
            }
            if (this.f2342a.size() == 1) {
                Sensor sensor2 = this.f2345d;
                if (sensor2 != null) {
                    try {
                        this.f2343b.registerListener(this.f2354m, sensor2, this.f2344c);
                    } catch (Exception unused) {
                        this.f2347f = false;
                    }
                    if (e.a.b()) {
                        e.a.d();
                    }
                    sensor = this.f2346e;
                    if (sensor != null) {
                        try {
                            this.f2343b.registerListener(this.f2354m, sensor, this.f2344c);
                        } catch (Exception unused2) {
                            this.f2347f = false;
                        }
                    }
                } else {
                    sensor = this.f2346e;
                    if (sensor != null) {
                        this.f2343b.registerListener(this.f2354m, sensor, this.f2344c);
                    }
                }
                throw th;
            }
        }
    }

    public double g() {
        return this.f2350i;
    }

    public void i(c cVar) {
        synchronized (this.f2342a) {
            if (this.f2342a.contains(cVar)) {
                this.f2342a.remove(cVar);
            }
            if (this.f2342a.size() == 0) {
                try {
                    this.f2343b.unregisterListener(this.f2354m);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (e.a.b()) {
                    e.a.e();
                }
            }
        }
    }

    public final void k() {
        int iIntValue;
        try {
            List<Sensor> sensorList = this.f2343b.getSensorList(-1);
            HashMap map = new HashMap();
            map.put(1, 0);
            map.put(10, 1);
            map.put(9, 2);
            map.put(4, 3);
            map.put(2, 4);
            map.put(11, 5);
            map.put(6, 6);
            map.put(14, 7);
            map.put(16, 8);
            int size = map.size();
            char[] cArr = new char[size];
            for (int i2 = 0; i2 < size; i2++) {
                cArr[i2] = '0';
            }
            Iterator<Sensor> it = sensorList.iterator();
            while (it.hasNext()) {
                int type = it.next().getType();
                if (map.get(Integer.valueOf(type)) != null && (iIntValue = ((Integer) map.get(Integer.valueOf(type))).intValue()) < size) {
                    cArr[iIntValue] = '1';
                }
            }
            this.f2352k = new String(cArr);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String m() {
        return this.f2352k;
    }

    public synchronized int n() {
        return this.f2351j;
    }
}
