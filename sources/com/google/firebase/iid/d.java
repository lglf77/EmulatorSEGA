package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.a.b;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class d extends Service {
    final ExecutorService a = Executors.newSingleThreadExecutor();
    private Binder b;
    private final Object c = new Object();
    private int d;
    private int e = 0;

    /* access modifiers changed from: private */
    public final void d(Intent intent) {
        if (intent != null) {
            b.a(intent);
        }
        synchronized (this.c) {
            this.e--;
            if (this.e == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Intent a(Intent intent) {
        return intent;
    }

    public abstract void b(Intent intent);

    public boolean c(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.b == null) {
            this.b = new h(this);
        }
        return this.b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent a2 = a(intent);
        if (a2 == null) {
            d(intent);
            return 2;
        } else if (c(a2)) {
            d(intent);
            return 2;
        } else {
            this.a.execute(new e(this, a2, intent));
            return 3;
        }
    }
}
