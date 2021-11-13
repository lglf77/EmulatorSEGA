package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class xw extends Thread {
    private static final boolean a = df.a;
    private final BlockingQueue<aws<?>> b;
    /* access modifiers changed from: private */
    public final BlockingQueue<aws<?>> c;
    private final pc d;
    /* access modifiers changed from: private */
    public final beo e;
    private volatile boolean f = false;
    private final afx g;

    public xw(BlockingQueue<aws<?>> blockingQueue, BlockingQueue<aws<?>> blockingQueue2, pc pcVar, beo beo) {
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = pcVar;
        this.e = beo;
        this.g = new afx(this);
    }

    public final void a() {
        this.f = true;
        interrupt();
    }

    public final void run() {
        if (a) {
            df.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                aws take = this.b.take();
                take.b("cache-queue-take");
                qe a2 = this.d.a(take.e());
                if (a2 == null) {
                    take.b("cache-miss");
                    if (!this.g.b(take)) {
                        this.c.put(take);
                    }
                } else if (a2.a()) {
                    take.b("cache-hit-expired");
                    take.a(a2);
                    if (!this.g.b(take)) {
                        this.c.put(take);
                    }
                } else {
                    take.b("cache-hit");
                    bbt a3 = take.a(new auq(a2.a, a2.g));
                    take.b("cache-hit-parsed");
                    if (!(a2.f < System.currentTimeMillis())) {
                        this.e.a((aws<?>) take, (bbt<?>) a3);
                    } else {
                        take.b("cache-hit-refresh-needed");
                        take.a(a2);
                        a3.d = true;
                        if (!this.g.b(take)) {
                            this.e.a(take, a3, new aez(this, take));
                        } else {
                            this.e.a((aws<?>) take, (bbt<?>) a3);
                        }
                    }
                }
            } catch (InterruptedException e2) {
                if (this.f) {
                    return;
                }
            }
        }
    }
}
