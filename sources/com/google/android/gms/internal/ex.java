package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.au;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@bfk
public final class ex {
    private final fa a;
    private final LinkedList<ey> b;
    private final Object c;
    private final String d;
    private final String e;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private long l;

    private ex(fa faVar, String str, String str2) {
        this.c = new Object();
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.l = -1;
        this.a = faVar;
        this.d = str;
        this.e = str2;
        this.b = new LinkedList<>();
    }

    public ex(String str, String str2) {
        this(au.i(), str, str2);
    }

    public final void a() {
        synchronized (this.c) {
            if (this.l != -1 && this.g == -1) {
                this.g = SystemClock.elapsedRealtime();
                this.a.a(this);
            }
            this.a.d().b();
        }
    }

    public final void a(long j2) {
        synchronized (this.c) {
            this.l = j2;
            if (this.l != -1) {
                this.a.a(this);
            }
        }
    }

    public final void a(aoy aoy) {
        synchronized (this.c) {
            this.k = SystemClock.elapsedRealtime();
            this.a.d().a(aoy, this.k);
        }
    }

    public final void a(boolean z) {
        synchronized (this.c) {
            if (this.l != -1) {
                this.i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.g = this.i;
                    this.a.a(this);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            if (this.l != -1) {
                ey eyVar = new ey();
                eyVar.c();
                this.b.add(eyVar);
                this.j++;
                this.a.d().a();
                this.a.a(this);
            }
        }
    }

    public final void b(long j2) {
        synchronized (this.c) {
            if (this.l != -1) {
                this.f = j2;
                this.a.a(this);
            }
        }
    }

    public final void b(boolean z) {
        synchronized (this.c) {
            if (this.l != -1) {
                this.h = z;
                this.a.a(this);
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            if (this.l != -1 && !this.b.isEmpty()) {
                ey last = this.b.getLast();
                if (last.a() == -1) {
                    last.b();
                    this.a.a(this);
                }
            }
        }
    }

    public final Bundle d() {
        Bundle bundle;
        synchronized (this.c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.d);
            bundle.putString("slotid", this.e);
            bundle.putBoolean("ismediation", this.h);
            bundle.putLong("treq", this.k);
            bundle.putLong("tresponse", this.l);
            bundle.putLong("timp", this.g);
            bundle.putLong("tload", this.i);
            bundle.putLong("pcc", this.j);
            bundle.putLong("tfetch", this.f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                arrayList.add(((ey) it.next()).d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
