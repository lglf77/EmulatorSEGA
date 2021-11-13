package com.google.android.gms.internal;

import android.content.Context;

public final class pw {
    private static pw b = new pw();
    private pv a = null;

    public static pv a(Context context) {
        return b.b(context);
    }

    private final synchronized pv b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new pv(context);
        }
        return this.a;
    }
}
