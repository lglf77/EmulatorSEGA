package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;

final class mm implements Runnable {
    private /* synthetic */ ml a;

    mm(ml mlVar) {
        this.a = mlVar;
    }

    public final void run() {
        au.x().b(this.a);
    }
}
