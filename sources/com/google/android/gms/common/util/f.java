package com.google.android.gms.common.util;

import android.os.SystemClock;

public final class f implements d {
    private static f a = new f();

    private f() {
    }

    public static d d() {
        return a;
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        return System.nanoTime();
    }
}
