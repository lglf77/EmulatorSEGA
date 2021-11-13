package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.act;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class acr extends ahc<acr, a> implements aif {
    /* access modifiers changed from: private */
    public static final acr f;
    private static volatile aij<acr> g;
    private int d;
    private act e;

    public static final class a extends ahc.a<acr, a> implements aif {
        private a() {
            super(acr.f);
        }

        /* synthetic */ a(acs acs) {
            this();
        }

        public final a a(int i) {
            b();
            ((acr) this.a).a(0);
            return this;
        }

        public final a a(act act) {
            b();
            ((acr) this.a).a(act);
            return this;
        }
    }

    static {
        acr acr = new acr();
        f = acr;
        acr.a(ahc.g.f, (Object) null, (Object) null);
        acr.b.c();
    }

    private acr() {
    }

    public static acr a(age age) {
        return (acr) ahc.a(f, age);
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        this.d = i;
    }

    /* access modifiers changed from: private */
    public final void a(act act) {
        if (act == null) {
            throw new NullPointerException();
        }
        this.e = act;
    }

    public static a c() {
        acr acr = f;
        ahc.a aVar = (ahc.a) acr.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(acr);
        return (a) aVar;
    }

    public final int a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        act.a aVar;
        boolean z = true;
        switch (acs.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new acr();
            case 2:
                return f;
            case 3:
                return null;
            case 4:
                return new a((acs) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                acr acr = (acr) obj2;
                boolean z2 = this.d != 0;
                int i2 = this.d;
                if (acr.d == 0) {
                    z = false;
                }
                this.d = hVar.a(z2, i2, z, acr.d);
                this.e = (act) hVar.a(this.e, acr.e);
                return this;
            case 6:
                agn agn = (agn) obj;
                agu agu = (agu) obj2;
                if (agu != null) {
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int a2 = agn.a();
                            switch (a2) {
                                case a.b.AdsAttrs_adSize:
                                    z3 = true;
                                    break;
                                case 8:
                                    this.d = agn.h();
                                    break;
                                case 18:
                                    if (this.e != null) {
                                        act act = this.e;
                                        ahc.a aVar2 = (ahc.a) act.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(act);
                                        aVar = (act.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.e = (act) agn.a(act.c(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.e);
                                        this.e = (act) aVar.c();
                                        break;
                                    }
                                default:
                                    if (a(a2, agn)) {
                                        break;
                                    } else {
                                        z3 = true;
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
                if (g == null) {
                    synchronized (acr.class) {
                        if (g == null) {
                            g = new ahc.b(f);
                        }
                    }
                }
                return g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    public final void a(agq agq) {
        if (this.d != 0) {
            agq.c(1, this.d);
        }
        if (this.e != null) {
            agq.a(2, (aid) this.e == null ? act.c() : this.e);
        }
        this.b.a(agq);
    }

    public final act b() {
        return this.e == null ? act.c() : this.e;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != 0) {
            i2 = agq.e(1, this.d) + 0;
        }
        if (this.e != null) {
            i2 += agq.c(2, (aid) this.e == null ? act.c() : this.e);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
