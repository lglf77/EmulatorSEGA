package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public final class aj implements ServiceConnection {
    private final int a;
    private /* synthetic */ ab b;

    public aj(ab abVar, int i) {
        this.b = abVar;
        this.a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p qVar;
        if (iBinder == null) {
            this.b.c(16);
            return;
        }
        synchronized (this.b.o) {
            ab abVar = this.b;
            if (iBinder == null) {
                qVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                qVar = (queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new q(iBinder) : (p) queryLocalInterface;
            }
            p unused = abVar.p = qVar;
        }
        this.b.a(0, (Bundle) null, this.a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.o) {
            p unused = this.b.p = null;
        }
        this.b.a.sendMessage(this.b.a.obtainMessage(6, this.a, 1));
    }
}
