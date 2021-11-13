package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class aso extends Thread {
    private final BlockingQueue<aws<?>> a;
    private final arp b;
    private final pc c;
    private final beo d;
    private volatile boolean e = false;

    public aso(BlockingQueue<aws<?>> blockingQueue, arp arp, pc pcVar, beo beo) {
        this.a = blockingQueue;
        this.b = arp;
        this.c = pcVar;
        this.d = beo;
    }

    public final void a() {
        this.e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                aws take = this.a.take();
                try {
                    take.b("network-queue-take");
                    TrafficStats.setThreadStatsTag(take.d());
                    auq a2 = this.b.a(take);
                    take.b("network-http-complete");
                    if (!a2.e || !take.k()) {
                        bbt a3 = take.a(a2);
                        take.b("network-parse-complete");
                        if (take.g() && a3.b != null) {
                            this.c.a(take.e(), a3.b);
                            take.b("network-cache-written");
                        }
                        take.j();
                        this.d.a((aws<?>) take, (bbt<?>) a3);
                        take.a((bbt<?>) a3);
                    } else {
                        take.c("not-modified");
                        take.l();
                    }
                } catch (ce e2) {
                    e2.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a((aws<?>) take, e2);
                    take.l();
                } catch (Exception e3) {
                    df.a(e3, "Unhandled exception %s", e3.toString());
                    ce ceVar = new ce((Throwable) e3);
                    ceVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a((aws<?>) take, ceVar);
                    take.l();
                }
            } catch (InterruptedException e4) {
                if (this.e) {
                    return;
                }
            }
        }
    }
}
