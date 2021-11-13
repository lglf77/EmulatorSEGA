package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.abh;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class abl extends ahc<abl, a> implements aif {
    /* access modifiers changed from: private */
    public static final abl h;
    private static volatile aij<abl> i;
    private int d;
    private abh e;
    private age f = age.a;
    private age g = age.a;

    public static final class a extends ahc.a<abl, a> implements aif {
        private a() {
            super(abl.h);
        }

        /* synthetic */ a(abm abm) {
            this();
        }

        public final a a(int i) {
            b();
            ((abl) this.a).a(0);
            return this;
        }

        public final a a(abh abh) {
            b();
            ((abl) this.a).a(abh);
            return this;
        }

        public final a a(age age) {
            b();
            ((abl) this.a).b(age);
            return this;
        }

        public final a b(age age) {
            b();
            ((abl) this.a).c(age);
            return this;
        }
    }

    static {
        abl abl = new abl();
        h = abl;
        abl.a(ahc.g.f, (Object) null, (Object) null);
        abl.b.c();
    }

    private abl() {
    }

    public static abl a(age age) {
        return (abl) ahc.a(h, age);
    }

    /* access modifiers changed from: private */
    public final void a(int i2) {
        this.d = i2;
    }

    /* access modifiers changed from: private */
    public final void a(abh abh) {
        if (abh == null) {
            throw new NullPointerException();
        }
        this.e = abh;
    }

    /* access modifiers changed from: private */
    public final void b(age age) {
        if (age == null) {
            throw new NullPointerException();
        }
        this.f = age;
    }

    /* access modifiers changed from: private */
    public final void c(age age) {
        if (age == null) {
            throw new NullPointerException();
        }
        this.g = age;
    }

    public static a f() {
        abl abl = h;
        ahc.a aVar = (ahc.a) abl.a(ahc.g.h, (Object) null, (Object) null);
        aVar.a(abl);
        return (a) aVar;
    }

    public static abl g() {
        return h;
    }

    public final int a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj, Object obj2) {
        abh.a aVar;
        boolean z = true;
        switch (abm.a[i2 - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new abl();
            case 2:
                return h;
            case 3:
                return null;
            case 4:
                return new a((abm) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                abl abl = (abl) obj2;
                this.d = hVar.a(this.d != 0, this.d, abl.d != 0, abl.d);
                this.e = (abh) hVar.a(this.e, abl.e);
                this.f = hVar.a(this.f != age.a, this.f, abl.f != age.a, abl.f);
                boolean z2 = this.g != age.a;
                age age = this.g;
                if (abl.g == age.a) {
                    z = false;
                }
                this.g = hVar.a(z2, age, z, abl.g);
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
                                        abh abh = this.e;
                                        ahc.a aVar2 = (ahc.a) abh.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(abh);
                                        aVar = (abh.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.e = (abh) agn.a(abh.e(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.e);
                                        this.e = (abh) aVar.c();
                                        break;
                                    }
                                case 26:
                                    this.f = agn.g();
                                    break;
                                case 34:
                                    this.g = agn.g();
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
                if (i == null) {
                    synchronized (abl.class) {
                        if (i == null) {
                            i = new ahc.b(h);
                        }
                    }
                }
                return i;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return h;
    }

    public final void a(agq agq) {
        if (this.d != 0) {
            agq.c(1, this.d);
        }
        if (this.e != null) {
            agq.a(2, (aid) this.e == null ? abh.e() : this.e);
        }
        if (!this.f.b()) {
            agq.a(3, this.f);
        }
        if (!this.g.b()) {
            agq.a(4, this.g);
        }
        this.b.a(agq);
    }

    public final abh b() {
        return this.e == null ? abh.e() : this.e;
    }

    public final age c() {
        return this.f;
    }

    public final int d() {
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (this.d != 0) {
            i3 = agq.e(1, this.d) + 0;
        }
        if (this.e != null) {
            i3 += agq.c(2, (aid) this.e == null ? abh.e() : this.e);
        }
        if (!this.f.b()) {
            i3 += agq.c(3, this.f);
        }
        if (!this.g.b()) {
            i3 += agq.c(4, this.g);
        }
        int e2 = i3 + this.b.e();
        this.c = e2;
        return e2;
    }

    public final age e() {
        return this.g;
    }
}
