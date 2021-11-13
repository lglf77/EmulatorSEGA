package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class amg implements Application.ActivityLifecycleCallbacks {
    private final Application a;
    private final WeakReference<Application.ActivityLifecycleCallbacks> b;
    private boolean c = false;

    public amg(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = new WeakReference<>(activityLifecycleCallbacks);
        this.a = application;
    }

    private final void a(amp amp) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.b.get();
            if (activityLifecycleCallbacks != null) {
                amp.a(activityLifecycleCallbacks);
            } else if (!this.c) {
                this.a.unregisterActivityLifecycleCallbacks(this);
                this.c = true;
            }
        } catch (Exception e) {
            fn.b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new amh(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new amo(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new amk(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new amj(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new amn(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new ami(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new aml(this, activity));
    }
}
