package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

final class bec implements aa<Object> {
    private /* synthetic */ aud a;
    private /* synthetic */ bea b;

    bec(bea bea, aud aud) {
        this.b = bea;
        this.a = aud;
    }

    public final void zza(Object obj, Map<String, String> map) {
        this.b.a((awe) this.a, map.get("asset"));
    }
}
