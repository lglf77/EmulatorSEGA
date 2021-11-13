package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

final class aix implements Iterator<Map.Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Map.Entry<K, V>> c;
    private /* synthetic */ air d;

    private aix(air air) {
        this.d = air;
        this.a = -1;
    }

    /* synthetic */ aix(air air, ais ais) {
        this(air);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        return this.a + 1 < this.d.b.size() || (!this.d.c.isEmpty() && a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        return i < this.d.b.size() ? (Map.Entry) this.d.b.get(this.a) : (Map.Entry) a().next();
    }

    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        this.d.e();
        if (this.a < this.d.b.size()) {
            air air = this.d;
            int i = this.a;
            this.a = i - 1;
            Object unused = air.c(i);
            return;
        }
        a().remove();
    }
}
