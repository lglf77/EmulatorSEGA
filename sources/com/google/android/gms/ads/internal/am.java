package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class am {
    private final Handler a;

    public am(Handler handler) {
        this.a = handler;
    }

    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public final boolean a(Runnable runnable, long j) {
        return this.a.postDelayed(runnable, j);
    }
}
