package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.gw;

@bfk
final class j extends fj {
    final /* synthetic */ d a;

    private j(d dVar) {
        this.a = dVar;
    }

    /* synthetic */ j(d dVar, e eVar) {
        this(dVar);
    }

    public final void a() {
        Bitmap a2 = au.w().a(Integer.valueOf(this.a.a.o.e));
        if (a2 != null) {
            gw.a.post(new k(this, au.g().a(this.a.c, a2, this.a.a.o.c, this.a.a.o.d)));
        }
    }

    public final void b() {
    }
}
