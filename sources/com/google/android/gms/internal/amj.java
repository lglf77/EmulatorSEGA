package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class amj implements amp {
    private /* synthetic */ Activity a;

    amj(amg amg, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.a);
    }
}
