package com.google.android.gms.internal;

final class agt {
    private static Class<?> a = b();

    public static agu a() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return agu.a;
    }

    private static final agu a(String str) {
        return (agu) a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
