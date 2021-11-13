package com.google.android.gms.internal;

import android.content.Context;

@bfk
public final class azj {
    private final Object a = new Object();
    private azq b;

    public final azq a(Context context, jp jpVar) {
        azq azq;
        synchronized (this.a) {
            if (this.b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.b = new azq(context, jpVar, (String) app.f().a(asw.a));
            }
            azq = this.b;
        }
        return azq;
    }
}
