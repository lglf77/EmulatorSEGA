package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import java.util.Map;

@bfk
public final class ad implements aa<Object> {
    private final ae a;

    public ad(ae aeVar) {
        this.a = aeVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        float f;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat(map.get("blurRadius"));
                this.a.a(equals);
                this.a.a(equals2, f);
            }
        } catch (NumberFormatException e) {
            fn.b("Fail to parse float", e);
        }
        f = 0.0f;
        this.a.a(equals);
        this.a.a(equals2, f);
    }
}
