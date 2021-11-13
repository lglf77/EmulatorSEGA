package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class xx implements Application.ActivityLifecycleCallbacks {
    private final Application a;
    private final WeakReference<Application.ActivityLifecycleCallbacks> b;
    private boolean c = false;

    public xx(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = new WeakReference<>(activityLifecycleCallbacks);
        this.a = application;
    }

    private final void a(yf yfVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.b.get();
            if (activityLifecycleCallbacks != null) {
                yfVar.a(activityLifecycleCallbacks);
            } else if (!this.c) {
                this.a.unregisterActivityLifecycleCallbacks(this);
                this.c = true;
            }
        } catch (Exception e) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new xy(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new ye(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new yb(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new ya(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new yd(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new xz(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new yc(this, activity));
    }
}
