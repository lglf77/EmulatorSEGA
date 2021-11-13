package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.b.d;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class k {
    private static k a;
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService c;
    private m d = new m(this);
    private int e = 1;

    private k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }

    private final synchronized <T> d<T> a(s<T> sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(sVar);
            Log.d("MessengerIpcClient", new StringBuilder(String.valueOf(valueOf).length() + 9).append("Queueing ").append(valueOf).toString());
        }
        if (!this.d.a((s) sVar)) {
            this.d = new m(this);
            this.d.a((s) sVar);
        }
        return sVar.b.a();
    }

    public static synchronized k a(Context context) {
        k kVar;
        synchronized (k.class) {
            if (a == null) {
                a = new k(context, Executors.newSingleThreadScheduledExecutor());
            }
            kVar = a;
        }
        return kVar;
    }

    public final d<Bundle> a(int i, Bundle bundle) {
        return a(new u(a(), 1, bundle));
    }
}
