package com.google.android.gms.internal;

@bfk
public final class kr<T> extends ks<T> {
    private final T a;

    private kr(T t) {
        this.a = t;
    }

    public static <T> kr<T> a(T t) {
        return new kr<>(t);
    }

    public final void a() {
        b(this.a);
    }
}
