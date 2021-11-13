package com.google.android.gms.internal;

import com.google.android.gms.a;

public enum abb implements ahf {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    
    private static final ahg<abb> e = null;
    private final int f;

    static {
        e = new abc();
    }

    private abb(int i) {
        this.f = i;
    }

    public static abb a(int i) {
        switch (i) {
            case a.b.AdsAttrs_adSize:
                return UNKNOWN_FORMAT;
            case a.b.AdsAttrs_adSizes:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
            default:
                return null;
        }
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
