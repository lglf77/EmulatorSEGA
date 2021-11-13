package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.a;
import com.google.android.gms.common.a.a;
import com.google.android.gms.common.internal.y;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

final class m implements ServiceConnection {
    int a;
    final Messenger b;
    r c;
    final Queue<s<?>> d;
    final SparseArray<s<?>> e;
    final /* synthetic */ k f;

    private m(k kVar) {
        this.f = kVar;
        this.a = 0;
        this.b = new Messenger(new Handler(Looper.getMainLooper(), new n(this)));
        this.d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    private final void a(t tVar) {
        for (s a2 : this.d) {
            a2.a(tVar);
        }
        this.d.clear();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.e.size()) {
                this.e.valueAt(i2).a(tVar);
                i = i2 + 1;
            } else {
                this.e.clear();
                return;
            }
        }
    }

    private final void c() {
        this.f.c.execute(new p(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            a.a();
            this.f.b.unbindService(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        s sVar = this.e.get(i);
        if (sVar != null) {
            Log.w("MessengerIpcClient", new StringBuilder(31).append("Timing out request: ").append(i).toString());
            this.e.remove(i);
            sVar.a(new t(3, "Timed out waiting for response"));
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        switch (this.a) {
            case a.b.AdsAttrs_adSize:
                throw new IllegalStateException();
            case a.b.AdsAttrs_adSizes:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.a = 4;
                com.google.android.gms.common.a.a.a();
                this.f.b.unbindService(this);
                a(new t(i, str));
                break;
            case 3:
                this.a = 4;
                break;
            case 4:
                break;
            default:
                throw new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.a).toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", new StringBuilder(41).append("Received response to request: ").append(i).toString());
        }
        synchronized (this) {
            s sVar = this.e.get(i);
            if (sVar == null) {
                Log.w("MessengerIpcClient", new StringBuilder(50).append("Received response for unknown request: ").append(i).toString());
            } else {
                this.e.remove(i);
                a();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    sVar.a(new t(4, "Not supported by GmsCore"));
                } else {
                    sVar.a(data);
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(s sVar) {
        boolean z = false;
        boolean z2 = true;
        synchronized (this) {
            switch (this.a) {
                case a.b.AdsAttrs_adSize:
                    this.d.add(sVar);
                    if (this.a == 0) {
                        z = true;
                    }
                    y.a(z);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.a = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    if (com.google.android.gms.common.a.a.a().a(this.f.b, intent, this, 1)) {
                        this.f.c.schedule(new o(this), 30, TimeUnit.SECONDS);
                        break;
                    } else {
                        a(0, "Unable to bind to service");
                        break;
                    }
                case a.b.AdsAttrs_adSizes:
                    this.d.add(sVar);
                    break;
                case 2:
                    this.d.add(sVar);
                    c();
                    break;
                case 3:
                case 4:
                    z2 = false;
                    break;
                default:
                    throw new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.a).toString());
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            a(0, "Null service connection");
        } else {
            try {
                this.c = new r(iBinder);
                this.a = 2;
                c();
            } catch (RemoteException e2) {
                a(0, e2.getMessage());
            }
        }
        return;
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        a(2, "Service disconnected");
    }
}
