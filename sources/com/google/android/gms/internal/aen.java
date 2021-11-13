package com.google.android.gms.internal;

final class aen {
    public static boolean a() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
