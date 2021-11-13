package com.google.android.gms.internal;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class oq {
    private final int a;
    private final List<aqo> b;
    private final int c;
    private final InputStream d;

    public oq(int i, List<aqo> list) {
        this(i, list, -1, (InputStream) null);
    }

    public oq(int i, List<aqo> list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }

    public final int a() {
        return this.a;
    }

    public final List<aqo> b() {
        return Collections.unmodifiableList(this.b);
    }

    public final int c() {
        return this.c;
    }

    public final InputStream d() {
        return this.d;
    }
}
