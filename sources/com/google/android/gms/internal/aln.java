package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import org.json.JSONObject;

@bfk
public final class aln implements ama {
    /* access modifiers changed from: private */
    public final alb a;
    private final mw b;
    private final aa<mw> c = new alo(this);
    private final aa<mw> d = new alp(this);
    private final aa<mw> e = new alq(this);

    public aln(alb alb, mw mwVar) {
        this.a = alb;
        this.b = mwVar;
        mw mwVar2 = this.b;
        mwVar2.a("/updateActiveView", (aa<? super mw>) this.c);
        mwVar2.a("/untrackActiveViewUnit", (aa<? super mw>) this.d);
        mwVar2.a("/visibilityChanged", (aa<? super mw>) this.e);
        String valueOf = String.valueOf(this.a.a.d());
        fn.b(valueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(valueOf) : new String("Custom JS tracking ad unit: "));
    }

    public final void a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.b.b("AFMA_updateActiveView", jSONObject);
        } else {
            this.a.b((ama) this);
        }
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        mw mwVar = this.b;
        mwVar.b("/visibilityChanged", (aa<? super mw>) this.e);
        mwVar.b("/untrackActiveViewUnit", (aa<? super mw>) this.d);
        mwVar.b("/updateActiveView", (aa<? super mw>) this.c);
    }
}
