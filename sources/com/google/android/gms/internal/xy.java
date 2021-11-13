package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class xy implements yf {
    private /* synthetic */ Activity a;
    private /* synthetic */ Bundle b;

    xy(xx xxVar, Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.b);
    }
}
