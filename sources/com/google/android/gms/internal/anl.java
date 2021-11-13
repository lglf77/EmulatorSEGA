package com.google.android.gms.internal;

public final class anl {
    final long a;
    final String b;
    final int c;

    anl(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof anl)) {
            return false;
        }
        return ((anl) obj).a == this.a && ((anl) obj).c == this.c;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
