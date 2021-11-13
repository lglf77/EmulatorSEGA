package com.google.android.gms.internal;

import java.util.Arrays;

final class akh {
    final int a;
    final byte[] b;

    akh(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akh)) {
            return false;
        }
        akh akh = (akh) obj;
        return this.a == akh.a && Arrays.equals(this.b, akh.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
