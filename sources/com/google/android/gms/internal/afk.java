package com.google.android.gms.internal;

public final class afk extends aft {
    public afk(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 61);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.c.invoke((Object) null, new Object[]{this.a.a(), Boolean.valueOf(this.a.j())})).longValue();
        synchronized (this.b) {
            this.b.P = Long.valueOf(longValue);
        }
    }
}
