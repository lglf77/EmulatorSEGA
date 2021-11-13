package com.google.android.gms.internal;

final class aiq {
    private static final Class<?> a = d();
    private static final aje<?, ?> b = a(false);
    private static final aje<?, ?> c = a(true);
    private static final aje<?, ?> d = new ajg();

    public static aje<?, ?> a() {
        return b;
    }

    private static aje<?, ?> a(boolean z) {
        try {
            Class<?> e = e();
            if (e == null) {
                return null;
            }
            return (aje) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            return null;
        }
    }

    public static void a(Class<?> cls) {
        if (!ahc.class.isAssignableFrom(cls) && a != null && !a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static aje<?, ?> b() {
        return c;
    }

    public static aje<?, ?> c() {
        return d;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }
}
