package com.google.android.gms.internal;

import android.app.job.JobParameters;

final /* synthetic */ class wd implements Runnable {
    private final wb a;
    private final sj b;
    private final JobParameters c;

    wd(wb wbVar, sj sjVar, JobParameters jobParameters) {
        this.a = wbVar;
        this.b = sjVar;
        this.c = jobParameters;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
