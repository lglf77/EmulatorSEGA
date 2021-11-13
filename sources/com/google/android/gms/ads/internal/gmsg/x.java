package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.mw;
import java.util.Map;

final class x implements aa<mw> {
    x() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            mwVar.e_();
        } else if ("resume".equals(str)) {
            mwVar.f_();
        }
    }
}
