package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.mw;
import java.util.Map;

final class z implements aa<mw> {
    z() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        if (map.keySet().contains("start")) {
            mwVar.e(true);
        }
        if (map.keySet().contains("stop")) {
            mwVar.e(false);
        }
    }
}
