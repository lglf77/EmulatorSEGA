package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.a;
import com.google.android.gms.common.a.a;
import java.util.HashMap;

final class e extends c implements Handler.Callback {
    /* access modifiers changed from: private */
    public final HashMap<d, f> a = new HashMap<>();
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final Handler c;
    /* access modifiers changed from: private */
    public final a d;
    private final long e;
    /* access modifiers changed from: private */
    public final long f;

    e(Context context) {
        this.b = context.getApplicationContext();
        this.c = new Handler(context.getMainLooper(), this);
        this.d = a.a();
        this.e = 5000;
        this.f = 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean a(d dVar, ServiceConnection serviceConnection, String str) {
        boolean a2;
        y.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            f fVar = this.a.get(dVar);
            if (fVar != null) {
                this.c.removeMessages(0, dVar);
                if (!fVar.a(serviceConnection)) {
                    fVar.a(serviceConnection, str);
                    switch (fVar.b()) {
                        case a.b.AdsAttrs_adSizes:
                            serviceConnection.onServiceConnected(fVar.e(), fVar.d());
                            break;
                        case 2:
                            fVar.a(str);
                            break;
                    }
                } else {
                    String valueOf = String.valueOf(dVar);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
                }
            } else {
                fVar = new f(this, dVar);
                fVar.a(serviceConnection, str);
                fVar.a(str);
                this.a.put(dVar, fVar);
            }
            a2 = fVar.a();
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final void b(d dVar, ServiceConnection serviceConnection, String str) {
        y.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            f fVar = this.a.get(dVar);
            if (fVar == null) {
                String valueOf = String.valueOf(dVar);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (!fVar.a(serviceConnection)) {
                String valueOf2 = String.valueOf(dVar);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf2).toString());
            } else {
                fVar.b(serviceConnection, str);
                if (fVar.c()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, dVar), this.e);
                }
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case a.b.AdsAttrs_adSize:
                synchronized (this.a) {
                    d dVar = (d) message.obj;
                    f fVar = this.a.get(dVar);
                    if (fVar != null && fVar.c()) {
                        if (fVar.a()) {
                            fVar.b("GmsClientSupervisor");
                        }
                        this.a.remove(dVar);
                    }
                }
                return true;
            case a.b.AdsAttrs_adSizes:
                synchronized (this.a) {
                    d dVar2 = (d) message.obj;
                    f fVar2 = this.a.get(dVar2);
                    if (fVar2 != null && fVar2.b() == 3) {
                        String valueOf = String.valueOf(dVar2);
                        Log.wtf("GmsClientSupervisor", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Timeout waiting for ServiceConnection callback ").append(valueOf).toString(), new Exception());
                        ComponentName e2 = fVar2.e();
                        if (e2 == null) {
                            e2 = dVar2.b();
                        }
                        fVar2.onServiceDisconnected(e2 == null ? new ComponentName(dVar2.a(), "unknown") : e2);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
