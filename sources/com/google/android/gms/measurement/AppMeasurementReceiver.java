package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.a.b;
import com.google.android.gms.internal.tb;
import com.google.android.gms.internal.td;

public final class AppMeasurementReceiver extends b implements td {
    private tb a;

    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    public final void a(Context context, Intent intent) {
        a_(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new tb(this);
        }
        this.a.a(context, intent);
    }
}
