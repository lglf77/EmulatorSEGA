package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class h extends Binder {
    /* access modifiers changed from: private */
    public final d a;

    h(d dVar) {
        this.a = dVar;
    }

    public final void a(f fVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (this.a.c(fVar.a)) {
            fVar.a();
            return;
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "intent being queued for bg execution");
        }
        this.a.a.execute(new i(this, fVar));
    }
}
