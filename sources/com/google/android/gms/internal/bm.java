package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

final class bm implements aa<Object> {
    private /* synthetic */ bl a;

    bm(bl blVar) {
        this.a = blVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                if (this.a.c.equals(map.get("request_id"))) {
                    br brVar = new br(1, map);
                    String f = brVar.f();
                    String valueOf = String.valueOf(brVar.b());
                    fn.e(new StringBuilder(String.valueOf(f).length() + 24 + String.valueOf(valueOf).length()).append("Invalid ").append(f).append(" request error: ").append(valueOf).toString());
                    this.a.e.b(brVar);
                }
            }
        }
    }
}
