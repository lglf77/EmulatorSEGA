package com.google.android.gms.internal;

final class dp implements Runnable {
    private /* synthetic */ ev a;
    private /* synthetic */ Cdo b;

    dp(Cdo doVar, ev evVar) {
        this.b = doVar;
        this.a = evVar;
    }

    public final void run() {
        this.b.i.b(this.a);
    }
}
