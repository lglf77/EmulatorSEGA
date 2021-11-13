package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
final class amu implements Application.ActivityLifecycleCallbacks {
    private Activity a;
    private Context b;
    /* access modifiers changed from: private */
    public final Object c = new Object();
    /* access modifiers changed from: private */
    public boolean d = true;
    /* access modifiers changed from: private */
    public boolean e = false;
    /* access modifiers changed from: private */
    public final List<amw> f = new ArrayList();
    private final List<anj> g = new ArrayList();
    private Runnable h;
    private boolean i = false;
    private long j;

    amu() {
    }

    private final void a(Activity activity) {
        synchronized (this.c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.a = activity;
            }
        }
    }

    public final Activity a() {
        return this.a;
    }

    public final void a(Application application, Context context) {
        if (!this.i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                a((Activity) context);
            }
            this.b = application;
            this.j = ((Long) app.f().a(asw.av)).longValue();
            this.i = true;
        }
    }

    public final void a(amw amw) {
        synchronized (this.c) {
            this.f.add(amw);
        }
    }

    public final Context b() {
        return this.b;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityDestroyed(android.app.Activity r6) {
        /*
            r5 = this;
            java.lang.Object r1 = r5.c
            monitor-enter(r1)
            android.app.Activity r0 = r5.a     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
        L_0x0008:
            return
        L_0x0009:
            android.app.Activity r0 = r5.a     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0014
            r0 = 0
            r5.a = r0     // Catch:{ all -> 0x0040 }
        L_0x0014:
            java.util.List<com.google.android.gms.internal.anj> r0 = r5.g     // Catch:{ all -> 0x0040 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x001a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.anj r0 = (com.google.android.gms.internal.anj) r0     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.a(r6)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x001a
            r2.remove()     // Catch:{ Exception -> 0x0030 }
            goto L_0x001a
        L_0x0030:
            r0 = move-exception
            com.google.android.gms.internal.fa r3 = com.google.android.gms.ads.internal.au.i()     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = "AppActivityTracker.ActivityListener.onActivityDestroyed"
            r3.a((java.lang.Throwable) r0, (java.lang.String) r4)     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = "onActivityStateChangedListener threw exception."
            com.google.android.gms.internal.fn.b(r3, r0)     // Catch:{ all -> 0x0040 }
            goto L_0x001a
        L_0x0040:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r0
        L_0x0043:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amu.onActivityDestroyed(android.app.Activity):void");
    }

    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.c) {
            Iterator<anj> it = this.g.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.e = true;
        if (this.h != null) {
            gw.a.removeCallbacks(this.h);
        }
        Handler handler = gw.a;
        amv amv = new amv(this);
        this.h = amv;
        handler.postDelayed(amv, this.j);
    }

    public final void onActivityResumed(Activity activity) {
        boolean z = false;
        a(activity);
        this.e = false;
        if (!this.d) {
            z = true;
        }
        this.d = true;
        if (this.h != null) {
            gw.a.removeCallbacks(this.h);
        }
        synchronized (this.c) {
            Iterator<anj> it = this.g.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (z) {
                for (amw d2 : this.f) {
                    try {
                        d2.d(true);
                    } catch (Exception e2) {
                        fn.b("OnForegroundStateChangedListener threw exception.", e2);
                    }
                }
            } else {
                fn.b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
