package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

final class aus implements aa<Object> {
    private /* synthetic */ beq a;
    private /* synthetic */ auo b;

    aus(auo auo, beq beq) {
        this.b = auo;
        this.a = beq;
    }

    public final void zza(Object obj, Map<String, String> map) {
        mw mwVar = (mw) this.b.a.get();
        if (mwVar == null) {
            this.a.b("/showOverlay", this);
        } else if (mwVar == null) {
            throw null;
        } else {
            ((View) mwVar).setVisibility(0);
        }
    }
}
