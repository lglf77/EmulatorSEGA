package com.google.android.gms.internal;

import java.util.Map;

final class ahm<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, ahk> a;

    private ahm(Map.Entry<K, ahk> entry) {
        this.a = entry;
    }

    public final ahk a() {
        return this.a.getValue();
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        return ahk.a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof aid) {
            return this.a.getValue().a((aid) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
