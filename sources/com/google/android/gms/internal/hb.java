package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class hb extends BroadcastReceiver {
    private /* synthetic */ gw a;

    private hb(gw gwVar) {
        this.a = gwVar;
    }

    /* synthetic */ hb(gw gwVar, gx gxVar) {
        this(gwVar);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.a.c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.a.c = false;
        }
    }
}
