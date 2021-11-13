package com.google.android.gms.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.a;

@bfk
final class ly implements SensorEventListener {
    private final SensorManager a;
    private final Object b = new Object();
    private final Display c;
    private final float[] d = new float[9];
    private final float[] e = new float[9];
    private float[] f;
    private Handler g;
    private ma h;

    ly(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void a(int i, int i2) {
        float f2 = this.e[i];
        this.e[i] = this.e[i2];
        this.e[i2] = f2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.g == null) {
            Sensor defaultSensor = this.a.getDefaultSensor(11);
            if (defaultSensor == null) {
                fn.c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.g = new Handler(handlerThread.getLooper());
            if (!this.a.registerListener(this, defaultSensor, 0, this.g)) {
                fn.c("SensorManager.registerListener failed.");
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ma maVar) {
        this.h = maVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(float[] fArr) {
        boolean z = false;
        synchronized (this.b) {
            if (this.f != null) {
                System.arraycopy(this.f, 0, fArr, 0, this.f.length);
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.g != null) {
            this.a.unregisterListener(this);
            this.g.post(new lz(this));
            this.g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.b) {
                if (this.f == null) {
                    this.f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.d, fArr);
            switch (this.c.getRotation()) {
                case a.b.AdsAttrs_adSizes:
                    SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
                    break;
                default:
                    System.arraycopy(this.d, 0, this.e, 0, 9);
                    break;
            }
            a(1, 3);
            a(2, 6);
            a(5, 7);
            synchronized (this.b) {
                System.arraycopy(this.e, 0, this.f, 0, 9);
            }
            if (this.h != null) {
                this.h.a();
            }
        }
    }
}
