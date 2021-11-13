package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.k;

final class au implements kx<k> {
    private /* synthetic */ at a;

    au(at atVar) {
        this.a = atVar;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((k) obj).b("AFMA_getAdapterLessMediationAd", this.a.a);
        } catch (Exception e) {
            fn.b("Error requesting an ad url", e);
            ar.f.b(this.a.b);
        }
    }
}
