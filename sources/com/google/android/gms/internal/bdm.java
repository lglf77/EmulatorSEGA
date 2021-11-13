package com.google.android.gms.internal;

public final class bdm extends Exception {
    private final int a;

    public bdm(String str, int i) {
        super(str);
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
