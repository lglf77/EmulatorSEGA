package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.aaq;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class aam extends ahc<aam, a> implements aif {
    /* access modifiers changed from: private */
    public static final aam g;
    private static volatile aij<aam> h;
    private int d;
    private aaq e;
    private age f = age.a;

    public static final class a extends ahc.a<aam, a> implements aif {
        private a() {
            super(aam.g);
        }

        /* synthetic */ a(aan aan) {
            this();
        }

        public final a a(int i) {
            b();
            ((aam) this.a).a(0);
            return this;
        }

        public final a a(aaq aaq) {
            b();
            ((aam) this.a).a(aaq);
            return this;
        }

        public final a a(age age) {
            b();
            ((aam) this.a).b(age);
            return this;
        }
    }

    static {
        aam aam = new aam();
        g = aam;
        aam.a(ahc.g.f, (Object) null, (Object) null);
        aam.b.c();
    }

    private aam() {
    }

    public static aam a(age age) {
        return (aam) ahc.a(g, age);
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        this.d = i;
    }

    /* access modifiers changed from: private */
    public final void a(aaq aaq) {
        if (aaq == null) {
            throw new NullPointerException();
        }
        this.e = aaq;
    }

    /* access modifiers changed from: private */
    public final void b(age age) {
        if (age == null) {
            throw new NullPointerException();
        }
        this.f = age;
    }

    public static a e() {
        aam aam = g;
        ahc.a aVar = (ahc.a) aam.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(aam);
        return (a) aVar;
    }

    public final int a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        aaq.a aVar;
        boolean z = true;
        switch (aan.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new aam();
            case 2:
                return g;
            case 3:
                return null;
            case 4:
                return new a((aan) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                aam aam = (aam) obj2;
                this.d = hVar.a(this.d != 0, this.d, aam.d != 0, aam.d);
                this.e = (aaq) hVar.a(this.e, aam.e);
                boolean z2 = this.f != age.a;
                age age = this.f;
                if (aam.f == age.a) {
                    z = false;
                }
                this.f = hVar.a(z2, age, z, aam.f);
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
                                        aaq aaq = this.e;
                                        ahc.a aVar2 = (ahc.a) aaq.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(aaq);
                                        aVar = (aaq.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.e = (aaq) agn.a(aaq.b(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.e);
                                        this.e = (aaq) aVar.c();
                                        break;
                                    }
                                case 26:
                                    this.f = agn.g();
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
                    synchronized (aam.class) {
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
            agq.a(2, (aid) this.e == null ? aaq.b() : this.e);
        }
        if (!this.f.b()) {
            agq.a(3, this.f);
        }
        this.b.a(agq);
    }

    public final aaq b() {
        return this.e == null ? aaq.b() : this.e;
    }

    public final age c() {
        return this.f;
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
            i2 += agq.c(2, (aid) this.e == null ? aaq.b() : this.e);
        }
        if (!this.f.b()) {
            i2 += agq.c(3, this.f);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
