package com.google.android.gms.internal;

import android.os.RemoteException;

final class arx implements Runnable {
    private /* synthetic */ arw a;

    arx(arw arw) {
        this.a = arw;
    }

    public final void run() {
        if (this.a.a != null) {
            try {
                this.a.a.a(1);
            } catch (RemoteException e) {
                jn.c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
