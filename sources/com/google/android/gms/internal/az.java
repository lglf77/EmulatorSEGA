package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

public final class az implements aa<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String valueOf = String.valueOf(map.get("errors"));
        fn.e(valueOf.length() != 0 ? "Invalid request: ".concat(valueOf) : new String("Invalid request: "));
        ar.f.b(str);
    }
}
