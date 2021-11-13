package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

final class aoo implements Executor {
    private /* synthetic */ Handler a;

    aoo(ann ann, Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
