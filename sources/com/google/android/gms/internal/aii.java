package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

final class aii<T> implements aio<T> {
    private final aid a;
    private final aje<?, ?> b;
    private final boolean c;
    private final agv<?> d;

    private aii(Class<T> cls, aje<?, ?> aje, agv<?> agv, aid aid) {
        this.b = aje;
        this.c = agv.a((Class<?>) cls);
        this.d = agv;
        this.a = aid;
    }

    static <T> aii<T> a(Class<T> cls, aje<?, ?> aje, agv<?> agv, aid aid) {
        return new aii<>(cls, aje, agv, aid);
    }

    public final int a(T t) {
        aje<?, ?> aje = this.b;
        int b2 = aje.b(aje.a(t)) + 0;
        return this.c ? b2 + this.d.a((Object) t).c() : b2;
    }

    public final void a(T t, ajv ajv) {
        Iterator<Map.Entry<?, Object>> b2 = this.d.a((Object) t).b();
        while (b2.hasNext()) {
            Map.Entry next = b2.next();
            aha aha = (aha) next.getKey();
            if (aha.c() != aju.MESSAGE || aha.d() || aha.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof ahm) {
                ajv.a(aha.a(), ((ahm) next).a().c());
            } else {
                ajv.a(aha.a(), next.getValue());
            }
        }
        aje<?, ?> aje = this.b;
        aje.a(aje.a(t), ajv);
    }
}
