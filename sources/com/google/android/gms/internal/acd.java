package com.google.android.gms.internal;

import com.google.android.gms.a;

public enum acd implements ahf {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final ahg<acd> f = null;
    private final int g;

    static {
        f = new ace();
    }

    private acd(int i) {
        this.g = i;
    }

    public static acd a(int i) {
        switch (i) {
            case a.b.AdsAttrs_adSize:
                return UNKNOWN_STATUS;
            case a.b.AdsAttrs_adSizes:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
            default:
                return null;
        }
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
