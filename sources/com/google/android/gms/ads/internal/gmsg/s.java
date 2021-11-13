package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.mw;
import java.util.Map;

final class s implements aa<mw> {
    s() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        d s = mwVar.s();
        if (s != null) {
            s.a();
            return;
        }
        d t = mwVar.t();
        if (t != null) {
            t.a();
        } else {
            fn.e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
