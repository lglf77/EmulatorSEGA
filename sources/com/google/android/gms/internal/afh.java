package com.google.android.gms.internal;

public final class afh extends aft {
    private static volatile String d = null;
    private static final Object e = new Object();

    public afh(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 1);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.a = "E";
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = (String) this.c.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.b) {
            this.b.a = d;
        }
    }
}
