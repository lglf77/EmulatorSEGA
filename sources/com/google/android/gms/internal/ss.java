package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.y;

class ss extends BroadcastReceiver {
    private static String a = ss.class.getName();
    /* access modifiers changed from: private */
    public final tk b;
    private boolean c;
    private boolean d;

    ss(tk tkVar) {
        y.a(tkVar);
        this.b = tkVar;
    }

    public final void a() {
        this.b.a();
        this.b.h().c();
        if (!this.c) {
            this.b.t().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = this.b.s().y();
            this.b.f().E().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
            this.c = true;
        }
    }

    public final void b() {
        this.b.a();
        this.b.h().c();
        this.b.h().c();
        if (this.c) {
            this.b.f().E().a("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                this.b.t().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.b.f().y().a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.b.a();
        String action = intent.getAction();
        this.b.f().E().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean y = this.b.s().y();
            if (this.d != y) {
                this.d = y;
                this.b.h().a((Runnable) new st(this, y));
                return;
            }
            return;
        }
        this.b.f().A().a("NetworkBroadcastReceiver received unknown action", action);
    }
}
