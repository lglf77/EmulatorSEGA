package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class amk implements amp {
    private /* synthetic */ Activity a;

    amk(amg amg, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.a);
    }
}
