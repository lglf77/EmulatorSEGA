package com.google.android.gms.internal;

final /* synthetic */ class adt {
    static final /* synthetic */ int[] a = new int[adv.values().length];
    static final /* synthetic */ int[] b = new int[adu.values().length];

    static {
        try {
            b[adu.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[adu.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[adu.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[adv.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[adv.COMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
    }
}
