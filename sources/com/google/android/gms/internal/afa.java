package com.google.android.gms.internal;

public final class afa extends aft {
    public afa(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.d = -1L;
        this.b.e = -1L;
        int[] iArr = (int[]) this.c.invoke((Object) null, new Object[]{this.a.a()});
        synchronized (this.b) {
            this.b.d = Long.valueOf((long) iArr[0]);
            this.b.e = Long.valueOf((long) iArr[1]);
            if (((Boolean) app.f().a(asw.bq)).booleanValue() && iArr[2] != Integer.MIN_VALUE) {
                this.b.N = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
