package com.google.firebase.iid;

import android.content.Intent;

final class e implements Runnable {
    private /* synthetic */ Intent a;
    private /* synthetic */ Intent b;
    private /* synthetic */ d c;

    e(d dVar, Intent intent, Intent intent2) {
        this.c = dVar;
        this.a = intent;
        this.b = intent2;
    }

    public final void run() {
        this.c.b(this.a);
        this.c.d(this.b);
    }
}
