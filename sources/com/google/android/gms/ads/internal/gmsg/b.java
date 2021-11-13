package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.a;
import com.google.android.gms.ads.internal.br;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.bca;
import com.google.android.gms.internal.bcd;
import com.google.android.gms.internal.bcf;
import com.google.android.gms.internal.bcg;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.mw;
import java.util.Map;

@bfk
public final class b implements aa<mw> {
    private static Map<String, Integer> c = e.a("resize", 1, "playVideo", 2, "storePicture", 3, "createCalendarEvent", 4, "setOrientationProperties", 5, "closeResizedAd", 6);
    private final br a;
    private final bcd b;

    public b(br brVar, bcd bcd) {
        this.a = brVar;
        this.b = bcd;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        int intValue = c.get((String) map.get("a")).intValue();
        if (intValue == 5 || this.a == null || this.a.b()) {
            switch (intValue) {
                case a.b.AdsAttrs_adSizes:
                    this.b.a((Map<String, String>) map);
                    return;
                case 3:
                    new bcg(mwVar, map).a();
                    return;
                case 4:
                    new bca(mwVar, map).a();
                    return;
                case 5:
                    new bcf(mwVar, map).a();
                    return;
                case 6:
                    this.b.a(true);
                    return;
                default:
                    fn.d("Unknown MRAID command called.");
                    return;
            }
        } else {
            this.a.a((String) null);
        }
    }
}
