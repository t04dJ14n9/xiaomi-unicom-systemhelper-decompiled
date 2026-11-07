package b;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public class t implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f1843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorManager f1844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1847e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f1848a = new t();
    }

    public t() {
        this.f1846d = false;
        this.f1847e = false;
    }

    public static t c() {
        return b.f1848a;
    }

    public float a() {
        return this.f1845c;
    }

    public void b(boolean z2) {
    }

    public void d(boolean z2) {
        this.f1846d = z2;
    }

    public boolean e() {
        return this.f1846d;
    }

    public synchronized void f() {
        Sensor defaultSensor;
        if (this.f1847e) {
            return;
        }
        if (this.f1846d) {
            if (this.f1844b == null) {
                this.f1844b = (SensorManager) com.baidu.location.f.c().getSystemService("sensor");
            }
            SensorManager sensorManager = this.f1844b;
            if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(11)) != null && this.f1846d) {
                this.f1844b.registerListener(this, defaultSensor, 3);
            }
            this.f1847e = true;
        }
    }

    public synchronized void g() {
        if (this.f1847e) {
            SensorManager sensorManager = this.f1844b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
                this.f1844b = null;
            }
            this.f1847e = false;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    @SuppressLint({"NewApi"})
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 11) {
            return;
        }
        float[] fArr = (float[]) sensorEvent.values.clone();
        this.f1843a = fArr;
        float[] fArr2 = new float[9];
        try {
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = new float[3];
            SensorManager.getOrientation(fArr2, fArr3);
            float degrees = (float) Math.toDegrees(fArr3[0]);
            this.f1845c = degrees;
            if (degrees < 0.0f) {
                degrees += 360.0f;
            }
            this.f1845c = (float) Math.floor(degrees);
        } catch (Exception unused) {
            this.f1845c = 0.0f;
        }
    }
}
