package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class pa {
    public static int a(int i) {
        switch (i) {
            case a.b.AdsAttrs_adSize:
            case a.b.AdsAttrs_adSizes:
            case 2:
            case 1000:
                return i;
            default:
                throw new IllegalArgumentException(new StringBuilder(43).append(i).append(" is not a valid enum EnumBoolean").toString());
        }
    }
}
