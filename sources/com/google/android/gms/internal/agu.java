package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class agu {
    static final agu a = new agu(true);
    private static volatile boolean b = false;
    private static final Class<?> c = b();
    private final Map<Object, Object> d;

    agu() {
        this.d = new HashMap();
    }

    private agu(boolean z) {
        this.d = Collections.emptyMap();
    }

    public static agu a() {
        return agt.a();
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
