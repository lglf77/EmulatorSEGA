package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class amd extends BroadcastReceiver {
    private /* synthetic */ amb a;

    amd(amb amb) {
        this.a = amb;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(3);
    }
}
