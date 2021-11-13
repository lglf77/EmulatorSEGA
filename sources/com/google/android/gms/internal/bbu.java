package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.a;

final class bbu implements Runnable {
    private /* synthetic */ a.C0012a a;
    private /* synthetic */ bbs b;

    bbu(bbs bbs, a.C0012a aVar) {
        this.b = bbs;
        this.a = aVar;
    }

    public final void run() {
        try {
            this.b.a.a(bbw.a(this.a));
        } catch (RemoteException e) {
            jn.c("Could not call onAdFailedToLoad.", e);
        }
    }
}
