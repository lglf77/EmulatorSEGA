package com.google.android.gms.internal;

import com.google.android.gms.a;

public enum abp implements ahf {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    private static final ahg<abp> g = null;
    private final int h;

    static {
        g = new abq();
    }

    private abp(int i2) {
        this.h = i2;
    }

    public static abp a(int i2) {
        switch (i2) {
            case a.b.AdsAttrs_adSize:
                return UNKNOWN_CURVE;
            case a.b.AdsAttrs_adSizes:
                return NIST_P224;
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return null;
        }
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
