package com.google.android.gms.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class aer {
    private final ConcurrentHashMap<aes, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    aer() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.b.poll();
        while (poll != null) {
            this.a.remove(poll);
            poll = this.b.poll();
        }
        return this.a.get(new aes(th, (ReferenceQueue<Throwable>) null));
    }
}
