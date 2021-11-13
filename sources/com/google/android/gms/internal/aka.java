package com.google.android.gms.internal;

import com.google.android.gms.internal.ajz;
import java.io.IOException;

public final class aka<M extends ajz<M>, T> {
    protected final Class<T> a;
    public final int b;
    protected final boolean c;
    private int d;

    /* access modifiers changed from: protected */
    public final int a(Object obj) {
        int i = this.b >>> 3;
        switch (this.d) {
            case 10:
                return (ajx.b(i) << 1) + ((akf) obj).f();
            case 11:
                return ajx.b(i, (akf) obj);
            default:
                throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.d).toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj, ajx ajx) {
        try {
            ajx.c(this.b);
            switch (this.d) {
                case 10:
                    ((akf) obj).a(ajx);
                    ajx.c(this.b >>> 3, 4);
                    return;
                case 11:
                    ajx.a((akf) obj);
                    return;
                default:
                    throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.d).toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aka)) {
            return false;
        }
        aka aka = (aka) obj;
        return this.d == aka.d && this.a == aka.a && this.b == aka.b && this.c == aka.c;
    }

    public final int hashCode() {
        return (this.c ? 1 : 0) + ((((((this.d + 1147) * 31) + this.a.hashCode()) * 31) + this.b) * 31);
    }
}
