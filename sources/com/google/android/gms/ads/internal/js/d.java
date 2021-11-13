package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.kx;

final class d implements kx<k> {
    private /* synthetic */ b a;

    d(b bVar) {
        this.a = bVar;
    }

    public final /* synthetic */ void a(Object obj) {
        fn.a("Releasing engine reference.");
        this.a.b.b();
    }
}
