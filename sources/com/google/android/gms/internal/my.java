package com.google.android.gms.internal;

import android.view.View;

final class my implements Runnable {
    private /* synthetic */ View a;
    private /* synthetic */ ei b;
    private /* synthetic */ int c;
    private /* synthetic */ mx d;

    my(mx mxVar, View view, ei eiVar, int i) {
        this.d = mxVar;
        this.a = view;
        this.b = eiVar;
        this.c = i;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c - 1);
    }
}
