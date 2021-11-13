package com.google.android.gms.internal;

import android.os.Build;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class xl {
    protected static volatile aol a = null;
    /* access modifiers changed from: private */
    public static final ConditionVariable d = new ConditionVariable();
    private static volatile Random e = null;
    protected volatile Boolean b;
    /* access modifiers changed from: private */
    public yj c;

    public xl(yj yjVar) {
        this.c = yjVar;
        yjVar.c().execute(new xm(this));
    }

    public static int a() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : c().nextInt();
        } catch (RuntimeException e2) {
            return c().nextInt();
        }
    }

    private static Random c() {
        if (e == null) {
            synchronized (xl.class) {
                if (e == null) {
                    e = new Random();
                }
            }
        }
        return e;
    }

    public final void a(int i, int i2, long j) {
        try {
            d.block();
            if (this.b.booleanValue() && a != null) {
                ox oxVar = new ox();
                oxVar.a = this.c.a.getPackageName();
                oxVar.b = Long.valueOf(j);
                aon a2 = a.a(akf.a((akf) oxVar));
                a2.a(i2);
                a2.b(i);
                a2.a();
            }
        } catch (Exception e2) {
        }
    }
}
