package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

final class c extends BroadcastReceiver {
    private b a;

    public c(b bVar) {
        this.a = bVar;
    }

    public final void a() {
        if (FirebaseInstanceId.g()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a != null && this.a.b()) {
            if (FirebaseInstanceId.g()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.a((Runnable) this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
