package com.google.android.gms.internal;

final class aia {
    private static final ahy a = c();
    private static final ahy b = new ahz();

    static ahy a() {
        return a;
    }

    static ahy b() {
        return b;
    }

    private static ahy c() {
        try {
            return (ahy) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
