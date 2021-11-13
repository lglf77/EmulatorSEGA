package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class aed extends BroadcastReceiver {
    private /* synthetic */ acb a;

    aed(acb acb) {
        this.a = acb;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.c();
    }
}
