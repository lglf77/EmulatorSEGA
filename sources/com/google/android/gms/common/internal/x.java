package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class x {
    private final List<String> a;
    private final Object b;

    private x(Object obj) {
        this.b = y.a(obj);
        this.a = new ArrayList();
    }

    public final x a(String str, Object obj) {
        List<String> list = this.a;
        String str2 = (String) y.a(str);
        String valueOf = String.valueOf(obj);
        list.add(new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
        return this;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            append.append(this.a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
