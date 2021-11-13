package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;

@bfk
public final class it {
    private long a;
    private long b = Long.MIN_VALUE;
    private Object c = new Object();

    public it(long j) {
        this.a = j;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            long b2 = au.k().b();
            if (this.b + this.a > b2) {
                z = false;
            } else {
                this.b = b2;
                z = true;
            }
        }
        return z;
    }
}
