package com.google.android.gms.internal;

public final class afi extends aft {
    public afi(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.b) {
            xv xvVar = new xv((String) this.c.invoke((Object) null, new Object[]{this.a.a()}));
            synchronized (this.b) {
                this.b.c = Long.valueOf(xvVar.a);
                this.b.O = Long.valueOf(xvVar.b);
            }
        }
    }
}
