package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class aml implements amp {
    private /* synthetic */ Activity a;

    aml(amg amg, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
