package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@bfk
public final class ams {
    private final Object a = new Object();
    private int b;
    private List<amr> c = new LinkedList();

    public final amr a() {
        int i;
        amr amr;
        int i2;
        amr amr2 = null;
        int i3 = 0;
        synchronized (this.a) {
            if (this.c.size() == 0) {
                fn.b("Queue empty");
                return null;
            } else if (this.c.size() >= 2) {
                int i4 = Integer.MIN_VALUE;
                int i5 = 0;
                for (amr next : this.c) {
                    int i6 = next.i();
                    if (i6 > i4) {
                        i2 = i6;
                        amr = next;
                        i = i5;
                    } else {
                        i = i3;
                        amr = amr2;
                        i2 = i4;
                    }
                    i5++;
                    i4 = i2;
                    amr2 = amr;
                    i3 = i;
                }
                this.c.remove(i3);
                return amr2;
            } else {
                amr amr3 = this.c.get(0);
                amr3.e();
                return amr3;
            }
        }
    }

    public final boolean a(amr amr) {
        boolean z;
        synchronized (this.a) {
            z = this.c.contains(amr);
        }
        return z;
    }

    public final boolean b(amr amr) {
        synchronized (this.a) {
            Iterator<amr> it = this.c.iterator();
            while (it.hasNext()) {
                amr next = it.next();
                if (!((Boolean) app.f().a(asw.Q)).booleanValue() || au.i().a()) {
                    if (((Boolean) app.f().a(asw.S)).booleanValue() && !au.i().b() && amr != next && next.d().equals(amr.d())) {
                        it.remove();
                        return true;
                    }
                } else if (amr != next && next.b().equals(amr.b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(amr amr) {
        synchronized (this.a) {
            if (this.c.size() >= 10) {
                fn.b(new StringBuilder(41).append("Queue is full, current size = ").append(this.c.size()).toString());
                this.c.remove(0);
            }
            int i = this.b;
            this.b = i + 1;
            amr.a(i);
            this.c.add(amr);
        }
    }
}
