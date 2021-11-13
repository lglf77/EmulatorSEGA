package com.google.android.gms.internal;

import android.content.Context;

final class aro implements Runnable {
    private /* synthetic */ Context a;
    private /* synthetic */ arn b;

    aro(arn arn, Context context) {
        this.b = arn;
        this.a = context;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
