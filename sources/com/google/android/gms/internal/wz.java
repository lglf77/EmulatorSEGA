package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class wz extends ajz<wz> {
    public Long a = null;
    public String b = null;
    public xa[] c = xa.b();
    public wy[] d = wy.b();
    public ws[] e = ws.b();
    private Integer f = null;

    public wz() {
        this.X = null;
        this.Y = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += ajx.c(1, this.a.longValue());
        }
        if (this.b != null) {
            a2 += ajx.b(2, this.b);
        }
        if (this.f != null) {
            a2 += ajx.b(3, this.f.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (xa xaVar : this.c) {
                if (xaVar != null) {
                    i += ajx.b(4, (akf) xaVar);
                }
            }
            a2 = i;
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = a2;
            for (wy wyVar : this.d) {
                if (wyVar != null) {
                    i2 += ajx.b(5, (akf) wyVar);
                }
            }
            a2 = i2;
        }
        if (this.e != null && this.e.length > 0) {
            for (ws wsVar : this.e) {
                if (wsVar != null) {
                    a2 += ajx.b(6, (akf) wsVar);
                }
            }
        }
        return a2;
    }

    public final /* synthetic */ akf a(ajw ajw) {
        while (true) {
            int a2 = ajw.a();
            switch (a2) {
                case a.b.AdsAttrs_adSize:
                    break;
                case 8:
                    this.a = Long.valueOf(ajw.h());
                    continue;
                case 18:
                    this.b = ajw.e();
                    continue;
                case 24:
                    this.f = Integer.valueOf(ajw.g());
                    continue;
                case 34:
                    int a3 = aki.a(ajw, 34);
                    int length = this.c == null ? 0 : this.c.length;
                    xa[] xaVarArr = new xa[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, xaVarArr, 0, length);
                    }
                    while (length < xaVarArr.length - 1) {
                        xaVarArr[length] = new xa();
                        ajw.a((akf) xaVarArr[length]);
                        ajw.a();
                        length++;
                    }
                    xaVarArr[length] = new xa();
                    ajw.a((akf) xaVarArr[length]);
                    this.c = xaVarArr;
                    continue;
                case 42:
                    int a4 = aki.a(ajw, 42);
                    int length2 = this.d == null ? 0 : this.d.length;
                    wy[] wyVarArr = new wy[(a4 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, wyVarArr, 0, length2);
                    }
                    while (length2 < wyVarArr.length - 1) {
                        wyVarArr[length2] = new wy();
                        ajw.a((akf) wyVarArr[length2]);
                        ajw.a();
                        length2++;
                    }
                    wyVarArr[length2] = new wy();
                    ajw.a((akf) wyVarArr[length2]);
                    this.d = wyVarArr;
                    continue;
                case 50:
                    int a5 = aki.a(ajw, 50);
                    int length3 = this.e == null ? 0 : this.e.length;
                    ws[] wsVarArr = new ws[(a5 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.e, 0, wsVarArr, 0, length3);
                    }
                    while (length3 < wsVarArr.length - 1) {
                        wsVarArr[length3] = new ws();
                        ajw.a((akf) wsVarArr[length3]);
                        ajw.a();
                        length3++;
                    }
                    wsVarArr[length3] = new ws();
                    ajw.a((akf) wsVarArr[length3]);
                    this.e = wsVarArr;
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
            ajx.b(1, this.a.longValue());
        }
        if (this.b != null) {
            ajx.a(2, this.b);
        }
        if (this.f != null) {
            ajx.a(3, this.f.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (xa xaVar : this.c) {
                if (xaVar != null) {
                    ajx.a(4, (akf) xaVar);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (wy wyVar : this.d) {
                if (wyVar != null) {
                    ajx.a(5, (akf) wyVar);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (ws wsVar : this.e) {
                if (wsVar != null) {
                    ajx.a(6, (akf) wsVar);
                }
            }
        }
        super.a(ajx);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj;
        if (this.a == null) {
            if (wzVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(wzVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (wzVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(wzVar.b)) {
            return false;
        }
        if (this.f == null) {
            if (wzVar.f != null) {
                return false;
            }
        } else if (!this.f.equals(wzVar.f)) {
            return false;
        }
        if (!akd.a((Object[]) this.c, (Object[]) wzVar.c)) {
            return false;
        }
        if (!akd.a((Object[]) this.d, (Object[]) wzVar.d)) {
            return false;
        }
        if (!akd.a((Object[]) this.e, (Object[]) wzVar.e)) {
            return false;
        }
        return (this.X == null || this.X.b()) ? wzVar.X == null || wzVar.X.b() : this.X.equals(wzVar.X);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.f == null ? 0 : this.f.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31) + akd.a((Object[]) this.c)) * 31) + akd.a((Object[]) this.d)) * 31) + akd.a((Object[]) this.e)) * 31;
        if (this.X != null && !this.X.b()) {
            i = this.X.hashCode();
        }
        return hashCode + i;
    }
}
