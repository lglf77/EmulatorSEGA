package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

final class bo implements aa<Object> {
    private /* synthetic */ bl a;

    bo(bl blVar) {
        this.a = blVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                br brVar = new br(-2, map);
                if (this.a.c.equals(brVar.h())) {
                    this.a.e.b(brVar);
                }
            }
        }
    }
}
