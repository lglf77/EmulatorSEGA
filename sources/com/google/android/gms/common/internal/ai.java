package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class ai extends o {
    private ab a;
    private final int b;

    public ai(ab abVar, int i) {
        this.a = abVar;
        this.b = i;
    }

    public final void a(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        y.a(this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.a(i, iBinder, bundle, this.b);
        this.a = null;
    }
}
