package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.a.a;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.y;

public final class vu implements ServiceConnection, ad, ae {
    final /* synthetic */ vg a;
    /* access modifiers changed from: private */
    public volatile boolean b;
    private volatile si c;

    protected vu(vg vgVar) {
        this.a = vgVar;
    }

    public final void a() {
        this.a.c();
        Context l = this.a.l();
        synchronized (this) {
            if (this.b) {
                this.a.t().E().a("Connection attempt already in progress");
            } else if (this.c != null) {
                this.a.t().E().a("Already awaiting connection attempt");
            } else {
                this.c = new si(l, Looper.getMainLooper(), this, this);
                this.a.t().E().a("Connecting to remote service");
                this.b = true;
                this.c.d();
            }
        }
    }

    public final void a(int i) {
        y.b("MeasurementServiceConnection.onConnectionSuspended");
        this.a.t().D().a("Service connection suspended");
        this.a.s().a((Runnable) new vy(this));
    }

    public final void a(Intent intent) {
        this.a.c();
        Context l = this.a.l();
        a a2 = a.a();
        synchronized (this) {
            if (this.b) {
                this.a.t().E().a("Connection attempt already in progress");
                return;
            }
            this.a.t().E().a("Using local app measurement service");
            this.b = true;
            a2.a(l, intent, this.a.a, 129);
        }
    }

    public final void a(Bundle bundle) {
        y.b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c = null;
                this.a.s().a((Runnable) new vx(this, (sb) this.c.m()));
            } catch (DeadObjectException | IllegalStateException e) {
                this.c = null;
                this.b = false;
            }
        }
    }

    public final void a(com.google.android.gms.common.a aVar) {
        y.b("MeasurementServiceConnection.onConnectionFailed");
        sj g = this.a.p.g();
        if (g != null) {
            g.A().a("Service connection failed", aVar);
        }
        synchronized (this) {
            this.b = false;
            this.c = null;
        }
        this.a.s().a((Runnable) new vz(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d A[SYNTHETIC, Splitter:B:39:0x008d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
        /*
            r4 = this;
            r1 = 0
            java.lang.String r0 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.y.b((java.lang.String) r0)
            monitor-enter(r4)
            if (r6 != 0) goto L_0x001d
            r0 = 0
            r4.b = r0     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.vg r0 = r4.a     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.sj r0 = r0.t()     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.sl r0 = r0.y()     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "Service connected with null binder"
            r0.a(r1)     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
        L_0x001c:
            return
        L_0x001d:
            java.lang.String r0 = r6.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x006a }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r0)     // Catch:{ RemoteException -> 0x006a }
            if (r2 == 0) goto L_0x007c
            if (r6 != 0) goto L_0x0057
            r0 = r1
        L_0x002c:
            com.google.android.gms.internal.vg r1 = r4.a     // Catch:{ RemoteException -> 0x009e }
            com.google.android.gms.internal.sj r1 = r1.t()     // Catch:{ RemoteException -> 0x009e }
            com.google.android.gms.internal.sl r1 = r1.E()     // Catch:{ RemoteException -> 0x009e }
            java.lang.String r2 = "Bound to IMeasurementService interface"
            r1.a(r2)     // Catch:{ RemoteException -> 0x009e }
        L_0x003b:
            if (r0 != 0) goto L_0x008d
            r0 = 0
            r4.b = r0     // Catch:{ all -> 0x0054 }
            com.google.android.gms.common.a.a.a()     // Catch:{ IllegalArgumentException -> 0x009c }
            com.google.android.gms.internal.vg r0 = r4.a     // Catch:{ IllegalArgumentException -> 0x009c }
            android.content.Context r0 = r0.l()     // Catch:{ IllegalArgumentException -> 0x009c }
            com.google.android.gms.internal.vg r1 = r4.a     // Catch:{ IllegalArgumentException -> 0x009c }
            com.google.android.gms.internal.vu r1 = r1.a     // Catch:{ IllegalArgumentException -> 0x009c }
            r0.unbindService(r1)     // Catch:{ IllegalArgumentException -> 0x009c }
        L_0x0052:
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            goto L_0x001c
        L_0x0054:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r0
        L_0x0057:
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x006a }
            boolean r2 = r0 instanceof com.google.android.gms.internal.sb     // Catch:{ RemoteException -> 0x006a }
            if (r2 == 0) goto L_0x0064
            com.google.android.gms.internal.sb r0 = (com.google.android.gms.internal.sb) r0     // Catch:{ RemoteException -> 0x006a }
            goto L_0x002c
        L_0x0064:
            com.google.android.gms.internal.sd r0 = new com.google.android.gms.internal.sd     // Catch:{ RemoteException -> 0x006a }
            r0.<init>(r6)     // Catch:{ RemoteException -> 0x006a }
            goto L_0x002c
        L_0x006a:
            r0 = move-exception
            r0 = r1
        L_0x006c:
            com.google.android.gms.internal.vg r1 = r4.a     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.sj r1 = r1.t()     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.sl r1 = r1.y()     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "Service connect failed to get IMeasurementService"
            r1.a(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x003b
        L_0x007c:
            com.google.android.gms.internal.vg r2 = r4.a     // Catch:{ RemoteException -> 0x006a }
            com.google.android.gms.internal.sj r2 = r2.t()     // Catch:{ RemoteException -> 0x006a }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ RemoteException -> 0x006a }
            java.lang.String r3 = "Got binder with a wrong descriptor"
            r2.a(r3, r0)     // Catch:{ RemoteException -> 0x006a }
            r0 = r1
            goto L_0x003b
        L_0x008d:
            com.google.android.gms.internal.vg r1 = r4.a     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.tf r1 = r1.s()     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.vv r2 = new com.google.android.gms.internal.vv     // Catch:{ all -> 0x0054 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0054 }
            r1.a((java.lang.Runnable) r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x009c:
            r0 = move-exception
            goto L_0x0052
        L_0x009e:
            r1 = move-exception
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vu.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        y.b("MeasurementServiceConnection.onServiceDisconnected");
        this.a.t().D().a("Service disconnected");
        this.a.s().a((Runnable) new vw(this, componentName));
    }
}
