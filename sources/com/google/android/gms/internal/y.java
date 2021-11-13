package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

@bfk
public final class y extends ai {
    private final WeakReference<n> a;

    public y(n nVar) {
        this.a = new WeakReference<>(nVar);
    }

    public final void a(z zVar) {
        n nVar = (n) this.a.get();
        if (nVar != null) {
            nVar.a(zVar);
        }
    }
}
