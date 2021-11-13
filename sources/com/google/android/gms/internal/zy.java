package com.google.android.gms.internal;

final /* synthetic */ class zy {
    static final /* synthetic */ int[] a = new int[abr.values().length];

    static {
        try {
            a[abr.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[abr.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[abr.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
