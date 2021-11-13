package com.google.android.gms.internal;

import android.os.RemoteException;

final class bap implements Runnable {
    private /* synthetic */ bai a;

    bap(bao bao, bai bai) {
        this.a = bai;
    }

    public final void run() {
        try {
            this.a.c.c();
        } catch (RemoteException e) {
            fn.c("Could not destroy mediation adapter.", e);
        }
    }
}
