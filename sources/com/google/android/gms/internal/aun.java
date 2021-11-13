package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.aa;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class aun implements aa<Object> {
    private final WeakReference<auj> a;
    private final String b;

    public aun(auj auj, String str) {
        this.a = new WeakReference<>(auj);
        this.b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        auj auj;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.b.equals(str)) {
            try {
                Integer.parseInt(map.get("eventType"));
            } catch (Exception e) {
                fn.b("Parse Scion log event type error", e);
            }
            if ("_ai".equals(str2)) {
                auj auj2 = (auj) this.a.get();
                if (auj2 != null) {
                    auj2.w();
                }
            } else if ("_ac".equals(str2) && (auj = (auj) this.a.get()) != null) {
                auj.x();
            }
        }
    }
}
