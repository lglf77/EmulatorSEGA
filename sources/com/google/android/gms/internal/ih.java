package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;

final class ih implements js<Throwable, T> {
    private /* synthetic */ im a;

    ih(Cif ifVar, im imVar) {
        this.a = imVar;
    }

    public final /* synthetic */ kh a(Object obj) {
        Throwable th = (Throwable) obj;
        fn.b("Error occurred while dispatching http response in getter.", th);
        au.i().a(th, "HttpGetter.deliverResponse.1");
        return jx.a(this.a.a());
    }
}
