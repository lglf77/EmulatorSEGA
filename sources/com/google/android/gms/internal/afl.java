package com.google.android.gms.internal;

public final class afl extends aft {
    private final StackTraceElement[] d;

    public afl(yj yjVar, String str, String str2, pb pbVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(yjVar, str, str2, pbVar, i, 45);
        this.d = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.d != null) {
            yh yhVar = new yh((String) this.c.invoke((Object) null, new Object[]{this.d}));
            synchronized (this.b) {
                this.b.B = yhVar.a;
                if (yhVar.b.booleanValue()) {
                    this.b.J = Integer.valueOf(yhVar.c.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
