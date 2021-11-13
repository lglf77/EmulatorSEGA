package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.wb;
import com.google.android.gms.internal.wf;

public final class AppMeasurementService extends Service implements wf {
    private wb<AppMeasurementService> a;

    private final wb<AppMeasurementService> a() {
        if (this.a == null) {
            this.a = new wb<>(this);
        }
        return this.a;
    }

    public final void a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void a(Intent intent) {
        AppMeasurementReceiver.a(intent);
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return a().a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        a().c(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return a().a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return a().b(intent);
    }
}
