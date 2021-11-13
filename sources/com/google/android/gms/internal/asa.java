package com.google.android.gms.internal;

import android.os.RemoteException;

final class asa implements Runnable {
    private /* synthetic */ arz a;

    asa(arz arz) {
        this.a = arz;
    }

    public final void run() {
        if (this.a.a != null) {
            try {
                this.a.a.a(1);
            } catch (RemoteException e) {
                jn.c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
