package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.ad;

final class anu implements ad {
    private /* synthetic */ anr a;

    anu(anr anr) {
        this.a = anr;
    }

    public final void a(int i) {
        synchronized (this.a.b) {
            aoc unused = this.a.e = null;
            this.a.b.notifyAll();
        }
    }

    public final void a(Bundle bundle) {
        synchronized (this.a.b) {
            try {
                if (this.a.c != null) {
                    aoc unused = this.a.e = this.a.c.q();
                }
            } catch (DeadObjectException e) {
                fn.b("Unable to obtain a cache service instance.", e);
                this.a.c();
            }
            this.a.b.notifyAll();
        }
    }
}
