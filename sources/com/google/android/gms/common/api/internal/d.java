package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final d a = new d();
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean();
    private final ArrayList<e> d = new ArrayList<>();
    private boolean e = false;

    private d() {
    }

    public static d a() {
        return a;
    }

    public static void a(Application application) {
        synchronized (a) {
            if (!a.e) {
                application.registerActivityLifecycleCallbacks(a);
                application.registerComponentCallbacks(a);
                a.e = true;
            }
        }
    }

    private final void a(boolean z) {
        synchronized (a) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((e) obj).a(z);
            }
        }
    }

    public final void a(e eVar) {
        synchronized (a) {
            this.d.add(eVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.b.compareAndSet(false, true)) {
            this.c.set(true);
            a(true);
        }
    }
}
