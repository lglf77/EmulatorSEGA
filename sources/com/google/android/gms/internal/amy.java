package com.google.android.gms.internal;

import android.view.View;

final class amy implements Runnable {
    private /* synthetic */ View a;
    private /* synthetic */ amx b;

    amy(amx amx, View view) {
        this.b = amx;
        this.a = view;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
