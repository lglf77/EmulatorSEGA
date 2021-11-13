package com.google.android.gms.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class ail {
    private static final ail a = new ail();
    private final aip b;
    private final ConcurrentMap<Class<?>, aio<?>> c = new ConcurrentHashMap();

    private ail() {
        aip aip = null;
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        for (int i = 0; i <= 0; i++) {
            aip = a(strArr[0]);
            if (aip != null) {
                break;
            }
        }
        this.b = aip == null ? new aht() : aip;
    }

    public static ail a() {
        return a;
    }

    private static aip a(String str) {
        try {
            return (aip) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }

    public final <T> aio<T> a(Class<T> cls) {
        ahe.a(cls, "messageType");
        aio<T> aio = (aio) this.c.get(cls);
        if (aio != null) {
            return aio;
        }
        aio<T> a2 = this.b.a(cls);
        ahe.a(cls, "messageType");
        ahe.a(a2, "schema");
        aio<T> putIfAbsent = this.c.putIfAbsent(cls, a2);
        return putIfAbsent != null ? putIfAbsent : a2;
    }
}
