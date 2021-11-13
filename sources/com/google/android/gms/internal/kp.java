package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final class kp implements Executor {
    kp() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
