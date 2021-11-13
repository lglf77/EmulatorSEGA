package com.google.android.gms.internal;

import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.ae;

final class axu implements ae {
    private /* synthetic */ ks a;
    private /* synthetic */ axo b;

    axu(axo axo, ks ksVar) {
        this.b = axo;
        this.a = ksVar;
    }

    public final void a(a aVar) {
        synchronized (this.b.d) {
            this.a.a(new RuntimeException("Connection failed."));
        }
    }
}
