package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class xz implements yf {
    private /* synthetic */ Activity a;

    xz(xx xxVar, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.a);
    }
}
