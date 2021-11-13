package com.google.android.gms.internal;

@bfk
public abstract class fj implements hp<kh> {
    private final Runnable a = new fk(this);
    /* access modifiers changed from: private */
    public volatile Thread b;
    private boolean c = false;

    public fj() {
    }

    public fj(boolean z) {
    }

    public abstract void a();

    public abstract void b();

    public final void c() {
        b();
        if (this.b != null) {
            this.b.interrupt();
        }
    }

    public final /* synthetic */ Object d() {
        return this.c ? gq.a(1, this.a) : gq.a(this.a);
    }

    public final kh h() {
        return this.c ? gq.a(1, this.a) : gq.a(this.a);
    }
}
