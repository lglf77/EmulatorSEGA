package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.gms.common.s;

@bfk
public final class asu {
    private final Object a = new Object();
    private final ConditionVariable b = new ConditionVariable();
    private volatile boolean c = false;
    /* access modifiers changed from: private */
    public SharedPreferences d = null;
    private Context e;

    public final <T> T a(asl<T> asl) {
        if (!this.b.block(5000)) {
            throw new IllegalStateException("Flags.initialize() was not called!");
        }
        if (!this.c || this.d == null) {
            synchronized (this.a) {
                if (!this.c || this.d == null) {
                    T b2 = asl.b();
                    return b2;
                }
            }
        }
        return iv.a(this.e, new asv(this, asl));
    }

    public final void a(Context context) {
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c) {
                    this.e = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        Context c2 = s.c(context);
                        if (c2 != null || context == null) {
                            context = c2;
                        } else {
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                        }
                        if (context != null) {
                            app.d();
                            this.d = context.getSharedPreferences("google_ads_flags", 0);
                            this.c = true;
                            this.b.open();
                        }
                    } finally {
                        this.b.open();
                    }
                }
            }
        }
    }
}
