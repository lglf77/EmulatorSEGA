package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final class g implements Runnable {
    private /* synthetic */ Intent a;
    private /* synthetic */ f b;

    g(f fVar, Intent intent) {
        this.b = fVar;
        this.a = intent;
    }

    public final void run() {
        String action = this.a.getAction();
        Log.w("EnhancedIntentService", new StringBuilder(String.valueOf(action).length() + 61).append("Service took too long to process intent: ").append(action).append(" App may get closed.").toString());
        this.b.a();
    }
}
