package com.google.android.gms.internal;

public class ce extends Exception {
    private auq a;
    private long b;

    public ce() {
        this.a = null;
    }

    public ce(auq auq) {
        this.a = auq;
    }

    public ce(String str) {
        super(str);
        this.a = null;
    }

    public ce(Throwable th) {
        super(th);
        this.a = null;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        this.b = j;
    }
}
