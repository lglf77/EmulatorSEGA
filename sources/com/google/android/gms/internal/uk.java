package com.google.android.gms.internal;

abstract class uk extends uj {
    private boolean a;

    uk(tk tkVar) {
        super(tkVar);
        this.p.a(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean P() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void Q() {
        if (!P()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void R() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!w()) {
            this.p.F();
            this.a = true;
        }
    }

    public final void S() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h_();
        this.p.F();
        this.a = true;
    }

    /* access modifiers changed from: protected */
    public void h_() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean w();
}
