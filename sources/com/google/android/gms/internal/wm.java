package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.d;

public final class wm extends uk {
    private final AlarmManager a = ((AlarmManager) l().getSystemService("alarm"));
    private final ro b;
    private Integer c;

    protected wm(tk tkVar) {
        super(tkVar);
        this.b = new wn(this, tkVar);
    }

    private final int A() {
        if (this.c == null) {
            String valueOf = String.valueOf(l().getPackageName());
            this.c = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.c.intValue();
    }

    private final PendingIntent B() {
        Intent className = new Intent().setClassName(l(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(l(), 0, className, 0);
    }

    @TargetApi(24)
    private final void z() {
        t().E().a("Cancelling job. JobID", Integer.valueOf(A()));
        ((JobScheduler) l().getSystemService("jobscheduler")).cancel(A());
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(long j) {
        Q();
        if (!tb.a(l())) {
            t().D().a("Receiver not registered/enabled");
        }
        if (!wb.a(l(), false)) {
            t().D().a("Service not registered/enabled");
        }
        y();
        long b2 = k().b() + j;
        if (j < Math.max(0, rz.z.b().longValue()) && !this.b.b()) {
            t().E().a("Scheduling upload with DelayedRunnable");
            this.b.a(j);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            t().E().a("Scheduling upload with JobScheduler");
            JobInfo.Builder builder = new JobInfo.Builder(A(), new ComponentName(l(), "com.google.android.gms.measurement.AppMeasurementJobService"));
            builder.setMinimumLatency(j);
            builder.setOverrideDeadline(j << 1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            builder.setExtras(persistableBundle);
            JobInfo build = builder.build();
            t().E().a("Scheduling job. JobID", Integer.valueOf(A()));
            ((JobScheduler) l().getSystemService("jobscheduler")).schedule(build);
            return;
        }
        t().E().a("Scheduling upload with AlarmManager");
        this.a.setInexactRepeating(2, b2, Math.max(rz.u.b().longValue(), j), B());
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ rg e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ um f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ se g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ rq h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ vg i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ vc j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ d k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Context l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ sf m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ rk n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ sh o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ wr p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ te q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ wg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ tf s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ sj t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ su u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ rj v() {
        return super.v();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        this.a.cancel(B());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        z();
        return false;
    }

    public final void y() {
        Q();
        this.a.cancel(B());
        this.b.c();
        if (Build.VERSION.SDK_INT >= 24) {
            z();
        }
    }
}
