package com.google.android.gms.internal;

import android.content.Context;

@bfk
public final class ec implements ej {
    private ek a;

    public ec(ek ekVar) {
        this.a = ekVar;
    }

    public final ei a(Context context, jp jpVar, z zVar) {
        if (zVar.K == null) {
            return null;
        }
        return new dy(context, jpVar, zVar.K, zVar.a, this.a);
    }
}
