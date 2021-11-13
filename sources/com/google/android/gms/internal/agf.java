package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class agf implements Iterator {
    private int a = 0;
    private final int b = this.c.a();
    private /* synthetic */ age c;

    agf(age age) {
        this.c = age;
    }

    private final byte a() {
        try {
            age age = this.c;
            int i = this.a;
            this.a = i + 1;
            return age.a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
