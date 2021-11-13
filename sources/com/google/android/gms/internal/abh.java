package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.abd;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class abh extends ahc<abh, a> implements aif {
    /* access modifiers changed from: private */
    public static final abh g;
    private static volatile aij<abh> h;
    private abn d;
    private abd e;
    private int f;

    public static final class a extends ahc.a<abh, a> implements aif {
        private a() {
            super(abh.g);
        }

        /* synthetic */ a(abi abi) {
            this();
        }
    }

    static {
        abh abh = new abh();
        g = abh;
        abh.a(ahc.g.f, (Object) null, (Object) null);
        abh.b.c();
    }

    private abh() {
    }

    public static abh e() {
        return g;
    }

    public final abn a() {
        return this.d == null ? abn.e() : this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        abd.a aVar;
        abn.a aVar2;
        boolean z = true;
        switch (abi.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new abh();
            case 2:
                return g;
            case 3:
                return null;
            case 4:
                return new a((abi) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                abh abh = (abh) obj2;
                this.d = (abn) hVar.a(this.d, abh.d);
                this.e = (abd) hVar.a(this.e, abh.e);
                boolean z2 = this.f != 0;
                int i2 = this.f;
                if (abh.f == 0) {
                    z = false;
                }
                this.f = hVar.a(z2, i2, z, abh.f);
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
                                case 10:
                                    if (this.d != null) {
                                        abn abn = this.d;
                                        ahc.a aVar3 = (ahc.a) abn.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar3.a(abn);
                                        aVar2 = (abn.a) aVar3;
                                    } else {
                                        aVar2 = null;
                                    }
                                    this.d = (abn) agn.a(abn.e(), agu);
                                    if (aVar2 == null) {
                                        break;
                                    } else {
                                        aVar2.a(this.d);
                                        this.d = (abn) aVar2.c();
                                        break;
                                    }
                                case 18:
                                    if (this.e != null) {
                                        abd abd = this.e;
                                        ahc.a aVar4 = (ahc.a) abd.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar4.a(abd);
                                        aVar = (abd.a) aVar4;
                                    } else {
                                        aVar = null;
                                    }
                                    this.e = (abd) agn.a(abd.b(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.e);
                                        this.e = (abd) aVar.c();
                                        break;
                                    }
                                case 24:
                                    this.f = agn.i();
                                    break;
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
                if (h == null) {
                    synchronized (abh.class) {
                        if (h == null) {
                            h = new ahc.b(g);
                        }
                    }
                }
                return h;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return g;
    }

    public final void a(agq agq) {
        if (this.d != null) {
            agq.a(1, (aid) this.d == null ? abn.e() : this.d);
        }
        if (this.e != null) {
            agq.a(2, (aid) this.e == null ? abd.b() : this.e);
        }
        if (this.f != abb.UNKNOWN_FORMAT.a()) {
            agq.b(3, this.f);
        }
        this.b.a(agq);
    }

    public final abd b() {
        return this.e == null ? abd.b() : this.e;
    }

    public final abb c() {
        abb a2 = abb.a(this.f);
        return a2 == null ? abb.UNRECOGNIZED : a2;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != null) {
            i2 = agq.c(1, (aid) this.d == null ? abn.e() : this.d) + 0;
        }
        if (this.e != null) {
            i2 += agq.c(2, (aid) this.e == null ? abd.b() : this.e);
        }
        if (this.f != abb.UNKNOWN_FORMAT.a()) {
            i2 += agq.g(3, this.f);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
