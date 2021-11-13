package com.google.android.gms.internal;

import com.google.android.gms.a;

public enum abr implements ahf {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    private static final ahg<abr> g = null;
    private final int h;

    static {
        g = new abs();
    }

    private abr(int i2) {
        this.h = i2;
    }

    public static abr a(int i2) {
        switch (i2) {
            case a.b.AdsAttrs_adSize:
                return UNKNOWN_HASH;
            case a.b.AdsAttrs_adSizes:
                return SHA1;
            case 2:
                return SHA224;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
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
