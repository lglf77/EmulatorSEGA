package com.google.android.gms.internal;

import android.content.Intent;

final /* synthetic */ class wc implements Runnable {
    private final wb a;
    private final int b;
    private final sj c;
    private final Intent d;

    wc(wb wbVar, int i, sj sjVar, Intent intent) {
        this.a = wbVar;
        this.b = i;
        this.c = sjVar;
        this.d = intent;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
