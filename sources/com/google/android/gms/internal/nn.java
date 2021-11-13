package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

final class nn implements aa<mw> {
    private /* synthetic */ nm a;

    nn(nm nmVar) {
        this.a = nmVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.a.b) {
                        if (this.a.y != parseInt) {
                            int unused = this.a.y = parseInt;
                            this.a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    fn.c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
