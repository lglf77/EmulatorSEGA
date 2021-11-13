package com.google.android.gms.internal;

import com.google.android.gms.a;

public enum acv implements ahf {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private static final ahg<acv> g = null;
    private final int h;

    static {
        g = new acw();
    }

    private acv(int i2) {
        this.h = i2;
    }

    public static acv a(int i2) {
        switch (i2) {
            case a.b.AdsAttrs_adSize:
                return UNKNOWN_PREFIX;
            case a.b.AdsAttrs_adSizes:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            case 4:
                return CRUNCHY;
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
