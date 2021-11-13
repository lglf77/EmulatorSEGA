package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.a;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ab<T extends IInterface> {
    private static String[] A = {"service_esmobile", "service_googleme"};
    final Handler a;
    protected ah b;
    protected AtomicInteger c;
    private int d;
    private long e;
    private long f;
    private int g;
    private long h;
    private g i;
    private final Context j;
    private final Looper k;
    private final c l;
    private final i m;
    private final Object n;
    /* access modifiers changed from: private */
    public final Object o;
    /* access modifiers changed from: private */
    public p p;
    private T q;
    /* access modifiers changed from: private */
    public final ArrayList<ag<?>> r;
    private aj s;
    private int t;
    /* access modifiers changed from: private */
    public final ad u;
    /* access modifiers changed from: private */
    public final ae v;
    private final int w;
    private final String x;
    /* access modifiers changed from: private */
    public a y;
    /* access modifiers changed from: private */
    public boolean z;

    protected ab(Context context, Looper looper, int i2, ad adVar, ae aeVar, String str) {
        this(context, looper, c.a(context), i.a(), i2, (ad) y.a(adVar), (ae) y.a(aeVar), (String) null);
    }

    protected ab(Context context, Looper looper, c cVar, i iVar, int i2, ad adVar, ae aeVar, String str) {
        this.n = new Object();
        this.o = new Object();
        this.r = new ArrayList<>();
        this.t = 1;
        this.y = null;
        this.z = false;
        this.c = new AtomicInteger(0);
        this.j = (Context) y.a(context, (Object) "Context must not be null");
        this.k = (Looper) y.a(looper, (Object) "Looper must not be null");
        this.l = (c) y.a(cVar, (Object) "Supervisor must not be null");
        this.m = (i) y.a(iVar, (Object) "API availability must not be null");
        this.a = new af(this, looper);
        this.w = i2;
        this.u = adVar;
        this.v = aeVar;
        this.x = str;
    }

    /* access modifiers changed from: private */
    public final void a(int i2, T t2) {
        boolean z2 = true;
        if ((i2 == 4) != (t2 != null)) {
            z2 = false;
        }
        y.b(z2);
        synchronized (this.n) {
            this.t = i2;
            this.q = t2;
            switch (i2) {
                case a.b.AdsAttrs_adSizes:
                    if (this.s != null) {
                        this.l.a(a(), b(), 129, this.s, q());
                        this.s = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.s == null || this.i == null)) {
                        String a2 = this.i.a();
                        String b2 = this.i.b();
                        Log.e("GmsClient", new StringBuilder(String.valueOf(a2).length() + 70 + String.valueOf(b2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(a2).append(" on ").append(b2).toString());
                        this.l.a(this.i.a(), this.i.b(), this.i.c(), this.s, q());
                        this.c.incrementAndGet();
                    }
                    this.s = new aj(this, this.c.get());
                    this.i = new g(b(), a(), false, 129);
                    if (!this.l.a(new d(this.i.a(), this.i.b(), this.i.c()), this.s, q())) {
                        String a3 = this.i.a();
                        String b3 = this.i.b();
                        Log.e("GmsClient", new StringBuilder(String.valueOf(a3).length() + 34 + String.valueOf(b3).length()).append("unable to connect to service: ").append(a3).append(" on ").append(b3).toString());
                        a(16, (Bundle) null, this.c.get());
                        break;
                    }
                    break;
                case 4:
                    a(t2);
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean a(int i2, int i3, T t2) {
        boolean z2;
        synchronized (this.n) {
            if (this.t != i2) {
                z2 = false;
            } else {
                a(i3, t2);
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: private */
    public final void c(int i2) {
        int i3;
        if (r()) {
            i3 = 5;
            this.z = true;
        } else {
            i3 = 4;
        }
        this.a.sendMessage(this.a.obtainMessage(i3, this.c.get(), 16));
    }

    private final String q() {
        return this.x == null ? this.j.getClass().getName() : this.x;
    }

    private final boolean r() {
        boolean z2;
        synchronized (this.n) {
            z2 = this.t == 3;
        }
        return z2;
    }

    /* access modifiers changed from: private */
    public final boolean s() {
        if (this.z || TextUtils.isEmpty(c()) || TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        try {
            Class.forName(c());
            return true;
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public void a(int i2) {
        this.d = i2;
        this.e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Bundle bundle, int i3) {
        this.a.sendMessage(this.a.obtainMessage(7, i3, -1, new am(this, i2, (Bundle) null)));
    }

    /* access modifiers changed from: protected */
    public void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        this.a.sendMessage(this.a.obtainMessage(1, i3, -1, new al(this, i2, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public void a(T t2) {
        this.f = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void a(com.google.android.gms.common.a aVar) {
        this.g = aVar.b();
        this.h = System.currentTimeMillis();
    }

    public void a(ah ahVar) {
        this.b = (ah) y.a(ahVar, (Object) "Connection progress callbacks cannot be null.");
        a(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    public final void a(ah ahVar, int i2, PendingIntent pendingIntent) {
        this.b = (ah) y.a(ahVar, (Object) "Connection progress callbacks cannot be null.");
        this.a.sendMessage(this.a.obtainMessage(3, this.c.get(), i2, pendingIntent));
    }

    public final void a(h hVar, Set<Scope> set) {
        Bundle j2 = j();
        an anVar = new an(this.w);
        anVar.a = this.j.getPackageName();
        anVar.d = j2;
        if (set != null) {
            anVar.c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (n()) {
            anVar.e = h() != null ? h() : new Account("<<default account>>", "com.google");
            if (hVar != null) {
                anVar.b = hVar.asBinder();
            }
        } else if (o()) {
            anVar.e = h();
        }
        anVar.f = i();
        try {
            synchronized (this.o) {
                if (this.p != null) {
                    this.p.a(new ai(this, this.c.get()), anVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            b(1);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            a(8, (IBinder) null, (Bundle) null, this.c.get());
        }
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "com.google.android.gms";
    }

    public final void b(int i2) {
        this.a.sendMessage(this.a.obtainMessage(6, this.c.get(), i2));
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    public final void d() {
        int a2 = this.m.a(this.j);
        if (a2 != 0) {
            a(1, (IInterface) null);
            a((ah) new ak(this), a2, (PendingIntent) null);
            return;
        }
        a((ah) new ak(this));
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.n) {
            z2 = this.t == 4;
        }
        return z2;
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.n) {
            z2 = this.t == 2 || this.t == 3;
        }
        return z2;
    }

    public void g() {
        this.c.incrementAndGet();
        synchronized (this.r) {
            int size = this.r.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.r.get(i2).d();
            }
            this.r.clear();
        }
        synchronized (this.o) {
            this.p = null;
        }
        a(1, (IInterface) null);
    }

    public Account h() {
        return null;
    }

    public g[] i() {
        return new g[0];
    }

    /* access modifiers changed from: protected */
    public Bundle j() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (!e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public Bundle l() {
        return null;
    }

    public final T m() {
        T t2;
        synchronized (this.n) {
            if (this.t == 5) {
                throw new DeadObjectException();
            }
            k();
            y.a(this.q != null, (Object) "Client is connected but service is null");
            t2 = this.q;
        }
        return t2;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> p() {
        return Collections.EMPTY_SET;
    }
}
