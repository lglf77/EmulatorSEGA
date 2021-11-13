package com.google.android.gms.internal;

import java.util.Comparator;

final class anf implements Comparator<anl> {
    anf(ane ane) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        anl anl = (anl) obj;
        anl anl2 = (anl) obj2;
        int i = anl.c - anl2.c;
        return i != 0 ? i : (int) (anl.a - anl2.a);
    }
}
