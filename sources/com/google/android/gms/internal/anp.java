package com.google.android.gms.internal;

import java.util.Comparator;

public final class anp implements Comparator<anc> {
    public anp(ano ano) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        anc anc = (anc) obj;
        anc anc2 = (anc) obj2;
        if (anc.b() < anc2.b()) {
            return -1;
        }
        if (anc.b() > anc2.b()) {
            return 1;
        }
        if (anc.a() < anc2.a()) {
            return -1;
        }
        if (anc.a() > anc2.a()) {
            return 1;
        }
        float d = (anc.d() - anc.b()) * (anc.c() - anc.a());
        float d2 = (anc2.d() - anc2.b()) * (anc2.c() - anc2.a());
        if (d <= d2) {
            return d < d2 ? 1 : 0;
        }
        return -1;
    }
}
