package com.google.android.gms.internal;

final class apn implements Runnable {
    private final aws a;
    private final bbt b;
    private final Runnable c;

    public apn(ann ann, aws aws, bbt bbt, Runnable runnable) {
        this.a = aws;
        this.b = bbt;
        this.c = runnable;
    }

    public final void run() {
        if (this.b.c == null) {
            this.a.a(this.b.a);
        } else {
            this.a.a(this.b.c);
        }
        if (this.b.d) {
            this.a.b("intermediate-response");
        } else {
            this.a.c("done");
        }
        if (this.c != null) {
            this.c.run();
        }
    }
}
