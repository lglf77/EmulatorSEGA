package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

final class ya implements yf {
    private /* synthetic */ Activity a;

    ya(xx xxVar, Activity activity) {
        this.a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.a);
    }
}
