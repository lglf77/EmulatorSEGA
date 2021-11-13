package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

final class bn implements aa<Object> {
    private /* synthetic */ bl a;

    bn(bl blVar) {
        this.a = blVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                br brVar = new br(-2, map);
                if (this.a.c.equals(brVar.h())) {
                    String e = brVar.e();
                    if (e == null) {
                        fn.e("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (e.contains("%40mediation_adapters%40")) {
                        String replaceAll = e.replaceAll("%40mediation_adapters%40", fi.a(this.a.a, map.get("check_adapters"), this.a.d));
                        brVar.a(replaceAll);
                        String valueOf = String.valueOf(replaceAll);
                        fn.a(valueOf.length() != 0 ? "Ad request URL modified to ".concat(valueOf) : new String("Ad request URL modified to "));
                    }
                    this.a.e.b(brVar);
                }
            }
        }
    }
}
