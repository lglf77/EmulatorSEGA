package com.google.android.gms.internal;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

final class bei implements Runnable {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ ks b;
    final /* synthetic */ beh c;

    bei(beh beh, JSONObject jSONObject, ks ksVar) {
        this.c = beh;
        this.a = jSONObject;
        this.b = ksVar;
    }

    public final void run() {
        try {
            mw a2 = this.c.a();
            a2.a(or.b());
            this.c.f.a(a2);
            WeakReference weakReference = new WeakReference(a2);
            a2.w().a(this.c.a((WeakReference<mw>) weakReference), this.c.b(weakReference));
            this.c.a(a2);
            a2.w().a((nc) new bej(this, a2));
            a2.w().a((nb) new bek(this));
            a2.loadUrl((String) app.f().a(asw.bL));
        } catch (Exception e) {
            fn.c("Exception occurred while getting video view", e);
            this.b.b(null);
        }
    }
}
