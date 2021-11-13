package com.google.android.gms.internal;

import java.util.Map;

final class nr implements Runnable {
    private /* synthetic */ Map a;
    private /* synthetic */ nq b;

    nr(nq nqVar, Map map) {
        this.b = nqVar;
        this.a = map;
    }

    public final void run() {
        this.b.a.a("pubVideoCmd", this.a);
    }
}
