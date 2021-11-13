package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class amh implements amp {
    private /* synthetic */ Activity a;
    private /* synthetic */ Bundle b;

    amh(amg amg, Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.b);
    }
}
