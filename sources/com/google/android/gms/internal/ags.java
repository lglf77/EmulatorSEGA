package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;
import java.io.IOException;

final class ags implements ajv {
    private final agq a;

    private ags(agq agq) {
        this.a = (agq) ahe.a(agq, "output");
        this.a.a = this;
    }

    public static ags a(agq agq) {
        return agq.a != null ? agq.a : new ags(agq);
    }

    public final int a() {
        return ahc.g.k;
    }

    public final void a(int i, Object obj) {
        try {
            if (obj instanceof age) {
                this.a.b(i, (age) obj);
            } else {
                this.a.b(i, (aid) obj);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
