package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class gr implements Callable<Void> {
    private /* synthetic */ Runnable a;

    gr(Runnable runnable) {
        this.a = runnable;
    }

    public final /* synthetic */ Object call() {
        this.a.run();
        return null;
    }
}
