package com.google.android.gms.internal;

import java.util.Iterator;

final class ru implements Iterator<String> {
    private Iterator<String> a = this.b.a.keySet().iterator();
    private /* synthetic */ rt b;

    ru(rt rtVar) {
        this.b = rtVar;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
