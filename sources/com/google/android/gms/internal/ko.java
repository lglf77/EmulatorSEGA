package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class ko implements Executor {
    private final Handler a = new Handler(Looper.getMainLooper());

    ko() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.a.post(runnable);
        }
    }
}
