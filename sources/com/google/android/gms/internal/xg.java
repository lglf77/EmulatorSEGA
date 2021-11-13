package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class xg extends ajz<xg> {
    private static volatile xg[] H;
    public xc[] A = xc.b();
    public String B = null;
    public Integer C = null;
    public String D = null;
    public Long E = null;
    public Long F = null;
    public String G = null;
    private Integer I = null;
    private Integer J = null;
    public Integer a = null;
    public xd[] b = xd.b();
    public xi[] c = xi.b();
    public Long d = null;
    public Long e = null;
    public Long f = null;
    public Long g = null;
    public Long h = null;
    public String i = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public Integer m = null;
    public String n = null;
    public String o = null;
    public String p = null;
    public Long q = null;
    public Long r = null;
    public String s = null;
    public Boolean t = null;
    public String u = null;
    public Long v = null;
    public Integer w = null;
    public String x = null;
    public String y = null;
    public Boolean z = null;

    public xg() {
        this.X = null;
        this.Y = -1;
    }

    public static xg[] b() {
        if (H == null) {
            synchronized (akd.b) {
                if (H == null) {
                    H = new xg[0];
                }
            }
        }
        return H;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.b(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = a2;
            for (xd xdVar : this.b) {
                if (xdVar != null) {
                    i2 += ajx.b(2, (akf) xdVar);
                }
            }
            a2 = i2;
        }
        if (this.c != null && this.c.length > 0) {
            int i3 = a2;
            for (xi xiVar : this.c) {
                if (xiVar != null) {
                    i3 += ajx.b(3, (akf) xiVar);
                }
            }
            a2 = i3;
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
        if (this.h != null) {
            a2 += ajx.c(7, this.h.longValue());
        }
        if (this.i != null) {
            a2 += ajx.b(8, this.i);
        }
        if (this.j != null) {
            a2 += ajx.b(9, this.j);
        }
        if (this.k != null) {
            a2 += ajx.b(10, this.k);
        }
        if (this.l != null) {
            a2 += ajx.b(11, this.l);
        }
        if (this.m != null) {
            a2 += ajx.b(12, this.m.intValue());
        }
        if (this.n != null) {
            a2 += ajx.b(13, this.n);
        }
        if (this.o != null) {
            a2 += ajx.b(14, this.o);
        }
        if (this.p != null) {
            a2 += ajx.b(16, this.p);
        }
        if (this.q != null) {
            a2 += ajx.c(17, this.q.longValue());
        }
        if (this.r != null) {
            a2 += ajx.c(18, this.r.longValue());
        }
        if (this.s != null) {
            a2 += ajx.b(19, this.s);
        }
        if (this.t != null) {
            this.t.booleanValue();
            a2 += ajx.b(20) + 1;
        }
        if (this.u != null) {
            a2 += ajx.b(21, this.u);
        }
        if (this.v != null) {
            a2 += ajx.c(22, this.v.longValue());
        }
        if (this.w != null) {
            a2 += ajx.b(23, this.w.intValue());
        }
        if (this.x != null) {
            a2 += ajx.b(24, this.x);
        }
        if (this.y != null) {
            a2 += ajx.b(25, this.y);
        }
        if (this.g != null) {
            a2 += ajx.c(26, this.g.longValue());
        }
        if (this.z != null) {
            this.z.booleanValue();
            a2 += ajx.b(28) + 1;
        }
        if (this.A != null && this.A.length > 0) {
            for (xc xcVar : this.A) {
                if (xcVar != null) {
                    a2 += ajx.b(29, (akf) xcVar);
                }
            }
        }
        if (this.B != null) {
            a2 += ajx.b(30, this.B);
        }
        if (this.C != null) {
            a2 += ajx.b(31, this.C.intValue());
        }
        if (this.I != null) {
            a2 += ajx.b(32, this.I.intValue());
        }
        if (this.J != null) {
            a2 += ajx.b(33, this.J.intValue());
        }
        if (this.D != null) {
            a2 += ajx.b(34, this.D);
        }
        if (this.E != null) {
            a2 += ajx.c(35, this.E.longValue());
        }
        if (this.F != null) {
            a2 += ajx.c(36, this.F.longValue());
        }
        return this.G != null ? a2 + ajx.b(37, this.G) : a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 8:
                    this.a = Integer.valueOf(ajw.g());
                    continue;
                case 18:
                    int a3 = aki.a(ajw, 18);
                    int length = this.b == null ? 0 : this.b.length;
                    xd[] xdVarArr = new xd[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, xdVarArr, 0, length);
                    }
                    while (length < xdVarArr.length - 1) {
                        xdVarArr[length] = new xd();
                        ajw.a((akf) xdVarArr[length]);
                        ajw.a();
                        length++;
                    }
                    xdVarArr[length] = new xd();
                    ajw.a((akf) xdVarArr[length]);
                    this.b = xdVarArr;
                    continue;
                case 26:
                    int a4 = aki.a(ajw, 26);
                    int length2 = this.c == null ? 0 : this.c.length;
                    xi[] xiVarArr = new xi[(a4 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, xiVarArr, 0, length2);
                    }
                    while (length2 < xiVarArr.length - 1) {
                        xiVarArr[length2] = new xi();
                        ajw.a((akf) xiVarArr[length2]);
                        ajw.a();
                        length2++;
                    }
                    xiVarArr[length2] = new xi();
                    ajw.a((akf) xiVarArr[length2]);
                    this.c = xiVarArr;
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
                    this.h = Long.valueOf(ajw.h());
                    continue;
                case 66:
                    this.i = ajw.e();
                    continue;
                case 74:
                    this.j = ajw.e();
                    continue;
                case 82:
                    this.k = ajw.e();
                    continue;
                case 90:
                    this.l = ajw.e();
                    continue;
                case 96:
                    this.m = Integer.valueOf(ajw.g());
                    continue;
                case 106:
                    this.n = ajw.e();
                    continue;
                case 114:
                    this.o = ajw.e();
                    continue;
                case 130:
                    this.p = ajw.e();
                    continue;
                case 136:
                    this.q = Long.valueOf(ajw.h());
                    continue;
                case 144:
                    this.r = Long.valueOf(ajw.h());
                    continue;
                case 154:
                    this.s = ajw.e();
                    continue;
                case 160:
                    this.t = Boolean.valueOf(ajw.d());
                    continue;
                case 170:
                    this.u = ajw.e();
                    continue;
                case 176:
                    this.v = Long.valueOf(ajw.h());
                    continue;
                case 184:
                    this.w = Integer.valueOf(ajw.g());
                    continue;
                case 194:
                    this.x = ajw.e();
                    continue;
                case 202:
                    this.y = ajw.e();
                    continue;
                case 208:
                    this.g = Long.valueOf(ajw.h());
                    continue;
                case 224:
                    this.z = Boolean.valueOf(ajw.d());
                    continue;
                case 234:
                    int a5 = aki.a(ajw, 234);
                    int length3 = this.A == null ? 0 : this.A.length;
                    xc[] xcVarArr = new xc[(a5 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.A, 0, xcVarArr, 0, length3);
                    }
                    while (length3 < xcVarArr.length - 1) {
                        xcVarArr[length3] = new xc();
                        ajw.a((akf) xcVarArr[length3]);
                        ajw.a();
                        length3++;
                    }
                    xcVarArr[length3] = new xc();
                    ajw.a((akf) xcVarArr[length3]);
                    this.A = xcVarArr;
                    continue;
                case 242:
                    this.B = ajw.e();
                    continue;
                case 248:
                    this.C = Integer.valueOf(ajw.g());
                    continue;
                case 256:
                    this.I = Integer.valueOf(ajw.g());
                    continue;
                case 264:
                    this.J = Integer.valueOf(ajw.g());
                    continue;
                case 274:
                    this.D = ajw.e();
                    continue;
                case 280:
                    this.E = Long.valueOf(ajw.h());
                    continue;
                case 288:
                    this.F = Long.valueOf(ajw.h());
                    continue;
                case 298:
                    this.G = ajw.e();
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

    public final void a(ajx ajx) {
        if (this.a != null) {
            ajx.a(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (xd xdVar : this.b) {
                if (xdVar != null) {
                    ajx.a(2, (akf) xdVar);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (xi xiVar : this.c) {
                if (xiVar != null) {
                    ajx.a(3, (akf) xiVar);
                }
            }
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
        if (this.h != null) {
            ajx.b(7, this.h.longValue());
        }
        if (this.i != null) {
            ajx.a(8, this.i);
        }
        if (this.j != null) {
            ajx.a(9, this.j);
        }
        if (this.k != null) {
            ajx.a(10, this.k);
        }
        if (this.l != null) {
            ajx.a(11, this.l);
        }
        if (this.m != null) {
            ajx.a(12, this.m.intValue());
        }
        if (this.n != null) {
            ajx.a(13, this.n);
        }
        if (this.o != null) {
            ajx.a(14, this.o);
        }
        if (this.p != null) {
            ajx.a(16, this.p);
        }
        if (this.q != null) {
            ajx.b(17, this.q.longValue());
        }
        if (this.r != null) {
            ajx.b(18, this.r.longValue());
        }
        if (this.s != null) {
            ajx.a(19, this.s);
        }
        if (this.t != null) {
            ajx.a(20, this.t.booleanValue());
        }
        if (this.u != null) {
            ajx.a(21, this.u);
        }
        if (this.v != null) {
            ajx.b(22, this.v.longValue());
        }
        if (this.w != null) {
            ajx.a(23, this.w.intValue());
        }
        if (this.x != null) {
            ajx.a(24, this.x);
        }
        if (this.y != null) {
            ajx.a(25, this.y);
        }
        if (this.g != null) {
            ajx.b(26, this.g.longValue());
        }
        if (this.z != null) {
            ajx.a(28, this.z.booleanValue());
        }
        if (this.A != null && this.A.length > 0) {
            for (xc xcVar : this.A) {
                if (xcVar != null) {
                    ajx.a(29, (akf) xcVar);
                }
            }
        }
        if (this.B != null) {
            ajx.a(30, this.B);
        }
        if (this.C != null) {
            ajx.a(31, this.C.intValue());
        }
        if (this.I != null) {
            ajx.a(32, this.I.intValue());
        }
        if (this.J != null) {
            ajx.a(33, this.J.intValue());
        }
        if (this.D != null) {
            ajx.a(34, this.D);
        }
        if (this.E != null) {
            ajx.b(35, this.E.longValue());
        }
        if (this.F != null) {
            ajx.b(36, this.F.longValue());
        }
        if (this.G != null) {
            ajx.a(37, this.G);
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xg)) {
            return false;
        }
        xg xgVar = (xg) obj;
        if (this.a == null) {
            if (xgVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(xgVar.a)) {
            return false;
        }
        if (!akd.a((Object[]) this.b, (Object[]) xgVar.b)) {
            return false;
        }
        if (!akd.a((Object[]) this.c, (Object[]) xgVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (xgVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(xgVar.d)) {
            return false;
        }
        if (this.e == null) {
            if (xgVar.e != null) {
                return false;
            }
        } else if (!this.e.equals(xgVar.e)) {
            return false;
        }
        if (this.f == null) {
            if (xgVar.f != null) {
                return false;
            }
        } else if (!this.f.equals(xgVar.f)) {
            return false;
        }
        if (this.g == null) {
            if (xgVar.g != null) {
                return false;
            }
        } else if (!this.g.equals(xgVar.g)) {
            return false;
        }
        if (this.h == null) {
            if (xgVar.h != null) {
                return false;
            }
        } else if (!this.h.equals(xgVar.h)) {
            return false;
        }
        if (this.i == null) {
            if (xgVar.i != null) {
                return false;
            }
        } else if (!this.i.equals(xgVar.i)) {
            return false;
        }
        if (this.j == null) {
            if (xgVar.j != null) {
                return false;
            }
        } else if (!this.j.equals(xgVar.j)) {
            return false;
        }
        if (this.k == null) {
            if (xgVar.k != null) {
                return false;
            }
        } else if (!this.k.equals(xgVar.k)) {
            return false;
        }
        if (this.l == null) {
            if (xgVar.l != null) {
                return false;
            }
        } else if (!this.l.equals(xgVar.l)) {
            return false;
        }
        if (this.m == null) {
            if (xgVar.m != null) {
                return false;
            }
        } else if (!this.m.equals(xgVar.m)) {
            return false;
        }
        if (this.n == null) {
            if (xgVar.n != null) {
                return false;
            }
        } else if (!this.n.equals(xgVar.n)) {
            return false;
        }
        if (this.o == null) {
            if (xgVar.o != null) {
                return false;
            }
        } else if (!this.o.equals(xgVar.o)) {
            return false;
        }
        if (this.p == null) {
            if (xgVar.p != null) {
                return false;
            }
        } else if (!this.p.equals(xgVar.p)) {
            return false;
        }
        if (this.q == null) {
            if (xgVar.q != null) {
                return false;
            }
        } else if (!this.q.equals(xgVar.q)) {
            return false;
        }
        if (this.r == null) {
            if (xgVar.r != null) {
                return false;
            }
        } else if (!this.r.equals(xgVar.r)) {
            return false;
        }
        if (this.s == null) {
            if (xgVar.s != null) {
                return false;
            }
        } else if (!this.s.equals(xgVar.s)) {
            return false;
        }
        if (this.t == null) {
            if (xgVar.t != null) {
                return false;
            }
        } else if (!this.t.equals(xgVar.t)) {
            return false;
        }
        if (this.u == null) {
            if (xgVar.u != null) {
                return false;
            }
        } else if (!this.u.equals(xgVar.u)) {
            return false;
        }
        if (this.v == null) {
            if (xgVar.v != null) {
                return false;
            }
        } else if (!this.v.equals(xgVar.v)) {
            return false;
        }
        if (this.w == null) {
            if (xgVar.w != null) {
                return false;
            }
        } else if (!this.w.equals(xgVar.w)) {
            return false;
        }
        if (this.x == null) {
            if (xgVar.x != null) {
                return false;
            }
        } else if (!this.x.equals(xgVar.x)) {
            return false;
        }
        if (this.y == null) {
            if (xgVar.y != null) {
                return false;
            }
        } else if (!this.y.equals(xgVar.y)) {
            return false;
        }
        if (this.z == null) {
            if (xgVar.z != null) {
                return false;
            }
        } else if (!this.z.equals(xgVar.z)) {
            return false;
        }
        if (!akd.a((Object[]) this.A, (Object[]) xgVar.A)) {
            return false;
        }
        if (this.B == null) {
            if (xgVar.B != null) {
                return false;
            }
        } else if (!this.B.equals(xgVar.B)) {
            return false;
        }
        if (this.C == null) {
            if (xgVar.C != null) {
                return false;
            }
        } else if (!this.C.equals(xgVar.C)) {
            return false;
        }
        if (this.I == null) {
            if (xgVar.I != null) {
                return false;
            }
        } else if (!this.I.equals(xgVar.I)) {
            return false;
        }
        if (this.J == null) {
            if (xgVar.J != null) {
                return false;
            }
        } else if (!this.J.equals(xgVar.J)) {
            return false;
        }
        if (this.D == null) {
            if (xgVar.D != null) {
                return false;
            }
        } else if (!this.D.equals(xgVar.D)) {
            return false;
        }
        if (this.E == null) {
            if (xgVar.E != null) {
                return false;
            }
        } else if (!this.E.equals(xgVar.E)) {
            return false;
        }
        if (this.F == null) {
            if (xgVar.F != null) {
                return false;
            }
        } else if (!this.F.equals(xgVar.F)) {
            return false;
        }
        if (this.G == null) {
            if (xgVar.G != null) {
                return false;
            }
        } else if (!this.G.equals(xgVar.G)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? xgVar.X == null || xgVar.X.b() : this.X.equals(xgVar.X);
    }

    public final int hashCode() {
        int i2 = 0;
        int hashCode = ((this.G == null ? 0 : this.G.hashCode()) + (((this.F == null ? 0 : this.F.hashCode()) + (((this.E == null ? 0 : this.E.hashCode()) + (((this.D == null ? 0 : this.D.hashCode()) + (((this.J == null ? 0 : this.J.hashCode()) + (((this.I == null ? 0 : this.I.hashCode()) + (((this.C == null ? 0 : this.C.hashCode()) + (((this.B == null ? 0 : this.B.hashCode()) + (((((this.z == null ? 0 : this.z.hashCode()) + (((this.y == null ? 0 : this.y.hashCode()) + (((this.x == null ? 0 : this.x.hashCode()) + (((this.w == null ? 0 : this.w.hashCode()) + (((this.v == null ? 0 : this.v.hashCode()) + (((this.u == null ? 0 : this.u.hashCode()) + (((this.t == null ? 0 : this.t.hashCode()) + (((this.s == null ? 0 : this.s.hashCode()) + (((this.r == null ? 0 : this.r.hashCode()) + (((this.q == null ? 0 : this.q.hashCode()) + (((this.p == null ? 0 : this.p.hashCode()) + (((this.o == null ? 0 : this.o.hashCode()) + (((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((this.k == null ? 0 : this.k.hashCode()) + (((this.j == null ? 0 : this.j.hashCode()) + (((this.i == null ? 0 : this.i.hashCode()) + (((this.h == null ? 0 : this.h.hashCode()) + (((this.g == null ? 0 : this.g.hashCode()) + (((this.f == null ? 0 : this.f.hashCode()) + (((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((((((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + akd.a((Object[]) this.b)) * 31) + akd.a((Object[]) this.c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + akd.a((Object[]) this.A)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.X != null && !this.X.b()) {
            i2 = this.X.hashCode();
        }
        return hashCode + i2;
    }
}
