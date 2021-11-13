package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.a.c;

final class dg implements Runnable {
    private /* synthetic */ bav a;
    private /* synthetic */ aoy b;
    private /* synthetic */ dm c;
    private /* synthetic */ dd d;

    dg(dd ddVar, bav bav, aoy aoy, dm dmVar) {
        this.d = ddVar;
        this.a = bav;
        this.b = aoy;
        this.c = dmVar;
    }

    public final void run() {
        try {
            this.a.a(c.a(this.d.b), this.b, (String) null, (ds) this.c, this.d.g);
        } catch (RemoteException e) {
            RemoteException remoteException = e;
            String valueOf = String.valueOf(this.d.f);
            fn.c(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "), remoteException);
            this.d.a(this.d.f, 0);
        }
    }
}
