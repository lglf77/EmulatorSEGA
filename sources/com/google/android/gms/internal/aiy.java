package com.google.android.gms.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class aiy extends AbstractSet<Map.Entry<K, V>> {
    private /* synthetic */ air a;

    private aiy(air air) {
        this.a = air;
    }

    /* synthetic */ aiy(air air, ais ais) {
        this(air);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new aix(this.a, (ais) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.a.size();
    }
}
