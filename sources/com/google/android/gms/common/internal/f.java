package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.a.a;
import java.util.HashSet;
import java.util.Set;

final class f implements ServiceConnection {
    private final Set<ServiceConnection> a = new HashSet();
    private int b = 2;
    private boolean c;
    private IBinder d;
    private final d e;
    private ComponentName f;
    private /* synthetic */ e g;

    public f(e eVar, d dVar) {
        this.g = eVar;
        this.e = dVar;
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        a unused = this.g.d;
        Context unused2 = this.g.b;
        this.e.d();
        this.a.add(serviceConnection);
    }

    public final void a(String str) {
        this.b = 3;
        this.c = this.g.d.a(this.g.b, str, this.e.d(), this, this.e.c());
        if (this.c) {
            this.g.c.sendMessageDelayed(this.g.c.obtainMessage(1, this.e), this.g.f);
            return;
        }
        this.b = 2;
        try {
            a unused = this.g.d;
            this.g.b.unbindService(this);
        } catch (IllegalArgumentException e2) {
        }
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public final int b() {
        return this.b;
    }

    public final void b(ServiceConnection serviceConnection, String str) {
        a unused = this.g.d;
        Context unused2 = this.g.b;
        this.a.remove(serviceConnection);
    }

    public final void b(String str) {
        this.g.c.removeMessages(1, this.e);
        a unused = this.g.d;
        this.g.b.unbindService(this);
        this.c = false;
        this.b = 2;
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final IBinder d() {
        return this.d;
    }

    public final ComponentName e() {
        return this.f;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection onServiceConnected : this.a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
