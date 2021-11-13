package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.amf;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nd;

final class m implements nd {
    private /* synthetic */ ev a;
    private /* synthetic */ l b;

    m(l lVar, ev evVar) {
        this.b = lVar;
        this.a = evVar;
    }

    public final void a() {
        Context context = this.b.e.c;
        mw mwVar = this.a.b;
        if (mwVar == null) {
            throw null;
        }
        new amb(context, (View) mwVar).a((amf) this.a.b);
    }
}
