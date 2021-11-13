package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import java.io.IOException;

final class et implements Runnable {
    private /* synthetic */ Context a;
    private /* synthetic */ ks b;

    et(es esVar, Context context, ks ksVar) {
        this.a = context;
        this.b = ksVar;
    }

    public final void run() {
        try {
            this.b.b(a.a(this.a));
        } catch (b | c | IOException | IllegalStateException e) {
            this.b.a(e);
            jn.b("Exception while getting advertising Id info", e);
        }
    }
}
