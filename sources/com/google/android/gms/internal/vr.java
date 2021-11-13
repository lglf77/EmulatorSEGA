package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class vr implements Runnable {
    private /* synthetic */ AtomicReference a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ String d;
    private /* synthetic */ boolean e;
    private /* synthetic */ re f;
    private /* synthetic */ vg g;

    vr(vg vgVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, re reVar) {
        this.g = vgVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = reVar;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        synchronized (this.a) {
            try {
                sb d2 = this.g.b;
                if (d2 == null) {
                    this.g.t().y().a("Failed to get user properties", sj.a(this.b), this.c, this.d);
                    this.a.set(Collections.emptyList());
                    this.a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.a.set(d2.a(this.c, this.d, this.e, this.f));
                } else {
                    this.a.set(d2.a(this.b, this.c, this.d, this.e));
                }
                this.g.F();
                this.a.notify();
            } catch (RemoteException e2) {
                this.g.t().y().a("Failed to get user properties", sj.a(this.b), this.c, e2);
                this.a.set(Collections.emptyList());
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
