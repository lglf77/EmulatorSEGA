package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class yc implements yf {
    private /* synthetic */ Activity a;

    yc(xx xxVar, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
