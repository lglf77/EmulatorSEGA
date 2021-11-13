package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class ye implements yf {
    private /* synthetic */ Activity a;

    ye(xx xxVar, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.a);
    }
}
