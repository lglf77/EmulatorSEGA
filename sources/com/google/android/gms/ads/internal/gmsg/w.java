package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.mw;
import java.util.Map;

final class w implements aa<mw> {
    w() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        if (((Boolean) app.f().a(asw.bf)).booleanValue()) {
            mwVar.d(!Boolean.parseBoolean((String) map.get("disabled")));
        }
    }
}
