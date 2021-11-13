package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.iu;
import java.util.Map;

final class af implements aa<k> {
    private /* synthetic */ o a;
    private /* synthetic */ iu b;
    private /* synthetic */ aa c;

    af(aa aaVar, o oVar, iu iuVar) {
        this.c = aaVar;
        this.a = oVar;
        this.b = iuVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.c.c.a) {
            fn.d("JS Engine is requesting an update");
            if (this.c.c.h == 0) {
                fn.d("Starting reload.");
                int unused = this.c.c.h = 2;
                this.c.c.a(this.c.a);
            }
            this.a.b("/requestReload", (aa) this.b.a());
        }
    }
}
