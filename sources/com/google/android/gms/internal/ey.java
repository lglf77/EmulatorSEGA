package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

@bfk
final class ey {
    private long a = -1;
    private long b = -1;

    public final long a() {
        return this.b;
    }

    public final void b() {
        this.b = SystemClock.elapsedRealtime();
    }

    public final void c() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.a);
        bundle.putLong("tclose", this.b);
        return bundle;
    }
}
