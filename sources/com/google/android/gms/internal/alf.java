package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class alf extends BroadcastReceiver {
    private /* synthetic */ alb a;

    alf(alb alb) {
        this.a = alb;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(3);
    }
}
