package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.fn;
import java.util.Map;

@bfk
public final class g implements aa<Object> {
    private final h a;

    public g(h hVar) {
        this.a = hVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        dw dwVar;
        String str = map.get("action");
        if ("grant".equals(str)) {
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    dwVar = new dw(str2, parseInt);
                    this.a.a(dwVar);
                }
            } catch (NumberFormatException e) {
                fn.c("Unable to parse reward amount.", e);
            }
            dwVar = null;
            this.a.a(dwVar);
        } else if ("video_start".equals(str)) {
            this.a.a_();
        }
    }
}
