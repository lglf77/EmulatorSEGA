package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class aag extends ahc<aag, a> implements aif {
    /* access modifiers changed from: private */
    public static final aag g;
    private static volatile aij<aag> h;
    private int d;
    private aak e;
    private age f = age.a;

    public static final class a extends ahc.a<aag, a> implements aif {
        private a() {
            super(aag.g);
        }

        /* synthetic */ a(aah aah) {
            this();
        }

        public final a a(int i) {
            b();
            ((aag) this.a).a(0);
            return this;
        }

        public final a a(aak aak) {
            b();
            ((aag) this.a).a(aak);
            return this;
        }

        public final a a(age age) {
            b();
            ((aag) this.a).b(age);
            return this;
        }
    }

    static {
        aag aag = new aag();
        g = aag;
        aag.a(ahc.g.f, (Object) null, (Object) null);
        aag.b.c();
    }

    private aag() {
    }

    public static aag a(age age) {
        return (aag) ahc.a(g, age);
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        this.d = i;
    }

    /* access modifiers changed from: private */
    public final void a(aak aak) {
        if (aak == null) {
            throw new NullPointerException();
        }
        this.e = aak;
    }

    /* access modifiers changed from: private */
    public final void b(age age) {
        if (age == null) {
            throw new NullPointerException();
        }
        this.f = age;
    }

    public static a e() {
        aag aag = g;
        ahc.a aVar = (ahc.a) aag.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(aag);
        return (a) aVar;
    }

    public static aag f() {
        return g;
    }

    public final int a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        aak.a aVar;
        boolean z = true;
        switch (aah.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new aag();
            case 2:
                return g;
            case 3:
                return null;
            case 4:
                return new a((aah) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                aag aag = (aag) obj2;
                this.d = hVar.a(this.d != 0, this.d, aag.d != 0, aag.d);
                this.e = (aak) hVar.a(this.e, aag.e);
                boolean z2 = this.f != age.a;
                age age = this.f;
                if (aag.f == age.a) {
                    z = false;
                }
                this.f = hVar.a(z2, age, z, aag.f);
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
                                        aak aak = this.e;
                                        ahc.a aVar2 = (ahc.a) aak.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(aak);
                                        aVar = (aak.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.e = (aak) agn.a(aak.b(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.e);
                                        this.e = (aak) aVar.c();
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
                    synchronized (aag.class) {
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
            agq.a(2, (aid) this.e == null ? aak.b() : this.e);
        }
        if (!this.f.b()) {
            agq.a(3, this.f);
        }
        this.b.a(agq);
    }

    public final aak b() {
        return this.e == null ? aak.b() : this.e;
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
            i2 += agq.c(2, (aid) this.e == null ? aak.b() : this.e);
        }
        if (!this.f.b()) {
            i2 += agq.c(3, this.f);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
