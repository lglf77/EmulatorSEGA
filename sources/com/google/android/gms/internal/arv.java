package com.google.android.gms.internal;

import android.os.RemoteException;

final class arv implements Runnable {
    private /* synthetic */ aru a;

    arv(aru aru) {
        this.a = aru;
    }

    public final void run() {
        if (this.a.a.a != null) {
            try {
                this.a.a.a.a(1);
            } catch (RemoteException e) {
                jn.c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
