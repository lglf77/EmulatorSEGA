package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class aft implements Callable {
    protected final yj a;
    protected final pb b;
    protected Method c;
    private String d = getClass().getSimpleName();
    private String e;
    private String f;
    private int g;
    private int h;

    public aft(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        this.a = yjVar;
        this.e = str;
        this.f = str2;
        this.b = pbVar;
        this.g = i;
        this.h = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.c = this.a.a(this.e, this.f);
            if (this.c != null) {
                a();
                xl h2 = this.a.h();
                if (!(h2 == null || this.g == Integer.MIN_VALUE)) {
                    h2.a(this.h, this.g, (System.nanoTime() - nanoTime) / 1000);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
        }
        return null;
    }
}
