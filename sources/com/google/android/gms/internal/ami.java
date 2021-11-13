package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class ami implements amp {
    private /* synthetic */ Activity a;

    ami(amg amg, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.a);
    }
}
