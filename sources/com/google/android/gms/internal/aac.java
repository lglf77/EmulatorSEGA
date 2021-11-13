package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.aag;
import com.google.android.gms.internal.abt;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class aac extends ahc<aac, a> implements aif {
    /* access modifiers changed from: private */
    public static final aac g;
    private static volatile aij<aac> h;
    private int d;
    private aag e;
    private abt f;

    public static final class a extends ahc.a<aac, a> implements aif {
        private a() {
            super(aac.g);
        }

        /* synthetic */ a(aad aad) {
            this();
        }

        public final a a(int i) {
            b();
            ((aac) this.a).a(i);
            return this;
        }

        public final a a(aag aag) {
            b();
            ((aac) this.a).a(aag);
            return this;
        }

        public final a a(abt abt) {
            b();
            ((aac) this.a).a(abt);
            return this;
        }
    }

    static {
        aac aac = new aac();
        g = aac;
        aac.a(ahc.g.f, (Object) null, (Object) null);
        aac.b.c();
    }

    private aac() {
    }

    public static aac a(age age) {
        return (aac) ahc.a(g, age);
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        this.d = i;
    }

    /* access modifiers changed from: private */
    public final void a(aag aag) {
        if (aag == null) {
            throw new NullPointerException();
        }
        this.e = aag;
    }

    /* access modifiers changed from: private */
    public final void a(abt abt) {
        if (abt == null) {
            throw new NullPointerException();
        }
        this.f = abt;
    }

    public static a e() {
        aac aac = g;
        ahc.a aVar = (ahc.a) aac.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(aac);
        return (a) aVar;
    }

    public final int a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        abt.a aVar;
        aag.a aVar2;
        boolean z = true;
        switch (aad.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new aac();
            case 2:
                return g;
            case 3:
                return null;
            case 4:
                return new a((aad) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                aac aac = (aac) obj2;
                boolean z2 = this.d != 0;
                int i2 = this.d;
                if (aac.d == 0) {
                    z = false;
                }
                this.d = hVar.a(z2, i2, z, aac.d);
                this.e = (aag) hVar.a(this.e, aac.e);
                this.f = (abt) hVar.a(this.f, aac.f);
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
                                        aag aag = this.e;
                                        ahc.a aVar3 = (ahc.a) aag.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar3.a(aag);
                                        aVar2 = (aag.a) aVar3;
                                    } else {
                                        aVar2 = null;
                                    }
                                    this.e = (aag) agn.a(aag.f(), agu);
                                    if (aVar2 == null) {
                                        break;
                                    } else {
                                        aVar2.a(this.e);
                                        this.e = (aag) aVar2.c();
                                        break;
                                    }
                                case 26:
                                    if (this.f != null) {
                                        abt abt = this.f;
                                        ahc.a aVar4 = (ahc.a) abt.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar4.a(abt);
                                        aVar = (abt.a) aVar4;
                                    } else {
                                        aVar = null;
                                    }
                                    this.f = (abt) agn.a(abt.f(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.f);
                                        this.f = (abt) aVar.c();
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
                if (h == null) {
                    synchronized (aac.class) {
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
        if (this.d != 0) {
            agq.c(1, this.d);
        }
        if (this.e != null) {
            agq.a(2, (aid) this.e == null ? aag.f() : this.e);
        }
        if (this.f != null) {
            agq.a(3, (aid) this.f == null ? abt.f() : this.f);
        }
        this.b.a(agq);
    }

    public final aag b() {
        return this.e == null ? aag.f() : this.e;
    }

    public final abt c() {
        return this.f == null ? abt.f() : this.f;
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
            i2 += agq.c(2, (aid) this.e == null ? aag.f() : this.e);
        }
        if (this.f != null) {
            i2 += agq.c(3, (aid) this.f == null ? abt.f() : this.f);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
