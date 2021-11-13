package com.google.android.gms.internal;

import android.database.ContentObserver;
import android.os.Handler;

final class alh extends ContentObserver {
    private /* synthetic */ alb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alh(alb alb, Handler handler) {
        super(handler);
        this.a = alb;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.a.a();
    }
}
