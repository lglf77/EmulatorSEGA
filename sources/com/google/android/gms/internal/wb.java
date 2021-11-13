package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.wf;

public final class wb<T extends Context & wf> {
    private final T a;

    public wb(T t) {
        y.a(t);
        this.a = t;
    }

    private final void a(Runnable runnable) {
        tk a2 = tk.a((Context) this.a);
        a2.f();
        a2.h().a((Runnable) new we(this, a2, runnable));
    }

    public static boolean a(Context context, boolean z) {
        y.a(context);
        return Build.VERSION.SDK_INT >= 24 ? wr.a(context, "com.google.android.gms.measurement.AppMeasurementJobService") : wr.a(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    private final sj c() {
        return tk.a((Context) this.a).f();
    }

    public final int a(Intent intent, int i, int i2) {
        sj f = tk.a((Context) this.a).f();
        if (intent == null) {
            f.A().a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            f.E().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                a((Runnable) new wc(this, i2, f, intent));
            }
        }
        return 2;
    }

    public final IBinder a(Intent intent) {
        if (intent == null) {
            c().y().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new tp(tk.a((Context) this.a));
        }
        c().A().a("onBind received unknown action", action);
        return null;
    }

    public final void a() {
        tk.a((Context) this.a).f().E().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, sj sjVar, Intent intent) {
        if (((wf) this.a).a(i)) {
            sjVar.E().a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            c().E().a("Completed wakeful intent.");
            ((wf) this.a).a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(sj sjVar, JobParameters jobParameters) {
        sjVar.E().a("AppMeasurementJobService processed last upload request.");
        ((wf) this.a).a(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean a(JobParameters jobParameters) {
        sj f = tk.a((Context) this.a).f();
        String string = jobParameters.getExtras().getString("action");
        f.E().a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a((Runnable) new wd(this, f, jobParameters));
        return true;
    }

    public final void b() {
        tk.a((Context) this.a).f().E().a("Local AppMeasurementService is shutting down");
    }

    public final boolean b(Intent intent) {
        if (intent == null) {
            c().y().a("onUnbind called with null intent");
        } else {
            c().E().a("onUnbind called for intent. action", intent.getAction());
        }
        return true;
    }

    public final void c(Intent intent) {
        if (intent == null) {
            c().y().a("onRebind called with null intent");
            return;
        }
        c().E().a("onRebind called. action", intent.getAction());
    }
}
