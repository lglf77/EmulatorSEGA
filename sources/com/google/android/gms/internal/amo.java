package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class amo implements amp {
    private /* synthetic */ Activity a;

    amo(amg amg, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.a);
    }
}
