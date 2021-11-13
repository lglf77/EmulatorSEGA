package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

@bfk
public final class ib {
    private final String[] a;
    private final double[] b;
    private final double[] c;
    private final int[] d;
    private int e;

    private ib(ie ieVar) {
        int size = ieVar.b.size();
        this.a = (String[]) ieVar.a.toArray(new String[size]);
        this.b = a((List<Double>) ieVar.b);
        this.c = a((List<Double>) ieVar.c);
        this.d = new int[size];
        this.e = 0;
    }

    private static double[] a(List<Double> list) {
        double[] dArr = new double[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= dArr.length) {
                return dArr;
            }
            dArr[i2] = list.get(i2).doubleValue();
            i = i2 + 1;
        }
    }

    public final List<id> a() {
        ArrayList arrayList = new ArrayList(this.a.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.length) {
                return arrayList;
            }
            arrayList.add(new id(this.a[i2], this.c[i2], this.b[i2], ((double) this.d[i2]) / ((double) this.e), this.d[i2]));
            i = i2 + 1;
        }
    }

    public final void a(double d2) {
        this.e++;
        int i = 0;
        while (i < this.c.length) {
            if (this.c[i] <= d2 && d2 < this.b[i]) {
                int[] iArr = this.d;
                iArr[i] = iArr[i] + 1;
            }
            if (d2 >= this.c[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}
