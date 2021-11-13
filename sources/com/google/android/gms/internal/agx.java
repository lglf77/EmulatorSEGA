package com.google.android.gms.internal;

final class agx {
    private static final agv<?> a = new agw();
    private static final agv<?> b = c();

    static agv<?> a() {
        return a;
    }

    static agv<?> b() {
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static agv<?> c() {
        try {
            return (agv) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
