package com.google.android.gms.internal;

final class ls implements Runnable {
    private /* synthetic */ lr a;

    ls(lr lrVar) {
        this.a = lrVar;
    }

    public final void run() {
        this.a.a("surfaceCreated", new String[0]);
    }
}
