package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.abh;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class abf extends ahc<abf, a> implements aif {
    /* access modifiers changed from: private */
    public static final abf e;
    private static volatile aij<abf> f;
    private abh d;

    public static final class a extends ahc.a<abf, a> implements aif {
        private a() {
            super(abf.e);
        }

        /* synthetic */ a(abg abg) {
            this();
        }
    }

    static {
        abf abf = new abf();
        e = abf;
        abf.a(ahc.g.f, (Object) null, (Object) null);
        abf.b.c();
    }

    private abf() {
    }

    public static abf a(age age) {
        return (abf) ahc.a(e, age);
    }

    public final abh a() {
        return this.d == null ? abh.e() : this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        abh.a aVar;
        switch (abg.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new abf();
            case 2:
                return e;
            case 3:
                return null;
            case 4:
                return new a((abg) null);
            case 5:
                this.d = (abh) ((ahc.h) obj).a(this.d, ((abf) obj2).d);
                return this;
            case 6:
                agn agn = (agn) obj;
                agu agu = (agu) obj2;
                if (agu != null) {
                    boolean z = false;
                    while (!z) {
                        try {
                            int a2 = agn.a();
                            switch (a2) {
                                case a.b.AdsAttrs_adSize:
                                    z = true;
                                    break;
                                case 10:
                                    if (this.d != null) {
                                        abh abh = this.d;
                                        ahc.a aVar2 = (ahc.a) abh.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(abh);
                                        aVar = (abh.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.d = (abh) agn.a(abh.e(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.d);
                                        this.d = (abh) aVar.c();
                                        break;
                                    }
                                default:
                                    if (a(a2, agn)) {
                                        break;
                                    } else {
                                        z = true;
                                        break;
                                    }
                            }
                        } catch (ahi e2) {
                            throw new RuntimeException(e2.a(this));
                        } catch (IOException e3) {
                            throw new RuntimeException(new ahi(e3.getMessage()).a(this));
                        }
                    }
                    break;
                } else {
                    throw new NullPointerException();
                }
            case 7:
                break;
            case 8:
                if (f == null) {
                    synchronized (abf.class) {
                        if (f == null) {
                            f = new ahc.b(e);
                        }
                    }
                }
                return f;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return e;
    }

    public final void a(agq agq) {
        if (this.d != null) {
            agq.a(1, (aid) this.d == null ? abh.e() : this.d);
        }
        this.b.a(agq);
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != null) {
            i2 = agq.c(1, (aid) this.d == null ? abh.e() : this.d) + 0;
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
