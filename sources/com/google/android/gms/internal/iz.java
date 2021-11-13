package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class iz extends BroadcastReceiver {
    private /* synthetic */ iy a;

    iz(iy iyVar) {
        this.a = iyVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
