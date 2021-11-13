package com.google.android.gms.internal;

public final class afp extends aft {
    public afp(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.E = 2;
        boolean booleanValue = ((Boolean) this.c.invoke((Object) null, new Object[]{this.a.a()})).booleanValue();
        synchronized (this.b) {
            if (booleanValue) {
                this.b.E = 1;
            } else {
                this.b.E = 0;
            }
        }
    }
}
