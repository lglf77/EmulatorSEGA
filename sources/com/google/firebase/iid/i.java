package com.google.firebase.iid;

import android.util.Log;

final class i implements Runnable {
    private /* synthetic */ f a;
    private /* synthetic */ h b;

    i(h hVar, f fVar) {
        this.b = hVar;
        this.a = fVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.b.a.b(this.a.a);
        this.a.a();
    }
}
