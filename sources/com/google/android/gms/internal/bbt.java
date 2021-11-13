package com.google.android.gms.internal;

public final class bbt<T> {
    public final T a;
    public final qe b;
    public final ce c;
    public boolean d;

    private bbt(ce ceVar) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = ceVar;
    }

    private bbt(T t, qe qeVar) {
        this.d = false;
        this.a = t;
        this.b = qeVar;
        this.c = null;
    }

    public static <T> bbt<T> a(ce ceVar) {
        return new bbt<>(ceVar);
    }

    public static <T> bbt<T> a(T t, qe qeVar) {
        return new bbt<>(t, qeVar);
    }
}
