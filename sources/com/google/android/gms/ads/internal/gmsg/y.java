package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.mw;
import java.util.Map;

final class y implements aa<mw> {
    y() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        if (map.keySet().contains("start")) {
            mwVar.w().i();
        } else if (map.keySet().contains("stop")) {
            mwVar.w().j();
        } else if (map.keySet().contains("cancel")) {
            mwVar.w().k();
        }
    }
}
