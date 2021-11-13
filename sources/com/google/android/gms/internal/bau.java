package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class bau {
    private final AtomicInteger a;
    private final Set<aws<?>> b;
    private final PriorityBlockingQueue<aws<?>> c;
    private final PriorityBlockingQueue<aws<?>> d;
    private final pc e;
    private final arp f;
    private final beo g;
    private final aso[] h;
    private xw i;
    private final List<Object> j;

    public bau(pc pcVar, arp arp) {
        this(pcVar, arp, 4);
    }

    private bau(pc pcVar, arp arp, int i2) {
        this(pcVar, arp, 4, new ann(new Handler(Looper.getMainLooper())));
    }

    private bau(pc pcVar, arp arp, int i2, beo beo) {
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.e = pcVar;
        this.f = arp;
        this.h = new aso[4];
        this.g = beo;
    }

    public final <T> aws<T> a(aws<T> aws) {
        aws.a(this);
        synchronized (this.b) {
            this.b.add(aws);
        }
        aws.a(this.a.incrementAndGet());
        aws.b("add-to-queue");
        if (!aws.g()) {
            this.d.add(aws);
        } else {
            this.c.add(aws);
        }
        return aws;
    }

    public final void a() {
        if (this.i != null) {
            this.i.a();
        }
        for (aso aso : this.h) {
            if (aso != null) {
                aso.a();
            }
        }
        this.i = new xw(this.c, this.d, this.e, this.g);
        this.i.start();
        for (int i2 = 0; i2 < this.h.length; i2++) {
            aso aso2 = new aso(this.d, this.f, this.e, this.g);
            this.h[i2] = aso2;
            aso2.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> void b(aws<T> aws) {
        synchronized (this.b) {
            this.b.remove(aws);
        }
        synchronized (this.j) {
            Iterator<Object> it = this.j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
