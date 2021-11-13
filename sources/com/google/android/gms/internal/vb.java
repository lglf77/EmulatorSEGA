package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

@TargetApi(14)
final class vb implements Application.ActivityLifecycleCallbacks {
    private /* synthetic */ um a;

    private vb(um umVar) {
        this.a = umVar;
    }

    /* synthetic */ vb(um umVar, un unVar) {
        this(umVar);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundle2;
        Uri data;
        try {
            this.a.t().E().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (!(intent == null || (data = intent.getData()) == null || !data.isHierarchical())) {
                if (bundle == null) {
                    Bundle a2 = this.a.p().a(data);
                    this.a.p();
                    String str = wr.a(intent) ? "gs" : "auto";
                    if (a2 != null) {
                        this.a.a(str, "_cmp", a2);
                    }
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                        this.a.t().D().a("Activity created with data 'referrer' param without gclid and at least one utm field");
                        return;
                    }
                    this.a.t().D().a("Activity created with referrer", queryParameter);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        this.a.a("auto", "_ldl", (Object) queryParameter);
                    }
                } else {
                    return;
                }
            }
        } catch (Throwable th) {
            this.a.t().y().a("Throwable caught in onActivityCreated", th);
        }
        vc j = this.a.j();
        if (bundle != null && (bundle2 = bundle.getBundle("com.google.firebase.analytics.screen_service")) != null) {
            vf a3 = j.a(activity);
            a3.d = bundle2.getLong("id");
            a3.b = bundle2.getString("name");
            a3.c = bundle2.getString("referrer_name");
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.j().d(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.a.j().c(activity);
        wg r = this.a.r();
        r.s().a((Runnable) new wk(r, r.k().b()));
    }

    public final void onActivityResumed(Activity activity) {
        this.a.j().b(activity);
        wg r = this.a.r();
        r.s().a((Runnable) new wj(r, r.k().b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.j().a(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
