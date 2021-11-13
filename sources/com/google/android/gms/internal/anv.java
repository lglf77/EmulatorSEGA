package com.google.android.gms.internal;

import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.ae;

final class anv implements ae {
    private /* synthetic */ anr a;

    anv(anr anr) {
        this.a = anr;
    }

    public final void a(a aVar) {
        synchronized (this.a.b) {
            aoc unused = this.a.e = null;
            if (this.a.c != null) {
                any unused2 = this.a.c = null;
            }
            this.a.b.notifyAll();
        }
    }
}
