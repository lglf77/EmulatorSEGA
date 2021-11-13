package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

public abstract class c {
    private static final Object a = new Object();
    private static c b;

    public static c a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new e(context.getApplicationContext());
            }
        }
        return b;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        b(new d(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(d dVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void b(d dVar, ServiceConnection serviceConnection, String str);
}
