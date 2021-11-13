package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.tb;
import com.google.android.gms.internal.td;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements td {
    private tb a;

    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    public final void a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new tb(this);
        }
        this.a.a(context, intent);
    }
}
