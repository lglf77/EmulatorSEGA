package com.google.android.gms.internal;

import java.util.List;

public final class afj extends aft {
    private List<Long> d = null;

    public afj(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 31);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.p = -1L;
        this.b.q = -1L;
        if (this.d == null) {
            this.d = (List) this.c.invoke((Object) null, new Object[]{this.a.a()});
        }
        if (this.d != null && this.d.size() == 2) {
            synchronized (this.b) {
                this.b.p = Long.valueOf(this.d.get(0).longValue());
                this.b.q = Long.valueOf(this.d.get(1).longValue());
            }
        }
    }
}
