package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;

final class wl {
    private final d a;
    private long b;

    public wl(d dVar) {
        y.a(dVar);
        this.a = dVar;
    }

    public final void a() {
        this.b = this.a.b();
    }

    public final boolean a(long j) {
        return this.b == 0 || this.a.b() - this.b >= 3600000;
    }

    public final void b() {
        this.b = 0;
    }
}
