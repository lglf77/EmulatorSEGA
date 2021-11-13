package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

final class k implements Runnable {
    private /* synthetic */ Drawable a;
    private /* synthetic */ j b;

    k(j jVar, Drawable drawable) {
        this.b = jVar;
        this.a = drawable;
    }

    public final void run() {
        this.b.a.c.getWindow().setBackgroundDrawable(this.a);
    }
}
