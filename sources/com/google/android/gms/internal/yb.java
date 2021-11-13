package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class yb implements yf {
    private /* synthetic */ Activity a;

    yb(xx xxVar, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.a);
    }
}
