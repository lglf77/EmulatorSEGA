package com.google.android.gms.internal;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class kb implements Runnable {
    private final ks a;

    kb(ks ksVar) {
        this.a = ksVar;
    }

    public final void run() {
        this.a.a(new TimeoutException());
    }
}
