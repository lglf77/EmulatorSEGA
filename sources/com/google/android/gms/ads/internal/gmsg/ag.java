package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.internal.bfk;
import java.util.Map;

@bfk
public final class ag implements aa<Object> {
    private final Context a;

    public ag(Context context) {
        this.a = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (au.z().a(this.a)) {
            au.z().a(this.a, map.get("eventName"), map.get("eventId"));
        }
    }
}
