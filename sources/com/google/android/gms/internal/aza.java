package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.bk;
import java.util.Arrays;

@bfk
final class aza {
    private final Object[] a;

    aza(aoy aoy, String str, int i) {
        this.a = bk.a((String) app.f().a(asw.aH), aoy, str, i, (apc) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aza)) {
            return false;
        }
        return Arrays.equals(this.a, ((aza) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return new StringBuilder(String.valueOf(arrays).length() + 24).append("[InterstitialAdPoolKey ").append(arrays).append("]").toString();
    }
}
