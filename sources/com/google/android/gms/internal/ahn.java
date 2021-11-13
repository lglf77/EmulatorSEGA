package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

final class ahn<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> a;

    public ahn(Iterator<Map.Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.a.next();
        return next.getValue() instanceof ahk ? new ahm(next) : next;
    }

    public final void remove() {
        this.a.remove();
    }
}
