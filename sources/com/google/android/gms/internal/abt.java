package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class abt extends ahc<abt, a> implements aif {
    /* access modifiers changed from: private */
    public static final abt g;
    private static volatile aij<abt> h;
    private int d;
    private abx e;
    private age f = age.a;

    public static final class a extends ahc.a<abt, a> implements aif {
        private a() {
            super(abt.g);
        }

        /* synthetic */ a(abu abu) {
            this();
        }

        public final a a(int i) {
            b();
            ((abt) this.a).a(0);
            return this;
        }

        public final a a(abx abx) {
            b();
            ((abt) this.a).a(abx);
            return this;
        }

        public final a a(age age) {
            b();
            ((abt) this.a).b(age);
            return this;
        }
    }

    static {
        abt abt = new abt();
        g = abt;
        abt.a(ahc.g.f, (Object) null, (Object) null);
        abt.b.c();
    }

    private abt() {
    }

    public static abt a(age age) {
        return (abt) ahc.a(g, age);
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        this.d = i;
    }

    /* access modifiers changed from: private */
    public final void a(abx abx) {
        if (abx == null) {
            throw new NullPointerException();
        }
        this.e = abx;
    }

    /* access modifiers changed from: private */
    public final void b(age age) {
        if (age == null) {
            throw new NullPointerException();
        }
        this.f = age;
    }

    public static a e() {
        abt abt = g;
        ahc.a aVar = (ahc.a) abt.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(abt);
        return (a) aVar;
    }

    public static abt f() {
        return g;
    }

    public final int a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        abx.a aVar;
        boolean z = true;
        switch (abu.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new abt();
            case 2:
                return g;
            case 3:
                return null;
            case 4:
                return new a((abu) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                abt abt = (abt) obj2;
                this.d = hVar.a(this.d != 0, this.d, abt.d != 0, abt.d);
                this.e = (abx) hVar.a(this.e, abt.e);
                boolean z2 = this.f != age.a;
                age age = this.f;
                if (abt.f == age.a) {
                    z = false;
                }
                this.f = hVar.a(z2, age, z, abt.f);
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
                                        abx abx = this.e;
                                        ahc.a aVar2 = (ahc.a) abx.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(abx);
                                        aVar = (abx.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.e = (abx) agn.a(abx.c(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.e);
                                        this.e = (abx) aVar.c();
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
                    synchronized (abt.class) {
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
            agq.a(2, (aid) this.e == null ? abx.c() : this.e);
        }
        if (!this.f.b()) {
            agq.a(3, this.f);
        }
        this.b.a(agq);
    }

    public final abx b() {
        return this.e == null ? abx.c() : this.e;
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
            i2 += agq.c(2, (aid) this.e == null ? abx.c() : this.e);
        }
        if (!this.f.b()) {
            i2 += agq.c(3, this.f);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
