package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.aai;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class aae extends ahc<aae, a> implements aif {
    /* access modifiers changed from: private */
    public static final aae f;
    private static volatile aij<aae> g;
    private aai d;
    private abv e;

    public static final class a extends ahc.a<aae, a> implements aif {
        private a() {
            super(aae.f);
        }

        /* synthetic */ a(aaf aaf) {
            this();
        }
    }

    static {
        aae aae = new aae();
        f = aae;
        aae.a(ahc.g.f, (Object) null, (Object) null);
        aae.b.c();
    }

    private aae() {
    }

    public static aae a(age age) {
        return (aae) ahc.a(f, age);
    }

    public final aai a() {
        return this.d == null ? aai.c() : this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        abv.a aVar;
        aai.a aVar2;
        switch (aaf.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new aae();
            case 2:
                return f;
            case 3:
                return null;
            case 4:
                return new a((aaf) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                aae aae = (aae) obj2;
                this.d = (aai) hVar.a(this.d, aae.d);
                this.e = (abv) hVar.a(this.e, aae.e);
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
                                        aai aai = this.d;
                                        ahc.a aVar3 = (ahc.a) aai.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar3.a(aai);
                                        aVar2 = (aai.a) aVar3;
                                    } else {
                                        aVar2 = null;
                                    }
                                    this.d = (aai) agn.a(aai.c(), agu);
                                    if (aVar2 == null) {
                                        break;
                                    } else {
                                        aVar2.a(this.d);
                                        this.d = (aai) aVar2.c();
                                        break;
                                    }
                                case 18:
                                    if (this.e != null) {
                                        abv abv = this.e;
                                        ahc.a aVar4 = (ahc.a) abv.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar4.a(abv);
                                        aVar = (abv.a) aVar4;
                                    } else {
                                        aVar = null;
                                    }
                                    this.e = (abv) agn.a(abv.c(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.e);
                                        this.e = (abv) aVar.c();
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
                if (g == null) {
                    synchronized (aae.class) {
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
        if (this.d != null) {
            agq.a(1, (aid) this.d == null ? aai.c() : this.d);
        }
        if (this.e != null) {
            agq.a(2, (aid) this.e == null ? abv.c() : this.e);
        }
        this.b.a(agq);
    }

    public final abv b() {
        return this.e == null ? abv.c() : this.e;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != null) {
            i2 = agq.c(1, (aid) this.d == null ? aai.c() : this.d) + 0;
        }
        if (this.e != null) {
            i2 += agq.c(2, (aid) this.e == null ? abv.c() : this.e);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
