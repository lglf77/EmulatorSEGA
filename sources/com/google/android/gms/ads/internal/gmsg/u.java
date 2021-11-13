package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.fn;
import java.util.Map;

final class u implements aa<Object> {
    u() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        fn.d(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
