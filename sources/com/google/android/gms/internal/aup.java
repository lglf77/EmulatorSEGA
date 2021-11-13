package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

final class aup implements aa<Object> {
    final /* synthetic */ beq a;
    final /* synthetic */ auo b;

    aup(auo auo, beq beq) {
        this.b = auo;
        this.a = beq;
    }

    public final void zza(Object obj, Map<String, String> map) {
        mw mwVar = (mw) this.b.a.get();
        if (mwVar == null) {
            this.a.b("/loadHtml", this);
            return;
        }
        mwVar.w().a((nb) new aur(this, map));
        String str = map.get("overlayHtml");
        String str2 = map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            mwVar.loadData(str, "text/html", "UTF-8");
        } else {
            mwVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
