package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.au;

final class bh implements Runnable {
    private /* synthetic */ v a;
    private /* synthetic */ ah b;
    private /* synthetic */ bf c;

    bh(bf bfVar, v vVar, ah ahVar) {
        this.c = bfVar;
        this.a = vVar;
        this.b = ahVar;
    }

    public final void run() {
        z zVar;
        try {
            zVar = this.c.a(this.a);
        } catch (Exception e) {
            au.i().a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            fn.c("Could not fetch ad response due to an Exception.", e);
            zVar = null;
        }
        if (zVar == null) {
            zVar = new z(0);
        }
        try {
            this.b.a(zVar);
        } catch (RemoteException e2) {
            fn.c("Fail to forward ad response.", e2);
        }
    }
}
