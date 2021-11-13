package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class pd extends ajz<pd> {
    private static volatile pd[] v;
    public Long a = null;
    public Long b = null;
    public Long c = null;
    public Long d = null;
    public Long e = null;
    public Long f = null;
    public Integer g;
    public Long h = null;
    public Long i = null;
    public Long j = null;
    public Integer k;
    public Long l = null;
    public Long m = null;
    public Long n = null;
    public Long o = null;
    public Long p = null;
    public Long q = null;
    public Long r = null;
    public Long s = null;
    public Long t = null;
    public Long u = null;

    public pd() {
        this.Y = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final pd a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 8:
                    this.a = Long.valueOf(ajw.h());
                    continue;
                case 16:
                    this.b = Long.valueOf(ajw.h());
                    continue;
                case 24:
                    this.c = Long.valueOf(ajw.h());
                    continue;
                case 32:
                    this.d = Long.valueOf(ajw.h());
                    continue;
                case 40:
                    this.e = Long.valueOf(ajw.h());
                    continue;
                case 48:
                    this.f = Long.valueOf(ajw.h());
                    continue;
                case 56:
                    int l2 = ajw.l();
                    try {
                        this.g = Integer.valueOf(pa.a(ajw.g()));
                        continue;
                    } catch (IllegalArgumentException e2) {
                        ajw.e(l2);
                        a(ajw, a2);
                        break;
                    }
                case 64:
                    this.h = Long.valueOf(ajw.h());
                    continue;
                case 72:
                    this.i = Long.valueOf(ajw.h());
                    continue;
                case 80:
                    this.j = Long.valueOf(ajw.h());
                    continue;
                case 88:
                    int l3 = ajw.l();
                    try {
                        this.k = Integer.valueOf(pa.a(ajw.g()));
                        continue;
                    } catch (IllegalArgumentException e3) {
                        ajw.e(l3);
                        a(ajw, a2);
                        break;
                    }
                case 96:
                    this.l = Long.valueOf(ajw.h());
                    continue;
                case 104:
                    this.m = Long.valueOf(ajw.h());
                    continue;
                case 112:
                    this.n = Long.valueOf(ajw.h());
                    continue;
                case 120:
                    this.o = Long.valueOf(ajw.h());
                    continue;
                case 128:
                    this.p = Long.valueOf(ajw.h());
                    continue;
                case 136:
                    this.q = Long.valueOf(ajw.h());
                    continue;
                case 144:
                    this.r = Long.valueOf(ajw.h());
                    continue;
                case 152:
                    this.s = Long.valueOf(ajw.h());
                    continue;
                case 160:
                    this.t = Long.valueOf(ajw.h());
                    continue;
                case 168:
                    this.u = Long.valueOf(ajw.h());
                    continue;
                default:
                    if (!super.a(ajw, a2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public static pd[] b() {
        if (v == null) {
            synchronized (akd.b) {
                if (v == null) {
                    v = new pd[0];
                }
            }
        }
        return v;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += ajx.c(2, this.b.longValue());
        }
        if (this.c != null) {
            a2 += ajx.c(3, this.c.longValue());
        }
        if (this.d != null) {
            a2 += ajx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            a2 += ajx.c(5, this.e.longValue());
        }
        if (this.f != null) {
            a2 += ajx.c(6, this.f.longValue());
        }
        if (this.g != null) {
            a2 += ajx.b(7, this.g.intValue());
        }
        if (this.h != null) {
            a2 += ajx.c(8, this.h.longValue());
        }
        if (this.i != null) {
            a2 += ajx.c(9, this.i.longValue());
        }
        if (this.j != null) {
            a2 += ajx.c(10, this.j.longValue());
        }
        if (this.k != null) {
            a2 += ajx.b(11, this.k.intValue());
        }
        if (this.l != null) {
            a2 += ajx.c(12, this.l.longValue());
        }
        if (this.m != null) {
            a2 += ajx.c(13, this.m.longValue());
        }
        if (this.n != null) {
            a2 += ajx.c(14, this.n.longValue());
        }
        if (this.o != null) {
            a2 += ajx.c(15, this.o.longValue());
        }
        if (this.p != null) {
            a2 += ajx.c(16, this.p.longValue());
        }
        if (this.q != null) {
            a2 += ajx.c(17, this.q.longValue());
        }
        if (this.r != null) {
            a2 += ajx.c(18, this.r.longValue());
        }
        if (this.s != null) {
            a2 += ajx.c(19, this.s.longValue());
        }
        if (this.t != null) {
            a2 += ajx.c(20, this.t.longValue());
        }
        return this.u != null ? a2 + ajx.c(21, this.u.longValue()) : a2;
    }

    public final void a(ajx ajx) {
        if (this.a != null) {
            ajx.b(1, this.a.longValue());
        }
        if (this.b != null) {
            ajx.b(2, this.b.longValue());
        }
        if (this.c != null) {
            ajx.b(3, this.c.longValue());
        }
        if (this.d != null) {
            ajx.b(4, this.d.longValue());
        }
        if (this.e != null) {
            ajx.b(5, this.e.longValue());
        }
        if (this.f != null) {
            ajx.b(6, this.f.longValue());
        }
        if (this.g != null) {
            ajx.a(7, this.g.intValue());
        }
        if (this.h != null) {
            ajx.b(8, this.h.longValue());
        }
        if (this.i != null) {
            ajx.b(9, this.i.longValue());
        }
        if (this.j != null) {
            ajx.b(10, this.j.longValue());
        }
        if (this.k != null) {
            ajx.a(11, this.k.intValue());
        }
        if (this.l != null) {
            ajx.b(12, this.l.longValue());
        }
        if (this.m != null) {
            ajx.b(13, this.m.longValue());
        }
        if (this.n != null) {
            ajx.b(14, this.n.longValue());
        }
        if (this.o != null) {
            ajx.b(15, this.o.longValue());
        }
        if (this.p != null) {
            ajx.b(16, this.p.longValue());
        }
        if (this.q != null) {
            ajx.b(17, this.q.longValue());
        }
        if (this.r != null) {
            ajx.b(18, this.r.longValue());
        }
        if (this.s != null) {
            ajx.b(19, this.s.longValue());
        }
        if (this.t != null) {
            ajx.b(20, this.t.longValue());
        }
        if (this.u != null) {
            ajx.b(21, this.u.longValue());
        }
        super.a(ajx);
    }
}
