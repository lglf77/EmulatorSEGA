package com.google.android.gms.internal;

public final class afb extends aft {
    private static volatile Long d = null;
    private static final Object e = new Object();

    public afb(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 44);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = (Long) this.c.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.A = d;
        }
    }
}
