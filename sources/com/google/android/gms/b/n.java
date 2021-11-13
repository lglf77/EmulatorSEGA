package com.google.android.gms.b;

import java.util.concurrent.Executor;

final class n implements Executor {
    n() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
