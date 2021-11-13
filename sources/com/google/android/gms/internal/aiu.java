package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class aiu implements Iterator<Object> {
    aiu() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
