package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.iu;
import com.google.android.gms.internal.xr;

final class aa implements Runnable {
    final /* synthetic */ xr a;
    final /* synthetic */ f b;
    final /* synthetic */ z c;

    aa(z zVar, xr xrVar, f fVar) {
        this.c = zVar;
        this.a = xrVar;
        this.b = fVar;
    }

    public final void run() {
        try {
            q qVar = new q(this.c.b, this.c.d, this.a, (bq) null);
            qVar.a((p) new ab(this, qVar));
            qVar.a("/jsLoaded", new ae(this, qVar));
            iu iuVar = new iu();
            af afVar = new af(this, qVar, iuVar);
            iuVar.a(afVar);
            qVar.a("/requestReload", afVar);
            if (this.c.c.endsWith(".js")) {
                qVar.a(this.c.c);
            } else if (this.c.c.startsWith("<html>")) {
                qVar.c(this.c.c);
            } else {
                qVar.b(this.c.c);
            }
            gw.a.postDelayed(new ag(this, qVar), (long) ak.a);
        } catch (Throwable th) {
            fn.b("Error creating webview.", th);
            au.i().a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            this.b.d();
        }
    }
}
