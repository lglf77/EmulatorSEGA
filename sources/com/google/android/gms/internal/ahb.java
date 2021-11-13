package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

final class ahb implements aic {
    private static final ahb a = new ahb();
    private final Map<Class<?>, Method> b = new HashMap();

    private ahb() {
    }

    public static ahb a() {
        return a;
    }

    public final boolean a(Class<?> cls) {
        return ahc.class.isAssignableFrom(cls);
    }

    public final aib b(Class<?> cls) {
        if (!ahc.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            Method method = this.b.get(cls);
            if (method == null) {
                method = cls.getDeclaredMethod("buildMessageInfo", new Class[0]);
                method.setAccessible(true);
                this.b.put(cls, method);
            }
            return (aib) method.invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            Exception exc = e;
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), exc);
        }
    }
}
