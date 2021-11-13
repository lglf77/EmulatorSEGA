package com.google.android.gms.internal;

import android.content.Context;

@bfk
public class bdq extends bdh implements nb {
    bdq(Context context, ew ewVar, mw mwVar, bdp bdp) {
        super(context, ewVar, mwVar, bdp);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.c.d == -2) {
            this.b.w().a((nb) this);
            b();
            fn.b("Loading HTML in WebView.");
            this.b.loadDataWithBaseURL(this.c.a, this.c.b, "text/html", "UTF-8", (String) null);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }
}
