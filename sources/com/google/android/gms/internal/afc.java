package com.google.android.gms.internal;

public final class afc extends aft {
    private long d;

    public afc(yj yjVar, String str, String str2, pb pbVar, long j, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 25);
        this.d = j;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.c.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.b) {
            this.b.V = Long.valueOf(longValue);
            if (this.d != 0) {
                this.b.j = Long.valueOf(longValue - this.d);
                this.b.m = Long.valueOf(this.d);
            }
        }
    }
}
