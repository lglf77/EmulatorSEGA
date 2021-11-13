package com.google.android.gms.internal;

final /* synthetic */ class zv {
    static final /* synthetic */ int[] a = new int[abr.values().length];
    static final /* synthetic */ int[] b = new int[abp.values().length];
    static final /* synthetic */ int[] c = new int[abb.values().length];

    static {
        try {
            c[abb.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            c[abb.COMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[abp.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            b[abp.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        try {
            b[abp.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[abr.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[abr.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            a[abr.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
    }
}
