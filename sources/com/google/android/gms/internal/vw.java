package com.google.android.gms.internal;

import android.content.ComponentName;

final class vw implements Runnable {
    private /* synthetic */ ComponentName a;
    private /* synthetic */ vu b;

    vw(vu vuVar, ComponentName componentName) {
        this.b = vuVar;
        this.a = componentName;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
