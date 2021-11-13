package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.ad;

final class axq implements ad {
    final /* synthetic */ axo a;
    private /* synthetic */ ks b;
    private /* synthetic */ axi c;

    axq(axo axo, ks ksVar, axi axi) {
        this.a = axo;
        this.b = ksVar;
        this.c = axi;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        synchronized (this.a.d) {
            if (!this.a.b) {
                boolean unused = this.a.b = true;
                axh d = this.a.a;
                if (d != null) {
                    this.b.a(new axt(this.b, gq.a((Runnable) new axs(this, d, this.b, this.c))), kn.b);
                }
            }
        }
    }
}
