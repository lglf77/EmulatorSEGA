package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.wb;
import com.google.android.gms.internal.wf;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements wf {
    private wb<AppMeasurementJobService> a;

    private final wb<AppMeasurementJobService> a() {
        if (this.a == null) {
            this.a = new wb<>(this);
        }
        return this.a;
    }

    @TargetApi(24)
    public final void a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final void a(Intent intent) {
    }

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
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

    public final boolean onStartJob(JobParameters jobParameters) {
        return a().a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return a().b(intent);
    }
}
