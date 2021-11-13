package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import java.lang.ref.WeakReference;

final class auo {
    /* access modifiers changed from: private */
    public final WeakReference<mw> a;
    /* access modifiers changed from: private */
    public String b;

    public auo(mw mwVar) {
        this.a = new WeakReference<>(mwVar);
    }

    public final void a(beq beq) {
        beq.a("/loadHtml", new aup(this, beq));
        beq.a("/showOverlay", new aus(this, beq));
        beq.a("/hideOverlay", new aut(this, beq));
        mw mwVar = (mw) this.a.get();
        if (mwVar != null) {
            mwVar.w().a("/sendMessageToSdk", (aa<? super mw>) new auu(this, beq));
        }
    }
}
