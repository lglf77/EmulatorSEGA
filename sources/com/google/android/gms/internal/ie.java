package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class ie {
    /* access modifiers changed from: private */
    public final List<String> a = new ArrayList();
    /* access modifiers changed from: private */
    public final List<Double> b = new ArrayList();
    /* access modifiers changed from: private */
    public final List<Double> c = new ArrayList();

    public final ib a() {
        return new ib(this);
    }

    public final ie a(String str, double d, double d2) {
        int i;
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= this.a.size()) {
                break;
            }
            double doubleValue = this.c.get(i).doubleValue();
            double doubleValue2 = this.b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i2 = i + 1;
        }
        this.a.add(i, str);
        this.c.add(i, Double.valueOf(d));
        this.b.add(i, Double.valueOf(d2));
        return this;
    }
}
